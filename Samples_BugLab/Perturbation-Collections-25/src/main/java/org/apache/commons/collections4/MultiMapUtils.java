[buglab_swap_variables]^return EMPTY_MULTI_VALUED_MAP == null ? map : map;^82^^^^^81^83^return map == null ? EMPTY_MULTI_VALUED_MAP : map;^[CLASS] MultiMapUtils  [METHOD] emptyIfNull [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  boolean  
[buglab_swap_variables]^return key.get ( map ) ;^111^^^^^109^114^return map.get ( key ) ;^[CLASS] MultiMapUtils  [METHOD] getCollection [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  K  key  boolean  
[buglab_swap_variables]^Collection<V> col = key.get ( map ) ;^130^^^^^128^137^Collection<V> col = map.get ( key ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsList [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[buglab_swap_variables]^Collection<V> col = key.get ( map ) ;^150^^^^^148^157^Collection<V> col = map.get ( key ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsSet [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[buglab_swap_variables]^Collection<V> col = key.get ( map ) ;^170^^^^^168^177^Collection<V> col = map.get ( key ) ;^[CLASS] MultiMapUtils  [METHOD] getValuesAsBag [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map final K key [VARIABLES] Collection  col  K  key  boolean  MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  
[buglab_swap_variables]^return TransformedMultiValuedMap.transformingMap ( keyTransformer, map, valueTransformer ) ;^278^^^^^275^279^return TransformedMultiValuedMap.transformingMap ( map, keyTransformer, valueTransformer ) ;^[CLASS] MultiMapUtils  [METHOD] transformedMultiValuedMap [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map Transformer<? super K, ? extends K> keyTransformer Transformer<? super V, ? extends V> valueTransformer [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  Transformer  keyTransformer  valueTransformer  boolean  
[buglab_swap_variables]^return TransformedMultiValuedMap.transformingMap (  keyTransformer, valueTransformer ) ;^278^^^^^275^279^return TransformedMultiValuedMap.transformingMap ( map, keyTransformer, valueTransformer ) ;^[CLASS] MultiMapUtils  [METHOD] transformedMultiValuedMap [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map Transformer<? super K, ? extends K> keyTransformer Transformer<? super V, ? extends V> valueTransformer [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  Transformer  keyTransformer  valueTransformer  boolean  
[buglab_swap_variables]^return TransformedMultiValuedMap.transformingMap ( map,  valueTransformer ) ;^278^^^^^275^279^return TransformedMultiValuedMap.transformingMap ( map, keyTransformer, valueTransformer ) ;^[CLASS] MultiMapUtils  [METHOD] transformedMultiValuedMap [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map Transformer<? super K, ? extends K> keyTransformer Transformer<? super V, ? extends V> valueTransformer [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  Transformer  keyTransformer  valueTransformer  boolean  
[buglab_swap_variables]^return TransformedMultiValuedMap.transformingMap ( map, valueTransformer, keyTransformer ) ;^278^^^^^275^279^return TransformedMultiValuedMap.transformingMap ( map, keyTransformer, valueTransformer ) ;^[CLASS] MultiMapUtils  [METHOD] transformedMultiValuedMap [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map Transformer<? super K, ? extends K> keyTransformer Transformer<? super V, ? extends V> valueTransformer [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  Transformer  keyTransformer  valueTransformer  boolean  
[buglab_swap_variables]^return TransformedMultiValuedMap.transformingMap ( map, keyTransformer ) ;^278^^^^^275^279^return TransformedMultiValuedMap.transformingMap ( map, keyTransformer, valueTransformer ) ;^[CLASS] MultiMapUtils  [METHOD] transformedMultiValuedMap [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map Transformer<? super K, ? extends K> keyTransformer Transformer<? super V, ? extends V> valueTransformer [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  Transformer  keyTransformer  valueTransformer  boolean  
[buglab_swap_variables]^return TransformedMultiValuedMap.transformingMap ( valueTransformer, keyTransformer, map ) ;^278^^^^^275^279^return TransformedMultiValuedMap.transformingMap ( map, keyTransformer, valueTransformer ) ;^[CLASS] MultiMapUtils  [METHOD] transformedMultiValuedMap [RETURN_TYPE] <K,V>   MultiValuedMap<K, V> map Transformer<? super K, ? extends K> keyTransformer Transformer<? super V, ? extends V> valueTransformer [VARIABLES] MultiValuedMap  EMPTY_MULTI_VALUED_MAP  map  Transformer  keyTransformer  valueTransformer  boolean  
