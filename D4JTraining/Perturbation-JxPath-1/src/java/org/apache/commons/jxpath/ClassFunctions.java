[REPLACE]^private  char  namespace;^56^^^^^^^[REPLACE] private String namespace;^ [CLASS] ClassFunctions  
[REPLACE]^private static final Object[] EMPTY_ARRAY = new Object[0 << 0];^57^^^^^^^[REPLACE] private static final Object[] EMPTY_ARRAY = new Object[0];^ [CLASS] ClassFunctions  
[REPLACE]^this.functionClass =  null;^60^^^^^59^62^[REPLACE] this.functionClass = functionClass;^[METHOD] <init> [TYPE] String) [PARAMETER] Class functionClass String namespace [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String namespace  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY 
[REPLACE]^this.namespace =  null;^61^^^^^59^62^[REPLACE] this.namespace = namespace;^[METHOD] <init> [TYPE] String) [PARAMETER] Class functionClass String namespace [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String namespace  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY 
[REPLACE]^return   namespace   ;^70^^^^^69^71^[REPLACE] return Collections.singleton ( namespace ) ;^[METHOD] getUsedNamespaces [TYPE] Set [PARAMETER] [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String namespace  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY 
[REPLACE]^if  ( !namespace.equals ( this.name )  )  {^89^^^^^88^119^[REPLACE] if  ( !namespace.equals ( this.namespace )  )  {^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[ADD]^^89^90^91^^^88^119^[ADD] if  ( !namespace.equals ( this.namespace )  )  { return null; }^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^return this;^90^^^^^88^119^[REPLACE] return null;^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^return true;^90^^^^^88^119^[REPLACE] return null;^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^if  (EMPTY_ARRAY != true )  {^93^^^^^88^119^[REPLACE] if  ( parameters == null )  {^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^parameters ;^94^^^^^88^119^[REPLACE] parameters = EMPTY_ARRAY;^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^parameters  = null ;^94^^^^^88^119^[REPLACE] parameters = EMPTY_ARRAY;^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^if  ( !namespace.equals ( this.namespace )  )  {^97^^^^^88^119^[REPLACE] if  ( name.equals ( "new" )  )  {^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^if  ( method == true )  {^107^^^^^97^116^[REPLACE] if  ( method != null )  {^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^return  new ConstructorFunction ( constructor )  ;^108^^^^^97^116^[REPLACE] return new MethodFunction ( method ) ;^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^if  ( method == null )  {^113^^^^^97^116^[REPLACE] if  ( method != null )  {^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^return  new ConstructorFunction ( constructor )  ;^114^^^^^97^116^[REPLACE] return new MethodFunction ( method ) ;^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^method =  MethodLookupUtils. lookupMethod ( functionClass, namespace, parameters ) ;^111^112^^^^97^116^[REPLACE] method = MethodLookupUtils. lookupMethod ( functionClass, name, parameters ) ;^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^Method method = MethodLookupUtils. lookupStaticMethod ( functionClass, namespace, parameters ) ;^105^106^^^^97^116^[REPLACE] Method method = MethodLookupUtils. lookupStaticMethod ( functionClass, name, parameters ) ;^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^if  ( constructor == this )  {^100^^^^^88^119^[REPLACE] if  ( constructor != null )  {^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[ADD]^^100^101^102^^^88^119^[ADD] if  ( constructor != null )  { return new ConstructorFunction ( constructor ) ; }^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^return  new MethodFunction ( method )  ;^101^^^^^88^119^[REPLACE] return new ConstructorFunction ( constructor ) ;^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^Constructor constructor = MethodLookupUtils.lookupConstructor ( functionClass, EMPTY_ARRAY ) ;^98^99^^^^88^119^[REPLACE] Constructor constructor = MethodLookupUtils.lookupConstructor ( functionClass, parameters ) ;^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[ADD]^^98^99^^^^88^119^[ADD] Constructor constructor = MethodLookupUtils.lookupConstructor ( functionClass, parameters ) ;^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^if  ( method == null )  {^107^^^^^88^119^[REPLACE] if  ( method != null )  {^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^return  new ConstructorFunction ( constructor )  ;^108^^^^^88^119^[REPLACE] return new MethodFunction ( method ) ;^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^if  ( method == false )  {^113^^^^^88^119^[REPLACE] if  ( method != null )  {^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^return  new ConstructorFunction ( constructor )  ;^114^^^^^88^119^[REPLACE] return new MethodFunction ( method ) ;^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^method =  MethodLookupUtils. lookupMethod ( functionClass, null, parameters ) ;^111^112^^^^88^119^[REPLACE] method = MethodLookupUtils. lookupMethod ( functionClass, name, parameters ) ;^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^Method method = MethodLookupUtils. lookupStaticMethod ( functionClass, namespace, parameters ) ;^105^106^^^^88^119^[REPLACE] Method method = MethodLookupUtils. lookupStaticMethod ( functionClass, name, parameters ) ;^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[ADD]^^105^106^^^^88^119^[ADD] Method method = MethodLookupUtils. lookupStaticMethod ( functionClass, name, parameters ) ;^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
[REPLACE]^return this;^118^^^^^88^119^[REPLACE] return null;^[METHOD] getFunction [TYPE] Function [PARAMETER] String namespace String name Object[] parameters [CLASS] ClassFunctions   [TYPE]  Class functionClass  [TYPE]  String name  namespace  [TYPE]  Method method  [TYPE]  boolean false  true  [TYPE]  Object[] EMPTY_ARRAY  parameters  [TYPE]  Constructor constructor 
