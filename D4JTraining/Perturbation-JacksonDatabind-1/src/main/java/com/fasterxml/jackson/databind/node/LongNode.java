[REPLACE]^long _value;^18^^^^^^^[REPLACE] final long _value;^ [CLASS] LongNode  
[REPLACE]^public LongNode ( long v )  { _value =  null; }^26^^^^^^^[REPLACE] public LongNode ( long v )  { _value = v; }^[METHOD] <init> [TYPE] LongNode(long) [PARAMETER] long v [CLASS] LongNode   [TYPE]  long _value  v  [TYPE]  boolean false  true 
[REPLACE]^public static LongNode valueOf ( _valueong l )  { return new LongNode ( l ) ; }^28^^^^^^^[REPLACE] public static LongNode valueOf ( long l )  { return new LongNode ( l ) ; }^[METHOD] valueOf [TYPE] LongNode [PARAMETER] long l [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  boolean false  true 
[REPLACE]^public static LongNode valueOf ( long l )  { return new LongNode ( l ) ; }^36^^^^^^^[REPLACE] @Override public JsonToken asToken (  )  { return JsonToken.VALUE_NUMBER_INT; }^[METHOD] asToken [TYPE] JsonToken [PARAMETER] [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  boolean false  true 
[REPLACE]^public static LongNode valueOf ( long l )  { return new LongNode ( l ) ; }^39^^^^^^^[REPLACE] public JsonParser.NumberType numberType (  )  { return JsonParser.NumberType.LONG; }^[METHOD] numberType [TYPE] NumberType [PARAMETER] [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  boolean false  true 
[REPLACE]^public boolean isIntegralNumber (  )  { return false; }^43^^^^^^^[REPLACE] public boolean isIntegralNumber (  )  { return true; }^[METHOD] isIntegralNumber [TYPE] boolean [PARAMETER] [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  boolean false  true 
[REPLACE]^public boolean isLong (  )  { return false; }^46^^^^^^^[REPLACE] public boolean isLong (  )  { return true; }^[METHOD] isLong [TYPE] boolean [PARAMETER] [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  boolean false  true 
[REPLACE]^return  ( _value ;^49^^^^^48^50^[REPLACE] return  ( _value >= Integer.MIN_VALUE && _value <= Integer.MAX_VALUE ) ;^[METHOD] canConvertToInt [TYPE] boolean [PARAMETER] [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  boolean false  true 
[REPLACE]^@Override public boolean canConvertToLong (  )  { return false; }^51^^^^^^^[REPLACE] @Override public boolean canConvertToLong (  )  { return true; }^[METHOD] canConvertToLong [TYPE] boolean [PARAMETER] [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  boolean false  true 
[REPLACE]^return   _value   ;^55^^^^^54^56^[REPLACE] return Long.valueOf ( _value ) ;^[METHOD] numberValue [TYPE] Number [PARAMETER] [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  boolean false  true 
[REPLACE]^public static LongNode valueOf ( long l )  { return new LongNode ( l ) ; }^59^^^^^^^[REPLACE] public short shortValue (  )  { return  ( short )  _value; }^[METHOD] shortValue [TYPE] short [PARAMETER] [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  boolean false  true 
[REPLACE]^public static LongNode valueOf ( long l )  { return new LongNode ( l ) ; }^62^^^^^^^[REPLACE] public int intValue (  )  { return  ( int )  _value; }^[METHOD] intValue [TYPE] int [PARAMETER] [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  boolean false  true 
[REPLACE]^public float floatValue (  )  { return _value; }^65^^^^^^^[REPLACE] public long longValue (  )  { return _value; }^[METHOD] longValue [TYPE] long [PARAMETER] [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  boolean false  true 
[REPLACE]^public long longValue (  )  { return _value; }^68^^^^^^^[REPLACE] public float floatValue (  )  { return _value; }^[METHOD] floatValue [TYPE] float [PARAMETER] [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  boolean false  true 
[REPLACE]^public static LongNode valueOf ( long l )  { return new LongNode ( l ) ; }^71^^^^^^^[REPLACE] public double doubleValue (  )  { return _value; }^[METHOD] doubleValue [TYPE] double [PARAMETER] [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  boolean false  true 
[REPLACE]^public   _value   ; }^74^^^^^^^[REPLACE] public BigDecimal decimalValue (  )  { return BigDecimal.valueOf ( _value ) ; }^[METHOD] decimalValue [TYPE] BigDecimal [PARAMETER] [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  boolean false  true 
[REPLACE]^public   _value   ; }^77^^^^^^^[REPLACE] public BigInteger bigIntegerValue (  )  { return BigInteger.valueOf ( _value ) ; }^[METHOD] bigIntegerValue [TYPE] BigInteger [PARAMETER] [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  boolean false  true 
[REPLACE]^return   _value   ;^81^^^^^80^82^[REPLACE] return NumberOutput.toString ( _value ) ;^[METHOD] asText [TYPE] String [PARAMETER] [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  boolean false  true 
[REPLACE]^returnv  ;^86^^^^^85^87^[REPLACE] return _value != 0;^[METHOD] asBoolean [TYPE] boolean [PARAMETER] boolean defaultValue [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  boolean defaultValue  false  true 
[REPLACE]^return Long.valueOf ( _value ) ;^93^^^^^90^94^[REPLACE] jg.writeNumber ( _value ) ;^[METHOD] serialize [TYPE] void [PARAMETER] JsonGenerator jg SerializerProvider provider [CLASS] LongNode   [TYPE]  JsonGenerator jg  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider  [TYPE]  long _value  l  v 
[REPLACE]^if  ( o  &&  this )  return false;^99^^^^^97^105^[REPLACE] if  ( o == this )  return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  Object o  [TYPE]  boolean false  true 
[REPLACE]^if  ( o == this )  return false;^99^^^^^97^105^[REPLACE] if  ( o == this )  return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  Object o  [TYPE]  boolean false  true 
[REPLACE]^if  ( o != null )  return false;^100^^^^^97^105^[REPLACE] if  ( o == null )  return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  Object o  [TYPE]  boolean false  true 
[REPLACE]^if  ( o == null )  return true;^100^^^^^97^105^[REPLACE] if  ( o == null )  return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  Object o  [TYPE]  boolean false  true 
[REPLACE]^if  ( o.getClass (  )   ==  getClass (  )  )  {^101^^^^^97^105^[REPLACE] if  ( o.getClass (  )  != getClass (  )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  Object o  [TYPE]  boolean false  true 
[REPLACE]^return true;^102^^^^^97^105^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  Object o  [TYPE]  boolean false  true 
[REPLACE]^return  (  ( LongNode )  o ) ._value  &&  _value;^104^^^^^97^105^[REPLACE] return  (  ( LongNode )  o ) ._value == _value;^[METHOD] equals [TYPE] boolean [PARAMETER] Object o [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  Object o  [TYPE]  boolean false  true 
[REPLACE]^return  (  ( int )  _value )   ;^109^^^^^108^110^[REPLACE] return  (  ( int )  _value )  ^  ( int )   ( _value >> 32 ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] LongNode   [TYPE]  long _value  l  v  [TYPE]  boolean false  true 
