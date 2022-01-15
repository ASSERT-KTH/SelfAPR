[REPLACE]^private static final long serialVersionUID  = null ;^48^^^^^^^[REPLACE] private static final long serialVersionUID = -6728882245981L;^ [CLASS] BaseDateTime  
[REPLACE]^this ( DateTimeUtils.currentTimeMillis (  ) , ISOChronology.getInstance ( zone )  ) ;^61^^^^^60^62^[REPLACE] this ( DateTimeUtils.currentTimeMillis (  ) , ISOChronology.getInstance (  )  ) ;^[METHOD] <init> [TYPE] BaseDateTime() [PARAMETER] [CLASS] BaseDateTime   [TYPE]  long iMillis  serialVersionUID  [TYPE]  Chronology iChronology  [TYPE]  boolean false  true 
[REPLACE]^this ( DateTimeUtils .getChronology ( true , 1 )  , ISOChronology.getInstance (  )  ) ;^61^^^^^60^62^[REPLACE] this ( DateTimeUtils.currentTimeMillis (  ) , ISOChronology.getInstance (  )  ) ;^[METHOD] <init> [TYPE] BaseDateTime() [PARAMETER] [CLASS] BaseDateTime   [TYPE]  long iMillis  serialVersionUID  [TYPE]  Chronology iChronology  [TYPE]  boolean false  true 
[REPLACE]^this ( DateTimeUtils.currentTimeMillis (  ) , ISOChronology .getInstance (  )   ) ;^61^^^^^60^62^[REPLACE] this ( DateTimeUtils.currentTimeMillis (  ) , ISOChronology.getInstance (  )  ) ;^[METHOD] <init> [TYPE] BaseDateTime() [PARAMETER] [CLASS] BaseDateTime   [TYPE]  long iMillis  serialVersionUID  [TYPE]  Chronology iChronology  [TYPE]  boolean false  true 
[ADD]^^61^^^^^60^62^[ADD] this ( DateTimeUtils.currentTimeMillis (  ) , ISOChronology.getInstance (  )  ) ;^[METHOD] <init> [TYPE] BaseDateTime() [PARAMETER] [CLASS] BaseDateTime   [TYPE]  long iMillis  serialVersionUID  [TYPE]  Chronology iChronology  [TYPE]  boolean false  true 
[REPLACE]^this ( DateTimeUtils.currentTimeMillis (  ) , ISOChronology.getInstance (  )  ) ;^73^^^^^72^74^[REPLACE] this ( DateTimeUtils.currentTimeMillis (  ) , ISOChronology.getInstance ( zone )  ) ;^[METHOD] <init> [TYPE] DateTimeZone) [PARAMETER] DateTimeZone zone [CLASS] BaseDateTime   [TYPE]  Chronology iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  serialVersionUID  [TYPE]  DateTimeZone zone 
[REPLACE]^this ( DateTimeUtils.currentTimeMillis (  ) ,   zone    ) ;^73^^^^^72^74^[REPLACE] this ( DateTimeUtils.currentTimeMillis (  ) , ISOChronology.getInstance ( zone )  ) ;^[METHOD] <init> [TYPE] DateTimeZone) [PARAMETER] DateTimeZone zone [CLASS] BaseDateTime   [TYPE]  Chronology iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  serialVersionUID  [TYPE]  DateTimeZone zone 
[ADD]^^73^^^^^72^74^[ADD] this ( DateTimeUtils.currentTimeMillis (  ) , ISOChronology.getInstance ( zone )  ) ;^[METHOD] <init> [TYPE] DateTimeZone) [PARAMETER] DateTimeZone zone [CLASS] BaseDateTime   [TYPE]  Chronology iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  serialVersionUID  [TYPE]  DateTimeZone zone 
[REPLACE]^this ( DateTimeUtils.currentTimeMillis (  ) , iChronology ) ;^86^^^^^85^87^[REPLACE] this ( DateTimeUtils.currentTimeMillis (  ) , chronology ) ;^[METHOD] <init> [TYPE] Chronology) [PARAMETER] Chronology chronology [CLASS] BaseDateTime   [TYPE]  long iMillis  serialVersionUID  [TYPE]  Chronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^iMillis = checkInstant ( converter.getInstantMillis ( instant, chronology ) , iChronology ) ;^86^^^^^85^87^[REPLACE] this ( DateTimeUtils.currentTimeMillis (  ) , chronology ) ;^[METHOD] <init> [TYPE] Chronology) [PARAMETER] Chronology chronology [CLASS] BaseDateTime   [TYPE]  long iMillis  serialVersionUID  [TYPE]  Chronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^this ( serialVersionUID, ISOChronology.getInstance (  )  ) ;^97^^^^^96^98^[REPLACE] this ( instant, ISOChronology.getInstance (  )  ) ;^[METHOD] <init> [TYPE] BaseDateTime(long) [PARAMETER] long instant [CLASS] BaseDateTime   [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  Chronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^this ( instant, ISOChronology.getInstance ( zone )  ) ;^97^^^^^96^98^[REPLACE] this ( instant, ISOChronology.getInstance (  )  ) ;^[METHOD] <init> [TYPE] BaseDateTime(long) [PARAMETER] long instant [CLASS] BaseDateTime   [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  Chronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^this ( serialVersionUID, ISOChronology.getInstance ( zone )  ) ;^110^^^^^109^111^[REPLACE] this ( instant, ISOChronology.getInstance ( zone )  ) ;^[METHOD] <init> [TYPE] DateTimeZone) [PARAMETER] long instant DateTimeZone zone [CLASS] BaseDateTime   [TYPE]  Chronology chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  DateTimeZone zone 
[REMOVE]^iMillis = checkInstant ( converter.getInstantMillis ( instant, chronology ) , iChronology ) ;^110^^^^^109^111^[REMOVE] ^[METHOD] <init> [TYPE] DateTimeZone) [PARAMETER] long instant DateTimeZone zone [CLASS] BaseDateTime   [TYPE]  Chronology chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  DateTimeZone zone 
[REPLACE]^this ( instant,   zone    ) ;^110^^^^^109^111^[REPLACE] this ( instant, ISOChronology.getInstance ( zone )  ) ;^[METHOD] <init> [TYPE] DateTimeZone) [PARAMETER] long instant DateTimeZone zone [CLASS] BaseDateTime   [TYPE]  Chronology chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  DateTimeZone zone 
[REPLACE]^iMillis = checkInstant ( converter.getInstantMillis ( instant, chronology ) , iChronology ) ;^124^^^^^123^127^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] Chronology) [PARAMETER] long instant Chronology chronology [CLASS] BaseDateTime   [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  Chronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^iChronology =  checkChronology ( null ) ;^125^^^^^123^127^[REPLACE] iChronology = checkChronology ( chronology ) ;^[METHOD] <init> [TYPE] Chronology) [PARAMETER] long instant Chronology chronology [CLASS] BaseDateTime   [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  Chronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^iMillis =  checkInstant ( serialVersionUID, iChronology ) ;^126^^^^^123^127^[REPLACE] iMillis = checkInstant ( instant, iChronology ) ;^[METHOD] <init> [TYPE] Chronology) [PARAMETER] long instant Chronology chronology [CLASS] BaseDateTime   [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  Chronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^iMillis = checkInstant ( converter.getInstantMillis ( instant, chronology ) , iChronology ) ;^146^^^^^145^151^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] DateTimeZone) [PARAMETER] Object instant DateTimeZone zone [CLASS] BaseDateTime   [TYPE]  Object instant  [TYPE]  InstantConverter converter  [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  DateTimeZone zone 
[REPLACE]^long instant = iChronology.getDateTimeMillis ( year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond ) ;^147^^^^^145^151^[REPLACE] InstantConverter converter = ConverterManager.getInstance (  ) .getInstantConverter ( instant ) ;^[METHOD] <init> [TYPE] DateTimeZone) [PARAMETER] Object instant DateTimeZone zone [CLASS] BaseDateTime   [TYPE]  Object instant  [TYPE]  InstantConverter converter  [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  DateTimeZone zone 
[REPLACE]^long instant = iChronology.getDateTimeMillis ( year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond ) ;^148^^^^^145^151^[REPLACE] Chronology chrono = checkChronology ( converter.getChronology ( instant, zone )  ) ;^[METHOD] <init> [TYPE] DateTimeZone) [PARAMETER] Object instant DateTimeZone zone [CLASS] BaseDateTime   [TYPE]  Object instant  [TYPE]  InstantConverter converter  [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  DateTimeZone zone 
[REPLACE]^iChronology =  chronology;^149^^^^^145^151^[REPLACE] iChronology = chrono;^[METHOD] <init> [TYPE] DateTimeZone) [PARAMETER] Object instant DateTimeZone zone [CLASS] BaseDateTime   [TYPE]  Object instant  [TYPE]  InstantConverter converter  [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  DateTimeZone zone 
[ADD]^^149^150^^^^145^151^[ADD] iChronology = chrono; iMillis = checkInstant ( converter.getInstantMillis ( instant, chrono ) , chrono ) ;^[METHOD] <init> [TYPE] DateTimeZone) [PARAMETER] Object instant DateTimeZone zone [CLASS] BaseDateTime   [TYPE]  Object instant  [TYPE]  InstantConverter converter  [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  DateTimeZone zone 
[REPLACE]^iMillis = checkInstant ( converter.getInstantMillis ( instant, chronology ) , iChronology ) ; ;^150^^^^^145^151^[REPLACE] iMillis = checkInstant ( converter.getInstantMillis ( instant, chrono ) , chrono ) ;^[METHOD] <init> [TYPE] DateTimeZone) [PARAMETER] Object instant DateTimeZone zone [CLASS] BaseDateTime   [TYPE]  Object instant  [TYPE]  InstantConverter converter  [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  DateTimeZone zone 
[REPLACE]^iMillis = checkInstant ( converter.getInstantMillis ( instant, chronology ) , iChronology ) ;^168^^^^^167^172^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] Chronology) [PARAMETER] Object instant Chronology chronology [CLASS] BaseDateTime   [TYPE]  Object instant  [TYPE]  InstantConverter converter  [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID 
[ADD]^^168^^^^^167^172^[ADD] super (  ) ;^[METHOD] <init> [TYPE] Chronology) [PARAMETER] Object instant Chronology chronology [CLASS] BaseDateTime   [TYPE]  Object instant  [TYPE]  InstantConverter converter  [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID 
[REPLACE]^InstantConverter converter = ConverterManager .getInstance (  )  .getInstantConverter ( instant ) ;^169^^^^^167^172^[REPLACE] InstantConverter converter = ConverterManager.getInstance (  ) .getInstantConverter ( instant ) ;^[METHOD] <init> [TYPE] Chronology) [PARAMETER] Object instant Chronology chronology [CLASS] BaseDateTime   [TYPE]  Object instant  [TYPE]  InstantConverter converter  [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID 
[REPLACE]^iChronology =  checkChronology ( null.getChronology ( instant, chronology )  ) ;^170^^^^^167^172^[REPLACE] iChronology = checkChronology ( converter.getChronology ( instant, chronology )  ) ;^[METHOD] <init> [TYPE] Chronology) [PARAMETER] Object instant Chronology chronology [CLASS] BaseDateTime   [TYPE]  Object instant  [TYPE]  InstantConverter converter  [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID 
[REPLACE]^iMillis = checkInstant ( converter.getInstantMillis ( instant, chrono ) , chrono ) ; ;^171^^^^^167^172^[REPLACE] iMillis = checkInstant ( converter.getInstantMillis ( instant, chronology ) , iChronology ) ;^[METHOD] <init> [TYPE] Chronology) [PARAMETER] Object instant Chronology chronology [CLASS] BaseDateTime   [TYPE]  Object instant  [TYPE]  InstantConverter converter  [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID 
[REPLACE]^this ( year, monthOfYear, dayOfMonth, hourOfDay, year, secondOfMinute, millisOfSecond, ISOChronology.getInstance (  )  ) ;^195^196^^^^187^197^[REPLACE] this ( year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, ISOChronology.getInstance (  )  ) ;^[METHOD] <init> [TYPE] BaseDateTime(int,int,int,int,int,int,int) [PARAMETER] int year int monthOfYear int dayOfMonth int hourOfDay int minuteOfHour int secondOfMinute int millisOfSecond [CLASS] BaseDateTime   [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  int dayOfMonth  hourOfDay  millisOfSecond  minuteOfHour  monthOfYear  secondOfMinute  year 
[ADD]^^195^196^^^^187^197^[ADD] this ( year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, ISOChronology.getInstance (  )  ) ;^[METHOD] <init> [TYPE] BaseDateTime(int,int,int,int,int,int,int) [PARAMETER] int year int monthOfYear int dayOfMonth int hourOfDay int minuteOfHour int secondOfMinute int millisOfSecond [CLASS] BaseDateTime   [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  int dayOfMonth  hourOfDay  millisOfSecond  minuteOfHour  monthOfYear  secondOfMinute  year 
[REPLACE]^minuteOfHour, secondOfMinute, millisOfSecond, ISOChronology .getInstance (  )   ) ;^196^^^^^187^197^[REPLACE] minuteOfHour, secondOfMinute, millisOfSecond, ISOChronology.getInstance (  )  ) ;^[METHOD] <init> [TYPE] BaseDateTime(int,int,int,int,int,int,int) [PARAMETER] int year int monthOfYear int dayOfMonth int hourOfDay int minuteOfHour int secondOfMinute int millisOfSecond [CLASS] BaseDateTime   [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  int dayOfMonth  hourOfDay  millisOfSecond  minuteOfHour  monthOfYear  secondOfMinute  year 
[REPLACE]^this ( year, monthOfYear, monthOfYear, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond,   zone    ) ;^223^224^^^^214^225^[REPLACE] this ( year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, ISOChronology.getInstance ( zone )  ) ;^[METHOD] <init> [TYPE] DateTimeZone) [PARAMETER] int year int monthOfYear int dayOfMonth int hourOfDay int minuteOfHour int secondOfMinute int millisOfSecond DateTimeZone zone [CLASS] BaseDateTime   [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  int dayOfMonth  hourOfDay  millisOfSecond  minuteOfHour  monthOfYear  secondOfMinute  year  [TYPE]  DateTimeZone zone 
[REPLACE]^minuteOfHour, secondOfMinute, millisOfSecond,   zone    ) ;^224^^^^^214^225^[REPLACE] minuteOfHour, secondOfMinute, millisOfSecond, ISOChronology.getInstance ( zone )  ) ;^[METHOD] <init> [TYPE] DateTimeZone) [PARAMETER] int year int monthOfYear int dayOfMonth int hourOfDay int minuteOfHour int secondOfMinute int millisOfSecond DateTimeZone zone [CLASS] BaseDateTime   [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  int dayOfMonth  hourOfDay  millisOfSecond  minuteOfHour  monthOfYear  secondOfMinute  year  [TYPE]  DateTimeZone zone 
[REPLACE]^iMillis = checkInstant ( converter.getInstantMillis ( instant, chronology ) , iChronology ) ;^252^^^^^243^257^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] Chronology) [PARAMETER] int year int monthOfYear int dayOfMonth int hourOfDay int minuteOfHour int secondOfMinute int millisOfSecond Chronology chronology [CLASS] BaseDateTime   [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  int dayOfMonth  hourOfDay  millisOfSecond  minuteOfHour  monthOfYear  secondOfMinute  year 
[ADD]^^252^^^^^243^257^[ADD] super (  ) ;^[METHOD] <init> [TYPE] Chronology) [PARAMETER] int year int monthOfYear int dayOfMonth int hourOfDay int minuteOfHour int secondOfMinute int millisOfSecond Chronology chronology [CLASS] BaseDateTime   [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  int dayOfMonth  hourOfDay  millisOfSecond  minuteOfHour  monthOfYear  secondOfMinute  year 
[REPLACE]^iChronology =  checkChronology ( null ) ;^253^^^^^243^257^[REPLACE] iChronology = checkChronology ( chronology ) ;^[METHOD] <init> [TYPE] Chronology) [PARAMETER] int year int monthOfYear int dayOfMonth int hourOfDay int minuteOfHour int secondOfMinute int millisOfSecond Chronology chronology [CLASS] BaseDateTime   [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  int dayOfMonth  hourOfDay  millisOfSecond  minuteOfHour  monthOfYear  secondOfMinute  year 
[REPLACE]^long instant = iChronology.getDateTimeMillis ( year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, year ) ;^254^255^^^^243^257^[REPLACE] long instant = iChronology.getDateTimeMillis ( year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond ) ;^[METHOD] <init> [TYPE] Chronology) [PARAMETER] int year int monthOfYear int dayOfMonth int hourOfDay int minuteOfHour int secondOfMinute int millisOfSecond Chronology chronology [CLASS] BaseDateTime   [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  int dayOfMonth  hourOfDay  millisOfSecond  minuteOfHour  monthOfYear  secondOfMinute  year 
[REPLACE]^iMillis =  checkInstant ( serialVersionUID, iChronology ) ;^256^^^^^243^257^[REPLACE] iMillis = checkInstant ( instant, iChronology ) ;^[METHOD] <init> [TYPE] Chronology) [PARAMETER] int year int monthOfYear int dayOfMonth int hourOfDay int minuteOfHour int secondOfMinute int millisOfSecond Chronology chronology [CLASS] BaseDateTime   [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  int dayOfMonth  hourOfDay  millisOfSecond  minuteOfHour  monthOfYear  secondOfMinute  year 
[ADD]^^256^^^^^243^257^[ADD] iMillis = checkInstant ( instant, iChronology ) ;^[METHOD] <init> [TYPE] Chronology) [PARAMETER] int year int monthOfYear int dayOfMonth int hourOfDay int minuteOfHour int secondOfMinute int millisOfSecond Chronology chronology [CLASS] BaseDateTime   [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  int dayOfMonth  hourOfDay  millisOfSecond  minuteOfHour  monthOfYear  secondOfMinute  year 
[REPLACE]^return   iChronology   ;^270^^^^^269^271^[REPLACE] return DateTimeUtils.getChronology ( chronology ) ;^[METHOD] checkChronology [TYPE] Chronology [PARAMETER] Chronology chronology [CLASS] BaseDateTime   [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^return serialVersionUID;^284^^^^^283^285^[REPLACE] return instant;^[METHOD] checkInstant [TYPE] long [PARAMETER] long instant Chronology chronology [CLASS] BaseDateTime   [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^return iChronology;^295^^^^^294^296^[REPLACE] return iMillis;^[METHOD] getMillis [TYPE] long [PARAMETER] [CLASS] BaseDateTime   [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^return DateTimeUtils.getChronology ( chronology ) ;^304^^^^^303^305^[REPLACE] return iChronology;^[METHOD] getChronology [TYPE] Chronology [PARAMETER] [CLASS] BaseDateTime   [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^iMillis =  checkInstant ( null, iChronology ) ;^317^^^^^316^318^[REPLACE] iMillis = checkInstant ( instant, iChronology ) ;^[METHOD] setMillis [TYPE] void [PARAMETER] long instant [CLASS] BaseDateTime   [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^iChronology =  checkChronology ( chrono ) ;^329^^^^^328^330^[REPLACE] iChronology = checkChronology ( chronology ) ;^[METHOD] setChronology [TYPE] void [PARAMETER] Chronology chronology [CLASS] BaseDateTime   [TYPE]  long iMillis  instant  serialVersionUID  [TYPE]  Chronology chrono  chronology  iChronology  [TYPE]  boolean false  true 
