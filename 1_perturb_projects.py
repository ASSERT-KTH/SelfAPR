#!/usr/bin/python
import sys, os, time, subprocess,fnmatch, shutil, csv,re, datetime



def perturb(bugId,repodir,rootdir):
    project=bugId.split('-')[0]
    bug=bugId.split('-')[1]
    projectPath=repodir+'/'+bugId
    checkoutCorrectVersion = 'defects4j checkout -p '+project + ' -v '+bug+'f -w '+projectPath
    print(checkoutCorrectVersion)
    os.system(checkoutCorrectVersion)



    traveProject(projectPath)
    



def traveProject(projectPath):
    listdirs = os.listdir(projectPath)
    for f in listdirs:
        if  'test' not in projectPath and 'Test' not in projectPath:
            pattern = '*.java'
            p = os.path.join(projectPath, f)
            if os.path.isfile(p):
                if 'test' not in p and fnmatch.fnmatch(f, pattern): 
                    print(p)
                    #call spoon based Java pertubation programs.
                    callstr = 'timeout 600 java -jar ./perturbation_model/target/perturbation-0.0.1-SNAPSHOT-jar-with-dependencies.jar '
                    callstr+=p+' BugLab '
                    os.system(callstr)
                    print(p)

            else:
                traveProject(p)



if __name__ == '__main__':
   
    bugIds = ['Lang-65','Chart-26','Math-106','Mockito-38','Time-26','Closure-134','Cli-1','Collections-25','Codec-1','Compress-1','Csv-1','Gson-1','JacksonCore-1','JacksonDatabind-1','JacksonXml-1','Jsoup-1','JxPath-1']
    rootdir= '/path/to/root/SelfAPR'
    repodir = rootdir+'/PerturbedSamples'
    if not os.path.exists(repodir):
        os.system('mkdir -p '+repodir)
    for bugId in bugIds:
        perturb(bugId,repodir,rootdir)
