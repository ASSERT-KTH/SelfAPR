[REPLACE]^private static final PersistentLocalDate INSTANCE = new PersistentLocalDate (  ) ;^36^^^^^^^[REPLACE] public static final PersistentLocalDate INSTANCE = new PersistentLocalDate (  ) ;^ [CLASS] PersistentLocalDate  
[REPLACE]^private static final int[] SQL_TYPES  = null ;^38^^^^^^^[REPLACE] private static final int[] SQL_TYPES = new int[] { Types.DATE, };^ [CLASS] PersistentLocalDate  
[REPLACE]^return new LocalDate ( string ) ;^41^^^^^40^42^[REPLACE] return SQL_TYPES;^[METHOD] sqlTypes [TYPE] int[] [PARAMETER] [CLASS] PersistentLocalDate   [TYPE]  PersistentLocalDate INSTANCE  [TYPE]  int[] SQL_TYPES  [TYPE]  boolean false  true 
[REPLACE]^return SQL_TYPES;^45^^^^^44^46^[REPLACE] return LocalDate.class;^[METHOD] returnedClass [TYPE] Class [PARAMETER] [CLASS] PersistentLocalDate   [TYPE]  PersistentLocalDate INSTANCE  [TYPE]  int[] SQL_TYPES  [TYPE]  boolean false  true 
[REPLACE]^if  ( x  &&  y )  {^49^^^^^48^58^[REPLACE] if  ( x == y )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object x Object y [CLASS] PersistentLocalDate   [TYPE]  int[] SQL_TYPES  [TYPE]  Object x  y  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE  [TYPE]  LocalDate dtx  dty 
[REPLACE]^return false;^50^^^^^48^58^[REPLACE] return true;^[METHOD] equals [TYPE] boolean [PARAMETER] Object x Object y [CLASS] PersistentLocalDate   [TYPE]  int[] SQL_TYPES  [TYPE]  Object x  y  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE  [TYPE]  LocalDate dtx  dty 
[REPLACE]^if  ( x != null || y == null )  {^52^^^^^48^58^[REPLACE] if  ( x == null || y == null )  {^[METHOD] equals [TYPE] boolean [PARAMETER] Object x Object y [CLASS] PersistentLocalDate   [TYPE]  int[] SQL_TYPES  [TYPE]  Object x  y  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE  [TYPE]  LocalDate dtx  dty 
[REPLACE]^return true;^53^^^^^48^58^[REPLACE] return false;^[METHOD] equals [TYPE] boolean [PARAMETER] Object x Object y [CLASS] PersistentLocalDate   [TYPE]  int[] SQL_TYPES  [TYPE]  Object x  y  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE  [TYPE]  LocalDate dtx  dty 
[REPLACE]^LocalDate dty =  ( LocalDate )  y;^55^^^^^48^58^[REPLACE] LocalDate dtx =  ( LocalDate )  x;^[METHOD] equals [TYPE] boolean [PARAMETER] Object x Object y [CLASS] PersistentLocalDate   [TYPE]  int[] SQL_TYPES  [TYPE]  Object x  y  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE  [TYPE]  LocalDate dtx  dty 
[REPLACE]^LocalDate dtx =  ( LocalDate )  x;^56^^^^^48^58^[REPLACE] LocalDate dty =  ( LocalDate )  y;^[METHOD] equals [TYPE] boolean [PARAMETER] Object x Object y [CLASS] PersistentLocalDate   [TYPE]  int[] SQL_TYPES  [TYPE]  Object x  y  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE  [TYPE]  LocalDate dtx  dty 
[REPLACE]^return dtx.LocalDate ( dty ) ;^57^^^^^48^58^[REPLACE] return dtx.equals ( dty ) ;^[METHOD] equals [TYPE] boolean [PARAMETER] Object x Object y [CLASS] PersistentLocalDate   [TYPE]  int[] SQL_TYPES  [TYPE]  Object x  y  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE  [TYPE]  LocalDate dtx  dty 
[REPLACE]^return object.toString (  ) ;^61^^^^^60^62^[REPLACE] return object.hashCode (  ) ;^[METHOD] hashCode [TYPE] int [PARAMETER] Object object [CLASS] PersistentLocalDate   [TYPE]  int[] SQL_TYPES  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE 
[REPLACE]^return nullSafeGet ( resultSet, strings[0 - 3] ) ;^65^^^^^64^67^[REPLACE] return nullSafeGet ( resultSet, strings[0] ) ;^[METHOD] nullSafeGet [TYPE] Object [PARAMETER] ResultSet resultSet String[] strings Object object [CLASS] PersistentLocalDate   [TYPE]  ResultSet resultSet  [TYPE]  int[] SQL_TYPES  [TYPE]  Object object  [TYPE]  String[] strings  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE 
[REPLACE]^Object timestamp = Hibernate.DATE.nullSafeSet ( resultSet, string ) ;^70^^^^^69^75^[REPLACE] Object timestamp = Hibernate.DATE.nullSafeGet ( resultSet, string ) ;^[METHOD] nullSafeGet [TYPE] Object [PARAMETER] ResultSet resultSet String string [CLASS] PersistentLocalDate   [TYPE]  ResultSet resultSet  [TYPE]  int[] SQL_TYPES  [TYPE]  Object timestamp  [TYPE]  String string  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE 
[REPLACE]^if  ( timestamp != this )  {^71^^^^^69^75^[REPLACE] if  ( timestamp == null )  {^[METHOD] nullSafeGet [TYPE] Object [PARAMETER] ResultSet resultSet String string [CLASS] PersistentLocalDate   [TYPE]  ResultSet resultSet  [TYPE]  int[] SQL_TYPES  [TYPE]  Object timestamp  [TYPE]  String string  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE 
[REPLACE]^return false;^72^^^^^69^75^[REPLACE] return null;^[METHOD] nullSafeGet [TYPE] Object [PARAMETER] ResultSet resultSet String string [CLASS] PersistentLocalDate   [TYPE]  ResultSet resultSet  [TYPE]  int[] SQL_TYPES  [TYPE]  Object timestamp  [TYPE]  String string  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE 
[REPLACE]^return  new LocalDate ( string )  ;^74^^^^^69^75^[REPLACE] return new LocalDate ( timestamp ) ;^[METHOD] nullSafeGet [TYPE] Object [PARAMETER] ResultSet resultSet String string [CLASS] PersistentLocalDate   [TYPE]  ResultSet resultSet  [TYPE]  int[] SQL_TYPES  [TYPE]  Object timestamp  [TYPE]  String string  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE 
[REPLACE]^if  ( value != true )  {^78^^^^^77^83^[REPLACE] if  ( value == null )  {^[METHOD] nullSafeSet [TYPE] void [PARAMETER] PreparedStatement preparedStatement Object value int index [CLASS] PersistentLocalDate   [TYPE]  int[] SQL_TYPES  [TYPE]  PreparedStatement preparedStatement  [TYPE]  Object value  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE  [TYPE]  int index 
[REPLACE]^Hibernate.DATE.nullSafeSet ( preparedStatement,  (  ( LocalDate )  value ) .toDate (  ) .toDate (  ) , index ) ;^81^^^^^77^83^[REPLACE] Hibernate.DATE.nullSafeSet ( preparedStatement,  (  ( LocalDate )  value ) .toDateTimeAtStartOfDay (  ) .toDate (  ) , index ) ;^[METHOD] nullSafeSet [TYPE] void [PARAMETER] PreparedStatement preparedStatement Object value int index [CLASS] PersistentLocalDate   [TYPE]  int[] SQL_TYPES  [TYPE]  PreparedStatement preparedStatement  [TYPE]  Object value  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE  [TYPE]  int index 
[REMOVE]^Hibernate.DATE.nullSafeSet ( preparedStatement, null, index ) ;^81^^^^^77^83^[REMOVE] ^[METHOD] nullSafeSet [TYPE] void [PARAMETER] PreparedStatement preparedStatement Object value int index [CLASS] PersistentLocalDate   [TYPE]  int[] SQL_TYPES  [TYPE]  PreparedStatement preparedStatement  [TYPE]  Object value  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE  [TYPE]  int index 
[ADD]^^81^^^^^77^83^[ADD] Hibernate.DATE.nullSafeSet ( preparedStatement,  (  ( LocalDate )  value ) .toDateTimeAtStartOfDay (  ) .toDate (  ) , index ) ;^[METHOD] nullSafeSet [TYPE] void [PARAMETER] PreparedStatement preparedStatement Object value int index [CLASS] PersistentLocalDate   [TYPE]  int[] SQL_TYPES  [TYPE]  PreparedStatement preparedStatement  [TYPE]  Object value  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE  [TYPE]  int index 
[REPLACE]^Hibernate.DATE.falseSafeSet ( preparedStatement, false, index ) ;^79^^^^^77^83^[REPLACE] Hibernate.DATE.nullSafeSet ( preparedStatement, null, index ) ;^[METHOD] nullSafeSet [TYPE] void [PARAMETER] PreparedStatement preparedStatement Object value int index [CLASS] PersistentLocalDate   [TYPE]  int[] SQL_TYPES  [TYPE]  PreparedStatement preparedStatement  [TYPE]  Object value  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE  [TYPE]  int index 
[REPLACE]^return false;^86^^^^^85^87^[REPLACE] return value;^[METHOD] deepCopy [TYPE] Object [PARAMETER] Object value [CLASS] PersistentLocalDate   [TYPE]  int[] SQL_TYPES  [TYPE]  Object value  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE 
[REPLACE]^return true;^90^^^^^89^91^[REPLACE] return false;^[METHOD] isMutable [TYPE] boolean [PARAMETER] [CLASS] PersistentLocalDate   [TYPE]  PersistentLocalDate INSTANCE  [TYPE]  int[] SQL_TYPES  [TYPE]  boolean false  true 
[REPLACE]^return SQL_TYPES;^94^^^^^93^95^[REPLACE] return  ( Serializable )  value;^[METHOD] disassemble [TYPE] Serializable [PARAMETER] Object value [CLASS] PersistentLocalDate   [TYPE]  int[] SQL_TYPES  [TYPE]  Object value  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE 
[REPLACE]^return SQL_TYPES;^98^^^^^97^99^[REPLACE] return cached;^[METHOD] assemble [TYPE] Object [PARAMETER] Serializable cached Object value [CLASS] PersistentLocalDate   [TYPE]  int[] SQL_TYPES  [TYPE]  Serializable cached  [TYPE]  Object value  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE 
[REPLACE]^return target;^102^^^^^101^103^[REPLACE] return original;^[METHOD] replace [TYPE] Object [PARAMETER] Object original Object target Object owner [CLASS] PersistentLocalDate   [TYPE]  int[] SQL_TYPES  [TYPE]  Object original  owner  target  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE 
[REPLACE]^return ;^106^^^^^105^107^[REPLACE] throw new UnsupportedOperationException  (" ")  ;^[METHOD] objectToSQLString [TYPE] String [PARAMETER] Object object [CLASS] PersistentLocalDate   [TYPE]  int[] SQL_TYPES  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE 
[REPLACE]^return object.hashCode (  ) ;^110^^^^^109^111^[REPLACE] return object.toString (  ) ;^[METHOD] toXMLString [TYPE] String [PARAMETER] Object object [CLASS] PersistentLocalDate   [TYPE]  int[] SQL_TYPES  [TYPE]  Object object  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE 
[REPLACE]^return  new LocalDate ( timestamp )  ;^114^^^^^113^115^[REPLACE] return new LocalDate ( string ) ;^[METHOD] fromXMLString [TYPE] Object [PARAMETER] String string [CLASS] PersistentLocalDate   [TYPE]  int[] SQL_TYPES  [TYPE]  String string  [TYPE]  boolean false  true  [TYPE]  PersistentLocalDate INSTANCE 
