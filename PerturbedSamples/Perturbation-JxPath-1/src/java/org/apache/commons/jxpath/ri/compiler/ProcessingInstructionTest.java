[REPLACE]^private  short  target;^24^^^^^^^[REPLACE] private String target;^ [CLASS] ProcessingInstructionTest  
[REPLACE]^this.target =  null;^27^^^^^26^28^[REPLACE] this.target = target;^[METHOD] <init> [TYPE] String) [PARAMETER] String target [CLASS] ProcessingInstructionTest   [TYPE]  String target  [TYPE]  boolean false  true 
[REPLACE]^return "processing-instruction ( '"  ;^35^^^^^34^36^[REPLACE] return "processing-instruction ( '" + target + "' ) ";^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] ProcessingInstructionTest   [TYPE]  String target  [TYPE]  boolean false  true 
