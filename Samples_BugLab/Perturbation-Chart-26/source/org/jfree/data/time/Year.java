[buglab_swap_variables]^if  (  ( SerialDate.MAXIMUM_YEAR_SUPPORTED < SerialDate.MINIMUM_YEAR_SUPPORTED ) ||  ( year > year )  )  {^99^100^^^^98^107^if  (  ( year < SerialDate.MINIMUM_YEAR_SUPPORTED ) ||  ( year > SerialDate.MAXIMUM_YEAR_SUPPORTED )  )  {^[CLASS] Year  [METHOD] <init> [RETURN_TYPE] Year(int)   int year [VARIABLES] short  year  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  year  
[buglab_swap_variables]^if  (  ( year < SerialDate.MAXIMUM_YEAR_SUPPORTED ) ||  ( year > SerialDate.MINIMUM_YEAR_SUPPORTED )  )  {^99^100^^^^98^107^if  (  ( year < SerialDate.MINIMUM_YEAR_SUPPORTED ) ||  ( year > SerialDate.MAXIMUM_YEAR_SUPPORTED )  )  {^[CLASS] Year  [METHOD] <init> [RETURN_TYPE] Year(int)   int year [VARIABLES] short  year  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  year  
[buglab_swap_variables]^if  ( SerialDate.MINIMUM_YEAR_SUPPORTED > this.year )  {^189^^^^^188^195^if  ( this.year > SerialDate.MINIMUM_YEAR_SUPPORTED )  {^[CLASS] Year  [METHOD] previous [RETURN_TYPE] RegularTimePeriod   [VARIABLES] short  year  long  firstMillisecond  lastMillisecond  serialVersionUID  boolean  
[buglab_swap_variables]^if  ( SerialDate.MAXIMUM_YEAR_SUPPORTED < this.year )  {^204^^^^^203^210^if  ( this.year < SerialDate.MAXIMUM_YEAR_SUPPORTED )  {^[CLASS] Year  [METHOD] next [RETURN_TYPE] RegularTimePeriod   [VARIABLES] short  year  long  firstMillisecond  lastMillisecond  serialVersionUID  boolean  
[buglab_swap_variables]^calendar.set (  Calendar.JANUARY, 1, 0, 0, 0 ) ;^235^^^^^234^240^calendar.set ( this.year, Calendar.JANUARY, 1, 0, 0, 0 ) ;^[CLASS] Year  [METHOD] getFirstMillisecond [RETURN_TYPE] long   Calendar calendar [VARIABLES] short  year  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  Calendar  calendar  
[buglab_swap_variables]^calendar.set ( this.year, Calendar. 1, 0, 0, 0 ) ;^235^^^^^234^240^calendar.set ( this.year, Calendar.JANUARY, 1, 0, 0, 0 ) ;^[CLASS] Year  [METHOD] getFirstMillisecond [RETURN_TYPE] long   Calendar calendar [VARIABLES] short  year  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  Calendar  calendar  
[buglab_swap_variables]^calendar.set ( Calendar. 0 ) ;^236^^^^^234^240^calendar.set ( Calendar.MILLISECOND, 0 ) ;^[CLASS] Year  [METHOD] getFirstMillisecond [RETURN_TYPE] long   Calendar calendar [VARIABLES] short  year  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  Calendar  calendar  
[buglab_swap_variables]^calendar.set (  Calendar.DECEMBER, 31, 23, 59, 59 ) ;^254^^^^^253^259^calendar.set ( this.year, Calendar.DECEMBER, 31, 23, 59, 59 ) ;^[CLASS] Year  [METHOD] getLastMillisecond [RETURN_TYPE] long   Calendar calendar [VARIABLES] short  year  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  Calendar  calendar  
[buglab_swap_variables]^calendar.set ( this.year, Calendar. 31, 23, 59, 59 ) ;^254^^^^^253^259^calendar.set ( this.year, Calendar.DECEMBER, 31, 23, 59, 59 ) ;^[CLASS] Year  [METHOD] getLastMillisecond [RETURN_TYPE] long   Calendar calendar [VARIABLES] short  year  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  Calendar  calendar  
[buglab_swap_variables]^calendar.set ( Calendar. 999 ) ;^255^^^^^253^259^calendar.set ( Calendar.MILLISECOND, 999 ) ;^[CLASS] Year  [METHOD] getLastMillisecond [RETURN_TYPE] long   Calendar calendar [VARIABLES] short  year  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  Calendar  calendar  
[buglab_swap_variables]^return  ( target == this.year.getYear (  )  ) ;^276^^^^^272^285^return  ( this.year == target.getYear (  )  ) ;^[CLASS] Year  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] short  year  Object  object  boolean  Year  target  long  firstMillisecond  lastMillisecond  serialVersionUID  
[buglab_swap_variables]^result = 37 * c + result;^299^^^^^296^301^result = 37 * result + c;^[CLASS] Year  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] short  year  boolean  long  firstMillisecond  lastMillisecond  serialVersionUID  int  c  result  
[buglab_swap_variables]^result = y - this.year.getYear (  ) ;^321^^^^^313^340^result = this.year - y.getYear (  ) ;^[CLASS] Year  [METHOD] compareTo [RETURN_TYPE] int   Object o1 [VARIABLES] short  year  Object  o1  boolean  Year  y  long  firstMillisecond  lastMillisecond  serialVersionUID  int  result  
