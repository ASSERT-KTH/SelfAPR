[buglab_swap_variables]^return name.canEncode ( enc ) ;^62^^^^^57^63^return enc.canEncode ( name ) ;^[CLASS] NioZipEncoding  [METHOD] canEncode [RETURN_TYPE] boolean   String name [VARIABLES] Charset  charset  String  name  boolean  CharsetEncoder  enc  
[buglab_swap_variables]^if  ( out.length (  )  * 6 > res.remaining (  )  )  {^86^^^^^71^101^if  ( res.length (  )  * 6 > out.remaining (  )  )  {^[CLASS] NioZipEncoding  [METHOD] encode [RETURN_TYPE] ByteBuffer   String name [VARIABLES] boolean  CharBuffer  cb  Charset  charset  String  name  CharsetEncoder  enc  ByteBuffer  out  int  i  CoderResult  res  
[buglab_swap_variables]^out = ZipEncodingHelper.growBuffer ( res, out.position (  ) + out.length (  )  * 6 ) ;^87^88^^^^72^102^out = ZipEncodingHelper.growBuffer ( out, out.position (  ) + res.length (  )  * 6 ) ;^[CLASS] NioZipEncoding  [METHOD] encode [RETURN_TYPE] ByteBuffer   String name [VARIABLES] boolean  CharBuffer  cb  Charset  charset  String  name  CharsetEncoder  enc  ByteBuffer  out  int  i  CoderResult  res  
[buglab_swap_variables]^out = ZipEncodingHelper.growBuffer (  out.position (  ) + res.length (  )  * 6 ) ;^87^88^^^^72^102^out = ZipEncodingHelper.growBuffer ( out, out.position (  ) + res.length (  )  * 6 ) ;^[CLASS] NioZipEncoding  [METHOD] encode [RETURN_TYPE] ByteBuffer   String name [VARIABLES] boolean  CharBuffer  cb  Charset  charset  String  name  CharsetEncoder  enc  ByteBuffer  out  int  i  CoderResult  res  
[buglab_swap_variables]^ZipEncodingHelper.appendSurrogate ( cb.get (  )  ) ;^92^^^^^77^107^ZipEncodingHelper.appendSurrogate ( out,cb.get (  )  ) ;^[CLASS] NioZipEncoding  [METHOD] encode [RETURN_TYPE] ByteBuffer   String name [VARIABLES] boolean  CharBuffer  cb  Charset  charset  String  name  CharsetEncoder  enc  ByteBuffer  out  int  i  CoderResult  res  
[buglab_swap_variables]^CoderResult res = cb.encode ( enc, out,true ) ;^80^^^^^65^95^CoderResult res = enc.encode ( cb, out,true ) ;^[CLASS] NioZipEncoding  [METHOD] encode [RETURN_TYPE] ByteBuffer   String name [VARIABLES] boolean  CharBuffer  cb  Charset  charset  String  name  CharsetEncoder  enc  ByteBuffer  out  int  i  CoderResult  res  
[buglab_swap_variables]^CoderResult res = enc.encode ( out, cb,true ) ;^80^^^^^65^95^CoderResult res = enc.encode ( cb, out,true ) ;^[CLASS] NioZipEncoding  [METHOD] encode [RETURN_TYPE] ByteBuffer   String name [VARIABLES] boolean  CharBuffer  cb  Charset  charset  String  name  CharsetEncoder  enc  ByteBuffer  out  int  i  CoderResult  res  
[buglab_swap_variables]^CoderResult res = enc.encode (  out,true ) ;^80^^^^^65^95^CoderResult res = enc.encode ( cb, out,true ) ;^[CLASS] NioZipEncoding  [METHOD] encode [RETURN_TYPE] ByteBuffer   String name [VARIABLES] boolean  CharBuffer  cb  Charset  charset  String  name  CharsetEncoder  enc  ByteBuffer  out  int  i  CoderResult  res  
[buglab_swap_variables]^CoderResult res = enc.encode ( cb, true ) ;^80^^^^^65^95^CoderResult res = enc.encode ( cb, out,true ) ;^[CLASS] NioZipEncoding  [METHOD] encode [RETURN_TYPE] ByteBuffer   String name [VARIABLES] boolean  CharBuffer  cb  Charset  charset  String  name  CharsetEncoder  enc  ByteBuffer  out  int  i  CoderResult  res  
[buglab_swap_variables]^CoderResult res = out.encode ( cb, enc,true ) ;^80^^^^^65^95^CoderResult res = enc.encode ( cb, out,true ) ;^[CLASS] NioZipEncoding  [METHOD] encode [RETURN_TYPE] ByteBuffer   String name [VARIABLES] boolean  CharBuffer  cb  Charset  charset  String  name  CharsetEncoder  enc  ByteBuffer  out  int  i  CoderResult  res  
[buglab_swap_variables]^return data.newDecoder (  ) .onMalformedInput ( CodingErrorAction.REPORT ) .onUnmappableCharacter ( CodingErrorAction.REPORT ) .decode ( ByteBuffer.wrap ( this.charset )  ) .toString (  ) ;^117^118^119^120^^116^121^return this.charset.newDecoder (  ) .onMalformedInput ( CodingErrorAction.REPORT ) .onUnmappableCharacter ( CodingErrorAction.REPORT ) .decode ( ByteBuffer.wrap ( data )  ) .toString (  ) ;^[CLASS] NioZipEncoding  [METHOD] decode [RETURN_TYPE] String   byte[] data [VARIABLES] byte[]  data  Charset  charset  boolean  
