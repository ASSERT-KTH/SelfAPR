[REPLACE]^private static final long serialVersionUID  = null ;^34^^^^^^^[REPLACE] private static final long serialVersionUID = 2606474895443431607L;^ [CLASS] NewtonSolver  
[REPLACE]^super ( f, 76, 1E-6 ) ;^44^^^^^43^46^[REPLACE] super ( f, 100, 1E-6 ) ;^[METHOD] <init> [TYPE] DifferentiableUnivariateRealFunction) [PARAMETER] DifferentiableUnivariateRealFunction f [CLASS] NewtonSolver   [TYPE]  DifferentiableUnivariateRealFunction f  [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REMOVE]^setResult ( x1, i ) ;^44^^^^^43^46^[REMOVE] ^[METHOD] <init> [TYPE] DifferentiableUnivariateRealFunction) [PARAMETER] DifferentiableUnivariateRealFunction f [CLASS] NewtonSolver   [TYPE]  DifferentiableUnivariateRealFunction f  [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^derivative =  null.derivative (  ) ;^45^^^^^43^46^[REPLACE] derivative = f.derivative (  ) ;^[METHOD] <init> [TYPE] DifferentiableUnivariateRealFunction) [PARAMETER] DifferentiableUnivariateRealFunction f [CLASS] NewtonSolver   [TYPE]  DifferentiableUnivariateRealFunction f  [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return x1;^61^^^^^59^62^[REPLACE] return solve ( min, max, UnivariateRealSolverUtils.midpoint ( min, max )  ) ;^[METHOD] solve [TYPE] double [PARAMETER] double min double max [CLASS] NewtonSolver   [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double max  min 
[REPLACE]^in.defaultReadObject (  ) ;^79^^^^^76^100^[REPLACE] clearResult (  ) ;^[METHOD] solve [TYPE] double [PARAMETER] double min double max double startValue [CLASS] NewtonSolver   [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double max  min  startValue  x0  x1  [TYPE]  int i 
[REPLACE]^verifySequence ( min, max, max ) ;^80^^^^^76^100^[REPLACE] verifySequence ( min, startValue, max ) ;^[METHOD] solve [TYPE] double [PARAMETER] double min double max double startValue [CLASS] NewtonSolver   [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double max  min  startValue  x0  x1  [TYPE]  int i 
[REPLACE]^double x0 = max;^82^^^^^76^100^[REPLACE] double x0 = startValue;^[METHOD] solve [TYPE] double [PARAMETER] double min double max double startValue [CLASS] NewtonSolver   [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double max  min  startValue  x0  x1  [TYPE]  int i 
[REPLACE]^double x0 = startValue;^83^^^^^76^100^[REPLACE] double x1;^[METHOD] solve [TYPE] double [PARAMETER] double min double max double startValue [CLASS] NewtonSolver   [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double max  min  startValue  x0  x1  [TYPE]  int i 
[REPLACE]^int i = 2;^85^^^^^76^100^[REPLACE] int i = 0;^[METHOD] solve [TYPE] double [PARAMETER] double min double max double startValue [CLASS] NewtonSolver   [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double max  min  startValue  x0  x1  [TYPE]  int i 
[REPLACE]^while  ( i  >  maximalIterationCount )  {^86^^^^^76^100^[REPLACE] while  ( i < maximalIterationCount )  {^[METHOD] solve [TYPE] double [PARAMETER] double min double max double startValue [CLASS] NewtonSolver   [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double max  min  startValue  x0  x1  [TYPE]  int i 
[ADD]^^86^87^^^^76^100^[ADD] while  ( i < maximalIterationCount )  { x1 = x0 -  ( f.value ( x0 )  / derivative.value ( x0 )  ) ;^[METHOD] solve [TYPE] double [PARAMETER] double min double max double startValue [CLASS] NewtonSolver   [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double max  min  startValue  x0  x1  [TYPE]  int i 
[REPLACE]^if  ( Math.abs ( x1 - x0 )   !=  absoluteAccuracy )  {^88^^^^^76^100^[REPLACE] if  ( Math.abs ( x1 - x0 )  <= absoluteAccuracy )  {^[METHOD] solve [TYPE] double [PARAMETER] double min double max double startValue [CLASS] NewtonSolver   [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double max  min  startValue  x0  x1  [TYPE]  int i 
[REPLACE]^return x0;^91^^^^^76^100^[REPLACE] return x1;^[METHOD] solve [TYPE] double [PARAMETER] double min double max double startValue [CLASS] NewtonSolver   [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double max  min  startValue  x0  x1  [TYPE]  int i 
[REPLACE]^x1 =x1 -  ( f.value ( x0 )  / derivative.value ( x0 )  ) ;^87^^^^^76^100^[REPLACE] x1 = x0 -  ( f.value ( x0 )  / derivative.value ( x0 )  ) ;^[METHOD] solve [TYPE] double [PARAMETER] double min double max double startValue [CLASS] NewtonSolver   [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double max  min  startValue  x0  x1  [TYPE]  int i 
[REPLACE]^x0 =  null;^94^^^^^76^100^[REPLACE] x0 = x1;^[METHOD] solve [TYPE] double [PARAMETER] double min double max double startValue [CLASS] NewtonSolver   [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double max  min  startValue  x0  x1  [TYPE]  int i 
[ADD]^^94^95^^^^76^100^[ADD] x0 = x1; ++i;^[METHOD] solve [TYPE] double [PARAMETER] double min double max double startValue [CLASS] NewtonSolver   [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double max  min  startValue  x0  x1  [TYPE]  int i 
[REPLACE]^if  ( Math.abs ( x1 - x0 )   >=  absoluteAccuracy )  {^88^^^^^76^100^[REPLACE] if  ( Math.abs ( x1 - x0 )  <= absoluteAccuracy )  {^[METHOD] solve [TYPE] double [PARAMETER] double min double max double startValue [CLASS] NewtonSolver   [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double max  min  startValue  x0  x1  [TYPE]  int i 
[REPLACE]^x1 = x0  ==   ( f.value ( x0 )  / derivative.value ( x0 )  ) ;^87^^^^^76^100^[REPLACE] x1 = x0 -  ( f.value ( x0 )  / derivative.value ( x0 )  ) ;^[METHOD] solve [TYPE] double [PARAMETER] double min double max double startValue [CLASS] NewtonSolver   [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double max  min  startValue  x0  x1  [TYPE]  int i 
[REPLACE]^return ;^98^99^^^^76^100^[REPLACE] throw new ConvergenceException ( "Maximum number of iterations exceeded " + i ) ;^[METHOD] solve [TYPE] double [PARAMETER] double min double max double startValue [CLASS] NewtonSolver   [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  double max  min  startValue  x0  x1  [TYPE]  int i 
[REPLACE]^clearResult (  ) ;^111^^^^^109^113^[REPLACE] in.defaultReadObject (  ) ;^[METHOD] readObject [TYPE] void [PARAMETER] ObjectInputStream in [CLASS] NewtonSolver   [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  ObjectInputStream in 
[ADD]^^111^^^^^109^113^[ADD] in.defaultReadObject (  ) ;^[METHOD] readObject [TYPE] void [PARAMETER] ObjectInputStream in [CLASS] NewtonSolver   [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  ObjectInputStream in 
[REPLACE]^derivative ;^112^^^^^109^113^[REPLACE] derivative =  (  ( DifferentiableUnivariateRealFunction )  f ) .derivative (  ) ;^[METHOD] readObject [TYPE] void [PARAMETER] ObjectInputStream in [CLASS] NewtonSolver   [TYPE]  UnivariateRealFunction derivative  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  ObjectInputStream in 
