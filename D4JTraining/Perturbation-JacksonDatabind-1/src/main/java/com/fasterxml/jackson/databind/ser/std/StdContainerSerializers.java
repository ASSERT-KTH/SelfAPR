[REPLACE]^return new IndexedListSerializer ( elemType, staticTyping, vts, false, valueSerializer ) ;^25^^^^^22^26^[REPLACE] return new IndexedListSerializer ( elemType, staticTyping, vts, null, valueSerializer ) ;^[METHOD] indexedListSerializer [TYPE] ContainerSerializer [PARAMETER] JavaType elemType boolean staticTyping TypeSerializer vts Object> valueSerializer [CLASS] StdContainerSerializers   [TYPE]  JavaType elemType  [TYPE]  boolean false  staticTyping  true  [TYPE]  TypeSerializer vts  [TYPE]  JsonSerializer valueSerializer 
[REPLACE]^return new CollectionSerializer ( elemType, staticTyping, vts, this, valueSerializer ) ;^34^^^^^31^35^[REPLACE] return new CollectionSerializer ( elemType, staticTyping, vts, null, valueSerializer ) ;^[METHOD] collectionSerializer [TYPE] ContainerSerializer [PARAMETER] JavaType elemType boolean staticTyping TypeSerializer vts Object> valueSerializer [CLASS] StdContainerSerializers   [TYPE]  JavaType elemType  [TYPE]  boolean false  staticTyping  true  [TYPE]  TypeSerializer vts  [TYPE]  JsonSerializer valueSerializer 
[REPLACE]^return new IteratorSerializer ( elemType, staticTyping, vts, false ) ;^40^^^^^37^41^[REPLACE] return new IteratorSerializer ( elemType, staticTyping, vts, null ) ;^[METHOD] iteratorSerializer [TYPE] ContainerSerializer [PARAMETER] JavaType elemType boolean staticTyping TypeSerializer vts [CLASS] StdContainerSerializers   [TYPE]  JavaType elemType  [TYPE]  boolean false  staticTyping  true  [TYPE]  TypeSerializer vts 
[REPLACE]^return new IterableSerializer ( elemType, staticTyping, vts, false ) ;^46^^^^^43^47^[REPLACE] return new IterableSerializer ( elemType, staticTyping, vts, null ) ;^[METHOD] iterableSerializer [TYPE] ContainerSerializer [PARAMETER] JavaType elemType boolean staticTyping TypeSerializer vts [CLASS] StdContainerSerializers   [TYPE]  JavaType elemType  [TYPE]  boolean false  staticTyping  true  [TYPE]  TypeSerializer vts 
[REPLACE]^return new EnumSetSerializer ( enumType, this ) ;^51^^^^^49^52^[REPLACE] return new EnumSetSerializer ( enumType, null ) ;^[METHOD] enumSetSerializer [TYPE] JsonSerializer [PARAMETER] JavaType enumType [CLASS] StdContainerSerializers   [TYPE]  JavaType enumType  [TYPE]  boolean false  true 
[REPLACE]^return indexedListSerializer ( elemType, true, vts, valueSerializer ) ;^68^^^^^64^69^[REPLACE] return indexedListSerializer ( elemType, staticTyping, vts, valueSerializer ) ;^[METHOD] indexedListSerializer [TYPE] ContainerSerializer [PARAMETER] JavaType elemType boolean staticTyping TypeSerializer vts BeanProperty property Object> valueSerializer [CLASS] StdContainerSerializers   [TYPE]  JavaType elemType  [TYPE]  boolean false  staticTyping  true  [TYPE]  TypeSerializer vts  [TYPE]  JsonSerializer valueSerializer  [TYPE]  BeanProperty property 
[REPLACE]^return collectionSerializer ( elemType, staticTyping, vts, false ) ;^79^^^^^75^80^[REPLACE] return collectionSerializer ( elemType, staticTyping, vts, valueSerializer ) ;^[METHOD] collectionSerializer [TYPE] ContainerSerializer [PARAMETER] JavaType elemType boolean staticTyping TypeSerializer vts BeanProperty property Object> valueSerializer [CLASS] StdContainerSerializers   [TYPE]  JavaType elemType  [TYPE]  boolean false  staticTyping  true  [TYPE]  TypeSerializer vts  [TYPE]  JsonSerializer valueSerializer  [TYPE]  BeanProperty property 
