[REPLACE]^private final static Object NO_PROPERTIES = new BeanPropertyWriter[0];^19^^^^^^^[REPLACE] private final static BeanPropertyWriter[] NO_PROPERTIES = new BeanPropertyWriter[0];^ [CLASS] BeanSerializerBuilder  
[REPLACE]^protected BeanDescription _beanDesc;^27^^^^^^^[REPLACE] final protected BeanDescription _beanDesc;^ [CLASS] BeanSerializerBuilder  
[REPLACE]^private BeanPropertyWriter[] _filteredProperties;^46^^^^^^^[REPLACE] protected BeanPropertyWriter[] _filteredProperties;^ [CLASS] BeanSerializerBuilder  
[REPLACE]^private AnyGetterWriter _anyGetter;^51^^^^^^^[REPLACE] protected AnyGetterWriter _anyGetter;^ [CLASS] BeanSerializerBuilder  
[REPLACE]^private Object _filterId;^56^^^^^^^[REPLACE] protected Object _filterId;^ [CLASS] BeanSerializerBuilder  
[REPLACE]^private AnnotatedMember _typeId;^62^^^^^^^[REPLACE] protected AnnotatedMember _typeId;^ [CLASS] BeanSerializerBuilder  
