#!/usr/bin/python
import sys, os, time, subprocess,fnmatch, shutil, csv,re, datetime



def start(bugId,repodir,rootdir):
    projectPath=repodir+'/'+bugId
    #get buggy file and buggy line
    print('bugid'+bugId)

    targetfile = getBuggyFile(bugId,repodir)
    #split , for multiple files
    tfiles = targetfile.split(',')
    print('!!!!targetfile!!!!!!!'+targetfile)

    for tf in tfiles:
        print('!!!!!tf!!!!!!'+tf)
        if '.java' not in tf:
            tf=tf+'.java'
        diffLists = getBuggyLines(bugId,repodir,tf)
        print('======diffLists========='+str(diffLists))

        for k in range(0,len(diffLists)):
            diff=diffLists[k]
            startLineNo=diff.split('[buggy]')[0]
            buggyLines=diff.split('[buggy]')[1]
            buggyLines=buggyLines.split('[patch]')[0]
            patchLines = diff.split('[patch]')[1]
            patchLines = patchLines.split('[buggyLineNo]')[0]
            buggyLineNo = diff.split('[buggyLineNo]')[1]

        
            print('@@@@startLineNo@@@@'+startLineNo)
            print('#####buggyLines######'+buggyLines)
            print('#####patchLines######'+patchLines)

            if str(startLineNo) not in '':
                constructTrainSample(bugId, k, tf, repodir, rootdir,str(startLineNo),buggyLines,patchLines,str(len(diffLists)),str(buggyLineNo))
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
            bid = l.split('\t')[1]
            if bugIdUnderScore in bid and bid in bugIdUnderScore:
                targetFile = l.split('\t')[2]
                break
    return targetFile

def getBuggyLines(bugId,repodir,tf):
    tclass=tf.split('/')[-1]
    tclass=tclass.replace('.java','').replace('\n','').replace('\r','')
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
            print(h)
            lines = h.split("\\n', '")
            for l in lines:
                print(l)
                if '@@' in l and '+' in l and ',' in l:
                    startLineNo= l.split(',')[0]
                    startLineNo= str(int(startLineNo)+1)   
                
                if l.startswith('-'):
                    startword = l[1:]
                    startword =  startword.strip()
                    if not startword.startswith('/') and not startword.startswith('*') and not startword.startswith('import') and not startword.startswith('System.out') and not startword.startswith('Logger') and not startword.startswith('log.info') and  not startword.startswith('logger')  and  not startword.startswith('//'):
                        startword = startword.split('//')[0]
                        buggyLines = buggyLines + startword+' '
                        buggyLineNo+=1
                                      
                if l.startswith('+'):
                    startword = l[1:]
                    startword =  startword.strip()
                    if not startword.startswith('/') and not startword.startswith('*') and not startword.startswith('import') and not startword.startswith('System.out') and not startword.startswith('Logger') and not startword.startswith('log.info') and  not startword.startswith('logger') and  not startword.startswith('//'):
                        startword = startword.split('//')[0]
                        patchLines = patchLines + startword+' '


            hunkinfo = startLineNo+'[buggy]'+buggyLines+'[patch]'+patchLines+'[buggyLineNo]'+str(buggyLineNo)
            diffList.append(hunkinfo)
    print(str(diffList))
    return diffList


def constructTrainSample(bugId, indexId, targetfile, repodir, rootdir,startLineNo,buggyLines,patchLines,totalhunk,bno):   
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
    # get diagnostic by execution
    diagnosticMsg = executePerturbation(bugId,repodir,rootdir)
    print(diagnosticMsg)


    cmd = 'java -jar ./perturbation/target/perturbation-0.0.1-SNAPSHOT-jar-with-dependencies.jar test '+startLineNo+ '  '+targetfile
    result = subprocess.run(cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=True)
    print(result)
    result = str(result).split('stdout=b\'')[1]
    if '[CLASS]' in result:
        metaInfo = result.split('\\')[0]
    if 'startline:' in result:
        cxtStart=result.split('startline:')[1]
        cxtStart=cxtStart.split('\\')[0]
    else:
        cxtStart = int(startLineNo)-10
    if 'endline:' in result:
        cxtEnd=result.split('endline:')[1]
        cxtEnd=cxtEnd.split('\\')[0]
    else:
        cxtEnd=int(startLineNo)+10


    cxtStart=str(cxtStart)
    cxtEnd=str(cxtEnd)
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
                    if i == int(startLineNo)-1:
                        l='[BUGGY] '+l
                    cxt+=l+' '

    
    sample+='[BUGGY] ' + buggyLines +' '+ diagnosticMsg+' '+ metaInfo+' [CONTEXT] ' + cxt
    sample = sample.replace(',',' , ').replace(';',' ; ').replace('=',' = ').replace('  ',' ').replace('\r','').replace('\n','').replace('\t','').replace('(',' ( ').replace(')',' ) ').replace('.',' . ')
    sample = sample.replace('  ',' ')
    print(sample)

    global countindex 
    with open(repodir+'/test.csv','a')  as csvfile:
        filewriter = csv.writer(csvfile, delimiter='\t',  escapechar=' ', 
                                quoting=csv.QUOTE_NONE)               
        filewriter.writerow([str(countindex),patchLines,sample,bugId+'_'+className+'_'+totalhunk+'_'+str(int(indexId)+1),startLineNo,str(bno),origTargetFile])
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
    cmd += "/Users/sophie/Documents/newD4J/defects4j/framework/bin/defects4j info -p "+project +"  -b "+bugNo
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
    resultLines = result.split('\\')
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

    failTestCode = getFailingTestSourceCode(failingtest,program_path)
    exectresult = '[FE] ' + faildiag +' '+failTestCode
    


    os.chdir(rootdir)

    with open(repodir+'/diagnostic.csv','a')  as csvfile:
        filewriter = csv.writer(csvfile, delimiter='\t',  escapechar=' ', 
                                quoting=csv.QUOTE_NONE)               
        filewriter.writerow([exectresult])

    return exectresult



