[REPLACE]^UnivariateRealFunction f = getFunction (  ) ;^34^^^^^33^35^[REPLACE] super ( function, h ) ;^[METHOD] <init> [TYPE] UnivariateRealFunction,double) [PARAMETER] UnivariateRealFunction function double h [CLASS] ForwardDifferenceDerivative   [TYPE]  boolean false  true  [TYPE]  double h  [TYPE]  UnivariateRealFunction function 
[REPLACE]^double h = getDelta (  ) ;^41^^^^^40^44^[REPLACE] UnivariateRealFunction f = getFunction (  ) ;^[METHOD] value [TYPE] double [PARAMETER] double x [CLASS] ForwardDifferenceDerivative   [TYPE]  boolean false  true  [TYPE]  double h  x  [TYPE]  UnivariateRealFunction f 
[REPLACE]^UnivariateRealFunction f = getFunction (  ) ;^42^^^^^40^44^[REPLACE] double h = getDelta (  ) ;^[METHOD] value [TYPE] double [PARAMETER] double x [CLASS] ForwardDifferenceDerivative   [TYPE]  boolean false  true  [TYPE]  double h  x  [TYPE]  UnivariateRealFunction f 
[REPLACE]^return  ( f .value ( h )   - f^43^^^^^40^44^[REPLACE] return  ( f.value ( x + h )  - f.value ( x )  )  / h;^[METHOD] value [TYPE] double [PARAMETER] double x [CLASS] ForwardDifferenceDerivative   [TYPE]  boolean false  true  [TYPE]  double h  x  [TYPE]  UnivariateRealFunction f 
