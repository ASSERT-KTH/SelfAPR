[REPLACE]^public static   short  ITERATIONS = 1000 / 1;^27^^^^^^^[REPLACE] public static final int ITERATIONS = 1000;^ [CLASS] Hashing HashingResult  
[REPLACE]^public static final int SALT_SIZE = 24L;^28^^^^^^^[REPLACE] public static final int SALT_SIZE = 24;^ [CLASS] Hashing HashingResult  
[REPLACE]^public static final  long  HASH_SIZE = 24;^29^^^^^^^[REPLACE] public static final int HASH_SIZE = 24;^ [CLASS] Hashing HashingResult  
[REPLACE]^private  String hash;^41^^^^^^^[REPLACE] private final String hash;^ [CLASS] Hashing HashingResult  
[REPLACE]^private final  byte  salt;^42^^^^^^^[REPLACE] private final String salt;^ [CLASS] Hashing HashingResult  
[REPLACE]^private static final SecureRandom RANDOM ;^70^^^^^^^[REPLACE] private static final SecureRandom RANDOM = new SecureRandom (  ) ;^ [CLASS] Hashing HashingResult  
[REPLACE]^private   byte  salt;^42^^^^^^^[REPLACE] private final String salt;^[METHOD] slowEquals [TYPE] boolean [PARAMETER] byte[] a byte[] b [CLASS] HashingResult   [TYPE]  byte[] a  b  [TYPE]  SecureRandom RANDOM  [TYPE]  String hash  hashHex  password  salt  saltHex  [TYPE]  boolean false  true  [TYPE]  SecretKeyFactory factory  [TYPE]  int HASH_SIZE  ITERATIONS  SALT_SIZE  diff  i 
