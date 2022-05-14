[buglab_swap_variables]^return new MultiValueMap<K, V> ( collectionClass, new ReflectionFactory<C> ( map )  ) ;^107^^^^^105^108^return new MultiValueMap<K, V> ( map, new ReflectionFactory<C> ( collectionClass )  ) ;^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] multiValueMap [RETURN_TYPE] <K,V,C   Map<K, ? super C> map Class<C> collectionClass [VARIABLES] boolean  Iterator  iterator  Factory  collectionFactory  Collection  values  valuesView  Object  key  Class  clazz  collectionClass  Map  map  long  serialVersionUID  
[buglab_swap_variables]^return new MultiValueMap<K, V> (  new ReflectionFactory<C> ( collectionClass )  ) ;^107^^^^^105^108^return new MultiValueMap<K, V> ( map, new ReflectionFactory<C> ( collectionClass )  ) ;^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] multiValueMap [RETURN_TYPE] <K,V,C   Map<K, ? super C> map Class<C> collectionClass [VARIABLES] boolean  Iterator  iterator  Factory  collectionFactory  Collection  values  valuesView  Object  key  Class  clazz  collectionClass  Map  map  long  serialVersionUID  
[buglab_swap_variables]^return new MultiValueMap<K, V> ( collectionFactory, map ) ;^124^^^^^122^125^return new MultiValueMap<K, V> ( map, collectionFactory ) ;^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] multiValueMap [RETURN_TYPE] <K,V,C   Map<K, ? super C> map Factory<C> collectionFactory [VARIABLES] boolean  Iterator  iterator  Factory  collectionFactory  Collection  values  valuesView  Object  key  Class  clazz  collectionClass  Map  map  long  serialVersionUID  
[buglab_swap_variables]^return new MultiValueMap<K, V> (  collectionFactory ) ;^124^^^^^122^125^return new MultiValueMap<K, V> ( map, collectionFactory ) ;^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] multiValueMap [RETURN_TYPE] <K,V,C   Map<K, ? super C> map Factory<C> collectionFactory [VARIABLES] boolean  Iterator  iterator  Factory  collectionFactory  Collection  values  valuesView  Object  key  Class  clazz  collectionClass  Map  map  long  serialVersionUID  
[buglab_swap_variables]^return new MultiValueMap<K, V> ( map ) ;^124^^^^^122^125^return new MultiValueMap<K, V> ( map, collectionFactory ) ;^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] multiValueMap [RETURN_TYPE] <K,V,C   Map<K, ? super C> map Factory<C> collectionFactory [VARIABLES] boolean  Iterator  iterator  Factory  collectionFactory  Collection  values  valuesView  Object  key  Class  clazz  collectionClass  Map  map  long  serialVersionUID  
[buglab_swap_variables]^final boolean removed = value.remove ( valuesForKey ) ;^217^^^^^212^225^final boolean removed = valuesForKey.remove ( value ) ;^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] removeMapping [RETURN_TYPE] boolean   Object key Object value [VARIABLES] boolean  removed  Iterator  iterator  Factory  collectionFactory  Collection  values  valuesForKey  valuesView  Object  key  value  Class  clazz  collectionClass  long  serialVersionUID  
[buglab_swap_variables]^final boolean removed = valuesForKeysForKey.remove ( value ) ;^217^^^^^212^225^final boolean removed = valuesForKey.remove ( value ) ;^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] removeMapping [RETURN_TYPE] boolean   Object key Object value [VARIABLES] boolean  removed  Iterator  iterator  Factory  collectionFactory  Collection  values  valuesForKey  valuesView  Object  key  value  Class  clazz  collectionClass  long  serialVersionUID  
[buglab_swap_variables]^if  (  (  ( Collection<V> )  value.getValue (  )  ) .contains ( entry )  )  {^241^^^^^237^247^if  (  (  ( Collection<V> )  entry.getValue (  )  ) .contains ( value )  )  {^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] containsValue [RETURN_TYPE] boolean   Object value [VARIABLES] Entry  entry  Set  pairs  boolean  Iterator  iterator  Factory  collectionFactory  Collection  values  valuesForKey  valuesView  Object  key  value  Class  clazz  collectionClass  long  serialVersionUID  
[buglab_swap_variables]^decorated (  ) .put ( coll, key ) ;^269^^^^^261^276^decorated (  ) .put ( key, coll ) ;^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] put [RETURN_TYPE] Object   final K key Object value [VARIABLES] boolean  result  Iterator  iterator  Factory  collectionFactory  Collection  coll  values  valuesForKey  valuesView  Object  key  value  Class  clazz  collectionClass  K  key  long  serialVersionUID  
[buglab_swap_variables]^decorated (  ) .put (  coll ) ;^269^^^^^261^276^decorated (  ) .put ( key, coll ) ;^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] put [RETURN_TYPE] Object   final K key Object value [VARIABLES] boolean  result  Iterator  iterator  Factory  collectionFactory  Collection  coll  values  valuesForKey  valuesView  Object  key  value  Class  clazz  collectionClass  K  key  long  serialVersionUID  
[buglab_swap_variables]^decorated (  ) .put ( key ) ;^269^^^^^261^276^decorated (  ) .put ( key, coll ) ;^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] put [RETURN_TYPE] Object   final K key Object value [VARIABLES] boolean  result  Iterator  iterator  Factory  collectionFactory  Collection  coll  values  valuesForKey  valuesView  Object  key  value  Class  clazz  collectionClass  K  key  long  serialVersionUID  
[buglab_swap_variables]^return value ? result : null;^275^^^^^261^276^return result ? value : null;^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] put [RETURN_TYPE] Object   final K key Object value [VARIABLES] boolean  result  Iterator  iterator  Factory  collectionFactory  Collection  coll  values  valuesForKey  valuesView  Object  key  value  Class  clazz  collectionClass  K  key  long  serialVersionUID  
[buglab_swap_variables]^return value.contains ( coll ) ;^343^^^^^338^344^return coll.contains ( value ) ;^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] containsValue [RETURN_TYPE] boolean   Object key Object value [VARIABLES] boolean  Iterator  iterator  Factory  collectionFactory  Collection  coll  values  valuesForKey  valuesView  vs  Object  key  value  Class  clazz  collectionClass  long  serialVersionUID  
[buglab_swap_variables]^result = values.addAll ( coll ) ;^395^^^^^380^398^result = coll.addAll ( values ) ;^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] putAll [RETURN_TYPE] boolean   final K key Collection<V> values [VARIABLES] boolean  result  Iterator  iterator  Factory  collectionFactory  Collection  coll  values  valuesForKey  valuesView  vs  Object  key  value  Class  clazz  collectionClass  K  key  long  serialVersionUID  
[buglab_swap_variables]^decorated (  ) .put ( coll, key ) ;^391^^^^^380^398^decorated (  ) .put ( key, coll ) ;^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] putAll [RETURN_TYPE] boolean   final K key Collection<V> values [VARIABLES] boolean  result  Iterator  iterator  Factory  collectionFactory  Collection  coll  values  valuesForKey  valuesView  vs  Object  key  value  Class  clazz  collectionClass  K  key  long  serialVersionUID  
[buglab_swap_variables]^decorated (  ) .put (  coll ) ;^391^^^^^380^398^decorated (  ) .put ( key, coll ) ;^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] putAll [RETURN_TYPE] boolean   final K key Collection<V> values [VARIABLES] boolean  result  Iterator  iterator  Factory  collectionFactory  Collection  coll  values  valuesForKey  valuesView  vs  Object  key  value  Class  clazz  collectionClass  K  key  long  serialVersionUID  
[buglab_swap_variables]^decorated (  ) .put ( key ) ;^391^^^^^380^398^decorated (  ) .put ( key, coll ) ;^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] putAll [RETURN_TYPE] boolean   final K key Collection<V> values [VARIABLES] boolean  result  Iterator  iterator  Factory  collectionFactory  Collection  coll  values  valuesForKey  valuesView  vs  Object  key  value  Class  clazz  collectionClass  K  key  long  serialVersionUID  
[buglab_swap_variables]^return new TransformIterator<V, Entry<K, V>> ( new ValuesIterator ( transformer ) , key ) ;^451^^^^^425^454^return new TransformIterator<V, Entry<K, V>> ( new ValuesIterator ( key ) , transformer ) ;^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] iterator [RETURN_TYPE] Iterator   [VARIABLES] Transformer  transformer  boolean  V  input  value  Iterator  iterator  keyIterator  Factory  collectionFactory  Collection  allKeys  coll  values  valuesForKey  valuesView  vs  Object  key  value  Class  clazz  collectionClass  K  key  long  serialVersionUID  int  count  
[buglab_swap_variables]^return new TransformIterator<V, Entry<K, V>> ( new ValuesIterator ( key )  ) ;^451^^^^^425^454^return new TransformIterator<V, Entry<K, V>> ( new ValuesIterator ( key ) , transformer ) ;^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] iterator [RETURN_TYPE] Iterator   [VARIABLES] Transformer  transformer  boolean  V  input  value  Iterator  iterator  keyIterator  Factory  collectionFactory  Collection  allKeys  coll  values  valuesForKey  valuesView  vs  Object  key  value  Class  clazz  collectionClass  K  key  long  serialVersionUID  int  count  
[buglab_swap_variables]^return new TransformIterator<V, Entry<K, V>> ( new ValuesIterator ( transformer ) , key ) ;^451^^^^^431^452^return new TransformIterator<V, Entry<K, V>> ( new ValuesIterator ( key ) , transformer ) ;^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] nextIterator [RETURN_TYPE] Iterator   int count [VARIABLES] Transformer  transformer  boolean  V  input  value  Iterator  iterator  keyIterator  Factory  collectionFactory  Collection  allKeys  coll  values  valuesForKey  valuesView  vs  Object  key  value  Class  clazz  collectionClass  K  key  long  serialVersionUID  int  count  
[buglab_swap_variables]^return new TransformIterator<V, Entry<K, V>> ( new ValuesIterator ( key )  ) ;^451^^^^^431^452^return new TransformIterator<V, Entry<K, V>> ( new ValuesIterator ( key ) , transformer ) ;^[CLASS] MultiValueMap 1 1 1 Values ValuesIterator ReflectionFactory  [METHOD] nextIterator [RETURN_TYPE] Iterator   int count [VARIABLES] Transformer  transformer  boolean  V  input  value  Iterator  iterator  keyIterator  Factory  collectionFactory  Collection  allKeys  coll  values  valuesForKey  valuesView  vs  Object  key  value  Class  clazz  collectionClass  K  key  long  serialVersionUID  int  count  
[buglab_swap_variables]^return new TransformIterator<V, Entry<K, V>> ( new ValuesIterator ( transformer ) , key ) ;^451^^^^^431^452^return new TransformIterator<V, Entry<K, V>> ( new ValuesIterator ( key ) , transformer ) ;^[CLASS] 1 1 1  [METHOD] nextIterator [RETURN_TYPE] Iterator   int count [VARIABLES] Transformer  transformer  boolean  V  input  value  K  key  int  count  
[buglab_swap_variables]^return new TransformIterator<V, Entry<K, V>> ( new ValuesIterator ( key )  ) ;^451^^^^^431^452^return new TransformIterator<V, Entry<K, V>> ( new ValuesIterator ( key ) , transformer ) ;^[CLASS] 1 1 1  [METHOD] nextIterator [RETURN_TYPE] Iterator   int count [VARIABLES] Transformer  transformer  boolean  V  input  value  K  key  int  count  
