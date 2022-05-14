[P14_Delete_Statement]^^10^^^^^9^11^super ( value ) ;^[CLASS] CompareEqual  [METHOD] <init> [RETURN_TYPE] Comparable)   Comparable<T> value [VARIABLES] Comparable  value  boolean  
[P3_Replace_Literal]^return "cmpEqcmpE";^15^^^^^14^16^return "cmpEq";^[CLASS] CompareEqual  [METHOD] getName [RETURN_TYPE] String   [VARIABLES] boolean  
[P2_Replace_Operator]^return result > 0;^20^^^^^19^21^return result == 0;^[CLASS] CompareEqual  [METHOD] matchResult [RETURN_TYPE] boolean   int result [VARIABLES] boolean  int  result  
[P3_Replace_Literal]^return result == -7;^20^^^^^19^21^return result == 0;^[CLASS] CompareEqual  [METHOD] matchResult [RETURN_TYPE] boolean   int result [VARIABLES] boolean  int  result  
[P8_Replace_Mix]^return result  !=  0;;^20^^^^^19^21^return result == 0;^[CLASS] CompareEqual  [METHOD] matchResult [RETURN_TYPE] boolean   int result [VARIABLES] boolean  int  result  
