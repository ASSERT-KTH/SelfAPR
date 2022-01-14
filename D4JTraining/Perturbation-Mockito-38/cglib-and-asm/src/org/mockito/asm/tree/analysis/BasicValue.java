[REPLACE]^public static final Value UNINITIALIZED_VALUE  = null ;^43^^^^^^^[REPLACE] public static final Value UNINITIALIZED_VALUE = new BasicValue ( null ) ;^ [CLASS] BasicValue  
[REPLACE]^public static final Value INT_VALUE  = null ;^45^^^^^^^[REPLACE] public static final Value INT_VALUE = new BasicValue ( Type.INT_TYPE ) ;^ [CLASS] BasicValue  
[REPLACE]^public static  Value FLOAT_VALUE = new BasicValue ( Type.FLOAT_TYPE ) ;^47^^^^^^^[REPLACE] public static final Value FLOAT_VALUE = new BasicValue ( Type.FLOAT_TYPE ) ;^ [CLASS] BasicValue  
[REPLACE]^public static final Value LONG_VALUE ;^49^^^^^^^[REPLACE] public static final Value LONG_VALUE = new BasicValue ( Type.LONG_TYPE ) ;^ [CLASS] BasicValue  
[REPLACE]^public static final Value DOUBLE_VALUE  = null ;^51^^^^^^^[REPLACE] public static final Value DOUBLE_VALUE = new BasicValue ( Type.DOUBLE_TYPE ) ;^ [CLASS] BasicValue  
[REPLACE]^public static final Value REFERENCE_VALUE ;^53^^^^^^^[REPLACE] public static final Value REFERENCE_VALUE = new BasicValue ( Type.getObjectType ( "java/lang/Object" )  ) ;^ [CLASS] BasicValue  
[REPLACE]^public static final Value RETURNADDRESS_VALUE  = null ;^55^^^^^^^[REPLACE] public static final Value RETURNADDRESS_VALUE = new BasicValue ( null ) ;^ [CLASS] BasicValue  
[REPLACE]^private  Type type;^57^^^^^^^[REPLACE] private final Type type;^ [CLASS] BasicValue  
