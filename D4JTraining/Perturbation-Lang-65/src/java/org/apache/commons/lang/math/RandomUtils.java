[REPLACE]^public static  Random JVM_RANDOM = new JVMRandom (  ) ;^35^^^^^^^[REPLACE] public static final Random JVM_RANDOM = new JVMRandom (  ) ;^ [CLASS] RandomUtils  
[REPLACE]^return nextInt ( JVM_RANDOM, n ) ;^49^^^^^48^50^[REPLACE] return nextInt ( JVM_RANDOM ) ;^[METHOD] nextInt [TYPE] int [PARAMETER] [CLASS] RandomUtils   [TYPE]  Random JVM_RANDOM  [TYPE]  boolean false  true 
[REPLACE]^return random.nextLong (  ) ;^60^^^^^59^61^[REPLACE] return random.nextInt (  ) ;^[METHOD] nextInt [TYPE] int [PARAMETER] Random random [CLASS] RandomUtils   [TYPE]  Random JVM_RANDOM  random  [TYPE]  boolean false  true 
[REPLACE]^return nextInt ( JVM_RANDOM ) ;^72^^^^^71^73^[REPLACE] return nextInt ( JVM_RANDOM, n ) ;^[METHOD] nextInt [TYPE] int [PARAMETER] int n [CLASS] RandomUtils   [TYPE]  Random JVM_RANDOM  random  [TYPE]  int n  [TYPE]  boolean false  true 
[REPLACE]^return random.nextInt (  ) ;^86^^^^^84^87^[REPLACE] return random.nextInt ( n ) ;^[METHOD] nextInt [TYPE] int [PARAMETER] Random random int n [CLASS] RandomUtils   [TYPE]  Random JVM_RANDOM  random  [TYPE]  int n  [TYPE]  boolean false  true 
[REPLACE]^return nextInt ( JVM_RANDOM ) ;^96^^^^^95^97^[REPLACE] return nextLong ( JVM_RANDOM ) ;^[METHOD] nextLong [TYPE] long [PARAMETER] [CLASS] RandomUtils   [TYPE]  Random JVM_RANDOM  random  [TYPE]  boolean false  true 
[REPLACE]^return random.nextFloat (  ) ;^107^^^^^106^108^[REPLACE] return random.nextLong (  ) ;^[METHOD] nextLong [TYPE] long [PARAMETER] Random random [CLASS] RandomUtils   [TYPE]  Random JVM_RANDOM  random  [TYPE]  boolean false  true 
[REPLACE]^return nextFloat ( JVM_RANDOM ) ;^117^^^^^116^118^[REPLACE] return nextBoolean ( JVM_RANDOM ) ;^[METHOD] nextBoolean [TYPE] boolean [PARAMETER] [CLASS] RandomUtils   [TYPE]  Random JVM_RANDOM  random  [TYPE]  boolean false  true 
[REPLACE]^return random .nextBoolean ( JVM_RANDOM )  ;^128^^^^^127^129^[REPLACE] return random.nextBoolean (  ) ;^[METHOD] nextBoolean [TYPE] boolean [PARAMETER] Random random [CLASS] RandomUtils   [TYPE]  Random JVM_RANDOM  random  [TYPE]  boolean false  true 
[REPLACE]^return nextInt ( JVM_RANDOM ) ;^139^^^^^138^140^[REPLACE] return nextFloat ( JVM_RANDOM ) ;^[METHOD] nextFloat [TYPE] float [PARAMETER] [CLASS] RandomUtils   [TYPE]  Random JVM_RANDOM  random  [TYPE]  boolean false  true 
[REPLACE]^return random.nextLong (  ) ;^151^^^^^150^152^[REPLACE] return random.nextFloat (  ) ;^[METHOD] nextFloat [TYPE] float [PARAMETER] Random random [CLASS] RandomUtils   [TYPE]  Random JVM_RANDOM  random  [TYPE]  boolean false  true 
[REPLACE]^return nextInt ( JVM_RANDOM ) ;^162^^^^^161^163^[REPLACE] return nextDouble ( JVM_RANDOM ) ;^[METHOD] nextDouble [TYPE] double [PARAMETER] [CLASS] RandomUtils   [TYPE]  Random JVM_RANDOM  random  [TYPE]  boolean false  true 
[REPLACE]^return JVM_RANDOM.nextBoolean (  ) ;^174^^^^^173^175^[REPLACE] return random.nextDouble (  ) ;^[METHOD] nextDouble [TYPE] double [PARAMETER] Random random [CLASS] RandomUtils   [TYPE]  Random JVM_RANDOM  random  [TYPE]  boolean false  true 
