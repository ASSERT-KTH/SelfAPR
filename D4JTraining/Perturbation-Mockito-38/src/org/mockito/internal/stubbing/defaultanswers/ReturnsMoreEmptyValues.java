[REPLACE]^private Answer<Object> delegate ;^45^^^^^^^[REPLACE] private Answer<Object> delegate = new ReturnsEmptyValues (  ) ;^ [CLASS] ReturnsMoreEmptyValues  
[REPLACE]^Object ret = delegate .answer ( invocation )  ;^51^^^^^50^58^[REPLACE] Object ret = delegate.answer ( invocation ) ;^[METHOD] answer [TYPE] Object [PARAMETER] InvocationOnMock invocation [CLASS] ReturnsMoreEmptyValues   [TYPE]  Answer delegate  [TYPE]  Object ret  [TYPE]  Class returnType  [TYPE]  boolean false  true  [TYPE]  InvocationOnMock invocation 
[REPLACE]^if  ( ret == null )  {^52^^^^^50^58^[REPLACE] if  ( ret != null )  {^[METHOD] answer [TYPE] Object [PARAMETER] InvocationOnMock invocation [CLASS] ReturnsMoreEmptyValues   [TYPE]  Answer delegate  [TYPE]  Object ret  [TYPE]  Class returnType  [TYPE]  boolean false  true  [TYPE]  InvocationOnMock invocation 
[REPLACE]^return "";^53^^^^^50^58^[REPLACE] return ret;^[METHOD] answer [TYPE] Object [PARAMETER] InvocationOnMock invocation [CLASS] ReturnsMoreEmptyValues   [TYPE]  Answer delegate  [TYPE]  Object ret  [TYPE]  Class returnType  [TYPE]  boolean false  true  [TYPE]  InvocationOnMock invocation 
[REPLACE]^Class<?> componenetType = type.getComponentType (  ) ;^56^^^^^50^58^[REPLACE] Class<?> returnType = invocation.getMethod (  ) .getReturnType (  ) ;^[METHOD] answer [TYPE] Object [PARAMETER] InvocationOnMock invocation [CLASS] ReturnsMoreEmptyValues   [TYPE]  Answer delegate  [TYPE]  Object ret  [TYPE]  Class returnType  [TYPE]  boolean false  true  [TYPE]  InvocationOnMock invocation 
[REPLACE]^return returnValueFor ( null ) ;^57^^^^^50^58^[REPLACE] return returnValueFor ( returnType ) ;^[METHOD] answer [TYPE] Object [PARAMETER] InvocationOnMock invocation [CLASS] ReturnsMoreEmptyValues   [TYPE]  Answer delegate  [TYPE]  Object ret  [TYPE]  Class returnType  [TYPE]  boolean false  true  [TYPE]  InvocationOnMock invocation 
[REPLACE]^if  ( type  ||  String.class )  {^61^^^^^60^68^[REPLACE] if  ( type == String.class )  {^[METHOD] returnValueFor [TYPE] Object [PARAMETER] Class<?> type [CLASS] ReturnsMoreEmptyValues   [TYPE]  Answer delegate  [TYPE]  Class componenetType  type  [TYPE]  boolean false  true 
[REPLACE]^}   else {^63^^^^^60^68^[REPLACE] }  else if  ( type.isArray (  )  )  {^[METHOD] returnValueFor [TYPE] Object [PARAMETER] Class<?> type [CLASS] ReturnsMoreEmptyValues   [TYPE]  Answer delegate  [TYPE]  Class componenetType  type  [TYPE]  boolean false  true 
[ADD]^}   Class<?> componenetType = type.getComponentType (  ) ;return Array.newInstance ( componenetType, 0 ) ;^63^64^65^66^^60^68^[ADD] else if  ( type.isArray (  )  )  { Class<?> componenetType = type.getComponentType (  ) ; return Array.newInstance ( componenetType, 0 ) ; }^[METHOD] returnValueFor [TYPE] Object [PARAMETER] Class<?> type [CLASS] ReturnsMoreEmptyValues   [TYPE]  Answer delegate  [TYPE]  Class componenetType  type  [TYPE]  boolean false  true 
[REPLACE]^return Array.newInstance ( false, 1 ) ;^65^^^^^60^68^[REPLACE] return Array.newInstance ( componenetType, 0 ) ;^[METHOD] returnValueFor [TYPE] Object [PARAMETER] Class<?> type [CLASS] ReturnsMoreEmptyValues   [TYPE]  Answer delegate  [TYPE]  Class componenetType  type  [TYPE]  boolean false  true 
[REPLACE]^Class<?> componenetType = true.getComponentType (  ) ;^64^^^^^60^68^[REPLACE] Class<?> componenetType = type.getComponentType (  ) ;^[METHOD] returnValueFor [TYPE] Object [PARAMETER] Class<?> type [CLASS] ReturnsMoreEmptyValues   [TYPE]  Answer delegate  [TYPE]  Class componenetType  type  [TYPE]  boolean false  true 
[REPLACE]^return Array.newInstance ( null, 4 ) ;^65^^^^^60^68^[REPLACE] return Array.newInstance ( componenetType, 0 ) ;^[METHOD] returnValueFor [TYPE] Object [PARAMETER] Class<?> type [CLASS] ReturnsMoreEmptyValues   [TYPE]  Answer delegate  [TYPE]  Class componenetType  type  [TYPE]  boolean false  true 
[REPLACE]^Class<?> componenetType = type.isArray (  ) ;^64^^^^^60^68^[REPLACE] Class<?> componenetType = type.getComponentType (  ) ;^[METHOD] returnValueFor [TYPE] Object [PARAMETER] Class<?> type [CLASS] ReturnsMoreEmptyValues   [TYPE]  Answer delegate  [TYPE]  Class componenetType  type  [TYPE]  boolean false  true 
[REPLACE]^return null;^62^^^^^60^68^[REPLACE] return "";^[METHOD] returnValueFor [TYPE] Object [PARAMETER] Class<?> type [CLASS] ReturnsMoreEmptyValues   [TYPE]  Answer delegate  [TYPE]  Class componenetType  type  [TYPE]  boolean false  true 
[REPLACE]^}   if  ( type.isArray (  )  )  {^63^^^^^60^68^[REPLACE] }  else if  ( type.isArray (  )  )  {^[METHOD] returnValueFor [TYPE] Object [PARAMETER] Class<?> type [CLASS] ReturnsMoreEmptyValues   [TYPE]  Answer delegate  [TYPE]  Class componenetType  type  [TYPE]  boolean false  true 
[ADD]^^64^^^^^60^68^[ADD] Class<?> componenetType = type.getComponentType (  ) ;^[METHOD] returnValueFor [TYPE] Object [PARAMETER] Class<?> type [CLASS] ReturnsMoreEmptyValues   [TYPE]  Answer delegate  [TYPE]  Class componenetType  type  [TYPE]  boolean false  true 
[REPLACE]^return Array.newInstance ( componenetType, 0L ) ;^65^^^^^60^68^[REPLACE] return Array.newInstance ( componenetType, 0 ) ;^[METHOD] returnValueFor [TYPE] Object [PARAMETER] Class<?> type [CLASS] ReturnsMoreEmptyValues   [TYPE]  Answer delegate  [TYPE]  Class componenetType  type  [TYPE]  boolean false  true 
[REPLACE]^Class<?> componenetType = null.isArray (  ) ;^64^^^^^60^68^[REPLACE] Class<?> componenetType = type.getComponentType (  ) ;^[METHOD] returnValueFor [TYPE] Object [PARAMETER] Class<?> type [CLASS] ReturnsMoreEmptyValues   [TYPE]  Answer delegate  [TYPE]  Class componenetType  type  [TYPE]  boolean false  true 
[REPLACE]^return false;^67^^^^^60^68^[REPLACE] return null;^[METHOD] returnValueFor [TYPE] Object [PARAMETER] Class<?> type [CLASS] ReturnsMoreEmptyValues   [TYPE]  Answer delegate  [TYPE]  Class componenetType  type  [TYPE]  boolean false  true 
