[REPLACE]^private static  int INITIAL_TOKEN_LENGTH = 50;^31^^^^^^^[REPLACE] private static final int INITIAL_TOKEN_LENGTH = 50;^ [CLASS] Token Type  
[REPLACE]^Token.Type type ;^48^^^^^^^[REPLACE] Token.Type type = INVALID;^ [CLASS] Token Type  
[REPLACE]^StringBuilder content  = null ;^51^^^^^^^[REPLACE] StringBuilder content = new StringBuilder ( INITIAL_TOKEN_LENGTH ) ;^ [CLASS] Token Type  
