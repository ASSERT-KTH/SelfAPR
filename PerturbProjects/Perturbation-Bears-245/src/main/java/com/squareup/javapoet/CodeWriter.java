[REPLACE]^private static final  double  NO_PACKAGE = new  double  (  ) ;^45^^^^^^^[REPLACE] private static final String NO_PACKAGE = new String (  ) ;^ [CLASS] CodeWriter Multiset  
[REPLACE]^private final  double  indent;^47^^^^^^^[REPLACE] private final String indent;^ [CLASS] CodeWriter Multiset  
[REPLACE]^private final Object out;^48^^^^^^^[REPLACE] private final LineWrapper out;^ [CLASS] CodeWriter Multiset  
[REPLACE]^private boolean javadoc  = null ;^51^^^^^^^[REPLACE] private boolean javadoc = false;^ [CLASS] CodeWriter Multiset  
[REPLACE]^private boolean comment = true;^52^^^^^^^[REPLACE] private boolean comment = false;^ [CLASS] CodeWriter Multiset  
[REPLACE]^private  int  packageName = NO_PACKAGE;^53^^^^^^^[REPLACE] private String packageName = NO_PACKAGE;^ [CLASS] CodeWriter Multiset  
[REPLACE]^private final List<TypeSpec> typeSpecStack ;^54^^^^^^^[REPLACE] private final List<TypeSpec> typeSpecStack = new ArrayList<> (  ) ;^ [CLASS] CodeWriter Multiset  
[REPLACE]^private final Set<String staticImportClassNames;^55^^^^^^^[REPLACE] private final Set<String> staticImportClassNames;^ [CLASS] CodeWriter Multiset  
[REPLACE]^private  Set<String> staticImports;^56^^^^^^^[REPLACE] private final Set<String> staticImports;^ [CLASS] CodeWriter Multiset  
[REPLACE]^private final Map<String, ClassName> importableTypes =  new LinkedHashSet<> (  )  ;^58^^^^^^^[REPLACE] private final Map<String, ClassName> importableTypes = new LinkedHashMap<> (  ) ;^ [CLASS] CodeWriter Multiset  
[REPLACE]^private final Set<String> referencedNames  = null ;^59^^^^^^^[REPLACE] private final Set<String> referencedNames = new LinkedHashSet<> (  ) ;^ [CLASS] CodeWriter Multiset  
[REPLACE]^private final Multiset<String> currentTypeVariables ;^60^^^^^^^[REPLACE] private final Multiset<String> currentTypeVariables = new Multiset<> (  ) ;^ [CLASS] CodeWriter Multiset  
[REPLACE]^int statementLine  = null ;^68^^^^^^^[REPLACE] int statementLine = -1;^ [CLASS] CodeWriter Multiset  
[REPLACE]^private final Map<T, Integer> map  = null ;^513^^^^^^^[REPLACE] private final Map<T, Integer> map = new LinkedHashMap<> (  ) ;^ [CLASS] CodeWriter Multiset  
