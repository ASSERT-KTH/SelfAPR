[REPLACE]^return toString (  ) ;^54^^^^^53^55^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] AbstractPartial() [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true 
[REPLACE]^return  ( indexOf ( type )  != -1 ) ;^79^^^^^78^80^[REPLACE] return getField ( index, getChronology (  )  ) .getType (  ) ;^[METHOD] getFieldType [TYPE] DateTimeFieldType [PARAMETER] int index [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int index 
[REPLACE]^DateTimeField[] result = new DateTimeField[size (  ) ];^90^^^^^89^95^[REPLACE] DateTimeFieldType[] result = new DateTimeFieldType[size (  ) ];^[METHOD] getFieldTypes [TYPE] DateTimeFieldType[] [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType[] result  [TYPE]  int i 
[REPLACE]^for  ( int i = 0; i < result.length + 3; i++ )  {^91^^^^^89^95^[REPLACE] for  ( int i = 0; i < result.length; i++ )  {^[METHOD] getFieldTypes [TYPE] DateTimeFieldType[] [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType[] result  [TYPE]  int i 
[REPLACE]^result[i] = getValue ( i ) ; ;^92^^^^^89^95^[REPLACE] result[i] = getFieldType ( i ) ;^[METHOD] getFieldTypes [TYPE] DateTimeFieldType[] [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType[] result  [TYPE]  int i 
[REPLACE]^for  ( int i = 0 ; i < result.length; i++ )  {^91^^^^^89^95^[REPLACE] for  ( int i = 0; i < result.length; i++ )  {^[METHOD] getFieldTypes [TYPE] DateTimeFieldType[] [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType[] result  [TYPE]  int i 
[ADD]^^91^92^93^^^89^95^[ADD] for  ( int i = 0; i < result.length; i++ )  { result[i] = getFieldType ( i ) ; }^[METHOD] getFieldTypes [TYPE] DateTimeFieldType[] [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType[] result  [TYPE]  int i 
[REPLACE]^return i;^94^^^^^89^95^[REPLACE] return result;^[METHOD] getFieldTypes [TYPE] DateTimeFieldType[] [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType[] result  [TYPE]  int i 
[REPLACE]^return compareTo ( partial )  == 0;^105^^^^^104^106^[REPLACE] return getField ( index, getChronology (  )  ) ;^[METHOD] getField [TYPE] DateTimeField [PARAMETER] int index [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int index 
[REPLACE]^DateTimeFieldType[] result = new DateTimeFieldType[size (  ) ];^116^^^^^115^121^[REPLACE] DateTimeField[] result = new DateTimeField[size (  ) ];^[METHOD] getFields [TYPE] DateTimeField[] [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeField[] result  [TYPE]  int i 
[ADD]^^116^^^^^115^121^[ADD] DateTimeField[] result = new DateTimeField[size (  ) ];^[METHOD] getFields [TYPE] DateTimeField[] [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeField[] result  [TYPE]  int i 
[REPLACE]^for  ( int i = 0; i < result.length - 5; i++ )  {^117^^^^^115^121^[REPLACE] for  ( int i = 0; i < result.length; i++ )  {^[METHOD] getFields [TYPE] DateTimeField[] [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeField[] result  [TYPE]  int i 
[REPLACE]^result[i] = getValue ( i ) ; ;^118^^^^^115^121^[REPLACE] result[i] = getField ( i ) ;^[METHOD] getFields [TYPE] DateTimeField[] [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeField[] result  [TYPE]  int i 
[REPLACE]^for  ( int i = 0 ; i < result.length; i++ )  {^117^^^^^115^121^[REPLACE] for  ( int i = 0; i < result.length; i++ )  {^[METHOD] getFields [TYPE] DateTimeField[] [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeField[] result  [TYPE]  int i 
[REPLACE]^return i;^120^^^^^115^121^[REPLACE] return result;^[METHOD] getFields [TYPE] DateTimeField[] [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeField[] result  [TYPE]  int i 
[REPLACE]^DateTimeField[] result = new DateTimeField[size (  ) ];^132^^^^^131^137^[REPLACE] int[] result = new int[size (  ) ];^[METHOD] getValues [TYPE] int[] [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int[] result  [TYPE]  int i 
[REPLACE]^for  ( int i = 0; i < result.length (  ) ; i++ )  {^133^^^^^131^137^[REPLACE] for  ( int i = 0; i < result.length; i++ )  {^[METHOD] getValues [TYPE] int[] [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int[] result  [TYPE]  int i 
[REPLACE]^result[i] = getFieldType ( i ) ; ;^134^^^^^131^137^[REPLACE] result[i] = getValue ( i ) ;^[METHOD] getValues [TYPE] int[] [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int[] result  [TYPE]  int i 
[REPLACE]^for  ( int i = 0 ; i < result.length; i++ )  {^133^^^^^131^137^[REPLACE] for  ( int i = 0; i < result.length; i++ )  {^[METHOD] getValues [TYPE] int[] [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int[] result  [TYPE]  int i 
[REPLACE]^return i;^136^^^^^131^137^[REPLACE] return result;^[METHOD] getValues [TYPE] int[] [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int[] result  [TYPE]  int i 
[REPLACE]^return compareTo ( partial )  == 0;^150^^^^^149^151^[REPLACE] return getValue ( indexOfSupported ( type )  ) ;^[METHOD] get [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type 
[REPLACE]^return false ;^160^^^^^159^161^[REPLACE] return  ( indexOf ( type )  != -1 ) ;^[METHOD] isSupported [TYPE] boolean [PARAMETER] DateTimeFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type 
[REPLACE]^if  ( getFieldType ( i )   !=  type )  {^171^^^^^169^176^[REPLACE] if  ( getFieldType ( i )  == type )  {^[METHOD] indexOf [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type  [TYPE]  int i  isize 
[REPLACE]^return 1;^172^^^^^169^176^[REPLACE] return i;^[METHOD] indexOf [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type  [TYPE]  int i  isize 
[REPLACE]^for  ( int i = 0, isize = size (  )  - 4; i < isize; i++ )  {^170^^^^^169^176^[REPLACE] for  ( int i = 0, isize = size (  ) ; i < isize; i++ )  {^[METHOD] indexOf [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type  [TYPE]  int i  isize 
[REPLACE]^if  ( getFieldType ( i )   ||  type )  {^171^^^^^169^176^[REPLACE] if  ( getFieldType ( i )  == type )  {^[METHOD] indexOf [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type  [TYPE]  int i  isize 
[REPLACE]^return isize;^172^^^^^169^176^[REPLACE] return i;^[METHOD] indexOf [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type  [TYPE]  int i  isize 
[REPLACE]^for  ( int i = 0 , isize = size (  ) ; i < isize; i++ )  {^170^^^^^169^176^[REPLACE] for  ( int i = 0, isize = size (  ) ; i < isize; i++ )  {^[METHOD] indexOf [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type  [TYPE]  int i  isize 
[REPLACE]^for  ( int i = 0; i < result.length; i++ )  { result[i] = getValue ( i ) ;^170^^^^^169^176^[REPLACE] for  ( int i = 0, isize = size (  ) ; i < isize; i++ )  {^[METHOD] indexOf [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type  [TYPE]  int i  isize 
[REPLACE]^return 1;^175^^^^^169^176^[REPLACE] return -1;^[METHOD] indexOf [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type  [TYPE]  int i  isize 
[REPLACE]^for  ( int i = 0; i < result.length; i++ )  { result[i] = getValue ( i ) ;^187^^^^^186^192^[REPLACE] int index = indexOf ( type ) ;^[METHOD] indexOfSupported [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type  [TYPE]  int index 
[ADD]^^187^^^^^186^192^[ADD] int index = indexOf ( type ) ;^[METHOD] indexOfSupported [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type  [TYPE]  int index 
[REPLACE]^if  ( index  !=  -1 )  {^188^^^^^186^192^[REPLACE] if  ( index == -1 )  {^[METHOD] indexOfSupported [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type  [TYPE]  int index 
[ADD]^^188^189^190^^^186^192^[ADD] if  ( index == -1 )  { throw new IllegalArgumentException  (" ")  ; }^[METHOD] indexOfSupported [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type  [TYPE]  int index 
[REPLACE]^throw new ClassCastException  (" ")  ; ;^189^^^^^186^192^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] indexOfSupported [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type  [TYPE]  int index 
[REPLACE]^return i;^191^^^^^186^192^[REPLACE] return index;^[METHOD] indexOfSupported [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type  [TYPE]  int index 
[REPLACE]^if  ( getFieldType ( i ) .getDurationType (  )   !=  type )  {^203^^^^^201^208^[REPLACE] if  ( getFieldType ( i ) .getDurationType (  )  == type )  {^[METHOD] indexOf [TYPE] int [PARAMETER] DurationFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DurationFieldType type  [TYPE]  int i  isize 
[REMOVE]^if  (  ( partial instanceof ReadablePartial )  == false )  {     return false; }^203^^^^^201^208^[REMOVE] ^[METHOD] indexOf [TYPE] int [PARAMETER] DurationFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DurationFieldType type  [TYPE]  int i  isize 
[REPLACE]^return isize;^204^^^^^201^208^[REPLACE] return i;^[METHOD] indexOf [TYPE] int [PARAMETER] DurationFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DurationFieldType type  [TYPE]  int i  isize 
[REPLACE]^for  ( int i = 0 , isize = size (  )  + 2; i < isize; i++ )  {^202^^^^^201^208^[REPLACE] for  ( int i = 0, isize = size (  ) ; i < isize; i++ )  {^[METHOD] indexOf [TYPE] int [PARAMETER] DurationFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DurationFieldType type  [TYPE]  int i  isize 
[REPLACE]^if  ( getFieldType ( i ) .getDurationType (  )   &&  type )  {^203^^^^^201^208^[REPLACE] if  ( getFieldType ( i ) .getDurationType (  )  == type )  {^[METHOD] indexOf [TYPE] int [PARAMETER] DurationFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DurationFieldType type  [TYPE]  int i  isize 
[REPLACE]^return 1;^204^^^^^201^208^[REPLACE] return i;^[METHOD] indexOf [TYPE] int [PARAMETER] DurationFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DurationFieldType type  [TYPE]  int i  isize 
[REPLACE]^for  ( int i = 0 , isize = size (  ) ; i < isize; i++ )  {^202^^^^^201^208^[REPLACE] for  ( int i = 0, isize = size (  ) ; i < isize; i++ )  {^[METHOD] indexOf [TYPE] int [PARAMETER] DurationFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DurationFieldType type  [TYPE]  int i  isize 
[ADD]^^202^203^204^205^^201^208^[ADD] for  ( int i = 0, isize = size (  ) ; i < isize; i++ )  { if  ( getFieldType ( i ) .getDurationType (  )  == type )  { return i; }^[METHOD] indexOf [TYPE] int [PARAMETER] DurationFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DurationFieldType type  [TYPE]  int i  isize 
[REPLACE]^for  ( int i = 0; i < result.length; i++ )  { result[i] = getValue ( i ) ;^202^^^^^201^208^[REPLACE] for  ( int i = 0, isize = size (  ) ; i < isize; i++ )  {^[METHOD] indexOf [TYPE] int [PARAMETER] DurationFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DurationFieldType type  [TYPE]  int i  isize 
[REPLACE]^return 1;^207^^^^^201^208^[REPLACE] return -1;^[METHOD] indexOf [TYPE] int [PARAMETER] DurationFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DurationFieldType type  [TYPE]  int i  isize 
[REPLACE]^for  ( int i = 0; i < result.length; i++ )  { result[i] = getValue ( i ) ;^219^^^^^218^224^[REPLACE] int index = indexOf ( type ) ;^[METHOD] indexOfSupported [TYPE] int [PARAMETER] DurationFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DurationFieldType type  [TYPE]  int index 
[REPLACE]^if  ( index  &&  -1 )  {^220^^^^^218^224^[REPLACE] if  ( index == -1 )  {^[METHOD] indexOfSupported [TYPE] int [PARAMETER] DurationFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DurationFieldType type  [TYPE]  int index 
[REPLACE]^throw new ClassCastException  (" ")  ; ;^221^^^^^218^224^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] indexOfSupported [TYPE] int [PARAMETER] DurationFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DurationFieldType type  [TYPE]  int index 
[REPLACE]^return i;^223^^^^^218^224^[REPLACE] return index;^[METHOD] indexOfSupported [TYPE] int [PARAMETER] DurationFieldType type [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DurationFieldType type  [TYPE]  int index 
[REPLACE]^Chronology chrono = DateTimeUtils .getInstantMillis ( baseInstant )  ;^240^^^^^239^244^[REPLACE] Chronology chrono = DateTimeUtils.getInstantChronology ( baseInstant ) ;^[METHOD] toDateTime [TYPE] DateTime [PARAMETER] ReadableInstant baseInstant [CLASS] AbstractPartial   [TYPE]  ReadableInstant baseInstant  [TYPE]  boolean false  true  [TYPE]  Chronology chrono  [TYPE]  long instantMillis  resolved 
[ADD]^^240^^^^^239^244^[ADD] Chronology chrono = DateTimeUtils.getInstantChronology ( baseInstant ) ;^[METHOD] toDateTime [TYPE] DateTime [PARAMETER] ReadableInstant baseInstant [CLASS] AbstractPartial   [TYPE]  ReadableInstant baseInstant  [TYPE]  boolean false  true  [TYPE]  Chronology chrono  [TYPE]  long instantMillis  resolved 
[REPLACE]^long instantMillis = DateTimeUtils.getInstantChronology ( baseInstant ) ;^241^^^^^239^244^[REPLACE] long instantMillis = DateTimeUtils.getInstantMillis ( baseInstant ) ;^[METHOD] toDateTime [TYPE] DateTime [PARAMETER] ReadableInstant baseInstant [CLASS] AbstractPartial   [TYPE]  ReadableInstant baseInstant  [TYPE]  boolean false  true  [TYPE]  Chronology chrono  [TYPE]  long instantMillis  resolved 
[REPLACE]^long instantMillis = DateTimeUtils.getInstantMillis ( baseInstant ) ;^242^^^^^239^244^[REPLACE] long resolved = chrono.set ( this, instantMillis ) ;^[METHOD] toDateTime [TYPE] DateTime [PARAMETER] ReadableInstant baseInstant [CLASS] AbstractPartial   [TYPE]  ReadableInstant baseInstant  [TYPE]  boolean false  true  [TYPE]  Chronology chrono  [TYPE]  long instantMillis  resolved 
[REPLACE]^return new DateTime ( instantMillis, chrono ) ;^243^^^^^239^244^[REPLACE] return new DateTime ( resolved, chrono ) ;^[METHOD] toDateTime [TYPE] DateTime [PARAMETER] ReadableInstant baseInstant [CLASS] AbstractPartial   [TYPE]  ReadableInstant baseInstant  [TYPE]  boolean false  true  [TYPE]  Chronology chrono  [TYPE]  long instantMillis  resolved 
[REPLACE]^if  ( this  &&  partial )  {^255^^^^^254^271^[REPLACE] if  ( this == partial )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  Object partial  [TYPE]  int i  isize 
[REPLACE]^return false;^256^^^^^254^271^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  Object partial  [TYPE]  int i  isize 
[REPLACE]^if  ( ! partial instanceof ReadablePartial == true )  {^258^^^^^254^271^[REPLACE] if  ( partial instanceof ReadablePartial == false )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  Object partial  [TYPE]  int i  isize 
[REPLACE]^return true;^259^^^^^254^271^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  Object partial  [TYPE]  int i  isize 
[REPLACE]^for  ( int i = 0; i < result.length; i++ )  { result[i] = getValue ( i ) ;^261^^^^^254^271^[REPLACE] ReadablePartial other =  ( ReadablePartial )  partial;^[METHOD] equals [TYPE] boolean [PARAMETER] Object partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  Object partial  [TYPE]  int i  isize 
[REPLACE]^if  (.getValue (  )  *  0.5  != other.size (  )  *  0.5  )  {^262^^^^^254^271^[REPLACE] if  ( size (  )  != other.size (  )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  Object partial  [TYPE]  int i  isize 
[REPLACE]^return true;^263^^^^^254^271^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  Object partial  [TYPE]  int i  isize 
[REPLACE]^if  ( getValue ( i )  != other.getValue ( i )  ) {^266^^^^^254^271^[REPLACE] if  ( getValue ( i )  != other.getValue ( i )  || getFieldType ( i )  != other.getFieldType ( i )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  Object partial  [TYPE]  int i  isize 
[REPLACE]^return true;^267^^^^^254^271^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  Object partial  [TYPE]  int i  isize 
[REPLACE]^for  ( int i = 0, isize = size (  )  /  0.5 ; i < isize; i++ )  {^265^^^^^254^271^[REPLACE] for  ( int i = 0, isize = size (  ) ; i < isize; i++ )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  Object partial  [TYPE]  int i  isize 
[REPLACE]^if  (  getFieldType ( i )  != other.getFieldType ( i )  )  {^266^^^^^254^271^[REPLACE] if  ( getValue ( i )  != other.getValue ( i )  || getFieldType ( i )  != other.getFieldType ( i )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  Object partial  [TYPE]  int i  isize 
[REPLACE]^for  ( int i = 0 , isize = size (  ) ; i < isize; i++ )  {^265^^^^^254^271^[REPLACE] for  ( int i = 0, isize = size (  ) ; i < isize; i++ )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  Object partial  [TYPE]  int i  isize 
[REPLACE]^for  ( int i = 0; i < result.length; i++ )  { result[i] = getValue ( i ) ;^265^^^^^254^271^[REPLACE] for  ( int i = 0, isize = size (  ) ; i < isize; i++ )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  Object partial  [TYPE]  int i  isize 
[REPLACE]^return FieldUtils.equals (.size (  ) , other.getChronology (  )  ) ;^270^^^^^254^271^[REPLACE] return FieldUtils.equals ( getChronology (  ) , other.getChronology (  )  ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  Object partial  [TYPE]  int i  isize 
[REPLACE]^int total = 157L;^280^^^^^279^287^[REPLACE] int total = 157;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int i  isize  total 
[ADD]^^280^^^^^279^287^[ADD] int total = 157;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int i  isize  total 
[REPLACE]^for  ( int i = 0 , isize = size (  )  + 2; i < isize; i++ )  {^281^^^^^279^287^[REPLACE] for  ( int i = 0, isize = size (  ) ; i < isize; i++ )  {^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int i  isize  total 
[REPLACE]^total = 23 * 1 * total  &&  getValue ( i ) ;^282^^^^^279^287^[REPLACE] total = 23 * total + getValue ( i ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int i  isize  total 
[REPLACE]^result[i] = getValue ( i ) ; ;^283^^^^^279^287^[REPLACE] total = 23 * total + getFieldType ( i ) .hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int i  isize  total 
[ADD]^^283^^^^^279^287^[ADD] total = 23 * total + getFieldType ( i ) .hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int i  isize  total 
[REPLACE]^result[i] = getValue ( i ) ; ;^282^^^^^279^287^[REPLACE] total = 23 * total + getValue ( i ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int i  isize  total 
[ADD]^^282^283^^^^279^287^[ADD] total = 23 * total + getValue ( i ) ; total = 23 * total + getFieldType ( i ) .hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int i  isize  total 
[REPLACE]^total = 23 * 2 * total + getFieldType ( i ) .hashCode (  ) ;^283^^^^^279^287^[REPLACE] total = 23 * total + getFieldType ( i ) .hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int i  isize  total 
[REPLACE]^for  ( int i = 0 , isize = size (  ) ; i < isize; i++ )  {^281^^^^^279^287^[REPLACE] for  ( int i = 0, isize = size (  ) ; i < isize; i++ )  {^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int i  isize  total 
[ADD]^^281^282^283^284^^279^287^[ADD] for  ( int i = 0, isize = size (  ) ; i < isize; i++ )  { total = 23 * total + getValue ( i ) ; total = 23 * total + getFieldType ( i ) .hashCode (  ) ; }^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int i  isize  total 
[REPLACE]^for  ( int i = 0; i < result.length; i++ )  { result[i] = getValue ( i ) ;^281^^^^^279^287^[REPLACE] for  ( int i = 0, isize = size (  ) ; i < isize; i++ )  {^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int i  isize  total 
[REPLACE]^total +;^285^^^^^279^287^[REPLACE] total += getChronology (  ) .hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int i  isize  total 
[ADD]^^285^^^^^279^287^[ADD] total += getChronology (  ) .hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int i  isize  total 
[REPLACE]^return i;^286^^^^^279^287^[REPLACE] return total;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  int i  isize  total 
[REPLACE]^if  (this  !=  other )  {^316^^^^^315^337^[REPLACE] if  ( this == other )  {^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[ADD]^return 0;^316^317^318^^^315^337^[ADD] if  ( this == other )  { return 0; }^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^return 1;^317^^^^^315^337^[REPLACE] return 0;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^return 0 >> 1;^317^^^^^315^337^[REPLACE] return 0;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^if  ( size (  )  + 5 != other.size (  )  + 5 )  {^319^^^^^315^337^[REPLACE] if  ( size (  )  != other.size (  )  )  {^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[ADD]^^319^320^321^^^315^337^[ADD] if  ( size (  )  != other.size (  )  )  { throw new ClassCastException  (" ")  ; }^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^throw new IllegalArgumentException  (" ")  ; ;^320^^^^^315^337^[REPLACE] throw new ClassCastException  (" ")  ;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^if  ( getFieldType ( i )   ==  other.getFieldType ( i )  )  {^323^^^^^315^337^[REPLACE] if  ( getFieldType ( i )  != other.getFieldType ( i )  )  {^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^throw new IllegalArgumentException  (" ")  ; ;^324^^^^^315^337^[REPLACE] throw new ClassCastException  (" ")  ;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[ADD]^^324^^^^^315^337^[ADD] throw new ClassCastException  (" ")  ;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^for  ( int i = 0, isize = size (  )  + 5; i < isize; i++ )  {^322^^^^^315^337^[REPLACE] for  ( int i = 0, isize = size (  ) ; i < isize; i++ )  {^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^if  ( getFieldType ( isize )   ==  other.getFieldType ( i )  )  {^323^^^^^315^337^[REPLACE] if  ( getFieldType ( i )  != other.getFieldType ( i )  )  {^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REMOVE]^if  (  ( size (  )  )  !=  ( other.size (  )  )  )  {     throw new ClassCastException ( "ReadablePartial objects must have matching field types" ) ; }^323^^^^^315^337^[REMOVE] ^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^for  ( int i = 0 , isize = size (  ) ; i < isize; i++ )  {^322^^^^^315^337^[REPLACE] for  ( int i = 0, isize = size (  ) ; i < isize; i++ )  {^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^for  ( int i = 0; i < result.length; i++ )  { result[i] = getValue ( i ) ;^322^^^^^315^337^[REPLACE] for  ( int i = 0, isize = size (  ) ; i < isize; i++ )  {^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^if  ( getValue ( i )   >=  other.getValue ( i )  )  {^329^^^^^315^337^[REPLACE] if  ( getValue ( i )  > other.getValue ( i )  )  {^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REMOVE]^if  (  ( getFieldType ( i ) .getDurationType (  )  )  == type )  {     return i; }^329^^^^^315^337^[REMOVE] ^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^return 1 >> 4;^330^^^^^315^337^[REPLACE] return 1;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^if  ( getValue ( i )   <=  other.getValue ( i )  )  {^332^^^^^315^337^[REPLACE] if  ( getValue ( i )  < other.getValue ( i )  )  {^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^return -3;^333^^^^^315^337^[REPLACE] return -1;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^for  ( int i = 0 , isize = length (  ) ; i < isize; i++ )  {^328^^^^^315^337^[REPLACE] for  ( int i = 0, isize = size (  ) ; i < isize; i++ )  {^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^return 1 / 0;^330^^^^^315^337^[REPLACE] return 1;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^if  ( getValue ( i )   >=  other .getType (  )   )  {^332^^^^^315^337^[REPLACE] if  ( getValue ( i )  < other.getValue ( i )  )  {^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[ADD]^return -1;^332^333^334^^^315^337^[ADD] if  ( getValue ( i )  < other.getValue ( i )  )  { return -1; }^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^return 1;^333^^^^^315^337^[REPLACE] return -1;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^return 4;^330^^^^^315^337^[REPLACE] return 1;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^return -1 << 4;^333^^^^^315^337^[REPLACE] return -1;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^return 1 * 1;^330^^^^^315^337^[REPLACE] return 1;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^return -2;^333^^^^^315^337^[REPLACE] return -1;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^for  ( int i = 0 , isize = size (  ) ; i < isize; i++ )  {^328^^^^^315^337^[REPLACE] for  ( int i = 0, isize = size (  ) ; i < isize; i++ )  {^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^for  ( int i = 0; i < result.length; i++ )  { result[i] = getValue ( i ) ;^328^^^^^315^337^[REPLACE] for  ( int i = 0, isize = size (  ) ; i < isize; i++ )  {^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^return 3;^336^^^^^315^337^[REPLACE] return 0;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadablePartial other [CLASS] AbstractPartial   [TYPE]  ReadablePartial other  [TYPE]  boolean false  true  [TYPE]  int i  isize 
[REPLACE]^if  ( partial != null )  {^355^^^^^354^359^[REPLACE] if  ( partial == null )  {^[METHOD] isAfter [TYPE] boolean [PARAMETER] ReadablePartial partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true 
[REPLACE]^throw new ClassCastException  (" ")  ; ;^356^^^^^354^359^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] isAfter [TYPE] boolean [PARAMETER] ReadablePartial partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true 
[ADD]^^356^^^^^354^359^[ADD] throw new IllegalArgumentException  (" ")  ;^[METHOD] isAfter [TYPE] boolean [PARAMETER] ReadablePartial partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true 
[REPLACE]^return compareTo ( partial )   ;^358^^^^^354^359^[REPLACE] return compareTo ( partial )  > 0;^[METHOD] isAfter [TYPE] boolean [PARAMETER] ReadablePartial partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true 
[REPLACE]^if  ( partial != null )  {^377^^^^^376^381^[REPLACE] if  ( partial == null )  {^[METHOD] isBefore [TYPE] boolean [PARAMETER] ReadablePartial partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true 
[REPLACE]^throw new ClassCastException  (" ")  ; ;^378^^^^^376^381^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] isBefore [TYPE] boolean [PARAMETER] ReadablePartial partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true 
[REPLACE]^return ;^378^^^^^376^381^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] isBefore [TYPE] boolean [PARAMETER] ReadablePartial partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true 
[ADD]^^378^^^^^376^381^[ADD] throw new IllegalArgumentException  (" ")  ;^[METHOD] isBefore [TYPE] boolean [PARAMETER] ReadablePartial partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true 
[REPLACE]^return compareTo ( partial )   ;^380^^^^^376^381^[REPLACE] return compareTo ( partial )  < 0;^[METHOD] isBefore [TYPE] boolean [PARAMETER] ReadablePartial partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true 
[REPLACE]^if  ( partial != null )  {^399^^^^^398^403^[REPLACE] if  ( partial == null )  {^[METHOD] isEqual [TYPE] boolean [PARAMETER] ReadablePartial partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true 
[REPLACE]^return ;^400^^^^^398^403^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] isEqual [TYPE] boolean [PARAMETER] ReadablePartial partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true 
[REPLACE]^throw new ClassCastException  (" ")  ; ;^400^^^^^398^403^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] isEqual [TYPE] boolean [PARAMETER] ReadablePartial partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true 
[REPLACE]^return compareTo ( partial )   || 0;^402^^^^^398^403^[REPLACE] return compareTo ( partial )  == 0;^[METHOD] isEqual [TYPE] boolean [PARAMETER] ReadablePartial partial [CLASS] AbstractPartial   [TYPE]  ReadablePartial partial  [TYPE]  boolean false  true 
[REPLACE]^if  ( formatter != null )  {^414^^^^^413^418^[REPLACE] if  ( formatter == null )  {^[METHOD] toString [TYPE] String [PARAMETER] DateTimeFormatter formatter [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFormatter formatter 
[REPLACE]^return i;^415^^^^^413^418^[REPLACE] return toString (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] DateTimeFormatter formatter [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFormatter formatter 
[REPLACE]^return formatter.print ( null ) ;^417^^^^^413^418^[REPLACE] return formatter.print ( this ) ;^[METHOD] toString [TYPE] String [PARAMETER] DateTimeFormatter formatter [CLASS] AbstractPartial   [TYPE]  boolean false  true  [TYPE]  DateTimeFormatter formatter 
