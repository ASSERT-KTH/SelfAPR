[REPLACE]^private  final long serialVersionUID = 8635483102371490919L;^33^^^^^^^[REPLACE] private static final long serialVersionUID = 8635483102371490919L;^ [CLASS] SimpleAbstractTypeResolver  
[REPLACE]^protected final HashMap<ClassKey,Class<?>> _mappings  = null ;^38^^^^^^^[REPLACE] protected final HashMap<ClassKey,Class<?>> _mappings = new HashMap<ClassKey,Class<?>> (  ) ;^ [CLASS] SimpleAbstractTypeResolver  
[REPLACE]^if  ( superType  !=  subType )  {^55^^^^^53^68^[REPLACE] if  ( superType == subType )  {^[METHOD] addMapping [TYPE] <T> [PARAMETER] Class<T> superType Class<? extends T> subType [CLASS] SimpleAbstractTypeResolver   [TYPE]  Class subType  superType  [TYPE]  boolean false  true  [TYPE]  HashMap _mappings  [TYPE]  long serialVersionUID 
[REMOVE]^if  ( ! ( superType.isAssignableFrom ( subType )  )  )  {     throw new IllegalArgumentException (  (  (  (  ( "Can not add mapping from class " +  ( superType.getName (  )  )  )  + " to " )  +  ( subType.getName (  )  )  )  + ", as latter is not a subtype of former" )  ) ; }^55^^^^^53^68^[REMOVE] ^[METHOD] addMapping [TYPE] <T> [PARAMETER] Class<T> superType Class<? extends T> subType [CLASS] SimpleAbstractTypeResolver   [TYPE]  Class subType  superType  [TYPE]  boolean false  true  [TYPE]  HashMap _mappings  [TYPE]  long serialVersionUID 
[REPLACE]^throw new IllegalArgumentException (  (  ( "Can not add mapping from class " +  ( superType.getName (  )  )  )  + " since it is not abstract" )  )  ;^56^^^^^53^68^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] addMapping [TYPE] <T> [PARAMETER] Class<T> superType Class<? extends T> subType [CLASS] SimpleAbstractTypeResolver   [TYPE]  Class subType  superType  [TYPE]  boolean false  true  [TYPE]  HashMap _mappings  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( superType.isAssignableFrom ( subType )  )  {^58^^^^^53^68^[REPLACE] if  ( !superType.isAssignableFrom ( subType )  )  {^[METHOD] addMapping [TYPE] <T> [PARAMETER] Class<T> superType Class<? extends T> subType [CLASS] SimpleAbstractTypeResolver   [TYPE]  Class subType  superType  [TYPE]  boolean false  true  [TYPE]  HashMap _mappings  [TYPE]  long serialVersionUID 
[ADD]^^58^59^60^61^^53^68^[ADD] if  ( !superType.isAssignableFrom ( subType )  )  { throw new IllegalArgumentException  (" ") +" to "+subType.getName (  ) +", as latter is not a subtype of former" ) ; }^[METHOD] addMapping [TYPE] <T> [PARAMETER] Class<T> superType Class<? extends T> subType [CLASS] SimpleAbstractTypeResolver   [TYPE]  Class subType  superType  [TYPE]  boolean false  true  [TYPE]  HashMap _mappings  [TYPE]  long serialVersionUID 
[REPLACE]^return ;^59^60^^^^53^68^[REPLACE] throw new IllegalArgumentException  (" ") +" to "+subType.getName (  ) +", as latter is not a subtype of former" ) ;^[METHOD] addMapping [TYPE] <T> [PARAMETER] Class<T> superType Class<? extends T> subType [CLASS] SimpleAbstractTypeResolver   [TYPE]  Class subType  superType  [TYPE]  boolean false  true  [TYPE]  HashMap _mappings  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( Modifier.isAbstract ( null.getModifiers (  )  )  )  {^62^^^^^53^68^[REPLACE] if  ( !Modifier.isAbstract ( superType.getModifiers (  )  )  )  {^[METHOD] addMapping [TYPE] <T> [PARAMETER] Class<T> superType Class<? extends T> subType [CLASS] SimpleAbstractTypeResolver   [TYPE]  Class subType  superType  [TYPE]  boolean false  true  [TYPE]  HashMap _mappings  [TYPE]  long serialVersionUID 
[ADD]^^63^64^^^^53^68^[ADD] throw new IllegalArgumentException  (" ") +" since it is not abstract" ) ;^[METHOD] addMapping [TYPE] <T> [PARAMETER] Class<T> superType Class<? extends T> subType [CLASS] SimpleAbstractTypeResolver   [TYPE]  Class subType  superType  [TYPE]  boolean false  true  [TYPE]  HashMap _mappings  [TYPE]  long serialVersionUID 
[REPLACE]^_mappings.get ( new ClassKey ( superType ) , subType ) ;^66^^^^^53^68^[REPLACE] _mappings.put ( new ClassKey ( superType ) , subType ) ;^[METHOD] addMapping [TYPE] <T> [PARAMETER] Class<T> superType Class<? extends T> subType [CLASS] SimpleAbstractTypeResolver   [TYPE]  Class subType  superType  [TYPE]  boolean false  true  [TYPE]  HashMap _mappings  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^67^^^^^53^68^[REPLACE] return this;^[METHOD] addMapping [TYPE] <T> [PARAMETER] Class<T> superType Class<? extends T> subType [CLASS] SimpleAbstractTypeResolver   [TYPE]  Class subType  superType  [TYPE]  boolean false  true  [TYPE]  HashMap _mappings  [TYPE]  long serialVersionUID 
