[buglab_swap_variables]^return new DefaultedMap<K, V> ( defaultValue, ConstantTransformer.constantTransformer ( map )  ) ;^87^^^^^86^88^return new DefaultedMap<K, V> ( map, ConstantTransformer.constantTransformer ( defaultValue )  ) ;^[CLASS] DefaultedMap  [METHOD] defaultedMap [RETURN_TYPE] <K,V>   Map<K, V> map final V defaultValue [VARIABLES] Transformer  defaultValueTransformer  value  boolean  Map  map  long  serialVersionUID  V  defaultValue  
[buglab_swap_variables]^return new DefaultedMap<K, V> (  ConstantTransformer.constantTransformer ( defaultValue )  ) ;^87^^^^^86^88^return new DefaultedMap<K, V> ( map, ConstantTransformer.constantTransformer ( defaultValue )  ) ;^[CLASS] DefaultedMap  [METHOD] defaultedMap [RETURN_TYPE] <K,V>   Map<K, V> map final V defaultValue [VARIABLES] Transformer  defaultValueTransformer  value  boolean  Map  map  long  serialVersionUID  V  defaultValue  
[buglab_swap_variables]^return new DefaultedMap<K, V> ( factory, FactoryTransformer.factoryTransformer ( map )  ) ;^108^^^^^104^109^return new DefaultedMap<K, V> ( map, FactoryTransformer.factoryTransformer ( factory )  ) ;^[CLASS] DefaultedMap  [METHOD] defaultedMap [RETURN_TYPE] <K,V>   Map<K, V> map Factory<? extends V> factory [VARIABLES] Factory  factory  Transformer  defaultValueTransformer  value  boolean  Map  map  long  serialVersionUID  
[buglab_swap_variables]^return new DefaultedMap<K, V> (  FactoryTransformer.factoryTransformer ( factory )  ) ;^108^^^^^104^109^return new DefaultedMap<K, V> ( map, FactoryTransformer.factoryTransformer ( factory )  ) ;^[CLASS] DefaultedMap  [METHOD] defaultedMap [RETURN_TYPE] <K,V>   Map<K, V> map Factory<? extends V> factory [VARIABLES] Factory  factory  Transformer  defaultValueTransformer  value  boolean  Map  map  long  serialVersionUID  
[buglab_swap_variables]^return new DefaultedMap<K, V> ( transformer, map ) ;^131^^^^^126^132^return new DefaultedMap<K, V> ( map, transformer ) ;^[CLASS] DefaultedMap  [METHOD] defaultedMap [RETURN_TYPE] <K,V>   Map<K, V> map Transformer<? super K, ? extends V> transformer [VARIABLES] Transformer  defaultValueTransformer  transformer  value  boolean  Map  map  long  serialVersionUID  
[buglab_swap_variables]^return new DefaultedMap<K, V> (  transformer ) ;^131^^^^^126^132^return new DefaultedMap<K, V> ( map, transformer ) ;^[CLASS] DefaultedMap  [METHOD] defaultedMap [RETURN_TYPE] <K,V>   Map<K, V> map Transformer<? super K, ? extends V> transformer [VARIABLES] Transformer  defaultValueTransformer  transformer  value  boolean  Map  map  long  serialVersionUID  
[buglab_swap_variables]^return new DefaultedMap<K, V> ( map ) ;^131^^^^^126^132^return new DefaultedMap<K, V> ( map, transformer ) ;^[CLASS] DefaultedMap  [METHOD] defaultedMap [RETURN_TYPE] <K,V>   Map<K, V> map Transformer<? super K, ? extends V> transformer [VARIABLES] Transformer  defaultValueTransformer  transformer  value  boolean  Map  map  long  serialVersionUID  
[buglab_swap_variables]^if  ( key.containsKey ( map )  == false )  {^202^^^^^200^206^if  ( map.containsKey ( key )  == false )  {^[CLASS] DefaultedMap  [METHOD] get [RETURN_TYPE] V   Object key [VARIABLES] Object  key  Transformer  defaultValueTransformer  transformer  value  boolean  long  serialVersionUID  
[buglab_swap_variables]^return key.get ( map ) ;^205^^^^^200^206^return map.get ( key ) ;^[CLASS] DefaultedMap  [METHOD] get [RETURN_TYPE] V   Object key [VARIABLES] Object  key  Transformer  defaultValueTransformer  transformer  value  boolean  long  serialVersionUID  
