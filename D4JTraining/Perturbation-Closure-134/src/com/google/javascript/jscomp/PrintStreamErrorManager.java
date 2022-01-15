[REPLACE]^private int summaryDetailLevel ;^37^^^^^^^[REPLACE] private int summaryDetailLevel = 1;^ [CLASS] PrintStreamErrorManager  
[REPLACE]^this.formatter =  null;^47^^^^^45^49^[REPLACE] this.formatter = formatter;^[METHOD] <init> [TYPE] PrintStream) [PARAMETER] MessageFormatter formatter PrintStream stream [CLASS] PrintStreamErrorManager   [TYPE]  PrintStream stream  [TYPE]  MessageFormatter formatter  [TYPE]  boolean false  true  [TYPE]  int summaryDetailLevel 
[REPLACE]^this.stream =  null;^48^^^^^45^49^[REPLACE] this.stream = stream;^[METHOD] <init> [TYPE] PrintStream) [PARAMETER] MessageFormatter formatter PrintStream stream [CLASS] PrintStreamErrorManager   [TYPE]  PrintStream stream  [TYPE]  MessageFormatter formatter  [TYPE]  boolean false  true  [TYPE]  int summaryDetailLevel 
[REPLACE]^stream .println ( level , error )  ;^53^^^^^52^54^[REPLACE] stream.println ( error.format ( level, formatter )  ) ;^[METHOD] println [TYPE] void [PARAMETER] CheckLevel level JSError error [CLASS] PrintStreamErrorManager   [TYPE]  PrintStream stream  [TYPE]  MessageFormatter formatter  [TYPE]  boolean false  true  [TYPE]  int summaryDetailLevel  [TYPE]  CheckLevel level  [TYPE]  JSError error 
[ADD]^^53^54^^^^52^54^[ADD] stream.println ( error.format ( level, formatter )  ) ; }^[METHOD] println [TYPE] void [PARAMETER] CheckLevel level JSError error [CLASS] PrintStreamErrorManager   [TYPE]  PrintStream stream  [TYPE]  MessageFormatter formatter  [TYPE]  boolean false  true  [TYPE]  int summaryDetailLevel  [TYPE]  CheckLevel level  [TYPE]  JSError error 
[REPLACE]^getWarningCount (  )  ) ;^53^^^^^52^54^[REPLACE] stream.println ( error.format ( level, formatter )  ) ;^[METHOD] println [TYPE] void [PARAMETER] CheckLevel level JSError error [CLASS] PrintStreamErrorManager   [TYPE]  PrintStream stream  [TYPE]  MessageFormatter formatter  [TYPE]  boolean false  true  [TYPE]  int summaryDetailLevel  [TYPE]  CheckLevel level  [TYPE]  JSError error 
[REPLACE]^this.summaryDetailLevel =  null;^57^^^^^56^58^[REPLACE] this.summaryDetailLevel = summaryDetailLevel;^[METHOD] setSummaryDetailLevel [TYPE] void [PARAMETER] int summaryDetailLevel [CLASS] PrintStreamErrorManager   [TYPE]  PrintStream stream  [TYPE]  MessageFormatter formatter  [TYPE]  boolean false  true  [TYPE]  int summaryDetailLevel 
[REPLACE]^if  ( summaryDetailLevel >= 3 ) {^62^63^64^^^61^73^[REPLACE] if  ( summaryDetailLevel >= 3 || ( summaryDetailLevel >= 1 && getErrorCount (  )  + getWarningCount (  )  > 0 )  || ( summaryDetailLevel >= 2 && getTypedPercent (  )  > 0.0 )  )  {^[METHOD] printSummary [TYPE] void [PARAMETER] [CLASS] PrintStreamErrorManager   [TYPE]  PrintStream stream  [TYPE]  MessageFormatter formatter  [TYPE]  boolean false  true  [TYPE]  int summaryDetailLevel 
[REMOVE]^if  (  ( getTypedPercent (  )  )  > 0.0 )  {     stream.format ( "%d error ( s ) , %d warning ( s ) , %.1f%% typed%n", getErrorCount (  ) , getWarningCount (  ) , getTypedPercent (  )  ) ; }else {     stream.format ( "%d error ( s ) , %d warning ( s ) %n", getErrorCount (  ) , getWarningCount (  )  ) ; }^62^^^^^61^73^[REMOVE] ^[METHOD] printSummary [TYPE] void [PARAMETER] [CLASS] PrintStreamErrorManager   [TYPE]  PrintStream stream  [TYPE]  MessageFormatter formatter  [TYPE]  boolean false  true  [TYPE]  int summaryDetailLevel 
[REPLACE]^if  ( getTypedPercent (  )   <  0.0 )  {^65^^^^^61^73^[REPLACE] if  ( getTypedPercent (  )  > 0.0 )  {^[METHOD] printSummary [TYPE] void [PARAMETER] [CLASS] PrintStreamErrorManager   [TYPE]  PrintStream stream  [TYPE]  MessageFormatter formatter  [TYPE]  boolean false  true  [TYPE]  int summaryDetailLevel 
[REPLACE]^getErrorCount (  ) , getWarningCount (  ) , getTypedPercent (  )  ) ;^70^^^^^61^73^[REPLACE] getWarningCount (  )  ) ;^[METHOD] printSummary [TYPE] void [PARAMETER] [CLASS] PrintStreamErrorManager   [TYPE]  PrintStream stream  [TYPE]  MessageFormatter formatter  [TYPE]  boolean false  true  [TYPE]  int summaryDetailLevel 
[REMOVE]^getErrorCount (  ) , getWarningCount (  ) , getTypedPercent (  )  ) ;^70^^^^^61^73^[REMOVE] ^[METHOD] printSummary [TYPE] void [PARAMETER] [CLASS] PrintStreamErrorManager   [TYPE]  PrintStream stream  [TYPE]  MessageFormatter formatter  [TYPE]  boolean false  true  [TYPE]  int summaryDetailLevel 
[REPLACE]^stream .format ( 0 , formatter )  , %.1f%% typed%n", getErrorCount (  ) , getWarningCount (  ) , getTypedPercent (  )  ) ;^66^67^^^^61^73^[REPLACE] stream.format ( "%d error ( s ) , %d warning ( s ) , %.1f%% typed%n", getErrorCount (  ) , getWarningCount (  ) , getTypedPercent (  )  ) ;^[METHOD] printSummary [TYPE] void [PARAMETER] [CLASS] PrintStreamErrorManager   [TYPE]  PrintStream stream  [TYPE]  MessageFormatter formatter  [TYPE]  boolean false  true  [TYPE]  int summaryDetailLevel 
[REPLACE]^getWarningCount (  )  ) ;^67^^^^^61^73^[REPLACE] getErrorCount (  ) , getWarningCount (  ) , getTypedPercent (  )  ) ;^[METHOD] printSummary [TYPE] void [PARAMETER] [CLASS] PrintStreamErrorManager   [TYPE]  PrintStream stream  [TYPE]  MessageFormatter formatter  [TYPE]  boolean false  true  [TYPE]  int summaryDetailLevel 
[REMOVE]^getWarningCount (  )  ) ;^67^^^^^61^73^[REMOVE] ^[METHOD] printSummary [TYPE] void [PARAMETER] [CLASS] PrintStreamErrorManager   [TYPE]  PrintStream stream  [TYPE]  MessageFormatter formatter  [TYPE]  boolean false  true  [TYPE]  int summaryDetailLevel 
[REPLACE]^if  ( getTypedPercent (  )   !=  0.0 )  {^65^^^^^61^73^[REPLACE] if  ( getTypedPercent (  )  > 0.0 )  {^[METHOD] printSummary [TYPE] void [PARAMETER] [CLASS] PrintStreamErrorManager   [TYPE]  PrintStream stream  [TYPE]  MessageFormatter formatter  [TYPE]  boolean false  true  [TYPE]  int summaryDetailLevel 
[REMOVE]^if  (  (  (  ( summaryDetailLevel )  >= 3 )  ||  (  (  ( summaryDetailLevel )  >= 1 )  &&  (  (  ( getErrorCount (  )  )  +  ( getWarningCount (  )  )  )  > 0 )  )  )  ||  (  (  ( summaryDetailLevel )  >= 2 )  &&  (  ( getTypedPercent (  )  )  > 0.0 )  )  )  {     if  (  ( getTypedPercent (  )  )  > 0.0 )  {         stream.format ( "%d error ( s ) , %d warning ( s ) , %.1f%% typed%n", getErrorCount (  ) , getWarningCount (  ) , getTypedPercent (  )  ) ;     }else {         stream.format ( "%d error ( s ) , %d warning ( s ) %n", getErrorCount (  ) , getWarningCount (  )  ) ;     } }^65^^^^^61^73^[REMOVE] ^[METHOD] printSummary [TYPE] void [PARAMETER] [CLASS] PrintStreamErrorManager   [TYPE]  PrintStream stream  [TYPE]  MessageFormatter formatter  [TYPE]  boolean false  true  [TYPE]  int summaryDetailLevel 
[REPLACE]^stream .format ( null , formatter )  %n", getErrorCount (  ) , getWarningCount (  )  ) ;^69^70^^^^61^73^[REPLACE] stream.format ( "%d error ( s ) , %d warning ( s ) %n", getErrorCount (  ) , getWarningCount (  )  ) ;^[METHOD] printSummary [TYPE] void [PARAMETER] [CLASS] PrintStreamErrorManager   [TYPE]  PrintStream stream  [TYPE]  MessageFormatter formatter  [TYPE]  boolean false  true  [TYPE]  int summaryDetailLevel 
[ADD]^^66^67^68^69^70^61^73^[ADD] stream.format ( "%d error ( s ) , %d warning ( s ) , %.1f%% typed%n", getErrorCount (  ) , getWarningCount (  ) , getTypedPercent (  )  ) ; } else { stream.format ( "%d error ( s ) , %d warning ( s ) %n", getErrorCount (  ) , getWarningCount (  )  ) ;^[METHOD] printSummary [TYPE] void [PARAMETER] [CLASS] PrintStreamErrorManager   [TYPE]  PrintStream stream  [TYPE]  MessageFormatter formatter  [TYPE]  boolean false  true  [TYPE]  int summaryDetailLevel 
[ADD]^^67^^^^^61^73^[ADD] getErrorCount (  ) , getWarningCount (  ) , getTypedPercent (  )  ) ;^[METHOD] printSummary [TYPE] void [PARAMETER] [CLASS] PrintStreamErrorManager   [TYPE]  PrintStream stream  [TYPE]  MessageFormatter formatter  [TYPE]  boolean false  true  [TYPE]  int summaryDetailLevel 
