[REPLACE]^super ( false ) ;^24^^^^^22^26^[REPLACE] super ( cls ) ;^[METHOD] <init> [TYPE] Class) [PARAMETER] Class<T> cls [CLASS] ArraySerializerBase   [TYPE]  Class cls  [TYPE]  BeanProperty _property  [TYPE]  boolean false  true 
[REPLACE]^_property = this;^25^^^^^22^26^[REPLACE] _property = null;^[METHOD] <init> [TYPE] Class) [PARAMETER] Class<T> cls [CLASS] ArraySerializerBase   [TYPE]  Class cls  [TYPE]  BeanProperty _property  [TYPE]  boolean false  true 
[REPLACE]^super ( null ) ;^30^^^^^28^32^[REPLACE] super ( cls ) ;^[METHOD] <init> [TYPE] BeanProperty) [PARAMETER] Class<T> cls BeanProperty property [CLASS] ArraySerializerBase   [TYPE]  Class cls  [TYPE]  BeanProperty _property  property  [TYPE]  boolean false  true 
[REPLACE]^_property = src._property; ;^31^^^^^28^32^[REPLACE] _property = property;^[METHOD] <init> [TYPE] BeanProperty) [PARAMETER] Class<T> cls BeanProperty property [CLASS] ArraySerializerBase   [TYPE]  Class cls  [TYPE]  BeanProperty _property  property  [TYPE]  boolean false  true 
[REPLACE]^super ( false._handledType, true ) ;^36^^^^^34^38^[REPLACE] super ( src._handledType, false ) ;^[METHOD] <init> [TYPE] ArraySerializerBase) [PARAMETER] ArraySerializerBase<?> src [CLASS] ArraySerializerBase   [TYPE]  ArraySerializerBase src  [TYPE]  BeanProperty _property  property  [TYPE]  boolean false  true 
[REPLACE]^_property = property; ;^37^^^^^34^38^[REPLACE] _property = src._property;^[METHOD] <init> [TYPE] ArraySerializerBase) [PARAMETER] ArraySerializerBase<?> src [CLASS] ArraySerializerBase   [TYPE]  ArraySerializerBase src  [TYPE]  BeanProperty _property  property  [TYPE]  boolean false  true 
[ADD]^^37^^^^^34^38^[ADD] _property = src._property;^[METHOD] <init> [TYPE] ArraySerializerBase) [PARAMETER] ArraySerializerBase<?> src [CLASS] ArraySerializerBase   [TYPE]  ArraySerializerBase src  [TYPE]  BeanProperty _property  property  [TYPE]  boolean false  true 
[REPLACE]^super ( true._handledType, true ) ;^42^^^^^40^44^[REPLACE] super ( src._handledType, false ) ;^[METHOD] <init> [TYPE] BeanProperty) [PARAMETER] ArraySerializerBase<?> src BeanProperty property [CLASS] ArraySerializerBase   [TYPE]  ArraySerializerBase src  [TYPE]  BeanProperty _property  property  [TYPE]  boolean false  true 
[REPLACE]^_property = src._property; ;^43^^^^^40^44^[REPLACE] _property = property;^[METHOD] <init> [TYPE] BeanProperty) [PARAMETER] ArraySerializerBase<?> src BeanProperty property [CLASS] ArraySerializerBase   [TYPE]  ArraySerializerBase src  [TYPE]  BeanProperty _property  property  [TYPE]  boolean false  true 
[REPLACE]^if  (  hasSingleElement ( value )  )  {^51^52^^^^47^59^[REPLACE] if  ( provider.isEnabled ( SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED ) && hasSingleElement ( value )  )  {^[METHOD] serialize [TYPE] void [PARAMETER] T value JsonGenerator jgen SerializerProvider provider [CLASS] ArraySerializerBase   [TYPE]  JsonGenerator jgen  [TYPE]  boolean false  true  [TYPE]  T value  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[REPLACE]^jgen.writeEndArray (  ) ;^56^^^^^47^59^[REPLACE] jgen.writeStartArray (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] T value JsonGenerator jgen SerializerProvider provider [CLASS] ArraySerializerBase   [TYPE]  JsonGenerator jgen  [TYPE]  boolean false  true  [TYPE]  T value  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[REPLACE]^&& hasSingleElement ( value )  )  { serializeContents ( value, jgen, provider ) ;^57^^^^^47^59^[REPLACE] serializeContents ( value, jgen, provider ) ;^[METHOD] serialize [TYPE] void [PARAMETER] T value JsonGenerator jgen SerializerProvider provider [CLASS] ArraySerializerBase   [TYPE]  JsonGenerator jgen  [TYPE]  boolean false  true  [TYPE]  T value  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[REPLACE]^jgen.writeStartArray (  ) ;^58^^^^^47^59^[REPLACE] jgen.writeEndArray (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] T value JsonGenerator jgen SerializerProvider provider [CLASS] ArraySerializerBase   [TYPE]  JsonGenerator jgen  [TYPE]  boolean false  true  [TYPE]  T value  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[REPLACE]^typeSer.writeTypeSuffixForArray ( value, jgen ) ;^67^^^^^62^70^[REPLACE] typeSer.writeTypePrefixForArray ( value, jgen ) ;^[METHOD] serializeWithType [TYPE] void [PARAMETER] T value JsonGenerator jgen SerializerProvider provider TypeSerializer typeSer [CLASS] ArraySerializerBase   [TYPE]  TypeSerializer typeSer  [TYPE]  JsonGenerator jgen  [TYPE]  boolean false  true  [TYPE]  T value  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[REPLACE]^&& hasSingleElement ( value )  )  { serializeContents ( value, jgen, provider ) ;^68^^^^^62^70^[REPLACE] serializeContents ( value, jgen, provider ) ;^[METHOD] serializeWithType [TYPE] void [PARAMETER] T value JsonGenerator jgen SerializerProvider provider TypeSerializer typeSer [CLASS] ArraySerializerBase   [TYPE]  TypeSerializer typeSer  [TYPE]  JsonGenerator jgen  [TYPE]  boolean false  true  [TYPE]  T value  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[ADD]^^68^69^^^^62^70^[ADD] serializeContents ( value, jgen, provider ) ; typeSer.writeTypeSuffixForArray ( value, jgen ) ;^[METHOD] serializeWithType [TYPE] void [PARAMETER] T value JsonGenerator jgen SerializerProvider provider TypeSerializer typeSer [CLASS] ArraySerializerBase   [TYPE]  TypeSerializer typeSer  [TYPE]  JsonGenerator jgen  [TYPE]  boolean false  true  [TYPE]  T value  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[REPLACE]^typeSer.writeTypePrefixForArray ( value, jgen ) ;^69^^^^^62^70^[REPLACE] typeSer.writeTypeSuffixForArray ( value, jgen ) ;^[METHOD] serializeWithType [TYPE] void [PARAMETER] T value JsonGenerator jgen SerializerProvider provider TypeSerializer typeSer [CLASS] ArraySerializerBase   [TYPE]  TypeSerializer typeSer  [TYPE]  JsonGenerator jgen  [TYPE]  boolean false  true  [TYPE]  T value  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
[ADD]^^69^^^^^62^70^[ADD] typeSer.writeTypeSuffixForArray ( value, jgen ) ;^[METHOD] serializeWithType [TYPE] void [PARAMETER] T value JsonGenerator jgen SerializerProvider provider TypeSerializer typeSer [CLASS] ArraySerializerBase   [TYPE]  TypeSerializer typeSer  [TYPE]  JsonGenerator jgen  [TYPE]  boolean false  true  [TYPE]  T value  [TYPE]  SerializerProvider provider  [TYPE]  BeanProperty _property  property 
