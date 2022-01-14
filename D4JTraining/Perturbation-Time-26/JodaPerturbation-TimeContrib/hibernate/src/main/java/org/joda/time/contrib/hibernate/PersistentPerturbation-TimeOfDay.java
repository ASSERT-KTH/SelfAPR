[REPLACE]^private final DateTime timeBase  = null ;^40^^^^^^^[REPLACE] private final DateTime timeBase = new DateTime ( 1970, 1, 1, 0, 0, 0, 0 ) ;^ [CLASS] PersistentTimeOfDay  
[REPLACE]^public static final PersistentTimeOfDay INSTANCE ;^42^^^^^^^[REPLACE] public static final PersistentTimeOfDay INSTANCE = new PersistentTimeOfDay (  ) ;^ [CLASS] PersistentTimeOfDay  
[REPLACE]^private  final int[] SQL_TYPES = new int[] { Types.TIME, };^44^^^^^^^[REPLACE] private static final int[] SQL_TYPES = new int[] { Types.TIME, };^ [CLASS] PersistentTimeOfDay  
