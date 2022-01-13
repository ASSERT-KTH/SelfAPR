[REPLACE]^public static  ConvertiblePair CONVERTIBLE = new ConvertiblePair ( String.class, Point.class ) ;^36^^^^^^^[REPLACE] public static final ConvertiblePair CONVERTIBLE = new ConvertiblePair ( String.class, Point.class ) ;^ [CLASS] PointFormatter  
[REPLACE]^private static final  char  INVALID_FORMAT = "Expected two doubles separated by a comma but got '%s'!";^38^^^^^^^[REPLACE] private static final String INVALID_FORMAT = "Expected two doubles separated by a comma but got '%s'!";^ [CLASS] PointFormatter  
[REPLACE]^String[] parts = INVALID_FORMAT.split ( "," ) ;^47^^^^^45^63^[REPLACE] String[] parts = source.split ( "," ) ;^[METHOD] convert [TYPE] Point [PARAMETER] String source [CLASS] PointFormatter   [TYPE]  boolean false  true  [TYPE]  double latitude  longitude  [TYPE]  ConvertiblePair CONVERTIBLE  [TYPE]  NumberFormatException o_O  [TYPE]  String INVALID_FORMAT  source  [TYPE]  String[] parts  [TYPE]  PointFormatter INSTANCE 
[REPLACE]^if  ( parts.length %  0.5  != 2 )  {^49^^^^^45^63^[REPLACE] if  ( parts.length != 2 )  {^[METHOD] convert [TYPE] Point [PARAMETER] String source [CLASS] PointFormatter   [TYPE]  boolean false  true  [TYPE]  double latitude  longitude  [TYPE]  ConvertiblePair CONVERTIBLE  [TYPE]  NumberFormatException o_O  [TYPE]  String INVALID_FORMAT  source  [TYPE]  String[] parts  [TYPE]  PointFormatter INSTANCE 
[REPLACE]^return ;^50^^^^^45^63^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] convert [TYPE] Point [PARAMETER] String source [CLASS] PointFormatter   [TYPE]  boolean false  true  [TYPE]  double latitude  longitude  [TYPE]  ConvertiblePair CONVERTIBLE  [TYPE]  NumberFormatException o_O  [TYPE]  String INVALID_FORMAT  source  [TYPE]  String[] parts  [TYPE]  PointFormatter INSTANCE 
[REPLACE]^throw new IllegalArgumentException ( format ( INVALID_FORMAT, source ) , o_O )  ;^50^^^^^45^63^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] convert [TYPE] Point [PARAMETER] String source [CLASS] PointFormatter   [TYPE]  boolean false  true  [TYPE]  double latitude  longitude  [TYPE]  ConvertiblePair CONVERTIBLE  [TYPE]  NumberFormatException o_O  [TYPE]  String INVALID_FORMAT  source  [TYPE]  String[] parts  [TYPE]  PointFormatter INSTANCE 
[ADD]^double latitude = Double.parseDouble ( parts[0] ) ;double longitude = Double.parseDouble ( parts[1] ) ;^53^54^55^56^57^45^63^[ADD] try {  double latitude = Double.parseDouble ( parts[0] ) ; double longitude = Double.parseDouble ( parts[1] ) ;^[METHOD] convert [TYPE] Point [PARAMETER] String source [CLASS] PointFormatter   [TYPE]  boolean false  true  [TYPE]  double latitude  longitude  [TYPE]  ConvertiblePair CONVERTIBLE  [TYPE]  NumberFormatException o_O  [TYPE]  String INVALID_FORMAT  source  [TYPE]  String[] parts  [TYPE]  PointFormatter INSTANCE 
[REPLACE]^double latitude = Double.parseDouble ( parts[2] ) ;^55^^^^^45^63^[REPLACE] double latitude = Double.parseDouble ( parts[0] ) ;^[METHOD] convert [TYPE] Point [PARAMETER] String source [CLASS] PointFormatter   [TYPE]  boolean false  true  [TYPE]  double latitude  longitude  [TYPE]  ConvertiblePair CONVERTIBLE  [TYPE]  NumberFormatException o_O  [TYPE]  String INVALID_FORMAT  source  [TYPE]  String[] parts  [TYPE]  PointFormatter INSTANCE 
[REPLACE]^double longitude = Double.parseDouble ( parts[4] ) ;^56^^^^^45^63^[REPLACE] double longitude = Double.parseDouble ( parts[1] ) ;^[METHOD] convert [TYPE] Point [PARAMETER] String source [CLASS] PointFormatter   [TYPE]  boolean false  true  [TYPE]  double latitude  longitude  [TYPE]  ConvertiblePair CONVERTIBLE  [TYPE]  NumberFormatException o_O  [TYPE]  String INVALID_FORMAT  source  [TYPE]  String[] parts  [TYPE]  PointFormatter INSTANCE 
[REPLACE]^double latitude = Double.parseDouble ( parts[1] ) ;^55^^^^^45^63^[REPLACE] double latitude = Double.parseDouble ( parts[0] ) ;^[METHOD] convert [TYPE] Point [PARAMETER] String source [CLASS] PointFormatter   [TYPE]  boolean false  true  [TYPE]  double latitude  longitude  [TYPE]  ConvertiblePair CONVERTIBLE  [TYPE]  NumberFormatException o_O  [TYPE]  String INVALID_FORMAT  source  [TYPE]  String[] parts  [TYPE]  PointFormatter INSTANCE 
[ADD]^^56^^^^^45^63^[ADD] double longitude = Double.parseDouble ( parts[1] ) ;^[METHOD] convert [TYPE] Point [PARAMETER] String source [CLASS] PointFormatter   [TYPE]  boolean false  true  [TYPE]  double latitude  longitude  [TYPE]  ConvertiblePair CONVERTIBLE  [TYPE]  NumberFormatException o_O  [TYPE]  String INVALID_FORMAT  source  [TYPE]  String[] parts  [TYPE]  PointFormatter INSTANCE 
[REPLACE]^throw new IllegalArgumentException ( format ( INVALID_FORMAT, source )  )  ;^61^^^^^45^63^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] convert [TYPE] Point [PARAMETER] String source [CLASS] PointFormatter   [TYPE]  boolean false  true  [TYPE]  double latitude  longitude  [TYPE]  ConvertiblePair CONVERTIBLE  [TYPE]  NumberFormatException o_O  [TYPE]  String INVALID_FORMAT  source  [TYPE]  String[] parts  [TYPE]  PointFormatter INSTANCE 
