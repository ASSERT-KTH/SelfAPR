[REPLACE]^this.compiler =  null;^38^^^^^37^40^[REPLACE] this.compiler = compiler;^[METHOD] <init> [TYPE] AbstractCompiler) [PARAMETER] AbstractCompiler compiler [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  CodingConvention convention  [TYPE]  boolean false  true 
[ADD]^^38^^^^^37^40^[ADD] this.compiler = compiler;^[METHOD] <init> [TYPE] AbstractCompiler) [PARAMETER] AbstractCompiler compiler [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  CodingConvention convention  [TYPE]  boolean false  true 
[REPLACE]^this.convention =  null.getCodingConvention (  ) ;^39^^^^^37^40^[REPLACE] this.convention = compiler.getCodingConvention (  ) ;^[METHOD] <init> [TYPE] AbstractCompiler) [PARAMETER] AbstractCompiler compiler [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  CodingConvention convention  [TYPE]  boolean false  true 
[ADD]^^39^^^^^37^40^[ADD] this.convention = compiler.getCodingConvention (  ) ;^[METHOD] <init> [TYPE] AbstractCompiler) [PARAMETER] AbstractCompiler compiler [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  CodingConvention convention  [TYPE]  boolean false  true 
[REPLACE]^if  ( externs == this )  {^44^^^^^43^50^[REPLACE] if  ( externs != null )  {^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  CodingConvention convention  [TYPE]  Node externs  root 
[REPLACE]^NodeTraversal.traverse ( compiler, root, this ) ;^45^^^^^43^50^[REPLACE] NodeTraversal.traverse ( compiler, externs, this ) ;^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  CodingConvention convention  [TYPE]  Node externs  root 
[REPLACE]^if  ( root == null )  {^47^^^^^43^50^[REPLACE] if  ( root != null )  {^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  CodingConvention convention  [TYPE]  Node externs  root 
[REPLACE]^NodeTraversal.traverse ( compiler, externs, this ) ;^48^^^^^43^50^[REPLACE] NodeTraversal.traverse ( compiler, root, this ) ;^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  CodingConvention convention  [TYPE]  Node externs  root 
[REPLACE]^if  ( convention .isOptionalParameter ( arg )   )  {^57^^^^^53^96^[REPLACE] if  ( convention.isConstant ( n.getString (  )  )  )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^n.putBooleanProp ( Node.IS_CONSTANT_NAME, false ) ;^58^^^^^53^96^[REPLACE] n.putBooleanProp ( Node.IS_CONSTANT_NAME, true ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^if  ( fnInfo != null )  {^64^^^^^53^96^[REPLACE] if  ( fnInfo == null )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^if  ( parent.getType (  )   ||  Token.ASSIGN )  {^66^^^^^53^96^[REPLACE] if  ( parent.getType (  )  == Token.ASSIGN )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[ADD]^^66^67^68^69^^53^96^[ADD] if  ( parent.getType (  )  == Token.ASSIGN )  {  fnInfo = parent.getJSDocInfo (  ) ; } else if  ( parent.getType (  )  == Token.NAME )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^}  else {^69^^^^^53^96^[REPLACE] } else if  ( parent.getType (  )  == Token.NAME )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[ADD]^}   fnInfo = parent.getParent (  ) .getJSDocInfo (  ) ;^69^70^71^72^^53^96^[ADD] else if  ( parent.getType (  )  == Token.NAME )  {  fnInfo = parent.getParent (  ) .getJSDocInfo (  ) ; }^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^fnInfo =  n.getParent (  ) .getJSDocInfo (  ) ;^71^^^^^53^96^[REPLACE] fnInfo = parent.getParent (  ) .getJSDocInfo (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^fnInfo =  n.getJSDocInfo (  ) ;^68^^^^^53^96^[REPLACE] fnInfo = parent.getJSDocInfo (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^} else if  ( parent.getType (  )   &&  Token.NAME )  {^69^^^^^53^96^[REPLACE] } else if  ( parent.getType (  )  == Token.NAME )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^fnInfo =  null.getParent (  ) .getJSDocInfo (  ) ;^71^^^^^53^96^[REPLACE] fnInfo = parent.getParent (  ) .getJSDocInfo (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^if  ( parent.getType (  )   !=  Token.ASSIGN )  {^66^^^^^53^96^[REPLACE] if  ( parent.getType (  )  == Token.ASSIGN )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^} else if  ( parent.getType (  )   ||  Token.NAME )  {^69^^^^^53^96^[REPLACE] } else if  ( parent.getType (  )  == Token.NAME )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^}  if  ( parent.getType (  )   &&  Token.NAME )  {^69^^^^^53^96^[REPLACE] } else if  ( parent.getType (  )  == Token.NAME )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^if  ( convention.isOptionalParameter ( arg )  ) {^85^86^^^^53^96^[REPLACE] if  ( convention.isOptionalParameter ( arg )  || typeExpr != null && typeExpr.isOptionalArg (  )  )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[ADD]^^85^86^87^88^^53^96^[ADD] if  ( convention.isOptionalParameter ( arg )  || typeExpr != null && typeExpr.isOptionalArg (  )  )  { arg.putBooleanProp ( Node.IS_OPTIONAL_PARAM, true ) ; }^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^arg.putBooleanProp ( Node.IS_OPTIONAL_PARAM, false ) ;^87^^^^^85^88^[REPLACE] arg.putBooleanProp ( Node.IS_OPTIONAL_PARAM, true ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^if  ( convention.isVarArgsParameter ( arg )  ) {^89^90^^^^53^96^[REPLACE] if  ( convention.isVarArgsParameter ( arg )  || typeExpr != null && typeExpr.isVarArgs (  )  )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[ADD]^^89^90^91^92^^53^96^[ADD] if  ( convention.isVarArgsParameter ( arg )  || typeExpr != null && typeExpr.isVarArgs (  )  )  { arg.putBooleanProp ( Node.IS_VAR_ARGS_PARAM, true ) ; }^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^arg.putBooleanProp ( Node.IS_VAR_ARGS_PARAM, false ) ;^91^^^^^89^92^[REPLACE] arg.putBooleanProp ( Node.IS_VAR_ARGS_PARAM, true ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REMOVE]^arg.putBooleanProp ( Node.IS_OPTIONAL_PARAM, true ) ;^91^^^^^89^92^[REMOVE] ^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^for  ( Nodeparent = args.getFirstChild (  ) ;^78^^^^^53^96^[REPLACE] for  ( Node arg = args.getFirstChild (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^if  ( convention.isOptionalParameter ( arg )  || typeExpr == null && typeExpr.isOptionalArg (  )  )  {^85^86^^^^78^93^[REPLACE] if  ( convention.isOptionalParameter ( arg )  || typeExpr != null && typeExpr.isOptionalArg (  )  )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^arg.putBooleanProp ( Node.IS_OPTIONAL_PARAM, false ) ;^87^^^^^78^93^[REPLACE] arg.putBooleanProp ( Node.IS_OPTIONAL_PARAM, true ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^if  ( convention.isVarArgsParameter ( arg )  ) {^89^90^^^^78^93^[REPLACE] if  ( convention.isVarArgsParameter ( arg )  || typeExpr != null && typeExpr.isVarArgs (  )  )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[ADD]^^89^90^91^92^^78^93^[ADD] if  ( convention.isVarArgsParameter ( arg )  || typeExpr != null && typeExpr.isVarArgs (  )  )  { arg.putBooleanProp ( Node.IS_VAR_ARGS_PARAM, true ) ; }^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^arg.putBooleanProp ( Node.IS_VAR_ARGS_PARAM, false ) ;^91^^^^^78^93^[REPLACE] arg.putBooleanProp ( Node.IS_VAR_ARGS_PARAM, true ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^String parentName = arg .getParent (  )  ;^81^^^^^78^93^[REPLACE] String argName = arg.getString (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^JSTypeExpression typeExpr  =  fnInfo.getParameterType ( argName ) ;^82^83^^^^78^93^[REPLACE] JSTypeExpression typeExpr = fnInfo == null ? null : fnInfo.getParameterType ( argName ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[ADD]^^68^^^^^53^96^[ADD] fnInfo = parent.getJSDocInfo (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^arg =  null.getNext (  )  )  {^80^^^^^53^96^[REPLACE] arg = arg.getNext (  )  )  {^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^JSDocInfo fnInfo = n.getString (  ) ;^63^^^^^53^96^[REPLACE] JSDocInfo fnInfo = n.getJSDocInfo (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^Node args = parent.getFirstChild (  ) .getNext (  ) ;^77^^^^^53^96^[REPLACE] Node args = n.getFirstChild (  ) .getNext (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[ADD]^^77^^^^^53^96^[ADD] Node args = n.getFirstChild (  ) .getNext (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^for  ( Node arg = args .getString (  )  ;^78^^^^^53^96^[REPLACE] for  ( Node arg = args.getFirstChild (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^String parentName = arg.getParent (  ) ;^81^^^^^53^96^[REPLACE] String argName = arg.getString (  ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
[REPLACE]^JSTypeExpression typeExpr  =  fnInfo.getParameterType ( argName ) ;^82^83^^^^53^96^[REPLACE] JSTypeExpression typeExpr = fnInfo == null ? null : fnInfo.getParameterType ( argName ) ;^[METHOD] visit [TYPE] void [PARAMETER] NodeTraversal t Node n Node parent [CLASS] CodingConventionAnnotator   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  NodeTraversal t  [TYPE]  CodingConvention convention  [TYPE]  Node arg  args  n  parent  [TYPE]  JSTypeExpression typeExpr  [TYPE]  String argName  [TYPE]  JSDocInfo fnInfo 
