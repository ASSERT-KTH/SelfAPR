[buglab_swap_variables]^return mock ( RETURNS_DEFAULTS, withSettings (  ) .defaultAnswer ( classToMock )  ) ;^671^^^^^670^672^return mock ( classToMock, withSettings (  ) .defaultAnswer ( RETURNS_DEFAULTS )  ) ;^[CLASS] Mockito  [METHOD] mock [RETURN_TYPE] <T>   Class<T> classToMock [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  MockitoCore  MOCKITO_CORE  Class  classToMock  boolean  
[buglab_swap_variables]^return mock (  withSettings (  ) .defaultAnswer ( RETURNS_DEFAULTS )  ) ;^671^^^^^670^672^return mock ( classToMock, withSettings (  ) .defaultAnswer ( RETURNS_DEFAULTS )  ) ;^[CLASS] Mockito  [METHOD] mock [RETURN_TYPE] <T>   Class<T> classToMock [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  MockitoCore  MOCKITO_CORE  Class  classToMock  boolean  
[buglab_swap_variables]^return mock ( RETURNS_DEFAULTS, withSettings (  ) .name ( name ) .defaultAnswer ( classToMock )  ) ;^689^690^691^^^688^692^return mock ( classToMock, withSettings (  ) .name ( name ) .defaultAnswer ( RETURNS_DEFAULTS )  ) ;^[CLASS] Mockito  [METHOD] mock [RETURN_TYPE] <T>   Class<T> classToMock String name [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  MockitoCore  MOCKITO_CORE  Class  classToMock  String  name  boolean  
[buglab_swap_variables]^return mock (  withSettings (  ) .name ( name ) .defaultAnswer ( RETURNS_DEFAULTS )  ) ;^689^690^691^^^688^692^return mock ( classToMock, withSettings (  ) .name ( name ) .defaultAnswer ( RETURNS_DEFAULTS )  ) ;^[CLASS] Mockito  [METHOD] mock [RETURN_TYPE] <T>   Class<T> classToMock String name [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  MockitoCore  MOCKITO_CORE  Class  classToMock  String  name  boolean  
[buglab_swap_variables]^return mock ( name, withSettings (  ) .name ( classToMock ) .defaultAnswer ( RETURNS_DEFAULTS )  ) ;^689^690^691^^^688^692^return mock ( classToMock, withSettings (  ) .name ( name ) .defaultAnswer ( RETURNS_DEFAULTS )  ) ;^[CLASS] Mockito  [METHOD] mock [RETURN_TYPE] <T>   Class<T> classToMock String name [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  MockitoCore  MOCKITO_CORE  Class  classToMock  String  name  boolean  
[buglab_swap_variables]^return mock ( classToMock, withSettings (  ) .name ( RETURNS_DEFAULTS ) .defaultAnswer ( name )  ) ;^689^690^691^^^688^692^return mock ( classToMock, withSettings (  ) .name ( name ) .defaultAnswer ( RETURNS_DEFAULTS )  ) ;^[CLASS] Mockito  [METHOD] mock [RETURN_TYPE] <T>   Class<T> classToMock String name [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  MockitoCore  MOCKITO_CORE  Class  classToMock  String  name  boolean  
[buglab_swap_variables]^return mock ( returnValues, withSettings (  ) .defaultAnswer ( new AnswerReturnValuesAdapter ( classToMock )  )  ) ;^725^^^^^724^726^return mock ( classToMock, withSettings (  ) .defaultAnswer ( new AnswerReturnValuesAdapter ( returnValues )  )  ) ;^[CLASS] Mockito  [METHOD] mock [RETURN_TYPE] <T>   Class<T> classToMock ReturnValues returnValues [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  MockitoCore  MOCKITO_CORE  Class  classToMock  boolean  ReturnValues  returnValues  
[buglab_swap_variables]^return mock (  withSettings (  ) .defaultAnswer ( new AnswerReturnValuesAdapter ( returnValues )  )  ) ;^725^^^^^724^726^return mock ( classToMock, withSettings (  ) .defaultAnswer ( new AnswerReturnValuesAdapter ( returnValues )  )  ) ;^[CLASS] Mockito  [METHOD] mock [RETURN_TYPE] <T>   Class<T> classToMock ReturnValues returnValues [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  MockitoCore  MOCKITO_CORE  Class  classToMock  boolean  ReturnValues  returnValues  
[buglab_swap_variables]^return mock ( defaultAnswer, withSettings (  ) .defaultAnswer ( classToMock )  ) ;^748^^^^^747^749^return mock ( classToMock, withSettings (  ) .defaultAnswer ( defaultAnswer )  ) ;^[CLASS] Mockito  [METHOD] mock [RETURN_TYPE] <T>   Class<T> classToMock Answer defaultAnswer [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  MockitoCore  MOCKITO_CORE  Class  classToMock  boolean  
[buglab_swap_variables]^return mock (  withSettings (  ) .defaultAnswer ( defaultAnswer )  ) ;^748^^^^^747^749^return mock ( classToMock, withSettings (  ) .defaultAnswer ( defaultAnswer )  ) ;^[CLASS] Mockito  [METHOD] mock [RETURN_TYPE] <T>   Class<T> classToMock Answer defaultAnswer [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  MockitoCore  MOCKITO_CORE  Class  classToMock  boolean  
[buglab_swap_variables]^return classToMock.mock ( MOCKITO_CORE, mockSettings ) ;^775^^^^^774^776^return MOCKITO_CORE.mock ( classToMock, mockSettings ) ;^[CLASS] Mockito  [METHOD] mock [RETURN_TYPE] <T>   Class<T> classToMock MockSettings mockSettings [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  MockitoCore  MOCKITO_CORE  Class  classToMock  MockSettings  mockSettings  boolean  
[buglab_swap_variables]^return MOCKITO_CORE.mock (  mockSettings ) ;^775^^^^^774^776^return MOCKITO_CORE.mock ( classToMock, mockSettings ) ;^[CLASS] Mockito  [METHOD] mock [RETURN_TYPE] <T>   Class<T> classToMock MockSettings mockSettings [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  MockitoCore  MOCKITO_CORE  Class  classToMock  MockSettings  mockSettings  boolean  
[buglab_swap_variables]^return mockSettings.mock ( classToMock, MOCKITO_CORE ) ;^775^^^^^774^776^return MOCKITO_CORE.mock ( classToMock, mockSettings ) ;^[CLASS] Mockito  [METHOD] mock [RETURN_TYPE] <T>   Class<T> classToMock MockSettings mockSettings [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  MockitoCore  MOCKITO_CORE  Class  classToMock  MockSettings  mockSettings  boolean  
[buglab_swap_variables]^return MOCKITO_CORE.mock ( classToMock ) ;^775^^^^^774^776^return MOCKITO_CORE.mock ( classToMock, mockSettings ) ;^[CLASS] Mockito  [METHOD] mock [RETURN_TYPE] <T>   Class<T> classToMock MockSettings mockSettings [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  MockitoCore  MOCKITO_CORE  Class  classToMock  MockSettings  mockSettings  boolean  
[buglab_swap_variables]^return MOCKITO_CORE.mock ( mockSettings, classToMock ) ;^775^^^^^774^776^return MOCKITO_CORE.mock ( classToMock, mockSettings ) ;^[CLASS] Mockito  [METHOD] mock [RETURN_TYPE] <T>   Class<T> classToMock MockSettings mockSettings [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  MockitoCore  MOCKITO_CORE  Class  classToMock  MockSettings  mockSettings  boolean  
[buglab_swap_variables]^return MOCKITO_CORE.mock (  ( Class<T> )  CALLS_REAL_METHODS.getClass (  ) , withSettings (  ) .spiedInstance ( object ) .defaultAnswer ( object )  ) ;^845^846^847^^^844^848^return MOCKITO_CORE.mock (  ( Class<T> )  object.getClass (  ) , withSettings (  ) .spiedInstance ( object ) .defaultAnswer ( CALLS_REAL_METHODS )  ) ;^[CLASS] Mockito  [METHOD] spy [RETURN_TYPE] <T>   T object [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  MockitoCore  MOCKITO_CORE  boolean  T  object  
[buglab_swap_variables]^return CALLS_REAL_METHODS.mock (  ( Class<T> )  object.getClass (  ) , withSettings (  ) .spiedInstance ( object ) .defaultAnswer ( MOCKITO_CORE )  ) ;^845^846^847^^^844^848^return MOCKITO_CORE.mock (  ( Class<T> )  object.getClass (  ) , withSettings (  ) .spiedInstance ( object ) .defaultAnswer ( CALLS_REAL_METHODS )  ) ;^[CLASS] Mockito  [METHOD] spy [RETURN_TYPE] <T>   T object [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  MockitoCore  MOCKITO_CORE  boolean  T  object  
[buglab_swap_variables]^return object.mock (  ( Class<T> )  MOCKITO_CORE.getClass (  ) , withSettings (  ) .spiedInstance ( object ) .defaultAnswer ( CALLS_REAL_METHODS )  ) ;^845^846^847^^^844^848^return MOCKITO_CORE.mock (  ( Class<T> )  object.getClass (  ) , withSettings (  ) .spiedInstance ( object ) .defaultAnswer ( CALLS_REAL_METHODS )  ) ;^[CLASS] Mockito  [METHOD] spy [RETURN_TYPE] <T>   T object [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  MockitoCore  MOCKITO_CORE  boolean  T  object  
[buglab_swap_variables]^return methodCall.stub ( MOCKITO_CORE ) ;^878^^^^^877^879^return MOCKITO_CORE.stub ( methodCall ) ;^[CLASS] Mockito  [METHOD] stub [RETURN_TYPE] <T>   T methodCall [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  MockitoCore  MOCKITO_CORE  boolean  T  methodCall  
[buglab_swap_variables]^return methodCall.when ( MOCKITO_CORE ) ;^941^^^^^940^942^return MOCKITO_CORE.when ( methodCall ) ;^[CLASS] Mockito  [METHOD] when [RETURN_TYPE] <T>   T methodCall [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  MockitoCore  MOCKITO_CORE  boolean  T  methodCall  
[buglab_swap_variables]^return mock.verify ( MOCKITO_CORE, times ( 1 )  ) ;^970^^^^^969^971^return MOCKITO_CORE.verify ( mock, times ( 1 )  ) ;^[CLASS] Mockito  [METHOD] verify [RETURN_TYPE] <T>   T mock [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  MockitoCore  MOCKITO_CORE  boolean  T  mock  
[buglab_swap_variables]^return MOCKITO_CORE.verify (  times ( 1 )  ) ;^970^^^^^969^971^return MOCKITO_CORE.verify ( mock, times ( 1 )  ) ;^[CLASS] Mockito  [METHOD] verify [RETURN_TYPE] <T>   T mock [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  MockitoCore  MOCKITO_CORE  boolean  T  mock  
[buglab_swap_variables]^return mock.verify ( MOCKITO_CORE, mode ) ;^1025^^^^^1024^1026^return MOCKITO_CORE.verify ( mock, mode ) ;^[CLASS] Mockito  [METHOD] verify [RETURN_TYPE] <T>   T mock VerificationMode mode [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  MockitoCore  MOCKITO_CORE  boolean  T  mock  VerificationMode  mode  
[buglab_swap_variables]^return MOCKITO_CORE.verify (  mode ) ;^1025^^^^^1024^1026^return MOCKITO_CORE.verify ( mock, mode ) ;^[CLASS] Mockito  [METHOD] verify [RETURN_TYPE] <T>   T mock VerificationMode mode [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  MockitoCore  MOCKITO_CORE  boolean  T  mock  VerificationMode  mode  
[buglab_swap_variables]^return MOCKITO_CORE.verify ( mode, mock ) ;^1025^^^^^1024^1026^return MOCKITO_CORE.verify ( mock, mode ) ;^[CLASS] Mockito  [METHOD] verify [RETURN_TYPE] <T>   T mock VerificationMode mode [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  MockitoCore  MOCKITO_CORE  boolean  T  mock  VerificationMode  mode  
[buglab_swap_variables]^return MOCKITO_CORE.verify ( mock ) ;^1025^^^^^1024^1026^return MOCKITO_CORE.verify ( mock, mode ) ;^[CLASS] Mockito  [METHOD] verify [RETURN_TYPE] <T>   T mock VerificationMode mode [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  MockitoCore  MOCKITO_CORE  boolean  T  mock  VerificationMode  mode  
[buglab_swap_variables]^return mode.verify ( mock, MOCKITO_CORE ) ;^1025^^^^^1024^1026^return MOCKITO_CORE.verify ( mock, mode ) ;^[CLASS] Mockito  [METHOD] verify [RETURN_TYPE] <T>   T mock VerificationMode mode [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  MockitoCore  MOCKITO_CORE  boolean  T  mock  VerificationMode  mode  
[buglab_swap_variables]^return mock.stubVoid ( MOCKITO_CORE ) ;^1125^^^^^1124^1126^return MOCKITO_CORE.stubVoid ( mock ) ;^[CLASS] Mockito  [METHOD] stubVoid [RETURN_TYPE] <T>   T mock [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  MockitoCore  MOCKITO_CORE  boolean  T  mock  
[buglab_swap_variables]^return toBeThrown.doAnswer ( new ThrowsException ( MOCKITO_CORE )  ) ;^1143^^^^^1142^1144^return MOCKITO_CORE.doAnswer ( new ThrowsException ( toBeThrown )  ) ;^[CLASS] Mockito  [METHOD] doThrow [RETURN_TYPE] Stubber   Throwable toBeThrown [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  defaultAnswer  Throwable  toBeThrown  MockitoCore  MOCKITO_CORE  boolean  
[buglab_swap_variables]^return answer.doAnswer ( MOCKITO_CORE ) ;^1203^^^^^1202^1204^return MOCKITO_CORE.doAnswer ( answer ) ;^[CLASS] Mockito  [METHOD] doAnswer [RETURN_TYPE] Stubber   Answer answer [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  answer  defaultAnswer  MockitoCore  MOCKITO_CORE  boolean  
[buglab_swap_variables]^return toBeReturned.doAnswer ( new Returns ( MOCKITO_CORE )  ) ;^1288^^^^^1287^1289^return MOCKITO_CORE.doAnswer ( new Returns ( toBeReturned )  ) ;^[CLASS] Mockito  [METHOD] doReturn [RETURN_TYPE] Stubber   Object toBeReturned [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  answer  defaultAnswer  MockitoCore  MOCKITO_CORE  Object  toBeReturned  boolean  
[buglab_swap_variables]^return mocks.inOrder ( MOCKITO_CORE ) ;^1313^^^^^1312^1314^return MOCKITO_CORE.inOrder ( mocks ) ;^[CLASS] Mockito  [METHOD] inOrder [RETURN_TYPE] InOrder    mocks [VARIABLES] Answer  CALLS_REAL_METHODS  RETURNS_DEFAULTS  RETURNS_MOCKS  RETURNS_SMART_NULLS  answer  defaultAnswer  MockitoCore  MOCKITO_CORE  boolean  Object[]  mocks  
