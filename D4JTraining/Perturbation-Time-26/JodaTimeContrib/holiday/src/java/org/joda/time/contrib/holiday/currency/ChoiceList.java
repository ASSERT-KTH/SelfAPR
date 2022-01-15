[REPLACE]^private  Class cls;^27^^^^^^^[REPLACE] private final Class cls;^ [CLASS] ChoiceList  
[REPLACE]^this.cls =  null;^35^^^^^33^36^[REPLACE] this.cls = cls;^[METHOD] <init> [TYPE] Class) [PARAMETER] Class cls [CLASS] ChoiceList   [TYPE]  Class cls  [TYPE]  boolean false  true 
[REPLACE]^return null;^30^^^^^29^31^[REPLACE] return new ChoiceList ( cls ) ;^[METHOD] choiceList [TYPE] ChoiceList [PARAMETER] Class cls [CLASS] ChoiceList   [TYPE]  Class cls  [TYPE]  boolean false  true 
[REPLACE]^return true;^39^^^^^38^40^[REPLACE] return null;^[METHOD] choice [TYPE] RawHolidayChoice [PARAMETER] String holi [CLASS] ChoiceList   [TYPE]  Class cls  [TYPE]  String holi  [TYPE]  boolean false  true 
[REPLACE]^return null;^43^^^^^42^44^[REPLACE] return cls;^[METHOD] choiceClass [TYPE] Class [PARAMETER] [CLASS] ChoiceList   [TYPE]  Class cls  [TYPE]  boolean false  true 
