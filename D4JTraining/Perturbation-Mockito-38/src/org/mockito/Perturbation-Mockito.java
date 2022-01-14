[REPLACE]^private static  MockitoCore MOCKITO_CORE = new MockitoCore (  ) ;^570^^^^^^^[REPLACE] private static final MockitoCore MOCKITO_CORE = new MockitoCore (  ) ;^ [CLASS] Mockito  
[REPLACE]^public static final Answer<Object> RETURNS_DEFAULTS ;^581^^^^^^^[REPLACE] public static final Answer<Object> RETURNS_DEFAULTS = new GloballyConfiguredAnswer (  ) ;^ [CLASS] Mockito  
[REPLACE]^public static final Answer<Object> RETURNS_SMART_NULLS  = null ;^613^^^^^^^[REPLACE] public static final Answer<Object> RETURNS_SMART_NULLS = new ReturnsSmartNulls (  ) ;^ [CLASS] Mockito  
[REPLACE]^public  final Answer<Object> RETURNS_MOCKS = new ReturnsMocks (  ) ;^626^^^^^^^[REPLACE] public static final Answer<Object> RETURNS_MOCKS = new ReturnsMocks (  ) ;^ [CLASS] Mockito  
[REPLACE]^public static final Answer<Object> CALLS_REAL_METHODS ;^660^^^^^^^[REPLACE] public static final Answer<Object> CALLS_REAL_METHODS = new CallsRealMethods (  ) ;^ [CLASS] Mockito  
