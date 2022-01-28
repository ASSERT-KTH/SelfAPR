# SUPRE


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




|RewardRepair|Recoder|Coconut|Cure|SUPREME|
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
|Closure_70|Closure_40|Lang_51|Closure_62|Closure_40|
|Closure_18|Closure_46|Lang_57|Closure_70|Closure_46|
|Chart_11|Closure_57|Lang_59|Closure_73|Closure_57|
|Math_11|Closure_62|Math_2|Closure_86|Closure_62|
|Lang_6|Closure_70|Math_22|Closure_92|Closure_70|
|Closure_31|Closure_73|Math_27|Lang_10|Closure_73|
|Lang_33|Closure_86|Math_30|Lang_26|Closure_86|
|Mockito_26|Closure_92|Math_34|Lang_29|Closure_92|
|Math_33|Lang_26|Math_56|Lang_38|Lang_10|
|Math_75|Lang_29|Math_57|Lang_43|Lang_21|
|Math_94|Lang_33|Math_58|Lang_51|Lang_26|
|Math_80|Lang_38|Math_59|Lang_57|Lang_43|
|Mockito_5|Lang_43|Math_65|Lang_59|Lang_51|
|Closure_11|Lang_51|Math_77|Lang_6|Lang_55|
|Chart_1|Lang_55|Math_80|Math_2|Lang_57|
|Closure_1|Lang_57|Math_82|Math_22|Lang_59|
|Math_50|Lang_59|Math_90|Math_27|Lang_6|
|Closure_126|Lang_6|Math_94|Math_30|Lang_8|
|Closure_92|Math_105|Math_98|Math_34|Math_104|
|Lang_57|Math_27|Mockito_29|Math_41|Math_22|
|Math_2|Math_30|Mockito_5|Math_50|Math_30|
|Closure_38|Math_33|Mockito_8|Math_56|Math_41|
|Math_104|Math_34|Time_19|Math_57|Math_46|
|Math_105|Math_41||Math_58|Math_49|
|Chart_9|Math_5||Math_59|Math_5|
||Math_50||Math_65|Math_50|
||Math_57||Math_70|Math_57|
||Math_58||Math_75|Math_70|
||Math_70||Math_79|Math_72|
||Math_75||Math_80|Math_75|
||Math_82||Math_82|Math_77|
||Math_85||Math_94|Math_79|
||Math_94||Math_98|Math_80|
||Math_96||Mockito_29|Math_82|
||Math_98||Time_19|Math_85|
||Mockito_29||Mockito_5|Math_98|
||Time_19|||Mockito_26|
||Time_4|||Mockito_29|
||Time_7|||Mockito_34|
|||||Mockito_5|
|||||Mockito_8|
|||||Closure_38|
|||||lang_33|

