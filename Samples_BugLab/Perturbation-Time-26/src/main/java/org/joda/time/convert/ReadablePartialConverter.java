[buglab_swap_variables]^return getChronology ( zone,  ( Chronology )  null ) .withZone ( object ) ;^53^^^^^52^54^return getChronology ( object,  ( Chronology )  null ) .withZone ( zone ) ;^[CLASS] ReadablePartialConverter  [METHOD] getChronology [RETURN_TYPE] Chronology   Object object DateTimeZone zone [VARIABLES] ReadablePartialConverter  INSTANCE  Object  object  boolean  DateTimeZone  zone  
[buglab_swap_variables]^return getChronology (   ( Chronology )  null ) .withZone ( zone ) ;^53^^^^^52^54^return getChronology ( object,  ( Chronology )  null ) .withZone ( zone ) ;^[CLASS] ReadablePartialConverter  [METHOD] getChronology [RETURN_TYPE] Chronology   Object object DateTimeZone zone [VARIABLES] ReadablePartialConverter  INSTANCE  Object  object  boolean  DateTimeZone  zone  
[buglab_swap_variables]^for  ( sizent i = 0; i < i; i++ )  {^90^^^^^86^95^for  ( int i = 0; i < size; i++ )  {^[CLASS] ReadablePartialConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  ReadablePartial  fieldSource  input  boolean  Object  object  int[]  values  Chronology  chrono  int  i  size  
[buglab_swap_variables]^values[i] = fieldSourcenput.get ( i.getFieldType ( i )  ) ;^91^^^^^86^95^values[i] = input.get ( fieldSource.getFieldType ( i )  ) ;^[CLASS] ReadablePartialConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  ReadablePartial  fieldSource  input  boolean  Object  object  int[]  values  Chronology  chrono  int  i  size  
[buglab_swap_variables]^values[i] = fieldSource.get ( input.getFieldType ( i )  ) ;^91^^^^^86^95^values[i] = input.get ( fieldSource.getFieldType ( i )  ) ;^[CLASS] ReadablePartialConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  ReadablePartial  fieldSource  input  boolean  Object  object  int[]  values  Chronology  chrono  int  i  size  
[buglab_swap_variables]^values[i] = i.get ( fieldSource.getFieldType ( input )  ) ;^91^^^^^86^95^values[i] = input.get ( fieldSource.getFieldType ( i )  ) ;^[CLASS] ReadablePartialConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  ReadablePartial  fieldSource  input  boolean  Object  object  int[]  values  Chronology  chrono  int  i  size  
[buglab_swap_variables]^values[i] = inputnput.get ( fieldSource.getFieldType ( i )  ) ;^91^^^^^86^95^values[i] = input.get ( fieldSource.getFieldType ( i )  ) ;^[CLASS] ReadablePartialConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  ReadablePartial  fieldSource  input  boolean  Object  object  int[]  values  Chronology  chrono  int  i  size  
[buglab_swap_variables]^chrono.validate ( values, fieldSource ) ;^93^^^^^86^95^chrono.validate ( fieldSource, values ) ;^[CLASS] ReadablePartialConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  ReadablePartial  fieldSource  input  boolean  Object  object  int[]  values  Chronology  chrono  int  i  size  
[buglab_swap_variables]^chrono.validate (  values ) ;^93^^^^^86^95^chrono.validate ( fieldSource, values ) ;^[CLASS] ReadablePartialConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  ReadablePartial  fieldSource  input  boolean  Object  object  int[]  values  Chronology  chrono  int  i  size  
[buglab_swap_variables]^chrono.validate ( fieldSource ) ;^93^^^^^86^95^chrono.validate ( fieldSource, values ) ;^[CLASS] ReadablePartialConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  ReadablePartial  fieldSource  input  boolean  Object  object  int[]  values  Chronology  chrono  int  i  size  
