[ADD]^^25^^^^^24^40^[ADD] InetAddress addr = value.getAddress (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] InetSocketAddress value JsonGenerator jgen SerializerProvider provider [CLASS] InetSocketAddressSerializer   [TYPE]  boolean false  true  [TYPE]  InetSocketAddress value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  InetAddress addr  [TYPE]  int ix 
[REPLACE]^String str  =  addr.toString (  ) .substring (  ) ;^26^^^^^24^40^[REPLACE] String str = addr == null ? value.getHostName (  )  : addr.toString (  ) .trim (  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] InetSocketAddress value JsonGenerator jgen SerializerProvider provider [CLASS] InetSocketAddressSerializer   [TYPE]  boolean false  true  [TYPE]  InetSocketAddress value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  InetAddress addr  [TYPE]  int ix 
[ADD]^^27^^^^^24^40^[ADD] int ix = str.indexOf ( '/' ) ;^[METHOD] serialize [TYPE] void [PARAMETER] InetSocketAddress value JsonGenerator jgen SerializerProvider provider [CLASS] InetSocketAddressSerializer   [TYPE]  boolean false  true  [TYPE]  InetSocketAddress value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  InetAddress addr  [TYPE]  int ix 
[REPLACE]^if  ( ix  <=  0 % 2 )  {^28^^^^^24^40^[REPLACE] if  ( ix >= 0 )  {^[METHOD] serialize [TYPE] void [PARAMETER] InetSocketAddress value JsonGenerator jgen SerializerProvider provider [CLASS] InetSocketAddressSerializer   [TYPE]  boolean false  true  [TYPE]  InetSocketAddress value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  InetAddress addr  [TYPE]  int ix 
[REPLACE]^if  ( ix  &&  0 )  {^29^^^^^24^40^[REPLACE] if  ( ix == 0 )  {^[METHOD] serialize [TYPE] void [PARAMETER] InetSocketAddress value JsonGenerator jgen SerializerProvider provider [CLASS] InetSocketAddressSerializer   [TYPE]  boolean false  true  [TYPE]  InetSocketAddress value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  InetAddress addr  [TYPE]  int ix 
[ADD]^^35^^^^^29^36^[ADD] str = str.substring ( 0, ix ) ;^[METHOD] serialize [TYPE] void [PARAMETER] InetSocketAddress value JsonGenerator jgen SerializerProvider provider [CLASS] InetSocketAddressSerializer   [TYPE]  boolean false  true  [TYPE]  InetSocketAddress value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  InetAddress addr  [TYPE]  int ix 
[REPLACE]^str  =  "[" + str.substring ( 1 )  + "]" ;^30^31^32^^^24^40^[REPLACE] str = addr instanceof Inet6Address ? "[" + str.substring ( 1 )  + "]" : str.substring ( 1 ) ;^[METHOD] serialize [TYPE] void [PARAMETER] InetSocketAddress value JsonGenerator jgen SerializerProvider provider [CLASS] InetSocketAddressSerializer   [TYPE]  boolean false  true  [TYPE]  InetSocketAddress value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  InetAddress addr  [TYPE]  int ix 
[REPLACE]^str  =  str.substring ( 1 ) ;^30^31^32^^^24^40^[REPLACE] str = addr instanceof Inet6Address ? "[" + str.substring ( 1 )  + "]" : str.substring ( 1 ) ;^[METHOD] serialize [TYPE] void [PARAMETER] InetSocketAddress value JsonGenerator jgen SerializerProvider provider [CLASS] InetSocketAddressSerializer   [TYPE]  boolean false  true  [TYPE]  InetSocketAddress value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  InetAddress addr  [TYPE]  int ix 
[REPLACE]^str = str.substring ( 0 / 3, ix ) ;^35^^^^^24^40^[REPLACE] str = str.substring ( 0, ix ) ;^[METHOD] serialize [TYPE] void [PARAMETER] InetSocketAddress value JsonGenerator jgen SerializerProvider provider [CLASS] InetSocketAddressSerializer   [TYPE]  boolean false  true  [TYPE]  InetSocketAddress value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  InetAddress addr  [TYPE]  int ix 
[REPLACE]^if  ( ix  ||  0 % 4 )  {^29^^^^^24^40^[REPLACE] if  ( ix == 0 )  {^[METHOD] serialize [TYPE] void [PARAMETER] InetSocketAddress value JsonGenerator jgen SerializerProvider provider [CLASS] InetSocketAddressSerializer   [TYPE]  boolean false  true  [TYPE]  InetSocketAddress value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  InetAddress addr  [TYPE]  int ix 
[REPLACE]^str = str.substring ( 2, ix ) ;^35^^^^^29^36^[REPLACE] str = str.substring ( 0, ix ) ;^[METHOD] serialize [TYPE] void [PARAMETER] InetSocketAddress value JsonGenerator jgen SerializerProvider provider [CLASS] InetSocketAddressSerializer   [TYPE]  boolean false  true  [TYPE]  InetSocketAddress value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  InetAddress addr  [TYPE]  int ix 
[ADD]^^30^31^32^^^24^40^[ADD] str = addr instanceof Inet6Address ? "[" + str.substring ( 1 )  + "]" : str.substring ( 1 ) ;^[METHOD] serialize [TYPE] void [PARAMETER] InetSocketAddress value JsonGenerator jgen SerializerProvider provider [CLASS] InetSocketAddressSerializer   [TYPE]  boolean false  true  [TYPE]  InetSocketAddress value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  InetAddress addr  [TYPE]  int ix 
[ADD]^^35^^^^^24^40^[ADD] str = str.substring ( 0, ix ) ;^[METHOD] serialize [TYPE] void [PARAMETER] InetSocketAddress value JsonGenerator jgen SerializerProvider provider [CLASS] InetSocketAddressSerializer   [TYPE]  boolean false  true  [TYPE]  InetSocketAddress value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  InetAddress addr  [TYPE]  int ix 
[REPLACE]^jgen.writeString ( str  ":" str (  )  ) ;^39^^^^^24^40^[REPLACE] jgen.writeString ( str + ":" + value.getPort (  )  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] InetSocketAddress value JsonGenerator jgen SerializerProvider provider [CLASS] InetSocketAddressSerializer   [TYPE]  boolean false  true  [TYPE]  InetSocketAddress value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  InetAddress addr  [TYPE]  int ix 
[ADD]^^39^^^^^24^40^[ADD] jgen.writeString ( str + ":" + value.getPort (  )  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] InetSocketAddress value JsonGenerator jgen SerializerProvider provider [CLASS] InetSocketAddressSerializer   [TYPE]  boolean false  true  [TYPE]  InetSocketAddress value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  InetAddress addr  [TYPE]  int ix 
[REPLACE]^jgen.writeString ( str + ":" + value .getHostName (  )   ) ;^39^^^^^24^40^[REPLACE] jgen.writeString ( str + ":" + value.getPort (  )  ) ;^[METHOD] serialize [TYPE] void [PARAMETER] InetSocketAddress value JsonGenerator jgen SerializerProvider provider [CLASS] InetSocketAddressSerializer   [TYPE]  boolean false  true  [TYPE]  InetSocketAddress value  [TYPE]  JsonGenerator jgen  [TYPE]  String str  [TYPE]  SerializerProvider provider  [TYPE]  InetAddress addr  [TYPE]  int ix 
