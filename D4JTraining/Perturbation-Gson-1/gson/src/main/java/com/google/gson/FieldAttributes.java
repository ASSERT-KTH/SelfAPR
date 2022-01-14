[REPLACE]^private static final String MAX_CACHE_PROPERTY_NAME ;^37^38^^^^37^38^[REPLACE] private static final String MAX_CACHE_PROPERTY_NAME = "com.google.gson.annotation_cache_size_hint";^ [CLASS] FieldAttributes  
[REPLACE]^private static final Cache<Pair<Class<?>, String>, Collection<Annotation>> ANNOTATION_CACHE ;^40^41^^^^40^41^[REPLACE] private static final Cache<Pair<Class<?>, String>, Collection<Annotation>> ANNOTATION_CACHE = new LruCache<Pair<Class<?>,String>, Collection<Annotation>> ( getMaxCacheSize (  )  ) ;^ [CLASS] FieldAttributes  
[REPLACE]^private  Class<?> declaringClazz;^43^^^^^^^[REPLACE] private final Class<?> declaringClazz;^ [CLASS] FieldAttributes  
[REPLACE]^private  Class<?> declaredType;^45^^^^^^^[REPLACE] private final Class<?> declaredType;^ [CLASS] FieldAttributes  
[REPLACE]^private  boolean isSynthetic;^46^^^^^^^[REPLACE] private final boolean isSynthetic;^ [CLASS] FieldAttributes  
