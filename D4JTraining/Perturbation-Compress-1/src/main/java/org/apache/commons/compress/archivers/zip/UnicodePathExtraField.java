[REPLACE]^public static final ZipShort UPATH_ID  = null ;^39^^^^^^^[REPLACE] public static final ZipShort UPATH_ID = new ZipShort ( 0x7075 ) ;^ [CLASS] UnicodePathExtraField  
[REPLACE]^super ( name, bytes ) ;^55^^^^^54^56^[REPLACE] super ( text, bytes, off, len ) ;^[METHOD] <init> [TYPE] String,byte[],int,int) [PARAMETER] String text byte[] bytes int off int len [CLASS] UnicodePathExtraField   [TYPE]  byte[] bytes  [TYPE]  ZipShort UPATH_ID  [TYPE]  String text  [TYPE]  boolean false  true  [TYPE]  int len  off 
[REPLACE]^super ( text, bytes, off, len ) ;^66^^^^^65^67^[REPLACE] super ( name, bytes ) ;^[METHOD] <init> [TYPE] String,byte[]) [PARAMETER] String name byte[] bytes [CLASS] UnicodePathExtraField   [TYPE]  byte[] bytes  [TYPE]  ZipShort UPATH_ID  [TYPE]  String name  [TYPE]  boolean false  true 
[ADD]^^66^^^^^65^67^[ADD] super ( name, bytes ) ;^[METHOD] <init> [TYPE] String,byte[]) [PARAMETER] String name byte[] bytes [CLASS] UnicodePathExtraField   [TYPE]  byte[] bytes  [TYPE]  ZipShort UPATH_ID  [TYPE]  String name  [TYPE]  boolean false  true 
