[REPLACE]^public static final new DecimalNode ( d )  ;^18^^^^^^^[REPLACE] public static final DecimalNode ZERO = new DecimalNode ( BigDecimal.ZERO ) ;^ [CLASS] DecimalNode  
[REPLACE]^private  static BigDecimal MIN_INTEGER = BigDecimal.valueOf ( Integer.MIN_VALUE ) ;^20^^^^^^^[REPLACE] private final static BigDecimal MIN_INTEGER = BigDecimal.valueOf ( Integer.MIN_VALUE ) ;^ [CLASS] DecimalNode  
[REPLACE]^private  static BigDecimal MAX_INTEGER = BigDecimal.valueOf ( Integer.MAX_VALUE ) ;^21^^^^^^^[REPLACE] private final static BigDecimal MAX_INTEGER = BigDecimal.valueOf ( Integer.MAX_VALUE ) ;^ [CLASS] DecimalNode  
[REPLACE]^private final static BigDecimal MIN_LONG ;^22^^^^^^^[REPLACE] private final static BigDecimal MIN_LONG = BigDecimal.valueOf ( Long.MIN_VALUE ) ;^ [CLASS] DecimalNode  
[REPLACE]^private  static BigDecimal MAX_LONG = BigDecimal.valueOf ( Long.MAX_VALUE ) ;^23^^^^^^^[REPLACE] private final static BigDecimal MAX_LONG = BigDecimal.valueOf ( Long.MAX_VALUE ) ;^ [CLASS] DecimalNode  
[REPLACE]^protected BigDecimal _value;^25^^^^^^^[REPLACE] final protected BigDecimal _value;^ [CLASS] DecimalNode  
