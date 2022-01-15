[REPLACE]^private static  long serialVersionUID = 1L;^67^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer  
[REPLACE]^public  static DurationDeserializer instance = new DurationDeserializer (  ) ;^68^^^^^^^[REPLACE] public final static DurationDeserializer instance = new DurationDeserializer (  ) ;^ [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer  
[REPLACE]^private static final long serialVersionUID  = null ;^82^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer  
[REPLACE]^public final static GregorianCalendarDeserializer instance ;^83^^^^^^^[REPLACE] public final static GregorianCalendarDeserializer instance = new GregorianCalendarDeserializer (  ) ;^ [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer  
[REPLACE]^private static final long serialVersionUID ;^107^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer  
[REPLACE]^public final  QNameDeserializer instance = new QNameDeserializer (  ) ;^108^^^^^^^[REPLACE] public final static QNameDeserializer instance = new QNameDeserializer (  ) ;^ [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer  
[REPLACE]^public GregorianCalendarDeserializer (  )  { super ( XMLGregorianCalendar.class ) ; }^69^^^^^^^[REPLACE] public DurationDeserializer (  )  { super ( Duration.class ) ; }^[METHOD] <init> [TYPE] CoreXMLDeserializers$DurationDeserializer() [PARAMETER] [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  long serialVersionUID 
[REPLACE]^public DurationDeserializer (  )  { super ( Duration.class ) ; }^84^^^^^^^[REPLACE] public GregorianCalendarDeserializer (  )  { super ( XMLGregorianCalendar.class ) ; }^[METHOD] <init> [TYPE] CoreXMLDeserializers$GregorianCalendarDeserializer() [PARAMETER] [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  long serialVersionUID 
[REPLACE]^public DurationDeserializer (  )  { super ( Duration.class ) ; }^111^^^^^^^[REPLACE] public QNameDeserializer (  )  { super ( QName.class ) ; }^[METHOD] <init> [TYPE] CoreXMLDeserializers$QNameDeserializer() [PARAMETER] [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  long serialVersionUID 
[REPLACE]^TimeZone tz = ctxt.getTimeZone (  ) ;^45^^^^^42^56^[REPLACE] Class<?> raw = type.getRawClass (  ) ;^[METHOD] findBeanDeserializer [TYPE] JsonDeserializer [PARAMETER] JavaType type DeserializationConfig config BeanDescription beanDesc [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  JavaType type  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  BeanDescription beanDesc  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationConfig config  [TYPE]  Class raw  [TYPE]  long serialVersionUID 
[ADD]^^45^^^^^42^56^[ADD] Class<?> raw = type.getRawClass (  ) ;^[METHOD] findBeanDeserializer [TYPE] JsonDeserializer [PARAMETER] JavaType type DeserializationConfig config BeanDescription beanDesc [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  JavaType type  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  BeanDescription beanDesc  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationConfig config  [TYPE]  Class raw  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( raw  &&  QName.class )  {^46^^^^^42^56^[REPLACE] if  ( raw == QName.class )  {^[METHOD] findBeanDeserializer [TYPE] JsonDeserializer [PARAMETER] JavaType type DeserializationConfig config BeanDescription beanDesc [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  JavaType type  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  BeanDescription beanDesc  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationConfig config  [TYPE]  Class raw  [TYPE]  long serialVersionUID 
[REPLACE]^return DurationDeserializer.instance;^47^^^^^42^56^[REPLACE] return QNameDeserializer.instance;^[METHOD] findBeanDeserializer [TYPE] JsonDeserializer [PARAMETER] JavaType type DeserializationConfig config BeanDescription beanDesc [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  JavaType type  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  BeanDescription beanDesc  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationConfig config  [TYPE]  Class raw  [TYPE]  long serialVersionUID 
[REPLACE]^if  (this  !=  XMLGregorianCalendar.class )  {^49^^^^^42^56^[REPLACE] if  ( raw == XMLGregorianCalendar.class )  {^[METHOD] findBeanDeserializer [TYPE] JsonDeserializer [PARAMETER] JavaType type DeserializationConfig config BeanDescription beanDesc [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  JavaType type  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  BeanDescription beanDesc  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationConfig config  [TYPE]  Class raw  [TYPE]  long serialVersionUID 
[REPLACE]^return QName.valueOf ( value ) ;^50^^^^^42^56^[REPLACE] return GregorianCalendarDeserializer.instance;^[METHOD] findBeanDeserializer [TYPE] JsonDeserializer [PARAMETER] JavaType type DeserializationConfig config BeanDescription beanDesc [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  JavaType type  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  BeanDescription beanDesc  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationConfig config  [TYPE]  Class raw  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( true  ||  Duration.class )  {^52^^^^^42^56^[REPLACE] if  ( raw == Duration.class )  {^[METHOD] findBeanDeserializer [TYPE] JsonDeserializer [PARAMETER] JavaType type DeserializationConfig config BeanDescription beanDesc [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  JavaType type  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  BeanDescription beanDesc  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationConfig config  [TYPE]  Class raw  [TYPE]  long serialVersionUID 
[ADD]^return DurationDeserializer.instance;^52^53^54^^^42^56^[ADD] if  ( raw == Duration.class )  { return DurationDeserializer.instance; }^[METHOD] findBeanDeserializer [TYPE] JsonDeserializer [PARAMETER] JavaType type DeserializationConfig config BeanDescription beanDesc [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  JavaType type  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  BeanDescription beanDesc  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationConfig config  [TYPE]  Class raw  [TYPE]  long serialVersionUID 
[REPLACE]^return QNameDeserializer.instance;^53^^^^^42^56^[REPLACE] return DurationDeserializer.instance;^[METHOD] findBeanDeserializer [TYPE] JsonDeserializer [PARAMETER] JavaType type DeserializationConfig config BeanDescription beanDesc [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  JavaType type  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  BeanDescription beanDesc  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationConfig config  [TYPE]  Class raw  [TYPE]  long serialVersionUID 
[REPLACE]^return false;^55^^^^^42^56^[REPLACE] return null;^[METHOD] findBeanDeserializer [TYPE] JsonDeserializer [PARAMETER] JavaType type DeserializationConfig config BeanDescription beanDesc [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  JavaType type  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  BeanDescription beanDesc  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationConfig config  [TYPE]  Class raw  [TYPE]  long serialVersionUID 
[REPLACE]^return _dataTypeFactory .newInstance (  )  ;^75^^^^^72^76^[REPLACE] return _dataTypeFactory.newDuration ( value ) ;^[METHOD] _deserialize [TYPE] Duration [PARAMETER] String value DeserializationContext ctxt [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  String value  [TYPE]  long serialVersionUID 
[REPLACE]^TimeZone tz = ctxt.getTimeZone (  ) ;^90^^^^^87^101^[REPLACE] Date d = _parseDate ( jp, ctxt ) ;^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[REPLACE]^if  ( d != this )  {^91^^^^^87^101^[REPLACE] if  ( d == null )  {^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[REPLACE]^return false;^92^^^^^87^101^[REPLACE] return null;^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[REPLACE]^TimeZone tz = ctxt.getTimeZone (  ) ;^94^^^^^87^101^[REPLACE] GregorianCalendar calendar = new GregorianCalendar (  ) ;^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[REPLACE]^TimeZone tz = ctxt.getTimeZone (  ) ;^95^^^^^87^101^[REPLACE] calendar.setTime ( d ) ;^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[REPLACE]^Class<?> raw = type.getRawClass (  ) ;^96^^^^^87^101^[REPLACE] TimeZone tz = ctxt.getTimeZone (  ) ;^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[REPLACE]^if  ( tz == null )  {^97^^^^^87^101^[REPLACE] if  ( tz != null )  {^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[REPLACE]^calendar .GregorianCalendar (  )  ;^98^^^^^87^101^[REPLACE] calendar.setTimeZone ( tz ) ;^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[REPLACE]^return _dataTypeFactory.newDuration ( calendar ) ;^100^^^^^87^101^[REPLACE] return _dataTypeFactory.newXMLGregorianCalendar ( calendar ) ;^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[REPLACE]^return   value   ;^117^^^^^114^118^[REPLACE] return QName.valueOf ( value ) ;^[METHOD] _deserialize [TYPE] QName [PARAMETER] String value DeserializationContext ctxt [CLASS] CoreXMLDeserializers DurationDeserializer GregorianCalendarDeserializer QNameDeserializer   [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  String value  [TYPE]  long serialVersionUID 
[REPLACE]^private static final long serialVersionUID = 1;^67^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^[METHOD] _deserialize [TYPE] QName [PARAMETER] String value DeserializationContext ctxt [CLASS] DurationDeserializer   [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  String value  [TYPE]  long serialVersionUID 
[REPLACE]^public final static DurationDeserializer instance ;^68^^^^^^^[REPLACE] public final static DurationDeserializer instance = new DurationDeserializer (  ) ;^[METHOD] _deserialize [TYPE] QName [PARAMETER] String value DeserializationContext ctxt [CLASS] DurationDeserializer   [TYPE]  boolean false  true  [TYPE]  DatatypeFactory _dataTypeFactory  [TYPE]  DurationDeserializer instance  [TYPE]  QNameDeserializer instance  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  String value  [TYPE]  long serialVersionUID 
[REPLACE]^return _dataTypeFactory.newDuration ( value ) ;^69^^^^^^^[REPLACE] public DurationDeserializer (  )  { super ( Duration.class ) ; }^[METHOD] <init> [TYPE] CoreXMLDeserializers$DurationDeserializer() [PARAMETER] [CLASS] DurationDeserializer   [TYPE]  DurationDeserializer instance  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^private static  long serialVersionUID = 1L;^82^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^[METHOD] _deserialize [TYPE] Duration [PARAMETER] String value DeserializationContext ctxt [CLASS] GregorianCalendarDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  String value  [TYPE]  boolean false  true  [TYPE]  DurationDeserializer instance  [TYPE]  long serialVersionUID 
[REPLACE]^public final static GregorianCalendarDeserializer instance  = null ;^83^^^^^^^[REPLACE] public final static GregorianCalendarDeserializer instance = new GregorianCalendarDeserializer (  ) ;^[METHOD] _deserialize [TYPE] Duration [PARAMETER] String value DeserializationContext ctxt [CLASS] GregorianCalendarDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  String value  [TYPE]  boolean false  true  [TYPE]  DurationDeserializer instance  [TYPE]  long serialVersionUID 
[REPLACE]^return _dataTypeFactory.newXMLGregorianCalendar ( calendar ) ;^84^^^^^^^[REPLACE] public GregorianCalendarDeserializer (  )  { super ( XMLGregorianCalendar.class ) ; }^[METHOD] <init> [TYPE] CoreXMLDeserializers$GregorianCalendarDeserializer() [PARAMETER] [CLASS] GregorianCalendarDeserializer   [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^TimeZone tz = ctxt.getTimeZone (  ) ;^90^^^^^87^101^[REPLACE] Date d = _parseDate ( jp, ctxt ) ;^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] GregorianCalendarDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[REPLACE]^if  ( d != null )  {^91^^^^^87^101^[REPLACE] if  ( d == null )  {^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] GregorianCalendarDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[ADD]^return null;^91^92^93^^^87^101^[ADD] if  ( d == null )  { return null; }^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] GregorianCalendarDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[REPLACE]^return this;^92^^^^^87^101^[REPLACE] return null;^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] GregorianCalendarDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[REPLACE]^TimeZone tz = ctxt.getTimeZone (  ) ;^94^^^^^87^101^[REPLACE] GregorianCalendar calendar = new GregorianCalendar (  ) ;^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] GregorianCalendarDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[ADD]^^94^^^^^87^101^[ADD] GregorianCalendar calendar = new GregorianCalendar (  ) ;^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] GregorianCalendarDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[REPLACE]^TimeZone tz = ctxt.getTimeZone (  ) ;^95^^^^^87^101^[REPLACE] calendar.setTime ( d ) ;^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] GregorianCalendarDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[REPLACE]^Date d = _parseDate ( jp, ctxt ) ;^96^^^^^87^101^[REPLACE] TimeZone tz = ctxt.getTimeZone (  ) ;^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] GregorianCalendarDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[REPLACE]^if  ( tz == false )  {^97^^^^^87^101^[REPLACE] if  ( tz != null )  {^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] GregorianCalendarDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[ADD]^calendar.setTimeZone ( tz ) ;^97^98^99^^^87^101^[ADD] if  ( tz != null )  { calendar.setTimeZone ( tz ) ; }^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] GregorianCalendarDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[REPLACE]^calendar .GregorianCalendar (  )  ;^98^^^^^87^101^[REPLACE] calendar.setTimeZone ( tz ) ;^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] GregorianCalendarDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[REPLACE]^return null;^100^^^^^87^101^[REPLACE] return _dataTypeFactory.newXMLGregorianCalendar ( calendar ) ;^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] GregorianCalendarDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[REPLACE]^private static final long serialVersionUID  = null ;^107^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] QNameDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[REPLACE]^public  static QNameDeserializer instance = new QNameDeserializer (  ) ;^108^^^^^^^[REPLACE] public final static QNameDeserializer instance = new QNameDeserializer (  ) ;^[METHOD] deserialize [TYPE] XMLGregorianCalendar [PARAMETER] JsonParser jp DeserializationContext ctxt [CLASS] QNameDeserializer   [TYPE]  TimeZone tz  [TYPE]  boolean false  true  [TYPE]  GregorianCalendar calendar  [TYPE]  GregorianCalendarDeserializer instance  [TYPE]  DeserializationContext ctxt  [TYPE]  long serialVersionUID  [TYPE]  Date d  [TYPE]  JsonParser jp 
[REPLACE]^return QName.valueOf ( value ) ;^111^^^^^^^[REPLACE] public QNameDeserializer (  )  { super ( QName.class ) ; }^[METHOD] <init> [TYPE] CoreXMLDeserializers$QNameDeserializer() [PARAMETER] [CLASS] QNameDeserializer   [TYPE]  QNameDeserializer instance  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[ADD]^^111^112^113^^^^^[ADD] public QNameDeserializer (  )  { super ( QName.class ) ; }  @Override^[METHOD] <init> [TYPE] CoreXMLDeserializers$QNameDeserializer() [PARAMETER] [CLASS] QNameDeserializer   [TYPE]  QNameDeserializer instance  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return   value   ;^117^^^^^114^118^[REPLACE] return QName.valueOf ( value ) ;^[METHOD] _deserialize [TYPE] QName [PARAMETER] String value DeserializationContext ctxt [CLASS] QNameDeserializer   [TYPE]  DeserializationContext ctxt  [TYPE]  String value  [TYPE]  boolean false  true  [TYPE]  QNameDeserializer instance  [TYPE]  long serialVersionUID 
