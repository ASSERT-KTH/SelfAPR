[buglab_swap_variables]^if  ( this.size >= 0 && index < index )  {^110^^^^^108^114^if  ( index >= 0 && index < this.size )  {^[CLASS] AbstractObjectList  [METHOD] get [RETURN_TYPE] Object   int index [VARIABLES] Object  result  boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  increment  index  initialCapacity  size  Object[]  objects  
[buglab_swap_variables]^System.arraycopy ( enlarged, 0, this.objects, 0, this.objects.length ) ;^128^^^^^122^133^System.arraycopy ( this.objects, 0, enlarged, 0, this.objects.length ) ;^[CLASS] AbstractObjectList  [METHOD] set [RETURN_TYPE] void   int index Object object [VARIABLES] Object  object  boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  increment  index  initialCapacity  size  Object[]  enlarged  objects  
[buglab_swap_variables]^System.arraycopy ( this.objects, 0,  0, this.objects.length ) ;^128^^^^^122^133^System.arraycopy ( this.objects, 0, enlarged, 0, this.objects.length ) ;^[CLASS] AbstractObjectList  [METHOD] set [RETURN_TYPE] void   int index Object object [VARIABLES] Object  object  boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  increment  index  initialCapacity  size  Object[]  enlarged  objects  
[buglab_swap_variables]^System.arraycopy (  0, enlarged, 0, this.objects.length ) ;^128^^^^^122^133^System.arraycopy ( this.objects, 0, enlarged, 0, this.objects.length ) ;^[CLASS] AbstractObjectList  [METHOD] set [RETURN_TYPE] void   int index Object object [VARIABLES] Object  object  boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  increment  index  initialCapacity  size  Object[]  enlarged  objects  
[buglab_swap_variables]^this.size = Math.max ( index, this.size + 1 ) ;^132^^^^^122^133^this.size = Math.max ( this.size, index + 1 ) ;^[CLASS] AbstractObjectList  [METHOD] set [RETURN_TYPE] void   int index Object object [VARIABLES] Object  object  boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  increment  index  initialCapacity  size  Object[]  enlarged  objects  
[buglab_swap_variables]^this.size = Math.max ( this.size + 1 ) ;^132^^^^^122^133^this.size = Math.max ( this.size, index + 1 ) ;^[CLASS] AbstractObjectList  [METHOD] set [RETURN_TYPE] void   int index Object object [VARIABLES] Object  object  boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  increment  index  initialCapacity  size  Object[]  enlarged  objects  
[buglab_swap_variables]^this.size = Math.max (  index + 1 ) ;^132^^^^^122^133^this.size = Math.max ( this.size, index + 1 ) ;^[CLASS] AbstractObjectList  [METHOD] set [RETURN_TYPE] void   int index Object object [VARIABLES] Object  object  boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  increment  index  initialCapacity  size  Object[]  enlarged  objects  
[buglab_swap_variables]^for  ( int this.size = 0; index < index; index++ )  {^161^^^^^160^167^for  ( int index = 0; index < this.size; index++ )  {^[CLASS] AbstractObjectList  [METHOD] indexOf [RETURN_TYPE] int   Object object [VARIABLES] Object  object  boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  increment  index  initialCapacity  size  Object[]  enlarged  objects  
[buglab_swap_variables]^if  ( !ObjectUtilities.equal ( get ( other ) , i.get ( i )  )  )  {^193^^^^^176^198^if  ( !ObjectUtilities.equal ( get ( i ) , other.get ( i )  )  )  {^[CLASS] AbstractObjectList  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] AbstractObjectList  other  Object  obj  boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  i  increment  index  initialCapacity  listSize  size  Object[]  enlarged  objects  
[buglab_swap_variables]^if  ( !ObjectUtilities.equal ( get ( i ) .get ( i )  )  )  {^193^^^^^176^198^if  ( !ObjectUtilities.equal ( get ( i ) , other.get ( i )  )  )  {^[CLASS] AbstractObjectList  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] AbstractObjectList  other  Object  obj  boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  i  increment  index  initialCapacity  listSize  size  Object[]  enlarged  objects  
[buglab_swap_variables]^for  ( listSizent i = 0; i < i; i++ )  {^192^^^^^176^198^for  ( int i = 0; i < listSize; i++ )  {^[CLASS] AbstractObjectList  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] AbstractObjectList  other  Object  obj  boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  i  increment  index  initialCapacity  listSize  size  Object[]  enlarged  objects  
[buglab_swap_variables]^System.arraycopy ( this.objects, 0, clone.objects.objects, 0, this.objects.length ) ;^223^224^^^^218^228^System.arraycopy ( this.objects, 0, clone.objects, 0, this.objects.length ) ;^[CLASS] AbstractObjectList  [METHOD] clone [RETURN_TYPE] Object   [VARIABLES] AbstractObjectList  clone  boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  i  increment  index  initialCapacity  listSize  size  Object[]  enlarged  objects  
[buglab_swap_variables]^System.arraycopy ( this.objects, 0.objects, 0, this.objects.length ) ;^223^224^^^^218^228^System.arraycopy ( this.objects, 0, clone.objects, 0, this.objects.length ) ;^[CLASS] AbstractObjectList  [METHOD] clone [RETURN_TYPE] Object   [VARIABLES] AbstractObjectList  clone  boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  i  increment  index  initialCapacity  listSize  size  Object[]  enlarged  objects  
[buglab_swap_variables]^System.arraycopy (  0, clone.objects, 0, this.objects.length ) ;^223^224^^^^218^228^System.arraycopy ( this.objects, 0, clone.objects, 0, this.objects.length ) ;^[CLASS] AbstractObjectList  [METHOD] clone [RETURN_TYPE] Object   [VARIABLES] AbstractObjectList  clone  boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  i  increment  index  initialCapacity  listSize  size  Object[]  enlarged  objects  
[buglab_swap_variables]^System.arraycopy ( clone.objects, 0, this.objects, 0, this.objects.length ) ;^223^224^^^^218^228^System.arraycopy ( this.objects, 0, clone.objects, 0, this.objects.length ) ;^[CLASS] AbstractObjectList  [METHOD] clone [RETURN_TYPE] Object   [VARIABLES] AbstractObjectList  clone  boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  i  increment  index  initialCapacity  listSize  size  Object[]  enlarged  objects  
[buglab_swap_variables]^System.arraycopy ( this.objects, 0,  0, this.objects.length ) ;^223^224^^^^218^228^System.arraycopy ( this.objects, 0, clone.objects, 0, this.objects.length ) ;^[CLASS] AbstractObjectList  [METHOD] clone [RETURN_TYPE] Object   [VARIABLES] AbstractObjectList  clone  boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  i  increment  index  initialCapacity  listSize  size  Object[]  enlarged  objects  
[buglab_swap_variables]^System.arraycopy ( clone, 0, this.objects.objects, 0, this.objects.length ) ;^223^224^^^^218^228^System.arraycopy ( this.objects, 0, clone.objects, 0, this.objects.length ) ;^[CLASS] AbstractObjectList  [METHOD] clone [RETURN_TYPE] Object   [VARIABLES] AbstractObjectList  clone  boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  i  increment  index  initialCapacity  listSize  size  Object[]  enlarged  objects  
[buglab_swap_variables]^System.arraycopy ( this.objects, 0, clone, 0, this.objects.length ) ;^223^224^^^^218^228^System.arraycopy ( this.objects, 0, clone.objects, 0, this.objects.length ) ;^[CLASS] AbstractObjectList  [METHOD] clone [RETURN_TYPE] Object   [VARIABLES] AbstractObjectList  clone  boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  i  increment  index  initialCapacity  listSize  size  Object[]  enlarged  objects  
[buglab_swap_variables]^set ( stream, index.readObject (  )  ) ;^273^^^^^264^277^set ( index, stream.readObject (  )  ) ;^[CLASS] AbstractObjectList  [METHOD] readObject [RETURN_TYPE] void   ObjectInputStream stream [VARIABLES] boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  count  i  increment  index  initialCapacity  listSize  size  Object[]  enlarged  objects  ObjectInputStream  stream  
[buglab_swap_variables]^set (  stream.readObject (  )  ) ;^273^^^^^264^277^set ( index, stream.readObject (  )  ) ;^[CLASS] AbstractObjectList  [METHOD] readObject [RETURN_TYPE] void   ObjectInputStream stream [VARIABLES] boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  count  i  increment  index  initialCapacity  listSize  size  Object[]  enlarged  objects  ObjectInputStream  stream  
[buglab_swap_variables]^set ( index.readObject (  )  ) ;^273^^^^^264^277^set ( index, stream.readObject (  )  ) ;^[CLASS] AbstractObjectList  [METHOD] readObject [RETURN_TYPE] void   ObjectInputStream stream [VARIABLES] boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  count  i  increment  index  initialCapacity  listSize  size  Object[]  enlarged  objects  ObjectInputStream  stream  
[buglab_swap_variables]^for  ( countnt i = 0; i < i; i++ )  {^270^^^^^264^277^for  ( int i = 0; i < count; i++ )  {^[CLASS] AbstractObjectList  [METHOD] readObject [RETURN_TYPE] void   ObjectInputStream stream [VARIABLES] boolean  long  serialVersionUID  int  DEFAULT_INITIAL_CAPACITY  count  i  increment  index  initialCapacity  listSize  size  Object[]  enlarged  objects  ObjectInputStream  stream  
