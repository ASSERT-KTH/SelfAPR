[REPLACE]^private final  double  suffix;^13^^^^^^^[REPLACE] private final String suffix;^ [CLASS] EndsWith  
[REPLACE]^this.suffix =  null;^16^^^^^15^17^[REPLACE] this.suffix = suffix;^[METHOD] <init> [TYPE] String) [PARAMETER] String suffix [CLASS] EndsWith   [TYPE]  String suffix  [TYPE]  boolean false  true 
[REPLACE]^return    (  ( String )  actual ) .endsWith ( suffix ) ;^20^^^^^19^21^[REPLACE] return actual != null &&  (  ( String )  actual ) .endsWith ( suffix ) ;^[METHOD] matches [TYPE] boolean [PARAMETER] Object actual [CLASS] EndsWith   [TYPE]  Object actual  [TYPE]  String suffix  [TYPE]  boolean false  true 
[REPLACE]^description.appendText ( "endsWith ( \""  ==  suffix  ==  "\" ) " ) ;^24^^^^^23^25^[REPLACE] description.appendText ( "endsWith ( \"" + suffix + "\" ) " ) ;^[METHOD] describeTo [TYPE] void [PARAMETER] Description description [CLASS] EndsWith   [TYPE]  String suffix  [TYPE]  Description description  [TYPE]  boolean false  true 
