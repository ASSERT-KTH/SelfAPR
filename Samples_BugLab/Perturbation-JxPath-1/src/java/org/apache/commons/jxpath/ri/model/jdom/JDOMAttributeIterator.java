[buglab_swap_variables]^if  ( i.getNode (  )  parentnstanceof Element )  {^45^^^^^30^60^if  ( parent.getNode (  )  instanceof Element )  {^[CLASS] JDOMAttributeIterator  [METHOD] <init> [RETURN_TYPE] QName)   NodePointer parent QName name [VARIABLES] boolean  Attribute  attr  QName  name  Element  element  List  allAttributes  attributes  NodePointer  parent  String  lname  prefix  int  i  position  Namespace  ns  
[buglab_swap_variables]^ns = prefix.getNamespace ( element ) ;^54^^^^^50^60^ns = element.getNamespace ( prefix ) ;^[CLASS] JDOMAttributeIterator  [METHOD] <init> [RETURN_TYPE] QName)   NodePointer parent QName name [VARIABLES] boolean  Attribute  attr  QName  name  Element  element  List  allAttributes  attributes  NodePointer  parent  String  lname  prefix  int  i  position  Namespace  ns  
[buglab_swap_variables]^ns = prefix.getNamespace ( element ) ;^54^^^^^39^69^ns = element.getNamespace ( prefix ) ;^[CLASS] JDOMAttributeIterator  [METHOD] <init> [RETURN_TYPE] QName)   NodePointer parent QName name [VARIABLES] boolean  Attribute  attr  QName  name  Element  element  List  allAttributes  attributes  NodePointer  parent  String  lname  prefix  int  i  position  Namespace  ns  
[buglab_swap_variables]^if  ( ns.getNamespace (  ) .equals ( attr )  )  {^81^^^^^67^85^if  ( attr.getNamespace (  ) .equals ( ns )  )  {^[CLASS] JDOMAttributeIterator  [METHOD] <init> [RETURN_TYPE] QName)   NodePointer parent QName name [VARIABLES] boolean  Attribute  attr  QName  name  Element  element  List  allAttributes  attributes  NodePointer  parent  String  lname  prefix  int  i  position  Namespace  ns  
[buglab_swap_variables]^Attribute attr =  ( Attribute )  i.get ( allAttributes ) ;^80^^^^^67^85^Attribute attr =  ( Attribute )  allAttributes.get ( i ) ;^[CLASS] JDOMAttributeIterator  [METHOD] <init> [RETURN_TYPE] QName)   NodePointer parent QName name [VARIABLES] boolean  Attribute  attr  QName  name  Element  element  List  allAttributes  attributes  NodePointer  parent  String  lname  prefix  int  i  position  Namespace  ns  
[buglab_swap_variables]^Attribute attr = lname.getAttribute ( element, ns ) ;^70^^^^^55^85^Attribute attr = element.getAttribute ( lname, ns ) ;^[CLASS] JDOMAttributeIterator  [METHOD] <init> [RETURN_TYPE] QName)   NodePointer parent QName name [VARIABLES] boolean  Attribute  attr  QName  name  Element  element  List  allAttributes  attributes  NodePointer  parent  String  lname  prefix  int  i  position  Namespace  ns  
[buglab_swap_variables]^Attribute attr = element.getAttribute (  ns ) ;^70^^^^^55^85^Attribute attr = element.getAttribute ( lname, ns ) ;^[CLASS] JDOMAttributeIterator  [METHOD] <init> [RETURN_TYPE] QName)   NodePointer parent QName name [VARIABLES] boolean  Attribute  attr  QName  name  Element  element  List  allAttributes  attributes  NodePointer  parent  String  lname  prefix  int  i  position  Namespace  ns  
[buglab_swap_variables]^Attribute attr = element.getAttribute ( ns, lname ) ;^70^^^^^55^85^Attribute attr = element.getAttribute ( lname, ns ) ;^[CLASS] JDOMAttributeIterator  [METHOD] <init> [RETURN_TYPE] QName)   NodePointer parent QName name [VARIABLES] boolean  Attribute  attr  QName  name  Element  element  List  allAttributes  attributes  NodePointer  parent  String  lname  prefix  int  i  position  Namespace  ns  
[buglab_swap_variables]^Attribute attr = element.getAttribute ( lname ) ;^70^^^^^55^85^Attribute attr = element.getAttribute ( lname, ns ) ;^[CLASS] JDOMAttributeIterator  [METHOD] <init> [RETURN_TYPE] QName)   NodePointer parent QName name [VARIABLES] boolean  Attribute  attr  QName  name  Element  element  List  allAttributes  attributes  NodePointer  parent  String  lname  prefix  int  i  position  Namespace  ns  
[buglab_swap_variables]^Attribute attr = ns.getAttribute ( lname, element ) ;^70^^^^^55^85^Attribute attr = element.getAttribute ( lname, ns ) ;^[CLASS] JDOMAttributeIterator  [METHOD] <init> [RETURN_TYPE] QName)   NodePointer parent QName name [VARIABLES] boolean  Attribute  attr  QName  name  Element  element  List  allAttributes  attributes  NodePointer  parent  String  lname  prefix  int  i  position  Namespace  ns  
[buglab_swap_variables]^if  ( ns.getNamespace (  ) .equals ( attr )  )  {^81^^^^^66^96^if  ( attr.getNamespace (  ) .equals ( ns )  )  {^[CLASS] JDOMAttributeIterator  [METHOD] <init> [RETURN_TYPE] QName)   NodePointer parent QName name [VARIABLES] boolean  Attribute  attr  QName  name  Element  element  List  allAttributes  attributes  NodePointer  parent  String  lname  prefix  int  i  position  Namespace  ns  
[buglab_swap_variables]^for  ( allAttributesnt i = 0; i < i.size (  ) ; i++ )  {^79^^^^^64^94^for  ( int i = 0; i < allAttributes.size (  ) ; i++ )  {^[CLASS] JDOMAttributeIterator  [METHOD] <init> [RETURN_TYPE] QName)   NodePointer parent QName name [VARIABLES] boolean  Attribute  attr  QName  name  Element  element  List  allAttributes  attributes  NodePointer  parent  String  lname  prefix  int  i  position  Namespace  ns  
[buglab_swap_variables]^Attribute attr =  ( Attribute )  i.get ( allAttributes ) ;^80^^^^^65^95^Attribute attr =  ( Attribute )  allAttributes.get ( i ) ;^[CLASS] JDOMAttributeIterator  [METHOD] <init> [RETURN_TYPE] QName)   NodePointer parent QName name [VARIABLES] boolean  Attribute  attr  QName  name  Element  element  List  allAttributes  attributes  NodePointer  parent  String  lname  prefix  int  i  position  Namespace  ns  
[buglab_swap_variables]^return new JDOMAttributePointer ( parent, ( Attribute )  index.get ( attributes )  ) ;^174^175^176^^^163^177^return new JDOMAttributePointer ( parent, ( Attribute )  attributes.get ( index )  ) ;^[CLASS] JDOMAttributeIterator  [METHOD] getNodePointer [RETURN_TYPE] NodePointer   [VARIABLES] List  allAttributes  attributes  NodePointer  parent  boolean  QName  name  int  i  index  position  
[buglab_swap_variables]^return new JDOMAttributePointer ( index, ( Attribute )  attributes.get ( parent )  ) ;^174^175^176^^^163^177^return new JDOMAttributePointer ( parent, ( Attribute )  attributes.get ( index )  ) ;^[CLASS] JDOMAttributeIterator  [METHOD] getNodePointer [RETURN_TYPE] NodePointer   [VARIABLES] List  allAttributes  attributes  NodePointer  parent  boolean  QName  name  int  i  index  position  
[buglab_swap_variables]^return new JDOMAttributePointer (  ( Attribute )  attributes.get ( index )  ) ;^174^175^176^^^163^177^return new JDOMAttributePointer ( parent, ( Attribute )  attributes.get ( index )  ) ;^[CLASS] JDOMAttributeIterator  [METHOD] getNodePointer [RETURN_TYPE] NodePointer   [VARIABLES] List  allAttributes  attributes  NodePointer  parent  boolean  QName  name  int  i  index  position  
[buglab_swap_variables]^return new JDOMAttributePointer ( attributes, ( Attribute )  parent.get ( index )  ) ;^174^175^176^^^163^177^return new JDOMAttributePointer ( parent, ( Attribute )  attributes.get ( index )  ) ;^[CLASS] JDOMAttributeIterator  [METHOD] getNodePointer [RETURN_TYPE] NodePointer   [VARIABLES] List  allAttributes  attributes  NodePointer  parent  boolean  QName  name  int  i  index  position  
[buglab_swap_variables]^( Attribute )  index.get ( attributes )  ) ;^176^^^^^163^177^( Attribute )  attributes.get ( index )  ) ;^[CLASS] JDOMAttributeIterator  [METHOD] getNodePointer [RETURN_TYPE] NodePointer   [VARIABLES] List  allAttributes  attributes  NodePointer  parent  boolean  QName  name  int  i  index  position  
[buglab_swap_variables]^return attributes >= 1 && position <= position.size (  ) ;^188^^^^^183^189^return position >= 1 && position <= attributes.size (  ) ;^[CLASS] JDOMAttributeIterator  [METHOD] setPosition [RETURN_TYPE] boolean   int position [VARIABLES] List  allAttributes  attributes  NodePointer  parent  boolean  QName  name  int  i  index  position  
