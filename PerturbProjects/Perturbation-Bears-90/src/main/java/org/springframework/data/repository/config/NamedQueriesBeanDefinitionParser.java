[REPLACE]^private static final String ATTRIBUTE  = null ;^40^^^^^^^[REPLACE] private static final String ATTRIBUTE = "named-queries-location";^ [CLASS] NamedQueriesBeanDefinitionParser  
[ADD]^^59^60^^^^57^76^[ADD] BeanDefinitionBuilder properties = BeanDefinitionBuilder.rootBeanDefinition ( PropertiesFactoryBean.class ) ; properties.addPropertyValue ( "locations", getDefaultedLocation ( element )  ) ;^[METHOD] parse [TYPE] BeanDefinition [PARAMETER] Element element ParserContext parserContext [CLASS] NamedQueriesBeanDefinitionParser   [TYPE]  BeanDefinitionBuilder namedQueries  properties  [TYPE]  String ATTRIBUTE  defaultLocation  [TYPE]  boolean false  true  [TYPE]  ParserContext parserContext  [TYPE]  AbstractBeanDefinition namedQueriesDefinition  propertiesDefinition  [TYPE]  Element element 
[REPLACE]^properties .addConstructorArgValue ( namedQueriesDefinition )  ;^60^^^^^57^76^[REPLACE] properties.addPropertyValue ( "locations", getDefaultedLocation ( element )  ) ;^[METHOD] parse [TYPE] BeanDefinition [PARAMETER] Element element ParserContext parserContext [CLASS] NamedQueriesBeanDefinitionParser   [TYPE]  BeanDefinitionBuilder namedQueries  properties  [TYPE]  String ATTRIBUTE  defaultLocation  [TYPE]  boolean false  true  [TYPE]  ParserContext parserContext  [TYPE]  AbstractBeanDefinition namedQueriesDefinition  propertiesDefinition  [TYPE]  Element element 
[REPLACE]^isDefaultLocation ( element )  ;^60^^^^^57^76^[REPLACE] properties.addPropertyValue ( "locations", getDefaultedLocation ( element )  ) ;^[METHOD] parse [TYPE] BeanDefinition [PARAMETER] Element element ParserContext parserContext [CLASS] NamedQueriesBeanDefinitionParser   [TYPE]  BeanDefinitionBuilder namedQueries  properties  [TYPE]  String ATTRIBUTE  defaultLocation  [TYPE]  boolean false  true  [TYPE]  ParserContext parserContext  [TYPE]  AbstractBeanDefinition namedQueriesDefinition  propertiesDefinition  [TYPE]  Element element 
[ADD]^properties.addPropertyValue ( "ignoreResourceNotFound", true ) ;^62^63^64^^^57^76^[ADD] if  ( isDefaultLocation ( element )  )  { properties.addPropertyValue ( "ignoreResourceNotFound", true ) ; }^[METHOD] parse [TYPE] BeanDefinition [PARAMETER] Element element ParserContext parserContext [CLASS] NamedQueriesBeanDefinitionParser   [TYPE]  BeanDefinitionBuilder namedQueries  properties  [TYPE]  String ATTRIBUTE  defaultLocation  [TYPE]  boolean false  true  [TYPE]  ParserContext parserContext  [TYPE]  AbstractBeanDefinition namedQueriesDefinition  propertiesDefinition  [TYPE]  Element element 
[REPLACE]^properties .addConstructorArgValue ( propertiesDefinition )  ;^63^^^^^57^76^[REPLACE] properties.addPropertyValue ( "ignoreResourceNotFound", true ) ;^[METHOD] parse [TYPE] BeanDefinition [PARAMETER] Element element ParserContext parserContext [CLASS] NamedQueriesBeanDefinitionParser   [TYPE]  BeanDefinitionBuilder namedQueries  properties  [TYPE]  String ATTRIBUTE  defaultLocation  [TYPE]  boolean false  true  [TYPE]  ParserContext parserContext  [TYPE]  AbstractBeanDefinition namedQueriesDefinition  propertiesDefinition  [TYPE]  Element element 
[REPLACE]^AbstractBeanDefinition namedQueriesDefinition = namedQueries.getBeanDefinition (  )  ;^66^^^^^57^76^[REPLACE] AbstractBeanDefinition propertiesDefinition = properties.getBeanDefinition (  ) ;^[METHOD] parse [TYPE] BeanDefinition [PARAMETER] Element element ParserContext parserContext [CLASS] NamedQueriesBeanDefinitionParser   [TYPE]  BeanDefinitionBuilder namedQueries  properties  [TYPE]  String ATTRIBUTE  defaultLocation  [TYPE]  boolean false  true  [TYPE]  ParserContext parserContext  [TYPE]  AbstractBeanDefinition namedQueriesDefinition  propertiesDefinition  [TYPE]  Element element 
[REPLACE]^namedQueriesDefinition.setSource ( parserContext.extractSource ( element )  )  ;^67^^^^^57^76^[REPLACE] propertiesDefinition.setSource ( parserContext.extractSource ( element )  ) ;^[METHOD] parse [TYPE] BeanDefinition [PARAMETER] Element element ParserContext parserContext [CLASS] NamedQueriesBeanDefinitionParser   [TYPE]  BeanDefinitionBuilder namedQueries  properties  [TYPE]  String ATTRIBUTE  defaultLocation  [TYPE]  boolean false  true  [TYPE]  ParserContext parserContext  [TYPE]  AbstractBeanDefinition namedQueriesDefinition  propertiesDefinition  [TYPE]  Element element 
[REMOVE]^properties.addPropertyValue ( "locations", getDefaultedLocation ( element )  )  ;^67^^^^^57^76^[REMOVE] ^[METHOD] parse [TYPE] BeanDefinition [PARAMETER] Element element ParserContext parserContext [CLASS] NamedQueriesBeanDefinitionParser   [TYPE]  BeanDefinitionBuilder namedQueries  properties  [TYPE]  String ATTRIBUTE  defaultLocation  [TYPE]  boolean false  true  [TYPE]  ParserContext parserContext  [TYPE]  AbstractBeanDefinition namedQueriesDefinition  propertiesDefinition  [TYPE]  Element element 
[ADD]^^69^^^^^57^76^[ADD] BeanDefinitionBuilder namedQueries = BeanDefinitionBuilder.rootBeanDefinition ( PropertiesBasedNamedQueries.class ) ;^[METHOD] parse [TYPE] BeanDefinition [PARAMETER] Element element ParserContext parserContext [CLASS] NamedQueriesBeanDefinitionParser   [TYPE]  BeanDefinitionBuilder namedQueries  properties  [TYPE]  String ATTRIBUTE  defaultLocation  [TYPE]  boolean false  true  [TYPE]  ParserContext parserContext  [TYPE]  AbstractBeanDefinition namedQueriesDefinition  propertiesDefinition  [TYPE]  Element element 
[REPLACE]^namedQueries.rootBeanDefinition ( propertiesDefinition ) ;^70^^^^^57^76^[REPLACE] namedQueries.addConstructorArgValue ( propertiesDefinition ) ;^[METHOD] parse [TYPE] BeanDefinition [PARAMETER] Element element ParserContext parserContext [CLASS] NamedQueriesBeanDefinitionParser   [TYPE]  BeanDefinitionBuilder namedQueries  properties  [TYPE]  String ATTRIBUTE  defaultLocation  [TYPE]  boolean false  true  [TYPE]  ParserContext parserContext  [TYPE]  AbstractBeanDefinition namedQueriesDefinition  propertiesDefinition  [TYPE]  Element element 
[REPLACE]^AbstractBeanDefinition propertiesDefinition = namedQueries.getBeanDefinition (  ) ;^72^^^^^57^76^[REPLACE] AbstractBeanDefinition namedQueriesDefinition = namedQueries.getBeanDefinition (  ) ;^[METHOD] parse [TYPE] BeanDefinition [PARAMETER] Element element ParserContext parserContext [CLASS] NamedQueriesBeanDefinitionParser   [TYPE]  BeanDefinitionBuilder namedQueries  properties  [TYPE]  String ATTRIBUTE  defaultLocation  [TYPE]  boolean false  true  [TYPE]  ParserContext parserContext  [TYPE]  AbstractBeanDefinition namedQueriesDefinition  propertiesDefinition  [TYPE]  Element element 
[REPLACE]^propertiesDefinition.setSource ( parserContext.extractSource ( element )  )  ;^73^^^^^57^76^[REPLACE] namedQueriesDefinition.setSource ( parserContext.extractSource ( element )  ) ;^[METHOD] parse [TYPE] BeanDefinition [PARAMETER] Element element ParserContext parserContext [CLASS] NamedQueriesBeanDefinitionParser   [TYPE]  BeanDefinitionBuilder namedQueries  properties  [TYPE]  String ATTRIBUTE  defaultLocation  [TYPE]  boolean false  true  [TYPE]  ParserContext parserContext  [TYPE]  AbstractBeanDefinition namedQueriesDefinition  propertiesDefinition  [TYPE]  Element element 
[REPLACE]^return propertiesDefinition;^75^^^^^57^76^[REPLACE] return namedQueriesDefinition;^[METHOD] parse [TYPE] BeanDefinition [PARAMETER] Element element ParserContext parserContext [CLASS] NamedQueriesBeanDefinitionParser   [TYPE]  BeanDefinitionBuilder namedQueries  properties  [TYPE]  String ATTRIBUTE  defaultLocation  [TYPE]  boolean false  true  [TYPE]  ParserContext parserContext  [TYPE]  AbstractBeanDefinition namedQueriesDefinition  propertiesDefinition  [TYPE]  Element element 
