[buglab_swap_variables]^int sz = set.length.length;^166^^^^^164^170^int sz = set.length;^[CLASS] CharSet  [METHOD] <init> [RETURN_TYPE] String[])   String[] set [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  String[]  set  Map  COMMON  long  serialVersionUID  int  i  sz  
[buglab_swap_variables]^int sz = set;^166^^^^^164^170^int sz = set.length;^[CLASS] CharSet  [METHOD] <init> [RETURN_TYPE] String[])   String[] set [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  String[]  set  Map  COMMON  long  serialVersionUID  int  i  sz  
[buglab_swap_variables]^for  ( sznt i = 0; i < i; i++ )  {^167^^^^^164^170^for  ( int i = 0; i < sz; i++ )  {^[CLASS] CharSet  [METHOD] <init> [RETURN_TYPE] String[])   String[] set [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  String[]  set  Map  COMMON  long  serialVersionUID  int  i  sz  
[buglab_swap_variables]^Object set = setStr.get ( COMMON ) ;^138^^^^^137^143^Object set = COMMON.get ( setStr ) ;^[CLASS] CharSet  [METHOD] getInstance [RETURN_TYPE] CharSet   String setStr [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  Object  set  String  setStr  Map  COMMON  long  serialVersionUID  
[buglab_swap_variables]^if  ( pos >= 4 && str.charAt ( remainder )  == '^' && str.charAt ( pos + 2 )  == '-' )  {^187^^^^^178^205^if  ( remainder >= 4 && str.charAt ( pos )  == '^' && str.charAt ( pos + 2 )  == '-' )  {^[CLASS] CharSet  [METHOD] add [RETURN_TYPE] void   String str [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  String  str  Map  COMMON  long  serialVersionUID  int  len  pos  remainder  
[buglab_swap_variables]^} else if  ( str >= 3 && remainder.charAt ( pos + 1 )  == '-' )  {^191^^^^^178^205^} else if  ( remainder >= 3 && str.charAt ( pos + 1 )  == '-' )  {^[CLASS] CharSet  [METHOD] add [RETURN_TYPE] void   String str [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  String  str  Map  COMMON  long  serialVersionUID  int  len  pos  remainder  
[buglab_swap_variables]^} else if  ( remainder >= 3 && pos.charAt ( str + 1 )  == '-' )  {^191^^^^^178^205^} else if  ( remainder >= 3 && str.charAt ( pos + 1 )  == '-' )  {^[CLASS] CharSet  [METHOD] add [RETURN_TYPE] void   String str [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  String  str  Map  COMMON  long  serialVersionUID  int  len  pos  remainder  
[buglab_swap_variables]^} else if  ( pos >= 3 && str.charAt ( remainder + 1 )  == '-' )  {^191^^^^^178^205^} else if  ( remainder >= 3 && str.charAt ( pos + 1 )  == '-' )  {^[CLASS] CharSet  [METHOD] add [RETURN_TYPE] void   String str [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  String  str  Map  COMMON  long  serialVersionUID  int  len  pos  remainder  
[buglab_swap_variables]^} else if  ( pos >= 2 && str.charAt ( remainder )  == '^' )  {^195^^^^^178^205^} else if  ( remainder >= 2 && str.charAt ( pos )  == '^' )  {^[CLASS] CharSet  [METHOD] add [RETURN_TYPE] void   String str [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  String  str  Map  COMMON  long  serialVersionUID  int  len  pos  remainder  
[buglab_swap_variables]^} else if  ( str >= 2 && remainder.charAt ( pos )  == '^' )  {^195^^^^^178^205^} else if  ( remainder >= 2 && str.charAt ( pos )  == '^' )  {^[CLASS] CharSet  [METHOD] add [RETURN_TYPE] void   String str [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  String  str  Map  COMMON  long  serialVersionUID  int  len  pos  remainder  
[buglab_swap_variables]^set.add ( new CharRange ( pos.charAt ( str )  )  ) ;^201^^^^^195^203^set.add ( new CharRange ( str.charAt ( pos )  )  ) ;^[CLASS] CharSet  [METHOD] add [RETURN_TYPE] void   String str [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  String  str  Map  COMMON  long  serialVersionUID  int  len  pos  remainder  
[buglab_swap_variables]^set.add ( new CharRange ( pos.charAt ( str + 1 ) , true )  ) ;^197^^^^^178^205^set.add ( new CharRange ( str.charAt ( pos + 1 ) , true )  ) ;^[CLASS] CharSet  [METHOD] add [RETURN_TYPE] void   String str [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  String  str  Map  COMMON  long  serialVersionUID  int  len  pos  remainder  
[buglab_swap_variables]^set.add ( new CharRange ( pos.charAt ( str )  )  ) ;^201^^^^^178^205^set.add ( new CharRange ( str.charAt ( pos )  )  ) ;^[CLASS] CharSet  [METHOD] add [RETURN_TYPE] void   String str [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  String  str  Map  COMMON  long  serialVersionUID  int  len  pos  remainder  
[buglab_swap_variables]^} else if  ( remainder >= 2 && pos.charAt ( str )  == '^' )  {^195^^^^^178^205^} else if  ( remainder >= 2 && str.charAt ( pos )  == '^' )  {^[CLASS] CharSet  [METHOD] add [RETURN_TYPE] void   String str [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  String  str  Map  COMMON  long  serialVersionUID  int  len  pos  remainder  
[buglab_swap_variables]^set.add ( new CharRange ( pos.charAt ( str ) , str.charAt ( pos + 2 )  )  ) ;^193^^^^^178^205^set.add ( new CharRange ( str.charAt ( pos ) , str.charAt ( pos + 2 )  )  ) ;^[CLASS] CharSet  [METHOD] add [RETURN_TYPE] void   String str [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  String  str  Map  COMMON  long  serialVersionUID  int  len  pos  remainder  
[buglab_swap_variables]^set.add ( new CharRange ( str.charAt ( pos ) .charAt ( pos + 2 )  )  ) ;^193^^^^^178^205^set.add ( new CharRange ( str.charAt ( pos ) , str.charAt ( pos + 2 )  )  ) ;^[CLASS] CharSet  [METHOD] add [RETURN_TYPE] void   String str [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  String  str  Map  COMMON  long  serialVersionUID  int  len  pos  remainder  
[buglab_swap_variables]^set.add ( new CharRange ( pos.charAt ( str + 1 ) , str.charAt ( pos + 3 ) , true )  ) ;^189^^^^^178^205^set.add ( new CharRange ( str.charAt ( pos + 1 ) , str.charAt ( pos + 3 ) , true )  ) ;^[CLASS] CharSet  [METHOD] add [RETURN_TYPE] void   String str [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  String  str  Map  COMMON  long  serialVersionUID  int  len  pos  remainder  
[buglab_swap_variables]^set.add ( new CharRange ( str.charAt ( pos + 1 ) .charAt ( pos + 3 ) , true )  ) ;^189^^^^^178^205^set.add ( new CharRange ( str.charAt ( pos + 1 ) , str.charAt ( pos + 3 ) , true )  ) ;^[CLASS] CharSet  [METHOD] add [RETURN_TYPE] void   String str [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  String  str  Map  COMMON  long  serialVersionUID  int  len  pos  remainder  
[buglab_swap_variables]^int remainder =  ( pos - len ) ;^186^^^^^178^205^int remainder =  ( len - pos ) ;^[CLASS] CharSet  [METHOD] add [RETURN_TYPE] void   String str [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  String  str  Map  COMMON  long  serialVersionUID  int  len  pos  remainder  
[buglab_swap_variables]^if  ( remainder >= 4 && pos.charAt ( str )  == '^' && str.charAt ( pos + 2 )  == '-' )  {^187^^^^^178^205^if  ( remainder >= 4 && str.charAt ( pos )  == '^' && str.charAt ( pos + 2 )  == '-' )  {^[CLASS] CharSet  [METHOD] add [RETURN_TYPE] void   String str [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  String  str  Map  COMMON  long  serialVersionUID  int  len  pos  remainder  
[buglab_swap_variables]^if  ( str >= 4 && remainder.charAt ( pos )  == '^' && str.charAt ( pos + 2 )  == '-' )  {^187^^^^^178^205^if  ( remainder >= 4 && str.charAt ( pos )  == '^' && str.charAt ( pos + 2 )  == '-' )  {^[CLASS] CharSet  [METHOD] add [RETURN_TYPE] void   String str [VARIABLES] Set  set  boolean  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  String  str  Map  COMMON  long  serialVersionUID  int  len  pos  remainder  
[buglab_swap_variables]^if  ( ch.contains ( range )  )  {^229^^^^^226^234^if  ( range.contains ( ch )  )  {^[CLASS] CharSet  [METHOD] contains [RETURN_TYPE] boolean   char ch [VARIABLES] Set  set  boolean  char  ch  Iterator  it  CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  Map  COMMON  long  serialVersionUID  CharRange  range  
[buglab_swap_variables]^return other.equals ( set.set ) ;^257^^^^^249^258^return set.equals ( other.set ) ;^[CLASS] CharSet  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  other  Object  obj  Set  set  boolean  Map  COMMON  long  serialVersionUID  
[buglab_swap_variables]^return other.set.equals ( set ) ;^257^^^^^249^258^return set.equals ( other.set ) ;^[CLASS] CharSet  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] CharSet  ASCII_ALPHA  ASCII_ALPHA_LOWER  ASCII_ALPHA_UPPER  ASCII_NUMERIC  EMPTY  other  Object  obj  Set  set  boolean  Map  COMMON  long  serialVersionUID  
