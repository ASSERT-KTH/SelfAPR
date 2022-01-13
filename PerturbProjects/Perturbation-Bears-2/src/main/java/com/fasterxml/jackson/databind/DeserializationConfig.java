[REPLACE]^private static final long serialVersionUID  = null ;^35^^^^^^^[REPLACE] private static final long serialVersionUID = 1;^ [CLASS] DeserializationConfig  
[REPLACE]^private final LinkedNode<DeserializationProblemHandler> _problemHandlers;^48^^^^^^^[REPLACE] protected final LinkedNode<DeserializationProblemHandler> _problemHandlers;^ [CLASS] DeserializationConfig  
[REPLACE]^private final JsonNodeFactory _nodeFactory;^53^^^^^^^[REPLACE] protected final JsonNodeFactory _nodeFactory;^ [CLASS] DeserializationConfig  
[REPLACE]^private final int _deserFeatures;^64^^^^^^^[REPLACE] protected final int _deserFeatures;^ [CLASS] DeserializationConfig  
[REPLACE]^protected  int _parserFeatures;^75^^^^^^^[REPLACE] protected final int _parserFeatures;^ [CLASS] DeserializationConfig  
[REPLACE]^protected final  long  _parserFeaturesToChange;^80^^^^^^^[REPLACE] protected final int _parserFeaturesToChange;^ [CLASS] DeserializationConfig  
[REPLACE]^protected  int _formatReadFeatures;^87^^^^^^^[REPLACE] protected final int _formatReadFeatures;^ [CLASS] DeserializationConfig  
[REPLACE]^protected  int _formatReadFeaturesToChange;^94^^^^^^^[REPLACE] protected final int _formatReadFeaturesToChange;^ [CLASS] DeserializationConfig  
[REPLACE]^VisibilityChecker<?> vchecker = super.getAnnotationIntrospector (  ) ;^773^^^^^772^790^[REPLACE] VisibilityChecker<?> vchecker = super.getDefaultVisibilityChecker (  ) ;^[METHOD] getDefaultVisibilityChecker [TYPE] VisibilityChecker [PARAMETER] [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  VisibilityChecker vchecker  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^if  ( !isEnabled ( MapperFeature.AUTO_DETECT_SETTERS  )  && ! ( isEnabled ( MapperFeature.AUTO_DETECT_FIELDS )  )  )  )  {^774^^^^^772^790^[REPLACE] if  ( !isEnabled ( MapperFeature.AUTO_DETECT_SETTERS )  )  {^[METHOD] getDefaultVisibilityChecker [TYPE] VisibilityChecker [PARAMETER] [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  VisibilityChecker vchecker  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^vchecker = vchecker.withCreatorVisibility ( Visibility.NONE )  ;^775^^^^^772^790^[REPLACE] vchecker = vchecker.withSetterVisibility ( Visibility.NONE ) ;^[METHOD] getDefaultVisibilityChecker [TYPE] VisibilityChecker [PARAMETER] [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  VisibilityChecker vchecker  [TYPE]  JsonNodeFactory _nodeFactory  f 
[ADD]^^775^^^^^772^790^[ADD] vchecker = vchecker.withSetterVisibility ( Visibility.NONE ) ;^[METHOD] getDefaultVisibilityChecker [TYPE] VisibilityChecker [PARAMETER] [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  VisibilityChecker vchecker  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^if  ( !isEnabled ( MapperFeature.AUTO_DETECT_CREATORS  )  || ! ( isEnabled ( MapperFeature.AUTO_DETECT_FIELDS )  )  )  )  {^777^^^^^772^790^[REPLACE] if  ( !isEnabled ( MapperFeature.AUTO_DETECT_CREATORS )  )  {^[METHOD] getDefaultVisibilityChecker [TYPE] VisibilityChecker [PARAMETER] [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  VisibilityChecker vchecker  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^vchecker = vchecker.withSetterVisibility ( Visibility.NONE )  ;^778^^^^^772^790^[REPLACE] vchecker = vchecker.withCreatorVisibility ( Visibility.NONE ) ;^[METHOD] getDefaultVisibilityChecker [TYPE] VisibilityChecker [PARAMETER] [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  VisibilityChecker vchecker  [TYPE]  JsonNodeFactory _nodeFactory  f 
[ADD]^^778^^^^^772^790^[ADD] vchecker = vchecker.withCreatorVisibility ( Visibility.NONE ) ;^[METHOD] getDefaultVisibilityChecker [TYPE] VisibilityChecker [PARAMETER] [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  VisibilityChecker vchecker  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^if  ( isEnabled ( MapperFeature.AUTO_DETECT_GETTERS )  )  {^780^^^^^772^790^[REPLACE] if  ( !isEnabled ( MapperFeature.AUTO_DETECT_GETTERS )  )  {^[METHOD] getDefaultVisibilityChecker [TYPE] VisibilityChecker [PARAMETER] [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  VisibilityChecker vchecker  [TYPE]  JsonNodeFactory _nodeFactory  f 
[ADD]^vchecker = vchecker.withGetterVisibility ( Visibility.NONE ) ;^780^781^782^^^772^790^[ADD] if  ( !isEnabled ( MapperFeature.AUTO_DETECT_GETTERS )  )  { vchecker = vchecker.withGetterVisibility ( Visibility.NONE ) ; }^[METHOD] getDefaultVisibilityChecker [TYPE] VisibilityChecker [PARAMETER] [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  VisibilityChecker vchecker  [TYPE]  JsonNodeFactory _nodeFactory  f 
[ADD]^^781^^^^^772^790^[ADD] vchecker = vchecker.withGetterVisibility ( Visibility.NONE ) ;^[METHOD] getDefaultVisibilityChecker [TYPE] VisibilityChecker [PARAMETER] [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  VisibilityChecker vchecker  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^vchecker = vchecker.withSetterVisibility ( Visibility.NONE )  ;^781^^^^^772^790^[REPLACE] vchecker = vchecker.withGetterVisibility ( Visibility.NONE ) ;^[METHOD] getDefaultVisibilityChecker [TYPE] VisibilityChecker [PARAMETER] [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  VisibilityChecker vchecker  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^if  ( !isEnabled ( MapperFeature.AUTO_DETECT_IS_GETTERS  )  || ! ( isEnabled ( MapperFeature.AUTO_DETECT_FIELDS )  )  )  )  {^783^^^^^772^790^[REPLACE] if  ( !isEnabled ( MapperFeature.AUTO_DETECT_IS_GETTERS )  )  {^[METHOD] getDefaultVisibilityChecker [TYPE] VisibilityChecker [PARAMETER] [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  VisibilityChecker vchecker  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^vchecker = vchecker.withSetterVisibility ( Visibility.NONE )  ;^784^^^^^772^790^[REPLACE] vchecker = vchecker.withIsGetterVisibility ( Visibility.NONE ) ;^[METHOD] getDefaultVisibilityChecker [TYPE] VisibilityChecker [PARAMETER] [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  VisibilityChecker vchecker  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^if  ( isEnabled ( MapperFeature.AUTO_DETECT_FIELDS )  )  {^786^^^^^772^790^[REPLACE] if  ( !isEnabled ( MapperFeature.AUTO_DETECT_FIELDS )  )  {^[METHOD] getDefaultVisibilityChecker [TYPE] VisibilityChecker [PARAMETER] [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  VisibilityChecker vchecker  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^vchecker = vchecker.withSetterVisibility ( Visibility.NONE )  ;^787^^^^^772^790^[REPLACE] vchecker = vchecker.withFieldVisibility ( Visibility.NONE ) ;^[METHOD] getDefaultVisibilityChecker [TYPE] VisibilityChecker [PARAMETER] [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  VisibilityChecker vchecker  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^return null;^789^^^^^772^790^[REPLACE] return vchecker;^[METHOD] getDefaultVisibilityChecker [TYPE] VisibilityChecker [PARAMETER] [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  VisibilityChecker vchecker  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^Collection<NamedType> subtypes = false;^945^^^^^937^968^[REPLACE] Collection<NamedType> subtypes = null;^[METHOD] findTypeDeserializer [TYPE] TypeDeserializer [PARAMETER] JavaType baseType [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  JavaType baseType  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  BeanDescription bean  [TYPE]  TypeResolverBuilder b  [TYPE]  Collection subtypes  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  featureMask  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^if  ( b != null )  {^946^^^^^937^968^[REPLACE] if  ( b == null )  {^[METHOD] findTypeDeserializer [TYPE] TypeDeserializer [PARAMETER] JavaType baseType [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  JavaType baseType  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  BeanDescription bean  [TYPE]  TypeResolverBuilder b  [TYPE]  Collection subtypes  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  featureMask  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^subtypes =  getSubtypeResolver (  ) .collectAndResolveSubtypesByTypeId ( this, null ) ;^952^^^^^946^953^[REPLACE] subtypes = getSubtypeResolver (  ) .collectAndResolveSubtypesByTypeId ( this, ac ) ;^[METHOD] findTypeDeserializer [TYPE] TypeDeserializer [PARAMETER] JavaType baseType [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  JavaType baseType  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  BeanDescription bean  [TYPE]  TypeResolverBuilder b  [TYPE]  Collection subtypes  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  featureMask  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^if  ( b != null )  {^948^^^^^937^968^[REPLACE] if  ( b == null )  {^[METHOD] findTypeDeserializer [TYPE] TypeDeserializer [PARAMETER] JavaType baseType [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  JavaType baseType  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  BeanDescription bean  [TYPE]  TypeResolverBuilder b  [TYPE]  Collection subtypes  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  featureMask  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^return this;^949^^^^^937^968^[REPLACE] return null;^[METHOD] findTypeDeserializer [TYPE] TypeDeserializer [PARAMETER] JavaType baseType [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  JavaType baseType  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  BeanDescription bean  [TYPE]  TypeResolverBuilder b  [TYPE]  Collection subtypes  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  featureMask  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^b =  getDefaultTyper ( null ) ;^947^^^^^937^968^[REPLACE] b = getDefaultTyper ( baseType ) ;^[METHOD] findTypeDeserializer [TYPE] TypeDeserializer [PARAMETER] JavaType baseType [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  JavaType baseType  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  BeanDescription bean  [TYPE]  TypeResolverBuilder b  [TYPE]  Collection subtypes  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  featureMask  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^return false;^949^^^^^937^968^[REPLACE] return null;^[METHOD] findTypeDeserializer [TYPE] TypeDeserializer [PARAMETER] JavaType baseType [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  JavaType baseType  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  BeanDescription bean  [TYPE]  TypeResolverBuilder b  [TYPE]  Collection subtypes  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  featureMask  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^if  ( this != this  )  {^948^^^^^937^968^[REPLACE] if  ( b == null )  {^[METHOD] findTypeDeserializer [TYPE] TypeDeserializer [PARAMETER] JavaType baseType [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  JavaType baseType  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  BeanDescription bean  [TYPE]  TypeResolverBuilder b  [TYPE]  Collection subtypes  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  featureMask  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^return true;^949^^^^^937^968^[REPLACE] return null;^[METHOD] findTypeDeserializer [TYPE] TypeDeserializer [PARAMETER] JavaType baseType [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  JavaType baseType  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  BeanDescription bean  [TYPE]  TypeResolverBuilder b  [TYPE]  Collection subtypes  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  featureMask  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^subtypes =  getSubtypeResolver (  ) .collectAndResolveSubtypesByTypeId ( this, null ) ;^952^^^^^937^968^[REPLACE] subtypes = getSubtypeResolver (  ) .collectAndResolveSubtypesByTypeId ( this, ac ) ;^[METHOD] findTypeDeserializer [TYPE] TypeDeserializer [PARAMETER] JavaType baseType [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  JavaType baseType  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  BeanDescription bean  [TYPE]  TypeResolverBuilder b  [TYPE]  Collection subtypes  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  featureMask  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  JsonNodeFactory _nodeFactory  f 
[REPLACE]^return b.buildTypeDeserializer ( null, baseType, subtypes ) ;^967^^^^^937^968^[REPLACE] return b.buildTypeDeserializer ( this, baseType, subtypes ) ;^[METHOD] findTypeDeserializer [TYPE] TypeDeserializer [PARAMETER] JavaType baseType [CLASS] DeserializationConfig   [TYPE]  LinkedNode _problemHandlers  problemHandlers  [TYPE]  JavaType baseType  [TYPE]  boolean false  true  [TYPE]  AnnotatedClass ac  [TYPE]  BeanDescription bean  [TYPE]  TypeResolverBuilder b  [TYPE]  Collection subtypes  [TYPE]  long serialVersionUID  [TYPE]  int _deserFeatures  _formatReadFeatures  _formatReadFeaturesToChange  _parserFeatures  _parserFeaturesToChange  deserFeatures  featureMask  formatFeatureMask  formatFeatures  mapperFeatures  mask  newDeserFeatures  newMapperFlags  newMask  newSet  parserFeatureMask  parserFeatures  [TYPE]  JsonNodeFactory _nodeFactory  f 
