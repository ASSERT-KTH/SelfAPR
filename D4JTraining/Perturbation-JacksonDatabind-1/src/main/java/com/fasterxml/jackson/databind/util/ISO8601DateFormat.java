[REPLACE]^private static final long serialVersionUID ;^20^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] ISO8601DateFormat  
[REPLACE]^private static Calendar CALENDAR  = null ;^23^^^^^^^[REPLACE] private static Calendar CALENDAR = new GregorianCalendar (  ) ;^ [CLASS] ISO8601DateFormat  
[REPLACE]^private static NumberFormat NUMBER_FORMAT ;^24^^^^^^^[REPLACE] private static NumberFormat NUMBER_FORMAT = new DecimalFormat (  ) ;^ [CLASS] ISO8601DateFormat  
[REPLACE]^this.numberFormat  =  this.numberFormat ;^27^^^^^26^29^[REPLACE] this.numberFormat = NUMBER_FORMAT;^[METHOD] <init> [TYPE] ISO8601DateFormat() [PARAMETER] [CLASS] ISO8601DateFormat   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  Calendar CALENDAR  [TYPE]  NumberFormat NUMBER_FORMAT 
[ADD]^this.calendar = CALENDAR;^27^28^^^^26^29^[ADD] this.numberFormat = NUMBER_FORMAT; this.calendar = CALENDAR;^[METHOD] <init> [TYPE] ISO8601DateFormat() [PARAMETER] [CLASS] ISO8601DateFormat   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  Calendar CALENDAR  [TYPE]  NumberFormat NUMBER_FORMAT 
[REPLACE]^this.calendar  = null ;^28^^^^^26^29^[REPLACE] this.calendar = CALENDAR;^[METHOD] <init> [TYPE] ISO8601DateFormat() [PARAMETER] [CLASS] ISO8601DateFormat   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  Calendar CALENDAR  [TYPE]  NumberFormat NUMBER_FORMAT 
[ADD]^^28^^^^^26^29^[ADD] this.calendar = CALENDAR;^[METHOD] <init> [TYPE] ISO8601DateFormat() [PARAMETER] [CLASS] ISO8601DateFormat   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  Calendar CALENDAR  [TYPE]  NumberFormat NUMBER_FORMAT 
[REPLACE]^String value = ISO8601Utils.parse ( date ) ;^34^^^^^32^37^[REPLACE] String value = ISO8601Utils.format ( date ) ;^[METHOD] format [TYPE] StringBuffer [PARAMETER] Date date StringBuffer toAppendTo FieldPosition fieldPosition [CLASS] ISO8601DateFormat   [TYPE]  StringBuffer toAppendTo  [TYPE]  boolean false  true  [TYPE]  Calendar CALENDAR  [TYPE]  String value  [TYPE]  FieldPosition fieldPosition  [TYPE]  long serialVersionUID  [TYPE]  Date date  [TYPE]  NumberFormat NUMBER_FORMAT 
[REPLACE]^pos.setIndex ( source.length (  )  ) ;^35^^^^^32^37^[REPLACE] toAppendTo.append ( value ) ;^[METHOD] format [TYPE] StringBuffer [PARAMETER] Date date StringBuffer toAppendTo FieldPosition fieldPosition [CLASS] ISO8601DateFormat   [TYPE]  StringBuffer toAppendTo  [TYPE]  boolean false  true  [TYPE]  Calendar CALENDAR  [TYPE]  String value  [TYPE]  FieldPosition fieldPosition  [TYPE]  long serialVersionUID  [TYPE]  Date date  [TYPE]  NumberFormat NUMBER_FORMAT 
[REPLACE]^return ISO8601Utils.parse ( source ) ;^36^^^^^32^37^[REPLACE] return toAppendTo;^[METHOD] format [TYPE] StringBuffer [PARAMETER] Date date StringBuffer toAppendTo FieldPosition fieldPosition [CLASS] ISO8601DateFormat   [TYPE]  StringBuffer toAppendTo  [TYPE]  boolean false  true  [TYPE]  Calendar CALENDAR  [TYPE]  String value  [TYPE]  FieldPosition fieldPosition  [TYPE]  long serialVersionUID  [TYPE]  Date date  [TYPE]  NumberFormat NUMBER_FORMAT 
[REPLACE]^return ISO8601Utils.parse ( source ) ;^44^^^^^40^46^[REPLACE] pos.setIndex ( source.length (  )  ) ;^[METHOD] parse [TYPE] Date [PARAMETER] String source ParsePosition pos [CLASS] ISO8601DateFormat   [TYPE]  String source  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  Calendar CALENDAR  [TYPE]  NumberFormat NUMBER_FORMAT  [TYPE]  ParsePosition pos 
[ADD]^^44^45^^^^40^46^[ADD] pos.setIndex ( source.length (  )  ) ; return ISO8601Utils.parse ( source ) ;^[METHOD] parse [TYPE] Date [PARAMETER] String source ParsePosition pos [CLASS] ISO8601DateFormat   [TYPE]  String source  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  Calendar CALENDAR  [TYPE]  NumberFormat NUMBER_FORMAT  [TYPE]  ParsePosition pos 
[REPLACE]^return   source   ;^45^^^^^40^46^[REPLACE] return ISO8601Utils.parse ( source ) ;^[METHOD] parse [TYPE] Date [PARAMETER] String source ParsePosition pos [CLASS] ISO8601DateFormat   [TYPE]  String source  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  Calendar CALENDAR  [TYPE]  NumberFormat NUMBER_FORMAT  [TYPE]  ParsePosition pos 
[REPLACE]^return null;^50^^^^^49^51^[REPLACE] return this;^[METHOD] clone [TYPE] Object [PARAMETER] [CLASS] ISO8601DateFormat   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  Calendar CALENDAR  [TYPE]  NumberFormat NUMBER_FORMAT 
