[buglab_swap_variables]^nameGenerators.put (  new NameGenerator ( Collections.<String>emptySet (  ) , "", null )  ) ;^54^55^56^^^49^58^nameGenerators.put ( idGenerator, new NameGenerator ( Collections.<String>emptySet (  ) , "", null )  ) ;^[CLASS] ReplaceIdGenerators Callback  [METHOD] <init> [RETURN_TYPE] Set)   AbstractCompiler compiler String> idGenerators [VARIABLES] AbstractCompiler  compiler  Set  idGenerators  String  idGenerator  boolean  Map  nameGenerators  DiagnosticType  CONDITIONAL_ID_GENERATOR_CALL  NON_GLOBAL_ID_GENERATOR_CALL  
[buglab_swap_variables]^NodeTraversal.traverse ( root, compiler, new Callback (  )  ) ;^61^^^^^60^62^NodeTraversal.traverse ( compiler, root, new Callback (  )  ) ;^[CLASS] ReplaceIdGenerators Callback  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] AbstractCompiler  compiler  boolean  Map  nameGenerators  DiagnosticType  CONDITIONAL_ID_GENERATOR_CALL  NON_GLOBAL_ID_GENERATOR_CALL  Node  externs  root  
[buglab_swap_variables]^NodeTraversal.traverse ( compiler,  new Callback (  )  ) ;^61^^^^^60^62^NodeTraversal.traverse ( compiler, root, new Callback (  )  ) ;^[CLASS] ReplaceIdGenerators Callback  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] AbstractCompiler  compiler  boolean  Map  nameGenerators  DiagnosticType  CONDITIONAL_ID_GENERATOR_CALL  NON_GLOBAL_ID_GENERATOR_CALL  Node  externs  root  
[buglab_swap_variables]^NodeTraversal.traverse (  root, new Callback (  )  ) ;^61^^^^^60^62^NodeTraversal.traverse ( compiler, root, new Callback (  )  ) ;^[CLASS] ReplaceIdGenerators Callback  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] AbstractCompiler  compiler  boolean  Map  nameGenerators  DiagnosticType  CONDITIONAL_ID_GENERATOR_CALL  NON_GLOBAL_ID_GENERATOR_CALL  Node  externs  root  
[buglab_swap_variables]^NameGenerator nameGenerator = callName.get ( nameGenerators ) ;^71^^^^^65^94^NameGenerator nameGenerator = nameGenerators.get ( callName ) ;^[CLASS] ReplaceIdGenerators Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  DiagnosticType  CONDITIONAL_ID_GENERATOR_CALL  NON_GLOBAL_ID_GENERATOR_CALL  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  Map  nameGenerators  
[buglab_swap_variables]^compiler.report ( JSError.make ( n, t, NON_GLOBAL_ID_GENERATOR_CALL )  ) ;^78^^^^^65^94^compiler.report ( JSError.make ( t, n, NON_GLOBAL_ID_GENERATOR_CALL )  ) ;^[CLASS] ReplaceIdGenerators Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  DiagnosticType  CONDITIONAL_ID_GENERATOR_CALL  NON_GLOBAL_ID_GENERATOR_CALL  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  Map  nameGenerators  
[buglab_swap_variables]^compiler.report ( JSError.make (  n, NON_GLOBAL_ID_GENERATOR_CALL )  ) ;^78^^^^^65^94^compiler.report ( JSError.make ( t, n, NON_GLOBAL_ID_GENERATOR_CALL )  ) ;^[CLASS] ReplaceIdGenerators Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  DiagnosticType  CONDITIONAL_ID_GENERATOR_CALL  NON_GLOBAL_ID_GENERATOR_CALL  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  Map  nameGenerators  
[buglab_swap_variables]^compiler.report ( JSError.make ( t,  NON_GLOBAL_ID_GENERATOR_CALL )  ) ;^78^^^^^65^94^compiler.report ( JSError.make ( t, n, NON_GLOBAL_ID_GENERATOR_CALL )  ) ;^[CLASS] ReplaceIdGenerators Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  DiagnosticType  CONDITIONAL_ID_GENERATOR_CALL  NON_GLOBAL_ID_GENERATOR_CALL  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  Map  nameGenerators  
[buglab_swap_variables]^compiler.report ( JSError.make ( NON_GLOBAL_ID_GENERATOR_CALL, n, t )  ) ;^78^^^^^65^94^compiler.report ( JSError.make ( t, n, NON_GLOBAL_ID_GENERATOR_CALL )  ) ;^[CLASS] ReplaceIdGenerators Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  DiagnosticType  CONDITIONAL_ID_GENERATOR_CALL  NON_GLOBAL_ID_GENERATOR_CALL  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  Map  nameGenerators  
[buglab_swap_variables]^compiler.report ( JSError.make ( t, n )  ) ;^78^^^^^65^94^compiler.report ( JSError.make ( t, n, NON_GLOBAL_ID_GENERATOR_CALL )  ) ;^[CLASS] ReplaceIdGenerators Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  DiagnosticType  CONDITIONAL_ID_GENERATOR_CALL  NON_GLOBAL_ID_GENERATOR_CALL  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  Map  nameGenerators  
[buglab_swap_variables]^compiler.report ( JSError.make ( t, NON_GLOBAL_ID_GENERATOR_CALL, n )  ) ;^78^^^^^65^94^compiler.report ( JSError.make ( t, n, NON_GLOBAL_ID_GENERATOR_CALL )  ) ;^[CLASS] ReplaceIdGenerators Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  DiagnosticType  CONDITIONAL_ID_GENERATOR_CALL  NON_GLOBAL_ID_GENERATOR_CALL  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  Map  nameGenerators  
[buglab_swap_variables]^compiler.report ( JSError.make ( n, t, CONDITIONAL_ID_GENERATOR_CALL )  ) ;^85^^^^^65^94^compiler.report ( JSError.make ( t, n, CONDITIONAL_ID_GENERATOR_CALL )  ) ;^[CLASS] ReplaceIdGenerators Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  DiagnosticType  CONDITIONAL_ID_GENERATOR_CALL  NON_GLOBAL_ID_GENERATOR_CALL  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  Map  nameGenerators  
[buglab_swap_variables]^compiler.report ( JSError.make (  n, CONDITIONAL_ID_GENERATOR_CALL )  ) ;^85^^^^^65^94^compiler.report ( JSError.make ( t, n, CONDITIONAL_ID_GENERATOR_CALL )  ) ;^[CLASS] ReplaceIdGenerators Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  DiagnosticType  CONDITIONAL_ID_GENERATOR_CALL  NON_GLOBAL_ID_GENERATOR_CALL  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  Map  nameGenerators  
[buglab_swap_variables]^compiler.report ( JSError.make ( t, CONDITIONAL_ID_GENERATOR_CALL, n )  ) ;^85^^^^^65^94^compiler.report ( JSError.make ( t, n, CONDITIONAL_ID_GENERATOR_CALL )  ) ;^[CLASS] ReplaceIdGenerators Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  DiagnosticType  CONDITIONAL_ID_GENERATOR_CALL  NON_GLOBAL_ID_GENERATOR_CALL  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  Map  nameGenerators  
[buglab_swap_variables]^compiler.report ( JSError.make ( t,  CONDITIONAL_ID_GENERATOR_CALL )  ) ;^85^^^^^65^94^compiler.report ( JSError.make ( t, n, CONDITIONAL_ID_GENERATOR_CALL )  ) ;^[CLASS] ReplaceIdGenerators Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  DiagnosticType  CONDITIONAL_ID_GENERATOR_CALL  NON_GLOBAL_ID_GENERATOR_CALL  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  Map  nameGenerators  
[buglab_swap_variables]^compiler.report ( JSError.make ( t, n )  ) ;^85^^^^^65^94^compiler.report ( JSError.make ( t, n, CONDITIONAL_ID_GENERATOR_CALL )  ) ;^[CLASS] ReplaceIdGenerators Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  DiagnosticType  CONDITIONAL_ID_GENERATOR_CALL  NON_GLOBAL_ID_GENERATOR_CALL  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  Map  nameGenerators  
[buglab_swap_variables]^compiler.report ( JSError.make ( CONDITIONAL_ID_GENERATOR_CALL, n, t )  ) ;^85^^^^^65^94^compiler.report ( JSError.make ( t, n, CONDITIONAL_ID_GENERATOR_CALL )  ) ;^[CLASS] ReplaceIdGenerators Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  DiagnosticType  CONDITIONAL_ID_GENERATOR_CALL  NON_GLOBAL_ID_GENERATOR_CALL  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  Map  nameGenerators  
[buglab_swap_variables]^parent.replaceChild (  Node.newString ( nextName )  ) ;^91^^^^^65^94^parent.replaceChild ( n, Node.newString ( nextName )  ) ;^[CLASS] ReplaceIdGenerators Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  DiagnosticType  CONDITIONAL_ID_GENERATOR_CALL  NON_GLOBAL_ID_GENERATOR_CALL  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  Map  nameGenerators  
[buglab_swap_variables]^parent.replaceChild ( nextName, Node.newString ( n )  ) ;^91^^^^^65^94^parent.replaceChild ( n, Node.newString ( nextName )  ) ;^[CLASS] ReplaceIdGenerators Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] AbstractCompiler  compiler  boolean  NodeTraversal  t  DiagnosticType  CONDITIONAL_ID_GENERATOR_CALL  NON_GLOBAL_ID_GENERATOR_CALL  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  Map  nameGenerators  
[buglab_swap_variables]^NameGenerator nameGenerator = callName.get ( nameGenerators ) ;^71^^^^^65^94^NameGenerator nameGenerator = nameGenerators.get ( callName ) ;^[CLASS] Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  
[buglab_swap_variables]^compiler.report ( JSError.make (  n, NON_GLOBAL_ID_GENERATOR_CALL )  ) ;^78^^^^^65^94^compiler.report ( JSError.make ( t, n, NON_GLOBAL_ID_GENERATOR_CALL )  ) ;^[CLASS] Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  
[buglab_swap_variables]^compiler.report ( JSError.make ( t, NON_GLOBAL_ID_GENERATOR_CALL, n )  ) ;^78^^^^^65^94^compiler.report ( JSError.make ( t, n, NON_GLOBAL_ID_GENERATOR_CALL )  ) ;^[CLASS] Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  
[buglab_swap_variables]^compiler.report ( JSError.make ( t,  NON_GLOBAL_ID_GENERATOR_CALL )  ) ;^78^^^^^65^94^compiler.report ( JSError.make ( t, n, NON_GLOBAL_ID_GENERATOR_CALL )  ) ;^[CLASS] Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  
[buglab_swap_variables]^compiler.report ( JSError.make ( t, n )  ) ;^78^^^^^65^94^compiler.report ( JSError.make ( t, n, NON_GLOBAL_ID_GENERATOR_CALL )  ) ;^[CLASS] Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  
[buglab_swap_variables]^compiler.report ( JSError.make ( NON_GLOBAL_ID_GENERATOR_CALL, n, t )  ) ;^78^^^^^65^94^compiler.report ( JSError.make ( t, n, NON_GLOBAL_ID_GENERATOR_CALL )  ) ;^[CLASS] Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  
[buglab_swap_variables]^compiler.report ( JSError.make ( n, t, NON_GLOBAL_ID_GENERATOR_CALL )  ) ;^78^^^^^65^94^compiler.report ( JSError.make ( t, n, NON_GLOBAL_ID_GENERATOR_CALL )  ) ;^[CLASS] Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  
[buglab_swap_variables]^compiler.report ( JSError.make (  n, CONDITIONAL_ID_GENERATOR_CALL )  ) ;^85^^^^^65^94^compiler.report ( JSError.make ( t, n, CONDITIONAL_ID_GENERATOR_CALL )  ) ;^[CLASS] Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  
[buglab_swap_variables]^compiler.report ( JSError.make ( n, t, CONDITIONAL_ID_GENERATOR_CALL )  ) ;^85^^^^^65^94^compiler.report ( JSError.make ( t, n, CONDITIONAL_ID_GENERATOR_CALL )  ) ;^[CLASS] Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  
[buglab_swap_variables]^compiler.report ( JSError.make ( t,  CONDITIONAL_ID_GENERATOR_CALL )  ) ;^85^^^^^65^94^compiler.report ( JSError.make ( t, n, CONDITIONAL_ID_GENERATOR_CALL )  ) ;^[CLASS] Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  
[buglab_swap_variables]^compiler.report ( JSError.make ( t, CONDITIONAL_ID_GENERATOR_CALL, n )  ) ;^85^^^^^65^94^compiler.report ( JSError.make ( t, n, CONDITIONAL_ID_GENERATOR_CALL )  ) ;^[CLASS] Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  
[buglab_swap_variables]^compiler.report ( JSError.make ( t, n )  ) ;^85^^^^^65^94^compiler.report ( JSError.make ( t, n, CONDITIONAL_ID_GENERATOR_CALL )  ) ;^[CLASS] Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  
[buglab_swap_variables]^compiler.report ( JSError.make ( CONDITIONAL_ID_GENERATOR_CALL, n, t )  ) ;^85^^^^^65^94^compiler.report ( JSError.make ( t, n, CONDITIONAL_ID_GENERATOR_CALL )  ) ;^[CLASS] Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  
[buglab_swap_variables]^parent.replaceChild (  Node.newString ( nextName )  ) ;^91^^^^^65^94^parent.replaceChild ( n, Node.newString ( nextName )  ) ;^[CLASS] Callback  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  Node  ancestor  n  parent  NameGenerator  nameGenerator  String  callName  nextName  
