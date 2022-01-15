[REPLACE]^static  DiagnosticType UNREACHABLE_CODE = DiagnosticType.error ( "JSC_UNREACHABLE_CODE", "unreachable code" ) ;^35^36^^^^35^36^[REPLACE] static final DiagnosticType UNREACHABLE_CODE = DiagnosticType.error ( "JSC_UNREACHABLE_CODE", "unreachable code" ) ;^ [CLASS] CheckUnreachableCode  
[REPLACE]^private  AbstractCompiler compiler;^38^^^^^^^[REPLACE] private final AbstractCompiler compiler;^ [CLASS] CheckUnreachableCode  
[REPLACE]^private  CheckLevel level;^39^^^^^^^[REPLACE] private final CheckLevel level;^ [CLASS] CheckUnreachableCode  
[REPLACE]^this.compiler =  null;^42^^^^^41^44^[REPLACE] this.compiler = compiler;^[METHOD] <init> [TYPE] CheckLevel) [PARAMETER] AbstractCompiler compiler CheckLevel level [CLASS] CheckUnreachableCode   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  DiagnosticType UNREACHABLE_CODE  [TYPE]  CheckLevel level 
[REPLACE]^this.level =  null;^43^^^^^41^44^[REPLACE] this.level = level;^[METHOD] <init> [TYPE] CheckLevel) [PARAMETER] AbstractCompiler compiler CheckLevel level [CLASS] CheckUnreachableCode   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  DiagnosticType UNREACHABLE_CODE  [TYPE]  CheckLevel level 
[ADD]^^43^^^^^41^44^[ADD] this.level = level;^[METHOD] <init> [TYPE] CheckLevel) [PARAMETER] AbstractCompiler compiler CheckLevel level [CLASS] CheckUnreachableCode   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  DiagnosticType UNREACHABLE_CODE  [TYPE]  CheckLevel level 
[REPLACE]^new GraphReachability<Node, ControlFlowGraph.Branch> ( t.getControlFlowGraph (  )  )  .recompute ( null )  .getValue (  )  ) ;^48^49^50^^^47^51^[REPLACE] new GraphReachability<Node, ControlFlowGraph.Branch> ( t.getControlFlowGraph (  )  ) .compute ( t.getControlFlowGraph (  ) .getEntry (  ) .getValue (  )  ) ;^[METHOD] enterScope [TYPE] void [PARAMETER] NodeTraversal t [CLASS] CheckUnreachableCode   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  DiagnosticType UNREACHABLE_CODE  [TYPE]  CheckLevel level 
[REPLACE]^t.getControlFlowGraph (  )  .getNode ( null )  .getValue (  )  ) ;^50^^^^^47^51^[REPLACE] t.getControlFlowGraph (  ) .getEntry (  ) .getValue (  )  ) ;^[METHOD] enterScope [TYPE] void [PARAMETER] NodeTraversal t [CLASS] CheckUnreachableCode   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  DiagnosticType UNREACHABLE_CODE  [TYPE]  CheckLevel level 
[REPLACE]^t.getControlFlowGraph (  )  .getNode ( this )  .getValue (  )  ) ;^50^^^^^47^51^[REPLACE] t.getControlFlowGraph (  ) .getEntry (  ) .getValue (  )  ) ;^[METHOD] enterScope [TYPE] void [PARAMETER] NodeTraversal t [CLASS] CheckUnreachableCode   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  DiagnosticType UNREACHABLE_CODE  [TYPE]  CheckLevel level 
[ADD]^^50^^^^^47^51^[ADD] t.getControlFlowGraph (  ) .getEntry (  ) .getValue (  )  ) ;^[METHOD] enterScope [TYPE] void [PARAMETER] NodeTraversal t [CLASS] CheckUnreachableCode   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  DiagnosticType UNREACHABLE_CODE  [TYPE]  CheckLevel level 
[REPLACE]^GraphNode<Node, Branch> gNode = t.getControlFlowGraph (  ) .getNode ( n ) ;^50^^^^^47^51^[REPLACE] t.getControlFlowGraph (  ) .getEntry (  ) .getValue (  )  ) ;^[METHOD] enterScope [TYPE] void [PARAMETER] NodeTraversal t [CLASS] CheckUnreachableCode   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  DiagnosticType UNREACHABLE_CODE  [TYPE]  CheckLevel level 
[REPLACE]^GraphNode<Node, Branch> gNode = t.getControlFlowGraph (  ) .getNode ( parent ) ;^55^^^^^54^76^[REPLACE] GraphNode<Node, Branch> gNode = t.getControlFlowGraph (  ) .getNode ( n ) ;^[METHOD] shouldTraverse [TYPE] boolean [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckUnreachableCode   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  DiagnosticType UNREACHABLE_CODE  [TYPE]  CheckLevel level  [TYPE]  Node n  parent  [TYPE]  GraphNode gNode 
[REPLACE]^if  ( gNode == false && gNode.getAnnotation (  )  != GraphReachability.REACHABLE )  {^56^^^^^54^76^[REPLACE] if  ( gNode != null && gNode.getAnnotation (  )  != GraphReachability.REACHABLE )  {^[METHOD] shouldTraverse [TYPE] boolean [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckUnreachableCode   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  DiagnosticType UNREACHABLE_CODE  [TYPE]  CheckLevel level  [TYPE]  Node n  parent  [TYPE]  GraphNode gNode 
[ADD]^^56^57^^^^54^76^[ADD] if  ( gNode != null && gNode.getAnnotation (  )  != GraphReachability.REACHABLE )  {^[METHOD] shouldTraverse [TYPE] boolean [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckUnreachableCode   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  DiagnosticType UNREACHABLE_CODE  [TYPE]  CheckLevel level  [TYPE]  Node n  parent  [TYPE]  GraphNode gNode 
[REPLACE]^if  ( n.getLineno (  )  != -0 ||  n.getType (  )  != Token.EMPTY || n.getType (  )  != Token.BREAK )  {^62^63^64^^^54^76^[REPLACE] if  ( n.getLineno (  )  != -1 &&  n.getType (  )  != Token.EMPTY && n.getType (  )  != Token.BREAK )  {^[METHOD] shouldTraverse [TYPE] boolean [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckUnreachableCode   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  DiagnosticType UNREACHABLE_CODE  [TYPE]  CheckLevel level  [TYPE]  Node n  parent  [TYPE]  GraphNode gNode 
[REPLACE]^return true;^72^^^^^54^76^[REPLACE] return false;^[METHOD] shouldTraverse [TYPE] boolean [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckUnreachableCode   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  DiagnosticType UNREACHABLE_CODE  [TYPE]  CheckLevel level  [TYPE]  Node n  parent  [TYPE]  GraphNode gNode 
[REPLACE]^if  ( n.getLineno (  )  != -1 ) {^62^63^64^^^54^76^[REPLACE] if  ( n.getLineno (  )  != -1 &&  n.getType (  )  != Token.EMPTY && n.getType (  )  != Token.BREAK )  {^[METHOD] shouldTraverse [TYPE] boolean [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckUnreachableCode   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  DiagnosticType UNREACHABLE_CODE  [TYPE]  CheckLevel level  [TYPE]  Node n  parent  [TYPE]  GraphNode gNode 
[ADD]^^62^63^64^65^^54^76^[ADD] if  ( n.getLineno (  )  != -1 &&  n.getType (  )  != Token.EMPTY && n.getType (  )  != Token.BREAK )  { compiler.report ( JSError.make ( t, n, level, UNREACHABLE_CODE )  ) ;^[METHOD] shouldTraverse [TYPE] boolean [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckUnreachableCode   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  DiagnosticType UNREACHABLE_CODE  [TYPE]  CheckLevel level  [TYPE]  Node n  parent  [TYPE]  GraphNode gNode 
[REPLACE]^return false;^75^^^^^54^76^[REPLACE] return true;^[METHOD] shouldTraverse [TYPE] boolean [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CheckUnreachableCode   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  DiagnosticType UNREACHABLE_CODE  [TYPE]  CheckLevel level  [TYPE]  Node n  parent  [TYPE]  GraphNode gNode 
