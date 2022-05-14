[buglab_swap_variables]^return _ptr - _end;^40^^^^^37^43^return _end - _ptr;^[CLASS] MergedStream  [METHOD] available [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  start  
[buglab_swap_variables]^return  ( _in == null )  && _buffer.markSupported (  ) ;^64^^^^^61^65^return  ( _buffer == null )  && _in.markSupported (  ) ;^[CLASS] MergedStream  [METHOD] markSupported [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  readlimit  start  
[buglab_swap_variables]^if  ( _end >= _ptr )  {^72^^^^^68^78^if  ( _ptr >= _end )  {^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  c  end  readlimit  start  
[buglab_swap_variables]^return read ( b.length, 0, b ) ;^83^^^^^81^84^return read ( b, 0, b.length ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  c  end  readlimit  start  
[buglab_swap_variables]^return read (  0, b.length ) ;^83^^^^^81^84^return read ( b, 0, b.length ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  c  end  readlimit  start  
[buglab_swap_variables]^return read ( b, 0 ) ;^83^^^^^81^84^return read ( b, 0, b.length ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  c  end  readlimit  start  
[buglab_swap_variables]^if  ( avail > len )  {^91^^^^^87^102^if  ( len > avail )  {^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^if  ( _end >= _ptr )  {^96^^^^^87^102^if  ( _ptr >= _end )  {^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^int avail = _ptr - _end;^90^^^^^87^102^int avail = _end - _ptr;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^System.arraycopy ( _buffer, b, _ptr, off, len ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^System.arraycopy ( _buffer, _ptr,  off, len ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^System.arraycopy ( _buffer, off, b, _ptr, len ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^System.arraycopy ( _buffer, _ptr, b,  len ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^System.arraycopy ( len, _ptr, b, off, _buffer ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^System.arraycopy ( _buffer, _ptr, b, off ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^System.arraycopy (  _ptr, b, off, len ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^System.arraycopy ( _buffer, len, b, off, _ptr ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^System.arraycopy ( _buffer,  b, off, len ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^System.arraycopy ( b, _ptr, _buffer, off, len ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^System.arraycopy ( _buffer, _ptr, b, len, off ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^System.arraycopy ( _buffer, _ptr, len, off, b ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^System.arraycopy ( _ptr, _buffer, b, off, len ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^return b.read ( _in, off, len ) ;^101^^^^^87^102^return _in.read ( b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^return _in.read (  off, len ) ;^101^^^^^87^102^return _in.read ( b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^return _in.read ( b, len, off ) ;^101^^^^^87^102^return _in.read ( b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^return _in.read ( b,  len ) ;^101^^^^^87^102^return _in.read ( b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^return _in.read ( b, off ) ;^101^^^^^87^102^return _in.read ( b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^return off.read ( b, _in, len ) ;^101^^^^^87^102^return _in.read ( b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^return len.read ( b, off, _in ) ;^101^^^^^87^102^return _in.read ( b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[buglab_swap_variables]^int amount = _ptr - _end;^118^^^^^113^133^int amount = _end - _ptr;^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[buglab_swap_variables]^count += n.skip ( _in ) ;^130^^^^^113^133^count += _in.skip ( n ) ;^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
