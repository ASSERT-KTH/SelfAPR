[REPLACE]^private NestableDelegate delegate = new NestableDelegate ( this ) ;^39^^^^^^^[REPLACE] protected NestableDelegate delegate = new NestableDelegate ( this ) ;^ [CLASS] NestableRuntimeException  
[REPLACE]^private Throwable cause  = null ;^45^^^^^^^[REPLACE] private Throwable cause = null;^ [CLASS] NestableRuntimeException  
[REPLACE]^return cause.toString (  ) ;^52^^^^^51^53^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] NestableRuntimeException() [PARAMETER] [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[REPLACE]^return super.getMessage (  ) ;^62^^^^^61^63^[REPLACE] super ( msg ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] String msg [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  String msg  [TYPE]  boolean false  true  [TYPE]  NestableDelegate delegate 
[REMOVE]^return super.getMessage (  ) ;^62^^^^^61^63^[REMOVE] ^[METHOD] <init> [TYPE] String) [PARAMETER] String msg [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  String msg  [TYPE]  boolean false  true  [TYPE]  NestableDelegate delegate 
[REPLACE]^return cause.toString (  ) ;^73^^^^^72^75^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] Throwable) [PARAMETER] Throwable cause [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[ADD]^this.cause = cause;^73^74^^^^72^75^[ADD] super (  ) ; this.cause = cause;^[METHOD] <init> [TYPE] Throwable) [PARAMETER] Throwable cause [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[REPLACE]^this.cause =  null;^74^^^^^72^75^[REPLACE] this.cause = cause;^[METHOD] <init> [TYPE] Throwable) [PARAMETER] Throwable cause [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[ADD]^^74^^^^^72^75^[ADD] this.cause = cause;^[METHOD] <init> [TYPE] Throwable) [PARAMETER] Throwable cause [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[REPLACE]^return super.getMessage (  ) ;^86^^^^^85^88^[REPLACE] super ( msg ) ;^[METHOD] <init> [TYPE] Throwable) [PARAMETER] String msg Throwable cause [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  String msg  [TYPE]  boolean false  true  [TYPE]  NestableDelegate delegate 
[REPLACE]^this.cause =  null;^87^^^^^85^88^[REPLACE] this.cause = cause;^[METHOD] <init> [TYPE] Throwable) [PARAMETER] String msg Throwable cause [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  String msg  [TYPE]  boolean false  true  [TYPE]  NestableDelegate delegate 
[REPLACE]^return super.getMessage (  ) ;^94^^^^^93^95^[REPLACE] return cause;^[METHOD] getCause [TYPE] Throwable [PARAMETER] [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[REPLACE]^if  ( super .printStackTrace (  )   == null )  {^105^^^^^104^112^[REPLACE] if  ( super.getMessage (  )  != null )  {^[METHOD] getMessage [TYPE] String [PARAMETER] [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[REPLACE]^}  else {^107^^^^^104^112^[REPLACE] } else if  ( cause != null )  {^[METHOD] getMessage [TYPE] String [PARAMETER] [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[REPLACE]^return false;^110^^^^^104^112^[REPLACE] return null;^[METHOD] getMessage [TYPE] String [PARAMETER] [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[REPLACE]^return cause.getMessage (  ) ;^108^^^^^104^112^[REPLACE] return cause.toString (  ) ;^[METHOD] getMessage [TYPE] String [PARAMETER] [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[REPLACE]^return super .getMessage (  )  ;^106^^^^^104^112^[REPLACE] return super.getMessage (  ) ;^[METHOD] getMessage [TYPE] String [PARAMETER] [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[REPLACE]^}  if  ( cause == true )  {^107^^^^^104^112^[REPLACE] } else if  ( cause != null )  {^[METHOD] getMessage [TYPE] String [PARAMETER] [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[ADD]^}   return cause.toString (  ) ;return null;^107^108^109^110^111^104^112^[ADD] else if  ( cause != null )  { return cause.toString (  ) ; } else { return null; }^[METHOD] getMessage [TYPE] String [PARAMETER] [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[REPLACE]^return this;^110^^^^^104^112^[REPLACE] return null;^[METHOD] getMessage [TYPE] String [PARAMETER] [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[REPLACE]^return super.toString (  ) ;^106^^^^^104^112^[REPLACE] return super.getMessage (  ) ;^[METHOD] getMessage [TYPE] String [PARAMETER] [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[REPLACE]^return cause .printStackTrace (  )  ;^108^^^^^104^112^[REPLACE] return cause.toString (  ) ;^[METHOD] getMessage [TYPE] String [PARAMETER] [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[REPLACE]^if  ( index  &&  1 )  {^118^^^^^117^123^[REPLACE] if  ( index == 0 )  {^[METHOD] getMessage [TYPE] String [PARAMETER] int index [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  boolean false  true  [TYPE]  NestableDelegate delegate  [TYPE]  int index 
[ADD]^return super.getMessage (  ) ;return delegate.getMessage ( index ) ;^118^119^120^121^122^117^123^[ADD] if  ( index == 0 )  { return super.getMessage (  ) ; } else { return delegate.getMessage ( index ) ; }^[METHOD] getMessage [TYPE] String [PARAMETER] int index [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  boolean false  true  [TYPE]  NestableDelegate delegate  [TYPE]  int index 
[REPLACE]^return delegate.getMessages (  ) ;^121^^^^^117^123^[REPLACE] return delegate.getMessage ( index ) ;^[METHOD] getMessage [TYPE] String [PARAMETER] int index [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  boolean false  true  [TYPE]  NestableDelegate delegate  [TYPE]  int index 
[REPLACE]^return super .getMessage (  )  ;^119^^^^^117^123^[REPLACE] return super.getMessage (  ) ;^[METHOD] getMessage [TYPE] String [PARAMETER] int index [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  boolean false  true  [TYPE]  NestableDelegate delegate  [TYPE]  int index 
[REPLACE]^return super.toString (  ) ;^119^^^^^117^123^[REPLACE] return super.getMessage (  ) ;^[METHOD] getMessage [TYPE] String [PARAMETER] int index [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  boolean false  true  [TYPE]  NestableDelegate delegate  [TYPE]  int index 
[REPLACE]^return delegate.getThrowable ( index ) ;^121^^^^^117^123^[REPLACE] return delegate.getMessage ( index ) ;^[METHOD] getMessage [TYPE] String [PARAMETER] int index [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  boolean false  true  [TYPE]  NestableDelegate delegate  [TYPE]  int index 
[REPLACE]^return delegate.getThrowables (  ) ;^129^^^^^128^130^[REPLACE] return delegate.getMessages (  ) ;^[METHOD] getMessages [TYPE] String[] [PARAMETER] [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[REPLACE]^return delegate.getThrowables (  ) ;^136^^^^^135^137^[REPLACE] return delegate.getThrowable ( index ) ;^[METHOD] getThrowable [TYPE] Throwable [PARAMETER] int index [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  boolean false  true  [TYPE]  NestableDelegate delegate  [TYPE]  int index 
[REPLACE]^return delegate.getThrowables (  ) ;^143^^^^^142^144^[REPLACE] return delegate.getThrowableCount (  ) ;^[METHOD] getThrowableCount [TYPE] int [PARAMETER] [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[REPLACE]^return delegate.getMessages (  ) ;^150^^^^^149^151^[REPLACE] return delegate.getThrowables (  ) ;^[METHOD] getThrowables [TYPE] Throwable[] [PARAMETER] [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[REPLACE]^return delegate .indexOfThrowable ( type )  ;^157^^^^^156^158^[REPLACE] return delegate.indexOfThrowable ( type, 0 ) ;^[METHOD] indexOfThrowable [TYPE] int [PARAMETER] Class type [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  Class type  [TYPE]  boolean false  true  [TYPE]  NestableDelegate delegate 
[REPLACE]^return delegate .indexOfThrowable ( type )  ;^164^^^^^163^165^[REPLACE] return delegate.indexOfThrowable ( type, fromIndex ) ;^[METHOD] indexOfThrowable [TYPE] int [PARAMETER] Class type int fromIndex [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  Class type  [TYPE]  boolean false  true  [TYPE]  NestableDelegate delegate  [TYPE]  int fromIndex 
[REPLACE]^delegate.getMessages (  ) ;^171^^^^^170^172^[REPLACE] delegate.printStackTrace (  ) ;^[METHOD] printStackTrace [TYPE] void [PARAMETER] [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[ADD]^^171^^^^^170^172^[ADD] delegate.printStackTrace (  ) ;^[METHOD] printStackTrace [TYPE] void [PARAMETER] [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  NestableDelegate delegate  [TYPE]  boolean false  true 
[REPLACE]^delegate .getMessage (  )  ;^178^^^^^177^179^[REPLACE] delegate.printStackTrace ( out ) ;^[METHOD] printStackTrace [TYPE] void [PARAMETER] PrintStream out [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  PrintStream out  [TYPE]  boolean false  true  [TYPE]  NestableDelegate delegate 
[ADD]^^178^^^^^177^179^[ADD] delegate.printStackTrace ( out ) ;^[METHOD] printStackTrace [TYPE] void [PARAMETER] PrintStream out [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  PrintStream out  [TYPE]  boolean false  true  [TYPE]  NestableDelegate delegate 
[REPLACE]^delegate .getMessage (  )  ;^185^^^^^184^186^[REPLACE] delegate.printStackTrace ( out ) ;^[METHOD] printStackTrace [TYPE] void [PARAMETER] PrintWriter out [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  boolean false  true  [TYPE]  NestableDelegate delegate  [TYPE]  PrintWriter out 
[ADD]^^185^^^^^184^186^[ADD] delegate.printStackTrace ( out ) ;^[METHOD] printStackTrace [TYPE] void [PARAMETER] PrintWriter out [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  boolean false  true  [TYPE]  NestableDelegate delegate  [TYPE]  PrintWriter out 
[REPLACE]^delegate.printStackTrace ( out ) ;^192^^^^^191^193^[REPLACE] super.printStackTrace ( out ) ;^[METHOD] printPartialStackTrace [TYPE] void [PARAMETER] PrintWriter out [CLASS] NestableRuntimeException   [TYPE]  Throwable cause  [TYPE]  boolean false  true  [TYPE]  NestableDelegate delegate  [TYPE]  PrintWriter out 
