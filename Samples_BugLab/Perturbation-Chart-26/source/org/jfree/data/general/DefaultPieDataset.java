[buglab_swap_variables]^for  ( datant i = 0; i < i.getItemCount (  ) ; i++ )  {^104^^^^^99^107^for  ( int i = 0; i < data.getItemCount (  ) ; i++ )  {^[CLASS] DefaultPieDataset  [METHOD] <init> [RETURN_TYPE] KeyedValues)   KeyedValues data [VARIABLES] KeyedValues  data  boolean  DefaultKeyedValues  data  long  serialVersionUID  int  i  
[buglab_swap_variables]^this.data.addValue ( data.getKey ( i ) .getValue ( i )  ) ;^105^^^^^99^107^this.data.addValue ( data.getKey ( i ) , data.getValue ( i )  ) ;^[CLASS] DefaultPieDataset  [METHOD] <init> [RETURN_TYPE] KeyedValues)   KeyedValues data [VARIABLES] KeyedValues  data  boolean  DefaultKeyedValues  data  long  serialVersionUID  int  i  
[buglab_swap_variables]^this.data.addValue ( i.getKey ( data ) , data.getValue ( i )  ) ;^105^^^^^99^107^this.data.addValue ( data.getKey ( i ) , data.getValue ( i )  ) ;^[CLASS] DefaultPieDataset  [METHOD] <init> [RETURN_TYPE] KeyedValues)   KeyedValues data [VARIABLES] KeyedValues  data  boolean  DefaultKeyedValues  data  long  serialVersionUID  int  i  
[buglab_swap_variables]^return item.getKey ( this.data ) ;^140^^^^^139^141^return this.data.getKey ( item ) ;^[CLASS] DefaultPieDataset  [METHOD] getKey [RETURN_TYPE] Comparable   int item [VARIABLES] boolean  DefaultKeyedValues  data  long  serialVersionUID  int  item  
[buglab_swap_variables]^return key.getIndex ( this.data ) ;^154^^^^^153^155^return this.data.getIndex ( key ) ;^[CLASS] DefaultPieDataset  [METHOD] getIndex [RETURN_TYPE] int   Comparable key [VARIABLES] Comparable  key  boolean  DefaultKeyedValues  data  long  serialVersionUID  
[buglab_swap_variables]^result = item.getValue ( this.data ) ;^168^^^^^164^172^result = this.data.getValue ( item ) ;^[CLASS] DefaultPieDataset  [METHOD] getValue [RETURN_TYPE] Number   int item [VARIABLES] boolean  DefaultKeyedValues  data  Number  result  long  serialVersionUID  int  item  
[buglab_swap_variables]^return key.getValue ( this.data ) ;^187^^^^^183^188^return this.data.getValue ( key ) ;^[CLASS] DefaultPieDataset  [METHOD] getValue [RETURN_TYPE] Number   Comparable key [VARIABLES] Comparable  key  boolean  DefaultKeyedValues  data  long  serialVersionUID  
[buglab_swap_variables]^this.data.setValue ( value, key ) ;^201^^^^^200^203^this.data.setValue ( key, value ) ;^[CLASS] DefaultPieDataset  [METHOD] setValue [RETURN_TYPE] void   Comparable key Number value [VARIABLES] Comparable  key  boolean  DefaultKeyedValues  data  Number  value  long  serialVersionUID  
[buglab_swap_variables]^this.data.setValue (  value ) ;^201^^^^^200^203^this.data.setValue ( key, value ) ;^[CLASS] DefaultPieDataset  [METHOD] setValue [RETURN_TYPE] void   Comparable key Number value [VARIABLES] Comparable  key  boolean  DefaultKeyedValues  data  Number  value  long  serialVersionUID  
[buglab_swap_variables]^this.data.setValue ( key ) ;^201^^^^^200^203^this.data.setValue ( key, value ) ;^[CLASS] DefaultPieDataset  [METHOD] setValue [RETURN_TYPE] void   Comparable key Number value [VARIABLES] Comparable  key  boolean  DefaultKeyedValues  data  Number  value  long  serialVersionUID  
[buglab_swap_variables]^setValue ( value, new Double ( key )  ) ;^216^^^^^215^217^setValue ( key, new Double ( value )  ) ;^[CLASS] DefaultPieDataset  [METHOD] setValue [RETURN_TYPE] void   Comparable key double value [VARIABLES] Comparable  key  boolean  DefaultKeyedValues  data  long  serialVersionUID  double  value  
[buglab_swap_variables]^setValue (  new Double ( value )  ) ;^216^^^^^215^217^setValue ( key, new Double ( value )  ) ;^[CLASS] DefaultPieDataset  [METHOD] setValue [RETURN_TYPE] void   Comparable key double value [VARIABLES] Comparable  key  boolean  DefaultKeyedValues  data  long  serialVersionUID  double  value  
[buglab_swap_variables]^insertValue ( key, position, new Double ( value )  ) ;^233^^^^^232^234^insertValue ( position, key, new Double ( value )  ) ;^[CLASS] DefaultPieDataset  [METHOD] insertValue [RETURN_TYPE] void   int position Comparable key double value [VARIABLES] Comparable  key  boolean  DefaultKeyedValues  data  long  serialVersionUID  int  position  double  value  
[buglab_swap_variables]^insertValue (  key, new Double ( value )  ) ;^233^^^^^232^234^insertValue ( position, key, new Double ( value )  ) ;^[CLASS] DefaultPieDataset  [METHOD] insertValue [RETURN_TYPE] void   int position Comparable key double value [VARIABLES] Comparable  key  boolean  DefaultKeyedValues  data  long  serialVersionUID  int  position  double  value  
[buglab_swap_variables]^insertValue ( position, value, new Double ( key )  ) ;^233^^^^^232^234^insertValue ( position, key, new Double ( value )  ) ;^[CLASS] DefaultPieDataset  [METHOD] insertValue [RETURN_TYPE] void   int position Comparable key double value [VARIABLES] Comparable  key  boolean  DefaultKeyedValues  data  long  serialVersionUID  int  position  double  value  
[buglab_swap_variables]^insertValue ( position,  new Double ( value )  ) ;^233^^^^^232^234^insertValue ( position, key, new Double ( value )  ) ;^[CLASS] DefaultPieDataset  [METHOD] insertValue [RETURN_TYPE] void   int position Comparable key double value [VARIABLES] Comparable  key  boolean  DefaultKeyedValues  data  long  serialVersionUID  int  position  double  value  
[buglab_swap_variables]^insertValue ( value, key, new Double ( position )  ) ;^233^^^^^232^234^insertValue ( position, key, new Double ( value )  ) ;^[CLASS] DefaultPieDataset  [METHOD] insertValue [RETURN_TYPE] void   int position Comparable key double value [VARIABLES] Comparable  key  boolean  DefaultKeyedValues  data  long  serialVersionUID  int  position  double  value  
[buglab_swap_variables]^this.data.insertValue (  key, value ) ;^250^^^^^249^252^this.data.insertValue ( position, key, value ) ;^[CLASS] DefaultPieDataset  [METHOD] insertValue [RETURN_TYPE] void   int position Comparable key Number value [VARIABLES] Comparable  key  boolean  DefaultKeyedValues  data  Number  value  long  serialVersionUID  int  position  
[buglab_swap_variables]^this.data.insertValue ( position, value, key ) ;^250^^^^^249^252^this.data.insertValue ( position, key, value ) ;^[CLASS] DefaultPieDataset  [METHOD] insertValue [RETURN_TYPE] void   int position Comparable key Number value [VARIABLES] Comparable  key  boolean  DefaultKeyedValues  data  Number  value  long  serialVersionUID  int  position  
[buglab_swap_variables]^this.data.insertValue ( position,  value ) ;^250^^^^^249^252^this.data.insertValue ( position, key, value ) ;^[CLASS] DefaultPieDataset  [METHOD] insertValue [RETURN_TYPE] void   int position Comparable key Number value [VARIABLES] Comparable  key  boolean  DefaultKeyedValues  data  Number  value  long  serialVersionUID  int  position  
[buglab_swap_variables]^this.data.insertValue ( position, key ) ;^250^^^^^249^252^this.data.insertValue ( position, key, value ) ;^[CLASS] DefaultPieDataset  [METHOD] insertValue [RETURN_TYPE] void   int position Comparable key Number value [VARIABLES] Comparable  key  boolean  DefaultKeyedValues  data  Number  value  long  serialVersionUID  int  position  
[buglab_swap_variables]^if  ( count.getItemCount (  )  != that )  {^324^^^^^309^339^if  ( that.getItemCount (  )  != count )  {^[CLASS] DefaultPieDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  k1  k2  boolean  DefaultKeyedValues  data  Number  v1  v2  PieDataset  that  Object  obj  long  serialVersionUID  int  count  i  
[buglab_swap_variables]^for  ( countnt i = 0; i < i; i++ )  {^328^^^^^313^343^for  ( int i = 0; i < count; i++ )  {^[CLASS] DefaultPieDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  k1  k2  boolean  DefaultKeyedValues  data  Number  v1  v2  PieDataset  that  Object  obj  long  serialVersionUID  int  count  i  
[buglab_swap_variables]^Comparable k2 = i.getKey ( that ) ;^330^^^^^315^345^Comparable k2 = that.getKey ( i ) ;^[CLASS] DefaultPieDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  k1  k2  boolean  DefaultKeyedValues  data  Number  v1  v2  PieDataset  that  Object  obj  long  serialVersionUID  int  count  i  
[buglab_swap_variables]^Number v2 = i.getValue ( that ) ;^336^^^^^321^351^Number v2 = that.getValue ( i ) ;^[CLASS] DefaultPieDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  k1  k2  boolean  DefaultKeyedValues  data  Number  v1  v2  PieDataset  that  Object  obj  long  serialVersionUID  int  count  i  
