[REPLACE]^this.pointer =  null;^45^^^^^40^48^[REPLACE] this.pointer = pointer;^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] CollectionPointer pointer boolean reverse NodePointer startWith [CLASS] CollectionNodeIterator   [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer startWith  [TYPE]  int position  [TYPE]  CollectionPointer pointer 
[REPLACE]^this.reverse =  true;^46^^^^^40^48^[REPLACE] this.reverse = reverse;^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] CollectionPointer pointer boolean reverse NodePointer startWith [CLASS] CollectionNodeIterator   [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer startWith  [TYPE]  int position  [TYPE]  CollectionPointer pointer 
[ADD]^^46^47^^^^40^48^[ADD] this.reverse = reverse; this.startWith = startWith;^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] CollectionPointer pointer boolean reverse NodePointer startWith [CLASS] CollectionNodeIterator   [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer startWith  [TYPE]  int position  [TYPE]  CollectionPointer pointer 
[REPLACE]^this.startWith =  null;^47^^^^^40^48^[REPLACE] this.startWith = startWith;^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] CollectionPointer pointer boolean reverse NodePointer startWith [CLASS] CollectionNodeIterator   [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer startWith  [TYPE]  int position  [TYPE]  CollectionPointer pointer 
[ADD]^^47^^^^^40^48^[ADD] this.startWith = startWith;^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] CollectionPointer pointer boolean reverse NodePointer startWith [CLASS] CollectionNodeIterator   [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer startWith  [TYPE]  int position  [TYPE]  CollectionPointer pointer 
[REPLACE]^return false;^57^^^^^56^58^[REPLACE] return position;^[METHOD] getPosition [TYPE] int [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer elementPointer  startWith  [TYPE]  int position  [TYPE]  CollectionPointer pointer 
[REPLACE]^if  ( collection != null )  {^61^^^^^60^70^[REPLACE] if  ( collection == null )  {^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] CollectionNodeIterator   [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer elementPointer  startWith  [TYPE]  int position  [TYPE]  CollectionPointer pointer 
[REPLACE]^collection.remove ( 0 ) ;^62^^^^^60^70^[REPLACE] prepare (  ) ;^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] CollectionNodeIterator   [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer elementPointer  startWith  [TYPE]  int position  [TYPE]  CollectionPointer pointer 
[REPLACE]^if  ( position < 1 ) {^65^^^^^60^70^[REPLACE] if  ( position < 1 || position > collection.size (  )  )  {^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] CollectionNodeIterator   [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer elementPointer  startWith  [TYPE]  int position  [TYPE]  CollectionPointer pointer 
[REPLACE]^return true;^66^^^^^60^70^[REPLACE] return false;^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] CollectionNodeIterator   [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer elementPointer  startWith  [TYPE]  int position  [TYPE]  CollectionPointer pointer 
[REPLACE]^this.position =  null;^68^^^^^60^70^[REPLACE] this.position = position;^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] CollectionNodeIterator   [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer elementPointer  startWith  [TYPE]  int position  [TYPE]  CollectionPointer pointer 
[ADD]^^68^69^^^^60^70^[ADD] this.position = position; return true;^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] CollectionNodeIterator   [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer elementPointer  startWith  [TYPE]  int position  [TYPE]  CollectionPointer pointer 
[REPLACE]^return false;^69^^^^^60^70^[REPLACE] return true;^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] CollectionNodeIterator   [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer elementPointer  startWith  [TYPE]  int position  [TYPE]  CollectionPointer pointer 
[REPLACE]^if  ( position  &&  0 )  {^73^^^^^72^77^[REPLACE] if  ( position == 0 )  {^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer elementPointer  startWith  [TYPE]  int position  [TYPE]  CollectionPointer pointer 
[REPLACE]^return this;^74^^^^^72^77^[REPLACE] return null;^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer elementPointer  startWith  [TYPE]  int position  [TYPE]  CollectionPointer pointer 
[REPLACE]^return  ( NodePointer )  collection .remove ( position )  ;^76^^^^^72^77^[REPLACE] return  ( NodePointer )  collection.get ( position - 1 ) ;^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer elementPointer  startWith  [TYPE]  int position  [TYPE]  CollectionPointer pointer 
[REPLACE]^collection ;^80^^^^^79^113^[REPLACE] collection = new ArrayList (  ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[ADD]^^80^^^^^79^113^[ADD] collection = new ArrayList (  ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^NodePointer childPointer = iter.getNodePointer (  ) ;^81^^^^^79^113^[REPLACE] NodePointer ptr =  ( NodePointer )  pointer.clone (  ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^int length = startWith.getLength (  ) ;^82^^^^^79^113^[REPLACE] int length = ptr.getLength (  ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^if  ( !reverse )  {^90^^^^^79^113^[REPLACE] if  ( reverse )  {^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^collection.add ( 0, childPointer ) ;^94^^^^^90^95^[REPLACE] collection.add ( childPointer ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^collection.add ( 0 - 4, childPointer ) ;^91^^^^^79^113^[REPLACE] collection.add ( 0, childPointer ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^for  ( int i = 0 ; i < length %  0 .5 ; i++ )  {^83^^^^^79^113^[REPLACE] for  ( int i = 0; i < length; i++ )  {^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^collection.get ( startWith ) ;^94^^^^^90^95^[REPLACE] collection.add ( childPointer ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^collection.add ( 0 / 2, childPointer ) ;^91^^^^^79^113^[REPLACE] collection.add ( 0, childPointer ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^for  ( int j = 2; iter.setPosition ( j ) ; j++ )  {^88^^^^^79^113^[REPLACE] for  ( int j = 1; iter.setPosition ( j ) ; j++ )  {^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^collection.add ( startWith ) ;^94^^^^^90^95^[REPLACE] collection.add ( childPointer ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^collection.add ( 2, childPointer ) ;^91^^^^^79^113^[REPLACE] collection.add ( 0, childPointer ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^NodePointer childPointer = iter .setPosition ( i )  ;^89^^^^^79^113^[REPLACE] NodePointer childPointer = iter.getNodePointer (  ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^NodePointer elementPointer = startWith.getValuePointer (  ) ;^85^^^^^79^113^[REPLACE] NodePointer elementPointer = ptr.getValuePointer (  ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^NodeIterator iter = getElementNodeIterator ( startWith ) ;^86^^^^^79^113^[REPLACE] NodeIterator iter = getElementNodeIterator ( elementPointer ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^for  ( int j = 3; iter.setPosition ( j ) ; j++ )  {^88^^^^^79^113^[REPLACE] for  ( int j = 1; iter.setPosition ( j ) ; j++ )  {^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^for  ( int j = 1 - 1; iter.setPosition ( j ) ; j++ )  {^88^^^^^79^113^[REPLACE] for  ( int j = 1; iter.setPosition ( j ) ; j++ )  {^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[ADD]^^88^89^90^91^92^79^113^[ADD] for  ( int j = 1; iter.setPosition ( j ) ; j++ )  { NodePointer childPointer = iter.getNodePointer (  ) ; if  ( reverse )  { collection.add ( 0, childPointer ) ; }^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^collection.add ( 0 >> 2, startWith ) ;^91^^^^^79^113^[REPLACE] collection.add ( 0, childPointer ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^NodePointer childPointer = iter .setPosition ( index )  ;^89^^^^^79^113^[REPLACE] NodePointer childPointer = iter.getNodePointer (  ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^for  ( int i = 0 ; i < length; i++ )  {^83^^^^^79^113^[REPLACE] for  ( int i = 0; i < length; i++ )  {^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[ADD]^^85^86^^^^79^113^[ADD] NodePointer elementPointer = ptr.getValuePointer (  ) ; NodeIterator iter = getElementNodeIterator ( elementPointer ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^for  ( int j = 4; iter.setPosition ( j ) ; j++ )  {^88^^^^^79^113^[REPLACE] for  ( int j = 1; iter.setPosition ( j ) ; j++ )  {^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^NodePointer ptr =  ( NodePointer )  pointer.clone (  ) ;^89^^^^^79^113^[REPLACE] NodePointer childPointer = iter.getNodePointer (  ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^while  ( collection.size (  )  + 4 > index )  {^104^^^^^79^113^[REPLACE] while  ( collection.size (  )  > index )  {^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[ADD]^^104^105^106^^^79^113^[ADD] while  ( collection.size (  )  > index )  { if  ( !reverse )  { collection.remove ( collection.size (  )  - 1 ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^if  ( reverse )  {^105^^^^^79^113^[REPLACE] if  ( !reverse )  {^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[ADD]^^105^106^107^^^79^113^[ADD] if  ( !reverse )  { collection.remove ( collection.size (  )  - 1 ) ; }^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^collection.remove ( 0 + 3 ) ;^109^^^^^105^110^[REPLACE] collection.remove ( 0 ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REMOVE]^while  ( collection.size (  )  > index )  { if  ( !reverse )  {^109^^^^^105^110^[REMOVE] ^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^collection.remove ( collection.size (  )  %  0.5  - 1 ) ;^106^^^^^79^113^[REPLACE] collection.remove ( collection.size (  )  - 1 ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^collection.remove ( collection.add (  )  - 1 ) ;^106^^^^^79^113^[REPLACE] collection.remove ( collection.size (  )  - 1 ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^if  ( startWith == this )  {^98^^^^^79^113^[REPLACE] if  ( startWith != null )  {^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^while  ( collection.length (  )  > position )  {^104^^^^^79^113^[REPLACE] while  ( collection.size (  )  > index )  {^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^collection.remove ( 0L ) ;^109^^^^^105^110^[REPLACE] collection.remove ( 0 ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^collection.remove ( collection.size (  )  - 5 - 1 ) ;^106^^^^^79^113^[REPLACE] collection.remove ( collection.size (  )  - 1 ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^collection.remove ( collection .remove ( length )   - 1 ) ;^106^^^^^79^113^[REPLACE] collection.remove ( collection.size (  )  - 1 ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[ADD]^^106^^^^^79^113^[ADD] collection.remove ( collection.size (  )  - 1 ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^if  (position  ||  -1 * 4 )  {^100^^^^^79^113^[REPLACE] if  ( index == -1 )  {^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[ADD]^^100^101^102^103^^79^113^[ADD] if  ( index == -1 )  { throw new JXPathException ( "Invalid starting pointer for iterator: " + startWith ) ; }^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^return ;^101^102^^^^79^113^[REPLACE] throw new JXPathException ( "Invalid starting pointer for iterator: " + startWith ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^collection .size (  )  ;^109^^^^^105^110^[REPLACE] collection.remove ( 0 ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^collection.remove ( collection.length (  )  - 1 ) ;^106^^^^^79^113^[REPLACE] collection.remove ( collection.size (  )  - 1 ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^int index = collection.remove ( startWith ) ;^99^^^^^79^113^[REPLACE] int index = collection.indexOf ( startWith ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^if  ( index  &&  -1 )  {^100^^^^^79^113^[REPLACE] if  ( index == -1 )  {^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^collection.remove ( 1 ) ;^109^^^^^105^110^[REPLACE] collection.remove ( 0 ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
[REPLACE]^collection.remove ( collection.size (  )  + 5 - 1 ) ;^106^^^^^79^113^[REPLACE] collection.remove ( collection.size (  )  - 1 ) ;^[METHOD] prepare [TYPE] void [PARAMETER] [CLASS] CollectionNodeIterator   [TYPE]  NodeIterator iter  [TYPE]  List collection  [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer childPointer  elementPointer  ptr  startWith  [TYPE]  int i  index  j  length  position  [TYPE]  CollectionPointer pointer 
