[REPLACE]^private  AbstractCompiler compiler;^32^^^^^^^[REPLACE] private final AbstractCompiler compiler;^ [CLASS] RemoveConstantExpressionsParallel 1 1  
[REPLACE]^this.compiler =  null;^37^^^^^36^39^[REPLACE] this.compiler = compiler;^[METHOD] <init> [TYPE] AbstractCompiler,int) [PARAMETER] AbstractCompiler compiler int numThreads [CLASS] RemoveConstantExpressionsParallel 1 1   [TYPE]  AbstractCompiler compiler  [TYPE]  int numThreads  [TYPE]  boolean false  true 
[ADD]^this.numThreads = numThreads;^37^38^^^^36^39^[ADD] this.compiler = compiler; this.numThreads = numThreads;^[METHOD] <init> [TYPE] AbstractCompiler,int) [PARAMETER] AbstractCompiler compiler int numThreads [CLASS] RemoveConstantExpressionsParallel 1 1   [TYPE]  AbstractCompiler compiler  [TYPE]  int numThreads  [TYPE]  boolean false  true 
[REPLACE]^this.numThreads =  null;^38^^^^^36^39^[REPLACE] this.numThreads = numThreads;^[METHOD] <init> [TYPE] AbstractCompiler,int) [PARAMETER] AbstractCompiler compiler int numThreads [CLASS] RemoveConstantExpressionsParallel 1 1   [TYPE]  AbstractCompiler compiler  [TYPE]  int numThreads  [TYPE]  boolean false  true 
[ADD]^^38^^^^^36^39^[ADD] this.numThreads = numThreads;^[METHOD] <init> [TYPE] AbstractCompiler,int) [PARAMETER] AbstractCompiler compiler int numThreads [CLASS] RemoveConstantExpressionsParallel 1 1   [TYPE]  AbstractCompiler compiler  [TYPE]  int numThreads  [TYPE]  boolean false  true 
[REPLACE]^this ( compiler, Runtime.availableProcessors (  ) .availableProcessors (  )  ) ;^42^^^^^41^43^[REPLACE] this ( compiler, Runtime.getRuntime (  ) .availableProcessors (  )  ) ;^[METHOD] <init> [TYPE] AbstractCompiler) [PARAMETER] AbstractCompiler compiler [CLASS] RemoveConstantExpressionsParallel 1 1   [TYPE]  AbstractCompiler compiler  [TYPE]  int numThreads  [TYPE]  boolean false  true 
[ADD]^^42^^^^^41^43^[ADD] this ( compiler, Runtime.getRuntime (  ) .availableProcessors (  )  ) ;^[METHOD] <init> [TYPE] AbstractCompiler) [PARAMETER] AbstractCompiler compiler [CLASS] RemoveConstantExpressionsParallel 1 1   [TYPE]  AbstractCompiler compiler  [TYPE]  int numThreads  [TYPE]  boolean false  true 
[REPLACE]^this ( compiler, Runtime .availableProcessors (  )  .availableProcessors (  )  ) ;^42^^^^^41^43^[REPLACE] this ( compiler, Runtime.getRuntime (  ) .availableProcessors (  )  ) ;^[METHOD] <init> [TYPE] AbstractCompiler) [PARAMETER] AbstractCompiler compiler [CLASS] RemoveConstantExpressionsParallel 1 1   [TYPE]  AbstractCompiler compiler  [TYPE]  int numThreads  [TYPE]  boolean false  true 
[REPLACE]^AstParallelizer splitter = AstParallelizer .createNewFileLevelAstParallelizer ( subtree ) ;^48^49^^^^46^70^[REPLACE] AstParallelizer splitter = AstParallelizer .createNewFileLevelAstParallelizer ( root ) ;^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] RemoveConstantExpressionsParallel 1 1   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  AstParallelizer splitter  [TYPE]  Node externs  root  subtree  [TYPE]  RemoveConstantRValuesCallback cb  [TYPE]  Supplier supplier  [TYPE]  int numThreads 
[REPLACE]^return  new Task> (  )  {     Override     public Task get (  )  {         return new Task (  )  {             Override             public Result processSubtree ( Node subtree )  {                 RemoveConstantRValuesCallback cb = new RemoveConstantRValuesCallback (  ) ;                 traverse ( null, subtree, cb ) ;                 return cb.getResult (  ) ;             }         };     } }   {^55^^^^^46^70^[REPLACE] return new Task (  )  {^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] RemoveConstantExpressionsParallel 1 1   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  AstParallelizer splitter  [TYPE]  Node externs  root  subtree  [TYPE]  RemoveConstantRValuesCallback cb  [TYPE]  Supplier supplier  [TYPE]  int numThreads 
[REPLACE]^return cb.RemoveConstantRValuesCallback (  ) ;^61^^^^^46^70^[REPLACE] return cb.getResult (  ) ;^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] RemoveConstantExpressionsParallel 1 1   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  AstParallelizer splitter  [TYPE]  Node externs  root  subtree  [TYPE]  RemoveConstantRValuesCallback cb  [TYPE]  Supplier supplier  [TYPE]  int numThreads 
[REPLACE]^Supplier<Task> supplier = new Supplier<Task> (  )  { @Override^52^^^^^46^70^[REPLACE] Supplier<Task> supplier = new Supplier<Task> (  )  {^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] RemoveConstantExpressionsParallel 1 1   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  AstParallelizer splitter  [TYPE]  Node externs  root  subtree  [TYPE]  RemoveConstantRValuesCallback cb  [TYPE]  Supplier supplier  [TYPE]  int numThreads 
[REPLACE]^( new ParallelCompilerPass ( compiler, splitter, supplier, numThreads )  ) .process ( externs, subtree ) ;^68^69^^^^46^70^[REPLACE] ( new ParallelCompilerPass ( compiler, splitter, supplier, numThreads )  ) .process ( externs, root ) ;^[METHOD] process [TYPE] void [PARAMETER] Node externs Node root [CLASS] RemoveConstantExpressionsParallel 1 1   [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  AstParallelizer splitter  [TYPE]  Node externs  root  subtree  [TYPE]  RemoveConstantRValuesCallback cb  [TYPE]  Supplier supplier  [TYPE]  int numThreads 
[REPLACE]^return  new Task> (  )  {     Override     public Task get (  )  {         return new Task (  )  {             Override             public Result processSubtree ( Node subtree )  {                 RemoveConstantRValuesCallback cb = new RemoveConstantRValuesCallback (  ) ;                 traverse ( null, subtree, cb ) ;                 return cb.getResult (  ) ;             }         };     } }   {^55^^^^^54^64^[REPLACE] return new Task (  )  {^[METHOD] get [TYPE] Task [PARAMETER] [CLASS] RemoveConstantExpressionsParallel 1 1   [TYPE]  RemoveConstantRValuesCallback cb  [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  int numThreads  [TYPE]  Node subtree 
[REPLACE]^return cb.RemoveConstantRValuesCallback (  ) ;^61^^^^^54^64^[REPLACE] return cb.getResult (  ) ;^[METHOD] get [TYPE] Task [PARAMETER] [CLASS] RemoveConstantExpressionsParallel 1 1   [TYPE]  RemoveConstantRValuesCallback cb  [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  int numThreads  [TYPE]  Node subtree 
[REPLACE]^NodeTraversal.traverse ( this, subtree, cb ) ;^60^^^^^57^62^[REPLACE] NodeTraversal.traverse ( null, subtree, cb ) ;^[METHOD] processSubtree [TYPE] Result [PARAMETER] Node subtree [CLASS] RemoveConstantExpressionsParallel 1 1   [TYPE]  RemoveConstantRValuesCallback cb  [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  int numThreads  [TYPE]  Node subtree 
[ADD]^^60^61^^^^57^62^[ADD] NodeTraversal.traverse ( null, subtree, cb ) ; return cb.getResult (  ) ;^[METHOD] processSubtree [TYPE] Result [PARAMETER] Node subtree [CLASS] RemoveConstantExpressionsParallel 1 1   [TYPE]  RemoveConstantRValuesCallback cb  [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  int numThreads  [TYPE]  Node subtree 
[REPLACE]^return cb .RemoveConstantRValuesCallback (  )  ;^61^^^^^57^62^[REPLACE] return cb.getResult (  ) ;^[METHOD] processSubtree [TYPE] Result [PARAMETER] Node subtree [CLASS] RemoveConstantExpressionsParallel 1 1   [TYPE]  RemoveConstantRValuesCallback cb  [TYPE]  AbstractCompiler compiler  [TYPE]  boolean false  true  [TYPE]  int numThreads  [TYPE]  Node subtree 
[REPLACE]^return new Task (  )  { @Override^55^^^^^54^64^[REPLACE] return new Task (  )  {^[METHOD] get [TYPE] Task [PARAMETER] [CLASS] 1 1   [TYPE]  boolean false  true  [TYPE]  Node subtree  [TYPE]  RemoveConstantRValuesCallback cb 
[REPLACE]^return cb .RemoveConstantRValuesCallback (  )  ;^61^^^^^54^64^[REPLACE] return cb.getResult (  ) ;^[METHOD] get [TYPE] Task [PARAMETER] [CLASS] 1 1   [TYPE]  boolean false  true  [TYPE]  Node subtree  [TYPE]  RemoveConstantRValuesCallback cb 
[REPLACE]^NodeTraversal.traverse ( true, subtree, cb ) ;^60^^^^^57^62^[REPLACE] NodeTraversal.traverse ( null, subtree, cb ) ;^[METHOD] processSubtree [TYPE] Result [PARAMETER] Node subtree [CLASS] 1 1   [TYPE]  boolean false  true  [TYPE]  Node subtree  [TYPE]  RemoveConstantRValuesCallback cb 
[REPLACE]^return cb.RemoveConstantRValuesCallback (  ) ;^61^^^^^57^62^[REPLACE] return cb.getResult (  ) ;^[METHOD] processSubtree [TYPE] Result [PARAMETER] Node subtree [CLASS] 1 1   [TYPE]  boolean false  true  [TYPE]  Node subtree  [TYPE]  RemoveConstantRValuesCallback cb 
[REPLACE]^NodeTraversal.traverse ( false, subtree, cb ) ;^60^^^^^57^62^[REPLACE] NodeTraversal.traverse ( null, subtree, cb ) ;^[METHOD] processSubtree [TYPE] Result [PARAMETER] Node subtree [CLASS] 1   [TYPE]  boolean false  true  [TYPE]  Node subtree  [TYPE]  RemoveConstantRValuesCallback cb 
[REPLACE]^return cb .RemoveConstantRValuesCallback (  )  ;^61^^^^^57^62^[REPLACE] return cb.getResult (  ) ;^[METHOD] processSubtree [TYPE] Result [PARAMETER] Node subtree [CLASS] 1   [TYPE]  boolean false  true  [TYPE]  Node subtree  [TYPE]  RemoveConstantRValuesCallback cb 
