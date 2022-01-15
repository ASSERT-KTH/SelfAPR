[REPLACE]^this.compiler =  null;^56^^^^^55^58^[REPLACE] this.compiler = compiler;^[METHOD] <init> [TYPE] AbstractCompiler) [PARAMETER] AbstractCompiler compiler [CLASS] MoveFunctionDeclarations   [TYPE]  Map functions  [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true 
[REPLACE]^functions  =  functions ;^57^^^^^55^58^[REPLACE] functions = Maps.newHashMap (  ) ;^[METHOD] <init> [TYPE] AbstractCompiler) [PARAMETER] AbstractCompiler compiler [CLASS] MoveFunctionDeclarations   [TYPE]  Map functions  [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true 
[REPLACE]^NodeTraversal.traverse ( compiler, addingRoot, this ) ;^62^^^^^61^70^[REPLACE] NodeTraversal.traverse ( compiler, root, this ) ;^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] MoveFunctionDeclarations   [TYPE]  JSModule module  [TYPE]  AbstractCompiler compiler  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Map functions  [TYPE]  Node addingRoot  externs  n  root 
[ADD]^^62^^^^^61^70^[ADD] NodeTraversal.traverse ( compiler, root, this ) ;^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] MoveFunctionDeclarations   [TYPE]  JSModule module  [TYPE]  AbstractCompiler compiler  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Map functions  [TYPE]  Node addingRoot  externs  n  root 
[REPLACE]^for  ( Entry<JSModule, List<Node>> entry : functions.entrySet (  )  )  { JSModule module = entry.getKey (  ) ;^63^^^^^61^70^[REPLACE] for  ( Entry<JSModule, List<Node>> entry : functions.entrySet (  )  )  {^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] MoveFunctionDeclarations   [TYPE]  JSModule module  [TYPE]  AbstractCompiler compiler  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Map functions  [TYPE]  Node addingRoot  externs  n  root 
[REPLACE]^JSModule module = false.getKey (  ) ;^64^^^^^61^70^[REPLACE] JSModule module = entry.getKey (  ) ;^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] MoveFunctionDeclarations   [TYPE]  JSModule module  [TYPE]  AbstractCompiler compiler  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Map functions  [TYPE]  Node addingRoot  externs  n  root 
[ADD]^^64^^^^^61^70^[ADD] JSModule module = entry.getKey (  ) ;^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] MoveFunctionDeclarations   [TYPE]  JSModule module  [TYPE]  AbstractCompiler compiler  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Map functions  [TYPE]  Node addingRoot  externs  n  root 
[REPLACE]^Node gramps = n.getAncestor ( 2 ) ;^65^^^^^61^70^[REPLACE] Node addingRoot = compiler.getNodeForCodeInsertion ( module ) ;^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] MoveFunctionDeclarations   [TYPE]  JSModule module  [TYPE]  AbstractCompiler compiler  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Map functions  [TYPE]  Node addingRoot  externs  n  root 
[ADD]^^65^^^^^61^70^[ADD] Node addingRoot = compiler.getNodeForCodeInsertion ( module ) ;^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] MoveFunctionDeclarations   [TYPE]  JSModule module  [TYPE]  AbstractCompiler compiler  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Map functions  [TYPE]  Node addingRoot  externs  n  root 
[REPLACE]^for  ( Node n : Iterables.reverse ( entry.getValue (  )  )  )  { addingRoot.addChildToFront ( n ) ;^66^^^^^61^70^[REPLACE] for  ( Node n : Iterables.reverse ( entry.getValue (  )  )  )  {^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] MoveFunctionDeclarations   [TYPE]  JSModule module  [TYPE]  AbstractCompiler compiler  [TYPE]  Entry entry  [TYPE]  boolean false  true  [TYPE]  Map functions  [TYPE]  Node addingRoot  externs  n  root 
[REPLACE]^Node gramps = n.getAncestor ( 0 ) ;^74^^^^^73^76^[REPLACE] Node gramps = n.getAncestor ( 2 ) ;^[METHOD] shouldTraverse [TYPE] boolean [PARAMETER] NodeTraversal t Node n Node parent [CLASS] MoveFunctionDeclarations   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Map functions  [TYPE]  NodeTraversal t  [TYPE]  Node gramps  n  parent 
[ADD]^^74^^^^^73^76^[ADD] Node gramps = n.getAncestor ( 2 ) ;^[METHOD] shouldTraverse [TYPE] boolean [PARAMETER] NodeTraversal t Node n Node parent [CLASS] MoveFunctionDeclarations   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Map functions  [TYPE]  NodeTraversal t  [TYPE]  Node gramps  n  parent 
[REPLACE]^return gramps ;^75^^^^^73^76^[REPLACE] return gramps == null || gramps.getType (  )  != Token.SCRIPT;^[METHOD] shouldTraverse [TYPE] boolean [PARAMETER] NodeTraversal t Node n Node parent [CLASS] MoveFunctionDeclarations   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  Map functions  [TYPE]  NodeTraversal t  [TYPE]  Node gramps  n  parent 
[REPLACE]^if  ( parent != false || parent.getType (  )  != Token.SCRIPT )  {^80^81^^^^79^97^[REPLACE] if  ( parent == null || parent.getType (  )  != Token.SCRIPT )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] MoveFunctionDeclarations   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  [TYPE]  JSModule module  [TYPE]  List moduleFunctions  [TYPE]  Map functions 
[ADD]^^80^81^82^83^^79^97^[ADD] if  ( parent == null || parent.getType (  )  != Token.SCRIPT )  { return; }^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] MoveFunctionDeclarations   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  [TYPE]  JSModule module  [TYPE]  List moduleFunctions  [TYPE]  Map functions 
[REPLACE]^return gramps == null || gramps.getType (  )  != Token.SCRIPT;^82^^^^^79^97^[REPLACE] return;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] MoveFunctionDeclarations   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  [TYPE]  JSModule module  [TYPE]  List moduleFunctions  [TYPE]  Map functions 
[REPLACE]^if  ( moduleFunctions == null )  {^85^^^^^79^97^[REPLACE] if  ( NodeUtil.isFunctionDeclaration ( n )  )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] MoveFunctionDeclarations   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  [TYPE]  JSModule module  [TYPE]  List moduleFunctions  [TYPE]  Map functions 
[ADD]^parent.removeChild ( n ) ;compiler.reportCodeChange (  ) ;JSModule module = t.getModule (  ) ;^85^86^87^^89^79^97^[ADD] if  ( NodeUtil.isFunctionDeclaration ( n )  )  { parent.removeChild ( n ) ; compiler.reportCodeChange (  ) ; JSModule module = t.getModule (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] MoveFunctionDeclarations   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  [TYPE]  JSModule module  [TYPE]  List moduleFunctions  [TYPE]  Map functions 
[REPLACE]^if  ( moduleFunctions != null )  {^91^^^^^79^97^[REPLACE] if  ( moduleFunctions == null )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] MoveFunctionDeclarations   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  [TYPE]  JSModule module  [TYPE]  List moduleFunctions  [TYPE]  Map functions 
[REPLACE]^moduleFunctions  = null ;^92^^^^^79^97^[REPLACE] moduleFunctions = Lists.newArrayList (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] MoveFunctionDeclarations   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  [TYPE]  JSModule module  [TYPE]  List moduleFunctions  [TYPE]  Map functions 
[REPLACE]^moduleFunctions  =  moduleFunctions ;^92^^^^^79^97^[REPLACE] moduleFunctions = Lists.newArrayList (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] MoveFunctionDeclarations   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  [TYPE]  JSModule module  [TYPE]  List moduleFunctions  [TYPE]  Map functions 
[ADD]^^92^^^^^79^97^[ADD] moduleFunctions = Lists.newArrayList (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] MoveFunctionDeclarations   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  [TYPE]  JSModule module  [TYPE]  List moduleFunctions  [TYPE]  Map functions 
[REPLACE]^JSModule module = entry.getKey (  ) ;^89^^^^^79^97^[REPLACE] JSModule module = t.getModule (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] MoveFunctionDeclarations   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  [TYPE]  JSModule module  [TYPE]  List moduleFunctions  [TYPE]  Map functions 
[REPLACE]^List<Node> moduleFunctions = functions .put ( module , false )  ;^90^^^^^79^97^[REPLACE] List<Node> moduleFunctions = functions.get ( module ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] MoveFunctionDeclarations   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  [TYPE]  JSModule module  [TYPE]  List moduleFunctions  [TYPE]  Map functions 
[REPLACE]^if  ( this != this )  {^91^^^^^79^97^[REPLACE] if  ( moduleFunctions == null )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] MoveFunctionDeclarations   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  [TYPE]  JSModule module  [TYPE]  List moduleFunctions  [TYPE]  Map functions 
[ADD]^^91^92^93^94^^79^97^[ADD] if  ( moduleFunctions == null )  { moduleFunctions = Lists.newArrayList (  ) ; functions.put ( module, moduleFunctions ) ; }^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] MoveFunctionDeclarations   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  [TYPE]  JSModule module  [TYPE]  List moduleFunctions  [TYPE]  Map functions 
[REPLACE]^JSModule module = entry.getKey (  ) ;^90^^^^^79^97^[REPLACE] List<Node> moduleFunctions = functions.get ( module ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] MoveFunctionDeclarations   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  Node n  parent  [TYPE]  JSModule module  [TYPE]  List moduleFunctions  [TYPE]  Map functions 
