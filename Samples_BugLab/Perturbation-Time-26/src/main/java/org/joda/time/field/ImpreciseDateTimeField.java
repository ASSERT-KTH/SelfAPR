[buglab_swap_variables]^return FieldUtils.safeToInt ( getDifferenceAsLong ( subtrahendInstant, minuendInstant )  ) ;^91^^^^^90^92^return FieldUtils.safeToInt ( getDifferenceAsLong ( minuendInstant, subtrahendInstant )  ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifference [RETURN_TYPE] int   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return FieldUtils.safeToInt ( getDifferenceAsLong (  subtrahendInstant )  ) ;^91^^^^^90^92^return FieldUtils.safeToInt ( getDifferenceAsLong ( minuendInstant, subtrahendInstant )  ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifference [RETURN_TYPE] int   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return FieldUtils.safeToInt ( getDifferenceAsLong ( minuendInstant )  ) ;^91^^^^^90^92^return FieldUtils.safeToInt ( getDifferenceAsLong ( minuendInstant, subtrahendInstant )  ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifference [RETURN_TYPE] int   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^if  ( subtrahendInstant < minuendInstant )  {^118^^^^^117^134^if  ( minuendInstant < subtrahendInstant )  {^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return -getDifferenceAsLong ( minuendInstant, subtrahendInstant ) ;^119^^^^^117^134^return -getDifferenceAsLong ( subtrahendInstant, minuendInstant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return -getDifferenceAsLong (  minuendInstant ) ;^119^^^^^117^134^return -getDifferenceAsLong ( subtrahendInstant, minuendInstant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return -getDifferenceAsLong ( subtrahendInstant ) ;^119^^^^^117^134^return -getDifferenceAsLong ( subtrahendInstant, minuendInstant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^long difference =  ( iUnitMillis - subtrahendInstant )  / minuendInstant;^122^^^^^117^134^long difference =  ( minuendInstant - subtrahendInstant )  / iUnitMillis;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^long difference =  ( minuendInstant - iUnitMillis )  / subtrahendInstant;^122^^^^^117^134^long difference =  ( minuendInstant - subtrahendInstant )  / iUnitMillis;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^if  ( add ( minuendInstant, difference )  < subtrahendInstant )  {^123^^^^^117^134^if  ( add ( subtrahendInstant, difference )  < minuendInstant )  {^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^if  ( add (  difference )  < minuendInstant )  {^123^^^^^117^134^if  ( add ( subtrahendInstant, difference )  < minuendInstant )  {^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^if  ( add ( subtrahendInstant, minuendInstant )  < difference )  {^123^^^^^117^134^if  ( add ( subtrahendInstant, difference )  < minuendInstant )  {^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^if  ( add ( subtrahendInstant )  < minuendInstant )  {^123^^^^^117^134^if  ( add ( subtrahendInstant, difference )  < minuendInstant )  {^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^} else if  ( add ( minuendInstant, difference )  > subtrahendInstant )  {^128^^^^^117^134^} else if  ( add ( subtrahendInstant, difference )  > minuendInstant )  {^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^} else if  ( add (  difference )  > minuendInstant )  {^128^^^^^117^134^} else if  ( add ( subtrahendInstant, difference )  > minuendInstant )  {^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^} else if  ( add ( subtrahendInstant, minuendInstant )  > difference )  {^128^^^^^117^134^} else if  ( add ( subtrahendInstant, difference )  > minuendInstant )  {^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^} else if  ( add ( subtrahendInstant )  > minuendInstant )  {^128^^^^^117^134^} else if  ( add ( subtrahendInstant, difference )  > minuendInstant )  {^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^} while  ( add ( difference, subtrahendInstant )  > minuendInstant ) ;^131^^^^^117^134^} while  ( add ( subtrahendInstant, difference )  > minuendInstant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^} while  ( add (  difference )  > minuendInstant ) ;^131^^^^^117^134^} while  ( add ( subtrahendInstant, difference )  > minuendInstant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^} while  ( add ( subtrahendInstant )  > minuendInstant ) ;^131^^^^^117^134^} while  ( add ( subtrahendInstant, difference )  > minuendInstant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^} else if  ( add ( difference, subtrahendInstant )  > minuendInstant )  {^128^^^^^117^134^} else if  ( add ( subtrahendInstant, difference )  > minuendInstant )  {^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^} while  ( add ( difference, subtrahendInstant )  <= minuendInstant ) ;^126^^^^^117^134^} while  ( add ( subtrahendInstant, difference )  <= minuendInstant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^} while  ( add (  difference )  <= minuendInstant ) ;^126^^^^^117^134^} while  ( add ( subtrahendInstant, difference )  <= minuendInstant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^} while  ( add ( subtrahendInstant )  <= minuendInstant ) ;^126^^^^^117^134^} while  ( add ( subtrahendInstant, difference )  <= minuendInstant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^if  ( add ( difference, subtrahendInstant )  < minuendInstant )  {^123^^^^^117^134^if  ( add ( subtrahendInstant, difference )  < minuendInstant )  {^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifference ( duration + instant, instant ) ;^164^165^^^^163^166^return ImpreciseDateTimeField.this .getDifference ( instant + duration, instant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getValue [RETURN_TYPE] int   long duration long instant [VARIABLES] DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifference ( instant + duration ) ;^164^165^^^^163^166^return ImpreciseDateTimeField.this .getDifference ( instant + duration, instant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getValue [RETURN_TYPE] int   long duration long instant [VARIABLES] DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifference ( instant +  instant ) ;^164^165^^^^163^166^return ImpreciseDateTimeField.this .getDifference ( instant + duration, instant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getValue [RETURN_TYPE] int   long duration long instant [VARIABLES] DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifferenceAsLong ( duration + instant, instant ) ;^169^170^^^^168^171^return ImpreciseDateTimeField.this .getDifferenceAsLong ( instant + duration, instant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getValueAsLong [RETURN_TYPE] long   long duration long instant [VARIABLES] DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifferenceAsLong ( instant + duration ) ;^169^170^^^^168^171^return ImpreciseDateTimeField.this .getDifferenceAsLong ( instant + duration, instant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getValueAsLong [RETURN_TYPE] long   long duration long instant [VARIABLES] DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifferenceAsLong ( instant +  instant ) ;^169^170^^^^168^171^return ImpreciseDateTimeField.this .getDifferenceAsLong ( instant + duration, instant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getValueAsLong [RETURN_TYPE] long   long duration long instant [VARIABLES] DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add ( value, instant )  - instant;^174^^^^^173^175^return ImpreciseDateTimeField.this.add ( instant, value )  - instant;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getMillis [RETURN_TYPE] long   int value long instant [VARIABLES] boolean  DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  int  value  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add (  value )  - instant;^174^^^^^173^175^return ImpreciseDateTimeField.this.add ( instant, value )  - instant;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getMillis [RETURN_TYPE] long   int value long instant [VARIABLES] boolean  DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  int  value  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add ( instant )  - instant;^174^^^^^173^175^return ImpreciseDateTimeField.this.add ( instant, value )  - instant;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getMillis [RETURN_TYPE] long   int value long instant [VARIABLES] boolean  DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  int  value  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add ( value, instant )  - instant;^178^^^^^177^179^return ImpreciseDateTimeField.this.add ( instant, value )  - instant;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getMillis [RETURN_TYPE] long   long value long instant [VARIABLES] DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add (  value )  - instant;^178^^^^^177^179^return ImpreciseDateTimeField.this.add ( instant, value )  - instant;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getMillis [RETURN_TYPE] long   long value long instant [VARIABLES] DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add ( instant )  - instant;^178^^^^^177^179^return ImpreciseDateTimeField.this.add ( instant, value )  - instant;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getMillis [RETURN_TYPE] long   long value long instant [VARIABLES] DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add ( value, instant ) ;^182^^^^^181^183^return ImpreciseDateTimeField.this.add ( instant, value ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] add [RETURN_TYPE] long   long instant int value [VARIABLES] boolean  DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  int  value  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add (  value ) ;^182^^^^^181^183^return ImpreciseDateTimeField.this.add ( instant, value ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] add [RETURN_TYPE] long   long instant int value [VARIABLES] boolean  DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  int  value  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add ( instant ) ;^182^^^^^181^183^return ImpreciseDateTimeField.this.add ( instant, value ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] add [RETURN_TYPE] long   long instant int value [VARIABLES] boolean  DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  int  value  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add ( value, instant ) ;^186^^^^^185^187^return ImpreciseDateTimeField.this.add ( instant, value ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] add [RETURN_TYPE] long   long instant long value [VARIABLES] DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add (  value ) ;^186^^^^^185^187^return ImpreciseDateTimeField.this.add ( instant, value ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] add [RETURN_TYPE] long   long instant long value [VARIABLES] DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add ( instant ) ;^186^^^^^185^187^return ImpreciseDateTimeField.this.add ( instant, value ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] add [RETURN_TYPE] long   long instant long value [VARIABLES] DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifference ( subtrahendInstant, minuendInstant ) ;^190^191^^^^189^192^return ImpreciseDateTimeField.this .getDifference ( minuendInstant, subtrahendInstant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifference [RETURN_TYPE] int   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifference (  subtrahendInstant ) ;^190^191^^^^189^192^return ImpreciseDateTimeField.this .getDifference ( minuendInstant, subtrahendInstant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifference [RETURN_TYPE] int   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifference ( minuendInstant ) ;^190^191^^^^189^192^return ImpreciseDateTimeField.this .getDifference ( minuendInstant, subtrahendInstant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifference [RETURN_TYPE] int   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifferenceAsLong ( subtrahendInstant, minuendInstant ) ;^195^196^^^^194^197^return ImpreciseDateTimeField.this .getDifferenceAsLong ( minuendInstant, subtrahendInstant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifferenceAsLong (  subtrahendInstant ) ;^195^196^^^^194^197^return ImpreciseDateTimeField.this .getDifferenceAsLong ( minuendInstant, subtrahendInstant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifferenceAsLong ( minuendInstant ) ;^195^196^^^^194^197^return ImpreciseDateTimeField.this .getDifferenceAsLong ( minuendInstant, subtrahendInstant ) ;^[CLASS] ImpreciseDateTimeField LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] DurationField  iDurationField  long  difference  duration  iUnitMillis  instant  minuendInstant  serialVersionUID  subtrahendInstant  unitMillis  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifference ( duration + instant, instant ) ;^164^165^^^^163^166^return ImpreciseDateTimeField.this .getDifference ( instant + duration, instant ) ;^[CLASS] LinkedDurationField  [METHOD] getValue [RETURN_TYPE] int   long duration long instant [VARIABLES] long  duration  instant  serialVersionUID  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifference ( instant + duration ) ;^164^165^^^^163^166^return ImpreciseDateTimeField.this .getDifference ( instant + duration, instant ) ;^[CLASS] LinkedDurationField  [METHOD] getValue [RETURN_TYPE] int   long duration long instant [VARIABLES] long  duration  instant  serialVersionUID  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifference ( instant +  instant ) ;^164^165^^^^163^166^return ImpreciseDateTimeField.this .getDifference ( instant + duration, instant ) ;^[CLASS] LinkedDurationField  [METHOD] getValue [RETURN_TYPE] int   long duration long instant [VARIABLES] long  duration  instant  serialVersionUID  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifferenceAsLong ( duration + instant, instant ) ;^169^170^^^^168^171^return ImpreciseDateTimeField.this .getDifferenceAsLong ( instant + duration, instant ) ;^[CLASS] LinkedDurationField  [METHOD] getValueAsLong [RETURN_TYPE] long   long duration long instant [VARIABLES] long  duration  instant  serialVersionUID  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifferenceAsLong ( instant + duration ) ;^169^170^^^^168^171^return ImpreciseDateTimeField.this .getDifferenceAsLong ( instant + duration, instant ) ;^[CLASS] LinkedDurationField  [METHOD] getValueAsLong [RETURN_TYPE] long   long duration long instant [VARIABLES] long  duration  instant  serialVersionUID  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifferenceAsLong ( instant +  instant ) ;^169^170^^^^168^171^return ImpreciseDateTimeField.this .getDifferenceAsLong ( instant + duration, instant ) ;^[CLASS] LinkedDurationField  [METHOD] getValueAsLong [RETURN_TYPE] long   long duration long instant [VARIABLES] long  duration  instant  serialVersionUID  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add ( value, instant )  - instant;^174^^^^^173^175^return ImpreciseDateTimeField.this.add ( instant, value )  - instant;^[CLASS] LinkedDurationField  [METHOD] getMillis [RETURN_TYPE] long   int value long instant [VARIABLES] long  duration  instant  serialVersionUID  int  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add (  value )  - instant;^174^^^^^173^175^return ImpreciseDateTimeField.this.add ( instant, value )  - instant;^[CLASS] LinkedDurationField  [METHOD] getMillis [RETURN_TYPE] long   int value long instant [VARIABLES] long  duration  instant  serialVersionUID  int  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add ( instant )  - instant;^174^^^^^173^175^return ImpreciseDateTimeField.this.add ( instant, value )  - instant;^[CLASS] LinkedDurationField  [METHOD] getMillis [RETURN_TYPE] long   int value long instant [VARIABLES] long  duration  instant  serialVersionUID  int  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add ( value, instant )  - instant;^178^^^^^177^179^return ImpreciseDateTimeField.this.add ( instant, value )  - instant;^[CLASS] LinkedDurationField  [METHOD] getMillis [RETURN_TYPE] long   long value long instant [VARIABLES] long  duration  instant  serialVersionUID  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add (  value )  - instant;^178^^^^^177^179^return ImpreciseDateTimeField.this.add ( instant, value )  - instant;^[CLASS] LinkedDurationField  [METHOD] getMillis [RETURN_TYPE] long   long value long instant [VARIABLES] long  duration  instant  serialVersionUID  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add ( instant )  - instant;^178^^^^^177^179^return ImpreciseDateTimeField.this.add ( instant, value )  - instant;^[CLASS] LinkedDurationField  [METHOD] getMillis [RETURN_TYPE] long   long value long instant [VARIABLES] long  duration  instant  serialVersionUID  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add ( value, instant ) ;^182^^^^^181^183^return ImpreciseDateTimeField.this.add ( instant, value ) ;^[CLASS] LinkedDurationField  [METHOD] add [RETURN_TYPE] long   long instant int value [VARIABLES] long  duration  instant  serialVersionUID  value  int  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add (  value ) ;^182^^^^^181^183^return ImpreciseDateTimeField.this.add ( instant, value ) ;^[CLASS] LinkedDurationField  [METHOD] add [RETURN_TYPE] long   long instant int value [VARIABLES] long  duration  instant  serialVersionUID  value  int  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add ( instant ) ;^182^^^^^181^183^return ImpreciseDateTimeField.this.add ( instant, value ) ;^[CLASS] LinkedDurationField  [METHOD] add [RETURN_TYPE] long   long instant int value [VARIABLES] long  duration  instant  serialVersionUID  value  int  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add ( value, instant ) ;^186^^^^^185^187^return ImpreciseDateTimeField.this.add ( instant, value ) ;^[CLASS] LinkedDurationField  [METHOD] add [RETURN_TYPE] long   long instant long value [VARIABLES] long  duration  instant  serialVersionUID  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add (  value ) ;^186^^^^^185^187^return ImpreciseDateTimeField.this.add ( instant, value ) ;^[CLASS] LinkedDurationField  [METHOD] add [RETURN_TYPE] long   long instant long value [VARIABLES] long  duration  instant  serialVersionUID  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this.add ( instant ) ;^186^^^^^185^187^return ImpreciseDateTimeField.this.add ( instant, value ) ;^[CLASS] LinkedDurationField  [METHOD] add [RETURN_TYPE] long   long instant long value [VARIABLES] long  duration  instant  serialVersionUID  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifference ( subtrahendInstant, minuendInstant ) ;^190^191^^^^189^192^return ImpreciseDateTimeField.this .getDifference ( minuendInstant, subtrahendInstant ) ;^[CLASS] LinkedDurationField  [METHOD] getDifference [RETURN_TYPE] int   long minuendInstant long subtrahendInstant [VARIABLES] long  duration  instant  minuendInstant  serialVersionUID  subtrahendInstant  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifference (  subtrahendInstant ) ;^190^191^^^^189^192^return ImpreciseDateTimeField.this .getDifference ( minuendInstant, subtrahendInstant ) ;^[CLASS] LinkedDurationField  [METHOD] getDifference [RETURN_TYPE] int   long minuendInstant long subtrahendInstant [VARIABLES] long  duration  instant  minuendInstant  serialVersionUID  subtrahendInstant  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifference ( minuendInstant ) ;^190^191^^^^189^192^return ImpreciseDateTimeField.this .getDifference ( minuendInstant, subtrahendInstant ) ;^[CLASS] LinkedDurationField  [METHOD] getDifference [RETURN_TYPE] int   long minuendInstant long subtrahendInstant [VARIABLES] long  duration  instant  minuendInstant  serialVersionUID  subtrahendInstant  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifferenceAsLong ( subtrahendInstant, minuendInstant ) ;^195^196^^^^194^197^return ImpreciseDateTimeField.this .getDifferenceAsLong ( minuendInstant, subtrahendInstant ) ;^[CLASS] LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] long  duration  instant  minuendInstant  serialVersionUID  subtrahendInstant  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifferenceAsLong (  subtrahendInstant ) ;^195^196^^^^194^197^return ImpreciseDateTimeField.this .getDifferenceAsLong ( minuendInstant, subtrahendInstant ) ;^[CLASS] LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] long  duration  instant  minuendInstant  serialVersionUID  subtrahendInstant  value  boolean  
[buglab_swap_variables]^return ImpreciseDateTimeField.this .getDifferenceAsLong ( minuendInstant ) ;^195^196^^^^194^197^return ImpreciseDateTimeField.this .getDifferenceAsLong ( minuendInstant, subtrahendInstant ) ;^[CLASS] LinkedDurationField  [METHOD] getDifferenceAsLong [RETURN_TYPE] long   long minuendInstant long subtrahendInstant [VARIABLES] long  duration  instant  minuendInstant  serialVersionUID  subtrahendInstant  value  boolean  
