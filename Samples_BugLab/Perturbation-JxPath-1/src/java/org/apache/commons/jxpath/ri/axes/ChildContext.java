[buglab_swap_variables]^return position.setPosition ( iterator ) ;^107^^^^^98^108^return iterator.setPosition ( position ) ;^[CLASS] ChildContext  [METHOD] setPosition [RETURN_TYPE] boolean   int position [VARIABLES] NodeIterator  iterator  boolean  reverse  startFromParentLocation  NodeTest  nodeTest  int  oldPosition  position  
[buglab_swap_variables]^iterator = reverse.childIterator ( nodeTest, parent, null ) ;^123^^^^^113^125^iterator = parent.childIterator ( nodeTest, reverse, null ) ;^[CLASS] ChildContext  [METHOD] prepare [RETURN_TYPE] void   [VARIABLES] NodeIterator  iterator  boolean  reverse  startFromParentLocation  NodePointer  parent  pointer  NodeTest  nodeTest  
[buglab_swap_variables]^iterator = parent.childIterator ( reverse, nodeTest, null ) ;^123^^^^^113^125^iterator = parent.childIterator ( nodeTest, reverse, null ) ;^[CLASS] ChildContext  [METHOD] prepare [RETURN_TYPE] void   [VARIABLES] NodeIterator  iterator  boolean  reverse  startFromParentLocation  NodePointer  parent  pointer  NodeTest  nodeTest  
[buglab_swap_variables]^iterator = parent.childIterator (  reverse, null ) ;^123^^^^^113^125^iterator = parent.childIterator ( nodeTest, reverse, null ) ;^[CLASS] ChildContext  [METHOD] prepare [RETURN_TYPE] void   [VARIABLES] NodeIterator  iterator  boolean  reverse  startFromParentLocation  NodePointer  parent  pointer  NodeTest  nodeTest  
[buglab_swap_variables]^iterator = parent.childIterator ( nodeTest,  null ) ;^123^^^^^113^125^iterator = parent.childIterator ( nodeTest, reverse, null ) ;^[CLASS] ChildContext  [METHOD] prepare [RETURN_TYPE] void   [VARIABLES] NodeIterator  iterator  boolean  reverse  startFromParentLocation  NodePointer  parent  pointer  NodeTest  nodeTest  
[buglab_swap_variables]^iterator = nodeTest.childIterator ( parent, reverse, null ) ;^123^^^^^113^125^iterator = parent.childIterator ( nodeTest, reverse, null ) ;^[CLASS] ChildContext  [METHOD] prepare [RETURN_TYPE] void   [VARIABLES] NodeIterator  iterator  boolean  reverse  startFromParentLocation  NodePointer  parent  pointer  NodeTest  nodeTest  
[buglab_swap_variables]^iterator = nodeTest.childIterator ( pointer, reverse, parent ) ;^120^^^^^113^125^iterator = pointer.childIterator ( nodeTest, reverse, parent ) ;^[CLASS] ChildContext  [METHOD] prepare [RETURN_TYPE] void   [VARIABLES] NodeIterator  iterator  boolean  reverse  startFromParentLocation  NodePointer  parent  pointer  NodeTest  nodeTest  
[buglab_swap_variables]^iterator = parent.childIterator ( nodeTest, reverse, pointer ) ;^120^^^^^113^125^iterator = pointer.childIterator ( nodeTest, reverse, parent ) ;^[CLASS] ChildContext  [METHOD] prepare [RETURN_TYPE] void   [VARIABLES] NodeIterator  iterator  boolean  reverse  startFromParentLocation  NodePointer  parent  pointer  NodeTest  nodeTest  
[buglab_swap_variables]^iterator = pointer.childIterator ( nodeTest, reverse ) ;^120^^^^^113^125^iterator = pointer.childIterator ( nodeTest, reverse, parent ) ;^[CLASS] ChildContext  [METHOD] prepare [RETURN_TYPE] void   [VARIABLES] NodeIterator  iterator  boolean  reverse  startFromParentLocation  NodePointer  parent  pointer  NodeTest  nodeTest  
[buglab_swap_variables]^iterator = pointer.childIterator ( parent, reverse, nodeTest ) ;^120^^^^^113^125^iterator = pointer.childIterator ( nodeTest, reverse, parent ) ;^[CLASS] ChildContext  [METHOD] prepare [RETURN_TYPE] void   [VARIABLES] NodeIterator  iterator  boolean  reverse  startFromParentLocation  NodePointer  parent  pointer  NodeTest  nodeTest  
[buglab_swap_variables]^iterator = pointer.childIterator (  reverse, parent ) ;^120^^^^^113^125^iterator = pointer.childIterator ( nodeTest, reverse, parent ) ;^[CLASS] ChildContext  [METHOD] prepare [RETURN_TYPE] void   [VARIABLES] NodeIterator  iterator  boolean  reverse  startFromParentLocation  NodePointer  parent  pointer  NodeTest  nodeTest  
[buglab_swap_variables]^iterator = pointer.childIterator ( nodeTest, parent, reverse ) ;^120^^^^^113^125^iterator = pointer.childIterator ( nodeTest, reverse, parent ) ;^[CLASS] ChildContext  [METHOD] prepare [RETURN_TYPE] void   [VARIABLES] NodeIterator  iterator  boolean  reverse  startFromParentLocation  NodePointer  parent  pointer  NodeTest  nodeTest  
[buglab_swap_variables]^iterator = pointer.childIterator ( nodeTest,  parent ) ;^120^^^^^113^125^iterator = pointer.childIterator ( nodeTest, reverse, parent ) ;^[CLASS] ChildContext  [METHOD] prepare [RETURN_TYPE] void   [VARIABLES] NodeIterator  iterator  boolean  reverse  startFromParentLocation  NodePointer  parent  pointer  NodeTest  nodeTest  
[buglab_swap_variables]^iterator = reverse.childIterator ( nodeTest, pointer, parent ) ;^120^^^^^113^125^iterator = pointer.childIterator ( nodeTest, reverse, parent ) ;^[CLASS] ChildContext  [METHOD] prepare [RETURN_TYPE] void   [VARIABLES] NodeIterator  iterator  boolean  reverse  startFromParentLocation  NodePointer  parent  pointer  NodeTest  nodeTest  
