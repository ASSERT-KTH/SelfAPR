#!/usr/bin/python
import sys, os, time, subprocess,fnmatch, shutil, csv,re, datetime



def start(bugId,repodir,rootdir):
    projectPath=repodir+'/'+bugId
    traveProject(bugId, projectPath,repodir)

def traveProject(bugId,projectPath,repodir):
    listdirs = os.listdir(projectPath)
    for f in listdirs:
        pattern = '*.java'
        p = os.path.join(projectPath, f)
        if os.path.isfile(p):
            if fnmatch.fnmatch(f, pattern):
                print(p)
                with open(p,'r') as perturbFile:
                    lines = perturbFile.readlines()
                    if len(lines)>0:
                        for k in range(0,len(lines)):
                            line = lines[k]
                            # if 'REMOVE' in line:
                            constructTrainSample(bugId, lines[k], p, repodir, False)
                                # break
        else:
            traveProject(bugId,p,repodir)


def constructTrainSample(bugId,line,targetfile,repodir,diagnosticFlag):

    print(line)
    sample=''
    cxt=''
    filename = targetfile.split('/')[-1]
    originFile = targetfile.replace("Perturbation-Bears-","Bears-")

    if not '^' in line:
        return
    infos = line.split('^')
    if len(infos) < 11:
        return
    if len(infos) > 11:
        return
    curruptCode =  infos[1]
    curruptCode = curruptCode.replace('.',' . ')
    if curruptCode.startswith('}'):
        curruptCode = curruptCode[1:]

    lineNo1 =  infos[2] 
    lineNo2 =  infos[3] 
    lineNo3 =  infos[4] 
    lineNo4 =  infos[5]
    lineNo5 =  infos[6]
    cxtStart = infos[7]
    cxtEnd = infos[8]
    groundTruth = infos[9]
    metaInfo = infos[10]
    groundTruth = groundTruth.replace('  ',' ').replace('\r','').replace('\n','').replace('.',' . ')
    action = infos[0] 

    try:
        string_int = int(lineNo1)
    except ValueError:
        return




    
    # get diagnostic by execution
    diagnosticMsg = diagnostic(bugId,line,targetfile,repodir,action,diagnosticFlag)
    
    #get context info
    if cxtStart not in '' and cxtEnd not in '':
        with open(originFile,'r') as perturbFile:
            lines = perturbFile.readlines()
            for i in range(0,len(lines)):
                if i > int(cxtStart)-2 and i < int(cxtEnd):
                    l = lines[i]
                    l = l.strip()
                    #remove comments
                    if  l.startswith('/') or l.startswith('*'):
                        l = ' '
                    l = l.replace('  ','').replace('\r','').replace('\n','')
                    l = l.replace('(',' ( ').replace(')',' ) ')
                    l = l.replace('.',' . ')
                    if i == int(lineNo1)-1:
                        l='[ATTENTION] '+l
                    cxt+=l+' '

    # resume the original file
    os.system("mv "+repodir+"/"+filename +"  "+originFile)

    sample+='[BUGGY] ' + curruptCode + diagnosticMsg+ ' [CONTEXT] ' + cxt +' '+'  '+ metaInfo
    sample = sample.replace(',',' , ').replace(';',' ; ').replace('=',' = ').replace('  ',' ').replace('\r','').replace('\n','')

    with open(repodir+'/train.csv','a')  as csvfile:
        filewriter = csv.writer(csvfile, delimiter='\t',  escapechar=' ', 
                                quoting=csv.QUOTE_NONE)               
        filewriter.writerow([groundTruth,sample])

    with open(repodir+'/train-'+bugId+'.csv','a')  as csvfile:
        filewriter = csv.writer(csvfile, delimiter='\t',  escapechar=' ', 
                                quoting=csv.QUOTE_NONE)               
        filewriter.writerow([groundTruth,sample])






