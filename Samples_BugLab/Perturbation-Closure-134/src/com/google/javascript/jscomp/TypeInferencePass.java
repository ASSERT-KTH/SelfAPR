[buglab_swap_variables]^Preconditions.checkState ( externsAndJs == null || externsRoot.hasChild ( externsRoot )  ) ;^58^59^^^^55^62^Preconditions.checkState ( externsRoot == null || externsAndJs.hasChild ( externsRoot )  ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] process [RETURN_TYPE] void   Node externsRoot Node jsRoot [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  boolean  Scope  topScope  DiagnosticType  DATAFLOW_ERROR  Node  externsAndJs  externsRoot  jsRoot  ScopeCreator  scopeCreator  
[buglab_swap_variables]^externsRoot == null || externsRoot.hasChild ( externsAndJs )  ) ;^59^^^^^55^62^externsRoot == null || externsAndJs.hasChild ( externsRoot )  ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] process [RETURN_TYPE] void   Node externsRoot Node jsRoot [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  boolean  Scope  topScope  DiagnosticType  DATAFLOW_ERROR  Node  externsAndJs  externsRoot  jsRoot  ScopeCreator  scopeCreator  
[buglab_swap_variables]^NodeTraversal inferTypes = new NodeTraversal ( scopeCreator, new TypeInferringCallback (  ) , compiler ) ;^66^67^^^^65^69^NodeTraversal inferTypes = new NodeTraversal ( compiler, new TypeInferringCallback (  ) , scopeCreator ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   Node node [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  boolean  Scope  topScope  NodeTraversal  inferTypes  DiagnosticType  DATAFLOW_ERROR  Node  node  ScopeCreator  scopeCreator  
[buglab_swap_variables]^NodeTraversal inferTypes = new NodeTraversal (  new TypeInferringCallback (  ) , scopeCreator ) ;^66^67^^^^65^69^NodeTraversal inferTypes = new NodeTraversal ( compiler, new TypeInferringCallback (  ) , scopeCreator ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   Node node [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  boolean  Scope  topScope  NodeTraversal  inferTypes  DiagnosticType  DATAFLOW_ERROR  Node  node  ScopeCreator  scopeCreator  
[buglab_swap_variables]^NodeTraversal inferTypes = new NodeTraversal ( compiler, new TypeInferringCallback (  )  ) ;^66^67^^^^65^69^NodeTraversal inferTypes = new NodeTraversal ( compiler, new TypeInferringCallback (  ) , scopeCreator ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   Node node [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  boolean  Scope  topScope  NodeTraversal  inferTypes  DiagnosticType  DATAFLOW_ERROR  Node  node  ScopeCreator  scopeCreator  
[buglab_swap_variables]^inferTypes.traverseWithScope ( topScope, node ) ;^68^^^^^65^69^inferTypes.traverseWithScope ( node, topScope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   Node node [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  boolean  Scope  topScope  NodeTraversal  inferTypes  DiagnosticType  DATAFLOW_ERROR  Node  node  ScopeCreator  scopeCreator  
[buglab_swap_variables]^inferTypes.traverseWithScope (  topScope ) ;^68^^^^^65^69^inferTypes.traverseWithScope ( node, topScope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   Node node [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  boolean  Scope  topScope  NodeTraversal  inferTypes  DiagnosticType  DATAFLOW_ERROR  Node  node  ScopeCreator  scopeCreator  
[buglab_swap_variables]^inferTypes.traverseWithScope ( node ) ;^68^^^^^65^69^inferTypes.traverseWithScope ( node, topScope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   Node node [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  boolean  Scope  topScope  NodeTraversal  inferTypes  DiagnosticType  DATAFLOW_ERROR  Node  node  ScopeCreator  scopeCreator  
[buglab_swap_variables]^new TypeInference ( compiler, computeCfg ( reverseInterpreter ) , n, scope ) ;^73^^^^^71^83^new TypeInference ( compiler, computeCfg ( n ) , reverseInterpreter, scope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   NodeTraversal t Node n Scope scope [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  TypeInference  typeInference  DataFlowAnalysis  e  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  n  ScopeCreator  scopeCreator  
[buglab_swap_variables]^new TypeInference ( scope, computeCfg ( n ) , reverseInterpreter, compiler ) ;^73^^^^^71^83^new TypeInference ( compiler, computeCfg ( n ) , reverseInterpreter, scope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   NodeTraversal t Node n Scope scope [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  TypeInference  typeInference  DataFlowAnalysis  e  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  n  ScopeCreator  scopeCreator  
[buglab_swap_variables]^new TypeInference ( compiler, computeCfg ( n ) , reverseInterpreter ) ;^73^^^^^71^83^new TypeInference ( compiler, computeCfg ( n ) , reverseInterpreter, scope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   NodeTraversal t Node n Scope scope [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  TypeInference  typeInference  DataFlowAnalysis  e  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  n  ScopeCreator  scopeCreator  
[buglab_swap_variables]^new TypeInference ( reverseInterpreter, computeCfg ( n ) , compiler, scope ) ;^73^^^^^71^83^new TypeInference ( compiler, computeCfg ( n ) , reverseInterpreter, scope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   NodeTraversal t Node n Scope scope [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  TypeInference  typeInference  DataFlowAnalysis  e  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  n  ScopeCreator  scopeCreator  
[buglab_swap_variables]^new TypeInference (  computeCfg ( n ) , reverseInterpreter, scope ) ;^73^^^^^71^83^new TypeInference ( compiler, computeCfg ( n ) , reverseInterpreter, scope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   NodeTraversal t Node n Scope scope [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  TypeInference  typeInference  DataFlowAnalysis  e  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  n  ScopeCreator  scopeCreator  
[buglab_swap_variables]^new TypeInference ( compiler, computeCfg ( n ) , scope, reverseInterpreter ) ;^73^^^^^71^83^new TypeInference ( compiler, computeCfg ( n ) , reverseInterpreter, scope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   NodeTraversal t Node n Scope scope [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  TypeInference  typeInference  DataFlowAnalysis  e  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  n  ScopeCreator  scopeCreator  
[buglab_swap_variables]^new TypeInference ( compiler, computeCfg ( n ) ,  scope ) ;^73^^^^^71^83^new TypeInference ( compiler, computeCfg ( n ) , reverseInterpreter, scope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   NodeTraversal t Node n Scope scope [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  TypeInference  typeInference  DataFlowAnalysis  e  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  n  ScopeCreator  scopeCreator  
[buglab_swap_variables]^TypeInference typeInference = scopeew TypeInference ( compiler, computeCfg ( n ) , reverseInterpreter, n ) ;^72^73^^^^71^83^TypeInference typeInference = new TypeInference ( compiler, computeCfg ( n ) , reverseInterpreter, scope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   NodeTraversal t Node n Scope scope [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  TypeInference  typeInference  DataFlowAnalysis  e  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  n  ScopeCreator  scopeCreator  
[buglab_swap_variables]^TypeInference typeInference = new TypeInference ( scope, computeCfg ( n ) , reverseInterpreter, compiler ) ;^72^73^^^^71^83^TypeInference typeInference = new TypeInference ( compiler, computeCfg ( n ) , reverseInterpreter, scope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   NodeTraversal t Node n Scope scope [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  TypeInference  typeInference  DataFlowAnalysis  e  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  n  ScopeCreator  scopeCreator  
[buglab_swap_variables]^TypeInference typeInference = new TypeInference ( compiler, computeCfg ( n ) , reverseInterpreter ) ;^72^73^^^^71^83^TypeInference typeInference = new TypeInference ( compiler, computeCfg ( n ) , reverseInterpreter, scope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   NodeTraversal t Node n Scope scope [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  TypeInference  typeInference  DataFlowAnalysis  e  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  n  ScopeCreator  scopeCreator  
[buglab_swap_variables]^TypeInference typeInference = new TypeInference ( reverseInterpreter, computeCfg ( n ) , compiler, scope ) ;^72^73^^^^71^83^TypeInference typeInference = new TypeInference ( compiler, computeCfg ( n ) , reverseInterpreter, scope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   NodeTraversal t Node n Scope scope [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  TypeInference  typeInference  DataFlowAnalysis  e  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  n  ScopeCreator  scopeCreator  
[buglab_swap_variables]^TypeInference typeInference = new TypeInference (  computeCfg ( n ) , reverseInterpreter, scope ) ;^72^73^^^^71^83^TypeInference typeInference = new TypeInference ( compiler, computeCfg ( n ) , reverseInterpreter, scope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   NodeTraversal t Node n Scope scope [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  TypeInference  typeInference  DataFlowAnalysis  e  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  n  ScopeCreator  scopeCreator  
[buglab_swap_variables]^TypeInference typeInference = reverseInterpreterew TypeInference ( compiler, computeCfg ( n ) , n, scope ) ;^72^73^^^^71^83^TypeInference typeInference = new TypeInference ( compiler, computeCfg ( n ) , reverseInterpreter, scope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   NodeTraversal t Node n Scope scope [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  TypeInference  typeInference  DataFlowAnalysis  e  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  n  ScopeCreator  scopeCreator  
[buglab_swap_variables]^TypeInference typeInference = new TypeInference ( compiler, computeCfg ( n ) ,  scope ) ;^72^73^^^^71^83^TypeInference typeInference = new TypeInference ( compiler, computeCfg ( n ) , reverseInterpreter, scope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   NodeTraversal t Node n Scope scope [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  TypeInference  typeInference  DataFlowAnalysis  e  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  n  ScopeCreator  scopeCreator  
[buglab_swap_variables]^compiler.report ( JSError.make (  n, DATAFLOW_ERROR )  ) ;^81^^^^^71^83^compiler.report ( JSError.make ( t, n, DATAFLOW_ERROR )  ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   NodeTraversal t Node n Scope scope [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  TypeInference  typeInference  DataFlowAnalysis  e  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  n  ScopeCreator  scopeCreator  
[buglab_swap_variables]^compiler.report ( JSError.make ( n, t, DATAFLOW_ERROR )  ) ;^81^^^^^71^83^compiler.report ( JSError.make ( t, n, DATAFLOW_ERROR )  ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   NodeTraversal t Node n Scope scope [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  TypeInference  typeInference  DataFlowAnalysis  e  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  n  ScopeCreator  scopeCreator  
[buglab_swap_variables]^compiler.report ( JSError.make ( t,  DATAFLOW_ERROR )  ) ;^81^^^^^71^83^compiler.report ( JSError.make ( t, n, DATAFLOW_ERROR )  ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   NodeTraversal t Node n Scope scope [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  TypeInference  typeInference  DataFlowAnalysis  e  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  n  ScopeCreator  scopeCreator  
[buglab_swap_variables]^compiler.report ( JSError.make ( t, DATAFLOW_ERROR, n )  ) ;^81^^^^^71^83^compiler.report ( JSError.make ( t, n, DATAFLOW_ERROR )  ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   NodeTraversal t Node n Scope scope [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  TypeInference  typeInference  DataFlowAnalysis  e  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  n  ScopeCreator  scopeCreator  
[buglab_swap_variables]^compiler.report ( JSError.make ( t, n )  ) ;^81^^^^^71^83^compiler.report ( JSError.make ( t, n, DATAFLOW_ERROR )  ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] inferTypes [RETURN_TYPE] void   NodeTraversal t Node n Scope scope [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  TypeInference  typeInference  DataFlowAnalysis  e  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  n  ScopeCreator  scopeCreator  
[buglab_swap_variables]^inferTypes ( scope, node, t ) ;^89^^^^^86^90^inferTypes ( t, node, scope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] enterScope [RETURN_TYPE] void   NodeTraversal t [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  node  ScopeCreator  scopeCreator  
[buglab_swap_variables]^inferTypes (  node, scope ) ;^89^^^^^86^90^inferTypes ( t, node, scope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] enterScope [RETURN_TYPE] void   NodeTraversal t [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  node  ScopeCreator  scopeCreator  
[buglab_swap_variables]^inferTypes ( t, scope, node ) ;^89^^^^^86^90^inferTypes ( t, node, scope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] enterScope [RETURN_TYPE] void   NodeTraversal t [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  node  ScopeCreator  scopeCreator  
[buglab_swap_variables]^inferTypes ( t,  scope ) ;^89^^^^^86^90^inferTypes ( t, node, scope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] enterScope [RETURN_TYPE] void   NodeTraversal t [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  node  ScopeCreator  scopeCreator  
[buglab_swap_variables]^inferTypes ( t, node ) ;^89^^^^^86^90^inferTypes ( t, node, scope ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] enterScope [RETURN_TYPE] void   NodeTraversal t [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  boolean  Scope  scope  topScope  NodeTraversal  t  DiagnosticType  DATAFLOW_ERROR  Node  node  ScopeCreator  scopeCreator  
[buglab_swap_variables]^cfa.process ( null ) ;^105^^^^^103^107^cfa.process ( null, n ) ;^[CLASS] TypeInferencePass TypeInferringCallback  [METHOD] computeCfg [RETURN_TYPE] ControlFlowGraph   Node n [VARIABLES] ReverseAbstractInterpreter  reverseInterpreter  AbstractCompiler  compiler  ControlFlowAnalysis  cfa  boolean  Scope  scope  topScope  DiagnosticType  DATAFLOW_ERROR  Node  n  ScopeCreator  scopeCreator  
[buglab_swap_variables]^inferTypes ( scope, node, t ) ;^89^^^^^86^90^inferTypes ( t, node, scope ) ;^[CLASS] TypeInferringCallback  [METHOD] enterScope [RETURN_TYPE] void   NodeTraversal t [VARIABLES] boolean  Scope  scope  NodeTraversal  t  Node  node  
[buglab_swap_variables]^inferTypes (  node, scope ) ;^89^^^^^86^90^inferTypes ( t, node, scope ) ;^[CLASS] TypeInferringCallback  [METHOD] enterScope [RETURN_TYPE] void   NodeTraversal t [VARIABLES] boolean  Scope  scope  NodeTraversal  t  Node  node  
[buglab_swap_variables]^inferTypes ( node, t, scope ) ;^89^^^^^86^90^inferTypes ( t, node, scope ) ;^[CLASS] TypeInferringCallback  [METHOD] enterScope [RETURN_TYPE] void   NodeTraversal t [VARIABLES] boolean  Scope  scope  NodeTraversal  t  Node  node  
[buglab_swap_variables]^inferTypes ( t,  scope ) ;^89^^^^^86^90^inferTypes ( t, node, scope ) ;^[CLASS] TypeInferringCallback  [METHOD] enterScope [RETURN_TYPE] void   NodeTraversal t [VARIABLES] boolean  Scope  scope  NodeTraversal  t  Node  node  
[buglab_swap_variables]^inferTypes ( t, scope, node ) ;^89^^^^^86^90^inferTypes ( t, node, scope ) ;^[CLASS] TypeInferringCallback  [METHOD] enterScope [RETURN_TYPE] void   NodeTraversal t [VARIABLES] boolean  Scope  scope  NodeTraversal  t  Node  node  
[buglab_swap_variables]^inferTypes ( t, node ) ;^89^^^^^86^90^inferTypes ( t, node, scope ) ;^[CLASS] TypeInferringCallback  [METHOD] enterScope [RETURN_TYPE] void   NodeTraversal t [VARIABLES] boolean  Scope  scope  NodeTraversal  t  Node  node  
