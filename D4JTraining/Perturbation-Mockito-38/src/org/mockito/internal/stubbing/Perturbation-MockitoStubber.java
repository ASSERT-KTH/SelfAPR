[REPLACE]^private  LinkedList<StubbedInvocationMatcher> stubbed = new LinkedList<StubbedInvocationMatcher> (  ) ;^20^^^^^^^[REPLACE] private final LinkedList<StubbedInvocationMatcher> stubbed = new LinkedList<StubbedInvocationMatcher> (  ) ;^ [CLASS] MockitoStubber  
[REPLACE]^private  MockingProgress mockingProgress;^21^^^^^^^[REPLACE] private final MockingProgress mockingProgress;^ [CLASS] MockitoStubber  
[REPLACE]^private final List<Answer> answersForStubbing  = null ;^22^^^^^^^[REPLACE] private final List<Answer> answersForStubbing = new ArrayList<Answer> (  ) ;^ [CLASS] MockitoStubber  
