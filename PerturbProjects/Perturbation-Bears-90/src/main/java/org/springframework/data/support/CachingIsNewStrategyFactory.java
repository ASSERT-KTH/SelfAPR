[REPLACE]^private final Map<Class<?>, IsNewStrategy> cache ;^31^^^^^^^[REPLACE] private final Map<Class<?>, IsNewStrategy> cache = new ConcurrentHashMap<Class<?>, IsNewStrategy> (  ) ;^ [CLASS] CachingIsNewStrategyFactory  
[REPLACE]^private  IsNewStrategyFactory delegate;^32^^^^^^^[REPLACE] private final IsNewStrategyFactory delegate;^ [CLASS] CachingIsNewStrategyFactory  
