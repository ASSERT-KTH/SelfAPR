[buglab_swap_variables]^for  ( Iterator methods = it.iterator (  ) ; it.hasNext (  ) ; )  {^31^^^^^30^40^for  ( Iterator it = methods.iterator (  ) ; it.hasNext (  ) ; )  {^[CLASS] FixedValueGenerator  [METHOD] generate [RETURN_TYPE] void   ClassEmitter ce Context context List methods [VARIABLES] Context  context  CodeEmitter  e  Type  FIXED_VALUE  boolean  FixedValueGenerator  INSTANCE  Signature  LOAD_OBJECT  ClassEmitter  ce  Iterator  it  List  methods  MethodInfo  method  
[buglab_swap_variables]^for  ( Iterator method = its.iterator (  ) ; it.hasNext (  ) ; )  {^31^^^^^30^40^for  ( Iterator it = methods.iterator (  ) ; it.hasNext (  ) ; )  {^[CLASS] FixedValueGenerator  [METHOD] generate [RETURN_TYPE] void   ClassEmitter ce Context context List methods [VARIABLES] Context  context  CodeEmitter  e  Type  FIXED_VALUE  boolean  FixedValueGenerator  INSTANCE  Signature  LOAD_OBJECT  ClassEmitter  ce  Iterator  it  List  methods  MethodInfo  method  
[buglab_swap_variables]^CodeEmitter e = ce.beginMethod ( context, method ) ;^33^^^^^30^40^CodeEmitter e = context.beginMethod ( ce, method ) ;^[CLASS] FixedValueGenerator  [METHOD] generate [RETURN_TYPE] void   ClassEmitter ce Context context List methods [VARIABLES] Context  context  CodeEmitter  e  Type  FIXED_VALUE  boolean  FixedValueGenerator  INSTANCE  Signature  LOAD_OBJECT  ClassEmitter  ce  Iterator  it  List  methods  MethodInfo  method  
[buglab_swap_variables]^CodeEmitter e = context.beginMethod (  method ) ;^33^^^^^30^40^CodeEmitter e = context.beginMethod ( ce, method ) ;^[CLASS] FixedValueGenerator  [METHOD] generate [RETURN_TYPE] void   ClassEmitter ce Context context List methods [VARIABLES] Context  context  CodeEmitter  e  Type  FIXED_VALUE  boolean  FixedValueGenerator  INSTANCE  Signature  LOAD_OBJECT  ClassEmitter  ce  Iterator  it  List  methods  MethodInfo  method  
[buglab_swap_variables]^CodeEmitter e = context.beginMethod ( method, ce ) ;^33^^^^^30^40^CodeEmitter e = context.beginMethod ( ce, method ) ;^[CLASS] FixedValueGenerator  [METHOD] generate [RETURN_TYPE] void   ClassEmitter ce Context context List methods [VARIABLES] Context  context  CodeEmitter  e  Type  FIXED_VALUE  boolean  FixedValueGenerator  INSTANCE  Signature  LOAD_OBJECT  ClassEmitter  ce  Iterator  it  List  methods  MethodInfo  method  
[buglab_swap_variables]^CodeEmitter e = context.beginMethod ( ce ) ;^33^^^^^30^40^CodeEmitter e = context.beginMethod ( ce, method ) ;^[CLASS] FixedValueGenerator  [METHOD] generate [RETURN_TYPE] void   ClassEmitter ce Context context List methods [VARIABLES] Context  context  CodeEmitter  e  Type  FIXED_VALUE  boolean  FixedValueGenerator  INSTANCE  Signature  LOAD_OBJECT  ClassEmitter  ce  Iterator  it  List  methods  MethodInfo  method  
[buglab_swap_variables]^CodeEmitter e = method.beginMethod ( ce, context ) ;^33^^^^^30^40^CodeEmitter e = context.beginMethod ( ce, method ) ;^[CLASS] FixedValueGenerator  [METHOD] generate [RETURN_TYPE] void   ClassEmitter ce Context context List methods [VARIABLES] Context  context  CodeEmitter  e  Type  FIXED_VALUE  boolean  FixedValueGenerator  INSTANCE  Signature  LOAD_OBJECT  ClassEmitter  ce  Iterator  it  List  methods  MethodInfo  method  
[buglab_swap_variables]^context.emitCallback ( context, e.getIndex ( method )  ) ;^34^^^^^30^40^context.emitCallback ( e, context.getIndex ( method )  ) ;^[CLASS] FixedValueGenerator  [METHOD] generate [RETURN_TYPE] void   ClassEmitter ce Context context List methods [VARIABLES] Context  context  CodeEmitter  e  Type  FIXED_VALUE  boolean  FixedValueGenerator  INSTANCE  Signature  LOAD_OBJECT  ClassEmitter  ce  Iterator  it  List  methods  MethodInfo  method  
[buglab_swap_variables]^context.emitCallback ( e.getIndex ( method )  ) ;^34^^^^^30^40^context.emitCallback ( e, context.getIndex ( method )  ) ;^[CLASS] FixedValueGenerator  [METHOD] generate [RETURN_TYPE] void   ClassEmitter ce Context context List methods [VARIABLES] Context  context  CodeEmitter  e  Type  FIXED_VALUE  boolean  FixedValueGenerator  INSTANCE  Signature  LOAD_OBJECT  ClassEmitter  ce  Iterator  it  List  methods  MethodInfo  method  
[buglab_swap_variables]^context.emitCallback ( method, context.getIndex ( e )  ) ;^34^^^^^30^40^context.emitCallback ( e, context.getIndex ( method )  ) ;^[CLASS] FixedValueGenerator  [METHOD] generate [RETURN_TYPE] void   ClassEmitter ce Context context List methods [VARIABLES] Context  context  CodeEmitter  e  Type  FIXED_VALUE  boolean  FixedValueGenerator  INSTANCE  Signature  LOAD_OBJECT  ClassEmitter  ce  Iterator  it  List  methods  MethodInfo  method  
[buglab_swap_variables]^context.emitCallback (  context.getIndex ( method )  ) ;^34^^^^^30^40^context.emitCallback ( e, context.getIndex ( method )  ) ;^[CLASS] FixedValueGenerator  [METHOD] generate [RETURN_TYPE] void   ClassEmitter ce Context context List methods [VARIABLES] Context  context  CodeEmitter  e  Type  FIXED_VALUE  boolean  FixedValueGenerator  INSTANCE  Signature  LOAD_OBJECT  ClassEmitter  ce  Iterator  it  List  methods  MethodInfo  method  
[buglab_swap_variables]^context.emitCallback ( e, method.getIndex ( context )  ) ;^34^^^^^30^40^context.emitCallback ( e, context.getIndex ( method )  ) ;^[CLASS] FixedValueGenerator  [METHOD] generate [RETURN_TYPE] void   ClassEmitter ce Context context List methods [VARIABLES] Context  context  CodeEmitter  e  Type  FIXED_VALUE  boolean  FixedValueGenerator  INSTANCE  Signature  LOAD_OBJECT  ClassEmitter  ce  Iterator  it  List  methods  MethodInfo  method  
[buglab_swap_variables]^e.invoke_interface (  LOAD_OBJECT ) ;^35^^^^^30^40^e.invoke_interface ( FIXED_VALUE, LOAD_OBJECT ) ;^[CLASS] FixedValueGenerator  [METHOD] generate [RETURN_TYPE] void   ClassEmitter ce Context context List methods [VARIABLES] Context  context  CodeEmitter  e  Type  FIXED_VALUE  boolean  FixedValueGenerator  INSTANCE  Signature  LOAD_OBJECT  ClassEmitter  ce  Iterator  it  List  methods  MethodInfo  method  
[buglab_swap_variables]^e.invoke_interface ( FIXED_VALUE ) ;^35^^^^^30^40^e.invoke_interface ( FIXED_VALUE, LOAD_OBJECT ) ;^[CLASS] FixedValueGenerator  [METHOD] generate [RETURN_TYPE] void   ClassEmitter ce Context context List methods [VARIABLES] Context  context  CodeEmitter  e  Type  FIXED_VALUE  boolean  FixedValueGenerator  INSTANCE  Signature  LOAD_OBJECT  ClassEmitter  ce  Iterator  it  List  methods  MethodInfo  method  
[buglab_swap_variables]^e.invoke_interface ( LOAD_OBJECT, FIXED_VALUE ) ;^35^^^^^30^40^e.invoke_interface ( FIXED_VALUE, LOAD_OBJECT ) ;^[CLASS] FixedValueGenerator  [METHOD] generate [RETURN_TYPE] void   ClassEmitter ce Context context List methods [VARIABLES] Context  context  CodeEmitter  e  Type  FIXED_VALUE  boolean  FixedValueGenerator  INSTANCE  Signature  LOAD_OBJECT  ClassEmitter  ce  Iterator  it  List  methods  MethodInfo  method  
