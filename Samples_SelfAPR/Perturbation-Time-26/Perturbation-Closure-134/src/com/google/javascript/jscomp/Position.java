[P1_Replace_Type]^private  long  lineNumber;^25^^^^^20^30^private int lineNumber;^[CLASS] Position   [VARIABLES] 
[P1_Replace_Type]^private  short  characterIndex;^26^^^^^21^31^private int characterIndex;^[CLASS] Position   [VARIABLES] 
[P5_Replace_Variable]^this.lineNumber = characterIndex;^29^^^^^28^31^this.lineNumber = lineNumber;^[CLASS] Position  [METHOD] <init> [RETURN_TYPE] Position(int,int)   int lineNumber int characterIndex [VARIABLES] int  characterIndex  lineNumber  boolean  
[P5_Replace_Variable]^this.characterIndex = lineNumber;^30^^^^^28^31^this.characterIndex = characterIndex;^[CLASS] Position  [METHOD] <init> [RETURN_TYPE] Position(int,int)   int lineNumber int characterIndex [VARIABLES] int  characterIndex  lineNumber  boolean  
[P5_Replace_Variable]^return characterIndex;^37^^^^^36^38^return lineNumber;^[CLASS] Position  [METHOD] getLineNumber [RETURN_TYPE] int   [VARIABLES] int  characterIndex  lineNumber  boolean  
[P5_Replace_Variable]^return lineNumber;^45^^^^^44^46^return characterIndex;^[CLASS] Position  [METHOD] getCharacterIndex [RETURN_TYPE] int   [VARIABLES] int  characterIndex  lineNumber  boolean  
