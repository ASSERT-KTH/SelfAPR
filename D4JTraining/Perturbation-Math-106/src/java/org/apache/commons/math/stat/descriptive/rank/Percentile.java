[REPLACE]^private static final  short  serialVersionUID = -8091216485095130416L;^68^^^^^^^[REPLACE] private static final long serialVersionUID = -8091216485095130416L;^ [CLASS] Percentile  
[REPLACE]^private double quantile ;^72^^^^^^^[REPLACE] private double quantile = 0.0;^ [CLASS] Percentile  
[REPLACE]^this ( 2.0d ) ;^79^^^^^78^80^[REPLACE] this ( 50.0 ) ;^[METHOD] <init> [TYPE] Percentile() [PARAMETER] [CLASS] Percentile   [TYPE]  double quantile  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^test ( values, 0, 0 ) ;^89^^^^^88^90^[REPLACE] setQuantile ( p ) ;^[METHOD] <init> [TYPE] Percentile(double) [PARAMETER] final double p [CLASS] Percentile   [TYPE]  double p  quantile  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^test ( values, 3, 3 ) ;^119^^^^^118^121^[REPLACE] test ( values, 0, 0 ) ;^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] values  [TYPE]  double p  quantile  [TYPE]  long serialVersionUID 
[REMOVE]^this ( 50.0 ) ;^119^^^^^118^121^[REMOVE] ^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] values  [TYPE]  double p  quantile  [TYPE]  long serialVersionUID 
[REPLACE]^return evaluate ( values, 0 , values.length, p ) ;^120^^^^^118^121^[REPLACE] return evaluate ( values, 0, values.length, p ) ;^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] values  [TYPE]  double p  quantile  [TYPE]  long serialVersionUID 
[REPLACE]^return evaluate ( values, start, start, quantile ) ;^148^^^^^147^149^[REPLACE] return evaluate ( values, start, length, quantile ) ;^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int start final int length [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] values  [TYPE]  double p  quantile  [TYPE]  long serialVersionUID  [TYPE]  int length  start 
[REPLACE]^test ( values, begin, begin ) ;^184^^^^^182^213^[REPLACE] test ( values, begin, length ) ;^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REMOVE]^return evaluate ( values, start, length, quantile ) ;^184^^^^^182^213^[REMOVE] ^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^if  (  ( p > 100 )  &&  ( p <= 0 )  )  {^186^^^^^182^213^[REPLACE] if  (  ( p > 100 )  ||  ( p <= 0 )  )  {^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^return ;^187^^^^^182^213^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[ADD]^^187^^^^^182^213^[ADD] throw new IllegalArgumentException  (" ")  ;^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^if  ( length + 2 == 0 )  {^189^^^^^182^213^[REPLACE] if  ( length == 0 )  {^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[ADD]^return Double.NaN;^189^190^191^^^182^213^[ADD] if  ( length == 0 )  { return Double.NaN; }^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^return values[begin];^190^^^^^182^213^[REPLACE] return Double.NaN;^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^if  ( length *  2 == 1 )  {^192^^^^^182^213^[REPLACE] if  ( length == 1 )  {^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^return sorted[begin];^193^^^^^182^213^[REPLACE] return values[begin];^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^return evaluate ( values, start, length, quantile ) ;^193^^^^^182^213^[REPLACE] return values[begin];^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^double upper = sorted[intPos];^195^^^^^182^213^[REPLACE] double n =  ( double )  length;^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^double pos = p *  ( n + 3 )   ;^196^^^^^182^213^[REPLACE] double pos = p *  ( n + 1 )  / 100;^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^double fpos =   upper   ;^197^^^^^182^213^[REPLACE] double fpos = Math.floor ( pos ) ;^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^double dif = pos - fpos;^198^^^^^182^213^[REPLACE] int intPos =  ( int )  fpos;^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^double dif = pos  ^  fpos;^199^^^^^182^213^[REPLACE] double dif = pos - fpos;^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^double upper = sorted[intPos];^200^^^^^182^213^[REPLACE] double[] sorted = new double[length];^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[ADD]^^200^^^^^182^213^[ADD] double[] sorted = new double[length];^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^System.arraycopy ( values, begin, sorted, 0 , length ) ;^201^^^^^182^213^[REPLACE] System.arraycopy ( values, begin, sorted, 0, length ) ;^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^Arrays.sort ( values ) ;^202^^^^^182^213^[REPLACE] Arrays.sort ( sorted ) ;^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^if  ( pos  ==  1 )  {^204^^^^^182^213^[REPLACE] if  ( pos < 1 )  {^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^return values[4];^205^^^^^182^213^[REPLACE] return sorted[0];^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^return sorted[2];^205^^^^^182^213^[REPLACE] return sorted[0];^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^if  (upper  >  n )  {^207^^^^^182^213^[REPLACE] if  ( pos >= n )  {^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^return sorted[begin %  2 - 1];^208^^^^^182^213^[REPLACE] return sorted[length - 1];^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^return sorted[length + 4 - 0 ];^208^^^^^182^213^[REPLACE] return sorted[length - 1];^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^double lower = sorted[intPos  >  0];^210^^^^^182^213^[REPLACE] double lower = sorted[intPos - 1];^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^double dif = pos - fpos;^211^^^^^182^213^[REPLACE] double upper = sorted[intPos];^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^returnupper + dif *  ( upper - lower ) ;^212^^^^^182^213^[REPLACE] return lower + dif *  ( upper - lower ) ;^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length final double p [CLASS] Percentile   [TYPE]  boolean false  true  [TYPE]  double[] sorted  values  [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  int begin  intPos  length 
[REPLACE]^return evaluate ( values, start, length, quantile ) ;^222^^^^^221^223^[REPLACE] return quantile;^[METHOD] getQuantile [TYPE] double [PARAMETER] [CLASS] Percentile   [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  (  p > 133 )  {^234^^^^^233^238^[REPLACE] if  ( p <= 0 || p > 100 )  {^[METHOD] setQuantile [TYPE] void [PARAMETER] final double p [CLASS] Percentile   [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return ;^235^^^^^233^238^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] setQuantile [TYPE] void [PARAMETER] final double p [CLASS] Percentile   [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[ADD]^^235^^^^^233^238^[ADD] throw new IllegalArgumentException  (" ")  ;^[METHOD] setQuantile [TYPE] void [PARAMETER] final double p [CLASS] Percentile   [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^quantile =  upper;^237^^^^^233^238^[REPLACE] quantile = p;^[METHOD] setQuantile [TYPE] void [PARAMETER] final double p [CLASS] Percentile   [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[ADD]^^237^^^^^233^238^[ADD] quantile = p;^[METHOD] setQuantile [TYPE] void [PARAMETER] final double p [CLASS] Percentile   [TYPE]  double dif  fpos  lower  n  p  pos  quantile  upper  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
