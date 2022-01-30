[REPLACE]^public static  NotNull NOT_NULL = new NotNull (  ) ;^13^^^^^^^[REPLACE] public static final NotNull NOT_NULL = new NotNull (  ) ;^ [CLASS] NotNull  
[REPLACE]^return actual ;^20^^^^^19^21^[REPLACE] return actual != null;^[METHOD] matches [TYPE] boolean [PARAMETER] Object actual [CLASS] NotNull   [TYPE]  NotNull NOT_NULL  [TYPE]  Object actual  [TYPE]  boolean false  true 
