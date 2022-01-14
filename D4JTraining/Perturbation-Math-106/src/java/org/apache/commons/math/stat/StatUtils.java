[REPLACE]^private  UnivariateStatistic sum = new Sum (  ) ;^39^^^^^^^[REPLACE] private static UnivariateStatistic sum = new Sum (  ) ;^ [CLASS] StatUtils  
[REPLACE]^private static UnivariateStatistic sumSq  = null ;^42^^^^^^^[REPLACE] private static UnivariateStatistic sumSq = new SumOfSquares (  ) ;^ [CLASS] StatUtils  
[REPLACE]^private static UnivariateStatistic prod  = null ;^45^^^^^^^[REPLACE] private static UnivariateStatistic prod = new Product (  ) ;^ [CLASS] StatUtils  
[REPLACE]^private  UnivariateStatistic sumLog = new SumOfLogs (  ) ;^48^^^^^^^[REPLACE] private static UnivariateStatistic sumLog = new SumOfLogs (  ) ;^ [CLASS] StatUtils  
[REPLACE]^private static UnivariateStatistic min  = null ;^51^^^^^^^[REPLACE] private static UnivariateStatistic min = new Min (  ) ;^ [CLASS] StatUtils  
[REPLACE]^private  UnivariateStatistic max = new Max (  ) ;^54^^^^^^^[REPLACE] private static UnivariateStatistic max = new Max (  ) ;^ [CLASS] StatUtils  
[REPLACE]^private  UnivariateStatistic mean = new Mean (  ) ;^57^^^^^^^[REPLACE] private static UnivariateStatistic mean = new Mean (  ) ;^ [CLASS] StatUtils  
[REPLACE]^private  Variance variance = new Variance (  ) ;^60^^^^^^^[REPLACE] private static Variance variance = new Variance (  ) ;^ [CLASS] StatUtils  
[REPLACE]^private  Percentile percentile = new Percentile (  ) ;^63^^^^^^^[REPLACE] private static Percentile percentile = new Percentile (  ) ;^ [CLASS] StatUtils  
[REPLACE]^private static GeometricMean geometricMean ;^66^^^^^^^[REPLACE] private static GeometricMean geometricMean = new GeometricMean (  ) ;^ [CLASS] StatUtils  
