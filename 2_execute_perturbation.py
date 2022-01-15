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
            if fnmatch.fnmatch(f, pattern) and ('Test' not in p or 'test' not in p) :
                print(p)
                with open(p,'r') as perturbFile:
                    lines = perturbFile.readlines()
                    if len(lines)>0:
                        for k in range(0,len(lines)):
                            line = lines[k]
                            # if 'REMOVE' in line:
                            constructTrainSample(bugId, lines[k], p, repodir, True,rootdir)
        else:
            traveProject(bugId,p,repodir)


def constructTrainSample(bugId,line,targetfile,repodir,diagnosticFlag,rootdir):
    project = bugId.split('-')[0]
    print(line)
    sample=''
    cxt=''
    filename = targetfile.split('/')[-1]
    originFile = targetfile.replace("Perturbation-","")

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
    diagnosticMsg = diagnostic(bugId,line,targetfile,repodir,action,diagnosticFlag,rootdir)
    
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






def diagnostic(bugId,line,targetfile,repodir,action,executeFlag,rootdir):
    project = bugId.split('-')[0]
    line=line.replace('\r','').replace('\n','')
    filename = targetfile.split('/')[-1]
    originFile = targetfile.replace("Perturbation-","")
    print("*****originFile originFile**** :"+originFile)


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
        execute_result = executePerturbation(bugId,repodir,originFile,action,line,rootdir)
    else:
        execute_result=''
    
    return execute_result




def executePerturbation(bugId,repodir,originFile,action,line,rootdir):
    bugId = bugId.replace('Perturbation-','')
    compile_error_flag = True

    program_path=repodir+'/'+bugId
    print('****************'+program_path+'******************')
    #get compile result
    cmd = "cd " + program_path + ";"
    cmd += "/home/yule/y/defects4j/framework/bin/defects4j compile"
    exectresult=''
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
        cmd += "/home/yule/y/defects4j/framework/bin/defects4j test"
        result=''
        result = subprocess.run(cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=True)
        print(result)
        if 'Failing tests: 0' in str(result):
            exectresult='[NO-ERROR]'
        else:
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
        filewriter.writerow([action,exectresult,line])

    return exectresult



def getFailingTestDiagnostic(failingtest,program_path):
    testclass = failingtest.split("::")[0]

    cmd = "cd " + program_path + ";"
    cmd += "/home/yule/y/defects4j/framework/bin/defects4j monitor.test -t "+failingtest
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

    testclass = failingtest.split("::")[0]
    testmethod = failingtest.split("::")[1]
    testclass=testclass.replace('.','/')
    testclass = testclass+'.java'

    fullpath = program_path+testclass

    
    startflag=False
    code =''
    with open(fullpath,'r') as codefile:
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
    bugIds = ['Lang-65','Chart-26','Math-106','Mockito-38','Time-26','Closure-134','Cli-1','Collections-25','Codec-1','Compress-1','Csv-1','Gson-1','JacksonCore-1','JacksonDatabind-1','JacksonXml-1','Jsoup-1','JxPath-1']
    # bugIds = ['Chart-26']    
    rootdir= '/Users/sophie/Documents/SUPRE'
    repodir = rootdir+'/D4JTraining'

    for bugId in bugIds:
        project=bugId.split('-')[0]
        bugNo = bugId.split('-')[1]

        if os.path.exists(repodir+'/'+bugId):
            os.system('rm -rf '+repodir+'/'+bugId)
        os.system('/home/yule/y/defects4j/framework/bin/defects4j checkout -p '+ str(project)+' -v '+str(bugNo)+'f   -w '+repodir+'/'+bugId)

        bugId = bugId.replace(project, "Perturbation-"+project)
        start(bugId,repodir,rootdir)
