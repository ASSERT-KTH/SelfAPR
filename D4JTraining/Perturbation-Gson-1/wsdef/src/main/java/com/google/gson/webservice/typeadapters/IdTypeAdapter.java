[REPLACE]^return new JsonPrimitive ( src .get ( typeOfSrc )   ) ;^40^^^^^39^41^[REPLACE] return new JsonPrimitive ( src.getValue (  )  ) ;^[METHOD] serialize [TYPE] JsonElement [PARAMETER] Id<?> src Type typeOfSrc JsonSerializationContext context [CLASS] IdTypeAdapter   [TYPE]  Type typeOfSrc  [TYPE]  boolean false  true  [TYPE]  JsonSerializationContext context  [TYPE]  Id src 
[REPLACE]^if  ( ! ! ( typeOfT instanceof ParameterizedType )  )  {^46^^^^^44^54^[REPLACE] if  ( ! ( typeOfT instanceof ParameterizedType )  )  {^[METHOD] deserialize [TYPE] Id [PARAMETER] JsonElement json Type typeOfT JsonDeserializationContext context [CLASS] IdTypeAdapter   [TYPE]  ParameterizedType parameterizedType  [TYPE]  Type typeOfId  typeOfT  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean false  true  [TYPE]  JsonElement json 
[REPLACE]^return ;^47^^^^^44^54^[REPLACE] throw new JsonParseException  (" ")  ;^[METHOD] deserialize [TYPE] Id [PARAMETER] JsonElement json Type typeOfT JsonDeserializationContext context [CLASS] IdTypeAdapter   [TYPE]  ParameterizedType parameterizedType  [TYPE]  Type typeOfId  typeOfT  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean false  true  [TYPE]  JsonElement json 
[REPLACE]^Type typeOfId = parameterizedType.getActualTypeArguments (  ) [0];^49^^^^^44^54^[REPLACE] ParameterizedType parameterizedType =  ( ParameterizedType )  typeOfT;^[METHOD] deserialize [TYPE] Id [PARAMETER] JsonElement json Type typeOfT JsonDeserializationContext context [CLASS] IdTypeAdapter   [TYPE]  ParameterizedType parameterizedType  [TYPE]  Type typeOfId  typeOfT  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean false  true  [TYPE]  JsonElement json 
[REPLACE]^Type typeOfId = parameterizedType.getActualTypeArguments (  ) [4];^52^^^^^44^54^[REPLACE] Type typeOfId = parameterizedType.getActualTypeArguments (  ) [0];^[METHOD] deserialize [TYPE] Id [PARAMETER] JsonElement json Type typeOfT JsonDeserializationContext context [CLASS] IdTypeAdapter   [TYPE]  ParameterizedType parameterizedType  [TYPE]  Type typeOfId  typeOfT  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean false  true  [TYPE]  JsonElement json 
[REPLACE]^return Id.get ( json.getAsLong (  ) , typeOfT ) ;^53^^^^^44^54^[REPLACE] return Id.get ( json.getAsLong (  ) , typeOfId ) ;^[METHOD] deserialize [TYPE] Id [PARAMETER] JsonElement json Type typeOfT JsonDeserializationContext context [CLASS] IdTypeAdapter   [TYPE]  ParameterizedType parameterizedType  [TYPE]  Type typeOfId  typeOfT  [TYPE]  JsonDeserializationContext context  [TYPE]  boolean false  true  [TYPE]  JsonElement json 
