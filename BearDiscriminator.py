#!/usr/bin/python
import sys, os, subprocess,fnmatch, shutil, csv,re, datetime
import time
import RGRBears

def getResults(bugindex,preds):
        #Step 1, get bug inforation from bugId
        bugId,buggyFile,lineNo,action = getInfoFromIndex(bugindex)
        print(bugId,buggyFile,lineNo,action)
        
        #compile script location
        scriptdir = '/Users/sophie/Documents/SUPRE/bears-benchmark/customizedBearScript'
        os.chdir(scriptdir)
        print('now in the dir:'+scriptdir)
        repodir = '/Users/sophie/Documents/SUPRE/Bears_Training'
        checkoutstring = 'python2.7 checkout_bug.py  --bugId  '+ bugId + '  --workspace '+ repodir
        #customized script to allow test running
        compilestring = 'python2.7 mycompile_bug.py  --bugId  '+ bugId + '  --workspace '+ repodir
        print(checkoutstring)
        os.system(checkoutstring)

        #apply patch
        os.chdir(repodir)
        # diffcount, applystatus, patchedfiles = apply_patch(bugId,patchpath,branch,'apply')

       
    
    
        #prepare the diff
        prepare_diff(bugId,buggyFile,preds,lineNo,action)
    
    
        # 
        os.chdir(scriptdir)
        print(compilestring)
        results = os.popen(compilestring).read()
        results = results.split('Results :')[-1]
        print('test running result focus: '+ results)        
        
        execResult = ''
    
        # Not compile
        if 'COMPILATION ERROR' in results:
            execResult = 'failcompile'
            print('COMPILATION ERROR')
         
        # Not plausible        
        elif 'Tests in error:' in results or 'Failed tests:' in results or 'BUILD FAILURE' in results:
            execResult = 'successcompile'
            print('success compile' )        

        # plausible
        elif 'BUILD SUCCESS' in results:
            print('BUILD SUCCESS')
            if 'Failures: 0' in results and 'Errors: 0' in results:
                execResult = 'passHumanTest'
                print('Plausible!!')
               
        #correctness
        if 'passHumanTest' in execResult:
                execResult = RGTBears(repodir,bugId)
        
        
#         os.system('mv '+repodir+'/tmp.java  '+repodir+'/'+bugId+'/'+buggyFile)
#         print('mv '+repodir+'/tmp.java  '+repodir+'/'+bugId+'/'+buggyFile)
        os.system('rm -rf '+repodir+'/'+bugId)
        os.system('rm '+repodir+'/tmp.java')
        
        
        return execResult

        

def prepare_diff(bugId,buggyFile,preds,lineNo,action):
    print('buggyFile:',buggyFile)
    
    project = '/home/heye/ganrepair/Bears_Training/'
    projectPath = project+bugId+'/'+buggyFile
    print('projectPath:',projectPath)
    
    if not os.path.exists(projectPath):
        return 'NoExist'
    else:
        originFile = project+'tmp.java'
        
        os.system('mv '+projectPath+' '+project+'tmp.java')
        predstr = ''
        
        with open(originFile,'r') as originfile:
            lines = originfile.readlines()
            if 'add' in action:
                before = lines[0:int(lineNo)-1]
                before.append(preds+'\n')
                predstr = before+lines[int(lineNo)-1:]
            elif '-' in action:
                num = action.split('-')[1]
                before = lines[0:int(lineNo)-1]
                before.append(preds+'\n')
                predstr = before+lines[int(lineNo)-1+int(num):]
                     
    
 
        with open(projectPath,'a') as targetfile:
            targetfile.write(' '.join([s for s in predstr]))
        
#         os.remove(originFile)
        
        
      
    
        
        
        
        
def getInfoFromIndex(bugIndex):
    bugIndex = bugIndex.item()
    print("BearsDiscriminator getInfoFromIndex: ",bugIndex)
    bugname= ''
    buggyFile=''
    lineNo=''
    action=''
    with open ('/home/heye/ganrepair/Bears_Training/BearsMeta.csv','r') as metafile:
        lines = metafile.readlines()
        for line in lines:
            if str(bugIndex) in line.split('\t')[0] and line.split('\t')[0] in str(bugIndex):
                bugname = line.split('\t')[1]
                buggyFile = line.split('\t')[2]
                lineNo = line.split('\t')[3]
                action = line.split('\t')[4]
                break
    
    return bugname,buggyFile,lineNo,action


def checkout72Projects():
    #Those project are 
    # Bears-2 FasterXML-jackson-databind
    # Bears-27 INRIA-spoon
    # Bears-84 spring-projects-spring-data-commons
    # Bears-98 traccar-traccar
    # Bears-140 2018swecapstone-h2ms
    # Bears-142 Activiti-Activiti
    # Bears-144 aicis-fresco
    # Bears-149 apache-incubator-dubbo
    # Bears-153 apache-incubator-servicecomb-java-chassis
    # Bears-155 apache-jackrabbit-oak
    # Bears-156 Blazebit-blaze-persistence
    # Bears-157 CorfuDB-CorfuDB
    # Bears-158 cpesch-RouteConverter
    # Bears-159 debezium-debezium
    # Bears-165 dhis2-dhis2-core
    # Bears-166 EnMasseProject-enmasse

if __name__ == '__main__':
    now = datetime.datetime.now()
    date = now.strftime("%Y-%m-%d")
    getResults('4','.expression("(?:[0-9Ff]{20}),")')