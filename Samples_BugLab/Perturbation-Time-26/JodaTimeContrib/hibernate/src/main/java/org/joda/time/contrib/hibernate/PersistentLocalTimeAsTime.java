[buglab_swap_variables]^if  ( y == x )  {^53^^^^^52^62^if  ( x == y )  {^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[buglab_swap_variables]^if  ( y == null || x == null )  {^56^^^^^52^62^if  ( x == null || y == null )  {^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[buglab_swap_variables]^return dty.equals ( dtx ) ;^61^^^^^52^62^return dtx.equals ( dty ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  x  y  boolean  LocalTime  dtx  dty  
[buglab_swap_variables]^return nullSafeGet ( strings, resultSet[0] ) ;^69^^^^^68^71^return nullSafeGet ( resultSet, strings[0] ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  object  String[]  strings  boolean  
[buglab_swap_variables]^return nullSafeGet (  strings[0] ) ;^69^^^^^68^71^return nullSafeGet ( resultSet, strings[0] ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  object  String[]  strings  boolean  
[buglab_swap_variables]^return nullSafeGet ( resultSet[0] ) ;^69^^^^^68^71^return nullSafeGet ( resultSet, strings[0] ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  object  String[]  strings  boolean  
[buglab_swap_variables]^Object timestamp = Hibernate.TIME.nullSafeGet ( string, resultSet ) ;^74^^^^^73^80^Object timestamp = Hibernate.TIME.nullSafeGet ( resultSet, string ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  
[buglab_swap_variables]^Object timestamp = Hibernate.TIME.nullSafeGet (  string ) ;^74^^^^^73^80^Object timestamp = Hibernate.TIME.nullSafeGet ( resultSet, string ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  
[buglab_swap_variables]^Object timestamp = Hibernate.TIME.nullSafeGet ( resultSet ) ;^74^^^^^73^80^Object timestamp = Hibernate.TIME.nullSafeGet ( resultSet, string ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  
[buglab_swap_variables]^return new LocalTime (  DateTimeZone.UTC ) ;^79^^^^^73^80^return new LocalTime ( timestamp, DateTimeZone.UTC ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  PersistentLocalTimeAsTime  INSTANCE  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  
[buglab_swap_variables]^Hibernate.TIME.nullSafeSet ( index, time, preparedStatement ) ;^88^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, time, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[buglab_swap_variables]^Hibernate.TIME.nullSafeSet (  time, index ) ;^88^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, time, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[buglab_swap_variables]^Hibernate.TIME.nullSafeSet ( preparedStatement, index, time ) ;^88^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, time, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[buglab_swap_variables]^Hibernate.TIME.nullSafeSet ( preparedStatement,  index ) ;^88^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, time, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[buglab_swap_variables]^Hibernate.TIME.nullSafeSet ( preparedStatement, time ) ;^88^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, time, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[buglab_swap_variables]^Hibernate.TIME.nullSafeSet ( index, null, preparedStatement ) ;^84^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, null, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[buglab_swap_variables]^Hibernate.TIME.nullSafeSet (  null, index ) ;^84^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, null, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
[buglab_swap_variables]^Hibernate.TIME.nullSafeSet ( preparedStatement, null ) ;^84^^^^^82^90^Hibernate.TIME.nullSafeSet ( preparedStatement, null, index ) ;^[CLASS] PersistentLocalTimeAsTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] PersistentLocalTimeAsTime  INSTANCE  boolean  LocalTime  lt  int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  Time  time  int  index  
