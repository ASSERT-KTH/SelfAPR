[buglab_swap_variables]^super ( mutator, type, null, contextAnnotations, propertyName, false ) ;^30^^^^^26^32^super ( propertyName, type, null, contextAnnotations, mutator, false ) ;^[CLASS] ValueInjector  [METHOD] <init> [RETURN_TYPE] Object)   String propertyName JavaType type Annotations contextAnnotations AnnotatedMember mutator Object valueId [VARIABLES] AnnotatedMember  mutator  Object  _valueId  valueId  JavaType  type  String  propertyName  Annotations  contextAnnotations  boolean  
[buglab_swap_variables]^super (  type, null, contextAnnotations, mutator, false ) ;^30^^^^^26^32^super ( propertyName, type, null, contextAnnotations, mutator, false ) ;^[CLASS] ValueInjector  [METHOD] <init> [RETURN_TYPE] Object)   String propertyName JavaType type Annotations contextAnnotations AnnotatedMember mutator Object valueId [VARIABLES] AnnotatedMember  mutator  Object  _valueId  valueId  JavaType  type  String  propertyName  Annotations  contextAnnotations  boolean  
[buglab_swap_variables]^super ( propertyName, contextAnnotations, null, type, mutator, false ) ;^30^^^^^26^32^super ( propertyName, type, null, contextAnnotations, mutator, false ) ;^[CLASS] ValueInjector  [METHOD] <init> [RETURN_TYPE] Object)   String propertyName JavaType type Annotations contextAnnotations AnnotatedMember mutator Object valueId [VARIABLES] AnnotatedMember  mutator  Object  _valueId  valueId  JavaType  type  String  propertyName  Annotations  contextAnnotations  boolean  
[buglab_swap_variables]^super ( propertyName,  null, contextAnnotations, mutator, false ) ;^30^^^^^26^32^super ( propertyName, type, null, contextAnnotations, mutator, false ) ;^[CLASS] ValueInjector  [METHOD] <init> [RETURN_TYPE] Object)   String propertyName JavaType type Annotations contextAnnotations AnnotatedMember mutator Object valueId [VARIABLES] AnnotatedMember  mutator  Object  _valueId  valueId  JavaType  type  String  propertyName  Annotations  contextAnnotations  boolean  
[buglab_swap_variables]^super ( contextAnnotations, type, null, propertyName, mutator, false ) ;^30^^^^^26^32^super ( propertyName, type, null, contextAnnotations, mutator, false ) ;^[CLASS] ValueInjector  [METHOD] <init> [RETURN_TYPE] Object)   String propertyName JavaType type Annotations contextAnnotations AnnotatedMember mutator Object valueId [VARIABLES] AnnotatedMember  mutator  Object  _valueId  valueId  JavaType  type  String  propertyName  Annotations  contextAnnotations  boolean  
[buglab_swap_variables]^super ( propertyName, type, null,  mutator, false ) ;^30^^^^^26^32^super ( propertyName, type, null, contextAnnotations, mutator, false ) ;^[CLASS] ValueInjector  [METHOD] <init> [RETURN_TYPE] Object)   String propertyName JavaType type Annotations contextAnnotations AnnotatedMember mutator Object valueId [VARIABLES] AnnotatedMember  mutator  Object  _valueId  valueId  JavaType  type  String  propertyName  Annotations  contextAnnotations  boolean  
[buglab_swap_variables]^super ( propertyName, type, null, mutator, contextAnnotations, false ) ;^30^^^^^26^32^super ( propertyName, type, null, contextAnnotations, mutator, false ) ;^[CLASS] ValueInjector  [METHOD] <init> [RETURN_TYPE] Object)   String propertyName JavaType type Annotations contextAnnotations AnnotatedMember mutator Object valueId [VARIABLES] AnnotatedMember  mutator  Object  _valueId  valueId  JavaType  type  String  propertyName  Annotations  contextAnnotations  boolean  
[buglab_swap_variables]^super ( propertyName, type, null, contextAnnotations,  false ) ;^30^^^^^26^32^super ( propertyName, type, null, contextAnnotations, mutator, false ) ;^[CLASS] ValueInjector  [METHOD] <init> [RETURN_TYPE] Object)   String propertyName JavaType type Annotations contextAnnotations AnnotatedMember mutator Object valueId [VARIABLES] AnnotatedMember  mutator  Object  _valueId  valueId  JavaType  type  String  propertyName  Annotations  contextAnnotations  boolean  
[buglab_swap_variables]^return _valueId.findInjectableValue ( context, this, beanInstance ) ;^36^^^^^34^37^return context.findInjectableValue ( _valueId, this, beanInstance ) ;^[CLASS] ValueInjector  [METHOD] findValue [RETURN_TYPE] Object   DeserializationContext context Object beanInstance [VARIABLES] DeserializationContext  context  Object  _valueId  beanInstance  valueId  boolean  
[buglab_swap_variables]^return context.findInjectableValue ( beanInstance, this, _valueId ) ;^36^^^^^34^37^return context.findInjectableValue ( _valueId, this, beanInstance ) ;^[CLASS] ValueInjector  [METHOD] findValue [RETURN_TYPE] Object   DeserializationContext context Object beanInstance [VARIABLES] DeserializationContext  context  Object  _valueId  beanInstance  valueId  boolean  
[buglab_swap_variables]^return context.findInjectableValue ( _valueId, this ) ;^36^^^^^34^37^return context.findInjectableValue ( _valueId, this, beanInstance ) ;^[CLASS] ValueInjector  [METHOD] findValue [RETURN_TYPE] Object   DeserializationContext context Object beanInstance [VARIABLES] DeserializationContext  context  Object  _valueId  beanInstance  valueId  boolean  
[buglab_swap_variables]^return context.findInjectableValue (  this, beanInstance ) ;^36^^^^^34^37^return context.findInjectableValue ( _valueId, this, beanInstance ) ;^[CLASS] ValueInjector  [METHOD] findValue [RETURN_TYPE] Object   DeserializationContext context Object beanInstance [VARIABLES] DeserializationContext  context  Object  _valueId  beanInstance  valueId  boolean  
[buglab_swap_variables]^return beanInstance.findInjectableValue ( _valueId, this, context ) ;^36^^^^^34^37^return context.findInjectableValue ( _valueId, this, beanInstance ) ;^[CLASS] ValueInjector  [METHOD] findValue [RETURN_TYPE] Object   DeserializationContext context Object beanInstance [VARIABLES] DeserializationContext  context  Object  _valueId  beanInstance  valueId  boolean  
[buglab_swap_variables]^_member.setValue (  findValue ( context, beanInstance )  ) ;^42^^^^^39^43^_member.setValue ( beanInstance, findValue ( context, beanInstance )  ) ;^[CLASS] ValueInjector  [METHOD] inject [RETURN_TYPE] void   DeserializationContext context Object beanInstance [VARIABLES] DeserializationContext  context  Object  _valueId  beanInstance  valueId  boolean  
[buglab_swap_variables]^_member.setValue ( beanInstance, findValue (  beanInstance )  ) ;^42^^^^^39^43^_member.setValue ( beanInstance, findValue ( context, beanInstance )  ) ;^[CLASS] ValueInjector  [METHOD] inject [RETURN_TYPE] void   DeserializationContext context Object beanInstance [VARIABLES] DeserializationContext  context  Object  _valueId  beanInstance  valueId  boolean  
[buglab_swap_variables]^_member.setValue ( context, findValue ( beanInstance, beanInstance )  ) ;^42^^^^^39^43^_member.setValue ( beanInstance, findValue ( context, beanInstance )  ) ;^[CLASS] ValueInjector  [METHOD] inject [RETURN_TYPE] void   DeserializationContext context Object beanInstance [VARIABLES] DeserializationContext  context  Object  _valueId  beanInstance  valueId  boolean  
