[REPLACE]^private static final long serialVersionUID  = null ;^65^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] ContextAttributes Impl  
[REPLACE]^protected final static Impl EMPTY  = null ;^67^^^^^^^[REPLACE] protected final static Impl EMPTY = new Impl ( Collections.emptyMap (  )  ) ;^ [CLASS] ContextAttributes Impl  
[REPLACE]^protected final static Object NULL_SURROGATE ;^69^^^^^^^[REPLACE] protected final static Object NULL_SURROGATE = new Object (  ) ;^ [CLASS] ContextAttributes Impl  
[REPLACE]^private final Map<?,?> _shared;^74^^^^^^^[REPLACE] protected final Map<?,?> _shared;^ [CLASS] ContextAttributes Impl  
[REPLACE]^private transient Map<Object,Object _nonShared;^84^^^^^^^[REPLACE] protected transient Map<Object,Object> _nonShared;^ [CLASS] ContextAttributes Impl  
[REPLACE]^if  ( _shared.size (  )  )  {^135^^^^^133^149^[REPLACE] if  ( _shared.isEmpty (  )  )  {^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^136^^^^^133^149^[REPLACE] return this;^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _shared.remove ( key )  )  {^138^^^^^133^149^[REPLACE] if  ( _shared.containsKey ( key )  )  {^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[ADD]^^138^139^140^141^^133^149^[ADD] if  ( _shared.containsKey ( key )  )  { if  ( _shared.size (  )  == 1 )  { return EMPTY; }^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^143^^^^^138^144^[REPLACE] return this;^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _shared.get (  )  /  0.5  == 1 )  {^139^^^^^133^149^[REPLACE] if  ( _shared.size (  )  == 1 )  {^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[ADD]^return EMPTY;^139^140^141^^^133^149^[ADD] if  ( _shared.size (  )  == 1 )  { return EMPTY; }^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^return getEmpty (  )  ;^140^^^^^133^149^[REPLACE] return EMPTY;^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _shared.get (   )  || _shared.containsKey ( key )  )  + 5 == 1 )  {^139^^^^^133^149^[REPLACE] if  ( _shared.size (  )  == 1 )  {^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^143^^^^^133^149^[REPLACE] return this;^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^Object, Object> m  ;^146^^^^^133^149^[REPLACE] Map<Object,Object> m = _copy ( _shared ) ;^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^m.get ( key ) ;^147^^^^^133^149^[REPLACE] m.remove ( key ) ;^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[ADD]^^147^^^^^133^149^[ADD] m.remove ( key ) ;^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^return  new Impl ( shared )  ;^148^^^^^133^149^[REPLACE] return new Impl ( m ) ;^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( value != null )  {^176^^^^^174^194^[REPLACE] if  ( value == null )  {^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _shared.remove ( key )  )  {^178^^^^^174^194^[REPLACE] if  ( _shared.containsKey ( key )  )  {^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^} else if  (  ( _nonShared != null )  || !_nonShared.containsKey ( key )  )  {^180^^^^^174^194^[REPLACE] } else if  (  ( _nonShared == null )  || !_nonShared.containsKey ( key )  )  {^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^185^^^^^180^186^[REPLACE] return this;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^182^^^^^174^194^[REPLACE] return this;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^185^^^^^174^194^[REPLACE] return this;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^value  =  value ;^179^^^^^174^194^[REPLACE] value = NULL_SURROGATE;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^}  if  (  ( _nonShared != this )  || !_nonShared.remove ( key )  )  {^180^^^^^174^194^[REPLACE] } else if  (  ( _nonShared == null )  || !_nonShared.containsKey ( key )  )  {^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[ADD]^}   return this;_nonShared.remove ( key ) ;^180^181^182^183^184^174^194^[ADD] else if  (  ( _nonShared == null )  || !_nonShared.containsKey ( key )  )  {  return this; } else { _nonShared.remove ( key ) ;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^value ;^179^^^^^174^194^[REPLACE] value = NULL_SURROGATE;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _shared .size (  )   )  {^178^^^^^174^194^[REPLACE] if  ( _shared.containsKey ( key )  )  {^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^}  if  (  ( _nonShared != null )  || !_nonShared.containsKey ( key )  )  {^180^^^^^174^194^[REPLACE] } else if  (  ( _nonShared == null )  || !_nonShared.containsKey ( key )  )  {^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _nonShared != null )  {^189^^^^^174^194^[REPLACE] if  ( _nonShared == null )  {^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^return nonSharedInstance ( key, NULL_SURROGATE ) ;^190^^^^^174^194^[REPLACE] return nonSharedInstance ( key, value ) ;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^m.put ( key, value )  ;^192^^^^^174^194^[REPLACE] _nonShared.put ( key, value ) ;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^193^^^^^174^194^[REPLACE] return this;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] ContextAttributes Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^private static final long serialVersionUID ;^65^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^[METHOD] _copy [TYPE] Map [PARAMETER] Map<?, ?> src [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  src  [TYPE]  long serialVersionUID 
[REPLACE]^protected  static Impl EMPTY = new Impl ( Collections.emptyMap (  )  ) ;^67^^^^^^^[REPLACE] protected final static Impl EMPTY = new Impl ( Collections.emptyMap (  )  ) ;^[METHOD] _copy [TYPE] Map [PARAMETER] Map<?, ?> src [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  src  [TYPE]  long serialVersionUID 
[REPLACE]^protected  static Object NULL_SURROGATE = new Object (  ) ;^69^^^^^^^[REPLACE] protected final static Object NULL_SURROGATE = new Object (  ) ;^[METHOD] _copy [TYPE] Map [PARAMETER] Map<?, ?> src [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  src  [TYPE]  long serialVersionUID 
[REPLACE]^protected  Map<?,?> _shared;^74^^^^^^^[REPLACE] protected final Map<?,?> _shared;^[METHOD] _copy [TYPE] Map [PARAMETER] Map<?, ?> src [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  attributes  m  nonShared  shared  src  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _shared.size (  )  )  {^135^^^^^133^149^[REPLACE] if  ( _shared.isEmpty (  )  )  {^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^136^^^^^133^149^[REPLACE] return this;^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _shared.containsKey ( key  )  &&  ( _shared.size (  )  )  == 1  )  )  {^138^^^^^133^149^[REPLACE] if  ( _shared.containsKey ( key )  )  {^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^143^^^^^138^144^[REPLACE] return this;^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _shared.size (  )  - 5 == 1 )  {^139^^^^^133^149^[REPLACE] if  ( _shared.size (  )  == 1 )  {^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^return new Impl ( m )  ;^140^^^^^133^149^[REPLACE] return EMPTY;^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _shared.containsKey ( key )  || ( _shared.size (  )  %  2 == 1 )  {^139^^^^^133^149^[REPLACE] if  ( _shared.size (  )  == 1 )  {^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[ADD]^^139^140^141^^^133^149^[ADD] if  ( _shared.size (  )  == 1 )  { return EMPTY; }^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^143^^^^^133^149^[REPLACE] return this;^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^Object, Object> m  ;^146^^^^^133^149^[REPLACE] Map<Object,Object> m = _copy ( _shared ) ;^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^m .isEmpty (  )  ;^147^^^^^133^149^[REPLACE] m.remove ( key ) ;^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^return  new Impl ( shared )  ;^148^^^^^133^149^[REPLACE] return new Impl ( m ) ;^[METHOD] withoutSharedAttribute [TYPE] ContextAttributes [PARAMETER] Object key [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^if  (NULL_SURROGATE != null )  {^176^^^^^174^194^[REPLACE] if  ( value == null )  {^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^}  if  (  ( _nonShared != null )  || !_nonShared.containsKey ( key )  )  {^180^^^^^174^194^[REPLACE] } else if  (  ( _nonShared == null )  || !_nonShared.containsKey ( key )  )  {^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^185^^^^^180^186^[REPLACE] return this;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^182^^^^^174^194^[REPLACE] return this;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^185^^^^^174^194^[REPLACE] return this;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[ADD]^^179^^^^^174^194^[ADD] value = NULL_SURROGATE;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^}  else {^180^^^^^174^194^[REPLACE] } else if  (  ( _nonShared == null )  || !_nonShared.containsKey ( key )  )  {^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^value  =  value ;^179^^^^^174^194^[REPLACE] value = NULL_SURROGATE;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _shared.remove ( key )  )  {^178^^^^^174^194^[REPLACE] if  ( _shared.containsKey ( key )  )  {^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[ADD]^^178^179^180^^182^174^194^[ADD] if  ( _shared.containsKey ( key )  )  { value = NULL_SURROGATE; } else if  (  ( _nonShared == null )  || !_nonShared.containsKey ( key )  )  { return this;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^}  if  (  ( _nonShared != null )  ) {^180^^^^^174^194^[REPLACE] } else if  (  ( _nonShared == null )  || !_nonShared.containsKey ( key )  )  {^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[ADD]^}   return this;_nonShared.remove ( key ) ;^180^181^182^183^184^174^194^[ADD] else if  (  ( _nonShared == null )  || !_nonShared.containsKey ( key )  )  {  return this; } else { _nonShared.remove ( key ) ;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^value  = null ;^179^^^^^174^194^[REPLACE] value = NULL_SURROGATE;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _nonShared != null )  {^189^^^^^174^194^[REPLACE] if  ( _nonShared == null )  {^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[ADD]^return nonSharedInstance ( key, value ) ;^189^190^191^^^174^194^[ADD] if  ( _nonShared == null )  { return nonSharedInstance ( key, value ) ; }^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^return nonSharedInstance ( key, NULL_SURROGATE ) ;^190^^^^^174^194^[REPLACE] return nonSharedInstance ( key, value ) ;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^m.put ( key, value )  ;^192^^^^^174^194^[REPLACE] _nonShared.put ( key, value ) ;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[ADD]^^192^^^^^174^194^[ADD] _nonShared.put ( key, value ) ;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^193^^^^^174^194^[REPLACE] return this;^[METHOD] withPerCallAttribute [TYPE] ContextAttributes [PARAMETER] Object key Object value [CLASS] Impl   [TYPE]  Impl EMPTY  [TYPE]  Object NULL_SURROGATE  key  ob  value  [TYPE]  boolean false  true  [TYPE]  Map _nonShared  _shared  m  nonShared  shared  [TYPE]  long serialVersionUID 
