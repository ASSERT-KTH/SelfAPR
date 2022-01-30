[REPLACE]^private Object item;^13^^^^^^^[REPLACE] public Object item;^ [CLASS] ReadableObjectId  
[REPLACE]^this.id =  item;^17^^^^^15^18^[REPLACE] this.id = id;^[METHOD] <init> [TYPE] Object) [PARAMETER] Object id [CLASS] ReadableObjectId   [TYPE]  Object id  item  [TYPE]  boolean false  true 
[ADD]^^17^^^^^15^18^[ADD] this.id = id;^[METHOD] <init> [TYPE] Object) [PARAMETER] Object id [CLASS] ReadableObjectId   [TYPE]  Object id  item  [TYPE]  boolean false  true 
[REPLACE]^if  ( id == false )  {^26^^^^^24^30^[REPLACE] if  ( item != null )  {^[METHOD] bindItem [TYPE] void [PARAMETER] Object ob [CLASS] ReadableObjectId   [TYPE]  Object id  item  ob  [TYPE]  boolean false  true 
[REPLACE]^return ;^27^^^^^24^30^[REPLACE] throw new IllegalStateException  (" ")  ;^[METHOD] bindItem [TYPE] void [PARAMETER] Object ob [CLASS] ReadableObjectId   [TYPE]  Object id  item  ob  [TYPE]  boolean false  true 
[ADD]^^27^^^^^24^30^[ADD] throw new IllegalStateException  (" ")  ;^[METHOD] bindItem [TYPE] void [PARAMETER] Object ob [CLASS] ReadableObjectId   [TYPE]  Object id  item  ob  [TYPE]  boolean false  true 
[REPLACE]^item =  null;^29^^^^^24^30^[REPLACE] item = ob;^[METHOD] bindItem [TYPE] void [PARAMETER] Object ob [CLASS] ReadableObjectId   [TYPE]  Object id  item  ob  [TYPE]  boolean false  true 
