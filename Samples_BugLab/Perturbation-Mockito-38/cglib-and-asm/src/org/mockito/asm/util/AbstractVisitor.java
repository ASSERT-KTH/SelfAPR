[buglab_swap_variables]^printList ( text, pw ) ;^138^^^^^137^139^printList ( pw, text ) ;^[CLASS] AbstractVisitor  [METHOD] print [RETURN_TYPE] void   PrintWriter pw [VARIABLES] StringBuffer  buf  List  text  String[]  OPCODES  TYPES  boolean  PrintWriter  pw  
[buglab_swap_variables]^printList (  text ) ;^138^^^^^137^139^printList ( pw, text ) ;^[CLASS] AbstractVisitor  [METHOD] print [RETURN_TYPE] void   PrintWriter pw [VARIABLES] StringBuffer  buf  List  text  String[]  OPCODES  TYPES  boolean  PrintWriter  pw  
[buglab_swap_variables]^printList ( pw ) ;^138^^^^^137^139^printList ( pw, text ) ;^[CLASS] AbstractVisitor  [METHOD] print [RETURN_TYPE] void   PrintWriter pw [VARIABLES] StringBuffer  buf  List  text  String[]  OPCODES  TYPES  boolean  PrintWriter  pw  
[buglab_swap_variables]^buf.append ( Integer.toString (  16 )  ) ;^168^^^^^147^174^buf.append ( Integer.toString ( c, 16 )  ) ;^[CLASS] AbstractVisitor  [METHOD] appendString [RETURN_TYPE] void   StringBuffer buf String s [VARIABLES] StringBuffer  buf  boolean  char  c  List  text  String[]  OPCODES  TYPES  String  s  int  i  
[buglab_swap_variables]^for  ( snt i = 0; i < i.length (  ) ; ++i )  {^149^^^^^147^174^for  ( int i = 0; i < s.length (  ) ; ++i )  {^[CLASS] AbstractVisitor  [METHOD] appendString [RETURN_TYPE] void   StringBuffer buf String s [VARIABLES] StringBuffer  buf  boolean  char  c  List  text  String[]  OPCODES  TYPES  String  s  int  i  
[buglab_swap_variables]^char c = i.charAt ( s ) ;^150^^^^^147^174^char c = s.charAt ( i ) ;^[CLASS] AbstractVisitor  [METHOD] appendString [RETURN_TYPE] void   StringBuffer buf String s [VARIABLES] StringBuffer  buf  boolean  char  c  List  text  String[]  OPCODES  TYPES  String  s  int  i  
[buglab_swap_variables]^printList (   ( List )  o ) ;^187^^^^^183^192^printList ( pw,  ( List )  o ) ;^[CLASS] AbstractVisitor  [METHOD] printList [RETURN_TYPE] void   PrintWriter pw List l [VARIABLES] StringBuffer  buf  boolean  List  l  text  Object  o  String[]  OPCODES  TYPES  int  i  PrintWriter  pw  
[buglab_swap_variables]^Object o = i.get ( l ) ;^185^^^^^183^192^Object o = l.get ( i ) ;^[CLASS] AbstractVisitor  [METHOD] printList [RETURN_TYPE] void   PrintWriter pw List l [VARIABLES] StringBuffer  buf  boolean  List  l  text  Object  o  String[]  OPCODES  TYPES  int  i  PrintWriter  pw  
