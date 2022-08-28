#!/usr/bin/python
import sys, os, time, subprocess,fnmatch, shutil, csv,re, datetime



def start(bugId,repodir,rootdir):
    projectPath=repodir+'/'+bugId
    #get buggy file and buggy line
    print('bugid'+bugId)

    targetfile = getBuggyFile(bugId,repodir)
    print('target......'+targetfile)
    if ',' in targetfile:
        return
    
    tfiles = targetfile.split(',')   
    firstTFile=targetfile.split(',')[0]

    for tf in tfiles:
        if '.java' not in tf:
            tf=tf+'.java'
        diffLists = getBuggyLines(bugId,repodir,tf)
        print('======diffLists========='+str(diffLists))
        
        if len(diffLists)>1:
            return;
        
        for k in range(0,len(diffLists)):
            diff=diffLists[k]
            startLineNo=diff.split('[buggy]')[0]
            buggyLines=diff.split('[buggy]')[1]
            buggyLines=buggyLines.split('[patch]')[0]
            patchLines = diff.split('[patch]')[1]
            patchLines = patchLines.split('[buggyLineNo]')[0]
            buggyLineCount = diff.split('[buggyLineNo]')[1]
        

            if str(startLineNo) not in '':
                constructTestSample(bugId, k, tf, repodir, rootdir,str(startLineNo),buggyLines,patchLines,str(len(diffLists)),str(buggyLineCount))
   
    if os.path.exists(repodir+'/'+bugId):
        os.system('rm -rf '+repodir+'/'+bugId)

def getBuggyFile(bugId,repodir):
    #get buggy file
    diffDir = repodir+'scripts/D4JMeta.csv'
    bugIdUnderScore = bugId.replace('-','_')
    targetFile = ''
    with open(diffDir,'r') as meta:
        lines = meta.readlines()
        for l in lines:
            if '\t' in l:
                bid = l.split('\t')[1]
                if bugIdUnderScore in bid and bid in bugIdUnderScore:           
                    targetFile = l.split('\t')[2]
                    break
    return targetFile

def getBuggyLines(bugId,repodir,tf):
    tclass=tf.split('/')[-1]
    tclass=tclass.replace('.java','').replace('\n',' ').replace('\r',' ')
    print(tclass)
    projectPath=repodir+repodir
    tdiff = repodir+'scripts/D4JDiff/'+bugId+'_'+tclass+'.diff'

    diffList=[]
    with open(tdiff,'r', encoding='latin1') as diff:
        lines = diff.readlines()
        hunks = str(lines).split('@@ -')
        for i in range(1,len(hunks)):
            h = hunks[i]
            startLineNo=''
            buggyLines=''
            patchLines=''
            buggyLineNo=0
            print('*********hunk hunk hunk***********'+h)
            lines = h.split("\\n', '")
            for l in lines:
                if '@@' in l and '+' in l and ',' in l:
                    startLineNo= l.split(',')[0]
                    startLineNo= str(int(startLineNo)+1)   
                
                if l.startswith('-'):
                    startword = l[1:]
                    startword = startword.replace("\\n', \"+ ",' ')
                    startword = startword.replace("\\n\", '",' ')
                    startword =  startword.strip()
                    if not startword.startswith('/') and not startword.startswith('*') and not startword.startswith('import') and not startword.startswith('System.out') and not startword.startswith('Logger') and not startword.startswith('log.info') and  not startword.startswith('logger')  and  not startword.startswith('//'):
                        startword = startword.split('//')[0]
                        print('*********buggyLines buggyLines***********'+startword)
                        buggyLines = buggyLines + startword+' '
                                               
                        buggyLineNo+=1
                                      
                if l.startswith('+'):
                    startword = l[1:]
                    startword =  startword.strip()
                    if not startword.startswith('/') and not startword.startswith('*') and not startword.startswith('import') and not startword.startswith('System.out') and not startword.startswith('Logger') and not startword.startswith('log.info') and  not startword.startswith('logger') and  not startword.startswith('//'):
                        startword = startword.split('//')[0]
                        startword = startword.replace("\\n', \"+ ",' ')
                        print('*********patchLines patchLines***********'+startword)

                        patchLines = patchLines + startword+' '


            hunkinfo = startLineNo+'[buggy]'+buggyLines+'[patch]'+patchLines+'[buggyLineNo]'+str(buggyLineNo)
            diffList.append(hunkinfo)
    print(str(diffList))
    return diffList


