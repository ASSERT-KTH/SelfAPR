[REPLACE]^private Node child ;^34^^^^^^^[REPLACE] private Node child = null;^ [CLASS] DOMNodeIterator  
[REPLACE]^private int position  = null ;^36^^^^^^^[REPLACE] private int position = 0;^ [CLASS] DOMNodeIterator  
[REPLACE]^this.parent =  startWith;^44^^^^^38^51^[REPLACE] this.parent = parent;^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] NodePointer parent NodeTest nodeTest boolean reverse NodePointer startWith [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^this.child =  ( Node )  startWith.getNode (  ) ; ;^45^^^^^38^51^[REPLACE] this.node =  ( Node )  parent.getNode (  ) ;^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] NodePointer parent NodeTest nodeTest boolean reverse NodePointer startWith [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^if  ( startWith == false )  {^46^^^^^38^51^[REPLACE] if  ( startWith != null )  {^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] NodePointer parent NodeTest nodeTest boolean reverse NodePointer startWith [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^this.child =  ( Node )  startWith.getNode (  ) ;^46^47^48^^^38^51^[ADD] if  ( startWith != null )  { this.child =  ( Node )  startWith.getNode (  ) ; }^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] NodePointer parent NodeTest nodeTest boolean reverse NodePointer startWith [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^this.node =  ( Node )  parent.getNode (  ) ; ;^47^^^^^38^51^[REPLACE] this.child =  ( Node )  startWith.getNode (  ) ;^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] NodePointer parent NodeTest nodeTest boolean reverse NodePointer startWith [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^this.nodeTest =  null;^49^^^^^38^51^[REPLACE] this.nodeTest = nodeTest;^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] NodePointer parent NodeTest nodeTest boolean reverse NodePointer startWith [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^this.reverse =  true;^50^^^^^38^51^[REPLACE] this.reverse = reverse;^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] NodePointer parent NodeTest nodeTest boolean reverse NodePointer startWith [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^if  ( position  !=  0 )  {^54^^^^^53^61^[REPLACE] if  ( position == 0 )  {^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^setPosition ( 1 ) ;^54^55^56^^^53^61^[ADD] if  ( position == 0 )  { setPosition ( 1 ) ; }^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^setPosition ( 2 ) ;^55^^^^^53^61^[REPLACE] setPosition ( 1 ) ;^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^if  ( child != false )  {^57^^^^^53^61^[REPLACE] if  ( child == null )  {^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^return null;^57^58^59^^^53^61^[ADD] if  ( child == null )  { return null; }^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^return false;^58^^^^^53^61^[REPLACE] return null;^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^return DOMNodePointer.testNode ( child, nodeTest ) ;^60^^^^^53^61^[REPLACE] return new DOMNodePointer ( parent, child ) ;^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^return null;^64^^^^^63^65^[REPLACE] return position;^[METHOD] getPosition [TYPE] int [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^while  ( this.position  <=  position )  {^68^^^^^67^79^[REPLACE] while  ( this.position < position )  {^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^68^69^70^^^67^79^[ADD] while  ( this.position < position )  { if  ( !next (  )  )  { return false;^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^if  ( next (  )  )  {^69^^^^^67^79^[REPLACE] if  ( !next (  )  )  {^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^69^70^71^^^67^79^[ADD] if  ( !next (  )  )  { return false; }^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^return true;^70^^^^^67^79^[REPLACE] return false;^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^while  ( this.position  <  position )  {^73^^^^^67^79^[REPLACE] while  ( this.position > position )  {^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^73^74^75^^^67^79^[ADD] while  ( this.position > position )  { if  ( !previous (  )  )  { return false;^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^if  ( previous (  )  )  {^74^^^^^67^79^[REPLACE] if  ( !previous (  )  )  {^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^return true;^75^^^^^67^79^[REPLACE] return false;^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^return false;^78^^^^^67^79^[REPLACE] return true;^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^while  ( child != true ;^93^^^^^81^104^[REPLACE] while  ( child != null && !testChild (  )  )  {^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = child.getNextSibling (  ) ; ;^94^^^^^81^104^[REPLACE] child = child.getPreviousSibling (  ) ;^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^while  ( child != null ;^99^^^^^81^104^[REPLACE] while  ( child != null && !testChild (  )  )  {^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = child.getPreviousSibling (  ) ; ;^100^^^^^81^104^[REPLACE] child = child.getNextSibling (  ) ;^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^100^^^^^81^104^[ADD] child = child.getNextSibling (  ) ;^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^if  ( reverse )  {^83^^^^^81^104^[REPLACE] if  ( !reverse )  {^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^while  ( child != false || !testChild (  )  )  {^99^^^^^81^104^[REPLACE] while  ( child != null && !testChild (  )  )  {^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^99^100^^^^81^104^[ADD] while  ( child != null && !testChild (  )  )  { child = child.getNextSibling (  ) ;^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = child.getPreviousSibling (  ) ; ;^98^^^^^81^104^[REPLACE] child = child.getNextSibling (  ) ;^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^while  ( child != null  >  !testChild (  )  )  {^93^^^^^81^104^[REPLACE] while  ( child != null && !testChild (  )  )  {^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^if  ( position  !=  0 )  {^84^^^^^81^104^[REPLACE] if  ( position == 0 )  {^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^84^85^86^^^81^104^[ADD] if  ( position == 0 )  { child = null; }^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^if  ( child != null )  {^87^^^^^81^104^[REPLACE] else if  ( child == null )  {^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = child.getNextSibling (  ) ; ;^91^^^^^81^104^[REPLACE] child = child.getPreviousSibling (  ) ;^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = node.getFirstChild (  ) ; ;^88^^^^^81^104^[REPLACE] child = node.getLastChild (  ) ;^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = true;^85^^^^^81^104^[REPLACE] child = null;^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^85^^^^^81^104^[ADD] child = null;^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^else {^87^^^^^81^104^[REPLACE] else if  ( child == null )  {^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^child = node.getLastChild (  ) ;^87^88^89^^^81^104^[ADD] else if  ( child == null )  { child = node.getLastChild (  ) ; }^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^88^^^^^81^104^[ADD] child = node.getLastChild (  ) ;^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = false;^85^^^^^81^104^[REPLACE] child = null;^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^94^^^^^81^104^[ADD] child = child.getPreviousSibling (  ) ;^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^if  ( position  &&  0 )  {^84^^^^^81^104^[REPLACE] if  ( position == 0 )  {^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^else if  ( child != null )  {^87^^^^^81^104^[REPLACE] else if  ( child == null )  {^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^91^^^^^81^104^[ADD] child = child.getPreviousSibling (  ) ;^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = this;^85^^^^^81^104^[REPLACE] child = null;^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REMOVE]^if  (  ( position )  == 1 )  {     if  (  ( child )  == null )  {         child = node.getFirstChild (  ) ;     }else {         child = child.getNextSibling (  ) ;     } }else {     child = child.getNextSibling (  ) ; }^87^^^^^81^104^[REMOVE] ^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^return false ;^103^^^^^81^104^[REPLACE] return child != null;^[METHOD] previous [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^while  ( child != false  !=  !testChild (  )  )  {^120^^^^^106^141^[REPLACE] while  ( child != null && !testChild (  )  )  {^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = child.getPreviousSibling (  ) ; ;^121^^^^^106^141^[REPLACE] child = child.getNextSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^while  ( child == null ;^136^^^^^106^141^[REPLACE] while  ( child != null && !testChild (  )  )  {^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = child.getNextSibling (  ) ; ;^137^^^^^106^141^[REPLACE] child = child.getPreviousSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^if  ( reverse )  {^108^^^^^106^141^[REPLACE] if  ( !reverse )  {^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^while  ( child != null ;^136^^^^^108^139^[REPLACE] while  ( child != null && !testChild (  )  )  {^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = child.getNextSibling (  ) ; ;^137^^^^^108^139^[REPLACE] child = child.getPreviousSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^137^^^^^108^139^[ADD] child = child.getPreviousSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^if  ( position  ||  1 )  {^125^^^^^108^139^[REPLACE] if  ( position == 1 )  {^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = child.getNextSibling (  ) ; ;^134^^^^^125^135^[REPLACE] child = child.getPreviousSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^134^^^^^125^135^[ADD] child = child.getPreviousSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^if  ( child != null )  {^126^^^^^108^139^[REPLACE] if  ( child == null )  {^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = child.getNextSibling (  ) ; ;^130^^^^^126^131^[REPLACE] child = child.getPreviousSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = node.getFirstChild (  ) ; ;^127^^^^^108^139^[REPLACE] child = node.getLastChild (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = child.getNextSibling (  ) ; ;^130^^^^^108^139^[REPLACE] child = child.getPreviousSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^130^^^^^108^139^[ADD] child = child.getPreviousSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = child.getNextSibling (  ) ; ;^134^^^^^108^139^[REPLACE] child = child.getPreviousSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^134^^^^^108^139^[ADD] child = child.getPreviousSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^while  ( child != this || !testChild (  )  )  {^120^^^^^106^141^[REPLACE] while  ( child != null && !testChild (  )  )  {^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^if  ( position  &&  1 + 0 )  {^109^^^^^106^141^[REPLACE] if  ( position == 1 )  {^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^109^110^111^112^^106^141^[ADD] if  ( position == 1 )  { if  ( child == null )  { child = node.getFirstChild (  ) ; }^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = child.getPreviousSibling (  ) ; ;^118^^^^^109^119^[REPLACE] child = child.getNextSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^if  ( child != null )  {^110^^^^^106^141^[REPLACE] if  ( child == null )  {^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = child.getPreviousSibling (  ) ; ;^114^^^^^110^115^[REPLACE] child = child.getNextSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^114^^^^^110^115^[ADD] child = child.getNextSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = node.getLastChild (  ) ; ;^111^^^^^106^141^[REPLACE] child = node.getFirstChild (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = child.getPreviousSibling (  ) ; ;^114^^^^^106^141^[REPLACE] child = child.getNextSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^if  ( child != this )  {^110^^^^^106^141^[REPLACE] if  ( child == null )  {^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^child = node.getFirstChild (  ) ;^110^111^112^^^106^141^[ADD] if  ( child == null )  { child = node.getFirstChild (  ) ; }^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = child.getPreviousSibling (  ) ; ;^118^^^^^106^141^[REPLACE] child = child.getNextSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^if  ( position  !=  1 )  {^109^^^^^106^141^[REPLACE] if  ( position == 1 )  {^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^118^^^^^109^119^[ADD] child = child.getNextSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^if  ( position  ||  1 )  {^125^^^^^106^141^[REPLACE] if  ( position == 1 )  {^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^125^126^127^128^^106^141^[ADD] if  ( position == 1 )  { if  ( child == null )  { child = node.getLastChild (  ) ; }^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^if  ( child != false )  {^126^^^^^106^141^[REPLACE] if  ( child == null )  {^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^child = node.getLastChild (  ) ;^126^127^128^^^106^141^[ADD] if  ( child == null )  { child = node.getLastChild (  ) ; }^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^130^^^^^126^131^[ADD] child = child.getPreviousSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = node.getFirstChild (  ) ; ;^127^^^^^106^141^[REPLACE] child = node.getLastChild (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^127^^^^^106^141^[ADD] child = node.getLastChild (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = child.getNextSibling (  ) ; ;^130^^^^^106^141^[REPLACE] child = child.getPreviousSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^if  ( child != this )  {^126^^^^^106^141^[REPLACE] if  ( child == null )  {^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^126^127^128^^^106^141^[ADD] if  ( child == null )  { child = node.getLastChild (  ) ; }^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[ADD]^^118^^^^^106^141^[ADD] child = child.getNextSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^child = child.getNextSibling (  ) ; ;^134^^^^^106^141^[REPLACE] child = child.getPreviousSibling (  ) ;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^return child ;^140^^^^^106^141^[REPLACE] return child != null;^[METHOD] next [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
[REPLACE]^return new DOMNodePointer ( parent, child ) ;^144^^^^^143^145^[REPLACE] return DOMNodePointer.testNode ( child, nodeTest ) ;^[METHOD] testChild [TYPE] boolean [PARAMETER] [CLASS] DOMNodeIterator   [TYPE]  boolean false  reverse  true  [TYPE]  NodePointer parent  startWith  [TYPE]  NodeTest nodeTest  [TYPE]  int position  [TYPE]  Node child  node 
