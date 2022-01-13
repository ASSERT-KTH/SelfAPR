[REPLACE]^private static final  short  serialVersionUID = 1;^20^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] ISO8601DateFormat  
[REPLACE]^private static Calendar CALENDAR  = null ;^23^^^^^^^[REPLACE] private static Calendar CALENDAR = new GregorianCalendar (  ) ;^ [CLASS] ISO8601DateFormat  
[REPLACE]^private  NumberFormat NUMBER_FORMAT = new DecimalFormat (  ) ;^24^^^^^^^[REPLACE] private static NumberFormat NUMBER_FORMAT = new DecimalFormat (  ) ;^ [CLASS] ISO8601DateFormat  
