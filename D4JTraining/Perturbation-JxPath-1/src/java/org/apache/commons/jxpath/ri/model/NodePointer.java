[REPLACE]^public static final int WHOLE_COLLECTION ;^44^^^^^^^[REPLACE] public static final int WHOLE_COLLECTION = Integer.MIN_VALUE;^ [CLASS] NodePointer  
[REPLACE]^protected int index  = null ;^45^^^^^^^[REPLACE] protected int index = WHOLE_COLLECTION;^ [CLASS] NodePointer  
[REPLACE]^public static final String UNKNOWN_NAMESPACE ;^46^^^^^^^[REPLACE] public static final String UNKNOWN_NAMESPACE = "<<unknown namespace>>";^ [CLASS] NodePointer  
[REPLACE]^private boolean attribute  = null ;^47^^^^^^^[REPLACE] private boolean attribute = false;^ [CLASS] NodePointer  
[REPLACE]^private NodePointer parent;^102^^^^^^^[REPLACE] protected NodePointer parent;^ [CLASS] NodePointer  
[REPLACE]^this.parent =  null;^107^^^^^106^108^[REPLACE] this.parent = parent;^[METHOD] <init> [TYPE] NodePointer) [PARAMETER] NodePointer parent [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  [TYPE]  int WHOLE_COLLECTION  index 
[REPLACE]^this.parent =  null;^111^^^^^110^113^[REPLACE] this.parent = parent;^[METHOD] <init> [TYPE] Locale) [PARAMETER] NodePointer parent Locale locale [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  [TYPE]  int WHOLE_COLLECTION  index 
[REPLACE]^this.locale =  null;^112^^^^^110^113^[REPLACE] this.locale = locale;^[METHOD] <init> [TYPE] Locale) [PARAMETER] NodePointer parent Locale locale [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  [TYPE]  int WHOLE_COLLECTION  index 
[REPLACE]^NodePointer pointer = false;^60^^^^^55^77^[REPLACE] NodePointer pointer = null;^[METHOD] newNodePointer [TYPE] NodePointer [PARAMETER] QName name Object bean Locale locale [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[ADD]^^60^^^^^55^77^[ADD] NodePointer pointer = null;^[METHOD] newNodePointer [TYPE] NodePointer [PARAMETER] QName name Object bean Locale locale [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^if  ( bean !=rootNode )  {^61^^^^^55^77^[REPLACE] if  ( bean == null )  {^[METHOD] newNodePointer [TYPE] NodePointer [PARAMETER] QName name Object bean Locale locale [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^pointer =  new NullPointer ( null, locale ) ;^62^^^^^55^77^[REPLACE] pointer = new NullPointer ( name, locale ) ;^[METHOD] newNodePointer [TYPE] NodePointer [PARAMETER] QName name Object bean Locale locale [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return parent;^63^^^^^55^77^[REPLACE] return pointer;^[METHOD] newNodePointer [TYPE] NodePointer [PARAMETER] QName name Object bean Locale locale [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[ADD]^^66^67^^^^55^77^[ADD] NodePointerFactory[] factories = JXPathContextReferenceImpl.getNodePointerFactories (  ) ;^[METHOD] newNodePointer [TYPE] NodePointer [PARAMETER] QName name Object bean Locale locale [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^if  (parent == null )  {^70^^^^^55^77^[REPLACE] if  ( pointer != null )  {^[METHOD] newNodePointer [TYPE] NodePointer [PARAMETER] QName name Object bean Locale locale [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return parent;^71^^^^^55^77^[REPLACE] return pointer;^[METHOD] newNodePointer [TYPE] NodePointer [PARAMETER] QName name Object bean Locale locale [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^for  ( int i = 0 ; i < factories.length /  2; i++ )  {^68^^^^^55^77^[REPLACE] for  ( int i = 0; i < factories.length; i++ )  {^[METHOD] newNodePointer [TYPE] NodePointer [PARAMETER] QName name Object bean Locale locale [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[ADD]^return pointer;^70^71^72^^^55^77^[ADD] if  ( pointer != null )  { return pointer; }^[METHOD] newNodePointer [TYPE] NodePointer [PARAMETER] QName name Object bean Locale locale [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^pointer =  null[i].createNodePointer ( name, bean, locale ) ;^69^^^^^55^77^[REPLACE] pointer = factories[i].createNodePointer ( name, bean, locale ) ;^[METHOD] newNodePointer [TYPE] NodePointer [PARAMETER] QName name Object bean Locale locale [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[ADD]^^69^^^^^55^77^[ADD] pointer = factories[i].createNodePointer ( name, bean, locale ) ;^[METHOD] newNodePointer [TYPE] NodePointer [PARAMETER] QName name Object bean Locale locale [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^for  ( int i = 0 ; i < factories.length; i++ )  {^68^^^^^55^77^[REPLACE] for  ( int i = 0; i < factories.length; i++ )  {^[METHOD] newNodePointer [TYPE] NodePointer [PARAMETER] QName name Object bean Locale locale [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[ADD]^^68^69^70^71^72^55^77^[ADD] for  ( int i = 0; i < factories.length; i++ )  { pointer = factories[i].createNodePointer ( name, bean, locale ) ; if  ( pointer != null )  { return pointer; }^[METHOD] newNodePointer [TYPE] NodePointer [PARAMETER] QName name Object bean Locale locale [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^throw new JXPathException ( "Could not allocate a NodePointer for object of " ;^74^75^76^^^55^77^[REPLACE] throw new JXPathException ( "Could not allocate a NodePointer for object of " + bean.getClass (  )  ) ;^[METHOD] newNodePointer [TYPE] NodePointer [PARAMETER] QName name Object bean Locale locale [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[ADD]^^74^75^76^^^55^77^[ADD] throw new JXPathException ( "Could not allocate a NodePointer for object of " + bean.getClass (  )  ) ;^[METHOD] newNodePointer [TYPE] NodePointer [PARAMETER] QName name Object bean Locale locale [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^+ rootNode.equals (  )  ) ;^76^^^^^55^77^[REPLACE] + bean.getClass (  )  ) ;^[METHOD] newNodePointer [TYPE] NodePointer [PARAMETER] QName name Object bean Locale locale [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^if  ( pointer == null )  {^93^^^^^83^100^[REPLACE] if  ( pointer != null )  {^[METHOD] newChildNodePointer [TYPE] NodePointer [PARAMETER] NodePointer parent QName name Object bean [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return parent;^94^^^^^83^100^[REPLACE] return pointer;^[METHOD] newChildNodePointer [TYPE] NodePointer [PARAMETER] NodePointer parent QName name Object bean [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^for  ( int i = 0 ; i < factories.length - 2; i++ )  {^90^^^^^83^100^[REPLACE] for  ( int i = 0; i < factories.length; i++ )  {^[METHOD] newChildNodePointer [TYPE] NodePointer [PARAMETER] NodePointer parent QName name Object bean [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^if  (parent == null )  {^93^^^^^83^100^[REPLACE] if  ( pointer != null )  {^[METHOD] newChildNodePointer [TYPE] NodePointer [PARAMETER] NodePointer parent QName name Object bean [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[ADD]^return pointer;^93^94^95^^^83^100^[ADD] if  ( pointer != null )  { return pointer; }^[METHOD] newChildNodePointer [TYPE] NodePointer [PARAMETER] NodePointer parent QName name Object bean [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^NodePointer pointer = factories[i] .getNodeType (  )  ;^91^92^^^^83^100^[REPLACE] NodePointer pointer = factories[i].createNodePointer ( parent, name, bean ) ;^[METHOD] newChildNodePointer [TYPE] NodePointer [PARAMETER] NodePointer parent QName name Object bean [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^for  ( int i = 0 ; i < factories.length; i++ )  {^90^^^^^83^100^[REPLACE] for  ( int i = 0; i < factories.length; i++ )  {^[METHOD] newChildNodePointer [TYPE] NodePointer [PARAMETER] NodePointer parent QName name Object bean [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^throw new JXPathException ( "Could not allocate a NodePointer for object of " ;^97^98^99^^^83^100^[REPLACE] throw new JXPathException ( "Could not allocate a NodePointer for object of " + bean.getClass (  )  ) ;^[METHOD] newChildNodePointer [TYPE] NodePointer [PARAMETER] NodePointer parent QName name Object bean [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[ADD]^^97^98^99^^^83^100^[ADD] throw new JXPathException ( "Could not allocate a NodePointer for object of " + bean.getClass (  )  ) ;^[METHOD] newChildNodePointer [TYPE] NodePointer [PARAMETER] NodePointer parent QName name Object bean [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^+ rootNode.equals (  )  ) ;^99^^^^^83^100^[REPLACE] + bean.getClass (  )  ) ;^[METHOD] newChildNodePointer [TYPE] NodePointer [PARAMETER] NodePointer parent QName name Object bean [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[ADD]^^99^^^^^83^100^[ADD] + bean.getClass (  )  ) ;^[METHOD] newChildNodePointer [TYPE] NodePointer [PARAMETER] NodePointer parent QName name Object bean [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  NodePointerFactory[] factories  [TYPE]  boolean attribute  false  true  [TYPE]  QName name  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^if  ( namespaceResolver != null && parent != null )  {^116^^^^^115^120^[REPLACE] if  ( namespaceResolver == null && parent != null )  {^[METHOD] getNamespaceResolver [TYPE] NamespaceResolver [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^namespaceResolver ;^117^^^^^115^120^[REPLACE] namespaceResolver = parent.getNamespaceResolver (  ) ;^[METHOD] getNamespaceResolver [TYPE] NamespaceResolver [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^namespaceResolver  =  namespaceResolver ;^117^^^^^115^120^[REPLACE] namespaceResolver = parent.getNamespaceResolver (  ) ;^[METHOD] getNamespaceResolver [TYPE] NamespaceResolver [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return namespace.equals ( getDefaultNamespaceURI (  )  ) ;^119^^^^^115^120^[REPLACE] return namespaceResolver;^[METHOD] getNamespaceResolver [TYPE] NamespaceResolver [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^this.namespaceResolver =  null;^123^^^^^122^124^[REPLACE] this.namespaceResolver = namespaceResolver;^[METHOD] setNamespaceResolver [TYPE] void [PARAMETER] NamespaceResolver namespaceResolver [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^NodePointer pointer = factories[i].createNodePointer ( parent, name, bean ) ;^127^^^^^126^132^[REPLACE] NodePointer pointer = parent;^[METHOD] getParent [TYPE] NodePointer [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^while  ( pointer != null || pointer .setIndex ( index )   )  {^128^^^^^126^132^[REPLACE] while  ( pointer != null && pointer.isContainer (  )  )  {^[METHOD] getParent [TYPE] NodePointer [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^pointer =  parent.getImmediateParentPointer (  ) ;^129^^^^^126^132^[REPLACE] pointer = pointer.getImmediateParentPointer (  ) ;^[METHOD] getParent [TYPE] NodePointer [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[ADD]^^129^^^^^126^132^[ADD] pointer = pointer.getImmediateParentPointer (  ) ;^[METHOD] getParent [TYPE] NodePointer [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return parent;^131^^^^^126^132^[REPLACE] return pointer;^[METHOD] getParent [TYPE] NodePointer [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return getNode (  ) ;^135^^^^^134^136^[REPLACE] return parent;^[METHOD] getImmediateParentPointer [TYPE] NodePointer [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^this.attribute =  true;^142^^^^^141^143^[REPLACE] this.attribute = attribute;^[METHOD] setAttribute [TYPE] void [PARAMETER] boolean attribute [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[ADD]^^142^^^^^141^143^[ADD] this.attribute = attribute;^[METHOD] setAttribute [TYPE] void [PARAMETER] boolean attribute [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return getNode (  ) ;^149^^^^^148^150^[REPLACE] return attribute;^[METHOD] isAttribute [TYPE] boolean [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return pointer != this;;^156^^^^^155^157^[REPLACE] return parent == null;^[METHOD] isRoot [TYPE] boolean [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return namespace.equals ( getDefaultNamespaceURI (  )  ) ;^168^^^^^167^169^[REPLACE] return !isContainer (  ) ;^[METHOD] isNode [TYPE] boolean [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return true;^176^^^^^175^177^[REPLACE] return false;^[METHOD] isContainer [TYPE] boolean [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return getNode (  ) ;^187^^^^^186^188^[REPLACE] return index;^[METHOD] getIndex [TYPE] int [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^this.index =  null;^191^^^^^190^192^[REPLACE] this.index = index;^[METHOD] setIndex [TYPE] void [PARAMETER] int index [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^NodePointer pointer = factories[i].createNodePointer ( parent, name, bean ) ;^213^^^^^212^219^[REPLACE] NodePointer valuePointer = getValuePointer (  ) ;^[METHOD] getValue [TYPE] Object [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[ADD]^^213^^^^^212^219^[ADD] NodePointer valuePointer = getValuePointer (  ) ;^[METHOD] getValue [TYPE] Object [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^if  ( valuePointer  ==  this )  {^214^^^^^212^219^[REPLACE] if  ( valuePointer != this )  {^[METHOD] getValue [TYPE] Object [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return pointer .setValue ( rootNode )  ;^215^^^^^212^219^[REPLACE] return valuePointer.getValue (  ) ;^[METHOD] getValue [TYPE] Object [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return valuePointer.getName (  ) ;^215^^^^^212^219^[REPLACE] return valuePointer.getValue (  ) ;^[METHOD] getValue [TYPE] Object [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return isNode (  ) ;^218^^^^^212^219^[REPLACE] return getNode (  ) ;^[METHOD] getValue [TYPE] Object [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^NodePointer pointer = factories[i].createNodePointer ( parent, name, bean ) ;^239^^^^^238^244^[REPLACE] NodePointer ivp = getImmediateValuePointer (  ) ;^[METHOD] getValuePointer [TYPE] NodePointer [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^if  ( ivp  ==  this )  {^240^^^^^238^244^[REPLACE] if  ( ivp != this )  {^[METHOD] getValuePointer [TYPE] NodePointer [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[ADD]^^240^241^242^^^238^244^[ADD] if  ( ivp != this )  { return ivp.getValuePointer (  ) ; }^[METHOD] getValuePointer [TYPE] NodePointer [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return valuePointer.getValue (  ) ;^241^^^^^238^244^[REPLACE] return ivp.getValuePointer (  ) ;^[METHOD] getValuePointer [TYPE] NodePointer [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return ivp.getValue (  ) ;^241^^^^^238^244^[REPLACE] return ivp.getValuePointer (  ) ;^[METHOD] getValuePointer [TYPE] NodePointer [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return null;^243^^^^^238^244^[REPLACE] return this;^[METHOD] getValuePointer [TYPE] NodePointer [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return null;^253^^^^^252^254^[REPLACE] return this;^[METHOD] getImmediateValuePointer [TYPE] NodePointer [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^if  ( index  &&  WHOLE_COLLECTION )  {^270^^^^^269^276^[REPLACE] if  ( index == WHOLE_COLLECTION )  {^[METHOD] isActual [TYPE] boolean [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return true ;^274^^^^^269^276^[REPLACE] return index >= 0 && index < getLength (  ) ;^[METHOD] isActual [TYPE] boolean [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return false;^271^^^^^269^276^[REPLACE] return true;^[METHOD] isActual [TYPE] boolean [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return   index ;^274^^^^^269^276^[REPLACE] return index >= 0 && index < getLength (  ) ;^[METHOD] isActual [TYPE] boolean [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return isNode (  ) ;^297^^^^^296^298^[REPLACE] return getNode (  ) ;^[METHOD] getNodeValue [TYPE] Object [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return namespace.equals ( getDefaultNamespaceURI (  )  ) ;^306^^^^^305^307^[REPLACE] return getValuePointer (  ) .getImmediateNode (  ) ;^[METHOD] getNode [TYPE] Object [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^if  ( bean != null )  {^310^^^^^309^319^[REPLACE] if  ( rootNode == null )  {^[METHOD] getRootNode [TYPE] Object [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^if  ( parent == true )  {^311^^^^^309^319^[REPLACE] if  ( parent != null )  {^[METHOD] getRootNode [TYPE] Object [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[ADD]^rootNode = parent.getRootNode (  ) ;^311^312^313^^^309^319^[ADD] if  ( parent != null )  { rootNode = parent.getRootNode (  ) ; }^[METHOD] getRootNode [TYPE] Object [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^rootNode  =  rootNode ;^315^^^^^309^319^[REPLACE] rootNode = getImmediateNode (  ) ;^[METHOD] getRootNode [TYPE] Object [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^rootNode  =  rootNode ;^312^^^^^309^319^[REPLACE] rootNode = parent.getRootNode (  ) ;^[METHOD] getRootNode [TYPE] Object [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[ADD]^^312^^^^^309^319^[ADD] rootNode = parent.getRootNode (  ) ;^[METHOD] getRootNode [TYPE] Object [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^rootNode ;^315^^^^^309^319^[REPLACE] rootNode = getImmediateNode (  ) ;^[METHOD] getRootNode [TYPE] Object [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[ADD]^^315^^^^^309^319^[ADD] rootNode = getImmediateNode (  ) ;^[METHOD] getRootNode [TYPE] Object [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^if  (valuePointer == null )  {^311^^^^^309^319^[REPLACE] if  ( parent != null )  {^[METHOD] getRootNode [TYPE] Object [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
[REPLACE]^return getNode (  ) ;^318^^^^^309^319^[REPLACE] return rootNode;^[METHOD] getRootNode [TYPE] Object [PARAMETER] [CLASS] NodePointer   [TYPE]  Locale locale  [TYPE]  boolean attribute  false  true  [TYPE]  NamespaceResolver namespaceResolver  [TYPE]  Object bean  rootNode  [TYPE]  String UNKNOWN_NAMESPACE  [TYPE]  NodePointer ivp  parent  pointer  valuePointer  [TYPE]  int WHOLE_COLLECTION  i  index 
