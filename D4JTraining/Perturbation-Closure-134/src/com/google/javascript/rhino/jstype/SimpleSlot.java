[REPLACE]^final  char  name;^48^^^^^^^[REPLACE] final String name;^ [CLASS] SimpleSlot  
[REPLACE]^JSType type;^49^^^^^^^[REPLACE] final JSType type;^ [CLASS] SimpleSlot  
[REPLACE]^this.name =  null;^53^^^^^52^56^[REPLACE] this.name = name;^[METHOD] <init> [TYPE] JSType,boolean) [PARAMETER] String name JSType type boolean inferred [CLASS] SimpleSlot   [TYPE]  JSType type  [TYPE]  boolean false  inferred  true  [TYPE]  String name 
[ADD]^^53^^^^^52^56^[ADD] this.name = name;^[METHOD] <init> [TYPE] JSType,boolean) [PARAMETER] String name JSType type boolean inferred [CLASS] SimpleSlot   [TYPE]  JSType type  [TYPE]  boolean false  inferred  true  [TYPE]  String name 
[REPLACE]^this.type =  null;^54^^^^^52^56^[REPLACE] this.type = type;^[METHOD] <init> [TYPE] JSType,boolean) [PARAMETER] String name JSType type boolean inferred [CLASS] SimpleSlot   [TYPE]  JSType type  [TYPE]  boolean false  inferred  true  [TYPE]  String name 
[REPLACE]^this.inferred =  true;^55^^^^^52^56^[REPLACE] this.inferred = inferred;^[METHOD] <init> [TYPE] JSType,boolean) [PARAMETER] String name JSType type boolean inferred [CLASS] SimpleSlot   [TYPE]  JSType type  [TYPE]  boolean false  inferred  true  [TYPE]  String name 
[ADD]^^55^^^^^52^56^[ADD] this.inferred = inferred;^[METHOD] <init> [TYPE] JSType,boolean) [PARAMETER] String name JSType type boolean inferred [CLASS] SimpleSlot   [TYPE]  JSType type  [TYPE]  boolean false  inferred  true  [TYPE]  String name 
[REPLACE]^return inferred;^59^^^^^58^60^[REPLACE] return name;^[METHOD] getName [TYPE] String [PARAMETER] [CLASS] SimpleSlot   [TYPE]  JSType type  [TYPE]  boolean false  inferred  true  [TYPE]  String name 
[REPLACE]^return inferred;^63^^^^^62^64^[REPLACE] return type;^[METHOD] getType [TYPE] JSType [PARAMETER] [CLASS] SimpleSlot   [TYPE]  JSType type  [TYPE]  boolean false  inferred  true  [TYPE]  String name 
[REPLACE]^return name;^67^^^^^66^68^[REPLACE] return inferred;^[METHOD] isTypeInferred [TYPE] boolean [PARAMETER] [CLASS] SimpleSlot   [TYPE]  JSType type  [TYPE]  boolean false  inferred  true  [TYPE]  String name 
