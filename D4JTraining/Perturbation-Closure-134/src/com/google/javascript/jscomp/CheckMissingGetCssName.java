[REPLACE]^private  AbstractCompiler compiler;^33^^^^^^^[REPLACE] private final AbstractCompiler compiler;^ [CLASS] CheckMissingGetCssName  
[REPLACE]^private  CheckLevel level;^34^^^^^^^[REPLACE] private final CheckLevel level;^ [CLASS] CheckMissingGetCssName  
[REPLACE]^static  String GET_CSS_NAME_FUNCTION = "goog.getCssName";^37^^^^^^^[REPLACE] static final String GET_CSS_NAME_FUNCTION = "goog.getCssName";^ [CLASS] CheckMissingGetCssName  
[REPLACE]^static final String GET_UNIQUE_ID_FUNCTION ;^38^^^^^^^[REPLACE] static final String GET_UNIQUE_ID_FUNCTION = "goog.events.getUniqueId";^ [CLASS] CheckMissingGetCssName  
[REPLACE]^static final DiagnosticType MISSING_GETCSSNAME  = null ;^40^41^42^43^^40^43^[REPLACE] static final DiagnosticType MISSING_GETCSSNAME = DiagnosticType.disabled ( "JSC_MISSING_GETCSSNAME", "missing goog.getCssName around literal ''{0}''" ) ;^ [CLASS] CheckMissingGetCssName  
[REPLACE]^this.compiler =  null;^47^^^^^45^51^[REPLACE] this.compiler = compiler;^[METHOD] <init> [TYPE] String) [PARAMETER] AbstractCompiler compiler CheckLevel level String blacklistRegex [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME 
[REPLACE]^this.level =  null;^48^^^^^45^51^[REPLACE] this.level = level;^[METHOD] <init> [TYPE] String) [PARAMETER] AbstractCompiler compiler CheckLevel level String blacklistRegex [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME 
[REPLACE]^this.blacklist = Pattern.compile ( "\\b ( ?:"  |  blacklistRegex  |  " ) " ) .matcher ( "" ) ;^49^50^^^^45^51^[REPLACE] this.blacklist = Pattern.compile ( "\\b ( ?:" + blacklistRegex + " ) " ) .matcher ( "" ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] AbstractCompiler compiler CheckLevel level String blacklistRegex [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME 
[REPLACE]^if  ( insideAssignmentToIdConstant ( n, parent )  )  { continue;^58^^^^^57^59^[REPLACE] NodeTraversal.traverse ( compiler, root, this ) ;^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node externs  root  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex 
[REPLACE]^if  ( n.getType (  )  == Token.STRING || parent.getType (  )  != Token.GETPROP || parent.getType (  )  != Token.REGEXP || !NodeUtil.isObjectLitKey ( n, parent )  )  {^66^67^68^69^^65^86^[REPLACE] if  ( n.getType (  )  == Token.STRING && parent.getType (  )  != Token.GETPROP && parent.getType (  )  != Token.REGEXP && !NodeUtil.isObjectLitKey ( n, parent )  )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  NodeTraversal t  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  s 
[ADD]^^66^67^68^69^70^65^86^[ADD] if  ( n.getType (  )  == Token.STRING && parent.getType (  )  != Token.GETPROP && parent.getType (  )  != Token.REGEXP && !NodeUtil.isObjectLitKey ( n, parent )  )  { String s = n.getString (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  NodeTraversal t  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  s 
[REPLACE]^if  ( insideGetUniqueIdCall ( n, parent )  )  {^73^^^^^65^86^[REPLACE] if  ( insideGetCssNameCall ( n, parent )  )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  NodeTraversal t  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  s 
[REPLACE]^if  ( insideGetCssNameCall ( n, parent )  )  {^76^^^^^65^86^[REPLACE] if  ( insideGetUniqueIdCall ( n, parent )  )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  NodeTraversal t  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  s 
[REPLACE]^if  ( parent.getType (  )  == Token.ASSIGN )  {^79^^^^^65^86^[REPLACE] if  ( insideAssignmentToIdConstant ( n, parent )  )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  NodeTraversal t  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  s 
[REPLACE]^for  ( blacklist.reset ( s ) ; blacklist.group (  ) ; )  {^72^^^^^65^86^[REPLACE] for  ( blacklist.reset ( s ) ; blacklist.find (  ) ; )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  NodeTraversal t  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  s 
[ADD]^continue;^76^77^78^^^65^86^[ADD] if  ( insideGetUniqueIdCall ( n, parent )  )  { continue; }^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  NodeTraversal t  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  s 
[REPLACE]^String s = parent.getParent (  ) ;^70^^^^^65^86^[REPLACE] String s = n.getString (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  NodeTraversal t  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  s 
[REMOVE]^if  ( insideGetUniqueIdCall ( n, parent )  )  {     continue; }^73^^^^^65^86^[REMOVE] ^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  NodeTraversal t  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  s 
[REMOVE]^if  ( insideGetUniqueIdCall ( n, parent )  )  {     continue; }^79^^^^^65^86^[REMOVE] ^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  NodeTraversal t  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  s 
[REPLACE]^for  ( blacklist.reset ( blacklistRegex ) ; blacklist.find (  ) ; )  {^72^^^^^65^86^[REPLACE] for  ( blacklist.reset ( s ) ; blacklist.find (  ) ; )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  NodeTraversal t  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  s 
[ADD]^^72^73^74^75^^65^86^[ADD] for  ( blacklist.reset ( s ) ; blacklist.find (  ) ; )  { if  ( insideGetCssNameCall ( n, parent )  )  { continue; }^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  NodeTraversal t  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  s 
[ADD]^continue;^79^80^81^^^65^86^[ADD] if  ( insideAssignmentToIdConstant ( n, parent )  )  { continue; }^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  NodeTraversal t  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  s 
[REPLACE]^String s = parent.getString (  ) ;^70^^^^^65^86^[REPLACE] String s = n.getString (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  NodeTraversal t  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  s 
[REPLACE]^return parent.getType (  )  ;^90^91^92^^^89^93^[REPLACE] return parent.getType (  )  == Token.CALL && GET_CSS_NAME_FUNCTION.equals ( parent.getFirstChild (  ) .getQualifiedName (  )  ) ;^[METHOD] insideGetCssNameCall [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  s 
[REPLACE]^return parent.getType (  )  == Token.CALL && GET_UNIQUE_ID_FUNCTION .endsWith ( GET_UNIQUE_ID_FUNCTION )   ) ;^100^101^102^^^99^103^[REPLACE] return parent.getType (  )  == Token.CALL && GET_UNIQUE_ID_FUNCTION.equals ( parent.getFirstChild (  ) .getQualifiedName (  )  ) ;^[METHOD] insideGetUniqueIdCall [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  s 
[REPLACE]^if  ( parent.getType (  )   !=  Token.ASSIGN )  {^110^^^^^109^124^[REPLACE] if  ( parent.getType (  )  == Token.ASSIGN )  {^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[REPLACE]^} else if  ( parent.getType (  )   !=  Token.NAME )  {^113^^^^^109^124^[REPLACE] } else if  ( parent.getType (  )  == Token.NAME )  {^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[REPLACE]^return true;^122^^^^^109^124^[REPLACE] return false;^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[REPLACE]^if  ( grandParent != null ) {^115^^^^^109^124^[REPLACE] if  ( grandParent != null && grandParent.getType (  )  == Token.VAR )  {^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[REPLACE]^return true;^119^^^^^109^124^[REPLACE] return false;^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[REPLACE]^return isIdName ( qname ) ;^117^^^^^109^124^[REPLACE] return isIdName ( name ) ;^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[REPLACE]^String name = n.getParent (  ) ;^116^^^^^109^124^[REPLACE] String name = parent.getString (  ) ;^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[REPLACE]^return false;^117^^^^^109^124^[REPLACE] return isIdName ( name ) ;^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[REPLACE]^Node grandParent = n.getParent (  ) ;^114^^^^^109^124^[REPLACE] Node grandParent = parent.getParent (  ) ;^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[ADD]^^114^^^^^109^124^[ADD] Node grandParent = parent.getParent (  ) ;^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[REPLACE]^String name = n.getString (  ) ;^116^^^^^109^124^[REPLACE] String name = parent.getString (  ) ;^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[ADD]^return isIdName ( name ) ;^116^117^^^^109^124^[ADD] String name = parent.getString (  ) ; return isIdName ( name ) ;^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[ADD]^^116^117^^^^109^124^[ADD] String name = parent.getString (  ) ; return isIdName ( name ) ;^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[REPLACE]^return   isIdName ( qname ) ;^112^^^^^109^124^[REPLACE] return qname != null && isIdName ( qname ) ;^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[REPLACE]^String qname = n.getFirstChild (  ) .getQualifiedName (  ) ;^111^^^^^109^124^[REPLACE] String qname = parent.getFirstChild (  ) .getQualifiedName (  ) ;^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[ADD]^return qname != null && isIdName ( qname ) ;Node grandParent = parent.getParent (  ) ;^111^112^113^114^^109^124^[ADD] String qname = parent.getFirstChild (  ) .getQualifiedName (  ) ; return qname != null && isIdName ( qname ) ; } else if  ( parent.getType (  )  == Token.NAME )  { Node grandParent = parent.getParent (  ) ;^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[REPLACE]^}  if  ( parent.getType (  )   !=  Token.NAME )  {^113^^^^^109^124^[REPLACE] } else if  ( parent.getType (  )  == Token.NAME )  {^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[REPLACE]^if  (  grandParent.getType (  )  != Token.VAR )  {^115^^^^^109^124^[REPLACE] if  ( grandParent != null && grandParent.getType (  )  == Token.VAR )  {^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[REPLACE]^Node grandParent = parent.getString (  ) ;^114^^^^^109^124^[REPLACE] Node grandParent = parent.getParent (  ) ;^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[REPLACE]^if  ( grandParent != null && grandParent.getType (  )  != Token.VAR )  {^115^^^^^109^124^[REPLACE] if  ( grandParent != null && grandParent.getType (  )  == Token.VAR )  {^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[REPLACE]^return qname ;^112^^^^^109^124^[REPLACE] return qname != null && isIdName ( qname ) ;^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[REPLACE]^String qname = parent.getString (  ) .getQualifiedName (  ) ;^111^^^^^109^124^[REPLACE] String qname = parent.getFirstChild (  ) .getQualifiedName (  ) ;^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[ADD]^^111^112^113^114^^109^124^[ADD] String qname = parent.getFirstChild (  ) .getQualifiedName (  ) ; return qname != null && isIdName ( qname ) ; } else if  ( parent.getType (  )  == Token.NAME )  { Node grandParent = parent.getParent (  ) ;^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[REPLACE]^String name = parent.getParent (  ) ;^116^^^^^109^124^[REPLACE] String name = parent.getString (  ) ;^[METHOD] insideAssignmentToIdConstant [TYPE] boolean [PARAMETER] Node n Node parent [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME  [TYPE]  Node grandParent  n  parent  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s 
[REPLACE]^return qname.equals ( "ID" )  || name.endsWith ( "ID_" ) ;^127^^^^^126^128^[REPLACE] return name.endsWith ( "ID" )  || name.endsWith ( "ID_" ) ;^[METHOD] isIdName [TYPE] boolean [PARAMETER] String name [CLASS] CheckMissingGetCssName   [TYPE]  AbstractCompiler compiler  [TYPE]  String GET_CSS_NAME_FUNCTION  GET_UNIQUE_ID_FUNCTION  blacklistRegex  name  qname  s  [TYPE]  boolean false  true  [TYPE]  Matcher blacklist  [TYPE]  CheckLevel level  [TYPE]  DiagnosticType MISSING_GETCSSNAME 
