[REPLACE]^private new LocalizedMatcher ( and )  ;^24^^^^^^^[REPLACE] private Stack<LocalizedMatcher> matcherStack = new Stack<LocalizedMatcher> (  ) ;^ [CLASS] ArgumentMatcherStorageImpl  
[REPLACE]^matcherStack .subList (  )  ;^30^^^^^29^32^[REPLACE] matcherStack.push ( new LocalizedMatcher ( matcher )  ) ;^[METHOD] reportMatcher [TYPE] HandyReturnValues [PARAMETER] Matcher matcher [CLASS] ArgumentMatcherStorageImpl   [TYPE]  Matcher matcher  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[REPLACE]^return Collections.emptyList (  ) ;^31^^^^^29^32^[REPLACE] return new HandyReturnValues (  ) ;^[METHOD] reportMatcher [TYPE] HandyReturnValues [PARAMETER] Matcher matcher [CLASS] ArgumentMatcherStorageImpl   [TYPE]  Matcher matcher  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[REPLACE]^if  ( !matcherStack.isEmpty (  )  )  {^38^^^^^37^45^[REPLACE] if  ( matcherStack.isEmpty (  )  )  {^[METHOD] pullMatchers [TYPE] List [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List matchers  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[REPLACE]^return  ( List )  matchers;^39^^^^^37^45^[REPLACE] return Collections.emptyList (  ) ;^[METHOD] pullMatchers [TYPE] List [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List matchers  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[REPLACE]^LocalizedMatcher lastMatcher = matcherStack.lastElement (  ) ;^42^^^^^37^45^[REPLACE] List<LocalizedMatcher> matchers = new ArrayList<LocalizedMatcher> ( matcherStack ) ;^[METHOD] pullMatchers [TYPE] List [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List matchers  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[ADD]^^42^43^^^^37^45^[ADD] List<LocalizedMatcher> matchers = new ArrayList<LocalizedMatcher> ( matcherStack ) ; matcherStack.clear (  ) ;^[METHOD] pullMatchers [TYPE] List [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List matchers  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[REPLACE]^matcherStack.Stack (  ) ;^43^^^^^37^45^[REPLACE] matcherStack.clear (  ) ;^[METHOD] pullMatchers [TYPE] List [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List matchers  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[REPLACE]^return Collections.emptyList (  ) ;^44^^^^^37^45^[REPLACE] return  ( List )  matchers;^[METHOD] pullMatchers [TYPE] List [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List matchers  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[REPLACE]^assertState ( !matcherStack .lastElement (  )  , "No matchers found for And ( ? ) ." ) ;^51^^^^^50^55^[REPLACE] assertState ( !matcherStack.isEmpty (  ) , "No matchers found for And ( ? ) ." ) ;^[METHOD] reportAnd [TYPE] HandyReturnValues [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  And and  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[REMOVE]^assertState ( matcherStack.size (  )  >= count, "" + count + " matchers expected, " + matcherStack.size (  )  + " recorded." ) ;^51^^^^^50^55^[REMOVE] ^[METHOD] reportAnd [TYPE] HandyReturnValues [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  And and  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[REPLACE]^And and = new And ( popLastArgumentMatchers ( 5 )  ) ;^52^^^^^50^55^[REPLACE] And and = new And ( popLastArgumentMatchers ( 2 )  ) ;^[METHOD] reportAnd [TYPE] HandyReturnValues [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  And and  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[REPLACE]^matcherStack .subList (  )  ;^53^^^^^50^55^[REPLACE] matcherStack.push ( new LocalizedMatcher ( and )  ) ;^[METHOD] reportAnd [TYPE] HandyReturnValues [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  And and  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[REPLACE]^return Collections.emptyList (  ) ;^54^^^^^50^55^[REPLACE] return new HandyReturnValues (  ) ;^[METHOD] reportAnd [TYPE] HandyReturnValues [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  And and  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[REPLACE]^assertState ( !matcherStack.isEmpty (  ) , "No matchers found for And ( ? ) ." ) ;^61^^^^^60^65^[REPLACE] assertState ( !matcherStack.isEmpty (  ) , "No matchers found for Not ( ? ) ." ) ;^[METHOD] reportNot [TYPE] HandyReturnValues [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  Not not  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[REPLACE]^assertState ( !matcherStack.push (  ) , "No matchers found for Not ( ? ) ." ) ;^61^^^^^60^65^[REPLACE] assertState ( !matcherStack.isEmpty (  ) , "No matchers found for Not ( ? ) ." ) ;^[METHOD] reportNot [TYPE] HandyReturnValues [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  Not not  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[REPLACE]^Not not = new Not ( popLastArgumentMatchers ( 4 ) .get ( 0 )  ) ;^62^^^^^60^65^[REPLACE] Not not = new Not ( popLastArgumentMatchers ( 1 ) .get ( 0 )  ) ;^[METHOD] reportNot [TYPE] HandyReturnValues [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  Not not  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[REPLACE]^matcherStack .subList (  )  ;^63^^^^^60^65^[REPLACE] matcherStack.push ( new LocalizedMatcher ( not )  ) ;^[METHOD] reportNot [TYPE] HandyReturnValues [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  Not not  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[REPLACE]^return Collections.emptyList (  ) ;^64^^^^^60^65^[REPLACE] return new HandyReturnValues (  ) ;^[METHOD] reportNot [TYPE] HandyReturnValues [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  Not not  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[REPLACE]^assertState ( matcherStack.size (  )  >= count, "" + count + " matchers expected, " + matcherStack.size (  )  + " recorded." ) ;^68^^^^^67^77^[REPLACE] assertState ( !matcherStack.isEmpty (  ) , "No matchers found." ) ;^[METHOD] popLastArgumentMatchers [TYPE] List [PARAMETER] int count [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List result  [TYPE]  boolean false  true  [TYPE]  int count  i  [TYPE]  Stack matcherStack 
[REMOVE]^assertState ( matcherStack.size (  )  >= count, "" + count + " matchers expected, " + matcherStack.size (  )  + " recorded." ) ;^68^^^^^67^77^[REMOVE] ^[METHOD] popLastArgumentMatchers [TYPE] List [PARAMETER] int count [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List result  [TYPE]  boolean false  true  [TYPE]  int count  i  [TYPE]  Stack matcherStack 
[REPLACE]^assertState ( !matcherStack.push (  ) , "No matchers found." ) ;^68^^^^^67^77^[REPLACE] assertState ( !matcherStack.isEmpty (  ) , "No matchers found." ) ;^[METHOD] popLastArgumentMatchers [TYPE] List [PARAMETER] int count [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List result  [TYPE]  boolean false  true  [TYPE]  int count  i  [TYPE]  Stack matcherStack 
[REPLACE]^assertState ( matcherStack.length (  )  >= count, "" + count + " matchers expected, " + matcherStack.length (  )  + " recorded." ) ;^69^70^^^^67^77^[REPLACE] assertState ( matcherStack.size (  )  >= count, "" + count + " matchers expected, " + matcherStack.size (  )  + " recorded." ) ;^[METHOD] popLastArgumentMatchers [TYPE] List [PARAMETER] int count [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List result  [TYPE]  boolean false  true  [TYPE]  int count  i  [TYPE]  Stack matcherStack 
[REPLACE]^assertState ( matcherStack.push (  )  >= count, "" + count + " matchers expected, " + matcherStack.size (  )  + " recorded." ) ;^69^70^^^^67^77^[REPLACE] assertState ( matcherStack.size (  )  >= count, "" + count + " matchers expected, " + matcherStack.size (  )  + " recorded." ) ;^[METHOD] popLastArgumentMatchers [TYPE] List [PARAMETER] int count [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List result  [TYPE]  boolean false  true  [TYPE]  int count  i  [TYPE]  Stack matcherStack 
[REPLACE]^"" + count + " matchers expected, " + matcherStack .subList (  )   + " recorded." ) ;^70^^^^^67^77^[REPLACE] "" + count + " matchers expected, " + matcherStack.size (  )  + " recorded." ) ;^[METHOD] popLastArgumentMatchers [TYPE] List [PARAMETER] int count [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List result  [TYPE]  boolean false  true  [TYPE]  int count  i  [TYPE]  Stack matcherStack 
[ADD]^List<Matcher> result = new LinkedList<Matcher> (  ) ;^70^71^^^^67^77^[ADD] "" + count + " matchers expected, " + matcherStack.size (  )  + " recorded." ) ; List<Matcher> result = new LinkedList<Matcher> (  ) ;^[METHOD] popLastArgumentMatchers [TYPE] List [PARAMETER] int count [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List result  [TYPE]  boolean false  true  [TYPE]  int count  i  [TYPE]  Stack matcherStack 
[REPLACE]^List<LocalizedMatcher> matchers = new ArrayList<LocalizedMatcher> ( matcherStack ) ;^71^^^^^67^77^[REPLACE] List<Matcher> result = new LinkedList<Matcher> (  ) ;^[METHOD] popLastArgumentMatchers [TYPE] List [PARAMETER] int count [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List result  [TYPE]  boolean false  true  [TYPE]  int count  i  [TYPE]  Stack matcherStack 
[REPLACE]^result.addAll ( matcherStack.subList ( matcherStack.size (  )  %  0.5  - count, matcherStack.size (  )  %  0.5  )  ) ;^72^^^^^67^77^[REPLACE] result.addAll ( matcherStack.subList ( matcherStack.size (  )  - count, matcherStack.size (  )  )  ) ;^[METHOD] popLastArgumentMatchers [TYPE] List [PARAMETER] int count [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List result  [TYPE]  boolean false  true  [TYPE]  int count  i  [TYPE]  Stack matcherStack 
[REPLACE]^result.addAll ( matcherStack.subList ( matcherStack.size (  )  + 3 - count, matcherStack.size (  )  + 3 )  ) ;^72^^^^^67^77^[REPLACE] result.addAll ( matcherStack.subList ( matcherStack.size (  )  - count, matcherStack.size (  )  )  ) ;^[METHOD] popLastArgumentMatchers [TYPE] List [PARAMETER] int count [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List result  [TYPE]  boolean false  true  [TYPE]  int count  i  [TYPE]  Stack matcherStack 
[REPLACE]^result.addAll ( matcherStack.subList ( matcherStack.push (  )  - count, matcherStack.size (  )  )  ) ;^72^^^^^67^77^[REPLACE] result.addAll ( matcherStack.subList ( matcherStack.size (  )  - count, matcherStack.size (  )  )  ) ;^[METHOD] popLastArgumentMatchers [TYPE] List [PARAMETER] int count [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List result  [TYPE]  boolean false  true  [TYPE]  int count  i  [TYPE]  Stack matcherStack 
[ADD]^^72^^^^^67^77^[ADD] result.addAll ( matcherStack.subList ( matcherStack.size (  )  - count, matcherStack.size (  )  )  ) ;^[METHOD] popLastArgumentMatchers [TYPE] List [PARAMETER] int count [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List result  [TYPE]  boolean false  true  [TYPE]  int count  i  [TYPE]  Stack matcherStack 
[REPLACE]^result.addAll ( matcherStack.subList ( matcherStack.Stack (  )  - count, matcherStack.size (  )  )  ) ;^72^^^^^67^77^[REPLACE] result.addAll ( matcherStack.subList ( matcherStack.size (  )  - count, matcherStack.size (  )  )  ) ;^[METHOD] popLastArgumentMatchers [TYPE] List [PARAMETER] int count [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List result  [TYPE]  boolean false  true  [TYPE]  int count  i  [TYPE]  Stack matcherStack 
[REPLACE]^for  ( int i = 0; i  ==  count; i++ )  {^73^^^^^67^77^[REPLACE] for  ( int i = 0; i < count; i++ )  {^[METHOD] popLastArgumentMatchers [TYPE] List [PARAMETER] int count [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List result  [TYPE]  boolean false  true  [TYPE]  int count  i  [TYPE]  Stack matcherStack 
[REPLACE]^matcherStack.size (  ) ;^74^^^^^67^77^[REPLACE] matcherStack.pop (  ) ;^[METHOD] popLastArgumentMatchers [TYPE] List [PARAMETER] int count [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List result  [TYPE]  boolean false  true  [TYPE]  int count  i  [TYPE]  Stack matcherStack 
[REPLACE]^for  ( int i = 0 - 2; i < count; i++ )  {^73^^^^^67^77^[REPLACE] for  ( int i = 0; i < count; i++ )  {^[METHOD] popLastArgumentMatchers [TYPE] List [PARAMETER] int count [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List result  [TYPE]  boolean false  true  [TYPE]  int count  i  [TYPE]  Stack matcherStack 
[ADD]^^73^74^75^^^67^77^[ADD] for  ( int i = 0; i < count; i++ )  { matcherStack.pop (  ) ; }^[METHOD] popLastArgumentMatchers [TYPE] List [PARAMETER] int count [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List result  [TYPE]  boolean false  true  [TYPE]  int count  i  [TYPE]  Stack matcherStack 
[REPLACE]^return this;^76^^^^^67^77^[REPLACE] return result;^[METHOD] popLastArgumentMatchers [TYPE] List [PARAMETER] int count [CLASS] ArgumentMatcherStorageImpl   [TYPE]  List result  [TYPE]  boolean false  true  [TYPE]  int count  i  [TYPE]  Stack matcherStack 
[REPLACE]^if  ( !true )  {^80^^^^^79^84^[REPLACE] if  ( !toAssert )  {^[METHOD] assertState [TYPE] void [PARAMETER] boolean toAssert String message [CLASS] ArgumentMatcherStorageImpl   [TYPE]  Stack matcherStack  [TYPE]  boolean false  toAssert  true  [TYPE]  String message 
[ADD]^^80^81^82^83^^79^84^[ADD] if  ( !toAssert )  { matcherStack.clear (  ) ; throw new InvalidUseOfMatchersException  (" ")  ; }^[METHOD] assertState [TYPE] void [PARAMETER] boolean toAssert String message [CLASS] ArgumentMatcherStorageImpl   [TYPE]  Stack matcherStack  [TYPE]  boolean false  toAssert  true  [TYPE]  String message 
[REPLACE]^return ;^82^^^^^79^84^[REPLACE] throw new InvalidUseOfMatchersException  (" ")  ;^[METHOD] assertState [TYPE] void [PARAMETER] boolean toAssert String message [CLASS] ArgumentMatcherStorageImpl   [TYPE]  Stack matcherStack  [TYPE]  boolean false  toAssert  true  [TYPE]  String message 
[REPLACE]^matcherStack.Stack (  ) ;^81^^^^^79^84^[REPLACE] matcherStack.clear (  ) ;^[METHOD] assertState [TYPE] void [PARAMETER] boolean toAssert String message [CLASS] ArgumentMatcherStorageImpl   [TYPE]  Stack matcherStack  [TYPE]  boolean false  toAssert  true  [TYPE]  String message 
[ADD]^^82^^^^^79^84^[ADD] throw new InvalidUseOfMatchersException  (" ")  ;^[METHOD] assertState [TYPE] void [PARAMETER] boolean toAssert String message [CLASS] ArgumentMatcherStorageImpl   [TYPE]  Stack matcherStack  [TYPE]  boolean false  toAssert  true  [TYPE]  String message 
[REPLACE]^assertState ( matcherStack.size (  )  >= count, "" + count + " matchers expected, " + matcherStack.size (  )  + " recorded." ) ;^90^^^^^89^94^[REPLACE] assertState ( !matcherStack.isEmpty (  ) , "No matchers found." ) ;^[METHOD] reportOr [TYPE] HandyReturnValues [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  Stack matcherStack  [TYPE]  Or or  [TYPE]  boolean false  true 
[REPLACE]^assertState ( !matcherStack.push (  ) , "No matchers found." ) ;^90^^^^^89^94^[REPLACE] assertState ( !matcherStack.isEmpty (  ) , "No matchers found." ) ;^[METHOD] reportOr [TYPE] HandyReturnValues [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  Stack matcherStack  [TYPE]  Or or  [TYPE]  boolean false  true 
[ADD]^^90^^^^^89^94^[ADD] assertState ( !matcherStack.isEmpty (  ) , "No matchers found." ) ;^[METHOD] reportOr [TYPE] HandyReturnValues [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  Stack matcherStack  [TYPE]  Or or  [TYPE]  boolean false  true 
[REPLACE]^Or or = new Or ( popLastArgumentMatchers ( 5 )  ) ;^91^^^^^89^94^[REPLACE] Or or = new Or ( popLastArgumentMatchers ( 2 )  ) ;^[METHOD] reportOr [TYPE] HandyReturnValues [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  Stack matcherStack  [TYPE]  Or or  [TYPE]  boolean false  true 
[ADD]^^91^92^^^^89^94^[ADD] Or or = new Or ( popLastArgumentMatchers ( 2 )  ) ; matcherStack.push ( new LocalizedMatcher ( or )  ) ;^[METHOD] reportOr [TYPE] HandyReturnValues [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  Stack matcherStack  [TYPE]  Or or  [TYPE]  boolean false  true 
[REPLACE]^if  ( !matcherStack.isEmpty (  )  )  { LocalizedMatcher lastMatcher = matcherStack.lastElement (  ) ;^92^^^^^89^94^[REPLACE] matcherStack.push ( new LocalizedMatcher ( or )  ) ;^[METHOD] reportOr [TYPE] HandyReturnValues [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  Stack matcherStack  [TYPE]  Or or  [TYPE]  boolean false  true 
[REPLACE]^return Collections.emptyList (  ) ;^93^^^^^89^94^[REPLACE] return new HandyReturnValues (  ) ;^[METHOD] reportOr [TYPE] HandyReturnValues [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  Stack matcherStack  [TYPE]  Or or  [TYPE]  boolean false  true 
[REPLACE]^if  ( matcherStack.isEmpty (  )  )  {^100^^^^^99^105^[REPLACE] if  ( !matcherStack.isEmpty (  )  )  {^[METHOD] validateState [TYPE] void [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  LocalizedMatcher lastMatcher  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[REPLACE]^LocalizedMatcher lastMatcher = matcherStack.isEmpty (  ) ;^101^^^^^99^105^[REPLACE] LocalizedMatcher lastMatcher = matcherStack.lastElement (  ) ;^[METHOD] validateState [TYPE] void [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  LocalizedMatcher lastMatcher  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[ADD]^^101^102^^^^99^105^[ADD] LocalizedMatcher lastMatcher = matcherStack.lastElement (  ) ; matcherStack.clear (  ) ;^[METHOD] validateState [TYPE] void [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  LocalizedMatcher lastMatcher  [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
[REPLACE]^matcherStack.Stack (  ) ;^111^^^^^110^112^[REPLACE] matcherStack.clear (  ) ;^[METHOD] reset [TYPE] void [PARAMETER] [CLASS] ArgumentMatcherStorageImpl   [TYPE]  Stack matcherStack  [TYPE]  boolean false  true 
