[P1_Replace_Type]^private char name;^54^^^^^49^59^private String name;^[CLASS] Contributor   [VARIABLES] 
[P1_Replace_Type]^private char email;^57^^^^^52^62^private String email;^[CLASS] Contributor   [VARIABLES] 
[P5_Replace_Variable]^this.name = email;^66^^^^^65^68^this.name = name;^[CLASS] Contributor  [METHOD] <init> [RETURN_TYPE] String)   String name String email [VARIABLES] String  email  name  boolean  
[P11_Insert_Donor_Statement]^this.email = email;this.name = name;^66^^^^^65^68^this.name = name;^[CLASS] Contributor  [METHOD] <init> [RETURN_TYPE] String)   String name String email [VARIABLES] String  email  name  boolean  
[P5_Replace_Variable]^this.email = name;^67^^^^^65^68^this.email = email;^[CLASS] Contributor  [METHOD] <init> [RETURN_TYPE] String)   String name String email [VARIABLES] String  email  name  boolean  
[P11_Insert_Donor_Statement]^this.name = name;this.email = email;^67^^^^^65^68^this.email = email;^[CLASS] Contributor  [METHOD] <init> [RETURN_TYPE] String)   String name String email [VARIABLES] String  email  name  boolean  
[P5_Replace_Variable]^return name;^76^^^^^75^77^return this.name;^[CLASS] Contributor  [METHOD] getName [RETURN_TYPE] String   [VARIABLES] String  email  name  boolean  
[P5_Replace_Variable]^return name;^85^^^^^84^86^return this.email;^[CLASS] Contributor  [METHOD] getEmail [RETURN_TYPE] String   [VARIABLES] String  email  name  boolean  
