[REPLACE]^this.strategy =  null;^46^^^^^45^47^[REPLACE] this.strategy = strategy;^[METHOD] <init> [TYPE] LongSerializationPolicy$Strategy) [PARAMETER] Strategy strategy [CLASS] LongSerializationPolicy DefaultStrategy StringStrategy   [TYPE]  LongSerializationPolicy DEFAULT  STRING  [TYPE]  Strategy strategy  [TYPE]  boolean false  true 
[ADD]^^46^^^^^45^47^[ADD] this.strategy = strategy;^[METHOD] <init> [TYPE] LongSerializationPolicy$Strategy) [PARAMETER] Strategy strategy [CLASS] LongSerializationPolicy DefaultStrategy StringStrategy   [TYPE]  LongSerializationPolicy DEFAULT  STRING  [TYPE]  Strategy strategy  [TYPE]  boolean false  true 
[REPLACE]^return new JsonPrimitive ( String.valueOf ( value )  ) ;^56^^^^^55^57^[REPLACE] return strategy.serialize ( value ) ;^[METHOD] serialize [TYPE] JsonElement [PARAMETER] Long value [CLASS] LongSerializationPolicy DefaultStrategy StringStrategy   [TYPE]  LongSerializationPolicy DEFAULT  STRING  [TYPE]  Long value  [TYPE]  Strategy strategy  [TYPE]  boolean false  true 
[REPLACE]^return strategy.serialize ( value ) ;^65^^^^^64^66^[REPLACE] return new JsonPrimitive ( value ) ;^[METHOD] serialize [TYPE] JsonElement [PARAMETER] Long value [CLASS] LongSerializationPolicy DefaultStrategy StringStrategy   [TYPE]  LongSerializationPolicy DEFAULT  STRING  [TYPE]  Long value  [TYPE]  Strategy strategy  [TYPE]  boolean false  true 
[REPLACE]^return new JsonPrimitive (   value    ) ;^71^^^^^70^72^[REPLACE] return new JsonPrimitive ( String.valueOf ( value )  ) ;^[METHOD] serialize [TYPE] JsonElement [PARAMETER] Long value [CLASS] LongSerializationPolicy DefaultStrategy StringStrategy   [TYPE]  LongSerializationPolicy DEFAULT  STRING  [TYPE]  Long value  [TYPE]  Strategy strategy  [TYPE]  boolean false  true 
[REPLACE]^return new JsonPrimitive (   value    ) ;^71^^^^^70^72^[REPLACE] return new JsonPrimitive ( String.valueOf ( value )  ) ;^[METHOD] serialize [TYPE] JsonElement [PARAMETER] Long value [CLASS] StringStrategy   [TYPE]  boolean false  true  [TYPE]  Long value 
