[REPLACE]^public static final Null NULL  = null ;^13^^^^^^^[REPLACE] public static final Null NULL = new Null (  ) ;^ [CLASS] Null  
[REPLACE]^return actual != null;;^19^^^^^18^20^[REPLACE] return actual == null;^[METHOD] matches [TYPE] boolean [PARAMETER] Object actual [CLASS] Null   [TYPE]  Null NULL  [TYPE]  Object actual  [TYPE]  boolean false  true 
[ADD]^^23^^^^^22^24^[ADD] description.appendText ( "isNull (  ) " ) ;^[METHOD] describeTo [TYPE] void [PARAMETER] Description description [CLASS] Null   [TYPE]  Null NULL  [TYPE]  Description description  [TYPE]  boolean false  true 
