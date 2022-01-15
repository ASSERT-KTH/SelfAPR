[REPLACE]^private static final long serialVersionUID ;^37^^^^^^^[REPLACE] private static final long serialVersionUID = 538276888268L;^ [CLASS] BasicGJChronology  
[REPLACE]^private static final int[] MIN_DAYS_PER_MONTH_ARRAY ;^42^^^^^42^44^[REPLACE] private static final int[] MIN_DAYS_PER_MONTH_ARRAY = {^ [CLASS] BasicGJChronology  
[REPLACE]^private static final int[] MAX_DAYS_PER_MONTH_ARRAY  = null ;^45^^^^^45^47^[REPLACE] private static final int[] MAX_DAYS_PER_MONTH_ARRAY = {^ [CLASS] BasicGJChronology  
[REPLACE]^private  final long[] MIN_TOTAL_MILLIS_BY_MONTH_ARRAY;^48^^^^^^^[REPLACE] private static final long[] MIN_TOTAL_MILLIS_BY_MONTH_ARRAY;^ [CLASS] BasicGJChronology  
[REPLACE]^private  final long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY;^49^^^^^^^[REPLACE] private static final long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY;^ [CLASS] BasicGJChronology  
[REPLACE]^private static  long FEB_29 =  ( 31L + 29 - 1 )  * DateTimeConstants.MILLIS_PER_DAY;^50^^^^^^^[REPLACE] private static final long FEB_29 =  ( 31L + 29 - 1 )  * DateTimeConstants.MILLIS_PER_DAY;^ [CLASS] BasicGJChronology  
[REPLACE]^long minuendRem = minuendInstant - getYearMillis ( minuendYear ) ;^75^^^^^74^76^[REPLACE] super ( base, param, minDaysInFirstWeek ) ;^[METHOD] <init> [TYPE] Object,int) [PARAMETER] Chronology base Object param int minDaysInFirstWeek [CLASS] BasicGJChronology   [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  Object param  [TYPE]  Chronology base  [TYPE]  long FEB_29  serialVersionUID  [TYPE]  int minDaysInFirstWeek 
[REPLACE]^int i =  ( int )  (  ( millis - getYearMillis ( year )  )   <  10 >>> 2 ) ;^88^^^^^79^109^[REPLACE] int i =  ( int )  (  ( millis - getYearMillis ( year )  )  >> 10 ) ;^[METHOD] getMonthOfYear [TYPE] int [PARAMETER] long millis int year [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  millis  serialVersionUID  [TYPE]  int i  year 
[REPLACE]^return ( isLeapYear ( year )  ) ?  (  ( i  ;^93^94^95^96^^79^109^[REPLACE] return ( isLeapYear ( year )  ) ?  (  ( i < 182 * 84375 ) ?  (  ( i < 91 * 84375 )^[METHOD] getMonthOfYear [TYPE] int [PARAMETER] long millis int year [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  millis  serialVersionUID  [TYPE]  int i  year 
[REPLACE]^if  ( !isLeapYear ( year )  )  {^120^^^^^119^125^[REPLACE] if  ( isLeapYear ( year )  )  {^[METHOD] getDaysInYearMonth [TYPE] int [PARAMETER] int year int month [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  millis  serialVersionUID  [TYPE]  int month  year 
[ADD]^return MAX_DAYS_PER_MONTH_ARRAY[month - 1];return MIN_DAYS_PER_MONTH_ARRAY[month - 1];^120^121^122^123^124^119^125^[ADD] if  ( isLeapYear ( year )  )  { return MAX_DAYS_PER_MONTH_ARRAY[month - 1]; } else { return MIN_DAYS_PER_MONTH_ARRAY[month - 1]; }^[METHOD] getDaysInYearMonth [TYPE] int [PARAMETER] int year int month [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  millis  serialVersionUID  [TYPE]  int month  year 
[REPLACE]^return MIN_DAYS_PER_MONTH_ARRAY[month  ;^123^^^^^119^125^[REPLACE] return MIN_DAYS_PER_MONTH_ARRAY[month - 1];^[METHOD] getDaysInYearMonth [TYPE] int [PARAMETER] int year int month [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  millis  serialVersionUID  [TYPE]  int month  year 
[REPLACE]^return MAX_DAYS_PER_MONTH_ARRAY[month  &&  1];^121^^^^^119^125^[REPLACE] return MAX_DAYS_PER_MONTH_ARRAY[month - 1];^[METHOD] getDaysInYearMonth [TYPE] int [PARAMETER] int year int month [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  millis  serialVersionUID  [TYPE]  int month  year 
[REPLACE]^return MAX_DAYS_PER_MONTH_ARRAY[month  ;^121^^^^^119^125^[REPLACE] return MAX_DAYS_PER_MONTH_ARRAY[month - 1];^[METHOD] getDaysInYearMonth [TYPE] int [PARAMETER] int year int month [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  millis  serialVersionUID  [TYPE]  int month  year 
[REPLACE]^return MAX_DAYS_PER_MONTH_ARRAY[month - 1];^123^^^^^119^125^[REPLACE] return MIN_DAYS_PER_MONTH_ARRAY[month - 1];^[METHOD] getDaysInYearMonth [TYPE] int [PARAMETER] int year int month [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  millis  serialVersionUID  [TYPE]  int month  year 
[REPLACE]^return MIN_DAYS_PER_MONTH_ARRAY[month - 1];^129^^^^^128^130^[REPLACE] return MAX_DAYS_PER_MONTH_ARRAY[month - 1];^[METHOD] getDaysInMonthMax [TYPE] int [PARAMETER] int month [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  millis  serialVersionUID  [TYPE]  int month 
[REPLACE]^return  ( value  !=  28 * 3 ? getDaysInMonthMax ( instant )  : 28 * 3 ) ;;^134^^^^^133^135^[REPLACE] return  ( value > 28 ? getDaysInMonthMax ( instant )  : 28 ) ;^[METHOD] getDaysInMonthMaxForSet [TYPE] int [PARAMETER] long instant int value [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  serialVersionUID  [TYPE]  int value 
[REPLACE]^if  ( !isLeapYear ( year )  )  {^139^^^^^138^144^[REPLACE] if  ( isLeapYear ( year )  )  {^[METHOD] getTotalMillisByYearMonth [TYPE] long [PARAMETER] int year int month [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  serialVersionUID  [TYPE]  int month  year 
[REPLACE]^return MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[month  !=  1];;^142^^^^^138^144^[REPLACE] return MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[month - 1];^[METHOD] getTotalMillisByYearMonth [TYPE] long [PARAMETER] int year int month [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  serialVersionUID  [TYPE]  int month  year 
[REPLACE]^return MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[month  &  1];^140^^^^^138^144^[REPLACE] return MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[month - 1];^[METHOD] getTotalMillisByYearMonth [TYPE] long [PARAMETER] int year int month [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  serialVersionUID  [TYPE]  int month  year 
[REPLACE]^return MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[month  ^  1];^140^^^^^138^144^[REPLACE] return MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[month - 1];^[METHOD] getTotalMillisByYearMonth [TYPE] long [PARAMETER] int year int month [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  serialVersionUID  [TYPE]  int month  year 
[REPLACE]^return MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[month  ;^142^^^^^138^144^[REPLACE] return MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[month - 1];^[METHOD] getTotalMillisByYearMonth [TYPE] long [PARAMETER] int year int month [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  serialVersionUID  [TYPE]  int month  year 
[REPLACE]^int minuendYear = getYear ( subtrahendRem ) ;^148^^^^^147^171^[REPLACE] int minuendYear = getYear ( minuendInstant ) ;^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[REPLACE]^int subtrahendYear = getYear ( subtrahendRem ) ;^149^^^^^147^171^[REPLACE] int subtrahendYear = getYear ( subtrahendInstant ) ;^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[REPLACE]^long minuendRem =subtrahendRem - getYearMillis ( minuendYear ) ;^152^^^^^147^171^[REPLACE] long minuendRem = minuendInstant - getYearMillis ( minuendYear ) ;^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[REPLACE]^long subtrahendRem =subtrahendRem - getYearMillis ( subtrahendYear ) ;^153^^^^^147^171^[REPLACE] long subtrahendRem = subtrahendInstant - getYearMillis ( subtrahendYear ) ;^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[REPLACE]^if  (subtrahendInstant  ==  FEB_29 )  {^156^^^^^147^171^[REPLACE] if  ( subtrahendRem >= FEB_29 )  {^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[ADD]^^156^157^158^159^160^147^171^[ADD] if  ( subtrahendRem >= FEB_29 )  { if  ( isLeapYear ( subtrahendYear )  )  { if  ( !isLeapYear ( minuendYear )  )  { subtrahendRem -= DateTimeConstants.MILLIS_PER_DAY; }^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[REPLACE]^if  ( isLeapYear ( thisYear )  )  {^157^^^^^147^171^[REPLACE] if  ( isLeapYear ( subtrahendYear )  )  {^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[REPLACE]^} else if  ( minuendRem >= FEB_29 || isLeapYear ( minuendYear )  )  {^161^^^^^147^171^[REPLACE] } else if  ( minuendRem >= FEB_29 && isLeapYear ( minuendYear )  )  {^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[ADD]^}   minuendRem -= DateTimeConstants.MILLIS_PER_DAY;^161^162^163^^^147^171^[ADD] else if  ( minuendRem >= FEB_29 && isLeapYear ( minuendYear )  )  { minuendRem -= DateTimeConstants.MILLIS_PER_DAY; }^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[REPLACE]^subtrahendRem -= DateTimeConstants.MILLIS_PER_DAY; ;^162^^^^^147^171^[REPLACE] minuendRem -= DateTimeConstants.MILLIS_PER_DAY;^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[REPLACE]^if  ( !isLeapYear ( year )  )  {^158^^^^^147^171^[REPLACE] if  ( !isLeapYear ( minuendYear )  )  {^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[ADD]^^158^159^160^^^147^171^[ADD] if  ( !isLeapYear ( minuendYear )  )  { subtrahendRem -= DateTimeConstants.MILLIS_PER_DAY; }^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[REPLACE]^minuendRem -= DateTimeConstants.MILLIS_PER_DAY; ;^159^^^^^147^171^[REPLACE] subtrahendRem -= DateTimeConstants.MILLIS_PER_DAY;^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[ADD]^^159^^^^^147^171^[ADD] subtrahendRem -= DateTimeConstants.MILLIS_PER_DAY;^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[REPLACE]^if  ( !isLeapYear ( subtrahendYear )  )  {^158^^^^^147^171^[REPLACE] if  ( !isLeapYear ( minuendYear )  )  {^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[REPLACE]^}  if  ( minuendRem >= false || isLeapYear ( minuendYear )  )  {^161^^^^^147^171^[REPLACE] } else if  ( minuendRem >= FEB_29 && isLeapYear ( minuendYear )  )  {^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[REPLACE]^}  if  ( minuendRem >= FEB_29 || isLeapYear ( subtrahendYear )  )  {^161^^^^^147^171^[REPLACE] } else if  ( minuendRem >= FEB_29 && isLeapYear ( minuendYear )  )  {^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[REPLACE]^}  if  ( minuendRem >= FEB_29 || isLeapYear ( minuendYear )  )  {^161^^^^^147^171^[REPLACE] } else if  ( minuendRem >= FEB_29 && isLeapYear ( minuendYear )  )  {^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[ADD]^^162^^^^^147^171^[ADD] minuendRem -= DateTimeConstants.MILLIS_PER_DAY;^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[REPLACE]^int difference = minuendYear -difference;^166^^^^^147^171^[REPLACE] int difference = minuendYear - subtrahendYear;^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[REPLACE]^if  ( minuendRem  <= subtrahendInstant )  {^167^^^^^147^171^[REPLACE] if  ( minuendRem < subtrahendRem )  {^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[REPLACE]^return subtrahendYear;^170^^^^^147^171^[REPLACE] return difference;^[METHOD] getYearDifference [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int difference  minuendYear  subtrahendYear 
[REPLACE]^int thisYear = getYear ( subtrahendRem ) ;^175^^^^^174^199^[REPLACE] int thisYear = getYear ( instant ) ;^[METHOD] setYear [TYPE] long [PARAMETER] long instant int year [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int dayOfYear  millisOfDay  thisYear  year 
[ADD]^^175^^^^^174^199^[ADD] int thisYear = getYear ( instant ) ;^[METHOD] setYear [TYPE] long [PARAMETER] long instant int year [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int dayOfYear  millisOfDay  thisYear  year 
[REPLACE]^int dayOfYear = getDayOfYear ( instant, year ) ;^176^^^^^174^199^[REPLACE] int dayOfYear = getDayOfYear ( instant, thisYear ) ;^[METHOD] setYear [TYPE] long [PARAMETER] long instant int year [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int dayOfYear  millisOfDay  thisYear  year 
[ADD]^^176^^^^^174^199^[ADD] int dayOfYear = getDayOfYear ( instant, thisYear ) ;^[METHOD] setYear [TYPE] long [PARAMETER] long instant int year [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int dayOfYear  millisOfDay  thisYear  year 
[REPLACE]^int millisOfDay = getMillisOfDay ( subtrahendRem ) ;^177^^^^^174^199^[REPLACE] int millisOfDay = getMillisOfDay ( instant ) ;^[METHOD] setYear [TYPE] long [PARAMETER] long instant int year [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int dayOfYear  millisOfDay  thisYear  year 
[ADD]^^177^^^^^174^199^[ADD] int millisOfDay = getMillisOfDay ( instant ) ;^[METHOD] setYear [TYPE] long [PARAMETER] long instant int year [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int dayOfYear  millisOfDay  thisYear  year 
[REPLACE]^if  ( dayOfYear  <=   ( 31L + 28 )  )  {^179^^^^^174^199^[REPLACE] if  ( dayOfYear >  ( 31 + 28 )  )  {^[METHOD] setYear [TYPE] long [PARAMETER] long instant int year [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int dayOfYear  millisOfDay  thisYear  year 
[REMOVE]^if  ( subtrahendRem >=  ( FEB_29 )  )  {     if  ( isLeapYear ( subtrahendYear )  )  {         if  ( ! ( isLeapYear ( minuendYear )  )  )  {             subtrahendRem -= MILLIS_PER_DAY;         }     }else         if  (  ( minuendRem >=  ( FEB_29 )  )  &&  ( isLeapYear ( minuendYear )  )  )  {             minuendRem -= MILLIS_PER_DAY;         }      }^179^^^^^174^199^[REMOVE] ^[METHOD] setYear [TYPE] long [PARAMETER] long instant int year [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int dayOfYear  millisOfDay  thisYear  year 
[REPLACE]^if  ( !isLeapYear ( year )  )  {^180^^^^^174^199^[REPLACE] if  ( isLeapYear ( thisYear )  )  {^[METHOD] setYear [TYPE] long [PARAMETER] long instant int year [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int dayOfYear  millisOfDay  thisYear  year 
[REPLACE]^if  ( isLeapYear ( thisYear )  )  {^188^^^^^174^199^[REPLACE] if  ( isLeapYear ( year )  )  {^[METHOD] setYear [TYPE] long [PARAMETER] long instant int year [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int dayOfYear  millisOfDay  thisYear  year 
[REPLACE]^if  ( !isLeapYear ( thisYear )  )  {^182^^^^^174^199^[REPLACE] if  ( !isLeapYear ( year )  )  {^[METHOD] setYear [TYPE] long [PARAMETER] long instant int year [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int dayOfYear  millisOfDay  thisYear  year 
[REMOVE]^if  ( isLeapYear ( year )  )  {     dayOfYear++; }^182^^^^^174^199^[REMOVE] ^[METHOD] setYear [TYPE] long [PARAMETER] long instant int year [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int dayOfYear  millisOfDay  thisYear  year 
[REPLACE]^if  ( isLeapYear ( millisOfDay )  )  {^180^^^^^174^199^[REPLACE] if  ( isLeapYear ( thisYear )  )  {^[METHOD] setYear [TYPE] long [PARAMETER] long instant int year [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int dayOfYear  millisOfDay  thisYear  year 
[ADD]^^188^189^190^191^^174^199^[ADD] if  ( isLeapYear ( year )  )  {  dayOfYear++; }^[METHOD] setYear [TYPE] long [PARAMETER] long instant int year [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int dayOfYear  millisOfDay  thisYear  year 
[REMOVE]^if  ( minuendRem < subtrahendRem )  {     difference--; }^188^^^^^174^199^[REMOVE] ^[METHOD] setYear [TYPE] long [PARAMETER] long instant int year [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int dayOfYear  millisOfDay  thisYear  year 
[REPLACE]^instant = getYearMonthDayMillis ( year, 1 - 0, dayOfYear ) ;^195^^^^^174^199^[REPLACE] instant = getYearMonthDayMillis ( year, 1, dayOfYear ) ;^[METHOD] setYear [TYPE] long [PARAMETER] long instant int year [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int dayOfYear  millisOfDay  thisYear  year 
[REPLACE]^instant +=  year;^196^^^^^174^199^[REPLACE] instant += millisOfDay;^[METHOD] setYear [TYPE] long [PARAMETER] long instant int year [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int dayOfYear  millisOfDay  thisYear  year 
[REPLACE]^return subtrahendRem;^198^^^^^174^199^[REPLACE] return instant;^[METHOD] setYear [TYPE] long [PARAMETER] long instant int year [CLASS] BasicGJChronology   [TYPE]  int[] MAX_DAYS_PER_MONTH_ARRAY  MIN_DAYS_PER_MONTH_ARRAY  [TYPE]  boolean false  true  [TYPE]  long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY  MIN_TOTAL_MILLIS_BY_MONTH_ARRAY  [TYPE]  long FEB_29  instant  millis  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  [TYPE]  int dayOfYear  millisOfDay  thisYear  year 
