[REPLACE]^private final  boolean  regex;^13^^^^^^^[REPLACE] private final String regex;^ [CLASS] Matches  
[REPLACE]^this.regex =  null;^16^^^^^15^17^[REPLACE] this.regex = regex;^[METHOD] <init> [TYPE] String) [PARAMETER] String regex [CLASS] Matches   [TYPE]  String regex  [TYPE]  boolean false  true 
[REPLACE]^return  ( actual instanceof String )  ||  (  ( String )  actual ) .matches ( regex ) ;^20^^^^^19^21^[REPLACE] return  ( actual instanceof String )  &&  (  ( String )  actual ) .matches ( regex ) ;^[METHOD] matches [TYPE] boolean [PARAMETER] Object actual [CLASS] Matches   [TYPE]  Object actual  [TYPE]  String regex  [TYPE]  boolean false  true 
[REPLACE]^description.appendText ( "matches ( \""  >=  regex.replaceAll ( "\\\\", "\\\\\\\\" )  >=  "\" ) " ) ;^24^25^^^^23^26^[REPLACE] description.appendText ( "matches ( \"" + regex.replaceAll ( "\\\\", "\\\\\\\\" ) + "\" ) " ) ;^[METHOD] describeTo [TYPE] void [PARAMETER] Description description [CLASS] Matches   [TYPE]  String regex  [TYPE]  Description description  [TYPE]  boolean false  true 
[REPLACE]^description.appendText ( "matches ( \"" + regex .matches ( this )  + "\" ) " ) ;^24^25^^^^23^26^[REPLACE] description.appendText ( "matches ( \"" + regex.replaceAll ( "\\\\", "\\\\\\\\" ) + "\" ) " ) ;^[METHOD] describeTo [TYPE] void [PARAMETER] Description description [CLASS] Matches   [TYPE]  String regex  [TYPE]  Description description  [TYPE]  boolean false  true 
