[REPLACE]^private int position  = null ;^40^^^^^^^[REPLACE] private int position = 0;^ [CLASS] JDOMNamespaceIterator  
[REPLACE]^this.parent =  null;^43^^^^^42^53^[REPLACE] this.parent = parent;^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] NodePointer parent [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  [TYPE]  Object node  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int position 
[REPLACE]^Namespace ns = element.getNamespace (  ) ;^44^^^^^42^53^[REPLACE] Object node = parent.getNode (  ) ;^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] NodePointer parent [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  [TYPE]  Object node  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int position 
[REPLACE]^if  ( ! node instanceof Document )  {^45^^^^^42^53^[REPLACE] if  ( node instanceof Document )  {^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] NodePointer parent [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  [TYPE]  Object node  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int position 
[REPLACE]^node =   (  ( Document ) node ) .getRootElement (  ) ;^46^^^^^42^53^[REPLACE] node =  (  ( Document ) node ) .getRootElement (  ) ;^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] NodePointer parent [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  [TYPE]  Object node  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int position 
[ADD]^^46^^^^^42^53^[ADD] node =  (  ( Document ) node ) .getRootElement (  ) ;^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] NodePointer parent [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  [TYPE]  Object node  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int position 
[REPLACE]^if  ( ! node instanceof Element )  {^48^^^^^42^53^[REPLACE] if  ( node instanceof Element )  {^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] NodePointer parent [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  [TYPE]  Object node  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int position 
[REPLACE]^namespaces =  new HashSet (  )  ;^49^^^^^42^53^[REPLACE] namespaces = new ArrayList (  ) ;^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] NodePointer parent [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  [TYPE]  Object node  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int position 
[ADD]^^49^^^^^42^53^[ADD] namespaces = new ArrayList (  ) ;^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] NodePointer parent [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  [TYPE]  Object node  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int position 
[REPLACE]^prefixes =  new ArrayList (  )  ;^50^^^^^42^53^[REPLACE] prefixes = new HashSet (  ) ;^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] NodePointer parent [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  [TYPE]  Object node  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int position 
[ADD]^^49^50^^^^42^53^[ADD] namespaces = new ArrayList (  ) ; prefixes = new HashSet (  ) ;^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] NodePointer parent [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  [TYPE]  Object node  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int position 
[ADD]^^50^^^^^42^53^[ADD] prefixes = new HashSet (  ) ;^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] NodePointer parent [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  [TYPE]  Object node  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int position 
[REPLACE]^Namespace ns = element.getParent (  ) ;^56^^^^^55^73^[REPLACE] Namespace ns = element.getNamespace (  ) ;^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[REPLACE]^if  ( ns == null && !prefixes.contains ( ns.getPrefix (  )  )  )  {^57^^^^^55^73^[REPLACE] if  ( ns != null && !prefixes.contains ( ns.getPrefix (  )  )  )  {^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[REPLACE]^collectNamespaces (  ( Element )  node ) ;^58^^^^^55^73^[REPLACE] namespaces.add ( ns ) ;^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[REPLACE]^prefixes.contains ( ns.getPrefix (  )  ) ;^59^^^^^55^73^[REPLACE] prefixes.add ( ns.getPrefix (  )  ) ;^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[REPLACE]^prefixes.add ( ns.getURI (  )  ) ;^59^^^^^55^73^[REPLACE] prefixes.add ( ns.getPrefix (  )  ) ;^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[REPLACE]^List others = element.getNamespace (  ) ;^61^^^^^55^73^[REPLACE] List others = element.getAdditionalNamespaces (  ) ;^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[REPLACE]^if  ( ns == null && !prefixes.contains ( ns.getPrefix (  )  )  )  {^64^^^^^55^73^[REPLACE] if  ( ns != null && !prefixes.contains ( ns.getPrefix (  )  )  )  {^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[ADD]^namespaces.add ( ns ) ;prefixes.add ( ns.getPrefix (  )  ) ;^64^65^66^67^^55^73^[ADD] if  ( ns != null && !prefixes.contains ( ns.getPrefix (  )  )  )  { namespaces.add ( ns ) ; prefixes.add ( ns.getPrefix (  )  ) ; }^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[REPLACE]^namespaces.get ( ns ) ;^65^^^^^55^73^[REPLACE] namespaces.add ( ns ) ;^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[REPLACE]^prefixes.add ( ns.getURI (  )  ) ;^66^^^^^55^73^[REPLACE] prefixes.add ( ns.getPrefix (  )  ) ;^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[REPLACE]^prefixes.add ( ns .getURI (  )   ) ;^66^^^^^55^73^[REPLACE] prefixes.add ( ns.getPrefix (  )  ) ;^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[ADD]^^66^^^^^55^73^[ADD] prefixes.add ( ns.getPrefix (  )  ) ;^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[REPLACE]^for  ( int i = 0; i < others.size (  )  - 4; i++ )  {^62^^^^^55^73^[REPLACE] for  ( int i = 0; i < others.size (  ) ; i++ )  {^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[ADD]^^62^63^64^65^66^55^73^[ADD] for  ( int i = 0; i < others.size (  ) ; i++ )  { ns =  ( Namespace )  others.get ( i ) ; if  ( ns != null && !prefixes.contains ( ns.getPrefix (  )  )  )  { namespaces.add ( ns ) ; prefixes.add ( ns.getPrefix (  )  ) ;^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[ADD]^prefixes.add ( ns.getPrefix (  )  ) ;^65^66^^^^55^73^[ADD] namespaces.add ( ns ) ; prefixes.add ( ns.getPrefix (  )  ) ;^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[REPLACE]^prefixes.contains ( ns.getPrefix (  )  ) ;^66^^^^^55^73^[REPLACE] prefixes.add ( ns.getPrefix (  )  ) ;^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[REPLACE]^ns =   ( Namespace )  namespaces.get ( i ) ;^63^^^^^55^73^[REPLACE] ns =  ( Namespace )  others.get ( i ) ;^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[ADD]^^63^^^^^55^73^[ADD] ns =  ( Namespace )  others.get ( i ) ;^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[REPLACE]^for  ( int i = 0 ; i < others.size (  ) ; i++ )  {^62^^^^^55^73^[REPLACE] for  ( int i = 0; i < others.size (  ) ; i++ )  {^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[REPLACE]^Object parent = element.getNamespace (  ) ;^69^^^^^55^73^[REPLACE] Object parent = element.getParent (  ) ;^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[REPLACE]^if  ( ! parent instanceof Element )  {^70^^^^^55^73^[REPLACE] if  ( parent instanceof Element )  {^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[REPLACE]^collectNamespaces (  ( Element )  node ) ;^71^^^^^55^73^[REPLACE] collectNamespaces (  ( Element ) parent ) ;^[METHOD] collectNamespaces [TYPE] void [PARAMETER] Element element [CLASS] JDOMNamespaceIterator   [TYPE]  Set prefixes  [TYPE]  boolean false  true  [TYPE]  Element element  [TYPE]  List namespaces  others  [TYPE]  Object parent  [TYPE]  NodePointer parent  [TYPE]  int i  position  [TYPE]  Namespace ns 
[REPLACE]^if  ( position  &&  0 )  {^76^^^^^75^88^[REPLACE] if  ( position == 0 )  {^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position  [TYPE]  Namespace ns 
[ADD]^^76^77^78^79^^75^88^[ADD] if  ( position == 0 )  { if  ( !setPosition ( 1 )  )  { return null; }^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position  [TYPE]  Namespace ns 
[REPLACE]^if  ( !setPosition ( 3 )  )  {^77^^^^^75^88^[REPLACE] if  ( !setPosition ( 1 )  )  {^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position  [TYPE]  Namespace ns 
[REPLACE]^return this;^78^^^^^75^88^[REPLACE] return null;^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position  [TYPE]  Namespace ns 
[REPLACE]^position = 0 + 3;^80^^^^^75^88^[REPLACE] position = 0;^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position  [TYPE]  Namespace ns 
[REPLACE]^return true;^78^^^^^75^88^[REPLACE] return null;^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position  [TYPE]  Namespace ns 
[REPLACE]^if  ( !setPosition ( 2 )  )  {^77^^^^^75^88^[REPLACE] if  ( !setPosition ( 1 )  )  {^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position  [TYPE]  Namespace ns 
[REPLACE]^position = 0 - 1;^80^^^^^75^88^[REPLACE] position = 0;^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position  [TYPE]  Namespace ns 
[REPLACE]^int index =index - 1;^82^^^^^75^88^[REPLACE] int index = position - 1;^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position  [TYPE]  Namespace ns 
[ADD]^^82^^^^^75^88^[ADD] int index = position - 1;^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position  [TYPE]  Namespace ns 
[REPLACE]^if  ( index  >=  1 )  {^83^^^^^75^88^[REPLACE] if  ( index < 0 )  {^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position  [TYPE]  Namespace ns 
[REPLACE]^index = 1;^84^^^^^75^88^[REPLACE] index = 0;^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position  [TYPE]  Namespace ns 
[REPLACE]^index = 2;^84^^^^^75^88^[REPLACE] index = 0;^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position  [TYPE]  Namespace ns 
[REPLACE]^Namespace ns =  ( Namespace )  namespaces.get ( position ) ;^86^^^^^75^88^[REPLACE] Namespace ns =  ( Namespace )  namespaces.get ( index ) ;^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position  [TYPE]  Namespace ns 
[ADD]^^86^^^^^75^88^[ADD] Namespace ns =  ( Namespace )  namespaces.get ( index ) ;^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position  [TYPE]  Namespace ns 
[REPLACE]^return new JDOMNamespacePointer ( parent, ns .getURI (  )  , ns.getURI (  )  ) ;^87^^^^^75^88^[REPLACE] return new JDOMNamespacePointer ( parent, ns.getPrefix (  ) , ns.getURI (  )  ) ;^[METHOD] getNodePointer [TYPE] NodePointer [PARAMETER] [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position  [TYPE]  Namespace ns 
[REPLACE]^return null;^91^^^^^90^92^[REPLACE] return position;^[METHOD] getPosition [TYPE] int [PARAMETER] [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position 
[REPLACE]^if  ( namespaces != null )  {^95^^^^^94^100^[REPLACE] if  ( namespaces == null )  {^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position 
[REPLACE]^return true;^96^^^^^94^100^[REPLACE] return false;^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position 
[REPLACE]^this.position =  null;^98^^^^^94^100^[REPLACE] this.position = position;^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position 
[REPLACE]^return position ;^99^^^^^94^100^[REPLACE] return position >= 1 && position <= namespaces.size (  ) ;^[METHOD] setPosition [TYPE] boolean [PARAMETER] int position [CLASS] JDOMNamespaceIterator   [TYPE]  List namespaces  others  [TYPE]  Set prefixes  [TYPE]  NodePointer parent  [TYPE]  boolean false  true  [TYPE]  int i  index  position 
