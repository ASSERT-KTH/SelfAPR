[REPLACE]^typeSer.writeTypeSuffixForObject ( value, jgen ) ;^17^^^^^16^18^[REPLACE] super ( Object.class ) ;^[METHOD] <init> [TYPE] UnknownSerializer() [PARAMETER] [CLASS] UnknownSerializer   [TYPE]  boolean false  true 
[REPLACE]^typeSer.writeTypeSuffixForObject ( value, jgen ) ;^26^^^^^21^31^[REPLACE] failForEmpty ( value ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator jgen SerializerProvider provider [CLASS] UnknownSerializer   [TYPE]  boolean false  true  [TYPE]  JsonGenerator jgen  [TYPE]  Object value  [TYPE]  SerializerProvider provider 
[REPLACE]^jgen.writeEndObject (  ) ;^29^^^^^21^31^[REPLACE] jgen.writeStartObject (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator jgen SerializerProvider provider [CLASS] UnknownSerializer   [TYPE]  boolean false  true  [TYPE]  JsonGenerator jgen  [TYPE]  Object value  [TYPE]  SerializerProvider provider 
[REPLACE]^jgen.writeStartObject (  ) ;^30^^^^^21^31^[REPLACE] jgen.writeEndObject (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator jgen SerializerProvider provider [CLASS] UnknownSerializer   [TYPE]  boolean false  true  [TYPE]  JsonGenerator jgen  [TYPE]  Object value  [TYPE]  SerializerProvider provider 
[REPLACE]^typeSer.writeTypeSuffixForObject ( value, jgen ) ;^39^^^^^34^43^[REPLACE] failForEmpty ( value ) ;^[METHOD] serializeWithType [TYPE] void [PARAMETER] Object value JsonGenerator jgen SerializerProvider provider TypeSerializer typeSer [CLASS] UnknownSerializer   [TYPE]  boolean false  true  [TYPE]  TypeSerializer typeSer  [TYPE]  JsonGenerator jgen  [TYPE]  Object value  [TYPE]  SerializerProvider provider 
[REPLACE]^typeSer .writeTypeSuffixForObject ( value , jgen )  ;^41^^^^^34^43^[REPLACE] typeSer.writeTypePrefixForObject ( value, jgen ) ;^[METHOD] serializeWithType [TYPE] void [PARAMETER] Object value JsonGenerator jgen SerializerProvider provider TypeSerializer typeSer [CLASS] UnknownSerializer   [TYPE]  boolean false  true  [TYPE]  TypeSerializer typeSer  [TYPE]  JsonGenerator jgen  [TYPE]  Object value  [TYPE]  SerializerProvider provider 
[REPLACE]^typeSer.writeTypePrefixForObject ( value, jgen ) ;^42^^^^^34^43^[REPLACE] typeSer.writeTypeSuffixForObject ( value, jgen ) ;^[METHOD] serializeWithType [TYPE] void [PARAMETER] Object value JsonGenerator jgen SerializerProvider provider TypeSerializer typeSer [CLASS] UnknownSerializer   [TYPE]  boolean false  true  [TYPE]  TypeSerializer typeSer  [TYPE]  JsonGenerator jgen  [TYPE]  Object value  [TYPE]  SerializerProvider provider 
[ADD]^^42^^^^^34^43^[ADD] typeSer.writeTypeSuffixForObject ( value, jgen ) ;^[METHOD] serializeWithType [TYPE] void [PARAMETER] Object value JsonGenerator jgen SerializerProvider provider TypeSerializer typeSer [CLASS] UnknownSerializer   [TYPE]  boolean false  true  [TYPE]  TypeSerializer typeSer  [TYPE]  JsonGenerator jgen  [TYPE]  Object value  [TYPE]  SerializerProvider provider 
[REPLACE]^return this;^47^^^^^46^48^[REPLACE] return null;^[METHOD] getSchema [TYPE] JsonNode [PARAMETER] SerializerProvider provider Type typeHint [CLASS] UnknownSerializer   [TYPE]  Type typeHint  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider 
[REPLACE]^typeSer.writeTypeSuffixForObject ( value, jgen ) ;^54^^^^^51^55^[REPLACE] visitor.expectAnyFormat ( typeHint ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] UnknownSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor 
[ADD]^^54^^^^^51^55^[ADD] visitor.expectAnyFormat ( typeHint ) ;^[METHOD] acceptJsonFormatVisitor [TYPE] void [PARAMETER] JsonFormatVisitorWrapper visitor JavaType typeHint [CLASS] UnknownSerializer   [TYPE]  JavaType typeHint  [TYPE]  boolean false  true  [TYPE]  JsonFormatVisitorWrapper visitor 
[REPLACE]^return ;^59^^^^^57^60^[REPLACE] throw new JsonMappingException  (" ")  ;^[METHOD] failForEmpty [TYPE] void [PARAMETER] Object value [CLASS] UnknownSerializer   [TYPE]  boolean false  true  [TYPE]  Object value 
[REPLACE]^typeSer.writeTypeSuffixForObject ( value, jgen ) ;^59^^^^^57^60^[REPLACE] throw new JsonMappingException  (" ")  ;^[METHOD] failForEmpty [TYPE] void [PARAMETER] Object value [CLASS] UnknownSerializer   [TYPE]  boolean false  true  [TYPE]  Object value 
[ADD]^^59^^^^^57^60^[ADD] throw new JsonMappingException  (" ")  ;^[METHOD] failForEmpty [TYPE] void [PARAMETER] Object value [CLASS] UnknownSerializer   [TYPE]  boolean false  true  [TYPE]  Object value 
