[REPLACE]^protected final static int[] sOutputEscapes  = null ;^31^^^^^^^[REPLACE] protected final static int[] sOutputEscapes = CharTypes.get7BitOutputEscapes (  ) ;^ [CLASS] JsonGeneratorImpl  
[REPLACE]^protected IOContext _ioContext;^39^^^^^^^[REPLACE] final protected IOContext _ioContext;^ [CLASS] JsonGeneratorImpl  
[REPLACE]^private int[] _outputEscapes = sOutputEscapes;^53^^^^^^^[REPLACE] protected int[] _outputEscapes = sOutputEscapes;^ [CLASS] JsonGeneratorImpl  
[REPLACE]^protected  long  _maximumNonEscapedChar;^64^^^^^^^[REPLACE] protected int _maximumNonEscapedChar;^ [CLASS] JsonGeneratorImpl  
[REPLACE]^private SerializableString _rootValueSeparator = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;^84^85^^^^84^85^[REPLACE] protected SerializableString _rootValueSeparator = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;^ [CLASS] JsonGeneratorImpl  
