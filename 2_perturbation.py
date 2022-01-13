#!/usr/bin/python
import sys, os, time, subprocess,fnmatch, shutil, csv,re, datetime



def perturb(bugId,repodir,rootdir):
    projectPath=repodir+'/'+bugId
    traveProject(projectPath)
    



def traveProject(projectPath):
    listdirs = os.listdir(projectPath)
    for f in listdirs:
        if 'src' in f or 'src' in projectPath and 'test' not in projectPath:
            pattern = '*.java'
            p = os.path.join(projectPath, f)
            if os.path.isfile(p):
                if 'test' not in p and fnmatch.fnmatch(f, pattern): 
                    print(p)
                    #call spoon based Java pertubation programs.
                    callstr = 'java -jar ./perturbation/target/perturbation-0.0.1-SNAPSHOT-jar-with-dependencies.jar '
                    callstr+=p
                    os.system(callstr)
                    print(p)

            else:
                traveProject(p)








if __name__ == '__main__':
    
    # bugIds = ['Bears-2','Bears-90','Bears-98','Bears-186']

    bugIds = ['Bears-186']
    rootdir= '/Users/sophie/Documents/SUPRE'
    repodir = rootdir+'/PerturbProjects'

    for bugId in bugIds:
        perturb(bugId,repodir,rootdir)
