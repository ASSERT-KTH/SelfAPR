[buglab_swap_variables]^return Math.pow ( getMean (  )  )  / MathUtils.factorialDouble ( x )  * Math.exp ( -mean ) ;^88^89^^^^84^90^return Math.pow ( getMean (  ) , x )  / MathUtils.factorialDouble ( x )  * Math.exp ( -mean ) ;^[CLASS] PoissonDistributionImpl  [METHOD] probability [RETURN_TYPE] double   int x [VARIABLES] boolean  double  mean  p  long  serialVersionUID  int  x  
[buglab_swap_variables]^return Gamma.regularizedGammaQ (  ( double ) x + 1,  1E-12, Integer.MAX_VALUE ) ;^107^108^^^^100^109^return Gamma.regularizedGammaQ (  ( double ) x + 1, mean, 1E-12, Integer.MAX_VALUE ) ;^[CLASS] PoissonDistributionImpl  [METHOD] cumulativeProbability [RETURN_TYPE] double   int x [VARIABLES] boolean  double  mean  p  long  serialVersionUID  int  x  
[buglab_swap_variables]^return x.cumulativeProbability ( normal + 0.5 ) ;^129^^^^^123^130^return normal.cumulativeProbability ( x + 0.5 ) ;^[CLASS] PoissonDistributionImpl  [METHOD] normalApproximateProbability [RETURN_TYPE] double   int x [VARIABLES] boolean  NormalDistribution  normal  double  mean  p  long  serialVersionUID  int  x  
