[REPLACE]^private  final  short  serialVersionUID = 1;^24^^^^^^^[REPLACE] private static final long serialVersionUID = 1;^ [CLASS] MethodProperty  
[REPLACE]^private final AnnotatedMethod _annotated;^26^^^^^^^[REPLACE] protected final AnnotatedMethod _annotated;^ [CLASS] MethodProperty  
[REPLACE]^super ( src, deser ) ;^38^^^^^34^41^[REPLACE] super ( propDef, type, typeDeser, contextAnnotations ) ;^[METHOD] <init> [TYPE] AnnotatedMethod) [PARAMETER] BeanPropertyDefinition propDef JavaType type TypeDeserializer typeDeser Annotations contextAnnotations AnnotatedMethod method [CLASS] MethodProperty   [TYPE]  JavaType type  [TYPE]  Annotations contextAnnotations  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  BeanPropertyDefinition propDef  [TYPE]  Method _setter  [TYPE]  TypeDeserializer typeDeser  [TYPE]  long serialVersionUID 
[ADD]^^38^^^^^34^41^[ADD] super ( propDef, type, typeDeser, contextAnnotations ) ;^[METHOD] <init> [TYPE] AnnotatedMethod) [PARAMETER] BeanPropertyDefinition propDef JavaType type TypeDeserializer typeDeser Annotations contextAnnotations AnnotatedMethod method [CLASS] MethodProperty   [TYPE]  JavaType type  [TYPE]  Annotations contextAnnotations  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  BeanPropertyDefinition propDef  [TYPE]  Method _setter  [TYPE]  TypeDeserializer typeDeser  [TYPE]  long serialVersionUID 
[REPLACE]^_annotated =  null;^39^^^^^34^41^[REPLACE] _annotated = method;^[METHOD] <init> [TYPE] AnnotatedMethod) [PARAMETER] BeanPropertyDefinition propDef JavaType type TypeDeserializer typeDeser Annotations contextAnnotations AnnotatedMethod method [CLASS] MethodProperty   [TYPE]  JavaType type  [TYPE]  Annotations contextAnnotations  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  BeanPropertyDefinition propDef  [TYPE]  Method _setter  [TYPE]  TypeDeserializer typeDeser  [TYPE]  long serialVersionUID 
[REPLACE]^_setter =  _annotated.getAnnotated (  ) ;^40^^^^^34^41^[REPLACE] _setter = method.getAnnotated (  ) ;^[METHOD] <init> [TYPE] AnnotatedMethod) [PARAMETER] BeanPropertyDefinition propDef JavaType type TypeDeserializer typeDeser Annotations contextAnnotations AnnotatedMethod method [CLASS] MethodProperty   [TYPE]  JavaType type  [TYPE]  Annotations contextAnnotations  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  BeanPropertyDefinition propDef  [TYPE]  Method _setter  [TYPE]  TypeDeserializer typeDeser  [TYPE]  long serialVersionUID 
[REPLACE]^super ( src, null ) ;^44^^^^^43^47^[REPLACE] super ( src, deser ) ;^[METHOD] <init> [TYPE] JsonDeserializer) [PARAMETER] MethodProperty src JsonDeserializer<?> deser [CLASS] MethodProperty   [TYPE]  Method _setter  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  MethodProperty src  [TYPE]  JsonDeserializer deser  [TYPE]  long serialVersionUID 
[REPLACE]^_annotated =  null._annotated;^45^^^^^43^47^[REPLACE] _annotated = src._annotated;^[METHOD] <init> [TYPE] JsonDeserializer) [PARAMETER] MethodProperty src JsonDeserializer<?> deser [CLASS] MethodProperty   [TYPE]  Method _setter  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  MethodProperty src  [TYPE]  JsonDeserializer deser  [TYPE]  long serialVersionUID 
[REPLACE]^_setter =  null._setter;^46^^^^^43^47^[REPLACE] _setter = src._setter;^[METHOD] <init> [TYPE] JsonDeserializer) [PARAMETER] MethodProperty src JsonDeserializer<?> deser [CLASS] MethodProperty   [TYPE]  Method _setter  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  MethodProperty src  [TYPE]  JsonDeserializer deser  [TYPE]  long serialVersionUID 
[REPLACE]^super ( src ) ;^50^^^^^49^53^[REPLACE] super ( src, newName ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] MethodProperty src String newName [CLASS] MethodProperty   [TYPE]  Method _setter  [TYPE]  String newName  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  MethodProperty src  [TYPE]  long serialVersionUID 
[REPLACE]^_annotated =  null._annotated;^51^^^^^49^53^[REPLACE] _annotated = src._annotated;^[METHOD] <init> [TYPE] String) [PARAMETER] MethodProperty src String newName [CLASS] MethodProperty   [TYPE]  Method _setter  [TYPE]  String newName  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  MethodProperty src  [TYPE]  long serialVersionUID 
[REPLACE]^_setter =  null._setter;^52^^^^^49^53^[REPLACE] _setter = src._setter;^[METHOD] <init> [TYPE] String) [PARAMETER] MethodProperty src String newName [CLASS] MethodProperty   [TYPE]  Method _setter  [TYPE]  String newName  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  MethodProperty src  [TYPE]  long serialVersionUID 
[REPLACE]^super ( src, newName ) ;^59^^^^^58^62^[REPLACE] super ( src ) ;^[METHOD] <init> [TYPE] Method) [PARAMETER] MethodProperty src Method m [CLASS] MethodProperty   [TYPE]  Method _setter  m  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  MethodProperty src  [TYPE]  long serialVersionUID 
[REPLACE]^_annotated =  null._annotated;^60^^^^^58^62^[REPLACE] _annotated = src._annotated;^[METHOD] <init> [TYPE] Method) [PARAMETER] MethodProperty src Method m [CLASS] MethodProperty   [TYPE]  Method _setter  m  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  MethodProperty src  [TYPE]  long serialVersionUID 
[ADD]^^60^^^^^58^62^[ADD] _annotated = src._annotated;^[METHOD] <init> [TYPE] Method) [PARAMETER] MethodProperty src Method m [CLASS] MethodProperty   [TYPE]  Method _setter  m  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  MethodProperty src  [TYPE]  long serialVersionUID 
[REPLACE]^_setter =  null;^61^^^^^58^62^[REPLACE] _setter = m;^[METHOD] <init> [TYPE] Method) [PARAMETER] MethodProperty src Method m [CLASS] MethodProperty   [TYPE]  Method _setter  m  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  MethodProperty src  [TYPE]  long serialVersionUID 
[REPLACE]^return new MethodProperty ( this, deser ) ;^66^^^^^65^67^[REPLACE] return new MethodProperty ( this, newName ) ;^[METHOD] withName [TYPE] MethodProperty [PARAMETER] String newName [CLASS] MethodProperty   [TYPE]  Method _setter  m  [TYPE]  String newName  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  long serialVersionUID 
[REPLACE]^return new MethodProperty ( this, newName ) ;^71^^^^^70^72^[REPLACE] return new MethodProperty ( this, deser ) ;^[METHOD] withValueDeserializer [TYPE] MethodProperty [PARAMETER] JsonDeserializer<?> deser [CLASS] MethodProperty   [TYPE]  Method _setter  m  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  JsonDeserializer deser  [TYPE]  long serialVersionUID 
[REPLACE]^return _annotated.getAnnotation ( this ) ;^82^^^^^81^83^[REPLACE] return _annotated.getAnnotation ( acls ) ;^[METHOD] getAnnotation [TYPE] <A [PARAMETER] Class<A> acls [CLASS] MethodProperty   [TYPE]  Class acls  [TYPE]  Method _setter  m  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^85^^^^^^^[REPLACE] @Override public AnnotatedMember getMember (  )  {  return _annotated; }^[METHOD] getMember [TYPE] AnnotatedMember [PARAMETER] [CLASS] MethodProperty   [TYPE]  Method _setter  m  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  long serialVersionUID 
[REPLACE]^return setAndReturn ( instance, deserialize ( jp, ctxt )  ) ;^98^^^^^94^99^[REPLACE] set ( instance, deserialize ( jp, ctxt )  ) ;^[METHOD] deserializeAndSet [TYPE] void [PARAMETER] JsonParser jp DeserializationContext ctxt Object instance [CLASS] MethodProperty   [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  DeserializationContext ctxt  [TYPE]  Object instance  [TYPE]  Method _setter  m  [TYPE]  long serialVersionUID  [TYPE]  JsonParser jp 
[REPLACE]^return _annotated.getAnnotation ( acls ) ;^106^^^^^102^107^[REPLACE] return setAndReturn ( instance, deserialize ( jp, ctxt )  ) ;^[METHOD] deserializeSetAndReturn [TYPE] Object [PARAMETER] JsonParser jp DeserializationContext ctxt Object instance [CLASS] MethodProperty   [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  DeserializationContext ctxt  [TYPE]  Object instance  [TYPE]  Method _setter  m  [TYPE]  long serialVersionUID  [TYPE]  JsonParser jp 
[ADD]^_setter.invoke ( instance, value ) ;^113^114^115^116^117^110^118^[ADD] try { _setter.invoke ( instance, value ) ; } catch  ( Exception e )  { _throwAsIOE ( e, value ) ; }^[METHOD] set [TYPE] void [PARAMETER] Object instance Object value [CLASS] MethodProperty   [TYPE]  Object instance  value  [TYPE]  Method _setter  m  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  long serialVersionUID  [TYPE]  Exception e 
[REPLACE]^Object result = _setter.invoke ( instance, value ) ;^114^^^^^110^118^[REPLACE] _setter.invoke ( instance, value ) ;^[METHOD] set [TYPE] void [PARAMETER] Object instance Object value [CLASS] MethodProperty   [TYPE]  Object instance  value  [TYPE]  Method _setter  m  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  long serialVersionUID  [TYPE]  Exception e 
[ADD]^^115^116^^^^110^118^[ADD] catch  ( Exception e )  { _throwAsIOE ( e, value ) ;^[METHOD] set [TYPE] void [PARAMETER] Object instance Object value [CLASS] MethodProperty   [TYPE]  Object instance  value  [TYPE]  Method _setter  m  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  long serialVersionUID  [TYPE]  Exception e 
[ADD]^Object result = _setter.invoke ( instance, value ) ;return  ( result == null )  ? instance : result;^124^125^126^127^128^121^131^[ADD] try { Object result = _setter.invoke ( instance, value ) ; return  ( result == null )  ? instance : result; } catch  ( Exception e )  { _throwAsIOE ( e, value ) ;^[METHOD] setAndReturn [TYPE] Object [PARAMETER] Object instance Object value [CLASS] MethodProperty   [TYPE]  Object instance  result  value  [TYPE]  Method _setter  m  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  long serialVersionUID  [TYPE]  Exception e 
[REPLACE]^returnvalue;^126^^^^^121^131^[REPLACE] return  ( result == null )  ? instance : result;^[METHOD] setAndReturn [TYPE] Object [PARAMETER] Object instance Object value [CLASS] MethodProperty   [TYPE]  Object instance  result  value  [TYPE]  Method _setter  m  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  long serialVersionUID  [TYPE]  Exception e 
[REPLACE]^Object result = _setter.invoke ( result, value ) ;^125^^^^^121^131^[REPLACE] Object result = _setter.invoke ( instance, value ) ;^[METHOD] setAndReturn [TYPE] Object [PARAMETER] Object instance Object value [CLASS] MethodProperty   [TYPE]  Object instance  result  value  [TYPE]  Method _setter  m  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  long serialVersionUID  [TYPE]  Exception e 
[REPLACE]^return   value ;^126^^^^^121^131^[REPLACE] return  ( result == null )  ? instance : result;^[METHOD] setAndReturn [TYPE] Object [PARAMETER] Object instance Object value [CLASS] MethodProperty   [TYPE]  Object instance  result  value  [TYPE]  Method _setter  m  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  long serialVersionUID  [TYPE]  Exception e 
[REPLACE]^return false;^129^^^^^121^131^[REPLACE] return null;^[METHOD] setAndReturn [TYPE] Object [PARAMETER] Object instance Object value [CLASS] MethodProperty   [TYPE]  Object instance  result  value  [TYPE]  Method _setter  m  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  long serialVersionUID  [TYPE]  Exception e 
[REPLACE]^Object result = _setter.invoke ( instance, result ) ;^125^^^^^121^131^[REPLACE] Object result = _setter.invoke ( instance, value ) ;^[METHOD] setAndReturn [TYPE] Object [PARAMETER] Object instance Object value [CLASS] MethodProperty   [TYPE]  Object instance  result  value  [TYPE]  Method _setter  m  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  long serialVersionUID  [TYPE]  Exception e 
[ADD]^^125^126^^^^121^131^[ADD] Object result = _setter.invoke ( instance, value ) ; return  ( result == null )  ? instance : result;^[METHOD] setAndReturn [TYPE] Object [PARAMETER] Object instance Object value [CLASS] MethodProperty   [TYPE]  Object instance  result  value  [TYPE]  Method _setter  m  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  long serialVersionUID  [TYPE]  Exception e 
[ADD]^^127^128^^^^121^131^[ADD] catch  ( Exception e )  { _throwAsIOE ( e, value ) ;^[METHOD] setAndReturn [TYPE] Object [PARAMETER] Object instance Object value [CLASS] MethodProperty   [TYPE]  Object instance  result  value  [TYPE]  Method _setter  m  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  long serialVersionUID  [TYPE]  Exception e 
[REPLACE]^return  new MethodProperty ( this, newName )   ) ;^140^^^^^139^141^[REPLACE] return new MethodProperty ( this, _annotated.getAnnotated (  )  ) ;^[METHOD] readResolve [TYPE] Object [PARAMETER] [CLASS] MethodProperty   [TYPE]  Method _setter  m  [TYPE]  boolean false  true  [TYPE]  AnnotatedMethod _annotated  method  [TYPE]  long serialVersionUID 
