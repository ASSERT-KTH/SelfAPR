[buglab_swap_variables]^if  ( isTestFunction ( functionName, n )  && t.inGlobalScope (  )  )  {^58^^^^^54^62^if  ( isTestFunction ( n, functionName )  && t.inGlobalScope (  )  )  {^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  boolean  NodeTraversal  t  Node  n  parent  
[buglab_swap_variables]^if  ( isTestFunction (  functionName )  && t.inGlobalScope (  )  )  {^58^^^^^54^62^if  ( isTestFunction ( n, functionName )  && t.inGlobalScope (  )  )  {^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  boolean  NodeTraversal  t  Node  n  parent  
[buglab_swap_variables]^if  ( isTestFunction ( n )  && t.inGlobalScope (  )  )  {^58^^^^^54^62^if  ( isTestFunction ( n, functionName )  && t.inGlobalScope (  )  )  {^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  boolean  NodeTraversal  t  Node  n  parent  
[buglab_swap_variables]^if  ( isTestFunction ( t, functionName )  && n.inGlobalScope (  )  )  {^58^^^^^54^62^if  ( isTestFunction ( n, functionName )  && t.inGlobalScope (  )  )  {^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  boolean  NodeTraversal  t  Node  n  parent  
[buglab_swap_variables]^exportTestFunction ( parent, n, functionName ) ;^59^^^^^54^62^exportTestFunction ( functionName, n, parent ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  boolean  NodeTraversal  t  Node  n  parent  
[buglab_swap_variables]^exportTestFunction (  n, parent ) ;^59^^^^^54^62^exportTestFunction ( functionName, n, parent ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  boolean  NodeTraversal  t  Node  n  parent  
[buglab_swap_variables]^exportTestFunction ( functionName, parent, n ) ;^59^^^^^54^62^exportTestFunction ( functionName, n, parent ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  boolean  NodeTraversal  t  Node  n  parent  
[buglab_swap_variables]^exportTestFunction ( functionName,  parent ) ;^59^^^^^54^62^exportTestFunction ( functionName, n, parent ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  boolean  NodeTraversal  t  Node  n  parent  
[buglab_swap_variables]^exportTestFunction ( functionName, n ) ;^59^^^^^54^62^exportTestFunction ( functionName, n, parent ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  boolean  NodeTraversal  t  Node  n  parent  
[buglab_swap_variables]^String functionName = NodeUtil.getFunctionName ( parent, n ) ;^57^^^^^54^62^String functionName = NodeUtil.getFunctionName ( n, parent ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  boolean  NodeTraversal  t  Node  n  parent  
[buglab_swap_variables]^String functionName = NodeUtil.getFunctionName (  parent ) ;^57^^^^^54^62^String functionName = NodeUtil.getFunctionName ( n, parent ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  boolean  NodeTraversal  t  Node  n  parent  
[buglab_swap_variables]^String functionName = NodeUtil.getFunctionName ( n ) ;^57^^^^^54^62^String functionName = NodeUtil.getFunctionName ( n, parent ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  boolean  NodeTraversal  t  Node  n  parent  
[buglab_swap_variables]^exportTestFunction ( n, functionName, parent ) ;^59^^^^^54^62^exportTestFunction ( functionName, n, parent ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  boolean  NodeTraversal  t  Node  n  parent  
[buglab_swap_variables]^if  ( isTestFunction ( n, t )  && functionName.inGlobalScope (  )  )  {^58^^^^^54^62^if  ( isTestFunction ( n, functionName )  && t.inGlobalScope (  )  )  {^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  boolean  NodeTraversal  t  Node  n  parent  
[buglab_swap_variables]^NodeTraversal.traverse ( root, compiler, new ExportTestFunctionsNodes (  )  ) ;^66^^^^^65^67^NodeTraversal.traverse ( compiler, root, new ExportTestFunctionsNodes (  )  ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  boolean  Node  externs  root  
[buglab_swap_variables]^NodeTraversal.traverse ( compiler,  new ExportTestFunctionsNodes (  )  ) ;^66^^^^^65^67^NodeTraversal.traverse ( compiler, root, new ExportTestFunctionsNodes (  )  ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  boolean  Node  externs  root  
[buglab_swap_variables]^NodeTraversal.traverse (  root, new ExportTestFunctionsNodes (  )  ) ;^66^^^^^65^67^NodeTraversal.traverse ( compiler, root, new ExportTestFunctionsNodes (  )  ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  boolean  Node  externs  root  
[buglab_swap_variables]^Node call = new Node ( Token.CALL, NodeUtil.newQualifiedNameNode ( node, exportSymbolFunction, testFunctionName )  ) ;^73^74^^^^70^83^Node call = new Node ( Token.CALL, NodeUtil.newQualifiedNameNode ( exportSymbolFunction, node, testFunctionName )  ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] exportTestFunction [RETURN_TYPE] void   String testFunctionName Node node Node scriptNode [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  testFunctionName  boolean  Node  call  expression  node  scriptNode  
[buglab_swap_variables]^Node call = new Node ( Token.CALL, NodeUtil.newQualifiedNameNode ( exportSymbolFunction,  testFunctionName )  ) ;^73^74^^^^70^83^Node call = new Node ( Token.CALL, NodeUtil.newQualifiedNameNode ( exportSymbolFunction, node, testFunctionName )  ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] exportTestFunction [RETURN_TYPE] void   String testFunctionName Node node Node scriptNode [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  testFunctionName  boolean  Node  call  expression  node  scriptNode  
[buglab_swap_variables]^Node call = new Node ( Token.CALL, NodeUtil.newQualifiedNameNode ( testFunctionName, node, exportSymbolFunction )  ) ;^73^74^^^^70^83^Node call = new Node ( Token.CALL, NodeUtil.newQualifiedNameNode ( exportSymbolFunction, node, testFunctionName )  ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] exportTestFunction [RETURN_TYPE] void   String testFunctionName Node node Node scriptNode [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  testFunctionName  boolean  Node  call  expression  node  scriptNode  
[buglab_swap_variables]^Node call = new Node ( Token.CALL, NodeUtil.newQualifiedNameNode ( exportSymbolFunction, node )  ) ;^73^74^^^^70^83^Node call = new Node ( Token.CALL, NodeUtil.newQualifiedNameNode ( exportSymbolFunction, node, testFunctionName )  ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] exportTestFunction [RETURN_TYPE] void   String testFunctionName Node node Node scriptNode [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  testFunctionName  boolean  Node  call  expression  node  scriptNode  
[buglab_swap_variables]^Node call = new Node ( Token. NodeUtil.newQualifiedNameNode ( exportSymbolFunction, node, testFunctionName )  ) ;^73^74^^^^70^83^Node call = new Node ( Token.CALL, NodeUtil.newQualifiedNameNode ( exportSymbolFunction, node, testFunctionName )  ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] exportTestFunction [RETURN_TYPE] void   String testFunctionName Node node Node scriptNode [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  testFunctionName  boolean  Node  call  expression  node  scriptNode  
[buglab_swap_variables]^Node call = new Node ( Token.CALL, NodeUtil.newQualifiedNameNode (  node, testFunctionName )  ) ;^73^74^^^^70^83^Node call = new Node ( Token.CALL, NodeUtil.newQualifiedNameNode ( exportSymbolFunction, node, testFunctionName )  ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] exportTestFunction [RETURN_TYPE] void   String testFunctionName Node node Node scriptNode [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  testFunctionName  boolean  Node  call  expression  node  scriptNode  
[buglab_swap_variables]^Node call = new Node ( Token.CALL, NodeUtil.newQualifiedNameNode ( exportSymbolFunction, testFunctionName, node )  ) ;^73^74^^^^70^83^Node call = new Node ( Token.CALL, NodeUtil.newQualifiedNameNode ( exportSymbolFunction, node, testFunctionName )  ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] exportTestFunction [RETURN_TYPE] void   String testFunctionName Node node Node scriptNode [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  testFunctionName  boolean  Node  call  expression  node  scriptNode  
[buglab_swap_variables]^call.addChildToBack ( NodeUtil.newQualifiedNameNode (  node, testFunctionName )  ) ;^76^77^^^^70^83^call.addChildToBack ( NodeUtil.newQualifiedNameNode ( testFunctionName, node, testFunctionName )  ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] exportTestFunction [RETURN_TYPE] void   String testFunctionName Node node Node scriptNode [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  testFunctionName  boolean  Node  call  expression  node  scriptNode  
[buglab_swap_variables]^call.addChildToBack ( NodeUtil.newQualifiedNameNode ( node, testFunctionName, testFunctionName )  ) ;^76^77^^^^70^83^call.addChildToBack ( NodeUtil.newQualifiedNameNode ( testFunctionName, node, testFunctionName )  ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] exportTestFunction [RETURN_TYPE] void   String testFunctionName Node node Node scriptNode [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  testFunctionName  boolean  Node  call  expression  node  scriptNode  
[buglab_swap_variables]^call.addChildToBack ( NodeUtil.newQualifiedNameNode ( testFunctionName,  testFunctionName )  ) ;^76^77^^^^70^83^call.addChildToBack ( NodeUtil.newQualifiedNameNode ( testFunctionName, node, testFunctionName )  ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] exportTestFunction [RETURN_TYPE] void   String testFunctionName Node node Node scriptNode [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  testFunctionName  boolean  Node  call  expression  node  scriptNode  
[buglab_swap_variables]^Node expression = new Node ( Token.EXPR_RESULT ) ;^79^^^^^70^83^Node expression = new Node ( Token.EXPR_RESULT, call ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] exportTestFunction [RETURN_TYPE] void   String testFunctionName Node node Node scriptNode [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  testFunctionName  boolean  Node  call  expression  node  scriptNode  
[buglab_swap_variables]^Node expression = new Node ( Token. call ) ;^79^^^^^70^83^Node expression = new Node ( Token.EXPR_RESULT, call ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] exportTestFunction [RETURN_TYPE] void   String testFunctionName Node node Node scriptNode [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  testFunctionName  boolean  Node  call  expression  node  scriptNode  
[buglab_swap_variables]^scriptNode.addChildAfter (  node ) ;^81^^^^^70^83^scriptNode.addChildAfter ( expression, node ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] exportTestFunction [RETURN_TYPE] void   String testFunctionName Node node Node scriptNode [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  testFunctionName  boolean  Node  call  expression  node  scriptNode  
[buglab_swap_variables]^scriptNode.addChildAfter ( expression ) ;^81^^^^^70^83^scriptNode.addChildAfter ( expression, node ) ;^[CLASS] ExportTestFunctions ExportTestFunctionsNodes  [METHOD] exportTestFunction [RETURN_TYPE] void   String testFunctionName Node node Node scriptNode [VARIABLES] Pattern  TEST_FUNCTIONS_NAME_PATTERN  AbstractCompiler  compiler  String  exportSymbolFunction  functionName  testFunctionName  boolean  Node  call  expression  node  scriptNode  
[buglab_swap_variables]^if  ( n != parentull && parent.getType (  )  == Token.SCRIPT && n.getType (  )  == Token.FUNCTION )  {^55^56^^^^54^62^if  ( parent != null && parent.getType (  )  == Token.SCRIPT && n.getType (  )  == Token.FUNCTION )  {^[CLASS] ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  n  parent  String  functionName  
[buglab_swap_variables]^if  ( isTestFunction (  functionName )  && t.inGlobalScope (  )  )  {^58^^^^^54^62^if  ( isTestFunction ( n, functionName )  && t.inGlobalScope (  )  )  {^[CLASS] ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  n  parent  String  functionName  
[buglab_swap_variables]^if  ( isTestFunction ( functionName, n )  && t.inGlobalScope (  )  )  {^58^^^^^54^62^if  ( isTestFunction ( n, functionName )  && t.inGlobalScope (  )  )  {^[CLASS] ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  n  parent  String  functionName  
[buglab_swap_variables]^if  ( isTestFunction ( n )  && t.inGlobalScope (  )  )  {^58^^^^^54^62^if  ( isTestFunction ( n, functionName )  && t.inGlobalScope (  )  )  {^[CLASS] ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  n  parent  String  functionName  
[buglab_swap_variables]^if  ( isTestFunction ( n, t )  && functionName.inGlobalScope (  )  )  {^58^^^^^54^62^if  ( isTestFunction ( n, functionName )  && t.inGlobalScope (  )  )  {^[CLASS] ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  n  parent  String  functionName  
[buglab_swap_variables]^exportTestFunction ( n, functionName, parent ) ;^59^^^^^54^62^exportTestFunction ( functionName, n, parent ) ;^[CLASS] ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  n  parent  String  functionName  
[buglab_swap_variables]^exportTestFunction (  n, parent ) ;^59^^^^^54^62^exportTestFunction ( functionName, n, parent ) ;^[CLASS] ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  n  parent  String  functionName  
[buglab_swap_variables]^exportTestFunction ( functionName,  parent ) ;^59^^^^^54^62^exportTestFunction ( functionName, n, parent ) ;^[CLASS] ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  n  parent  String  functionName  
[buglab_swap_variables]^exportTestFunction ( parent, n, functionName ) ;^59^^^^^54^62^exportTestFunction ( functionName, n, parent ) ;^[CLASS] ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  n  parent  String  functionName  
[buglab_swap_variables]^exportTestFunction ( functionName, n ) ;^59^^^^^54^62^exportTestFunction ( functionName, n, parent ) ;^[CLASS] ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  n  parent  String  functionName  
[buglab_swap_variables]^String functionName = NodeUtil.getFunctionName ( parent, n ) ;^57^^^^^54^62^String functionName = NodeUtil.getFunctionName ( n, parent ) ;^[CLASS] ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  n  parent  String  functionName  
[buglab_swap_variables]^String functionName = NodeUtil.getFunctionName (  parent ) ;^57^^^^^54^62^String functionName = NodeUtil.getFunctionName ( n, parent ) ;^[CLASS] ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  n  parent  String  functionName  
[buglab_swap_variables]^String functionName = NodeUtil.getFunctionName ( n ) ;^57^^^^^54^62^String functionName = NodeUtil.getFunctionName ( n, parent ) ;^[CLASS] ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  n  parent  String  functionName  
[buglab_swap_variables]^exportTestFunction ( functionName, parent, n ) ;^59^^^^^54^62^exportTestFunction ( functionName, n, parent ) ;^[CLASS] ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  n  parent  String  functionName  
[buglab_swap_variables]^if  ( isTestFunction ( t, functionName )  && n.inGlobalScope (  )  )  {^58^^^^^54^62^if  ( isTestFunction ( n, functionName )  && t.inGlobalScope (  )  )  {^[CLASS] ExportTestFunctionsNodes  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  n  parent  String  functionName  
