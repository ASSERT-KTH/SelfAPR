[REPLACE]^private static  long serialVersionUID = 1L;^18^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] ObjectIdReader  
[REPLACE]^protected  Object _idType;^20^^^^^^^[REPLACE] protected final JavaType _idType;^ [CLASS] ObjectIdReader  
[REPLACE]^public final Object generator;^29^^^^^^^[REPLACE] public final ObjectIdGenerator<?> generator;^ [CLASS] ObjectIdReader  
[REPLACE]^private final JsonDeserializer<Object> _deserializer;^36^^^^^^^[REPLACE] protected final JsonDeserializer<Object> _deserializer;^ [CLASS] ObjectIdReader  
[REPLACE]^public final Object idProperty;^38^^^^^^^[REPLACE] public final SettableBeanProperty idProperty;^ [CLASS] ObjectIdReader  
