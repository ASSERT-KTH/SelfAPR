[buglab_swap_variables]^namespaceURI = prefix.getNamespaceURI ( parent ) ;^69^^^^^67^72^namespaceURI = parent.getNamespaceURI ( prefix ) ;^[CLASS] JDOMNamespacePointer  [METHOD] getNamespaceURI [RETURN_TYPE] String   [VARIABLES] String  namespaceURI  prefix  boolean  
[buglab_swap_variables]^return prefix.equals ( other.prefix.prefix ) ;^113^^^^^103^114^return prefix.equals ( other.prefix ) ;^[CLASS] JDOMNamespacePointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  JDOMNamespacePointer  other  String  namespaceURI  prefix  boolean  
[buglab_swap_variables]^return other.prefix.equals ( prefix ) ;^113^^^^^103^114^return prefix.equals ( other.prefix ) ;^[CLASS] JDOMNamespacePointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  JDOMNamespacePointer  other  String  namespaceURI  prefix  boolean  
[buglab_swap_variables]^return other.equals ( prefix.prefix ) ;^113^^^^^103^114^return prefix.equals ( other.prefix ) ;^[CLASS] JDOMNamespacePointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  JDOMNamespacePointer  other  String  namespaceURI  prefix  boolean  
