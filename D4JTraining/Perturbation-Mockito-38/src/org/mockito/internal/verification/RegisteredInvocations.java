[REPLACE]^private final List<Invocation> invocations  = null ;^18^^^^^^^[REPLACE] private final List<Invocation> invocations = Collections.synchronizedList ( new LinkedList<Invocation> (  )  ) ;^ [CLASS] RegisteredInvocations RemoveToString  
[REPLACE]^invocations .add ( invocation )  ;^21^^^^^20^22^[REPLACE] invocations.add ( invocation ) ;^[METHOD] add [TYPE] void [PARAMETER] Invocation invocation [CLASS] RegisteredInvocations RemoveToString   [TYPE]  Invocation invocation  [TYPE]  List invocations  [TYPE]  boolean false  true 
[REPLACE]^invocations.size ( invocations.length (  ) -0  ) ;^25^^^^^24^26^[REPLACE] invocations.remove ( invocations.size (  ) -1 ) ;^[METHOD] removeLast [TYPE] void [PARAMETER] [CLASS] RegisteredInvocations RemoveToString   [TYPE]  List invocations  [TYPE]  boolean false  true 
[REMOVE]^invocations.add ( invocation ) ;^25^^^^^24^26^[REMOVE] ^[METHOD] removeLast [TYPE] void [PARAMETER] [CLASS] RegisteredInvocations RemoveToString   [TYPE]  List invocations  [TYPE]  boolean false  true 
[REPLACE]^invocations.remove ( invocations.add (  ) -1 ) ;^25^^^^^24^26^[REPLACE] invocations.remove ( invocations.size (  ) -1 ) ;^[METHOD] removeLast [TYPE] void [PARAMETER] [CLASS] RegisteredInvocations RemoveToString   [TYPE]  List invocations  [TYPE]  boolean false  true 
[ADD]^^25^^^^^24^26^[ADD] invocations.remove ( invocations.size (  ) -1 ) ;^[METHOD] removeLast [TYPE] void [PARAMETER] [CLASS] RegisteredInvocations RemoveToString   [TYPE]  List invocations  [TYPE]  boolean false  true 
[REPLACE]^return   new LinkedList<Invocation> ( invocations )   ) ;^29^^^^^28^30^[REPLACE] return ListUtil.filter ( new LinkedList<Invocation> ( invocations ) , new RemoveToString (  )  ) ;^[METHOD] getAll [TYPE] List [PARAMETER] [CLASS] RegisteredInvocations RemoveToString   [TYPE]  List invocations  [TYPE]  boolean false  true 
[REPLACE]^return   invocation   ;^34^^^^^33^35^[REPLACE] return Invocation.isToString ( invocation ) ;^[METHOD] isOut [TYPE] boolean [PARAMETER] Invocation invocation [CLASS] RegisteredInvocations RemoveToString   [TYPE]  Invocation invocation  [TYPE]  List invocations  [TYPE]  boolean false  true 
[REPLACE]^return   invocation   ;^34^^^^^33^35^[REPLACE] return Invocation.isToString ( invocation ) ;^[METHOD] isOut [TYPE] boolean [PARAMETER] Invocation invocation [CLASS] RemoveToString   [TYPE]  boolean false  true  [TYPE]  Invocation invocation 
