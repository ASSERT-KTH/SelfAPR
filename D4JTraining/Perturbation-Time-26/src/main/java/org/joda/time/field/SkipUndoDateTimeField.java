[REPLACE]^private static final long serialVersionUID  = null ;^37^^^^^^^[REPLACE] private static final long serialVersionUID = -5875876968979L;^ [CLASS] SkipUndoDateTimeField  
[REPLACE]^private final  short  iSkip;^42^^^^^^^[REPLACE] private final int iSkip;^ [CLASS] SkipUndoDateTimeField  
[REPLACE]^this ( iChronology, field, 3 ) ;^53^^^^^52^54^[REPLACE] this ( chronology, field, 0 ) ;^[METHOD] <init> [TYPE] DateTimeField) [PARAMETER] Chronology chronology DateTimeField field [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int iMinValue  iSkip 
[REPLACE]^int value = super.get ( millis ) ;^64^^^^^63^75^[REPLACE] super ( field ) ;^[METHOD] <init> [TYPE] DateTimeField,int) [PARAMETER] Chronology chronology DateTimeField field int skip [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip 
[REMOVE]^int value = super.get ( millis ) ;^64^^^^^63^75^[REMOVE] ^[METHOD] <init> [TYPE] DateTimeField,int) [PARAMETER] Chronology chronology DateTimeField field int skip [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip 
[REPLACE]^iChronology =  null;^65^^^^^63^75^[REPLACE] iChronology = chronology;^[METHOD] <init> [TYPE] DateTimeField,int) [PARAMETER] Chronology chronology DateTimeField field int skip [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip 
[REPLACE]^int min = super.getMaximumValue (  ) ;^66^^^^^63^75^[REPLACE] int min = super.getMinimumValue (  ) ;^[METHOD] <init> [TYPE] DateTimeField,int) [PARAMETER] Chronology chronology DateTimeField field int skip [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip 
[REPLACE]^if  ( iSkip  >  skip )  {^67^^^^^63^75^[REPLACE] if  ( min < skip )  {^[METHOD] <init> [TYPE] DateTimeField,int) [PARAMETER] Chronology chronology DateTimeField field int skip [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip 
[ADD]^iMinValue = min + 1;iMinValue = skip;^67^68^69^70^^63^75^[ADD] if  ( min < skip )  { iMinValue = min + 1; } else if  ( min == skip + 1 )  { iMinValue = skip;^[METHOD] <init> [TYPE] DateTimeField,int) [PARAMETER] Chronology chronology DateTimeField field int skip [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip 
[REPLACE]^}  else {^69^^^^^63^75^[REPLACE] } else if  ( min == skip + 1 )  {^[METHOD] <init> [TYPE] DateTimeField,int) [PARAMETER] Chronology chronology DateTimeField field int skip [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip 
[REPLACE]^iMinValue = min + 1; ;^72^^^^^63^75^[REPLACE] iMinValue = min;^[METHOD] <init> [TYPE] DateTimeField,int) [PARAMETER] Chronology chronology DateTimeField field int skip [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip 
[ADD]^^72^^^^^63^75^[ADD] iMinValue = min;^[METHOD] <init> [TYPE] DateTimeField,int) [PARAMETER] Chronology chronology DateTimeField field int skip [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip 
[REPLACE]^iMinValue = min; ;^70^^^^^63^75^[REPLACE] iMinValue = skip;^[METHOD] <init> [TYPE] DateTimeField,int) [PARAMETER] Chronology chronology DateTimeField field int skip [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip 
[REPLACE]^iMinValue = min +skip;^68^^^^^63^75^[REPLACE] iMinValue = min + 1;^[METHOD] <init> [TYPE] DateTimeField,int) [PARAMETER] Chronology chronology DateTimeField field int skip [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip 
[ADD]^}   iMinValue = skip;iMinValue = min;^69^70^71^72^73^63^75^[ADD] else if  ( min == skip + 1 )  { iMinValue = skip; } else { iMinValue = min; }^[METHOD] <init> [TYPE] DateTimeField,int) [PARAMETER] Chronology chronology DateTimeField field int skip [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip 
[REPLACE]^iMinValue =skip + 1;^68^^^^^63^75^[REPLACE] iMinValue = min + 1;^[METHOD] <init> [TYPE] DateTimeField,int) [PARAMETER] Chronology chronology DateTimeField field int skip [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip 
[ADD]^^70^^^^^63^75^[ADD] iMinValue = skip;^[METHOD] <init> [TYPE] DateTimeField,int) [PARAMETER] Chronology chronology DateTimeField field int skip [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip 
[REPLACE]^iSkip =  min;^74^^^^^63^75^[REPLACE] iSkip = skip;^[METHOD] <init> [TYPE] DateTimeField,int) [PARAMETER] Chronology chronology DateTimeField field int skip [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  DateTimeField field  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip 
[REPLACE]^int value = super.get ( serialVersionUID ) ;^79^^^^^78^84^[REPLACE] int value = super.get ( millis ) ;^[METHOD] get [TYPE] int [PARAMETER] long millis [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long millis  serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip  value 
[REPLACE]^if  ( iMinValue  !=  iSkip )  {^80^^^^^78^84^[REPLACE] if  ( value < iSkip )  {^[METHOD] get [TYPE] int [PARAMETER] long millis [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long millis  serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip  value 
[ADD]^value++;^80^81^82^^^78^84^[ADD] if  ( value < iSkip )  { value++; }^[METHOD] get [TYPE] int [PARAMETER] long millis [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long millis  serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip  value 
[REPLACE]^return iMinValue;^83^^^^^78^84^[REPLACE] return value;^[METHOD] get [TYPE] int [PARAMETER] long millis [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long millis  serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip  value 
[REPLACE]^FieldUtils.verifyValueBounds ( this, iMinValue, iMinValue, getMaximumValue (  )  ) ;^87^^^^^86^92^[REPLACE] FieldUtils.verifyValueBounds ( this, value, iMinValue, getMaximumValue (  )  ) ;^[METHOD] set [TYPE] long [PARAMETER] long millis int value [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long millis  serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip  value 
[ADD]^^87^88^89^90^^86^92^[ADD] FieldUtils.verifyValueBounds ( this, value, iMinValue, getMaximumValue (  )  ) ; if  ( value <= iSkip )  { value--; }^[METHOD] set [TYPE] long [PARAMETER] long millis int value [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long millis  serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip  value 
[REPLACE]^if  ( value  ==  iSkip )  {^88^^^^^86^92^[REPLACE] if  ( value <= iSkip )  {^[METHOD] set [TYPE] long [PARAMETER] long millis int value [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long millis  serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip  value 
[REPLACE]^return super.set ( serialVersionUID, value ) ;^91^^^^^86^92^[REPLACE] return super.set ( millis, value ) ;^[METHOD] set [TYPE] long [PARAMETER] long millis int value [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long millis  serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip  value 
[REPLACE]^return value;^95^^^^^94^96^[REPLACE] return iMinValue;^[METHOD] getMinimumValue [TYPE] int [PARAMETER] [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long millis  serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip  value 
[REPLACE]^return super.set ( millis, value ) ;^99^^^^^98^100^[REPLACE] return getType (  ) .getField ( iChronology ) ;^[METHOD] readResolve [TYPE] Object [PARAMETER] [CLASS] SkipUndoDateTimeField   [TYPE]  Chronology chronology  iChronology  [TYPE]  boolean false  true  [TYPE]  long millis  serialVersionUID  [TYPE]  int iMinValue  iSkip  min  skip  value 
