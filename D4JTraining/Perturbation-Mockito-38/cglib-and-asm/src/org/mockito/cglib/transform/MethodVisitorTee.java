[REPLACE]^private  MethodVisitor mv1;^21^^^^^^^[REPLACE] private final MethodVisitor mv1;^ [CLASS] MethodVisitorTee  
[REPLACE]^this.mv2 = mv2; ;^25^^^^^24^27^[REPLACE] this.mv1 = mv1;^[METHOD] <init> [TYPE] MethodVisitor) [PARAMETER] MethodVisitor mv1 MethodVisitor mv2 [CLASS] MethodVisitorTee   [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^this.mv1 = mv1; ;^26^^^^^24^27^[REPLACE] this.mv2 = mv2;^[METHOD] <init> [TYPE] MethodVisitor) [PARAMETER] MethodVisitor mv1 MethodVisitor mv2 [CLASS] MethodVisitorTee   [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^mv1.visitFrame ( type, nStack, local, nStack, stack ) ;^30^^^^^29^32^[REPLACE] mv1.visitFrame ( type, nLocal, local, nStack, stack ) ;^[METHOD] visitFrame [TYPE] void [PARAMETER] int type int nLocal Object[] local int nStack Object[] stack [CLASS] MethodVisitorTee   [TYPE]  boolean false  true  [TYPE]  int nLocal  nStack  type  [TYPE]  Object[] local  stack  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv2.visitFrame ( type, nLocal, local, type, stack ) ;^31^^^^^29^32^[REPLACE] mv2.visitFrame ( type, nLocal, local, nStack, stack ) ;^[METHOD] visitFrame [TYPE] void [PARAMETER] int type int nLocal Object[] local int nStack Object[] stack [CLASS] MethodVisitorTee   [TYPE]  boolean false  true  [TYPE]  int nLocal  nStack  type  [TYPE]  Object[] local  stack  [TYPE]  MethodVisitor mv1  mv2 
[ADD]^^31^^^^^29^32^[ADD] mv2.visitFrame ( type, nLocal, local, nStack, stack ) ;^[METHOD] visitFrame [TYPE] void [PARAMETER] int type int nLocal Object[] local int nStack Object[] stack [CLASS] MethodVisitorTee   [TYPE]  boolean false  true  [TYPE]  int nLocal  nStack  type  [TYPE]  Object[] local  stack  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^return AnnotationVisitorTee.getInstance ( mv1.visitCode (  ) , mv2.visitAnnotationDefault (  )  ) ;^35^36^^^^34^37^[REPLACE] return AnnotationVisitorTee.getInstance ( mv1.visitAnnotationDefault (  ) , mv2.visitAnnotationDefault (  )  ) ;^[METHOD] visitAnnotationDefault [TYPE] AnnotationVisitor [PARAMETER] [CLASS] MethodVisitorTee   [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^return   mv1.visitAnnotation ( desc, visible )   ) ;^40^41^^^^39^42^[REPLACE] return AnnotationVisitorTee.getInstance ( mv1.visitAnnotation ( desc, visible ) , mv2.visitAnnotation ( desc, visible )  ) ;^[METHOD] visitAnnotation [TYPE] AnnotationVisitor [PARAMETER] String desc boolean visible [CLASS] MethodVisitorTee   [TYPE]  MethodVisitor mv1  mv2  [TYPE]  String desc  [TYPE]  boolean false  true  visible 
[REPLACE]^return   mv1.visitParameterAnnotation ( parameter, desc, visible )   ) ;^47^48^^^^44^49^[REPLACE] return AnnotationVisitorTee.getInstance ( mv1.visitParameterAnnotation ( parameter, desc, visible ) , mv2.visitParameterAnnotation ( parameter, desc, visible )  ) ;^[METHOD] visitParameterAnnotation [TYPE] AnnotationVisitor [PARAMETER] int parameter String desc boolean visible [CLASS] MethodVisitorTee   [TYPE]  String desc  [TYPE]  boolean false  true  visible  [TYPE]  int parameter  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv1.visitLabel ( attr ) ;^52^^^^^51^54^[REPLACE] mv1.visitAttribute ( attr ) ;^[METHOD] visitAttribute [TYPE] void [PARAMETER] Attribute attr [CLASS] MethodVisitorTee   [TYPE]  Attribute attr  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^mv2.visitLabel ( attr ) ;^53^^^^^51^54^[REPLACE] mv2.visitAttribute ( attr ) ;^[METHOD] visitAttribute [TYPE] void [PARAMETER] Attribute attr [CLASS] MethodVisitorTee   [TYPE]  Attribute attr  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^mv1.visitEnd (  ) ;^57^^^^^56^59^[REPLACE] mv1.visitCode (  ) ;^[METHOD] visitCode [TYPE] void [PARAMETER] [CLASS] MethodVisitorTee   [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^mv2.visitEnd (  ) ;^58^^^^^56^59^[REPLACE] mv2.visitCode (  ) ;^[METHOD] visitCode [TYPE] void [PARAMETER] [CLASS] MethodVisitorTee   [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^mv1.visitLdcInsn ( opcode ) ;^62^^^^^61^64^[REPLACE] mv1.visitInsn ( opcode ) ;^[METHOD] visitInsn [TYPE] void [PARAMETER] int opcode [CLASS] MethodVisitorTee   [TYPE]  int opcode  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^mv2.visitLdcInsn ( opcode ) ;^63^^^^^61^64^[REPLACE] mv2.visitInsn ( opcode ) ;^[METHOD] visitInsn [TYPE] void [PARAMETER] int opcode [CLASS] MethodVisitorTee   [TYPE]  int opcode  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REMOVE]^mv2.visitIincInsn ( var, increment ) ;^63^^^^^61^64^[REMOVE] ^[METHOD] visitInsn [TYPE] void [PARAMETER] int opcode [CLASS] MethodVisitorTee   [TYPE]  int opcode  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^mv1.visitIincInsn ( opcode, operand ) ;^67^^^^^66^69^[REPLACE] mv1.visitIntInsn ( opcode, operand ) ;^[METHOD] visitIntInsn [TYPE] void [PARAMETER] int opcode int operand [CLASS] MethodVisitorTee   [TYPE]  int opcode  operand  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^mv2.visitIincInsn ( opcode, operand ) ;^68^^^^^66^69^[REPLACE] mv2.visitIntInsn ( opcode, operand ) ;^[METHOD] visitIntInsn [TYPE] void [PARAMETER] int opcode int operand [CLASS] MethodVisitorTee   [TYPE]  int opcode  operand  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^mv2.visitVarInsn ( opcode, var ) ;^72^^^^^71^74^[REPLACE] mv1.visitVarInsn ( opcode, var ) ;^[METHOD] visitVarInsn [TYPE] void [PARAMETER] int opcode int var [CLASS] MethodVisitorTee   [TYPE]  int opcode  var  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^mv2.visitIntInsn ( opcode, var ) ;^73^^^^^71^74^[REPLACE] mv2.visitVarInsn ( opcode, var ) ;^[METHOD] visitVarInsn [TYPE] void [PARAMETER] int opcode int var [CLASS] MethodVisitorTee   [TYPE]  int opcode  var  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^mv2.visitTypeInsn ( opcode, desc ) ;^77^^^^^76^79^[REPLACE] mv1.visitTypeInsn ( opcode, desc ) ;^[METHOD] visitTypeInsn [TYPE] void [PARAMETER] int opcode String desc [CLASS] MethodVisitorTee   [TYPE]  String desc  [TYPE]  boolean false  true  [TYPE]  int opcode  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv2.visitMultiANewArrayInsn ( opcode, desc ) ;^78^^^^^76^79^[REPLACE] mv2.visitTypeInsn ( opcode, desc ) ;^[METHOD] visitTypeInsn [TYPE] void [PARAMETER] int opcode String desc [CLASS] MethodVisitorTee   [TYPE]  String desc  [TYPE]  boolean false  true  [TYPE]  int opcode  [TYPE]  MethodVisitor mv1  mv2 
[ADD]^^78^^^^^76^79^[ADD] mv2.visitTypeInsn ( opcode, desc ) ;^[METHOD] visitTypeInsn [TYPE] void [PARAMETER] int opcode String desc [CLASS] MethodVisitorTee   [TYPE]  String desc  [TYPE]  boolean false  true  [TYPE]  int opcode  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv1.visitFieldInsn ( opcode, name, name, desc ) ;^82^^^^^81^84^[REPLACE] mv1.visitFieldInsn ( opcode, owner, name, desc ) ;^[METHOD] visitFieldInsn [TYPE] void [PARAMETER] int opcode String owner String name String desc [CLASS] MethodVisitorTee   [TYPE]  String desc  name  owner  [TYPE]  boolean false  true  [TYPE]  int opcode  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv2.visitMethodInsn ( opcode, name, name, desc ) ;^83^^^^^81^84^[REPLACE] mv2.visitFieldInsn ( opcode, owner, name, desc ) ;^[METHOD] visitFieldInsn [TYPE] void [PARAMETER] int opcode String owner String name String desc [CLASS] MethodVisitorTee   [TYPE]  String desc  name  owner  [TYPE]  boolean false  true  [TYPE]  int opcode  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv1.visitFieldInsn ( opcode, owner, name, desc ) ;^87^^^^^86^89^[REPLACE] mv1.visitMethodInsn ( opcode, owner, name, desc ) ;^[METHOD] visitMethodInsn [TYPE] void [PARAMETER] int opcode String owner String name String desc [CLASS] MethodVisitorTee   [TYPE]  String desc  name  owner  [TYPE]  boolean false  true  [TYPE]  int opcode  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv2.visitFieldInsn ( opcode, owner, name, desc ) ;^88^^^^^86^89^[REPLACE] mv2.visitMethodInsn ( opcode, owner, name, desc ) ;^[METHOD] visitMethodInsn [TYPE] void [PARAMETER] int opcode String owner String name String desc [CLASS] MethodVisitorTee   [TYPE]  String desc  name  owner  [TYPE]  boolean false  true  [TYPE]  int opcode  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv1.visitLineNumber ( opcode, label ) ;^92^^^^^91^94^[REPLACE] mv1.visitJumpInsn ( opcode, label ) ;^[METHOD] visitJumpInsn [TYPE] void [PARAMETER] int opcode Label label [CLASS] MethodVisitorTee   [TYPE]  Label label  [TYPE]  boolean false  true  [TYPE]  int opcode  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv2.visitLineNumber ( opcode, label ) ;^93^^^^^91^94^[REPLACE] mv2.visitJumpInsn ( opcode, label ) ;^[METHOD] visitJumpInsn [TYPE] void [PARAMETER] int opcode Label label [CLASS] MethodVisitorTee   [TYPE]  Label label  [TYPE]  boolean false  true  [TYPE]  int opcode  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv1.visitAttribute ( label ) ;^97^^^^^96^99^[REPLACE] mv1.visitLabel ( label ) ;^[METHOD] visitLabel [TYPE] void [PARAMETER] Label label [CLASS] MethodVisitorTee   [TYPE]  Label label  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^mv2 .visitFrame ( null , this , null , null , this )  ;^98^^^^^96^99^[REPLACE] mv2.visitLabel ( label ) ;^[METHOD] visitLabel [TYPE] void [PARAMETER] Label label [CLASS] MethodVisitorTee   [TYPE]  Label label  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[ADD]^^98^^^^^96^99^[ADD] mv2.visitLabel ( label ) ;^[METHOD] visitLabel [TYPE] void [PARAMETER] Label label [CLASS] MethodVisitorTee   [TYPE]  Label label  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^mv1 .visitIincInsn ( this , this )  ;^102^^^^^101^104^[REPLACE] mv1.visitLdcInsn ( cst ) ;^[METHOD] visitLdcInsn [TYPE] void [PARAMETER] Object cst [CLASS] MethodVisitorTee   [TYPE]  Object cst  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^mv2.visitInsn ( cst ) ;^103^^^^^101^104^[REPLACE] mv2.visitLdcInsn ( cst ) ;^[METHOD] visitLdcInsn [TYPE] void [PARAMETER] Object cst [CLASS] MethodVisitorTee   [TYPE]  Object cst  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[ADD]^^103^^^^^101^104^[ADD] mv2.visitLdcInsn ( cst ) ;^[METHOD] visitLdcInsn [TYPE] void [PARAMETER] Object cst [CLASS] MethodVisitorTee   [TYPE]  Object cst  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^mv1.visitIntInsn ( var, increment ) ;^107^^^^^106^109^[REPLACE] mv1.visitIincInsn ( var, increment ) ;^[METHOD] visitIincInsn [TYPE] void [PARAMETER] int var int increment [CLASS] MethodVisitorTee   [TYPE]  int increment  var  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[ADD]^^107^^^^^106^109^[ADD] mv1.visitIincInsn ( var, increment ) ;^[METHOD] visitIincInsn [TYPE] void [PARAMETER] int var int increment [CLASS] MethodVisitorTee   [TYPE]  int increment  var  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^mv2 .visitIntInsn ( var , increment )  ;^108^^^^^106^109^[REPLACE] mv2.visitIincInsn ( var, increment ) ;^[METHOD] visitIincInsn [TYPE] void [PARAMETER] int var int increment [CLASS] MethodVisitorTee   [TYPE]  int increment  var  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^mv1 .visitLookupSwitchInsn ( dflt , false , labels )  ;^112^^^^^111^114^[REPLACE] mv1.visitTableSwitchInsn ( min, max, dflt, labels ) ;^[METHOD] visitTableSwitchInsn [TYPE] void [PARAMETER] int min int max Label dflt Label[] labels [CLASS] MethodVisitorTee   [TYPE]  Label dflt  [TYPE]  Label[] labels  [TYPE]  boolean false  true  [TYPE]  int max  min  [TYPE]  MethodVisitor mv1  mv2 
[ADD]^^112^^^^^111^114^[ADD] mv1.visitTableSwitchInsn ( min, max, dflt, labels ) ;^[METHOD] visitTableSwitchInsn [TYPE] void [PARAMETER] int min int max Label dflt Label[] labels [CLASS] MethodVisitorTee   [TYPE]  Label dflt  [TYPE]  Label[] labels  [TYPE]  boolean false  true  [TYPE]  int max  min  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv2.visitTryCatchBlock ( min, max, dflt, labels ) ;^113^^^^^111^114^[REPLACE] mv2.visitTableSwitchInsn ( min, max, dflt, labels ) ;^[METHOD] visitTableSwitchInsn [TYPE] void [PARAMETER] int min int max Label dflt Label[] labels [CLASS] MethodVisitorTee   [TYPE]  Label dflt  [TYPE]  Label[] labels  [TYPE]  boolean false  true  [TYPE]  int max  min  [TYPE]  MethodVisitor mv1  mv2 
[ADD]^^113^^^^^111^114^[ADD] mv2.visitTableSwitchInsn ( min, max, dflt, labels ) ;^[METHOD] visitTableSwitchInsn [TYPE] void [PARAMETER] int min int max Label dflt Label[] labels [CLASS] MethodVisitorTee   [TYPE]  Label dflt  [TYPE]  Label[] labels  [TYPE]  boolean false  true  [TYPE]  int max  min  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv1.visitParameterAnnotation ( dflt, keys, labels ) ;^117^^^^^116^119^[REPLACE] mv1.visitLookupSwitchInsn ( dflt, keys, labels ) ;^[METHOD] visitLookupSwitchInsn [TYPE] void [PARAMETER] Label dflt int[] keys Label[] labels [CLASS] MethodVisitorTee   [TYPE]  Label dflt  [TYPE]  int[] keys  [TYPE]  Label[] labels  [TYPE]  boolean false  true  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv2.visitParameterAnnotation ( dflt, keys, labels ) ;^118^^^^^116^119^[REPLACE] mv2.visitLookupSwitchInsn ( dflt, keys, labels ) ;^[METHOD] visitLookupSwitchInsn [TYPE] void [PARAMETER] Label dflt int[] keys Label[] labels [CLASS] MethodVisitorTee   [TYPE]  Label dflt  [TYPE]  int[] keys  [TYPE]  Label[] labels  [TYPE]  boolean false  true  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv1.visitAnnotation ( desc, dims ) ;^122^^^^^121^124^[REPLACE] mv1.visitMultiANewArrayInsn ( desc, dims ) ;^[METHOD] visitMultiANewArrayInsn [TYPE] void [PARAMETER] String desc int dims [CLASS] MethodVisitorTee   [TYPE]  String desc  [TYPE]  boolean false  true  [TYPE]  int dims  [TYPE]  MethodVisitor mv1  mv2 
[ADD]^mv2.visitMultiANewArrayInsn ( desc, dims ) ;^122^123^^^^121^124^[ADD] mv1.visitMultiANewArrayInsn ( desc, dims ) ; mv2.visitMultiANewArrayInsn ( desc, dims ) ;^[METHOD] visitMultiANewArrayInsn [TYPE] void [PARAMETER] String desc int dims [CLASS] MethodVisitorTee   [TYPE]  String desc  [TYPE]  boolean false  true  [TYPE]  int dims  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv2.visitAnnotation ( desc, dims ) ;^123^^^^^121^124^[REPLACE] mv2.visitMultiANewArrayInsn ( desc, dims ) ;^[METHOD] visitMultiANewArrayInsn [TYPE] void [PARAMETER] String desc int dims [CLASS] MethodVisitorTee   [TYPE]  String desc  [TYPE]  boolean false  true  [TYPE]  int dims  [TYPE]  MethodVisitor mv1  mv2 
[ADD]^^123^^^^^121^124^[ADD] mv2.visitMultiANewArrayInsn ( desc, dims ) ;^[METHOD] visitMultiANewArrayInsn [TYPE] void [PARAMETER] String desc int dims [CLASS] MethodVisitorTee   [TYPE]  String desc  [TYPE]  boolean false  true  [TYPE]  int dims  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv1.visitTableSwitchInsn ( start, end, handler, type ) ;^127^^^^^126^129^[REPLACE] mv1.visitTryCatchBlock ( start, end, handler, type ) ;^[METHOD] visitTryCatchBlock [TYPE] void [PARAMETER] Label start Label end Label handler String type [CLASS] MethodVisitorTee   [TYPE]  Label end  handler  start  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  MethodVisitor mv1  mv2 
[ADD]^^127^^^^^126^129^[ADD] mv1.visitTryCatchBlock ( start, end, handler, type ) ;^[METHOD] visitTryCatchBlock [TYPE] void [PARAMETER] Label start Label end Label handler String type [CLASS] MethodVisitorTee   [TYPE]  Label end  handler  start  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv2.visitTableSwitchInsn ( start, end, handler, type ) ;^128^^^^^126^129^[REPLACE] mv2.visitTryCatchBlock ( start, end, handler, type ) ;^[METHOD] visitTryCatchBlock [TYPE] void [PARAMETER] Label start Label end Label handler String type [CLASS] MethodVisitorTee   [TYPE]  Label end  handler  start  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv2.visitLocalVariable ( name, desc, signature, start, end, index ) ;^132^^^^^131^134^[REPLACE] mv1.visitLocalVariable ( name, desc, signature, start, end, index ) ;^[METHOD] visitLocalVariable [TYPE] void [PARAMETER] String name String desc String signature Label start Label end int index [CLASS] MethodVisitorTee   [TYPE]  Label end  start  [TYPE]  String desc  name  signature  [TYPE]  boolean false  true  [TYPE]  int index  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv1.visitLocalVariable ( name, desc, signature, start, end, index ) ;^133^^^^^131^134^[REPLACE] mv2.visitLocalVariable ( name, desc, signature, start, end, index ) ;^[METHOD] visitLocalVariable [TYPE] void [PARAMETER] String name String desc String signature Label start Label end int index [CLASS] MethodVisitorTee   [TYPE]  Label end  start  [TYPE]  String desc  name  signature  [TYPE]  boolean false  true  [TYPE]  int index  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv1.visitJumpInsn ( line, start ) ;^137^^^^^136^139^[REPLACE] mv1.visitLineNumber ( line, start ) ;^[METHOD] visitLineNumber [TYPE] void [PARAMETER] int line Label start [CLASS] MethodVisitorTee   [TYPE]  Label start  [TYPE]  boolean false  true  [TYPE]  int line  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv2 .visitInsn ( line )  ;^138^^^^^136^139^[REPLACE] mv2.visitLineNumber ( line, start ) ;^[METHOD] visitLineNumber [TYPE] void [PARAMETER] int line Label start [CLASS] MethodVisitorTee   [TYPE]  Label start  [TYPE]  boolean false  true  [TYPE]  int line  [TYPE]  MethodVisitor mv1  mv2 
[REPLACE]^mv1.visitVarInsn ( maxStack, maxLocals ) ;^142^^^^^141^144^[REPLACE] mv1.visitMaxs ( maxStack, maxLocals ) ;^[METHOD] visitMaxs [TYPE] void [PARAMETER] int maxStack int maxLocals [CLASS] MethodVisitorTee   [TYPE]  int maxLocals  maxStack  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[ADD]^^142^143^^^^141^144^[ADD] mv1.visitMaxs ( maxStack, maxLocals ) ; mv2.visitMaxs ( maxStack, maxLocals ) ;^[METHOD] visitMaxs [TYPE] void [PARAMETER] int maxStack int maxLocals [CLASS] MethodVisitorTee   [TYPE]  int maxLocals  maxStack  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^mv2 .visitFrame ( maxStack , maxLocals , null , maxLocals , true )  ;^143^^^^^141^144^[REPLACE] mv2.visitMaxs ( maxStack, maxLocals ) ;^[METHOD] visitMaxs [TYPE] void [PARAMETER] int maxStack int maxLocals [CLASS] MethodVisitorTee   [TYPE]  int maxLocals  maxStack  [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^mv1.visitCode (  ) ;^147^^^^^146^149^[REPLACE] mv1.visitEnd (  ) ;^[METHOD] visitEnd [TYPE] void [PARAMETER] [CLASS] MethodVisitorTee   [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
[REPLACE]^mv2.visitCode (  ) ;^148^^^^^146^149^[REPLACE] mv2.visitEnd (  ) ;^[METHOD] visitEnd [TYPE] void [PARAMETER] [CLASS] MethodVisitorTee   [TYPE]  MethodVisitor mv1  mv2  [TYPE]  boolean false  true 
