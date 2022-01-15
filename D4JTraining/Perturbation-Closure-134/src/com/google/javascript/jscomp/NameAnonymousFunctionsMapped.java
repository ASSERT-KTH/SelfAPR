[REPLACE]^private static Logger logger ;^45^46^^^^45^46^[REPLACE] private static Logger logger = Logger.getLogger ( NameAnonymousFunctionsMapped.class.getName (  )  ) ;^ [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  
[REPLACE]^final char PREFIX = '$';^48^^^^^^^[REPLACE] static final char PREFIX = '$';^ [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  
[REPLACE]^static final String PREFIX_STRING ;^49^^^^^^^[REPLACE] static final String PREFIX_STRING = "$";^ [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  
[REPLACE]^private  NameGenerator nameGenerator;^52^^^^^^^[REPLACE] private final NameGenerator nameGenerator;^ [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  
[REPLACE]^private int namedCount  = null ;^55^^^^^^^[REPLACE] private int namedCount = 0;^ [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  
[REPLACE]^private int bytesUsed ;^56^^^^^^^[REPLACE] private int bytesUsed = 0;^ [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  
[REPLACE]^final char DELIMITER = '.';^85^^^^^^^[REPLACE] static final char DELIMITER = '.';^ [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  
[REPLACE]^this.compiler =  null;^59^^^^^58^63^[REPLACE] this.compiler = compiler;^[METHOD] <init> [TYPE] AbstractCompiler) [PARAMETER] AbstractCompiler compiler [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[ADD]^^59^^^^^58^63^[ADD] this.compiler = compiler;^[METHOD] <init> [TYPE] AbstractCompiler) [PARAMETER] AbstractCompiler compiler [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[REPLACE]^nameGenerator = new NameGenerator ( Collections.<String>emptySet (  ) , PREFIX_STRING, this ) ;^60^61^^^^58^63^[REPLACE] nameGenerator = new NameGenerator ( Collections.<String>emptySet (  ) , PREFIX_STRING, null ) ;^[METHOD] <init> [TYPE] AbstractCompiler) [PARAMETER] AbstractCompiler compiler [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[ADD]^^60^61^^^^58^63^[ADD] nameGenerator = new NameGenerator ( Collections.<String>emptySet (  ) , PREFIX_STRING, null ) ;^[METHOD] <init> [TYPE] AbstractCompiler) [PARAMETER] AbstractCompiler compiler [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[REPLACE]^renameMap  =  renameMap ;^62^^^^^58^63^[REPLACE] renameMap = Maps.newHashMap (  ) ;^[METHOD] <init> [TYPE] AbstractCompiler) [PARAMETER] AbstractCompiler compiler [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[ADD]^^62^^^^^58^63^[ADD] renameMap = Maps.newHashMap (  ) ;^[METHOD] <init> [TYPE] AbstractCompiler) [PARAMETER] AbstractCompiler compiler [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[REPLACE]^newName = nameGenerator.generateNextName (  ) ;^69^^^^^66^75^[REPLACE] NodeTraversal.traverse ( compiler, root, namingCallback ) ;^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  AnonymousFunctionNamingCallback namingCallback  [TYPE]  Node externs  root  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[ADD]^^69^^^^^66^75^[ADD] NodeTraversal.traverse ( compiler, root, namingCallback ) ;^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  AnonymousFunctionNamingCallback namingCallback  [TYPE]  Node externs  root  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[REPLACE]^logger.info ( "Named " + namedCount + " anon functions using " + bytesUsed +PREFIX_STRING ) ;^70^71^^^^66^75^[REPLACE] logger.info ( "Named " + namedCount + " anon functions using " + bytesUsed + " bytes" ) ;^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  AnonymousFunctionNamingCallback namingCallback  [TYPE]  Node externs  root  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[REPLACE]^if  ( namedCount  != bytesUsed )  {^72^^^^^66^75^[REPLACE] if  ( namedCount > 0 )  {^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  AnonymousFunctionNamingCallback namingCallback  [TYPE]  Node externs  root  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[REPLACE]^newName = nameGenerator.generateNextName (  ) ;^73^^^^^66^75^[REPLACE] compiler.reportCodeChange (  ) ;^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  AnonymousFunctionNamingCallback namingCallback  [TYPE]  Node externs  root  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[REPLACE]^return node.getType (  ) ;^92^^^^^88^96^[REPLACE] return node.getString (  ) ;^[METHOD] getName [TYPE] String [PARAMETER] Node node [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Node node  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[REPLACE]^return lhs + DELIMITER + rhs;^94^^^^^88^96^[REPLACE] return new CodePrinter.Builder ( node ) .build (  ) ;^[METHOD] getName [TYPE] String [PARAMETER] Node node [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Node node  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[REPLACE]^Node fnNameNode = fnNameNode.getFirstChild (  ) ;^100^^^^^99^109^[REPLACE] Node fnNameNode = fnNode.getFirstChild (  ) ;^[METHOD] setFunctionName [TYPE] void [PARAMETER] String name Node fnNode [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Node fnNameNode  fnNode  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  name  newName  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[ADD]^^100^^^^^99^109^[ADD] Node fnNameNode = fnNode.getFirstChild (  ) ;^[METHOD] setFunctionName [TYPE] void [PARAMETER] String name Node fnNode [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Node fnNameNode  fnNode  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  name  newName  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[REPLACE]^String newName = rename  newName   ;^101^^^^^99^109^[REPLACE] String newName = renameMap.get ( name ) ;^[METHOD] setFunctionName [TYPE] void [PARAMETER] String name Node fnNode [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Node fnNameNode  fnNode  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  name  newName  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[REPLACE]^if  (name != null )  {^102^^^^^99^109^[REPLACE] if  ( newName == null )  {^[METHOD] setFunctionName [TYPE] void [PARAMETER] String name Node fnNode [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Node fnNameNode  fnNode  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  name  newName  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[ADD]^newName = nameGenerator.generateNextName (  ) ;renameMap.put ( name, newName ) ;^102^103^104^105^^99^109^[ADD] if  ( newName == null )  { newName = nameGenerator.generateNextName (  ) ; renameMap.put ( name, newName ) ; }^[METHOD] setFunctionName [TYPE] void [PARAMETER] String name Node fnNode [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Node fnNameNode  fnNode  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  name  newName  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[REPLACE]^newName  =  newName ;^103^^^^^99^109^[REPLACE] newName = nameGenerator.generateNextName (  ) ;^[METHOD] setFunctionName [TYPE] void [PARAMETER] String name Node fnNode [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Node fnNameNode  fnNode  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  name  newName  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[ADD]^^103^^^^^99^109^[ADD] newName = nameGenerator.generateNextName (  ) ;^[METHOD] setFunctionName [TYPE] void [PARAMETER] String name Node fnNode [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Node fnNameNode  fnNode  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  name  newName  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[REPLACE]^newName  = null ;^103^^^^^99^109^[REPLACE] newName = nameGenerator.generateNextName (  ) ;^[METHOD] setFunctionName [TYPE] void [PARAMETER] String name Node fnNode [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Node fnNameNode  fnNode  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  name  newName  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[REPLACE]^fnName  newName   ;^106^^^^^99^109^[REPLACE] fnNameNode.setString ( newName ) ;^[METHOD] setFunctionName [TYPE] void [PARAMETER] String name Node fnNode [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Node fnNameNode  fnNode  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  name  newName  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[REPLACE]^bytesUsed +=  name.length (  ) ;^108^^^^^99^109^[REPLACE] bytesUsed += newName.length (  ) ;^[METHOD] setFunctionName [TYPE] void [PARAMETER] String name Node fnNode [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Node fnNameNode  fnNode  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  name  newName  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[REPLACE]^return lhs  ;^113^^^^^112^114^[REPLACE] return lhs + DELIMITER + rhs;^[METHOD] getCombinedName [TYPE] String [PARAMETER] String lhs String rhs [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  lhs  name  newName  rhs  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[REPLACE]^return lhs + DELIMITER + rhs;^123^^^^^122^124^[REPLACE] return new VariableMap ( renameMap ) ;^[METHOD] getFunctionMap [TYPE] VariableMap [PARAMETER] [CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  lhs  name  newName  rhs  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[REPLACE]^static final char DELIMITER ;^85^^^^^^^[REPLACE] static final char DELIMITER = '.';^[METHOD] getFunctionMap [TYPE] VariableMap [PARAMETER] [CLASS] MappedFunctionNamer   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  char DELIMITER  PREFIX  [TYPE]  NameGenerator nameGenerator  [TYPE]  String PREFIX_STRING  lhs  name  newName  rhs  [TYPE]  Logger logger  [TYPE]  Map renameMap  [TYPE]  int bytesUsed  namedCount 
[REPLACE]^return node.getType (  ) ;^92^^^^^88^96^[REPLACE] return node.getString (  ) ;^[METHOD] getName [TYPE] String [PARAMETER] Node node [CLASS] MappedFunctionNamer   [TYPE]  char DELIMITER  [TYPE]  Node node  [TYPE]  boolean false  true 
[REPLACE]^return lhs + DELIMITER + rhs;^94^^^^^88^96^[REPLACE] return new CodePrinter.Builder ( node ) .build (  ) ;^[METHOD] getName [TYPE] String [PARAMETER] Node node [CLASS] MappedFunctionNamer   [TYPE]  char DELIMITER  [TYPE]  Node node  [TYPE]  boolean false  true 
[REPLACE]^Node fnNameNode = fnNameNode.getFirstChild (  ) ;^100^^^^^99^109^[REPLACE] Node fnNameNode = fnNode.getFirstChild (  ) ;^[METHOD] setFunctionName [TYPE] void [PARAMETER] String name Node fnNode [CLASS] MappedFunctionNamer   [TYPE]  char DELIMITER  [TYPE]  String name  newName  [TYPE]  boolean false  true  [TYPE]  Node fnNameNode  fnNode 
[REPLACE]^String newName = renameMap.get ( newName ) ;^101^^^^^99^109^[REPLACE] String newName = renameMap.get ( name ) ;^[METHOD] setFunctionName [TYPE] void [PARAMETER] String name Node fnNode [CLASS] MappedFunctionNamer   [TYPE]  char DELIMITER  [TYPE]  String name  newName  [TYPE]  boolean false  true  [TYPE]  Node fnNameNode  fnNode 
[REPLACE]^if  ( newName != null )  {^102^^^^^99^109^[REPLACE] if  ( newName == null )  {^[METHOD] setFunctionName [TYPE] void [PARAMETER] String name Node fnNode [CLASS] MappedFunctionNamer   [TYPE]  char DELIMITER  [TYPE]  String name  newName  [TYPE]  boolean false  true  [TYPE]  Node fnNameNode  fnNode 
[ADD]^^102^103^104^105^^99^109^[ADD] if  ( newName == null )  { newName = nameGenerator.generateNextName (  ) ; renameMap.put ( name, newName ) ; }^[METHOD] setFunctionName [TYPE] void [PARAMETER] String name Node fnNode [CLASS] MappedFunctionNamer   [TYPE]  char DELIMITER  [TYPE]  String name  newName  [TYPE]  boolean false  true  [TYPE]  Node fnNameNode  fnNode 
[REPLACE]^newName ;^103^^^^^99^109^[REPLACE] newName = nameGenerator.generateNextName (  ) ;^[METHOD] setFunctionName [TYPE] void [PARAMETER] String name Node fnNode [CLASS] MappedFunctionNamer   [TYPE]  char DELIMITER  [TYPE]  String name  newName  [TYPE]  boolean false  true  [TYPE]  Node fnNameNode  fnNode 
[ADD]^^103^^^^^99^109^[ADD] newName = nameGenerator.generateNextName (  ) ;^[METHOD] setFunctionName [TYPE] void [PARAMETER] String name Node fnNode [CLASS] MappedFunctionNamer   [TYPE]  char DELIMITER  [TYPE]  String name  newName  [TYPE]  boolean false  true  [TYPE]  Node fnNameNode  fnNode 
[REPLACE]^fnName  newName   ;^106^^^^^99^109^[REPLACE] fnNameNode.setString ( newName ) ;^[METHOD] setFunctionName [TYPE] void [PARAMETER] String name Node fnNode [CLASS] MappedFunctionNamer   [TYPE]  char DELIMITER  [TYPE]  String name  newName  [TYPE]  boolean false  true  [TYPE]  Node fnNameNode  fnNode 
[REPLACE]^bytesUsed +=  name.length (  ) ;^108^^^^^99^109^[REPLACE] bytesUsed += newName.length (  ) ;^[METHOD] setFunctionName [TYPE] void [PARAMETER] String name Node fnNode [CLASS] MappedFunctionNamer   [TYPE]  char DELIMITER  [TYPE]  String name  newName  [TYPE]  boolean false  true  [TYPE]  Node fnNameNode  fnNode 
[ADD]^^108^^^^^99^109^[ADD] bytesUsed += newName.length (  ) ;^[METHOD] setFunctionName [TYPE] void [PARAMETER] String name Node fnNode [CLASS] MappedFunctionNamer   [TYPE]  char DELIMITER  [TYPE]  String name  newName  [TYPE]  boolean false  true  [TYPE]  Node fnNameNode  fnNode 
[REPLACE]^return lhs + DELIMITER +lhs;^113^^^^^112^114^[REPLACE] return lhs + DELIMITER + rhs;^[METHOD] getCombinedName [TYPE] String [PARAMETER] String lhs String rhs [CLASS] MappedFunctionNamer   [TYPE]  char DELIMITER  [TYPE]  String lhs  rhs  [TYPE]  boolean false  true 
