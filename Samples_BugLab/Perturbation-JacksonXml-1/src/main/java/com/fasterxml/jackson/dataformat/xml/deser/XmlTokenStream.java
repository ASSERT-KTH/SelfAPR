[buglab_swap_variables]^if  ( XML_END_ELEMENT != type )  {^172^^^^^169^175^if  ( type != XML_END_ELEMENT )  {^[CLASS] XmlTokenStream  [METHOD] skipEndElement [RETURN_TYPE] void   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^return  ( _attributeCount == XML_START_ELEMENT )  &&  ( _currentState > 0 ) ;^183^^^^^182^184^return  ( _currentState == XML_START_ELEMENT )  &&  ( _attributeCount > 0 ) ;^[CLASS] XmlTokenStream  [METHOD] hasAttributes [RETURN_TYPE] boolean   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^return  ( XML_START_ELEMENT == _currentState )  &&  ( _attributeCount > 0 ) ;^183^^^^^182^184^return  ( _currentState == XML_START_ELEMENT )  &&  ( _attributeCount > 0 ) ;^[CLASS] XmlTokenStream  [METHOD] hasAttributes [RETURN_TYPE] boolean   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^if  ( XML_START_ELEMENT != _currentState )  {^227^^^^^223^238^if  ( _currentState != XML_START_ELEMENT )  {^[CLASS] XmlTokenStream  [METHOD] repeatStartElement [RETURN_TYPE] void   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^_currentWrapper = ElementWrapper.matchingWrapper ( _localName.getParent (  ) , _currentWrapper, _namespaceURI ) ;^235^^^^^223^238^_currentWrapper = ElementWrapper.matchingWrapper ( _currentWrapper.getParent (  ) , _localName, _namespaceURI ) ;^[CLASS] XmlTokenStream  [METHOD] repeatStartElement [RETURN_TYPE] void   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^_currentWrapper = ElementWrapper.matchingWrapper ( _currentWrapper.getParent (  ) , _namespaceURI, _localName ) ;^235^^^^^223^238^_currentWrapper = ElementWrapper.matchingWrapper ( _currentWrapper.getParent (  ) , _localName, _namespaceURI ) ;^[CLASS] XmlTokenStream  [METHOD] repeatStartElement [RETURN_TYPE] void   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^_currentWrapper = ElementWrapper.matchingWrapper ( _currentWrapper.getParent (  ) ,  _namespaceURI ) ;^235^^^^^223^238^_currentWrapper = ElementWrapper.matchingWrapper ( _currentWrapper.getParent (  ) , _localName, _namespaceURI ) ;^[CLASS] XmlTokenStream  [METHOD] repeatStartElement [RETURN_TYPE] void   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^_currentWrapper = ElementWrapper.matchingWrapper ( _currentWrapper.getParent (  ) , _localName ) ;^235^^^^^223^238^_currentWrapper = ElementWrapper.matchingWrapper ( _currentWrapper.getParent (  ) , _localName, _namespaceURI ) ;^[CLASS] XmlTokenStream  [METHOD] repeatStartElement [RETURN_TYPE] void   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^_currentWrapper = ElementWrapper.matchingWrapper ( _namespaceURI.getParent (  ) , _localName, _currentWrapper ) ;^235^^^^^223^238^_currentWrapper = ElementWrapper.matchingWrapper ( _currentWrapper.getParent (  ) , _localName, _namespaceURI ) ;^[CLASS] XmlTokenStream  [METHOD] repeatStartElement [RETURN_TYPE] void   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^_currentWrapper = ElementWrapper.matchingWrapper ( _namespaceURI, _localName, _currentWrapper ) ;^233^^^^^223^238^_currentWrapper = ElementWrapper.matchingWrapper ( _currentWrapper, _localName, _namespaceURI ) ;^[CLASS] XmlTokenStream  [METHOD] repeatStartElement [RETURN_TYPE] void   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^_currentWrapper = ElementWrapper.matchingWrapper (  _localName, _namespaceURI ) ;^233^^^^^223^238^_currentWrapper = ElementWrapper.matchingWrapper ( _currentWrapper, _localName, _namespaceURI ) ;^[CLASS] XmlTokenStream  [METHOD] repeatStartElement [RETURN_TYPE] void   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^_currentWrapper = ElementWrapper.matchingWrapper ( _currentWrapper, _namespaceURI, _localName ) ;^233^^^^^223^238^_currentWrapper = ElementWrapper.matchingWrapper ( _currentWrapper, _localName, _namespaceURI ) ;^[CLASS] XmlTokenStream  [METHOD] repeatStartElement [RETURN_TYPE] void   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^_currentWrapper = ElementWrapper.matchingWrapper ( _currentWrapper,  _namespaceURI ) ;^233^^^^^223^238^_currentWrapper = ElementWrapper.matchingWrapper ( _currentWrapper, _localName, _namespaceURI ) ;^[CLASS] XmlTokenStream  [METHOD] repeatStartElement [RETURN_TYPE] void   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^_currentWrapper = ElementWrapper.matchingWrapper ( _currentWrapper, _localName ) ;^233^^^^^223^238^_currentWrapper = ElementWrapper.matchingWrapper ( _currentWrapper, _localName, _namespaceURI ) ;^[CLASS] XmlTokenStream  [METHOD] repeatStartElement [RETURN_TYPE] void   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^} else if  ( XML_START_ELEMENT == _currentState )  {^251^^^^^246^263^} else if  ( _currentState == XML_START_ELEMENT )  {^[CLASS] XmlTokenStream  [METHOD] skipAttributes [RETURN_TYPE] void   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^} else if  ( XML_TEXT == _currentState )  {^257^^^^^246^263^} else if  ( _currentState == XML_TEXT )  {^[CLASS] XmlTokenStream  [METHOD] skipAttributes [RETURN_TYPE] void   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^if  ( _nextAttributeIndex != XML_ATTRIBUTE_NAME || _currentState != 0 )  {^268^^^^^266^295^if  ( _currentState != XML_ATTRIBUTE_NAME || _nextAttributeIndex != 0 )  {^[CLASS] XmlTokenStream  [METHOD] convertToString [RETURN_TYPE] String   [VARIABLES] boolean  XMLStreamException  e  ElementWrapper  _currentWrapper  XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  text  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  
[buglab_swap_variables]^if  ( _currentState != _nextAttributeIndex || XML_ATTRIBUTE_NAME != 0 )  {^268^^^^^266^295^if  ( _currentState != XML_ATTRIBUTE_NAME || _nextAttributeIndex != 0 )  {^[CLASS] XmlTokenStream  [METHOD] convertToString [RETURN_TYPE] String   [VARIABLES] boolean  XMLStreamException  e  ElementWrapper  _currentWrapper  XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  text  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  
[buglab_swap_variables]^if  ( _attributeCount < _nextAttributeIndex )  {^310^^^^^295^325^if  ( _nextAttributeIndex < _attributeCount )  {^[CLASS] XmlTokenStream  [METHOD] _next [RETURN_TYPE] int   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  text  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^_localName = _nextAttributeIndex.getAttributeLocalName ( _xmlReader ) ;^311^^^^^296^326^_localName = _xmlReader.getAttributeLocalName ( _nextAttributeIndex ) ;^[CLASS] XmlTokenStream  [METHOD] _next [RETURN_TYPE] int   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  text  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^_namespaceURI = _nextAttributeIndex.getAttributeNamespace ( _xmlReader ) ;^312^^^^^297^327^_namespaceURI = _xmlReader.getAttributeNamespace ( _nextAttributeIndex ) ;^[CLASS] XmlTokenStream  [METHOD] _next [RETURN_TYPE] int   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  text  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^_textValue = _nextAttributeIndex.getAttributeValue ( _xmlReader ) ;^313^^^^^298^328^_textValue = _xmlReader.getAttributeValue ( _nextAttributeIndex ) ;^[CLASS] XmlTokenStream  [METHOD] _next [RETURN_TYPE] int   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  text  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^if  ( _currentWrapper.matchesWrapper (  ns )  )  {^409^^^^^397^427^if  ( _currentWrapper.matchesWrapper ( localName, ns )  )  {^[CLASS] XmlTokenStream  [METHOD] _initStartElement [RETURN_TYPE] int   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  localName  ns  text  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^if  ( _currentWrapper.matchesWrapper ( ns, localName )  )  {^409^^^^^397^427^if  ( _currentWrapper.matchesWrapper ( localName, ns )  )  {^[CLASS] XmlTokenStream  [METHOD] _initStartElement [RETURN_TYPE] int   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  localName  ns  text  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^if  ( _currentWrapper.matchesWrapper ( localName )  )  {^409^^^^^397^427^if  ( _currentWrapper.matchesWrapper ( localName, ns )  )  {^[CLASS] XmlTokenStream  [METHOD] _initStartElement [RETURN_TYPE] int   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  localName  ns  text  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^if  ( localName.matchesWrapper ( _currentWrapper, ns )  )  {^409^^^^^397^427^if  ( _currentWrapper.matchesWrapper ( localName, ns )  )  {^[CLASS] XmlTokenStream  [METHOD] _initStartElement [RETURN_TYPE] int   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  localName  ns  text  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^if  ( REPLAY_END == type )  {^443^^^^^428^458^if  ( type == REPLAY_END )  {^[CLASS] XmlTokenStream  [METHOD] _handleRepeatElement [RETURN_TYPE] int   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  localName  ns  text  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^if  ( REPLAY_START_DELAYED == type )  {^452^^^^^437^467^if  ( type == REPLAY_START_DELAYED )  {^[CLASS] XmlTokenStream  [METHOD] _handleRepeatElement [RETURN_TYPE] int   [VARIABLES] XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  localName  ns  text  boolean  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  ElementWrapper  _currentWrapper  
[buglab_swap_variables]^return new JsonLocation ( location, _sourceReference.getCharacterOffset (  ) , location.getLineNumber (  ) , location.getColumnNumber (  )  ) ;^491^492^493^494^^486^495^return new JsonLocation ( _sourceReference, location.getCharacterOffset (  ) , location.getLineNumber (  ) , location.getColumnNumber (  )  ) ;^[CLASS] XmlTokenStream  [METHOD] _extractLocation [RETURN_TYPE] JsonLocation   XMLStreamLocation2 location [VARIABLES] boolean  XMLStreamLocation2  location  ElementWrapper  _currentWrapper  w  XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  localName  ns  text  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  
[buglab_swap_variables]^return new JsonLocation ( _sourceReference.getCharacterOffset (  ) , location.getLineNumber (  ) , location.getColumnNumber (  )  ) ;^491^492^493^494^^486^495^return new JsonLocation ( _sourceReference, location.getCharacterOffset (  ) , location.getLineNumber (  ) , location.getColumnNumber (  )  ) ;^[CLASS] XmlTokenStream  [METHOD] _extractLocation [RETURN_TYPE] JsonLocation   XMLStreamLocation2 location [VARIABLES] boolean  XMLStreamLocation2  location  ElementWrapper  _currentWrapper  w  XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  localName  ns  text  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  
[buglab_swap_variables]^return new JsonLocation (  location.getCharacterOffset (  ) , location.getLineNumber (  ) , location.getColumnNumber (  )  ) ;^491^492^493^494^^486^495^return new JsonLocation ( _sourceReference, location.getCharacterOffset (  ) , location.getLineNumber (  ) , location.getColumnNumber (  )  ) ;^[CLASS] XmlTokenStream  [METHOD] _extractLocation [RETURN_TYPE] JsonLocation   XMLStreamLocation2 location [VARIABLES] boolean  XMLStreamLocation2  location  ElementWrapper  _currentWrapper  w  XMLStreamReader2  _xmlReader  Object  _sourceReference  sourceRef  String  _localName  _namespaceURI  _nextLocalName  _nextNamespaceURI  _textValue  localName  ns  text  int  REPLAY_END  REPLAY_START_DELAYED  REPLAY_START_DUP  XML_ATTRIBUTE_NAME  XML_ATTRIBUTE_VALUE  XML_END  XML_END_ELEMENT  XML_START_ELEMENT  XML_TEXT  _attributeCount  _currentState  _nextAttributeIndex  _repeatElement  type  
