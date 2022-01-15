[REPLACE]^private  List<Matcher> matchers;^17^^^^^^^[REPLACE] private final List<Matcher> matchers;^ [CLASS] And  
[REPLACE]^this.matchers =  null;^20^^^^^19^21^[REPLACE] this.matchers = matchers;^[METHOD] <init> [TYPE] List) [PARAMETER] Matcher> matchers [CLASS] And   [TYPE]  List matchers  [TYPE]  boolean false  true 
[ADD]^^20^^^^^19^21^[ADD] this.matchers = matchers;^[METHOD] <init> [TYPE] List) [PARAMETER] Matcher> matchers [CLASS] And   [TYPE]  List matchers  [TYPE]  boolean false  true 
[REPLACE]^if  ( matcher.matches ( actual )  )  {^25^^^^^23^30^[REPLACE] if  ( !matcher.matches ( actual )  )  {^[METHOD] matches [TYPE] boolean [PARAMETER] Object actual [CLASS] And   [TYPE]  List matchers  [TYPE]  Object actual  [TYPE]  boolean false  true  [TYPE]  Matcher matcher 
[REPLACE]^return true;^26^^^^^23^30^[REPLACE] return false;^[METHOD] matches [TYPE] boolean [PARAMETER] Object actual [CLASS] And   [TYPE]  List matchers  [TYPE]  Object actual  [TYPE]  boolean false  true  [TYPE]  Matcher matcher 
[REPLACE]^for  ( Matcher matcher : matchers )  { if  ( !matcher.matches ( actual )  )  {^24^^^^^23^30^[REPLACE] for  ( Matcher matcher : matchers )  {^[METHOD] matches [TYPE] boolean [PARAMETER] Object actual [CLASS] And   [TYPE]  List matchers  [TYPE]  Object actual  [TYPE]  boolean false  true  [TYPE]  Matcher matcher 
[REPLACE]^return false;^29^^^^^23^30^[REPLACE] return true;^[METHOD] matches [TYPE] boolean [PARAMETER] Object actual [CLASS] And   [TYPE]  List matchers  [TYPE]  Object actual  [TYPE]  boolean false  true  [TYPE]  Matcher matcher 
[REPLACE]^description.appendText ( ", " ) ;^33^^^^^32^41^[REPLACE] description.appendText ( "and ( " ) ;^[METHOD] describeTo [TYPE] void [PARAMETER] Description description [CLASS] And   [TYPE]  Iterator it  [TYPE]  List matchers  [TYPE]  Description description  [TYPE]  boolean false  true 
[REPLACE]^if  ( it.next (  )  )  {^36^^^^^32^41^[REPLACE] if  ( it.hasNext (  )  )  {^[METHOD] describeTo [TYPE] void [PARAMETER] Description description [CLASS] And   [TYPE]  Iterator it  [TYPE]  List matchers  [TYPE]  Description description  [TYPE]  boolean false  true 
[REPLACE]^description.appendText ( " ) " ) ;^37^^^^^32^41^[REPLACE] description.appendText ( ", " ) ;^[METHOD] describeTo [TYPE] void [PARAMETER] Description description [CLASS] And   [TYPE]  Iterator it  [TYPE]  List matchers  [TYPE]  Description description  [TYPE]  boolean false  true 
[REPLACE]^for  ( Iterator<Matcher> null = matchers.iterator (  ) ; it.hasNext (  ) ; )  {^34^^^^^32^41^[REPLACE] for  ( Iterator<Matcher> it = matchers.iterator (  ) ; it.hasNext (  ) ; )  {^[METHOD] describeTo [TYPE] void [PARAMETER] Description description [CLASS] And   [TYPE]  Iterator it  [TYPE]  List matchers  [TYPE]  Description description  [TYPE]  boolean false  true 
[ADD]^^34^35^36^37^38^32^41^[ADD] for  ( Iterator<Matcher> it = matchers.iterator (  ) ; it.hasNext (  ) ; )  { it.next (  ) .describeTo ( description ) ; if  ( it.hasNext (  )  )  { description.appendText ( ", " ) ; }^[METHOD] describeTo [TYPE] void [PARAMETER] Description description [CLASS] And   [TYPE]  Iterator it  [TYPE]  List matchers  [TYPE]  Description description  [TYPE]  boolean false  true 
[REPLACE]^if  ( 0.hasNext (  )  )  {^36^^^^^32^41^[REPLACE] if  ( it.hasNext (  )  )  {^[METHOD] describeTo [TYPE] void [PARAMETER] Description description [CLASS] And   [TYPE]  Iterator it  [TYPE]  List matchers  [TYPE]  Description description  [TYPE]  boolean false  true 
[REPLACE]^for  ( Matcher matcher : matchers )  { if  ( !matcher.matches ( actual )  )  {^34^^^^^32^41^[REPLACE] for  ( Iterator<Matcher> it = matchers.iterator (  ) ; it.hasNext (  ) ; )  {^[METHOD] describeTo [TYPE] void [PARAMETER] Description description [CLASS] And   [TYPE]  Iterator it  [TYPE]  List matchers  [TYPE]  Description description  [TYPE]  boolean false  true 
[REPLACE]^description.appendText ( ", " ) ;^40^^^^^32^41^[REPLACE] description.appendText ( " ) " ) ;^[METHOD] describeTo [TYPE] void [PARAMETER] Description description [CLASS] And   [TYPE]  Iterator it  [TYPE]  List matchers  [TYPE]  Description description  [TYPE]  boolean false  true 
