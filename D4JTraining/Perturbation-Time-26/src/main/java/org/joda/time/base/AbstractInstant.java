[REPLACE]^return toString (  ) ;^61^^^^^60^62^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] AbstractInstant() [PARAMETER] [CLASS] AbstractInstant   [TYPE]  boolean false  true 
[REPLACE]^return isAfter ( DateTimeUtils.currentTimeMillis (  )  ) ;^71^^^^^70^72^[REPLACE] return getChronology (  ) .getZone (  ) ;^[METHOD] getZone [TYPE] DateTimeZone [PARAMETER] [CLASS] AbstractInstant   [TYPE]  boolean false  true 
[REPLACE]^if  ( type != null )  {^89^^^^^88^93^[REPLACE] if  ( type == null )  {^[METHOD] get [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type 
[REPLACE]^return ;^90^^^^^88^93^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] get [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type 
[REPLACE]^return isAfter ( DateTimeUtils.currentTimeMillis (  )  ) ;^92^^^^^88^93^[REPLACE] return type.getField ( getChronology (  )  ) .get ( getMillis (  )  ) ;^[METHOD] get [TYPE] int [PARAMETER] DateTimeFieldType type [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type 
[REPLACE]^if  ( type != null )  {^103^^^^^102^107^[REPLACE] if  ( type == null )  {^[METHOD] isSupported [TYPE] boolean [PARAMETER] DateTimeFieldType type [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type 
[ADD]^^103^104^105^^^102^107^[ADD] if  ( type == null )  { return false; }^[METHOD] isSupported [TYPE] boolean [PARAMETER] DateTimeFieldType type [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type 
[REPLACE]^return true;^104^^^^^102^107^[REPLACE] return false;^[METHOD] isSupported [TYPE] boolean [PARAMETER] DateTimeFieldType type [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type 
[REPLACE]^return new MutableDateTime ( getMillis (  ) , getZone (  )  ) ;^106^^^^^102^107^[REPLACE] return type.getField ( getChronology (  )  ) .isSupported (  ) ;^[METHOD] isSupported [TYPE] boolean [PARAMETER] DateTimeFieldType type [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  DateTimeFieldType type 
[REPLACE]^if  ( field != false )  {^124^^^^^123^128^[REPLACE] if  ( field == null )  {^[METHOD] get [TYPE] int [PARAMETER] DateTimeField field [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  DateTimeField field 
[ADD]^^124^125^126^^^123^128^[ADD] if  ( field == null )  { throw new IllegalArgumentException  (" ")  ; }^[METHOD] get [TYPE] int [PARAMETER] DateTimeField field [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  DateTimeField field 
[REPLACE]^return ;^125^^^^^123^128^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] get [TYPE] int [PARAMETER] DateTimeField field [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  DateTimeField field 
[ADD]^^125^^^^^123^128^[ADD] throw new IllegalArgumentException  (" ")  ;^[METHOD] get [TYPE] int [PARAMETER] DateTimeField field [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  DateTimeField field 
[REPLACE]^return new Date ( getMillis (  )  ) ;^127^^^^^123^128^[REPLACE] return field.get ( getMillis (  )  ) ;^[METHOD] get [TYPE] int [PARAMETER] DateTimeField field [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  DateTimeField field 
[REPLACE]^return new Date ( getMillis (  )  ) ;^137^^^^^136^138^[REPLACE] return new Instant ( getMillis (  )  ) ;^[METHOD] toInstant [TYPE] Instant [PARAMETER] [CLASS] AbstractInstant   [TYPE]  boolean false  true 
[REPLACE]^return new MutableDateTime ( getMillis (  ) , getZone (  )  ) ;^146^^^^^145^147^[REPLACE] return new DateTime ( getMillis (  ) , getZone (  )  ) ;^[METHOD] toDateTime [TYPE] DateTime [PARAMETER] [CLASS] AbstractInstant   [TYPE]  boolean false  true 
[REPLACE]^return new MutableDateTime ( getMillis (  ) , ISOChronology.getInstance ( getZone (  )  )  ) ;^155^^^^^154^156^[REPLACE] return new DateTime ( getMillis (  ) , ISOChronology.getInstance ( getZone (  )  )  ) ;^[METHOD] toDateTimeISO [TYPE] DateTime [PARAMETER] [CLASS] AbstractInstant   [TYPE]  boolean false  true 
[REPLACE]^Chronology chrono = DateTimeUtils .getZone (  )  ;^165^^^^^164^168^[REPLACE] Chronology chrono = DateTimeUtils.getChronology ( getChronology (  )  ) ;^[METHOD] toDateTime [TYPE] DateTime [PARAMETER] DateTimeZone zone [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  Chronology chrono  [TYPE]  DateTimeZone zone 
[REPLACE]^chrono =  null.withZone ( zone ) ;^166^^^^^164^168^[REPLACE] chrono = chrono.withZone ( zone ) ;^[METHOD] toDateTime [TYPE] DateTime [PARAMETER] DateTimeZone zone [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  Chronology chrono  [TYPE]  DateTimeZone zone 
[REPLACE]^return new MutableDateTime ( getMillis (  ) , chronology ) ;^167^^^^^164^168^[REPLACE] return new DateTime ( getMillis (  ) , chrono ) ;^[METHOD] toDateTime [TYPE] DateTime [PARAMETER] DateTimeZone zone [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  Chronology chrono  [TYPE]  DateTimeZone zone 
[REPLACE]^return new MutableDateTime ( getMillis (  ) , chronology ) ;^177^^^^^176^178^[REPLACE] return new DateTime ( getMillis (  ) , chronology ) ;^[METHOD] toDateTime [TYPE] DateTime [PARAMETER] Chronology chronology [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  Chronology chronology 
[REPLACE]^return new MutableDateTime ( getMillis (  ) , chronology ) ;^191^^^^^190^192^[REPLACE] return new MutableDateTime ( getMillis (  ) , getZone (  )  ) ;^[METHOD] toMutableDateTime [TYPE] MutableDateTime [PARAMETER] [CLASS] AbstractInstant   [TYPE]  boolean false  true 
[REPLACE]^return new DateTime ( getMillis (  ) , ISOChronology.getInstance ( getZone (  )  )  ) ;^200^^^^^199^201^[REPLACE] return new MutableDateTime ( getMillis (  ) , ISOChronology.getInstance ( getZone (  )  )  ) ;^[METHOD] toMutableDateTimeISO [TYPE] MutableDateTime [PARAMETER] [CLASS] AbstractInstant   [TYPE]  boolean false  true 
[REPLACE]^Chronology chrono = DateTimeUtils .getZone (  )  ;^210^^^^^209^213^[REPLACE] Chronology chrono = DateTimeUtils.getChronology ( getChronology (  )  ) ;^[METHOD] toMutableDateTime [TYPE] MutableDateTime [PARAMETER] DateTimeZone zone [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  Chronology chrono  [TYPE]  DateTimeZone zone 
[ADD]^^210^^^^^209^213^[ADD] Chronology chrono = DateTimeUtils.getChronology ( getChronology (  )  ) ;^[METHOD] toMutableDateTime [TYPE] MutableDateTime [PARAMETER] DateTimeZone zone [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  Chronology chrono  [TYPE]  DateTimeZone zone 
[REPLACE]^chrono =  null.withZone ( zone ) ;^211^^^^^209^213^[REPLACE] chrono = chrono.withZone ( zone ) ;^[METHOD] toMutableDateTime [TYPE] MutableDateTime [PARAMETER] DateTimeZone zone [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  Chronology chrono  [TYPE]  DateTimeZone zone 
[REPLACE]^return new MutableDateTime ( getMillis (  ) , getZone (  )  ) ;^212^^^^^209^213^[REPLACE] return new MutableDateTime ( getMillis (  ) , chrono ) ;^[METHOD] toMutableDateTime [TYPE] MutableDateTime [PARAMETER] DateTimeZone zone [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  Chronology chrono  [TYPE]  DateTimeZone zone 
[REPLACE]^return new MutableDateTime ( getMillis (  ) , getZone (  )  ) ;^222^^^^^221^223^[REPLACE] return new MutableDateTime ( getMillis (  ) , chronology ) ;^[METHOD] toMutableDateTime [TYPE] MutableDateTime [PARAMETER] Chronology chronology [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  Chronology chronology 
[REPLACE]^return new Instant ( getMillis (  )  ) ;^235^^^^^234^236^[REPLACE] return new Date ( getMillis (  )  ) ;^[METHOD] toDate [TYPE] Date [PARAMETER] [CLASS] AbstractInstant   [TYPE]  boolean false  true 
[REPLACE]^if  ( this  !=  readableInstant )  {^259^^^^^257^269^[REPLACE] if  ( this == readableInstant )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object readableInstant [CLASS] AbstractInstant   [TYPE]  ReadableInstant otherInstant  [TYPE]  boolean false  true  [TYPE]  Object readableInstant 
[REPLACE]^return false;^260^^^^^257^269^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object readableInstant [CLASS] AbstractInstant   [TYPE]  ReadableInstant otherInstant  [TYPE]  boolean false  true  [TYPE]  Object readableInstant 
[REPLACE]^if  ( ! readableInstant instanceof ReadableInstant == false )  {^262^^^^^257^269^[REPLACE] if  ( readableInstant instanceof ReadableInstant == false )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object readableInstant [CLASS] AbstractInstant   [TYPE]  ReadableInstant otherInstant  [TYPE]  boolean false  true  [TYPE]  Object readableInstant 
[REPLACE]^return true;^263^^^^^257^269^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object readableInstant [CLASS] AbstractInstant   [TYPE]  ReadableInstant otherInstant  [TYPE]  boolean false  true  [TYPE]  Object readableInstant 
[REPLACE]^long instantMillis = DateTimeUtils.getInstantMillis ( instant ) ;^265^^^^^257^269^[REPLACE] ReadableInstant otherInstant =  ( ReadableInstant )  readableInstant;^[METHOD] equals [TYPE] boolean [PARAMETER] Object readableInstant [CLASS] AbstractInstant   [TYPE]  ReadableInstant otherInstant  [TYPE]  boolean false  true  [TYPE]  Object readableInstant 
[ADD]^^265^^^^^257^269^[ADD] ReadableInstant otherInstant =  ( ReadableInstant )  readableInstant;^[METHOD] equals [TYPE] boolean [PARAMETER] Object readableInstant [CLASS] AbstractInstant   [TYPE]  ReadableInstant otherInstant  [TYPE]  boolean false  true  [TYPE]  Object readableInstant 
[REPLACE]^return getMillis (  )  ;^266^267^268^^^257^269^[REPLACE] return getMillis (  )  == otherInstant.getMillis (  )  && FieldUtils.equals ( getChronology (  ) , otherInstant.getChronology (  )  ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object readableInstant [CLASS] AbstractInstant   [TYPE]  ReadableInstant otherInstant  [TYPE]  boolean false  true  [TYPE]  Object readableInstant 
[REPLACE]^return (  ( int )   ( getMillis (  )  ^  ( getMillis (  )  >>> 3 )  )  )  + ( getChronology (  ) .print (  )  ) ;^278^279^280^^^276^281^[REPLACE] return (  ( int )   ( getMillis (  )  ^  ( getMillis (  )  >>> 32 )  )  )  + ( getChronology (  ) .hashCode (  )  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] AbstractInstant   [TYPE]  boolean false  true 
[REPLACE]^if  ( this  &&  other )  {^296^^^^^295^312^[REPLACE] if  ( this == other )  {^[METHOD] compareTo [TYPE] int [PARAMETER] ReadableInstant other [CLASS] AbstractInstant   [TYPE]  ReadableInstant other  [TYPE]  boolean false  true  [TYPE]  long otherMillis  thisMillis 
[ADD]^^296^297^298^^^295^312^[ADD] if  ( this == other )  { return 0; }^[METHOD] compareTo [TYPE] int [PARAMETER] ReadableInstant other [CLASS] AbstractInstant   [TYPE]  ReadableInstant other  [TYPE]  boolean false  true  [TYPE]  long otherMillis  thisMillis 
[REPLACE]^return 3;^297^^^^^295^312^[REPLACE] return 0;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadableInstant other [CLASS] AbstractInstant   [TYPE]  ReadableInstant other  [TYPE]  boolean false  true  [TYPE]  long otherMillis  thisMillis 
[REPLACE]^return 1;^297^^^^^295^312^[REPLACE] return 0;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadableInstant other [CLASS] AbstractInstant   [TYPE]  ReadableInstant other  [TYPE]  boolean false  true  [TYPE]  long otherMillis  thisMillis 
[REPLACE]^long otherMillis = other.getChronology (  ) ;^300^^^^^295^312^[REPLACE] long otherMillis = other.getMillis (  ) ;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadableInstant other [CLASS] AbstractInstant   [TYPE]  ReadableInstant other  [TYPE]  boolean false  true  [TYPE]  long otherMillis  thisMillis 
[REPLACE]^long instantMillis = DateTimeUtils.getInstantMillis ( instant ) ;^301^^^^^295^312^[REPLACE] long thisMillis = getMillis (  ) ;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadableInstant other [CLASS] AbstractInstant   [TYPE]  ReadableInstant other  [TYPE]  boolean false  true  [TYPE]  long otherMillis  thisMillis 
[REPLACE]^if  ( thisMillis  &&  otherMillis )  {^304^^^^^295^312^[REPLACE] if  ( thisMillis == otherMillis )  {^[METHOD] compareTo [TYPE] int [PARAMETER] ReadableInstant other [CLASS] AbstractInstant   [TYPE]  ReadableInstant other  [TYPE]  boolean false  true  [TYPE]  long otherMillis  thisMillis 
[ADD]^return 0;^304^305^306^^^295^312^[ADD] if  ( thisMillis == otherMillis )  { return 0; }^[METHOD] compareTo [TYPE] int [PARAMETER] ReadableInstant other [CLASS] AbstractInstant   [TYPE]  ReadableInstant other  [TYPE]  boolean false  true  [TYPE]  long otherMillis  thisMillis 
[REPLACE]^return 2;^305^^^^^295^312^[REPLACE] return 0;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadableInstant other [CLASS] AbstractInstant   [TYPE]  ReadableInstant other  [TYPE]  boolean false  true  [TYPE]  long otherMillis  thisMillis 
[REPLACE]^if  ( thisMillis  ==  otherMillis )  {^307^^^^^295^312^[REPLACE] if  ( thisMillis < otherMillis )  {^[METHOD] compareTo [TYPE] int [PARAMETER] ReadableInstant other [CLASS] AbstractInstant   [TYPE]  ReadableInstant other  [TYPE]  boolean false  true  [TYPE]  long otherMillis  thisMillis 
[REPLACE]^return 1 - 4;^310^^^^^295^312^[REPLACE] return 1;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadableInstant other [CLASS] AbstractInstant   [TYPE]  ReadableInstant other  [TYPE]  boolean false  true  [TYPE]  long otherMillis  thisMillis 
[REPLACE]^return 1;^308^^^^^295^312^[REPLACE] return -1;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadableInstant other [CLASS] AbstractInstant   [TYPE]  ReadableInstant other  [TYPE]  boolean false  true  [TYPE]  long otherMillis  thisMillis 
[REPLACE]^return -1 / 0;^308^^^^^295^312^[REPLACE] return -1;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadableInstant other [CLASS] AbstractInstant   [TYPE]  ReadableInstant other  [TYPE]  boolean false  true  [TYPE]  long otherMillis  thisMillis 
[REPLACE]^return 3;^310^^^^^295^312^[REPLACE] return 1;^[METHOD] compareTo [TYPE] int [PARAMETER] ReadableInstant other [CLASS] AbstractInstant   [TYPE]  ReadableInstant other  [TYPE]  boolean false  true  [TYPE]  long otherMillis  thisMillis 
[REPLACE]^return  ( getMillis (  )   ;^323^^^^^322^324^[REPLACE] return  ( getMillis (  )  > instant ) ;^[METHOD] isAfter [TYPE] boolean [PARAMETER] long instant [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  long instant 
[REPLACE]^return isAfter ( DateTimeUtils.getChronology (  )  ) ;^333^^^^^332^334^[REPLACE] return isAfter ( DateTimeUtils.currentTimeMillis (  )  ) ;^[METHOD] isAfterNow [TYPE] boolean [PARAMETER] [CLASS] AbstractInstant   [TYPE]  boolean false  true 
[REPLACE]^long instantMillis =   instant   ;^344^^^^^343^346^[REPLACE] long instantMillis = DateTimeUtils.getInstantMillis ( instant ) ;^[METHOD] isAfter [TYPE] boolean [PARAMETER] ReadableInstant instant [CLASS] AbstractInstant   [TYPE]  ReadableInstant instant  [TYPE]  boolean false  true  [TYPE]  long instantMillis 
[ADD]^^344^^^^^343^346^[ADD] long instantMillis = DateTimeUtils.getInstantMillis ( instant ) ;^[METHOD] isAfter [TYPE] boolean [PARAMETER] ReadableInstant instant [CLASS] AbstractInstant   [TYPE]  ReadableInstant instant  [TYPE]  boolean false  true  [TYPE]  long instantMillis 
[REPLACE]^return isEqual ( instantMillis ) ;^345^^^^^343^346^[REPLACE] return isAfter ( instantMillis ) ;^[METHOD] isAfter [TYPE] boolean [PARAMETER] ReadableInstant instant [CLASS] AbstractInstant   [TYPE]  ReadableInstant instant  [TYPE]  boolean false  true  [TYPE]  long instantMillis 
[REPLACE]^return false ;^357^^^^^356^358^[REPLACE] return  ( getMillis (  )  < instant ) ;^[METHOD] isBefore [TYPE] boolean [PARAMETER] long instant [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  long instant 
[REPLACE]^return isAfter ( DateTimeUtils.currentTimeMillis (  )  ) ;^367^^^^^366^368^[REPLACE] return isBefore ( DateTimeUtils.currentTimeMillis (  )  ) ;^[METHOD] isBeforeNow [TYPE] boolean [PARAMETER] [CLASS] AbstractInstant   [TYPE]  boolean false  true 
[REPLACE]^long instantMillis =   instant   ;^378^^^^^377^380^[REPLACE] long instantMillis = DateTimeUtils.getInstantMillis ( instant ) ;^[METHOD] isBefore [TYPE] boolean [PARAMETER] ReadableInstant instant [CLASS] AbstractInstant   [TYPE]  ReadableInstant instant  [TYPE]  boolean false  true  [TYPE]  long instantMillis 
[REPLACE]^return isEqual ( instantMillis ) ;^379^^^^^377^380^[REPLACE] return isBefore ( instantMillis ) ;^[METHOD] isBefore [TYPE] boolean [PARAMETER] ReadableInstant instant [CLASS] AbstractInstant   [TYPE]  ReadableInstant instant  [TYPE]  boolean false  true  [TYPE]  long instantMillis 
[REPLACE]^return  ( getMillis (  )   ||  instant ) ;^391^^^^^390^392^[REPLACE] return  ( getMillis (  )  == instant ) ;^[METHOD] isEqual [TYPE] boolean [PARAMETER] long instant [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  long instant 
[REPLACE]^return isEqual ( DateTimeUtils.getChronology (  )  ) ;^401^^^^^400^402^[REPLACE] return isEqual ( DateTimeUtils.currentTimeMillis (  )  ) ;^[METHOD] isEqualNow [TYPE] boolean [PARAMETER] [CLASS] AbstractInstant   [TYPE]  boolean false  true 
[REPLACE]^long instantMillis =   instant   ;^412^^^^^411^414^[REPLACE] long instantMillis = DateTimeUtils.getInstantMillis ( instant ) ;^[METHOD] isEqual [TYPE] boolean [PARAMETER] ReadableInstant instant [CLASS] AbstractInstant   [TYPE]  ReadableInstant instant  [TYPE]  boolean false  true  [TYPE]  long instantMillis 
[ADD]^return isEqual ( instantMillis ) ;^412^413^^^^411^414^[ADD] long instantMillis = DateTimeUtils.getInstantMillis ( instant ) ; return isEqual ( instantMillis ) ;^[METHOD] isEqual [TYPE] boolean [PARAMETER] ReadableInstant instant [CLASS] AbstractInstant   [TYPE]  ReadableInstant instant  [TYPE]  boolean false  true  [TYPE]  long instantMillis 
[REPLACE]^return isAfter ( instantMillis ) ;^413^^^^^411^414^[REPLACE] return isEqual ( instantMillis ) ;^[METHOD] isEqual [TYPE] boolean [PARAMETER] ReadableInstant instant [CLASS] AbstractInstant   [TYPE]  ReadableInstant instant  [TYPE]  boolean false  true  [TYPE]  long instantMillis 
[REPLACE]^return ISODateTimeFormat.dateTime (  ) .print ( null ) ;^424^^^^^423^425^[REPLACE] return ISODateTimeFormat.dateTime (  ) .print ( this ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] AbstractInstant   [TYPE]  boolean false  true 
[REPLACE]^if  ( formatter != null )  {^436^^^^^435^440^[REPLACE] if  ( formatter == null )  {^[METHOD] toString [TYPE] String [PARAMETER] DateTimeFormatter formatter [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  DateTimeFormatter formatter 
[REPLACE]^return isAfter ( DateTimeUtils.currentTimeMillis (  )  ) ;^437^^^^^435^440^[REPLACE] return toString (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] DateTimeFormatter formatter [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  DateTimeFormatter formatter 
[REPLACE]^return formatter .get ( null )  ;^439^^^^^435^440^[REPLACE] return formatter.print ( this ) ;^[METHOD] toString [TYPE] String [PARAMETER] DateTimeFormatter formatter [CLASS] AbstractInstant   [TYPE]  boolean false  true  [TYPE]  DateTimeFormatter formatter 
