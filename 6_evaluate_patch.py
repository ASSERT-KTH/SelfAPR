#!/usr/bin/python
import sys, os, time, subprocess,fnmatch, shutil, csv,re, datetime


def executePatch(projectId,bugId,startNo,removedNo,fpath,predit,repodir):
    #first checkout buggy project
    os.system('/home/yehe2021/defects4j/framework/bin/defects4j checkout -p '+ str(projectId)+' -v '+str(bugId)+'b   -w '+repodir+'/'+projectId+bugId)
    #keep a copy of the buggy file
    originFile = repodir+'/'+projectId+bugId+'/'+fpath
    filename = originFile.split('/')[-1]

    os.system("cp "+originFile+"  "+repodir)
    newStr=''
    endNo=int(startNo)+int(removedNo)
    with open(originFile,'r') as of:
        lines=of.readlines()
        for i in range(0,len(lines)):
            l=lines[i]
            if i+1 < int(startNo):
                newStr+=l 
            if i+1 == int(startNo):
                newStr+=predit+'\n'
            if i+1 >= endNo:
                newStr+=l
    with open(originFile,'w') as wof:
        wof.write(newStr)

    exeresult = execute(projectId+bugId,repodir,originFile,repodir+'/'+projectId+bugId)
        
    os.system("mv "+repodir+"/"+filename +"  "+originFile)

    return exeresult


    
            



def execute(patchId,repodir,originFile,rootdir):
    compile_error_flag = True

    program_path=repodir+'/'+patchId
    print('****************'+program_path+'******************')
    #get compile result
    cmd = "cd " + program_path + ";"
    cmd += "timeout 120 /home/yehe2021/defects4j/framework/bin/defects4j compile"
    exectresult='[timeout]'
    symbolVaraible=''
    result = subprocess.run(cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=True)
    print(result)
    # Running ant (compile.tests)
    if 'Running ant (compile)' in str(result):
        result = str(result).split("Running ant (compile)")[1]
        result=result.split('\n')
        for i in range(0,len(result)):
            if 'error: ' in result[i]:
                firstError=result[i].split('error: ')[1]
                exectresult=firstError.split('[javac]')[0]
                if '\\' in exectresult:
                    exectresult=exectresult.split('\\')[0]
                print('firstErrorfirstErrorfirstError'+firstError)
                # 'cannot  find  symbol      
                if 'symbol' in firstError and 'cannot' in firstError and 'find' in firstError:       
                    if '[javac]' in firstError:
                        lines = firstError.split('[javac]')
                        for l in lines:
                            if 'symbol:'in l and 'variable' in l:
                                symbolVaraible=l.split('variable')[1]
                                if '\\' in symbolVaraible:
                                    symbolVaraible=symbolVaraible.split('\\')[0]
                                break



                exectresult='[CE] '+exectresult+symbolVaraible
                break
            elif 'OK' in result[i]:
                exectresult='OK'
                compile_error_flag=False



   
    os.chdir(rootdir)

    return exectresult





if __name__ == '__main__':

    patchFromPath='./test_result_small10.csv'
    patchToPath='/home/yehe2021/ganrepair/SUPRE-Diag-NoPretrain/patches-result-evaluation.csv'
    repodir = '/home/yehe2021/ganrepair/SUPRE-Diag-NoPretrain'
    rewardrepairBugs = './120bugs.txt'
    
    RRBugs=''
    with open(rewardrepairBugs,'r') as rrbugs:
        RRBugs=rrbugs.readlines()
    
    print(RRBugs)
    #open and iterative each patch
    with open(patchFromPath,'r') as patchFile:
        patches = patchFile.readlines()
        for patch in patches:
            print(patch)
            pid=patch.split('\t')[0]
            #project and bug info
            projectId =pid.split('_')[0]
            bugId =pid.split('_')[1]
            startNo=patch.split('\t')[1]
            removedNo=patch.split('\t')[2]
            path=patch.split('\t')[3]
            predit = patch.split('\t')[4]
            groundtruth = patch.split('\t')[5]
            
            print(projectId)
            print(bugId)
            
            ident = projectId+'_'+bugId+'_'
            
            if ident in RRBugs:
                #if identical, we do not execute
                preditNoSpace = predit.replace(' ','').replace('\n','').replace('\r','').replace('[REPLACE]','').replace('[REMOVE]','').replace('[ADD]','')
                groundtruthNoSpace = groundtruth.replace(' ','').replace('\n','').replace('\r','')
                if groundtruthNoSpace in 'nan':
                    groundtruthNoSpace=''
                if preditNoSpace in groundtruthNoSpace and groundtruthNoSpace in preditNoSpace:
                    #idnetical
                    with open(patchToPath,'a') as targetFile:
                        targetFile.write('Identical\t'+patch)
                else:
                    if :
                        predit=predit.replace('[REPLACE]','').replace('[REMOVE]','').replace('[ADD]','')
                        exeresult = executePatch(projectId,bugId,startNo,removedNo,path,predit,repodir)
                        with open(patchToPath,'a') as targetFile:
                            targetFile.write(exeresult+'\t'+patch)




