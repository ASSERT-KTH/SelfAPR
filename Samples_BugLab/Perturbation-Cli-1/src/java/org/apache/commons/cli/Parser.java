[buglab_swap_variables]^return parse ( arguments, options, null, false ) ;^70^^^^^67^71^return parse ( options, arguments, null, false ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments [VARIABLES] Options  options  opts  CommandLine  cmd  List  requiredOptions  String[]  arguments  boolean  
[buglab_swap_variables]^return parse (  arguments, null, false ) ;^70^^^^^67^71^return parse ( options, arguments, null, false ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments [VARIABLES] Options  options  opts  CommandLine  cmd  List  requiredOptions  String[]  arguments  boolean  
[buglab_swap_variables]^return parse ( options,  null, false ) ;^70^^^^^67^71^return parse ( options, arguments, null, false ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments [VARIABLES] Options  options  opts  CommandLine  cmd  List  requiredOptions  String[]  arguments  boolean  
[buglab_swap_variables]^return parse ( properties, arguments, options, false ) ;^89^^^^^85^90^return parse ( options, arguments, properties, false ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties [VARIABLES] Options  options  opts  CommandLine  cmd  List  requiredOptions  String[]  arguments  boolean  Properties  properties  
[buglab_swap_variables]^return parse (  arguments, properties, false ) ;^89^^^^^85^90^return parse ( options, arguments, properties, false ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties [VARIABLES] Options  options  opts  CommandLine  cmd  List  requiredOptions  String[]  arguments  boolean  Properties  properties  
[buglab_swap_variables]^return parse ( arguments, options, properties, false ) ;^89^^^^^85^90^return parse ( options, arguments, properties, false ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties [VARIABLES] Options  options  opts  CommandLine  cmd  List  requiredOptions  String[]  arguments  boolean  Properties  properties  
[buglab_swap_variables]^return parse ( options,  properties, false ) ;^89^^^^^85^90^return parse ( options, arguments, properties, false ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties [VARIABLES] Options  options  opts  CommandLine  cmd  List  requiredOptions  String[]  arguments  boolean  Properties  properties  
[buglab_swap_variables]^return parse ( options, properties, arguments, false ) ;^89^^^^^85^90^return parse ( options, arguments, properties, false ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties [VARIABLES] Options  options  opts  CommandLine  cmd  List  requiredOptions  String[]  arguments  boolean  Properties  properties  
[buglab_swap_variables]^return parse ( options, arguments,  false ) ;^89^^^^^85^90^return parse ( options, arguments, properties, false ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties [VARIABLES] Options  options  opts  CommandLine  cmd  List  requiredOptions  String[]  arguments  boolean  Properties  properties  
[buglab_swap_variables]^return parse ( arguments, options, null, stopAtNonOption ) ;^111^^^^^107^112^return parse ( options, arguments, null, stopAtNonOption ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  List  requiredOptions  String[]  arguments  boolean  stopAtNonOption  
[buglab_swap_variables]^return parse (  arguments, null, stopAtNonOption ) ;^111^^^^^107^112^return parse ( options, arguments, null, stopAtNonOption ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  List  requiredOptions  String[]  arguments  boolean  stopAtNonOption  
[buglab_swap_variables]^return parse ( options,  null, stopAtNonOption ) ;^111^^^^^107^112^return parse ( options, arguments, null, stopAtNonOption ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  List  requiredOptions  String[]  arguments  boolean  stopAtNonOption  
[buglab_swap_variables]^return parse ( options, stopAtNonOption, null, arguments ) ;^111^^^^^107^112^return parse ( options, arguments, null, stopAtNonOption ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  List  requiredOptions  String[]  arguments  boolean  stopAtNonOption  
[buglab_swap_variables]^return parse ( options, arguments, null ) ;^111^^^^^107^112^return parse ( options, arguments, null, stopAtNonOption ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  List  requiredOptions  String[]  arguments  boolean  stopAtNonOption  
[buglab_swap_variables]^return parse ( stopAtNonOption, arguments, null, options ) ;^111^^^^^107^112^return parse ( options, arguments, null, stopAtNonOption ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  List  requiredOptions  String[]  arguments  boolean  stopAtNonOption  
[buglab_swap_variables]^List tokenList = Arrays.asList ( flatten ( this.options, stopAtNonOption, arguments )  ) ;^145^146^147^^^130^160^List tokenList = Arrays.asList ( flatten ( this.options, arguments, stopAtNonOption )  ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  eatTheRest  stopAtNonOption  List  requiredOptions  tokenList  String[]  arguments  String  str  t  Properties  properties  ListIterator  iterator  
[buglab_swap_variables]^List tokenList = Arrays.asList ( flatten ( this.options,  stopAtNonOption )  ) ;^145^146^147^^^130^160^List tokenList = Arrays.asList ( flatten ( this.options, arguments, stopAtNonOption )  ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  eatTheRest  stopAtNonOption  List  requiredOptions  tokenList  String[]  arguments  String  str  t  Properties  properties  ListIterator  iterator  
[buglab_swap_variables]^List tokenList = Arrays.asList ( flatten ( this.options, arguments )  ) ;^145^146^147^^^130^160^List tokenList = Arrays.asList ( flatten ( this.options, arguments, stopAtNonOption )  ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  eatTheRest  stopAtNonOption  List  requiredOptions  tokenList  String[]  arguments  String  str  t  Properties  properties  ListIterator  iterator  
[buglab_swap_variables]^List tokenList = Arrays.asList ( flatten ( stopAtNonOption, arguments, this.options )  ) ;^145^146^147^^^130^160^List tokenList = Arrays.asList ( flatten ( this.options, arguments, stopAtNonOption )  ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  eatTheRest  stopAtNonOption  List  requiredOptions  tokenList  String[]  arguments  String  str  t  Properties  properties  ListIterator  iterator  
[buglab_swap_variables]^List tokenList = Arrays.asList ( flatten (  arguments, stopAtNonOption )  ) ;^145^146^147^^^130^160^List tokenList = Arrays.asList ( flatten ( this.options, arguments, stopAtNonOption )  ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  eatTheRest  stopAtNonOption  List  requiredOptions  tokenList  String[]  arguments  String  str  t  Properties  properties  ListIterator  iterator  
[buglab_swap_variables]^List tokenList = Arrays.asList ( flatten ( arguments, this.options, stopAtNonOption )  ) ;^145^146^147^^^130^160^List tokenList = Arrays.asList ( flatten ( this.options, arguments, stopAtNonOption )  ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  eatTheRest  stopAtNonOption  List  requiredOptions  tokenList  String[]  arguments  String  str  t  Properties  properties  ListIterator  iterator  
[buglab_swap_variables]^processOption ( iterator, t ) ;^185^^^^^176^198^processOption ( t, iterator ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  eatTheRest  stopAtNonOption  List  requiredOptions  tokenList  String[]  arguments  String  str  t  Properties  properties  ListIterator  iterator  
[buglab_swap_variables]^processOption (  iterator ) ;^185^^^^^176^198^processOption ( t, iterator ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  eatTheRest  stopAtNonOption  List  requiredOptions  tokenList  String[]  arguments  String  str  t  Properties  properties  ListIterator  iterator  
[buglab_swap_variables]^processOption ( t ) ;^185^^^^^176^198^processOption ( t, iterator ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  eatTheRest  stopAtNonOption  List  requiredOptions  tokenList  String[]  arguments  String  str  t  Properties  properties  ListIterator  iterator  
[buglab_swap_variables]^processOption ( iterator, t ) ;^185^^^^^178^186^processOption ( t, iterator ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  eatTheRest  stopAtNonOption  List  requiredOptions  tokenList  String[]  arguments  String  str  t  Properties  properties  ListIterator  iterator  
[buglab_swap_variables]^processOption (  iterator ) ;^185^^^^^178^186^processOption ( t, iterator ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  eatTheRest  stopAtNonOption  List  requiredOptions  tokenList  String[]  arguments  String  str  t  Properties  properties  ListIterator  iterator  
[buglab_swap_variables]^processOption ( t ) ;^185^^^^^178^186^processOption ( t, iterator ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  eatTheRest  stopAtNonOption  List  requiredOptions  tokenList  String[]  arguments  String  str  t  Properties  properties  ListIterator  iterator  
[buglab_swap_variables]^processOption ( iterator, t ) ;^185^^^^^170^200^processOption ( t, iterator ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  eatTheRest  stopAtNonOption  List  requiredOptions  tokenList  String[]  arguments  String  str  t  Properties  properties  ListIterator  iterator  
[buglab_swap_variables]^processOption (  iterator ) ;^185^^^^^170^200^processOption ( t, iterator ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  eatTheRest  stopAtNonOption  List  requiredOptions  tokenList  String[]  arguments  String  str  t  Properties  properties  ListIterator  iterator  
[buglab_swap_variables]^processOption ( t ) ;^185^^^^^170^200^processOption ( t, iterator ) ;^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  eatTheRest  stopAtNonOption  List  requiredOptions  tokenList  String[]  arguments  String  str  t  Properties  properties  ListIterator  iterator  
[buglab_swap_variables]^if  ( t && !options.hasOption ( stopAtNonOption )  ) {^178^179^^^^163^193^if  ( stopAtNonOption && !options.hasOption ( t )  ) {^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  eatTheRest  stopAtNonOption  List  requiredOptions  tokenList  String[]  arguments  String  str  t  Properties  properties  ListIterator  iterator  
[buglab_swap_variables]^if  ( t && !options.hasOption ( stopAtNonOption )  ) {^178^179^^^^176^198^if  ( stopAtNonOption && !options.hasOption ( t )  ) {^[CLASS] Parser  [METHOD] parse [RETURN_TYPE] CommandLine   Options options String[] arguments Properties properties boolean stopAtNonOption [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  eatTheRest  stopAtNonOption  List  requiredOptions  tokenList  String[]  arguments  String  str  t  Properties  properties  ListIterator  iterator  
[buglab_swap_variables]^Option opt = optionss.getOption ( option ) ;^241^^^^^226^256^Option opt = options.getOption ( option ) ;^[CLASS] Parser  [METHOD] processProperties [RETURN_TYPE] void   Properties properties [VARIABLES] Options  options  opts  CommandLine  cmd  Enumeration  e  RuntimeException  exp  boolean  List  requiredOptions  tokenList  Option  opt  String  option  value  Properties  properties  
[buglab_swap_variables]^Option opt = option.getOption ( options ) ;^241^^^^^226^256^Option opt = options.getOption ( option ) ;^[CLASS] Parser  [METHOD] processProperties [RETURN_TYPE] void   Properties properties [VARIABLES] Options  options  opts  CommandLine  cmd  Enumeration  e  RuntimeException  exp  boolean  List  requiredOptions  tokenList  Option  opt  String  option  value  Properties  properties  
[buglab_swap_variables]^String value = option.getProperty ( properties ) ;^244^^^^^229^259^String value = properties.getProperty ( option ) ;^[CLASS] Parser  [METHOD] processProperties [RETURN_TYPE] void   Properties properties [VARIABLES] Options  options  opts  CommandLine  cmd  Enumeration  e  RuntimeException  exp  boolean  List  requiredOptions  tokenList  Option  opt  String  option  value  Properties  properties  
[buglab_swap_variables]^if  ( str.hasOption ( options )  && str.startsWith ( "-" )  ) {^323^324^^^^318^339^if  ( options.hasOption ( str )  && str.startsWith ( "-" )  ) {^[CLASS] Parser  [METHOD] processArgs [RETURN_TYPE] void   Option opt ListIterator iter [VARIABLES] Options  options  opts  CommandLine  cmd  RuntimeException  exp  boolean  List  requiredOptions  tokenList  Option  opt  String  str  ListIterator  iter  
[buglab_swap_variables]^if  ( str.hasOption ( options )  && str.startsWith ( "-" )  ) {^323^324^^^^316^346^if  ( options.hasOption ( str )  && str.startsWith ( "-" )  ) {^[CLASS] Parser  [METHOD] processArgs [RETURN_TYPE] void   Option opt ListIterator iter [VARIABLES] Options  options  opts  CommandLine  cmd  RuntimeException  exp  boolean  List  requiredOptions  tokenList  Option  opt  String  str  ListIterator  iter  
[buglab_swap_variables]^boolean hasOption = arg.hasOption ( options ) ;^363^^^^^348^378^boolean hasOption = options.hasOption ( arg ) ;^[CLASS] Parser  [METHOD] processOption [RETURN_TYPE] void   String arg ListIterator iter [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  hasOption  OptionGroup  group  List  requiredOptions  tokenList  Option  opt  String  arg  ListIterator  iter  
[buglab_swap_variables]^final Option opt = arg.getOption ( options ) ;^373^^^^^358^388^final Option opt = options.getOption ( arg ) ;^[CLASS] Parser  [METHOD] processOption [RETURN_TYPE] void   String arg ListIterator iter [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  hasOption  OptionGroup  group  List  requiredOptions  tokenList  Option  opt  String  arg  ListIterator  iter  
[buglab_swap_variables]^OptionGroup group = optionsions.getOptionGroup ( opt ) ;^386^^^^^384^394^OptionGroup group = options.getOptionGroup ( opt ) ;^[CLASS] Parser  [METHOD] processOption [RETURN_TYPE] void   String arg ListIterator iter [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  hasOption  OptionGroup  group  List  requiredOptions  tokenList  Option  opt  String  arg  ListIterator  iter  
[buglab_swap_variables]^OptionGroup group = opt.getOptionGroup ( options ) ;^386^^^^^384^394^OptionGroup group = options.getOptionGroup ( opt ) ;^[CLASS] Parser  [METHOD] processOption [RETURN_TYPE] void   String arg ListIterator iter [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  hasOption  OptionGroup  group  List  requiredOptions  tokenList  Option  opt  String  arg  ListIterator  iter  
[buglab_swap_variables]^OptionGroup group = optionsions.getOptionGroup ( opt ) ;^386^^^^^371^401^OptionGroup group = options.getOptionGroup ( opt ) ;^[CLASS] Parser  [METHOD] processOption [RETURN_TYPE] void   String arg ListIterator iter [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  hasOption  OptionGroup  group  List  requiredOptions  tokenList  Option  opt  String  arg  ListIterator  iter  
[buglab_swap_variables]^OptionGroup group = opt.getOptionGroup ( options ) ;^386^^^^^371^401^OptionGroup group = options.getOptionGroup ( opt ) ;^[CLASS] Parser  [METHOD] processOption [RETURN_TYPE] void   String arg ListIterator iter [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  hasOption  OptionGroup  group  List  requiredOptions  tokenList  Option  opt  String  arg  ListIterator  iter  
[buglab_swap_variables]^if  ( optionsions.getOptionGroup ( opt )  != null ) {^384^385^^^^369^399^if  ( options.getOptionGroup ( opt )  != null ) {^[CLASS] Parser  [METHOD] processOption [RETURN_TYPE] void   String arg ListIterator iter [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  hasOption  OptionGroup  group  List  requiredOptions  tokenList  Option  opt  String  arg  ListIterator  iter  
[buglab_swap_variables]^if  ( opt.getOptionGroup ( options )  != null ) {^384^385^^^^369^399^if  ( options.getOptionGroup ( opt )  != null ) {^[CLASS] Parser  [METHOD] processOption [RETURN_TYPE] void   String arg ListIterator iter [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  hasOption  OptionGroup  group  List  requiredOptions  tokenList  Option  opt  String  arg  ListIterator  iter  
[buglab_swap_variables]^processArgs ( iter, opt ) ;^399^^^^^397^400^processArgs ( opt, iter ) ;^[CLASS] Parser  [METHOD] processOption [RETURN_TYPE] void   String arg ListIterator iter [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  hasOption  OptionGroup  group  List  requiredOptions  tokenList  Option  opt  String  arg  ListIterator  iter  
[buglab_swap_variables]^processArgs (  iter ) ;^399^^^^^397^400^processArgs ( opt, iter ) ;^[CLASS] Parser  [METHOD] processOption [RETURN_TYPE] void   String arg ListIterator iter [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  hasOption  OptionGroup  group  List  requiredOptions  tokenList  Option  opt  String  arg  ListIterator  iter  
[buglab_swap_variables]^processArgs ( opt ) ;^399^^^^^397^400^processArgs ( opt, iter ) ;^[CLASS] Parser  [METHOD] processOption [RETURN_TYPE] void   String arg ListIterator iter [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  hasOption  OptionGroup  group  List  requiredOptions  tokenList  Option  opt  String  arg  ListIterator  iter  
[buglab_swap_variables]^processArgs ( iter, opt ) ;^399^^^^^384^414^processArgs ( opt, iter ) ;^[CLASS] Parser  [METHOD] processOption [RETURN_TYPE] void   String arg ListIterator iter [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  hasOption  OptionGroup  group  List  requiredOptions  tokenList  Option  opt  String  arg  ListIterator  iter  
[buglab_swap_variables]^processArgs (  iter ) ;^399^^^^^384^414^processArgs ( opt, iter ) ;^[CLASS] Parser  [METHOD] processOption [RETURN_TYPE] void   String arg ListIterator iter [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  hasOption  OptionGroup  group  List  requiredOptions  tokenList  Option  opt  String  arg  ListIterator  iter  
[buglab_swap_variables]^processArgs ( opt ) ;^399^^^^^384^414^processArgs ( opt, iter ) ;^[CLASS] Parser  [METHOD] processOption [RETURN_TYPE] void   String arg ListIterator iter [VARIABLES] Options  options  opts  CommandLine  cmd  boolean  hasOption  OptionGroup  group  List  requiredOptions  tokenList  Option  opt  String  arg  ListIterator  iter  
