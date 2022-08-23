[BugLab_Wrong_Literal]^private boolean constructed = true;^34^^^^^29^39^private boolean constructed = false;^[CLASS] JVMRandom   [VARIABLES] 
[BugLab_Wrong_Literal]^this.constructed = false;^40^^^^^39^41^this.constructed = true;^[CLASS] JVMRandom  [METHOD] <init> [RETURN_TYPE] JVMRandom()   [VARIABLES] boolean  constructed  
[BugLab_Variable_Misuse]^if  ( constructed )  {^50^^^^^49^53^if  ( this.constructed )  {^[CLASS] JVMRandom  [METHOD] setSeed [RETURN_TYPE] void   long seed [VARIABLES] long  seed  boolean  constructed  
[BugLab_Wrong_Operator]^if  ( n < 0 )  {^94^^^^^93^101^if  ( n <= 0 )  {^[CLASS] JVMRandom  [METHOD] nextInt [RETURN_TYPE] int   int n [VARIABLES] int  n  boolean  constructed  
[BugLab_Wrong_Operator]^return + ( int )  ( Math.random (  )  * n ) ;^100^^^^^93^101^return  ( int )  ( Math.random (  )  * n ) ;^[CLASS] JVMRandom  [METHOD] nextInt [RETURN_TYPE] int   int n [VARIABLES] int  n  boolean  constructed  
[BugLab_Wrong_Operator]^if  ( n < 0 )  {^123^^^^^122^130^if  ( n <= 0 )  {^[CLASS] JVMRandom  [METHOD] nextLong [RETURN_TYPE] long   long n [VARIABLES] long  n  boolean  constructed  
[BugLab_Wrong_Literal]^if  ( n <= -1 )  {^123^^^^^122^130^if  ( n <= 0 )  {^[CLASS] JVMRandom  [METHOD] nextLong [RETURN_TYPE] long   long n [VARIABLES] long  n  boolean  constructed  
[BugLab_Wrong_Operator]^return / ( long )  ( Math.random (  )  * n ) ;^129^^^^^122^130^return  ( long )  ( Math.random (  )  * n ) ;^[CLASS] JVMRandom  [METHOD] nextLong [RETURN_TYPE] long   long n [VARIABLES] long  n  boolean  constructed  
[BugLab_Wrong_Operator]^return Math.random (  )  < 0.5;^139^^^^^138^140^return Math.random (  )  > 0.5;^[CLASS] JVMRandom  [METHOD] nextBoolean [RETURN_TYPE] boolean   [VARIABLES] boolean  constructed  
