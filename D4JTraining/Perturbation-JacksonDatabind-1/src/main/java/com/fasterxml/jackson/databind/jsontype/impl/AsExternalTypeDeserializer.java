[REPLACE]^private static final long serialVersionUID = 1;^20^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] AsExternalTypeDeserializer  
[REPLACE]^super ( bt, idRes, typePropertyName, typeIdVisible, null ) ;^25^^^^^22^26^[REPLACE] super ( bt, idRes, typePropertyName, typeIdVisible, defaultImpl ) ;^[METHOD] <init> [TYPE] Class) [PARAMETER] JavaType bt TypeIdResolver idRes String typePropertyName boolean typeIdVisible Class<?> defaultImpl [CLASS] AsExternalTypeDeserializer   [TYPE]  JavaType bt  [TYPE]  Class defaultImpl  [TYPE]  String typePropertyName  [TYPE]  boolean false  true  typeIdVisible  [TYPE]  long serialVersionUID  [TYPE]  TypeIdResolver idRes 
[REPLACE]^super ( bt, idRes, typePropertyName, typeIdVisible, defaultImpl ) ;^29^^^^^28^30^[REPLACE] super ( src, property ) ;^[METHOD] <init> [TYPE] BeanProperty) [PARAMETER] AsExternalTypeDeserializer src BeanProperty property [CLASS] AsExternalTypeDeserializer   [TYPE]  boolean false  true  [TYPE]  AsExternalTypeDeserializer src  [TYPE]  long serialVersionUID  [TYPE]  BeanProperty property 
[REPLACE]^if  ( prop  ||  _property )  {^35^^^^^33^39^[REPLACE] if  ( prop == _property )  {^[METHOD] forProperty [TYPE] TypeDeserializer [PARAMETER] BeanProperty prop [CLASS] AsExternalTypeDeserializer   [TYPE]  long serialVersionUID  [TYPE]  BeanProperty prop  [TYPE]  boolean false  true 
[REPLACE]^return null;^36^^^^^33^39^[REPLACE] return this;^[METHOD] forProperty [TYPE] TypeDeserializer [PARAMETER] BeanProperty prop [CLASS] AsExternalTypeDeserializer   [TYPE]  long serialVersionUID  [TYPE]  BeanProperty prop  [TYPE]  boolean false  true 
[REPLACE]^return new AsExternalTypeDeserializer ( null, prop ) ;^38^^^^^33^39^[REPLACE] return new AsExternalTypeDeserializer ( this, prop ) ;^[METHOD] forProperty [TYPE] TypeDeserializer [PARAMETER] BeanProperty prop [CLASS] AsExternalTypeDeserializer   [TYPE]  long serialVersionUID  [TYPE]  BeanProperty prop  [TYPE]  boolean false  true 
[REPLACE]^return new AsExternalTypeDeserializer ( this, prop ) ;^43^^^^^42^44^[REPLACE] return As.EXTERNAL_PROPERTY;^[METHOD] getTypeInclusion [TYPE] As [PARAMETER] [CLASS] AsExternalTypeDeserializer   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
