[buglab_swap_variables]^if  ( num2 == null || num1 == null )  {^97^^^^^82^112^if  ( num1 == null || num2 == null )  {^[CLASS] NumberRange  [METHOD] <init> [RETURN_TYPE] Number)   Number num1 Number num2 [VARIABLES] String  toString  boolean  Number  max  min  num  num1  num2  long  serialVersionUID  int  compare  hashCode  
[buglab_swap_variables]^if  ( num2.getClass (  )  != num1.getClass (  )  )  {^100^^^^^85^115^if  ( num1.getClass (  )  != num2.getClass (  )  )  {^[CLASS] NumberRange  [METHOD] <init> [RETURN_TYPE] Number)   Number num1 Number num2 [VARIABLES] String  toString  boolean  Number  max  min  num  num1  num2  long  serialVersionUID  int  compare  hashCode  
[buglab_swap_variables]^if  ( min.getClass (  )  != number.getClass (  )  )  {^167^^^^^163^173^if  ( number.getClass (  )  != min.getClass (  )  )  {^[CLASS] NumberRange  [METHOD] containsNumber [RETURN_TYPE] boolean   Number number [VARIABLES] String  toString  boolean  Number  max  min  num  num1  num2  number  long  serialVersionUID  int  compare  compareMax  compareMin  hashCode  
[buglab_swap_variables]^return compareMax <= 0 && compareMin >= 0;^172^^^^^163^173^return compareMin <= 0 && compareMax >= 0;^[CLASS] NumberRange  [METHOD] containsNumber [RETURN_TYPE] boolean   Number number [VARIABLES] String  toString  boolean  Number  max  min  num  num1  num2  number  long  serialVersionUID  int  compare  compareMax  compareMin  hashCode  
[buglab_swap_variables]^return min.equals ( range.max.min )  && max.equals ( range ) ;^198^^^^^190^199^return min.equals ( range.min )  && max.equals ( range.max ) ;^[CLASS] NumberRange  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] NumberRange  range  boolean  Number  max  min  num  num1  num2  number  Object  obj  String  toString  long  serialVersionUID  int  compare  compareMax  compareMin  hashCode  
[buglab_swap_variables]^return max.equals ( range.min )  && min.equals ( range.max ) ;^198^^^^^190^199^return min.equals ( range.min )  && max.equals ( range.max ) ;^[CLASS] NumberRange  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] NumberRange  range  boolean  Number  max  min  num  num1  num2  number  Object  obj  String  toString  long  serialVersionUID  int  compare  compareMax  compareMin  hashCode  
[buglab_swap_variables]^return min.equals ( max )  && range.min.equals ( range.max ) ;^198^^^^^190^199^return min.equals ( range.min )  && max.equals ( range.max ) ;^[CLASS] NumberRange  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] NumberRange  range  boolean  Number  max  min  num  num1  num2  number  Object  obj  String  toString  long  serialVersionUID  int  compare  compareMax  compareMin  hashCode  
[buglab_swap_variables]^return range.max.equals ( range.min )  && max.equals ( min ) ;^198^^^^^190^199^return min.equals ( range.min )  && max.equals ( range.max ) ;^[CLASS] NumberRange  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] NumberRange  range  boolean  Number  max  min  num  num1  num2  number  Object  obj  String  toString  long  serialVersionUID  int  compare  compareMax  compareMin  hashCode  
[buglab_swap_variables]^return min.equals ( range.min.min )  && max.equals ( range.max ) ;^198^^^^^190^199^return min.equals ( range.min )  && max.equals ( range.max ) ;^[CLASS] NumberRange  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] NumberRange  range  boolean  Number  max  min  num  num1  num2  number  Object  obj  String  toString  long  serialVersionUID  int  compare  compareMax  compareMin  hashCode  
[buglab_swap_variables]^return range.min.equals ( min )  && max.equals ( range.max ) ;^198^^^^^190^199^return min.equals ( range.min )  && max.equals ( range.max ) ;^[CLASS] NumberRange  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] NumberRange  range  boolean  Number  max  min  num  num1  num2  number  Object  obj  String  toString  long  serialVersionUID  int  compare  compareMax  compareMin  hashCode  
[buglab_swap_variables]^return min.equals ( range.min )  && range.max.equals ( max ) ;^198^^^^^190^199^return min.equals ( range.min )  && max.equals ( range.max ) ;^[CLASS] NumberRange  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] NumberRange  range  boolean  Number  max  min  num  num1  num2  number  Object  obj  String  toString  long  serialVersionUID  int  compare  compareMax  compareMin  hashCode  
[buglab_swap_variables]^hashCode = 37 * min + hashCode.hashCode (  ) ;^210^^^^^206^214^hashCode = 37 * hashCode + min.hashCode (  ) ;^[CLASS] NumberRange  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] String  toString  boolean  Number  max  min  num  num1  num2  number  long  serialVersionUID  int  compare  compareMax  compareMin  hashCode  
[buglab_swap_variables]^hashCode = 37 * max + hashCode.hashCode (  ) ;^211^^^^^206^214^hashCode = 37 * hashCode + max.hashCode (  ) ;^[CLASS] NumberRange  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] String  toString  boolean  Number  max  min  num  num1  num2  number  long  serialVersionUID  int  compare  compareMax  compareMin  hashCode  
