[REPLACE]^private static final long serialVersionUID  = null ;^28^^^^^^^[REPLACE] private static final long serialVersionUID = 512176391864L;^ [CLASS] MutableInt  
[REPLACE]^this.value += operand.intValue (  ) ;^37^^^^^36^38^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] MutableInt() [PARAMETER] [CLASS] MutableInt   [TYPE]  long serialVersionUID  [TYPE]  int value  [TYPE]  boolean false  true 
[REPLACE]^this.value += operand.intValue (  ) ;^47^^^^^46^49^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] MutableInt(int) [PARAMETER] int value [CLASS] MutableInt   [TYPE]  long serialVersionUID  [TYPE]  int value  [TYPE]  boolean false  true 
[ADD]^^47^^^^^46^49^[ADD] super (  ) ;^[METHOD] <init> [TYPE] MutableInt(int) [PARAMETER] int value [CLASS] MutableInt   [TYPE]  long serialVersionUID  [TYPE]  int value  [TYPE]  boolean false  true 
[REPLACE]^this.value =  null;^48^^^^^46^49^[REPLACE] this.value = value;^[METHOD] <init> [TYPE] MutableInt(int) [PARAMETER] int value [CLASS] MutableInt   [TYPE]  long serialVersionUID  [TYPE]  int value  [TYPE]  boolean false  true 
[ADD]^^48^^^^^46^49^[ADD] this.value = value;^[METHOD] <init> [TYPE] MutableInt(int) [PARAMETER] int value [CLASS] MutableInt   [TYPE]  long serialVersionUID  [TYPE]  int value  [TYPE]  boolean false  true 
[REPLACE]^this.value += operand.intValue (  ) ;^60^^^^^59^62^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] Number) [PARAMETER] Number value [CLASS] MutableInt   [TYPE]  boolean false  true  [TYPE]  Number value  [TYPE]  long serialVersionUID  [TYPE]  int value 
[REMOVE]^this.value += operand.intValue (  ) ;^60^^^^^59^62^[REMOVE] ^[METHOD] <init> [TYPE] Number) [PARAMETER] Number value [CLASS] MutableInt   [TYPE]  boolean false  true  [TYPE]  Number value  [TYPE]  long serialVersionUID  [TYPE]  int value 
[REPLACE]^this.value += operand.intValue (  ) ; ;^61^^^^^59^62^[REPLACE] this.value = value.intValue (  ) ;^[METHOD] <init> [TYPE] Number) [PARAMETER] Number value [CLASS] MutableInt   [TYPE]  boolean false  true  [TYPE]  Number value  [TYPE]  long serialVersionUID  [TYPE]  int value 
[REPLACE]^return  new Integer ( intValue (  )  )  ;^71^^^^^70^72^[REPLACE] return new Integer ( this.value ) ;^[METHOD] getValue [TYPE] Object [PARAMETER] [CLASS] MutableInt   [TYPE]  long serialVersionUID  [TYPE]  int value  [TYPE]  boolean false  true 
[REPLACE]^this.value =  null;^81^^^^^80^82^[REPLACE] this.value = value;^[METHOD] setValue [TYPE] void [PARAMETER] int value [CLASS] MutableInt   [TYPE]  long serialVersionUID  [TYPE]  int value  [TYPE]  boolean false  true 
[REPLACE]^setValue (  (  ( Number )  value )  .Number (  )   ) ;^95^^^^^94^96^[REPLACE] setValue (  (  ( Number )  value ) .intValue (  )  ) ;^[METHOD] setValue [TYPE] void [PARAMETER] Object value [CLASS] MutableInt   [TYPE]  Object value  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int value 
[REPLACE]^setValue (  (  ( Number )  value ) .Number (  )  ) ;^95^^^^^94^96^[REPLACE] setValue (  (  ( Number )  value ) .intValue (  )  ) ;^[METHOD] setValue [TYPE] void [PARAMETER] Object value [CLASS] MutableInt   [TYPE]  Object value  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int value 
[REPLACE]^this.value -= operand; ;^127^^^^^126^128^[REPLACE] this.value += operand;^[METHOD] add [TYPE] void [PARAMETER] int operand [CLASS] MutableInt   [TYPE]  long serialVersionUID  [TYPE]  int operand  value  [TYPE]  boolean false  true 
[REPLACE]^this.value = value.intValue (  ) ; ;^141^^^^^140^142^[REPLACE] this.value += operand.intValue (  ) ;^[METHOD] add [TYPE] void [PARAMETER] Number operand [CLASS] MutableInt   [TYPE]  boolean false  true  [TYPE]  Number operand  [TYPE]  long serialVersionUID  [TYPE]  int operand  value 
[REPLACE]^this.value += operand; ;^153^^^^^152^154^[REPLACE] this.value -= operand;^[METHOD] subtract [TYPE] void [PARAMETER] int operand [CLASS] MutableInt   [TYPE]  long serialVersionUID  [TYPE]  int operand  value  [TYPE]  boolean false  true 
[ADD]^^153^^^^^152^154^[ADD] this.value -= operand;^[METHOD] subtract [TYPE] void [PARAMETER] int operand [CLASS] MutableInt   [TYPE]  long serialVersionUID  [TYPE]  int operand  value  [TYPE]  boolean false  true 
[REPLACE]^this.value += operand.intValue (  ) ; ;^167^^^^^166^168^[REPLACE] this.value -= operand.intValue (  ) ;^[METHOD] subtract [TYPE] void [PARAMETER] Number operand [CLASS] MutableInt   [TYPE]  boolean false  true  [TYPE]  Number operand  [TYPE]  long serialVersionUID  [TYPE]  int operand  value 
[REPLACE]^return false;^178^^^^^177^179^[REPLACE] return value;^[METHOD] intValue [TYPE] int [PARAMETER] [CLASS] MutableInt   [TYPE]  long serialVersionUID  [TYPE]  int operand  value  [TYPE]  boolean false  true 
[REPLACE]^return false;^187^^^^^186^188^[REPLACE] return value;^[METHOD] longValue [TYPE] long [PARAMETER] [CLASS] MutableInt   [TYPE]  long serialVersionUID  [TYPE]  int operand  value  [TYPE]  boolean false  true 
[REPLACE]^return false;^196^^^^^195^197^[REPLACE] return value;^[METHOD] floatValue [TYPE] float [PARAMETER] [CLASS] MutableInt   [TYPE]  long serialVersionUID  [TYPE]  int operand  value  [TYPE]  boolean false  true 
[REPLACE]^return false;^205^^^^^204^206^[REPLACE] return value;^[METHOD] doubleValue [TYPE] double [PARAMETER] [CLASS] MutableInt   [TYPE]  long serialVersionUID  [TYPE]  int operand  value  [TYPE]  boolean false  true 
[REPLACE]^return  new Integer ( this.value )   ) ;^215^^^^^214^216^[REPLACE] return new Integer ( intValue (  )  ) ;^[METHOD] toInteger [TYPE] Integer [PARAMETER] [CLASS] MutableInt   [TYPE]  long serialVersionUID  [TYPE]  int operand  value  [TYPE]  boolean false  true 
[REPLACE]^if  ( ! obj instanceof MutableInt )  {^229^^^^^228^233^[REPLACE] if  ( obj instanceof MutableInt )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] MutableInt   [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int operand  value 
[ADD]^return value ==  (  ( MutableInt )  obj ) .intValue (  ) ;^229^230^231^^^228^233^[ADD] if  ( obj instanceof MutableInt )  { return value ==  (  ( MutableInt )  obj ) .intValue (  ) ; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] MutableInt   [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int operand  value 
[REPLACE]^return value  ||   (  ( MutableInt )  obj )  .Number (  )  ;^230^^^^^228^233^[REPLACE] return value ==  (  ( MutableInt )  obj ) .intValue (  ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] MutableInt   [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int operand  value 
[REPLACE]^return true;^232^^^^^228^233^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] MutableInt   [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int operand  value 
[REPLACE]^return false;^241^^^^^240^242^[REPLACE] return value;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] MutableInt   [TYPE]  long serialVersionUID  [TYPE]  int operand  value  [TYPE]  boolean false  true 
[REPLACE]^int anotherVal = other.value;^253^^^^^252^256^[REPLACE] MutableInt other =  ( MutableInt )  obj;^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] MutableInt   [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int anotherVal  operand  value  [TYPE]  MutableInt other 
[REPLACE]^MutableInt other =  ( MutableInt )  obj;^254^^^^^252^256^[REPLACE] int anotherVal = other.value;^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] MutableInt   [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int anotherVal  operand  value  [TYPE]  MutableInt other 
[REPLACE]^return   -1 ;^255^^^^^252^256^[REPLACE] return value < anotherVal ? -1 :  ( value == anotherVal ? 0 : 1 ) ;^[METHOD] compareTo [TYPE] int [PARAMETER] Object obj [CLASS] MutableInt   [TYPE]  Object obj  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int anotherVal  operand  value  [TYPE]  MutableInt other 
[REPLACE]^return   value   ;^264^^^^^263^265^[REPLACE] return String.valueOf ( value ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] MutableInt   [TYPE]  long serialVersionUID  [TYPE]  int anotherVal  operand  value  [TYPE]  boolean false  true 
