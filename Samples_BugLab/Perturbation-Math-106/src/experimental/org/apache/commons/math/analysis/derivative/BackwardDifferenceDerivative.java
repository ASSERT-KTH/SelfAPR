[buglab_swap_variables]^super ( h, function ) ;^34^^^^^33^35^super ( function, h ) ;^[CLASS] BackwardDifferenceDerivative  [METHOD] <init> [RETURN_TYPE] UnivariateRealFunction,double)   UnivariateRealFunction function double h [VARIABLES] boolean  double  h  UnivariateRealFunction  function  
[buglab_swap_variables]^super (  h ) ;^34^^^^^33^35^super ( function, h ) ;^[CLASS] BackwardDifferenceDerivative  [METHOD] <init> [RETURN_TYPE] UnivariateRealFunction,double)   UnivariateRealFunction function double h [VARIABLES] boolean  double  h  UnivariateRealFunction  function  
[buglab_swap_variables]^super ( function ) ;^34^^^^^33^35^super ( function, h ) ;^[CLASS] BackwardDifferenceDerivative  [METHOD] <init> [RETURN_TYPE] UnivariateRealFunction,double)   UnivariateRealFunction function double h [VARIABLES] boolean  double  h  UnivariateRealFunction  function  
[buglab_swap_variables]^return  ( h.value ( x )  - f.value ( x - f )  )  / h;^43^^^^^40^44^return  ( f.value ( x )  - f.value ( x - h )  )  / h;^[CLASS] BackwardDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  x  UnivariateRealFunction  f  
[buglab_swap_variables]^return  ( x.value ( f )  - f.value ( x - h )  )  / h;^43^^^^^40^44^return  ( f.value ( x )  - f.value ( x - h )  )  / h;^[CLASS] BackwardDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  x  UnivariateRealFunction  f  
[buglab_swap_variables]^return  ( f.value ( h )  - f.value ( x - x )  )  / h;^43^^^^^40^44^return  ( f.value ( x )  - f.value ( x - h )  )  / h;^[CLASS] BackwardDifferenceDerivative  [METHOD] value [RETURN_TYPE] double   double x [VARIABLES] boolean  double  h  x  UnivariateRealFunction  f  
[buglab_swap_variables]^return new BackwardDifferenceDerivative ( h, function ) ;^50^^^^^49^51^return new BackwardDifferenceDerivative ( function, h ) ;^[CLASS] BackwardDifferenceDerivative  [METHOD] decorate [RETURN_TYPE] UnivariateRealFunction   UnivariateRealFunction function double h [VARIABLES] boolean  double  h  UnivariateRealFunction  function  
[buglab_swap_variables]^return new BackwardDifferenceDerivative (  h ) ;^50^^^^^49^51^return new BackwardDifferenceDerivative ( function, h ) ;^[CLASS] BackwardDifferenceDerivative  [METHOD] decorate [RETURN_TYPE] UnivariateRealFunction   UnivariateRealFunction function double h [VARIABLES] boolean  double  h  UnivariateRealFunction  function  
[buglab_swap_variables]^return new BackwardDifferenceDerivative ( function ) ;^50^^^^^49^51^return new BackwardDifferenceDerivative ( function, h ) ;^[CLASS] BackwardDifferenceDerivative  [METHOD] decorate [RETURN_TYPE] UnivariateRealFunction   UnivariateRealFunction function double h [VARIABLES] boolean  double  h  UnivariateRealFunction  function  
