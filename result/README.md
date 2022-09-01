### Uniquely repaired bugs
To our knowledge,  compared with CURE, CoCoNut, RewardRepair and Recoder, SelfAPR uniquely repaires the following bugs with the given perfect FL:
* Chart_7
* Closure_113
* Closure_123
* Closure_125
* Closure_79
* Lang_58
* Math_46
* Math_49
* Math_72
* Time_15
* Time_7

## correlation between the repair actions and repaired bugs
|Perturb Actions|Repair Actions|No. bugs|Repaired Bugs|
|---|---|---|---|
|P1 Replace type|Replace type| 5|Lang_29,Math_30,Math_79,Collections_26,Math_57|
|P2 Replace operator|Replace operator|12|Chart_1,Closure_168,Closure_38,Closure_62,Closure_73,Math_82,Math_85,Time_19,JacksonCore_5,Compress_19,JacksonCore_25,JacksonDatabind_17|
|P3 replace literal|Replace literal|16|Closure_40,Closure_70,Closure_86,Math_104,Math_11,Math_22,Math_80,Mockito_26,Cli_8,Codec_16,Codec_3,Codec_4,Codec_7,Codec_9,Compress_23,Jsoup_17|
|P4 replace constructor|replace constructor|1|Lang_26|
|P5 replace variable|Replace variable|14|Chart_11,Chart_20,Chart_7,Chart_8,Lang_21,Lang_59,Lang_6,Math_72,JacksonDatabind_34,Jsoup_41,Math_33,Math_46,Math_5,JacksonDatabind_27|
|P6 replace condition expression|Replace condition expression|17|Chart_9,Closure_10,Closure_104,Closure_11,Closure_113,Closure_125,Closure_18,Closure_57,Lang_58,Math_94,Cli_12,Compress_38,JxPath_12,Math_32,Compress_27,Compress_27,Codec_8|
|P7 replace invocation|replace invocation|7|Closure_92,Math_70,Math_75,Cli_27,Jsoup_24,Jsoup_40,Jsoup_62|
|P8 compound statement |compound statement|10|Lang_33,Math_59,Cli_25,Cli_28,Cli_37,Codec_17,Compress_14,Csv_4,Gson_6,Jsoup_68|
|P9 replace with similarity|replace with similarity|11|Closure_123,Lang_57,Mockito_5,Time_7,Cli_40,Compress_32,JacksonCore_8,JacksonDatabind_57,JacksonXml_5,Math_41,Math_49|
|P10 move statement|move statement|0||
|P11 transplatant statement|remove statement |0||
|P12 transplatant condition|unwrap condition|1|JacksonDatabind_83|
|P13 transplatant a block|remove a block|5|Closure_126,Closure_46,Closure_6,JacksonDatabind_102,Math_50|
|P14 remove a statement|insert statement|5|Chart_24,Closure_79,Lang_51,JacksonDatabind_46,JacksonDatabind_99|
|P15 unwrap a statement|wrap statements|1|Mockito_29|
|P16 remove a block|add a block|5|Lang_45,Math_73,Time_15,Cli_17,Codec_2|
