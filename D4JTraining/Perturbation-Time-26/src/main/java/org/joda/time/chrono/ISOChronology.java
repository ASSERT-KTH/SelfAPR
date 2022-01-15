[REPLACE]^private static final long serialVersionUID  = null ;^52^^^^^^^[REPLACE] private static final long serialVersionUID = -6212696554273812441L;^ [CLASS] ISOChronology Stub  
[REPLACE]^private  final ISOChronology INSTANCE_UTC;^55^^^^^^^[REPLACE] private static final ISOChronology INSTANCE_UTC;^ [CLASS] ISOChronology Stub  
[REPLACE]^private static final int FAST_CACHE_SIZE  = null ;^57^^^^^^^[REPLACE] private static final int FAST_CACHE_SIZE = 64;^ [CLASS] ISOChronology Stub  
[REPLACE]^private static final Map<DateTimeZone, ISOChronology> cCache  = null ;^63^^^^^^^[REPLACE] private static final Map<DateTimeZone, ISOChronology> cCache = new HashMap<DateTimeZone, ISOChronology> (  ) ;^ [CLASS] ISOChronology Stub  
[REPLACE]^private  final long serialVersionUID = -6212696554273812441L;^212^^^^^^^[REPLACE] private static final long serialVersionUID = -6212696554273812441L;^ [CLASS] ISOChronology Stub  
[REPLACE]^super ( base, true ) ;^122^^^^^121^123^[REPLACE] super ( base, null ) ;^[METHOD] <init> [TYPE] Chronology) [PARAMETER] Chronology base [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Chronology base  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  [TYPE]  DateTimeZone iZone 
[REPLACE]^iZone =  null;^217^^^^^216^218^[REPLACE] iZone = zone;^[METHOD] <init> [TYPE] DateTimeZone) [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^return new Stub ( getZone (  )  ) ;^77^^^^^76^78^[REPLACE] return INSTANCE_UTC;^[METHOD] getInstanceUTC [TYPE] ISOChronology [PARAMETER] [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^return getInstance ( DateTimeZone.getID (  )  ) ;^86^^^^^85^87^[REPLACE] return getInstance ( DateTimeZone.getDefault (  )  ) ;^[METHOD] getInstance [TYPE] ISOChronology [PARAMETER] [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^if  ( zone !=iZone )  {^96^^^^^95^113^[REPLACE] if  ( zone == null )  {^[METHOD] getInstance [TYPE] ISOChronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[ADD]^^96^97^98^^^95^113^[ADD] if  ( zone == null )  { zone = DateTimeZone.getDefault (  ) ; }^[METHOD] getInstance [TYPE] ISOChronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^zone  =  zone ;^97^^^^^95^113^[REPLACE] zone = DateTimeZone.getDefault (  ) ;^[METHOD] getInstance [TYPE] ISOChronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^zone ;^97^^^^^95^113^[REPLACE] zone = DateTimeZone.getDefault (  ) ;^[METHOD] getInstance [TYPE] ISOChronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^int index = System.identityHashCode ( zone )  |  (index ) ;^99^^^^^95^113^[REPLACE] int index = System.identityHashCode ( zone )  &  ( FAST_CACHE_SIZE - 1 ) ;^[METHOD] getInstance [TYPE] ISOChronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^DateTimeZone zone = getZone (  ) ;^100^^^^^95^113^[REPLACE] ISOChronology chrono = cFastCache[index];^[METHOD] getInstance [TYPE] ISOChronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^if  ( chrono != null && chrono.getZone (  )  != zone )  {^101^^^^^95^113^[REPLACE] if  ( chrono != null && chrono.getZone (  )  == zone )  {^[METHOD] getInstance [TYPE] ISOChronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^return INSTANCE_UTC;^102^^^^^95^113^[REPLACE] return chrono;^[METHOD] getInstance [TYPE] ISOChronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^if  (INSTANCE_UTC != null )  {^106^^^^^95^113^[REPLACE] if  ( chrono == null )  {^[METHOD] getInstance [TYPE] ISOChronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^chrono =  new ISOChronology ( ZonedChronology.getInstance ( INSTANCE_UTC, iZone )  ) ;^107^^^^^95^113^[REPLACE] chrono = new ISOChronology ( ZonedChronology.getInstance ( INSTANCE_UTC, zone )  ) ;^[METHOD] getInstance [TYPE] ISOChronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^chrono =  cCache.get ( iZone ) ;^105^^^^^95^113^[REPLACE] chrono = cCache.get ( zone ) ;^[METHOD] getInstance [TYPE] ISOChronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[ADD]^^105^^^^^95^113^[ADD] chrono = cCache.get ( zone ) ;^[METHOD] getInstance [TYPE] ISOChronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[ADD]^cCache.put ( zone, chrono ) ;^107^108^^^^95^113^[ADD] chrono = new ISOChronology ( ZonedChronology.getInstance ( INSTANCE_UTC, zone )  ) ; cCache.put ( zone, chrono ) ;^[METHOD] getInstance [TYPE] ISOChronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^cFastCache[index]  =  cFastCache[index] ;^111^^^^^95^113^[REPLACE] cFastCache[index] = chrono;^[METHOD] getInstance [TYPE] ISOChronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^return INSTANCE_UTC;^112^^^^^95^113^[REPLACE] return chrono;^[METHOD] getInstance [TYPE] ISOChronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^return new Stub ( getZone (  )  ) ;^133^^^^^132^134^[REPLACE] return INSTANCE_UTC;^[METHOD] withUTC [TYPE] Chronology [PARAMETER] [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^if  ( iZone != null )  {^143^^^^^142^150^[REPLACE] if  ( zone == null )  {^[METHOD] withZone [TYPE] Chronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^zone  =  zone ;^144^^^^^142^150^[REPLACE] zone = DateTimeZone.getDefault (  ) ;^[METHOD] withZone [TYPE] Chronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[ADD]^^144^^^^^142^150^[ADD] zone = DateTimeZone.getDefault (  ) ;^[METHOD] withZone [TYPE] Chronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^if  ( zone  && iZone (  )  )  {^146^^^^^142^150^[REPLACE] if  ( zone == getZone (  )  )  {^[METHOD] withZone [TYPE] Chronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^return null;^147^^^^^142^150^[REPLACE] return this;^[METHOD] withZone [TYPE] Chronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^return getInstance ( iZone ) ;^149^^^^^142^150^[REPLACE] return getInstance ( zone ) ;^[METHOD] withZone [TYPE] Chronology [PARAMETER] DateTimeZone zone [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^ISOChronology chrono = cFastCache[index];^160^^^^^159^166^[REPLACE] String str = "ISOChronology";^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  String str  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^ISOChronology chrono = cFastCache[index];^161^^^^^159^166^[REPLACE] DateTimeZone zone = getZone (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  String str  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[ADD]^^161^^^^^159^166^[ADD] DateTimeZone zone = getZone (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  String str  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^if  ( zone == this  )  {^162^^^^^159^166^[REPLACE] if  ( zone != null )  {^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  String str  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[ADD]^str = str + '[' + zone.getID (  )  + ']';^162^163^164^^^159^166^[ADD] if  ( zone != null )  { str = str + '[' + zone.getID (  )  + ']'; }^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  String str  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^str = str  <  '['  <  zone.getID (  )   <  ']';^163^^^^^159^166^[REPLACE] str = str + '[' + zone.getID (  )  + ']';^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  String str  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[ADD]^^163^^^^^159^166^[ADD] str = str + '[' + zone.getID (  )  + ']';^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  String str  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^str = str  >  '['  >  zone.getID (  )   >  ']';^163^^^^^159^166^[REPLACE] str = str + '[' + zone.getID (  )  + ']';^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  String str  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^return getInstance ( zone ) ;^165^^^^^159^166^[REPLACE] return str;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  String str  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^if  ( getBase (  ) .getZone (  )   &&  DateTimeZone.UTC )  {^169^^^^^168^180^[REPLACE] if  ( getBase (  ) .getZone (  )  == DateTimeZone.UTC )  {^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[ADD]^^169^170^171^172^173^168^180^[ADD] if  ( getBase (  ) .getZone (  )  == DateTimeZone.UTC )  {  fields.centuryOfEra = new DividedDateTimeField ( ISOYearOfEraDateTimeField.INSTANCE, DateTimeFieldType.centuryOfEra (  ) , 100 ) ; fields.yearOfCentury = new RemainderDateTimeField (^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^fields.centuryOfEra = new DividedDateTimeField ( ISOYearOfEraDateTimeField.INSTANCE, DateTimeFieldType.centuryOfEra (  ) , 100 * 1 ) ;^171^172^^^^168^180^[REPLACE] fields.centuryOfEra = new DividedDateTimeField ( ISOYearOfEraDateTimeField.INSTANCE, DateTimeFieldType.centuryOfEra (  ) , 100 ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^fields.yearOfCentury =  new RemainderDateTimeField ( ( DividedDateTimeField )  null.centuryOfEra, DateTimeFieldType.yearOfCentury (  )  ) ;^173^174^^^^168^180^[REPLACE] fields.yearOfCentury = new RemainderDateTimeField ( ( DividedDateTimeField )  fields.centuryOfEra, DateTimeFieldType.yearOfCentury (  )  ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^fields.weekyearOfCentury =  new RemainderDateTimeField ( ( DividedDateTimeField )  null.centuryOfEra, DateTimeFieldType.weekyearOfCentury (  )  ) ;^175^176^^^^168^180^[REPLACE] fields.weekyearOfCentury = new RemainderDateTimeField ( ( DividedDateTimeField )  fields.centuryOfEra, DateTimeFieldType.weekyearOfCentury (  )  ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^fields.centuries =  null.centuryOfEra.getDurationField (  ) ;^178^^^^^168^180^[REPLACE] fields.centuries = fields.centuryOfEra.getDurationField (  ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^fields.centuryOfEra = new DividedDateTimeField ( ISOYearOfEraDateTimeField.INSTANCE, DateTimeFieldType.centuryOfEra (  ) , 40 ) ;^171^172^^^^168^180^[REPLACE] fields.centuryOfEra = new DividedDateTimeField ( ISOYearOfEraDateTimeField.INSTANCE, DateTimeFieldType.centuryOfEra (  ) , 100 ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[ADD]^^178^^^^^168^180^[ADD] fields.centuries = fields.centuryOfEra.getDurationField (  ) ;^[METHOD] assemble [TYPE] void [PARAMETER] Fields fields [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  Fields fields  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^return super .equals ( obj )  ;^190^^^^^189^191^[REPLACE] return super.equals ( obj ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Object obj  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^return "ISO".hashCode (  )  * 11  ;^200^^^^^199^201^[REPLACE] return "ISO".hashCode (  )  * 11 + getZone (  ) .hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^return ISOChronology.getInstance ( iZone ) ;^208^^^^^207^209^[REPLACE] return new Stub ( getZone (  )  ) ;^[METHOD] writeReplace [TYPE] Object [PARAMETER] [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^return ISOChronology .getInstance ( chrono , iZone )  ;^221^^^^^220^222^[REPLACE] return ISOChronology.getInstance ( iZone ) ;^[METHOD] readResolve [TYPE] Object [PARAMETER] [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^out .readObject ( null )  ;^225^^^^^224^226^[REPLACE] out.writeObject ( iZone ) ;^[METHOD] writeObject [TYPE] void [PARAMETER] ObjectOutputStream out [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  ObjectOutputStream out  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^iZone =   ( DateTimeZone ) null.readObject (  ) ;^231^^^^^228^232^[REPLACE] iZone =  ( DateTimeZone ) in.readObject (  ) ;^[METHOD] readObject [TYPE] void [PARAMETER] ObjectInputStream in [CLASS] ISOChronology Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone  [TYPE]  ObjectInputStream in 
[REPLACE]^private static final long serialVersionUID ;^212^^^^^^^[REPLACE] private static final long serialVersionUID = -6212696554273812441L;^[METHOD] readObject [TYPE] void [PARAMETER] ObjectInputStream in [CLASS] Stub   [TYPE]  ISOChronology INSTANCE_UTC  chrono  [TYPE]  ISOChronology[] cFastCache  [TYPE]  boolean false  true  [TYPE]  Map cCache  [TYPE]  long serialVersionUID  [TYPE]  int FAST_CACHE_SIZE  index  [TYPE]  DateTimeZone iZone  zone  [TYPE]  ObjectInputStream in 
[REPLACE]^iZone =  null;^217^^^^^216^218^[REPLACE] iZone = zone;^[METHOD] <init> [TYPE] DateTimeZone) [PARAMETER] DateTimeZone zone [CLASS] Stub   [TYPE]  long serialVersionUID  [TYPE]  DateTimeZone iZone  zone  [TYPE]  boolean false  true 
[REPLACE]^return   iZone   ;^221^^^^^220^222^[REPLACE] return ISOChronology.getInstance ( iZone ) ;^[METHOD] readResolve [TYPE] Object [PARAMETER] [CLASS] Stub   [TYPE]  long serialVersionUID  [TYPE]  DateTimeZone iZone  zone  [TYPE]  boolean false  true 
[REPLACE]^return ISOChronology.getInstance ( iZone ) ;^225^^^^^224^226^[REPLACE] out.writeObject ( iZone ) ;^[METHOD] writeObject [TYPE] void [PARAMETER] ObjectOutputStream out [CLASS] Stub   [TYPE]  boolean false  true  [TYPE]  ObjectOutputStream out  [TYPE]  long serialVersionUID  [TYPE]  DateTimeZone iZone  zone 
[REPLACE]^iZone =   ( DateTimeZone ) null.readObject (  ) ;^231^^^^^228^232^[REPLACE] iZone =  ( DateTimeZone ) in.readObject (  ) ;^[METHOD] readObject [TYPE] void [PARAMETER] ObjectInputStream in [CLASS] Stub   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  DateTimeZone iZone  zone  [TYPE]  ObjectInputStream in 
