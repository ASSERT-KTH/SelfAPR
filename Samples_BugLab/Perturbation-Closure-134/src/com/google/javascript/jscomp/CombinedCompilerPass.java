[buglab_swap_variables]^} else if  ( n == waiting )  {^108^^^^^105^111^} else if  ( waiting == n )  {^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] visitOrMaybeActivate [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^callback.visit (  n, parent ) ;^107^^^^^105^111^callback.visit ( t, n, parent ) ;^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] visitOrMaybeActivate [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^callback.visit ( t,  parent ) ;^107^^^^^105^111^callback.visit ( t, n, parent ) ;^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] visitOrMaybeActivate [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^callback.visit ( t, parent, n ) ;^107^^^^^105^111^callback.visit ( t, n, parent ) ;^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] visitOrMaybeActivate [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^callback.visit ( t, n ) ;^107^^^^^105^111^callback.visit ( t, n, parent ) ;^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] visitOrMaybeActivate [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^callback.visit ( parent, n, t ) ;^107^^^^^105^111^callback.visit ( t, n, parent ) ;^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] visitOrMaybeActivate [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^if  ( isActive (  )  && !callback.shouldTraverse ( parent, n, t )  )  {^114^^^^^113^117^if  ( isActive (  )  && !callback.shouldTraverse ( t, n, parent )  )  {^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] shouldTraverseIfActive [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^if  ( isActive (  )  && !callback.shouldTraverse (  n, parent )  )  {^114^^^^^113^117^if  ( isActive (  )  && !callback.shouldTraverse ( t, n, parent )  )  {^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] shouldTraverseIfActive [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^if  ( isActive (  )  && !callback.shouldTraverse ( t, parent, n )  )  {^114^^^^^113^117^if  ( isActive (  )  && !callback.shouldTraverse ( t, n, parent )  )  {^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] shouldTraverseIfActive [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^if  ( isActive (  )  && !callback.shouldTraverse ( t,  parent )  )  {^114^^^^^113^117^if  ( isActive (  )  && !callback.shouldTraverse ( t, n, parent )  )  {^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] shouldTraverseIfActive [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^if  ( isActive (  )  && !callback.shouldTraverse ( t, n )  )  {^114^^^^^113^117^if  ( isActive (  )  && !callback.shouldTraverse ( t, n, parent )  )  {^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] shouldTraverseIfActive [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^if  ( isActive (  )  && !callback.shouldTraverse ( n, t, parent )  )  {^114^^^^^113^117^if  ( isActive (  )  && !callback.shouldTraverse ( t, n, parent )  )  {^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] shouldTraverseIfActive [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^NodeTraversal.traverse ( root, compiler, this ) ;^138^^^^^137^139^NodeTraversal.traverse ( compiler, root, this ) ;^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  Node  externs  n  parent  root  waiting  
[buglab_swap_variables]^NodeTraversal.traverse ( compiler,  this ) ;^138^^^^^137^139^NodeTraversal.traverse ( compiler, root, this ) ;^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  Node  externs  n  parent  root  waiting  
[buglab_swap_variables]^NodeTraversal.traverse (  root, this ) ;^138^^^^^137^139^NodeTraversal.traverse ( compiler, root, this ) ;^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  Node  externs  n  parent  root  waiting  
[buglab_swap_variables]^callback.shouldTraverseIfActive ( n, t, parent ) ;^144^^^^^142^152^callback.shouldTraverseIfActive ( t, n, parent ) ;^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] shouldTraverse [RETURN_TYPE] boolean   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  externs  n  parent  root  waiting  CallbackWrapper  callback  
[buglab_swap_variables]^callback.shouldTraverseIfActive (  n, parent ) ;^144^^^^^142^152^callback.shouldTraverseIfActive ( t, n, parent ) ;^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] shouldTraverse [RETURN_TYPE] boolean   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  externs  n  parent  root  waiting  CallbackWrapper  callback  
[buglab_swap_variables]^callback.shouldTraverseIfActive ( t,  parent ) ;^144^^^^^142^152^callback.shouldTraverseIfActive ( t, n, parent ) ;^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] shouldTraverse [RETURN_TYPE] boolean   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  externs  n  parent  root  waiting  CallbackWrapper  callback  
[buglab_swap_variables]^callback.shouldTraverseIfActive ( t, parent, n ) ;^144^^^^^142^152^callback.shouldTraverseIfActive ( t, n, parent ) ;^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] shouldTraverse [RETURN_TYPE] boolean   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  externs  n  parent  root  waiting  CallbackWrapper  callback  
[buglab_swap_variables]^callback.shouldTraverseIfActive ( t, n ) ;^144^^^^^142^152^callback.shouldTraverseIfActive ( t, n, parent ) ;^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] shouldTraverse [RETURN_TYPE] boolean   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  externs  n  parent  root  waiting  CallbackWrapper  callback  
[buglab_swap_variables]^callback.visitOrMaybeActivate (  n, parent ) ;^157^^^^^155^159^callback.visitOrMaybeActivate ( t, n, parent ) ;^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  externs  n  parent  root  waiting  CallbackWrapper  callback  
[buglab_swap_variables]^callback.visitOrMaybeActivate ( t, parent, n ) ;^157^^^^^155^159^callback.visitOrMaybeActivate ( t, n, parent ) ;^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  externs  n  parent  root  waiting  CallbackWrapper  callback  
[buglab_swap_variables]^callback.visitOrMaybeActivate ( t,  parent ) ;^157^^^^^155^159^callback.visitOrMaybeActivate ( t, n, parent ) ;^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  externs  n  parent  root  waiting  CallbackWrapper  callback  
[buglab_swap_variables]^callback.visitOrMaybeActivate ( t, n ) ;^157^^^^^155^159^callback.visitOrMaybeActivate ( t, n, parent ) ;^[CLASS] CombinedCompilerPass CallbackWrapper  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  AbstractCompiler  compiler  Callback  callback  boolean  CallbackWrapper[]  callbacks  NodeTraversal  t  Node  externs  n  parent  root  waiting  CallbackWrapper  callback  
[buglab_swap_variables]^} else if  ( n == waiting )  {^108^^^^^105^111^} else if  ( waiting == n )  {^[CLASS] CallbackWrapper  [METHOD] visitOrMaybeActivate [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  Callback  callback  boolean  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^callback.visit (  n, parent ) ;^107^^^^^105^111^callback.visit ( t, n, parent ) ;^[CLASS] CallbackWrapper  [METHOD] visitOrMaybeActivate [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  Callback  callback  boolean  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^callback.visit ( t,  parent ) ;^107^^^^^105^111^callback.visit ( t, n, parent ) ;^[CLASS] CallbackWrapper  [METHOD] visitOrMaybeActivate [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  Callback  callback  boolean  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^callback.visit ( parent, n, t ) ;^107^^^^^105^111^callback.visit ( t, n, parent ) ;^[CLASS] CallbackWrapper  [METHOD] visitOrMaybeActivate [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  Callback  callback  boolean  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^callback.visit ( t, n ) ;^107^^^^^105^111^callback.visit ( t, n, parent ) ;^[CLASS] CallbackWrapper  [METHOD] visitOrMaybeActivate [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  Callback  callback  boolean  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^callback.visit ( n, t, parent ) ;^107^^^^^105^111^callback.visit ( t, n, parent ) ;^[CLASS] CallbackWrapper  [METHOD] visitOrMaybeActivate [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  Callback  callback  boolean  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^callback.visit ( t, parent, n ) ;^107^^^^^105^111^callback.visit ( t, n, parent ) ;^[CLASS] CallbackWrapper  [METHOD] visitOrMaybeActivate [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  Callback  callback  boolean  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^if  ( isActive (  )  && !callback.shouldTraverse ( parent, n, t )  )  {^114^^^^^113^117^if  ( isActive (  )  && !callback.shouldTraverse ( t, n, parent )  )  {^[CLASS] CallbackWrapper  [METHOD] shouldTraverseIfActive [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  Callback  callback  boolean  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^if  ( isActive (  )  && !callback.shouldTraverse (  n, parent )  )  {^114^^^^^113^117^if  ( isActive (  )  && !callback.shouldTraverse ( t, n, parent )  )  {^[CLASS] CallbackWrapper  [METHOD] shouldTraverseIfActive [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  Callback  callback  boolean  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^if  ( isActive (  )  && !callback.shouldTraverse ( t, parent, n )  )  {^114^^^^^113^117^if  ( isActive (  )  && !callback.shouldTraverse ( t, n, parent )  )  {^[CLASS] CallbackWrapper  [METHOD] shouldTraverseIfActive [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  Callback  callback  boolean  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^if  ( isActive (  )  && !callback.shouldTraverse ( t,  parent )  )  {^114^^^^^113^117^if  ( isActive (  )  && !callback.shouldTraverse ( t, n, parent )  )  {^[CLASS] CallbackWrapper  [METHOD] shouldTraverseIfActive [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  Callback  callback  boolean  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^if  ( isActive (  )  && !callback.shouldTraverse ( t, n )  )  {^114^^^^^113^117^if  ( isActive (  )  && !callback.shouldTraverse ( t, n, parent )  )  {^[CLASS] CallbackWrapper  [METHOD] shouldTraverseIfActive [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  Callback  callback  boolean  NodeTraversal  t  Node  n  parent  waiting  
[buglab_swap_variables]^if  ( isActive (  )  && !callback.shouldTraverse ( n, t, parent )  )  {^114^^^^^113^117^if  ( isActive (  )  && !callback.shouldTraverse ( t, n, parent )  )  {^[CLASS] CallbackWrapper  [METHOD] shouldTraverseIfActive [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] ScopedCallback  scopedCallback  Callback  callback  boolean  NodeTraversal  t  Node  n  parent  waiting  
