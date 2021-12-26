# SUPRE


##  setup bears benchmark
```
git submodule add https://github.com/bears-bugs/bears-benchmark.git

cp -rf customizedBearScript  ./bears-benchmark/
```

##  build our AST based code perturbation programs
 ```
cd perturbation
mvn package assembly:single
```
Please check perturbation-0.0.1-SNAPSHOT-jar-with-dependencies.jar under perturbation/target folder.
Simplely check it with the following script:
```
java -jar ./perturbation/target/perturbation-0.0.1-SNAPSHOT-jar-with-dependencies.jar   Your/JAVA/FILE/PATH
```

##  Code perturbation scripts
Checkout the buggy projects, apply the human written patches on them and make sure NO failling tests 
```
python3  1_setup_projects.py
```
Iterate each file of the considered projects
```
python3  2_perturbation.py
```





