[buglab_swap_variables]^super ( property, idRes ) ;^28^^^^^25^30^super ( idRes, property ) ;^[CLASS] AsPropertyTypeSerializer  [METHOD] <init> [RETURN_TYPE] String)   TypeIdResolver idRes BeanProperty property String propName [VARIABLES] String  _typePropertyName  propName  boolean  TypeIdResolver  idRes  BeanProperty  property  
[buglab_swap_variables]^super (  property ) ;^28^^^^^25^30^super ( idRes, property ) ;^[CLASS] AsPropertyTypeSerializer  [METHOD] <init> [RETURN_TYPE] String)   TypeIdResolver idRes BeanProperty property String propName [VARIABLES] String  _typePropertyName  propName  boolean  TypeIdResolver  idRes  BeanProperty  property  
[buglab_swap_variables]^super ( idRes ) ;^28^^^^^25^30^super ( idRes, property ) ;^[CLASS] AsPropertyTypeSerializer  [METHOD] <init> [RETURN_TYPE] String)   TypeIdResolver idRes BeanProperty property String propName [VARIABLES] String  _typePropertyName  propName  boolean  TypeIdResolver  idRes  BeanProperty  property  
[buglab_swap_variables]^if  ( prop == _property )  return this;^34^^^^^33^36^if  ( _property == prop )  return this;^[CLASS] AsPropertyTypeSerializer  [METHOD] forProperty [RETURN_TYPE] AsPropertyTypeSerializer   BeanProperty prop [VARIABLES] String  _typePropertyName  propName  BeanProperty  prop  boolean  
[buglab_swap_variables]^jgen.writeStringField ( value, idFromValue ( _typePropertyName )  ) ;^49^^^^^45^50^jgen.writeStringField ( _typePropertyName, idFromValue ( value )  ) ;^[CLASS] AsPropertyTypeSerializer  [METHOD] writeTypePrefixForObject [RETURN_TYPE] void   Object value JsonGenerator jgen [VARIABLES] JsonGenerator  jgen  Object  value  String  _typePropertyName  propName  boolean  
[buglab_swap_variables]^jgen.writeStringField (  idFromValue ( value )  ) ;^49^^^^^45^50^jgen.writeStringField ( _typePropertyName, idFromValue ( value )  ) ;^[CLASS] AsPropertyTypeSerializer  [METHOD] writeTypePrefixForObject [RETURN_TYPE] void   Object value JsonGenerator jgen [VARIABLES] JsonGenerator  jgen  Object  value  String  _typePropertyName  propName  boolean  
[buglab_swap_variables]^jgen.writeStringField ( _typePropertyName, idFromValueAndType (  type )  ) ;^57^^^^^53^58^jgen.writeStringField ( _typePropertyName, idFromValueAndType ( value, type )  ) ;^[CLASS] AsPropertyTypeSerializer  [METHOD] writeTypePrefixForObject [RETURN_TYPE] void   Object value JsonGenerator jgen Class<?> type [VARIABLES] JsonGenerator  jgen  Object  value  Class  type  String  _typePropertyName  propName  boolean  
[buglab_swap_variables]^jgen.writeStringField ( type, idFromValueAndType ( value, _typePropertyName )  ) ;^57^^^^^53^58^jgen.writeStringField ( _typePropertyName, idFromValueAndType ( value, type )  ) ;^[CLASS] AsPropertyTypeSerializer  [METHOD] writeTypePrefixForObject [RETURN_TYPE] void   Object value JsonGenerator jgen Class<?> type [VARIABLES] JsonGenerator  jgen  Object  value  Class  type  String  _typePropertyName  propName  boolean  
[buglab_swap_variables]^jgen.writeStringField ( _typePropertyName, idFromValueAndType ( value )  ) ;^57^^^^^53^58^jgen.writeStringField ( _typePropertyName, idFromValueAndType ( value, type )  ) ;^[CLASS] AsPropertyTypeSerializer  [METHOD] writeTypePrefixForObject [RETURN_TYPE] void   Object value JsonGenerator jgen Class<?> type [VARIABLES] JsonGenerator  jgen  Object  value  Class  type  String  _typePropertyName  propName  boolean  
[buglab_swap_variables]^jgen.writeStringField (  idFromValueAndType ( value, type )  ) ;^57^^^^^53^58^jgen.writeStringField ( _typePropertyName, idFromValueAndType ( value, type )  ) ;^[CLASS] AsPropertyTypeSerializer  [METHOD] writeTypePrefixForObject [RETURN_TYPE] void   Object value JsonGenerator jgen Class<?> type [VARIABLES] JsonGenerator  jgen  Object  value  Class  type  String  _typePropertyName  propName  boolean  
[buglab_swap_variables]^jgen.writeStringField ( _typePropertyName, idFromValueAndType ( type, value )  ) ;^57^^^^^53^58^jgen.writeStringField ( _typePropertyName, idFromValueAndType ( value, type )  ) ;^[CLASS] AsPropertyTypeSerializer  [METHOD] writeTypePrefixForObject [RETURN_TYPE] void   Object value JsonGenerator jgen Class<?> type [VARIABLES] JsonGenerator  jgen  Object  value  Class  type  String  _typePropertyName  propName  boolean  
[buglab_swap_variables]^jgen.writeStringField ( typeId, _typePropertyName ) ;^88^^^^^85^89^jgen.writeStringField ( _typePropertyName, typeId ) ;^[CLASS] AsPropertyTypeSerializer  [METHOD] writeCustomTypePrefixForObject [RETURN_TYPE] void   Object value JsonGenerator jgen String typeId [VARIABLES] JsonGenerator  jgen  Object  value  String  _typePropertyName  propName  typeId  boolean  
[buglab_swap_variables]^jgen.writeStringField ( _typePropertyName ) ;^88^^^^^85^89^jgen.writeStringField ( _typePropertyName, typeId ) ;^[CLASS] AsPropertyTypeSerializer  [METHOD] writeCustomTypePrefixForObject [RETURN_TYPE] void   Object value JsonGenerator jgen String typeId [VARIABLES] JsonGenerator  jgen  Object  value  String  _typePropertyName  propName  typeId  boolean  
[buglab_swap_variables]^jgen.writeStringField (  typeId ) ;^88^^^^^85^89^jgen.writeStringField ( _typePropertyName, typeId ) ;^[CLASS] AsPropertyTypeSerializer  [METHOD] writeCustomTypePrefixForObject [RETURN_TYPE] void   Object value JsonGenerator jgen String typeId [VARIABLES] JsonGenerator  jgen  Object  value  String  _typePropertyName  propName  typeId  boolean  
