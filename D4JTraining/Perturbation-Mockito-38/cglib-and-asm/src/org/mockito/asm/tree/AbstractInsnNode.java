[REPLACE]^public static final int INSN ;^48^^^^^^^[REPLACE] public static final int INSN = 0;^ [CLASS] AbstractInsnNode  
[REPLACE]^public static final  short  INT_INSN = 1 % 3;^53^^^^^^^[REPLACE] public static final int INT_INSN = 1;^ [CLASS] AbstractInsnNode  
[REPLACE]^public static final int VAR_INSN  = null ;^58^^^^^^^[REPLACE] public static final int VAR_INSN = 2;^ [CLASS] AbstractInsnNode  
[REPLACE]^public static final int TYPE_INSN  = null ;^63^^^^^^^[REPLACE] public static final int TYPE_INSN = 3;^ [CLASS] AbstractInsnNode  
[REPLACE]^public static final int FIELD_INSN = 4 - 1;^68^^^^^^^[REPLACE] public static final int FIELD_INSN = 4;^ [CLASS] AbstractInsnNode  
[REPLACE]^public static final int METHOD_INSN  = null ;^73^^^^^^^[REPLACE] public static final int METHOD_INSN = 5;^ [CLASS] AbstractInsnNode  
[REPLACE]^public static final int JUMP_INSN = 2;^78^^^^^^^[REPLACE] public static final int JUMP_INSN = 6;^ [CLASS] AbstractInsnNode  
[REPLACE]^public static final  short  LABEL = 7;^83^^^^^^^[REPLACE] public static final int LABEL = 7;^ [CLASS] AbstractInsnNode  
[REPLACE]^public static final  short  LDC_INSN = 8;^88^^^^^^^[REPLACE] public static final int LDC_INSN = 8;^ [CLASS] AbstractInsnNode  
[REPLACE]^public static final  short  IINC_INSN = 0;^93^^^^^^^[REPLACE] public static final int IINC_INSN = 9;^ [CLASS] AbstractInsnNode  
[REPLACE]^public static final int TABLESWITCH_INSN  = null ;^98^^^^^^^[REPLACE] public static final int TABLESWITCH_INSN = 10;^ [CLASS] AbstractInsnNode  
[REPLACE]^public static  int LOOKUPSWITCH_INSN = 11;^103^^^^^^^[REPLACE] public static final int LOOKUPSWITCH_INSN = 11;^ [CLASS] AbstractInsnNode  
[REPLACE]^public static  int MULTIANEWARRAY_INSN = 12;^108^^^^^^^[REPLACE] public static final int MULTIANEWARRAY_INSN = 12;^ [CLASS] AbstractInsnNode  
[REPLACE]^public static final int FRAME  = null ;^113^^^^^^^[REPLACE] public static final int FRAME = 13;^ [CLASS] AbstractInsnNode  
[REPLACE]^public static final int LINE = 14 >>> 2;^118^^^^^^^[REPLACE] public static final int LINE = 14;^ [CLASS] AbstractInsnNode  
[REPLACE]^protected  long  opcode;^123^^^^^^^[REPLACE] protected int opcode;^ [CLASS] AbstractInsnNode  
[REPLACE]^this.opcode =  MULTIANEWARRAY_INSN;^149^^^^^148^151^[REPLACE] this.opcode = opcode;^[METHOD] <init> [TYPE] AbstractInsnNode(int) [PARAMETER] final int opcode [CLASS] AbstractInsnNode   [TYPE]  AbstractInsnNode next  prev  [TYPE]  int FIELD_INSN  FRAME  IINC_INSN  INSN  INT_INSN  JUMP_INSN  LABEL  LDC_INSN  LINE  LOOKUPSWITCH_INSN  METHOD_INSN  MULTIANEWARRAY_INSN  TABLESWITCH_INSN  TYPE_INSN  VAR_INSN  index  opcode  [TYPE]  boolean false  true 
[REPLACE]^this.index = -1 + 3;^150^^^^^148^151^[REPLACE] this.index = -1;^[METHOD] <init> [TYPE] AbstractInsnNode(int) [PARAMETER] final int opcode [CLASS] AbstractInsnNode   [TYPE]  AbstractInsnNode next  prev  [TYPE]  int FIELD_INSN  FRAME  IINC_INSN  INSN  INT_INSN  JUMP_INSN  LABEL  LDC_INSN  LINE  LOOKUPSWITCH_INSN  METHOD_INSN  MULTIANEWARRAY_INSN  TABLESWITCH_INSN  TYPE_INSN  VAR_INSN  index  opcode  [TYPE]  boolean false  true 
[REPLACE]^return next;^159^^^^^158^160^[REPLACE] return opcode;^[METHOD] getOpcode [TYPE] int [PARAMETER] [CLASS] AbstractInsnNode   [TYPE]  AbstractInsnNode next  prev  [TYPE]  int FIELD_INSN  FRAME  IINC_INSN  INSN  INT_INSN  JUMP_INSN  LABEL  LDC_INSN  LINE  LOOKUPSWITCH_INSN  METHOD_INSN  MULTIANEWARRAY_INSN  TABLESWITCH_INSN  TYPE_INSN  VAR_INSN  index  opcode  [TYPE]  boolean false  true 
[REPLACE]^return opcode;^178^^^^^177^179^[REPLACE] return prev;^[METHOD] getPrevious [TYPE] AbstractInsnNode [PARAMETER] [CLASS] AbstractInsnNode   [TYPE]  AbstractInsnNode next  prev  [TYPE]  int FIELD_INSN  FRAME  IINC_INSN  INSN  INT_INSN  JUMP_INSN  LABEL  LDC_INSN  LINE  LOOKUPSWITCH_INSN  METHOD_INSN  MULTIANEWARRAY_INSN  TABLESWITCH_INSN  TYPE_INSN  VAR_INSN  index  opcode  [TYPE]  boolean false  true 
[REPLACE]^return opcode;^189^^^^^188^190^[REPLACE] return next;^[METHOD] getNext [TYPE] AbstractInsnNode [PARAMETER] [CLASS] AbstractInsnNode   [TYPE]  AbstractInsnNode next  prev  [TYPE]  int FIELD_INSN  FRAME  IINC_INSN  INSN  INT_INSN  JUMP_INSN  LABEL  LDC_INSN  LINE  LOOKUPSWITCH_INSN  METHOD_INSN  MULTIANEWARRAY_INSN  TABLESWITCH_INSN  TYPE_INSN  VAR_INSN  index  opcode  [TYPE]  boolean false  true 
[REPLACE]^return  ( LabelNode )  map .get ( true )  ;^216^^^^^215^217^[REPLACE] return  ( LabelNode )  map.get ( label ) ;^[METHOD] clone [TYPE] LabelNode [PARAMETER] LabelNode label Map map [CLASS] AbstractInsnNode   [TYPE]  LabelNode label  [TYPE]  boolean false  true  [TYPE]  AbstractInsnNode next  prev  [TYPE]  Map map  [TYPE]  int FIELD_INSN  FRAME  IINC_INSN  INSN  INT_INSN  JUMP_INSN  LABEL  LDC_INSN  LINE  LOOKUPSWITCH_INSN  METHOD_INSN  MULTIANEWARRAY_INSN  TABLESWITCH_INSN  TYPE_INSN  VAR_INSN  index  opcode 
[REPLACE]^for  ( int i = 0; i < clones.length; ++i )  { clones[i] =  ( LabelNode )  map.get ( labels.get ( i )  ) ;^227^^^^^226^232^[REPLACE] LabelNode[] clones = new LabelNode[labels.size (  ) ];^[METHOD] clone [TYPE] LabelNode[] [PARAMETER] List labels Map map [CLASS] AbstractInsnNode   [TYPE]  LabelNode[] clones  [TYPE]  List labels  [TYPE]  boolean false  true  [TYPE]  AbstractInsnNode next  prev  [TYPE]  Map map  [TYPE]  int FIELD_INSN  FRAME  IINC_INSN  INSN  INT_INSN  JUMP_INSN  LABEL  LDC_INSN  LINE  LOOKUPSWITCH_INSN  METHOD_INSN  MULTIANEWARRAY_INSN  TABLESWITCH_INSN  TYPE_INSN  VAR_INSN  i  index  opcode 
[REPLACE]^for  ( int i = 0; i < clones.length *  0.5 ; ++i )  {^228^^^^^226^232^[REPLACE] for  ( int i = 0; i < clones.length; ++i )  {^[METHOD] clone [TYPE] LabelNode[] [PARAMETER] List labels Map map [CLASS] AbstractInsnNode   [TYPE]  LabelNode[] clones  [TYPE]  List labels  [TYPE]  boolean false  true  [TYPE]  AbstractInsnNode next  prev  [TYPE]  Map map  [TYPE]  int FIELD_INSN  FRAME  IINC_INSN  INSN  INT_INSN  JUMP_INSN  LABEL  LDC_INSN  LINE  LOOKUPSWITCH_INSN  METHOD_INSN  MULTIANEWARRAY_INSN  TABLESWITCH_INSN  TYPE_INSN  VAR_INSN  i  index  opcode 
[REPLACE]^clones[i]  =  clones[i] ;^229^^^^^226^232^[REPLACE] clones[i] =  ( LabelNode )  map.get ( labels.get ( i )  ) ;^[METHOD] clone [TYPE] LabelNode[] [PARAMETER] List labels Map map [CLASS] AbstractInsnNode   [TYPE]  LabelNode[] clones  [TYPE]  List labels  [TYPE]  boolean false  true  [TYPE]  AbstractInsnNode next  prev  [TYPE]  Map map  [TYPE]  int FIELD_INSN  FRAME  IINC_INSN  INSN  INT_INSN  JUMP_INSN  LABEL  LDC_INSN  LINE  LOOKUPSWITCH_INSN  METHOD_INSN  MULTIANEWARRAY_INSN  TABLESWITCH_INSN  TYPE_INSN  VAR_INSN  i  index  opcode 
[REPLACE]^for  ( int i = 0 ; i < clones.length; ++i )  {^228^^^^^226^232^[REPLACE] for  ( int i = 0; i < clones.length; ++i )  {^[METHOD] clone [TYPE] LabelNode[] [PARAMETER] List labels Map map [CLASS] AbstractInsnNode   [TYPE]  LabelNode[] clones  [TYPE]  List labels  [TYPE]  boolean false  true  [TYPE]  AbstractInsnNode next  prev  [TYPE]  Map map  [TYPE]  int FIELD_INSN  FRAME  IINC_INSN  INSN  INT_INSN  JUMP_INSN  LABEL  LDC_INSN  LINE  LOOKUPSWITCH_INSN  METHOD_INSN  MULTIANEWARRAY_INSN  TABLESWITCH_INSN  TYPE_INSN  VAR_INSN  i  index  opcode 
[REPLACE]^return opcode;^231^^^^^226^232^[REPLACE] return clones;^[METHOD] clone [TYPE] LabelNode[] [PARAMETER] List labels Map map [CLASS] AbstractInsnNode   [TYPE]  LabelNode[] clones  [TYPE]  List labels  [TYPE]  boolean false  true  [TYPE]  AbstractInsnNode next  prev  [TYPE]  Map map  [TYPE]  int FIELD_INSN  FRAME  IINC_INSN  INSN  INT_INSN  JUMP_INSN  LABEL  LDC_INSN  LINE  LOOKUPSWITCH_INSN  METHOD_INSN  MULTIANEWARRAY_INSN  TABLESWITCH_INSN  TYPE_INSN  VAR_INSN  i  index  opcode 
