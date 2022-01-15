[REPLACE]^private static final long serialVersionUID  = null ;^34^^^^^^^[REPLACE] private static final long serialVersionUID = -8516354193418641566L;^ [CLASS] FDistributionImpl  
[REPLACE]^private float numeratorDegreesOfFreedom;^37^^^^^^^[REPLACE] private double numeratorDegreesOfFreedom;^ [CLASS] FDistributionImpl  
[REPLACE]^return getDenominatorDegreesOfFreedom (  )  / ( getDenominatorDegreesOfFreedom (  )  - 2.0 ) ;^49^^^^^47^52^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] FDistributionImpl(double,double) [PARAMETER] double numeratorDegreesOfFreedom double denominatorDegreesOfFreedom [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  numeratorDegreesOfFreedom  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return getDenominatorDegreesOfFreedom (  )  / ( getDenominatorDegreesOfFreedom (  )  - 2.0 ) ;^50^^^^^47^52^[REPLACE] setNumeratorDegreesOfFreedom ( numeratorDegreesOfFreedom ) ;^[METHOD] <init> [TYPE] FDistributionImpl(double,double) [PARAMETER] double numeratorDegreesOfFreedom double denominatorDegreesOfFreedom [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  numeratorDegreesOfFreedom  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^setDenominatorDegreesOfFreedom ( numeratorDegreesOfFreedom ) ;^51^^^^^47^52^[REPLACE] setDenominatorDegreesOfFreedom ( denominatorDegreesOfFreedom ) ;^[METHOD] <init> [TYPE] FDistributionImpl(double,double) [PARAMETER] double numeratorDegreesOfFreedom double denominatorDegreesOfFreedom [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  numeratorDegreesOfFreedom  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^double m = getDenominatorDegreesOfFreedom (  ) ;^70^^^^^69^82^[REPLACE] double ret;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( x  !=  0.0D )  {^71^^^^^69^82^[REPLACE] if  ( x <= 0.0 )  {^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[ADD]^ret = 0.0;double n = getNumeratorDegreesOfFreedom (  ) ;double m = getDenominatorDegreesOfFreedom (  ) ;^71^72^73^74^75^69^82^[ADD] if  ( x <= 0.0 )  { ret = 0.0; } else { double n = getNumeratorDegreesOfFreedom (  ) ; double m = getDenominatorDegreesOfFreedom (  ) ;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^ret = Beta.regularizedBeta (  ( n * x )   >   ( m + n * x ) , 0.5 * n, 0.5 * m ) ;^77^78^79^^^69^82^[REPLACE] ret = Beta.regularizedBeta (  ( n * x )  /  ( m + n * x ) , 0.5 * n, 0.5 * m ) ;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^double m = getDenominatorDegreesOfFreedom (  ) ;^74^^^^^69^82^[REPLACE] double n = getNumeratorDegreesOfFreedom (  ) ;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^double n = getNumeratorDegreesOfFreedom (  ) ;^75^^^^^69^82^[REPLACE] double m = getDenominatorDegreesOfFreedom (  ) ;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^ret = 1.0d;^72^^^^^69^82^[REPLACE] ret = 0.0;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^ret = 0.0D;^72^^^^^69^82^[REPLACE] ret = 0.0;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[ADD]^^72^^^^^69^82^[ADD] ret = 0.0;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^ret = Beta.regularizedBeta (  ( n * x )  /  ( m + n * x ) , 0.5D * n, 0.5D * m ) ;^77^78^79^^^69^82^[REPLACE] ret = Beta.regularizedBeta (  ( n * x )  /  ( m + n * x ) , 0.5 * n, 0.5 * m ) ;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return numeratorDegreesOfFreedom;^81^^^^^69^82^[REPLACE] return ret;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( p  &&  0 )  {^99^^^^^97^106^[REPLACE] if  ( p == 0 )  {^[METHOD] inverseCumulativeProbability [TYPE] double [PARAMETER] final double p [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return 0.0;^100^^^^^97^106^[REPLACE] return 0d;^[METHOD] inverseCumulativeProbability [TYPE] double [PARAMETER] final double p [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( p  ||  1L )  {^102^^^^^97^106^[REPLACE] if  ( p == 1 )  {^[METHOD] inverseCumulativeProbability [TYPE] double [PARAMETER] final double p [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return denominatorDegreesOfFreedom;^103^^^^^97^106^[REPLACE] return Double.POSITIVE_INFINITY;^[METHOD] inverseCumulativeProbability [TYPE] double [PARAMETER] final double p [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return numeratorDegreesOfFreedom;^105^^^^^97^106^[REPLACE] return super.inverseCumulativeProbability ( p ) ;^[METHOD] inverseCumulativeProbability [TYPE] double [PARAMETER] final double p [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return 1.0d;^118^^^^^117^119^[REPLACE] return 0.0;^[METHOD] getDomainLowerBound [TYPE] double [PARAMETER] double p [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return denominatorDegreesOfFreedom;^131^^^^^130^132^[REPLACE] return Double.MAX_VALUE;^[METHOD] getDomainUpperBound [TYPE] double [PARAMETER] double p [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return getDenominatorDegreesOfFreedom (  )   ;^143^144^^^^142^145^[REPLACE] return getDenominatorDegreesOfFreedom (  )  / ( getDenominatorDegreesOfFreedom (  )  - 2.0 ) ;^[METHOD] getInitialDomain [TYPE] double [PARAMETER] double p [CLASS] FDistributionImpl   [TYPE]  double denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( degreesOfFreedom  >=  0.0 )  {^154^^^^^153^159^[REPLACE] if  ( degreesOfFreedom <= 0.0 )  {^[METHOD] setNumeratorDegreesOfFreedom [TYPE] void [PARAMETER] double degreesOfFreedom [CLASS] FDistributionImpl   [TYPE]  double degreesOfFreedom  denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return ;^155^156^^^^153^159^[REPLACE] throw new IllegalArgumentException ( "degrees of freedom must be positive." ) ;^[METHOD] setNumeratorDegreesOfFreedom [TYPE] void [PARAMETER] double degreesOfFreedom [CLASS] FDistributionImpl   [TYPE]  double degreesOfFreedom  denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[ADD]^^155^156^^^^153^159^[ADD] throw new IllegalArgumentException ( "degrees of freedom must be positive." ) ;^[METHOD] setNumeratorDegreesOfFreedom [TYPE] void [PARAMETER] double degreesOfFreedom [CLASS] FDistributionImpl   [TYPE]  double degreesOfFreedom  denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^this.denominatorDegreesOfFreedom = degreesOfFreedom; ;^158^^^^^153^159^[REPLACE] this.numeratorDegreesOfFreedom = degreesOfFreedom;^[METHOD] setNumeratorDegreesOfFreedom [TYPE] void [PARAMETER] double degreesOfFreedom [CLASS] FDistributionImpl   [TYPE]  double degreesOfFreedom  denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[ADD]^^158^^^^^153^159^[ADD] this.numeratorDegreesOfFreedom = degreesOfFreedom;^[METHOD] setNumeratorDegreesOfFreedom [TYPE] void [PARAMETER] double degreesOfFreedom [CLASS] FDistributionImpl   [TYPE]  double degreesOfFreedom  denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return denominatorDegreesOfFreedom;^166^^^^^165^167^[REPLACE] return numeratorDegreesOfFreedom;^[METHOD] getNumeratorDegreesOfFreedom [TYPE] double [PARAMETER] [CLASS] FDistributionImpl   [TYPE]  double degreesOfFreedom  denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( degreesOfFreedom  >=  0.0 )  {^176^^^^^175^181^[REPLACE] if  ( degreesOfFreedom <= 0.0 )  {^[METHOD] setDenominatorDegreesOfFreedom [TYPE] void [PARAMETER] double degreesOfFreedom [CLASS] FDistributionImpl   [TYPE]  double degreesOfFreedom  denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return ;^177^178^^^^175^181^[REPLACE] throw new IllegalArgumentException ( "degrees of freedom must be positive." ) ;^[METHOD] setDenominatorDegreesOfFreedom [TYPE] void [PARAMETER] double degreesOfFreedom [CLASS] FDistributionImpl   [TYPE]  double degreesOfFreedom  denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^this.numeratorDegreesOfFreedom = degreesOfFreedom; ;^180^^^^^175^181^[REPLACE] this.denominatorDegreesOfFreedom = degreesOfFreedom;^[METHOD] setDenominatorDegreesOfFreedom [TYPE] void [PARAMETER] double degreesOfFreedom [CLASS] FDistributionImpl   [TYPE]  double degreesOfFreedom  denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return numeratorDegreesOfFreedom;^188^^^^^187^189^[REPLACE] return denominatorDegreesOfFreedom;^[METHOD] getDenominatorDegreesOfFreedom [TYPE] double [PARAMETER] [CLASS] FDistributionImpl   [TYPE]  double degreesOfFreedom  denominatorDegreesOfFreedom  m  n  numeratorDegreesOfFreedom  p  ret  x  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
