import torch
from torch.utils.data import Dataset

class GeneratorDataset(Dataset):

    def __init__(self, dataframe, tokenizer, source_len, summ_len):
        self.tokenizer = tokenizer
        self.data = dataframe
        self.source_len = source_len
        self.summ_len = summ_len
        self.bugid = self.data.bugid
        self.buggy = self.data.buggy
        self.patch = self.data.patch

    def __len__(self):
        return len(self.patch)

    def __getitem__(self, index):
        buggy = str(self.buggy[index])
        buggy = ' '.join(buggy.split())

        patch = str(self.patch[index])
        patch = ' '.join(patch.split())

        source = self.tokenizer.batch_encode_plus([buggy], max_length= self.source_len, pad_to_max_length=True,return_tensors='pt')
        target = self.tokenizer.batch_encode_plus([patch], max_length= self.summ_len, pad_to_max_length=True,return_tensors='pt')

        source_ids = source['input_ids'].squeeze()
        source_mask = source['attention_mask'].squeeze()
        target_ids = target['input_ids'].squeeze()
        target_mask = target['attention_mask'].squeeze()

        return {
            'bugid': torch.tensor(self.bugid[index], dtype=torch.long),
            'source_ids': source_ids.to(dtype=torch.long), 
            'source_mask': source_mask.to(dtype=torch.long), 
            'target_ids': target_ids.to(dtype=torch.long),
            'target_ids_y': target_ids.to(dtype=torch.long)
        }


class CustomDataset(Dataset):

    def __init__(self, dataframe, tokenizer, source_len, summ_len):
        self.tokenizer = tokenizer
        self.data = dataframe
        self.source_len = source_len
        self.summ_len = summ_len
        self.buggy = self.data.buggy
        self.patch = self.data.patch

    def __len__(self):
        return len(self.patch)

    def __getitem__(self, index):
        buggy = str(self.buggy[index])
        buggy = ' '.join(buggy.split())

        patch = str(self.patch[index])
        patch = ' '.join(patch.split())

        source = self.tokenizer.batch_encode_plus([buggy], max_length= self.source_len,pad_to_max_length=True,return_tensors='pt')
        target = self.tokenizer.batch_encode_plus([patch], max_length= self.summ_len, pad_to_max_length=True,return_tensors='pt')

        source_ids = source['input_ids'].squeeze()
        source_mask = source['attention_mask'].squeeze()
        target_ids = target['input_ids'].squeeze()
        target_mask = target['attention_mask'].squeeze()

        return {
            'source_ids': source_ids.to(dtype=torch.long), 
            'source_mask': source_mask.to(dtype=torch.long), 
            'target_ids': target_ids.to(dtype=torch.long),
            'target_ids_y': target_ids.to(dtype=torch.long)
        }