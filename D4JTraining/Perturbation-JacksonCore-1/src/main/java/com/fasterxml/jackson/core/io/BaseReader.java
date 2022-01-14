[REPLACE]^final protected static int LAST_VALID_UNICODE_CHAR  = null ;^18^^^^^^^[REPLACE] final protected static int LAST_VALID_UNICODE_CHAR = 0x10FFFF;^ [CLASS] BaseReader  
[REPLACE]^final protected static char NULL_BYTE  = null ;^21^^^^^^^[REPLACE] final protected static char NULL_BYTE =  ( byte )  0;^ [CLASS] BaseReader  
[REPLACE]^protected IOContext _context;^23^^^^^^^[REPLACE] final protected IOContext _context;^ [CLASS] BaseReader  
[REPLACE]^private InputStream _in;^25^^^^^^^[REPLACE] protected InputStream _in;^ [CLASS] BaseReader  
[REPLACE]^private byte[] _buffer;^27^^^^^^^[REPLACE] protected byte[] _buffer;^ [CLASS] BaseReader  
[REPLACE]^protected  long  _ptr;^29^^^^^^^[REPLACE] protected int _ptr;^ [CLASS] BaseReader  
[REPLACE]^private  long  _length;^30^^^^^^^[REPLACE] protected int _length;^ [CLASS] BaseReader  
[REPLACE]^protected char[] _tmpBuf  = null ;^66^^^^^^^[REPLACE] protected char[] _tmpBuf = null;^ [CLASS] BaseReader  
