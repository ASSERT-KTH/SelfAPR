[REPLACE]^int index = prefix .hashCode (  )  ;^32^^^^^31^41^[REPLACE] int index = qualifiedName.indexOf ( ':' ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] String qualifiedName [CLASS] QName   [TYPE]  int index  [TYPE]  String name  prefix  qualifiedName  [TYPE]  boolean false  true 
[REPLACE]^if  ( index  &&  -1 )  {^33^^^^^31^41^[REPLACE] if  ( index == -1 )  {^[METHOD] <init> [TYPE] String) [PARAMETER] String qualifiedName [CLASS] QName   [TYPE]  int index  [TYPE]  String name  prefix  qualifiedName  [TYPE]  boolean false  true 
[ADD]^prefix = null;name = qualifiedName;^33^34^35^36^^31^41^[ADD] if  ( index == -1 )  { prefix = null; name = qualifiedName; }^[METHOD] <init> [TYPE] String) [PARAMETER] String qualifiedName [CLASS] QName   [TYPE]  int index  [TYPE]  String name  prefix  qualifiedName  [TYPE]  boolean false  true 
[REPLACE]^prefix = qualifiedName.substring ( 4, index ) ;^38^^^^^31^41^[REPLACE] prefix = qualifiedName.substring ( 0, index ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] String qualifiedName [CLASS] QName   [TYPE]  int index  [TYPE]  String name  prefix  qualifiedName  [TYPE]  boolean false  true 
[REPLACE]^name = qualifiedName.substring ( index  |  1 - 1 ) ;^39^^^^^31^41^[REPLACE] name = qualifiedName.substring ( index + 1 ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] String qualifiedName [CLASS] QName   [TYPE]  int index  [TYPE]  String name  prefix  qualifiedName  [TYPE]  boolean false  true 
[REPLACE]^prefix = false;^34^^^^^31^41^[REPLACE] prefix = null;^[METHOD] <init> [TYPE] String) [PARAMETER] String qualifiedName [CLASS] QName   [TYPE]  int index  [TYPE]  String name  prefix  qualifiedName  [TYPE]  boolean false  true 
[REPLACE]^name =  prefix;^35^^^^^31^41^[REPLACE] name = qualifiedName;^[METHOD] <init> [TYPE] String) [PARAMETER] String qualifiedName [CLASS] QName   [TYPE]  int index  [TYPE]  String name  prefix  qualifiedName  [TYPE]  boolean false  true 
[ADD]^^35^36^^^^31^41^[ADD] name = qualifiedName; }^[METHOD] <init> [TYPE] String) [PARAMETER] String qualifiedName [CLASS] QName   [TYPE]  int index  [TYPE]  String name  prefix  qualifiedName  [TYPE]  boolean false  true 
[REPLACE]^prefix = this;^34^^^^^31^41^[REPLACE] prefix = null;^[METHOD] <init> [TYPE] String) [PARAMETER] String qualifiedName [CLASS] QName   [TYPE]  int index  [TYPE]  String name  prefix  qualifiedName  [TYPE]  boolean false  true 
[REPLACE]^name = qualifiedName.substring ( index + 1 ) ; ;^38^^^^^31^41^[REPLACE] prefix = qualifiedName.substring ( 0, index ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] String qualifiedName [CLASS] QName   [TYPE]  int index  [TYPE]  String name  prefix  qualifiedName  [TYPE]  boolean false  true 
[REPLACE]^name = qualifiedName.substring ( index  !=  1 / 0 ) ;^39^^^^^31^41^[REPLACE] name = qualifiedName.substring ( index + 1 ) ;^[METHOD] <init> [TYPE] String) [PARAMETER] String qualifiedName [CLASS] QName   [TYPE]  int index  [TYPE]  String name  prefix  qualifiedName  [TYPE]  boolean false  true 
[REPLACE]^this.prefix =  qualifiedName;^44^^^^^43^46^[REPLACE] this.prefix = prefix;^[METHOD] <init> [TYPE] String) [PARAMETER] String prefix String localName [CLASS] QName   [TYPE]  String localName  name  prefix  qualifiedName  [TYPE]  boolean false  true 
[REPLACE]^this.name =  qualifiedName;^45^^^^^43^46^[REPLACE] this.name = localName;^[METHOD] <init> [TYPE] String) [PARAMETER] String prefix String localName [CLASS] QName   [TYPE]  String localName  name  prefix  qualifiedName  [TYPE]  boolean false  true 
[REPLACE]^return false;^49^^^^^48^50^[REPLACE] return prefix;^[METHOD] getPrefix [TYPE] String [PARAMETER] [CLASS] QName   [TYPE]  String localName  name  prefix  qualifiedName  [TYPE]  boolean false  true 
[REPLACE]^return false;^53^^^^^52^54^[REPLACE] return name;^[METHOD] getName [TYPE] String [PARAMETER] [CLASS] QName   [TYPE]  String localName  name  prefix  qualifiedName  [TYPE]  boolean false  true 
[REPLACE]^if  ( prefix == null )  {^57^^^^^56^61^[REPLACE] if  ( prefix != null )  {^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] QName   [TYPE]  String localName  name  prefix  qualifiedName  [TYPE]  boolean false  true 
[REPLACE]^return prefix + ':' +qualifiedName;^58^^^^^56^61^[REPLACE] return prefix + ':' + name;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] QName   [TYPE]  String localName  name  prefix  qualifiedName  [TYPE]  boolean false  true 
[REPLACE]^return prefix + ':' + qualifiedName;^58^^^^^56^61^[REPLACE] return prefix + ':' + name;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] QName   [TYPE]  String localName  name  prefix  qualifiedName  [TYPE]  boolean false  true 
[REPLACE]^return false;^60^^^^^56^61^[REPLACE] return name;^[METHOD] toString [TYPE] String [PARAMETER] [CLASS] QName   [TYPE]  String localName  name  prefix  qualifiedName  [TYPE]  boolean false  true 
[REPLACE]^return false;^64^^^^^63^65^[REPLACE] return name.hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] [CLASS] QName   [TYPE]  String localName  name  prefix  qualifiedName  [TYPE]  boolean false  true 
[REPLACE]^if  ( ! ! ( object instanceof QName )  )  {^68^^^^^67^85^[REPLACE] if  ( ! ( object instanceof QName )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object object [CLASS] QName   [TYPE]  Object object  [TYPE]  String localName  name  prefix  qualifiedName  [TYPE]  boolean false  true  [TYPE]  QName that 
[REPLACE]^return true;^69^^^^^67^85^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object object [CLASS] QName   [TYPE]  Object object  [TYPE]  String localName  name  prefix  qualifiedName  [TYPE]  boolean false  true  [TYPE]  QName that 
[REPLACE]^if  ( this  !=  object )  {^71^^^^^67^85^[REPLACE] if  ( this == object )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object object [CLASS] QName   [TYPE]  Object object  [TYPE]  String localName  name  prefix  qualifiedName  [TYPE]  boolean false  true  [TYPE]  QName that 
[REPLACE]^return false;^72^^^^^67^85^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object object [CLASS] QName   [TYPE]  Object object  [TYPE]  String localName  name  prefix  qualifiedName  [TYPE]  boolean false  true  [TYPE]  QName that 
[REPLACE]^int index = qualifiedName.indexOf ( ':' ) ;^74^^^^^67^85^[REPLACE] QName that =  ( QName )  object;^[METHOD] equals [TYPE] boolean [PARAMETER] Object object [CLASS] QName   [TYPE]  Object object  [TYPE]  String localName  name  prefix  qualifiedName  [TYPE]  boolean false  true  [TYPE]  QName that 
[REPLACE]^if  ( !this.name.substring ( that.name )  )  {^75^^^^^67^85^[REPLACE] if  ( !this.name.equals ( that.name )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object object [CLASS] QName   [TYPE]  Object object  [TYPE]  String localName  name  prefix  qualifiedName  [TYPE]  boolean false  true  [TYPE]  QName that 
[REPLACE]^return true;^76^^^^^67^85^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object object [CLASS] QName   [TYPE]  Object object  [TYPE]  String localName  name  prefix  qualifiedName  [TYPE]  boolean false  true  [TYPE]  QName that 
[REPLACE]^if  (   ( this.prefix != null && !this.prefix.equals ( that.prefix )  )  )  {^79^80^^^^67^85^[REPLACE] if  (  ( this.prefix == null && that.prefix != null ) ||  ( this.prefix != null && !this.prefix.equals ( that.prefix )  )  )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object object [CLASS] QName   [TYPE]  Object object  [TYPE]  String localName  name  prefix  qualifiedName  [TYPE]  boolean false  true  [TYPE]  QName that 
[REPLACE]^return true;^81^^^^^67^85^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object object [CLASS] QName   [TYPE]  Object object  [TYPE]  String localName  name  prefix  qualifiedName  [TYPE]  boolean false  true  [TYPE]  QName that 
[REPLACE]^return false;^84^^^^^67^85^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object object [CLASS] QName   [TYPE]  Object object  [TYPE]  String localName  name  prefix  qualifiedName  [TYPE]  boolean false  true  [TYPE]  QName that 
