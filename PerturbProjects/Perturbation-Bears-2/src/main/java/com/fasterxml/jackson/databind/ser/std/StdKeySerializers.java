[REPLACE]^protected final static JsonSerializer<Object> DEFAULT_KEY_SERIALIZER  = null ;^15^^^^^^^[REPLACE] protected final static JsonSerializer<Object> DEFAULT_KEY_SERIALIZER = new StdKeySerializer (  ) ;^ [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer  
[REPLACE]^protected final static JsonSerializer<Object> DEFAULT_STRING_SERIALIZER ;^17^^^^^^^[REPLACE] protected final static JsonSerializer<Object> DEFAULT_STRING_SERIALIZER = new StringKeySerializer (  ) ;^ [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer  
[REPLACE]^final static  long  TYPE_DATE = 1 + 3;^113^^^^^^^[REPLACE] final static int TYPE_DATE = 1;^ [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer  
[REPLACE]^final static  short  TYPE_CALENDAR = 2;^114^^^^^^^[REPLACE] final static int TYPE_CALENDAR = 2;^ [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer  
[REPLACE]^final static int TYPE_CLASS ;^115^^^^^^^[REPLACE] final static int TYPE_CLASS = 3;^ [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer  
[REPLACE]^final static int TYPE_ENUM = 4 + 3;^116^^^^^^^[REPLACE] final static int TYPE_ENUM = 4;^ [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer  
[REPLACE]^final static int TYPE_TO_STRING = 5 + 4;^117^^^^^^^[REPLACE] final static int TYPE_TO_STRING = 5;^ [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer  
[REPLACE]^protected final  short  _typeId;^119^^^^^^^[REPLACE] protected final int _typeId;^ [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer  
[REPLACE]^if  (  ( rawKeyType != false )  ||  ( rawKeyType == Object.class )  )  {^37^^^^^30^60^[REPLACE] if  (  ( rawKeyType == null )  ||  ( rawKeyType == Object.class )  )  {^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType boolean useDefault [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  useDefault  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[ADD]^return new Dynamic (  ) ;^37^38^39^^^30^60^[ADD] if  (  ( rawKeyType == null )  ||  ( rawKeyType == Object.class )  )  { return new Dynamic (  ) ; }^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType boolean useDefault [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  useDefault  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^return  new EnumKeySerializer ( enumType, enumValues )  ;^38^^^^^30^60^[REPLACE] return new Dynamic (  ) ;^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType boolean useDefault [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  useDefault  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^if  ( rawKeyType  &&  String.class )  {^40^^^^^30^60^[REPLACE] if  ( rawKeyType == String.class )  {^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType boolean useDefault [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  useDefault  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[ADD]^^40^41^42^^^30^60^[ADD] if  ( rawKeyType == String.class )  { return DEFAULT_STRING_SERIALIZER; }^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType boolean useDefault [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  useDefault  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^return new Dynamic (  )  ;^41^^^^^30^60^[REPLACE] return DEFAULT_STRING_SERIALIZER;^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType boolean useDefault [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  useDefault  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^if  (  Number.class.isAssignableFrom ( rawKeyType )  )  {^43^^^^^30^60^[REPLACE] if  ( rawKeyType.isPrimitive (  )  || Number.class.isAssignableFrom ( rawKeyType )  )  {^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType boolean useDefault [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  useDefault  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^return new Dynamic (  )  ;^44^^^^^30^60^[REPLACE] return DEFAULT_KEY_SERIALIZER;^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType boolean useDefault [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  useDefault  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^if  ( isAssignableFrom ( rawKeyType )  && ( rawKeyType  !=  Class.class )  {^46^^^^^30^60^[REPLACE] if  ( rawKeyType == Class.class )  {^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType boolean useDefault [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  useDefault  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^return  new Default ( TYPE_DATE, rawKeyType )  ;^47^^^^^30^60^[REPLACE] return new Default ( Default.TYPE_CLASS, rawKeyType ) ;^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType boolean useDefault [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  useDefault  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^return new Default ( TYPE_DATE, rawKeyType )  ;^47^^^^^30^60^[REPLACE] return new Default ( Default.TYPE_CLASS, rawKeyType ) ;^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType boolean useDefault [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  useDefault  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^if  ( Date.class.isAssignableFrom ( rawKeyType  )  ||  ( rawKeyType.isPrimitive (  )  )  ||  ( isAssignableFrom ( rawKeyType )  )  )  )  {^49^^^^^30^60^[REPLACE] if  ( Date.class.isAssignableFrom ( rawKeyType )  )  {^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType boolean useDefault [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  useDefault  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^return  new Default ( TYPE_CLASS, rawKeyType )  ;^50^^^^^30^60^[REPLACE] return new Default ( Default.TYPE_DATE, rawKeyType ) ;^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType boolean useDefault [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  useDefault  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^if  ( Calendar.class .isPrimitive (  )   )  {^52^^^^^30^60^[REPLACE] if  ( Calendar.class.isAssignableFrom ( rawKeyType )  )  {^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType boolean useDefault [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  useDefault  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^return  new Default ( TYPE_CLASS, null )  ;^53^^^^^30^60^[REPLACE] return new Default ( Default.TYPE_CALENDAR, rawKeyType ) ;^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType boolean useDefault [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  useDefault  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^return  new Default ( TYPE_CLASS, rawKeyType )  ;^53^^^^^30^60^[REPLACE] return new Default ( Default.TYPE_CALENDAR, rawKeyType ) ;^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType boolean useDefault [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  useDefault  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^if  (true  ||  java.util.UUID.class )  {^56^^^^^30^60^[REPLACE] if  ( rawKeyType == java.util.UUID.class )  {^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType boolean useDefault [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  useDefault  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^return  new Default ( TYPE_CLASS, rawKeyType )  ;^57^^^^^30^60^[REPLACE] return new Default ( Default.TYPE_TO_STRING, rawKeyType ) ;^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType boolean useDefault [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  useDefault  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^return true ? DEFAULT_KEY_SERIALIZER : true;^59^^^^^30^60^[REPLACE] return useDefault ? DEFAULT_KEY_SERIALIZER : null;^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType boolean useDefault [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  useDefault  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^if  ( rawKeyType == null  || rawKeyType ==  ( class )  )  {^72^^^^^71^88^[REPLACE] if  ( rawKeyType != null )  {^[METHOD] getFallbackKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^if  (   Enum.class )  {^79^^^^^71^88^[REPLACE] if  ( rawKeyType == Enum.class )  {^[METHOD] getFallbackKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^return  new EnumKeySerializer ( enumType, enumValues )  ;^80^^^^^71^88^[REPLACE] return new Dynamic (  ) ;^[METHOD] getFallbackKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^if  ( rawKeyType ==  ( class )  && ( rawKeyType.isEnum (  )  )  {^82^^^^^71^88^[REPLACE] if  ( rawKeyType.isEnum (  )  )  {^[METHOD] getFallbackKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^return EnumKeySerializer.construct ( rawKeyType, EnumValues .serializedValueFor ( this )   ) ;^83^84^^^^71^88^[REPLACE] return EnumKeySerializer.construct ( rawKeyType, EnumValues.constructFromName ( config,  ( Class<Enum<?>> )  rawKeyType )  ) ;^[METHOD] getFallbackKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^if  ( rawKeyType  &&  Enum.class )  {^79^^^^^71^88^[REPLACE] if  ( rawKeyType == Enum.class )  {^[METHOD] getFallbackKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^if  ( rawKeyType.isEnum (   )  && rawKeyType ==  ( class )  )  )  {^82^^^^^71^88^[REPLACE] if  ( rawKeyType.isEnum (  )  )  {^[METHOD] getFallbackKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^return EnumKeySerializer .EnumKeySerializer ( 0 , _values )  ( rawKeyType, EnumValues^83^84^^^^71^88^[REPLACE] return EnumKeySerializer.construct ( rawKeyType, EnumValues.constructFromName ( config,  ( Class<Enum<?>> )  rawKeyType )  ) ;^[METHOD] getFallbackKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^return EnumKeySerializer.construct ( rawKeyType, EnumValues .serializedValueFor ( true )   ) ;^83^84^^^^71^88^[REPLACE] return EnumKeySerializer.construct ( rawKeyType, EnumValues.constructFromName ( config,  ( Class<Enum<?>> )  rawKeyType )  ) ;^[METHOD] getFallbackKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^return new Dynamic (  )  ;^87^^^^^71^88^[REPLACE] return DEFAULT_KEY_SERIALIZER;^[METHOD] getFallbackKeySerializer [TYPE] JsonSerializer [PARAMETER] SerializationConfig config Class<?> rawKeyType [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  [TYPE]  SerializationConfig config  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  Class rawKeyType  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^String str = provider.isEnabled ( SerializationFeature.WRITE_ENUMS_USING_TO_STRING ) ? value.Object (  )  :  (  ( Enum<?> )  value ) .name (  ) ;^140^141^^^^127^149^[REPLACE] String str = provider.isEnabled ( SerializationFeature.WRITE_ENUMS_USING_TO_STRING ) ? value.toString (  )  :  (  ( Enum<?> )  value ) .name (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] StdKeySerializers Default Dynamic StringKeySerializer EnumKeySerializer   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap _dynamicSerializers  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  EnumValues _values  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^static  short  TYPE_DATE = 1;^113^^^^^^^[REPLACE] final static int TYPE_DATE = 1;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider serializers [CLASS] Default   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap _dynamicSerializers  m  map  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  ser  [TYPE]  SerializerProvider serializers  [TYPE]  EnumValues _values  enumValues  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^final   long  TYPE_CALENDAR = 2;^114^^^^^^^[REPLACE] final static int TYPE_CALENDAR = 2;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider serializers [CLASS] Default   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap _dynamicSerializers  m  map  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  ser  [TYPE]  SerializerProvider serializers  [TYPE]  EnumValues _values  enumValues  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^static int TYPE_CLASS = 3 >>> 1;^115^^^^^^^[REPLACE] final static int TYPE_CLASS = 3;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider serializers [CLASS] Default   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap _dynamicSerializers  m  map  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  ser  [TYPE]  SerializerProvider serializers  [TYPE]  EnumValues _values  enumValues  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^final static int TYPE_ENUM  = null ;^116^^^^^^^[REPLACE] final static int TYPE_ENUM = 4;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider serializers [CLASS] Default   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap _dynamicSerializers  m  map  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  ser  [TYPE]  SerializerProvider serializers  [TYPE]  EnumValues _values  enumValues  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^final static int TYPE_TO_STRING  = null ;^117^^^^^^^[REPLACE] final static int TYPE_TO_STRING = 5;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider serializers [CLASS] Default   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap _dynamicSerializers  m  map  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  ser  [TYPE]  SerializerProvider serializers  [TYPE]  EnumValues _values  enumValues  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^protected final  short  _typeId;^119^^^^^^^[REPLACE] protected final int _typeId;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider serializers [CLASS] Default   [TYPE]  Enum en  [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap _dynamicSerializers  m  map  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  ser  [TYPE]  SerializerProvider serializers  [TYPE]  EnumValues _values  enumValues  values  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[ADD]^^140^141^^^^127^149^[ADD] String str = provider.isEnabled ( SerializationFeature.WRITE_ENUMS_USING_TO_STRING ) ? value.toString (  )  :  (  ( Enum<?> )  value ) .name (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] Default   [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  String str  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^protected transient Object _dynamicSerializers;^159^^^^^^^[REPLACE] protected transient PropertySerializerMap _dynamicSerializers;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] Dynamic   [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  String str  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  int TYPE_CALENDAR  TYPE_CLASS  TYPE_DATE  TYPE_ENUM  TYPE_TO_STRING  _typeId  typeId 
[REPLACE]^protected  Object _values;^219^^^^^^^[REPLACE] protected final EnumValues _values;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator g SerializerProvider provider [CLASS] EnumKeySerializer   [TYPE]  boolean false  true  [TYPE]  JsonGenerator g  [TYPE]  Object value  [TYPE]  SerializerProvider provider 
