[REPLACE]^private final XmlReadContext _parent;^23^^^^^^^[REPLACE] protected final XmlReadContext _parent;^ [CLASS] XmlReadContext  
[REPLACE]^private int _lineNr;^27^^^^^^^[REPLACE] protected int _lineNr;^ [CLASS] XmlReadContext  
[REPLACE]^protected  short  _columnNr;^28^^^^^^^[REPLACE] protected int _columnNr;^ [CLASS] XmlReadContext  
[REPLACE]^protected  char  _currentName;^30^^^^^^^[REPLACE] protected String _currentName;^ [CLASS] XmlReadContext  
[REPLACE]^protected XmlReadContext _child  = null ;^48^^^^^^^[REPLACE] protected XmlReadContext _child = null;^ [CLASS] XmlReadContext  
[REPLACE]^sb.append ( ']' ) ;^58^^^^^56^64^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] XmlReadContext,int,int,int) [PARAMETER] XmlReadContext parent int type int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[ADD]^^58^59^^^^56^64^[ADD] super (  ) ; _type = type;^[METHOD] <init> [TYPE] XmlReadContext,int,int,int) [PARAMETER] XmlReadContext parent int type int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^_type =  null;^59^^^^^56^64^[REPLACE] _type = type;^[METHOD] <init> [TYPE] XmlReadContext,int,int,int) [PARAMETER] XmlReadContext parent int type int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^_parent =  null;^60^^^^^56^64^[REPLACE] _parent = parent;^[METHOD] <init> [TYPE] XmlReadContext,int,int,int) [PARAMETER] XmlReadContext parent int type int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^_lineNr =  type;^61^^^^^56^64^[REPLACE] _lineNr = lineNr;^[METHOD] <init> [TYPE] XmlReadContext,int,int,int) [PARAMETER] XmlReadContext parent int type int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[ADD]^^61^62^^^^56^64^[ADD] _lineNr = lineNr; _columnNr = colNr;^[METHOD] <init> [TYPE] XmlReadContext,int,int,int) [PARAMETER] XmlReadContext parent int type int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^_columnNr =  lineNr;^62^^^^^56^64^[REPLACE] _columnNr = colNr;^[METHOD] <init> [TYPE] XmlReadContext,int,int,int) [PARAMETER] XmlReadContext parent int type int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^_index = -1 + 3;^63^^^^^56^64^[REPLACE] _index = -1;^[METHOD] <init> [TYPE] XmlReadContext,int,int,int) [PARAMETER] XmlReadContext parent int type int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^_type =  lineNr;^68^^^^^66^74^[REPLACE] _type = type;^[METHOD] reset [TYPE] void [PARAMETER] int type int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^_index = -3;^69^^^^^66^74^[REPLACE] _index = -1;^[METHOD] reset [TYPE] void [PARAMETER] int type int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^_lineNr =  type;^70^^^^^66^74^[REPLACE] _lineNr = lineNr;^[METHOD] reset [TYPE] void [PARAMETER] int type int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[ADD]^^70^^^^^66^74^[ADD] _lineNr = lineNr;^[METHOD] reset [TYPE] void [PARAMETER] int type int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^_columnNr =  lineNr;^71^^^^^66^74^[REPLACE] _columnNr = colNr;^[METHOD] reset [TYPE] void [PARAMETER] int type int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^_currentName = false;^72^^^^^66^74^[REPLACE] _currentName = null;^[METHOD] reset [TYPE] void [PARAMETER] int type int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^_namesToWrap = true;^73^^^^^66^74^[REPLACE] _namesToWrap = null;^[METHOD] reset [TYPE] void [PARAMETER] int type int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^return new XmlReadContext ( null, TYPE_ROOT, 1, 0 ) ;^79^^^^^78^80^[REPLACE] return new XmlReadContext ( null, TYPE_ROOT, lineNr, colNr ) ;^[METHOD] createRootContext [TYPE] XmlReadContext [PARAMETER] int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^return new XmlReadContext ( null, TYPE_ROOT, lineNr, colNr ) ;^83^^^^^82^84^[REPLACE] return new XmlReadContext ( null, TYPE_ROOT, 1, 0 ) ;^[METHOD] createRootContext [TYPE] XmlReadContext [PARAMETER] [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^StringBuilder sb = new StringBuilder ( 64 ) ;^88^^^^^86^95^[REPLACE] XmlReadContext ctxt = _child;^[METHOD] createChildArrayContext [TYPE] XmlReadContext [PARAMETER] int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^if  ( ctxt != null )  {^89^^^^^86^95^[REPLACE] if  ( ctxt == null )  {^[METHOD] createChildArrayContext [TYPE] XmlReadContext [PARAMETER] int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^_child = ctxt = new XmlReadContext ( this, TYPE_OBJECT, lineNr, colNr ) ; ;^90^^^^^86^95^[REPLACE] _child = ctxt = new XmlReadContext ( this, TYPE_ARRAY, lineNr, colNr ) ;^[METHOD] createChildArrayContext [TYPE] XmlReadContext [PARAMETER] int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^return parent;^91^^^^^86^95^[REPLACE] return ctxt;^[METHOD] createChildArrayContext [TYPE] XmlReadContext [PARAMETER] int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^ctxt.reset ( TYPE_OBJECT, lineNr, colNr ) ;^93^^^^^86^95^[REPLACE] ctxt.reset ( TYPE_ARRAY, lineNr, colNr ) ;^[METHOD] createChildArrayContext [TYPE] XmlReadContext [PARAMETER] int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REMOVE]^sb.append ( getCurrentIndex (  )  ) ;^93^^^^^86^95^[REMOVE] ^[METHOD] createChildArrayContext [TYPE] XmlReadContext [PARAMETER] int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^return parent;^94^^^^^86^95^[REPLACE] return ctxt;^[METHOD] createChildArrayContext [TYPE] XmlReadContext [PARAMETER] int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^StringBuilder sb = new StringBuilder ( 64 ) ;^99^^^^^97^106^[REPLACE] XmlReadContext ctxt = _child;^[METHOD] createChildObjectContext [TYPE] XmlReadContext [PARAMETER] int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^if  (parent != null )  {^100^^^^^97^106^[REPLACE] if  ( ctxt == null )  {^[METHOD] createChildObjectContext [TYPE] XmlReadContext [PARAMETER] int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[ADD]^^100^101^102^103^^97^106^[ADD] if  ( ctxt == null )  { _child = ctxt = new XmlReadContext ( this, TYPE_OBJECT, lineNr, colNr ) ; return ctxt; }^[METHOD] createChildObjectContext [TYPE] XmlReadContext [PARAMETER] int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^_child = ctxt = new XmlReadContext ( this, TYPE_ARRAY, lineNr, colNr ) ; ;^101^^^^^97^106^[REPLACE] _child = ctxt = new XmlReadContext ( this, TYPE_OBJECT, lineNr, colNr ) ;^[METHOD] createChildObjectContext [TYPE] XmlReadContext [PARAMETER] int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^_child = ctxt =  new XmlReadContext ( this, TYPE_ARRAY, lineNr, colNr )  ; ;^101^^^^^97^106^[REPLACE] _child = ctxt = new XmlReadContext ( this, TYPE_OBJECT, lineNr, colNr ) ;^[METHOD] createChildObjectContext [TYPE] XmlReadContext [PARAMETER] int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^return parent;^102^^^^^97^106^[REPLACE] return ctxt;^[METHOD] createChildObjectContext [TYPE] XmlReadContext [PARAMETER] int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^ctxt.reset ( TYPE_OBJECT, type, colNr ) ;^104^^^^^97^106^[REPLACE] ctxt.reset ( TYPE_OBJECT, lineNr, colNr ) ;^[METHOD] createChildObjectContext [TYPE] XmlReadContext [PARAMETER] int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^return parent;^105^^^^^97^106^[REPLACE] return ctxt;^[METHOD] createChildObjectContext [TYPE] XmlReadContext [PARAMETER] int lineNr int colNr [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^public final XmlReadContext getParent (  )  { return _parent; }^115^^^^^^^[REPLACE] public final String getCurrentName (  )  { return _currentName; }^[METHOD] getCurrentName [TYPE] String [PARAMETER] [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^return new XmlReadContext ( null, TYPE_ROOT, lineNr, colNr ) ;^118^^^^^^^[REPLACE] public final XmlReadContext getParent (  )  { return _parent; }^[METHOD] getParent [TYPE] XmlReadContext [PARAMETER] [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^return ;^127^^^^^126^128^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] expectComma [TYPE] boolean [PARAMETER] [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^_currentName = null; ;^131^^^^^130^132^[REPLACE] _currentName = name;^[METHOD] setCurrentName [TYPE] void [PARAMETER] String name [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  name  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[ADD]^^131^^^^^130^132^[ADD] _currentName = name;^[METHOD] setCurrentName [TYPE] void [PARAMETER] String name [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  String _currentName  _wrappedName  name  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^long totalChars = -1;^146^^^^^144^149^[REPLACE] long totalChars = -1L;^[METHOD] getStartLocation [TYPE] JsonLocation [PARAMETER] Object srcRef [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  Object srcRef  [TYPE]  String _currentName  _wrappedName  name  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type  [TYPE]  long totalChars 
[REPLACE]^return  new XmlReadContext ( this, TYPE_ARRAY, lineNr, colNr )  ;^148^^^^^144^149^[REPLACE] return new JsonLocation ( srcRef, totalChars, _lineNr, _columnNr ) ;^[METHOD] getStartLocation [TYPE] JsonLocation [PARAMETER] Object srcRef [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  Object srcRef  [TYPE]  String _currentName  _wrappedName  name  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type  [TYPE]  long totalChars 
[REPLACE]^_namesToWrap =  0;^152^^^^^151^153^[REPLACE] _namesToWrap = namesToWrap;^[METHOD] setNamesToWrap [TYPE] void [PARAMETER] String> namesToWrap [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  namesToWrap  [TYPE]  String _currentName  _wrappedName  name  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[ADD]^^152^^^^^151^153^[ADD] _namesToWrap = namesToWrap;^[METHOD] setNamesToWrap [TYPE] void [PARAMETER] String> namesToWrap [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  namesToWrap  [TYPE]  String _currentName  _wrappedName  name  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^return ctxt;^156^^^^^155^157^[REPLACE] return _namesToWrap;^[METHOD] getNamesToWrap [TYPE] Set [PARAMETER] [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  namesToWrap  [TYPE]  String _currentName  _wrappedName  name  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^_type  =  _type ;^160^^^^^159^161^[REPLACE] _type = TYPE_ARRAY;^[METHOD] convertToArray [TYPE] void [PARAMETER] [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  namesToWrap  [TYPE]  String _currentName  _wrappedName  name  [TYPE]  boolean false  true  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^StringBuilder sb = new StringBuilder ( 1 ) ;^176^^^^^174^199^[REPLACE] StringBuilder sb = new StringBuilder ( 64 ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  namesToWrap  [TYPE]  String _currentName  _wrappedName  name  [TYPE]  boolean false  true  [TYPE]  StringBuilder sb  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[ADD]^^176^^^^^174^199^[ADD] StringBuilder sb = new StringBuilder ( 64 ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  namesToWrap  [TYPE]  String _currentName  _wrappedName  name  [TYPE]  boolean false  true  [TYPE]  StringBuilder sb  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^if  ( _currentName == null )  {^188^^^^^174^199^[REPLACE] if  ( _currentName != null )  {^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  namesToWrap  [TYPE]  String _currentName  _wrappedName  name  [TYPE]  boolean false  true  [TYPE]  StringBuilder sb  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^sb.append ( ']' ) ;^193^^^^^174^199^[REPLACE] sb.append ( '?' ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  namesToWrap  [TYPE]  String _currentName  _wrappedName  name  [TYPE]  boolean false  true  [TYPE]  StringBuilder sb  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^sb.append ( ']' ) ;^189^^^^^174^199^[REPLACE] sb.append ( '"' ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  namesToWrap  [TYPE]  String _currentName  _wrappedName  name  [TYPE]  boolean false  true  [TYPE]  StringBuilder sb  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^sb.append ( ']' ) ;^190^^^^^174^199^[REPLACE] CharTypes.appendQuoted ( sb, _currentName ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  namesToWrap  [TYPE]  String _currentName  _wrappedName  name  [TYPE]  boolean false  true  [TYPE]  StringBuilder sb  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^sb.append ( ']' ) ;^191^^^^^174^199^[REPLACE] sb.append ( '"' ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  namesToWrap  [TYPE]  String _currentName  _wrappedName  name  [TYPE]  boolean false  true  [TYPE]  StringBuilder sb  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
[REPLACE]^return sb .StringBuilder ( _lineNr )  ;^198^^^^^174^199^[REPLACE] return sb.toString (  ) ;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] XmlReadContext   [TYPE]  Set _namesToWrap  namesToWrap  [TYPE]  String _currentName  _wrappedName  name  [TYPE]  boolean false  true  [TYPE]  StringBuilder sb  [TYPE]  XmlReadContext _child  _parent  ctxt  parent  [TYPE]  int _columnNr  _lineNr  colNr  lineNr  type 
