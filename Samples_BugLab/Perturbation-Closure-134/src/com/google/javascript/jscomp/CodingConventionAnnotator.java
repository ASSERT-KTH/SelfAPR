[buglab_swap_variables]^NodeTraversal.traverse ( externs, compiler, this ) ;^45^^^^^43^50^NodeTraversal.traverse ( compiler, externs, this ) ;^[CLASS] CodingConventionAnnotator  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] AbstractCompiler  compiler  boolean  CodingConvention  convention  Node  externs  root  
[buglab_swap_variables]^NodeTraversal.traverse ( compiler,  this ) ;^45^^^^^43^50^NodeTraversal.traverse ( compiler, externs, this ) ;^[CLASS] CodingConventionAnnotator  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] AbstractCompiler  compiler  boolean  CodingConvention  convention  Node  externs  root  
[buglab_swap_variables]^NodeTraversal.traverse (  externs, this ) ;^45^^^^^43^50^NodeTraversal.traverse ( compiler, externs, this ) ;^[CLASS] CodingConventionAnnotator  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] AbstractCompiler  compiler  boolean  CodingConvention  convention  Node  externs  root  
[buglab_swap_variables]^NodeTraversal.traverse ( root, compiler, this ) ;^48^^^^^43^50^NodeTraversal.traverse ( compiler, root, this ) ;^[CLASS] CodingConventionAnnotator  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] AbstractCompiler  compiler  boolean  CodingConvention  convention  Node  externs  root  
[buglab_swap_variables]^NodeTraversal.traverse ( compiler,  this ) ;^48^^^^^43^50^NodeTraversal.traverse ( compiler, root, this ) ;^[CLASS] CodingConventionAnnotator  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] AbstractCompiler  compiler  boolean  CodingConvention  convention  Node  externs  root  
[buglab_swap_variables]^NodeTraversal.traverse (  root, this ) ;^48^^^^^43^50^NodeTraversal.traverse ( compiler, root, this ) ;^[CLASS] CodingConventionAnnotator  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] AbstractCompiler  compiler  boolean  CodingConvention  convention  Node  externs  root  
[buglab_swap_variables]^if  ( n.isConstant ( convention.getString (  )  )  )  {^57^^^^^42^72^if  ( convention.isConstant ( n.getString (  )  )  )  {^[CLASS] CodingConventionAnnotator  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  CodingConvention  convention  Node  arg  args  n  parent  JSTypeExpression  typeExpr  String  argName  JSDocInfo  fnInfo  
[buglab_swap_variables]^if  ( arg.isOptionalParameter ( convention )  || typeExpr != null && typeExpr.isOptionalArg (  )  )  {^85^86^^^^70^100^if  ( convention.isOptionalParameter ( arg )  || typeExpr != null && typeExpr.isOptionalArg (  )  )  {^[CLASS] CodingConventionAnnotator  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  CodingConvention  convention  Node  arg  args  n  parent  JSTypeExpression  typeExpr  String  argName  JSDocInfo  fnInfo  
[buglab_swap_variables]^if  ( convention.isOptionalParameter ( typeExpr )  || arg != null && typeExpr.isOptionalArg (  )  )  {^85^86^^^^70^100^if  ( convention.isOptionalParameter ( arg )  || typeExpr != null && typeExpr.isOptionalArg (  )  )  {^[CLASS] CodingConventionAnnotator  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  CodingConvention  convention  Node  arg  args  n  parent  JSTypeExpression  typeExpr  String  argName  JSDocInfo  fnInfo  
[buglab_swap_variables]^if  ( typeExpr.isOptionalParameter ( arg )  || convention != null && typeExpr.isOptionalArg (  )  )  {^85^86^^^^70^100^if  ( convention.isOptionalParameter ( arg )  || typeExpr != null && typeExpr.isOptionalArg (  )  )  {^[CLASS] CodingConventionAnnotator  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  CodingConvention  convention  Node  arg  args  n  parent  JSTypeExpression  typeExpr  String  argName  JSDocInfo  fnInfo  
[buglab_swap_variables]^if  ( arg.isVarArgsParameter ( convention )  || typeExpr != null && typeExpr.isVarArgs (  )  )  {^89^90^^^^74^104^if  ( convention.isVarArgsParameter ( arg )  || typeExpr != null && typeExpr.isVarArgs (  )  )  {^[CLASS] CodingConventionAnnotator  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  CodingConvention  convention  Node  arg  args  n  parent  JSTypeExpression  typeExpr  String  argName  JSDocInfo  fnInfo  
[buglab_swap_variables]^if  ( typeExpr.isVarArgsParameter ( arg )  || convention != null && typeExpr.isVarArgs (  )  )  {^89^90^^^^74^104^if  ( convention.isVarArgsParameter ( arg )  || typeExpr != null && typeExpr.isVarArgs (  )  )  {^[CLASS] CodingConventionAnnotator  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  CodingConvention  convention  Node  arg  args  n  parent  JSTypeExpression  typeExpr  String  argName  JSDocInfo  fnInfo  
[buglab_swap_variables]^for  ( Node args = arg.getFirstChild (  ) ;^78^^^^^63^93^for  ( Node arg = args.getFirstChild (  ) ;^[CLASS] CodingConventionAnnotator  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  CodingConvention  convention  Node  arg  args  n  parent  JSTypeExpression  typeExpr  String  argName  JSDocInfo  fnInfo  
[buglab_swap_variables]^if  ( convention.isOptionalParameter ( typeExpr )  || arg != null && typeExpr.isOptionalArg (  )  )  {^85^86^^^^78^93^if  ( convention.isOptionalParameter ( arg )  || typeExpr != null && typeExpr.isOptionalArg (  )  )  {^[CLASS] CodingConventionAnnotator  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  CodingConvention  convention  Node  arg  args  n  parent  JSTypeExpression  typeExpr  String  argName  JSDocInfo  fnInfo  
[buglab_swap_variables]^if  ( typeExpr.isOptionalParameter ( arg )  || convention != null && typeExpr.isOptionalArg (  )  )  {^85^86^^^^78^93^if  ( convention.isOptionalParameter ( arg )  || typeExpr != null && typeExpr.isOptionalArg (  )  )  {^[CLASS] CodingConventionAnnotator  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  CodingConvention  convention  Node  arg  args  n  parent  JSTypeExpression  typeExpr  String  argName  JSDocInfo  fnInfo  
[buglab_swap_variables]^if  ( arg.isOptionalParameter ( convention )  || typeExpr != null && typeExpr.isOptionalArg (  )  )  {^85^86^^^^78^93^if  ( convention.isOptionalParameter ( arg )  || typeExpr != null && typeExpr.isOptionalArg (  )  )  {^[CLASS] CodingConventionAnnotator  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  CodingConvention  convention  Node  arg  args  n  parent  JSTypeExpression  typeExpr  String  argName  JSDocInfo  fnInfo  
[buglab_swap_variables]^if  ( arg.isVarArgsParameter ( convention )  || typeExpr != null && typeExpr.isVarArgs (  )  )  {^89^90^^^^78^93^if  ( convention.isVarArgsParameter ( arg )  || typeExpr != null && typeExpr.isVarArgs (  )  )  {^[CLASS] CodingConventionAnnotator  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  CodingConvention  convention  Node  arg  args  n  parent  JSTypeExpression  typeExpr  String  argName  JSDocInfo  fnInfo  
[buglab_swap_variables]^if  ( convention.isVarArgsParameter ( typeExpr )  || arg != null && typeExpr.isVarArgs (  )  )  {^89^90^^^^78^93^if  ( convention.isVarArgsParameter ( arg )  || typeExpr != null && typeExpr.isVarArgs (  )  )  {^[CLASS] CodingConventionAnnotator  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  CodingConvention  convention  Node  arg  args  n  parent  JSTypeExpression  typeExpr  String  argName  JSDocInfo  fnInfo  
[buglab_swap_variables]^if  ( typeExpr.isVarArgsParameter ( arg )  || convention != null && typeExpr.isVarArgs (  )  )  {^89^90^^^^78^93^if  ( convention.isVarArgsParameter ( arg )  || typeExpr != null && typeExpr.isVarArgs (  )  )  {^[CLASS] CodingConventionAnnotator  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  CodingConvention  convention  Node  arg  args  n  parent  JSTypeExpression  typeExpr  String  argName  JSDocInfo  fnInfo  
[buglab_swap_variables]^JSTypeExpression typeExpr = argName == null ? null : fnInfo.getParameterType ( fnInfo ) ;^82^83^^^^78^93^JSTypeExpression typeExpr = fnInfo == null ? null : fnInfo.getParameterType ( argName ) ;^[CLASS] CodingConventionAnnotator  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  CodingConvention  convention  Node  arg  args  n  parent  JSTypeExpression  typeExpr  String  argName  JSDocInfo  fnInfo  
[buglab_swap_variables]^null : argName.getParameterType ( fnInfo ) ;^83^^^^^78^93^null : fnInfo.getParameterType ( argName ) ;^[CLASS] CodingConventionAnnotator  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  CodingConvention  convention  Node  arg  args  n  parent  JSTypeExpression  typeExpr  String  argName  JSDocInfo  fnInfo  
[buglab_swap_variables]^JSTypeExpression typeExpr = argName == null ? null : fnInfo.getParameterType ( fnInfo ) ;^82^83^^^^67^97^JSTypeExpression typeExpr = fnInfo == null ? null : fnInfo.getParameterType ( argName ) ;^[CLASS] CodingConventionAnnotator  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  CodingConvention  convention  Node  arg  args  n  parent  JSTypeExpression  typeExpr  String  argName  JSDocInfo  fnInfo  
[buglab_swap_variables]^null : argName.getParameterType ( fnInfo ) ;^83^^^^^68^98^null : fnInfo.getParameterType ( argName ) ;^[CLASS] CodingConventionAnnotator  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  CodingConvention  convention  Node  arg  args  n  parent  JSTypeExpression  typeExpr  String  argName  JSDocInfo  fnInfo  
