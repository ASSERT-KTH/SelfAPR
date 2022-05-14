[buglab_swap_variables]^return WHOLE_COLLECTION != index;^75^^^^^74^76^return index != WHOLE_COLLECTION;^[CLASS] CollectionPointer  [METHOD] isContainer [RETURN_TYPE] boolean   [VARIABLES] Object  collection  value  NodePointer  parent  valuePointer  boolean  
[buglab_swap_variables]^if  ( WHOLE_COLLECTION != index )  {^79^^^^^78^85^if  ( index != WHOLE_COLLECTION )  {^[CLASS] CollectionPointer  [METHOD] getImmediateNode [RETURN_TYPE] Object   [VARIABLES] Object  collection  value  NodePointer  parent  valuePointer  boolean  
[buglab_swap_variables]^return ValueUtils.getValue ( index, collection ) ;^80^^^^^78^85^return ValueUtils.getValue ( collection, index ) ;^[CLASS] CollectionPointer  [METHOD] getImmediateNode [RETURN_TYPE] Object   [VARIABLES] Object  collection  value  NodePointer  parent  valuePointer  boolean  
[buglab_swap_variables]^return ValueUtils.getValue (  index ) ;^80^^^^^78^85^return ValueUtils.getValue ( collection, index ) ;^[CLASS] CollectionPointer  [METHOD] getImmediateNode [RETURN_TYPE] Object   [VARIABLES] Object  collection  value  NodePointer  parent  valuePointer  boolean  
[buglab_swap_variables]^return ValueUtils.getValue ( collection ) ;^80^^^^^78^85^return ValueUtils.getValue ( collection, index ) ;^[CLASS] CollectionPointer  [METHOD] getImmediateNode [RETURN_TYPE] Object   [VARIABLES] Object  collection  value  NodePointer  parent  valuePointer  boolean  
[buglab_swap_variables]^if  ( WHOLE_COLLECTION == index )  {^88^^^^^87^94^if  ( index == WHOLE_COLLECTION )  {^[CLASS] CollectionPointer  [METHOD] setValue [RETURN_TYPE] void   Object value [VARIABLES] Object  collection  value  NodePointer  parent  valuePointer  boolean  
[buglab_swap_variables]^ValueUtils.setValue ( collection, value, index ) ;^92^^^^^87^94^ValueUtils.setValue ( collection, index, value ) ;^[CLASS] CollectionPointer  [METHOD] setValue [RETURN_TYPE] void   Object value [VARIABLES] Object  collection  value  NodePointer  parent  valuePointer  boolean  
[buglab_swap_variables]^ValueUtils.setValue ( collection, index ) ;^92^^^^^87^94^ValueUtils.setValue ( collection, index, value ) ;^[CLASS] CollectionPointer  [METHOD] setValue [RETURN_TYPE] void   Object value [VARIABLES] Object  collection  value  NodePointer  parent  valuePointer  boolean  
[buglab_swap_variables]^ValueUtils.setValue ( value, index, collection ) ;^92^^^^^87^94^ValueUtils.setValue ( collection, index, value ) ;^[CLASS] CollectionPointer  [METHOD] setValue [RETURN_TYPE] void   Object value [VARIABLES] Object  collection  value  NodePointer  parent  valuePointer  boolean  
[buglab_swap_variables]^ValueUtils.setValue (  index, value ) ;^92^^^^^87^94^ValueUtils.setValue ( collection, index, value ) ;^[CLASS] CollectionPointer  [METHOD] setValue [RETURN_TYPE] void   Object value [VARIABLES] Object  collection  value  NodePointer  parent  valuePointer  boolean  
[buglab_swap_variables]^ValueUtils.setValue ( collection,  value ) ;^92^^^^^87^94^ValueUtils.setValue ( collection, index, value ) ;^[CLASS] CollectionPointer  [METHOD] setValue [RETURN_TYPE] void   Object value [VARIABLES] Object  collection  value  NodePointer  parent  valuePointer  boolean  
[buglab_swap_variables]^if  ( WHOLE_COLLECTION == index )  {^103^^^^^101^113^if  ( index == WHOLE_COLLECTION )  {^[CLASS] CollectionPointer  [METHOD] getValuePointer [RETURN_TYPE] NodePointer   [VARIABLES] Object  collection  value  NodePointer  parent  valuePointer  boolean  
[buglab_swap_variables]^if  ( ValueUtils.getLength ( index )  <= collection )  {^117^^^^^115^121^if  ( ValueUtils.getLength ( collection )  <= index )  {^[CLASS] CollectionPointer  [METHOD] createPath [RETURN_TYPE] NodePointer   JXPathContext context [VARIABLES] Object  collection  value  NodePointer  parent  valuePointer  boolean  JXPathContext  context  
[buglab_swap_variables]^return value.createPath ( context, ptr ) ;^137^^^^^129^138^return ptr.createPath ( context, value ) ;^[CLASS] CollectionPointer  [METHOD] createChild [RETURN_TYPE] NodePointer   JXPathContext context QName name int index Object value [VARIABLES] Object  collection  value  NodePointer  parent  ptr  valuePointer  boolean  JXPathContext  context  QName  name  int  index  
[buglab_swap_variables]^return context.createPath ( ptr, value ) ;^137^^^^^129^138^return ptr.createPath ( context, value ) ;^[CLASS] CollectionPointer  [METHOD] createChild [RETURN_TYPE] NodePointer   JXPathContext context QName name int index Object value [VARIABLES] Object  collection  value  NodePointer  parent  ptr  valuePointer  boolean  JXPathContext  context  QName  name  int  index  
[buglab_swap_variables]^return ptr.createPath (  value ) ;^137^^^^^129^138^return ptr.createPath ( context, value ) ;^[CLASS] CollectionPointer  [METHOD] createChild [RETURN_TYPE] NodePointer   JXPathContext context QName name int index Object value [VARIABLES] Object  collection  value  NodePointer  parent  ptr  valuePointer  boolean  JXPathContext  context  QName  name  int  index  
[buglab_swap_variables]^return ptr.createPath ( value, context ) ;^137^^^^^129^138^return ptr.createPath ( context, value ) ;^[CLASS] CollectionPointer  [METHOD] createChild [RETURN_TYPE] NodePointer   JXPathContext context QName name int index Object value [VARIABLES] Object  collection  value  NodePointer  parent  ptr  valuePointer  boolean  JXPathContext  context  QName  name  int  index  
[buglab_swap_variables]^return ptr.createPath ( context ) ;^137^^^^^129^138^return ptr.createPath ( context, value ) ;^[CLASS] CollectionPointer  [METHOD] createChild [RETURN_TYPE] NodePointer   JXPathContext context QName name int index Object value [VARIABLES] Object  collection  value  NodePointer  parent  ptr  valuePointer  boolean  JXPathContext  context  QName  name  int  index  
[buglab_swap_variables]^return context.createPath ( ptr ) ;^147^^^^^140^148^return ptr.createPath ( context ) ;^[CLASS] CollectionPointer  [METHOD] createChild [RETURN_TYPE] NodePointer   JXPathContext context QName name int index [VARIABLES] Object  collection  value  NodePointer  parent  ptr  valuePointer  boolean  JXPathContext  context  QName  name  int  index  
[buglab_swap_variables]^return System.identityHashCode ( index )  + collection;^151^^^^^150^152^return System.identityHashCode ( collection )  + index;^[CLASS] CollectionPointer  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] Object  collection  value  NodePointer  parent  ptr  valuePointer  boolean  
[buglab_swap_variables]^if  ( WHOLE_COLLECTION == index )  {^170^^^^^167^180^if  ( index == WHOLE_COLLECTION )  {^[CLASS] CollectionPointer  [METHOD] childIterator [RETURN_TYPE] NodeIterator   NodeTest test boolean reverse NodePointer startWith [VARIABLES] Object  collection  object  value  NodePointer  parent  ptr  startWith  valuePointer  boolean  reverse  NodeTest  test  
[buglab_swap_variables]^return getValuePointer (  ) .childIterator ( startWith, reverse, test ) ;^178^^^^^167^180^return getValuePointer (  ) .childIterator ( test, reverse, startWith ) ;^[CLASS] CollectionPointer  [METHOD] childIterator [RETURN_TYPE] NodeIterator   NodeTest test boolean reverse NodePointer startWith [VARIABLES] Object  collection  object  value  NodePointer  parent  ptr  startWith  valuePointer  boolean  reverse  NodeTest  test  
[buglab_swap_variables]^return getValuePointer (  ) .childIterator (  reverse, startWith ) ;^178^^^^^167^180^return getValuePointer (  ) .childIterator ( test, reverse, startWith ) ;^[CLASS] CollectionPointer  [METHOD] childIterator [RETURN_TYPE] NodeIterator   NodeTest test boolean reverse NodePointer startWith [VARIABLES] Object  collection  object  value  NodePointer  parent  ptr  startWith  valuePointer  boolean  reverse  NodeTest  test  
[buglab_swap_variables]^return getValuePointer (  ) .childIterator ( test, startWith, reverse ) ;^178^^^^^167^180^return getValuePointer (  ) .childIterator ( test, reverse, startWith ) ;^[CLASS] CollectionPointer  [METHOD] childIterator [RETURN_TYPE] NodeIterator   NodeTest test boolean reverse NodePointer startWith [VARIABLES] Object  collection  object  value  NodePointer  parent  ptr  startWith  valuePointer  boolean  reverse  NodeTest  test  
[buglab_swap_variables]^return getValuePointer (  ) .childIterator ( test,  startWith ) ;^178^^^^^167^180^return getValuePointer (  ) .childIterator ( test, reverse, startWith ) ;^[CLASS] CollectionPointer  [METHOD] childIterator [RETURN_TYPE] NodeIterator   NodeTest test boolean reverse NodePointer startWith [VARIABLES] Object  collection  object  value  NodePointer  parent  ptr  startWith  valuePointer  boolean  reverse  NodeTest  test  
[buglab_swap_variables]^return getValuePointer (  ) .childIterator ( test, reverse ) ;^178^^^^^167^180^return getValuePointer (  ) .childIterator ( test, reverse, startWith ) ;^[CLASS] CollectionPointer  [METHOD] childIterator [RETURN_TYPE] NodeIterator   NodeTest test boolean reverse NodePointer startWith [VARIABLES] Object  collection  object  value  NodePointer  parent  ptr  startWith  valuePointer  boolean  reverse  NodeTest  test  
[buglab_swap_variables]^return getValuePointer (  ) .childIterator ( reverse, test, startWith ) ;^178^^^^^167^180^return getValuePointer (  ) .childIterator ( test, reverse, startWith ) ;^[CLASS] CollectionPointer  [METHOD] childIterator [RETURN_TYPE] NodeIterator   NodeTest test boolean reverse NodePointer startWith [VARIABLES] Object  collection  object  value  NodePointer  parent  ptr  startWith  valuePointer  boolean  reverse  NodeTest  test  
[buglab_swap_variables]^return new CollectionChildNodeIterator ( this,  reverse,^171^172^173^174^^167^180^return new CollectionChildNodeIterator ( this, test, reverse,^[CLASS] CollectionPointer  [METHOD] childIterator [RETURN_TYPE] NodeIterator   NodeTest test boolean reverse NodePointer startWith [VARIABLES] Object  collection  object  value  NodePointer  parent  ptr  startWith  valuePointer  boolean  reverse  NodeTest  test  
[buglab_swap_variables]^return new CollectionChildNodeIterator ( this, reverse, test,^171^172^173^174^^167^180^return new CollectionChildNodeIterator ( this, test, reverse,^[CLASS] CollectionPointer  [METHOD] childIterator [RETURN_TYPE] NodeIterator   NodeTest test boolean reverse NodePointer startWith [VARIABLES] Object  collection  object  value  NodePointer  parent  ptr  startWith  valuePointer  boolean  reverse  NodeTest  test  
[buglab_swap_variables]^return new CollectionChildNodeIterator ( this, test,^171^172^173^174^^167^180^return new CollectionChildNodeIterator ( this, test, reverse,^[CLASS] CollectionPointer  [METHOD] childIterator [RETURN_TYPE] NodeIterator   NodeTest test boolean reverse NodePointer startWith [VARIABLES] Object  collection  object  value  NodePointer  parent  ptr  startWith  valuePointer  boolean  reverse  NodeTest  test  
[buglab_swap_variables]^if  ( WHOLE_COLLECTION == index )  {^183^^^^^182^187^if  ( index == WHOLE_COLLECTION )  {^[CLASS] CollectionPointer  [METHOD] attributeIterator [RETURN_TYPE] NodeIterator   QName name [VARIABLES] Object  collection  object  value  NodePointer  parent  ptr  startWith  valuePointer  boolean  QName  name  
[buglab_swap_variables]^if  ( WHOLE_COLLECTION == index )  {^190^^^^^189^194^if  ( index == WHOLE_COLLECTION )  {^[CLASS] CollectionPointer  [METHOD] namespaceIterator [RETURN_TYPE] NodeIterator   [VARIABLES] Object  collection  object  value  NodePointer  parent  ptr  startWith  valuePointer  boolean  
[buglab_swap_variables]^if  ( WHOLE_COLLECTION == index )  {^197^^^^^196^201^if  ( index == WHOLE_COLLECTION )  {^[CLASS] CollectionPointer  [METHOD] namespacePointer [RETURN_TYPE] NodePointer   String namespace [VARIABLES] Object  collection  object  value  NodePointer  parent  ptr  startWith  valuePointer  String  namespace  boolean  
[buglab_swap_variables]^return pointer2.getIndex (  )  - pointer1.getIndex (  ) ;^224^^^^^221^225^return pointer1.getIndex (  )  - pointer2.getIndex (  ) ;^[CLASS] CollectionPointer  [METHOD] compareChildNodePointers [RETURN_TYPE] int   NodePointer pointer1 NodePointer pointer2 [VARIABLES] Object  collection  object  value  NodePointer  parent  pointer1  pointer2  ptr  startWith  valuePointer  boolean  
[buglab_swap_variables]^if  ( WHOLE_COLLECTION != index )  {^244^^^^^230^253^if  ( index != WHOLE_COLLECTION )  {^[CLASS] CollectionPointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] Object  collection  object  value  StringBuffer  buffer  NodePointer  parent  pointer1  pointer2  ptr  startWith  valuePointer  boolean  
[buglab_swap_variables]^if  ( WHOLE_COLLECTION != index )  {^235^^^^^230^253^if  ( index != WHOLE_COLLECTION )  {^[CLASS] CollectionPointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] Object  collection  object  value  StringBuffer  buffer  NodePointer  parent  pointer1  pointer2  ptr  startWith  valuePointer  boolean  
[buglab_swap_variables]^if  ( WHOLE_COLLECTION.getIndex (  )  != parent )  {^237^^^^^230^253^if  ( parent.getIndex (  )  != WHOLE_COLLECTION )  {^[CLASS] CollectionPointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] Object  collection  object  value  StringBuffer  buffer  NodePointer  parent  pointer1  pointer2  ptr  startWith  valuePointer  boolean  
