[buglab_swap_variables]^this ( MODEL_DOM, xmlURL ) ;^82^^^^^81^83^this ( xmlURL, MODEL_DOM ) ;^[CLASS] DocumentContainer  [METHOD] <init> [RETURN_TYPE] URL)   URL xmlURL [VARIABLES] Object  document  String  MODEL_DOM  MODEL_JDOM  model  boolean  HashMap  parserClasses  parsers  URL  xmlURL  
[buglab_swap_variables]^this (  MODEL_DOM ) ;^82^^^^^81^83^this ( xmlURL, MODEL_DOM ) ;^[CLASS] DocumentContainer  [METHOD] <init> [RETURN_TYPE] URL)   URL xmlURL [VARIABLES] Object  document  String  MODEL_DOM  MODEL_JDOM  model  boolean  HashMap  parserClasses  parsers  URL  xmlURL  
[buglab_swap_variables]^this ( xmlURL ) ;^82^^^^^81^83^this ( xmlURL, MODEL_DOM ) ;^[CLASS] DocumentContainer  [METHOD] <init> [RETURN_TYPE] URL)   URL xmlURL [VARIABLES] Object  document  String  MODEL_DOM  MODEL_JDOM  model  boolean  HashMap  parserClasses  parsers  URL  xmlURL  
[buglab_swap_variables]^parsers.put ( parser, model ) ;^63^^^^^62^64^parsers.put ( model, parser ) ;^[CLASS] DocumentContainer  [METHOD] registerXMLParser [RETURN_TYPE] void   String model XMLParser parser [VARIABLES] Object  document  String  MODEL_DOM  MODEL_JDOM  model  boolean  XMLParser  parser  HashMap  parserClasses  parsers  URL  xmlURL  
[buglab_swap_variables]^parsers.put (  parser ) ;^63^^^^^62^64^parsers.put ( model, parser ) ;^[CLASS] DocumentContainer  [METHOD] registerXMLParser [RETURN_TYPE] void   String model XMLParser parser [VARIABLES] Object  document  String  MODEL_DOM  MODEL_JDOM  model  boolean  XMLParser  parser  HashMap  parserClasses  parsers  URL  xmlURL  
[buglab_swap_variables]^parsers.put ( model ) ;^63^^^^^62^64^parsers.put ( model, parser ) ;^[CLASS] DocumentContainer  [METHOD] registerXMLParser [RETURN_TYPE] void   String model XMLParser parser [VARIABLES] Object  document  String  MODEL_DOM  MODEL_JDOM  model  boolean  XMLParser  parser  HashMap  parserClasses  parsers  URL  xmlURL  
[buglab_swap_variables]^parserClasses.put ( parserClassName, model ) ;^71^^^^^70^72^parserClasses.put ( model, parserClassName ) ;^[CLASS] DocumentContainer  [METHOD] registerXMLParser [RETURN_TYPE] void   String model String parserClassName [VARIABLES] Object  document  String  MODEL_DOM  MODEL_JDOM  model  parserClassName  boolean  HashMap  parserClasses  parsers  URL  xmlURL  
[buglab_swap_variables]^parserClasses.put (  parserClassName ) ;^71^^^^^70^72^parserClasses.put ( model, parserClassName ) ;^[CLASS] DocumentContainer  [METHOD] registerXMLParser [RETURN_TYPE] void   String model String parserClassName [VARIABLES] Object  document  String  MODEL_DOM  MODEL_JDOM  model  parserClassName  boolean  HashMap  parserClasses  parsers  URL  xmlURL  
[buglab_swap_variables]^parserClasses.put ( model ) ;^71^^^^^70^72^parserClasses.put ( model, parserClassName ) ;^[CLASS] DocumentContainer  [METHOD] registerXMLParser [RETURN_TYPE] void   String model String parserClassName [VARIABLES] Object  document  String  MODEL_DOM  MODEL_JDOM  model  parserClassName  boolean  HashMap  parserClasses  parsers  URL  xmlURL  
[buglab_swap_variables]^throw new JXPathException ( "Cannot read XML from: " + ex.toString (  ) , xmlURL ) ;^120^121^122^^^103^126^throw new JXPathException ( "Cannot read XML from: " + xmlURL.toString (  ) , ex ) ;^[CLASS] DocumentContainer  [METHOD] getValue [RETURN_TYPE] Object   [VARIABLES] boolean  HashMap  parserClasses  parsers  InputStream  stream  Object  document  String  MODEL_DOM  MODEL_JDOM  model  parserClassName  URL  xmlURL  Exception  ex  
[buglab_swap_variables]^throw new JXPathException ( "Cannot read XML from: " + xmlURL.toString (  )  ) ;^120^121^122^^^103^126^throw new JXPathException ( "Cannot read XML from: " + xmlURL.toString (  ) , ex ) ;^[CLASS] DocumentContainer  [METHOD] getValue [RETURN_TYPE] Object   [VARIABLES] boolean  HashMap  parserClasses  parsers  InputStream  stream  Object  document  String  MODEL_DOM  MODEL_JDOM  model  parserClassName  URL  xmlURL  Exception  ex  
[buglab_swap_variables]^return stream.parseXML ( parser ) ;^143^^^^^131^144^return parser.parseXML ( stream ) ;^[CLASS] DocumentContainer  [METHOD] parseXML [RETURN_TYPE] Object   InputStream stream [VARIABLES] boolean  HashMap  parserClasses  parsers  InputStream  stream  Object  document  String  MODEL_DOM  MODEL_JDOM  model  parserClassName  XMLParser  parser  URL  xmlURL  XMLParser2  parser2  
[buglab_swap_variables]^XMLParser parser =  ( XMLParser )  model.get ( parsers ) ;^157^^^^^156^174^XMLParser parser =  ( XMLParser )  parsers.get ( model ) ;^[CLASS] DocumentContainer  [METHOD] getParser [RETURN_TYPE] XMLParser   String model [VARIABLES] boolean  HashMap  parserClasses  parsers  Object  document  value  Class  clazz  String  MODEL_DOM  MODEL_JDOM  className  model  parserClassName  XMLParser  parser  URL  xmlURL  Exception  ex  
[buglab_swap_variables]^String className =  ( String )  model.get ( parserClasses ) ;^159^^^^^156^174^String className =  ( String )  parserClasses.get ( model ) ;^[CLASS] DocumentContainer  [METHOD] getParser [RETURN_TYPE] XMLParser   String model [VARIABLES] boolean  HashMap  parserClasses  parsers  Object  document  value  Class  clazz  String  MODEL_DOM  MODEL_JDOM  className  model  parserClassName  XMLParser  parser  URL  xmlURL  Exception  ex  
[buglab_swap_variables]^parsers.put (  parser ) ;^171^^^^^156^174^parsers.put ( model, parser ) ;^[CLASS] DocumentContainer  [METHOD] getParser [RETURN_TYPE] XMLParser   String model [VARIABLES] boolean  HashMap  parserClasses  parsers  Object  document  value  Class  clazz  String  MODEL_DOM  MODEL_JDOM  className  model  parserClassName  XMLParser  parser  URL  xmlURL  Exception  ex  
[buglab_swap_variables]^parsers.put ( model ) ;^171^^^^^156^174^parsers.put ( model, parser ) ;^[CLASS] DocumentContainer  [METHOD] getParser [RETURN_TYPE] XMLParser   String model [VARIABLES] boolean  HashMap  parserClasses  parsers  Object  document  value  Class  clazz  String  MODEL_DOM  MODEL_JDOM  className  model  parserClassName  XMLParser  parser  URL  xmlURL  Exception  ex  
[buglab_swap_variables]^parsers.put ( parser, model ) ;^171^^^^^156^174^parsers.put ( model, parser ) ;^[CLASS] DocumentContainer  [METHOD] getParser [RETURN_TYPE] XMLParser   String model [VARIABLES] boolean  HashMap  parserClasses  parsers  Object  document  value  Class  clazz  String  MODEL_DOM  MODEL_JDOM  className  model  parserClassName  XMLParser  parser  URL  xmlURL  Exception  ex  
