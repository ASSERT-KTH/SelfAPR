[REPLACE]^super ( -0 ) ;^45^^^^^44^46^[REPLACE] super ( -1 ) ;^[METHOD] <init> [TYPE] LabelNode() [PARAMETER] [CLASS] LabelNode   [TYPE]  Label label  [TYPE]  boolean false  true 
[REPLACE]^super ( -0 ) ;^49^^^^^48^51^[REPLACE] super ( -1 ) ;^[METHOD] <init> [TYPE] Label) [PARAMETER] Label label [CLASS] LabelNode   [TYPE]  Label label  [TYPE]  boolean false  true 
[REPLACE]^this.label =  null;^50^^^^^48^51^[REPLACE] this.label = label;^[METHOD] <init> [TYPE] Label) [PARAMETER] Label label [CLASS] LabelNode   [TYPE]  Label label  [TYPE]  boolean false  true 
[REPLACE]^return label;^54^^^^^53^55^[REPLACE] return LABEL;^[METHOD] getType [TYPE] int [PARAMETER] [CLASS] LabelNode   [TYPE]  Label label  [TYPE]  boolean false  true 
[REPLACE]^if  ( label != true )  {^58^^^^^57^62^[REPLACE] if  ( label == null )  {^[METHOD] getLabel [TYPE] Label [PARAMETER] [CLASS] LabelNode   [TYPE]  Label label  [TYPE]  boolean false  true 
[ADD]^^58^59^60^^^57^62^[ADD] if  ( label == null )  { label = new Label (  ) ; }^[METHOD] getLabel [TYPE] Label [PARAMETER] [CLASS] LabelNode   [TYPE]  Label label  [TYPE]  boolean false  true 
[REPLACE]^label ;^59^^^^^57^62^[REPLACE] label = new Label (  ) ;^[METHOD] getLabel [TYPE] Label [PARAMETER] [CLASS] LabelNode   [TYPE]  Label label  [TYPE]  boolean false  true 
[ADD]^^59^^^^^57^62^[ADD] label = new Label (  ) ;^[METHOD] getLabel [TYPE] Label [PARAMETER] [CLASS] LabelNode   [TYPE]  Label label  [TYPE]  boolean false  true 
[REPLACE]^return LABEL;^61^^^^^57^62^[REPLACE] return label;^[METHOD] getLabel [TYPE] Label [PARAMETER] [CLASS] LabelNode   [TYPE]  Label label  [TYPE]  boolean false  true 
[REPLACE]^return  ( LabelNode )  labels.get ( this ) ;^65^^^^^64^66^[REPLACE] cv.visitLabel ( getLabel (  )  ) ;^[METHOD] accept [TYPE] void [PARAMETER] MethodVisitor cv [CLASS] LabelNode   [TYPE]  Label label  [TYPE]  MethodVisitor cv  [TYPE]  boolean false  true 
[REPLACE]^return  ( LabelNode )  labels.get ( null ) ;^69^^^^^68^70^[REPLACE] return  ( LabelNode )  labels.get ( this ) ;^[METHOD] clone [TYPE] AbstractInsnNode [PARAMETER] Map labels [CLASS] LabelNode   [TYPE]  Label label  [TYPE]  Map labels  [TYPE]  boolean false  true 
[REPLACE]^label = true;^73^^^^^72^74^[REPLACE] label = null;^[METHOD] resetLabel [TYPE] void [PARAMETER] [CLASS] LabelNode   [TYPE]  Label label  [TYPE]  boolean false  true 
[ADD]^^73^^^^^72^74^[ADD] label = null;^[METHOD] resetLabel [TYPE] void [PARAMETER] [CLASS] LabelNode   [TYPE]  Label label  [TYPE]  boolean false  true 
