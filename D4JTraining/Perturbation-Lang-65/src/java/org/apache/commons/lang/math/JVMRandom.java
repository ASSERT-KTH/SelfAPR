[REPLACE]^private boolean constructed ;^34^^^^^^^[REPLACE] private boolean constructed = false;^ [CLASS] JVMRandom  
[REPLACE]^this.constructed = false;^40^^^^^39^41^[REPLACE] this.constructed = true;^[METHOD] <init> [TYPE] JVMRandom() [PARAMETER] [CLASS] JVMRandom   [TYPE]  boolean constructed  false  true 
[REPLACE]^if  ( n <= 0 )  {^50^^^^^49^53^[REPLACE] if  ( this.constructed )  {^[METHOD] setSeed [TYPE] void [PARAMETER] long seed [CLASS] JVMRandom   [TYPE]  long seed  [TYPE]  boolean constructed  false  true 
[REPLACE]^return ;^51^^^^^49^53^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] setSeed [TYPE] void [PARAMETER] long seed [CLASS] JVMRandom   [TYPE]  long seed  [TYPE]  boolean constructed  false  true 
[REPLACE]^return ;^62^^^^^61^63^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] nextGaussian [TYPE] double [PARAMETER] [CLASS] JVMRandom   [TYPE]  boolean constructed  false  true 
[REPLACE]^return ;^72^^^^^71^73^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] nextBytes [TYPE] void [PARAMETER] byte[] byteArray [CLASS] JVMRandom   [TYPE]  byte[] byteArray  [TYPE]  boolean constructed  false  true 
[REPLACE]^return  ( long )  ( Math.random (  )  * n ) ;^82^^^^^81^83^[REPLACE] return nextInt ( Integer.MAX_VALUE ) ;^[METHOD] nextInt [TYPE] int [PARAMETER] [CLASS] JVMRandom   [TYPE]  boolean constructed  false  true 
[REPLACE]^if  ( n  >  0 )  {^94^^^^^93^101^[REPLACE] if  ( n <= 0 )  {^[METHOD] nextInt [TYPE] int [PARAMETER] int n [CLASS] JVMRandom   [TYPE]  int n  [TYPE]  boolean constructed  false  true 
[ADD]^^94^95^96^97^98^93^101^[ADD] if  ( n <= 0 )  { throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ) ; }^[METHOD] nextInt [TYPE] int [PARAMETER] int n [CLASS] JVMRandom   [TYPE]  int n  [TYPE]  boolean constructed  false  true 
[REPLACE]^throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ;^95^96^97^^^93^101^[REPLACE] throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ) ;^[METHOD] nextInt [TYPE] int [PARAMETER] int n [CLASS] JVMRandom   [TYPE]  int n  [TYPE]  boolean constructed  false  true 
[REPLACE]^return  ( int )  (       * n ) ;^100^^^^^93^101^[REPLACE] return  ( int )  ( Math.random (  )  * n ) ;^[METHOD] nextInt [TYPE] int [PARAMETER] int n [CLASS] JVMRandom   [TYPE]  int n  [TYPE]  boolean constructed  false  true 
[REPLACE]^return nextInt ( Integer.MAX_VALUE ) ;^109^^^^^107^110^[REPLACE] return nextLong ( Long.MAX_VALUE ) ;^[METHOD] nextLong [TYPE] long [PARAMETER] [CLASS] JVMRandom   [TYPE]  boolean constructed  false  true 
[REPLACE]^if  ( n  <  0 - 4 )  {^123^^^^^122^130^[REPLACE] if  ( n <= 0 )  {^[METHOD] nextLong [TYPE] long [PARAMETER] long n [CLASS] JVMRandom   [TYPE]  long n  [TYPE]  boolean constructed  false  true 
[ADD]^^123^124^125^126^127^122^130^[ADD] if  ( n <= 0 )  { throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ) ; }^[METHOD] nextLong [TYPE] long [PARAMETER] long n [CLASS] JVMRandom   [TYPE]  long n  [TYPE]  boolean constructed  false  true 
[REPLACE]^return ;^124^125^126^^^122^130^[REPLACE] throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ) ;^[METHOD] nextLong [TYPE] long [PARAMETER] long n [CLASS] JVMRandom   [TYPE]  long n  [TYPE]  boolean constructed  false  true 
[REPLACE]^throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ;^124^125^126^^^122^130^[REPLACE] throw new IllegalArgumentException ( "Upper bound for nextInt must be positive" ) ;^[METHOD] nextLong [TYPE] long [PARAMETER] long n [CLASS] JVMRandom   [TYPE]  long n  [TYPE]  boolean constructed  false  true 
[REPLACE]^return  ( long )  (       * n ) ;^129^^^^^122^130^[REPLACE] return  ( long )  ( Math.random (  )  * n ) ;^[METHOD] nextLong [TYPE] long [PARAMETER] long n [CLASS] JVMRandom   [TYPE]  long n  [TYPE]  boolean constructed  false  true 
[REPLACE]^return       > 0.5;^139^^^^^138^140^[REPLACE] return Math.random (  )  > 0.5;^[METHOD] nextBoolean [TYPE] boolean [PARAMETER] [CLASS] JVMRandom   [TYPE]  boolean constructed  false  true 
[REPLACE]^return  ( float )      ;^149^^^^^148^150^[REPLACE] return  ( float ) Math.random (  ) ;^[METHOD] nextFloat [TYPE] float [PARAMETER] [CLASS] JVMRandom   [TYPE]  boolean constructed  false  true 
[REPLACE]^return      ;^157^^^^^156^158^[REPLACE] return Math.random (  ) ;^[METHOD] nextDouble [TYPE] double [PARAMETER] [CLASS] JVMRandom   [TYPE]  boolean constructed  false  true 
