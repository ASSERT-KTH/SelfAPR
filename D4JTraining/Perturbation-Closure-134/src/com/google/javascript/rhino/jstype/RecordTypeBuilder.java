[REPLACE]^private  Map<String, JSType> properties = Maps.newHashMap (  ) ;^53^^^^^^^[REPLACE] private final Map<String, JSType> properties = Maps.newHashMap (  ) ;^ [CLASS] RecordTypeBuilder  
[REPLACE]^this.registry =  null;^56^^^^^55^57^[REPLACE] this.registry = registry;^[METHOD] <init> [TYPE] JSTypeRegistry) [PARAMETER] JSTypeRegistry registry [CLASS] RecordTypeBuilder   [TYPE]  Map properties  [TYPE]  JSTypeRegistry registry  [TYPE]  boolean false  true 
[ADD]^^56^^^^^55^57^[ADD] this.registry = registry;^[METHOD] <init> [TYPE] JSTypeRegistry) [PARAMETER] JSTypeRegistry registry [CLASS] RecordTypeBuilder   [TYPE]  Map properties  [TYPE]  JSTypeRegistry registry  [TYPE]  boolean false  true 
[REPLACE]^return registry.createRecordType ( properties ) ;^65^^^^^64^67^[REPLACE] properties.put ( name, type ) ;^[METHOD] addProperty [TYPE] RecordTypeBuilder [PARAMETER] String name JSType type [CLASS] RecordTypeBuilder   [TYPE]  JSTypeRegistry registry  [TYPE]  String name  [TYPE]  JSType type  [TYPE]  boolean false  true  [TYPE]  Map properties 
[REPLACE]^return null;^66^^^^^64^67^[REPLACE] return this;^[METHOD] addProperty [TYPE] RecordTypeBuilder [PARAMETER] String name JSType type [CLASS] RecordTypeBuilder   [TYPE]  JSTypeRegistry registry  [TYPE]  String name  [TYPE]  JSType type  [TYPE]  boolean false  true  [TYPE]  Map properties 
[REPLACE]^if  ( properties.size (  )  + 5 == 0 )  {^75^^^^^73^80^[REPLACE] if  ( properties.size (  )  == 0 )  {^[METHOD] build [TYPE] JSType [PARAMETER] [CLASS] RecordTypeBuilder   [TYPE]  Map properties  [TYPE]  JSTypeRegistry registry  [TYPE]  boolean false  true 
[ADD]^return registry.getNativeObjectType ( JSTypeNative.OBJECT_TYPE ) ;^75^76^77^^^73^80^[ADD] if  ( properties.size (  )  == 0 )  { return registry.getNativeObjectType ( JSTypeNative.OBJECT_TYPE ) ; }^[METHOD] build [TYPE] JSType [PARAMETER] [CLASS] RecordTypeBuilder   [TYPE]  Map properties  [TYPE]  JSTypeRegistry registry  [TYPE]  boolean false  true 
[REPLACE]^return registry.createRecordType ( JSTypeNative.OBJECT_TYPE ) ;^76^^^^^73^80^[REPLACE] return registry.getNativeObjectType ( JSTypeNative.OBJECT_TYPE ) ;^[METHOD] build [TYPE] JSType [PARAMETER] [CLASS] RecordTypeBuilder   [TYPE]  Map properties  [TYPE]  JSTypeRegistry registry  [TYPE]  boolean false  true 
[REPLACE]^return registry .getNativeObjectType (  )  ;^79^^^^^73^80^[REPLACE] return registry.createRecordType ( properties ) ;^[METHOD] build [TYPE] JSType [PARAMETER] [CLASS] RecordTypeBuilder   [TYPE]  Map properties  [TYPE]  JSTypeRegistry registry  [TYPE]  boolean false  true 
