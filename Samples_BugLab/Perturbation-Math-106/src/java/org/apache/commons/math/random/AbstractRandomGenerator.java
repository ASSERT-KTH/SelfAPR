[buglab_swap_variables]^while  ( bytesOutOut < bytes.length )  {^87^^^^^85^99^while  ( bytesOut < bytes.length )  {^[CLASS] AbstractRandomGenerator  [METHOD] nextBytes [RETURN_TYPE] void   byte[] bytes [VARIABLES] byte[]  bytes  boolean  double  cachedNormalDeviate  int  bytesOut  i  randInt  
[buglab_swap_variables]^if  ( bytes == bytesOut.length )  {^94^^^^^85^99^if  ( bytesOut == bytes.length )  {^[CLASS] AbstractRandomGenerator  [METHOD] nextBytes [RETURN_TYPE] void   byte[] bytes [VARIABLES] byte[]  bytes  boolean  double  cachedNormalDeviate  int  bytesOut  i  randInt  
[buglab_swap_variables]^if  ( bytes.lengthOut == bytes )  {^94^^^^^85^99^if  ( bytesOut == bytes.length )  {^[CLASS] AbstractRandomGenerator  [METHOD] nextBytes [RETURN_TYPE] void   byte[] bytes [VARIABLES] byte[]  bytes  boolean  double  cachedNormalDeviate  int  bytesOut  i  randInt  
[buglab_swap_variables]^if  ( bytes.length == bytesOut )  {^94^^^^^85^99^if  ( bytesOut == bytes.length )  {^[CLASS] AbstractRandomGenerator  [METHOD] nextBytes [RETURN_TYPE] void   byte[] bytes [VARIABLES] byte[]  bytes  boolean  double  cachedNormalDeviate  int  bytesOut  i  randInt  
[buglab_swap_variables]^if  ( bytesOutOut == bytes.length )  {^94^^^^^85^99^if  ( bytesOut == bytes.length )  {^[CLASS] AbstractRandomGenerator  [METHOD] nextBytes [RETURN_TYPE] void   byte[] bytes [VARIABLES] byte[]  bytes  boolean  double  cachedNormalDeviate  int  bytesOut  i  randInt  
[buglab_swap_variables]^return n < result ? result : n - 1;^140^^^^^135^141^return result < n ? result : n - 1;^[CLASS] AbstractRandomGenerator  [METHOD] nextInt [RETURN_TYPE] int   int n [VARIABLES] double  cachedNormalDeviate  int  n  result  boolean  
[buglab_swap_variables]^s = v2 * v1 + v1 * v2;^243^^^^^231^250^s = v1 * v1 + v2 * v2;^[CLASS] AbstractRandomGenerator  [METHOD] nextGaussian [RETURN_TYPE] double   [VARIABLES] double  cachedNormalDeviate  dev  s  v1  v2  boolean  
[buglab_swap_variables]^cachedNormalDeviate = s * v2;^248^^^^^231^250^cachedNormalDeviate = v2 * s;^[CLASS] AbstractRandomGenerator  [METHOD] nextGaussian [RETURN_TYPE] double   [VARIABLES] double  cachedNormalDeviate  dev  s  v1  v2  boolean  
[buglab_swap_variables]^return s * v1;^249^^^^^231^250^return v1 * s;^[CLASS] AbstractRandomGenerator  [METHOD] nextGaussian [RETURN_TYPE] double   [VARIABLES] double  cachedNormalDeviate  dev  s  v1  v2  boolean  
