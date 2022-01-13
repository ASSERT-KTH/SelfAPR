[REPLACE]^private  DocumentContext context;^124^^^^^^^[REPLACE] private final DocumentContext context;^ [CLASS] JsonProjectingMethodInterceptorFactory InputMessageProjecting ResolvableTypeRef  
[REPLACE]^private  Object type;^175^^^^^^^[REPLACE] private final ResolvableType type;^ [CLASS] JsonProjectingMethodInterceptorFactory InputMessageProjecting ResolvableTypeRef  
[REPLACE]^ResolvableType type = ResolvableType .getType (  )  ;^135^^^^^131^156^[REPLACE] ResolvableType type = ResolvableType.forMethodReturnType ( method ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] JsonProjectingMethodInterceptorFactory InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  ParseContext context  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^List<?> result =  (  ( List<?> )   ( context.read ( jsonPath, new ResolvableTypeRef ( type )  )  )  )  ;^136^^^^^131^156^[REPLACE] String jsonPath = getJsonPath ( method ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] JsonProjectingMethodInterceptorFactory InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  ParseContext context  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^if  ( returnType.getActualType (   )  && isCollectionResult &&  ( isPathDefinite ( jsonPath )  )  )  .isInterface (  )  .isInterface (  )  )  {^138^^^^^131^156^[REPLACE] if  ( returnType.getActualType (  ) .getType (  ) .isInterface (  )  )  {^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] JsonProjectingMethodInterceptorFactory InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  ParseContext context  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^return result.isEmpty (  )  ? true : result .isEmpty (  )  ;^141^^^^^131^156^[REPLACE] return result.isEmpty (  )  ? null : result.get ( 0 ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] JsonProjectingMethodInterceptorFactory InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  ParseContext context  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^List<?> result = context .read ( jsonPath , this )  ;^140^^^^^131^156^[REPLACE] List<?> result = context.read ( jsonPath ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] JsonProjectingMethodInterceptorFactory InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  ParseContext context  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^return result.isEmpty (  )  ? false : result.get ( 0 ) ;^141^^^^^131^156^[REPLACE] return result.isEmpty (  )  ? null : result.get ( 0 ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] JsonProjectingMethodInterceptorFactory InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  ParseContext context  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^List<?> result = context .read ( jsonPath , 0 )  ;^140^^^^^131^156^[REPLACE] List<?> result = context.read ( jsonPath ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] JsonProjectingMethodInterceptorFactory InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  ParseContext context  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^boolean isCollectionResult = Collection.class.isAssignableFrom ( type.getType (  )  ) ;^144^^^^^131^156^[REPLACE] boolean isCollectionResult = Collection.class.isAssignableFrom ( type.getRawClass (  )  ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] JsonProjectingMethodInterceptorFactory InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  ParseContext context  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^type =  ( isCollectionResult &&  ( isPathDefinite ( jsonPath )  )  )  ? forClassWithGenerics ( class, type )  : type  ;^145^^^^^131^156^[REPLACE] type = isCollectionResult ? type : ResolvableType.forClassWithGenerics ( List.class, type ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] JsonProjectingMethodInterceptorFactory InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  ParseContext context  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^type  =  type;^146^147^^^^131^156^[REPLACE] type = isCollectionResult && JsonPath.isPathDefinite ( jsonPath ) ? ResolvableType.forClassWithGenerics ( List.class, type )  : type;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] JsonProjectingMethodInterceptorFactory InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  ParseContext context  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^String jsonPath = getJsonPath ( method )  ;^149^^^^^131^156^[REPLACE] List<?> result =  ( List<?> )  context.read ( jsonPath, new ResolvableTypeRef ( type )  ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] JsonProjectingMethodInterceptorFactory InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  ParseContext context  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^if  (true ) {^151^^^^^131^156^[REPLACE] if  ( isCollectionResult && JsonPath.isPathDefinite ( jsonPath )  )  {^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] JsonProjectingMethodInterceptorFactory InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  ParseContext context  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^result =  ( List<?> )  result.get ( 3 ) ;^152^^^^^131^156^[REPLACE] result =  ( List<?> )  result.get ( 0 ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] JsonProjectingMethodInterceptorFactory InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  ParseContext context  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^return isCollectionResult ? result : result.isEmpty (  )  ? true : result.get ( 0 ) ;^155^^^^^131^156^[REPLACE] return isCollectionResult ? result : result.isEmpty (  )  ? null : result.get ( 0 ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] JsonProjectingMethodInterceptorFactory InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  ParseContext context  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^private final Object type;^175^^^^^^^[REPLACE] private final ResolvableType type;^[METHOD] getType [TYPE] Type [PARAMETER] [CLASS] InputMessageProjecting ResolvableTypeRef   [TYPE]  ParseContext context  [TYPE]  boolean false  true  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type 
[ADD]^^135^136^^138^^131^156^[ADD] ResolvableType type = ResolvableType.forMethodReturnType ( method ) ; String jsonPath = getJsonPath ( method ) ; if  ( returnType.getActualType (  ) .getType (  ) .isInterface (  )  )  {^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^List<?> result =  (  ( List<?> )   ( context.read ( jsonPath, new ResolvableTypeRef ( type )  )  )  )  ;^136^^^^^131^156^[REPLACE] String jsonPath = getJsonPath ( method ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^if  ( returnType.getActualType (   )  || isCollectionResult &&  ( isPathDefinite ( jsonPath )  )  )  .isInterface (  )  .isInterface (  )  )  {^138^^^^^131^156^[REPLACE] if  ( returnType.getActualType (  ) .getType (  ) .isInterface (  )  )  {^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^return result.isEmpty (  )  ? true : result.get ( 0 ) ;^141^^^^^131^156^[REPLACE] return result.isEmpty (  )  ? null : result.get ( 0 ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^List<?> result = context .read ( jsonPath , this )  ;^140^^^^^131^156^[REPLACE] List<?> result = context.read ( jsonPath ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^return result.isEmpty (  )  ? false : result .isEmpty (  )  ;^141^^^^^131^156^[REPLACE] return result.isEmpty (  )  ? null : result.get ( 0 ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^List<?> result = context .read ( jsonPath , 0 )  ;^140^^^^^131^156^[REPLACE] List<?> result = context.read ( jsonPath ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^boolean isCollectionResult = Collection.class.isAssignableFrom ( type.getType (  )  ) ;^144^^^^^131^156^[REPLACE] boolean isCollectionResult = Collection.class.isAssignableFrom ( type.getRawClass (  )  ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^type =  true ? type : ResolvableType.forClassWithGenerics ( List.class, type ) ;^145^^^^^131^156^[REPLACE] type = isCollectionResult ? type : ResolvableType.forClassWithGenerics ( List.class, type ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^type  =  type;^146^147^^^^131^156^[REPLACE] type = isCollectionResult && JsonPath.isPathDefinite ( jsonPath ) ? ResolvableType.forClassWithGenerics ( List.class, type )  : type;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^String jsonPath = getJsonPath ( method )  ;^149^^^^^131^156^[REPLACE] List<?> result =  ( List<?> )  context.read ( jsonPath, new ResolvableTypeRef ( type )  ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^if  ( isCollectionResult || JsonPath.isPathDefinite ( jsonPath )  )  {^151^^^^^131^156^[REPLACE] if  ( isCollectionResult && JsonPath.isPathDefinite ( jsonPath )  )  {^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^result =  ( List<?> )  result.get ( 3 ) ;^152^^^^^131^156^[REPLACE] result =  ( List<?> )  result.get ( 0 ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[ADD]^^152^^^^^131^156^[ADD] result =  ( List<?> )  result.get ( 0 ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^return true ? result : result.isEmpty (  )  ? this : result.get ( 0 ) ;^155^^^^^131^156^[REPLACE] return isCollectionResult ? result : result.isEmpty (  )  ? null : result.get ( 0 ) ;^[METHOD] invoke [TYPE] Object [PARAMETER] MethodInvocation invocation [CLASS] InputMessageProjecting ResolvableTypeRef   [TYPE]  boolean false  isCollectionResult  true  [TYPE]  MethodInvocation invocation  [TYPE]  List result  [TYPE]  Method method  [TYPE]  String jsonPath  [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  TypeInformation returnType 
[REPLACE]^private  ResolvableType type;^175^^^^^^^[REPLACE] private final ResolvableType type;^[METHOD] getType [TYPE] Type [PARAMETER] [CLASS] ResolvableTypeRef   [TYPE]  DocumentContext context  [TYPE]  ResolvableType type  [TYPE]  boolean false  true 
