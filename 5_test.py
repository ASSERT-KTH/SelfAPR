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
import os, gc
import sys, subprocess,fnmatch, shutil, csv,re, datetime



def getBugName(bugid):
    
    bugid=str(bugid).replace(' ','')
    buginfo=''
    startNo=''
    removeNo=''
    filepath=''
    with open('test.csv') as testfile:
        lines = testfile.readlines()
        for l in lines:
            bid=l.split('\t')[0]
            bid=bid.replace(' ','')
            if bid in bugid and bugid in bid:
                buginfo=l.split('\t')[3]
                buginfo=buginfo.replace('\n','').replace('\t','').replace('\r','')
                startNo=l.split('\t')[4]
                removeNo=l.split('\t')[5]
                filepath=l.split('\t')[6]
                filepath=filepath.replace('\n','').replace('\t','').replace('\r','')

                break
    
    
    return buginfo,startNo,removeNo,filepath







        
def test( model, tokenizer, device, loader,epoch):
    
    return_sequences = 100
    model.eval()
    identicalset=[]
    
    with torch.no_grad():
        for _,data in enumerate(loader, 0):
            if _>-1:
                gc.collect()
                torch.cuda.empty_cache()
                y = data['target_ids'].to(device, dtype = torch.long)
                ids = data['source_ids'].to(device, dtype = torch.long)
                mask = data['source_mask'].to(device, dtype = torch.long)
                bugid = data['bugid'].to(device, dtype = torch.long)
                print("====bugid===",bugid.item())


                generated_ids = model.generate(
                input_ids = ids,
                attention_mask = mask, 
                max_length=64, 
                num_beams=return_sequences,
                repetition_penalty=3.0,
#                 length_penalty=0.5, 
                early_stopping = False,
                num_return_sequences=return_sequences,
                num_beam_groups = 1
                )


                preds = [tokenizer.decode(g, skip_special_tokens=True, clean_up_tokenization_spaces=True) for g in generated_ids]
                target = [tokenizer.decode(t, skip_special_tokens=True, clean_up_tokenization_spaces=True)for t in y]
                target = target[0]
                
                bugname,startNo,removeNo,filepath  = getBugName(bugid.item())

                with open('./test_result_small'+str(return_sequences)+'.csv', 'a') as csvfile:
                    filewriter = csv.writer(csvfile, delimiter='\t',escapechar=' ',quoting=csv.QUOTE_NONE)
                    for i in range(0,return_sequences):
                        pr = preds[i]
                        pr=pr.replace('\n','').replace('\r','').replace('\t','').replace(' ','')
                        targetTrim=target.replace('\n','').replace('\r','').replace('\t','').replace(' ','')                       
                            
                        
                        if targetTrim in '' and pr in '[REMOVE]':
                            identicalset.append(bugname+'\t'+pr+'\t'+targetTrim)
                        elif targetTrim in 'nan' and pr in '[REMOVE]':
                            identicalset.append(bugname+'\t'+pr+'\t'+targetTrim)
                        elif targetTrim not in '[REMOVE]':
                            targetTrimNoST=targetTrim
                            if '[ADD]' in targetTrim:
                                targetTrimNoST=targetTrim.replace('[ADD]','')
                            if '[REPLACE]' in targetTrim:
                                targetTrimNoST=targetTrim.replace('[REPLACE]','')
                            if targetTrimNoST in pr and pr in targetTrimNoST:
                                identicalset.append(bugname+'\t'+pr+'\t'+targetTrim)
                     
                            
                        filewriter.writerow([bugname, startNo,removeNo,filepath,preds[i],target])
      
    identicalset = list(dict.fromkeys(identicalset))
    print(identicalset)
    with open('./identical-Top-'+str(return_sequences)+'.csv', 'a') as stat:
        stat.write(str(len(identicalset))+'\n')
        for l in identicalset:
            l=l.replace('\n','').replace('\r','')
            stat.write(str(l)+'\n')




            
                


def getGeneratorDataLoader(filepatch,tokenizer,batchsize):
    df = pd.read_csv(filepatch,encoding='latin-1',delimiter='\t')
    print(df.head(1))
    
    df = df[['bugid','buggy','patch']]

    params = {
        'batch_size': batchsize,
        'shuffle': True,
        'num_workers': 0
        }

    dataset=df.sample(frac=1.0, random_state = SEED).reset_index(drop=True)
    target_set = loader.GeneratorDataset(dataset, tokenizer, MAX_LEN, PATCH_LEN)
    target_loader = DataLoader(target_set, **params)
    return target_loader




def run_test(epoch):
    gen = T5ForConditionalGeneration.from_pretrained('./model/SUPRE15',output_hidden_states=True)      
    
    gen_tokenizer = T5Tokenizer.from_pretrained('./model/SUPRE15',truncation=True)
    gen_tokenizer.add_tokens(['{', '}','<','^','<=','>=','==','!=','<<','>>','[ADD]','[REMOVE]','[REPLACE]','[CE]','[FE]','[CONTEXT]','[BUGGY]','[CLASS]','[TYPE]','[METHOD]','[PARAMETER]','[PATCH]'])
    
    gen = gen.to(device)       

    test_loader=getGeneratorDataLoader(TEST_PATH,gen_tokenizer,1) 
    
    test(gen,gen_tokenizer,  device, test_loader, epoch+1)
        
        
        
if __name__ == '__main__':
    warnings.filterwarnings('ignore')
    SEED=42
    LEARNING_RATE = 1e-4
    VALID_BATCH_SIZE = 1
    MAX_LEN = 768
    PATCH_LEN = 128 
    device = 'cuda' if cuda.is_available() else 'cpu'

    TEST_PATH='./test.csv'
        
    run_test(0)

