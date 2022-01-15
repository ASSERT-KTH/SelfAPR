[REPLACE]^private static final  short  serialVersionUID = 6215066916806820644;^34^^^^^^^[REPLACE] private static final long serialVersionUID = 6215066916806820644L;^ [CLASS] BasicWeekyearDateTimeField  
[REPLACE]^private static final long WEEK_53 ;^36^^^^^^^[REPLACE] private static final long WEEK_53 =  ( 53L - 1 )  * DateTimeConstants.MILLIS_PER_WEEK;^ [CLASS] BasicWeekyearDateTimeField  
[REPLACE]^super ( DateTimeFieldType.weekyear (  ) , iChronology .getWeeksInYear ( true )   ) ;^44^^^^^43^46^[REPLACE] super ( DateTimeFieldType.weekyear (  ) , chronology.getAverageMillisPerYear (  )  ) ;^[METHOD] <init> [TYPE] BasicChronology) [PARAMETER] BasicChronology chronology [CLASS] BasicWeekyearDateTimeField   [TYPE]  long WEEK_53  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^int weeksInToYear = iChronology.getWeeksInYear (  year  ) ;^44^^^^^43^46^[REPLACE] super ( DateTimeFieldType.weekyear (  ) , chronology.getAverageMillisPerYear (  )  ) ;^[METHOD] <init> [TYPE] BasicChronology) [PARAMETER] BasicChronology chronology [CLASS] BasicWeekyearDateTimeField   [TYPE]  long WEEK_53  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^super ( DateTimeFieldType.weekyear (  ) , iChronology.getAverageMillisPerYear (  )  ) ;^44^^^^^43^46^[REPLACE] super ( DateTimeFieldType.weekyear (  ) , chronology.getAverageMillisPerYear (  )  ) ;^[METHOD] <init> [TYPE] BasicChronology) [PARAMETER] BasicChronology chronology [CLASS] BasicWeekyearDateTimeField   [TYPE]  long WEEK_53  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^iChronology =  null;^45^^^^^43^46^[REPLACE] iChronology = chronology;^[METHOD] <init> [TYPE] BasicChronology) [PARAMETER] BasicChronology chronology [CLASS] BasicWeekyearDateTimeField   [TYPE]  long WEEK_53  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[ADD]^^45^^^^^43^46^[ADD] iChronology = chronology;^[METHOD] <init> [TYPE] BasicChronology) [PARAMETER] BasicChronology chronology [CLASS] BasicWeekyearDateTimeField   [TYPE]  long WEEK_53  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^return true;^49^^^^^48^50^[REPLACE] return false;^[METHOD] isLenient [TYPE] boolean [PARAMETER] [CLASS] BasicWeekyearDateTimeField   [TYPE]  long WEEK_53  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^return iChronology.getWeekOfWeekyear ( instant ) ;^60^^^^^59^61^[REPLACE] return iChronology.getWeekyear ( instant ) ;^[METHOD] get [TYPE] int [PARAMETER] long instant [CLASS] BasicWeekyearDateTimeField   [TYPE]  long WEEK_53  instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^if  ( years  !=  4 )  {^72^^^^^71^76^[REPLACE] if  ( years == 0 )  {^[METHOD] add [TYPE] long [PARAMETER] long instant int years [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int years 
[REPLACE]^return serialVersionUID;^73^^^^^71^76^[REPLACE] return instant;^[METHOD] add [TYPE] long [PARAMETER] long instant int years [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int years 
[REPLACE]^return set ( instant, get ( instant )   ^  years ) ;^75^^^^^71^76^[REPLACE] return set ( instant, get ( instant )  + years ) ;^[METHOD] add [TYPE] long [PARAMETER] long instant int years [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  serialVersionUID  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int years 
[REPLACE]^return add ( instant, FieldUtils .verifyValueBounds ( this , false )   ) ;^79^^^^^78^80^[REPLACE] return add ( instant, FieldUtils.safeToInt ( value )  ) ;^[METHOD] add [TYPE] long [PARAMETER] long instant long value [CLASS] BasicWeekyearDateTimeField   [TYPE]  long WEEK_53  instant  serialVersionUID  value  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^return workInstant;^92^^^^^91^93^[REPLACE] return add ( instant, years ) ;^[METHOD] addWrapField [TYPE] long [PARAMETER] long instant int years [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  serialVersionUID  value  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int years 
[REPLACE]^if  ( value  <=  subtrahendInstant )  {^96^^^^^95^116^[REPLACE] if  ( minuendInstant < subtrahendInstant )  {^[METHOD] getDifferenceAsLong [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int difference  minuendWeekyear  subtrahendWeekyear 
[REPLACE]^return -getDifference ( subtrahendInstant, value ) ;^97^^^^^95^116^[REPLACE] return -getDifference ( subtrahendInstant, minuendInstant ) ;^[METHOD] getDifferenceAsLong [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int difference  minuendWeekyear  subtrahendWeekyear 
[REPLACE]^int minuendWeekyear = get ( value ) ;^100^^^^^95^116^[REPLACE] int minuendWeekyear = get ( minuendInstant ) ;^[METHOD] getDifferenceAsLong [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int difference  minuendWeekyear  subtrahendWeekyear 
[REPLACE]^int subtrahendWeekyear = get ( value ) ;^101^^^^^95^116^[REPLACE] int subtrahendWeekyear = get ( subtrahendInstant ) ;^[METHOD] getDifferenceAsLong [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int difference  minuendWeekyear  subtrahendWeekyear 
[REPLACE]^long minuendRem = remainder ( subtrahendRem ) ;^103^^^^^95^116^[REPLACE] long minuendRem = remainder ( minuendInstant ) ;^[METHOD] getDifferenceAsLong [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int difference  minuendWeekyear  subtrahendWeekyear 
[ADD]^^103^^^^^95^116^[ADD] long minuendRem = remainder ( minuendInstant ) ;^[METHOD] getDifferenceAsLong [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int difference  minuendWeekyear  subtrahendWeekyear 
[REPLACE]^long subtrahendRem = remainder ( value ) ;^104^^^^^95^116^[REPLACE] long subtrahendRem = remainder ( subtrahendInstant ) ;^[METHOD] getDifferenceAsLong [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int difference  minuendWeekyear  subtrahendWeekyear 
[REPLACE]^if  (  iChronology.getWeeksInYear ( minuendWeekyear )  <= 3 )  {^107^^^^^95^116^[REPLACE] if  ( subtrahendRem >= WEEK_53 && iChronology.getWeeksInYear ( minuendWeekyear )  <= 52 )  {^[METHOD] getDifferenceAsLong [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int difference  minuendWeekyear  subtrahendWeekyear 
[REPLACE]^workInstant += DateTimeConstants.MILLIS_PER_WEEK; ;^108^^^^^95^116^[REPLACE] subtrahendRem -= DateTimeConstants.MILLIS_PER_WEEK;^[METHOD] getDifferenceAsLong [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int difference  minuendWeekyear  subtrahendWeekyear 
[ADD]^^108^^^^^95^116^[ADD] subtrahendRem -= DateTimeConstants.MILLIS_PER_WEEK;^[METHOD] getDifferenceAsLong [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int difference  minuendWeekyear  subtrahendWeekyear 
[REPLACE]^int difference =difference - subtrahendWeekyear;^111^^^^^95^116^[REPLACE] int difference = minuendWeekyear - subtrahendWeekyear;^[METHOD] getDifferenceAsLong [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int difference  minuendWeekyear  subtrahendWeekyear 
[ADD]^^111^112^113^114^^95^116^[ADD] int difference = minuendWeekyear - subtrahendWeekyear; if  ( minuendRem < subtrahendRem )  { difference--; }^[METHOD] getDifferenceAsLong [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int difference  minuendWeekyear  subtrahendWeekyear 
[REPLACE]^if  ( value  <=  value )  {^112^^^^^95^116^[REPLACE] if  ( minuendRem < subtrahendRem )  {^[METHOD] getDifferenceAsLong [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int difference  minuendWeekyear  subtrahendWeekyear 
[REPLACE]^return subtrahendWeekyear;^115^^^^^95^116^[REPLACE] return difference;^[METHOD] getDifferenceAsLong [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int difference  minuendWeekyear  subtrahendWeekyear 
[REPLACE]^FieldUtils.verifyValueBounds ( this, Math.abs ( workWoyYear ) , iChronology.getMinYear (  ) , iChronology.getMaxYear (  )  ) ;^128^129^^^^127^205^[REPLACE] FieldUtils.verifyValueBounds ( this, Math.abs ( year ) , iChronology.getMinYear (  ) , iChronology.getMaxYear (  )  ) ;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^iChronology .getMaxYear (  )  , iChronology.getMaxYear (  )  ) ;^129^^^^^127^205^[REPLACE] iChronology.getMinYear (  ) , iChronology.getMaxYear (  )  ) ;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^iChronology.getMinYear (  ) , iChronology.getMinYear (  )  ) ;^129^^^^^127^205^[REPLACE] iChronology.getMinYear (  ) , iChronology.getMaxYear (  )  ) ;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^int thisWeekyear = get (  workInstant  ) ;^133^^^^^127^205^[REPLACE] int thisWeekyear = get (  instant  ) ;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^if  (  workWoyYear  &&  workWoyYear  )  {^134^^^^^127^205^[REPLACE] if  (  thisWeekyear == year  )  {^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^return subtrahendRem;^135^^^^^127^205^[REPLACE] return instant;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^return workInstant;^135^^^^^127^205^[REPLACE] return instant;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^int thisDow = iChronology .dayOfWeek (  )  ;^140^^^^^127^205^[REPLACE] int thisDow = iChronology.getDayOfWeek ( instant ) ;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^int weeksInFromYear = iChronology .getWeekyear ( WEEK_53 )  ;^144^^^^^127^205^[REPLACE] int weeksInFromYear = iChronology.getWeeksInYear (  thisWeekyear  ) ;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^int weeksInToYear = iChronology.getWeeksInYear (  workWoyYear  ) ;^145^^^^^127^205^[REPLACE] int weeksInToYear = iChronology.getWeeksInYear (  year  ) ;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[ADD]^^145^^^^^127^205^[ADD] int weeksInToYear = iChronology.getWeeksInYear (  year  ) ;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^int maxOutWeeks =  ( weeksInToYear  !=  weeksInFromYear )  ? weeksInToYear : weeksInFromYear;^146^147^^^^127^205^[REPLACE] int maxOutWeeks =  ( weeksInToYear < weeksInFromYear )  ? weeksInToYear : weeksInFromYear;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[ADD]^^146^147^^^^127^205^[ADD] int maxOutWeeks =  ( weeksInToYear < weeksInFromYear )  ? weeksInToYear : weeksInFromYear;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^int setToWeek = iChronology.getWeekOfWeekyear ( workInstant ) ;^154^^^^^127^205^[REPLACE] int setToWeek = iChronology.getWeekOfWeekyear ( instant ) ;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^if  (  setToWeek  !=  maxOutWeeks  )  {^155^^^^^127^205^[REPLACE] if  (  setToWeek > maxOutWeeks  )  {^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^setToWeek =  year;^156^^^^^127^205^[REPLACE] setToWeek = maxOutWeeks;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^long workInstant = workInstant;^162^^^^^127^205^[REPLACE] long workInstant = instant;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^workInstant =  iChronology.setYear (  subtrahendRem, year  ) ;^168^^^^^127^205^[REPLACE] workInstant = iChronology.setYear (  workInstant, year  ) ;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^int workWoyYear = get (  subtrahendRem  ) ;^173^^^^^127^205^[REPLACE] int workWoyYear = get (  workInstant  ) ;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^if  (  workWoyYear  == thisWeekweeksInToYear  )  {^179^^^^^127^205^[REPLACE] if  (  workWoyYear < year  )  {^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[ADD]^^179^180^181^182^183^127^205^[ADD] if  (  workWoyYear < year  )  { workInstant += DateTimeConstants.MILLIS_PER_WEEK; } else if  (  workWoyYear > year  )  { workInstant -= DateTimeConstants.MILLIS_PER_WEEK; }^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^}  if  (  weeksInToYear  != weeksInFromYear  )  {^181^^^^^127^205^[REPLACE] } else if  (  workWoyYear > year  )  {^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REMOVE]^if  ( wow > 1 )  {     instant -=  (  ( long )   ( MILLIS_PER_WEEK )  )  *  ( wow - 1 ) ; }^181^^^^^127^205^[REMOVE] ^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^subtrahendRem -= DateTimeConstants.MILLIS_PER_WEEK; ;^182^^^^^127^205^[REPLACE] workInstant -= DateTimeConstants.MILLIS_PER_WEEK;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[ADD]^^182^^^^^127^205^[ADD] workInstant -= DateTimeConstants.MILLIS_PER_WEEK;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^subtrahendRem -= DateTimeConstants.MILLIS_PER_WEEK; ;^180^^^^^127^205^[REPLACE] workInstant += DateTimeConstants.MILLIS_PER_WEEK;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[ADD]^^180^^^^^127^205^[ADD] workInstant += DateTimeConstants.MILLIS_PER_WEEK;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^}  if  (  weeksInToYear  <=  workWoyYear  )  {^181^^^^^127^205^[REPLACE] } else if  (  workWoyYear > year  )  {^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^int currentWoyWeek = iChronology.getWeekOfWeekyear ( subtrahendRem ) ;^189^^^^^127^205^[REPLACE] int currentWoyWeek = iChronology.getWeekOfWeekyear ( workInstant ) ;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^workInstant =subtrahendRem +  ( setToWeek - currentWoyWeek )^191^192^193^194^^127^205^[REPLACE] workInstant = workInstant +  ( setToWeek - currentWoyWeek )^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[ADD]^^191^192^193^^^127^205^[ADD] workInstant = workInstant +  ( setToWeek - currentWoyWeek )^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^workInstant =  iChronology.dayOfWeek (  ) .set (  subtrahendRem, thisDow  ) ;^200^^^^^127^205^[REPLACE] workInstant = iChronology.dayOfWeek (  ) .set (  workInstant, thisDow  ) ;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^return subtrahendRem;^204^^^^^127^205^[REPLACE] return workInstant;^[METHOD] set [TYPE] long [PARAMETER] long instant int year [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int currentWoyWeek  maxOutWeeks  setToWeek  thisDow  thisWeekyear  weeksInFromYear  weeksInToYear  workWoyYear  year 
[REPLACE]^return false;^208^^^^^207^209^[REPLACE] return null;^[METHOD] getRangeDurationField [TYPE] DurationField [PARAMETER] [CLASS] BasicWeekyearDateTimeField   [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^return iChronology.getWeeksInYear ( iChronology.getWeekyear ( instant )  )  - 52;^212^^^^^211^213^[REPLACE] return iChronology.getWeeksInYear ( iChronology.getWeekyear ( instant )  )  > 52;^[METHOD] isLeap [TYPE] boolean [PARAMETER] long instant [CLASS] BasicWeekyearDateTimeField   [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^return iChronology.getWeeksInYear ( iChronology.getWeekyear ( instant )  )  > 52;^216^^^^^215^217^[REPLACE] return iChronology.getWeeksInYear ( iChronology.getWeekyear ( instant )  )  - 52;^[METHOD] getLeapAmount [TYPE] int [PARAMETER] long instant [CLASS] BasicWeekyearDateTimeField   [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^return iChronology.weekyear (  ) ;^220^^^^^219^221^[REPLACE] return iChronology.weeks (  ) ;^[METHOD] getLeapDurationField [TYPE] DurationField [PARAMETER] [CLASS] BasicWeekyearDateTimeField   [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^return iChronology.getMaxYear (  ) ;^224^^^^^223^225^[REPLACE] return iChronology.getMinYear (  ) ;^[METHOD] getMinimumValue [TYPE] int [PARAMETER] [CLASS] BasicWeekyearDateTimeField   [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^return iChronology.getMinYear (  ) ;^228^^^^^227^229^[REPLACE] return iChronology.getMaxYear (  ) ;^[METHOD] getMaximumValue [TYPE] int [PARAMETER] [CLASS] BasicWeekyearDateTimeField   [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^instant =  iChronology.weekOfWeekyear (  ) .roundFloor ( workInstant ) ;^234^^^^^231^240^[REPLACE] instant = iChronology.weekOfWeekyear (  ) .roundFloor ( instant ) ;^[METHOD] roundFloor [TYPE] long [PARAMETER] long instant [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int wow 
[REPLACE]^int wow = iChronology.getWeekOfWeekyear ( workInstant ) ;^235^^^^^231^240^[REPLACE] int wow = iChronology.getWeekOfWeekyear ( instant ) ;^[METHOD] roundFloor [TYPE] long [PARAMETER] long instant [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int wow 
[REPLACE]^if  ( wow  !=  4 )  {^236^^^^^231^240^[REPLACE] if  ( wow > 1 )  {^[METHOD] roundFloor [TYPE] long [PARAMETER] long instant [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int wow 
[REMOVE]^if  ( workWoyYear > year )  {     workInstant -= MILLIS_PER_WEEK; }^236^^^^^231^240^[REMOVE] ^[METHOD] roundFloor [TYPE] long [PARAMETER] long instant [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int wow 
[REPLACE]^instant -=  (  ( long )  DateTimeConstants.MILLIS_PER_WEEK )   ;^237^^^^^231^240^[REPLACE] instant -=  (  ( long )  DateTimeConstants.MILLIS_PER_WEEK )  *  ( wow - 1 ) ;^[METHOD] roundFloor [TYPE] long [PARAMETER] long instant [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int wow 
[REPLACE]^return workInstant;^239^^^^^231^240^[REPLACE] return instant;^[METHOD] roundFloor [TYPE] long [PARAMETER] long instant [CLASS] BasicWeekyearDateTimeField   [TYPE]  boolean false  true  [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  int wow 
[REPLACE]^return instant  |  roundFloor ( instant ) ;^243^^^^^242^244^[REPLACE] return instant - roundFloor ( instant ) ;^[METHOD] remainder [TYPE] long [PARAMETER] long instant [CLASS] BasicWeekyearDateTimeField   [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
[REPLACE]^return iChronology.weeks (  ) ;^250^^^^^249^251^[REPLACE] return iChronology.weekyear (  ) ;^[METHOD] readResolve [TYPE] Object [PARAMETER] [CLASS] BasicWeekyearDateTimeField   [TYPE]  long WEEK_53  instant  minuendInstant  minuendRem  serialVersionUID  subtrahendInstant  subtrahendRem  value  workInstant  [TYPE]  BasicChronology chronology  iChronology  [TYPE]  boolean false  true 
