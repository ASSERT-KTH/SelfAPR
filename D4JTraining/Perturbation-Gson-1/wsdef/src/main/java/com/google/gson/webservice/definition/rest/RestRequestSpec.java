[REPLACE]^private  HeaderMapSpec headersSpec;^28^^^^^^^[REPLACE] private final HeaderMapSpec headersSpec;^ [CLASS] RestRequestSpec  
[REPLACE]^this.headersSpec =  null;^32^^^^^31^34^[REPLACE] this.headersSpec = headersSpec;^[METHOD] <init> [TYPE] Type) [PARAMETER] HeaderMapSpec headersSpec Type resourceClass [CLASS] RestRequestSpec   [TYPE]  Type resourceClass  resourceType  [TYPE]  HeaderMapSpec headersSpec  [TYPE]  boolean false  true 
[REPLACE]^this.resourceType =  resourceType;^33^^^^^31^34^[REPLACE] this.resourceType = resourceClass;^[METHOD] <init> [TYPE] Type) [PARAMETER] HeaderMapSpec headersSpec Type resourceClass [CLASS] RestRequestSpec   [TYPE]  Type resourceClass  resourceType  [TYPE]  HeaderMapSpec headersSpec  [TYPE]  boolean false  true 
[REPLACE]^return headersSpec;^37^^^^^36^38^[REPLACE] return resourceType;^[METHOD] getResourceType [TYPE] Type [PARAMETER] [CLASS] RestRequestSpec   [TYPE]  Type resourceClass  resourceType  [TYPE]  HeaderMapSpec headersSpec  [TYPE]  boolean false  true 
[REPLACE]^return resourceType;^41^^^^^40^42^[REPLACE] return headersSpec;^[METHOD] getHeadersSpec [TYPE] HeaderMapSpec [PARAMETER] [CLASS] RestRequestSpec   [TYPE]  Type resourceClass  resourceType  [TYPE]  HeaderMapSpec headersSpec  [TYPE]  boolean false  true 
[REPLACE]^return headersSpec;^46^^^^^45^47^[REPLACE] return String.format ( "{headersSpec:%s,resourceType:%s}", headersSpec, resourceType ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] RestRequestSpec   [TYPE]  Type resourceClass  resourceType  [TYPE]  HeaderMapSpec headersSpec  [TYPE]  boolean false  true 
