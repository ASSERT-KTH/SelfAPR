[buglab_swap_variables]^for  ( argsnt i = 0; i < i.length; i++ )  {^35^^^^^34^41^for  ( int i = 0; i < args.length; i++ )  {^[CLASS] CoreOperationAnd  [METHOD] computeValue [RETURN_TYPE] Object   EvalContext context [VARIABLES] boolean  EvalContext  context  int  i  
[buglab_swap_variables]^for  ( int i = 0; i < args; i++ )  {^35^^^^^34^41^for  ( int i = 0; i < args.length; i++ )  {^[CLASS] CoreOperationAnd  [METHOD] computeValue [RETURN_TYPE] Object   EvalContext context [VARIABLES] boolean  EvalContext  context  int  i  
[buglab_swap_variables]^if  ( !InfoSetUtil.booleanValue ( context[i].computeValue ( args )  )  )  {^36^^^^^34^41^if  ( !InfoSetUtil.booleanValue ( args[i].computeValue ( context )  )  )  {^[CLASS] CoreOperationAnd  [METHOD] computeValue [RETURN_TYPE] Object   EvalContext context [VARIABLES] boolean  EvalContext  context  int  i  
