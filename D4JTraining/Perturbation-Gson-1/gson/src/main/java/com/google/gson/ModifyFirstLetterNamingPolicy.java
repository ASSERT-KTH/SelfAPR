[REPLACE]^Preconditions.checkNotNull ( letterModifier ) ;^66^^^^^65^68^[REPLACE] Preconditions.checkNotNull ( modifier ) ;^[METHOD] <init> [TYPE] ModifyFirstLetterNamingPolicy$LetterModifier) [PARAMETER] LetterModifier modifier [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  boolean false  true 
[REPLACE]^this.letterModifier =  letterModifier;^67^^^^^65^68^[REPLACE] this.letterModifier = modifier;^[METHOD] <init> [TYPE] ModifyFirstLetterNamingPolicy$LetterModifier) [PARAMETER] LetterModifier modifier [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  boolean false  true 
[REPLACE]^String modifiedTarget = modifyString ( Character.toUpperCase ( firstCharacter ) , target, ++index ) ;^73^^^^^72^100^[REPLACE] StringBuilder fieldNameBuilder = new StringBuilder (  ) ;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^int index = 4;^74^^^^^72^100^[REPLACE] int index = 0;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^char firstCharacter = modifiedTarget .substring ( index )  ;^75^^^^^72^100^[REPLACE] char firstCharacter = target.charAt ( index ) ;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[ADD]^^75^^^^^72^100^[ADD] char firstCharacter = target.charAt ( index ) ;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^while  ( index < target.size (  )  - 1 )  {^77^^^^^72^100^[REPLACE] while  ( index < target.length (  )  - 1 )  {^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[ADD]^^77^78^79^^^72^100^[ADD] while  ( index < target.length (  )  - 1 )  { if  ( Character.isLetter ( firstCharacter )  )  { break;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^if  ( Character .isUpperCase ( firstCharacter )   )  {^78^^^^^72^100^[REPLACE] if  ( Character.isLetter ( firstCharacter )  )  {^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[ADD]^^78^79^80^^^72^100^[ADD] if  ( Character.isLetter ( firstCharacter )  )  { break; }^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^firstCharacter =  modifiedTarget.charAt ( ++index ) ;^83^^^^^72^100^[REPLACE] firstCharacter = target.charAt ( ++index ) ;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^if  ( Character.isUpperCase ( firstCharacter )  )  {^78^^^^^72^100^[REPLACE] if  ( Character.isLetter ( firstCharacter )  )  {^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^if  ( index == target.length (  )  + 3 )  {^86^^^^^72^100^[REPLACE] if  ( index == target.length (  )  )  {^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[ADD]^return fieldNameBuilder.toString (  ) ;^86^87^88^^^72^100^[ADD] if  ( index == target.length (  )  )  { return fieldNameBuilder.toString (  ) ; }^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^return fieldNameBuilder .StringBuilder (  )  ;^87^^^^^72^100^[REPLACE] return fieldNameBuilder.toString (  ) ;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^boolean capitalizeFirstLetter =  ( letterModifier  &&  LetterModifier.UPPER ) ;^90^^^^^72^100^[REPLACE] boolean capitalizeFirstLetter =  ( letterModifier == LetterModifier.UPPER ) ;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[ADD]^^90^91^92^93^^72^100^[ADD] boolean capitalizeFirstLetter =  ( letterModifier == LetterModifier.UPPER ) ; if  ( capitalizeFirstLetter && !Character.isUpperCase ( firstCharacter )  )  { String modifiedTarget = modifyString ( Character.toUpperCase ( firstCharacter ) , target, ++index ) ; return fieldNameBuilder.append ( modifiedTarget ) .toString (  ) ;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^if  ( capitalizeFirstLetter && Character.isUpperCase ( firstCharacter )  )  {^91^^^^^72^100^[REPLACE] if  ( capitalizeFirstLetter && !Character.isUpperCase ( firstCharacter )  )  {^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^}  if  ( capitalizeFirstLetter && Character.isUpperCase ( firstCharacter )  )  {^94^^^^^72^100^[REPLACE] } else if  ( !capitalizeFirstLetter && Character.isUpperCase ( firstCharacter )  )  {^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^return modifiedTarget;^98^^^^^94^99^[REPLACE] return target;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^return indexOfSubstring < srcString.length (  )  ? firstCharacter + srcString.substring ( indexOfSubstring )^96^^^^^72^100^[REPLACE] return fieldNameBuilder.append ( modifiedTarget ) .toString (  ) ;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^String modifiedTarget = modifyString ( Character.toLowerCase ( firstCharacter ) , modifiedTarget, ++index ) ;^95^^^^^72^100^[REPLACE] String modifiedTarget = modifyString ( Character.toLowerCase ( firstCharacter ) , target, ++index ) ;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^return modifiedTarget;^98^^^^^72^100^[REPLACE] return target;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^String modifiedTarget = modifyString ( Character.toUpperCase ( firstCharacter ) , target, ++index ) ;^95^^^^^72^100^[REPLACE] String modifiedTarget = modifyString ( Character.toLowerCase ( firstCharacter ) , target, ++index ) ;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^return fieldNameBuilder .StringBuilder (  )  .toString (  ) ;^93^^^^^72^100^[REPLACE] return fieldNameBuilder.append ( modifiedTarget ) .toString (  ) ;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^String modifiedTarget = modifyString ( Character.toUpperCase ( firstCharacter ) , modifiedTarget, ++index ) ;^92^^^^^72^100^[REPLACE] String modifiedTarget = modifyString ( Character.toUpperCase ( firstCharacter ) , target, ++index ) ;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^} else if  ( capitalizeFirstLetter ) {^94^^^^^72^100^[REPLACE] } else if  ( !capitalizeFirstLetter && Character.isUpperCase ( firstCharacter )  )  {^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[ADD]^}   return fieldNameBuilder.append ( modifiedTarget ) .toString (  ) ;return target;^94^95^96^97^98^72^100^[ADD] else if  ( !capitalizeFirstLetter && Character.isUpperCase ( firstCharacter )  )  { String modifiedTarget = modifyString ( Character.toLowerCase ( firstCharacter ) , target, ++index ) ; return fieldNameBuilder.append ( modifiedTarget ) .toString (  ) ; } else { return target;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^return fieldNameBuilder.append ( modifiedTarget )  .StringBuilder (  )  ;^96^^^^^72^100^[REPLACE] return fieldNameBuilder.append ( modifiedTarget ) .toString (  ) ;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^return fieldNameBuilder.append ( modifiedTarget ) .append (  ) ;^93^^^^^72^100^[REPLACE] return fieldNameBuilder.append ( modifiedTarget ) .toString (  ) ;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^return fieldNameBuilder.append ( modifiedTarget ) .append (  ) ;^96^^^^^72^100^[REPLACE] return fieldNameBuilder.append ( modifiedTarget ) .toString (  ) ;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^String modifiedTarget = modifyString (   firstCharacter   , target, ++index ) ;^92^^^^^72^100^[REPLACE] String modifiedTarget = modifyString ( Character.toUpperCase ( firstCharacter ) , target, ++index ) ;^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[ADD]^^95^96^97^98^99^72^100^[ADD] String modifiedTarget = modifyString ( Character.toLowerCase ( firstCharacter ) , target, ++index ) ; return fieldNameBuilder.append ( modifiedTarget ) .toString (  ) ; } else { return target; }^[METHOD] translateName [TYPE] String [PARAMETER] String target Type fieldType Annotation> annotations [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  Type fieldType  [TYPE]  boolean capitalizeFirstLetter  false  true  [TYPE]  StringBuilder fieldNameBuilder  [TYPE]  char firstCharacter  [TYPE]  Collection annotations  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String modifiedTarget  target  [TYPE]  int index 
[REPLACE]^return indexOfSubstring  ;^103^104^105^^^102^106^[REPLACE] return indexOfSubstring < srcString.length (  )  ? firstCharacter + srcString.substring ( indexOfSubstring ) : String.valueOf ( firstCharacter ) ;^[METHOD] modifyString [TYPE] String [PARAMETER] char firstCharacter String srcString int indexOfSubstring [CLASS] ModifyFirstLetterNamingPolicy LetterModifier   [TYPE]  char firstCharacter  [TYPE]  LetterModifier LOWER  UPPER  letterModifier  modifier  [TYPE]  String srcString  [TYPE]  boolean false  true  [TYPE]  int indexOfSubstring 
