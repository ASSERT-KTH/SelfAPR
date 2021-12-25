#!/usr/bin/python
import sys, os, time, subprocess,fnmatch, shutil, csv,re, datetime



def perturb(bugId,repodir,rootdir):
    checkout(bugId,repodir)
    applyHumanPatch(bugId,repodir,rootdir)
    compileBug(bugId,repodir)



# In this function, we check out the buggy programs from Bears.
# Buggy program -> Correct programs
def applyHumanPatch(bugId,repodir,rootdir):
    os.chdir(rootdir)
    patchPath = repodir+'/HumanBearsPatch/'+bugId+'.diff'
    targetFile=''
    with open(patchPath) as f:
        firstLine=f.readlines()[0]
        targetFile=repodir+'/'+bugId+'/'+firstLine.split('--- ')[1]
    os.system("patch -u -l --fuzz=10  -i  " +patchPath +"  "+ targetFile)



# In this function, we check out the buggy programs from Bears.
def checkout(bugId,repodir):
    #customize bugs checkout script
    scriptdir = '/Users/sophie/Documents/SUPRE/bears-benchmark/customizedBearScript'
    os.chdir(scriptdir)
    print('now in the dir:'+scriptdir)
    checkoutstring = 'python2.7 checkout_bug.py  --bugId  '+ bugId + '  --workspace '+ repodir
    print(checkoutstring)
    os.system(checkoutstring)
    


def compileBug(bugId,repodir):
    scriptdir = '/Users/sophie/Documents/SUPRE/bears-benchmark/customizedBearScript'
    os.chdir(scriptdir)
    compilestring = 'python2.7 mycompile_bug.py  --bugId  '+ bugId + '  --workspace '+ repodir
    print(compilestring)
    results = os.popen(compilestring).read()
    results = results.split('Results :')[-1]
    print('test running result focus: '+ results) 







if __name__ == '__main__':
    bugIds = ['Bears-2']
    rootdir= '/Users/sophie/Documents/SUPRE'
    repodir = '/Users/sophie/Documents/SUPRE/Bears_Training'

    for bugId in bugIds:
        perturb(bugId,repodir,rootdir)







    # now = datetime.datetime.now()
    # date = now.strftime("%Y-%m-%d")
    # targetFilePath=""
    # callPerturb = 'java -jar /Users/sophie/Documents/SUPRE/perturbation/target/spoonChecker-0.0.1-SNAPSHOT-jar-with-dependencies.jar '
    # callPerturb+=targetFilePath