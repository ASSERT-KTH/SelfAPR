[REPLACE]^public final  char  type;^43^^^^^^^[REPLACE] public final String type;^ [CLASS] Attribute  
[REPLACE]^this.type =  null;^61^^^^^60^62^[REPLACE] this.type = type;^[METHOD] <init> [TYPE] String) [PARAMETER] String type [CLASS] Attribute   [TYPE]  byte[] value  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  Attribute next 
[ADD]^^61^^^^^60^62^[ADD] this.type = type;^[METHOD] <init> [TYPE] String) [PARAMETER] String type [CLASS] Attribute   [TYPE]  byte[] value  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  Attribute next 
[REPLACE]^return false;^71^^^^^70^72^[REPLACE] return true;^[METHOD] isUnknown [TYPE] boolean [PARAMETER] [CLASS] Attribute   [TYPE]  byte[] value  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  Attribute next 
[REPLACE]^return true;^80^^^^^79^81^[REPLACE] return false;^[METHOD] isCodeAttribute [TYPE] boolean [PARAMETER] [CLASS] Attribute   [TYPE]  byte[] value  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  Attribute next 
[REPLACE]^return true;^90^^^^^89^91^[REPLACE] return null;^[METHOD] getLabels [TYPE] Label[] [PARAMETER] [CLASS] Attribute   [TYPE]  byte[] value  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  Attribute next 
[REPLACE]^Attribute attr = this;^127^^^^^119^131^[REPLACE] Attribute attr = new Attribute ( type ) ;^[METHOD] read [TYPE] Attribute [PARAMETER] ClassReader cr final int off final int len final char[] buf final int codeOff Label[] labels [CLASS] Attribute   [TYPE]  byte[] value  [TYPE]  Label[] labels  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  ClassReader cr  [TYPE]  String type  [TYPE]  int codeOff  len  off  [TYPE]  char[] buf 
[REPLACE]^attr.value =  new byte[len];^128^^^^^119^131^[REPLACE] attr.value = new byte[len];^[METHOD] read [TYPE] Attribute [PARAMETER] ClassReader cr final int off final int len final char[] buf final int codeOff Label[] labels [CLASS] Attribute   [TYPE]  byte[] value  [TYPE]  Label[] labels  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  ClassReader cr  [TYPE]  String type  [TYPE]  int codeOff  len  off  [TYPE]  char[] buf 
[ADD]^^128^^^^^119^131^[ADD] attr.value = new byte[len];^[METHOD] read [TYPE] Attribute [PARAMETER] ClassReader cr final int off final int len final char[] buf final int codeOff Label[] labels [CLASS] Attribute   [TYPE]  byte[] value  [TYPE]  Label[] labels  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  ClassReader cr  [TYPE]  String type  [TYPE]  int codeOff  len  off  [TYPE]  char[] buf 
[REPLACE]^System.arraycopy ( cr.b, off, attr.value, 2, len ) ;^129^^^^^119^131^[REPLACE] System.arraycopy ( cr.b, off, attr.value, 0, len ) ;^[METHOD] read [TYPE] Attribute [PARAMETER] ClassReader cr final int off final int len final char[] buf final int codeOff Label[] labels [CLASS] Attribute   [TYPE]  byte[] value  [TYPE]  Label[] labels  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  ClassReader cr  [TYPE]  String type  [TYPE]  int codeOff  len  off  [TYPE]  char[] buf 
[ADD]^^129^130^^^^119^131^[ADD] System.arraycopy ( cr.b, off, attr.value, 0, len ) ; return attr;^[METHOD] read [TYPE] Attribute [PARAMETER] ClassReader cr final int off final int len final char[] buf final int codeOff Label[] labels [CLASS] Attribute   [TYPE]  byte[] value  [TYPE]  Label[] labels  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  ClassReader cr  [TYPE]  String type  [TYPE]  int codeOff  len  off  [TYPE]  char[] buf 
[REPLACE]^return size;^130^^^^^119^131^[REPLACE] return attr;^[METHOD] read [TYPE] Attribute [PARAMETER] ClassReader cr final int off final int len final char[] buf final int codeOff Label[] labels [CLASS] Attribute   [TYPE]  byte[] value  [TYPE]  Label[] labels  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  ClassReader cr  [TYPE]  String type  [TYPE]  int codeOff  len  off  [TYPE]  char[] buf 
[REPLACE]^Attribute attr = new Attribute ( type ) ;^160^^^^^153^164^[REPLACE] ByteVector v = new ByteVector (  ) ;^[METHOD] write [TYPE] ByteVector [PARAMETER] ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  String type  [TYPE]  ClassWriter cw  [TYPE]  int len  maxLocals  maxStack  [TYPE]  ByteVector v 
[REPLACE]^v.data  =  v.data ;^161^^^^^153^164^[REPLACE] v.data = value;^[METHOD] write [TYPE] ByteVector [PARAMETER] ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  String type  [TYPE]  ClassWriter cw  [TYPE]  int len  maxLocals  maxStack  [TYPE]  ByteVector v 
[REPLACE]^v.length ;^162^^^^^153^164^[REPLACE] v.length = value.length;^[METHOD] write [TYPE] ByteVector [PARAMETER] ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  String type  [TYPE]  ClassWriter cw  [TYPE]  int len  maxLocals  maxStack  [TYPE]  ByteVector v 
[REPLACE]^return size;^163^^^^^153^164^[REPLACE] return v;^[METHOD] write [TYPE] ByteVector [PARAMETER] ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  String type  [TYPE]  ClassWriter cw  [TYPE]  int len  maxLocals  maxStack  [TYPE]  ByteVector v 
[REPLACE]^int count = 2;^172^^^^^171^179^[REPLACE] int count = 0;^[METHOD] getCount [TYPE] int [PARAMETER] [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  int count 
[REPLACE]^Attribute attr = new Attribute ( type ) ;^173^^^^^171^179^[REPLACE] Attribute attr = this;^[METHOD] getCount [TYPE] int [PARAMETER] [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  int count 
[REPLACE]^while  ( attr == null )  {^174^^^^^171^179^[REPLACE] while  ( attr != null )  {^[METHOD] getCount [TYPE] int [PARAMETER] [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  int count 
[REPLACE]^count += 2;^175^^^^^171^179^[REPLACE] count += 1;^[METHOD] getCount [TYPE] int [PARAMETER] [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  int count 
[REPLACE]^attr =  null.next;^176^^^^^171^179^[REPLACE] attr = attr.next;^[METHOD] getCount [TYPE] int [PARAMETER] [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  int count 
[ADD]^^176^^^^^171^179^[ADD] attr = attr.next;^[METHOD] getCount [TYPE] int [PARAMETER] [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  int count 
[REPLACE]^count += 3;^175^^^^^171^179^[REPLACE] count += 1;^[METHOD] getCount [TYPE] int [PARAMETER] [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  int count 
[REPLACE]^return size;^178^^^^^171^179^[REPLACE] return count;^[METHOD] getCount [TYPE] int [PARAMETER] [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  int count 
[REPLACE]^Attribute attr = new Attribute ( type ) ;^208^^^^^201^216^[REPLACE] Attribute attr = this;^[METHOD] getSize [TYPE] int [PARAMETER] ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  ClassWriter cw  [TYPE]  int len  maxLocals  maxStack  size 
[REPLACE]^int size = 0 ;^209^^^^^201^216^[REPLACE] int size = 0;^[METHOD] getSize [TYPE] int [PARAMETER] ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  ClassWriter cw  [TYPE]  int len  maxLocals  maxStack  size 
[REPLACE]^while  ( attr == null )  {^210^^^^^201^216^[REPLACE] while  ( attr != null )  {^[METHOD] getSize [TYPE] int [PARAMETER] ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  ClassWriter cw  [TYPE]  int len  maxLocals  maxStack  size 
[REPLACE]^size += attr.write ( cw, code, len, maxStack, maxLocals ) .length + 3 + 6;^212^^^^^201^216^[REPLACE] size += attr.write ( cw, code, len, maxStack, maxLocals ) .length + 6;^[METHOD] getSize [TYPE] int [PARAMETER] ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  ClassWriter cw  [TYPE]  int len  maxLocals  maxStack  size 
[REPLACE]^attr =  null.next;^213^^^^^201^216^[REPLACE] attr = attr.next;^[METHOD] getSize [TYPE] int [PARAMETER] ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  ClassWriter cw  [TYPE]  int len  maxLocals  maxStack  size 
[REPLACE]^return maxStack;^215^^^^^201^216^[REPLACE] return size;^[METHOD] getSize [TYPE] int [PARAMETER] ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  String type  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  ClassWriter cw  [TYPE]  int len  maxLocals  maxStack  size 
[REPLACE]^Attribute attr = new Attribute ( type ) ;^246^^^^^238^253^[REPLACE] Attribute attr = this;^[METHOD] put [TYPE] void [PARAMETER] ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  String type  [TYPE]  ClassWriter cw  [TYPE]  int len  maxLocals  maxStack  [TYPE]  ByteVector b  out 
[ADD]^^246^^^^^238^253^[ADD] Attribute attr = this;^[METHOD] put [TYPE] void [PARAMETER] ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  String type  [TYPE]  ClassWriter cw  [TYPE]  int len  maxLocals  maxStack  [TYPE]  ByteVector b  out 
[REPLACE]^while  ( attr == null )  {^247^^^^^238^253^[REPLACE] while  ( attr != null )  {^[METHOD] put [TYPE] void [PARAMETER] ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  String type  [TYPE]  ClassWriter cw  [TYPE]  int len  maxLocals  maxStack  [TYPE]  ByteVector b  out 
[REPLACE]^attr =  null.next;^251^^^^^238^253^[REPLACE] attr = attr.next;^[METHOD] put [TYPE] void [PARAMETER] ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  String type  [TYPE]  ClassWriter cw  [TYPE]  int len  maxLocals  maxStack  [TYPE]  ByteVector b  out 
[ADD]^^251^^^^^238^253^[ADD] attr = attr.next;^[METHOD] put [TYPE] void [PARAMETER] ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  String type  [TYPE]  ClassWriter cw  [TYPE]  int len  maxLocals  maxStack  [TYPE]  ByteVector b  out 
[REPLACE]^ByteVector b = attr .Attribute ( type )  ;^248^^^^^238^253^[REPLACE] ByteVector b = attr.write ( cw, code, len, maxStack, maxLocals ) ;^[METHOD] put [TYPE] void [PARAMETER] ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  String type  [TYPE]  ClassWriter cw  [TYPE]  int len  maxLocals  maxStack  [TYPE]  ByteVector b  out 
[REPLACE]^ByteVector b = attr.write ( cw, code, len, maxStack, maxStack ) ;^248^^^^^238^253^[REPLACE] ByteVector b = attr.write ( cw, code, len, maxStack, maxLocals ) ;^[METHOD] put [TYPE] void [PARAMETER] ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [CLASS] Attribute   [TYPE]  byte[] code  value  [TYPE]  boolean false  true  [TYPE]  Attribute attr  next  [TYPE]  String type  [TYPE]  ClassWriter cw  [TYPE]  int len  maxLocals  maxStack  [TYPE]  ByteVector b  out 
