[buglab_swap_variables]^return new TransformedSplitMap<J, K, U, V> ( valueTransformer, keyTransformer, map ) ;^93^^^^^90^94^return new TransformedSplitMap<J, K, U, V> ( map, keyTransformer, valueTransformer ) ;^[CLASS] TransformedSplitMap  [METHOD] transformingMap [RETURN_TYPE] <J,K,U,V>   Map<K, V> map Transformer<? super J, ? extends K> keyTransformer Transformer<? super U, ? extends V> valueTransformer [VARIABLES] Transformer  keyTransformer  valueTransformer  boolean  Map  map  long  serialVersionUID  
[buglab_swap_variables]^return new TransformedSplitMap<J, K, U, V> (  keyTransformer, valueTransformer ) ;^93^^^^^90^94^return new TransformedSplitMap<J, K, U, V> ( map, keyTransformer, valueTransformer ) ;^[CLASS] TransformedSplitMap  [METHOD] transformingMap [RETURN_TYPE] <J,K,U,V>   Map<K, V> map Transformer<? super J, ? extends K> keyTransformer Transformer<? super U, ? extends V> valueTransformer [VARIABLES] Transformer  keyTransformer  valueTransformer  boolean  Map  map  long  serialVersionUID  
[buglab_swap_variables]^return new TransformedSplitMap<J, K, U, V> ( map, valueTransformer, keyTransformer ) ;^93^^^^^90^94^return new TransformedSplitMap<J, K, U, V> ( map, keyTransformer, valueTransformer ) ;^[CLASS] TransformedSplitMap  [METHOD] transformingMap [RETURN_TYPE] <J,K,U,V>   Map<K, V> map Transformer<? super J, ? extends K> keyTransformer Transformer<? super U, ? extends V> valueTransformer [VARIABLES] Transformer  keyTransformer  valueTransformer  boolean  Map  map  long  serialVersionUID  
[buglab_swap_variables]^return new TransformedSplitMap<J, K, U, V> ( map,  valueTransformer ) ;^93^^^^^90^94^return new TransformedSplitMap<J, K, U, V> ( map, keyTransformer, valueTransformer ) ;^[CLASS] TransformedSplitMap  [METHOD] transformingMap [RETURN_TYPE] <J,K,U,V>   Map<K, V> map Transformer<? super J, ? extends K> keyTransformer Transformer<? super U, ? extends V> valueTransformer [VARIABLES] Transformer  keyTransformer  valueTransformer  boolean  Map  map  long  serialVersionUID  
[buglab_swap_variables]^return new TransformedSplitMap<J, K, U, V> ( map, keyTransformer ) ;^93^^^^^90^94^return new TransformedSplitMap<J, K, U, V> ( map, keyTransformer, valueTransformer ) ;^[CLASS] TransformedSplitMap  [METHOD] transformingMap [RETURN_TYPE] <J,K,U,V>   Map<K, V> map Transformer<? super J, ? extends K> keyTransformer Transformer<? super U, ? extends V> valueTransformer [VARIABLES] Transformer  keyTransformer  valueTransformer  boolean  Map  map  long  serialVersionUID  
[buglab_swap_variables]^return new TransformedSplitMap<J, K, U, V> ( keyTransformer, map, valueTransformer ) ;^93^^^^^90^94^return new TransformedSplitMap<J, K, U, V> ( map, keyTransformer, valueTransformer ) ;^[CLASS] TransformedSplitMap  [METHOD] transformingMap [RETURN_TYPE] <J,K,U,V>   Map<K, V> map Transformer<? super J, ? extends K> keyTransformer Transformer<? super U, ? extends V> valueTransformer [VARIABLES] Transformer  keyTransformer  valueTransformer  boolean  Map  map  long  serialVersionUID  
[buglab_swap_variables]^return object.transform ( keyTransformer ) ;^159^^^^^158^160^return keyTransformer.transform ( object ) ;^[CLASS] TransformedSplitMap  [METHOD] transformKey [RETURN_TYPE] K   final J object [VARIABLES] J  object  Transformer  keyTransformer  valueTransformer  boolean  long  serialVersionUID  
[buglab_swap_variables]^return object.transform ( valueTransformer ) ;^171^^^^^170^172^return valueTransformer.transform ( object ) ;^[CLASS] TransformedSplitMap  [METHOD] transformValue [RETURN_TYPE] V   final U object [VARIABLES] Transformer  keyTransformer  valueTransformer  boolean  U  object  long  serialVersionUID  
[buglab_swap_variables]^return valueTransformerTransformer.transform ( value ) ;^202^^^^^201^203^return valueTransformer.transform ( value ) ;^[CLASS] TransformedSplitMap  [METHOD] checkSetValue [RETURN_TYPE] V   final U value [VARIABLES] Transformer  keyTransformer  valueTransformer  boolean  U  value  long  serialVersionUID  
[buglab_swap_variables]^return value.transform ( valueTransformer ) ;^202^^^^^201^203^return valueTransformer.transform ( value ) ;^[CLASS] TransformedSplitMap  [METHOD] checkSetValue [RETURN_TYPE] V   final U value [VARIABLES] Transformer  keyTransformer  valueTransformer  boolean  U  value  long  serialVersionUID  
[buglab_swap_variables]^return decorated (  ) .put ( transformKey ( value ) , transformValue ( key )  ) ;^207^^^^^206^208^return decorated (  ) .put ( transformKey ( key ) , transformValue ( value )  ) ;^[CLASS] TransformedSplitMap  [METHOD] put [RETURN_TYPE] V   final J key final U value [VARIABLES] J  key  Transformer  keyTransformer  valueTransformer  boolean  U  value  long  serialVersionUID  
