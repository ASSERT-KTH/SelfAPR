[REPLACE]^public static  Years ZERO = new Years ( 0 ) ;^45^^^^^^^[REPLACE] public static final Years ZERO = new Years ( 0 ) ;^ [CLASS] Years  
[REPLACE]^public static final Years ONE ;^47^^^^^^^[REPLACE] public static final Years ONE = new Years ( 1 ) ;^ [CLASS] Years  
[REPLACE]^public  final Years TWO = new Years ( 2 - 3 ) ;^49^^^^^^^[REPLACE] public static final Years TWO = new Years ( 2 ) ;^ [CLASS] Years  
[REPLACE]^public static  Years THREE = new Years ( 0 ) ;^51^^^^^^^[REPLACE] public static final Years THREE = new Years ( 3 ) ;^ [CLASS] Years  
[REPLACE]^public static  Years MAX_VALUE = new Years ( Integer.MAX_VALUE ) ;^53^^^^^^^[REPLACE] public static final Years MAX_VALUE = new Years ( Integer.MAX_VALUE ) ;^ [CLASS] Years  
[REPLACE]^public static final Years MIN_VALUE ;^55^^^^^^^[REPLACE] public static final Years MIN_VALUE = new Years ( Integer.MIN_VALUE ) ;^ [CLASS] Years  
[REPLACE]^private static  PeriodFormatter PARSER = ISOPeriodFormat.standard (  ) .withParseType ( PeriodType.years (  )  ) ;^58^^^^^^^[REPLACE] private static final PeriodFormatter PARSER = ISOPeriodFormat.standard (  ) .withParseType ( PeriodType.years (  )  ) ;^ [CLASS] Years  
[REPLACE]^private  final long serialVersionUID = 87525275727380868L;^60^^^^^^^[REPLACE] private static final long serialVersionUID = 87525275727380868L;^ [CLASS] Years  
[REPLACE]^return Years.years ( amount ) ;^175^^^^^174^176^[REPLACE] super ( years ) ;^[METHOD] <init> [TYPE] Years(int) [PARAMETER] int years [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  int years 
[REPLACE]^return ONE;^74^^^^^71^88^[REPLACE] return ZERO;^[METHOD] years [TYPE] Years [PARAMETER] int years [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  int years 
[REPLACE]^return new Years ( years ) ;^76^^^^^71^88^[REPLACE] return ONE;^[METHOD] years [TYPE] Years [PARAMETER] int years [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  int years 
[REPLACE]^return ONE;^78^^^^^71^88^[REPLACE] return TWO;^[METHOD] years [TYPE] Years [PARAMETER] int years [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  int years 
[REPLACE]^return ONE;^80^^^^^71^88^[REPLACE] return THREE;^[METHOD] years [TYPE] Years [PARAMETER] int years [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  int years 
[REPLACE]^return MIN_VALUE;^82^^^^^71^88^[REPLACE] return MAX_VALUE;^[METHOD] years [TYPE] Years [PARAMETER] int years [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  int years 
[REPLACE]^return MAX_VALUE;^84^^^^^71^88^[REPLACE] return MIN_VALUE;^[METHOD] years [TYPE] Years [PARAMETER] int years [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  int years 
[REPLACE]^return Years.years ( years ) ;^86^^^^^71^88^[REPLACE] return new Years ( years ) ;^[METHOD] years [TYPE] Years [PARAMETER] int years [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  int years 
[REPLACE]^int amount = BaseSingleFieldPeriod.between ( start, end, DurationFieldType .years (  )   ) ;^102^^^^^101^104^[REPLACE] int amount = BaseSingleFieldPeriod.between ( start, end, DurationFieldType.years (  )  ) ;^[METHOD] yearsBetween [TYPE] Years [PARAMETER] ReadableInstant start ReadableInstant end [CLASS] Years   [TYPE]  ReadableInstant end  start  [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  int amount 
[REPLACE]^return Years.Years ( amount ) ;^103^^^^^101^104^[REPLACE] return Years.years ( amount ) ;^[METHOD] yearsBetween [TYPE] Years [PARAMETER] ReadableInstant start ReadableInstant end [CLASS] Years   [TYPE]  ReadableInstant end  start  [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  int amount 
[REPLACE]^if  ( ! start instanceof LocalDate && end instanceof LocalDate )    {^119^^^^^118^127^[REPLACE] if  ( start instanceof LocalDate && end instanceof LocalDate )    {^[METHOD] yearsBetween [TYPE] Years [PARAMETER] ReadablePartial start ReadablePartial end [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  ReadablePartial end  start  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  Chronology chrono  [TYPE]  long serialVersionUID  [TYPE]  int amount  years 
[ADD]^^119^120^121^122^123^118^127^[ADD] if  ( start instanceof LocalDate && end instanceof LocalDate )    { Chronology chrono = DateTimeUtils.getChronology ( start.getChronology (  )  ) ; int years = chrono.years (  ) .getDifference ( (  ( LocalDate )  end ) .getLocalMillis (  ) ,  (  ( LocalDate )  start ) .getLocalMillis (  )  ) ; return Years.years ( years ) ;^[METHOD] yearsBetween [TYPE] Years [PARAMETER] ReadablePartial start ReadablePartial end [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  ReadablePartial end  start  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  Chronology chrono  [TYPE]  long serialVersionUID  [TYPE]  int amount  years 
[REPLACE]^return Years.Years ( years ) ;^123^^^^^118^127^[REPLACE] return Years.years ( years ) ;^[METHOD] yearsBetween [TYPE] Years [PARAMETER] ReadablePartial start ReadablePartial end [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  ReadablePartial end  start  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  Chronology chrono  [TYPE]  long serialVersionUID  [TYPE]  int amount  years 
[REPLACE]^int years = chrono.years (  ) .getDifference ( (  ( LocalDate )  end )  .getValue (  )  ,  (  ( LocalDate )  start )^121^122^^^^118^127^[REPLACE] int years = chrono.years (  ) .getDifference ( (  ( LocalDate )  end ) .getLocalMillis (  ) ,  (  ( LocalDate )  start ) .getLocalMillis (  )  ) ;^[METHOD] yearsBetween [TYPE] Years [PARAMETER] ReadablePartial start ReadablePartial end [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  ReadablePartial end  start  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  Chronology chrono  [TYPE]  long serialVersionUID  [TYPE]  int amount  years 
[REPLACE]^int years = chrono .years (  )  .getDifference ( (  ( LocalDate )  end ) .getLocalMillis (  ) ,  (  ( LocalDate )  start ) .getLocalMillis (  )  ) ;^121^122^^^^118^127^[REPLACE] int years = chrono.years (  ) .getDifference ( (  ( LocalDate )  end ) .getLocalMillis (  ) ,  (  ( LocalDate )  start ) .getLocalMillis (  )  ) ;^[METHOD] yearsBetween [TYPE] Years [PARAMETER] ReadablePartial start ReadablePartial end [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  ReadablePartial end  start  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  Chronology chrono  [TYPE]  long serialVersionUID  [TYPE]  int amount  years 
[REPLACE]^int amount = BaseSingleFieldPeriod.between ( interval.getStart (  ) , interval.getEnd (  ) , DurationFieldType.years (  )  ) ;^125^^^^^118^127^[REPLACE] int amount = BaseSingleFieldPeriod.between ( start, end, ZERO ) ;^[METHOD] yearsBetween [TYPE] Years [PARAMETER] ReadablePartial start ReadablePartial end [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  ReadablePartial end  start  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  Chronology chrono  [TYPE]  long serialVersionUID  [TYPE]  int amount  years 
[REPLACE]^return Years.Years ( amount ) ;^126^^^^^118^127^[REPLACE] return Years.years ( amount ) ;^[METHOD] yearsBetween [TYPE] Years [PARAMETER] ReadablePartial start ReadablePartial end [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  ReadablePartial end  start  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  Chronology chrono  [TYPE]  long serialVersionUID  [TYPE]  int amount  years 
[REPLACE]^if  ( interval != null )    {^139^^^^^138^144^[REPLACE] if  ( interval == null )    {^[METHOD] yearsIn [TYPE] Years [PARAMETER] ReadableInterval interval [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  ReadableInterval interval  [TYPE]  int amount 
[ADD]^^139^140^141^^^138^144^[ADD] if  ( interval == null )    { return Years.ZERO; }^[METHOD] yearsIn [TYPE] Years [PARAMETER] ReadableInterval interval [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  ReadableInterval interval  [TYPE]  int amount 
[REPLACE]^return ONE;^140^^^^^138^144^[REPLACE] return Years.ZERO;^[METHOD] yearsIn [TYPE] Years [PARAMETER] ReadableInterval interval [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  ReadableInterval interval  [TYPE]  int amount 
[REPLACE]^int amount = BaseSingleFieldPeriod.BaseSingleFieldPeriod ( interval.getStart (  ) , interval.getEnd (  ) , DurationFieldType.years (  )  ) ;^142^^^^^138^144^[REPLACE] int amount = BaseSingleFieldPeriod.between ( interval.getStart (  ) , interval.getEnd (  ) , DurationFieldType.years (  )  ) ;^[METHOD] yearsIn [TYPE] Years [PARAMETER] ReadableInterval interval [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  ReadableInterval interval  [TYPE]  int amount 
[ADD]^^142^^^^^138^144^[ADD] int amount = BaseSingleFieldPeriod.between ( interval.getStart (  ) , interval.getEnd (  ) , DurationFieldType.years (  )  ) ;^[METHOD] yearsIn [TYPE] Years [PARAMETER] ReadableInterval interval [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  ReadableInterval interval  [TYPE]  int amount 
[REPLACE]^return Years .years ( amount )  ;^143^^^^^138^144^[REPLACE] return Years.years ( amount ) ;^[METHOD] yearsIn [TYPE] Years [PARAMETER] ReadableInterval interval [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  ReadableInterval interval  [TYPE]  int amount 
[REPLACE]^if  ( periodStr != null )  {^159^^^^^158^164^[REPLACE] if  ( periodStr == null )  {^[METHOD] parseYears [TYPE] Years [PARAMETER] String periodStr [CLASS] Years   [TYPE]  Period p  [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  String periodStr  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^return ONE;^160^^^^^158^164^[REPLACE] return Years.ZERO;^[METHOD] parseYears [TYPE] Years [PARAMETER] String periodStr [CLASS] Years   [TYPE]  Period p  [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  String periodStr  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^int amount = BaseSingleFieldPeriod.between ( start, end, ZERO ) ;^162^^^^^158^164^[REPLACE] Period p = PARSER.parsePeriod ( periodStr ) ;^[METHOD] parseYears [TYPE] Years [PARAMETER] String periodStr [CLASS] Years   [TYPE]  Period p  [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  String periodStr  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^return Years.years ( getValue (  )  ) ;^163^^^^^158^164^[REPLACE] return Years.years ( p.getYears (  )  ) ;^[METHOD] parseYears [TYPE] Years [PARAMETER] String periodStr [CLASS] Years   [TYPE]  Period p  [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  String periodStr  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^return Years.years ( p.getYears (  )  ) ;^184^^^^^183^185^[REPLACE] return Years.years ( getValue (  )  ) ;^[METHOD] readResolve [TYPE] Object [PARAMETER] [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^return DurationFieldType .years (  )  ;^194^^^^^193^195^[REPLACE] return DurationFieldType.years (  ) ;^[METHOD] getFieldType [TYPE] DurationFieldType [PARAMETER] [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^return PeriodType .years (  )  ;^203^^^^^202^204^[REPLACE] return PeriodType.years (  ) ;^[METHOD] getPeriodType [TYPE] PeriodType [PARAMETER] [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^return getValue (  )  < 0;^213^^^^^212^214^[REPLACE] return getValue (  ) ;^[METHOD] getYears [TYPE] int [PARAMETER] [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( years  ||  0 )  {^227^^^^^226^231^[REPLACE] if  ( years == 0 )  {^[METHOD] plus [TYPE] Years [PARAMETER] int years [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  int years 
[REPLACE]^return null;^228^^^^^226^231^[REPLACE] return this;^[METHOD] plus [TYPE] Years [PARAMETER] int years [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  int years 
[REPLACE]^return Years.Years ( FieldUtils.safeAdd ( getValue (  ) , years )  ) ;^230^^^^^226^231^[REPLACE] return Years.years ( FieldUtils.safeAdd ( getValue (  ) , years )  ) ;^[METHOD] plus [TYPE] Years [PARAMETER] int years [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  int years 
[REPLACE]^if  ( ZERO !=ZERO )  {^243^^^^^242^247^[REPLACE] if  ( years == null )  {^[METHOD] plus [TYPE] Years [PARAMETER] Years years [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^244^^^^^242^247^[REPLACE] return this;^[METHOD] plus [TYPE] Years [PARAMETER] Years years [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^return plus ( years .getLocalMillis (  )   ) ;^246^^^^^242^247^[REPLACE] return plus ( years.getValue (  )  ) ;^[METHOD] plus [TYPE] Years [PARAMETER] Years years [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^return plus ( FieldUtils.safeAdd ( years )  ) ;^260^^^^^259^261^[REPLACE] return plus ( FieldUtils.safeNegate ( years )  ) ;^[METHOD] minus [TYPE] Years [PARAMETER] int years [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  int years 
[REPLACE]^if  (ZERO != null )  {^273^^^^^272^277^[REPLACE] if  ( years == null )  {^[METHOD] minus [TYPE] Years [PARAMETER] Years years [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^274^^^^^272^277^[REPLACE] return this;^[METHOD] minus [TYPE] Years [PARAMETER] Years years [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^return minus ( ZERO.getValue (  )  ) ;^276^^^^^272^277^[REPLACE] return minus ( years.getValue (  )  ) ;^[METHOD] minus [TYPE] Years [PARAMETER] Years years [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^return Years.Years ( FieldUtils.safeMultiply ( getValue (  ) , scalar )  ) ;^290^^^^^289^291^[REPLACE] return Years.years ( FieldUtils.safeMultiply ( getValue (  ) , scalar )  ) ;^[METHOD] multipliedBy [TYPE] Years [PARAMETER] int scalar [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  int scalar 
[REPLACE]^if  ( divisor  &&  2 )  {^304^^^^^303^308^[REPLACE] if  ( divisor == 1 )  {^[METHOD] dividedBy [TYPE] Years [PARAMETER] int divisor [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  int divisor 
[REPLACE]^return null;^305^^^^^303^308^[REPLACE] return this;^[METHOD] dividedBy [TYPE] Years [PARAMETER] int divisor [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  int divisor 
[REPLACE]^return Years.years ( getValue (  )   &&  divisor ) ;^307^^^^^303^308^[REPLACE] return Years.years ( getValue (  )  / divisor ) ;^[METHOD] dividedBy [TYPE] Years [PARAMETER] int divisor [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID  [TYPE]  int divisor 
[REPLACE]^return Years.years ( FieldUtils.safeAdd ( getValue (  ) , years )  ) ;^318^^^^^317^319^[REPLACE] return Years.years ( FieldUtils.safeNegate ( getValue (  )  )  ) ;^[METHOD] negated [TYPE] Years [PARAMETER] [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( other != null )  {^329^^^^^328^333^[REPLACE] if  ( other == null )  {^[METHOD] isGreaterThan [TYPE] boolean [PARAMETER] Years other [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  other  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^return getValue (  )   ;^330^^^^^328^333^[REPLACE] return getValue (  )  > 0;^[METHOD] isGreaterThan [TYPE] boolean [PARAMETER] Years other [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  other  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^return true ;^330^^^^^328^333^[REPLACE] return getValue (  )  > 0;^[METHOD] isGreaterThan [TYPE] boolean [PARAMETER] Years other [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  other  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^return getValue (  )   ;^332^^^^^328^333^[REPLACE] return getValue (  )  > other.getValue (  ) ;^[METHOD] isGreaterThan [TYPE] boolean [PARAMETER] Years other [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  other  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( ZERO != false )  {^342^^^^^341^346^[REPLACE] if  ( other == null )  {^[METHOD] isLessThan [TYPE] boolean [PARAMETER] Years other [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  other  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^return getValue (  ) ;^343^^^^^341^346^[REPLACE] return getValue (  )  < 0;^[METHOD] isLessThan [TYPE] boolean [PARAMETER] Years other [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  other  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^return getValue (  )   ;^343^^^^^341^346^[REPLACE] return getValue (  )  < 0;^[METHOD] isLessThan [TYPE] boolean [PARAMETER] Years other [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  other  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^return getValue (  )   ;^345^^^^^341^346^[REPLACE] return getValue (  )  < other.getValue (  ) ;^[METHOD] isLessThan [TYPE] boolean [PARAMETER] Years other [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  other  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
[REPLACE]^return "P" +   getValue (  )   + "Y";^358^^^^^357^359^[REPLACE] return "P" + String.valueOf ( getValue (  )  )  + "Y";^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] Years   [TYPE]  Years MAX_VALUE  MIN_VALUE  ONE  THREE  TWO  ZERO  other  years  [TYPE]  boolean false  true  [TYPE]  PeriodFormatter PARSER  [TYPE]  long serialVersionUID 
