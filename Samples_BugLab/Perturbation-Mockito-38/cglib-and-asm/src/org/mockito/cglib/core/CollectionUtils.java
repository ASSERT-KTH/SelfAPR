[buglab_swap_variables]^buckets.put (  bucket = new LinkedList (  )  ) ;^35^^^^^28^40^buckets.put ( key, bucket = new LinkedList (  )  ) ;^[CLASS] CollectionUtils  [METHOD] bucket [RETURN_TYPE] Map   Collection c Transformer t [VARIABLES] Transformer  t  boolean  Iterator  it  Collection  c  Object  key  value  List  bucket  Map  buckets  
[buglab_swap_variables]^Object key = value.transform ( t ) ;^32^^^^^28^40^Object key = t.transform ( value ) ;^[CLASS] CollectionUtils  [METHOD] bucket [RETURN_TYPE] Map   Collection c Transformer t [VARIABLES] Transformer  t  boolean  Iterator  it  Collection  c  Object  key  value  List  bucket  Map  buckets  
[buglab_swap_variables]^List bucket =  ( List ) key.get ( buckets ) ;^33^^^^^28^40^List bucket =  ( List ) buckets.get ( key ) ;^[CLASS] CollectionUtils  [METHOD] bucket [RETURN_TYPE] Map   Collection c Transformer t [VARIABLES] Transformer  t  boolean  Iterator  it  Collection  c  Object  key  value  List  bucket  Map  buckets  
[buglab_swap_variables]^for  ( Iterator source = it.keySet (  ) .iterator (  ) ; it.hasNext (  ) ; )  {^43^^^^^42^47^for  ( Iterator it = source.keySet (  ) .iterator (  ) ; it.hasNext (  ) ; )  {^[CLASS] CollectionUtils  [METHOD] reverse [RETURN_TYPE] void   Map source Map target [VARIABLES] boolean  Iterator  it  Object  key  Map  source  target  
[buglab_swap_variables]^target.put ( source.get ( key )  ) ;^45^^^^^42^47^target.put ( source.get ( key ) , key ) ;^[CLASS] CollectionUtils  [METHOD] reverse [RETURN_TYPE] void   Map source Map target [VARIABLES] boolean  Iterator  it  Object  key  Map  source  target  
[buglab_swap_variables]^target.put ( key.get ( source ) , key ) ;^45^^^^^42^47^target.put ( source.get ( key ) , key ) ;^[CLASS] CollectionUtils  [METHOD] reverse [RETURN_TYPE] void   Map source Map target [VARIABLES] boolean  Iterator  it  Object  key  Map  source  target  
[buglab_swap_variables]^result.add ( it.transform ( t.next (  )  )  ) ;^62^^^^^59^65^result.add ( t.transform ( it.next (  )  )  ) ;^[CLASS] CollectionUtils  [METHOD] transform [RETURN_TYPE] List   Collection c Transformer t [VARIABLES] Transformer  t  boolean  Iterator  it  Collection  c  List  result  
[buglab_swap_variables]^for  ( Iterator list = it.iterator (  ) ; it.hasNext (  ) ; )  {^70^^^^^67^74^for  ( Iterator it = list.iterator (  ) ; it.hasNext (  ) ; )  {^[CLASS] CollectionUtils  [METHOD] getIndexMap [RETURN_TYPE] Map   List list [VARIABLES] boolean  Iterator  it  List  list  Map  indexes  int  index  
