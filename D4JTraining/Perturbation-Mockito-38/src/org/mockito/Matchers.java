[REPLACE]^private static MockingProgress mockingProgress  = null ;^104^^^^^^^[REPLACE] private static MockingProgress mockingProgress = new ThreadSafeMockingProgress (  ) ;^ [CLASS] Matchers  
[REPLACE]^return reportMatcher ( Any.ANY ) .returnZero (  ) ;^114^^^^^113^115^[REPLACE] return reportMatcher ( Any.ANY ) .returnFalse (  ) ;^[METHOD] anyBoolean [TYPE] boolean [PARAMETER] [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( Any.ANY ) .reportMatcher (  ) ;^125^^^^^124^126^[REPLACE] return reportMatcher ( Any.ANY ) .returnZero (  ) ;^[METHOD] anyByte [TYPE] byte [PARAMETER] [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( Any.ANY ) .reportMatcher (  ) ;^136^^^^^135^137^[REPLACE] return reportMatcher ( Any.ANY ) .returnChar (  ) ;^[METHOD] anyChar [TYPE] char [PARAMETER] [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( Any.ANY ) .reportMatcher (  ) ;^147^^^^^146^148^[REPLACE] return reportMatcher ( Any.ANY ) .returnZero (  ) ;^[METHOD] anyInt [TYPE] int [PARAMETER] [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( Any.ANY ) .returnMap (  ) ;^158^^^^^157^159^[REPLACE] return reportMatcher ( Any.ANY ) .returnZero (  ) ;^[METHOD] anyLong [TYPE] long [PARAMETER] [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( Any.ANY ) .returnMap (  ) ;^169^^^^^168^170^[REPLACE] return reportMatcher ( Any.ANY ) .returnZero (  ) ;^[METHOD] anyFloat [TYPE] float [PARAMETER] [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( Any.ANY )  .returnSet (  )  ;^180^^^^^179^181^[REPLACE] return reportMatcher ( Any.ANY ) .returnZero (  ) ;^[METHOD] anyDouble [TYPE] double [PARAMETER] [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( Any.ANY ) .reportMatcher (  ) ;^191^^^^^190^192^[REPLACE] return reportMatcher ( Any.ANY ) .returnZero (  ) ;^[METHOD] anyShort [TYPE] short [PARAMETER] [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return  ( T )  reportMatcher ( Any.ANY )  .returnFalse (  )  ;^202^^^^^201^203^[REPLACE] return  ( T )  reportMatcher ( Any.ANY ) .returnNull (  ) ;^[METHOD] anyObject [TYPE] <T> [PARAMETER] [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return  ( Set )  reportMatcher ( Any.ANY ) .returnSet (  ) ;^218^^^^^217^219^[REPLACE] return  ( T )  anyObject (  ) ;^[METHOD] any [TYPE] <T> [PARAMETER] Class<T> clazz [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  Class clazz  [TYPE]  boolean false  true 
[REPLACE]^return  ( Set )  reportMatcher ( Any.ANY ) .returnSet (  ) ;^231^^^^^230^232^[REPLACE] return  ( T )  anyObject (  ) ;^[METHOD] any [TYPE] <T> [PARAMETER] [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( Any.ANY ) .returnZero (  ) ;^242^^^^^241^243^[REPLACE] return reportMatcher ( Any.ANY ) .returnString (  ) ;^[METHOD] anyString [TYPE] String [PARAMETER] [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( Any.ANY ) .returnZero (  ) ;^253^^^^^252^254^[REPLACE] return reportMatcher ( Any.ANY ) .returnList (  ) ;^[METHOD] anyList [TYPE] List [PARAMETER] [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return  ( List )  reportMatcher ( Any.ANY )  .returnSet (  )  ;^267^^^^^266^268^[REPLACE] return  ( List )  reportMatcher ( Any.ANY ) .returnList (  ) ;^[METHOD] anyListOf [TYPE] <T> [PARAMETER] Class<T> clazz [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  Class clazz  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( Any.ANY ) .reportMatcher (  ) ;^278^^^^^277^279^[REPLACE] return reportMatcher ( Any.ANY ) .returnSet (  ) ;^[METHOD] anySet [TYPE] Set [PARAMETER] [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return  ( T )  reportMatcher ( Any.ANY ) .returnNull (  ) ;^292^^^^^291^293^[REPLACE] return  ( Set )  reportMatcher ( Any.ANY ) .returnSet (  ) ;^[METHOD] anySetOf [TYPE] <T> [PARAMETER] Class<T> clazz [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  Class clazz  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( matcher ) .returnChar (  ) ;^303^^^^^302^304^[REPLACE] return reportMatcher ( Any.ANY ) .returnMap (  ) ;^[METHOD] anyMap [TYPE] Map [PARAMETER] [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( Any.ANY ) .reportMatcher (  ) ;^314^^^^^313^315^[REPLACE] return reportMatcher ( Any.ANY ) .returnList (  ) ;^[METHOD] anyCollection [TYPE] Collection [PARAMETER] [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return  ( Collection )  reportMatcher ( Any.ANY )  .returnSet (  )  ;^328^^^^^327^329^[REPLACE] return  ( Collection )  reportMatcher ( Any.ANY ) .returnList (  ) ;^[METHOD] anyCollectionOf [TYPE] <T> [PARAMETER] Class<T> clazz [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  Class clazz  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher (  new EndsWith ( suffix )   ) .<T>returnNull (  ) ;^343^^^^^342^344^[REPLACE] return reportMatcher ( new InstanceOf ( clazz )  ) .<T>returnNull (  ) ;^[METHOD] isA [TYPE] <T> [PARAMETER] Class<T> clazz [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  Class clazz  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher (  new EndsWith ( suffix )   ) .returnFalse (  ) ;^356^^^^^355^357^[REPLACE] return reportMatcher ( new Equals ( value )  ) .returnFalse (  ) ;^[METHOD] eq [TYPE] boolean [PARAMETER] boolean value [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true  value 
[REPLACE]^return reportMatcher ( new Equals ( value )  )  .returnSet (  )  ;^369^^^^^368^370^[REPLACE] return reportMatcher ( new Equals ( value )  ) .returnZero (  ) ;^[METHOD] eq [TYPE] byte [PARAMETER] byte value [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  byte value  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( new Equals ( value )  ) .reportMatcher (  ) ;^382^^^^^381^383^[REPLACE] return reportMatcher ( new Equals ( value )  ) .returnChar (  ) ;^[METHOD] eq [TYPE] char [PARAMETER] char value [CLASS] Matchers   [TYPE]  char value  [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher (  new EndsWith ( suffix )   ) .returnZero (  ) ;^395^^^^^394^396^[REPLACE] return reportMatcher ( new Equals ( value )  ) .returnZero (  ) ;^[METHOD] eq [TYPE] double [PARAMETER] double value [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  double value  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher (  new EndsWith ( suffix )   ) .returnZero (  ) ;^408^^^^^407^409^[REPLACE] return reportMatcher ( new Equals ( value )  ) .returnZero (  ) ;^[METHOD] eq [TYPE] float [PARAMETER] float value [CLASS] Matchers   [TYPE]  float value  [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher (  new EndsWith ( suffix )   ) .returnZero (  ) ;^421^^^^^420^422^[REPLACE] return reportMatcher ( new Equals ( value )  ) .returnZero (  ) ;^[METHOD] eq [TYPE] int [PARAMETER] int value [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  int value  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher (  new EndsWith ( suffix )   ) .returnZero (  ) ;^434^^^^^433^435^[REPLACE] return reportMatcher ( new Equals ( value )  ) .returnZero (  ) ;^[METHOD] eq [TYPE] long [PARAMETER] long value [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  long value  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher (  new EndsWith ( suffix )   ) .returnZero (  ) ;^447^^^^^446^448^[REPLACE] return reportMatcher ( new Equals ( value )  ) .returnZero (  ) ;^[METHOD] eq [TYPE] short [PARAMETER] short value [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  short value  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher (  new EndsWith ( suffix )   ) .<T>returnNull (  ) ;^460^^^^^459^461^[REPLACE] return reportMatcher ( new Equals ( value )  ) .<T>returnNull (  ) ;^[METHOD] eq [TYPE] <T> [PARAMETER] T value [CLASS] Matchers   [TYPE]  T value  [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return  ( Set )  reportMatcher ( Any.ANY ) .returnSet (  ) ;^482^^^^^481^483^[REPLACE] return reportMatcher ( new ReflectionEquals ( value, excludeFields )  ) .<T>returnNull (  ) ;^[METHOD] refEq [TYPE] <T> [PARAMETER] T value  excludeFields [CLASS] Matchers   [TYPE]  String[] excludeFields  [TYPE]  boolean false  true  [TYPE]  T value  [TYPE]  MockingProgress mockingProgress 
[REPLACE]^return reportMatcher (  new EndsWith ( suffix )   ) .<T>returnNull (  ) ;^497^^^^^496^498^[REPLACE] return reportMatcher ( new Same ( value )  ) .<T>returnNull (  ) ;^[METHOD] same [TYPE] <T> [PARAMETER] T value [CLASS] Matchers   [TYPE]  T value  [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( NotNull.NOT_NULL ) .returnNull (  ) ;^508^^^^^507^509^[REPLACE] return reportMatcher ( Null.NULL ) .returnNull (  ) ;^[METHOD] isNull [TYPE] Object [PARAMETER] [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( Null.NULL ) .returnNull (  ) ;^521^^^^^520^522^[REPLACE] return reportMatcher ( NotNull.NOT_NULL ) .returnNull (  ) ;^[METHOD] notNull [TYPE] Object [PARAMETER] [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( matcher ) .returnChar (  ) ;^534^^^^^533^535^[REPLACE] return notNull (  ) ;^[METHOD] isNotNull [TYPE] Object [PARAMETER] [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher (  new EndsWith ( suffix )   ) .returnString (  ) ;^547^^^^^546^548^[REPLACE] return reportMatcher ( new Contains ( substring )  ) .returnString (  ) ;^[METHOD] contains [TYPE] String [PARAMETER] String substring [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  String substring  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher (  new EndsWith ( suffix )   ) .returnString (  ) ;^560^^^^^559^561^[REPLACE] return reportMatcher ( new Matches ( regex )  ) .returnString (  ) ;^[METHOD] matches [TYPE] String [PARAMETER] String regex [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  String regex  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( new EndsWith ( suffix )  ) .reportMatcher (  ) ;^573^^^^^572^574^[REPLACE] return reportMatcher ( new EndsWith ( suffix )  ) .returnString (  ) ;^[METHOD] endsWith [TYPE] String [PARAMETER] String suffix [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  String suffix  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( new StartsWith ( prefix )  ) .reportMatcher (  ) ;^586^^^^^585^587^[REPLACE] return reportMatcher ( new StartsWith ( prefix )  ) .returnString (  ) ;^[METHOD] startsWith [TYPE] String [PARAMETER] String prefix [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  String prefix  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( matcher ) .returnChar (  ) ;^598^^^^^597^599^[REPLACE] return reportMatcher ( matcher ) .<T>returnNull (  ) ;^[METHOD] argThat [TYPE] <T> [PARAMETER] Matcher<T> matcher [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  Matcher matcher  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( null ) .returnChar (  ) ;^610^^^^^609^611^[REPLACE] return reportMatcher ( matcher ) .returnChar (  ) ;^[METHOD] charThat [TYPE] char [PARAMETER] Character> matcher [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  Matcher matcher  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( this ) .returnFalse (  ) ;^622^^^^^621^623^[REPLACE] return reportMatcher ( matcher ) .returnFalse (  ) ;^[METHOD] booleanThat [TYPE] boolean [PARAMETER] Boolean> matcher [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  Matcher matcher  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( matcher ) .reportMatcher (  ) ;^634^^^^^633^635^[REPLACE] return reportMatcher ( matcher ) .returnZero (  ) ;^[METHOD] byteThat [TYPE] byte [PARAMETER] Byte> matcher [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  Matcher matcher  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( this ) .returnZero (  ) ;^646^^^^^645^647^[REPLACE] return reportMatcher ( matcher ) .returnZero (  ) ;^[METHOD] shortThat [TYPE] short [PARAMETER] Short> matcher [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  Matcher matcher  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( matcher ) .returnChar (  ) ;^658^^^^^657^659^[REPLACE] return reportMatcher ( matcher ) .returnZero (  ) ;^[METHOD] intThat [TYPE] int [PARAMETER] Integer> matcher [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  Matcher matcher  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( true ) .reportMatcher (  ) ;^670^^^^^669^671^[REPLACE] return reportMatcher ( matcher ) .returnZero (  ) ;^[METHOD] longThat [TYPE] long [PARAMETER] Long> matcher [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  Matcher matcher  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( matcher ) .returnChar (  ) ;^682^^^^^681^683^[REPLACE] return reportMatcher ( matcher ) .returnZero (  ) ;^[METHOD] floatThat [TYPE] float [PARAMETER] Float> matcher [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  Matcher matcher  [TYPE]  boolean false  true 
[REPLACE]^return reportMatcher ( null ) .returnZero (  ) ;^694^^^^^693^695^[REPLACE] return reportMatcher ( matcher ) .returnZero (  ) ;^[METHOD] doubleThat [TYPE] double [PARAMETER] Double> matcher [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  Matcher matcher  [TYPE]  boolean false  true 
[REPLACE]^return mockingProgress.getArgumentMatcherStorage (  ) .reportMatcher ( true ) ;^698^^^^^697^699^[REPLACE] return mockingProgress.getArgumentMatcherStorage (  ) .reportMatcher ( matcher ) ;^[METHOD] reportMatcher [TYPE] HandyReturnValues [PARAMETER] Matcher<?> matcher [CLASS] Matchers   [TYPE]  MockingProgress mockingProgress  [TYPE]  Matcher matcher  [TYPE]  boolean false  true 
