[REPLACE]^private final Map<Class<?>, Boolean> typeCache  = null ;^44^^^^^^^[REPLACE] private final Map<Class<?>, Boolean> typeCache = new HashMap<Class<?>, Boolean> (  ) ;^ [CLASS] SpelAwareProxyProjectionFactory 1  
[REPLACE]^private final SpelExpressionParser parser  = null ;^45^^^^^^^[REPLACE] private final SpelExpressionParser parser = new SpelExpressionParser (  ) ;^ [CLASS] SpelAwareProxyProjectionFactory 1  
[REPLACE]^private Object beanFactory;^47^^^^^^^[REPLACE] private BeanFactory beanFactory;^ [CLASS] SpelAwareProxyProjectionFactory 1  
[REPLACE]^if  ( !super .isInputProperty ( descriptor )   )  {^99^^^^^88^112^[REPLACE] if  ( !super.isInputProperty ( descriptor )  )  {^[METHOD] getProjectionInformation [TYPE] ProjectionInformation [PARAMETER] Class<?> projectionType [CLASS] SpelAwareProxyProjectionFactory 1   [TYPE]  SpelExpressionParser parser  [TYPE]  boolean false  true  [TYPE]  PropertyDescriptor descriptor  [TYPE]  BeanFactory beanFactory  [TYPE]  Class projectionType  [TYPE]  Method readMethod  [TYPE]  Map typeCache 
[ADD]^^99^100^101^^^88^112^[ADD] if  ( !super.isInputProperty ( descriptor )  )  { return false; }^[METHOD] getProjectionInformation [TYPE] ProjectionInformation [PARAMETER] Class<?> projectionType [CLASS] SpelAwareProxyProjectionFactory 1   [TYPE]  SpelExpressionParser parser  [TYPE]  boolean false  true  [TYPE]  PropertyDescriptor descriptor  [TYPE]  BeanFactory beanFactory  [TYPE]  Class projectionType  [TYPE]  Method readMethod  [TYPE]  Map typeCache 
[REPLACE]^return true;^100^^^^^88^112^[REPLACE] return false;^[METHOD] getProjectionInformation [TYPE] ProjectionInformation [PARAMETER] Class<?> projectionType [CLASS] SpelAwareProxyProjectionFactory 1   [TYPE]  SpelExpressionParser parser  [TYPE]  boolean false  true  [TYPE]  PropertyDescriptor descriptor  [TYPE]  BeanFactory beanFactory  [TYPE]  Class projectionType  [TYPE]  Method readMethod  [TYPE]  Map typeCache 
[REPLACE]^if  ( readMethod != null )  {^105^^^^^88^112^[REPLACE] if  ( readMethod == null )  {^[METHOD] getProjectionInformation [TYPE] ProjectionInformation [PARAMETER] Class<?> projectionType [CLASS] SpelAwareProxyProjectionFactory 1   [TYPE]  SpelExpressionParser parser  [TYPE]  boolean false  true  [TYPE]  PropertyDescriptor descriptor  [TYPE]  BeanFactory beanFactory  [TYPE]  Class projectionType  [TYPE]  Method readMethod  [TYPE]  Map typeCache 
[ADD]^return false;^105^106^107^^^88^112^[ADD] if  ( readMethod == null )  { return false; }^[METHOD] getProjectionInformation [TYPE] ProjectionInformation [PARAMETER] Class<?> projectionType [CLASS] SpelAwareProxyProjectionFactory 1   [TYPE]  SpelExpressionParser parser  [TYPE]  boolean false  true  [TYPE]  PropertyDescriptor descriptor  [TYPE]  BeanFactory beanFactory  [TYPE]  Class projectionType  [TYPE]  Method readMethod  [TYPE]  Map typeCache 
[REPLACE]^return true;^106^^^^^88^112^[REPLACE] return false;^[METHOD] getProjectionInformation [TYPE] ProjectionInformation [PARAMETER] Class<?> projectionType [CLASS] SpelAwareProxyProjectionFactory 1   [TYPE]  SpelExpressionParser parser  [TYPE]  boolean false  true  [TYPE]  PropertyDescriptor descriptor  [TYPE]  BeanFactory beanFactory  [TYPE]  Class projectionType  [TYPE]  Method readMethod  [TYPE]  Map typeCache 
[REPLACE]^return new DefaultProjectionInformation ( null )  {^90^^^^^88^112^[REPLACE] return new DefaultProjectionInformation ( projectionType )  {^[METHOD] getProjectionInformation [TYPE] ProjectionInformation [PARAMETER] Class<?> projectionType [CLASS] SpelAwareProxyProjectionFactory 1   [TYPE]  SpelExpressionParser parser  [TYPE]  boolean false  true  [TYPE]  PropertyDescriptor descriptor  [TYPE]  BeanFactory beanFactory  [TYPE]  Class projectionType  [TYPE]  Method readMethod  [TYPE]  Map typeCache 
[REPLACE]^return AnnotationUtils.findAnnotation ( readMethod, Value.class )  != null;;^109^^^^^88^112^[REPLACE] return AnnotationUtils.findAnnotation ( readMethod, Value.class )  == null;^[METHOD] getProjectionInformation [TYPE] ProjectionInformation [PARAMETER] Class<?> projectionType [CLASS] SpelAwareProxyProjectionFactory 1   [TYPE]  SpelExpressionParser parser  [TYPE]  boolean false  true  [TYPE]  PropertyDescriptor descriptor  [TYPE]  BeanFactory beanFactory  [TYPE]  Class projectionType  [TYPE]  Method readMethod  [TYPE]  Map typeCache 
