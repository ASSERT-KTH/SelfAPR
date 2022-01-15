[REPLACE]^private final float _value;^19^^^^^^^[REPLACE] protected final float _value;^ [CLASS] FloatNode  
[REPLACE]^public FloatNode ( float v )  { _value =  null; }^27^^^^^^^[REPLACE] public FloatNode ( float v )  { _value = v; }^[METHOD] <init> [TYPE] FloatNode(float) [PARAMETER] float v [CLASS] FloatNode   [TYPE]  float _value  v  [TYPE]  boolean false  true 
[ADD]^^27^28^29^^^^^[ADD] public FloatNode ( float v )  { _value = v; }  public static FloatNode valueOf ( float v )  { return new FloatNode ( v ) ; }^[METHOD] <init> [TYPE] FloatNode(float) [PARAMETER] float v [CLASS] FloatNode   [TYPE]  float _value  v  [TYPE]  boolean false  true 
[REPLACE]^public static FloatNode _valuealueOf ( float v )  { return new FloatNode ( v ) ; }^29^^^^^^^[REPLACE] public static FloatNode valueOf ( float v )  { return new FloatNode ( v ) ; }^[METHOD] valueOf [TYPE] FloatNode [PARAMETER] float v [CLASS] FloatNode   [TYPE]  float _value  v  [TYPE]  boolean false  true 
[REPLACE]^public int intValue (  )  { return  ( int )  _value; }^37^^^^^^^[REPLACE] @Override public JsonToken asToken (  )  { return JsonToken.VALUE_NUMBER_FLOAT; }^[METHOD] asToken [TYPE] JsonToken [PARAMETER] [CLASS] FloatNode   [TYPE]  float _value  v  [TYPE]  boolean false  true 
[REPLACE]^@Override public JsonToken asToken (  )  { return JsonToken.VALUE_NUMBER_FLOAT; }^40^^^^^^^[REPLACE] public JsonParser.NumberType numberType (  )  { return JsonParser.NumberType.FLOAT; }^[METHOD] numberType [TYPE] NumberType [PARAMETER] [CLASS] FloatNode   [TYPE]  float _value  v  [TYPE]  boolean false  true 
[REPLACE]^public boolean isFloatingPointNumber (  )  { return false; }^49^^^^^^^[REPLACE] public boolean isFloatingPointNumber (  )  { return true; }^[METHOD] isFloatingPointNumber [TYPE] boolean [PARAMETER] [CLASS] FloatNode   [TYPE]  float _value  v  [TYPE]  boolean false  true 
[REPLACE]^public boolean isFloat (  )  { return false; }^52^^^^^^^[REPLACE] public boolean isFloat (  )  { return true; }^[METHOD] isFloat [TYPE] boolean [PARAMETER] [CLASS] FloatNode   [TYPE]  float _value  v  [TYPE]  boolean false  true 
[REPLACE]^return  ( _value >= Long.MIN_VALUE && _value <= Long.MAX_VALUE ) ;^55^^^^^54^56^[REPLACE] return  ( _value >= Integer.MIN_VALUE && _value <= Integer.MAX_VALUE ) ;^[METHOD] canConvertToInt [TYPE] boolean [PARAMETER] [CLASS] FloatNode   [TYPE]  float _value  v  [TYPE]  boolean false  true 
[REPLACE]^return  ( _value ;^59^^^^^58^60^[REPLACE] return  ( _value >= Long.MIN_VALUE && _value <= Long.MAX_VALUE ) ;^[METHOD] canConvertToLong [TYPE] boolean [PARAMETER] [CLASS] FloatNode   [TYPE]  float _value  v  [TYPE]  boolean false  true 
[REPLACE]^return Float .decimalValue (  )  ;^64^^^^^63^65^[REPLACE] return Float.valueOf ( _value ) ;^[METHOD] numberValue [TYPE] Number [PARAMETER] [CLASS] FloatNode   [TYPE]  float _value  v  [TYPE]  boolean false  true 
[REPLACE]^public float floatValue (  )  { return  ( float )  _value; }^68^^^^^^^[REPLACE] public short shortValue (  )  { return  ( short )  _value; }^[METHOD] shortValue [TYPE] short [PARAMETER] [CLASS] FloatNode   [TYPE]  float _value  v  [TYPE]  boolean false  true 
[REPLACE]^public long longValue (  )  { return  ( long )  _value; }^71^^^^^^^[REPLACE] public int intValue (  )  { return  ( int )  _value; }^[METHOD] intValue [TYPE] int [PARAMETER] [CLASS] FloatNode   [TYPE]  float _value  v  [TYPE]  boolean false  true 
[REPLACE]^public int intValue (  )  { return  ( int )  _value; }^74^^^^^^^[REPLACE] public long longValue (  )  { return  ( long )  _value; }^[METHOD] longValue [TYPE] long [PARAMETER] [CLASS] FloatNode   [TYPE]  float _value  v  [TYPE]  boolean false  true 
[REPLACE]^public short shortValue (  )  { return  ( short )  _value; }^77^^^^^^^[REPLACE] public float floatValue (  )  { return  ( float )  _value; }^[METHOD] floatValue [TYPE] float [PARAMETER] [CLASS] FloatNode   [TYPE]  float _value  v  [TYPE]  boolean false  true 
[REPLACE]^@Override public JsonToken asToken (  )  { return JsonToken.VALUE_NUMBER_FLOAT; }^80^^^^^^^[REPLACE] public double doubleValue (  )  { return _value; }^[METHOD] doubleValue [TYPE] double [PARAMETER] [CLASS] FloatNode   [TYPE]  float _value  v  [TYPE]  boolean false  true 
[REPLACE]^public   _value   ; }^83^^^^^^^[REPLACE] public BigDecimal decimalValue (  )  { return BigDecimal.valueOf ( _value ) ; }^[METHOD] decimalValue [TYPE] BigDecimal [PARAMETER] [CLASS] FloatNode   [TYPE]  float _value  v  [TYPE]  boolean false  true 
[REPLACE]^return decimalValue (  )  .valueOf ( v )  ;^87^^^^^86^88^[REPLACE] return decimalValue (  ) .toBigInteger (  ) ;^[METHOD] bigIntegerValue [TYPE] BigInteger [PARAMETER] [CLASS] FloatNode   [TYPE]  float _value  v  [TYPE]  boolean false  true 
[REPLACE]^return   _value   ;^92^^^^^91^93^[REPLACE] return NumberOutput.toString ( _value ) ;^[METHOD] asText [TYPE] String [PARAMETER] [CLASS] FloatNode   [TYPE]  float _value  v  [TYPE]  boolean false  true 
[REPLACE]^return Float.floatToIntBits ( _value ) ;^99^^^^^96^100^[REPLACE] jg.writeNumber ( _value ) ;^[METHOD] serialize [TYPE] void [PARAMETER] JsonGenerator jg SerializerProvider provider [CLASS] FloatNode   [TYPE]  JsonGenerator jg  [TYPE]  boolean false  true  [TYPE]  float _value  v  [TYPE]  SerializerProvider provider 
[REPLACE]^if  ( o  !=  this )  return false;^105^^^^^103^115^[REPLACE] if  ( o == this )  return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] FloatNode   [TYPE]  float _value  otherValue  v  [TYPE]  Object o  [TYPE]  boolean false  true 
[ADD]^if  ( o == null )  return false;return false;^105^106^107^108^109^103^115^[ADD] if  ( o == this )  return true; if  ( o == null )  return false; if  ( o.getClass (  )  != getClass (  )  )  { return false; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] FloatNode   [TYPE]  float _value  otherValue  v  [TYPE]  Object o  [TYPE]  boolean false  true 
[REPLACE]^if  ( o == this )  return false;^105^^^^^103^115^[REPLACE] if  ( o == this )  return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] FloatNode   [TYPE]  float _value  otherValue  v  [TYPE]  Object o  [TYPE]  boolean false  true 
[REPLACE]^if  ( o != this  )  return false;^106^^^^^103^115^[REPLACE] if  ( o == null )  return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] FloatNode   [TYPE]  float _value  otherValue  v  [TYPE]  Object o  [TYPE]  boolean false  true 
[REPLACE]^if  ( o == null )  return true;^106^^^^^103^115^[REPLACE] if  ( o == null )  return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] FloatNode   [TYPE]  float _value  otherValue  v  [TYPE]  Object o  [TYPE]  boolean false  true 
[REPLACE]^if  (false (  )   ==  getClass (  )  )  {^107^^^^^103^115^[REPLACE] if  ( o.getClass (  )  != getClass (  )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] FloatNode   [TYPE]  float _value  otherValue  v  [TYPE]  Object o  [TYPE]  boolean false  true 
[REPLACE]^return true;^108^^^^^103^115^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] FloatNode   [TYPE]  float _value  otherValue  v  [TYPE]  Object o  [TYPE]  boolean false  true 
[REPLACE]^return Float.valueOf ( _value, otherValue )  == 0;^114^^^^^103^115^[REPLACE] return Float.compare ( _value, otherValue )  == 0;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] FloatNode   [TYPE]  float _value  otherValue  v  [TYPE]  Object o  [TYPE]  boolean false  true 
[REPLACE]^return Float.valueOf ( _value ) ;^119^^^^^118^120^[REPLACE] return Float.floatToIntBits ( _value ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] FloatNode   [TYPE]  float _value  otherValue  v  [TYPE]  boolean false  true 
