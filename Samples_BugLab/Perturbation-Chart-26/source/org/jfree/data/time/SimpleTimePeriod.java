[buglab_swap_variables]^this ( new Date ( end ) , new Date ( start )  ) ;^78^^^^^77^79^this ( new Date ( start ) , new Date ( end )  ) ;^[CLASS] SimpleTimePeriod  [METHOD] <init> [RETURN_TYPE] SimpleTimePeriod(long,long)   long start long end [VARIABLES] long  end  serialVersionUID  start  Date  end  start  boolean  
[buglab_swap_variables]^if  ( end.getTime (  )  > start.getTime (  )  )  {^88^^^^^87^93^if  ( start.getTime (  )  > end.getTime (  )  )  {^[CLASS] SimpleTimePeriod  [METHOD] <init> [RETURN_TYPE] Date)   Date start Date end [VARIABLES] long  end  serialVersionUID  start  Date  end  start  boolean  
[buglab_swap_variables]^long m0 = t1 +  ( t0 - t0 )  / 2L;^154^^^^^139^169^long m0 = t0 +  ( t1 - t0 )  / 2L;^[CLASS] SimpleTimePeriod  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  boolean  long  end  m0  m1  serialVersionUID  start  t0  t1  t2  t3  Date  end  start  TimePeriod  that  
[buglab_swap_variables]^long m1 = t3 +  ( t2 - t2 )  / 2L;^157^^^^^142^172^long m1 = t2 +  ( t3 - t2 )  / 2L;^[CLASS] SimpleTimePeriod  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  boolean  long  end  m0  m1  serialVersionUID  start  t0  t1  t2  t3  Date  end  start  TimePeriod  that  
[buglab_swap_variables]^if  ( t2 < t0 )  {^165^^^^^161^182^if  ( t0 < t2 )  {^[CLASS] SimpleTimePeriod  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  boolean  long  end  m0  m1  serialVersionUID  start  t0  t1  t2  t3  Date  end  start  TimePeriod  that  
[buglab_swap_variables]^else if  ( t2 > t0 )  {^168^^^^^161^182^else if  ( t0 > t2 )  {^[CLASS] SimpleTimePeriod  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  boolean  long  end  m0  m1  serialVersionUID  start  t0  t1  t2  t3  Date  end  start  TimePeriod  that  
[buglab_swap_variables]^if  ( t3 < t1 )  {^172^^^^^161^182^if  ( t1 < t3 )  {^[CLASS] SimpleTimePeriod  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  boolean  long  end  m0  m1  serialVersionUID  start  t0  t1  t2  t3  Date  end  start  TimePeriod  that  
[buglab_swap_variables]^else if  ( t3 > t1 )  {^175^^^^^161^182^else if  ( t1 > t3 )  {^[CLASS] SimpleTimePeriod  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  boolean  long  end  m0  m1  serialVersionUID  start  t0  t1  t2  t3  Date  end  start  TimePeriod  that  
[buglab_swap_variables]^if  ( t2 < t0 )  {^165^^^^^150^180^if  ( t0 < t2 )  {^[CLASS] SimpleTimePeriod  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  boolean  long  end  m0  m1  serialVersionUID  start  t0  t1  t2  t3  Date  end  start  TimePeriod  that  
[buglab_swap_variables]^if  ( t3 < t1 )  {^172^^^^^168^181^if  ( t1 < t3 )  {^[CLASS] SimpleTimePeriod  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  boolean  long  end  m0  m1  serialVersionUID  start  t0  t1  t2  t3  Date  end  start  TimePeriod  that  
[buglab_swap_variables]^else if  ( t3 > t1 )  {^175^^^^^168^181^else if  ( t1 > t3 )  {^[CLASS] SimpleTimePeriod  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  boolean  long  end  m0  m1  serialVersionUID  start  t0  t1  t2  t3  Date  end  start  TimePeriod  that  
[buglab_swap_variables]^if  ( t3 < t1 )  {^172^^^^^157^187^if  ( t1 < t3 )  {^[CLASS] SimpleTimePeriod  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  boolean  long  end  m0  m1  serialVersionUID  start  t0  t1  t2  t3  Date  end  start  TimePeriod  that  
[buglab_swap_variables]^else if  ( t3 > t1 )  {^175^^^^^160^190^else if  ( t1 > t3 )  {^[CLASS] SimpleTimePeriod  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  boolean  long  end  m0  m1  serialVersionUID  start  t0  t1  t2  t3  Date  end  start  TimePeriod  that  
[buglab_swap_variables]^else if  ( t2 > t0 )  {^168^^^^^153^183^else if  ( t0 > t2 )  {^[CLASS] SimpleTimePeriod  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  boolean  long  end  m0  m1  serialVersionUID  start  t0  t1  t2  t3  Date  end  start  TimePeriod  that  
[buglab_swap_variables]^result = 37 * this.start + result.hashCode (  ) ;^196^^^^^194^199^result = 37 * result + this.start.hashCode (  ) ;^[CLASS] SimpleTimePeriod  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] boolean  long  end  m0  m1  serialVersionUID  start  t0  t1  t2  t3  Date  end  start  int  result  
[buglab_swap_variables]^result = 37 * this.end + result.hashCode (  ) ;^197^^^^^194^199^result = 37 * result + this.end.hashCode (  ) ;^[CLASS] SimpleTimePeriod  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] boolean  long  end  m0  m1  serialVersionUID  start  t0  t1  t2  t3  Date  end  start  int  result  
