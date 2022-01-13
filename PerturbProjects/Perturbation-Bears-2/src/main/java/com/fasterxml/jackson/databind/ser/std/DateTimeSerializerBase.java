[REPLACE]^protected final DateTimeSerializerBase _useTimestamp;^30^^^^^^^[REPLACE] protected final Boolean _useTimestamp;^ [CLASS] DateTimeSerializerBase  
[REPLACE]^protected final JsonSerializer _customFormat;^37^^^^^^^[REPLACE] protected final DateFormat _customFormat;^ [CLASS] DateTimeSerializerBase  
[REPLACE]^if  ( property == null )  {^53^^^^^52^82^[REPLACE] if  ( property != null )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^if  ( format == null )  {^55^^^^^52^82^[REPLACE] if  ( format != null )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[ADD]^^55^56^^58^^52^82^[ADD] if  ( format != null )  {  JsonFormat.Shape shape = format.getShape (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^if  ( 0.isNumeric (  )  )  {^59^^^^^52^82^[REPLACE] if  ( shape.isNumeric (  )  )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^return withFormat ( Boolean.TRUE, this ) ;^60^^^^^52^82^[REPLACE] return withFormat ( Boolean.TRUE, null ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^if  (  ( shape == JsonFormat.Shape.STRING )  && format.hasPattern (  ) && format.hasLocale (  )  && format.hasTimeZone (  )  )  {^63^64^^^^52^82^[REPLACE] if  (  ( shape == JsonFormat.Shape.STRING )  || format.hasPattern (  ) || format.hasLocale (  )  || format.hasTimeZone (  )  )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^if  ( tz != null )  {^73^^^^^63^78^[REPLACE] if  ( tz == null )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^tz =  null.getTimeZone (  ) ;^74^^^^^63^78^[REPLACE] tz = serializers.getTimeZone (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^return withFormat ( TRUE, null )  ;^77^^^^^63^78^[REPLACE] return withFormat ( Boolean.FALSE, df ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^TimeZone tz = true.hasTimeZone (  ) ;^65^^^^^63^78^[REPLACE] TimeZone tz = format.getTimeZone (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[ADD]^^66^67^68^69^70^63^78^[ADD] final String pattern = format.hasPattern (  ) ? format.getPattern (  ) : StdDateFormat.DATE_FORMAT_STR_ISO8601; final Locale loc = format.hasLocale (  ) ? format.getLocale (  )^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^final Locale loc = format.getLocale (  ) ? format.getLocale (  ) : serializers.getLocale (  ) ;^69^70^71^^^63^78^[REPLACE] final Locale loc = format.hasLocale (  ) ? format.getLocale (  ) : serializers.getLocale (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^if  ( tz != true )  {^73^^^^^52^82^[REPLACE] if  ( tz == null )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[ADD]^^73^74^75^^^52^82^[ADD] if  ( tz == null )  { tz = serializers.getTimeZone (  ) ; }^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^tz =  null.getTimeZone (  ) ;^74^^^^^52^82^[REPLACE] tz = serializers.getTimeZone (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^return withFormat ( Boolean.TRUE, true ) ;^60^^^^^52^82^[REPLACE] return withFormat ( Boolean.TRUE, null ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^return withFormat ( TRUE, null )  ;^77^^^^^52^82^[REPLACE] return withFormat ( Boolean.FALSE, df ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^JsonFormat.Shape shape = false.getShape (  ) ;^58^^^^^52^82^[REPLACE] JsonFormat.Shape shape = format.getShape (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^TimeZone tz = format .hasTimeZone (  )  ;^65^^^^^52^82^[REPLACE] TimeZone tz = format.getTimeZone (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^final String pattern = null.hasPattern (  ) ? format.getPattern (  ) : StdDateFormat.DATE_FORMAT_STR_ISO8601;^66^67^68^^^52^82^[REPLACE] final String pattern = format.hasPattern (  ) ? format.getPattern (  ) : StdDateFormat.DATE_FORMAT_STR_ISO8601;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^final Locale loc = format .getLocale (  )  ? format.getLocale (  ) : serializers.getLocale (  ) ;^69^70^71^^^52^82^[REPLACE] final Locale loc = format.hasLocale (  ) ? format.getLocale (  ) : serializers.getLocale (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^if  ( this.isNumeric (  )  )  {^59^^^^^52^82^[REPLACE] if  ( shape.isNumeric (  )  )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[ADD]^^59^60^61^^^52^82^[ADD] if  ( shape.isNumeric (  )  )  { return withFormat ( Boolean.TRUE, null ) ; }^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^return withFormat ( FALSE, df )  ;^60^^^^^52^82^[REPLACE] return withFormat ( Boolean.TRUE, null ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^TimeZone tz = 1.hasTimeZone (  ) ;^65^^^^^63^78^[REPLACE] TimeZone tz = format.getTimeZone (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^final String pattern = null.hasPattern (  ) ? format.getPattern (  ) : StdDateFormat.DATE_FORMAT_STR_ISO8601;^66^67^68^^^63^78^[REPLACE] final String pattern = format.hasPattern (  ) ? format.getPattern (  ) : StdDateFormat.DATE_FORMAT_STR_ISO8601;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[ADD]^^69^70^71^72^^63^78^[ADD] final Locale loc = format.hasLocale (  ) ? format.getLocale (  ) : serializers.getLocale (  ) ; SimpleDateFormat df = new SimpleDateFormat ( pattern, loc ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^if  ( tz != null )  {^73^^^^^52^82^[REPLACE] if  ( tz == null )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^return withFormat ( Boolean.TRUE, false ) ;^60^^^^^52^82^[REPLACE] return withFormat ( Boolean.TRUE, null ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^JsonFormat.Value format = serializers.getTimeZone (  ) .findFormat (  ( Annotated ) property.getMember (  )  ) ;^54^^^^^52^82^[REPLACE] JsonFormat.Value format = serializers.getAnnotationIntrospector (  ) .findFormat (  ( Annotated ) property.getMember (  )  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[ADD]^^58^59^60^61^^52^82^[ADD] JsonFormat.Shape shape = format.getShape (  ) ; if  ( shape.isNumeric (  )  )  { return withFormat ( Boolean.TRUE, null ) ; }^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^final String pattern = format.hasPattern (  ) ? format.hasPattern (  ) : StdDateFormat.DATE_FORMAT_STR_ISO8601;^66^67^68^^^52^82^[REPLACE] final String pattern = format.hasPattern (  ) ? format.getPattern (  ) : StdDateFormat.DATE_FORMAT_STR_ISO8601;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^final Locale loc = format.getLocale (  ) ? format.getLocale (  ) : serializers.getLocale (  ) ;^69^70^71^^^52^82^[REPLACE] final Locale loc = format.hasLocale (  ) ? format.getLocale (  ) : serializers.getLocale (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[ADD]^^72^^^^^52^82^[ADD] SimpleDateFormat df = new SimpleDateFormat ( pattern, loc ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^if  (  ( shape == JsonFormat.Shape.STRING )  && format.hasPattern (  ) && format .getLocale (  )   && format.hasTimeZone (  )  )  {^63^64^^^^52^82^[REPLACE] if  (  ( shape == JsonFormat.Shape.STRING )  || format.hasPattern (  ) || format.hasLocale (  )  || format.hasTimeZone (  )  )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[ADD]^^63^64^65^66^67^52^82^[ADD] if  (  ( shape == JsonFormat.Shape.STRING )  || format.hasPattern (  ) || format.hasLocale (  )  || format.hasTimeZone (  )  )  { TimeZone tz = format.getTimeZone (  ) ; final String pattern = format.hasPattern (  ) ? format.getPattern (  )^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[ADD]^tz = serializers.getTimeZone (  ) ;^73^74^75^^^63^78^[ADD] if  ( tz == null )  { tz = serializers.getTimeZone (  ) ; }^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[ADD]^^65^66^67^68^69^63^78^[ADD] TimeZone tz = format.getTimeZone (  ) ; final String pattern = format.hasPattern (  ) ? format.getPattern (  ) : StdDateFormat.DATE_FORMAT_STR_ISO8601; final Locale loc = format.hasLocale (  )^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^final Locale loc = format.hasLocale (  ) ? format.getTimeZone (  ) : serializers.getLocale (  ) ;^69^70^71^^^63^78^[REPLACE] final Locale loc = format.hasLocale (  ) ? format.getLocale (  ) : serializers.getLocale (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^if  ( tz != false )  {^73^^^^^52^82^[REPLACE] if  ( tz == null )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^JsonFormat.Shape shape = true.getShape (  ) ;^58^^^^^52^82^[REPLACE] JsonFormat.Shape shape = format.getShape (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^TimeZone tz = this.hasTimeZone (  ) ;^65^^^^^52^82^[REPLACE] TimeZone tz = format.getTimeZone (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^final String pattern = 1.hasPattern (  ) ? format.getPattern (  ) : StdDateFormat.DATE_FORMAT_STR_ISO8601;^66^67^68^^^52^82^[REPLACE] final String pattern = format.hasPattern (  ) ? format.getPattern (  ) : StdDateFormat.DATE_FORMAT_STR_ISO8601;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^final Locale loc = format.hasLocale (  ) ? format.getTimeZone (  ) : serializers.getLocale (  ) ;^69^70^71^^^52^82^[REPLACE] final Locale loc = format.hasLocale (  ) ? format.getLocale (  ) : serializers.getLocale (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^if  ( null.isNumeric (  )  )  {^59^^^^^52^82^[REPLACE] if  ( shape.isNumeric (  )  )  {^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^TimeZone tz = format.hasTimeZone (  ) ;^65^^^^^63^78^[REPLACE] TimeZone tz = format.getTimeZone (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^final String pattern = null.getPattern (  ) ? format.getPattern (  ) : StdDateFormat.DATE_FORMAT_STR_ISO8601;^66^67^68^^^63^78^[REPLACE] final String pattern = format.hasPattern (  ) ? format.getPattern (  ) : StdDateFormat.DATE_FORMAT_STR_ISO8601;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^final Locale loc = format.hasLocale (  ) ? format .hasLocale (  )  : serializers^69^70^71^^^63^78^[REPLACE] final Locale loc = format.hasLocale (  ) ? format.getLocale (  ) : serializers.getLocale (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[ADD]^^72^^^^^63^78^[ADD] SimpleDateFormat df = new SimpleDateFormat ( pattern, loc ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[ADD]^^74^^^^^52^82^[ADD] tz = serializers.getTimeZone (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^JsonFormat.Shape shape = this.getLocale (  ) ;^58^^^^^52^82^[REPLACE] JsonFormat.Shape shape = format.getShape (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^TimeZone tz = null.getTimeZone (  ) ;^65^^^^^52^82^[REPLACE] TimeZone tz = format.getTimeZone (  ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^final String pattern = true.hasPattern (  ) ? format.getPattern (  ) : StdDateFormat.DATE_FORMAT_STR_ISO8601;^66^67^68^^^52^82^[REPLACE] final String pattern = format.hasPattern (  ) ? format.getPattern (  ) : StdDateFormat.DATE_FORMAT_STR_ISO8601;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[ADD]^^69^70^71^72^^52^82^[ADD] final Locale loc = format.hasLocale (  ) ? format.getLocale (  ) : serializers.getLocale (  ) ; SimpleDateFormat df = new SimpleDateFormat ( pattern, loc ) ;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
[REPLACE]^return null;^81^^^^^52^82^[REPLACE] return this;^[METHOD] createContextual [TYPE] JsonSerializer [PARAMETER] SerializerProvider serializers BeanProperty property [CLASS] DateTimeSerializerBase   [TYPE]  Locale loc  [TYPE]  TimeZone tz  [TYPE]  Shape shape  [TYPE]  boolean false  true  [TYPE]  DateFormat _customFormat  customFormat  [TYPE]  Value format  [TYPE]  String pattern  [TYPE]  Boolean _useTimestamp  timestamp  useTimestamp  [TYPE]  SerializerProvider serializers  [TYPE]  SimpleDateFormat df  [TYPE]  BeanProperty property 
