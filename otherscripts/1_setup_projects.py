#!/usr/bin/python
import sys, os, time, subprocess,fnmatch, shutil, csv,re, datetime



def setup(bugId,repodir,rootdir):
    checkout(bugId,repodir)
    applyHumanPatch(bugId,repodir,rootdir)
    compileBug(bugId,repodir)



# In this function, we check out the buggy programs from Bears.
# Buggy program -> Correct programs
def applyHumanPatch(bugId,repodir,rootdir):
    os.chdir(rootdir)
    patchPath = rootdir+'/HumanBearsPatch/'+bugId+'.diff'
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
    # Bears-2 FasterXML-jackson-databind  54370 nloc
    # Bears-27 INRIA-spoon
    # Bears-90 spring-projects-spring-data-commons 18626 nloc
    # Bears-98 traccar-traccar  31715 nloc
    # Bears-142 activiti-activiti 
    # Bears-143 2018swecapstone-h2ms
    # Bears-147 aicis-fresco
    # Bears-183 spring-cloud-spring-cloud-gcp
    # Bears-184 spring-projects-spring-data-jpa
    # Bears-186 swagger-api-swagger-codegen 41282 nloc
    # Bears-188 szfmv2018-tavasz-automatedcar
    # Bears-222 jgrapht-jgrapht-443997242-444189432
    # Bears-245 square-javapoet
    # bugIds = ['Bears-2','Bears-90','Bears-98','Bears-186']

    bugIds = ['Bears-169']
    rootdir= '/Users/sophie/Documents/SUPRE'
    repodir = rootdir+'/PerturbProjects'

    for bugId in bugIds:
        if not os.path.exists(repodir):
            os.system("mkdir -p "+repodir)

        setup(bugId,repodir,rootdir)