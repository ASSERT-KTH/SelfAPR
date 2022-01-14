[REPLACE]^private  final long serialVersionUID = 1;^41^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] CompilerInput DepsFinder  
[REPLACE]^private  boolean isExtern;^43^^^^^^^[REPLACE] private final boolean isExtern;^ [CLASS] CompilerInput DepsFinder  
[REPLACE]^private  SourceAst ast;^44^^^^^^^[REPLACE] private final SourceAst ast;^ [CLASS] CompilerInput DepsFinder  
[REPLACE]^final private  double  name;^45^^^^^^^[REPLACE] final private String name;^ [CLASS] CompilerInput DepsFinder  
[REPLACE]^private final Set<String> provides ;^46^^^^^^^[REPLACE] private final Set<String> provides = Sets.newHashSet (  ) ;^ [CLASS] CompilerInput DepsFinder  
[REPLACE]^private  Set<String> requires = Sets.newHashSet (  ) ;^47^^^^^^^[REPLACE] private final Set<String> requires = Sets.newHashSet (  ) ;^ [CLASS] CompilerInput DepsFinder  
