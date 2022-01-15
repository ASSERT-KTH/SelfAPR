[REPLACE]^private  T object;^10^^^^^^^[REPLACE] private final T object;^ [CLASS] Localized  
[REPLACE]^private  Location location;^11^^^^^^^[REPLACE] private final Location location;^ [CLASS] Localized  
[REPLACE]^this.object =  null;^14^^^^^13^16^[REPLACE] this.object = object;^[METHOD] <init> [TYPE] Localized(T) [PARAMETER] T object [CLASS] Localized   [TYPE]  T object  [TYPE]  Location location  [TYPE]  boolean false  true 
[ADD]^^14^15^^^^13^16^[ADD] this.object = object; location = new Location (  ) ;^[METHOD] <init> [TYPE] Localized(T) [PARAMETER] T object [CLASS] Localized   [TYPE]  T object  [TYPE]  Location location  [TYPE]  boolean false  true 
[REPLACE]^location  = null ;^15^^^^^13^16^[REPLACE] location = new Location (  ) ;^[METHOD] <init> [TYPE] Localized(T) [PARAMETER] T object [CLASS] Localized   [TYPE]  T object  [TYPE]  Location location  [TYPE]  boolean false  true 
[REPLACE]^return location;^19^^^^^18^20^[REPLACE] return object;^[METHOD] getObject [TYPE] T [PARAMETER] [CLASS] Localized   [TYPE]  T object  [TYPE]  Location location  [TYPE]  boolean false  true 
[REPLACE]^return object;^23^^^^^22^24^[REPLACE] return location;^[METHOD] getLocation [TYPE] Location [PARAMETER] [CLASS] Localized   [TYPE]  T object  [TYPE]  Location location  [TYPE]  boolean false  true 
