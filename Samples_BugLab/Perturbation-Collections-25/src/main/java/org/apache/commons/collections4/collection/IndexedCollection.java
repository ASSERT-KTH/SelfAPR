[buglab_swap_variables]^return new IndexedCollection<K, C> ( keyTransformer, coll, MultiValueMap.<K, C>multiValueMap ( new HashMap<K, Collection<C>> (  )  ) , true ) ;^74^75^76^^^72^77^return new IndexedCollection<K, C> ( coll, keyTransformer, MultiValueMap.<K, C>multiValueMap ( new HashMap<K, Collection<C>> (  )  ) , true ) ;^[CLASS] IndexedCollection  [METHOD] uniqueIndexedCollection [RETURN_TYPE] <K,C>   Collection<C> coll Transformer<C, K> keyTransformer [VARIABLES] MultiMap  index  map  Collection  coll  Transformer  keyTransformer  boolean  uniqueIndex  long  serialVersionUID  
[buglab_swap_variables]^return new IndexedCollection<K, C> (  keyTransformer, MultiValueMap.<K, C>multiValueMap ( new HashMap<K, Collection<C>> (  )  ) , true ) ;^74^75^76^^^72^77^return new IndexedCollection<K, C> ( coll, keyTransformer, MultiValueMap.<K, C>multiValueMap ( new HashMap<K, Collection<C>> (  )  ) , true ) ;^[CLASS] IndexedCollection  [METHOD] uniqueIndexedCollection [RETURN_TYPE] <K,C>   Collection<C> coll Transformer<C, K> keyTransformer [VARIABLES] MultiMap  index  map  Collection  coll  Transformer  keyTransformer  boolean  uniqueIndex  long  serialVersionUID  
[buglab_swap_variables]^return new IndexedCollection<K, C> ( coll,  MultiValueMap.<K, C>multiValueMap ( new HashMap<K, Collection<C>> (  )  ) , true ) ;^74^75^76^^^72^77^return new IndexedCollection<K, C> ( coll, keyTransformer, MultiValueMap.<K, C>multiValueMap ( new HashMap<K, Collection<C>> (  )  ) , true ) ;^[CLASS] IndexedCollection  [METHOD] uniqueIndexedCollection [RETURN_TYPE] <K,C>   Collection<C> coll Transformer<C, K> keyTransformer [VARIABLES] MultiMap  index  map  Collection  coll  Transformer  keyTransformer  boolean  uniqueIndex  long  serialVersionUID  
[buglab_swap_variables]^return new IndexedCollection<K, C> ( keyTransformer, coll, MultiValueMap.<K, C>multiValueMap ( new HashMap<K, Collection<C>> (  )  ) , false ) ;^90^91^92^^^88^93^return new IndexedCollection<K, C> ( coll, keyTransformer, MultiValueMap.<K, C>multiValueMap ( new HashMap<K, Collection<C>> (  )  ) , false ) ;^[CLASS] IndexedCollection  [METHOD] nonUniqueIndexedCollection [RETURN_TYPE] <K,C>   Collection<C> coll Transformer<C, K> keyTransformer [VARIABLES] MultiMap  index  map  Collection  coll  Transformer  keyTransformer  boolean  uniqueIndex  long  serialVersionUID  
[buglab_swap_variables]^return new IndexedCollection<K, C> (  keyTransformer, MultiValueMap.<K, C>multiValueMap ( new HashMap<K, Collection<C>> (  )  ) , false ) ;^90^91^92^^^88^93^return new IndexedCollection<K, C> ( coll, keyTransformer, MultiValueMap.<K, C>multiValueMap ( new HashMap<K, Collection<C>> (  )  ) , false ) ;^[CLASS] IndexedCollection  [METHOD] nonUniqueIndexedCollection [RETURN_TYPE] <K,C>   Collection<C> coll Transformer<C, K> keyTransformer [VARIABLES] MultiMap  index  map  Collection  coll  Transformer  keyTransformer  boolean  uniqueIndex  long  serialVersionUID  
[buglab_swap_variables]^return new IndexedCollection<K, C> ( coll,  MultiValueMap.<K, C>multiValueMap ( new HashMap<K, Collection<C>> (  )  ) , false ) ;^90^91^92^^^88^93^return new IndexedCollection<K, C> ( coll, keyTransformer, MultiValueMap.<K, C>multiValueMap ( new HashMap<K, Collection<C>> (  )  ) , false ) ;^[CLASS] IndexedCollection  [METHOD] nonUniqueIndexedCollection [RETURN_TYPE] <K,C>   Collection<C> coll Transformer<C, K> keyTransformer [VARIABLES] MultiMap  index  map  Collection  coll  Transformer  keyTransformer  boolean  uniqueIndex  long  serialVersionUID  
[buglab_swap_variables]^return keyTransformer.containsKey ( index.transform (  ( C )  object )  ) ;^150^^^^^149^151^return index.containsKey ( keyTransformer.transform (  ( C )  object )  ) ;^[CLASS] IndexedCollection  [METHOD] contains [RETURN_TYPE] boolean   Object object [VARIABLES] MultiMap  index  map  Object  object  Transformer  keyTransformer  boolean  added  changed  uniqueIndex  long  serialVersionUID  
[buglab_swap_variables]^final Collection<C> coll =  ( Collection<C> )  key.get ( index ) ;^181^^^^^179^183^final Collection<C> coll =  ( Collection<C> )  index.get ( key ) ;^[CLASS] IndexedCollection  [METHOD] get [RETURN_TYPE] C   final K key [VARIABLES] MultiMap  index  map  Collection  coll  Transformer  keyTransformer  boolean  added  changed  uniqueIndex  K  key  long  serialVersionUID  
[buglab_swap_variables]^return  ( Collection<C> )  key.get ( index ) ;^193^^^^^192^194^return  ( Collection<C> )  index.get ( key ) ;^[CLASS] IndexedCollection  [METHOD] values [RETURN_TYPE] Collection   final K key [VARIABLES] MultiMap  index  map  Transformer  keyTransformer  boolean  added  changed  uniqueIndex  K  key  long  serialVersionUID  
[buglab_swap_variables]^final K key = object.transform ( keyTransformer ) ;^244^^^^^243^249^final K key = keyTransformer.transform ( object ) ;^[CLASS] IndexedCollection  [METHOD] addToIndex [RETURN_TYPE] void   final C object [VARIABLES] MultiMap  index  map  Transformer  keyTransformer  boolean  added  changed  removed  uniqueIndex  C  object  K  key  long  serialVersionUID  
[buglab_swap_variables]^if  ( uniqueIndex && key.containsKey ( index )  )  {^245^^^^^243^249^if  ( uniqueIndex && index.containsKey ( key )  )  {^[CLASS] IndexedCollection  [METHOD] addToIndex [RETURN_TYPE] void   final C object [VARIABLES] MultiMap  index  map  Transformer  keyTransformer  boolean  added  changed  removed  uniqueIndex  C  object  K  key  long  serialVersionUID  
[buglab_swap_variables]^if  ( key && index.containsKey ( uniqueIndex )  )  {^245^^^^^243^249^if  ( uniqueIndex && index.containsKey ( key )  )  {^[CLASS] IndexedCollection  [METHOD] addToIndex [RETURN_TYPE] void   final C object [VARIABLES] MultiMap  index  map  Transformer  keyTransformer  boolean  added  changed  removed  uniqueIndex  C  object  K  key  long  serialVersionUID  
[buglab_swap_variables]^if  ( index && uniqueIndex.containsKey ( key )  )  {^245^^^^^243^249^if  ( uniqueIndex && index.containsKey ( key )  )  {^[CLASS] IndexedCollection  [METHOD] addToIndex [RETURN_TYPE] void   final C object [VARIABLES] MultiMap  index  map  Transformer  keyTransformer  boolean  added  changed  removed  uniqueIndex  C  object  K  key  long  serialVersionUID  
[buglab_swap_variables]^index.put ( object, key ) ;^248^^^^^243^249^index.put ( key, object ) ;^[CLASS] IndexedCollection  [METHOD] addToIndex [RETURN_TYPE] void   final C object [VARIABLES] MultiMap  index  map  Transformer  keyTransformer  boolean  added  changed  removed  uniqueIndex  C  object  K  key  long  serialVersionUID  
[buglab_swap_variables]^index.put (  object ) ;^248^^^^^243^249^index.put ( key, object ) ;^[CLASS] IndexedCollection  [METHOD] addToIndex [RETURN_TYPE] void   final C object [VARIABLES] MultiMap  index  map  Transformer  keyTransformer  boolean  added  changed  removed  uniqueIndex  C  object  K  key  long  serialVersionUID  
[buglab_swap_variables]^index.put ( key ) ;^248^^^^^243^249^index.put ( key, object ) ;^[CLASS] IndexedCollection  [METHOD] addToIndex [RETURN_TYPE] void   final C object [VARIABLES] MultiMap  index  map  Transformer  keyTransformer  boolean  added  changed  removed  uniqueIndex  C  object  K  key  long  serialVersionUID  
[buglab_swap_variables]^index.remove ( object.transform ( keyTransformer )  ) ;^257^^^^^256^258^index.remove ( keyTransformer.transform ( object )  ) ;^[CLASS] IndexedCollection  [METHOD] removeFromIndex [RETURN_TYPE] void   final C object [VARIABLES] MultiMap  index  map  Transformer  keyTransformer  boolean  added  changed  removed  uniqueIndex  C  object  long  serialVersionUID  
