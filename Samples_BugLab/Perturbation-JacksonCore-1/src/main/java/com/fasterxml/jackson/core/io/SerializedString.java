[buglab_swap_variables]^final int length = result.length.length;^141^^^^^134^147^final int length = result.length;^[CLASS] SerializedString  [METHOD] appendQuotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  result  
[buglab_swap_variables]^final int length = result;^141^^^^^134^147^final int length = result.length;^[CLASS] SerializedString  [METHOD] appendQuotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  result  
[buglab_swap_variables]^if  (  ( length + offset )  > buffer.length )  {^142^^^^^134^147^if  (  ( offset + length )  > buffer.length )  {^[CLASS] SerializedString  [METHOD] appendQuotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  result  
[buglab_swap_variables]^if  (  ( offset + buffer.length )  > length )  {^142^^^^^134^147^if  (  ( offset + length )  > buffer.length )  {^[CLASS] SerializedString  [METHOD] appendQuotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  result  
[buglab_swap_variables]^if  (  ( offset + buffer )  > length.length )  {^142^^^^^134^147^if  (  ( offset + length )  > buffer.length )  {^[CLASS] SerializedString  [METHOD] appendQuotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  result  
[buglab_swap_variables]^if  (  ( buffer.length + length )  > offset )  {^142^^^^^134^147^if  (  ( offset + length )  > buffer.length )  {^[CLASS] SerializedString  [METHOD] appendQuotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  result  
[buglab_swap_variables]^System.arraycopy ( buffer, 0, result, offset, length ) ;^145^^^^^134^147^System.arraycopy ( result, 0, buffer, offset, length ) ;^[CLASS] SerializedString  [METHOD] appendQuotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  result  
[buglab_swap_variables]^System.arraycopy (  0, buffer, offset, length ) ;^145^^^^^134^147^System.arraycopy ( result, 0, buffer, offset, length ) ;^[CLASS] SerializedString  [METHOD] appendQuotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  result  
[buglab_swap_variables]^System.arraycopy ( result, 0,  offset, length ) ;^145^^^^^134^147^System.arraycopy ( result, 0, buffer, offset, length ) ;^[CLASS] SerializedString  [METHOD] appendQuotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  result  
[buglab_swap_variables]^System.arraycopy ( result, 0, buffer, length, offset ) ;^145^^^^^134^147^System.arraycopy ( result, 0, buffer, offset, length ) ;^[CLASS] SerializedString  [METHOD] appendQuotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  result  
[buglab_swap_variables]^System.arraycopy ( result, 0, buffer,  length ) ;^145^^^^^134^147^System.arraycopy ( result, 0, buffer, offset, length ) ;^[CLASS] SerializedString  [METHOD] appendQuotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  result  
[buglab_swap_variables]^System.arraycopy ( result, 0, buffer, offset ) ;^145^^^^^134^147^System.arraycopy ( result, 0, buffer, offset, length ) ;^[CLASS] SerializedString  [METHOD] appendQuotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  result  
[buglab_swap_variables]^final int length = result.length.length;^157^^^^^150^163^final int length = result.length;^[CLASS] SerializedString  [METHOD] appendQuoted [RETURN_TYPE] int   char[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^final int length = result;^157^^^^^150^163^final int length = result.length;^[CLASS] SerializedString  [METHOD] appendQuoted [RETURN_TYPE] int   char[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^if  (  ( length + offset )  > buffer.length )  {^158^^^^^150^163^if  (  ( offset + length )  > buffer.length )  {^[CLASS] SerializedString  [METHOD] appendQuoted [RETURN_TYPE] int   char[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^if  (  ( offset + buffer )  > length.length )  {^158^^^^^150^163^if  (  ( offset + length )  > buffer.length )  {^[CLASS] SerializedString  [METHOD] appendQuoted [RETURN_TYPE] int   char[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^if  (  ( offset + buffer.length )  > length )  {^158^^^^^150^163^if  (  ( offset + length )  > buffer.length )  {^[CLASS] SerializedString  [METHOD] appendQuoted [RETURN_TYPE] int   char[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^System.arraycopy ( buffer, 0, result, offset, length ) ;^161^^^^^150^163^System.arraycopy ( result, 0, buffer, offset, length ) ;^[CLASS] SerializedString  [METHOD] appendQuoted [RETURN_TYPE] int   char[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^System.arraycopy (  0, buffer, offset, length ) ;^161^^^^^150^163^System.arraycopy ( result, 0, buffer, offset, length ) ;^[CLASS] SerializedString  [METHOD] appendQuoted [RETURN_TYPE] int   char[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^System.arraycopy ( result, 0,  offset, length ) ;^161^^^^^150^163^System.arraycopy ( result, 0, buffer, offset, length ) ;^[CLASS] SerializedString  [METHOD] appendQuoted [RETURN_TYPE] int   char[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^System.arraycopy ( offset, 0, buffer, result, length ) ;^161^^^^^150^163^System.arraycopy ( result, 0, buffer, offset, length ) ;^[CLASS] SerializedString  [METHOD] appendQuoted [RETURN_TYPE] int   char[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^System.arraycopy ( result, 0, buffer,  length ) ;^161^^^^^150^163^System.arraycopy ( result, 0, buffer, offset, length ) ;^[CLASS] SerializedString  [METHOD] appendQuoted [RETURN_TYPE] int   char[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^System.arraycopy ( length, 0, buffer, offset, result ) ;^161^^^^^150^163^System.arraycopy ( result, 0, buffer, offset, length ) ;^[CLASS] SerializedString  [METHOD] appendQuoted [RETURN_TYPE] int   char[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^System.arraycopy ( result, 0, buffer, offset ) ;^161^^^^^150^163^System.arraycopy ( result, 0, buffer, offset, length ) ;^[CLASS] SerializedString  [METHOD] appendQuoted [RETURN_TYPE] int   char[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^final int length = result.length.length;^173^^^^^166^179^final int length = result.length;^[CLASS] SerializedString  [METHOD] appendUnquotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^final int length = result;^173^^^^^166^179^final int length = result.length;^[CLASS] SerializedString  [METHOD] appendUnquotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^if  (  ( length + offset )  > buffer.length )  {^174^^^^^166^179^if  (  ( offset + length )  > buffer.length )  {^[CLASS] SerializedString  [METHOD] appendUnquotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^if  (  ( offset + buffer )  > length.length )  {^174^^^^^166^179^if  (  ( offset + length )  > buffer.length )  {^[CLASS] SerializedString  [METHOD] appendUnquotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^if  (  ( offset + buffer.length )  > length )  {^174^^^^^166^179^if  (  ( offset + length )  > buffer.length )  {^[CLASS] SerializedString  [METHOD] appendUnquotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^System.arraycopy ( buffer, 0, result, offset, length ) ;^177^^^^^166^179^System.arraycopy ( result, 0, buffer, offset, length ) ;^[CLASS] SerializedString  [METHOD] appendUnquotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^System.arraycopy (  0, buffer, offset, length ) ;^177^^^^^166^179^System.arraycopy ( result, 0, buffer, offset, length ) ;^[CLASS] SerializedString  [METHOD] appendUnquotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^System.arraycopy ( result, 0,  offset, length ) ;^177^^^^^166^179^System.arraycopy ( result, 0, buffer, offset, length ) ;^[CLASS] SerializedString  [METHOD] appendUnquotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^System.arraycopy ( result, 0, offset, buffer, length ) ;^177^^^^^166^179^System.arraycopy ( result, 0, buffer, offset, length ) ;^[CLASS] SerializedString  [METHOD] appendUnquotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^System.arraycopy ( result, 0, buffer,  length ) ;^177^^^^^166^179^System.arraycopy ( result, 0, buffer, offset, length ) ;^[CLASS] SerializedString  [METHOD] appendUnquotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^System.arraycopy ( result, 0, buffer, length, offset ) ;^177^^^^^166^179^System.arraycopy ( result, 0, buffer, offset, length ) ;^[CLASS] SerializedString  [METHOD] appendUnquotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^System.arraycopy ( result, 0, buffer, offset ) ;^177^^^^^166^179^System.arraycopy ( result, 0, buffer, offset, length ) ;^[CLASS] SerializedString  [METHOD] appendUnquotedUTF8 [RETURN_TYPE] int   byte[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^if  (  ( length + offset )  > buffer.length )  {^186^^^^^182^191^if  (  ( offset + length )  > buffer.length )  {^[CLASS] SerializedString  [METHOD] appendUnquoted [RETURN_TYPE] int   char[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^if  (  ( offset + buffer.length )  > length )  {^186^^^^^182^191^if  (  ( offset + length )  > buffer.length )  {^[CLASS] SerializedString  [METHOD] appendUnquoted [RETURN_TYPE] int   char[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^if  (  ( buffer + length )  > offset.length )  {^186^^^^^182^191^if  (  ( offset + length )  > buffer.length )  {^[CLASS] SerializedString  [METHOD] appendUnquoted [RETURN_TYPE] int   char[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^if  (  ( buffer.length + length )  > offset )  {^186^^^^^182^191^if  (  ( offset + length )  > buffer.length )  {^[CLASS] SerializedString  [METHOD] appendUnquoted [RETURN_TYPE] int   char[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^str.getChars ( 0,  offset, buffer, length ) ;^189^^^^^182^191^str.getChars ( 0,  length, buffer, offset ) ;^[CLASS] SerializedString  [METHOD] appendUnquoted [RETURN_TYPE] int   char[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^str.getChars ( 0,   buffer, offset ) ;^189^^^^^182^191^str.getChars ( 0,  length, buffer, offset ) ;^[CLASS] SerializedString  [METHOD] appendUnquoted [RETURN_TYPE] int   char[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^str.getChars ( 0,  length,  offset ) ;^189^^^^^182^191^str.getChars ( 0,  length, buffer, offset ) ;^[CLASS] SerializedString  [METHOD] appendUnquoted [RETURN_TYPE] int   char[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^str.getChars ( 0,  length, buffer ) ;^189^^^^^182^191^str.getChars ( 0,  length, buffer, offset ) ;^[CLASS] SerializedString  [METHOD] appendUnquoted [RETURN_TYPE] int   char[] buffer int offset [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  int  length  offset  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^final int length = result.length.length;^201^^^^^194^204^final int length = result.length;^[CLASS] SerializedString  [METHOD] writeQuotedUTF8 [RETURN_TYPE] int   OutputStream out [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  int  length  char[]  _quotedChars  buffer  result  OutputStream  out  
[buglab_swap_variables]^final int length = result;^201^^^^^194^204^final int length = result.length;^[CLASS] SerializedString  [METHOD] writeQuotedUTF8 [RETURN_TYPE] int   OutputStream out [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  int  length  char[]  _quotedChars  buffer  result  OutputStream  out  
[buglab_swap_variables]^out.write ( length, 0, result ) ;^202^^^^^194^204^out.write ( result, 0, length ) ;^[CLASS] SerializedString  [METHOD] writeQuotedUTF8 [RETURN_TYPE] int   OutputStream out [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  int  length  char[]  _quotedChars  buffer  result  OutputStream  out  
[buglab_swap_variables]^out.write (  0, length ) ;^202^^^^^194^204^out.write ( result, 0, length ) ;^[CLASS] SerializedString  [METHOD] writeQuotedUTF8 [RETURN_TYPE] int   OutputStream out [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  int  length  char[]  _quotedChars  buffer  result  OutputStream  out  
[buglab_swap_variables]^out.write ( result, 0 ) ;^202^^^^^194^204^out.write ( result, 0, length ) ;^[CLASS] SerializedString  [METHOD] writeQuotedUTF8 [RETURN_TYPE] int   OutputStream out [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  int  length  char[]  _quotedChars  buffer  result  OutputStream  out  
[buglab_swap_variables]^final int length = result.length.length;^214^^^^^207^217^final int length = result.length;^[CLASS] SerializedString  [METHOD] writeUnquotedUTF8 [RETURN_TYPE] int   OutputStream out [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  int  length  char[]  _quotedChars  buffer  result  OutputStream  out  
[buglab_swap_variables]^final int length = result;^214^^^^^207^217^final int length = result.length;^[CLASS] SerializedString  [METHOD] writeUnquotedUTF8 [RETURN_TYPE] int   OutputStream out [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  int  length  char[]  _quotedChars  buffer  result  OutputStream  out  
[buglab_swap_variables]^out.write ( length, 0, result ) ;^215^^^^^207^217^out.write ( result, 0, length ) ;^[CLASS] SerializedString  [METHOD] writeUnquotedUTF8 [RETURN_TYPE] int   OutputStream out [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  int  length  char[]  _quotedChars  buffer  result  OutputStream  out  
[buglab_swap_variables]^out.write (  0, length ) ;^215^^^^^207^217^out.write ( result, 0, length ) ;^[CLASS] SerializedString  [METHOD] writeUnquotedUTF8 [RETURN_TYPE] int   OutputStream out [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  int  length  char[]  _quotedChars  buffer  result  OutputStream  out  
[buglab_swap_variables]^out.write ( result, 0 ) ;^215^^^^^207^217^out.write ( result, 0, length ) ;^[CLASS] SerializedString  [METHOD] writeUnquotedUTF8 [RETURN_TYPE] int   OutputStream out [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  int  length  char[]  _quotedChars  buffer  result  OutputStream  out  
[buglab_swap_variables]^final int length = result.length.length;^227^^^^^220^233^final int length = result.length;^[CLASS] SerializedString  [METHOD] putQuotedUTF8 [RETURN_TYPE] int   ByteBuffer buffer [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  ByteBuffer  buffer  int  length  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^final int length = result;^227^^^^^220^233^final int length = result.length;^[CLASS] SerializedString  [METHOD] putQuotedUTF8 [RETURN_TYPE] int   ByteBuffer buffer [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  ByteBuffer  buffer  int  length  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^if  ( buffer > length.remaining (  )  )  {^228^^^^^220^233^if  ( length > buffer.remaining (  )  )  {^[CLASS] SerializedString  [METHOD] putQuotedUTF8 [RETURN_TYPE] int   ByteBuffer buffer [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  ByteBuffer  buffer  int  length  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^buffer.put ( length, 0, result ) ;^231^^^^^220^233^buffer.put ( result, 0, length ) ;^[CLASS] SerializedString  [METHOD] putQuotedUTF8 [RETURN_TYPE] int   ByteBuffer buffer [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  ByteBuffer  buffer  int  length  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^buffer.put (  0, length ) ;^231^^^^^220^233^buffer.put ( result, 0, length ) ;^[CLASS] SerializedString  [METHOD] putQuotedUTF8 [RETURN_TYPE] int   ByteBuffer buffer [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  ByteBuffer  buffer  int  length  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^buffer.put ( result, 0 ) ;^231^^^^^220^233^buffer.put ( result, 0, length ) ;^[CLASS] SerializedString  [METHOD] putQuotedUTF8 [RETURN_TYPE] int   ByteBuffer buffer [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  ByteBuffer  buffer  int  length  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^final int length = result.length.length;^243^^^^^236^249^final int length = result.length;^[CLASS] SerializedString  [METHOD] putUnquotedUTF8 [RETURN_TYPE] int   ByteBuffer buffer [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  ByteBuffer  buffer  int  length  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^final int length = result;^243^^^^^236^249^final int length = result.length;^[CLASS] SerializedString  [METHOD] putUnquotedUTF8 [RETURN_TYPE] int   ByteBuffer buffer [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  ByteBuffer  buffer  int  length  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^if  ( buffer > length.remaining (  )  )  {^244^^^^^236^249^if  ( length > buffer.remaining (  )  )  {^[CLASS] SerializedString  [METHOD] putUnquotedUTF8 [RETURN_TYPE] int   ByteBuffer buffer [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  ByteBuffer  buffer  int  length  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^buffer.put ( length, 0, result ) ;^247^^^^^236^249^buffer.put ( result, 0, length ) ;^[CLASS] SerializedString  [METHOD] putUnquotedUTF8 [RETURN_TYPE] int   ByteBuffer buffer [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  ByteBuffer  buffer  int  length  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^buffer.put (  0, length ) ;^247^^^^^236^249^buffer.put ( result, 0, length ) ;^[CLASS] SerializedString  [METHOD] putUnquotedUTF8 [RETURN_TYPE] int   ByteBuffer buffer [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  ByteBuffer  buffer  int  length  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^buffer.put ( result, 0 ) ;^247^^^^^236^249^buffer.put ( result, 0, length ) ;^[CLASS] SerializedString  [METHOD] putUnquotedUTF8 [RETURN_TYPE] int   ByteBuffer buffer [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  String  _jdkSerializeValue  _value  str  v  boolean  ByteBuffer  buffer  int  length  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^return other.equals ( _value._value ) ;^270^^^^^265^271^return _value.equals ( other._value ) ;^[CLASS] SerializedString  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  SerializedString  other  Object  o  String  _jdkSerializeValue  _value  str  v  boolean  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^return other._value.equals ( _value ) ;^270^^^^^265^271^return _value.equals ( other._value ) ;^[CLASS] SerializedString  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  SerializedString  other  Object  o  String  _jdkSerializeValue  _value  str  v  boolean  char[]  _quotedChars  buffer  result  
[buglab_swap_variables]^return _value.equals ( other ) ;^270^^^^^265^271^return _value.equals ( other._value ) ;^[CLASS] SerializedString  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] byte[]  _quotedUTF8Ref  _unquotedUTF8Ref  buffer  result  SerializedString  other  Object  o  String  _jdkSerializeValue  _value  str  v  boolean  char[]  _quotedChars  buffer  result  
