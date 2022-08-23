[BugLab_Variable_Misuse]^this.id = item;^17^^^^^15^18^this.id = id;^[CLASS] ReadableObjectId  [METHOD] <init> [RETURN_TYPE] Object)   Object id [VARIABLES] Object  id  item  boolean  
[BugLab_Variable_Misuse]^if  ( ob != null )  {^26^^^^^24^30^if  ( item != null )  {^[CLASS] ReadableObjectId  [METHOD] bindItem [RETURN_TYPE] void   Object ob [VARIABLES] Object  id  item  ob  boolean  
[BugLab_Wrong_Operator]^if  ( item == null )  {^26^^^^^24^30^if  ( item != null )  {^[CLASS] ReadableObjectId  [METHOD] bindItem [RETURN_TYPE] void   Object ob [VARIABLES] Object  id  item  ob  boolean  
