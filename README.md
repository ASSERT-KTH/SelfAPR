# SelfAPR: Self-supervised Program Repair with Test Execution Diagnostics (Paper Under Review)



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
java -jar ./perturbation_model/target/perturbation-0.0.1-SNAPSHOT-jar-with-dependencies.jar Your/JAVA/FILE/PATH Options=SelfAPR|BugLab|test
```
##### Check the source code and build the package as below.

 ```
cd perturbation
mvn package assembly:single
```
Please check perturbation-0.0.1-SNAPSHOT-jar-with-dependencies.jar under perturbation_model/target folder.
Simplely check it with the usage shown above:
```
java -jar XX.jar  path Options=SelfAPR|BugLab|test
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
python3 4-train.py
```

#### To test the trained model:
```
python3 5-test.py
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







## Comparison of repaired bug with state-of-the-art

|RewardRepair(ICSE'22)|Recoder(FSE'21)|Coconut(ISSTA'21)|CureRecoder(ICSE'21)|SelfAPR(this work)|
|---|---|---|---|---|
|Math_57|Chart_1|Chart_1|Chart_1|Chart_1|
|Math_5|Chart_11|Chart_11|Chart_11|Chart_11|
|Math_41|Chart_12|Chart_12|Chart_12|Chart_14|
|Time_19|Chart_20|Chart_14|Chart_14|Chart_20|
|Math_30|Chart_24|Chart_24|Chart_17|Chart_24|
|Math_82|Chart_3|Chart_9|Chart_20|Chart_4|
|Lang_29|Chart_4|Closure_18|Chart_24|Chart_7|
|Math_59|Chart_8|Closure_31|Closure_118|Chart_8|
|Lang_45|Chart_9|Closure_38|Chart_8|Chart_9|
|Math_70|Closure_10|Closure_40|Chart_9|Closure_102|
|Closure_101|Closure_104|Closure_46|Closure_10|Closure_104|
|Chart_12|Closure_11|Closure_70|Closure_102|Closure_11|
|Lang_21|Closure_115|Closure_73|Closure_11|Closure_113|
|Lang_59|Closure_118|Closure_86|Closure_126|Closure_115|
|Closure_73|Closure_14|Closure_92|Closure_18|Closure_118|
|Math_85|Closure_18|Lang_10|Closure_38|Closure_126|
|Closure_62|Closure_2|Lang_26|Closure_40|Closure_13|
|Chart_24|Closure_31|Lang_29|Closure_46|Closure_18|
|Closure_86|Closure_33|Lang_33|Closure_57|Closure_31|
|Closure_70|Closure_40|Lang_51|Closure_62|Closure_38|
|Closure_18|Closure_46|Lang_57|Closure_70|Closure_40|
|Chart_11|Closure_57|Lang_59|Closure_73|Closure_46|
|Math_11|Closure_62|Math_2|Closure_86|Closure_57|
|Lang_6|Closure_70|Math_22|Closure_92|Closure_62|
|Closure_31|Closure_73|Math_27|Lang_10|Closure_70|
|Lang_33|Closure_86|Math_30|Lang_26|Closure_73|
|Mockito_26|Closure_92|Math_34|Lang_29|Closure_86|
|Math_33|Lang_26|Math_56|Lang_38|Closure_92|
|Math_75|Lang_29|Math_57|Lang_43|Lang_10|
|Math_94|Lang_33|Math_58|Lang_51|Lang_21|
|Math_80|Lang_38|Math_59|Lang_57|Lang_26|
|Mockito_5|Lang_43|Math_65|Lang_59|lang_33|
|Closure_11|Lang_51|Math_77|Lang_6|Lang_38|
|Chart_1|Lang_55|Math_80|Math_2|Lang_43|
|Closure_1|Lang_57|Math_82|Math_22|Lang_51|
|Math_50|Lang_59|Math_90|Math_27|Lang_57|
|Closure_126|Lang_6|Math_94|Math_30|Lang_59|
|Closure_92|Math_105|Math_98|Math_34|Lang_6|
|Lang_57|Math_27|Mockito_29|Math_41|Math_104|
|Math_2|Math_30|Mockito_5|Math_50|Math_22|
|Closure_38|Math_33|Mockito_8|Math_56|Math_30|
|Math_104|Math_34|Time_19|Math_57|Math_41|
|Math_105|Math_41||Math_58|Math_46|
|Chart_9|Math_5||Math_59|Math_5|
||Math_50||Math_65|Math_50|
||Math_57||Math_70|Math_57|
||Math_58||Math_75|Math_58|
||Math_70||Math_79|Math_70|
||Math_75||Math_80|Math_72|
||Math_82||Math_82|Math_75|
||Math_85||Math_94|Math_77|
||Math_94||Math_98|Math_79|
||Math_96||Mockito_29|Math_80|
||Math_98||Time_19|Math_82|
||Mockito_29||Mockito_5|Math_85|
||Time_19|||Math_94|
||Time_4|||Math_98|
||Time_7|||Mockito_24|
|||||Mockito_26|
|||||Mockito_29|
|||||Mockito_34|
|||||Mockito_5|
|||||Mockito_8|
|||||Time_4|
|||||Time_19|


