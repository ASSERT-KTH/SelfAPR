[REPLACE]^public  final PersistentLocalTimeAsString INSTANCE = new PersistentLocalTimeAsString (  ) ;^36^^^^^^^[REPLACE] public static final PersistentLocalTimeAsString INSTANCE = new PersistentLocalTimeAsString (  ) ;^ [CLASS] PersistentLocalTimeAsString  
[REPLACE]^private static  int[] SQL_TYPES = new int[] { Types.VARCHAR, };^38^^^^^^^[REPLACE] private static final int[] SQL_TYPES = new int[] { Types.VARCHAR, };^ [CLASS] PersistentLocalTimeAsString  
[REPLACE]^return LocalTime.class;^41^^^^^40^42^[REPLACE] return SQL_TYPES;^[METHOD] sqlTypes [TYPE] int[] [PARAMETER] [CLASS] PersistentLocalTimeAsString   [TYPE]  int[] SQL_TYPES  [TYPE]  PersistentLocalTimeAsString INSTANCE  [TYPE]  boolean false  true 
[REPLACE]^return SQL_TYPES;^45^^^^^44^46^[REPLACE] return LocalTime.class;^[METHOD] returnedClass [TYPE] Class [PARAMETER] [CLASS] PersistentLocalTimeAsString   [TYPE]  int[] SQL_TYPES  [TYPE]  PersistentLocalTimeAsString INSTANCE  [TYPE]  boolean false  true 
[REPLACE]^if  ( x  ||  y )  {^49^^^^^48^58^[REPLACE] if  ( x == y )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object x Object y [CLASS] PersistentLocalTimeAsString   [TYPE]  int[] SQL_TYPES  [TYPE]  Object x  y  [TYPE]  boolean false  true  [TYPE]  LocalTime dtx  dty  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[REPLACE]^return false;^50^^^^^48^58^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object x Object y [CLASS] PersistentLocalTimeAsString   [TYPE]  int[] SQL_TYPES  [TYPE]  Object x  y  [TYPE]  boolean false  true  [TYPE]  LocalTime dtx  dty  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[REPLACE]^if  (  y == true )  {^52^^^^^48^58^[REPLACE] if  ( x == null || y == null )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object x Object y [CLASS] PersistentLocalTimeAsString   [TYPE]  int[] SQL_TYPES  [TYPE]  Object x  y  [TYPE]  boolean false  true  [TYPE]  LocalTime dtx  dty  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[REPLACE]^return true;^53^^^^^48^58^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object x Object y [CLASS] PersistentLocalTimeAsString   [TYPE]  int[] SQL_TYPES  [TYPE]  Object x  y  [TYPE]  boolean false  true  [TYPE]  LocalTime dtx  dty  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[REPLACE]^LocalTime dty =  ( LocalTime )  y;^55^^^^^48^58^[REPLACE] LocalTime dtx =  ( LocalTime )  x;^[METHOD] equals [TYPE] boolean [PARAMETER] Object x Object y [CLASS] PersistentLocalTimeAsString   [TYPE]  int[] SQL_TYPES  [TYPE]  Object x  y  [TYPE]  boolean false  true  [TYPE]  LocalTime dtx  dty  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[REPLACE]^LocalTime dtx =  ( LocalTime )  x;^56^^^^^48^58^[REPLACE] LocalTime dty =  ( LocalTime )  y;^[METHOD] equals [TYPE] boolean [PARAMETER] Object x Object y [CLASS] PersistentLocalTimeAsString   [TYPE]  int[] SQL_TYPES  [TYPE]  Object x  y  [TYPE]  boolean false  true  [TYPE]  LocalTime dtx  dty  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[REPLACE]^return dtx.LocalTime ( dty ) ;^57^^^^^48^58^[REPLACE] return dtx.equals ( dty ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object x Object y [CLASS] PersistentLocalTimeAsString   [TYPE]  int[] SQL_TYPES  [TYPE]  Object x  y  [TYPE]  boolean false  true  [TYPE]  LocalTime dtx  dty  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[REPLACE]^return object .hashCode ( object )  ;^61^^^^^60^62^[REPLACE] return object.hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] Object object [CLASS] PersistentLocalTimeAsString   [TYPE]  int[] SQL_TYPES  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[REPLACE]^return nullSafeGet ( resultSet, strings[0 * 2] ) ;^65^^^^^64^67^[REPLACE] return nullSafeGet ( resultSet, strings[0] ) ;^[METHOD] nullSafeGet [TYPE] Object [PARAMETER] ResultSet resultSet String[] strings Object object [CLASS] PersistentLocalTimeAsString   [TYPE]  ResultSet resultSet  [TYPE]  int[] SQL_TYPES  [TYPE]  Object object  [TYPE]  String[] strings  [TYPE]  boolean false  true  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[REPLACE]^Object timestamp = Hibernate.STRING.nullSafeSet ( resultSet, string ) ;^70^^^^^69^76^[REPLACE] Object timestamp = Hibernate.STRING.nullSafeGet ( resultSet, string ) ;^[METHOD] nullSafeGet [TYPE] Object [PARAMETER] ResultSet resultSet String string [CLASS] PersistentLocalTimeAsString   [TYPE]  ResultSet resultSet  [TYPE]  int[] SQL_TYPES  [TYPE]  Object timestamp  [TYPE]  String string  [TYPE]  boolean false  true  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[ADD]^^70^^^^^69^76^[ADD] Object timestamp = Hibernate.STRING.nullSafeGet ( resultSet, string ) ;^[METHOD] nullSafeGet [TYPE] Object [PARAMETER] ResultSet resultSet String string [CLASS] PersistentLocalTimeAsString   [TYPE]  ResultSet resultSet  [TYPE]  int[] SQL_TYPES  [TYPE]  Object timestamp  [TYPE]  String string  [TYPE]  boolean false  true  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[REPLACE]^if  ( timestamp != this )  {^71^^^^^69^76^[REPLACE] if  ( timestamp == null )  {^[METHOD] nullSafeGet [TYPE] Object [PARAMETER] ResultSet resultSet String string [CLASS] PersistentLocalTimeAsString   [TYPE]  ResultSet resultSet  [TYPE]  int[] SQL_TYPES  [TYPE]  Object timestamp  [TYPE]  String string  [TYPE]  boolean false  true  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[REPLACE]^return true;^72^^^^^69^76^[REPLACE] return null;^[METHOD] nullSafeGet [TYPE] Object [PARAMETER] ResultSet resultSet String string [CLASS] PersistentLocalTimeAsString   [TYPE]  ResultSet resultSet  [TYPE]  int[] SQL_TYPES  [TYPE]  Object timestamp  [TYPE]  String string  [TYPE]  boolean false  true  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[REPLACE]^return false;^72^^^^^69^76^[REPLACE] return null;^[METHOD] nullSafeGet [TYPE] Object [PARAMETER] ResultSet resultSet String string [CLASS] PersistentLocalTimeAsString   [TYPE]  ResultSet resultSet  [TYPE]  int[] SQL_TYPES  [TYPE]  Object timestamp  [TYPE]  String string  [TYPE]  boolean false  true  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[REPLACE]^return  new LocalTime ( string )   ) ;^75^^^^^69^76^[REPLACE] return new LocalTime ( timestamp.toString (  )  ) ;^[METHOD] nullSafeGet [TYPE] Object [PARAMETER] ResultSet resultSet String string [CLASS] PersistentLocalTimeAsString   [TYPE]  ResultSet resultSet  [TYPE]  int[] SQL_TYPES  [TYPE]  Object timestamp  [TYPE]  String string  [TYPE]  boolean false  true  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[REPLACE]^if  ( value != null )  {^79^^^^^78^85^[REPLACE] if  ( value == null )  {^[METHOD] nullSafeSet [TYPE] void [PARAMETER] PreparedStatement preparedStatement Object value int index [CLASS] PersistentLocalTimeAsString   [TYPE]  boolean false  true  [TYPE]  LocalTime lt  [TYPE]  PersistentLocalTimeAsString INSTANCE  [TYPE]  int[] SQL_TYPES  [TYPE]  PreparedStatement preparedStatement  [TYPE]  Object value  [TYPE]  int index 
[REPLACE]^LocalTime dtx =  ( LocalTime )  x;^82^^^^^78^85^[REPLACE] LocalTime lt =  (  ( LocalTime )  value ) ;^[METHOD] nullSafeSet [TYPE] void [PARAMETER] PreparedStatement preparedStatement Object value int index [CLASS] PersistentLocalTimeAsString   [TYPE]  boolean false  true  [TYPE]  LocalTime lt  [TYPE]  PersistentLocalTimeAsString INSTANCE  [TYPE]  int[] SQL_TYPES  [TYPE]  PreparedStatement preparedStatement  [TYPE]  Object value  [TYPE]  int index 
[REPLACE]^Hibernate.STRING.falseSafeSet ( preparedStatement, false, index ) ;^80^^^^^78^85^[REPLACE] Hibernate.STRING.nullSafeSet ( preparedStatement, null, index ) ;^[METHOD] nullSafeSet [TYPE] void [PARAMETER] PreparedStatement preparedStatement Object value int index [CLASS] PersistentLocalTimeAsString   [TYPE]  boolean false  true  [TYPE]  LocalTime lt  [TYPE]  PersistentLocalTimeAsString INSTANCE  [TYPE]  int[] SQL_TYPES  [TYPE]  PreparedStatement preparedStatement  [TYPE]  Object value  [TYPE]  int index 
[REPLACE]^return false;^88^^^^^87^89^[REPLACE] return value;^[METHOD] deepCopy [TYPE] Object [PARAMETER] Object value [CLASS] PersistentLocalTimeAsString   [TYPE]  int[] SQL_TYPES  [TYPE]  Object value  [TYPE]  boolean false  true  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[REPLACE]^return true;^92^^^^^91^93^[REPLACE] return false;^[METHOD] isMutable [TYPE] boolean [PARAMETER] [CLASS] PersistentLocalTimeAsString   [TYPE]  int[] SQL_TYPES  [TYPE]  PersistentLocalTimeAsString INSTANCE  [TYPE]  boolean false  true 
[REPLACE]^return LocalTime.class;^96^^^^^95^97^[REPLACE] return  ( Serializable )  value;^[METHOD] disassemble [TYPE] Serializable [PARAMETER] Object value [CLASS] PersistentLocalTimeAsString   [TYPE]  int[] SQL_TYPES  [TYPE]  Object value  [TYPE]  boolean false  true  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[REPLACE]^return LocalTime.class;^100^^^^^99^101^[REPLACE] return cached;^[METHOD] assemble [TYPE] Object [PARAMETER] Serializable cached Object value [CLASS] PersistentLocalTimeAsString   [TYPE]  int[] SQL_TYPES  [TYPE]  Serializable cached  [TYPE]  Object value  [TYPE]  boolean false  true  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[REPLACE]^return target;^104^^^^^103^105^[REPLACE] return original;^[METHOD] replace [TYPE] Object [PARAMETER] Object original Object target Object owner [CLASS] PersistentLocalTimeAsString   [TYPE]  int[] SQL_TYPES  [TYPE]  Object original  owner  target  [TYPE]  boolean false  true  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[REPLACE]^return ;^108^^^^^107^109^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] objectToSQLString [TYPE] String [PARAMETER] Object object [CLASS] PersistentLocalTimeAsString   [TYPE]  int[] SQL_TYPES  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[REPLACE]^return object .Object (  )  ;^112^^^^^111^113^[REPLACE] return object.toString (  ) ;^[METHOD] toXMLString [TYPE] String [PARAMETER] Object object [CLASS] PersistentLocalTimeAsString   [TYPE]  int[] SQL_TYPES  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  PersistentLocalTimeAsString INSTANCE 
[REPLACE]^return  new LocalTime ( timestamp.toString (  )  )  ;^116^^^^^115^117^[REPLACE] return new LocalTime ( string ) ;^[METHOD] fromXMLString [TYPE] Object [PARAMETER] String string [CLASS] PersistentLocalTimeAsString   [TYPE]  int[] SQL_TYPES  [TYPE]  String string  [TYPE]  boolean false  true  [TYPE]  PersistentLocalTimeAsString INSTANCE 
