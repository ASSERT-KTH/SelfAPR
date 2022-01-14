[REPLACE]^private int mode  = null ;^47^^^^^^^[REPLACE] private int mode = 5;^ [CLASS] ValueServer  
[REPLACE]^private URL valuesFileURL = this;^50^^^^^^^[REPLACE] private URL valuesFileURL = null;^ [CLASS] ValueServer  
[REPLACE]^private double mu ;^53^^^^^^^[REPLACE] private double mu = 0.0;^ [CLASS] ValueServer  
[REPLACE]^private double sigma = 0.0D;^56^^^^^^^[REPLACE] private double sigma = 0.0;^ [CLASS] ValueServer  
[REPLACE]^private EmpiricalDistribution empiricalDistribution ;^59^^^^^^^[REPLACE] private EmpiricalDistribution empiricalDistribution = null;^ [CLASS] ValueServer  
[REPLACE]^private BufferedReader filePointer ;^62^^^^^^^[REPLACE] private BufferedReader filePointer = null;^ [CLASS] ValueServer  
[REPLACE]^private RandomData randomData  = null ;^65^^^^^^^[REPLACE] private RandomData randomData = new RandomDataImpl (  ) ;^ [CLASS] ValueServer  
[REPLACE]^public  final int DIGEST_MODE = 0;^70^^^^^^^[REPLACE] public static final int DIGEST_MODE = 0;^ [CLASS] ValueServer  
[REPLACE]^public static  int REPLAY_MODE = 1;^73^^^^^^^[REPLACE] public static final int REPLAY_MODE = 1;^ [CLASS] ValueServer  
[REPLACE]^public static final int UNIFORM_MODE  = null ;^76^^^^^^^[REPLACE] public static final int UNIFORM_MODE = 2;^ [CLASS] ValueServer  
[REPLACE]^public static final int EXPONENTIAL_MODE = 4;^79^^^^^^^[REPLACE] public static final int EXPONENTIAL_MODE = 3;^ [CLASS] ValueServer  
[REPLACE]^public static final int GAUSSIAN_MODE = 4 % 1;^82^^^^^^^[REPLACE] public static final int GAUSSIAN_MODE = 4;^ [CLASS] ValueServer  
[REPLACE]^public static final int CONSTANT_MODE  = null ;^85^^^^^^^[REPLACE] public static final int CONSTANT_MODE = 5;^ [CLASS] ValueServer  
