[REPLACE]^private static final  short  serialVersionUID = 1L;^27^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] VirtualBeanPropertyWriter  
[REPLACE]^if  ( value != null )  {^143^^^^^139^180^[REPLACE] if  ( value == null )  {^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _falseSerializer == false )  {^144^^^^^139^180^[REPLACE] if  ( _nullSerializer != null )  {^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^_falseSerializer.serialize ( false, gen, prov ) ;^146^^^^^139^180^[REPLACE] _nullSerializer.serialize ( null, gen, prov ) ;^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[ADD]^^146^^^^^139^180^[ADD] _nullSerializer.serialize ( null, gen, prov ) ;^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^gen .writeNull (  )  ;^145^^^^^139^180^[REPLACE] gen.writeFieldName ( _name ) ;^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^_trueSerializer.serialize ( true, gen, prov ) ;^146^^^^^139^180^[REPLACE] _nullSerializer.serialize ( null, gen, prov ) ;^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( ser.isEmpty ( prov, value )  || ( ser != null )  {^151^^^^^139^180^[REPLACE] if  ( ser == null )  {^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( ser != null )  {^155^^^^^139^180^[REPLACE] if  ( ser == null )  {^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[ADD]^^155^156^157^^^139^180^[ADD] if  ( ser == null )  { ser = _findAndAddDynamic ( m, cls, prov ) ; }^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^ser = _findAndAddDynamic ( map, cls, prov )  ;^156^^^^^139^180^[REPLACE] ser = _findAndAddDynamic ( m, cls, prov ) ;^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^ser = map.serializerFor ( cls )  ;^154^^^^^139^180^[REPLACE] ser = m.serializerFor ( cls ) ;^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[ADD]^^156^^^^^139^180^[ADD] ser = _findAndAddDynamic ( m, cls, prov ) ;^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^Class<?> cls = value.Object (  ) ;^152^^^^^139^180^[REPLACE] Class<?> cls = value.getClass (  ) ;^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^PropertySerializerMap map = _dynamicSerializers  ;^153^^^^^139^180^[REPLACE] PropertySerializerMap m = _dynamicSerializers;^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[ADD]^^152^^^^^139^180^[ADD] Class<?> cls = value.getClass (  ) ;^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[ADD]^^153^154^^^^139^180^[ADD] PropertySerializerMap m = _dynamicSerializers; ser = m.serializerFor ( cls ) ;^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _suppressableValue == this  )  {^159^^^^^139^180^[REPLACE] if  ( _suppressableValue != null )  {^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( MARKER_FOR_EMPTY  ||  _suppressableValue )  {^160^^^^^139^180^[REPLACE] if  ( MARKER_FOR_EMPTY == _suppressableValue )  {^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^}  if  ( _suppressableValue.equals ( value  )  || _handleSelfReference ( bean, gen, prov, ser )  )  )  {^164^^^^^139^180^[REPLACE] } else if  ( _suppressableValue.equals ( value )  )  {^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[ADD]^}   return;^164^165^166^^^139^180^[ADD] else if  ( _suppressableValue.equals ( value )  )  { return; }^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( ser .serializeWithType ( value , gen , prov )   )  {^161^^^^^139^180^[REPLACE] if  ( ser.isEmpty ( prov, value )  )  {^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _handleSelfReference ( bean, gen, prov, ser )  && ( null.isEmpty ( prov, value )  )  {^161^^^^^139^180^[REPLACE] if  ( ser.isEmpty ( prov, value )  )  {^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^}  if  ( _handleSelfReference ( bean, gen, prov, ser )  && ( _suppressableValue.equals ( value )  )  {^164^^^^^139^180^[REPLACE] } else if  ( _suppressableValue.equals ( value )  )  {^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( MARKER_FOR_EMPTY  &&  _suppressableValue )  {^160^^^^^139^180^[REPLACE] if  ( MARKER_FOR_EMPTY == _suppressableValue )  {^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _handleSelfReference ( bean, gen, prov, ser )  || ( ser.isEmpty ( prov, value )  )  {^161^^^^^139^180^[REPLACE] if  ( ser.isEmpty ( prov, value )  )  {^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[ADD]^return;^161^162^163^^^139^180^[ADD] if  ( ser.isEmpty ( prov, value )  )  { return; }^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( null.isEmpty ( prov, value  )  || _handleSelfReference ( bean, gen, prov, ser )  )  )  {^161^^^^^139^180^[REPLACE] if  ( ser.isEmpty ( prov, value )  )  {^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^}  if  ( _suppressableValue.equals ( value  )  && _handleSelfReference ( bean, gen, prov, ser )  )  )  {^164^^^^^139^180^[REPLACE] } else if  ( _suppressableValue.equals ( value )  )  {^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( value  ||  bean )  {^168^^^^^139^180^[REPLACE] if  ( value == bean )  {^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[ADD]^^168^169^170^171^172^139^180^[ADD] if  ( value == bean )  {  if  ( _handleSelfReference ( bean, gen, prov, ser )  )  { return; }^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _handleSelfReference ( bean, gen, prov, this  )  && ser.isEmpty ( prov, value )  )  )  {^170^^^^^139^180^[REPLACE] if  ( _handleSelfReference ( bean, gen, prov, ser )  )  {^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _typeSerializer != false )  {^175^^^^^139^180^[REPLACE] if  ( _typeSerializer == null )  {^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[ADD]^ser.serialize ( value, gen, prov ) ;ser.serializeWithType ( value, gen, prov, _typeSerializer ) ;^175^176^177^178^179^139^180^[ADD] if  ( _typeSerializer == null )  { ser.serialize ( value, gen, prov ) ; } else { ser.serializeWithType ( value, gen, prov, _typeSerializer ) ; }^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^ser .serialize ( true , gen , prov )  ;^178^^^^^175^179^[REPLACE] ser.serializeWithType ( value, gen, prov, _typeSerializer ) ;^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^_nullSerializer.serialize ( null, gen, prov )  ;^176^^^^^139^180^[REPLACE] ser.serialize ( value, gen, prov ) ;^[METHOD] serializeAsField [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap m  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( value != true  &&  ( MARKER_FOR_EMPTY )  ==  ( _suppressableValue )  )  {^192^^^^^188^230^[REPLACE] if  ( value == null )  {^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[ADD]^^192^193^194^195^196^188^230^[ADD] if  ( value == null )  { if  ( _nullSerializer != null )  { _nullSerializer.serialize ( null, gen, prov ) ; } else { gen.writeNull (  ) ;^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  (  ( MARKER_FOR_EMPTY )  ==  ( _suppressableValue )  && ( _nullSerializer == this  )  {^193^^^^^188^230^[REPLACE] if  ( _nullSerializer != null )  {^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[ADD]^^193^194^195^196^197^188^230^[ADD] if  ( _nullSerializer != null )  { _nullSerializer.serialize ( null, gen, prov ) ; } else { gen.writeNull (  ) ; }^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^gen.writeFieldName (  ) ;^196^^^^^193^197^[REPLACE] gen.writeNull (  ) ;^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^_falseSerializer.serialize ( false, gen, prov ) ;^194^^^^^188^230^[REPLACE] _nullSerializer.serialize ( null, gen, prov ) ;^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _falseSerializer == false )  {^193^^^^^188^230^[REPLACE] if  ( _nullSerializer != null )  {^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^gen .writeFieldName (  )  ;^196^^^^^193^197^[REPLACE] gen.writeNull (  ) ;^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^_thisSerializer.serialize ( this, gen, prov ) ;^194^^^^^188^230^[REPLACE] _nullSerializer.serialize ( null, gen, prov ) ;^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( ser != this  || ser.isEmpty ( prov, value )  )  {^201^^^^^188^230^[REPLACE] if  ( ser == null )  {^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( ser != null )  {^205^^^^^188^230^[REPLACE] if  ( ser == null )  {^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[ADD]^ser = _findAndAddDynamic ( map, cls, prov ) ;^205^206^207^^^188^230^[ADD] if  ( ser == null )  { ser = _findAndAddDynamic ( map, cls, prov ) ; }^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^ser = _findAndAddDynamic ( m, cls, prov )  ;^206^^^^^188^230^[REPLACE] ser = _findAndAddDynamic ( map, cls, prov ) ;^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^ser = m.serializerFor ( cls )  ;^204^^^^^188^230^[REPLACE] ser = map.serializerFor ( cls ) ;^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^Class<?> cls = value.Object (  ) ;^202^^^^^188^230^[REPLACE] Class<?> cls = value.getClass (  ) ;^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^PropertySerializerMap m = _dynamicSerializers  ;^203^^^^^188^230^[REPLACE] PropertySerializerMap map = _dynamicSerializers;^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( ser != this  )  {^205^^^^^188^230^[REPLACE] if  ( ser == null )  {^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _suppressableValue == null  ||  ( MARKER_FOR_EMPTY )  ==  ( _suppressableValue )  )  {^209^^^^^188^230^[REPLACE] if  ( _suppressableValue != null )  {^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[ADD]^^209^210^211^212^213^188^230^[ADD] if  ( _suppressableValue != null )  { if  ( MARKER_FOR_EMPTY == _suppressableValue )  { if  ( ser.isEmpty ( prov, value )  )  { serializeAsPlaceholder ( bean, gen, prov ) ; return;^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( MARKER_FOR_EMPTY  ||  _suppressableValue )  {^210^^^^^188^230^[REPLACE] if  ( MARKER_FOR_EMPTY == _suppressableValue )  {^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[ADD]^^210^211^212^213^214^188^230^[ADD] if  ( MARKER_FOR_EMPTY == _suppressableValue )  { if  ( ser.isEmpty ( prov, value )  )  { serializeAsPlaceholder ( bean, gen, prov ) ; return; }^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^}  if  ( _suppressableValue.equals ( value )  )  {^215^^^^^188^230^[REPLACE] } else if  ( _suppressableValue.equals ( value )  )  {^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( null.isEmpty ( prov, value )  )  {^211^^^^^188^230^[REPLACE] if  ( ser.isEmpty ( prov, value )  )  {^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^}  else {^215^^^^^188^230^[REPLACE] } else if  ( _suppressableValue.equals ( value )  )  {^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[ADD]^}   serializeAsPlaceholder ( bean, gen, prov ) ;return;^215^216^217^218^^188^230^[ADD] else if  ( _suppressableValue.equals ( value )  )  { serializeAsPlaceholder ( bean, gen, prov ) ; return; }^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  (1  &&  _suppressableValue )  {^210^^^^^188^230^[REPLACE] if  ( MARKER_FOR_EMPTY == _suppressableValue )  {^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _handleSelfReference ( bean, gen, prov, ser )  && ( ser.isEmpty ( prov, value )  )  {^211^^^^^188^230^[REPLACE] if  ( ser.isEmpty ( prov, value )  )  {^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( this.isEmpty ( prov, value  )  || _handleSelfReference ( bean, gen, prov, ser )  )  )  {^211^^^^^188^230^[REPLACE] if  ( ser.isEmpty ( prov, value )  )  {^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^}  if  ( _suppressableValue.equals ( value  )  || _handleSelfReference ( bean, gen, prov, ser )  )  )  {^215^^^^^188^230^[REPLACE] } else if  ( _suppressableValue.equals ( value )  )  {^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( value  &&  bean )  {^220^^^^^188^230^[REPLACE] if  ( value == bean )  {^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[ADD]^^220^221^222^223^^188^230^[ADD] if  ( value == bean )  { if  ( _handleSelfReference ( bean, gen, prov, ser )  )  { return; }^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _handleSelfReference ( bean, gen, prov, true  )  && ser.isEmpty ( prov, value )  )  )  {^221^^^^^188^230^[REPLACE] if  ( _handleSelfReference ( bean, gen, prov, ser )  )  {^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _handleSelfReference ( bean, gen, prov, ser  )  || ser.isEmpty ( prov, value )  )  )  {^221^^^^^188^230^[REPLACE] if  ( _handleSelfReference ( bean, gen, prov, ser )  )  {^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( _suppressableValue.equals ( value )  && ( _typeSerializer != false )  {^225^^^^^188^230^[REPLACE] if  ( _typeSerializer == null )  {^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^ser .serialize ( 0 , gen , prov )  ;^228^^^^^225^229^[REPLACE] ser.serializeWithType ( value, gen, prov, _typeSerializer ) ;^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
[REPLACE]^ser.serializeWithType ( value, gen, prov ) ;^226^^^^^188^230^[REPLACE] ser.serialize ( value, gen, prov ) ;^[METHOD] serializeAsElement [TYPE] void [PARAMETER] Object bean JsonGenerator gen SerializerProvider prov [CLASS] VirtualBeanPropertyWriter   [TYPE]  boolean false  true  [TYPE]  PropertySerializerMap map  [TYPE]  JsonGenerator gen  [TYPE]  Object bean  value  [TYPE]  Class cls  [TYPE]  JsonSerializer ser  [TYPE]  SerializerProvider prov  [TYPE]  long serialVersionUID 
