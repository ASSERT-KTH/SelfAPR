[buglab_swap_variables]^this ( lineno, sourceString, 0 ) ;^44^^^^^43^45^this ( sourceString, lineno, 0 ) ;^[CLASS] JsDocTokenStream  [METHOD] <init> [RETURN_TYPE] String,int)   String sourceString int lineno [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  
[buglab_swap_variables]^this (  lineno, 0 ) ;^44^^^^^43^45^this ( sourceString, lineno, 0 ) ;^[CLASS] JsDocTokenStream  [METHOD] <init> [RETURN_TYPE] String,int)   String sourceString int lineno [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  
[buglab_swap_variables]^this ( sourceString,  0 ) ;^44^^^^^43^45^this ( sourceString, lineno, 0 ) ;^[CLASS] JsDocTokenStream  [METHOD] <init> [RETURN_TYPE] String,int)   String sourceString int lineno [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  
[buglab_swap_variables]^if  ( EOF_CHAR == c )  {^69^^^^^54^84^if  ( c == EOF_CHAR )  {^[CLASS] JsDocTokenStream  [METHOD] getJsDocToken [RETURN_TYPE] JsDocToken   [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  c  c1  c2  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  
[buglab_swap_variables]^if  ( c2 == '.' && c1 == '<' )  {^174^^^^^165^192^if  ( c1 == '.' && c2 == '<' )  {^[CLASS] JsDocTokenStream  [METHOD] getJsDocToken [RETURN_TYPE] JsDocToken   [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  c  c1  c2  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  
[buglab_swap_variables]^if  ( c2 == '.' && c1 == '<' )  {^174^^^^^159^189^if  ( c1 == '.' && c2 == '<' )  {^[CLASS] JsDocTokenStream  [METHOD] getJsDocToken [RETURN_TYPE] JsDocToken   [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  c  c1  c2  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  
[buglab_swap_variables]^return initCharno == initLineno? lineno + charno : charno;^231^^^^^230^232^return lineno == initLineno? initCharno + charno : charno;^[CLASS] JsDocTokenStream  [METHOD] getCharno [RETURN_TYPE] int   [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  c  c1  c2  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  
[buglab_swap_variables]^return lineno == charno? initCharno + initLineno : charno;^231^^^^^230^232^return lineno == initLineno? initCharno + charno : charno;^[CLASS] JsDocTokenStream  [METHOD] getCharno [RETURN_TYPE] int   [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  c  c1  c2  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  
[buglab_swap_variables]^return lineno == initLineno? charno + initCharno : charno;^231^^^^^230^232^return lineno == initLineno? initCharno + charno : charno;^[CLASS] JsDocTokenStream  [METHOD] getCharno [RETURN_TYPE] int   [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  c  c1  c2  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  
[buglab_swap_variables]^return new String ( stringBufferTop, 0, stringBuffer ) ;^240^^^^^238^241^return new String ( stringBuffer, 0, stringBufferTop ) ;^[CLASS] JsDocTokenStream  [METHOD] getStringFromBuffer [RETURN_TYPE] String   [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  c  c1  c2  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  
[buglab_swap_variables]^return new String (  0, stringBufferTop ) ;^240^^^^^238^241^return new String ( stringBuffer, 0, stringBufferTop ) ;^[CLASS] JsDocTokenStream  [METHOD] getStringFromBuffer [RETURN_TYPE] String   [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  c  c1  c2  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  
[buglab_swap_variables]^return new String ( stringBuffer, 0 ) ;^240^^^^^238^241^return new String ( stringBuffer, 0, stringBufferTop ) ;^[CLASS] JsDocTokenStream  [METHOD] getStringFromBuffer [RETURN_TYPE] String   [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  c  c1  c2  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  
[buglab_swap_variables]^if  ( stringBuffer.length == N )  {^245^^^^^243^252^if  ( N == stringBuffer.length )  {^[CLASS] JsDocTokenStream  [METHOD] addToString [RETURN_TYPE] void   int c [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  N  c  c1  c2  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  tmp  
[buglab_swap_variables]^System.arraycopy ( tmp, 0, stringBuffer, 0, N ) ;^247^^^^^243^252^System.arraycopy ( stringBuffer, 0, tmp, 0, N ) ;^[CLASS] JsDocTokenStream  [METHOD] addToString [RETURN_TYPE] void   int c [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  N  c  c1  c2  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  tmp  
[buglab_swap_variables]^System.arraycopy ( stringBuffer, 0,  0, N ) ;^247^^^^^243^252^System.arraycopy ( stringBuffer, 0, tmp, 0, N ) ;^[CLASS] JsDocTokenStream  [METHOD] addToString [RETURN_TYPE] void   int c [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  N  c  c1  c2  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  tmp  
[buglab_swap_variables]^System.arraycopy ( stringBuffer, 0, N, 0, tmp ) ;^247^^^^^243^252^System.arraycopy ( stringBuffer, 0, tmp, 0, N ) ;^[CLASS] JsDocTokenStream  [METHOD] addToString [RETURN_TYPE] void   int c [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  N  c  c1  c2  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  tmp  
[buglab_swap_variables]^System.arraycopy ( stringBuffer, 0, tmp, 0 ) ;^247^^^^^243^252^System.arraycopy ( stringBuffer, 0, tmp, 0, N ) ;^[CLASS] JsDocTokenStream  [METHOD] addToString [RETURN_TYPE] void   int c [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  N  c  c1  c2  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  tmp  
[buglab_swap_variables]^System.arraycopy (  0, tmp, 0, N ) ;^247^^^^^243^252^System.arraycopy ( stringBuffer, 0, tmp, 0, N ) ;^[CLASS] JsDocTokenStream  [METHOD] addToString [RETURN_TYPE] void   int c [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  N  c  c1  c2  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  tmp  
[buglab_swap_variables]^if  ( test == c )  {^263^^^^^261^270^if  ( c == test )  {^[CLASS] JsDocTokenStream  [METHOD] matchChar [RETURN_TYPE] boolean   int test [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  N  c  c1  c2  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  test  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  tmp  
[buglab_swap_variables]^if  ( sourceEnd == sourceCursor )  {^350^^^^^335^365^if  ( sourceCursor == sourceEnd )  {^[CLASS] JsDocTokenStream  [METHOD] getChar [RETURN_TYPE] int   [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  N  c  c1  c2  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  test  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  tmp  
[buglab_swap_variables]^if  ( c == '\r' && lineEndChar == '\n' )  {^362^^^^^347^377^if  ( lineEndChar == '\r' && c == '\n' )  {^[CLASS] JsDocTokenStream  [METHOD] getChar [RETURN_TYPE] int   [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  N  c  c1  c2  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  test  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  tmp  
[buglab_swap_variables]^return lineStart - sourceCursor - ungetCursor - 1;^449^^^^^448^450^return sourceCursor - lineStart - ungetCursor - 1;^[CLASS] JsDocTokenStream  [METHOD] getOffset [RETURN_TYPE] int   [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  N  c  c1  c2  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  test  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  tmp  
[buglab_swap_variables]^return sourceCursor - ungetCursor - lineStart - 1;^449^^^^^448^450^return sourceCursor - lineStart - ungetCursor - 1;^[CLASS] JsDocTokenStream  [METHOD] getOffset [RETURN_TYPE] int   [VARIABLES] int[]  ungetBuffer  boolean  hitEOF  String  sourceString  string  int  EOF_CHAR  N  c  c1  c2  charno  cursor  initCharno  initLineno  lineEndChar  lineStart  lineno  sourceCursor  sourceEnd  stringBufferTop  test  tokenBeg  tokenEnd  ungetCursor  char[]  stringBuffer  tmp  
