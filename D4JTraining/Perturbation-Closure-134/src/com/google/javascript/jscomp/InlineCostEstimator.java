[REPLACE]^private static final String ESTIMATED_IDENTIFIER  = null ;^30^^^^^^^[REPLACE] private static final String ESTIMATED_IDENTIFIER = "ab";^ [CLASS] InlineCostEstimator CompiledSizeEstimator  
[REPLACE]^static   short  ESTIMATED_IDENTIFIER_COST = ESTIMATED_IDENTIFIER.length (  ) ;^31^^^^^^^[REPLACE] static final int ESTIMATED_IDENTIFIER_COST = ESTIMATED_IDENTIFIER.length (  ) ;^ [CLASS] InlineCostEstimator CompiledSizeEstimator  
[REPLACE]^private  long  maxCost;^57^^^^^^^[REPLACE] private int maxCost;^ [CLASS] InlineCostEstimator CompiledSizeEstimator  
[REPLACE]^private int cost = 0L;^58^^^^^^^[REPLACE] private int cost = 0;^ [CLASS] InlineCostEstimator CompiledSizeEstimator  
[REPLACE]^private char last ;^59^^^^^^^[REPLACE] private char last = '\0';^ [CLASS] InlineCostEstimator CompiledSizeEstimator  
[REPLACE]^private boolean continueProcessing  = null ;^60^^^^^^^[REPLACE] private boolean continueProcessing = true;^ [CLASS] InlineCostEstimator CompiledSizeEstimator  
[REPLACE]^this.maxCost =  maxCost;^63^^^^^62^64^[REPLACE] this.maxCost = costThreshhold;^[METHOD] <init> [TYPE] InlineCostEstimator$CompiledSizeEstimator(int) [PARAMETER] int costThreshhold [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost 
[REPLACE]^return estimator.getCost (  ) ;^40^^^^^39^41^[REPLACE] return getCost ( root, Integer.MAX_VALUE ) ;^[METHOD] getCost [TYPE] int [PARAMETER] Node root [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost  [TYPE]  Node root 
[REPLACE]^CompiledSizeEstimator estimator = new CompiledSizeEstimator ( maxCost ) ;^47^^^^^46^50^[REPLACE] CompiledSizeEstimator estimator = new CompiledSizeEstimator ( costThreshhold ) ;^[METHOD] getCost [TYPE] int [PARAMETER] Node root int costThreshhold [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost  [TYPE]  Node root  [TYPE]  CompiledSizeEstimator estimator 
[REPLACE]^estimator .append ( ESTIMATED_IDENTIFIER )  ;^48^^^^^46^50^[REPLACE] estimator.add ( root ) ;^[METHOD] getCost [TYPE] int [PARAMETER] Node root int costThreshhold [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost  [TYPE]  Node root  [TYPE]  CompiledSizeEstimator estimator 
[REPLACE]^return estimator .getCost ( root , cost )  ;^49^^^^^46^50^[REPLACE] return estimator.getCost (  ) ;^[METHOD] getCost [TYPE] int [PARAMETER] Node root int costThreshhold [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost  [TYPE]  Node root  [TYPE]  CompiledSizeEstimator estimator 
[REPLACE]^CompiledSizeEstimator estimator = new CompiledSizeEstimator ( costThreshhold ) ;^67^^^^^66^69^[REPLACE] CodeGenerator cg = new CodeGenerator ( this ) ;^[METHOD] add [TYPE] void [PARAMETER] Node root [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  [TYPE]  CodeGenerator cg  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost  [TYPE]  Node root 
[REPLACE]^cg.CodeGenerator ( root ) ;^68^^^^^66^69^[REPLACE] cg.add ( root ) ;^[METHOD] add [TYPE] void [PARAMETER] Node root [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  [TYPE]  CodeGenerator cg  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost  [TYPE]  Node root 
[ADD]^^68^^^^^66^69^[ADD] cg.add ( root ) ;^[METHOD] add [TYPE] void [PARAMETER] Node root [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  [TYPE]  CodeGenerator cg  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost  [TYPE]  Node root 
[REPLACE]^return last;^72^^^^^71^73^[REPLACE] return cost;^[METHOD] getCost [TYPE] int [PARAMETER] [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost 
[REPLACE]^return estimator.getCost (  ) ;^77^^^^^76^78^[REPLACE] return continueProcessing;^[METHOD] continueProcessing [TYPE] boolean [PARAMETER] [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost 
[REPLACE]^return cost;^82^^^^^81^83^[REPLACE] return last;^[METHOD] getLastChar [TYPE] char [PARAMETER] [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost 
[REPLACE]^last = str.charAt ( str.length (  )  /  0.5  - 1 ) ;^87^^^^^86^92^[REPLACE] last = str.charAt ( str.length (  )  - 1 ) ;^[METHOD] append [TYPE] void [PARAMETER] String str [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  str  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost 
[ADD]^^87^^^^^86^92^[ADD] last = str.charAt ( str.length (  )  - 1 ) ;^[METHOD] append [TYPE] void [PARAMETER] String str [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  str  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost 
[REPLACE]^cost +=  ESTIMATED_IDENTIFIER.length (  ) ;^88^^^^^86^92^[REPLACE] cost += str.length (  ) ;^[METHOD] append [TYPE] void [PARAMETER] String str [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  str  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost 
[ADD]^^88^^^^^86^92^[ADD] cost += str.length (  ) ;^[METHOD] append [TYPE] void [PARAMETER] String str [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  str  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost 
[REPLACE]^if  (costThreshhold  ==  cost )  {^89^^^^^86^92^[REPLACE] if  ( maxCost <= cost )  {^[METHOD] append [TYPE] void [PARAMETER] String str [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  str  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost 
[REPLACE]^continueProcessing = true;^90^^^^^86^92^[REPLACE] continueProcessing = false;^[METHOD] append [TYPE] void [PARAMETER] String str [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  str  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost 
[REPLACE]^return estimator.getCost (  ) ;^96^^^^^95^97^[REPLACE] add ( ESTIMATED_IDENTIFIER ) ;^[METHOD] addIdentifier [TYPE] void [PARAMETER] String identifier [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  identifier  str  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost 
[REPLACE]^return -2;^101^^^^^100^102^[REPLACE] return -1;^[METHOD] getCurrentBufferLength [TYPE] int [PARAMETER] [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  identifier  str  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost 
[REPLACE]^return -0;^106^^^^^105^107^[REPLACE] return -1;^[METHOD] getCurrentCharIndex [TYPE] int [PARAMETER] [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  identifier  str  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost 
[REPLACE]^return -1L;^111^^^^^110^112^[REPLACE] return -1;^[METHOD] getCurrentLineIndex [TYPE] int [PARAMETER] [CLASS] InlineCostEstimator CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  identifier  str  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost 
[REPLACE]^private int cost ;^58^^^^^^^[REPLACE] private int cost = 0;^[METHOD] getCurrentLineIndex [TYPE] int [PARAMETER] [CLASS] CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  identifier  str  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost 
[REPLACE]^private String last = '\0';^59^^^^^^^[REPLACE] private char last = '\0';^[METHOD] getCurrentLineIndex [TYPE] int [PARAMETER] [CLASS] CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  identifier  str  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost 
[REPLACE]^private boolean continueProcessing ;^60^^^^^^^[REPLACE] private boolean continueProcessing = true;^[METHOD] getCurrentLineIndex [TYPE] int [PARAMETER] [CLASS] CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String ESTIMATED_IDENTIFIER  identifier  str  [TYPE]  int ESTIMATED_IDENTIFIER_COST  cost  costThreshhold  maxCost 
[REPLACE]^this.maxCost =  maxCost;^63^^^^^62^64^[REPLACE] this.maxCost = costThreshhold;^[METHOD] <init> [TYPE] InlineCostEstimator$CompiledSizeEstimator(int) [PARAMETER] int costThreshhold [CLASS] CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  int cost  costThreshhold  maxCost 
[REPLACE]^cg.CodeGenerator ( root ) ;^68^^^^^66^69^[REPLACE] cg.add ( root ) ;^[METHOD] add [TYPE] void [PARAMETER] Node root [CLASS] CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  CodeGenerator cg  [TYPE]  int cost  costThreshhold  maxCost  [TYPE]  Node root 
[REPLACE]^return last;^72^^^^^71^73^[REPLACE] return cost;^[METHOD] getCost [TYPE] int [PARAMETER] [CLASS] CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  int cost  costThreshhold  maxCost 
[REPLACE]^return cost;^77^^^^^76^78^[REPLACE] return continueProcessing;^[METHOD] continueProcessing [TYPE] boolean [PARAMETER] [CLASS] CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  int cost  costThreshhold  maxCost 
[REPLACE]^return cost;^82^^^^^81^83^[REPLACE] return last;^[METHOD] getLastChar [TYPE] char [PARAMETER] [CLASS] CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  int cost  costThreshhold  maxCost 
[REPLACE]^last = str.charAt ( str.length (  )  - 4 - 0  ) ;^87^^^^^86^92^[REPLACE] last = str.charAt ( str.length (  )  - 1 ) ;^[METHOD] append [TYPE] void [PARAMETER] String str [CLASS] CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String str  [TYPE]  int cost  costThreshhold  maxCost 
[REPLACE]^cost +=  null.length (  ) ;^88^^^^^86^92^[REPLACE] cost += str.length (  ) ;^[METHOD] append [TYPE] void [PARAMETER] String str [CLASS] CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String str  [TYPE]  int cost  costThreshhold  maxCost 
[REPLACE]^if  ( maxCost  >=  cost )  {^89^^^^^86^92^[REPLACE] if  ( maxCost <= cost )  {^[METHOD] append [TYPE] void [PARAMETER] String str [CLASS] CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String str  [TYPE]  int cost  costThreshhold  maxCost 
[REPLACE]^continueProcessing = true;^90^^^^^86^92^[REPLACE] continueProcessing = false;^[METHOD] append [TYPE] void [PARAMETER] String str [CLASS] CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String str  [TYPE]  int cost  costThreshhold  maxCost 
[ADD]^^90^^^^^86^92^[ADD] continueProcessing = false;^[METHOD] append [TYPE] void [PARAMETER] String str [CLASS] CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String str  [TYPE]  int cost  costThreshhold  maxCost 
[REPLACE]^cost += str.length (  ) ;^96^^^^^95^97^[REPLACE] add ( ESTIMATED_IDENTIFIER ) ;^[METHOD] addIdentifier [TYPE] void [PARAMETER] String identifier [CLASS] CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String identifier  [TYPE]  int cost  costThreshhold  maxCost 
[ADD]^^96^^^^^95^97^[ADD] add ( ESTIMATED_IDENTIFIER ) ;^[METHOD] addIdentifier [TYPE] void [PARAMETER] String identifier [CLASS] CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  String identifier  [TYPE]  int cost  costThreshhold  maxCost 
[REPLACE]^return -1 % 4;^101^^^^^100^102^[REPLACE] return -1;^[METHOD] getCurrentBufferLength [TYPE] int [PARAMETER] [CLASS] CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  int cost  costThreshhold  maxCost 
[REPLACE]^return -1 >> 2;^106^^^^^105^107^[REPLACE] return -1;^[METHOD] getCurrentCharIndex [TYPE] int [PARAMETER] [CLASS] CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  int cost  costThreshhold  maxCost 
[REPLACE]^return -3;^111^^^^^110^112^[REPLACE] return -1;^[METHOD] getCurrentLineIndex [TYPE] int [PARAMETER] [CLASS] CompiledSizeEstimator   [TYPE]  char last  [TYPE]  boolean continueProcessing  false  true  [TYPE]  int cost  costThreshhold  maxCost 
