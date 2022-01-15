[REPLACE]^private static final long serialVersionUID ;^37^^^^^^^[REPLACE] private static final long serialVersionUID = -5576443481242007829L;^ [CLASS] DelegatedDurationField  
[REPLACE]^this ( iField, true ) ;^50^^^^^49^51^[REPLACE] this ( field, null ) ;^[METHOD] <init> [TYPE] DurationField) [PARAMETER] DurationField field [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long serialVersionUID  [TYPE]  DurationFieldType iType 
[REPLACE]^return iType.getName (  ) ;^60^^^^^59^66^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] DurationFieldType) [PARAMETER] DurationField field DurationFieldType type [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long serialVersionUID  [TYPE]  DurationFieldType iType  type 
[REPLACE]^if  ( field != null )  {^61^^^^^59^66^[REPLACE] if  ( field == null )  {^[METHOD] <init> [TYPE] DurationFieldType) [PARAMETER] DurationField field DurationFieldType type [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long serialVersionUID  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return ;^62^^^^^59^66^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] <init> [TYPE] DurationFieldType) [PARAMETER] DurationField field DurationFieldType type [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long serialVersionUID  [TYPE]  DurationFieldType iType  type 
[REPLACE]^iField =  null;^64^^^^^59^66^[REPLACE] iField = field;^[METHOD] <init> [TYPE] DurationFieldType) [PARAMETER] DurationField field DurationFieldType type [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long serialVersionUID  [TYPE]  DurationFieldType iType  type 
[ADD]^^64^65^^^^59^66^[ADD] iField = field; iType =  ( type == null ? field.getType (  )  : type ) ;^[METHOD] <init> [TYPE] DurationFieldType) [PARAMETER] DurationField field DurationFieldType type [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long serialVersionUID  [TYPE]  DurationFieldType iType  type 
[REPLACE]^iType  = iType ) ;^65^^^^^59^66^[REPLACE] iType =  ( type == null ? field.getType (  )  : type ) ;^[METHOD] <init> [TYPE] DurationFieldType) [PARAMETER] DurationField field DurationFieldType type [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long serialVersionUID  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return iType;^75^^^^^74^76^[REPLACE] return iField;^[METHOD] getWrappedField [TYPE] DurationField [PARAMETER] [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long serialVersionUID  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return iField.isSupported (  ) ;^79^^^^^78^80^[REPLACE] return iType;^[METHOD] getType [TYPE] DurationFieldType [PARAMETER] [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long serialVersionUID  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return iType .getName (  )  ;^83^^^^^82^84^[REPLACE] return iType.getName (  ) ;^[METHOD] getName [TYPE] String [PARAMETER] [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long serialVersionUID  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return iField.isPrecise (  ) ;^90^^^^^89^91^[REPLACE] return iField.isSupported (  ) ;^[METHOD] isSupported [TYPE] boolean [PARAMETER] [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long serialVersionUID  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return iField.toString (  ) ;^94^^^^^93^95^[REPLACE] return iField.isPrecise (  ) ;^[METHOD] isPrecise [TYPE] boolean [PARAMETER] [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long serialVersionUID  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return iField.getMillis ( duration ) ;^98^^^^^97^99^[REPLACE] return iField.getValue ( duration ) ;^[METHOD] getValue [TYPE] int [PARAMETER] long duration [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long duration  serialVersionUID  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return iField.getValue ( serialVersionUID ) ;^102^^^^^101^103^[REPLACE] return iField.getValueAsLong ( duration ) ;^[METHOD] getValueAsLong [TYPE] long [PARAMETER] long duration [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long duration  serialVersionUID  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return iField.getValue ( serialVersionUID, instant ) ;^106^^^^^105^107^[REPLACE] return iField.getValue ( duration, instant ) ;^[METHOD] getValue [TYPE] int [PARAMETER] long duration long instant [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long duration  instant  serialVersionUID  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return iField.getValue ( duration, instant ) ;^110^^^^^109^111^[REPLACE] return iField.getValueAsLong ( duration, instant ) ;^[METHOD] getValueAsLong [TYPE] long [PARAMETER] long duration long instant [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long duration  instant  serialVersionUID  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return iField .getMillis ( value , instant )  ;^114^^^^^113^115^[REPLACE] return iField.getMillis ( value ) ;^[METHOD] getMillis [TYPE] long [PARAMETER] int value [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long duration  instant  serialVersionUID  [TYPE]  int value  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return iField .getMillis ( 1 , duration )  ;^118^^^^^117^119^[REPLACE] return iField.getMillis ( value ) ;^[METHOD] getMillis [TYPE] long [PARAMETER] long value [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long duration  instant  serialVersionUID  value  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return iField .getMillis ( value )  ;^122^^^^^121^123^[REPLACE] return iField.getMillis ( value, instant ) ;^[METHOD] getMillis [TYPE] long [PARAMETER] int value long instant [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long duration  instant  serialVersionUID  value  [TYPE]  int value  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return iField.getMillis ( value, serialVersionUID ) ;^126^^^^^125^127^[REPLACE] return iField.getMillis ( value, instant ) ;^[METHOD] getMillis [TYPE] long [PARAMETER] long value long instant [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long duration  instant  serialVersionUID  value  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return iField.add ( serialVersionUID, value ) ;^130^^^^^129^131^[REPLACE] return iField.add ( instant, value ) ;^[METHOD] add [TYPE] long [PARAMETER] long instant int value [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long duration  instant  serialVersionUID  value  [TYPE]  int value  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return iField.isSupported (  ) ;^134^^^^^133^135^[REPLACE] return iField.add ( instant, value ) ;^[METHOD] add [TYPE] long [PARAMETER] long instant long value [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long duration  instant  serialVersionUID  value  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return iField.getDifference ( value, subtrahendInstant ) ;^138^^^^^137^139^[REPLACE] return iField.getDifference ( minuendInstant, subtrahendInstant ) ;^[METHOD] getDifference [TYPE] int [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long duration  instant  minuendInstant  serialVersionUID  subtrahendInstant  value  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return iField.getDifference ( minuendInstant, subtrahendInstant ) ;^142^^^^^141^143^[REPLACE] return iField.getDifferenceAsLong ( minuendInstant, subtrahendInstant ) ;^[METHOD] getDifferenceAsLong [TYPE] long [PARAMETER] long minuendInstant long subtrahendInstant [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long duration  instant  minuendInstant  serialVersionUID  subtrahendInstant  value  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return iField.getType (  ) ;^146^^^^^145^147^[REPLACE] return iField.getUnitMillis (  ) ;^[METHOD] getUnitMillis [TYPE] long [PARAMETER] [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField field  iField  [TYPE]  long duration  instant  minuendInstant  serialVersionUID  subtrahendInstant  value  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return iField.getValue ( durationField ) ;^150^^^^^149^151^[REPLACE] return iField.compareTo ( durationField ) ;^[METHOD] compareTo [TYPE] int [PARAMETER] DurationField durationField [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField durationField  field  iField  [TYPE]  long duration  instant  minuendInstant  serialVersionUID  subtrahendInstant  value  [TYPE]  DurationFieldType iType  type 
[REPLACE]^return ( "DurationField[" + iType + ']' ) ;^154^155^^^^153^156^[REPLACE] return  ( iType == null )  ? iField.toString (  )  : ( "DurationField[" + iType + ']' ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] DelegatedDurationField   [TYPE]  boolean false  true  [TYPE]  DurationField durationField  field  iField  [TYPE]  long duration  instant  minuendInstant  serialVersionUID  subtrahendInstant  value  [TYPE]  DurationFieldType iType  type 
