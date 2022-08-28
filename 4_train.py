import numpy as np
import pandas as pd
import torch,sys
import torch.nn.functional as F
from torch.utils.data import Dataset, DataLoader, RandomSampler, SequentialSampler
import warnings
from torch import cuda
from transformers import T5Tokenizer, T5ForConditionalGeneration
import loader
import torch.autograd as autograd
import csv
import os

def training(generator, gen_opt, gen_tokenizer, adv_loader, device,epoch):
    """
    The generator is trained using policy gradients, using the reward from the discriminator.
    Training is done for num_batches batches.
    """
    generator.train()

    for _,data in enumerate(adv_loader, 0):
        if _>0:
            y = data['target_ids'].to(device, dtype = torch.long)
            y_ids = y[:, :-1].contiguous()
            lm_labels = y[:, 1:].clone().detach()
            lm_labels[y[:, 1:] == gen_tokenizer.pad_token_id] = -100

            ids = data['source_ids'].to(device, dtype = torch.long)
            mask = data['source_mask'].to(device, dtype = torch.long)
            #bugid = data['bugid'].to(device, dtype = torch.long)
            #print(f'bugid: {bugid}')

            outputs = generator(input_ids = ids, attention_mask = mask, decoder_input_ids=y_ids, labels=lm_labels)
            loss = outputs[0]

            gen_opt.zero_grad()
            loss.backward()
            gen_opt.step()

            #we record the training log
            if _%1000 == 0:
                recordDataSimple(epoch,str(_),loss)

            if _%5000 == 0:
                generator.save_pretrained('./model_SelfAPR/SelfAPR'+str(epoch+1))
                gen_tokenizer.save_pretrained('./model_SelfAPR/SelfAPR'+str(epoch+1))
            


def recordData(epoch, bugid, crossEntropLoss, reward, preds, groundTruth):
    with open('./training_log_selfaprALL.csv', 'a') as csvfile:
        filewriter = csv.writer(csvfile, delimiter='\t',quotechar='"',quoting=csv.QUOTE_MINIMAL)
        filewriter.writerow([epoch, bugid, crossEntropLoss, reward, preds,groundTruth])

def recordDataSimple(epoch,count, loss):
    with open('./training_log_selfaprALL.csv', 'a') as csvfile:
        filewriter = csv.writer(csvfile, delimiter='\t',quotechar='"',quoting=csv.QUOTE_MINIMAL)
        filewriter.writerow([epoch, count, loss])

        
        
        
def valid( model, tokenizer, device, loader,epoch):
    model.eval()
    total_loss = 0 
    total_nb=0
    total_succ = 0
    fault_locate_succ=0
    total_fail = 0
    with torch.no_grad():
        for _,data in enumerate(loader, 0):
            y = data['target_ids'].to(device, dtype = torch.long)
            y_ids = y[:, :-1].contiguous()
            lm_labels = y[:, 1:].clone().detach()
            lm_labels[y[:, 1:] == tokenizer.pad_token_id] = -100
            ids = data['source_ids'].to(device, dtype = torch.long)
            mask = data['source_mask'].to(device, dtype = torch.long)
            bugid = data['bugid'].to(device, dtype = torch.long)
            print(f'bugid: {bugid}')

            #output generation
            outputs = model(input_ids = ids, attention_mask = mask, decoder_input_ids=y_ids, labels=lm_labels)
            loss = outputs[0]
            total_nb += 1  
            total_loss += loss.item()            
            
            print(f'loss: {loss}')
            lm_logits = outputs[1]
            output = F.log_softmax(lm_logits, -1)
            preds_seq = output.max(2)[1]
            g = preds_seq[0]  
            preds = [tokenizer.decode(g, skip_special_tokens=True, clean_up_tokenization_spaces=True)]
            predstr = preds[0] 
            print(f'predstr: {predstr}')
            
            reward, result = validate_by_compiler(bugid, predstr, 'valid')
            
            if 'success' in result:
                total_succ+=1
            elif 'failedLocateBug' in result:
                total_fail+=1
            else:
                fault_locate_succ +=1
                          

        print(f'Total Loss:  {total_loss}/{total_nb}')
        with open('./valid_logs.csv', 'a') as csvfile:
            filewriter = csv.writer(csvfile, delimiter='\t',quotechar='"',quoting=csv.QUOTE_MINIMAL)
            filewriter.writerow([epoch,(total_loss/total_nb), total_succ, fault_locate_succ, total_fail ])
        
        
