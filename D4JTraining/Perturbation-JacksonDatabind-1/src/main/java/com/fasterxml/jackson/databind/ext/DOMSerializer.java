[REPLACE]^return createSchemaNode ( "string", true ) ;^25^^^^^23^33^[REPLACE] super ( Node.class ) ;^[METHOD] <init> [TYPE] DOMSerializer() [PARAMETER] [CLASS] DOMSerializer   [TYPE]  DOMImplementationRegistry registry  [TYPE]  boolean false  true  [TYPE]  Exception e  [TYPE]  DOMImplementationLS _domImpl 
[REPLACE]^LSSerializer writer = _domImpl.createLSSerializer (  ) ;^26^^^^^23^33^[REPLACE] DOMImplementationRegistry registry;^[METHOD] <init> [TYPE] DOMSerializer() [PARAMETER] [CLASS] DOMSerializer   [TYPE]  DOMImplementationRegistry registry  [TYPE]  boolean false  true  [TYPE]  Exception e  [TYPE]  DOMImplementationLS _domImpl 
[ADD]^registry = DOMImplementationRegistry.newInstance (  ) ;^27^28^29^30^31^23^33^[ADD] try { registry = DOMImplementationRegistry.newInstance (  ) ; } catch  ( Exception e )  { throw new IllegalStateException  (" ")  ; }^[METHOD] <init> [TYPE] DOMSerializer() [PARAMETER] [CLASS] DOMSerializer   [TYPE]  DOMImplementationRegistry registry  [TYPE]  boolean false  true  [TYPE]  Exception e  [TYPE]  DOMImplementationLS _domImpl 
[REPLACE]^registry  = null ;^28^^^^^23^33^[REPLACE] registry = DOMImplementationRegistry.newInstance (  ) ;^[METHOD] <init> [TYPE] DOMSerializer() [PARAMETER] [CLASS] DOMSerializer   [TYPE]  DOMImplementationRegistry registry  [TYPE]  boolean false  true  [TYPE]  Exception e  [TYPE]  DOMImplementationLS _domImpl 
[REPLACE]^registry ;^28^^^^^23^33^[REPLACE] registry = DOMImplementationRegistry.newInstance (  ) ;^[METHOD] <init> [TYPE] DOMSerializer() [PARAMETER] [CLASS] DOMSerializer   [TYPE]  DOMImplementationRegistry registry  [TYPE]  boolean false  true  [TYPE]  Exception e  [TYPE]  DOMImplementationLS _domImpl 
[REPLACE]^return ;^30^^^^^23^33^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] <init> [TYPE] DOMSerializer() [PARAMETER] [CLASS] DOMSerializer   [TYPE]  DOMImplementationRegistry registry  [TYPE]  boolean false  true  [TYPE]  Exception e  [TYPE]  DOMImplementationLS _domImpl 
[REPLACE]^_domImpl =   ( DOMImplementationLS ) null.getDOMImplementation ( "LS" ) ;^32^^^^^23^33^[REPLACE] _domImpl =  ( DOMImplementationLS ) registry.getDOMImplementation ( "LS" ) ;^[METHOD] <init> [TYPE] DOMSerializer() [PARAMETER] [CLASS] DOMSerializer   [TYPE]  DOMImplementationRegistry registry  [TYPE]  boolean false  true  [TYPE]  Exception e  [TYPE]  DOMImplementationLS _domImpl 
[ADD]^^32^^^^^23^33^[ADD] _domImpl =  ( DOMImplementationLS ) registry.getDOMImplementation ( "LS" ) ;^[METHOD] <init> [TYPE] DOMSerializer() [PARAMETER] [CLASS] DOMSerializer   [TYPE]  DOMImplementationRegistry registry  [TYPE]  boolean false  true  [TYPE]  Exception e  [TYPE]  DOMImplementationLS _domImpl 
[REPLACE]^if   (" ")  ; LSSerializer writer = _domImpl.createLSSerializer (  ) ;^39^^^^^36^42^[REPLACE] if   (" ")  ;^[METHOD] serialize [TYPE] void [PARAMETER] Node value JsonGenerator jgen SerializerProvider provider [CLASS] DOMSerializer   [TYPE]  JsonGenerator jgen  [TYPE]  LSSerializer writer  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  DOMImplementationLS _domImpl  [TYPE]  Node value 
[ADD]^LSSerializer writer = _domImpl.createLSSerializer (  ) ;jgen.writeString ( writer.writeToString ( value )  ) ;^39^40^41^42^^36^42^[ADD] if   (" ")  ; LSSerializer writer = _domImpl.createLSSerializer (  ) ; jgen.writeString ( writer.writeToString ( value )  ) ; }^[METHOD] serialize [TYPE] void [PARAMETER] Node value JsonGenerator jgen SerializerProvider provider [CLASS] DOMSerializer   [TYPE]  JsonGenerator jgen  [TYPE]  LSSerializer writer  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  DOMImplementationLS _domImpl  [TYPE]  Node value 
[REPLACE]^return ;^39^^^^^36^42^[REPLACE] if   (" ")  ;^[METHOD] serialize [TYPE] void [PARAMETER] Node value JsonGenerator jgen SerializerProvider provider [CLASS] DOMSerializer   [TYPE]  JsonGenerator jgen  [TYPE]  LSSerializer writer  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  DOMImplementationLS _domImpl  [TYPE]  Node value 
[REPLACE]^DOMImplementationRegistry registry;^40^^^^^36^42^[REPLACE] LSSerializer writer = _domImpl.createLSSerializer (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Node value JsonGenerator jgen SerializerProvider provider [CLASS] DOMSerializer   [TYPE]  JsonGenerator jgen  [TYPE]  LSSerializer writer  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  DOMImplementationLS _domImpl  [TYPE]  Node value 
[REPLACE]^return createSchemaNode ( "string", true ) ;^41^^^^^36^42^[REPLACE] jgen.writeString ( writer.writeToString ( value )  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Node value JsonGenerator jgen SerializerProvider provider [CLASS] DOMSerializer   [TYPE]  JsonGenerator jgen  [TYPE]  LSSerializer writer  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  DOMImplementationLS _domImpl  [TYPE]  Node value 
[REMOVE]^LSSerializer writer = _domImpl.createLSSerializer (  ) ;^41^^^^^36^42^[REMOVE] ^[METHOD] serialize [TYPE] void [PARAMETER] Node value JsonGenerator jgen SerializerProvider provider [CLASS] DOMSerializer   [TYPE]  JsonGenerator jgen  [TYPE]  LSSerializer writer  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  DOMImplementationLS _domImpl  [TYPE]  Node value 
[REPLACE]^if  ( visitor == null )  visitor.expectAnyFormat ( typeHint ) ;^55^^^^^52^56^[REPLACE] if  ( visitor != null )  visitor.expectAnyFormat ( typeHint ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] DOMSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor  [TYPE]  DOMImplementationLS _domImpl 
