[REPLACE]^long l =  ( long )  InfoSetUtil.doubleValue ( args[0].computeValue ( context )  ) ;^31^^^^^30^32^[REPLACE] super ( new Expression[] { arg1, arg2 } ) ;^[METHOD] <init> [TYPE] Expression) [PARAMETER] Expression arg1 Expression arg2 [CLASS] CoreOperationMod   [TYPE]  boolean false  true  [TYPE]  Expression arg1  arg2 
[REPLACE]^long l =  ( long )  InfoSetUtil.doubleValue ( args[1].computeValue ( context )  ) ;^35^^^^^34^38^[REPLACE] long l =  ( long )  InfoSetUtil.doubleValue ( args[0].computeValue ( context )  ) ;^[METHOD] computeValue [TYPE] Object [PARAMETER] EvalContext context [CLASS] CoreOperationMod   [TYPE]  boolean false  true  [TYPE]  EvalContext context  [TYPE]  long l  r 
[REPLACE]^long r =  ( long )  InfoSetUtil.doubleValue ( args[1 + 2].computeValue ( context )  ) ;^36^^^^^34^38^[REPLACE] long r =  ( long )  InfoSetUtil.doubleValue ( args[1].computeValue ( context )  ) ;^[METHOD] computeValue [TYPE] Object [PARAMETER] EvalContext context [CLASS] CoreOperationMod   [TYPE]  boolean false  true  [TYPE]  EvalContext context  [TYPE]  long l  r 
[REPLACE]^return new Double ( l  &  r ) ;^37^^^^^34^38^[REPLACE] return new Double ( l % r ) ;^[METHOD] computeValue [TYPE] Object [PARAMETER] EvalContext context [CLASS] CoreOperationMod   [TYPE]  boolean false  true  [TYPE]  EvalContext context  [TYPE]  long l  r 
[REPLACE]^return 4;^41^^^^^40^42^[REPLACE] return 5;^[METHOD] getPrecedence [TYPE] int [PARAMETER] [CLASS] CoreOperationMod   [TYPE]  boolean false  true 
[REPLACE]^return true;^45^^^^^44^46^[REPLACE] return false;^[METHOD] isSymmetric [TYPE] boolean [PARAMETER] [CLASS] CoreOperationMod   [TYPE]  boolean false  true 
[REPLACE]^return false;^49^^^^^48^50^[REPLACE] return "mod";^[METHOD] getSymbol [TYPE] String [PARAMETER] [CLASS] CoreOperationMod   [TYPE]  boolean false  true 