def constructTestSample(bugId, indexId, targetfile, repodir, rootdir,startLineNo,buggyLines,patchLines,totalhunk,bno):   
    origTargetFile=targetfile.replace('\r','').replace('\n','')
    className = targetfile.split('/')[-1]
    className = className.replace('.java','').replace('\r','').replace('\n','')
    targetfile=repodir+bugId+'/'+targetfile
    targetfile = targetfile.split('.java')[0]+'.java'
    targetfile=targetfile.replace('\r','').replace('\n','')
    print('targetfile'+targetfile)
    print('startLineNo=========startLineNo====='+startLineNo)
    print('bugId=========bugId====='+bugId)
    print('buggyLines'+buggyLines)
    cxt=''
    metaInfo=''
    diagnosticMsg = executePerturbation(bugId,repodir,rootdir)
    print(diagnosticMsg)


    cmd = 'timeout 200 java -jar /path/to/perturbation-0.0.1-SNAPSHOT-jar-with-dependencies.jar '+targetfile+' test-'+startLineNo
    result = subprocess.run(cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=True)
    print(result)
    result = str(result)
    if '[CLASS]' in result:
        metaInfo = result.split('[CLASS]')[-1]
    if 'startline:' in result:
        cxtStart=result.split('startline:')[1]
        cxtStart=cxtStart.split(' ')[0]
    else:
        cxtStart = int(startLineNo)-10
    if 'endline:' in result:
        cxtEnd=result.split('endline:')[1]
        if '\'' in cxtEnd:
            cxtEnd=cxtEnd.split('\'')[0]
        if '\"' in cxtEnd:
            cxtEnd=cxtEnd.split('\"')[0]
    else:
        cxtEnd=int(startLineNo)+10


    print('meta=========meta====='+metaInfo)
    
    if 'startline' in metaInfo:
        metaInfo = metaInfo.split('startline')[0]
        

        
    if (int(cxtEnd) - int(startLineNo))>10:
        cxtEnd = str(int(startLineNo)+10)
    if (int(startLineNo) - int(cxtStart))>10:
        cxtStart = str(int(startLineNo)-10)       
    cxtStart=str(cxtStart)
    cxtEnd=str(cxtEnd)
      
    print('cxtStart=========cxtStart====='+cxtStart)
    print('cxtEnd=========cxtEnd====='+cxtEnd)

    sample=''
    #get context info
    if cxtStart not in '' and cxtEnd not in '':
        with open(targetfile,'r',encoding='latin1') as perturbFile:
            lines = perturbFile.readlines()
            for i in range(0,len(lines)):
                if i > int(cxtStart)-2 and i < int(cxtEnd):
                    l = lines[i]
                    l = l.strip()
                    #remove comments
                    if  l.startswith('/') or l.startswith('*'):
                        l = ' '
                    l = l.replace('  ','').replace('\r','').replace('\n','')
                    l = l.split('// ')[0]
                    if int(bno) > 0:
                        if i == int(startLineNo)-1:
                            l=' [BUGGY] '+l
                        elif i == int(startLineNo)+ int(bno) -1:
                            l= ' [BUGGY] '+l
                    elif int(bno) == 0:
                        if i == int(startLineNo)-1:
                            l=' [BUGGY] [BUGGY] '+l
      
                    cxt+=l+' '

    
    sample+='[BUG] [BUGGY] ' + buggyLines +' '+ diagnosticMsg+' '+' [CONTEXT] ' + cxt + ' [CLASS]  '+ metaInfo

    sample = sample.replace('\r','').replace('\n','').replace('\t','')
    sample = sample.replace('  ',' ')
    print(sample)

    global countindex 
    with open(repodir+'/test.csv','a')  as csvfile:
        filewriter = csv.writer(csvfile, delimiter='\t',  escapechar=' ', 
                                quoting=csv.QUOTE_NONE)               
        filewriter.writerow([str(countindex),'[PATCH] '+patchLines,sample,bugId+'_'+className+'_'+totalhunk+'_'+str(int(indexId)+1),startLineNo,str(bno),origTargetFile])
        countindex+=1





def executePerturbation(bugId,repodir,rootdir):
    compile_error_flag = True
    project = bugId.split('_')[0]
    bugNo = bugId.split('_')[1]
    exectresult=''
    program_path=repodir+'/'+bugId
    print('****************'+program_path+'******************')
   
    #get test result
    cmd = "cd " + program_path + ";"
    cmd += "defects4j info -p "+project +"  -b "+bugNo
    result=''
    result = subprocess.run(cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=True)
    print(result)
    failingtest = ''
    faildiag = ''
    if 'Root cause in triggering tests:' in str(result):
        result=str(result).split('Root cause in triggering tests:')[1]
    if '--------' in str(result):
        result=str(result).split('--------')[0]
    print(result)
    resultLines = str(result).split('\\')
    for l in resultLines:
        if '-' in l and '::' in l and failingtest  in '':
            failingtest = l.split('-')[1]
            failingtest=failingtest.strip()
        if '-->' in l and faildiag  in '':
            faildiag = l.split('-->')[1]
            if '.' in faildiag:
                faildiag_dots = faildiag.split('.')
                if len(faildiag_dots)>2:
                    faildiag=''
                    for i in range(2,len(faildiag_dots)):
                        faildiag+=faildiag_dots[i]
  
    print('==========failingtest======='+failingtest)
    print('==========faildiag======='+faildiag)

    failingTestMethod=failingtest.split('::')[1]
    exectresult = '[FE] ' + faildiag +' '+failingTestMethod
    os.chdir(rootdir)

    return exectresult



if __name__ == '__main__':

    global countindex
    countindex=497

    bugIds = ['Chart-26','Math-106','Lang-65','Cli-1','Closure-134','Codec-1','Mockito-38','Jsoup-1','JacksonDatabind-1','JacksonCore-1','Compress-1','Collections-25','Time-26','JacksonXml-1','Gson-1','Csv-1','JxPath-1']   
    bugNos = ['1-25','1-105','1-64','2-40','1-170','2-18','1-37','2-93','2-112','2-26','2-47','26-28','1-27','2-6','2-18','2-16','2-22',]
    
    rootdir= '/path/to/SelfAPR'
    repodir = rootdir+'/'

    for i in range(0,17):
        proj=bugIds[i]
        project=proj.split('-')[0]
        bugNo = bugNos[i]
        rangeStart = bugNo.split('-')[0]
        rangeEnd = bugNo.split('-')[1]
        # int(rangeStart) int(rangeEnd)+1
        for i in range(int(rangeStart), int(rangeEnd)+1):
            bugId = project+'_'+str(i)
            if os.path.exists(repodir+'/'+bugId):
                os.system('rm -rf '+repodir+'/'+bugId)
            os.system('rm -rf '+repodir+'/'+project+'*')
            try:
                os.system('defects4j checkout -p '+ str(project)+' -v '+str(i)+'b   -w '+repodir+'/'+bugId)
                start(bugId,repodir,rootdir)
            except (RuntimeError, TypeError, NameError,FileNotFoundError):
                print(RuntimeError)
