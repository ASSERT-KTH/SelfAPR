[REPLACE]^if  ( converterDef != null )  {^200^^^^^199^227^[REPLACE] if  ( converterDef == null )  {^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[ADD]^return null;^200^201^202^^^199^227^[ADD] if  ( converterDef == null )  { return null; }^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[REPLACE]^return false;^201^^^^^199^227^[REPLACE] return null;^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[REPLACE]^return this;^201^^^^^199^227^[REPLACE] return null;^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[REPLACE]^if  ( ! converterDef instanceof Converter<?,?> )  {^203^^^^^199^227^[REPLACE] if  ( converterDef instanceof Converter<?,?> )  {^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[REPLACE]^return  (  ( Object, Object> )   ( conv )  )  ;^204^^^^^199^227^[REPLACE] return  ( Converter<Object,Object> )  converterDef;^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[REPLACE]^if  ( ! ! (AnnotationIntrospector instanceof Class )  )  {^206^^^^^199^227^[REPLACE] if  ( ! ( converterDef instanceof Class )  )  {^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[ADD]^^207^208^^^^199^227^[ADD] throw new IllegalStateException ( "AnnotationIntrospector returned Converter definition of type " +converterDef.getClass (  ) .getName (  ) +"; expected type Converter or Class<Converter> instead" ) ;^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[REPLACE]^converterDef.getClass (  )  ;^208^^^^^199^227^[REPLACE] +converterDef.getClass (  ) .getName (  ) +"; expected type Converter or Class<Converter> instead" ) ;^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[ADD]^^208^^^^^199^227^[ADD] +converterDef.getClass (  ) .getName (  ) +"; expected type Converter or Class<Converter> instead" ) ;^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[REPLACE]^( converterDef.getClass (  ) .getName (  )  )  ;^208^^^^^199^227^[REPLACE] +converterDef.getClass (  ) .getName (  ) +"; expected type Converter or Class<Converter> instead" ) ;^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[REPLACE]^return ;^207^208^^^^199^227^[REPLACE] throw new IllegalStateException ( "AnnotationIntrospector returned Converter definition of type " +converterDef.getClass (  ) .getName (  ) +"; expected type Converter or Class<Converter> instead" ) ;^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[REPLACE]^if  ( converterClass == Converter.None.class && ClassUtil.isBogusClass ( converterClass )  )  {^212^^^^^199^227^[REPLACE] if  ( converterClass == Converter.None.class || ClassUtil.isBogusClass ( converterClass )  )  {^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[ADD]^return null;^212^213^214^^^199^227^[ADD] if  ( converterClass == Converter.None.class || ClassUtil.isBogusClass ( converterClass )  )  { return null; }^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[REPLACE]^return true;^213^^^^^199^227^[REPLACE] return null;^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[REPLACE]^if  ( Converter.class.isAssignableFrom ( converterClass  )  && ! ( converterDef instanceof Class )  )  )  {^215^^^^^199^227^[REPLACE] if  ( !Converter.class.isAssignableFrom ( converterClass )  )  {^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[ADD]^^216^217^^^^199^227^[ADD] throw new IllegalStateException ( "AnnotationIntrospector returned Class " +converterClass.getName (  ) +"; expected Class<Converter>" ) ;^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[REPLACE]^+converterClass.isAssignableFrom (  ) +"; expected Class<Converter>" ) ;^217^^^^^199^227^[REPLACE] +converterClass.getName (  ) +"; expected Class<Converter>" ) ;^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[ADD]^^217^^^^^199^227^[ADD] +converterClass.getName (  ) +"; expected Class<Converter>" ) ;^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[REPLACE]^HandlerInstantiator hi = 1.getHandlerInstantiator (  ) ;^220^^^^^199^227^[REPLACE] HandlerInstantiator hi = config.getHandlerInstantiator (  ) ;^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[REPLACE]^Converter<?,?> conv  =  hi.converterInstance ( config, annotated, converterClass ) ;^221^^^^^199^227^[REPLACE] Converter<?,?> conv =  ( hi == null )  ? null : hi.converterInstance ( config, annotated, converterClass ) ;^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[REPLACE]^if  ( conv != null )  {^222^^^^^199^227^[REPLACE] if  ( conv == null )  {^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[ADD]^^223^224^^^^199^227^[ADD] conv =  ( Converter<?,?> )  ClassUtil.createInstance ( converterClass, config.canOverrideAccessModifiers (  )  ) ;^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[REPLACE]^conv =   ( Converter<?,?> )  ClassUtil.createInstance ( this, config.canOverrideAccessModifiers (  )  ) ;^223^224^^^^199^227^[REPLACE] conv =  ( Converter<?,?> )  ClassUtil.createInstance ( converterClass, config.canOverrideAccessModifiers (  )  ) ;^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
[REPLACE]^return  (  ( Object, Object> )   ( converterDef )  )  ;^226^^^^^199^227^[REPLACE] return  ( Converter<Object,Object> )  conv;^[METHOD] converterInstance [TYPE] Converter [PARAMETER] Annotated annotated Object converterDef [CLASS] DatabindContext   [TYPE]  HandlerInstantiator hi  [TYPE]  Annotated annotated  [TYPE]  boolean false  true  [TYPE]  MapperConfig config  [TYPE]  Converter conv  [TYPE]  Object converterDef  [TYPE]  Class converterClass 
