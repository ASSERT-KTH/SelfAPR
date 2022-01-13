[REPLACE]^private static final String NO_CLASS_FOUND_TEMPLATE ;^36^^^^^^^[REPLACE] private static final String NO_CLASS_FOUND_TEMPLATE = "Did not find a query class %s for domain class %s!";^ [CLASS] SimpleEntityPathResolver  
[REPLACE]^private static final String NO_FIELD_FOUND_TEMPLATE  = null ;^37^^^^^^^[REPLACE] private static final String NO_FIELD_FOUND_TEMPLATE = "Did not find a static field of the same type in %s!";^ [CLASS] SimpleEntityPathResolver  
[REPLACE]^String pathClassName = getQueryClassName ( null ) ;^50^^^^^48^66^[REPLACE] String pathClassName = getQueryClassName ( domainClass ) ;^[METHOD] createPath [TYPE] <T> [PARAMETER] Class<T> domainClass [CLASS] SimpleEntityPathResolver   [TYPE]  SimpleEntityPathResolver INSTANCE  [TYPE]  Field field  [TYPE]  Class domainClass  pathClass  [TYPE]  String NO_CLASS_FOUND_TEMPLATE  NO_FIELD_FOUND_TEMPLATE  pathClassName  [TYPE]  boolean false  true  [TYPE]  ClassNotFoundException e 
[REPLACE]^if  ( field != false )  {^56^^^^^48^66^[REPLACE] if  ( field == null )  {^[METHOD] createPath [TYPE] <T> [PARAMETER] Class<T> domainClass [CLASS] SimpleEntityPathResolver   [TYPE]  SimpleEntityPathResolver INSTANCE  [TYPE]  Field field  [TYPE]  Class domainClass  pathClass  [TYPE]  String NO_CLASS_FOUND_TEMPLATE  NO_FIELD_FOUND_TEMPLATE  pathClassName  [TYPE]  boolean false  true  [TYPE]  ClassNotFoundException e 
[ADD]^^56^57^58^59^60^48^66^[ADD] if  ( field == null )  { throw new IllegalStateException  (" ")  ; } else { return  ( EntityPath<T> )  ReflectionUtils.getField ( field, null ) ; }^[METHOD] createPath [TYPE] <T> [PARAMETER] Class<T> domainClass [CLASS] SimpleEntityPathResolver   [TYPE]  SimpleEntityPathResolver INSTANCE  [TYPE]  Field field  [TYPE]  Class domainClass  pathClass  [TYPE]  String NO_CLASS_FOUND_TEMPLATE  NO_FIELD_FOUND_TEMPLATE  pathClassName  [TYPE]  boolean false  true  [TYPE]  ClassNotFoundException e 
[REPLACE]^return  ( EntityPath<T> )  ReflectionUtils.getField ( field, this ) ;^59^^^^^56^60^[REPLACE] return  ( EntityPath<T> )  ReflectionUtils.getField ( field, null ) ;^[METHOD] createPath [TYPE] <T> [PARAMETER] Class<T> domainClass [CLASS] SimpleEntityPathResolver   [TYPE]  SimpleEntityPathResolver INSTANCE  [TYPE]  Field field  [TYPE]  Class domainClass  pathClass  [TYPE]  String NO_CLASS_FOUND_TEMPLATE  NO_FIELD_FOUND_TEMPLATE  pathClassName  [TYPE]  boolean false  true  [TYPE]  ClassNotFoundException e 
[ADD]^^57^^^^^48^66^[ADD] throw new IllegalStateException  (" ")  ;^[METHOD] createPath [TYPE] <T> [PARAMETER] Class<T> domainClass [CLASS] SimpleEntityPathResolver   [TYPE]  SimpleEntityPathResolver INSTANCE  [TYPE]  Field field  [TYPE]  Class domainClass  pathClass  [TYPE]  String NO_CLASS_FOUND_TEMPLATE  NO_FIELD_FOUND_TEMPLATE  pathClassName  [TYPE]  boolean false  true  [TYPE]  ClassNotFoundException e 
[REPLACE]^format ( NO_CLASS_FOUND_TEMPLATE, pathClassName, domainClass.getName (  )  )  ;^57^^^^^48^66^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] createPath [TYPE] <T> [PARAMETER] Class<T> domainClass [CLASS] SimpleEntityPathResolver   [TYPE]  SimpleEntityPathResolver INSTANCE  [TYPE]  Field field  [TYPE]  Class domainClass  pathClass  [TYPE]  String NO_CLASS_FOUND_TEMPLATE  NO_FIELD_FOUND_TEMPLATE  pathClassName  [TYPE]  boolean false  true  [TYPE]  ClassNotFoundException e 
[ADD]^Class<?> pathClass = ClassUtils.forName ( pathClassName, domainClass.getClassLoader (  )  ) ;Field field = getStaticFieldOfType ( pathClass ) ;^52^53^54^^56^48^66^[ADD] try { Class<?> pathClass = ClassUtils.forName ( pathClassName, domainClass.getClassLoader (  )  ) ; Field field = getStaticFieldOfType ( pathClass ) ; if  ( field == null )  {^[METHOD] createPath [TYPE] <T> [PARAMETER] Class<T> domainClass [CLASS] SimpleEntityPathResolver   [TYPE]  SimpleEntityPathResolver INSTANCE  [TYPE]  Field field  [TYPE]  Class domainClass  pathClass  [TYPE]  String NO_CLASS_FOUND_TEMPLATE  NO_FIELD_FOUND_TEMPLATE  pathClassName  [TYPE]  boolean false  true  [TYPE]  ClassNotFoundException e 
[REPLACE]^if  ( field != null )  {^56^^^^^48^66^[REPLACE] if  ( field == null )  {^[METHOD] createPath [TYPE] <T> [PARAMETER] Class<T> domainClass [CLASS] SimpleEntityPathResolver   [TYPE]  SimpleEntityPathResolver INSTANCE  [TYPE]  Field field  [TYPE]  Class domainClass  pathClass  [TYPE]  String NO_CLASS_FOUND_TEMPLATE  NO_FIELD_FOUND_TEMPLATE  pathClassName  [TYPE]  boolean false  true  [TYPE]  ClassNotFoundException e 
[REPLACE]^return  ( EntityPath<T> )  ReflectionUtils.getField ( field, false ) ;^59^^^^^56^60^[REPLACE] return  ( EntityPath<T> )  ReflectionUtils.getField ( field, null ) ;^[METHOD] createPath [TYPE] <T> [PARAMETER] Class<T> domainClass [CLASS] SimpleEntityPathResolver   [TYPE]  SimpleEntityPathResolver INSTANCE  [TYPE]  Field field  [TYPE]  Class domainClass  pathClass  [TYPE]  String NO_CLASS_FOUND_TEMPLATE  NO_FIELD_FOUND_TEMPLATE  pathClassName  [TYPE]  boolean false  true  [TYPE]  ClassNotFoundException e 
[REPLACE]^return ;^57^^^^^48^66^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] createPath [TYPE] <T> [PARAMETER] Class<T> domainClass [CLASS] SimpleEntityPathResolver   [TYPE]  SimpleEntityPathResolver INSTANCE  [TYPE]  Field field  [TYPE]  Class domainClass  pathClass  [TYPE]  String NO_CLASS_FOUND_TEMPLATE  NO_FIELD_FOUND_TEMPLATE  pathClassName  [TYPE]  boolean false  true  [TYPE]  ClassNotFoundException e 
[REPLACE]^return  ( EntityPath<T> )  ReflectionUtils.getField ( field, this ) ;^59^^^^^48^66^[REPLACE] return  ( EntityPath<T> )  ReflectionUtils.getField ( field, null ) ;^[METHOD] createPath [TYPE] <T> [PARAMETER] Class<T> domainClass [CLASS] SimpleEntityPathResolver   [TYPE]  SimpleEntityPathResolver INSTANCE  [TYPE]  Field field  [TYPE]  Class domainClass  pathClass  [TYPE]  String NO_CLASS_FOUND_TEMPLATE  NO_FIELD_FOUND_TEMPLATE  pathClassName  [TYPE]  boolean false  true  [TYPE]  ClassNotFoundException e 
[REPLACE]^Class<?> pathClass = ClassUtils.forName ( NO_FIELD_FOUND_TEMPLATE, domainClass.getClassLoader (  )  ) ;^53^^^^^48^66^[REPLACE] Class<?> pathClass = ClassUtils.forName ( pathClassName, domainClass.getClassLoader (  )  ) ;^[METHOD] createPath [TYPE] <T> [PARAMETER] Class<T> domainClass [CLASS] SimpleEntityPathResolver   [TYPE]  SimpleEntityPathResolver INSTANCE  [TYPE]  Field field  [TYPE]  Class domainClass  pathClass  [TYPE]  String NO_CLASS_FOUND_TEMPLATE  NO_FIELD_FOUND_TEMPLATE  pathClassName  [TYPE]  boolean false  true  [TYPE]  ClassNotFoundException e 
[REPLACE]^Field field = getStaticFieldOfType ( null ) ;^54^^^^^48^66^[REPLACE] Field field = getStaticFieldOfType ( pathClass ) ;^[METHOD] createPath [TYPE] <T> [PARAMETER] Class<T> domainClass [CLASS] SimpleEntityPathResolver   [TYPE]  SimpleEntityPathResolver INSTANCE  [TYPE]  Field field  [TYPE]  Class domainClass  pathClass  [TYPE]  String NO_CLASS_FOUND_TEMPLATE  NO_FIELD_FOUND_TEMPLATE  pathClassName  [TYPE]  boolean false  true  [TYPE]  ClassNotFoundException e 
[REPLACE]^throw new IllegalArgumentException ( format ( NO_CLASS_FOUND_TEMPLATE, pathClassName, domainClass.getName (  )  ) , e )  ;^57^^^^^48^66^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] createPath [TYPE] <T> [PARAMETER] Class<T> domainClass [CLASS] SimpleEntityPathResolver   [TYPE]  SimpleEntityPathResolver INSTANCE  [TYPE]  Field field  [TYPE]  Class domainClass  pathClass  [TYPE]  String NO_CLASS_FOUND_TEMPLATE  NO_FIELD_FOUND_TEMPLATE  pathClassName  [TYPE]  boolean false  true  [TYPE]  ClassNotFoundException e 
[REPLACE]^Class<?> pathClass = ClassUtils.forName ( NO_FIELD_FOUND_TEMPLATE, domainClass .getPackage (  )   ) ;^53^^^^^48^66^[REPLACE] Class<?> pathClass = ClassUtils.forName ( pathClassName, domainClass.getClassLoader (  )  ) ;^[METHOD] createPath [TYPE] <T> [PARAMETER] Class<T> domainClass [CLASS] SimpleEntityPathResolver   [TYPE]  SimpleEntityPathResolver INSTANCE  [TYPE]  Field field  [TYPE]  Class domainClass  pathClass  [TYPE]  String NO_CLASS_FOUND_TEMPLATE  NO_FIELD_FOUND_TEMPLATE  pathClassName  [TYPE]  boolean false  true  [TYPE]  ClassNotFoundException e 
[REPLACE]^return ;^63^64^^^^48^66^[REPLACE] throw new IllegalArgumentException  (" ")  , e ) ;^[METHOD] createPath [TYPE] <T> [PARAMETER] Class<T> domainClass [CLASS] SimpleEntityPathResolver   [TYPE]  SimpleEntityPathResolver INSTANCE  [TYPE]  Field field  [TYPE]  Class domainClass  pathClass  [TYPE]  String NO_CLASS_FOUND_TEMPLATE  NO_FIELD_FOUND_TEMPLATE  pathClassName  [TYPE]  boolean false  true  [TYPE]  ClassNotFoundException e 
