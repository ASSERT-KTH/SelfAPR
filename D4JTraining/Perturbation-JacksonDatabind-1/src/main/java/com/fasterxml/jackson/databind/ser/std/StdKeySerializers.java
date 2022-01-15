[REPLACE]^protected final  JsonSerializer<Object> DEFAULT_KEY_SERIALIZER = new StdKeySerializer (  ) ;^15^^^^^^^[REPLACE] protected final static JsonSerializer<Object> DEFAULT_KEY_SERIALIZER = new StdKeySerializer (  ) ;^ [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer  
[REPLACE]^protected final static JsonSerializer<Object> DEFAULT_STRING_SERIALIZER  = null ;^18^19^^^^18^19^[REPLACE] protected final static JsonSerializer<Object> DEFAULT_STRING_SERIALIZER =  ( JsonSerializer<Object> )  ( JsonSerializer<?> )  new StringKeySerializer (  ) ;^ [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer  
[REPLACE]^protected  static JsonSerializer<?> instance = new DateKeySerializer (  ) ;^69^^^^^^^[REPLACE] protected final static JsonSerializer<?> instance = new DateKeySerializer (  ) ;^ [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer  
[REPLACE]^protected  static JsonSerializer<?> instance = new CalendarKeySerializer (  ) ;^84^^^^^^^[REPLACE] protected final static JsonSerializer<?> instance = new CalendarKeySerializer (  ) ;^ [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer  
[REPLACE]^public DateKeySerializer (  )  { super ( Date.class ) ; }^56^^^^^^^[REPLACE] public StringKeySerializer (  )  { super ( String.class ) ; }^[METHOD] <init> [TYPE] StdKeySerializers$StringKeySerializer() [PARAMETER] [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  boolean false  true 
[REPLACE]^public StringKeySerializer (  )  { super ( String.class ) ; }^71^^^^^^^[REPLACE] public DateKeySerializer (  )  { super ( Date.class ) ; }^[METHOD] <init> [TYPE] StdKeySerializers$DateKeySerializer() [PARAMETER] [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  boolean false  true 
[REPLACE]^public StringKeySerializer (  )  { super ( String.class ) ; }^86^^^^^^^[REPLACE] public CalendarKeySerializer (  )  { super ( Calendar.class ) ; }^[METHOD] <init> [TYPE] StdKeySerializers$CalendarKeySerializer() [PARAMETER] [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  boolean false  true 
[REPLACE]^if  ( keyType != null )  {^26^^^^^24^45^[REPLACE] if  ( keyType == null )  {^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] JavaType keyType [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JavaType keyType  [TYPE]  Class cls  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  boolean false  true 
[ADD]^return DEFAULT_KEY_SERIALIZER;^26^27^28^^^24^45^[ADD] if  ( keyType == null )  { return DEFAULT_KEY_SERIALIZER; }^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] JavaType keyType [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JavaType keyType  [TYPE]  Class cls  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  boolean false  true 
[REPLACE]^return DEFAULT_STRING_SERIALIZER;^27^^^^^24^45^[REPLACE] return DEFAULT_KEY_SERIALIZER;^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] JavaType keyType [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JavaType keyType  [TYPE]  Class cls  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  boolean false  true 
[REPLACE]^if  ( cls  ||  String.class )  {^30^^^^^24^45^[REPLACE] if  ( cls == String.class )  {^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] JavaType keyType [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JavaType keyType  [TYPE]  Class cls  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  boolean false  true 
[ADD]^^30^31^32^^^24^45^[ADD] if  ( cls == String.class )  { return DEFAULT_STRING_SERIALIZER; }^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] JavaType keyType [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JavaType keyType  [TYPE]  Class cls  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  boolean false  true 
[REPLACE]^return DEFAULT_KEY_SERIALIZER;^31^^^^^24^45^[REPLACE] return DEFAULT_STRING_SERIALIZER;^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] JavaType keyType [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JavaType keyType  [TYPE]  Class cls  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  boolean false  true 
[REPLACE]^if  ( cls  !=  Object.class )  {^33^^^^^24^45^[REPLACE] if  ( cls == Object.class )  {^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] JavaType keyType [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JavaType keyType  [TYPE]  Class cls  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  boolean false  true 
[REPLACE]^return DEFAULT_STRING_SERIALIZER;^34^^^^^24^45^[REPLACE] return DEFAULT_KEY_SERIALIZER;^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] JavaType keyType [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JavaType keyType  [TYPE]  Class cls  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  boolean false  true 
[REPLACE]^if  ( Date.class.isAssignableFrom ( null )  )  {^37^^^^^24^45^[REPLACE] if  ( Date.class.isAssignableFrom ( cls )  )  {^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] JavaType keyType [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JavaType keyType  [TYPE]  Class cls  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  boolean false  true 
[ADD]^^37^38^39^^^24^45^[ADD] if  ( Date.class.isAssignableFrom ( cls )  )  { return  ( JsonSerializer<Object> )  DateKeySerializer.instance; }^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] JavaType keyType [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JavaType keyType  [TYPE]  Class cls  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  boolean false  true 
[REPLACE]^return  ( JsonSerializer<Object> )  CalendarKeySerializer.instance;^38^^^^^24^45^[REPLACE] return  ( JsonSerializer<Object> )  DateKeySerializer.instance;^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] JavaType keyType [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JavaType keyType  [TYPE]  Class cls  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  boolean false  true 
[REPLACE]^if  ( Date.class.isAssignableFrom ( cls )  )  {^40^^^^^24^45^[REPLACE] if  ( Calendar.class.isAssignableFrom ( cls )  )  {^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] JavaType keyType [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JavaType keyType  [TYPE]  Class cls  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  boolean false  true 
[REPLACE]^return  ( JsonSerializer<Object> )  DateKeySerializer.instance;^41^^^^^24^45^[REPLACE] return  ( JsonSerializer<Object> )  CalendarKeySerializer.instance;^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] JavaType keyType [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JavaType keyType  [TYPE]  Class cls  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  boolean false  true 
[REPLACE]^return DEFAULT_STRING_SERIALIZER;^44^^^^^24^45^[REPLACE] return DEFAULT_KEY_SERIALIZER;^[METHOD] getStdKeySerializer [TYPE] JsonSerializer [PARAMETER] JavaType keyType [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JavaType keyType  [TYPE]  Class cls  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  boolean false  true 
[REPLACE]^provider.defaultSerializeDateKey ( value, jgen ) ;^62^^^^^59^63^[REPLACE] jgen.writeFieldName ( value ) ;^[METHOD] serialize [TYPE] void [PARAMETER] String value JsonGenerator jgen SerializerProvider provider [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JsonGenerator jgen  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  String value  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider 
[REMOVE]^provider.defaultSerializeDateKey ( value, jgen ) ;^62^^^^^59^63^[REMOVE] ^[METHOD] serialize [TYPE] void [PARAMETER] String value JsonGenerator jgen SerializerProvider provider [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JsonGenerator jgen  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  String value  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider 
[REPLACE]^provider.defaultSerializeDateKey ( value.getTimeInMillis (  ) , jgen ) ;^77^^^^^74^78^[REPLACE] provider.defaultSerializeDateKey ( value, jgen ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Date value JsonGenerator jgen SerializerProvider provider [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JsonGenerator jgen  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  Date value 
[REPLACE]^provider.defaultSerializeDateKey ( value, jgen ) ;^92^^^^^89^93^[REPLACE] provider.defaultSerializeDateKey ( value.getTimeInMillis (  ) , jgen ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Calendar value JsonGenerator jgen SerializerProvider provider [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JsonGenerator jgen  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  Calendar value 
[ADD]^^92^^^^^89^93^[ADD] provider.defaultSerializeDateKey ( value.getTimeInMillis (  ) , jgen ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Calendar value JsonGenerator jgen SerializerProvider provider [CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer   [TYPE]  JsonGenerator jgen  [TYPE]  JsonSerializer DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  Calendar value 
[REPLACE]^jgen.writeFieldName ( value ) ;^56^^^^^^^[REPLACE] public StringKeySerializer (  )  { super ( String.class ) ; }^[METHOD] <init> [TYPE] StdKeySerializers$StringKeySerializer() [PARAMETER] [CLASS] StringKeySerializer   [TYPE]  boolean false  true 
[REPLACE]^public StringKeySerializer (  )  { super ( String.class ) ; }^62^^^^^59^63^[REPLACE] jgen.writeFieldName ( value ) ;^[METHOD] serialize [TYPE] void [PARAMETER] String value JsonGenerator jgen SerializerProvider provider [CLASS] StringKeySerializer   [TYPE]  boolean false  true  [TYPE]  JsonGenerator jgen  [TYPE]  String value  [TYPE]  SerializerProvider provider 
[REPLACE]^protected final static JsonSerializer<?> instance ;^69^^^^^^^[REPLACE] protected final static JsonSerializer<?> instance = new DateKeySerializer (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] String value JsonGenerator jgen SerializerProvider provider [CLASS] DateKeySerializer   [TYPE]  boolean false  true  [TYPE]  JsonGenerator jgen  [TYPE]  String value  [TYPE]  SerializerProvider provider 
[REPLACE]^provider.defaultSerializeDateKey ( value, jgen ) ;^71^^^^^^^[REPLACE] public DateKeySerializer (  )  { super ( Date.class ) ; }^[METHOD] <init> [TYPE] StdKeySerializers$DateKeySerializer() [PARAMETER] [CLASS] DateKeySerializer   [TYPE]  JsonSerializer instance  [TYPE]  boolean false  true 
[ADD]^^71^72^73^^^^^[ADD] public DateKeySerializer (  )  { super ( Date.class ) ; }  @Override^[METHOD] <init> [TYPE] StdKeySerializers$DateKeySerializer() [PARAMETER] [CLASS] DateKeySerializer   [TYPE]  JsonSerializer instance  [TYPE]  boolean false  true 
[REPLACE]^public DateKeySerializer (  )  { super ( Date.class ) ; }^77^^^^^74^78^[REPLACE] provider.defaultSerializeDateKey ( value, jgen ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Date value JsonGenerator jgen SerializerProvider provider [CLASS] DateKeySerializer   [TYPE]  JsonGenerator jgen  [TYPE]  JsonSerializer instance  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  Date value 
[ADD]^^77^^^^^74^78^[ADD] provider.defaultSerializeDateKey ( value, jgen ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Date value JsonGenerator jgen SerializerProvider provider [CLASS] DateKeySerializer   [TYPE]  JsonGenerator jgen  [TYPE]  JsonSerializer instance  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  Date value 
[REPLACE]^protected  static JsonSerializer<?> instance = new CalendarKeySerializer (  ) ;^84^^^^^^^[REPLACE] protected final static JsonSerializer<?> instance = new CalendarKeySerializer (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Date value JsonGenerator jgen SerializerProvider provider [CLASS] CalendarKeySerializer   [TYPE]  JsonGenerator jgen  [TYPE]  JsonSerializer instance  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  Date value 
[REPLACE]^provider.defaultSerializeDateKey ( value.getTimeInMillis (  ) , jgen ) ;^86^^^^^^^[REPLACE] public CalendarKeySerializer (  )  { super ( Calendar.class ) ; }^[METHOD] <init> [TYPE] StdKeySerializers$CalendarKeySerializer() [PARAMETER] [CLASS] CalendarKeySerializer   [TYPE]  JsonSerializer instance  [TYPE]  boolean false  true 
[REPLACE]^public CalendarKeySerializer (  )  { super ( Calendar.class ) ; }^92^^^^^89^93^[REPLACE] provider.defaultSerializeDateKey ( value.getTimeInMillis (  ) , jgen ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Calendar value JsonGenerator jgen SerializerProvider provider [CLASS] CalendarKeySerializer   [TYPE]  JsonGenerator jgen  [TYPE]  JsonSerializer instance  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  Calendar value 
[ADD]^^92^^^^^89^93^[ADD] provider.defaultSerializeDateKey ( value.getTimeInMillis (  ) , jgen ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Calendar value JsonGenerator jgen SerializerProvider provider [CLASS] CalendarKeySerializer   [TYPE]  JsonGenerator jgen  [TYPE]  JsonSerializer instance  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  Calendar value 
