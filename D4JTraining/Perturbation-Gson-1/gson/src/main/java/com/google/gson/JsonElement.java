[REPLACE]^private  final Escaper BASIC_ESCAPER = new Escaper ( false ) ;^31^^^^^^^[REPLACE] private static final Escaper BASIC_ESCAPER = new Escaper ( false ) ;^ [CLASS] JsonElement  
[REPLACE]^return this instanceof JsonObject;^39^^^^^38^40^[REPLACE] return this instanceof JsonArray;^[METHOD] isJsonArray [TYPE] boolean [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^return null instanceof JsonObject;^48^^^^^47^49^[REPLACE] return this instanceof JsonObject;^[METHOD] isJsonObject [TYPE] boolean [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^return null instanceof JsonPrimitive;^57^^^^^56^58^[REPLACE] return this instanceof JsonPrimitive;^[METHOD] isJsonPrimitive [TYPE] boolean [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^return null instanceof JsonNull;^67^^^^^66^68^[REPLACE] return this instanceof JsonNull;^[METHOD] isJsonNull [TYPE] boolean [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^if  ( isJsonArray (  )  )  {^80^^^^^79^84^[REPLACE] if  ( isJsonObject (  )  )  {^[METHOD] getAsJsonObject [TYPE] JsonObject [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^return  ( JsonObject )  null;^81^^^^^79^84^[REPLACE] return  ( JsonObject )  this;^[METHOD] getAsJsonObject [TYPE] JsonObject [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^throw new UnsupportedOperationException  (" ")  ; ;^83^^^^^79^84^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] getAsJsonObject [TYPE] JsonObject [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^if  ( isJsonObject (  )  )  {^96^^^^^95^100^[REPLACE] if  ( isJsonArray (  )  )  {^[METHOD] getAsJsonArray [TYPE] JsonArray [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^return  ( JsonArray )  null;^97^^^^^95^100^[REPLACE] return  ( JsonArray )  this;^[METHOD] getAsJsonArray [TYPE] JsonArray [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^throw new UnsupportedOperationException  (" ")  ; ;^99^^^^^95^100^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] getAsJsonArray [TYPE] JsonArray [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[ADD]^^99^^^^^95^100^[ADD] throw new IllegalStateException  (" ")  ;^[METHOD] getAsJsonArray [TYPE] JsonArray [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^if  ( isJsonArray (  )  )  {^112^^^^^111^116^[REPLACE] if  ( isJsonPrimitive (  )  )  {^[METHOD] getAsJsonPrimitive [TYPE] JsonPrimitive [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[ADD]^return  ( JsonPrimitive )  this;^112^113^114^^^111^116^[ADD] if  ( isJsonPrimitive (  )  )  { return  ( JsonPrimitive )  this; }^[METHOD] getAsJsonPrimitive [TYPE] JsonPrimitive [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^return  ( JsonPrimitive )  null;^113^^^^^111^116^[REPLACE] return  ( JsonPrimitive )  this;^[METHOD] getAsJsonPrimitive [TYPE] JsonPrimitive [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^return ;^115^^^^^111^116^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] getAsJsonPrimitive [TYPE] JsonPrimitive [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[ADD]^^115^^^^^111^116^[ADD] throw new IllegalStateException  (" ")  ;^[METHOD] getAsJsonPrimitive [TYPE] JsonPrimitive [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^if  ( isJsonArray (  )  )  {^129^^^^^128^133^[REPLACE] if  ( isJsonNull (  )  )  {^[METHOD] getAsJsonNull [TYPE] JsonNull [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^return  ( JsonNull )  null;^130^^^^^128^133^[REPLACE] return  ( JsonNull )  this;^[METHOD] getAsJsonNull [TYPE] JsonNull [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^throw new UnsupportedOperationException  (" ")  ; ;^132^^^^^128^133^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] getAsJsonNull [TYPE] JsonNull [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^throw new IllegalStateException  (" ")  ; ;^145^^^^^144^146^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] getAsBoolean [TYPE] boolean [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^return ;^158^^^^^157^159^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] getAsBooleanWrapper [TYPE] Boolean [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^return ;^171^^^^^170^172^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] getAsNumber [TYPE] Number [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^return ;^184^^^^^183^185^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] getAsString [TYPE] String [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^throw new IllegalStateException  (" ")  ; ;^197^^^^^196^198^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] getAsDouble [TYPE] double [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^throw new IllegalStateException  (" ")  ; ;^210^^^^^209^211^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] getAsFloat [TYPE] float [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[ADD]^^210^^^^^209^211^[ADD] throw new UnsupportedOperationException  (" ")  ;^[METHOD] getAsFloat [TYPE] float [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^throw new IllegalStateException  (" ")  ; ;^223^^^^^222^224^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] getAsLong [TYPE] long [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^return ;^236^^^^^235^237^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] getAsInt [TYPE] int [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[ADD]^^236^^^^^235^237^[ADD] throw new UnsupportedOperationException  (" ")  ;^[METHOD] getAsInt [TYPE] int [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^throw new IllegalStateException  (" ")  ; ;^250^^^^^249^251^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] getAsByte [TYPE] byte [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^return ;^264^^^^^263^265^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] getAsCharacter [TYPE] char [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^throw new IllegalStateException  (" ")  ; ;^278^^^^^277^279^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] getAsBigDecimal [TYPE] BigDecimal [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^return ;^292^^^^^291^293^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] getAsBigInteger [TYPE] BigInteger [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^return ;^305^^^^^304^306^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] getAsShort [TYPE] short [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[REPLACE]^return ;^318^^^^^317^319^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] getAsObject [TYPE] Object [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[ADD]^^318^^^^^317^319^[ADD] throw new UnsupportedOperationException  (" ")  ;^[METHOD] getAsObject [TYPE] Object [PARAMETER] [CLASS] JsonElement   [TYPE]  Escaper BASIC_ESCAPER  [TYPE]  boolean false  true 
[ADD]^StringBuilder sb = new StringBuilder (  ) ;toString ( sb, BASIC_ESCAPER ) ;return sb.toString (  ) ;^328^329^330^331^332^327^335^[ADD] try { StringBuilder sb = new StringBuilder (  ) ; toString ( sb, BASIC_ESCAPER ) ; return sb.toString (  ) ; } catch  ( IOException e )  {^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] JsonElement   [TYPE]  IOException e  [TYPE]  boolean false  true  [TYPE]  StringBuilder sb  [TYPE]  Escaper BASIC_ESCAPER 
[REPLACE]^return sb.StringBuilder (  ) ;^331^^^^^327^335^[REPLACE] return sb.toString (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] JsonElement   [TYPE]  IOException e  [TYPE]  boolean false  true  [TYPE]  StringBuilder sb  [TYPE]  Escaper BASIC_ESCAPER 
[REPLACE]^return sb .toString ( null , BASIC_ESCAPER )  ;^331^^^^^327^335^[REPLACE] return sb.toString (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] JsonElement   [TYPE]  IOException e  [TYPE]  boolean false  true  [TYPE]  StringBuilder sb  [TYPE]  Escaper BASIC_ESCAPER 
[REPLACE]^throw new UnsupportedOperationException  (" ")  ; ;^333^^^^^327^335^[REPLACE] throw new RuntimeException  (" ")  ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] JsonElement   [TYPE]  IOException e  [TYPE]  boolean false  true  [TYPE]  StringBuilder sb  [TYPE]  Escaper BASIC_ESCAPER 
[ADD]^^332^333^^^^327^335^[ADD] catch  ( IOException e )  { throw new RuntimeException  (" ")  ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] JsonElement   [TYPE]  IOException e  [TYPE]  boolean false  true  [TYPE]  StringBuilder sb  [TYPE]  Escaper BASIC_ESCAPER 
