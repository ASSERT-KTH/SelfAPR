[REPLACE]^private static final long serialVersionUID ;^14^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] SerializerFactoryConfig  
[REPLACE]^protected final static Serializers[] NO_SERIALIZERS  = null ;^19^^^^^^^[REPLACE] protected final static Serializers[] NO_SERIALIZERS = new Serializers[0];^ [CLASS] SerializerFactoryConfig  
[REPLACE]^protected final static BeanSerializerModifier[] NO_MODIFIERS ;^21^^^^^^^[REPLACE] protected final static BeanSerializerModifier[] NO_MODIFIERS = new BeanSerializerModifier[0];^ [CLASS] SerializerFactoryConfig  
[REPLACE]^protected  Serializers[] _additionalSerializers;^27^^^^^^^[REPLACE] protected final Serializers[] _additionalSerializers;^ [CLASS] SerializerFactoryConfig  
[REPLACE]^protected  Object _additionalKeySerializers;^33^^^^^^^[REPLACE] protected final Serializers[] _additionalKeySerializers;^ [CLASS] SerializerFactoryConfig  
[REPLACE]^protected final Object _modifiers;^39^^^^^^^[REPLACE] protected final BeanSerializerModifier[] _modifiers;^ [CLASS] SerializerFactoryConfig  
