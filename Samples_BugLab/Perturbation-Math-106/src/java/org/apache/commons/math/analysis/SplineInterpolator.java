[buglab_swap_variables]^if  ( y.length != x.length )  {^52^^^^^37^67^if  ( x.length != y.length )  {^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^if  ( x.length.length < 3 )  {^56^^^^^41^71^if  ( x.length < 3 )  {^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^if  ( x < 3 )  {^56^^^^^41^71^if  ( x.length < 3 )  {^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^int n = x.length.length - 1;^62^^^^^47^77^int n = x.length - 1;^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^int n = x - 1;^62^^^^^47^77^int n = x.length - 1;^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^for  ( nnt i = 0; i < i; i++ )  {^64^^^^^49^79^for  ( int i = 0; i < n; i++ )  {^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^for  ( nnt i = 0; i < i; i++ )  {^72^^^^^57^87^for  ( int i = 0; i < n; i++ )  {^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^for  ( nnt i = 1; i < i; i++ )  {^81^^^^^66^96^for  ( int i = 1; i < n; i++ )  {^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^g = 2d *  ( mu[i+1]  - x[i - 1] )  - h[i - 1] * x[i -1];^82^^^^^67^97^g = 2d *  ( x[i+1]  - x[i - 1] )  - h[i - 1] * mu[i -1];^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^g = 2d *  ( x[i+1]  - x[i - 1] )  - mu[i - 1] * h[i -1];^82^^^^^67^97^g = 2d *  ( x[i+1]  - x[i - 1] )  - h[i - 1] * mu[i -1];^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^z[i] =  ( 3d *  ( y[i + 1] * z[i - 1] - y[i] *  ( x[i + 1] - x[i - 1] ) + y[i - 1] * h[i] )  / ( h[i - 1] * h[i] )  - h[i - 1] * h[i - 1] )  / g;^84^85^^^^69^99^z[i] =  ( 3d *  ( y[i + 1] * h[i - 1] - y[i] *  ( x[i + 1] - x[i - 1] ) + y[i - 1] * h[i] )  / ( h[i - 1] * h[i] )  - h[i - 1] * z[i - 1] )  / g;^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^z[i] =  ( 3d *  ( z[i + 1] * h[i - 1] - y[i] *  ( x[i + 1] - x[i - 1] ) + y[i - 1] * h[i] )  / ( h[i - 1] * h[i] )  - h[i - 1] * y[i - 1] )  / g;^84^85^^^^69^99^z[i] =  ( 3d *  ( y[i + 1] * h[i - 1] - y[i] *  ( x[i + 1] - x[i - 1] ) + y[i - 1] * h[i] )  / ( h[i - 1] * h[i] )  - h[i - 1] * z[i - 1] )  / g;^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^z[i] =  ( 3d *  ( h[i + 1] * y[i - 1] - y[i] *  ( x[i + 1] - x[i - 1] ) + y[i - 1] * h[i] )  / ( h[i - 1] * h[i] )  - h[i - 1] * z[i - 1] )  / g;^84^85^^^^69^99^z[i] =  ( 3d *  ( y[i + 1] * h[i - 1] - y[i] *  ( x[i + 1] - x[i - 1] ) + y[i - 1] * h[i] )  / ( h[i - 1] * h[i] )  - h[i - 1] * z[i - 1] )  / g;^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^z[i] =  ( 3d *  ( y[i + 1] * x[i - 1] - y[i] *  ( h[i + 1] - x[i - 1] ) + y[i - 1] * h[i] )  / ( h[i - 1] * h[i] )  - h[i - 1] * z[i - 1] )  / g;^84^85^^^^69^99^z[i] =  ( 3d *  ( y[i + 1] * h[i - 1] - y[i] *  ( x[i + 1] - x[i - 1] ) + y[i - 1] * h[i] )  / ( h[i - 1] * h[i] )  - h[i - 1] * z[i - 1] )  / g;^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^g = 2d *  ( h[i+1]  - x[i - 1] )  - x[i - 1] * mu[i -1];^82^^^^^67^97^g = 2d *  ( x[i+1]  - x[i - 1] )  - h[i - 1] * mu[i -1];^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^mu[i] = g[i] / h;^83^^^^^68^98^mu[i] = h[i] / g;^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^z[i] =  ( 3d *  ( y[i + 1] * h[i - 1] - y[i] *  ( z[i + 1] - x[i - 1] ) + y[i - 1] * h[i] )  / ( h[i - 1] * h[i] )  - h[i - 1] * x[i - 1] )  / g;^84^85^^^^69^99^z[i] =  ( 3d *  ( y[i + 1] * h[i - 1] - y[i] *  ( x[i + 1] - x[i - 1] ) + y[i - 1] * h[i] )  / ( h[i - 1] * h[i] )  - h[i - 1] * z[i - 1] )  / g;^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^for  ( int n = j -1; j >=0; j-- )  {^96^^^^^81^111^for  ( int j = n -1; j >=0; j-- )  {^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^c[j] = c[j] - mu[j] * z[j + 1];^97^^^^^82^112^c[j] = z[j] - mu[j] * c[j + 1];^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^c[j] = mu[j] - z[j] * c[j + 1];^97^^^^^82^112^c[j] = z[j] - mu[j] * c[j + 1];^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^b[j] =  ( h[j + 1] - y[j] )  / y[j] - h[j] *  ( c[j + 1] + 2d * c[j] )  / 3d;^98^^^^^83^113^b[j] =  ( y[j + 1] - y[j] )  / h[j] - h[j] *  ( c[j + 1] + 2d * c[j] )  / 3d;^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^d[j] =  ( h[j + 1] - c[j] )  /  ( 3d * c[j] ) ;^99^^^^^84^114^d[j] =  ( c[j + 1] - c[j] )  /  ( 3d * h[j] ) ;^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^c[j] = z[j] - c[j] * mu[j + 1];^97^^^^^82^112^c[j] = z[j] - mu[j] * c[j + 1];^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^b[j] =  ( y[j + 1] - y[j] )  / c[j] - h[j] *  ( h[j + 1] + 2d * c[j] )  / 3d;^98^^^^^83^113^b[j] =  ( y[j + 1] - y[j] )  / h[j] - h[j] *  ( c[j + 1] + 2d * c[j] )  / 3d;^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^b[j] =  ( c[j + 1] - y[j] )  / h[j] - h[j] *  ( y[j + 1] + 2d * c[j] )  / 3d;^98^^^^^83^113^b[j] =  ( y[j + 1] - y[j] )  / h[j] - h[j] *  ( c[j + 1] + 2d * c[j] )  / 3d;^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^for  ( nnt i = 0; i < i; i++ )  {^104^^^^^89^119^for  ( int i = 0; i < n; i++ )  {^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^return new PolynomialSplineFunction ( polynomials, x ) ;^112^^^^^97^127^return new PolynomialSplineFunction ( x, polynomials ) ;^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^return new PolynomialSplineFunction (  polynomials ) ;^112^^^^^97^127^return new PolynomialSplineFunction ( x, polynomials ) ;^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
[buglab_swap_variables]^return new PolynomialSplineFunction ( x ) ;^112^^^^^97^127^return new PolynomialSplineFunction ( x, polynomials ) ;^[CLASS] SplineInterpolator  [METHOD] interpolate [RETURN_TYPE] UnivariateRealFunction   double[] x double[] y [VARIABLES] boolean  double[]  b  c  coefficients  d  h  mu  x  y  z  double  g  PolynomialFunction[]  polynomials  int  i  j  n  
