[buglab_swap_variables]^_hashCode = hash ( typed, key ) ;^211^^^^^207^212^_hashCode = hash ( key, typed ) ;^[CLASS] SerializerCache TypeKey  [METHOD] <init> [RETURN_TYPE] Class,boolean)   Class<?> key boolean typed [VARIABLES] JavaType  _type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  Class  _class  key  int  _hashCode  
[buglab_swap_variables]^_hashCode = hash (  typed ) ;^211^^^^^207^212^_hashCode = hash ( key, typed ) ;^[CLASS] SerializerCache TypeKey  [METHOD] <init> [RETURN_TYPE] Class,boolean)   Class<?> key boolean typed [VARIABLES] JavaType  _type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  Class  _class  key  int  _hashCode  
[buglab_swap_variables]^_hashCode = hash ( key ) ;^211^^^^^207^212^_hashCode = hash ( key, typed ) ;^[CLASS] SerializerCache TypeKey  [METHOD] <init> [RETURN_TYPE] Class,boolean)   Class<?> key boolean typed [VARIABLES] JavaType  _type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  Class  _class  key  int  _hashCode  
[buglab_swap_variables]^_hashCode = hash ( typed, key ) ;^218^^^^^214^219^_hashCode = hash ( key, typed ) ;^[CLASS] SerializerCache TypeKey  [METHOD] <init> [RETURN_TYPE] JavaType,boolean)   JavaType key boolean typed [VARIABLES] JavaType  _type  key  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  Class  _class  key  int  _hashCode  
[buglab_swap_variables]^_hashCode = hash (  typed ) ;^218^^^^^214^219^_hashCode = hash ( key, typed ) ;^[CLASS] SerializerCache TypeKey  [METHOD] <init> [RETURN_TYPE] JavaType,boolean)   JavaType key boolean typed [VARIABLES] JavaType  _type  key  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  Class  _class  key  int  _hashCode  
[buglab_swap_variables]^_hashCode = hash ( key ) ;^218^^^^^214^219^_hashCode = hash ( key, typed ) ;^[CLASS] SerializerCache TypeKey  [METHOD] <init> [RETURN_TYPE] JavaType,boolean)   JavaType key boolean typed [VARIABLES] JavaType  _type  key  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  Class  _class  key  int  _hashCode  
[buglab_swap_variables]^return type.get ( new TypeKey ( _sharedMap, false )  ) ;^73^^^^^70^75^return _sharedMap.get ( new TypeKey ( type, false )  ) ;^[CLASS] SerializerCache TypeKey  [METHOD] untypedValueSerializer [RETURN_TYPE] JsonSerializer   Class<?> type [VARIABLES] JavaType  _type  key  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  key  type  int  _hashCode  
[buglab_swap_variables]^return _sharedMap.get ( new TypeKey (  false )  ) ;^73^^^^^70^75^return _sharedMap.get ( new TypeKey ( type, false )  ) ;^[CLASS] SerializerCache TypeKey  [METHOD] untypedValueSerializer [RETURN_TYPE] JsonSerializer   Class<?> type [VARIABLES] JavaType  _type  key  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  key  type  int  _hashCode  
[buglab_swap_variables]^return type.get ( new TypeKey ( _sharedMap, false )  ) ;^80^^^^^77^82^return _sharedMap.get ( new TypeKey ( type, false )  ) ;^[CLASS] SerializerCache TypeKey  [METHOD] untypedValueSerializer [RETURN_TYPE] JsonSerializer   JavaType type [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  key  type  int  _hashCode  
[buglab_swap_variables]^return _sharedMap.get ( new TypeKey (  false )  ) ;^80^^^^^77^82^return _sharedMap.get ( new TypeKey ( type, false )  ) ;^[CLASS] SerializerCache TypeKey  [METHOD] untypedValueSerializer [RETURN_TYPE] JsonSerializer   JavaType type [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  key  type  int  _hashCode  
[buglab_swap_variables]^return type.get ( new TypeKey ( _sharedMap, true )  ) ;^87^^^^^84^89^return _sharedMap.get ( new TypeKey ( type, true )  ) ;^[CLASS] SerializerCache TypeKey  [METHOD] typedValueSerializer [RETURN_TYPE] JsonSerializer   JavaType type [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  key  type  int  _hashCode  
[buglab_swap_variables]^return _sharedMap.get ( new TypeKey (  true )  ) ;^87^^^^^84^89^return _sharedMap.get ( new TypeKey ( type, true )  ) ;^[CLASS] SerializerCache TypeKey  [METHOD] typedValueSerializer [RETURN_TYPE] JsonSerializer   JavaType type [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  key  type  int  _hashCode  
[buglab_swap_variables]^return cls.get ( new TypeKey ( _sharedMap, true )  ) ;^94^^^^^91^96^return _sharedMap.get ( new TypeKey ( cls, true )  ) ;^[CLASS] SerializerCache TypeKey  [METHOD] typedValueSerializer [RETURN_TYPE] JsonSerializer   Class<?> cls [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  int  _hashCode  
[buglab_swap_variables]^return _sharedMap.get ( new TypeKey (  true )  ) ;^94^^^^^91^96^return _sharedMap.get ( new TypeKey ( cls, true )  ) ;^[CLASS] SerializerCache TypeKey  [METHOD] typedValueSerializer [RETURN_TYPE] JsonSerializer   Class<?> cls [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  int  _hashCode  
[buglab_swap_variables]^if  ( _sharedMap.put ( new TypeKey ( ser, true ) , type )  == null )  {^112^^^^^109^117^if  ( _sharedMap.put ( new TypeKey ( type, true ) , ser )  == null )  {^[CLASS] SerializerCache TypeKey  [METHOD] addTypedSerializer [RETURN_TYPE] void   JavaType type Object> ser [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  JsonSerializer  ser  int  _hashCode  
[buglab_swap_variables]^if  ( _sharedMap.put ( new TypeKey (  true ) , ser )  == null )  {^112^^^^^109^117^if  ( _sharedMap.put ( new TypeKey ( type, true ) , ser )  == null )  {^[CLASS] SerializerCache TypeKey  [METHOD] addTypedSerializer [RETURN_TYPE] void   JavaType type Object> ser [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  JsonSerializer  ser  int  _hashCode  
[buglab_swap_variables]^if  ( _sharedMap.put ( new TypeKey ( type, true )  )  == null )  {^112^^^^^109^117^if  ( _sharedMap.put ( new TypeKey ( type, true ) , ser )  == null )  {^[CLASS] SerializerCache TypeKey  [METHOD] addTypedSerializer [RETURN_TYPE] void   JavaType type Object> ser [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  JsonSerializer  ser  int  _hashCode  
[buglab_swap_variables]^if  ( ser.put ( new TypeKey ( type, true ) , _sharedMap )  == null )  {^112^^^^^109^117^if  ( _sharedMap.put ( new TypeKey ( type, true ) , ser )  == null )  {^[CLASS] SerializerCache TypeKey  [METHOD] addTypedSerializer [RETURN_TYPE] void   JavaType type Object> ser [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  JsonSerializer  ser  int  _hashCode  
[buglab_swap_variables]^if  ( type.put ( new TypeKey ( _sharedMap, true ) , ser )  == null )  {^112^^^^^109^117^if  ( _sharedMap.put ( new TypeKey ( type, true ) , ser )  == null )  {^[CLASS] SerializerCache TypeKey  [METHOD] addTypedSerializer [RETURN_TYPE] void   JavaType type Object> ser [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  JsonSerializer  ser  int  _hashCode  
[buglab_swap_variables]^if  ( cls.put ( new TypeKey ( _sharedMap, true ) , ser )  == null )  {^122^^^^^119^127^if  ( _sharedMap.put ( new TypeKey ( cls, true ) , ser )  == null )  {^[CLASS] SerializerCache TypeKey  [METHOD] addTypedSerializer [RETURN_TYPE] void   Class<?> cls Object> ser [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  JsonSerializer  ser  int  _hashCode  
[buglab_swap_variables]^if  ( _sharedMap.put ( new TypeKey (  true ) , ser )  == null )  {^122^^^^^119^127^if  ( _sharedMap.put ( new TypeKey ( cls, true ) , ser )  == null )  {^[CLASS] SerializerCache TypeKey  [METHOD] addTypedSerializer [RETURN_TYPE] void   Class<?> cls Object> ser [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  JsonSerializer  ser  int  _hashCode  
[buglab_swap_variables]^if  ( ser.put ( new TypeKey ( cls, true ) , _sharedMap )  == null )  {^122^^^^^119^127^if  ( _sharedMap.put ( new TypeKey ( cls, true ) , ser )  == null )  {^[CLASS] SerializerCache TypeKey  [METHOD] addTypedSerializer [RETURN_TYPE] void   Class<?> cls Object> ser [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  JsonSerializer  ser  int  _hashCode  
[buglab_swap_variables]^if  ( _sharedMap.put ( new TypeKey ( cls, true )  )  == null )  {^122^^^^^119^127^if  ( _sharedMap.put ( new TypeKey ( cls, true ) , ser )  == null )  {^[CLASS] SerializerCache TypeKey  [METHOD] addTypedSerializer [RETURN_TYPE] void   Class<?> cls Object> ser [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  JsonSerializer  ser  int  _hashCode  
[buglab_swap_variables]^if  ( _sharedMap.put ( new TypeKey ( ser, true ) , cls )  == null )  {^122^^^^^119^127^if  ( _sharedMap.put ( new TypeKey ( cls, true ) , ser )  == null )  {^[CLASS] SerializerCache TypeKey  [METHOD] addTypedSerializer [RETURN_TYPE] void   Class<?> cls Object> ser [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  JsonSerializer  ser  int  _hashCode  
[buglab_swap_variables]^if  ( _sharedMap.put ( new TypeKey ( ser, false ) , type )  == null )  {^134^^^^^129^149^if  ( _sharedMap.put ( new TypeKey ( type, false ) , ser )  == null )  {^[CLASS] SerializerCache TypeKey  [METHOD] addAndResolveNonTypedSerializer [RETURN_TYPE] void   Class<?> type Object> ser SerializerProvider provider [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  JsonSerializer  ser  SerializerProvider  provider  int  _hashCode  
[buglab_swap_variables]^if  ( _sharedMap.put ( new TypeKey (  false ) , ser )  == null )  {^134^^^^^129^149^if  ( _sharedMap.put ( new TypeKey ( type, false ) , ser )  == null )  {^[CLASS] SerializerCache TypeKey  [METHOD] addAndResolveNonTypedSerializer [RETURN_TYPE] void   Class<?> type Object> ser SerializerProvider provider [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  JsonSerializer  ser  SerializerProvider  provider  int  _hashCode  
[buglab_swap_variables]^if  ( _sharedMap.put ( new TypeKey ( type, false )  )  == null )  {^134^^^^^129^149^if  ( _sharedMap.put ( new TypeKey ( type, false ) , ser )  == null )  {^[CLASS] SerializerCache TypeKey  [METHOD] addAndResolveNonTypedSerializer [RETURN_TYPE] void   Class<?> type Object> ser SerializerProvider provider [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  JsonSerializer  ser  SerializerProvider  provider  int  _hashCode  
[buglab_swap_variables]^if  ( type.put ( new TypeKey ( _sharedMap, false ) , ser )  == null )  {^134^^^^^129^149^if  ( _sharedMap.put ( new TypeKey ( type, false ) , ser )  == null )  {^[CLASS] SerializerCache TypeKey  [METHOD] addAndResolveNonTypedSerializer [RETURN_TYPE] void   Class<?> type Object> ser SerializerProvider provider [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  JsonSerializer  ser  SerializerProvider  provider  int  _hashCode  
[buglab_swap_variables]^if  ( _sharedMap.put ( new TypeKey ( ser, false ) , type )  == null )  {^156^^^^^151^171^if  ( _sharedMap.put ( new TypeKey ( type, false ) , ser )  == null )  {^[CLASS] SerializerCache TypeKey  [METHOD] addAndResolveNonTypedSerializer [RETURN_TYPE] void   JavaType type Object> ser SerializerProvider provider [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  JsonSerializer  ser  SerializerProvider  provider  int  _hashCode  
[buglab_swap_variables]^if  ( _sharedMap.put ( new TypeKey (  false ) , ser )  == null )  {^156^^^^^151^171^if  ( _sharedMap.put ( new TypeKey ( type, false ) , ser )  == null )  {^[CLASS] SerializerCache TypeKey  [METHOD] addAndResolveNonTypedSerializer [RETURN_TYPE] void   JavaType type Object> ser SerializerProvider provider [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  JsonSerializer  ser  SerializerProvider  provider  int  _hashCode  
[buglab_swap_variables]^if  ( _sharedMap.put ( new TypeKey ( type, false )  )  == null )  {^156^^^^^151^171^if  ( _sharedMap.put ( new TypeKey ( type, false ) , ser )  == null )  {^[CLASS] SerializerCache TypeKey  [METHOD] addAndResolveNonTypedSerializer [RETURN_TYPE] void   JavaType type Object> ser SerializerProvider provider [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  JsonSerializer  ser  SerializerProvider  provider  int  _hashCode  
[buglab_swap_variables]^if  ( ser.put ( new TypeKey ( type, false ) , _sharedMap )  == null )  {^156^^^^^151^171^if  ( _sharedMap.put ( new TypeKey ( type, false ) , ser )  == null )  {^[CLASS] SerializerCache TypeKey  [METHOD] addAndResolveNonTypedSerializer [RETURN_TYPE] void   JavaType type Object> ser SerializerProvider provider [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  JsonSerializer  ser  SerializerProvider  provider  int  _hashCode  
[buglab_swap_variables]^if  ( type.put ( new TypeKey ( _sharedMap, false ) , ser )  == null )  {^156^^^^^151^171^if  ( _sharedMap.put ( new TypeKey ( type, false ) , ser )  == null )  {^[CLASS] SerializerCache TypeKey  [METHOD] addAndResolveNonTypedSerializer [RETURN_TYPE] void   JavaType type Object> ser SerializerProvider provider [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  JsonSerializer  ser  SerializerProvider  provider  int  _hashCode  
[buglab_swap_variables]^if  ( other == _isTyped )  {^283^^^^^275^290^if  ( other._isTyped == _isTyped )  {^[CLASS] SerializerCache TypeKey  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  Object  o  TypeKey  other  int  _hashCode  hash  
[buglab_swap_variables]^if  ( _isTyped == other._isTyped )  {^283^^^^^275^290^if  ( other._isTyped == _isTyped )  {^[CLASS] SerializerCache TypeKey  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  Object  o  TypeKey  other  int  _hashCode  hash  
[buglab_swap_variables]^return _class._class == other;^285^^^^^275^290^return other._class == _class;^[CLASS] SerializerCache TypeKey  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  Object  o  TypeKey  other  int  _hashCode  hash  
[buglab_swap_variables]^return _class == other._class;^285^^^^^275^290^return other._class == _class;^[CLASS] SerializerCache TypeKey  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  Object  o  TypeKey  other  int  _hashCode  hash  
[buglab_swap_variables]^return other == _class;^285^^^^^275^290^return other._class == _class;^[CLASS] SerializerCache TypeKey  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  Object  o  TypeKey  other  int  _hashCode  hash  
[buglab_swap_variables]^return _type.equals ( other._type._type ) ;^287^^^^^275^290^return _type.equals ( other._type ) ;^[CLASS] SerializerCache TypeKey  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  Object  o  TypeKey  other  int  _hashCode  hash  
[buglab_swap_variables]^return other.equals ( _type._type ) ;^287^^^^^275^290^return _type.equals ( other._type ) ;^[CLASS] SerializerCache TypeKey  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  Object  o  TypeKey  other  int  _hashCode  hash  
[buglab_swap_variables]^return other._type.equals ( _type ) ;^287^^^^^275^290^return _type.equals ( other._type ) ;^[CLASS] SerializerCache TypeKey  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] JavaType  _type  key  type  boolean  _isTyped  typed  HashMap  _sharedMap  ReadOnlyClassToSerializerMap  _readOnlyMap  m  Class  _class  cls  key  type  Object  o  TypeKey  other  int  _hashCode  hash  
[buglab_swap_variables]^_hashCode = hash ( typed, key ) ;^211^^^^^207^212^_hashCode = hash ( key, typed ) ;^[CLASS] TypeKey  [METHOD] <init> [RETURN_TYPE] Class,boolean)   Class<?> key boolean typed [VARIABLES] JavaType  _type  Class  _class  key  boolean  _isTyped  typed  int  _hashCode  
[buglab_swap_variables]^_hashCode = hash (  typed ) ;^211^^^^^207^212^_hashCode = hash ( key, typed ) ;^[CLASS] TypeKey  [METHOD] <init> [RETURN_TYPE] Class,boolean)   Class<?> key boolean typed [VARIABLES] JavaType  _type  Class  _class  key  boolean  _isTyped  typed  int  _hashCode  
[buglab_swap_variables]^_hashCode = hash ( key ) ;^211^^^^^207^212^_hashCode = hash ( key, typed ) ;^[CLASS] TypeKey  [METHOD] <init> [RETURN_TYPE] Class,boolean)   Class<?> key boolean typed [VARIABLES] JavaType  _type  Class  _class  key  boolean  _isTyped  typed  int  _hashCode  
[buglab_swap_variables]^_hashCode = hash ( typed, key ) ;^218^^^^^214^219^_hashCode = hash ( key, typed ) ;^[CLASS] TypeKey  [METHOD] <init> [RETURN_TYPE] JavaType,boolean)   JavaType key boolean typed [VARIABLES] JavaType  _type  key  Class  _class  key  boolean  _isTyped  typed  int  _hashCode  
[buglab_swap_variables]^_hashCode = hash (  typed ) ;^218^^^^^214^219^_hashCode = hash ( key, typed ) ;^[CLASS] TypeKey  [METHOD] <init> [RETURN_TYPE] JavaType,boolean)   JavaType key boolean typed [VARIABLES] JavaType  _type  key  Class  _class  key  boolean  _isTyped  typed  int  _hashCode  
[buglab_swap_variables]^_hashCode = hash ( key ) ;^218^^^^^214^219^_hashCode = hash ( key, typed ) ;^[CLASS] TypeKey  [METHOD] <init> [RETURN_TYPE] JavaType,boolean)   JavaType key boolean typed [VARIABLES] JavaType  _type  key  Class  _class  key  boolean  _isTyped  typed  int  _hashCode  
[buglab_swap_variables]^if  ( _isTyped._isTyped == other )  {^283^^^^^275^290^if  ( other._isTyped == _isTyped )  {^[CLASS] TypeKey  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] JavaType  _type  key  type  Class  _class  cls  key  Object  o  TypeKey  other  boolean  _isTyped  typed  int  _hashCode  hash  
[buglab_swap_variables]^if  ( _isTyped == other._isTyped )  {^283^^^^^275^290^if  ( other._isTyped == _isTyped )  {^[CLASS] TypeKey  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] JavaType  _type  key  type  Class  _class  cls  key  Object  o  TypeKey  other  boolean  _isTyped  typed  int  _hashCode  hash  
[buglab_swap_variables]^return _class._class == other;^285^^^^^275^290^return other._class == _class;^[CLASS] TypeKey  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] JavaType  _type  key  type  Class  _class  cls  key  Object  o  TypeKey  other  boolean  _isTyped  typed  int  _hashCode  hash  
[buglab_swap_variables]^return _class == other._class;^285^^^^^275^290^return other._class == _class;^[CLASS] TypeKey  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] JavaType  _type  key  type  Class  _class  cls  key  Object  o  TypeKey  other  boolean  _isTyped  typed  int  _hashCode  hash  
[buglab_swap_variables]^return other._class._class == _class;^285^^^^^275^290^return other._class == _class;^[CLASS] TypeKey  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] JavaType  _type  key  type  Class  _class  cls  key  Object  o  TypeKey  other  boolean  _isTyped  typed  int  _hashCode  hash  
[buglab_swap_variables]^return other == _class;^285^^^^^275^290^return other._class == _class;^[CLASS] TypeKey  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] JavaType  _type  key  type  Class  _class  cls  key  Object  o  TypeKey  other  boolean  _isTyped  typed  int  _hashCode  hash  
[buglab_swap_variables]^return other.equals ( _type._type ) ;^287^^^^^275^290^return _type.equals ( other._type ) ;^[CLASS] TypeKey  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] JavaType  _type  key  type  Class  _class  cls  key  Object  o  TypeKey  other  boolean  _isTyped  typed  int  _hashCode  hash  
[buglab_swap_variables]^return other._type.equals ( _type ) ;^287^^^^^275^290^return _type.equals ( other._type ) ;^[CLASS] TypeKey  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] JavaType  _type  key  type  Class  _class  cls  key  Object  o  TypeKey  other  boolean  _isTyped  typed  int  _hashCode  hash  
[buglab_swap_variables]^return _type.equals ( other ) ;^287^^^^^275^290^return _type.equals ( other._type ) ;^[CLASS] TypeKey  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] JavaType  _type  key  type  Class  _class  cls  key  Object  o  TypeKey  other  boolean  _isTyped  typed  int  _hashCode  hash  
[buglab_swap_variables]^return _type.equals ( other._type._type ) ;^287^^^^^275^290^return _type.equals ( other._type ) ;^[CLASS] TypeKey  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] JavaType  _type  key  type  Class  _class  cls  key  Object  o  TypeKey  other  boolean  _isTyped  typed  int  _hashCode  hash  
