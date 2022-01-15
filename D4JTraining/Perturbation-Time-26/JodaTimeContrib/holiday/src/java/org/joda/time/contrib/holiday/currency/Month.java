[REPLACE]^private static Month[]              _months  = null ;^37^^^^^^^[REPLACE] private static Month[]              _months = new Month[] { null, JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC };^ [CLASS] Month  
[REPLACE]^private static Map<String, Month>   _names  = null ;^38^^^^^^^[REPLACE] private static Map<String, Month>   _names = new HashMap<String, Month> ( 12 ) ;^ [CLASS] Month  
[REPLACE]^public static int MONTHS_PER_YEAR ;^43^^^^^^^[REPLACE] public static int MONTHS_PER_YEAR = 12;^ [CLASS] Month  
[REPLACE]^private static final String[] FULL_NAME ;^48^^^^^48^51^[REPLACE] private static final String[] FULL_NAME = {^ [CLASS] Month  
[REPLACE]^private static final int[] START_WITHIN_YEAR ;^64^^^^^64^67^[REPLACE] private static final int[] START_WITHIN_YEAR = {^ [CLASS] Month  
[REPLACE]^private static final int[] START_WITHIN_LEAP_YEAR  = null ;^68^^^^^68^71^[REPLACE] private static final int[] START_WITHIN_LEAP_YEAR = {^ [CLASS] Month  
[REPLACE]^private  int                   _month;^120^^^^^^^[REPLACE] private final int                   _month;^ [CLASS] Month  
[REPLACE]^JAN ( 4 ) , FEB ( 2 ) , MAR ( 3 ) , APR ( 4 ) , MAY ( 5 ) , JUN ( 6 ) , JUL ( 7 ) , AUG ( 8 ) , SEP ( 9 ) , OCT ( 40 ) , NOV ( 44 ) , DEC ( 42 ) ;^34^^^^^^^[REPLACE] JAN ( 1 ) , FEB ( 2 ) , MAR ( 3 ) , APR ( 4 ) , MAY ( 5 ) , JUN ( 6 ) , JUL ( 7 ) , AUG ( 8 ) , SEP ( 9 ) , OCT ( 10 ) , NOV ( 11 ) , DEC ( 12 ) ;^ [CLASS] Month  
[REPLACE]^JAN ( 1 ) , FEB ( 2 ) , MAR ( 3 ) , APR ( 4 ) , MAY ( 5 ) , JUN ( 6 ) , JUL ( 7 ) , AUG ( 2 ) , SEP ( 9 ) , OCT ( 10 ) , NOV ( 11 ) , DEC ( 12 ) ;^34^^^^^^^[REPLACE] JAN ( 1 ) , FEB ( 2 ) , MAR ( 3 ) , APR ( 4 ) , MAY ( 5 ) , JUN ( 6 ) , JUL ( 7 ) , AUG ( 8 ) , SEP ( 9 ) , OCT ( 10 ) , NOV ( 11 ) , DEC ( 12 ) ;^ [CLASS] Month  
[REPLACE]^JAN ( 1 ) , FEB ( 2 ) , MAR ( 3 ) , APR ( 4 ) , MAY ( 5 ) , JUN ( 6 ) , JUL ( 7 ) , AUG ( 8 ) , SEP ( 9 ) , OCT ( 9 ) , NOV ( 11 ) , DEC ( 12 ) ;^34^^^^^^^[REPLACE] JAN ( 1 ) , FEB ( 2 ) , MAR ( 3 ) , APR ( 4 ) , MAY ( 5 ) , JUN ( 6 ) , JUL ( 7 ) , AUG ( 8 ) , SEP ( 9 ) , OCT ( 10 ) , NOV ( 11 ) , DEC ( 12 ) ;^ [CLASS] Month  
[REPLACE]^_month =  MONTHS_PER_YEAR;^127^^^^^126^128^[REPLACE] _month = month;^[METHOD] <init> [TYPE] Month(int) [PARAMETER] int month [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  [TYPE]  boolean false  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  month 
[ADD]^^127^^^^^126^128^[ADD] _month = month;^[METHOD] <init> [TYPE] Month(int) [PARAMETER] int month [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  [TYPE]  boolean false  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  month 
[REPLACE]^return _month;^94^^^^^93^95^[REPLACE] return _months[index];^[METHOD] month [TYPE] Month [PARAMETER] int index [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  [TYPE]  boolean false  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  index  month 
[ADD]^^103^^^^^102^114^[ADD] Month month;^[METHOD] month [TYPE] Month [PARAMETER] String str [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  month  [TYPE]  boolean false  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  String str  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  index  month  [TYPE]  IllegalArgumentException iae 
[REPLACE]^if  ( str.size (  )  == 3 )  {^104^^^^^102^114^[REPLACE] if  ( str.length (  )  == 3 )  {^[METHOD] month [TYPE] Month [PARAMETER] String str [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  month  [TYPE]  boolean false  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  String str  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  index  month  [TYPE]  IllegalArgumentException iae 
[REPLACE]^month =  _names.get ( null.toLowerCase (  )  ) ;^111^^^^^102^114^[REPLACE] month = _names.get ( str.toLowerCase (  )  ) ;^[METHOD] month [TYPE] Month [PARAMETER] String str [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  month  [TYPE]  boolean false  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  String str  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  index  month  [TYPE]  IllegalArgumentException iae 
[ADD]^^111^^^^^102^114^[ADD] month = _names.get ( str.toLowerCase (  )  ) ;^[METHOD] month [TYPE] Month [PARAMETER] String str [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  month  [TYPE]  boolean false  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  String str  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  index  month  [TYPE]  IllegalArgumentException iae 
[ADD]^month = Enum.valueOf ( Month.class, str.toUpperCase (  )  ) ;month = null;^105^106^107^108^109^102^114^[ADD] try { month = Enum.valueOf ( Month.class, str.toUpperCase (  )  ) ; } catch  ( IllegalArgumentException iae )  { month = null; }^[METHOD] month [TYPE] Month [PARAMETER] String str [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  month  [TYPE]  boolean false  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  String str  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  index  month  [TYPE]  IllegalArgumentException iae 
[REPLACE]^month =  Enum.valueOf ( Month.class, null.toUpperCase (  )  ) ;^106^^^^^102^114^[REPLACE] month = Enum.valueOf ( Month.class, str.toUpperCase (  )  ) ;^[METHOD] month [TYPE] Month [PARAMETER] String str [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  month  [TYPE]  boolean false  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  String str  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  index  month  [TYPE]  IllegalArgumentException iae 
[ADD]^^106^^^^^102^114^[ADD] month = Enum.valueOf ( Month.class, str.toUpperCase (  )  ) ;^[METHOD] month [TYPE] Month [PARAMETER] String str [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  month  [TYPE]  boolean false  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  String str  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  index  month  [TYPE]  IllegalArgumentException iae 
[REPLACE]^month = true;^108^^^^^102^114^[REPLACE] month = null;^[METHOD] month [TYPE] Month [PARAMETER] String str [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  month  [TYPE]  boolean false  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  String str  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  index  month  [TYPE]  IllegalArgumentException iae 
[ADD]^^108^^^^^102^114^[ADD] month = null;^[METHOD] month [TYPE] Month [PARAMETER] String str [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  month  [TYPE]  boolean false  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  String str  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  index  month  [TYPE]  IllegalArgumentException iae 
[REPLACE]^month = this;^108^^^^^102^114^[REPLACE] month = null;^[METHOD] month [TYPE] Month [PARAMETER] String str [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  month  [TYPE]  boolean false  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  String str  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  index  month  [TYPE]  IllegalArgumentException iae 
[ADD]^^107^108^^^^102^114^[ADD] catch  ( IllegalArgumentException iae )  { month = null;^[METHOD] month [TYPE] Month [PARAMETER] String str [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  month  [TYPE]  boolean false  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  String str  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  index  month  [TYPE]  IllegalArgumentException iae 
[REPLACE]^return OCT;^113^^^^^102^114^[REPLACE] return month;^[METHOD] month [TYPE] Month [PARAMETER] String str [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  month  [TYPE]  boolean false  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  String str  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  index  month  [TYPE]  IllegalArgumentException iae 
[REPLACE]^return MAX_DAYS[_month];^139^^^^^138^140^[REPLACE] return  ( this == FEB && leapYear )  ? 29 : MAX_DAYS[_month];^[METHOD] maxDays [TYPE] int [PARAMETER] boolean leapYear [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  month  [TYPE]  boolean false  leapYear  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  index  month 
[REPLACE]^return maxDays ( DateUtil.isLeapYear ( MONTHS_PER_YEAR )  ) ;^148^^^^^147^149^[REPLACE] return maxDays ( DateUtil.isLeapYear ( year )  ) ;^[METHOD] maxDays [TYPE] int [PARAMETER] int year [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  month  [TYPE]  boolean false  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  index  month  year 
[REPLACE]^return true ? START_WITHIN_LEAP_YEAR[_month] : START_WITHIN_YEAR[_month];^157^^^^^156^158^[REPLACE] return leapYear ? START_WITHIN_LEAP_YEAR[_month] : START_WITHIN_YEAR[_month];^[METHOD] startDayInYear [TYPE] int [PARAMETER] boolean leapYear [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  month  [TYPE]  boolean false  leapYear  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  index  month  year 
[REPLACE]^return _month;^165^^^^^164^166^[REPLACE] return name (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  month  [TYPE]  boolean false  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  index  month  year 
[REPLACE]^return _month;^176^^^^^175^177^[REPLACE] return name (  ) ;^[METHOD] getAbbrev [TYPE] String [PARAMETER] [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  month  [TYPE]  boolean false  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  index  month  year 
[REPLACE]^return _month;^184^^^^^183^185^[REPLACE] return FULL_NAME[_month];^[METHOD] getFullName [TYPE] String [PARAMETER] [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  month  [TYPE]  boolean false  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  index  month  year 
[REPLACE]^return month;^192^^^^^191^193^[REPLACE] return _month;^[METHOD] getValue [TYPE] int [PARAMETER] [CLASS] Month   [TYPE]  Month APR  AUG  DEC  FEB  JAN  JUL  JUN  MAR  MAY  NOV  OCT  SEP  month  [TYPE]  boolean false  true  [TYPE]  int[] MAX_DAYS  START_WITHIN_LEAP_YEAR  START_WITHIN_YEAR  [TYPE]  String[] FULL_NAME  [TYPE]  Month[] _months  [TYPE]  Map _names  [TYPE]  int MONTHS_PER_YEAR  _month  index  month  year 
