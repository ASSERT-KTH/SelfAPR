[buglab_swap_variables]^super ( new Expression[] { arg2, arg1 } ) ;^31^^^^^30^32^super ( new Expression[] { arg1, arg2 } ) ;^[CLASS] CoreOperationMod  [METHOD] <init> [RETURN_TYPE] Expression)   Expression arg1 Expression arg2 [VARIABLES] boolean  Expression  arg1  arg2  
[buglab_swap_variables]^super ( new Expression[] {  arg2 } ) ;^31^^^^^30^32^super ( new Expression[] { arg1, arg2 } ) ;^[CLASS] CoreOperationMod  [METHOD] <init> [RETURN_TYPE] Expression)   Expression arg1 Expression arg2 [VARIABLES] boolean  Expression  arg1  arg2  
[buglab_swap_variables]^super ( new Expression[] { arg1 } ) ;^31^^^^^30^32^super ( new Expression[] { arg1, arg2 } ) ;^[CLASS] CoreOperationMod  [METHOD] <init> [RETURN_TYPE] Expression)   Expression arg1 Expression arg2 [VARIABLES] boolean  Expression  arg1  arg2  
[buglab_swap_variables]^long l =  ( long )  InfoSetUtil.doubleValue ( context[0].computeValue ( args )  ) ;^35^^^^^34^38^long l =  ( long )  InfoSetUtil.doubleValue ( args[0].computeValue ( context )  ) ;^[CLASS] CoreOperationMod  [METHOD] computeValue [RETURN_TYPE] Object   EvalContext context [VARIABLES] boolean  EvalContext  context  long  l  r  
[buglab_swap_variables]^long r =  ( long )  InfoSetUtil.doubleValue ( context[1].computeValue ( args )  ) ;^36^^^^^34^38^long r =  ( long )  InfoSetUtil.doubleValue ( args[1].computeValue ( context )  ) ;^[CLASS] CoreOperationMod  [METHOD] computeValue [RETURN_TYPE] Object   EvalContext context [VARIABLES] boolean  EvalContext  context  long  l  r  
[buglab_swap_variables]^return new Double ( r % l ) ;^37^^^^^34^38^return new Double ( l % r ) ;^[CLASS] CoreOperationMod  [METHOD] computeValue [RETURN_TYPE] Object   EvalContext context [VARIABLES] boolean  EvalContext  context  long  l  r  
