[REPLACE]^private  List<PotentialCheck> checks = Lists.newArrayList (  ) ;^28^^^^^^^[REPLACE] private final List<PotentialCheck> checks = Lists.newArrayList (  ) ;^ [CLASS] PotentialCheckManager  
[REPLACE]^check.evaluate (  ) ;^34^^^^^33^35^[REPLACE] checks.add ( check ) ;^[METHOD] add [TYPE] void [PARAMETER] PotentialCheck check [CLASS] PotentialCheckManager   [TYPE]  List checks  [TYPE]  PotentialCheck check  [TYPE]  boolean false  true 
[REPLACE]^for  ( PotentialCheck check : checks )  { check.evaluate (  ) ;^42^^^^^41^46^[REPLACE] for  ( PotentialCheck check : checks )  {^[METHOD] flush [TYPE] void [PARAMETER] [CLASS] PotentialCheckManager   [TYPE]  List checks  [TYPE]  PotentialCheck check  [TYPE]  boolean false  true 
[REPLACE]^checks.add ( check ) ;^45^^^^^41^46^[REPLACE] checks.clear (  ) ;^[METHOD] flush [TYPE] void [PARAMETER] [CLASS] PotentialCheckManager   [TYPE]  List checks  [TYPE]  PotentialCheck check  [TYPE]  boolean false  true 
[REMOVE]^checks.add ( check ) ;^45^^^^^41^46^[REMOVE] ^[METHOD] flush [TYPE] void [PARAMETER] [CLASS] PotentialCheckManager   [TYPE]  List checks  [TYPE]  PotentialCheck check  [TYPE]  boolean false  true 
