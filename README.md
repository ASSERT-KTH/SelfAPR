# SelfAPR: Self-supervised Program Repair with Test Execution Diagnostics



## Folder Structure
 ```bash
├── perturbation_model: the source code of java implemented perturbation model
│ 
├── Samples_BugLab: the generated perturbation-based samples with four BugLab repair actions
│ 
├── Samples_SelfAPR: the generated perturbation-based samples with 16 SelfAPR repair actions
│   
├── Dataset
│   ├── SelfAPR.csv.tar.gz : the dataset used to train SelfAPR model
│   ├── SelfAPR_ALL.csv.tar.gz : all generated training samples
│   ├── SelfAPR_FE.csv.tar.gz  : functional error training samples
│   ├── SelfAPR_CE.csv.tar.gz : compilation error training samples
│   ├── test.csv : the testing set from Defects4j bug dataset
│ 
├── result 
│   ├──result.csv : the correctly generated patches by SelfAPR trained model.
│   ├──patch_execution_result.csv : the execution results for patches generated for test set.
│   ├──valid_patches.csv : the patches classified as plausible or identical to the human-written patches.
└──  

```






## Prerequisites:
 ```
Install Defects4J from https://github.com/rjust/defects4j 
export PATH=$PATH:"path2defects4j"/framework/bin
 ```

 ```
JDK 1.8 for Defects4J
export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-amd64
export PATH=$JAVA_HOME/bin:$PATH
export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
 ```
 

 
## Go to the perturbation_model folder to check the source code and build the model:

##### We upload the build jar package on Zenodo. Download the jar file and execute it as below.
```
https://doi.org/10.5281/zenodo.6582348
java -jar ./perturbation_model/target/perturbation-0.0.1-SNAPSHOT-jar-with-dependencies.jar Your/JAVA/FILE/PATH Options=SelfAPR|BugLab|test-'buggyLineNo'
```
##### Check the source code and build the package as below.

 ```
cd perturbation
mvn package assembly:single
```
Please check perturbation-0.0.1-SNAPSHOT-jar-with-dependencies.jar under perturbation_model/target folder.
Simplely check it with the different options:
```
java -jar perturbation-0.0.1-SNAPSHOT-jar-with-dependencies.jar path Options=SelfAPR|BugLab|test

With option SelfAPR: we perturb with all 16 rules in SelfAPR (Then the perturbation-based samples are executed).
With option BugLab: we perturb with all 16 rules in BugLab (No execution will be conducted).
With option test: we extract context information for testing samples.

```





##  Code perturbation scripts

#### Checkout the buggy projects, apply the human written patches on them and make sure NO failling tests. Start the perturbation with this script:
```
python3  1_perturb_projects.py
```
#### Iterate each file of the considered projects, generate perturbed project-specific trianings samples and execute them against test cases:
```
python3  2_execute_perturbation.py
```
#### Prepare a set of evaluation bugs from Defects4J:

```
python3 3_prepare_test_data.py
```

#### We are ready to train the perturbed samples with transformer:Pytorch==1.7.1 and transformers>=4.10.0
```
pip install transformers
pip install sentencepiece
python3 4_train.py
```

#### To test the trained model:
```
python3 5_test.py
```

#### To evaluat the test results:
```
python3 6_evaluate_patch.py
```

## Fault Localization with Gzoltar and Flacoco: faultlocalization 


#### We compute all the suspicous buggy lines with two fault localization with Gzoltar and Flacoco. At inference phase, for a given suspicious statement found by fault localization tools, SelfAPR represents it with a sequences of tokens. Those tokens are given to the trained SelfAPR model. SelfAPR is configured by the inference beam size n, it outputs  the n best patches for that suspicious statement.



## All perturbed samples under the folder: Samples_SelfAPR 

Some samples are below, all samples are found in Samples_SelfAPR.


|P|P'|Rule|
|---|---|---|
|[PATCH]  if  (  rand  ==  null  )  {	|[BUG]  [BUGGY]  if  (  rand  !=  null)  {[FE]  NullPointerException  testGetSortedValues ...  [CONTEXT]  private  RandomGenerator  getRan()  {...|[P2_Replace_Operator]|
|[PATCH]  list[i]  =  temp;	|[BUG]  [BUGGY]  list[i]  =  target;[FE] AssertionFailedError  expected:<0.01>  but  was:<0.0>  testPercentiles  ...  [CONTEXT]  ...|    	[P5_Replace_Variable]|
|[PATCH]  if  (  this.runningState  ==  STATE_RUNNING  )  {	| [BUG]  [BUGGY]  if(  this.runningState  ==  STATE_STOPPED)  {[FE]  Illegal  running  state  has  occured....  [CONTEXT]  public  long  getTime() ....|[P9_Replace_Statement]|







