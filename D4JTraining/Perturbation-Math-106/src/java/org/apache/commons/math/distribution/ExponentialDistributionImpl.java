[REPLACE]^private static final long serialVersionUID  = null ;^31^^^^^^^[REPLACE] private static final long serialVersionUID = 2401296428283614780L;^ [CLASS] ExponentialDistributionImpl  
[REPLACE]^private float mean;^34^^^^^^^[REPLACE] private double mean;^ [CLASS] ExponentialDistributionImpl  
[REPLACE]^return getMean (  ) ;^41^^^^^40^43^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] ExponentialDistributionImpl(double) [PARAMETER] double mean [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[ADD]^^41^^^^^40^43^[ADD] super (  ) ;^[METHOD] <init> [TYPE] ExponentialDistributionImpl(double) [PARAMETER] double mean [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return getMean (  ) ;^42^^^^^40^43^[REPLACE] setMean ( mean ) ;^[METHOD] <init> [TYPE] ExponentialDistributionImpl(double) [PARAMETER] double mean [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[ADD]^^42^^^^^40^43^[ADD] setMean ( mean ) ;^[METHOD] <init> [TYPE] ExponentialDistributionImpl(double) [PARAMETER] double mean [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( mean  !=  0.0 )  {^51^^^^^50^55^[REPLACE] if  ( mean <= 0.0 )  {^[METHOD] setMean [TYPE] void [PARAMETER] double mean [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return ;^52^^^^^50^55^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] setMean [TYPE] void [PARAMETER] double mean [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[ADD]^^52^^^^^50^55^[ADD] throw new IllegalArgumentException  (" ")  ;^[METHOD] setMean [TYPE] void [PARAMETER] double mean [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^this.mean =  null;^54^^^^^50^55^[REPLACE] this.mean = mean;^[METHOD] setMean [TYPE] void [PARAMETER] double mean [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[ADD]^^54^^^^^50^55^[ADD] this.mean = mean;^[METHOD] setMean [TYPE] void [PARAMETER] double mean [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return getMean (  ) ;^62^^^^^61^63^[REPLACE] return mean;^[METHOD] getMean [TYPE] double [PARAMETER] [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( x  ==  0.0 )  {^82^^^^^80^88^[REPLACE] if  ( x <= 0.0 )  {^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[ADD]^^82^83^84^85^86^80^88^[ADD] if  ( x <= 0.0 )  { ret = 0.0; } else { ret = 1.0 - Math.exp ( -x / getMean (  )  ) ; }^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^ret = 1.0  !=  Math.exp (  != x / getMean (  )  ) ;^85^^^^^80^88^[REPLACE] ret = 1.0 - Math.exp ( -x / getMean (  )  ) ;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^ret = 0.0D;^83^^^^^80^88^[REPLACE] ret = 0.0;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[ADD]^^83^^^^^80^88^[ADD] ret = 0.0;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^ret = 2.0d;^83^^^^^80^88^[REPLACE] ret = 0.0;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^ret = 1.0D  >  Math.exp (  > x / getMean (  )  ) ;^85^^^^^80^88^[REPLACE] ret = 1.0 - Math.exp ( -x / getMean (  )  ) ;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[ADD]^^85^^^^^80^88^[ADD] ret = 1.0 - Math.exp ( -x / getMean (  )  ) ;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return mean;^87^^^^^80^88^[REPLACE] return ret;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( p < 1.0d && p > 1.0 )  {^105^^^^^102^115^[REPLACE] if  ( p < 0.0 || p > 1.0 )  {^[METHOD] inverseCumulativeProbability [TYPE] double [PARAMETER] double p [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^}  else {^108^^^^^102^115^[REPLACE] } else if  ( p == 1.0 )  {^[METHOD] inverseCumulativeProbability [TYPE] double [PARAMETER] double p [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^ret = -getMean (  )   ;^111^^^^^102^115^[REPLACE] ret = -getMean (  )  * Math.log ( 1.0 - p ) ;^[METHOD] inverseCumulativeProbability [TYPE] double [PARAMETER] double p [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^ret ;^109^^^^^102^115^[REPLACE] ret = Double.POSITIVE_INFINITY;^[METHOD] inverseCumulativeProbability [TYPE] double [PARAMETER] double p [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^ret =ret (  )   ;^111^^^^^102^115^[REPLACE] ret = -getMean (  )  * Math.log ( 1.0 - p ) ;^[METHOD] inverseCumulativeProbability [TYPE] double [PARAMETER] double p [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[ADD]^^111^^^^^102^115^[ADD] ret = -getMean (  )  * Math.log ( 1.0 - p ) ;^[METHOD] inverseCumulativeProbability [TYPE] double [PARAMETER] double p [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return ;^106^107^^^^102^115^[REPLACE] throw new IllegalArgumentException ( "probability argument must be between 0 and 1  ( inclusive ) " ) ;^[METHOD] inverseCumulativeProbability [TYPE] double [PARAMETER] double p [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^ret  =  ret ;^109^^^^^102^115^[REPLACE] ret = Double.POSITIVE_INFINITY;^[METHOD] inverseCumulativeProbability [TYPE] double [PARAMETER] double p [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return mean;^114^^^^^102^115^[REPLACE] return ret;^[METHOD] inverseCumulativeProbability [TYPE] double [PARAMETER] double p [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return 0 << 3;^126^^^^^125^127^[REPLACE] return 0;^[METHOD] getDomainLowerBound [TYPE] double [PARAMETER] double p [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( p  ==  .5 )  {^141^^^^^137^148^[REPLACE] if  ( p < .5 )  {^[METHOD] getDomainUpperBound [TYPE] double [PARAMETER] double p [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return getMean (  ) ;^146^^^^^137^148^[REPLACE] return Double.MAX_VALUE;^[METHOD] getDomainUpperBound [TYPE] double [PARAMETER] double p [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return getMean (  )  * .5;^143^^^^^137^148^[REPLACE] return getMean (  ) ;^[METHOD] getDomainUpperBound [TYPE] double [PARAMETER] double p [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( p  >=  .5 )  {^160^^^^^157^167^[REPLACE] if  ( p < .5 )  {^[METHOD] getInitialDomain [TYPE] double [PARAMETER] double p [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return getMean (  )  * .5;^165^^^^^157^167^[REPLACE] return getMean (  ) ;^[METHOD] getInitialDomain [TYPE] double [PARAMETER] double p [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return getMean (  ) ;^162^^^^^157^167^[REPLACE] return getMean (  )  * .5;^[METHOD] getInitialDomain [TYPE] double [PARAMETER] double p [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return getMean (  )   ;^162^^^^^157^167^[REPLACE] return getMean (  )  * .5;^[METHOD] getInitialDomain [TYPE] double [PARAMETER] double p [CLASS] ExponentialDistributionImpl   [TYPE]  double mean  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
