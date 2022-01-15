[REPLACE]^private static final long serialVersionUID ;^37^^^^^^^[REPLACE] private static final long serialVersionUID = -44915725420072521L;^ [CLASS] AbstractStorelessUnivariateStatistic  
[REPLACE]^if  ( values != false )  {^56^^^^^55^60^[REPLACE] if  ( values == null )  {^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  double[] values  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return ;^57^^^^^55^60^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  double[] values  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return evaluate ( values, 0 , values.length ) ;^59^^^^^55^60^[REPLACE] return evaluate ( values, 0, values.length ) ;^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  double[] values  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( values == null )  {^80^^^^^79^85^[REPLACE] if  ( test ( values, begin, length )  )  {^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  boolean false  true  [TYPE]  double[] values  [TYPE]  long serialVersionUID  [TYPE]  int begin  length 
[ADD]^^80^81^82^83^^79^85^[ADD] if  ( test ( values, begin, length )  )  { clear (  ) ; incrementAll ( values, begin, length ) ; }^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  boolean false  true  [TYPE]  double[] values  [TYPE]  long serialVersionUID  [TYPE]  int begin  length 
[REPLACE]^increment ( values[i] ) ;^81^^^^^79^85^[REPLACE] clear (  ) ;^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  boolean false  true  [TYPE]  double[] values  [TYPE]  long serialVersionUID  [TYPE]  int begin  length 
[REPLACE]^incrementAll ( values, 0, values.length ) ;^82^^^^^79^85^[REPLACE] incrementAll ( values, begin, length ) ;^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  boolean false  true  [TYPE]  double[] values  [TYPE]  long serialVersionUID  [TYPE]  int begin  length 
[REPLACE]^return false;^84^^^^^79^85^[REPLACE] return getResult (  ) ;^[METHOD] evaluate [TYPE] double [PARAMETER] final double[] values final int begin final int length [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  boolean false  true  [TYPE]  double[] values  [TYPE]  long serialVersionUID  [TYPE]  int begin  length 
[REPLACE]^if  ( values != null )  {^113^^^^^112^117^[REPLACE] if  ( values == null )  {^[METHOD] incrementAll [TYPE] void [PARAMETER] double[] values [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  double[] values  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^return ;^114^^^^^112^117^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] incrementAll [TYPE] void [PARAMETER] double[] values [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  double[] values  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^incrementAll ( values, 0 , values.length ) ;^116^^^^^112^117^[REPLACE] incrementAll ( values, 0, values.length ) ;^[METHOD] incrementAll [TYPE] void [PARAMETER] double[] values [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  double[] values  [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
[REPLACE]^if  ( test ( values, begin, length (  )  )  )  {^132^^^^^131^138^[REPLACE] if  ( test ( values, begin, length )  )  {^[METHOD] incrementAll [TYPE] void [PARAMETER] double[] values int begin int length [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  boolean false  true  [TYPE]  double[] values  [TYPE]  long serialVersionUID  [TYPE]  int begin  i  k  length 
[REPLACE]^for  ( int i = begin; i  >  k; i++ )  {^134^^^^^131^138^[REPLACE] for  ( int i = begin; i < k; i++ )  {^[METHOD] incrementAll [TYPE] void [PARAMETER] double[] values int begin int length [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  boolean false  true  [TYPE]  double[] values  [TYPE]  long serialVersionUID  [TYPE]  int begin  i  k  length 
[REPLACE]^incrementAll ( values, 0, values.length ) ;^135^^^^^131^138^[REPLACE] increment ( values[i] ) ;^[METHOD] incrementAll [TYPE] void [PARAMETER] double[] values int begin int length [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  boolean false  true  [TYPE]  double[] values  [TYPE]  long serialVersionUID  [TYPE]  int begin  i  k  length 
[ADD]^^135^^^^^131^138^[ADD] increment ( values[i] ) ;^[METHOD] incrementAll [TYPE] void [PARAMETER] double[] values int begin int length [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  boolean false  true  [TYPE]  double[] values  [TYPE]  long serialVersionUID  [TYPE]  int begin  i  k  length 
[REPLACE]^int k = begin + length (  ) ;^133^^^^^131^138^[REPLACE] int k = begin + length;^[METHOD] incrementAll [TYPE] void [PARAMETER] double[] values int begin int length [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  boolean false  true  [TYPE]  double[] values  [TYPE]  long serialVersionUID  [TYPE]  int begin  i  k  length 
[REPLACE]^for  ( int i = length; i < k; i++ )  {^134^^^^^131^138^[REPLACE] for  ( int i = begin; i < k; i++ )  {^[METHOD] incrementAll [TYPE] void [PARAMETER] double[] values int begin int length [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  boolean false  true  [TYPE]  double[] values  [TYPE]  long serialVersionUID  [TYPE]  int begin  i  k  length 
[REPLACE]^for  ( beginnt i = begin; i  ==  k; i++ )  {^134^^^^^131^138^[REPLACE] for  ( int i = begin; i < k; i++ )  {^[METHOD] incrementAll [TYPE] void [PARAMETER] double[] values int begin int length [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  boolean false  true  [TYPE]  double[] values  [TYPE]  long serialVersionUID  [TYPE]  int begin  i  k  length 
[REPLACE]^int k = begin + length *  0.5 ;^133^^^^^131^138^[REPLACE] int k = begin + length;^[METHOD] incrementAll [TYPE] void [PARAMETER] double[] values int begin int length [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  boolean false  true  [TYPE]  double[] values  [TYPE]  long serialVersionUID  [TYPE]  int begin  i  k  length 
[REPLACE]^if  ( object  &&  this  )  {^148^^^^^147^157^[REPLACE] if  ( object == this  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object object [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  AbstractStorelessUnivariateStatistic stat  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return false;^149^^^^^147^157^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object object [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  AbstractStorelessUnivariateStatistic stat  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^if  ( ! object instanceof AbstractStorelessUnivariateStatistic == false )  {^151^^^^^147^157^[REPLACE] if  ( object instanceof AbstractStorelessUnivariateStatistic == false )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object object [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  AbstractStorelessUnivariateStatistic stat  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[ADD]^^151^152^153^^^147^157^[ADD] if  ( object instanceof AbstractStorelessUnivariateStatistic == false )  { return false; }^[METHOD] equals [TYPE] boolean [PARAMETER] Object object [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  AbstractStorelessUnivariateStatistic stat  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return true;^152^^^^^147^157^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object object [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  AbstractStorelessUnivariateStatistic stat  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^int k = begin + length;^154^^^^^147^157^[REPLACE] AbstractStorelessUnivariateStatistic stat =  ( AbstractStorelessUnivariateStatistic )  object;^[METHOD] equals [TYPE] boolean [PARAMETER] Object object [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  AbstractStorelessUnivariateStatistic stat  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return   MathUtils.equals ( stat.getN (  ) , this.getN (  )  )  ) ;^155^156^^^^147^157^[REPLACE] return  ( MathUtils.equals ( stat.getResult (  ) , this.getResult (  )  )  && MathUtils.equals ( stat.getN (  ) , this.getN (  )  )  ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object object [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  AbstractStorelessUnivariateStatistic stat  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID 
[REPLACE]^return 31L*  ( 31L + MathUtils.hash ( getResult (  )  )  )  + MathUtils.hash ( getN (  )  ) ;^165^^^^^164^166^[REPLACE] return 31*  ( 31 + MathUtils.hash ( getResult (  )  )  )  + MathUtils.hash ( getN (  )  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] AbstractStorelessUnivariateStatistic   [TYPE]  long serialVersionUID  [TYPE]  boolean false  true 
