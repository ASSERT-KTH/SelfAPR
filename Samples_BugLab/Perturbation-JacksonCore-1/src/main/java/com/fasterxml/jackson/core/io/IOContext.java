[buglab_swap_variables]^return  ( _nameCopyBuffer = minSize.allocCharBuffer ( BufferRecycler.CharBufferType.NAME_COPY_BUFFER, _bufferRecycler )  ) ;^171^^^^^168^172^return  ( _nameCopyBuffer = _bufferRecycler.allocCharBuffer ( BufferRecycler.CharBufferType.NAME_COPY_BUFFER, minSize )  ) ;^[CLASS] IOContext  [METHOD] allocNameCopyBuffer [RETURN_TYPE] char[]   int minSize [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  int  minSize  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  
[buglab_swap_variables]^return  ( _nameCopyBuffer = _bufferRecycler.allocCharBuffer ( BufferRecycler.CharBufferType.NAME_COPY_BUFFER )  ) ;^171^^^^^168^172^return  ( _nameCopyBuffer = _bufferRecycler.allocCharBuffer ( BufferRecycler.CharBufferType.NAME_COPY_BUFFER, minSize )  ) ;^[CLASS] IOContext  [METHOD] allocNameCopyBuffer [RETURN_TYPE] char[]   int minSize [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  int  minSize  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  
[buglab_swap_variables]^_verifyRelease ( _readIOBuffer, buf ) ;^184^^^^^178^188^_verifyRelease ( buf, _readIOBuffer ) ;^[CLASS] IOContext  [METHOD] releaseReadIOBuffer [RETURN_TYPE] void   byte[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  
[buglab_swap_variables]^_verifyRelease (  _readIOBuffer ) ;^184^^^^^178^188^_verifyRelease ( buf, _readIOBuffer ) ;^[CLASS] IOContext  [METHOD] releaseReadIOBuffer [RETURN_TYPE] void   byte[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  
[buglab_swap_variables]^_verifyRelease ( buf ) ;^184^^^^^178^188^_verifyRelease ( buf, _readIOBuffer ) ;^[CLASS] IOContext  [METHOD] releaseReadIOBuffer [RETURN_TYPE] void   byte[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  
[buglab_swap_variables]^_bufferRecycler.releaseByteBuffer ( BufferRecycler.ByteBufferType.READ_IO_BUFFER ) ;^186^^^^^178^188^_bufferRecycler.releaseByteBuffer ( BufferRecycler.ByteBufferType.READ_IO_BUFFER, buf ) ;^[CLASS] IOContext  [METHOD] releaseReadIOBuffer [RETURN_TYPE] void   byte[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  
[buglab_swap_variables]^_verifyRelease ( _writeEncodingBuffer, buf ) ;^196^^^^^190^200^_verifyRelease ( buf, _writeEncodingBuffer ) ;^[CLASS] IOContext  [METHOD] releaseWriteEncodingBuffer [RETURN_TYPE] void   byte[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  
[buglab_swap_variables]^_verifyRelease (  _writeEncodingBuffer ) ;^196^^^^^190^200^_verifyRelease ( buf, _writeEncodingBuffer ) ;^[CLASS] IOContext  [METHOD] releaseWriteEncodingBuffer [RETURN_TYPE] void   byte[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  
[buglab_swap_variables]^_verifyRelease ( buf ) ;^196^^^^^190^200^_verifyRelease ( buf, _writeEncodingBuffer ) ;^[CLASS] IOContext  [METHOD] releaseWriteEncodingBuffer [RETURN_TYPE] void   byte[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  
[buglab_swap_variables]^_bufferRecycler.releaseByteBuffer ( BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER ) ;^198^^^^^190^200^_bufferRecycler.releaseByteBuffer ( BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER, buf ) ;^[CLASS] IOContext  [METHOD] releaseWriteEncodingBuffer [RETURN_TYPE] void   byte[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  
[buglab_swap_variables]^_verifyRelease ( _base64Buffer, buf ) ;^205^^^^^202^209^_verifyRelease ( buf, _base64Buffer ) ;^[CLASS] IOContext  [METHOD] releaseBase64Buffer [RETURN_TYPE] void   byte[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  
[buglab_swap_variables]^_verifyRelease (  _base64Buffer ) ;^205^^^^^202^209^_verifyRelease ( buf, _base64Buffer ) ;^[CLASS] IOContext  [METHOD] releaseBase64Buffer [RETURN_TYPE] void   byte[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  
[buglab_swap_variables]^_verifyRelease ( buf ) ;^205^^^^^202^209^_verifyRelease ( buf, _base64Buffer ) ;^[CLASS] IOContext  [METHOD] releaseBase64Buffer [RETURN_TYPE] void   byte[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  
[buglab_swap_variables]^_bufferRecycler.releaseByteBuffer ( BufferRecycler.ByteBufferType.BASE64_CODEC_BUFFER ) ;^207^^^^^202^209^_bufferRecycler.releaseByteBuffer ( BufferRecycler.ByteBufferType.BASE64_CODEC_BUFFER, buf ) ;^[CLASS] IOContext  [METHOD] releaseBase64Buffer [RETURN_TYPE] void   byte[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  
[buglab_swap_variables]^_verifyRelease ( _tokenCBuffer, buf ) ;^214^^^^^211^218^_verifyRelease ( buf, _tokenCBuffer ) ;^[CLASS] IOContext  [METHOD] releaseTokenBuffer [RETURN_TYPE] void   char[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  buf  
[buglab_swap_variables]^_verifyRelease (  _tokenCBuffer ) ;^214^^^^^211^218^_verifyRelease ( buf, _tokenCBuffer ) ;^[CLASS] IOContext  [METHOD] releaseTokenBuffer [RETURN_TYPE] void   char[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  buf  
[buglab_swap_variables]^_verifyRelease ( buf ) ;^214^^^^^211^218^_verifyRelease ( buf, _tokenCBuffer ) ;^[CLASS] IOContext  [METHOD] releaseTokenBuffer [RETURN_TYPE] void   char[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  buf  
[buglab_swap_variables]^_bufferRecycler.releaseCharBuffer ( BufferRecycler.CharBufferType.TOKEN_BUFFER ) ;^216^^^^^211^218^_bufferRecycler.releaseCharBuffer ( BufferRecycler.CharBufferType.TOKEN_BUFFER, buf ) ;^[CLASS] IOContext  [METHOD] releaseTokenBuffer [RETURN_TYPE] void   char[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  buf  
[buglab_swap_variables]^_verifyRelease ( _concatCBuffer, buf ) ;^223^^^^^220^227^_verifyRelease ( buf, _concatCBuffer ) ;^[CLASS] IOContext  [METHOD] releaseConcatBuffer [RETURN_TYPE] void   char[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  buf  
[buglab_swap_variables]^_verifyRelease (  _concatCBuffer ) ;^223^^^^^220^227^_verifyRelease ( buf, _concatCBuffer ) ;^[CLASS] IOContext  [METHOD] releaseConcatBuffer [RETURN_TYPE] void   char[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  buf  
[buglab_swap_variables]^_verifyRelease ( buf ) ;^223^^^^^220^227^_verifyRelease ( buf, _concatCBuffer ) ;^[CLASS] IOContext  [METHOD] releaseConcatBuffer [RETURN_TYPE] void   char[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  buf  
[buglab_swap_variables]^_bufferRecycler.releaseCharBuffer ( BufferRecycler.CharBufferType.CONCAT_BUFFER ) ;^225^^^^^220^227^_bufferRecycler.releaseCharBuffer ( BufferRecycler.CharBufferType.CONCAT_BUFFER, buf ) ;^[CLASS] IOContext  [METHOD] releaseConcatBuffer [RETURN_TYPE] void   char[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  buf  
[buglab_swap_variables]^_verifyRelease ( _nameCopyBuffer, buf ) ;^232^^^^^229^236^_verifyRelease ( buf, _nameCopyBuffer ) ;^[CLASS] IOContext  [METHOD] releaseNameCopyBuffer [RETURN_TYPE] void   char[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  buf  
[buglab_swap_variables]^_verifyRelease (  _nameCopyBuffer ) ;^232^^^^^229^236^_verifyRelease ( buf, _nameCopyBuffer ) ;^[CLASS] IOContext  [METHOD] releaseNameCopyBuffer [RETURN_TYPE] void   char[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  buf  
[buglab_swap_variables]^_verifyRelease ( buf ) ;^232^^^^^229^236^_verifyRelease ( buf, _nameCopyBuffer ) ;^[CLASS] IOContext  [METHOD] releaseNameCopyBuffer [RETURN_TYPE] void   char[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  buf  
[buglab_swap_variables]^_bufferRecycler.releaseCharBuffer ( BufferRecycler.CharBufferType.NAME_COPY_BUFFER ) ;^234^^^^^229^236^_bufferRecycler.releaseCharBuffer ( BufferRecycler.CharBufferType.NAME_COPY_BUFFER, buf ) ;^[CLASS] IOContext  [METHOD] releaseNameCopyBuffer [RETURN_TYPE] void   char[] buf [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  sourceRef  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  buf  
[buglab_swap_variables]^if  ( src != toRelease )  {^253^^^^^251^256^if  ( toRelease != src )  {^[CLASS] IOContext  [METHOD] _verifyRelease [RETURN_TYPE] void   Object toRelease Object src [VARIABLES] byte[]  _base64Buffer  _readIOBuffer  _writeEncodingBuffer  buf  boolean  _managedResource  managedResource  JsonEncoding  _encoding  enc  BufferRecycler  _bufferRecycler  br  Object  _sourceRef  buffer  sourceRef  src  toRelease  char[]  _concatCBuffer  _nameCopyBuffer  _tokenCBuffer  buf  
