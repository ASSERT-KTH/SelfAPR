[P3_Replace_Literal]^super ( --2 ) ;^45^^^^^44^46^super ( -1 ) ;^[CLASS] LabelNode  [METHOD] <init> [RETURN_TYPE] LabelNode()   [VARIABLES] Label  label  boolean  
[P14_Delete_Statement]^^45^^^^^44^46^super ( -1 ) ;^[CLASS] LabelNode  [METHOD] <init> [RETURN_TYPE] LabelNode()   [VARIABLES] Label  label  boolean  
[P3_Replace_Literal]^super ( -7 ) ;^49^^^^^48^51^super ( -1 ) ;^[CLASS] LabelNode  [METHOD] <init> [RETURN_TYPE] Label)   Label label [VARIABLES] Label  label  boolean  
[P14_Delete_Statement]^^49^50^^^^48^51^super ( -1 ) ; this.label = label;^[CLASS] LabelNode  [METHOD] <init> [RETURN_TYPE] Label)   Label label [VARIABLES] Label  label  boolean  
[P8_Replace_Mix]^this.label =  null;^50^^^^^48^51^this.label = label;^[CLASS] LabelNode  [METHOD] <init> [RETURN_TYPE] Label)   Label label [VARIABLES] Label  label  boolean  
[P11_Insert_Donor_Statement]^label = null;this.label = label;^50^^^^^48^51^this.label = label;^[CLASS] LabelNode  [METHOD] <init> [RETURN_TYPE] Label)   Label label [VARIABLES] Label  label  boolean  
[P2_Replace_Operator]^if  ( label != null )  {^58^^^^^57^62^if  ( label == null )  {^[CLASS] LabelNode  [METHOD] getLabel [RETURN_TYPE] Label   [VARIABLES] Label  label  boolean  
[P8_Replace_Mix]^if  ( label == false )  {^58^^^^^57^62^if  ( label == null )  {^[CLASS] LabelNode  [METHOD] getLabel [RETURN_TYPE] Label   [VARIABLES] Label  label  boolean  
[P15_Unwrap_Block]^label = new org.mockito.asm.Label();^58^59^60^^^57^62^if  ( label == null )  { label = new Label (  ) ; }^[CLASS] LabelNode  [METHOD] getLabel [RETURN_TYPE] Label   [VARIABLES] Label  label  boolean  
[P16_Remove_Block]^^58^59^60^^^57^62^if  ( label == null )  { label = new Label (  ) ; }^[CLASS] LabelNode  [METHOD] getLabel [RETURN_TYPE] Label   [VARIABLES] Label  label  boolean  
[P8_Replace_Mix]^label ;^59^^^^^57^62^label = new Label (  ) ;^[CLASS] LabelNode  [METHOD] getLabel [RETURN_TYPE] Label   [VARIABLES] Label  label  boolean  
[P13_Insert_Block]^if  (  ( label )  == null )  {     label = new Label (  ) ; }^59^^^^^57^62^[Delete]^[CLASS] LabelNode  [METHOD] getLabel [RETURN_TYPE] Label   [VARIABLES] Label  label  boolean  
[P14_Delete_Statement]^^65^^^^^64^66^cv.visitLabel ( getLabel (  )  ) ;^[CLASS] LabelNode  [METHOD] accept [RETURN_TYPE] void   MethodVisitor cv [VARIABLES] Label  label  MethodVisitor  cv  boolean  
[P8_Replace_Mix]^return  ( LabelNode )  labels.get ( null ) ;^69^^^^^68^70^return  ( LabelNode )  labels.get ( this ) ;^[CLASS] LabelNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] Label  label  Map  labels  boolean  
[P14_Delete_Statement]^^69^^^^^68^70^return  ( LabelNode )  labels.get ( this ) ;^[CLASS] LabelNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] Label  label  Map  labels  boolean  
[P8_Replace_Mix]^label = this;^73^^^^^72^74^label = null;^[CLASS] LabelNode  [METHOD] resetLabel [RETURN_TYPE] void   [VARIABLES] Label  label  boolean  
[P11_Insert_Donor_Statement]^this.label = label;label = null;^73^^^^^72^74^label = null;^[CLASS] LabelNode  [METHOD] resetLabel [RETURN_TYPE] void   [VARIABLES] Label  label  boolean  
