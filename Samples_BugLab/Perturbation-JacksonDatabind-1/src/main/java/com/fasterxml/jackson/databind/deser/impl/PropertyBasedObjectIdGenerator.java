[buglab_swap_variables]^return  ( _scope == scope )  ? this : new PropertyBasedObjectIdGenerator ( scope ) ;^23^^^^^22^24^return  ( scope == _scope )  ? this : new PropertyBasedObjectIdGenerator ( scope ) ;^[CLASS] PropertyBasedObjectIdGenerator  [METHOD] forScope [RETURN_TYPE] ObjectIdGenerator   Class<?> scope [VARIABLES] long  serialVersionUID  Class  scope  boolean  
[buglab_swap_variables]^return new IdKey ( getClass (  ) , key, _scope ) ;^34^^^^^32^35^return new IdKey ( getClass (  ) , _scope, key ) ;^[CLASS] PropertyBasedObjectIdGenerator  [METHOD] key [RETURN_TYPE] IdKey   Object key [VARIABLES] long  serialVersionUID  Object  key  boolean  
[buglab_swap_variables]^return new IdKey ( getClass (  ) , _scope ) ;^34^^^^^32^35^return new IdKey ( getClass (  ) , _scope, key ) ;^[CLASS] PropertyBasedObjectIdGenerator  [METHOD] key [RETURN_TYPE] IdKey   Object key [VARIABLES] long  serialVersionUID  Object  key  boolean  
[buglab_swap_variables]^return new IdKey ( getClass (  ) ,  key ) ;^34^^^^^32^35^return new IdKey ( getClass (  ) , _scope, key ) ;^[CLASS] PropertyBasedObjectIdGenerator  [METHOD] key [RETURN_TYPE] IdKey   Object key [VARIABLES] long  serialVersionUID  Object  key  boolean  
