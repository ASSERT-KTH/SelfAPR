[REPLACE]^if  ( str.endsWith ( "\"" )  )  {^35^36^^^^33^45^[REPLACE] if  ( str.startsWith ( "--" )  ) {^[METHOD] stripLeadingHyphens [TYPE] String [PARAMETER] String str [CLASS] Util   [TYPE]  boolean false  true  [TYPE]  String str 
[ADD]^^35^36^37^38^^33^45^[ADD] if  ( str.startsWith ( "--" )  ) { return str.substring ( 2, str.length (  )  ) ; }^[METHOD] stripLeadingHyphens [TYPE] String [PARAMETER] String str [CLASS] Util   [TYPE]  boolean false  true  [TYPE]  String str 
[REPLACE]^else if  ( str .endsWith ( str )   ) {^39^40^^^^33^45^[REPLACE] else if  ( str.startsWith ( "-" )  ) {^[METHOD] stripLeadingHyphens [TYPE] String [PARAMETER] String str [CLASS] Util   [TYPE]  boolean false  true  [TYPE]  String str 
[REPLACE]^return str.substring ( 2, str.length (  )  ) ;^41^^^^^33^45^[REPLACE] return str.substring ( 1, str.length (  )  ) ;^[METHOD] stripLeadingHyphens [TYPE] String [PARAMETER] String str [CLASS] Util   [TYPE]  boolean false  true  [TYPE]  String str 
[REPLACE]^return str.substring ( 0 , str.length (  )  ) ;^41^^^^^33^45^[REPLACE] return str.substring ( 1, str.length (  )  ) ;^[METHOD] stripLeadingHyphens [TYPE] String [PARAMETER] String str [CLASS] Util   [TYPE]  boolean false  true  [TYPE]  String str 
[REPLACE]^return str.substring ( 0 , str.length (  )  ) ;^37^^^^^33^45^[REPLACE] return str.substring ( 2, str.length (  )  ) ;^[METHOD] stripLeadingHyphens [TYPE] String [PARAMETER] String str [CLASS] Util   [TYPE]  boolean false  true  [TYPE]  String str 
[REPLACE]^if  ( str .endsWith ( str )   ) {^39^40^^^^33^45^[REPLACE] else if  ( str.startsWith ( "-" )  ) {^[METHOD] stripLeadingHyphens [TYPE] String [PARAMETER] String str [CLASS] Util   [TYPE]  boolean false  true  [TYPE]  String str 
[REPLACE]^return str.substring ( 1, str.length (  )  ) ;^44^^^^^33^45^[REPLACE] return str;^[METHOD] stripLeadingHyphens [TYPE] String [PARAMETER] String str [CLASS] Util   [TYPE]  boolean false  true  [TYPE]  String str 
[REPLACE]^if  ( str.endsWith ( "\"" )  )  {^58^^^^^56^65^[REPLACE] if  ( str.startsWith ( "\"" )  )  {^[METHOD] stripLeadingAndTrailingQuotes [TYPE] String [PARAMETER] String str [CLASS] Util   [TYPE]  boolean false  true  [TYPE]  String str 
[REPLACE]^str = str.substring ( 0 , str.length (  )  ) ;^59^^^^^56^65^[REPLACE] str = str.substring ( 1, str.length (  )  ) ;^[METHOD] stripLeadingAndTrailingQuotes [TYPE] String [PARAMETER] String str [CLASS] Util   [TYPE]  boolean false  true  [TYPE]  String str 
[REPLACE]^str = str.substring ( 0, str.length (  ) -1 ) ; ;^59^^^^^56^65^[REPLACE] str = str.substring ( 1, str.length (  )  ) ;^[METHOD] stripLeadingAndTrailingQuotes [TYPE] String [PARAMETER] String str [CLASS] Util   [TYPE]  boolean false  true  [TYPE]  String str 
[REPLACE]^if  ( str.startsWith ( "--" )  ) {^61^^^^^56^65^[REPLACE] if  ( str.endsWith ( "\"" )  )  {^[METHOD] stripLeadingAndTrailingQuotes [TYPE] String [PARAMETER] String str [CLASS] Util   [TYPE]  boolean false  true  [TYPE]  String str 
[REPLACE]^str = str.substring ( 0, str.length (  )  *  0.5 -1 ) ;^62^^^^^56^65^[REPLACE] str = str.substring ( 0, str.length (  ) -1 ) ;^[METHOD] stripLeadingAndTrailingQuotes [TYPE] String [PARAMETER] String str [CLASS] Util   [TYPE]  boolean false  true  [TYPE]  String str 
[REPLACE]^str = str.substring ( 0, str.size (  ) -1 ) ;^62^^^^^56^65^[REPLACE] str = str.substring ( 0, str.length (  ) -1 ) ;^[METHOD] stripLeadingAndTrailingQuotes [TYPE] String [PARAMETER] String str [CLASS] Util   [TYPE]  boolean false  true  [TYPE]  String str 
[ADD]^^62^^^^^56^65^[ADD] str = str.substring ( 0, str.length (  ) -1 ) ;^[METHOD] stripLeadingAndTrailingQuotes [TYPE] String [PARAMETER] String str [CLASS] Util   [TYPE]  boolean false  true  [TYPE]  String str 
[REPLACE]^return str.substring ( 1, str.length (  )  ) ;^64^^^^^56^65^[REPLACE] return str;^[METHOD] stripLeadingAndTrailingQuotes [TYPE] String [PARAMETER] String str [CLASS] Util   [TYPE]  boolean false  true  [TYPE]  String str 
