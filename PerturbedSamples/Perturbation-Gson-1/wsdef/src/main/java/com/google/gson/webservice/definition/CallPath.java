[REPLACE]^private  String path;^25^^^^^^^[REPLACE] private final String path;^ [CLASS] CallPath  
[REPLACE]^this.path =  null;^28^^^^^27^29^[REPLACE] this.path = path;^[METHOD] <init> [TYPE] String) [PARAMETER] String path [CLASS] CallPath   [TYPE]  String path  [TYPE]  boolean false  true 
[REPLACE]^return false;^32^^^^^31^33^[REPLACE] return path;^[METHOD] get [TYPE] String [PARAMETER] [CLASS] CallPath   [TYPE]  String path  [TYPE]  boolean false  true 
[REPLACE]^return path .hashCode (  )  ;^37^^^^^36^38^[REPLACE] return path.hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] CallPath   [TYPE]  String path  [TYPE]  boolean false  true 
[REPLACE]^if  ( this  ||  obj )  {^42^^^^^41^49^[REPLACE] if  ( this == obj )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CallPath   [TYPE]  Object obj  [TYPE]  String path  [TYPE]  boolean false  true 
[REPLACE]^return false;^43^^^^^41^49^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CallPath   [TYPE]  Object obj  [TYPE]  String path  [TYPE]  boolean false  true 
[REPLACE]^if  ( obj != this  )  {^45^^^^^41^49^[REPLACE] if  ( obj == null )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CallPath   [TYPE]  Object obj  [TYPE]  String path  [TYPE]  boolean false  true 
[REMOVE]^if  (  ( this )  == obj )  {     return true; }^45^^^^^41^49^[REMOVE] ^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CallPath   [TYPE]  Object obj  [TYPE]  String path  [TYPE]  boolean false  true 
[REPLACE]^return true;^46^^^^^41^49^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CallPath   [TYPE]  Object obj  [TYPE]  String path  [TYPE]  boolean false  true 
[REPLACE]^return   path ;^48^^^^^41^49^[REPLACE] return getClass (  )  == obj.getClass (  )  && path ==  (  ( CallPath ) obj ) .path;^[METHOD] equals [TYPE] boolean [PARAMETER] Object obj [CLASS] CallPath   [TYPE]  Object obj  [TYPE]  String path  [TYPE]  boolean false  true 
[REPLACE]^return false;^53^^^^^52^54^[REPLACE] return path;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] CallPath   [TYPE]  String path  [TYPE]  boolean false  true 
