[REPLACE]^private static final  short  serialVersionUID = -1;^14^^^^^^^[REPLACE] private static final long serialVersionUID = -1;^ [CLASS] PropertyMetadata  
[REPLACE]^public final static PropertyMetadata STD_REQUIRED  = null ;^16^^^^^^^[REPLACE] public final static PropertyMetadata STD_REQUIRED = new PropertyMetadata ( Boolean.TRUE, null, null, null ) ;^ [CLASS] PropertyMetadata  
[REPLACE]^public  static PropertyMetadata STD_OPTIONAL = new PropertyMetadata ( Boolean.FALSE, null, null, null ) ;^18^^^^^^^[REPLACE] public final static PropertyMetadata STD_OPTIONAL = new PropertyMetadata ( Boolean.FALSE, null, null, null ) ;^ [CLASS] PropertyMetadata  
[REPLACE]^public final static PropertyMetadata STD_REQUIRED_OR_OPTIONAL = new PropertyMetadata ( false, false, false, false ) ;^20^^^^^^^[REPLACE] public final static PropertyMetadata STD_REQUIRED_OR_OPTIONAL = new PropertyMetadata ( null, null, null, null ) ;^ [CLASS] PropertyMetadata  
[REPLACE]^protected  Boolean _required;^26^^^^^^^[REPLACE] protected final Boolean _required;^ [CLASS] PropertyMetadata  
[REPLACE]^protected final  char  _description;^31^^^^^^^[REPLACE] protected final String _description;^ [CLASS] PropertyMetadata  
[REPLACE]^protected  Integer _index;^38^^^^^^^[REPLACE] protected final Integer _index;^ [CLASS] PropertyMetadata  
[REPLACE]^protected final  char  _defaultValue;^45^^^^^^^[REPLACE] protected final String _defaultValue;^ [CLASS] PropertyMetadata  
