[REPLACE]^this.argument =  power;^38^^^^^37^39^[REPLACE] this.argument = argument;^[METHOD] setOperand [TYPE] void [PARAMETER] Evaluation argument [CLASS] Power   [TYPE]  Evaluation argument  power  [TYPE]  boolean false  true 
[REPLACE]^this.power =  argument;^42^^^^^41^43^[REPLACE] this.power = power;^[METHOD] setPower [TYPE] void [PARAMETER] Evaluation power [CLASS] Power   [TYPE]  Evaluation argument  power  [TYPE]  boolean false  true 
[ADD]^^42^^^^^41^43^[ADD] this.power = power;^[METHOD] setPower [TYPE] void [PARAMETER] Evaluation power [CLASS] Power   [TYPE]  Evaluation argument  power  [TYPE]  boolean false  true 
[REPLACE]^return context.evaluate (   context.doubleValue ( argument )  , context.doubleValue (^46^47^48^49^^45^52^[REPLACE] return context.evaluate ( Math.pow ( context.doubleValue ( argument ) , context.doubleValue ( power )^[METHOD] evaluate [TYPE] Evaluation [PARAMETER] EvaluationContext context [CLASS] Power   [TYPE]  Evaluation argument  power  [TYPE]  EvaluationContext context  [TYPE]  boolean false  true 
