[REPLACE]^mv.visitInsn ( opcode ) ;^62^^^^^61^63^[REPLACE] super ( opcode ) ;^[METHOD] <init> [TYPE] InsnNode(int) [PARAMETER] final int opcode [CLASS] InsnNode   [TYPE]  boolean false  true  [TYPE]  int opcode 
[ADD]^^62^^^^^61^63^[ADD] super ( opcode ) ;^[METHOD] <init> [TYPE] InsnNode(int) [PARAMETER] final int opcode [CLASS] InsnNode   [TYPE]  boolean false  true  [TYPE]  int opcode 
[REPLACE]^return new InsnNode ( opcode ) ;^66^^^^^65^67^[REPLACE] return INSN;^[METHOD] getType [TYPE] int [PARAMETER] [CLASS] InsnNode   [TYPE]  boolean false  true 
[REPLACE]^super ( opcode ) ;^75^^^^^74^76^[REPLACE] mv.visitInsn ( opcode ) ;^[METHOD] accept [TYPE] void [PARAMETER] MethodVisitor mv [CLASS] InsnNode   [TYPE]  boolean false  true  [TYPE]  MethodVisitor mv 
[REPLACE]^return INSN;^79^^^^^78^80^[REPLACE] return new InsnNode ( opcode ) ;^[METHOD] clone [TYPE] AbstractInsnNode [PARAMETER] Map labels [CLASS] InsnNode   [TYPE]  boolean false  true  [TYPE]  Map labels 
