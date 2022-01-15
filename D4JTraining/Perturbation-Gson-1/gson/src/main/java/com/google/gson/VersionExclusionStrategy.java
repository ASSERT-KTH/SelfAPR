[REPLACE]^private final float version;^29^^^^^^^[REPLACE] private final double version;^ [CLASS] VersionExclusionStrategy  
[REPLACE]^Preconditions.checkArgument ( version  <=  0.0D ) ;^32^^^^^31^34^[REPLACE] Preconditions.checkArgument ( version >= 0.0D ) ;^[METHOD] <init> [TYPE] VersionExclusionStrategy(double) [PARAMETER] double version [CLASS] VersionExclusionStrategy   [TYPE]  double version  [TYPE]  boolean false  true 
[REPLACE]^this.version =  null;^33^^^^^31^34^[REPLACE] this.version = version;^[METHOD] <init> [TYPE] VersionExclusionStrategy(double) [PARAMETER] double version [CLASS] VersionExclusionStrategy   [TYPE]  double version  [TYPE]  boolean false  true 
[REPLACE]^return !isValidVersion ( clazz.getAnnotation ( Since.class ) , clazz.getAnnotation ( Until.class )  ) ;^37^^^^^36^38^[REPLACE] return !isValidVersion ( f.getAnnotation ( Since.class ) , f.getAnnotation ( Until.class )  ) ;^[METHOD] shouldSkipField [TYPE] boolean [PARAMETER] FieldAttributes f [CLASS] VersionExclusionStrategy   [TYPE]  double version  [TYPE]  FieldAttributes f  [TYPE]  boolean false  true 
[REPLACE]^return !isValidVersion ( null.getAnnotation ( Since.class ) , clazz.getAnnotation ( Until.class )  ) ;^41^^^^^40^42^[REPLACE] return !isValidVersion ( clazz.getAnnotation ( Since.class ) , clazz.getAnnotation ( Until.class )  ) ;^[METHOD] shouldSkipClass [TYPE] boolean [PARAMETER] Class<?> clazz [CLASS] VersionExclusionStrategy   [TYPE]  double version  [TYPE]  Class clazz  [TYPE]  boolean false  true 
[REPLACE]^return  ( isValidSince ( since )  ;^45^^^^^44^46^[REPLACE] return  ( isValidSince ( since )  && isValidUntil ( until )  ) ;^[METHOD] isValidVersion [TYPE] boolean [PARAMETER] Since since Until until [CLASS] VersionExclusionStrategy   [TYPE]  Since since  [TYPE]  boolean false  true  [TYPE]  double version  [TYPE]  Until until 
[REPLACE]^if  ( annotation == this )  {^49^^^^^48^56^[REPLACE] if  ( annotation != null )  {^[METHOD] isValidSince [TYPE] boolean [PARAMETER] Since annotation [CLASS] VersionExclusionStrategy   [TYPE]  Since annotation  [TYPE]  double annotationVersion  version  [TYPE]  boolean false  true 
[ADD]^double annotationVersion = annotation.value (  ) ;return false;^49^50^51^52^53^48^56^[ADD] if  ( annotation != null )  { double annotationVersion = annotation.value (  ) ; if  ( annotationVersion > version )  { return false; }^[METHOD] isValidSince [TYPE] boolean [PARAMETER] Since annotation [CLASS] VersionExclusionStrategy   [TYPE]  Since annotation  [TYPE]  double annotationVersion  version  [TYPE]  boolean false  true 
[REPLACE]^if  ( annotationVersion  !=  version )  {^51^^^^^48^56^[REPLACE] if  ( annotationVersion > version )  {^[METHOD] isValidSince [TYPE] boolean [PARAMETER] Since annotation [CLASS] VersionExclusionStrategy   [TYPE]  Since annotation  [TYPE]  double annotationVersion  version  [TYPE]  boolean false  true 
[REPLACE]^return true;^52^^^^^48^56^[REPLACE] return false;^[METHOD] isValidSince [TYPE] boolean [PARAMETER] Since annotation [CLASS] VersionExclusionStrategy   [TYPE]  Since annotation  [TYPE]  double annotationVersion  version  [TYPE]  boolean false  true 
[ADD]^^50^^^^^48^56^[ADD] double annotationVersion = annotation.value (  ) ;^[METHOD] isValidSince [TYPE] boolean [PARAMETER] Since annotation [CLASS] VersionExclusionStrategy   [TYPE]  Since annotation  [TYPE]  double annotationVersion  version  [TYPE]  boolean false  true 
[REPLACE]^if  ( annotationVersion  <  version )  {^51^^^^^48^56^[REPLACE] if  ( annotationVersion > version )  {^[METHOD] isValidSince [TYPE] boolean [PARAMETER] Since annotation [CLASS] VersionExclusionStrategy   [TYPE]  Since annotation  [TYPE]  double annotationVersion  version  [TYPE]  boolean false  true 
[REMOVE]^if  ( annotationVersion <=  ( version )  )  {     return false; }^51^^^^^48^56^[REMOVE] ^[METHOD] isValidSince [TYPE] boolean [PARAMETER] Since annotation [CLASS] VersionExclusionStrategy   [TYPE]  Since annotation  [TYPE]  double annotationVersion  version  [TYPE]  boolean false  true 
[REPLACE]^return false;^55^^^^^48^56^[REPLACE] return true;^[METHOD] isValidSince [TYPE] boolean [PARAMETER] Since annotation [CLASS] VersionExclusionStrategy   [TYPE]  Since annotation  [TYPE]  double annotationVersion  version  [TYPE]  boolean false  true 
[REPLACE]^if  ( annotation == false )  {^59^^^^^58^66^[REPLACE] if  ( annotation != null )  {^[METHOD] isValidUntil [TYPE] boolean [PARAMETER] Until annotation [CLASS] VersionExclusionStrategy   [TYPE]  double annotationVersion  version  [TYPE]  Until annotation  [TYPE]  boolean false  true 
[ADD]^double annotationVersion = annotation.value (  ) ;return false;^59^60^61^62^63^58^66^[ADD] if  ( annotation != null )  { double annotationVersion = annotation.value (  ) ; if  ( annotationVersion <= version )  { return false; }^[METHOD] isValidUntil [TYPE] boolean [PARAMETER] Until annotation [CLASS] VersionExclusionStrategy   [TYPE]  double annotationVersion  version  [TYPE]  Until annotation  [TYPE]  boolean false  true 
[REPLACE]^if  ( annotationVersion  >  version )  {^61^^^^^58^66^[REPLACE] if  ( annotationVersion <= version )  {^[METHOD] isValidUntil [TYPE] boolean [PARAMETER] Until annotation [CLASS] VersionExclusionStrategy   [TYPE]  double annotationVersion  version  [TYPE]  Until annotation  [TYPE]  boolean false  true 
[REPLACE]^return true;^62^^^^^58^66^[REPLACE] return false;^[METHOD] isValidUntil [TYPE] boolean [PARAMETER] Until annotation [CLASS] VersionExclusionStrategy   [TYPE]  double annotationVersion  version  [TYPE]  Until annotation  [TYPE]  boolean false  true 
[REPLACE]^if  ( annotationVersion  ==  version )  {^61^^^^^58^66^[REPLACE] if  ( annotationVersion <= version )  {^[METHOD] isValidUntil [TYPE] boolean [PARAMETER] Until annotation [CLASS] VersionExclusionStrategy   [TYPE]  double annotationVersion  version  [TYPE]  Until annotation  [TYPE]  boolean false  true 
[ADD]^^60^^^^^58^66^[ADD] double annotationVersion = annotation.value (  ) ;^[METHOD] isValidUntil [TYPE] boolean [PARAMETER] Until annotation [CLASS] VersionExclusionStrategy   [TYPE]  double annotationVersion  version  [TYPE]  Until annotation  [TYPE]  boolean false  true 
[REPLACE]^return false;^65^^^^^58^66^[REPLACE] return true;^[METHOD] isValidUntil [TYPE] boolean [PARAMETER] Until annotation [CLASS] VersionExclusionStrategy   [TYPE]  double annotationVersion  version  [TYPE]  Until annotation  [TYPE]  boolean false  true 
