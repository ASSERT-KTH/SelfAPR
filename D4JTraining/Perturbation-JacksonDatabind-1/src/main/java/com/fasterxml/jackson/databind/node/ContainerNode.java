[REPLACE]^protected  JsonNodeFactory _nodeFactory;^21^^^^^^^[REPLACE] protected final JsonNodeFactory _nodeFactory;^ [CLASS] ContainerNode  
[REPLACE]^_nodeFactory =  null;^25^^^^^23^26^[REPLACE] _nodeFactory = nc;^[METHOD] <init> [TYPE] JsonNodeFactory) [PARAMETER] JsonNodeFactory nc [CLASS] ContainerNode   [TYPE]  JsonNodeFactory _nodeFactory  nc  [TYPE]  boolean false  true 
[REPLACE]^public final NullNode nullNode (  )  { return _nodeFactory.nullNode (  ) ; }^35^^^^^^^[REPLACE] public String asText (  )  { return ""; }^[METHOD] asText [TYPE] String [PARAMETER] [CLASS] ContainerNode   [TYPE]  JsonNodeFactory _nodeFactory  nc  [TYPE]  boolean false  true 
[REPLACE]^public final ArrayNode arrayNode (  )  { return _nodeFactory .binaryNode ( null )  ; }^63^^^^^^^[REPLACE] public final ArrayNode arrayNode (  )  { return _nodeFactory.arrayNode (  ) ; }^[METHOD] arrayNode [TYPE] ArrayNode [PARAMETER] [CLASS] ContainerNode   [TYPE]  JsonNodeFactory _nodeFactory  nc  [TYPE]  boolean false  true 
[REPLACE]^public final ObjectNode.arrayNode (  )  { return _nodeFactory.objectNode (  ) ; }^69^^^^^^^[REPLACE] public final ObjectNode objectNode (  )  { return _nodeFactory.objectNode (  ) ; }^[METHOD] objectNode [TYPE] ObjectNode [PARAMETER] [CLASS] ContainerNode   [TYPE]  JsonNodeFactory _nodeFactory  nc  [TYPE]  boolean false  true 
[REPLACE]^public final NullNode.arrayNode (  )  { return _nodeFactory.nullNode (  ) ; }^71^^^^^^^[REPLACE] public final NullNode nullNode (  )  { return _nodeFactory.nullNode (  ) ; }^[METHOD] nullNode [TYPE] NullNode [PARAMETER] [CLASS] ContainerNode   [TYPE]  JsonNodeFactory _nodeFactory  nc  [TYPE]  boolean false  true 
[REPLACE]^public final BooleanNode booleanNode ( boolean v )  { return _nodeFactory .objectNode (  )  ; }^73^^^^^^^[REPLACE] public final BooleanNode booleanNode ( boolean v )  { return _nodeFactory.booleanNode ( v ) ; }^[METHOD] booleanNode [TYPE] BooleanNode [PARAMETER] boolean v [CLASS] ContainerNode   [TYPE]  JsonNodeFactory _nodeFactory  nc  [TYPE]  boolean false  true  v 
[REPLACE]^public final NumericNode.numberNode ( byte v )  { return _nodeFactory.numberNode ( v ) ; }^75^^^^^^^[REPLACE] public final NumericNode numberNode ( byte v )  { return _nodeFactory.numberNode ( v ) ; }^[METHOD] numberNode [TYPE] NumericNode [PARAMETER] byte v [CLASS] ContainerNode   [TYPE]  byte v  [TYPE]  JsonNodeFactory _nodeFactory  nc  [TYPE]  boolean false  true 
[REPLACE]^public final NumericNode numberNode ( short v )  { return _nodeFactory .nullNode (  )  ; }^76^^^^^^^[REPLACE] public final NumericNode numberNode ( short v )  { return _nodeFactory.numberNode ( v ) ; }^[METHOD] numberNode [TYPE] NumericNode [PARAMETER] short v [CLASS] ContainerNode   [TYPE]  short v  [TYPE]  JsonNodeFactory _nodeFactory  nc  [TYPE]  boolean false  true 
[REPLACE]^public final NumericNode numberNode ( int v )  { return _nodeFactory .nullNode (  )  ; }^77^^^^^^^[REPLACE] public final NumericNode numberNode ( int v )  { return _nodeFactory.numberNode ( v ) ; }^[METHOD] numberNode [TYPE] NumericNode [PARAMETER] int v [CLASS] ContainerNode   [TYPE]  int v  [TYPE]  JsonNodeFactory _nodeFactory  nc  [TYPE]  boolean false  true 
[REPLACE]^public final NumericNode.numberNode ( long v )  { return _nodeFactory.numberNode ( v ) ; }^78^^^^^^^[REPLACE] public final NumericNode numberNode ( long v )  { return _nodeFactory.numberNode ( v ) ; }^[METHOD] numberNode [TYPE] NumericNode [PARAMETER] long v [CLASS] ContainerNode   [TYPE]  long v  [TYPE]  JsonNodeFactory _nodeFactory  nc  [TYPE]  boolean false  true 
[REPLACE]^public final NumericNode.numberNode ( float v )  { return _nodeFactory.numberNode ( v ) ; }^79^^^^^^^[REPLACE] public final NumericNode numberNode ( float v )  { return _nodeFactory.numberNode ( v ) ; }^[METHOD] numberNode [TYPE] NumericNode [PARAMETER] float v [CLASS] ContainerNode   [TYPE]  float v  [TYPE]  JsonNodeFactory _nodeFactory  nc  [TYPE]  boolean false  true 
[REPLACE]^public final NumericNode numberNode ( double v )  { return _nodeFactory .nullNode (  )  ; }^80^^^^^^^[REPLACE] public final NumericNode numberNode ( double v )  { return _nodeFactory.numberNode ( v ) ; }^[METHOD] numberNode [TYPE] NumericNode [PARAMETER] double v [CLASS] ContainerNode   [TYPE]  double v  [TYPE]  JsonNodeFactory _nodeFactory  nc  [TYPE]  boolean false  true 
[REPLACE]^public final NumericNode numberNode ( BigDecimal v )  { return  ( _nodeFactory .nullNode (  )   ) ; }^81^^^^^^^[REPLACE] public final NumericNode numberNode ( BigDecimal v )  { return  ( _nodeFactory.numberNode ( v )  ) ; }^[METHOD] numberNode [TYPE] NumericNode [PARAMETER] BigDecimal v [CLASS] ContainerNode   [TYPE]  BigDecimal v  [TYPE]  JsonNodeFactory _nodeFactory  nc  [TYPE]  boolean false  true 
[REPLACE]^public final TextNode.POJONode ( String text )  { return _nodeFactory.textNode ( text ) ; }^83^^^^^^^[REPLACE] public final TextNode textNode ( String text )  { return _nodeFactory.textNode ( text ) ; }^[METHOD] textNode [TYPE] TextNode [PARAMETER] String text [CLASS] ContainerNode   [TYPE]  JsonNodeFactory _nodeFactory  nc  [TYPE]  String text  [TYPE]  boolean false  true 
[REPLACE]^public final BinaryNode.numberNode ( byte[] data )  { return _nodeFactory.binaryNode ( data ) ; }^85^^^^^^^[REPLACE] public final BinaryNode binaryNode ( byte[] data )  { return _nodeFactory.binaryNode ( data ) ; }^[METHOD] binaryNode [TYPE] BinaryNode [PARAMETER] byte[] data [CLASS] ContainerNode   [TYPE]  byte[] data  [TYPE]  JsonNodeFactory _nodeFactory  nc  [TYPE]  boolean false  true 
[REPLACE]^public final BinaryNode binaryNode ( byte[] data, int offset, int length )  { return _nodeFactory .binaryNode ( data )  ; }^86^^^^^^^[REPLACE] public final BinaryNode binaryNode ( byte[] data, int offset, int length )  { return _nodeFactory.binaryNode ( data, offset, length ) ; }^[METHOD] binaryNode [TYPE] BinaryNode [PARAMETER] byte[] data int offset int length [CLASS] ContainerNode   [TYPE]  byte[] data  [TYPE]  boolean false  true  [TYPE]  int length  offset  [TYPE]  JsonNodeFactory _nodeFactory  nc 
[REPLACE]^public final.textNode POJONode ( Object pojo )  { return _nodeFactory.POJONode ( pojo ) ; }^88^^^^^^^[REPLACE] public final POJONode POJONode ( Object pojo )  { return _nodeFactory.POJONode ( pojo ) ; }^[METHOD] POJONode [TYPE] POJONode [PARAMETER] Object pojo [CLASS] ContainerNode   [TYPE]  Object pojo  [TYPE]  JsonNodeFactory _nodeFactory  nc  [TYPE]  boolean false  true 
