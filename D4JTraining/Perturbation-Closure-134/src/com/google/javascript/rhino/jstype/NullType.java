[REPLACE]^private static final long serialVersionUID  = null ;^52^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] NullType  
[REPLACE]^return registry.getNativeType ( JSTypeNative.NO_TYPE ) ;^55^^^^^54^56^[REPLACE] super ( registry ) ;^[METHOD] <init> [TYPE] JSTypeRegistry) [PARAMETER] JSTypeRegistry registry [CLASS] NullType   [TYPE]  long serialVersionUID  [TYPE]  JSTypeRegistry registry  [TYPE]  boolean false  true 
[REPLACE]^return false;^60^^^^^59^61^[REPLACE] return true;^[METHOD] isNullType [TYPE] boolean [PARAMETER] [CLASS] NullType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return TRUE;^65^^^^^64^66^[REPLACE] return true;^[METHOD] isNullable [TYPE] boolean [PARAMETER] [CLASS] NullType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return false;^70^^^^^69^71^[REPLACE] return true;^[METHOD] matchesNumberContext [TYPE] boolean [PARAMETER] [CLASS] NullType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return true;^75^^^^^74^76^[REPLACE] return false;^[METHOD] matchesObjectContext [TYPE] boolean [PARAMETER] [CLASS] NullType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return false;^80^^^^^79^81^[REPLACE] return true;^[METHOD] matchesStringContext [TYPE] boolean [PARAMETER] [CLASS] NullType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return   JSTypeNative.NO_TYPE   ;^85^^^^^84^86^[REPLACE] return registry.getNativeType ( JSTypeNative.NO_TYPE ) ;^[METHOD] restrictByNotNullOrUndefined [TYPE] JSType [PARAMETER] [CLASS] NullType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  (   super.testForEquality ( that )   )  {^90^^^^^89^100^[REPLACE] if  ( UNKNOWN.equals ( super.testForEquality ( that )  )  )  {^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] NullType   [TYPE]  long serialVersionUID  [TYPE]  JSType that  [TYPE]  boolean false  true 
[ADD]^return UNKNOWN;^90^91^92^^^89^100^[ADD] if  ( UNKNOWN.equals ( super.testForEquality ( that )  )  )  { return UNKNOWN; }^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] NullType   [TYPE]  long serialVersionUID  [TYPE]  JSType that  [TYPE]  boolean false  true 
[REPLACE]^return false;^91^^^^^89^100^[REPLACE] return UNKNOWN;^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] NullType   [TYPE]  long serialVersionUID  [TYPE]  JSType that  [TYPE]  boolean false  true 
[REPLACE]^if  ( that.isNullType (  )  && that.isVoidType (  )  )  {^93^^^^^89^100^[REPLACE] if  ( that.isNullType (  )  || that.isVoidType (  )  )  {^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] NullType   [TYPE]  long serialVersionUID  [TYPE]  JSType that  [TYPE]  boolean false  true 
[REPLACE]^return true;^94^^^^^89^100^[REPLACE] return TRUE;^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] NullType   [TYPE]  long serialVersionUID  [TYPE]  JSType that  [TYPE]  boolean false  true 
[REPLACE]^if  ( that.isUnknownType (  )  && that.isNullable (  )  )  {^96^^^^^89^100^[REPLACE] if  ( that.isUnknownType (  )  || that.isNullable (  )  )  {^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] NullType   [TYPE]  long serialVersionUID  [TYPE]  JSType that  [TYPE]  boolean false  true 
[REPLACE]^return false;^97^^^^^89^100^[REPLACE] return UNKNOWN;^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] NullType   [TYPE]  long serialVersionUID  [TYPE]  JSType that  [TYPE]  boolean false  true 
[REPLACE]^return false;^99^^^^^89^100^[REPLACE] return FALSE;^[METHOD] testForEquality [TYPE] TernaryValue [PARAMETER] JSType that [CLASS] NullType   [TYPE]  long serialVersionUID  [TYPE]  JSType that  [TYPE]  boolean false  true 
[REPLACE]^return "true";^104^^^^^103^105^[REPLACE] return "null";^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] NullType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return registry.getNativeType ( JSTypeNative.NO_TYPE ) ;^109^^^^^108^110^[REPLACE] return BooleanLiteralSet.FALSE;^[METHOD] getPossibleToBooleanOutcomes [TYPE] BooleanLiteralSet [PARAMETER] [CLASS] NullType   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return this.caseNullType (  ) ;^114^^^^^113^115^[REPLACE] return visitor.caseNullType (  ) ;^[METHOD] visit [TYPE] <T> [PARAMETER] Visitor<T> visitor [CLASS] NullType   [TYPE]  Visitor visitor  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
