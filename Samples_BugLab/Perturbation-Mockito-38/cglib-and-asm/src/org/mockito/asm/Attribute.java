[buglab_swap_variables]^v.length = value;^162^^^^^153^164^v.length = value.length;^[CLASS] Attribute  [METHOD] write [RETURN_TYPE] ByteVector   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  v  
[buglab_swap_variables]^v.length = value.length.length;^162^^^^^153^164^v.length = value.length;^[CLASS] Attribute  [METHOD] write [RETURN_TYPE] ByteVector   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  v  
[buglab_swap_variables]^attr = attr.next.next;^176^^^^^171^179^attr = attr.next;^[CLASS] Attribute  [METHOD] getCount [RETURN_TYPE] int   [VARIABLES] byte[]  code  value  String  type  boolean  Attribute  attr  next  int  count  
[buglab_swap_variables]^attr = attr;^176^^^^^171^179^attr = attr.next;^[CLASS] Attribute  [METHOD] getCount [RETURN_TYPE] int   [VARIABLES] byte[]  code  value  String  type  boolean  Attribute  attr  next  int  count  
[buglab_swap_variables]^attr = attr.next.next;^213^^^^^201^216^attr = attr.next;^[CLASS] Attribute  [METHOD] getSize [RETURN_TYPE] int   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [VARIABLES] byte[]  code  value  String  type  boolean  Attribute  attr  next  ClassWriter  cw  int  len  maxLocals  maxStack  size  
[buglab_swap_variables]^attr = attr;^213^^^^^201^216^attr = attr.next;^[CLASS] Attribute  [METHOD] getSize [RETURN_TYPE] int   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [VARIABLES] byte[]  code  value  String  type  boolean  Attribute  attr  next  ClassWriter  cw  int  len  maxLocals  maxStack  size  
[buglab_swap_variables]^cw.newUTF8 ( attr.type.type ) ;^211^^^^^201^216^cw.newUTF8 ( attr.type ) ;^[CLASS] Attribute  [METHOD] getSize [RETURN_TYPE] int   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [VARIABLES] byte[]  code  value  String  type  boolean  Attribute  attr  next  ClassWriter  cw  int  len  maxLocals  maxStack  size  
[buglab_swap_variables]^cw.newUTF8 ( attr ) ;^211^^^^^201^216^cw.newUTF8 ( attr.type ) ;^[CLASS] Attribute  [METHOD] getSize [RETURN_TYPE] int   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [VARIABLES] byte[]  code  value  String  type  boolean  Attribute  attr  next  ClassWriter  cw  int  len  maxLocals  maxStack  size  
[buglab_swap_variables]^size += code.write ( cw, attr, len, maxStack, maxLocals ) .length + 6;^212^^^^^201^216^size += attr.write ( cw, code, len, maxStack, maxLocals ) .length + 6;^[CLASS] Attribute  [METHOD] getSize [RETURN_TYPE] int   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [VARIABLES] byte[]  code  value  String  type  boolean  Attribute  attr  next  ClassWriter  cw  int  len  maxLocals  maxStack  size  
[buglab_swap_variables]^size += cw.write ( attr, code, len, maxStack, maxLocals ) .length + 6;^212^^^^^201^216^size += attr.write ( cw, code, len, maxStack, maxLocals ) .length + 6;^[CLASS] Attribute  [METHOD] getSize [RETURN_TYPE] int   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [VARIABLES] byte[]  code  value  String  type  boolean  Attribute  attr  next  ClassWriter  cw  int  len  maxLocals  maxStack  size  
[buglab_swap_variables]^size += attr.write (  code, len, maxStack, maxLocals ) .length + 6;^212^^^^^201^216^size += attr.write ( cw, code, len, maxStack, maxLocals ) .length + 6;^[CLASS] Attribute  [METHOD] getSize [RETURN_TYPE] int   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [VARIABLES] byte[]  code  value  String  type  boolean  Attribute  attr  next  ClassWriter  cw  int  len  maxLocals  maxStack  size  
[buglab_swap_variables]^size += attr.write ( cw, maxStack, len, code, maxLocals ) .length + 6;^212^^^^^201^216^size += attr.write ( cw, code, len, maxStack, maxLocals ) .length + 6;^[CLASS] Attribute  [METHOD] getSize [RETURN_TYPE] int   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [VARIABLES] byte[]  code  value  String  type  boolean  Attribute  attr  next  ClassWriter  cw  int  len  maxLocals  maxStack  size  
[buglab_swap_variables]^size += attr.write ( cw,  len, maxStack, maxLocals ) .length + 6;^212^^^^^201^216^size += attr.write ( cw, code, len, maxStack, maxLocals ) .length + 6;^[CLASS] Attribute  [METHOD] getSize [RETURN_TYPE] int   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [VARIABLES] byte[]  code  value  String  type  boolean  Attribute  attr  next  ClassWriter  cw  int  len  maxLocals  maxStack  size  
[buglab_swap_variables]^size += attr.write ( cw, code, maxLocals, maxStack, len ) .length + 6;^212^^^^^201^216^size += attr.write ( cw, code, len, maxStack, maxLocals ) .length + 6;^[CLASS] Attribute  [METHOD] getSize [RETURN_TYPE] int   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [VARIABLES] byte[]  code  value  String  type  boolean  Attribute  attr  next  ClassWriter  cw  int  len  maxLocals  maxStack  size  
[buglab_swap_variables]^size += attr.write ( cw, code,  maxStack, maxLocals ) .length + 6;^212^^^^^201^216^size += attr.write ( cw, code, len, maxStack, maxLocals ) .length + 6;^[CLASS] Attribute  [METHOD] getSize [RETURN_TYPE] int   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [VARIABLES] byte[]  code  value  String  type  boolean  Attribute  attr  next  ClassWriter  cw  int  len  maxLocals  maxStack  size  
[buglab_swap_variables]^size += attr.write ( cw, code, len, maxLocals, maxStack ) .length + 6;^212^^^^^201^216^size += attr.write ( cw, code, len, maxStack, maxLocals ) .length + 6;^[CLASS] Attribute  [METHOD] getSize [RETURN_TYPE] int   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [VARIABLES] byte[]  code  value  String  type  boolean  Attribute  attr  next  ClassWriter  cw  int  len  maxLocals  maxStack  size  
[buglab_swap_variables]^size += attr.write ( cw, code, len,  maxLocals ) .length + 6;^212^^^^^201^216^size += attr.write ( cw, code, len, maxStack, maxLocals ) .length + 6;^[CLASS] Attribute  [METHOD] getSize [RETURN_TYPE] int   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [VARIABLES] byte[]  code  value  String  type  boolean  Attribute  attr  next  ClassWriter  cw  int  len  maxLocals  maxStack  size  
[buglab_swap_variables]^size += attr.write ( cw, code, len, maxStack ) .length + 6;^212^^^^^201^216^size += attr.write ( cw, code, len, maxStack, maxLocals ) .length + 6;^[CLASS] Attribute  [METHOD] getSize [RETURN_TYPE] int   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [VARIABLES] byte[]  code  value  String  type  boolean  Attribute  attr  next  ClassWriter  cw  int  len  maxLocals  maxStack  size  
[buglab_swap_variables]^size += attr.write ( maxStack, code, len, cw, maxLocals ) .length + 6;^212^^^^^201^216^size += attr.write ( cw, code, len, maxStack, maxLocals ) .length + 6;^[CLASS] Attribute  [METHOD] getSize [RETURN_TYPE] int   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [VARIABLES] byte[]  code  value  String  type  boolean  Attribute  attr  next  ClassWriter  cw  int  len  maxLocals  maxStack  size  
[buglab_swap_variables]^size += attr.write ( cw, code, maxStack, len, maxLocals ) .length + 6;^212^^^^^201^216^size += attr.write ( cw, code, len, maxStack, maxLocals ) .length + 6;^[CLASS] Attribute  [METHOD] getSize [RETURN_TYPE] int   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [VARIABLES] byte[]  code  value  String  type  boolean  Attribute  attr  next  ClassWriter  cw  int  len  maxLocals  maxStack  size  
[buglab_swap_variables]^size += maxStack.write ( cw, code, len, attr, maxLocals ) .length + 6;^212^^^^^201^216^size += attr.write ( cw, code, len, maxStack, maxLocals ) .length + 6;^[CLASS] Attribute  [METHOD] getSize [RETURN_TYPE] int   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals [VARIABLES] byte[]  code  value  String  type  boolean  Attribute  attr  next  ClassWriter  cw  int  len  maxLocals  maxStack  size  
[buglab_swap_variables]^attr = attr.next.next;^251^^^^^238^253^attr = attr.next;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^attr = attr;^251^^^^^238^253^attr = attr.next;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^ByteVector b = len.write ( cw, code, attr, maxStack, maxLocals ) ;^248^^^^^238^253^ByteVector b = attr.write ( cw, code, len, maxStack, maxLocals ) ;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^ByteVector b = cw.write ( attr, code, len, maxStack, maxLocals ) ;^248^^^^^238^253^ByteVector b = attr.write ( cw, code, len, maxStack, maxLocals ) ;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^ByteVector b = attr.write (  code, len, maxStack, maxLocals ) ;^248^^^^^238^253^ByteVector b = attr.write ( cw, code, len, maxStack, maxLocals ) ;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^ByteVector b = attr.write ( cw, len, code, maxStack, maxLocals ) ;^248^^^^^238^253^ByteVector b = attr.write ( cw, code, len, maxStack, maxLocals ) ;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^ByteVector b = attr.write ( cw,  len, maxStack, maxLocals ) ;^248^^^^^238^253^ByteVector b = attr.write ( cw, code, len, maxStack, maxLocals ) ;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^ByteVector b = attr.write ( cw, code, maxStack, len, maxLocals ) ;^248^^^^^238^253^ByteVector b = attr.write ( cw, code, len, maxStack, maxLocals ) ;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^ByteVector b = attr.write ( cw, code,  maxStack, maxLocals ) ;^248^^^^^238^253^ByteVector b = attr.write ( cw, code, len, maxStack, maxLocals ) ;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^ByteVector b = attr.write ( cw, code, len, maxLocals, maxStack ) ;^248^^^^^238^253^ByteVector b = attr.write ( cw, code, len, maxStack, maxLocals ) ;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^ByteVector b = attr.write ( cw, code, len,  maxLocals ) ;^248^^^^^238^253^ByteVector b = attr.write ( cw, code, len, maxStack, maxLocals ) ;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^ByteVector b = attr.write ( cw, code, maxLocals, maxStack, len ) ;^248^^^^^238^253^ByteVector b = attr.write ( cw, code, len, maxStack, maxLocals ) ;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^ByteVector b = attr.write ( cw, code, len, maxStack ) ;^248^^^^^238^253^ByteVector b = attr.write ( cw, code, len, maxStack, maxLocals ) ;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^ByteVector b = attr.write ( maxStack, code, len, cw, maxLocals ) ;^248^^^^^238^253^ByteVector b = attr.write ( cw, code, len, maxStack, maxLocals ) ;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^ByteVector b = attr.write ( cw, maxLocals, len, maxStack, code ) ;^248^^^^^238^253^ByteVector b = attr.write ( cw, code, len, maxStack, maxLocals ) ;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^out.putShort ( attr.newUTF8 ( cw.type )  ) .putInt ( b.length ) ;^249^^^^^238^253^out.putShort ( cw.newUTF8 ( attr.type )  ) .putInt ( b.length ) ;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^out.putShort ( cw.newUTF8 ( attr )  ) .putInt ( b.length ) ;^249^^^^^238^253^out.putShort ( cw.newUTF8 ( attr.type )  ) .putInt ( b.length ) ;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^out.putShort ( attr.type.newUTF8 ( cw )  ) .putInt ( b.length ) ;^249^^^^^238^253^out.putShort ( cw.newUTF8 ( attr.type )  ) .putInt ( b.length ) ;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^ByteVector b = maxLocals.write ( cw, code, len, maxStack, attr ) ;^248^^^^^238^253^ByteVector b = attr.write ( cw, code, len, maxStack, maxLocals ) ;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^ByteVector b = attr.write ( len, code, cw, maxStack, maxLocals ) ;^248^^^^^238^253^ByteVector b = attr.write ( cw, code, len, maxStack, maxLocals ) ;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^ByteVector b = attr.write ( code, cw, len, maxStack, maxLocals ) ;^248^^^^^238^253^ByteVector b = attr.write ( cw, code, len, maxStack, maxLocals ) ;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
[buglab_swap_variables]^out.putShort ( cw.newUTF8 ( attr.type.type )  ) .putInt ( b.length ) ;^249^^^^^238^253^out.putShort ( cw.newUTF8 ( attr.type )  ) .putInt ( b.length ) ;^[CLASS] Attribute  [METHOD] put [RETURN_TYPE] void   ClassWriter cw final byte[] code final int len final int maxStack final int maxLocals ByteVector out [VARIABLES] byte[]  code  value  boolean  Attribute  attr  next  String  type  ClassWriter  cw  int  len  maxLocals  maxStack  ByteVector  b  out  
