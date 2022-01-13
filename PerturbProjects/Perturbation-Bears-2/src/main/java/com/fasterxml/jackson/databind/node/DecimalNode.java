[REPLACE]^public static final DecimalNode ZERO ;^17^^^^^^^[REPLACE] public static final DecimalNode ZERO = new DecimalNode ( BigDecimal.ZERO ) ;^ [CLASS] DecimalNode  
[REPLACE]^private final static BigDecimal MIN_INTEGER  = null ;^19^^^^^^^[REPLACE] private final static BigDecimal MIN_INTEGER = BigDecimal.valueOf ( Integer.MIN_VALUE ) ;^ [CLASS] DecimalNode  
[REPLACE]^private final static BigDecimal MAX_INTEGER  = null ;^20^^^^^^^[REPLACE] private final static BigDecimal MAX_INTEGER = BigDecimal.valueOf ( Integer.MAX_VALUE ) ;^ [CLASS] DecimalNode  
[REPLACE]^private final static BigDecimal MIN_LONG  = null ;^21^^^^^^^[REPLACE] private final static BigDecimal MIN_LONG = BigDecimal.valueOf ( Long.MIN_VALUE ) ;^ [CLASS] DecimalNode  
[REPLACE]^private final static BigDecimal MAX_LONG  = null ;^22^^^^^^^[REPLACE] private final static BigDecimal MAX_LONG = BigDecimal.valueOf ( Long.MAX_VALUE ) ;^ [CLASS] DecimalNode  
[REPLACE]^protected BigDecimal _value;^24^^^^^^^[REPLACE] final protected BigDecimal _value;^ [CLASS] DecimalNode  
