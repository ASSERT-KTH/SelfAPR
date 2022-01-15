[REPLACE]^private static final  short  serialVersionUID = 5947847346149275958L;^41^^^^^^^[REPLACE] private static final long serialVersionUID = 5947847346149275958L;^ [CLASS] CharSet  
[REPLACE]^public static final CharSet EMPTY = new CharSet (  ( String )  false ) ;^47^^^^^^^[REPLACE] public static final CharSet EMPTY = new CharSet (  ( String )  null ) ;^ [CLASS] CharSet  
[REPLACE]^public static final CharSet ASCII_ALPHA ;^53^^^^^^^[REPLACE] public static final CharSet ASCII_ALPHA = new CharSet ( "a-zA-Z" ) ;^ [CLASS] CharSet  
[REPLACE]^public static  CharSet ASCII_ALPHA_LOWER = new CharSet ( "a-z" ) ;^59^^^^^^^[REPLACE] public static final CharSet ASCII_ALPHA_LOWER = new CharSet ( "a-z" ) ;^ [CLASS] CharSet  
[REPLACE]^public static final CharSet ASCII_ALPHA_UPPER  = null ;^65^^^^^^^[REPLACE] public static final CharSet ASCII_ALPHA_UPPER = new CharSet ( "A-Z" ) ;^ [CLASS] CharSet  
[REPLACE]^public static final CharSet ASCII_NUMERIC ;^71^^^^^^^[REPLACE] public static final CharSet ASCII_NUMERIC = new CharSet ( "0-9" ) ;^ [CLASS] CharSet  
[REPLACE]^protected static final Map COMMON ;^78^^^^^^^[REPLACE] protected static final Map COMMON = new HashMap (  ) ;^ [CLASS] CharSet  
[REPLACE]^private Set set  = null ;^91^^^^^^^[REPLACE] private Set set = new HashSet (  ) ;^ [CLASS] CharSet  
[REPLACE]^return set.toString (  ) ;^153^^^^^152^155^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] String setStr [CLASS] CharSet   [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  Set set  [TYPE]  String setStr  [TYPE]  boolean false  true  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID 
[REPLACE]^Object set = COMMON.get ( setStr ) ;^154^^^^^152^155^[REPLACE] add ( setStr ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] String setStr [CLASS] CharSet   [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  Set set  [TYPE]  String setStr  [TYPE]  boolean false  true  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID 
[REPLACE]^return set.toString (  ) ;^165^^^^^164^170^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] String[]) [PARAMETER] String[] set [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String[] set  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int i  sz 
[REPLACE]^int len = str.length (  ) ;^166^^^^^164^170^[REPLACE] int sz = set.length;^[METHOD] <init> [TYPE] String[]) [PARAMETER] String[] set [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String[] set  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int i  sz 
[ADD]^^166^^^^^164^170^[ADD] int sz = set.length;^[METHOD] <init> [TYPE] String[]) [PARAMETER] String[] set [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String[] set  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int i  sz 
[REPLACE]^for  ( int i = 0; i  >  sz; i++ )  {^167^^^^^164^170^[REPLACE] for  ( int i = 0; i < sz; i++ )  {^[METHOD] <init> [TYPE] String[]) [PARAMETER] String[] set [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String[] set  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int i  sz 
[ADD]^^167^168^169^^^164^170^[ADD] for  ( int i = 0; i < sz; i++ )  { add ( set[i] ) ; }^[METHOD] <init> [TYPE] String[]) [PARAMETER] String[] set [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String[] set  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int i  sz 
[REPLACE]^add ( setStr ) ;^168^^^^^164^170^[REPLACE] add ( set[i] ) ;^[METHOD] <init> [TYPE] String[]) [PARAMETER] String[] set [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String[] set  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int i  sz 
[REPLACE]^for  ( int i = 0 - 4; i < sz; i++ )  {^167^^^^^164^170^[REPLACE] for  ( int i = 0; i < sz; i++ )  {^[METHOD] <init> [TYPE] String[]) [PARAMETER] String[] set [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String[] set  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int i  sz 
[REPLACE]^int len = str.length (  ) ;^138^^^^^137^143^[REPLACE] Object set = COMMON.get ( setStr ) ;^[METHOD] getInstance [TYPE] CharSet [PARAMETER] String setStr [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  Object set  [TYPE]  String setStr  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( set == null )  {^139^^^^^137^143^[REPLACE] if  ( set != null )  {^[METHOD] getInstance [TYPE] CharSet [PARAMETER] String setStr [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  Object set  [TYPE]  String setStr  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID 
[ADD]^return  ( CharSet )  set;^139^140^141^^^137^143^[ADD] if  ( set != null )  { return  ( CharSet )  set; }^[METHOD] getInstance [TYPE] CharSet [PARAMETER] String setStr [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  Object set  [TYPE]  String setStr  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID 
[REPLACE]^return false;^140^^^^^137^143^[REPLACE] return  ( CharSet )  set;^[METHOD] getInstance [TYPE] CharSet [PARAMETER] String setStr [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  Object set  [TYPE]  String setStr  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID 
[REPLACE]^return  new CharRange ( str.charAt ( pos )  )  ;^142^^^^^137^143^[REPLACE] return new CharSet ( setStr ) ;^[METHOD] getInstance [TYPE] CharSet [PARAMETER] String setStr [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  Object set  [TYPE]  String setStr  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( str != false )  {^179^^^^^178^205^[REPLACE] if  ( str == null )  {^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^return false;^180^^^^^178^205^[REPLACE] return;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^Object set = COMMON.get ( setStr ) ;^183^^^^^178^205^[REPLACE] int len = str.length (  ) ;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^int pos = 4;^184^^^^^178^205^[REPLACE] int pos = 0;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[ADD]^^184^^^^^178^205^[ADD] int pos = 0;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^while  ( pos  !=  len )  {^185^^^^^178^205^[REPLACE] while  ( pos < len )  {^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^if  (  str.charAt ( pos )  == '^' || str.charAt ( pos + 2 )  == '-' )  {^187^^^^^178^205^[REPLACE] if  ( remainder >= 4 && str.charAt ( pos )  == '^' && str.charAt ( pos + 2 )  == '-' )  {^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^}  if  ( remainder >= 3 ) {^191^^^^^178^205^[REPLACE] } else if  ( remainder >= 3 && str.charAt ( pos + 1 )  == '-' )  {^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^}  else {^195^^^^^178^205^[REPLACE] } else if  ( remainder >= 2 && str.charAt ( pos )  == '^' )  {^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 4; ;^202^^^^^195^203^[REPLACE] pos += 1;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 0;^198^^^^^178^205^[REPLACE] pos += 2;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 2 / 2;^198^^^^^178^205^[REPLACE] pos += 2;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[ADD]^^198^^^^^178^205^[ADD] pos += 2;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 1 - 0;^202^^^^^178^205^[REPLACE] pos += 1;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 3 * 0;^194^^^^^178^205^[REPLACE] pos += 3;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 1; ;^198^^^^^178^205^[REPLACE] pos += 2;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 1;^194^^^^^178^205^[REPLACE] pos += 3;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 1;^198^^^^^178^205^[REPLACE] pos += 2;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 2;^202^^^^^178^205^[REPLACE] pos += 1;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 4 << 4;^190^^^^^178^205^[REPLACE] pos += 4;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[ADD]^^190^^^^^178^205^[ADD] pos += 4;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^}  if  ( remainder >= 3 || str.charAt ( pos + 1 )  == '-' )  {^191^^^^^178^205^[REPLACE] } else if  ( remainder >= 3 && str.charAt ( pos + 1 )  == '-' )  {^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 2;^202^^^^^195^203^[REPLACE] pos += 1;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 2 % 4;^198^^^^^178^205^[REPLACE] pos += 2;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 4;^202^^^^^178^205^[REPLACE] pos += 1;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 1; ;^194^^^^^178^205^[REPLACE] pos += 3;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 3;^198^^^^^178^205^[REPLACE] pos += 2;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 2;^190^^^^^178^205^[REPLACE] pos += 4;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 4;^194^^^^^178^205^[REPLACE] pos += 3;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 1 / 0;^202^^^^^178^205^[REPLACE] pos += 1;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^int remainder =  ( remainder - pos ) ;^186^^^^^178^205^[REPLACE] int remainder =  ( len - pos ) ;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[ADD]^^186^^^^^178^205^[ADD] int remainder =  ( len - pos ) ;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^if  ( remainder >= 4 || str.charAt ( pos )  == '^' || str.charAt ( pos + 2 )  == '-' )  {^187^^^^^178^205^[REPLACE] if  ( remainder >= 4 && str.charAt ( pos )  == '^' && str.charAt ( pos + 2 )  == '-' )  {^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^}  if  (  str.charAt ( pos + 1 )  == '-' )  {^191^^^^^178^205^[REPLACE] } else if  ( remainder >= 3 && str.charAt ( pos + 1 )  == '-' )  {^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 4;^198^^^^^178^205^[REPLACE] pos += 2;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[ADD]^^202^^^^^178^205^[ADD] pos += 1;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^}  if  ( remainder >= 2 % 2 || str.charAt ( pos )  == '^' )  {^195^^^^^178^205^[REPLACE] } else if  ( remainder >= 2 && str.charAt ( pos )  == '^' )  {^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 0;^202^^^^^195^203^[REPLACE] pos += 1;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 5;^190^^^^^178^205^[REPLACE] pos += 4;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^}  if  ( remainder >= 2 / 1 ) {^195^^^^^178^205^[REPLACE] } else if  ( remainder >= 2 && str.charAt ( pos )  == '^' )  {^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 1 >> 3;^202^^^^^195^203^[REPLACE] pos += 1;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 5;^198^^^^^178^205^[REPLACE] pos += 2;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 4; ;^202^^^^^178^205^[REPLACE] pos += 1;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 3 * 2;^194^^^^^178^205^[REPLACE] pos += 3;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^}  if  (  str.charAt ( pos )  == '^' )  {^195^^^^^178^205^[REPLACE] } else if  ( remainder >= 2 && str.charAt ( pos )  == '^' )  {^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 2 * 0;^198^^^^^178^205^[REPLACE] pos += 2;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 1;^190^^^^^178^205^[REPLACE] pos += 4;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^pos += 5;^194^^^^^178^205^[REPLACE] pos += 3;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^int remainder =  (remainder - pos ) ;^186^^^^^178^205^[REPLACE] int remainder =  ( len - pos ) ;^[METHOD] add [TYPE] void [PARAMETER] String str [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  String str  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  int len  pos  remainder 
[REPLACE]^return  ( CharRange[] )  set.toArray ( new CharRange[set.hashCode (  ) ] ) ;^215^^^^^214^216^[REPLACE] return  ( CharRange[] )  set.toArray ( new CharRange[set.size (  ) ] ) ;^[METHOD] getCharRanges [TYPE] CharRange[] [PARAMETER] [CLASS] CharSet   [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( range .CharRange ( ch , ch , true )   )  {^229^^^^^226^234^[REPLACE] if  ( range.contains ( ch )  )  {^[METHOD] contains [TYPE] boolean [PARAMETER] char ch [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  char ch  [TYPE]  Iterator it  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  CharRange range 
[REMOVE]^if  (  ( obj instanceof CharSet )  == false )  {     return false; }^229^^^^^226^234^[REMOVE] ^[METHOD] contains [TYPE] boolean [PARAMETER] char ch [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  char ch  [TYPE]  Iterator it  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  CharRange range 
[REPLACE]^return false;^230^^^^^226^234^[REPLACE] return true;^[METHOD] contains [TYPE] boolean [PARAMETER] char ch [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  char ch  [TYPE]  Iterator it  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  CharRange range 
[REPLACE]^for  ( int i = 0; i < sz; i++ )  {^227^^^^^226^234^[REPLACE] for  ( Iterator it = set.iterator (  ) ; it.hasNext (  ) ; )  {^[METHOD] contains [TYPE] boolean [PARAMETER] char ch [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  char ch  [TYPE]  Iterator it  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  CharRange range 
[ADD]^^227^228^229^230^231^226^234^[ADD] for  ( Iterator it = set.iterator (  ) ; it.hasNext (  ) ; )  { CharRange range =  ( CharRange )  it.next (  ) ; if  ( range.contains ( ch )  )  { return true; }^[METHOD] contains [TYPE] boolean [PARAMETER] char ch [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  char ch  [TYPE]  Iterator it  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  CharRange range 
[REPLACE]^if  ( range .CharRange ( ch , ch , false )   )  {^229^^^^^226^234^[REPLACE] if  ( range.contains ( ch )  )  {^[METHOD] contains [TYPE] boolean [PARAMETER] char ch [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  char ch  [TYPE]  Iterator it  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  CharRange range 
[ADD]^^229^230^231^^^226^234^[ADD] if  ( range.contains ( ch )  )  { return true; }^[METHOD] contains [TYPE] boolean [PARAMETER] char ch [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  char ch  [TYPE]  Iterator it  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  CharRange range 
[REPLACE]^CharRange range =  ( CharRange )  it.hasNext (  ) ;^228^^^^^226^234^[REPLACE] CharRange range =  ( CharRange )  it.next (  ) ;^[METHOD] contains [TYPE] boolean [PARAMETER] char ch [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  char ch  [TYPE]  Iterator it  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  CharRange range 
[REPLACE]^for  ( Iterator it = set.size (  ) ; it.hasNext (  ) ; )  {^227^^^^^226^234^[REPLACE] for  ( Iterator it = set.iterator (  ) ; it.hasNext (  ) ; )  {^[METHOD] contains [TYPE] boolean [PARAMETER] char ch [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  char ch  [TYPE]  Iterator it  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  CharRange range 
[REPLACE]^CharRange range =  ( CharRange )  it .hasNext (  )  ;^228^^^^^226^234^[REPLACE] CharRange range =  ( CharRange )  it.next (  ) ;^[METHOD] contains [TYPE] boolean [PARAMETER] char ch [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  char ch  [TYPE]  Iterator it  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  CharRange range 
[REPLACE]^return true;^233^^^^^226^234^[REPLACE] return false;^[METHOD] contains [TYPE] boolean [PARAMETER] char ch [CLASS] CharSet   [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  char ch  [TYPE]  Iterator it  [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID  [TYPE]  CharRange range 
[REPLACE]^if  ( obj  !=  this )  {^250^^^^^249^258^[REPLACE] if  ( obj == this )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CharSet   [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  other  [TYPE]  Object obj  [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID 
[ADD]^return true;^250^251^252^^^249^258^[ADD] if  ( obj == this )  { return true; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CharSet   [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  other  [TYPE]  Object obj  [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID 
[REPLACE]^return false;^251^^^^^249^258^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CharSet   [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  other  [TYPE]  Object obj  [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( ! obj instanceof CharSet == false )  {^253^^^^^249^258^[REPLACE] if  ( obj instanceof CharSet == false )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CharSet   [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  other  [TYPE]  Object obj  [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID 
[REPLACE]^return true;^254^^^^^249^258^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CharSet   [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  other  [TYPE]  Object obj  [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID 
[REPLACE]^int remainder =  ( len - pos ) ;^256^^^^^249^258^[REPLACE] CharSet other =  ( CharSet )  obj;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CharSet   [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  other  [TYPE]  Object obj  [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID 
[REPLACE]^return set.add ( ASCII_NUMERIC.set ) ;^257^^^^^249^258^[REPLACE] return set.equals ( other.set ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CharSet   [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  other  [TYPE]  Object obj  [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID 
[REPLACE]^return 89 + set.add (  ) ;^267^^^^^266^268^[REPLACE] return 89 + set.hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] CharSet   [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  other  [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID 
[REPLACE]^return set.Object (  ) ;^276^^^^^275^277^[REPLACE] return set.toString (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CharSet   [TYPE]  CharSet ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  other  [TYPE]  Set set  [TYPE]  boolean false  true  [TYPE]  Map COMMON  [TYPE]  long serialVersionUID 
