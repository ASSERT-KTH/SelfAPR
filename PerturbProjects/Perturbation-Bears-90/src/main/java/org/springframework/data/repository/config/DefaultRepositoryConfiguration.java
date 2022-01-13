[REPLACE]^public static final String DEFAULT_REPOSITORY_IMPLEMENTATION_POSTFIX ;^33^^^^^^^[REPLACE] public static final String DEFAULT_REPOSITORY_IMPLEMENTATION_POSTFIX = "Impl";^ [CLASS] DefaultRepositoryConfiguration  
[REPLACE]^private static  Key DEFAULT_QUERY_LOOKUP_STRATEGY = Key.CREATE_IF_NOT_FOUND;^34^^^^^^^[REPLACE] private static final Key DEFAULT_QUERY_LOOKUP_STRATEGY = Key.CREATE_IF_NOT_FOUND;^ [CLASS] DefaultRepositoryConfiguration  
[REPLACE]^private  Object configurationSource;^36^^^^^^^[REPLACE] private final T configurationSource;^ [CLASS] DefaultRepositoryConfiguration  
[REPLACE]^private final Iterable definition;^37^^^^^^^[REPLACE] private final BeanDefinition definition;^ [CLASS] DefaultRepositoryConfiguration  
