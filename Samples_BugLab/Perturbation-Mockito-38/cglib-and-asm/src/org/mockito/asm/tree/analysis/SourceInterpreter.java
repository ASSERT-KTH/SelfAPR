[buglab_swap_variables]^return new SourceValue ( insn, size ) ;^73^^^^^54^74^return new SourceValue ( size, insn ) ;^[CLASS] SourceInterpreter  [METHOD] newOperation [RETURN_TYPE] Value   AbstractInsnNode insn [VARIABLES] boolean  Object  cst  AbstractInsnNode  insn  int  size  
[buglab_swap_variables]^return new SourceValue (  insn ) ;^73^^^^^54^74^return new SourceValue ( size, insn ) ;^[CLASS] SourceInterpreter  [METHOD] newOperation [RETURN_TYPE] Value   AbstractInsnNode insn [VARIABLES] boolean  Object  cst  AbstractInsnNode  insn  int  size  
[buglab_swap_variables]^return new SourceValue ( size ) ;^73^^^^^54^74^return new SourceValue ( size, insn ) ;^[CLASS] SourceInterpreter  [METHOD] newOperation [RETURN_TYPE] Value   AbstractInsnNode insn [VARIABLES] boolean  Object  cst  AbstractInsnNode  insn  int  size  
[buglab_swap_variables]^return new SourceValue ( insn.getSize (  ) , value ) ;^77^^^^^76^78^return new SourceValue ( value.getSize (  ) , insn ) ;^[CLASS] SourceInterpreter  [METHOD] copyOperation [RETURN_TYPE] Value   AbstractInsnNode insn Value value [VARIABLES] boolean  Value  value  AbstractInsnNode  insn  
[buglab_swap_variables]^return new SourceValue ( value.getSize (  )  ) ;^77^^^^^76^78^return new SourceValue ( value.getSize (  ) , insn ) ;^[CLASS] SourceInterpreter  [METHOD] copyOperation [RETURN_TYPE] Value   AbstractInsnNode insn Value value [VARIABLES] boolean  Value  value  AbstractInsnNode  insn  
[buglab_swap_variables]^return new SourceValue ( insn, size ) ;^100^^^^^80^101^return new SourceValue ( size, insn ) ;^[CLASS] SourceInterpreter  [METHOD] unaryOperation [RETURN_TYPE] Value   AbstractInsnNode insn Value value [VARIABLES] boolean  Value  value  AbstractInsnNode  insn  int  size  
[buglab_swap_variables]^return new SourceValue (  insn ) ;^100^^^^^80^101^return new SourceValue ( size, insn ) ;^[CLASS] SourceInterpreter  [METHOD] unaryOperation [RETURN_TYPE] Value   AbstractInsnNode insn Value value [VARIABLES] boolean  Value  value  AbstractInsnNode  insn  int  size  
[buglab_swap_variables]^return new SourceValue ( size ) ;^100^^^^^80^101^return new SourceValue ( size, insn ) ;^[CLASS] SourceInterpreter  [METHOD] unaryOperation [RETURN_TYPE] Value   AbstractInsnNode insn Value value [VARIABLES] boolean  Value  value  AbstractInsnNode  insn  int  size  
[buglab_swap_variables]^return new SourceValue ( insn, size ) ;^133^^^^^107^134^return new SourceValue ( size, insn ) ;^[CLASS] SourceInterpreter  [METHOD] binaryOperation [RETURN_TYPE] Value   AbstractInsnNode insn Value value1 Value value2 [VARIABLES] boolean  Value  value1  value2  AbstractInsnNode  insn  int  size  
[buglab_swap_variables]^return new SourceValue (  insn ) ;^133^^^^^107^134^return new SourceValue ( size, insn ) ;^[CLASS] SourceInterpreter  [METHOD] binaryOperation [RETURN_TYPE] Value   AbstractInsnNode insn Value value1 Value value2 [VARIABLES] boolean  Value  value1  value2  AbstractInsnNode  insn  int  size  
[buglab_swap_variables]^return new SourceValue ( size ) ;^133^^^^^107^134^return new SourceValue ( size, insn ) ;^[CLASS] SourceInterpreter  [METHOD] binaryOperation [RETURN_TYPE] Value   AbstractInsnNode insn Value value1 Value value2 [VARIABLES] boolean  Value  value1  value2  AbstractInsnNode  insn  int  size  
[buglab_swap_variables]^return new SourceValue ( insn, size ) ;^152^^^^^145^153^return new SourceValue ( size, insn ) ;^[CLASS] SourceInterpreter  [METHOD] naryOperation [RETURN_TYPE] Value   AbstractInsnNode insn List values [VARIABLES] boolean  List  values  AbstractInsnNode  insn  int  size  
[buglab_swap_variables]^return new SourceValue (  insn ) ;^152^^^^^145^153^return new SourceValue ( size, insn ) ;^[CLASS] SourceInterpreter  [METHOD] naryOperation [RETURN_TYPE] Value   AbstractInsnNode insn List values [VARIABLES] boolean  List  values  AbstractInsnNode  insn  int  size  
[buglab_swap_variables]^return new SourceValue ( size ) ;^152^^^^^145^153^return new SourceValue ( size, insn ) ;^[CLASS] SourceInterpreter  [METHOD] naryOperation [RETURN_TYPE] Value   AbstractInsnNode insn List values [VARIABLES] boolean  List  values  AbstractInsnNode  insn  int  size  
