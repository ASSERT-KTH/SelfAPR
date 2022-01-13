[REPLACE]^private  final long serialVersionUID = 1L;^13^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] RootNameLookup  
[REPLACE]^ClassKey key = new ClassKey ( this ) ;^31^^^^^30^47^[REPLACE] ClassKey key = new ClassKey ( rootType ) ;^[METHOD] findRootName [TYPE] PropertyName [PARAMETER] Class<?> rootType MapperConfig<?> config [CLASS] RootNameLookup   [TYPE]  PropertyName name  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  LRUMap _rootNames  [TYPE]  BeanDescription beanDesc  [TYPE]  ClassKey key  [TYPE]  AnnotationIntrospector intr  [TYPE]  MapperConfig config  [TYPE]  Class rootType  [TYPE]  long serialVersionUID 
[REPLACE]^PropertyName name = _rootNames .put ( key , name )  ;^32^^^^^30^47^[REPLACE] PropertyName name = _rootNames.get ( key ) ;^[METHOD] findRootName [TYPE] PropertyName [PARAMETER] Class<?> rootType MapperConfig<?> config [CLASS] RootNameLookup   [TYPE]  PropertyName name  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  LRUMap _rootNames  [TYPE]  BeanDescription beanDesc  [TYPE]  ClassKey key  [TYPE]  AnnotationIntrospector intr  [TYPE]  MapperConfig config  [TYPE]  Class rootType  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( name == false )  {^33^^^^^30^47^[REPLACE] if  ( name != null )  {^[METHOD] findRootName [TYPE] PropertyName [PARAMETER] Class<?> rootType MapperConfig<?> config [CLASS] RootNameLookup   [TYPE]  PropertyName name  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  LRUMap _rootNames  [TYPE]  BeanDescription beanDesc  [TYPE]  ClassKey key  [TYPE]  AnnotationIntrospector intr  [TYPE]  MapperConfig config  [TYPE]  Class rootType  [TYPE]  long serialVersionUID 
[ADD]^return name;^33^34^35^^^30^47^[ADD] if  ( name != null )  { return name; }^[METHOD] findRootName [TYPE] PropertyName [PARAMETER] Class<?> rootType MapperConfig<?> config [CLASS] RootNameLookup   [TYPE]  PropertyName name  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  LRUMap _rootNames  [TYPE]  BeanDescription beanDesc  [TYPE]  ClassKey key  [TYPE]  AnnotationIntrospector intr  [TYPE]  MapperConfig config  [TYPE]  Class rootType  [TYPE]  long serialVersionUID 
[REPLACE]^BeanDescription beanDesc = null.introspectClassAnnotations ( rootType ) ;^36^^^^^30^47^[REPLACE] BeanDescription beanDesc = config.introspectClassAnnotations ( rootType ) ;^[METHOD] findRootName [TYPE] PropertyName [PARAMETER] Class<?> rootType MapperConfig<?> config [CLASS] RootNameLookup   [TYPE]  PropertyName name  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  LRUMap _rootNames  [TYPE]  BeanDescription beanDesc  [TYPE]  ClassKey key  [TYPE]  AnnotationIntrospector intr  [TYPE]  MapperConfig config  [TYPE]  Class rootType  [TYPE]  long serialVersionUID 
[REPLACE]^AnnotationIntrospector intr = null.getAnnotationIntrospector (  ) ;^37^^^^^30^47^[REPLACE] AnnotationIntrospector intr = config.getAnnotationIntrospector (  ) ;^[METHOD] findRootName [TYPE] PropertyName [PARAMETER] Class<?> rootType MapperConfig<?> config [CLASS] RootNameLookup   [TYPE]  PropertyName name  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  LRUMap _rootNames  [TYPE]  BeanDescription beanDesc  [TYPE]  ClassKey key  [TYPE]  AnnotationIntrospector intr  [TYPE]  MapperConfig config  [TYPE]  Class rootType  [TYPE]  long serialVersionUID 
[REPLACE]^name =  null.findRootName ( ac ) ;^39^^^^^30^47^[REPLACE] name = intr.findRootName ( ac ) ;^[METHOD] findRootName [TYPE] PropertyName [PARAMETER] Class<?> rootType MapperConfig<?> config [CLASS] RootNameLookup   [TYPE]  PropertyName name  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  LRUMap _rootNames  [TYPE]  BeanDescription beanDesc  [TYPE]  ClassKey key  [TYPE]  AnnotationIntrospector intr  [TYPE]  MapperConfig config  [TYPE]  Class rootType  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( name != null || !name .construct ( null )   )  {^41^^^^^30^47^[REPLACE] if  ( name == null || !name.hasSimpleName (  )  )  {^[METHOD] findRootName [TYPE] PropertyName [PARAMETER] Class<?> rootType MapperConfig<?> config [CLASS] RootNameLookup   [TYPE]  PropertyName name  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  LRUMap _rootNames  [TYPE]  BeanDescription beanDesc  [TYPE]  ClassKey key  [TYPE]  AnnotationIntrospector intr  [TYPE]  MapperConfig config  [TYPE]  Class rootType  [TYPE]  long serialVersionUID 
[ADD]^^43^^^^^30^47^[ADD] name = PropertyName.construct ( rootType.getSimpleName (  )  ) ;^[METHOD] findRootName [TYPE] PropertyName [PARAMETER] Class<?> rootType MapperConfig<?> config [CLASS] RootNameLookup   [TYPE]  PropertyName name  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  LRUMap _rootNames  [TYPE]  BeanDescription beanDesc  [TYPE]  ClassKey key  [TYPE]  AnnotationIntrospector intr  [TYPE]  MapperConfig config  [TYPE]  Class rootType  [TYPE]  long serialVersionUID 
[REPLACE]^name =  PropertyName.construct ( false.getSimpleName (  )  ) ;^43^^^^^30^47^[REPLACE] name = PropertyName.construct ( rootType.getSimpleName (  )  ) ;^[METHOD] findRootName [TYPE] PropertyName [PARAMETER] Class<?> rootType MapperConfig<?> config [CLASS] RootNameLookup   [TYPE]  PropertyName name  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  LRUMap _rootNames  [TYPE]  BeanDescription beanDesc  [TYPE]  ClassKey key  [TYPE]  AnnotationIntrospector intr  [TYPE]  MapperConfig config  [TYPE]  Class rootType  [TYPE]  long serialVersionUID 
[REPLACE]^_rootNames.get ( key )  ;^45^^^^^30^47^[REPLACE] _rootNames.put ( key, name ) ;^[METHOD] findRootName [TYPE] PropertyName [PARAMETER] Class<?> rootType MapperConfig<?> config [CLASS] RootNameLookup   [TYPE]  PropertyName name  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  LRUMap _rootNames  [TYPE]  BeanDescription beanDesc  [TYPE]  ClassKey key  [TYPE]  AnnotationIntrospector intr  [TYPE]  MapperConfig config  [TYPE]  Class rootType  [TYPE]  long serialVersionUID 
