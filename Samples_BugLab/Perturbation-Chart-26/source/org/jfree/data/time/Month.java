[buglab_swap_variables]^if  ( MonthConstants.JANUARY != this.month )  {^230^^^^^228^242^if  ( this.month != MonthConstants.JANUARY )  {^[CLASS] Month  [METHOD] previous [RETURN_TYPE] RegularTimePeriod   [VARIABLES] Month  result  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  year  
[buglab_swap_variables]^result = new Month ( this.year, MonthConstants.DECEMBER - 1 ) ;^235^^^^^228^242^result = new Month ( MonthConstants.DECEMBER, this.year - 1 ) ;^[CLASS] Month  [METHOD] previous [RETURN_TYPE] RegularTimePeriod   [VARIABLES] Month  result  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  year  
[buglab_swap_variables]^result = new Month (  this.year - 1 ) ;^235^^^^^228^242^result = new Month ( MonthConstants.DECEMBER, this.year - 1 ) ;^[CLASS] Month  [METHOD] previous [RETURN_TYPE] RegularTimePeriod   [VARIABLES] Month  result  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  year  
[buglab_swap_variables]^result = new Month ( MonthConstants.DECEMBER - 1 ) ;^235^^^^^228^242^result = new Month ( MonthConstants.DECEMBER, this.year - 1 ) ;^[CLASS] Month  [METHOD] previous [RETURN_TYPE] RegularTimePeriod   [VARIABLES] Month  result  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  year  
[buglab_swap_variables]^result = new Month ( this.year - 1, this.month ) ;^231^^^^^228^242^result = new Month ( this.month - 1, this.year ) ;^[CLASS] Month  [METHOD] previous [RETURN_TYPE] RegularTimePeriod   [VARIABLES] Month  result  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  year  
[buglab_swap_variables]^result = new Month ( this.month - 1 ) ;^231^^^^^228^242^result = new Month ( this.month - 1, this.year ) ;^[CLASS] Month  [METHOD] previous [RETURN_TYPE] RegularTimePeriod   [VARIABLES] Month  result  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  year  
[buglab_swap_variables]^if  ( MonthConstants.DECEMBER != this.month )  {^251^^^^^249^263^if  ( this.month != MonthConstants.DECEMBER )  {^[CLASS] Month  [METHOD] next [RETURN_TYPE] RegularTimePeriod   [VARIABLES] Month  result  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  year  
[buglab_swap_variables]^result = new Month ( this.year, MonthConstants.JANUARY + 1 ) ;^256^^^^^249^263^result = new Month ( MonthConstants.JANUARY, this.year + 1 ) ;^[CLASS] Month  [METHOD] next [RETURN_TYPE] RegularTimePeriod   [VARIABLES] Month  result  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  year  
[buglab_swap_variables]^result = new Month (  this.year + 1 ) ;^256^^^^^249^263^result = new Month ( MonthConstants.JANUARY, this.year + 1 ) ;^[CLASS] Month  [METHOD] next [RETURN_TYPE] RegularTimePeriod   [VARIABLES] Month  result  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  year  
[buglab_swap_variables]^result = new Month ( MonthConstants.JANUARY + 1 ) ;^256^^^^^249^263^result = new Month ( MonthConstants.JANUARY, this.year + 1 ) ;^[CLASS] Month  [METHOD] next [RETURN_TYPE] RegularTimePeriod   [VARIABLES] Month  result  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  year  
[buglab_swap_variables]^result = new Month ( this.year + 1, this.month ) ;^252^^^^^249^263^result = new Month ( this.month + 1, this.year ) ;^[CLASS] Month  [METHOD] next [RETURN_TYPE] RegularTimePeriod   [VARIABLES] Month  result  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  year  
[buglab_swap_variables]^result = new Month ( this.month + 1 ) ;^252^^^^^249^263^result = new Month ( this.month + 1, this.year ) ;^[CLASS] Month  [METHOD] next [RETURN_TYPE] RegularTimePeriod   [VARIABLES] Month  result  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  year  
[buglab_swap_variables]^return this.month * 12L + this.year;^271^^^^^270^272^return this.year * 12L + this.month;^[CLASS] Month  [METHOD] getSerialIndex [RETURN_TYPE] long   [VARIABLES] long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  year  boolean  
[buglab_swap_variables]^return SerialDate.monthCodeToString ( this.year )  + " " + this.month;^282^^^^^281^283^return SerialDate.monthCodeToString ( this.month )  + " " + this.year;^[CLASS] Month  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  year  boolean  
[buglab_swap_variables]^return  ( target == this.month.getMonth (  ) &&  ( this.year == target.getYearValue (  )  )  ) ;^300^301^^^^295^311^return  ( this.month == target.getMonth (  ) &&  ( this.year == target.getYearValue (  )  )  ) ;^[CLASS] Month  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Month  target  Object  obj  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  year  
[buglab_swap_variables]^return  ( this.year == target.getMonth (  ) &&  ( this.month == target.getYearValue (  )  )  ) ;^300^301^^^^295^311^return  ( this.month == target.getMonth (  ) &&  ( this.year == target.getYearValue (  )  )  ) ;^[CLASS] Month  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Month  target  Object  obj  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  year  
[buglab_swap_variables]^return  ( this.month == this.year.getMonth (  ) &&  ( target == target.getYearValue (  )  )  ) ;^300^301^^^^295^311^return  ( this.month == target.getMonth (  ) &&  ( this.year == target.getYearValue (  )  )  ) ;^[CLASS] Month  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Month  target  Object  obj  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  year  
[buglab_swap_variables]^result = 37 * this.month + result;^324^^^^^322^327^result = 37 * result + this.month;^[CLASS] Month  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  result  year  boolean  
[buglab_swap_variables]^result = 37 * this.year + result;^325^^^^^322^327^result = 37 * result + this.year;^[CLASS] Month  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  result  year  boolean  
[buglab_swap_variables]^result = m - this.month.getMonth (  ) ;^348^^^^^338^368^result = this.month - m.getMonth (  ) ;^[CLASS] Month  [METHOD] compareTo [RETURN_TYPE] int   Object o1 [VARIABLES] Month  m  Object  o1  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  result  year  
[buglab_swap_variables]^result = m - this.year.getYearValue (  ) ;^346^^^^^338^368^result = this.year - m.getYearValue (  ) ;^[CLASS] Month  [METHOD] compareTo [RETURN_TYPE] int   Object o1 [VARIABLES] Month  m  Object  o1  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  result  year  
[buglab_swap_variables]^calendar.set ( this.month, this.year - 1, 1, 0, 0, 0 ) ;^382^^^^^381^387^calendar.set ( this.year, this.month - 1, 1, 0, 0, 0 ) ;^[CLASS] Month  [METHOD] getFirstMillisecond [RETURN_TYPE] long   Calendar calendar [VARIABLES] boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  result  year  Calendar  calendar  
[buglab_swap_variables]^calendar.set (  this.month - 1, 1, 0, 0, 0 ) ;^382^^^^^381^387^calendar.set ( this.year, this.month - 1, 1, 0, 0, 0 ) ;^[CLASS] Month  [METHOD] getFirstMillisecond [RETURN_TYPE] long   Calendar calendar [VARIABLES] boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  result  year  Calendar  calendar  
[buglab_swap_variables]^calendar.set ( this.year - 1, 1, 0, 0, 0 ) ;^382^^^^^381^387^calendar.set ( this.year, this.month - 1, 1, 0, 0, 0 ) ;^[CLASS] Month  [METHOD] getFirstMillisecond [RETURN_TYPE] long   Calendar calendar [VARIABLES] boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  result  year  Calendar  calendar  
[buglab_swap_variables]^calendar.set ( Calendar. 0 ) ;^383^^^^^381^387^calendar.set ( Calendar.MILLISECOND, 0 ) ;^[CLASS] Month  [METHOD] getFirstMillisecond [RETURN_TYPE] long   Calendar calendar [VARIABLES] boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  month  result  year  Calendar  calendar  
[buglab_swap_variables]^int eom = SerialDate.lastDayOfMonth ( this.year, this.month ) ;^401^^^^^400^407^int eom = SerialDate.lastDayOfMonth ( this.month, this.year ) ;^[CLASS] Month  [METHOD] getLastMillisecond [RETURN_TYPE] long   Calendar calendar [VARIABLES] boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  month  result  year  Calendar  calendar  
[buglab_swap_variables]^int eom = SerialDate.lastDayOfMonth (  this.year ) ;^401^^^^^400^407^int eom = SerialDate.lastDayOfMonth ( this.month, this.year ) ;^[CLASS] Month  [METHOD] getLastMillisecond [RETURN_TYPE] long   Calendar calendar [VARIABLES] boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  month  result  year  Calendar  calendar  
[buglab_swap_variables]^int eom = SerialDate.lastDayOfMonth ( this.month ) ;^401^^^^^400^407^int eom = SerialDate.lastDayOfMonth ( this.month, this.year ) ;^[CLASS] Month  [METHOD] getLastMillisecond [RETURN_TYPE] long   Calendar calendar [VARIABLES] boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  month  result  year  Calendar  calendar  
[buglab_swap_variables]^calendar.set ( this.year, this.month - 1,  23, 59, 59 ) ;^402^^^^^400^407^calendar.set ( this.year, this.month - 1, eom, 23, 59, 59 ) ;^[CLASS] Month  [METHOD] getLastMillisecond [RETURN_TYPE] long   Calendar calendar [VARIABLES] boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  month  result  year  Calendar  calendar  
[buglab_swap_variables]^calendar.set ( eom, this.month - 1, this.year, 23, 59, 59 ) ;^402^^^^^400^407^calendar.set ( this.year, this.month - 1, eom, 23, 59, 59 ) ;^[CLASS] Month  [METHOD] getLastMillisecond [RETURN_TYPE] long   Calendar calendar [VARIABLES] boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  month  result  year  Calendar  calendar  
[buglab_swap_variables]^calendar.set (  this.month - 1, eom, 23, 59, 59 ) ;^402^^^^^400^407^calendar.set ( this.year, this.month - 1, eom, 23, 59, 59 ) ;^[CLASS] Month  [METHOD] getLastMillisecond [RETURN_TYPE] long   Calendar calendar [VARIABLES] boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  month  result  year  Calendar  calendar  
[buglab_swap_variables]^calendar.set ( this.year, eom - 1, this.month, 23, 59, 59 ) ;^402^^^^^400^407^calendar.set ( this.year, this.month - 1, eom, 23, 59, 59 ) ;^[CLASS] Month  [METHOD] getLastMillisecond [RETURN_TYPE] long   Calendar calendar [VARIABLES] boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  month  result  year  Calendar  calendar  
[buglab_swap_variables]^calendar.set ( this.year - 1, eom, 23, 59, 59 ) ;^402^^^^^400^407^calendar.set ( this.year, this.month - 1, eom, 23, 59, 59 ) ;^[CLASS] Month  [METHOD] getLastMillisecond [RETURN_TYPE] long   Calendar calendar [VARIABLES] boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  month  result  year  Calendar  calendar  
[buglab_swap_variables]^calendar.set ( Calendar. 999 ) ;^403^^^^^400^407^calendar.set ( Calendar.MILLISECOND, 999 ) ;^[CLASS] Month  [METHOD] getLastMillisecond [RETURN_TYPE] long   Calendar calendar [VARIABLES] boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  month  result  year  Calendar  calendar  
[buglab_swap_variables]^result = new Month ( year, month ) ;^453^^^^^435^460^result = new Month ( month, year ) ;^[CLASS] Month  [METHOD] parseMonth [RETURN_TYPE] Month   String s [VARIABLES] Month  result  String  s  s1  s2  boolean  Year  year  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  i  month  result  year  
[buglab_swap_variables]^result = new Month (  year ) ;^453^^^^^435^460^result = new Month ( month, year ) ;^[CLASS] Month  [METHOD] parseMonth [RETURN_TYPE] Month   String s [VARIABLES] Month  result  String  s  s1  s2  boolean  Year  year  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  i  month  result  year  
[buglab_swap_variables]^result = new Month ( month ) ;^453^^^^^435^460^result = new Month ( month, year ) ;^[CLASS] Month  [METHOD] parseMonth [RETURN_TYPE] Month   String s [VARIABLES] Month  result  String  s  s1  s2  boolean  Year  year  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  i  month  result  year  
[buglab_swap_variables]^result = new Month ( year, month ) ;^442^^^^^427^457^result = new Month ( month, year ) ;^[CLASS] Month  [METHOD] parseMonth [RETURN_TYPE] Month   String s [VARIABLES] Month  result  String  s  s1  s2  boolean  Year  year  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  i  month  result  year  
[buglab_swap_variables]^result = new Month (  year ) ;^442^^^^^427^457^result = new Month ( month, year ) ;^[CLASS] Month  [METHOD] parseMonth [RETURN_TYPE] Month   String s [VARIABLES] Month  result  String  s  s1  s2  boolean  Year  year  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  i  month  result  year  
[buglab_swap_variables]^result = new Month ( month ) ;^442^^^^^427^457^result = new Month ( month, year ) ;^[CLASS] Month  [METHOD] parseMonth [RETURN_TYPE] Month   String s [VARIABLES] Month  result  String  s  s1  s2  boolean  Year  year  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  i  month  result  year  
[buglab_swap_variables]^result = new Month ( year, month ) ;^453^^^^^438^468^result = new Month ( month, year ) ;^[CLASS] Month  [METHOD] parseMonth [RETURN_TYPE] Month   String s [VARIABLES] Month  result  String  s  s1  s2  boolean  Year  year  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  i  month  result  year  
[buglab_swap_variables]^result = new Month (  year ) ;^453^^^^^438^468^result = new Month ( month, year ) ;^[CLASS] Month  [METHOD] parseMonth [RETURN_TYPE] Month   String s [VARIABLES] Month  result  String  s  s1  s2  boolean  Year  year  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  i  month  result  year  
[buglab_swap_variables]^result = new Month ( month ) ;^453^^^^^438^468^result = new Month ( month, year ) ;^[CLASS] Month  [METHOD] parseMonth [RETURN_TYPE] Month   String s [VARIABLES] Month  result  String  s  s1  s2  boolean  Year  year  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  i  month  result  year  
[buglab_swap_variables]^String i1 = s.substring ( 0, s ) .trim (  ) ;^430^^^^^415^445^String s1 = s.substring ( 0, i ) .trim (  ) ;^[CLASS] Month  [METHOD] parseMonth [RETURN_TYPE] Month   String s [VARIABLES] Month  result  String  s  s1  s2  boolean  Year  year  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  i  month  result  year  
[buglab_swap_variables]^String s1 = s.substring ( 0 ) .trim (  ) ;^430^^^^^415^445^String s1 = s.substring ( 0, i ) .trim (  ) ;^[CLASS] Month  [METHOD] parseMonth [RETURN_TYPE] Month   String s [VARIABLES] Month  result  String  s  s1  s2  boolean  Year  year  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  i  month  result  year  
[buglab_swap_variables]^String i2 = s.substring ( s + 1, s.length (  )  ) .trim (  ) ;^431^^^^^416^446^String s2 = s.substring ( i + 1, s.length (  )  ) .trim (  ) ;^[CLASS] Month  [METHOD] parseMonth [RETURN_TYPE] Month   String s [VARIABLES] Month  result  String  s  s1  s2  boolean  Year  year  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  i  month  result  year  
[buglab_swap_variables]^String s2 = s.substring ( i + 1.length (  )  ) .trim (  ) ;^431^^^^^416^446^String s2 = s.substring ( i + 1, s.length (  )  ) .trim (  ) ;^[CLASS] Month  [METHOD] parseMonth [RETURN_TYPE] Month   String s [VARIABLES] Month  result  String  s  s1  s2  boolean  Year  year  long  firstMillisecond  lastMillisecond  serialVersionUID  int  eom  i  month  result  year  
