[buglab_swap_variables]^super ( listClazz, map ) ;^55^^^^^54^56^super ( map, listClazz ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] <init> [RETURN_TYPE] Class)   Map<K, ? super C> map Class<C> listClazz [VARIABLES] boolean  Object  key  List  values  Class  listClazz  ListIterator  iterator  Map  map  long  serialVersionUID  
[buglab_swap_variables]^super (  listClazz ) ;^55^^^^^54^56^super ( map, listClazz ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] <init> [RETURN_TYPE] Class)   Map<K, ? super C> map Class<C> listClazz [VARIABLES] boolean  Object  key  List  values  Class  listClazz  ListIterator  iterator  Map  map  long  serialVersionUID  
[buglab_swap_variables]^super ( map ) ;^55^^^^^54^56^super ( map, listClazz ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] <init> [RETURN_TYPE] Class)   Map<K, ? super C> map Class<C> listClazz [VARIABLES] boolean  Object  key  List  values  Class  listClazz  ListIterator  iterator  Map  map  long  serialVersionUID  
[buglab_swap_variables]^super ( initialListCapacity, listClazz, map ) ;^70^^^^^68^71^super ( map, listClazz, initialListCapacity ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] <init> [RETURN_TYPE] Class,int)   Map<K, ? super C> map Class<C> listClazz final int initialListCapacity [VARIABLES] boolean  Object  key  List  values  Class  listClazz  ListIterator  iterator  Map  map  long  serialVersionUID  int  initialListCapacity  
[buglab_swap_variables]^super (  listClazz, initialListCapacity ) ;^70^^^^^68^71^super ( map, listClazz, initialListCapacity ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] <init> [RETURN_TYPE] Class,int)   Map<K, ? super C> map Class<C> listClazz final int initialListCapacity [VARIABLES] boolean  Object  key  List  values  Class  listClazz  ListIterator  iterator  Map  map  long  serialVersionUID  int  initialListCapacity  
[buglab_swap_variables]^super ( listClazz, map, initialListCapacity ) ;^70^^^^^68^71^super ( map, listClazz, initialListCapacity ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] <init> [RETURN_TYPE] Class,int)   Map<K, ? super C> map Class<C> listClazz final int initialListCapacity [VARIABLES] boolean  Object  key  List  values  Class  listClazz  ListIterator  iterator  Map  map  long  serialVersionUID  int  initialListCapacity  
[buglab_swap_variables]^super ( map,  initialListCapacity ) ;^70^^^^^68^71^super ( map, listClazz, initialListCapacity ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] <init> [RETURN_TYPE] Class,int)   Map<K, ? super C> map Class<C> listClazz final int initialListCapacity [VARIABLES] boolean  Object  key  List  values  Class  listClazz  ListIterator  iterator  Map  map  long  serialVersionUID  int  initialListCapacity  
[buglab_swap_variables]^super ( map, listClazz ) ;^70^^^^^68^71^super ( map, listClazz, initialListCapacity ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] <init> [RETURN_TYPE] Class,int)   Map<K, ? super C> map Class<C> listClazz final int initialListCapacity [VARIABLES] boolean  Object  key  List  values  Class  listClazz  ListIterator  iterator  Map  map  long  serialVersionUID  int  initialListCapacity  
[buglab_swap_variables]^this.iterator = index.listIterator ( values ) ;^267^^^^^264^268^this.iterator = values.listIterator ( index ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] <init> [RETURN_TYPE] Object,int)   Object key int index [VARIABLES] Object  key  List  values  boolean  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^if  ( ListUtils.isEqualList ( otherList, list )  == false )  {^124^^^^^102^129^if  ( ListUtils.isEqualList ( list, otherList )  == false )  {^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] ListValuedMap  other  boolean  Iterator  it  Object  key  obj  List  list  otherList  values  ListIterator  iterator  long  serialVersionUID  
[buglab_swap_variables]^if  ( ListUtils.isEqualList (  otherList )  == false )  {^124^^^^^102^129^if  ( ListUtils.isEqualList ( list, otherList )  == false )  {^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] ListValuedMap  other  boolean  Iterator  it  Object  key  obj  List  list  otherList  values  ListIterator  iterator  long  serialVersionUID  
[buglab_swap_variables]^if  ( ListUtils.isEqualList ( list )  == false )  {^124^^^^^102^129^if  ( ListUtils.isEqualList ( list, otherList )  == false )  {^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] ListValuedMap  other  boolean  Iterator  it  Object  key  obj  List  list  otherList  values  ListIterator  iterator  long  serialVersionUID  
[buglab_swap_variables]^List<?> keyList = other.get ( other ) ;^120^^^^^102^129^List<?> otherList = other.get ( key ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] ListValuedMap  other  boolean  Iterator  it  Object  key  obj  List  list  otherList  values  ListIterator  iterator  long  serialVersionUID  
[buglab_swap_variables]^h +=  ( valueList == null ? 0 : key.hashCode (  )  )  ^ ListUtils.hashCodeForList ( key ) ;^139^^^^^132^142^h +=  ( key == null ? 0 : key.hashCode (  )  )  ^ ListUtils.hashCodeForList ( valueList ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] Entry  entry  boolean  Iterator  it  Object  key  obj  List  list  otherList  valueList  values  K  key  ListIterator  iterator  long  serialVersionUID  int  h  
[buglab_swap_variables]^list.add (  value ) ;^158^^^^^154^162^list.add ( index, value ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] add [RETURN_TYPE] void   int index V value [VARIABLES] boolean  V  value  Object  key  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^list.add ( value, index ) ;^158^^^^^154^162^list.add ( index, value ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] add [RETURN_TYPE] void   int index V value [VARIABLES] boolean  V  value  Object  key  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^list.add ( index ) ;^158^^^^^154^162^list.add ( index, value ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] add [RETURN_TYPE] void   int index V value [VARIABLES] boolean  V  value  Object  key  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^getMap (  ) .put (  ( K )  key ) ;^159^^^^^154^162^getMap (  ) .put (  ( K )  key, list ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] add [RETURN_TYPE] void   int index V value [VARIABLES] boolean  V  value  Object  key  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^list.add ( value, index ) ;^161^^^^^154^162^list.add ( index, value ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] add [RETURN_TYPE] void   int index V value [VARIABLES] boolean  V  value  Object  key  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^list.add (  value ) ;^161^^^^^154^162^list.add ( index, value ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] add [RETURN_TYPE] void   int index V value [VARIABLES] boolean  V  value  Object  key  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^list.add ( index ) ;^161^^^^^154^162^list.add ( index, value ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] add [RETURN_TYPE] void   int index V value [VARIABLES] boolean  V  value  Object  key  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^getMap (  ) .put (  ( K )  key ) ;^171^^^^^165^176^getMap (  ) .put (  ( K )  key, list ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  Object  key  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^boolean result = index.addAll ( list, c ) ;^169^^^^^165^176^boolean result = list.addAll ( index, c ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  Object  key  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^boolean result = list.addAll ( c, index ) ;^169^^^^^165^176^boolean result = list.addAll ( index, c ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  Object  key  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^boolean result = list.addAll (  c ) ;^169^^^^^165^176^boolean result = list.addAll ( index, c ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  Object  key  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^boolean result = list.addAll ( index ) ;^169^^^^^165^176^boolean result = list.addAll ( index, c ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  Object  key  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^boolean result = c.addAll ( index, list ) ;^169^^^^^165^176^boolean result = list.addAll ( index, c ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  Object  key  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^return index.addAll ( list, c ) ;^175^^^^^165^176^return list.addAll ( index, c ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  Object  key  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^return list.addAll ( c, index ) ;^175^^^^^165^176^return list.addAll ( index, c ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  Object  key  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^return list.addAll (  c ) ;^175^^^^^165^176^return list.addAll ( index, c ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  Object  key  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^return list.addAll ( index ) ;^175^^^^^165^176^return list.addAll ( index, c ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  Object  key  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^return c.addAll ( index, list ) ;^175^^^^^165^176^return list.addAll ( index, c ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  Object  key  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^return index.get ( list ) ;^180^^^^^178^181^return list.get ( index ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] get [RETURN_TYPE] V   int index [VARIABLES] Object  key  obj  List  list  otherList  valueList  values  boolean  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^return o.indexOf ( list ) ;^185^^^^^183^186^return list.indexOf ( o ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] indexOf [RETURN_TYPE] int   Object o [VARIABLES] Object  key  o  obj  List  list  otherList  valueList  values  boolean  ListIterator  iterator  long  serialVersionUID  
[buglab_swap_variables]^return o.indexOf ( list ) ;^190^^^^^188^191^return list.indexOf ( o ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] lastIndexOf [RETURN_TYPE] int   Object o [VARIABLES] Object  key  o  obj  List  list  otherList  valueList  values  boolean  ListIterator  iterator  long  serialVersionUID  
[buglab_swap_variables]^return new ValuesListIterator ( index, key ) ;^198^^^^^197^199^return new ValuesListIterator ( key, index ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] listIterator [RETURN_TYPE] ListIterator   int index [VARIABLES] Object  key  o  obj  List  list  otherList  valueList  values  boolean  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^return new ValuesListIterator ( key ) ;^198^^^^^197^199^return new ValuesListIterator ( key, index ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] listIterator [RETURN_TYPE] ListIterator   int index [VARIABLES] Object  key  o  obj  List  list  otherList  valueList  values  boolean  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^return new ValuesListIterator (  index ) ;^198^^^^^197^199^return new ValuesListIterator ( key, index ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] listIterator [RETURN_TYPE] ListIterator   int index [VARIABLES] Object  key  o  obj  List  list  otherList  valueList  values  boolean  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^V value = index.remove ( list ) ;^203^^^^^201^208^V value = list.remove ( index ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] remove [RETURN_TYPE] V   int index [VARIABLES] boolean  V  value  Object  key  o  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^return index.set ( list, value ) ;^212^^^^^210^213^return list.set ( index, value ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] set [RETURN_TYPE] V   int index V value [VARIABLES] boolean  V  value  Object  key  o  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^return list.set (  value ) ;^212^^^^^210^213^return list.set ( index, value ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] set [RETURN_TYPE] V   int index V value [VARIABLES] boolean  V  value  Object  key  o  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^return value.set ( index, list ) ;^212^^^^^210^213^return list.set ( index, value ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] set [RETURN_TYPE] V   int index V value [VARIABLES] boolean  V  value  Object  key  o  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^return list.set ( index ) ;^212^^^^^210^213^return list.set ( index, value ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] set [RETURN_TYPE] V   int index V value [VARIABLES] boolean  V  value  Object  key  o  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^return list.set ( value, index ) ;^212^^^^^210^213^return list.set ( index, value ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] set [RETURN_TYPE] V   int index V value [VARIABLES] boolean  V  value  Object  key  o  obj  List  list  otherList  valueList  values  ListIterator  iterator  long  serialVersionUID  int  index  
[buglab_swap_variables]^return fromIndex.subList ( list, toIndex ) ;^217^^^^^215^218^return list.subList ( fromIndex, toIndex ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] subList [RETURN_TYPE] List   int fromIndex int toIndex [VARIABLES] Object  key  o  obj  List  list  otherList  valueList  values  boolean  ListIterator  iterator  long  serialVersionUID  int  fromIndex  toIndex  
[buglab_swap_variables]^return list.subList (  toIndex ) ;^217^^^^^215^218^return list.subList ( fromIndex, toIndex ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] subList [RETURN_TYPE] List   int fromIndex int toIndex [VARIABLES] Object  key  o  obj  List  list  otherList  valueList  values  boolean  ListIterator  iterator  long  serialVersionUID  int  fromIndex  toIndex  
[buglab_swap_variables]^return toIndex.subList ( fromIndex, list ) ;^217^^^^^215^218^return list.subList ( fromIndex, toIndex ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] subList [RETURN_TYPE] List   int fromIndex int toIndex [VARIABLES] Object  key  o  obj  List  list  otherList  valueList  values  boolean  ListIterator  iterator  long  serialVersionUID  int  fromIndex  toIndex  
[buglab_swap_variables]^return list.subList ( fromIndex ) ;^217^^^^^215^218^return list.subList ( fromIndex, toIndex ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] subList [RETURN_TYPE] List   int fromIndex int toIndex [VARIABLES] Object  key  o  obj  List  list  otherList  valueList  values  boolean  ListIterator  iterator  long  serialVersionUID  int  fromIndex  toIndex  
[buglab_swap_variables]^return list.subList ( toIndex, fromIndex ) ;^217^^^^^215^218^return list.subList ( fromIndex, toIndex ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] subList [RETURN_TYPE] List   int fromIndex int toIndex [VARIABLES] Object  key  o  obj  List  list  otherList  valueList  values  boolean  ListIterator  iterator  long  serialVersionUID  int  fromIndex  toIndex  
[buglab_swap_variables]^if  ( ListUtils.isEqualList ( otherList, list )  == false )  {^233^^^^^221^237^if  ( ListUtils.isEqualList ( list, otherList )  == false )  {^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] equals [RETURN_TYPE] boolean   Object other [VARIABLES] Object  key  o  obj  other  List  list  otherList  valueList  values  boolean  ListIterator  iterator  long  serialVersionUID  
[buglab_swap_variables]^if  ( ListUtils.isEqualList (  otherList )  == false )  {^233^^^^^221^237^if  ( ListUtils.isEqualList ( list, otherList )  == false )  {^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] equals [RETURN_TYPE] boolean   Object other [VARIABLES] Object  key  o  obj  other  List  list  otherList  valueList  values  boolean  ListIterator  iterator  long  serialVersionUID  
[buglab_swap_variables]^if  ( ListUtils.isEqualList ( list )  == false )  {^233^^^^^221^237^if  ( ListUtils.isEqualList ( list, otherList )  == false )  {^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] equals [RETURN_TYPE] boolean   Object other [VARIABLES] Object  key  o  obj  other  List  list  otherList  valueList  values  boolean  ListIterator  iterator  long  serialVersionUID  
[buglab_swap_variables]^getMap (  ) .put (  ( K )  key ) ;^274^^^^^271^279^getMap (  ) .put (  ( K )  key, list ) ;^[CLASS] AbstractListValuedMap WrappedList ValuesListIterator  [METHOD] add [RETURN_TYPE] void   V value [VARIABLES] Object  key  o  obj  other  List  list  otherList  valueList  values  boolean  ListIterator  iterator  long  serialVersionUID  V  value  
[buglab_swap_variables]^list.add ( value, index ) ;^158^^^^^154^162^list.add ( index, value ) ;^[CLASS] WrappedList  [METHOD] add [RETURN_TYPE] void   int index V value [VARIABLES] boolean  V  value  List  list  int  index  
[buglab_swap_variables]^list.add (  value ) ;^158^^^^^154^162^list.add ( index, value ) ;^[CLASS] WrappedList  [METHOD] add [RETURN_TYPE] void   int index V value [VARIABLES] boolean  V  value  List  list  int  index  
[buglab_swap_variables]^list.add ( index ) ;^158^^^^^154^162^list.add ( index, value ) ;^[CLASS] WrappedList  [METHOD] add [RETURN_TYPE] void   int index V value [VARIABLES] boolean  V  value  List  list  int  index  
[buglab_swap_variables]^getMap (  ) .put (  ( K )  key ) ;^159^^^^^154^162^getMap (  ) .put (  ( K )  key, list ) ;^[CLASS] WrappedList  [METHOD] add [RETURN_TYPE] void   int index V value [VARIABLES] boolean  V  value  List  list  int  index  
[buglab_swap_variables]^list.add ( value, index ) ;^161^^^^^154^162^list.add ( index, value ) ;^[CLASS] WrappedList  [METHOD] add [RETURN_TYPE] void   int index V value [VARIABLES] boolean  V  value  List  list  int  index  
[buglab_swap_variables]^list.add (  value ) ;^161^^^^^154^162^list.add ( index, value ) ;^[CLASS] WrappedList  [METHOD] add [RETURN_TYPE] void   int index V value [VARIABLES] boolean  V  value  List  list  int  index  
[buglab_swap_variables]^list.add ( index ) ;^161^^^^^154^162^list.add ( index, value ) ;^[CLASS] WrappedList  [METHOD] add [RETURN_TYPE] void   int index V value [VARIABLES] boolean  V  value  List  list  int  index  
[buglab_swap_variables]^getMap (  ) .put (  ( K )  key ) ;^171^^^^^165^176^getMap (  ) .put (  ( K )  key, list ) ;^[CLASS] WrappedList  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  List  list  int  index  
[buglab_swap_variables]^boolean result = index.addAll ( list, c ) ;^169^^^^^165^176^boolean result = list.addAll ( index, c ) ;^[CLASS] WrappedList  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  List  list  int  index  
[buglab_swap_variables]^boolean result = list.addAll (  c ) ;^169^^^^^165^176^boolean result = list.addAll ( index, c ) ;^[CLASS] WrappedList  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  List  list  int  index  
[buglab_swap_variables]^boolean result = c.addAll ( index, list ) ;^169^^^^^165^176^boolean result = list.addAll ( index, c ) ;^[CLASS] WrappedList  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  List  list  int  index  
[buglab_swap_variables]^boolean result = list.addAll ( index ) ;^169^^^^^165^176^boolean result = list.addAll ( index, c ) ;^[CLASS] WrappedList  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  List  list  int  index  
[buglab_swap_variables]^boolean result = list.addAll ( c, index ) ;^169^^^^^165^176^boolean result = list.addAll ( index, c ) ;^[CLASS] WrappedList  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  List  list  int  index  
[buglab_swap_variables]^return index.addAll ( list, c ) ;^175^^^^^165^176^return list.addAll ( index, c ) ;^[CLASS] WrappedList  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  List  list  int  index  
[buglab_swap_variables]^return list.addAll (  c ) ;^175^^^^^165^176^return list.addAll ( index, c ) ;^[CLASS] WrappedList  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  List  list  int  index  
[buglab_swap_variables]^return c.addAll ( index, list ) ;^175^^^^^165^176^return list.addAll ( index, c ) ;^[CLASS] WrappedList  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  List  list  int  index  
[buglab_swap_variables]^return list.addAll ( index ) ;^175^^^^^165^176^return list.addAll ( index, c ) ;^[CLASS] WrappedList  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  List  list  int  index  
[buglab_swap_variables]^return list.addAll ( c, index ) ;^175^^^^^165^176^return list.addAll ( index, c ) ;^[CLASS] WrappedList  [METHOD] addAll [RETURN_TYPE] boolean   int index Collection<? extends V> c [VARIABLES] boolean  result  Collection  c  List  list  int  index  
[buglab_swap_variables]^return index.get ( list ) ;^180^^^^^178^181^return list.get ( index ) ;^[CLASS] WrappedList  [METHOD] get [RETURN_TYPE] V   int index [VARIABLES] boolean  List  list  int  index  
[buglab_swap_variables]^return o.indexOf ( list ) ;^185^^^^^183^186^return list.indexOf ( o ) ;^[CLASS] WrappedList  [METHOD] indexOf [RETURN_TYPE] int   Object o [VARIABLES] boolean  Object  o  List  list  
[buglab_swap_variables]^return o.indexOf ( list ) ;^190^^^^^188^191^return list.indexOf ( o ) ;^[CLASS] WrappedList  [METHOD] lastIndexOf [RETURN_TYPE] int   Object o [VARIABLES] boolean  Object  o  List  list  
[buglab_swap_variables]^return new ValuesListIterator ( index, key ) ;^198^^^^^197^199^return new ValuesListIterator ( key, index ) ;^[CLASS] WrappedList  [METHOD] listIterator [RETURN_TYPE] ListIterator   int index [VARIABLES] boolean  int  index  
[buglab_swap_variables]^return new ValuesListIterator ( key ) ;^198^^^^^197^199^return new ValuesListIterator ( key, index ) ;^[CLASS] WrappedList  [METHOD] listIterator [RETURN_TYPE] ListIterator   int index [VARIABLES] boolean  int  index  
[buglab_swap_variables]^return new ValuesListIterator (  index ) ;^198^^^^^197^199^return new ValuesListIterator ( key, index ) ;^[CLASS] WrappedList  [METHOD] listIterator [RETURN_TYPE] ListIterator   int index [VARIABLES] boolean  int  index  
[buglab_swap_variables]^V value = index.remove ( list ) ;^203^^^^^201^208^V value = list.remove ( index ) ;^[CLASS] WrappedList  [METHOD] remove [RETURN_TYPE] V   int index [VARIABLES] boolean  V  value  List  list  int  index  
[buglab_swap_variables]^return index.set ( list, value ) ;^212^^^^^210^213^return list.set ( index, value ) ;^[CLASS] WrappedList  [METHOD] set [RETURN_TYPE] V   int index V value [VARIABLES] boolean  V  value  List  list  int  index  
[buglab_swap_variables]^return list.set ( value, index ) ;^212^^^^^210^213^return list.set ( index, value ) ;^[CLASS] WrappedList  [METHOD] set [RETURN_TYPE] V   int index V value [VARIABLES] boolean  V  value  List  list  int  index  
[buglab_swap_variables]^return list.set (  value ) ;^212^^^^^210^213^return list.set ( index, value ) ;^[CLASS] WrappedList  [METHOD] set [RETURN_TYPE] V   int index V value [VARIABLES] boolean  V  value  List  list  int  index  
[buglab_swap_variables]^return list.set ( index ) ;^212^^^^^210^213^return list.set ( index, value ) ;^[CLASS] WrappedList  [METHOD] set [RETURN_TYPE] V   int index V value [VARIABLES] boolean  V  value  List  list  int  index  
[buglab_swap_variables]^return value.set ( index, list ) ;^212^^^^^210^213^return list.set ( index, value ) ;^[CLASS] WrappedList  [METHOD] set [RETURN_TYPE] V   int index V value [VARIABLES] boolean  V  value  List  list  int  index  
[buglab_swap_variables]^return fromIndex.subList ( list, toIndex ) ;^217^^^^^215^218^return list.subList ( fromIndex, toIndex ) ;^[CLASS] WrappedList  [METHOD] subList [RETURN_TYPE] List   int fromIndex int toIndex [VARIABLES] boolean  List  list  int  fromIndex  toIndex  
[buglab_swap_variables]^return list.subList ( toIndex, fromIndex ) ;^217^^^^^215^218^return list.subList ( fromIndex, toIndex ) ;^[CLASS] WrappedList  [METHOD] subList [RETURN_TYPE] List   int fromIndex int toIndex [VARIABLES] boolean  List  list  int  fromIndex  toIndex  
[buglab_swap_variables]^return list.subList (  toIndex ) ;^217^^^^^215^218^return list.subList ( fromIndex, toIndex ) ;^[CLASS] WrappedList  [METHOD] subList [RETURN_TYPE] List   int fromIndex int toIndex [VARIABLES] boolean  List  list  int  fromIndex  toIndex  
[buglab_swap_variables]^return toIndex.subList ( fromIndex, list ) ;^217^^^^^215^218^return list.subList ( fromIndex, toIndex ) ;^[CLASS] WrappedList  [METHOD] subList [RETURN_TYPE] List   int fromIndex int toIndex [VARIABLES] boolean  List  list  int  fromIndex  toIndex  
[buglab_swap_variables]^return list.subList ( fromIndex ) ;^217^^^^^215^218^return list.subList ( fromIndex, toIndex ) ;^[CLASS] WrappedList  [METHOD] subList [RETURN_TYPE] List   int fromIndex int toIndex [VARIABLES] boolean  List  list  int  fromIndex  toIndex  
[buglab_swap_variables]^if  ( ListUtils.isEqualList ( otherList, list )  == false )  {^233^^^^^221^237^if  ( ListUtils.isEqualList ( list, otherList )  == false )  {^[CLASS] WrappedList  [METHOD] equals [RETURN_TYPE] boolean   Object other [VARIABLES] boolean  Object  other  List  list  otherList  
[buglab_swap_variables]^if  ( ListUtils.isEqualList (  otherList )  == false )  {^233^^^^^221^237^if  ( ListUtils.isEqualList ( list, otherList )  == false )  {^[CLASS] WrappedList  [METHOD] equals [RETURN_TYPE] boolean   Object other [VARIABLES] boolean  Object  other  List  list  otherList  
[buglab_swap_variables]^if  ( ListUtils.isEqualList ( list )  == false )  {^233^^^^^221^237^if  ( ListUtils.isEqualList ( list, otherList )  == false )  {^[CLASS] WrappedList  [METHOD] equals [RETURN_TYPE] boolean   Object other [VARIABLES] boolean  Object  other  List  list  otherList  
[buglab_swap_variables]^this.iterator = index.listIterator ( values ) ;^267^^^^^264^268^this.iterator = values.listIterator ( index ) ;^[CLASS] ValuesListIterator  [METHOD] <init> [RETURN_TYPE] Object,int)   Object key int index [VARIABLES] Object  key  List  values  boolean  ListIterator  iterator  int  index  
[buglab_swap_variables]^getMap (  ) .put (  ( K )  key ) ;^274^^^^^271^279^getMap (  ) .put (  ( K )  key, list ) ;^[CLASS] ValuesListIterator  [METHOD] add [RETURN_TYPE] void   V value [VARIABLES] Object  key  List  list  values  boolean  ListIterator  iterator  V  value  
