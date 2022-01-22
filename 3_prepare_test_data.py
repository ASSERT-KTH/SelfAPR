#!/usr/bin/python
import sys, os, time, subprocess,fnmatch, shutil, csv,re, datetime



def start(bugId,repodir,rootdir):
    projectPath=repodir+'/'+bugId
    #get buggy file and buggy line
    print('bugid'+bugId)

    targetfile = getBuggyFile(bugId,repodir)
    print('!!!!!!!!!!!'+targetfile)
    startLineNo,buggyLines,patchLines = getBuggyLines(bugId,repodir)
    print('@@@@startLineNo@@@@'+startLineNo)
    print('#####buggyLines######'+buggyLines)
    print('#####patchLines######'+patchLines)


    if str(startLineNo) not in '':
        constructTrainSample(bugId, targetfile, repodir, rootdir,str(startLineNo),buggyLines,patchLines)
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

def getBuggyLines(bugId,repodir):
    projectPath=repodir+repodir
    bugId = bugId.replace('-','_')+'_'
    diffDir = repodir+'scripts/D4JDiff'
    listdirs = os.listdir(diffDir)
    startLineNo=''
    buggyLines=''
    patchLines=''
    for f in listdirs:
        pattern = '*.diff'
        if fnmatch.fnmatch(f, pattern):
            if bugId in f:
                print(f)
                p = os.path.join(diffDir, f)
                with open(p,'r', encoding='latin1') as diff:
                    lines = diff.readlines()
                    for i in range(3,len(lines)):
                        l = lines[i]
                        if l.startswith('-'):
                            startword = l[1:]
                            startword =  startword.strip()
                            if not startword.startswith('/') and not startword.startswith('*') and not startword.startswith('import') and not startword.startswith('System.out') and not startword.startswith('Logger') and not startword.startswith('log.info') and  not startword.startswith('logger')  and  not startword.startswith('//'):
                                startword = startword.split('//')[0]
                                buggyLines = buggyLines + startword+' '
                                if startLineNo  in '':
                                    startLineNo=str(i)
                        if l.startswith('+'):
                            startword = l[1:]
                            startword =  startword.strip()
                            if not startword.startswith('/') and not startword.startswith('*') and not startword.startswith('import') and not startword.startswith('System.out') and not startword.startswith('Logger') and not startword.startswith('log.info') and  not startword.startswith('logger') and  not startword.startswith('//'):
                                startword = startword.split('//')[0]
                                patchLines = patchLines + startword+' '
                                if startLineNo  in '':
                                    startLineNo=str(i)
    return str(startLineNo),buggyLines,patchLines


def constructTrainSample(bugId, targetfile, repodir, rootdir,startLineNo,buggyLines,patchLines):
    targetfile=repodir+bugId+'/'+targetfile
    targetfile = targetfile.split('.java')[0]+'.java'
    print('targetfiletargetfiletargetfile'+targetfile)
    print('startLineNo=========startLineNo====='+startLineNo)
    print('bugId=========bugId====='+bugId)
    print('buggyLines'+buggyLines)
    cxt=''
    metaInfo=''
    # get diagnostic by execution
    diagnosticMsg = executePerturbation(bugId,repodir,rootdir)
    diagnosticMsg = diagnosticMsg[0:100]
    print(diagnosticMsg)


    cmd = 'java -jar ./perturbation/target/perturbation-0.0.1-SNAPSHOT-jar-with-dependencies.jar test '+startLineNo+ '  '+targetfile
    result = subprocess.run(cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=True)
    print(result)
    result = str(result).split('stdout=b\'')[1]
    if '[Class]' in result:
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
                        l='[ATTENTION] '+l
                    cxt+=l+' '

    
    sample+='[BUGGY] ' + buggyLines +' '+ diagnosticMsg+' '+ metaInfo+' [CONTEXT] ' + cxt
    sample = sample.replace(',',' , ').replace(';',' ; ').replace('=',' = ').replace('  ',' ').replace('\r','').replace('\n','').replace('\t','').replace('(',' ( ').replace(')',' ) ').replace('.',' . ')
    sample = sample.replace('  ',' ')
    print(sample)


    with open(repodir+'/test.csv','a')  as csvfile:
        filewriter = csv.writer(csvfile, delimiter='\t',  escapechar=' ', 
                                quoting=csv.QUOTE_NONE)               
        filewriter.writerow([bugId,patchLines,sample])





def executePerturbation(bugId,repodir,rootdir):
    bugId = bugId.replace('Perturbation-','')
    compile_error_flag = True

    program_path=repodir+'/'+bugId
    print('****************'+program_path+'******************')
    #get compile result
    cmd = "cd " + program_path + ";"
    cmd += "timeout 300  /home/yule/y/defects4j/framework/bin/defects4j compile"
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
                exectresult=''
                compile_error_flag=False



    if not compile_error_flag:
        #get test result
        cmd = "cd " + program_path + ";"
        cmd += "timeout 300  /home/yule/y/defects4j/framework/bin/defects4j test"
        result=''
        result = subprocess.run(cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=True)
        print(result)
        if 'Failing tests: 0' in str(result):
            exectresult='[NO-ERROR]'
        elif 'Failing tests:' in str(result):
            result=str(result).split('Failing tests:')[1]
            result=str(result).split('-')
            for i in range(1,len(result)):
                failingtest = result[i]
                if '\\' in failingtest:
                    failingtest = failingtest.split('\\')[0]
                failingtest=failingtest.strip()
                faildiag = getFailingTestDiagnostic(failingtest,program_path)
                failTestCode = getFailingTestSourceCode(failingtest,program_path)
                exectresult = '[FE] ' + faildiag +' '+failTestCode
                break


    os.chdir(rootdir)

    with open(repodir+'/diagnostic.csv','a')  as csvfile:
        filewriter = csv.writer(csvfile, delimiter='\t',  escapechar=' ', 
                                quoting=csv.QUOTE_NONE)               
        filewriter.writerow([exectresult])

    return exectresult



def getFailingTestDiagnostic(failingtest,program_path):
    testclass = failingtest.split("::")[0]

    cmd = "cd " + program_path + ";"
    cmd += "timeout 500  /home/yule/y/defects4j/framework/bin/defects4j monitor.test -t "+failingtest
    result = subprocess.run(cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=True)
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
                        code+=l
    return code








if __name__ == '__main__':
    bugIds = ['Collections-25','Compress-1','Csv-1','Gson-1','JacksonCore-1','JacksonDatabind-1','JacksonXml-1','Jsoup-1','JxPath-1']
    bugNos = ['26-28','7-47','2-16','2-18','2-26','2-112','2-6','2-93','2-22' ]

    
    rootdir= '/home/yule/y/getTest'
    repodir = rootdir+'/'

    for i in range(1,9):
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
            os.system(' /home/yule/y/defects4j/framework/bin/defects4j checkout -p '+ str(project)+' -v '+str(i)+'b   -w '+repodir+'/'+bugId)

            start(bugId,repodir,rootdir)

