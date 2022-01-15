[REPLACE]^private  ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers;^29^^^^^^^[REPLACE] private final ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers;^ [CLASS] JsonDeserializationContextDefault  
[REPLACE]^private  MappedObjectConstructor objectConstructor;^30^^^^^^^[REPLACE] private final MappedObjectConstructor objectConstructor;^ [CLASS] JsonDeserializationContextDefault  
[REPLACE]^this.navigatorFactory =  null;^35^^^^^32^38^[REPLACE] this.navigatorFactory = navigatorFactory;^[METHOD] <init> [TYPE] MappedObjectConstructor) [PARAMETER] ObjectNavigatorFactory navigatorFactory JsonDeserializer<?>> deserializers MappedObjectConstructor objectConstructor [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory 
[ADD]^this.deserializers = deserializers;^35^36^^^^32^38^[ADD] this.navigatorFactory = navigatorFactory; this.deserializers = deserializers;^[METHOD] <init> [TYPE] MappedObjectConstructor) [PARAMETER] ObjectNavigatorFactory navigatorFactory JsonDeserializer<?>> deserializers MappedObjectConstructor objectConstructor [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory 
[REPLACE]^this.deserializers =  true;^36^^^^^32^38^[REPLACE] this.deserializers = deserializers;^[METHOD] <init> [TYPE] MappedObjectConstructor) [PARAMETER] ObjectNavigatorFactory navigatorFactory JsonDeserializer<?>> deserializers MappedObjectConstructor objectConstructor [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory 
[ADD]^^36^^^^^32^38^[ADD] this.deserializers = deserializers;^[METHOD] <init> [TYPE] MappedObjectConstructor) [PARAMETER] ObjectNavigatorFactory navigatorFactory JsonDeserializer<?>> deserializers MappedObjectConstructor objectConstructor [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory 
[REPLACE]^this.objectConstructor =  null;^37^^^^^32^38^[REPLACE] this.objectConstructor = objectConstructor;^[METHOD] <init> [TYPE] MappedObjectConstructor) [PARAMETER] ObjectNavigatorFactory navigatorFactory JsonDeserializer<?>> deserializers MappedObjectConstructor objectConstructor [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory 
[ADD]^^37^^^^^32^38^[ADD] this.objectConstructor = objectConstructor;^[METHOD] <init> [TYPE] MappedObjectConstructor) [PARAMETER] ObjectNavigatorFactory navigatorFactory JsonDeserializer<?>> deserializers MappedObjectConstructor objectConstructor [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory 
[REPLACE]^return null;^41^^^^^40^42^[REPLACE] return objectConstructor;^[METHOD] getObjectConstructor [TYPE] ObjectConstructor [PARAMETER] [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory 
[REPLACE]^if  ( json != null || json.isJsonNull (  )  )  {^46^^^^^45^57^[REPLACE] if  ( json == null || json.isJsonNull (  )  )  {^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[ADD]^return null;return  ( T )  fromJsonArray ( typeOfT, json.getAsJsonArray (  ) , this ) ;^46^47^48^49^^45^57^[ADD] if  ( json == null || json.isJsonNull (  )  )  { return null; } else if  ( json.isJsonArray (  )  )  { return  ( T )  fromJsonArray ( typeOfT, json.getAsJsonArray (  ) , this ) ;^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^}  if  ( json.isJsonArray (  )  )  {^48^^^^^45^57^[REPLACE] } else if  ( json.isJsonArray (  )  )  {^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[ADD]^}   return  ( T )  fromJsonArray ( typeOfT, json.getAsJsonArray (  ) , this ) ;return  ( T )  fromJsonObject ( typeOfT, json.getAsJsonObject (  ) , this ) ;^48^49^50^51^^45^57^[ADD] else if  ( json.isJsonArray (  )  )  { return  ( T )  fromJsonArray ( typeOfT, json.getAsJsonArray (  ) , this ) ; } else if  ( json.isJsonObject (  )  )  { return  ( T )  fromJsonObject ( typeOfT, json.getAsJsonObject (  ) , this ) ;^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^}  else {^50^^^^^45^57^[REPLACE] } else if  ( json.isJsonObject (  )  )  {^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[ADD]^}   return  ( T )  fromJsonPrimitive ( typeOfT, json.getAsJsonPrimitive (  ) , this ) ;^50^51^52^53^^45^57^[ADD] else if  ( json.isJsonObject (  )  )  { return  ( T )  fromJsonObject ( typeOfT, json.getAsJsonObject (  ) , this ) ; } else if  ( json.isJsonPrimitive (  )  )  { return  ( T )  fromJsonPrimitive ( typeOfT, json.getAsJsonPrimitive (  ) , this ) ;^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^} else if  ( json.isJsonArray (  )  )  {^52^^^^^45^57^[REPLACE] } else if  ( json.isJsonPrimitive (  )  )  {^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^return ;^55^^^^^45^57^[REPLACE] throw new JsonParseException  (" ")  ;^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^return  ( T )  fromJsonPrimitive ( typeOfT, json.getAsJsonPrimitive (  ) , null ) ;^53^^^^^45^57^[REPLACE] return  ( T )  fromJsonPrimitive ( typeOfT, json.getAsJsonPrimitive (  ) , this ) ;^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^return  ( T )  fromJsonObject ( typeOfT, json.getAsJsonObject (  ) , null ) ;^51^^^^^45^57^[REPLACE] return  ( T )  fromJsonObject ( typeOfT, json.getAsJsonObject (  ) , this ) ;^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[ADD]^}^52^53^54^55^56^45^57^[ADD] else if  ( json.isJsonPrimitive (  )  )  { return  ( T )  fromJsonPrimitive ( typeOfT, json.getAsJsonPrimitive (  ) , this ) ; } else { throw new JsonParseException  (" ")  ; }^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[ADD]^^55^^^^^45^57^[ADD] throw new JsonParseException  (" ")  ;^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^return  ( T )  fromJsonObject ( typeOfT, json.getAsJsonObject (  ) , this ) ;^53^^^^^45^57^[REPLACE] return  ( T )  fromJsonPrimitive ( typeOfT, json.getAsJsonPrimitive (  ) , this ) ;^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^return  ( T )  fromJsonPrimitive ( typeOfT, json .isJsonPrimitive (  )  , this ) ;^53^^^^^45^57^[REPLACE] return  ( T )  fromJsonPrimitive ( typeOfT, json.getAsJsonPrimitive (  ) , this ) ;^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^return  ( T )  fromJsonArray ( typeOfT, json.getAsJsonArray (  ) , null ) ;^49^^^^^45^57^[REPLACE] return  ( T )  fromJsonArray ( typeOfT, json.getAsJsonArray (  ) , this ) ;^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^} else if  ( json.isJsonPrimitive (  )  )  {^50^^^^^45^57^[REPLACE] } else if  ( json.isJsonObject (  )  )  {^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[ADD]^}   return  ( T )  fromJsonObject ( typeOfT, json.getAsJsonObject (  ) , this ) ;return  ( T )  fromJsonPrimitive ( typeOfT, json.getAsJsonPrimitive (  ) , this ) ;^50^51^52^53^^45^57^[ADD] else if  ( json.isJsonObject (  )  )  { return  ( T )  fromJsonObject ( typeOfT, json.getAsJsonObject (  ) , this ) ; } else if  ( json.isJsonPrimitive (  )  )  { return  ( T )  fromJsonPrimitive ( typeOfT, json.getAsJsonPrimitive (  ) , this ) ;^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^}  else {^52^^^^^45^57^[REPLACE] } else if  ( json.isJsonPrimitive (  )  )  {^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^return  ( T )  fromJsonPrimitive ( typeOfT, json.getAsJsonPrimitive (  ) , this ) ;^51^^^^^45^57^[REPLACE] return  ( T )  fromJsonObject ( typeOfT, json.getAsJsonObject (  ) , this ) ;^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[ADD]^}   return  ( T )  fromJsonPrimitive ( typeOfT, json.getAsJsonPrimitive (  ) , this ) ;^52^53^54^55^56^45^57^[ADD] else if  ( json.isJsonPrimitive (  )  )  { return  ( T )  fromJsonPrimitive ( typeOfT, json.getAsJsonPrimitive (  ) , this ) ; } else { throw new JsonParseException  (" ")  ; }^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^return true;^47^^^^^45^57^[REPLACE] return null;^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^}  else {^48^^^^^45^57^[REPLACE] } else if  ( json.isJsonArray (  )  )  {^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^}  if  ( json.isJsonObject (  )  )  {^50^^^^^45^57^[REPLACE] } else if  ( json.isJsonObject (  )  )  {^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^}  if  ( json.getAsJsonPrimitive (  )  )  {^52^^^^^45^57^[REPLACE] } else if  ( json.isJsonPrimitive (  )  )  {^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^return  ( T )  fromJsonPrimitive ( typeOfT, json.isJsonPrimitive (  ) , this ) ;^53^^^^^45^57^[REPLACE] return  ( T )  fromJsonPrimitive ( typeOfT, json.getAsJsonPrimitive (  ) , this ) ;^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^return  ( T )  fromJsonObject ( typeOfT, json .isJsonObject (  )  , this ) ;^51^^^^^45^57^[REPLACE] return  ( T )  fromJsonObject ( typeOfT, json.getAsJsonObject (  ) , this ) ;^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REMOVE]^if  ( json.isJsonArray (  )  )  {     return  (  ( T )   ( fromJsonArray ( typeOfT, json.getAsJsonArray (  ) , this )  )  ) ; }else     if  ( json.isJsonObject (  )  )  {         return  (  ( T )   ( fromJsonObject ( typeOfT, json.getAsJsonObject (  ) , this )  )  ) ;     }else         if  ( json.isJsonPrimitive (  )  )  {             return  (  ( T )   ( fromJsonPrimitive ( typeOfT, json.getAsJsonPrimitive (  ) , this )  )  ) ;         }else {             throw new JsonParseException (  (  ( "Failed parsing JSON source: " + json )  + " to Json" )  ) ;         }^52^^^^^45^57^[REMOVE] ^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^return  ( T )  fromJsonObject ( typeOfT, json.isJsonObject (  ) , this ) ;^51^^^^^45^57^[REPLACE] return  ( T )  fromJsonObject ( typeOfT, json.getAsJsonObject (  ) , this ) ;^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^return  ( T )  fromJsonArray ( typeOfT, json.isJsonArray (  ) , this ) ;^49^^^^^45^57^[REPLACE] return  ( T )  fromJsonArray ( typeOfT, json.getAsJsonArray (  ) , this ) ;^[METHOD] deserialize [TYPE] <T> [PARAMETER] JsonElement json Type typeOfT [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  boolean false  true  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory  [TYPE]  JsonElement json 
[REPLACE]^ObjectNavigator on = navigatorFactory.create ( new ObjectTypePair ( true, arrayType, true )  ) ;^63^^^^^59^66^[REPLACE] ObjectNavigator on = navigatorFactory.create ( new ObjectTypePair ( null, arrayType, true )  ) ;^[METHOD] fromJsonArray [TYPE] <T> [PARAMETER] Type arrayType JsonArray jsonArray JsonDeserializationContext context [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  JsonArray jsonArray  [TYPE]  Type arrayType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean false  true  [TYPE]  ObjectNavigator on  [TYPE]  JsonArrayDeserializationVisitor visitor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory 
[ADD]^^63^^^^^59^66^[ADD] ObjectNavigator on = navigatorFactory.create ( new ObjectTypePair ( null, arrayType, true )  ) ;^[METHOD] fromJsonArray [TYPE] <T> [PARAMETER] Type arrayType JsonArray jsonArray JsonDeserializationContext context [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  JsonArray jsonArray  [TYPE]  Type arrayType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean false  true  [TYPE]  ObjectNavigator on  [TYPE]  JsonArrayDeserializationVisitor visitor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory 
[REPLACE]^on.accept ( this ) ;^64^^^^^59^66^[REPLACE] on.accept ( visitor ) ;^[METHOD] fromJsonArray [TYPE] <T> [PARAMETER] Type arrayType JsonArray jsonArray JsonDeserializationContext context [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  JsonArray jsonArray  [TYPE]  Type arrayType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean false  true  [TYPE]  ObjectNavigator on  [TYPE]  JsonArrayDeserializationVisitor visitor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory 
[REPLACE]^return false.getTarget (  ) ;^65^^^^^59^66^[REPLACE] return visitor.getTarget (  ) ;^[METHOD] fromJsonArray [TYPE] <T> [PARAMETER] Type arrayType JsonArray jsonArray JsonDeserializationContext context [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  JsonArray jsonArray  [TYPE]  Type arrayType  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean false  true  [TYPE]  ObjectNavigator on  [TYPE]  JsonArrayDeserializationVisitor visitor  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory 
[REPLACE]^ObjectNavigator on = navigatorFactory.create ( new ObjectTypePair ( this, typeOfT, true )  ) ;^72^^^^^68^75^[REPLACE] ObjectNavigator on = navigatorFactory.create ( new ObjectTypePair ( null, typeOfT, true )  ) ;^[METHOD] fromJsonObject [TYPE] <T> [PARAMETER] Type typeOfT JsonObject jsonObject JsonDeserializationContext context [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean false  true  [TYPE]  JsonObjectDeserializationVisitor visitor  [TYPE]  ObjectNavigator on  [TYPE]  JsonObject jsonObject  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory 
[ADD]^^72^73^^^^68^75^[ADD] ObjectNavigator on = navigatorFactory.create ( new ObjectTypePair ( null, typeOfT, true )  ) ; on.accept ( visitor ) ;^[METHOD] fromJsonObject [TYPE] <T> [PARAMETER] Type typeOfT JsonObject jsonObject JsonDeserializationContext context [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean false  true  [TYPE]  JsonObjectDeserializationVisitor visitor  [TYPE]  ObjectNavigator on  [TYPE]  JsonObject jsonObject  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory 
[REPLACE]^Object target = visitor.getTarget (  ) ;^73^^^^^68^75^[REPLACE] on.accept ( visitor ) ;^[METHOD] fromJsonObject [TYPE] <T> [PARAMETER] Type typeOfT JsonObject jsonObject JsonDeserializationContext context [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean false  true  [TYPE]  JsonObjectDeserializationVisitor visitor  [TYPE]  ObjectNavigator on  [TYPE]  JsonObject jsonObject  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory 
[REPLACE]^return null.getTarget (  ) ;^74^^^^^68^75^[REPLACE] return visitor.getTarget (  ) ;^[METHOD] fromJsonObject [TYPE] <T> [PARAMETER] Type typeOfT JsonObject jsonObject JsonDeserializationContext context [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean false  true  [TYPE]  JsonObjectDeserializationVisitor visitor  [TYPE]  ObjectNavigator on  [TYPE]  JsonObject jsonObject  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory 
[ADD]^^80^81^^^^78^87^[ADD] JsonObjectDeserializationVisitor<T> visitor = new JsonObjectDeserializationVisitor<T> ( json, typeOfT, navigatorFactory, objectConstructor, deserializers, context ) ;^[METHOD] fromJsonPrimitive [TYPE] <T> [PARAMETER] Type typeOfT JsonPrimitive json JsonDeserializationContext context [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean false  true  [TYPE]  JsonPrimitive json  [TYPE]  JsonObjectDeserializationVisitor visitor  [TYPE]  ObjectNavigator on  [TYPE]  Object target  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory 
[REPLACE]^ObjectNavigator on = navigatorFactory.create ( new ObjectTypePair ( json.getAsObject (  ) , typeOfT, false )  ) ;^82^83^^^^78^87^[REPLACE] ObjectNavigator on = navigatorFactory.create ( new ObjectTypePair ( json.getAsObject (  ) , typeOfT, true )  ) ;^[METHOD] fromJsonPrimitive [TYPE] <T> [PARAMETER] Type typeOfT JsonPrimitive json JsonDeserializationContext context [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean false  true  [TYPE]  JsonPrimitive json  [TYPE]  JsonObjectDeserializationVisitor visitor  [TYPE]  ObjectNavigator on  [TYPE]  Object target  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory 
[REPLACE]^on.accept ( this ) ;^84^^^^^78^87^[REPLACE] on.accept ( visitor ) ;^[METHOD] fromJsonPrimitive [TYPE] <T> [PARAMETER] Type typeOfT JsonPrimitive json JsonDeserializationContext context [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean false  true  [TYPE]  JsonPrimitive json  [TYPE]  JsonObjectDeserializationVisitor visitor  [TYPE]  ObjectNavigator on  [TYPE]  Object target  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory 
[REPLACE]^Object target = true.getTarget (  ) ;^85^^^^^78^87^[REPLACE] Object target = visitor.getTarget (  ) ;^[METHOD] fromJsonPrimitive [TYPE] <T> [PARAMETER] Type typeOfT JsonPrimitive json JsonDeserializationContext context [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean false  true  [TYPE]  JsonPrimitive json  [TYPE]  JsonObjectDeserializationVisitor visitor  [TYPE]  ObjectNavigator on  [TYPE]  Object target  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory 
[REPLACE]^return objectConstructor;^86^^^^^78^87^[REPLACE] return  ( T )  target;^[METHOD] fromJsonPrimitive [TYPE] <T> [PARAMETER] Type typeOfT JsonPrimitive json JsonDeserializationContext context [CLASS] JsonDeserializationContextDefault   [TYPE]  MappedObjectConstructor objectConstructor  [TYPE]  Type typeOfT  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean false  true  [TYPE]  JsonPrimitive json  [TYPE]  JsonObjectDeserializationVisitor visitor  [TYPE]  ObjectNavigator on  [TYPE]  Object target  [TYPE]  ParameterizedTypeHandlerMap deserializers  [TYPE]  ObjectNavigatorFactory navigatorFactory 
