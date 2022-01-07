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
                    if len(lines)>1:
                        # for k in range(1,len(lines)):
                            line = lines[k]
                            constructTrainSample(bugId, line, p, repodir, lines[0])
                break
        else:
            traveProject(bugId,p,repodir)


def constructTrainSample(bugId,line,targetfile,repodir,metaInfo):

    metaInfo = metaInfo.replace('  ','').replace('\r','').replace('\n','')
    sample=''
    cxt=''
    filename = targetfile.split('/')[-1]
    originFile = targetfile.replace("Perturbation-Bears-","Bears-")

    diagnosticMsg = diagnostic(bugId,line,targetfile,repodir)

    infos = line.split('^')
    curruptCode =  infos[0]
    cxtStart = infos[6]
    cxtEnd = infos[7]
    groundTruth = infos[8]
    groundTruth = groundTruth.replace('  ','').replace('\r','').replace('\n','')
    #get context info
    if cxtStart not in '' and cxtEnd not in '':
        with open(originFile,'r') as perturbFile:
            lines = perturbFile.readlines()
            for i in range(0,len(lines)):
                if i+1 > int(cxtStart) and i < int(cxtEnd):
                    l = lines[i]
                    l = l.strip()
                    l = l.replace('  ','').replace('\r','').replace('\n','')
                    cxt+=l

    # # resume the original file
    os.system("mv "+repodir+"/"+filename +"  "+originFile)

    sample+='[BUGGY] ' + curruptCode + '[CONTEXT]' + cxt +' '+diagnosticMsg+'  '+ metaInfo

    with open(repodir+'/train.csv','a')  as csvfile:
        filewriter = csv.writer(csvfile, delimiter='\t',  escapechar=' ', 
                                quoting=csv.QUOTE_NONE)               
        filewriter.writerow([groundTruth,sample])






def diagnostic(bugId,line,targetfile,repodir):
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
    curruptCode =  infos[0]  
    lineNo1 =  infos[1] 
    lineNo2 =  infos[2] 
    lineNo3 =  infos[3] 
    lineNo4 =  infos[4]
    lineNo5 =  infos[5]
    print("curruptCode:",curruptCode)
    print("lineNo1:",lineNo1)
    print("lineNo2:",lineNo2)
    print("lineNo3:",lineNo3)
    
    # read and perturb code 
    with open(originFile,'r') as perturbFile:
        lines = perturbFile.readlines()
        for i in range(0,len(lines)):
            if i+1< int(lineNo1) or i+1 > int(lineNo1)+4:
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
  
    # write back the perturb code to class file
    with open(originFile,'w') as perturbFileWrite:
        perturbFileWrite.write(perturbStr)

    compile_result = compileBug(bugId,repodir,originFile)
    




    return compile_result




def compileBug(bugId,repodir,originFile):
    results=''
    scriptdir = '/Users/sophie/Documents/SUPRE/bears-benchmark/customizedBearScript'
    os.chdir(scriptdir)
    compilestring = 'python2.7 mycompile_bug.py  --bugId  '+ bugId + '  --workspace '+ repodir
    print(compilestring)
    results = os.popen(compilestring).read()
    print(results)
    if 'COMPILATION ERROR' in results:
        if originFile in results :   
            results = results.split(originFile)[1]
            if ']' in results:
                results = results.split(']')[1]
            if '[ERROR' in results:
                results = results.split('[ERROR')[0]
            results =  results.strip()
            if 'in' in results:
                results = results.split(' in ')[0]
            results = '[CE] ' + results
    elif 'Tests in error:' in results or 'Failed tests:' in results or 'BUILD FAILURE' in results:
            rs = results.split('\n')
            for r in rs:
                if 'Failures: 0,' not in r:
                    results=r
                    break
            results = results.split(' in ')[1]
            results = '[FE] ' + results

    elif 'BUILD SUCCESS' in results:
        results = 'SUCCESS'

    with open(repodir+'/diagnostic.csv','a')  as csvfile:
        filewriter = csv.writer(csvfile, delimiter='\t',  escapechar=' ', 
                                quoting=csv.QUOTE_NONE)               
        filewriter.writerow([results])

    return results



if __name__ == '__main__':
    bugIds = ['Bears-2']
    rootdir= '/Users/sophie/Documents/SUPRE'
    repodir = rootdir+'/PerturbProjects'

    for bugId in bugIds:
        bugId = bugId.replace("Bears-", "Perturbation-Bears-")
        start(bugId,repodir,rootdir)
