[buglab_swap_variables]^final Integer position = obj.put ( map, Integer.valueOf ( counter++ )  ) ;^184^^^^^182^186^final Integer position = map.put ( obj, Integer.valueOf ( counter++ )  ) ;^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] add [RETURN_TYPE] boolean   final T obj [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  Integer  position  boolean  isLocked  T  obj  Map  map  long  serialVersionUID  int  counter  
[buglab_swap_variables]^final Integer position = map.put (  Integer.valueOf ( counter++ )  ) ;^184^^^^^182^186^final Integer position = map.put ( obj, Integer.valueOf ( counter++ )  ) ;^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] add [RETURN_TYPE] boolean   final T obj [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  Integer  position  boolean  isLocked  T  obj  Map  map  long  serialVersionUID  int  counter  
[buglab_swap_variables]^final Integer position = existingObj.get ( map ) ;^203^^^^^201^209^final Integer position = map.get ( existingObj ) ;^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] addAsEqual [RETURN_TYPE] boolean   final T existingObj final T newObj [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  Integer  position  result  boolean  isLocked  T  existingObj  newObj  Map  map  long  serialVersionUID  int  counter  
[buglab_swap_variables]^final Integer result = newObj.put ( map, position ) ;^207^^^^^201^209^final Integer result = map.put ( newObj, position ) ;^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] addAsEqual [RETURN_TYPE] boolean   final T existingObj final T newObj [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  Integer  position  result  boolean  isLocked  T  existingObj  newObj  Map  map  long  serialVersionUID  int  counter  
[buglab_swap_variables]^final Integer result = map.put (  position ) ;^207^^^^^201^209^final Integer result = map.put ( newObj, position ) ;^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] addAsEqual [RETURN_TYPE] boolean   final T existingObj final T newObj [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  Integer  position  result  boolean  isLocked  T  existingObj  newObj  Map  map  long  serialVersionUID  int  counter  
[buglab_swap_variables]^final Integer result = position.put ( newObj, map ) ;^207^^^^^201^209^final Integer result = map.put ( newObj, position ) ;^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] addAsEqual [RETURN_TYPE] boolean   final T existingObj final T newObj [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  Integer  position  result  boolean  isLocked  T  existingObj  newObj  Map  map  long  serialVersionUID  int  counter  
[buglab_swap_variables]^final Integer result = map.put ( newObj ) ;^207^^^^^201^209^final Integer result = map.put ( newObj, position ) ;^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] addAsEqual [RETURN_TYPE] boolean   final T existingObj final T newObj [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  Integer  position  result  boolean  isLocked  T  existingObj  newObj  Map  map  long  serialVersionUID  int  counter  
[buglab_swap_variables]^final Integer result = map.put ( position, newObj ) ;^207^^^^^201^209^final Integer result = map.put ( newObj, position ) ;^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] addAsEqual [RETURN_TYPE] boolean   final T existingObj final T newObj [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  Integer  position  result  boolean  isLocked  T  existingObj  newObj  Map  map  long  serialVersionUID  int  counter  
[buglab_swap_variables]^final Integer position1 = obj1.get ( map ) ;^229^^^^^227^247^final Integer position1 = map.get ( obj1 ) ;^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] compare [RETURN_TYPE] int   final T obj1 final T obj2 [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  Integer  position1  position2  boolean  isLocked  T  obj1  obj2  Object  unknownObj  Map  map  long  serialVersionUID  int  counter  
[buglab_swap_variables]^final Integer position2 = obj2.get ( map ) ;^230^^^^^227^247^final Integer position2 = map.get ( obj2 ) ;^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] compare [RETURN_TYPE] int   final T obj1 final T obj2 [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  Integer  position1  position2  boolean  isLocked  T  obj1  obj2  Object  unknownObj  Map  map  long  serialVersionUID  int  counter  
[buglab_swap_variables]^if  ( position2 == null || position1 == null )  {^231^^^^^227^247^if  ( position1 == null || position2 == null )  {^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] compare [RETURN_TYPE] int   final T obj1 final T obj2 [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  Integer  position1  position2  boolean  isLocked  T  obj1  obj2  Object  unknownObj  Map  map  long  serialVersionUID  int  counter  
[buglab_swap_variables]^return position2 == null ? position1 == null ? 0 : -1 : 1;^234^^^^^227^247^return position1 == null ? position2 == null ? 0 : -1 : 1;^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] compare [RETURN_TYPE] int   final T obj1 final T obj2 [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  Integer  position1  position2  boolean  isLocked  T  obj1  obj2  Object  unknownObj  Map  map  long  serialVersionUID  int  counter  
[buglab_swap_variables]^return position2 == null ? position1 == null ? 0 : 1 : -1;^236^^^^^227^247^return position1 == null ? position2 == null ? 0 : 1 : -1;^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] compare [RETURN_TYPE] int   final T obj1 final T obj2 [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  Integer  position1  position2  boolean  isLocked  T  obj1  obj2  Object  unknownObj  Map  map  long  serialVersionUID  int  counter  
[buglab_swap_variables]^final Object unknownObj = obj2 == null ? obj1 : position1;^238^^^^^227^247^final Object unknownObj = position1 == null ? obj1 : obj2;^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] compare [RETURN_TYPE] int   final T obj1 final T obj2 [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  Integer  position1  position2  boolean  isLocked  T  obj1  obj2  Object  unknownObj  Map  map  long  serialVersionUID  int  counter  
[buglab_swap_variables]^final Object unknownObj = position1 == null ? obj2 : obj1;^238^^^^^227^247^final Object unknownObj = position1 == null ? obj1 : obj2;^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] compare [RETURN_TYPE] int   final T obj1 final T obj2 [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  Integer  position1  position2  boolean  isLocked  T  obj1  obj2  Object  unknownObj  Map  map  long  serialVersionUID  int  counter  
[buglab_swap_variables]^final Object unknownObj = obj1 == null ? position1 : obj2;^238^^^^^227^247^final Object unknownObj = position1 == null ? obj1 : obj2;^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] compare [RETURN_TYPE] int   final T obj1 final T obj2 [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  Integer  position1  position2  boolean  isLocked  T  obj1  obj2  Object  unknownObj  Map  map  long  serialVersionUID  int  counter  
[buglab_swap_variables]^return position2.compareTo ( position1 ) ;^246^^^^^227^247^return position1.compareTo ( position2 ) ;^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] compare [RETURN_TYPE] int   final T obj1 final T obj2 [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  Integer  position1  position2  boolean  isLocked  T  obj1  obj2  Object  unknownObj  Map  map  long  serialVersionUID  int  counter  
[buglab_swap_variables]^total = map*37 +  ( total == null ? 0 : map.hashCode (  )  ) ;^259^^^^^257^264^total = total*37 +  ( map == null ? 0 : map.hashCode (  )  ) ;^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  boolean  isLocked  Map  map  long  serialVersionUID  int  counter  total  
[buglab_swap_variables]^total = unknownObjectBehavior*37 +  ( total == null ? 0 : unknownObjectBehavior.hashCode (  )  ) ;^260^^^^^257^264^total = total*37 +  ( unknownObjectBehavior == null ? 0 : unknownObjectBehavior.hashCode (  )  ) ;^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  boolean  isLocked  Map  map  long  serialVersionUID  int  counter  total  
[buglab_swap_variables]^total = counter*37 + total;^261^^^^^257^264^total = total*37 + counter;^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  boolean  isLocked  Map  map  long  serialVersionUID  int  counter  total  
[buglab_swap_variables]^total = isLocked*37 +  ( total ? 0 : 1 ) ;^262^^^^^257^264^total = total*37 +  ( isLocked ? 0 : 1 ) ;^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  boolean  isLocked  Map  map  long  serialVersionUID  int  counter  total  
[buglab_swap_variables]^return  ( null == map ? null == unknownObjectBehavior.map : map.equals ( comp.map )  )  && ( null == comp ? null == comp.unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && counter == comp.counter &&^288^289^290^291^^279^296^return  ( null == map ? null == comp.map : map.equals ( comp.map )  )  && ( null == unknownObjectBehavior ? null == comp.unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && counter == comp.counter &&^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  boolean  isLocked  FixedOrderComparator  comp  Object  object  Map  map  long  serialVersionUID  int  counter  total  
[buglab_swap_variables]^return  ( null == counter ? null == comp.map : map.equals ( comp.map )  )  && ( null == unknownObjectBehavior ? null == comp.unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && map == comp.counter &&^288^289^290^291^^279^296^return  ( null == map ? null == comp.map : map.equals ( comp.map )  )  && ( null == unknownObjectBehavior ? null == comp.unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && counter == comp.counter &&^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  boolean  isLocked  FixedOrderComparator  comp  Object  object  Map  map  long  serialVersionUID  int  counter  total  
[buglab_swap_variables]^return  ( null == map ? null == unknownObjectBehavior : map.equals ( comp.map )  )  && ( null == comp.map ? null == comp.unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && counter == comp.counter &&^288^289^290^291^^279^296^return  ( null == map ? null == comp.map : map.equals ( comp.map )  )  && ( null == unknownObjectBehavior ? null == comp.unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && counter == comp.counter &&^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  boolean  isLocked  FixedOrderComparator  comp  Object  object  Map  map  long  serialVersionUID  int  counter  total  
[buglab_swap_variables]^return  ( null == map ? null == comp.unknownObjectBehavior.map : map.equals ( comp.map )  )  && ( null == unknownObjectBehavior ? null == comp : unknownObjectBehavior == comp.unknownObjectBehavior && counter == comp.counter &&^288^289^290^291^^279^296^return  ( null == map ? null == comp.map : map.equals ( comp.map )  )  && ( null == unknownObjectBehavior ? null == comp.unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && counter == comp.counter &&^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  boolean  isLocked  FixedOrderComparator  comp  Object  object  Map  map  long  serialVersionUID  int  counter  total  
[buglab_swap_variables]^return  ( null == map ? null == comp.map : map.equals ( comp.map )  )  && ( null == unknownObjectBehavior ? null == comp.unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && comp.counter == counter &&^288^289^290^291^^279^296^return  ( null == map ? null == comp.map : map.equals ( comp.map )  )  && ( null == unknownObjectBehavior ? null == comp.unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && counter == comp.counter &&^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  boolean  isLocked  FixedOrderComparator  comp  Object  object  Map  map  long  serialVersionUID  int  counter  total  
[buglab_swap_variables]^return  ( null == comp ? null == map.map : map.equals ( comp.map )  )  && ( null == unknownObjectBehavior ? null == comp.unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && counter == comp.counter &&^288^289^290^291^^279^296^return  ( null == map ? null == comp.map : map.equals ( comp.map )  )  && ( null == unknownObjectBehavior ? null == comp.unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && counter == comp.counter &&^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  boolean  isLocked  FixedOrderComparator  comp  Object  object  Map  map  long  serialVersionUID  int  counter  total  
[buglab_swap_variables]^return  ( null == map ? null == comp : map.equals ( comp.map.map )  )  && ( null == unknownObjectBehavior ? null == comp.unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && counter == comp.counter &&^288^289^290^291^^279^296^return  ( null == map ? null == comp.map : map.equals ( comp.map )  )  && ( null == unknownObjectBehavior ? null == comp.unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && counter == comp.counter &&^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  boolean  isLocked  FixedOrderComparator  comp  Object  object  Map  map  long  serialVersionUID  int  counter  total  
[buglab_swap_variables]^return  ( null == comp.map ? null == map : map.equals ( comp.map )  )  && ( null == unknownObjectBehavior ? null == comp.unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && counter == comp.counter &&^288^289^290^291^^279^296^return  ( null == map ? null == comp.map : map.equals ( comp.map )  )  && ( null == unknownObjectBehavior ? null == comp.unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && counter == comp.counter &&^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  boolean  isLocked  FixedOrderComparator  comp  Object  object  Map  map  long  serialVersionUID  int  counter  total  
[buglab_swap_variables]^return  ( null == map ? null == comp.map : map.equals ( comp.map )  )  && ( null == comp.unknownObjectBehavior ? null == unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && counter == comp.counter &&^288^289^290^291^^279^296^return  ( null == map ? null == comp.map : map.equals ( comp.map )  )  && ( null == unknownObjectBehavior ? null == comp.unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && counter == comp.counter &&^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  boolean  isLocked  FixedOrderComparator  comp  Object  object  Map  map  long  serialVersionUID  int  counter  total  
[buglab_swap_variables]^return  ( null == map ? null == counter : map.equals ( comp.map )  )  && ( null == unknownObjectBehavior ? null == comp.unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && comp.map == comp.counter &&^288^289^290^291^^279^296^return  ( null == map ? null == comp.map : map.equals ( comp.map )  )  && ( null == unknownObjectBehavior ? null == comp.unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && counter == comp.counter &&^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  boolean  isLocked  FixedOrderComparator  comp  Object  object  Map  map  long  serialVersionUID  int  counter  total  
[buglab_swap_variables]^return  ( null == map ? null == comp.map.map : map.equals ( comp )  )  && ( null == unknownObjectBehavior ? null == comp.unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && counter == comp.counter &&^288^289^290^291^^279^296^return  ( null == map ? null == comp.map : map.equals ( comp.map )  )  && ( null == unknownObjectBehavior ? null == comp.unknownObjectBehavior : unknownObjectBehavior == comp.unknownObjectBehavior && counter == comp.counter &&^[CLASS] FixedOrderComparator UnknownObjectBehavior  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] UnknownObjectBehavior  AFTER  BEFORE  EXCEPTION  unknownObjectBehavior  boolean  isLocked  FixedOrderComparator  comp  Object  object  Map  map  long  serialVersionUID  int  counter  total  
