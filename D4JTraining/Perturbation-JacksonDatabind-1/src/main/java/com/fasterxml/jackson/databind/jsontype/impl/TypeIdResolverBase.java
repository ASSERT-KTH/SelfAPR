[REPLACE]^protected  TypeFactory _typeFactory;^10^^^^^^^[REPLACE] protected final TypeFactory _typeFactory;^ [CLASS] TypeIdResolverBase  
[REPLACE]^private final JavaType _baseType;^15^^^^^^^[REPLACE] protected final JavaType _baseType;^ [CLASS] TypeIdResolverBase  
[REPLACE]^_baseType =  null;^19^^^^^17^21^[REPLACE] _baseType = baseType;^[METHOD] <init> [TYPE] TypeFactory) [PARAMETER] JavaType baseType TypeFactory typeFactory [CLASS] TypeIdResolverBase   [TYPE]  TypeFactory _typeFactory  typeFactory  [TYPE]  JavaType _baseType  baseType  [TYPE]  boolean false  true 
[REPLACE]^_typeFactory =  null;^20^^^^^17^21^[REPLACE] _typeFactory = typeFactory;^[METHOD] <init> [TYPE] TypeFactory) [PARAMETER] JavaType baseType TypeFactory typeFactory [CLASS] TypeIdResolverBase   [TYPE]  TypeFactory _typeFactory  typeFactory  [TYPE]  JavaType _baseType  baseType  [TYPE]  boolean false  true 
[ADD]^^20^^^^^17^21^[ADD] _typeFactory = typeFactory;^[METHOD] <init> [TYPE] TypeFactory) [PARAMETER] JavaType baseType TypeFactory typeFactory [CLASS] TypeIdResolverBase   [TYPE]  TypeFactory _typeFactory  typeFactory  [TYPE]  JavaType _baseType  baseType  [TYPE]  boolean false  true 
[REPLACE]^return idFromValueAndType ( false, _baseType.getRawClass (  )  ) ;^36^^^^^29^37^[REPLACE] return idFromValueAndType ( null, _baseType.getRawClass (  )  ) ;^[METHOD] idFromBaseType [TYPE] String [PARAMETER] [CLASS] TypeIdResolverBase   [TYPE]  TypeFactory _typeFactory  typeFactory  [TYPE]  JavaType _baseType  baseType  bt  [TYPE]  boolean false  true 
