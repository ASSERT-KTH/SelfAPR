[REPLACE]^public static final Annotation REACHABLE  = null ;^70^^^^^^^[REPLACE] public static final Annotation REACHABLE = new Annotation (  )  {};^ [CLASS] GraphReachability 1  
[REPLACE]^this.graph =  null;^40^^^^^39^41^[REPLACE] this.graph = graph;^[METHOD] <init> [TYPE] DiGraph) [PARAMETER] DiGraph<N, E> graph [CLASS] GraphReachability 1   [TYPE]  Annotation REACHABLE  [TYPE]  DiGraph graph  [TYPE]  boolean false  true 
[ADD]^^40^^^^^39^41^[ADD] this.graph = graph;^[METHOD] <init> [TYPE] DiGraph) [PARAMETER] DiGraph<N, E> graph [CLASS] GraphReachability 1   [TYPE]  Annotation REACHABLE  [TYPE]  DiGraph graph  [TYPE]  boolean false  true 
[REPLACE]^graph .getNode ( entry )  ;^44^^^^^43^48^[REPLACE] graph.clearNodeAnnotations (  ) ;^[METHOD] compute [TYPE] void [PARAMETER] N entry [CLASS] GraphReachability 1   [TYPE]  DiGraph graph  [TYPE]  boolean false  true  [TYPE]  Annotation REACHABLE  [TYPE]  N entry 
[REPLACE]^newReachable.setAnnotation ( REACHABLE ) ;^45^^^^^43^48^[REPLACE] graph.getNode ( entry ) .setAnnotation ( REACHABLE ) ;^[METHOD] compute [TYPE] void [PARAMETER] N entry [CLASS] GraphReachability 1   [TYPE]  DiGraph graph  [TYPE]  boolean false  true  [TYPE]  Annotation REACHABLE  [TYPE]  N entry 
[REPLACE]^FixedPointGraphTraversal.newTraversal ( this ) .setAnnotation ( graph, entry ) ;^46^47^^^^43^48^[REPLACE] FixedPointGraphTraversal.newTraversal ( this ) .computeFixedPoint ( graph, entry ) ;^[METHOD] compute [TYPE] void [PARAMETER] N entry [CLASS] GraphReachability 1   [TYPE]  DiGraph graph  [TYPE]  boolean false  true  [TYPE]  Annotation REACHABLE  [TYPE]  N entry 
[REPLACE]^this   .computeFixedPoint ( graph, entry ) ;^46^47^^^^43^48^[REPLACE] FixedPointGraphTraversal.newTraversal ( this ) .computeFixedPoint ( graph, entry ) ;^[METHOD] compute [TYPE] void [PARAMETER] N entry [CLASS] GraphReachability 1   [TYPE]  DiGraph graph  [TYPE]  boolean false  true  [TYPE]  Annotation REACHABLE  [TYPE]  N entry 
[REPLACE]^GraphNode<N, E> newReachable = graph .clearNodeAnnotations (  )  ;^51^^^^^50^56^[REPLACE] GraphNode<N, E> newReachable = graph.getNode ( reachableNode ) ;^[METHOD] recompute [TYPE] void [PARAMETER] N reachableNode [CLASS] GraphReachability 1   [TYPE]  GraphNode newReachable  [TYPE]  DiGraph graph  [TYPE]  boolean false  true  [TYPE]  Annotation REACHABLE  [TYPE]  N reachableNode 
[REPLACE]^Preconditions.checkState ( newReachable.getAnnotation (  )   ==  REACHABLE ) ;^52^^^^^50^56^[REPLACE] Preconditions.checkState ( newReachable.getAnnotation (  )  != REACHABLE ) ;^[METHOD] recompute [TYPE] void [PARAMETER] N reachableNode [CLASS] GraphReachability 1   [TYPE]  GraphNode newReachable  [TYPE]  DiGraph graph  [TYPE]  boolean false  true  [TYPE]  Annotation REACHABLE  [TYPE]  N reachableNode 
[REPLACE]^Preconditions.checkState ( this.getAnnotation (  )  != REACHABLE ) ;^52^^^^^50^56^[REPLACE] Preconditions.checkState ( newReachable.getAnnotation (  )  != REACHABLE ) ;^[METHOD] recompute [TYPE] void [PARAMETER] N reachableNode [CLASS] GraphReachability 1   [TYPE]  GraphNode newReachable  [TYPE]  DiGraph graph  [TYPE]  boolean false  true  [TYPE]  Annotation REACHABLE  [TYPE]  N reachableNode 
[REMOVE]^newReachable.setAnnotation ( REACHABLE ) ;^52^^^^^50^56^[REMOVE] ^[METHOD] recompute [TYPE] void [PARAMETER] N reachableNode [CLASS] GraphReachability 1   [TYPE]  GraphNode newReachable  [TYPE]  DiGraph graph  [TYPE]  boolean false  true  [TYPE]  Annotation REACHABLE  [TYPE]  N reachableNode 
[REPLACE]^destNode.setAnnotation ( REACHABLE ) ;^53^^^^^50^56^[REPLACE] newReachable.setAnnotation ( REACHABLE ) ;^[METHOD] recompute [TYPE] void [PARAMETER] N reachableNode [CLASS] GraphReachability 1   [TYPE]  GraphNode newReachable  [TYPE]  DiGraph graph  [TYPE]  boolean false  true  [TYPE]  Annotation REACHABLE  [TYPE]  N reachableNode 
[REPLACE]^this   .computeFixedPoint ( graph, reachableNode ) ;^54^55^^^^50^56^[REPLACE] FixedPointGraphTraversal.newTraversal ( this ) .computeFixedPoint ( graph, reachableNode ) ;^[METHOD] recompute [TYPE] void [PARAMETER] N reachableNode [CLASS] GraphReachability 1   [TYPE]  GraphNode newReachable  [TYPE]  DiGraph graph  [TYPE]  boolean false  true  [TYPE]  Annotation REACHABLE  [TYPE]  N reachableNode 
[REPLACE]^if  ( graph.getNode ( source ) .getAnnotation (  )   ||  REACHABLE )  {^60^^^^^59^68^[REPLACE] if  ( graph.getNode ( source ) .getAnnotation (  )  == REACHABLE )  {^[METHOD] traverseEdge [TYPE] boolean [PARAMETER] N source E e N destination [CLASS] GraphReachability 1   [TYPE]  GraphNode destNode  [TYPE]  DiGraph graph  [TYPE]  boolean false  true  [TYPE]  E e  [TYPE]  Annotation REACHABLE  [TYPE]  N destination  source 
[REPLACE]^if  ( null.getAnnotation (  )   ==  REACHABLE )  {^62^^^^^59^68^[REPLACE] if  ( destNode.getAnnotation (  )  != REACHABLE )  {^[METHOD] traverseEdge [TYPE] boolean [PARAMETER] N source E e N destination [CLASS] GraphReachability 1   [TYPE]  GraphNode destNode  [TYPE]  DiGraph graph  [TYPE]  boolean false  true  [TYPE]  E e  [TYPE]  Annotation REACHABLE  [TYPE]  N destination  source 
[ADD]^^62^63^64^65^^59^68^[ADD] if  ( destNode.getAnnotation (  )  != REACHABLE )  { destNode.setAnnotation ( REACHABLE ) ; return true; }^[METHOD] traverseEdge [TYPE] boolean [PARAMETER] N source E e N destination [CLASS] GraphReachability 1   [TYPE]  GraphNode destNode  [TYPE]  DiGraph graph  [TYPE]  boolean false  true  [TYPE]  E e  [TYPE]  Annotation REACHABLE  [TYPE]  N destination  source 
[REPLACE]^return false;^64^^^^^59^68^[REPLACE] return true;^[METHOD] traverseEdge [TYPE] boolean [PARAMETER] N source E e N destination [CLASS] GraphReachability 1   [TYPE]  GraphNode destNode  [TYPE]  DiGraph graph  [TYPE]  boolean false  true  [TYPE]  E e  [TYPE]  Annotation REACHABLE  [TYPE]  N destination  source 
[REPLACE]^GraphNode<N, E> destNode = graph.getNode ( source ) ;^61^^^^^59^68^[REPLACE] GraphNode<N, E> destNode = graph.getNode ( destination ) ;^[METHOD] traverseEdge [TYPE] boolean [PARAMETER] N source E e N destination [CLASS] GraphReachability 1   [TYPE]  GraphNode destNode  [TYPE]  DiGraph graph  [TYPE]  boolean false  true  [TYPE]  E e  [TYPE]  Annotation REACHABLE  [TYPE]  N destination  source 
[REPLACE]^if  ( destNode.getAnnotation (  )   ==  REACHABLE )  {^62^^^^^59^68^[REPLACE] if  ( destNode.getAnnotation (  )  != REACHABLE )  {^[METHOD] traverseEdge [TYPE] boolean [PARAMETER] N source E e N destination [CLASS] GraphReachability 1   [TYPE]  GraphNode destNode  [TYPE]  DiGraph graph  [TYPE]  boolean false  true  [TYPE]  E e  [TYPE]  Annotation REACHABLE  [TYPE]  N destination  source 
[ADD]^^61^^^^^59^68^[ADD] GraphNode<N, E> destNode = graph.getNode ( destination ) ;^[METHOD] traverseEdge [TYPE] boolean [PARAMETER] N source E e N destination [CLASS] GraphReachability 1   [TYPE]  GraphNode destNode  [TYPE]  DiGraph graph  [TYPE]  boolean false  true  [TYPE]  E e  [TYPE]  Annotation REACHABLE  [TYPE]  N destination  source 
[REPLACE]^return true;^67^^^^^59^68^[REPLACE] return false;^[METHOD] traverseEdge [TYPE] boolean [PARAMETER] N source E e N destination [CLASS] GraphReachability 1   [TYPE]  GraphNode destNode  [TYPE]  DiGraph graph  [TYPE]  boolean false  true  [TYPE]  E e  [TYPE]  Annotation REACHABLE  [TYPE]  N destination  source 