def diagnostic(bugId,line,targetfile,repodir,action,executeFlag):
    line=line.replace('\r','').replace('\n','')
    filename = targetfile.split('/')[-1]
    print("target targetfile:"+targetfile)
    originFile = targetfile.replace("Perturbation-Bears-","Bears-")
    bugId = bugId.replace("Perturbation-Bears-","Bears-")


    #copy the origin file outside the project
    os.system("cp "+originFile+"  "+repodir)
    # initial perturb string
    perturbStr=''
    
    print("target line:"+line)
    infos = line.split('^')
    curruptCode =  infos[1]  
    lineNo1 =  infos[2] 
    lineNo2 =  infos[3] 
    lineNo3 =  infos[4] 
    lineNo4 =  infos[5]
    lineNo5 =  infos[6]

    if "ADD" in action or "REPLACE" in action:
        # read and perturb code 
        with open(originFile,'r') as perturbFile:
            lines = perturbFile.readlines()
            for i in range(0,len(lines)):
                if i+1< int(lineNo1) or i+1> int(lineNo1)+4:
                    perturbStr+=lines[i]
                elif i+1==int(lineNo1):
                    perturbStr+=curruptCode+"\n"
                elif i+1==int(lineNo1)+1: 
                    if lineNo2=='':
                        perturbStr+=lines[i]
                    else:
                        perturbStr+=" \n"
                elif i+1==int(lineNo1)+2:
                    if lineNo3=='':
                        perturbStr+=lines[i]
                    else:
                        perturbStr+=" \n"
                elif i+1==int(lineNo1)+3:  
                    if lineNo4=='':
                        perturbStr+=lines[i]
                    else:
                        perturbStr+=" \n"
                elif i+1==int(lineNo1)+4:
                    if lineNo5=='':
                        perturbStr+=lines[i]
                    else:
                        perturbStr+=" \n"
    elif "REMOVE" in action :
        with open(originFile,'r') as perturbFile:
            lines = perturbFile.readlines()
            for i in range(0,len(lines)):
                if i+1< int(lineNo1) or i+1> int(lineNo1)+4:
                    perturbStr+=lines[i]
                elif i+1==int(lineNo1):
                    perturbStr+= lines[i]+" \n" +curruptCode
                elif i+1==int(lineNo1)+1: 
                    if lineNo2=='':
                        perturbStr+=lines[i]
                    else:
                        perturbStr+=" \n"
                elif i+1==int(lineNo1)+2:
                    if lineNo3=='':
                        perturbStr+=lines[i]
                    else:
                        perturbStr+=" \n"
                elif i+1==int(lineNo1)+3:  
                    if lineNo4=='':
                        perturbStr+=lines[i]
                    else:
                        perturbStr+=" \n"
                elif i+1==int(lineNo1)+4:
                    if lineNo5=='':
                        perturbStr+=lines[i]
                    else:
                        perturbStr+=" \n"


  
    # write back the perturb code to class file
    with open(originFile,'w') as perturbFileWrite:
        perturbFileWrite.write(perturbStr)

    if executeFlag:
        compile_result = compileBug(bugId,repodir,originFile,action,line)
    else:
        compile_result=''
    
    return compile_result




def compileBug(bugId,repodir,originFile,action,line):
    results=''
    scriptdir = '/Users/sophie/Documents/SUPRE/bears-benchmark/customizedBearScript'
    os.chdir(scriptdir)
    compilestring = 'python2.7 mycompile_bug.py  --bugId  '+ bugId + '  --workspace '+ repodir
    print(compilestring)
    results = os.popen(compilestring).read()
    print(results)
    print('[ERROR] '+ originFile)

    if 'COMPILATION ERROR' in results and '[ERROR]' in results :
        if originFile in results and '[ERROR] ' in results:
            results = results.split('[ERROR] '+ originFile)[1]
            print('[ERROR] '+ originFile)
            if ']' in results:
                results = results.split(']')[1]
                results = results.split('\n')[0]
            if '[' in results:
                results = results.split('[')[0]  
            results =  results.strip()
            results = '[CE] ' + results
    elif 'Tests in error:' in results or 'Failed tests:' in results:
            if '<<< ERROR!' in results:
                results = results.split('<<< ERROR!')[1]
                # Exception:
            if '<<< FAILURE!' in results:
                results = results.split('<<< FAILURE!')[1]
                results = results.split('\n\n')[0]
            results = '[FE] ' + results

    elif 'BUILD SUCCESS' in results:
        results = 'SUCCESS'

    with open(repodir+'/diagnostic.csv','a')  as csvfile:
        filewriter = csv.writer(csvfile, delimiter='\t',  escapechar=' ', 
                                quoting=csv.QUOTE_NONE)               
        filewriter.writerow([action,results,line])

    return results



if __name__ == '__main__':
    # bugIds = ['Bears-2','Bears-90']
    bugIds = ['Bears-90']
    
    rootdir= '/Users/sophie/Documents/SUPRE'
    repodir = rootdir+'/PerturbProjects'

    for bugId in bugIds:
        bugId = bugId.replace("Bears-", "Perturbation-Bears-")
        start(bugId,repodir,rootdir)
