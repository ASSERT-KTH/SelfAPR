[REPLACE]^private static final long serialVersionUID = -1146319659338487221;^34^^^^^^^[REPLACE] private static final long serialVersionUID = -1146319659338487221L;^ [CLASS] AbstractIntegerDistribution  
[REPLACE]^double fl = Math.floor ( x ) ;^40^^^^^39^41^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] AbstractIntegerDistribution() [PARAMETER] [CLASS] AbstractIntegerDistribution   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return this.probability (  ( int )  x ) ;^59^^^^^58^60^[REPLACE] return cumulativeProbability (  ( int )  Math.floor ( x )  ) ;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] double x [CLASS] AbstractIntegerDistribution   [TYPE]  long serialVersionUID  [TYPE]  double x  [TYPE]  boolean false  true 
[REPLACE]^double fl =   x   ;^86^^^^^85^92^[REPLACE] double fl = Math.floor ( x ) ;^[METHOD] probability [TYPE] double [PARAMETER] double x [CLASS] AbstractIntegerDistribution   [TYPE]  long serialVersionUID  [TYPE]  double fl  x  [TYPE]  boolean false  true 
[ADD]^^86^^^^^85^92^[ADD] double fl = Math.floor ( x ) ;^[METHOD] probability [TYPE] double [PARAMETER] double x [CLASS] AbstractIntegerDistribution   [TYPE]  long serialVersionUID  [TYPE]  double fl  x  [TYPE]  boolean false  true 
[REPLACE]^if  ( fl  ||  x )  {^87^^^^^85^92^[REPLACE] if  ( fl == x )  {^[METHOD] probability [TYPE] double [PARAMETER] double x [CLASS] AbstractIntegerDistribution   [TYPE]  long serialVersionUID  [TYPE]  double fl  x  [TYPE]  boolean false  true 
[REPLACE]^return 1;^90^^^^^85^92^[REPLACE] return 0;^[METHOD] probability [TYPE] double [PARAMETER] double x [CLASS] AbstractIntegerDistribution   [TYPE]  long serialVersionUID  [TYPE]  double fl  x  [TYPE]  boolean false  true 
[REPLACE]^return this .cumulativeProbability ( this )  ;^88^^^^^85^92^[REPLACE] return this.probability (  ( int )  x ) ;^[METHOD] probability [TYPE] double [PARAMETER] double x [CLASS] AbstractIntegerDistribution   [TYPE]  long serialVersionUID  [TYPE]  double fl  x  [TYPE]  boolean false  true 
[REPLACE]^return this .cumulativeProbability ( false )  ;^88^^^^^85^92^[REPLACE] return this.probability (  ( int )  x ) ;^[METHOD] probability [TYPE] double [PARAMETER] double x [CLASS] AbstractIntegerDistribution   [TYPE]  long serialVersionUID  [TYPE]  double fl  x  [TYPE]  boolean false  true 
[REPLACE]^return x0;^90^^^^^85^92^[REPLACE] return 0;^[METHOD] probability [TYPE] double [PARAMETER] double x [CLASS] AbstractIntegerDistribution   [TYPE]  long serialVersionUID  [TYPE]  double fl  x  [TYPE]  boolean false  true 
[REPLACE]^if  ( x0  !=  x1 )  {^106^^^^^105^111^[REPLACE] if  ( x0 > x1 )  {^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] int x0 int x1 [CLASS] AbstractIntegerDistribution   [TYPE]  long serialVersionUID  [TYPE]  int x0  x1  [TYPE]  boolean false  true 
[REPLACE]^return ;^107^108^^^^105^111^[REPLACE] throw new IllegalArgumentException ( "lower endpoint must be less than or equal to upper endpoint" ) ;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] int x0 int x1 [CLASS] AbstractIntegerDistribution   [TYPE]  long serialVersionUID  [TYPE]  int x0  x1  [TYPE]  boolean false  true 
[ADD]^^107^108^^^^105^111^[ADD] throw new IllegalArgumentException ( "lower endpoint must be less than or equal to upper endpoint" ) ;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] int x0 int x1 [CLASS] AbstractIntegerDistribution   [TYPE]  long serialVersionUID  [TYPE]  int x0  x1  [TYPE]  boolean false  true 
[REPLACE]^return cumulativeProbability ( x0 )   ^  cumulativeProbability ( x0  ^  0 ) ;^110^^^^^105^111^[REPLACE] return cumulativeProbability ( x1 )  - cumulativeProbability ( x0 - 1 ) ;^[METHOD] cumulativeProbability [TYPE] double [PARAMETER] int x0 int x1 [CLASS] AbstractIntegerDistribution   [TYPE]  long serialVersionUID  [TYPE]  int x0  x1  [TYPE]  boolean false  true 
[REPLACE]^if  ( pm < 0.0D && p > 1.0 )  {^125^^^^^124^169^[REPLACE] if  ( p < 0.0 || p > 1.0 )  {^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REMOVE]^if  ( x0 > x1 )  {     throw new IllegalArgumentException ( "lower endpoint must be less than or equal to upper endpoint" ) ; }^125^^^^^124^169^[REMOVE] ^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^return ;^126^127^^^^124^169^[REPLACE] throw new IllegalArgumentException ( "p must be between 0 and 1.0  ( inclusive ) " ) ;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^throw new IllegalArgumentException ( "lower endpoint must be less than or equal to upper endpoint" ) ; ;^126^127^^^^124^169^[REPLACE] throw new IllegalArgumentException ( "p must be between 0 and 1.0  ( inclusive ) " ) ;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[ADD]^^126^127^^^^124^169^[ADD] throw new IllegalArgumentException ( "p must be between 0 and 1.0  ( inclusive ) " ) ;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^int x0 = getDomainLowerBound ( pm ) ;^132^^^^^124^169^[REPLACE] int x0 = getDomainLowerBound ( p ) ;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^int x1 = getDomainUpperBound ( pm ) ;^133^^^^^124^169^[REPLACE] int x1 = getDomainUpperBound ( p ) ;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^double fl = Math.floor ( x ) ;^134^^^^^124^169^[REPLACE] double pm;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^while  ( x0  == xm )  {^135^^^^^124^169^[REPLACE] while  ( x0 < x1 )  {^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^if  ( pm  <  p )  {^138^^^^^124^169^[REPLACE] if  ( pm > p )  {^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^if  ( xm  !=  x0 )  {^150^^^^^138^158^[REPLACE] if  ( xm == x0 )  {^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REMOVE]^if  ( xm == x1 )  {     --x1; }else {     x1 = xm; }^150^^^^^138^158^[REMOVE] ^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^x1 = xm; ;^156^^^^^138^158^[REPLACE] x0 = xm;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^if  (x0  &&  x1 )  {^140^^^^^124^169^[REPLACE] if  ( xm == x1 )  {^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^x0 = xm; ;^146^^^^^140^147^[REPLACE] x1 = xm;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^x0 = xm; ;^146^^^^^124^169^[REPLACE] x1 = xm;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[ADD]^^146^^^^^124^169^[ADD] x1 = xm;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^if  ( xm  &&  x0 )  {^140^^^^^124^169^[REPLACE] if  ( xm == x1 )  {^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[ADD]^^140^141^^143^^124^169^[ADD] if  ( xm == x1 )  {  --x1;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^if  ( xm  ||  x0 )  {^150^^^^^124^169^[REPLACE] if  ( xm == x0 )  {^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^x1 = xm; ;^156^^^^^150^157^[REPLACE] x0 = xm;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^pm = cumulativeProbability ( x0 ) ; ;^137^^^^^124^169^[REPLACE] pm = cumulativeProbability ( xm ) ;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[ADD]^^137^^^^^124^169^[ADD] pm = cumulativeProbability ( xm ) ;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^x1 = xm; ;^156^^^^^124^169^[REPLACE] x0 = xm;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[ADD]^^156^^^^^124^169^[ADD] x0 = xm;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^int xm = xm +  ( x1 - x0 )  / 2;^136^^^^^124^169^[REPLACE] int xm = x0 +  ( x1 - x0 )  / 2;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^if  ( pm  >=  p )  {^138^^^^^124^169^[REPLACE] if  ( pm > p )  {^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[ADD]^^138^139^140^^^124^169^[ADD] if  ( pm > p )  {  if  ( xm == x1 )  {^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^if  ( xm  !=  x1 )  {^150^^^^^138^158^[REPLACE] if  ( xm == x0 )  {^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^if  ( xm  &&  x1 )  {^140^^^^^124^169^[REPLACE] if  ( xm == x1 )  {^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REMOVE]^if  ( xm == x0 )  {     ++x0; }else {     x0 = xm; }^140^^^^^124^169^[REMOVE] ^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^if  ( xm  && x1 )  {^150^^^^^124^169^[REPLACE] if  ( xm == x0 )  {^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^int xm =xm +  ( x1 - x0 )  / 2;^136^^^^^124^169^[REPLACE] int xm = x0 +  ( x1 - x0 )  / 2;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^pm = cumulativeProbability ( xm ) ; ;^162^^^^^124^169^[REPLACE] pm = cumulativeProbability ( x0 ) ;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^while  ( pm  >=  p )  {^163^^^^^124^169^[REPLACE] while  ( pm > p )  {^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^pm = cumulativeProbability ( xm ) ; ;^165^^^^^124^169^[REPLACE] pm = cumulativeProbability ( x0 ) ;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
[REPLACE]^return xm;^168^^^^^124^169^[REPLACE] return x0;^[METHOD] inverseCumulativeProbability [TYPE] int [PARAMETER] final double p [CLASS] AbstractIntegerDistribution   [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double p  pm  [TYPE]  int x0  x1  xm 