def test(tokenizer, model, device, loader,epoch):
    return_sequences = 100
    model.eval()
    predictions = []
    actuals = []
    with torch.no_grad():
        for _, data in enumerate(loader, 0):
            y = data['target_ids'].to(device, dtype = torch.long)
            ids = data['source_ids'].to(device, dtype = torch.long)
            mask = data['source_mask'].to(device, dtype = torch.long)

            generated_ids = model.generate(
                input_ids = ids,
                attention_mask = mask, 
                max_length=100, 
                num_beams=100,
                repetition_penalty=5.0, 
                length_penalty=1.0, 
                early_stopping=True,
                num_return_sequences=return_sequences
                )
            preds = [tokenizer.decode(g, skip_special_tokens=True, clean_up_tokenization_spaces=True) for g in generated_ids]
            print(preds[0])

            target = [tokenizer.decode(t, skip_special_tokens=True, clean_up_tokenization_spaces=True)for t in y]
            target = target[0]
            
            
            with open('./test'+'.csv', 'a') as csvfile:
                filewriter = csv.writer(csvfile, delimiter='\t',quotechar='"',quoting=csv.QUOTE_MINIMAL)
                for i in range(0,return_sequences):
                    filewriter.writerow([preds[i],target])
         
                
    return predictions, actuals


def getGeneratorDataLoader(filepatch,tokenizer,batchsize):
    df = pd.read_csv(filepatch,encoding='latin-1',delimiter='\t')
    print(df.head(1))
    
    df = df[['patch','buggy']]

    params = {
        'batch_size': batchsize,
        'shuffle': True,
        'num_workers': 0
        }

    dataset=df.sample(frac=1.0, random_state = SEED).reset_index(drop=True)
    target_set = loader.CustomDataset(dataset, tokenizer, MAX_LEN, PATCH_LEN)
    target_loader = DataLoader(target_set, **params)
    return target_loader




def run_training(epoch):
    
    if epoch == 0:
        gen = T5ForConditionalGeneration.from_pretrained("t5-base", output_hidden_states=True)      
        gen_tokenizer = T5Tokenizer.from_pretrained("t5-base",truncation=True)       
        gen_tokenizer.add_tokens(['{', '}','<','^','<=','>=','==','!=','<<','>>','[PATCH]','[BUG]','[CE]','[FE]','[CONTEXT]','[BUGGY]','[CLASS]','[METHOD]','[RETURN_TYPE]','[VARIABLES]','[Delete]'])

    else:
        gen = T5ForConditionalGeneration.from_pretrained('./model_SelfAPR/SelfAPR'+str(epoch), output_hidden_states=True)      
        gen_tokenizer = T5Tokenizer.from_pretrained('./model_SelfAPR/SelfAPR'+str(epoch),truncation=True)
                
    gen = gen.to(device)
    gen_optimizer = torch.optim.Adam(params = gen.parameters(), lr=LEARNING_RATE)


    adv_loader=getGeneratorDataLoader(TRAIN_PATH,gen_tokenizer,32)   


    print('\n--------\nEPOCH %d\n--------' % (epoch+1))
    print('\nTraining Generator : ', end='')
    training(gen, gen_optimizer, gen_tokenizer, adv_loader, device, epoch)         

    gen.save_pretrained('./model_SelfAPR/SelfAPR'+str(epoch+1))
    gen_tokenizer.save_pretrained('./model_SelfAPR/SelfAPR'+str(epoch+1))      
        
        
if __name__ == '__main__':
    warnings.filterwarnings('ignore')
    SEED=42
    TRAIN_EPOCHS = 10
    LEARNING_RATE = 1e-4
    MAX_LEN = 384
    PATCH_LEN = 76 
    device = 'cuda' if cuda.is_available() else 'cpu'
    TRAIN_PATH= './dataset/SelfAPR.csv'
    
    for epoch in range(0,TRAIN_EPOCHS):
        run_training(epoch)
