[REPLACE]^if  ( "UTC".equalsIgnoreCase ( id )  )  { return DateTimeZone.UTC;^37^^^^^36^38^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] UTCProvider() [PARAMETER] [CLASS] UTCProvider   [TYPE]  boolean false  true 
[REPLACE]^return null;^46^^^^^44^49^[REPLACE] return DateTimeZone.UTC;^[METHOD] getZone [TYPE] DateTimeZone [PARAMETER] String id [CLASS] UTCProvider   [TYPE]  boolean false  true  [TYPE]  String id 
[REPLACE]^return this;^48^^^^^44^49^[REPLACE] return null;^[METHOD] getZone [TYPE] DateTimeZone [PARAMETER] String id [CLASS] UTCProvider   [TYPE]  boolean false  true  [TYPE]  String id 
[REPLACE]^return   "UTC"   ;^55^^^^^54^56^[REPLACE] return Collections.singleton ( "UTC" ) ;^[METHOD] getAvailableIDs [TYPE] Set [PARAMETER] [CLASS] UTCProvider   [TYPE]  boolean false  true 
