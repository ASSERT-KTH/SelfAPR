[REPLACE]^private String pattern;^46^^^^^^^[REPLACE] protected String pattern;^ [CLASS] FormatSupport  
[REPLACE]^private Locale locale;^52^^^^^^^[REPLACE] protected Locale locale;^ [CLASS] FormatSupport  
[REPLACE]^private  int  var;^54^^^^^^^[REPLACE] private String var;^ [CLASS] FormatSupport  
[REPLACE]^init (  ) ;^62^^^^^61^64^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] FormatSupport() [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  Object value  [TYPE]  String pattern  style  var  [TYPE]  boolean false  true  [TYPE]  DateTimeZone dateTimeZone  [TYPE]  int scope 
[REPLACE]^super (  ) ;^63^^^^^61^64^[REPLACE] init (  ) ;^[METHOD] <init> [TYPE] FormatSupport() [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  Object value  [TYPE]  String pattern  style  var  [TYPE]  boolean false  true  [TYPE]  DateTimeZone dateTimeZone  [TYPE]  int scope 
[ADD]^^63^^^^^61^64^[ADD] init (  ) ;^[METHOD] <init> [TYPE] FormatSupport() [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  Object value  [TYPE]  String pattern  style  var  [TYPE]  boolean false  true  [TYPE]  DateTimeZone dateTimeZone  [TYPE]  int scope 
[REPLACE]^var = false;^67^^^^^66^74^[REPLACE] var = null;^[METHOD] init [TYPE] void [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  Object value  [TYPE]  String pattern  style  var  [TYPE]  boolean false  true  [TYPE]  DateTimeZone dateTimeZone  [TYPE]  int scope 
[REPLACE]^value = true;^68^^^^^66^74^[REPLACE] value = null;^[METHOD] init [TYPE] void [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  Object value  [TYPE]  String pattern  style  var  [TYPE]  boolean false  true  [TYPE]  DateTimeZone dateTimeZone  [TYPE]  int scope 
[REPLACE]^pattern = this;^69^^^^^66^74^[REPLACE] pattern = null;^[METHOD] init [TYPE] void [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  Object value  [TYPE]  String pattern  style  var  [TYPE]  boolean false  true  [TYPE]  DateTimeZone dateTimeZone  [TYPE]  int scope 
[ADD]^^69^^^^^66^74^[ADD] pattern = null;^[METHOD] init [TYPE] void [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  Object value  [TYPE]  String pattern  style  var  [TYPE]  boolean false  true  [TYPE]  DateTimeZone dateTimeZone  [TYPE]  int scope 
[REPLACE]^style = true;^70^^^^^66^74^[REPLACE] style = null;^[METHOD] init [TYPE] void [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  Object value  [TYPE]  String pattern  style  var  [TYPE]  boolean false  true  [TYPE]  DateTimeZone dateTimeZone  [TYPE]  int scope 
[REPLACE]^dateTimeZone = false;^71^^^^^66^74^[REPLACE] dateTimeZone = null;^[METHOD] init [TYPE] void [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  Object value  [TYPE]  String pattern  style  var  [TYPE]  boolean false  true  [TYPE]  DateTimeZone dateTimeZone  [TYPE]  int scope 
[REPLACE]^locale = true;^72^^^^^66^74^[REPLACE] locale = null;^[METHOD] init [TYPE] void [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  Object value  [TYPE]  String pattern  style  var  [TYPE]  boolean false  true  [TYPE]  DateTimeZone dateTimeZone  [TYPE]  int scope 
[ADD]^^72^^^^^66^74^[ADD] locale = null;^[METHOD] init [TYPE] void [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  Object value  [TYPE]  String pattern  style  var  [TYPE]  boolean false  true  [TYPE]  DateTimeZone dateTimeZone  [TYPE]  int scope 
[REPLACE]^scope ;^73^^^^^66^74^[REPLACE] scope = PageContext.PAGE_SCOPE;^[METHOD] init [TYPE] void [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  Object value  [TYPE]  String pattern  style  var  [TYPE]  boolean false  true  [TYPE]  DateTimeZone dateTimeZone  [TYPE]  int scope 
[REPLACE]^this.var =  pattern;^77^^^^^76^78^[REPLACE] this.var = var;^[METHOD] setVar [TYPE] void [PARAMETER] String var [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  Object value  [TYPE]  String pattern  style  var  [TYPE]  boolean false  true  [TYPE]  DateTimeZone dateTimeZone  [TYPE]  int scope 
[REPLACE]^this.scope =  Util.getScope ( style ) ;^81^^^^^80^82^[REPLACE] this.scope = Util.getScope ( scope ) ;^[METHOD] setScope [TYPE] void [PARAMETER] String scope [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  Object value  [TYPE]  String pattern  scope  style  var  [TYPE]  boolean false  true  [TYPE]  DateTimeZone dateTimeZone  [TYPE]  int scope 
[ADD]^^81^^^^^80^82^[ADD] this.scope = Util.getScope ( scope ) ;^[METHOD] setScope [TYPE] void [PARAMETER] String scope [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  Object value  [TYPE]  String pattern  scope  style  var  [TYPE]  boolean false  true  [TYPE]  DateTimeZone dateTimeZone  [TYPE]  int scope 
[REPLACE]^if  ( value != null )  {^88^^^^^87^148^[REPLACE] if  ( value == null )  {^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^if  (pattern == null )  {^89^^^^^87^148^[REPLACE] if  ( var != null )  {^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^pageContext.setAttribute ( var, formatted, scope ) ;^90^^^^^87^148^[REPLACE] pageContext.removeAttribute ( var, scope ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^if  (pattern == true )  {^89^^^^^87^148^[REPLACE] if  ( var != null )  {^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^pageContext .setAttribute ( pattern , formatted , scope )  ;^90^^^^^87^148^[REPLACE] pageContext.removeAttribute ( var, scope ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[ADD]^^90^^^^^87^148^[ADD] pageContext.removeAttribute ( var, scope ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^DateTimeZone tz = this.dateTimeZone;^96^^^^^87^148^[REPLACE] DateTimeFormatter formatter;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^if  ( var == false )  {^97^^^^^87^148^[REPLACE] if  ( pattern != null )  {^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^}  if  ( style ==scope )  {^99^^^^^87^148^[REPLACE] } else if  ( style != null )  {^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[ADD]^}^99^100^101^^103^87^148^[ADD] else if  ( style != null )  { formatter = DateTimeFormat.forStyle ( style ) ; } else { formatter = DateTimeFormat.mediumDate (  ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^formatter = DateTimeFormat.forStyle ( style ) ; ;^103^^^^^99^104^[REPLACE] formatter = DateTimeFormat.mediumDate (  ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^formatter = DateTimeFormat.mediumDate (  ) ; ;^100^^^^^87^148^[REPLACE] formatter = DateTimeFormat.forStyle ( style ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[ADD]^^100^101^^103^104^87^148^[ADD] formatter = DateTimeFormat.forStyle ( style ) ; } else { formatter = DateTimeFormat.mediumDate (  ) ; }^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^formatter = DateTimeFormat.forStyle ( style ) ; ;^103^^^^^87^148^[REPLACE] formatter = DateTimeFormat.mediumDate (  ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[ADD]^^103^104^^^^87^148^[ADD] formatter = DateTimeFormat.mediumDate (  ) ; }^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^formatter = DateTimeFormat.forStyle ( style ) ; ;^98^^^^^87^148^[REPLACE] formatter = DateTimeFormat.forPattern ( pattern ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^}  else {^99^^^^^87^148^[REPLACE] } else if  ( style != null )  {^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[ADD]^}   formatter = DateTimeFormat.forStyle ( style ) ;^99^100^101^^103^87^148^[ADD] else if  ( style != null )  { formatter = DateTimeFormat.forStyle ( style ) ; } else { formatter = DateTimeFormat.mediumDate (  ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[ADD]^^103^104^^^^99^104^[ADD] formatter = DateTimeFormat.mediumDate (  ) ; }^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^DateTimeZone tz = this.dateTimeZone;^107^^^^^87^148^[REPLACE] Locale locale = this.locale;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[ADD]^^107^^^^^87^148^[ADD] Locale locale = this.locale;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^if  ( locale != true )  {^108^^^^^87^148^[REPLACE] if  ( locale == null )  {^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^locale = Util.getFormattingLocale ( pageContext, this, false, DateFormat.getAvailableLocales (  )  ) ;^109^110^^^^87^148^[REPLACE] locale = Util.getFormattingLocale ( pageContext, this, true, DateFormat.getAvailableLocales (  )  ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^if  ( locale == null )  {^112^^^^^87^148^[REPLACE] if  ( locale != null )  {^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^formatter = formatter.withZone ( tz ) ; ;^113^^^^^87^148^[REPLACE] formatter = formatter.withLocale ( locale ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^DateTimeFormatter formatter;^117^^^^^87^148^[REPLACE] DateTimeZone tz = this.dateTimeZone;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^if  ( dateTimeZone != null )  {^118^^^^^87^148^[REPLACE] if  ( tz == null )  {^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^tz  =  tz ;^119^^^^^87^148^[REPLACE] tz = DateTimeZoneSupport.getDateTimeZone ( pageContext, this ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[ADD]^^119^^^^^87^148^[ADD] tz = DateTimeZoneSupport.getDateTimeZone ( pageContext, this ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^if  (dateTimeZone == this )  {^121^^^^^87^148^[REPLACE] if  ( tz != null )  {^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[ADD]^formatter = formatter.withZone ( tz ) ;^121^122^123^^^87^148^[ADD] if  ( tz != null )  { formatter = formatter.withZone ( tz ) ; }^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^formatter = formatter.withLocale ( locale ) ; ;^122^^^^^87^148^[REPLACE] formatter = formatter.withZone ( tz ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[ADD]^^122^123^^^^87^148^[ADD] formatter = formatter.withZone ( tz ) ; }^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^DateTimeFormatter formatter;^126^^^^^87^148^[REPLACE] String formatted;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[ADD]^^126^127^128^129^130^87^148^[ADD] String formatted; if  ( value instanceof ReadableInstant )  { formatted = formatter.print (  ( ReadableInstant )  value ) ; } else if  ( value instanceof ReadablePartial )  { formatted = formatter.print (  ( ReadablePartial )  value ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^if  ( ! value instanceof ReadableInstant )  {^127^^^^^87^148^[REPLACE] if  ( value instanceof ReadableInstant )  {^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^}  if  ( ! value instanceof ReadablePartial )  {^129^^^^^87^148^[REPLACE] } else if  ( value instanceof ReadablePartial )  {^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^throw new JspException ( "value attribute of format tag must be a ReadableInstant or ReadablePartial," + ;^132^133^134^^^129^135^[REPLACE] throw new JspException ( "value attribute of format tag must be a ReadableInstant or ReadablePartial," + " was: " + value.getClass (  ) .getName (  )  ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[ADD]^^132^133^134^^^129^135^[ADD] throw new JspException ( "value attribute of format tag must be a ReadableInstant or ReadablePartial," + " was: " + value.getClass (  ) .getName (  )  ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^DateFormat.getAvailableLocales (  )  ) ;^134^^^^^129^135^[REPLACE] " was: " + value.getClass (  ) .getName (  )  ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^formatted = formatter.print (  ( ReadableInstant )  value ) ; ;^130^^^^^87^148^[REPLACE] formatted = formatter.print (  ( ReadablePartial )  value ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^return ;^132^133^134^^^87^148^[REPLACE] throw new JspException ( "value attribute of format tag must be a ReadableInstant or ReadablePartial," + " was: " + value.getClass (  ) .getName (  )  ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^formatted = formatter.print (  ( ReadablePartial )  value ) ; ;^128^^^^^87^148^[REPLACE] formatted = formatter.print (  ( ReadableInstant )  value ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^}  else {^129^^^^^87^148^[REPLACE] } else if  ( value instanceof ReadablePartial )  {^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^return ;^132^133^134^^^129^135^[REPLACE] throw new JspException ( "value attribute of format tag must be a ReadableInstant or ReadablePartial," + " was: " + value.getClass (  ) .getName (  )  ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[ADD]^^130^131^132^133^134^87^148^[ADD] formatted = formatter.print (  ( ReadablePartial )  value ) ; } else { throw new JspException ( "value attribute of format tag must be a ReadableInstant or ReadablePartial," + " was: " + value.getClass (  ) .getName (  )  ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[ADD]^^132^133^134^^^87^148^[ADD] throw new JspException ( "value attribute of format tag must be a ReadableInstant or ReadablePartial," + " was: " + value.getClass (  ) .getName (  )  ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^if  ( var == null )  {^137^^^^^87^148^[REPLACE] if  ( var != null )  {^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[ADD]^pageContext.setAttribute ( var, formatted, scope ) ;^137^138^139^140^141^87^148^[ADD] if  ( var != null )  { pageContext.setAttribute ( var, formatted, scope ) ; } else { try { pageContext.getOut (  ) .print ( formatted ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[ADD]^pageContext.getOut (  ) .print ( formatted ) ;^140^141^142^143^144^137^145^[ADD] try { pageContext.getOut (  ) .print ( formatted ) ; } catch  ( IOException ioe )  { throw new JspTagException  (" ")  ; }^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^pageContext .setAttribute ( scope , pattern , scope )  .print ( var ) ;^141^^^^^137^145^[REPLACE] pageContext.getOut (  ) .print ( formatted ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^pageContext.removeAttribute ( var, scope ) ;^141^^^^^137^145^[REPLACE] pageContext.getOut (  ) .print ( formatted ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^return ;^143^^^^^137^145^[REPLACE] throw new JspTagException  (" ")  ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[ADD]^^143^^^^^137^145^[ADD] throw new JspTagException  (" ")  ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^pageContext.setAttribute ( var, var, scope ) ;^138^^^^^87^148^[REPLACE] pageContext.setAttribute ( var, formatted, scope ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[ADD]^pageContext.getOut (  ) .print ( formatted ) ;^140^141^142^143^144^87^148^[ADD] try { pageContext.getOut (  ) .print ( formatted ) ; } catch  ( IOException ioe )  { throw new JspTagException  (" ")  ; }^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^pageContext.getOut (  ) .print ( var ) ;^141^^^^^87^148^[REPLACE] pageContext.getOut (  ) .print ( formatted ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^pageContext .setAttribute ( pattern , var , scope )  .print ( formatted ) ;^141^^^^^87^148^[REPLACE] pageContext.getOut (  ) .print ( formatted ) ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^throw new JspException ( ;^143^^^^^87^148^[REPLACE] throw new JspTagException  (" ")  ;^[METHOD] doEndTag [TYPE] int [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  boolean false  true  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  IOException ioe  [TYPE]  DateTimeFormatter formatter  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
[REPLACE]^super (  ) ;^152^^^^^151^153^[REPLACE] init (  ) ;^[METHOD] release [TYPE] void [PARAMETER] [CLASS] FormatSupport   [TYPE]  Locale locale  [TYPE]  Object value  [TYPE]  String formatted  pattern  scope  style  var  [TYPE]  boolean false  true  [TYPE]  DateTimeZone dateTimeZone  tz  [TYPE]  int scope 
