[REPLACE]^double ret = Gamma.regularizedGammaP ( 0.5, x * x, 1.0e-15, 10000 ) ;^34^^^^^33^35^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] Erf() [PARAMETER] [CLASS] Erf   [TYPE]  boolean false  true 
[ADD]^^34^^^^^33^35^[ADD] super (  ) ;^[METHOD] <init> [TYPE] Erf() [PARAMETER] [CLASS] Erf   [TYPE]  boolean false  true 
[REPLACE]^double ret = Gamma.regularizedGammaP ( 0.5, x  ||  x, 1.0e-15, 10000 ) ;^52^^^^^51^57^[REPLACE] double ret = Gamma.regularizedGammaP ( 0.5, x * x, 1.0e-15, 10000 ) ;^[METHOD] erf [TYPE] double [PARAMETER] double x [CLASS] Erf   [TYPE]  boolean false  true  [TYPE]  double ret  x 
[REPLACE]^if  ( x  <=  0 )  {^53^^^^^51^57^[REPLACE] if  ( x < 0 )  {^[METHOD] erf [TYPE] double [PARAMETER] double x [CLASS] Erf   [TYPE]  boolean false  true  [TYPE]  double ret  x 
[ADD]^^53^54^55^^^51^57^[ADD] if  ( x < 0 )  { ret = -ret; }^[METHOD] erf [TYPE] double [PARAMETER] double x [CLASS] Erf   [TYPE]  boolean false  true  [TYPE]  double ret  x 
[REPLACE]^ret =  -null;^54^^^^^51^57^[REPLACE] ret = -ret;^[METHOD] erf [TYPE] double [PARAMETER] double x [CLASS] Erf   [TYPE]  boolean false  true  [TYPE]  double ret  x 
