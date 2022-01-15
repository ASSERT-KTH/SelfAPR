[REPLACE]^private static final  char  MAX_CACHE_PROPERTY_NAME = "com.google.gson.annotation_cache_size_hint";^37^38^^^^37^38^[REPLACE] private static final String MAX_CACHE_PROPERTY_NAME = "com.google.gson.annotation_cache_size_hint";^ [CLASS] FieldAttributes  
[REPLACE]^private static final Cache<Pair<Class<?>, String>, Collection<Annotation>> ANNOTATION_CACHE ;^40^41^^^^40^41^[REPLACE] private static final Cache<Pair<Class<?>, String>, Collection<Annotation>> ANNOTATION_CACHE = new LruCache<Pair<Class<?>,String>, Collection<Annotation>> ( getMaxCacheSize (  )  ) ;^ [CLASS] FieldAttributes  
[REPLACE]^private  boolean isSynthetic;^46^^^^^^^[REPLACE] private final boolean isSynthetic;^ [CLASS] FieldAttributes  
[REPLACE]^private  String name;^48^^^^^^^[REPLACE] private final String name;^ [CLASS] FieldAttributes  
[REPLACE]^false   ;^60^^^^^59^67^[REPLACE] Preconditions.checkNotNull ( declaringClazz ) ;^[METHOD] <init> [TYPE] Field) [PARAMETER] Class<?> declaringClazz Field f [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  [TYPE]  int modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^this.declaringClazz =  false;^61^^^^^59^67^[REPLACE] this.declaringClazz = declaringClazz;^[METHOD] <init> [TYPE] Field) [PARAMETER] Class<?> declaringClazz Field f [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  [TYPE]  int modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[ADD]^^61^^^^^59^67^[ADD] this.declaringClazz = declaringClazz;^[METHOD] <init> [TYPE] Field) [PARAMETER] Class<?> declaringClazz Field f [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  [TYPE]  int modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^name =  field.getName (  ) ;^62^^^^^59^67^[REPLACE] name = f.getName (  ) ;^[METHOD] <init> [TYPE] Field) [PARAMETER] Class<?> declaringClazz Field f [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  [TYPE]  int modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[ADD]^^62^63^^^^59^67^[ADD] name = f.getName (  ) ; declaredType = f.getType (  ) ;^[METHOD] <init> [TYPE] Field) [PARAMETER] Class<?> declaringClazz Field f [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  [TYPE]  int modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^declaredType =  field.getType (  ) ;^63^^^^^59^67^[REPLACE] declaredType = f.getType (  ) ;^[METHOD] <init> [TYPE] Field) [PARAMETER] Class<?> declaringClazz Field f [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  [TYPE]  int modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^isSynthetic =  field.isSynthetic (  ) ;^64^^^^^59^67^[REPLACE] isSynthetic = f.isSynthetic (  ) ;^[METHOD] <init> [TYPE] Field) [PARAMETER] Class<?> declaringClazz Field f [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  [TYPE]  int modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^modifiers =  field.getModifieldiers (  ) ;^65^^^^^59^67^[REPLACE] modifiers = f.getModifiers (  ) ;^[METHOD] <init> [TYPE] Field) [PARAMETER] Class<?> declaringClazz Field f [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  [TYPE]  int modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^field =  null;^66^^^^^59^67^[REPLACE] field = f;^[METHOD] <init> [TYPE] Field) [PARAMETER] Class<?> declaringClazz Field f [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  [TYPE]  int modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^final int defaultMaxCacheSize = 2000 / 2;^70^^^^^69^78^[REPLACE] final int defaultMaxCacheSize = 2000;^[METHOD] getMaxCacheSize [TYPE] int [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  NumberFormatException e  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[ADD]^MAX_CACHE_PROPERTY_NAME, String.valueOf ( defaultMaxCacheSize )  ) ;return Integer.parseInt ( propertyValue ) ;^71^72^73^74^75^69^78^[ADD] try { String propertyValue = System.getProperty ( MAX_CACHE_PROPERTY_NAME, String.valueOf ( defaultMaxCacheSize )  ) ; return Integer.parseInt ( propertyValue ) ; } catch  ( NumberFormatException e )  {^[METHOD] getMaxCacheSize [TYPE] int [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  NumberFormatException e  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^return   propertyValue   ;^74^^^^^69^78^[REPLACE] return Integer.parseInt ( propertyValue ) ;^[METHOD] getMaxCacheSize [TYPE] int [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  NumberFormatException e  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^String propertyValue = System.getProperty ( MAX_CACHE_PROPERTY_NAME, String.valueOf ( modifiers )  ) ;^72^73^^^^69^78^[REPLACE] String propertyValue = System.getProperty ( MAX_CACHE_PROPERTY_NAME, String.valueOf ( defaultMaxCacheSize )  ) ;^[METHOD] getMaxCacheSize [TYPE] int [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  NumberFormatException e  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^return modifiers;^76^^^^^69^78^[REPLACE] return defaultMaxCacheSize;^[METHOD] getMaxCacheSize [TYPE] int [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  NumberFormatException e  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[ADD]^^72^73^^^^69^78^[ADD] String propertyValue = System.getProperty ( MAX_CACHE_PROPERTY_NAME, String.valueOf ( defaultMaxCacheSize )  ) ;^[METHOD] getMaxCacheSize [TYPE] int [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  NumberFormatException e  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^return declaredType;^84^^^^^83^85^[REPLACE] return declaringClazz;^[METHOD] getDeclaringClass [TYPE] Class [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^return declaredType;^91^^^^^90^92^[REPLACE] return name;^[METHOD] getName [TYPE] String [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^if  ( genericType != null )  {^111^^^^^110^115^[REPLACE] if  ( genericType == null )  {^[METHOD] getDeclaredType [TYPE] Type [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^genericType  = null ;^112^^^^^110^115^[REPLACE] genericType = field.getGenericType (  ) ;^[METHOD] getDeclaredType [TYPE] Type [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^genericType ;^112^^^^^110^115^[REPLACE] genericType = field.getGenericType (  ) ;^[METHOD] getDeclaredType [TYPE] Type [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[ADD]^^112^^^^^110^115^[ADD] genericType = field.getGenericType (  ) ;^[METHOD] getDeclaredType [TYPE] Type [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^return declaredType;^114^^^^^110^115^[REPLACE] return genericType;^[METHOD] getDeclaredType [TYPE] Type [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^return defaultMaxCacheSize;^134^^^^^133^135^[REPLACE] return declaredType;^[METHOD] getDeclaredClass [TYPE] Class [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^return getAnnotationFromArray ( getAnnotations (  ) , null ) ;^145^^^^^144^146^[REPLACE] return getAnnotationFromArray ( getAnnotations (  ) , annotation ) ;^[METHOD] getAnnotation [TYPE] <T [PARAMETER] Class<T> annotation [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class annotation  declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^if  ( annotations != true )  {^155^^^^^154^165^[REPLACE] if  ( annotations == null )  {^[METHOD] getAnnotations [TYPE] Collection [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class annotation  declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE  [TYPE]  Pair key 
[REPLACE]^if  ( annotations != null )  {^158^^^^^154^165^[REPLACE] if  ( annotations == null )  {^[METHOD] getAnnotations [TYPE] Collection [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class annotation  declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE  [TYPE]  Pair key 
[REPLACE]^annotations  =  annotations ;^159^160^^^^154^165^[REPLACE] annotations = Collections.unmodifiableCollection ( Arrays.asList ( field.getAnnotations (  )  )  ) ;^[METHOD] getAnnotations [TYPE] Collection [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class annotation  declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE  [TYPE]  Pair key 
[REPLACE]^annotations =  ANNOTATION_CACHE.getElement ( null ) ;^157^^^^^154^165^[REPLACE] annotations = ANNOTATION_CACHE.getElement ( key ) ;^[METHOD] getAnnotations [TYPE] Collection [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class annotation  declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE  [TYPE]  Pair key 
[REPLACE]^annotations ;^159^160^^^^154^165^[REPLACE] annotations = Collections.unmodifiableCollection ( Arrays.asList ( field.getAnnotations (  )  )  ) ;^[METHOD] getAnnotations [TYPE] Collection [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class annotation  declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE  [TYPE]  Pair key 
[ADD]^^159^160^161^162^^154^165^[ADD] annotations = Collections.unmodifiableCollection ( Arrays.asList ( field.getAnnotations (  )  )  ) ; ANNOTATION_CACHE.addElement ( key, annotations ) ; }^[METHOD] getAnnotations [TYPE] Collection [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class annotation  declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE  [TYPE]  Pair key 
[REPLACE]^final int defaultMaxCacheSize = 2000;^156^^^^^154^165^[REPLACE] Pair<Class<?>, String> key = new Pair<Class<?>, String> ( declaringClazz, name ) ;^[METHOD] getAnnotations [TYPE] Collection [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class annotation  declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE  [TYPE]  Pair key 
[REPLACE]^annotations  = null ;^159^160^^^^154^165^[REPLACE] annotations = Collections.unmodifiableCollection ( Arrays.asList ( field.getAnnotations (  )  )  ) ;^[METHOD] getAnnotations [TYPE] Collection [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class annotation  declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE  [TYPE]  Pair key 
[ADD]^^156^^^^^154^165^[ADD] Pair<Class<?>, String> key = new Pair<Class<?>, String> ( declaringClazz, name ) ;^[METHOD] getAnnotations [TYPE] Collection [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class annotation  declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE  [TYPE]  Pair key 
[REPLACE]^return declaredType;^164^^^^^154^165^[REPLACE] return annotations;^[METHOD] getAnnotations [TYPE] Collection [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class annotation  declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifiers  [TYPE]  Cache ANNOTATION_CACHE  [TYPE]  Pair key 
[REPLACE]^return  ( modifiers & modifier )   ;^178^^^^^177^179^[REPLACE] return  ( modifiers & modifier )  != 0;^[METHOD] hasModifier [TYPE] boolean [PARAMETER] int modifier [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class annotation  declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifier  modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^return field.get ( instance ) ;^189^^^^^188^190^[REPLACE] field.set ( instance, value ) ;^[METHOD] set [TYPE] void [PARAMETER] Object instance Object value [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class annotation  declaredType  declaringClazz  [TYPE]  Object instance  value  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifier  modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^return declaredType;^200^^^^^199^201^[REPLACE] return field.get ( instance ) ;^[METHOD] get [TYPE] Object [PARAMETER] Object instance [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class annotation  declaredType  declaringClazz  [TYPE]  Object instance  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifier  modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^return declaredType;^209^^^^^208^210^[REPLACE] return isSynthetic;^[METHOD] isSynthetic [TYPE] boolean [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class annotation  declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifier  modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^return declaredType;^217^^^^^216^218^[REPLACE] return field;^[METHOD] getFieldObject [TYPE] Field [PARAMETER] [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class annotation  declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifier  modifiers  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^if  ( a.annotationType (  )   ||  false )  {^224^^^^^221^229^[REPLACE] if  ( a.annotationType (  )  == annotation )  {^[METHOD] getAnnotationFromArray [TYPE] <T [PARAMETER] Annotation> annotations Class<T> annotation [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class annotation  declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifier  modifiers  [TYPE]  Annotation a  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^return declaredType;^225^^^^^221^229^[REPLACE] return  ( T )  a;^[METHOD] getAnnotationFromArray [TYPE] <T [PARAMETER] Annotation> annotations Class<T> annotation [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class annotation  declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifier  modifiers  [TYPE]  Annotation a  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^for  ( Annotation a : annotations )  { if  ( a.annotationType (  )  == annotation )  {^223^^^^^221^229^[REPLACE] for  ( Annotation a : annotations )  {^[METHOD] getAnnotationFromArray [TYPE] <T [PARAMETER] Annotation> annotations Class<T> annotation [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class annotation  declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifier  modifiers  [TYPE]  Annotation a  [TYPE]  Cache ANNOTATION_CACHE 
[REPLACE]^return this;^228^^^^^221^229^[REPLACE] return null;^[METHOD] getAnnotationFromArray [TYPE] <T [PARAMETER] Annotation> annotations Class<T> annotation [CLASS] FieldAttributes   [TYPE]  Field f  field  [TYPE]  Type genericType  [TYPE]  boolean false  isSynthetic  true  [TYPE]  Collection annotations  [TYPE]  Class annotation  declaredType  declaringClazz  [TYPE]  String MAX_CACHE_PROPERTY_NAME  name  propertyValue  [TYPE]  int defaultMaxCacheSize  modifier  modifiers  [TYPE]  Annotation a  [TYPE]  Cache ANNOTATION_CACHE 
