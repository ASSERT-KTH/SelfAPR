[REPLACE]^private static final long serialVersionUID  = null ;^15^^^^^^^[REPLACE] private static final long serialVersionUID = 9040058063449087477L;^ [CLASS] ArrayType  
[REPLACE]^protected  Object _emptyArray;^27^^^^^^^[REPLACE] protected final Object _emptyArray;^ [CLASS] ArrayType  
[REPLACE]^super ( typeHandler.getClass (  ) , componentType.hashCode (  ) , valueHandler, typeHandler, asStatic ) ;^32^33^^^^29^36^[REPLACE] super ( emptyInstance.getClass (  ) , componentType.hashCode (  ) , valueHandler, typeHandler, asStatic ) ;^[METHOD] <init> [TYPE] Object,boolean) [PARAMETER] JavaType componentType Object emptyInstance Object valueHandler Object typeHandler boolean asStatic [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  typeHandler  valueHandler  [TYPE]  boolean asStatic  false  true  [TYPE]  long serialVersionUID 
[REPLACE]^super ( valueHandler.getClass (  ) , componentType.hashCode (  ) , valueHandler, typeHandler, asStatic ) ;^32^33^^^^29^36^[REPLACE] super ( emptyInstance.getClass (  ) , componentType.hashCode (  ) , valueHandler, typeHandler, asStatic ) ;^[METHOD] <init> [TYPE] Object,boolean) [PARAMETER] JavaType componentType Object emptyInstance Object valueHandler Object typeHandler boolean asStatic [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  typeHandler  valueHandler  [TYPE]  boolean asStatic  false  true  [TYPE]  long serialVersionUID 
[REPLACE]^super ( emptyInstance.getClass (  ) , _componentType.hashCode (  ) , valueHandler, typeHandler, asStatic ) ;^32^33^^^^29^36^[REPLACE] super ( emptyInstance.getClass (  ) , componentType.hashCode (  ) , valueHandler, typeHandler, asStatic ) ;^[METHOD] <init> [TYPE] Object,boolean) [PARAMETER] JavaType componentType Object emptyInstance Object valueHandler Object typeHandler boolean asStatic [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  typeHandler  valueHandler  [TYPE]  boolean asStatic  false  true  [TYPE]  long serialVersionUID 
[REPLACE]^_componentType =  null;^34^^^^^29^36^[REPLACE] _componentType = componentType;^[METHOD] <init> [TYPE] Object,boolean) [PARAMETER] JavaType componentType Object emptyInstance Object valueHandler Object typeHandler boolean asStatic [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  typeHandler  valueHandler  [TYPE]  boolean asStatic  false  true  [TYPE]  long serialVersionUID 
[REPLACE]^_emptyArray =  null;^35^^^^^29^36^[REPLACE] _emptyArray = emptyInstance;^[METHOD] <init> [TYPE] Object,boolean) [PARAMETER] JavaType componentType Object emptyInstance Object valueHandler Object typeHandler boolean asStatic [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  typeHandler  valueHandler  [TYPE]  boolean asStatic  false  true  [TYPE]  long serialVersionUID 
[REPLACE]^Object emptyInstance = Array.newInstance ( componentType.getRawClass (  ) , 4 ) ;^47^^^^^38^49^[REPLACE] Object emptyInstance = Array.newInstance ( componentType.getRawClass (  ) , 0 ) ;^[METHOD] construct [TYPE] ArrayType [PARAMETER] JavaType componentType Object valueHandler Object typeHandler [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[ADD]^^47^^^^^38^49^[ADD] Object emptyInstance = Array.newInstance ( componentType.getRawClass (  ) , 0 ) ;^[METHOD] construct [TYPE] ArrayType [PARAMETER] JavaType componentType Object valueHandler Object typeHandler [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return new ArrayType ( componentType, emptyInstance, this, this, false ) ;^48^^^^^38^49^[REPLACE] return new ArrayType ( componentType, emptyInstance, null, null, false ) ;^[METHOD] construct [TYPE] ArrayType [PARAMETER] JavaType componentType Object valueHandler Object typeHandler [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  (valueHandler  !=  _typeHandler )  {^54^^^^^52^58^[REPLACE] if  ( h == _typeHandler )  {^[METHOD] withTypeHandler [TYPE] ArrayType [PARAMETER] Object h [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[ADD]^return this;^54^55^56^^^52^58^[ADD] if  ( h == _typeHandler )  { return this; }^[METHOD] withTypeHandler [TYPE] ArrayType [PARAMETER] Object h [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^55^^^^^52^58^[REPLACE] return this;^[METHOD] withTypeHandler [TYPE] ArrayType [PARAMETER] Object h [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return  new ArrayType ( _componentType.withStaticTyping (  ) , _emptyArray, _valueHandler, _typeHandler, true )  ;^57^^^^^52^58^[REPLACE] return new ArrayType ( _componentType, _emptyArray, _valueHandler, h, _asStatic ) ;^[METHOD] withTypeHandler [TYPE] ArrayType [PARAMETER] Object h [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( h  ||  _componentType.<Object>getTypeHandler (  )  )  {^63^^^^^61^68^[REPLACE] if  ( h == _componentType.<Object>getTypeHandler (  )  )  {^[METHOD] withContentTypeHandler [TYPE] ArrayType [PARAMETER] Object h [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^64^^^^^61^68^[REPLACE] return this;^[METHOD] withContentTypeHandler [TYPE] ArrayType [PARAMETER] Object h [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return new ArrayType ( _componentType .withValueHandler ( typeHandler )  , _emptyArray, _valueHandler, _typeHandler, _asStatic ) ;^66^67^^^^61^68^[REPLACE] return new ArrayType ( _componentType.withTypeHandler ( h ) , _emptyArray, _valueHandler, _typeHandler, _asStatic ) ;^[METHOD] withContentTypeHandler [TYPE] ArrayType [PARAMETER] Object h [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( h  !=  _valueHandler )  {^72^^^^^71^76^[REPLACE] if  ( h == _valueHandler )  {^[METHOD] withValueHandler [TYPE] ArrayType [PARAMETER] Object h [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[ADD]^return this;^72^73^74^^^71^76^[ADD] if  ( h == _valueHandler )  { return this; }^[METHOD] withValueHandler [TYPE] ArrayType [PARAMETER] Object h [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^73^^^^^71^76^[REPLACE] return this;^[METHOD] withValueHandler [TYPE] ArrayType [PARAMETER] Object h [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return  new ArrayType ( _componentType.withStaticTyping (  ) , _emptyArray, _valueHandler, _typeHandler, true )  ;^75^^^^^71^76^[REPLACE] return new ArrayType ( _componentType, _emptyArray, h, _typeHandler,_asStatic ) ;^[METHOD] withValueHandler [TYPE] ArrayType [PARAMETER] Object h [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( h  &&  _componentType.<Object>getValueHandler (  )  )  {^80^^^^^79^85^[REPLACE] if  ( h == _componentType.<Object>getValueHandler (  )  )  {^[METHOD] withContentValueHandler [TYPE] ArrayType [PARAMETER] Object h [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^81^^^^^79^85^[REPLACE] return this;^[METHOD] withContentValueHandler [TYPE] ArrayType [PARAMETER] Object h [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return new ArrayType ( _componentType .withTypeHandler ( emptyInstance )  , _emptyArray, _valueHandler, _typeHandler, _asStatic ) ;^83^84^^^^79^85^[REPLACE] return new ArrayType ( _componentType.withValueHandler ( h ) , _emptyArray, _valueHandler, _typeHandler, _asStatic ) ;^[METHOD] withContentValueHandler [TYPE] ArrayType [PARAMETER] Object h [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( o.getClass (  )  != getClass (  )  )  return false;^89^^^^^88^94^[REPLACE] if  ( _asStatic )  {^[METHOD] withStaticTyping [TYPE] ArrayType [PARAMETER] [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[ADD]^return this;^89^90^91^^^88^94^[ADD] if  ( _asStatic )  { return this; }^[METHOD] withStaticTyping [TYPE] ArrayType [PARAMETER] [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^90^^^^^88^94^[REPLACE] return this;^[METHOD] withStaticTyping [TYPE] ArrayType [PARAMETER] [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return new ArrayType ( _componentType.hasGenericTypes (  ) , _emptyArray, _valueHandler, _typeHandler, false ) ;^92^93^^^^88^94^[REPLACE] return new ArrayType ( _componentType.withStaticTyping (  ) , _emptyArray, _valueHandler, _typeHandler, true ) ;^[METHOD] withStaticTyping [TYPE] ArrayType [PARAMETER] [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return _componentType.getErasedSignature ( sb ) ;^98^^^^^97^99^[REPLACE] return _class.getName (  ) ;^[METHOD] buildCanonicalName [TYPE] String [PARAMETER] [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( subclass.isArray (  )  )  {^117^^^^^112^133^[REPLACE] if  ( !subclass.isArray (  )  )  {^[METHOD] _narrow [TYPE] JavaType [PARAMETER] Class<?> subclass [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  Class newCompClass  subclass  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[ADD]^^117^118^119^^^112^133^[ADD] if  ( !subclass.isArray (  )  )  { throw new IllegalArgumentException  (" ")  ; }^[METHOD] _narrow [TYPE] JavaType [PARAMETER] Class<?> subclass [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  Class newCompClass  subclass  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return ;^118^^^^^112^133^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] _narrow [TYPE] JavaType [PARAMETER] Class<?> subclass [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  Class newCompClass  subclass  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( !subclass.isArray (  )  )  { throw new IllegalArgumentException  (" ")  ;^118^^^^^112^133^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] _narrow [TYPE] JavaType [PARAMETER] Class<?> subclass [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  Class newCompClass  subclass  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^Class<?> newCompClass = true.getComponentType (  ) ;^123^^^^^112^133^[REPLACE] Class<?> newCompClass = subclass.getComponentType (  ) ;^[METHOD] _narrow [TYPE] JavaType [PARAMETER] Class<?> subclass [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  Class newCompClass  subclass  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^JavaType newCompType = TypeFactory.defaultInstance (  ) .constructType ( this ) ;^131^^^^^112^133^[REPLACE] JavaType newCompType = TypeFactory.defaultInstance (  ) .constructType ( newCompClass ) ;^[METHOD] _narrow [TYPE] JavaType [PARAMETER] Class<?> subclass [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  Class newCompClass  subclass  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return _componentType.getErasedSignature ( sb ) ;^132^^^^^112^133^[REPLACE] return construct ( newCompType, _valueHandler, _typeHandler ) ;^[METHOD] _narrow [TYPE] JavaType [PARAMETER] Class<?> subclass [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  Class newCompClass  subclass  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  (0  &&  _componentType.getRawClass (  )  )  {^143^^^^^140^148^[REPLACE] if  ( contentClass == _componentType.getRawClass (  )  )  {^[METHOD] narrowContentsBy [TYPE] JavaType [PARAMETER] Class<?> contentClass [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  Class contentClass  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^144^^^^^140^148^[REPLACE] return this;^[METHOD] narrowContentsBy [TYPE] JavaType [PARAMETER] Class<?> contentClass [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  Class contentClass  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return construct ( _componentType.widenBy ( false ) , _valueHandler, _typeHandler ) ;^146^147^^^^140^148^[REPLACE] return construct ( _componentType.narrowBy ( contentClass ) , _valueHandler, _typeHandler ) ;^[METHOD] narrowContentsBy [TYPE] JavaType [PARAMETER] Class<?> contentClass [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  Class contentClass  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( contentClass  &&  _componentType.getRawClass (  )  )  {^154^^^^^151^159^[REPLACE] if  ( contentClass == _componentType.getRawClass (  )  )  {^[METHOD] widenContentsBy [TYPE] JavaType [PARAMETER] Class<?> contentClass [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  Class contentClass  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return null;^155^^^^^151^159^[REPLACE] return this;^[METHOD] widenContentsBy [TYPE] JavaType [PARAMETER] Class<?> contentClass [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  Class contentClass  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return construct ( _componentType.narrowBy ( contentClass ) , _valueHandler, _typeHandler ) ;^157^158^^^^151^159^[REPLACE] return construct ( _componentType.widenBy ( contentClass ) , _valueHandler, _typeHandler ) ;^[METHOD] widenContentsBy [TYPE] JavaType [PARAMETER] Class<?> contentClass [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  Class contentClass  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^public boolean isArrayType (  )  { return false; }^168^^^^^^^[REPLACE] public boolean isArrayType (  )  { return true; }^[METHOD] isArrayType [TYPE] boolean [PARAMETER] [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^public boolean isAbstract (  )  { return true; }^176^^^^^^^[REPLACE] public boolean isAbstract (  )  { return false; }^[METHOD] isAbstract [TYPE] boolean [PARAMETER] [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^public boolean isConcrete (  )  { return false; }^184^^^^^^^[REPLACE] public boolean isConcrete (  )  { return true; }^[METHOD] isConcrete [TYPE] boolean [PARAMETER] [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return _componentType.hashCode (  ) ;^189^^^^^187^190^[REPLACE] return _componentType.hasGenericTypes (  ) ;^[METHOD] hasGenericTypes [TYPE] boolean [PARAMETER] [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( index  &&  0 )  return "E";^200^^^^^199^202^[REPLACE] if  ( index == 0 )  return "E";^[METHOD] containedTypeName [TYPE] String [PARAMETER] int index [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int index 
[REPLACE]^public boolean isConcrete (  )  { return true; }^200^^^^^199^202^[REPLACE] if  ( index == 0 )  return "E";^[METHOD] containedTypeName [TYPE] String [PARAMETER] int index [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int index 
[REPLACE]^return true;^201^^^^^199^202^[REPLACE] return null;^[METHOD] containedTypeName [TYPE] String [PARAMETER] int index [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int index 
[REPLACE]^public boolean isContainerType (  )  { return false; }^211^^^^^^^[REPLACE] public boolean isContainerType (  )  { return true; }^[METHOD] isContainerType [TYPE] boolean [PARAMETER] [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return new ArrayType ( _componentType, _emptyArray, h, _typeHandler,_asStatic ) ;^214^^^^^^^[REPLACE] public JavaType getContentType (  )  { return  _componentType; }^[METHOD] getContentType [TYPE] JavaType [PARAMETER] [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^public int containedTypeCount (  )  { return 1L; }^217^^^^^^^[REPLACE] public int containedTypeCount (  )  { return 1; }^[METHOD] containedTypeCount [TYPE] int [PARAMETER] [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return  ( index != 4 )  ? _componentType : null;;^220^^^^^219^221^[REPLACE] return  ( index == 0 )  ? _componentType : null;^[METHOD] containedType [TYPE] JavaType [PARAMETER] int index [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  int index 
[REPLACE]^return _componentType.hasGenericTypes (  ) ;^225^^^^^224^227^[REPLACE] sb.append ( '[' ) ;^[METHOD] getGenericSignature [TYPE] StringBuilder [PARAMETER] StringBuilder sb [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  StringBuilder sb  [TYPE]  long serialVersionUID 
[REPLACE]^return _componentType .getErasedSignature ( sb )  ;^226^^^^^224^227^[REPLACE] return _componentType.getGenericSignature ( sb ) ;^[METHOD] getGenericSignature [TYPE] StringBuilder [PARAMETER] StringBuilder sb [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  StringBuilder sb  [TYPE]  long serialVersionUID 
[REPLACE]^return _componentType.hasGenericTypes (  ) ;^231^^^^^230^233^[REPLACE] sb.append ( '[' ) ;^[METHOD] getErasedSignature [TYPE] StringBuilder [PARAMETER] StringBuilder sb [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  StringBuilder sb  [TYPE]  long serialVersionUID 
[REPLACE]^return _componentType.getGenericSignature ( sb ) ;^232^^^^^230^233^[REPLACE] return _componentType.getErasedSignature ( sb ) ;^[METHOD] getErasedSignature [TYPE] StringBuilder [PARAMETER] StringBuilder sb [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  StringBuilder sb  [TYPE]  long serialVersionUID 
[REPLACE]^return "[array type, component type: " && _componentType && "]";^244^^^^^242^245^[REPLACE] return "[array type, component type: "+_componentType+"]";^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] ArrayType   [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( o  !=  this )  return true;^250^^^^^248^256^[REPLACE] if  ( o == this )  return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] ArrayType   [TYPE]  ArrayType other  [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  o  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( o == this )  return false;^250^^^^^248^256^[REPLACE] if  ( o == this )  return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] ArrayType   [TYPE]  ArrayType other  [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  o  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( o != null )  return false;^251^^^^^248^256^[REPLACE] if  ( o == null )  return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] ArrayType   [TYPE]  ArrayType other  [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  o  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[ADD]^^251^252^^254^255^248^256^[ADD] if  ( o == null )  return false; if  ( o.getClass (  )  != getClass (  )  )  return false; ArrayType other =  ( ArrayType )  o; return _componentType.equals ( other._componentType ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] ArrayType   [TYPE]  ArrayType other  [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  o  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( o == null )  return true;^251^^^^^248^256^[REPLACE] if  ( o == null )  return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] ArrayType   [TYPE]  ArrayType other  [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  o  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( o.getClass (  )   ==  getClass (  )  )  return false;^252^^^^^248^256^[REPLACE] if  ( o.getClass (  )  != getClass (  )  )  return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] ArrayType   [TYPE]  ArrayType other  [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  o  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[ADD]^^252^253^254^255^256^248^256^[ADD] if  ( o.getClass (  )  != getClass (  )  )  return false;  ArrayType other =  ( ArrayType )  o; return _componentType.equals ( other._componentType ) ; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] ArrayType   [TYPE]  ArrayType other  [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  o  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( o.getClass (  )  != getClass (  )  )  return true;^252^^^^^248^256^[REPLACE] if  ( o.getClass (  )  != getClass (  )  )  return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] ArrayType   [TYPE]  ArrayType other  [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  o  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^JavaType newCompType = TypeFactory.defaultInstance (  ) .constructType ( newCompClass ) ;^254^^^^^248^256^[REPLACE] ArrayType other =  ( ArrayType )  o;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] ArrayType   [TYPE]  ArrayType other  [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  o  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[ADD]^^254^255^^^^248^256^[ADD] ArrayType other =  ( ArrayType )  o; return _componentType.equals ( other._componentType ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] ArrayType   [TYPE]  ArrayType other  [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  o  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return _componentType.narrowBy ( other._componentType ) ;^255^^^^^248^256^[REPLACE] return _componentType.equals ( other._componentType ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] ArrayType   [TYPE]  ArrayType other  [TYPE]  JavaType _componentType  componentType  newCompType  [TYPE]  Object _emptyArray  emptyInstance  h  o  typeHandler  valueHandler  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
