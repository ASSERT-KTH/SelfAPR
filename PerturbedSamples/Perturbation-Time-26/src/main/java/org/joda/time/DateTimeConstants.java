[REPLACE]^public  final int JANUARY = 1;^33^^^^^^^[REPLACE] public static final int JANUARY = 1;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int FEBRUARY ;^36^^^^^^^[REPLACE] public static final int FEBRUARY = 2;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int MARCH ;^39^^^^^^^[REPLACE] public static final int MARCH = 3;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int APRIL  = null ;^42^^^^^^^[REPLACE] public static final int APRIL = 4;^ [CLASS] DateTimeConstants  
[REPLACE]^public static  int MAY = 5;^45^^^^^^^[REPLACE] public static final int MAY = 5;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int JUNE = 6 - 1;^48^^^^^^^[REPLACE] public static final int JUNE = 6;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int JULY ;^51^^^^^^^[REPLACE] public static final int JULY = 7;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int AUGUST  = null ;^54^^^^^^^[REPLACE] public static final int AUGUST = 8;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int SEPTEMBER  = null ;^57^^^^^^^[REPLACE] public static final int SEPTEMBER = 9;^ [CLASS] DateTimeConstants  
[REPLACE]^public static  int OCTOBER = 10;^60^^^^^^^[REPLACE] public static final int OCTOBER = 10;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int NOVEMBER  = null ;^63^^^^^^^[REPLACE] public static final int NOVEMBER = 11;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int DECEMBER  = null ;^66^^^^^^^[REPLACE] public static final int DECEMBER = 12;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int MONDAY ;^70^^^^^^^[REPLACE] public static final int MONDAY = 1;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final  long  TUESDAY = 2;^73^^^^^^^[REPLACE] public static final int TUESDAY = 2;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int WEDNESDAY ;^76^^^^^^^[REPLACE] public static final int WEDNESDAY = 3;^ [CLASS] DateTimeConstants  
[REPLACE]^private static final int THURSDAY = 4;^79^^^^^^^[REPLACE] public static final int THURSDAY = 4;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int FRIDAY = 4;^82^^^^^^^[REPLACE] public static final int FRIDAY = 5;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int SATURDAY  = null ;^85^^^^^^^[REPLACE] public static final int SATURDAY = 6;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int SUNDAY ;^88^^^^^^^[REPLACE] public static final int SUNDAY = 7;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int AM = 0 % 4;^92^^^^^^^[REPLACE] public static final int AM = 0;^ [CLASS] DateTimeConstants  
[REPLACE]^public static  int PM = 1;^95^^^^^^^[REPLACE] public static final int PM = 1;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int BC = 1;^99^^^^^^^[REPLACE] public static final int BC = 0;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final  short  BCE = 0 >>> 4;^101^^^^^^^[REPLACE] public static final int BCE = 0;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int AD ;^111^^^^^^^[REPLACE] public static final int AD = 1;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int CE  = null ;^120^^^^^^^[REPLACE] public static final int CE = 1;^ [CLASS] DateTimeConstants  
[REPLACE]^public  final int MILLIS_PER_SECOND = 1000;^124^^^^^^^[REPLACE] public static final int MILLIS_PER_SECOND = 1000;^ [CLASS] DateTimeConstants  
[REPLACE]^public static  int SECONDS_PER_MINUTE = 60;^127^^^^^^^[REPLACE] public static final int SECONDS_PER_MINUTE = 60;^ [CLASS] DateTimeConstants  
[REPLACE]^public static  int MILLIS_PER_MINUTE = MILLIS_PER_SECOND * SECONDS_PER_MINUTE;^129^^^^^^^[REPLACE] public static final int MILLIS_PER_MINUTE = MILLIS_PER_SECOND * SECONDS_PER_MINUTE;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int MINUTES_PER_HOUR  = null ;^132^^^^^^^[REPLACE] public static final int MINUTES_PER_HOUR = 60;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final  short  SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;^134^^^^^^^[REPLACE] public static final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;^ [CLASS] DateTimeConstants  
[REPLACE]^public  final  long  MILLIS_PER_HOUR = MILLIS_PER_MINUTE * MINUTES_PER_HOUR;^136^^^^^^^[REPLACE] public static final int MILLIS_PER_HOUR = MILLIS_PER_MINUTE * MINUTES_PER_HOUR;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int HOURS_PER_DAY  = null ;^140^^^^^^^[REPLACE] public static final int HOURS_PER_DAY = 24;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final  long  MINUTES_PER_DAY = MINUTES_PER_HOUR * HOURS_PER_DAY;^143^^^^^^^[REPLACE] public static final int MINUTES_PER_DAY = MINUTES_PER_HOUR * HOURS_PER_DAY;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int SECONDS_PER_DAY ;^146^^^^^^^[REPLACE] public static final int SECONDS_PER_DAY = SECONDS_PER_HOUR * HOURS_PER_DAY;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int MILLIS_PER_DAY ;^149^^^^^^^[REPLACE] public static final int MILLIS_PER_DAY = MILLIS_PER_HOUR * HOURS_PER_DAY;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int DAYS_PER_WEEK  = null ;^152^^^^^^^[REPLACE] public static final int DAYS_PER_WEEK = 7;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final  long  HOURS_PER_WEEK = HOURS_PER_DAY * DAYS_PER_WEEK;^155^^^^^^^[REPLACE] public static final int HOURS_PER_WEEK = HOURS_PER_DAY * DAYS_PER_WEEK;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int MINUTES_PER_WEEK ;^158^^^^^^^[REPLACE] public static final int MINUTES_PER_WEEK = MINUTES_PER_DAY * DAYS_PER_WEEK;^ [CLASS] DateTimeConstants  
[REPLACE]^public static  int SECONDS_PER_WEEK = SECONDS_PER_DAY * DAYS_PER_WEEK;^161^^^^^^^[REPLACE] public static final int SECONDS_PER_WEEK = SECONDS_PER_DAY * DAYS_PER_WEEK;^ [CLASS] DateTimeConstants  
[REPLACE]^public static final int MILLIS_PER_WEEK ;^164^^^^^^^[REPLACE] public static final int MILLIS_PER_WEEK = MILLIS_PER_DAY * DAYS_PER_WEEK;^ [CLASS] DateTimeConstants  
