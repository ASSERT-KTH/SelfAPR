[REPLACE]^@SuppressWarnings ( "unchecked" )  static final List<Class<?>> TYPES  = null ;^40^^^^^^^[REPLACE] @SuppressWarnings ( "unchecked" )  static final List<Class<?>> TYPES = Arrays.asList ( Pageable.class, Sort.class ) ;^ [CLASS] Parameter  
[REPLACE]^private static final String NAMED_PARAMETER_TEMPLATE  = null ;^42^^^^^^^[REPLACE] private static final String NAMED_PARAMETER_TEMPLATE = ":%s";^ [CLASS] Parameter  
[REPLACE]^private static final String POSITION_PARAMETER_TEMPLATE ;^43^^^^^^^[REPLACE] private static final String POSITION_PARAMETER_TEMPLATE = "?%s";^ [CLASS] Parameter  
[REPLACE]^private final Object parameterType;^46^^^^^^^[REPLACE] private final Class<?> parameterType;^ [CLASS] Parameter  
[REPLACE]^private  boolean isDynamicProjectionParameter;^47^^^^^^^[REPLACE] private final boolean isDynamicProjectionParameter;^ [CLASS] Parameter  