def getFailingTestDiagnostic(failingtest,program_path):
    testclass = failingtest.split("::")[0]

    cmd = "cd " + program_path + ";"
    cmd += "gtimeout 500  /Users/sophie/Documents/newD4J/defects4j/framework/bin/defects4j monitor.test -t "+failingtest
    result = subprocess.run(cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=True)
    print(result)
    cmd = 'java -cp /Users/sophie/Documents/SUPRE/chart1b/build-tests:/Users/sophie/Documents/SUPRE/lib/hamcrest-core-1.3.jar:/Users/sophie/Documents/SUPRE/lib/junit-4.12.jar org.junit.runner.JUnitCore '+  failingtest.split("::")[0]
    
    if 'failed!' in str(result) :
        result = str(result).split('failed!')[1]
        if testclass in str(result):
            result = str(result).split(testclass)[1]
            if '):' in str(result):
                result = str(result).split('):')[1]
                if '\\' in str(result):
                    result = str(result).split('\\')[0]
    else:
        result =''

    if 'null' in result and result in 'null':
        result = 'NullPointerException'
    elif 'expected' in result and 'but' in result:
        result =  'AssertionFailedError  ' +result
    elif 'Size' in result and 'Index' in result:
        result =  'IndexOutOfBoundsException ' + result
    elif 'Requires' in result :
        result =  'IllegalArgumentException ' + result
    
    return str(result)



def getFailingTestSourceCode(failingtest,program_path):
    print('&&&&&&&program_path&&&&&'+program_path)
    if os.path.exists((program_path+'/tests')):
        program_path = program_path+'/tests/'
    elif os.path.exists(program_path+'/test'):
        program_path = program_path+'/test/'
    elif os.path.exists(program_path+'/src/test/java'):
        program_path = program_path+'/src/test/java/'
    elif os.path.exists(program_path+'/src/test'):
        program_path = program_path+'/src/test/'
    elif os.path.exists(program_path+'/gson/src/test/java'):
        program_path = program_path+'/gson/src/test/java/'
    
    testclass = failingtest.split("::")[0]
    testmethod = failingtest.split("::")[1]
    testclass=testclass.replace('.','/')
    testclass = testclass+'.java'

    fullpath = program_path+testclass

    
    startflag=False
    code =''
    with open(fullpath,'r',encoding='latin1') as codefile:
        lines=codefile.readlines()
        for l in lines:
            if 'public' in l  and 'void' in l and testmethod in l:
                startflag=True
            if 'public' in l and 'void' in l and testmethod not in l:
                startflag=False
            if startflag:
                if 'assert' in l:
                    l = l.strip()
                    if l not in code:
                        code=l
    return code








if __name__ == '__main__':

    global countindex
    countindex=2138
    # 'Chart-26','Math-106','Closure-1', 'Cli-1',  'Codec-1','Compress-1', 'Csv-1',  'Gson-1','JacksonCore-1','JacksonDatabind-1','JacksonXml-1',
#    '1-25','98-105','170-176','7-40',  '15-18',  '2-47', '2-16',   '17-18','2-26','2-112','2-6',
    bugIds = [ 'Jsoup-1','JxPath-1','Mockito-38','Time-26','Lang-65','Collections-25']
    bugNos = [ '72-93','2-22','1-37','22-25','3-64','26-28' ]

    
    rootdir= '/Users/sophie/Documents/SUPRE'
    repodir = rootdir+'/'

    for i in range(5,6):
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
            os.system('/Users/sophie/Documents/newD4J/defects4j/framework/bin/defects4j checkout -p '+ str(project)+' -v '+str(i)+'b   -w '+repodir+'/'+bugId)

            start(bugId,repodir,rootdir)
