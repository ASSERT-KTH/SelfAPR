[buglab_swap_variables]^super ( err, out, args ) ;^110^^^^^109^111^super ( args, out, err ) ;^[CLASS] CompilerRunner FormattingOption  [METHOD] <init> [RETURN_TYPE] PrintStream)   String[] args PrintStream out PrintStream err [VARIABLES] PrintStream  err  out  String[]  args  boolean  FormattingOption  PRETTY_PRINT  PRINT_INPUT_DELIMITER  Flag  FLAG_compilation_level  FLAG_debug  FLAG_formatting  FLAG_process_closure_primitives  FLAG_use_only_custom_externs  FLAG_warning_level  
[buglab_swap_variables]^super (  out, err ) ;^110^^^^^109^111^super ( args, out, err ) ;^[CLASS] CompilerRunner FormattingOption  [METHOD] <init> [RETURN_TYPE] PrintStream)   String[] args PrintStream out PrintStream err [VARIABLES] PrintStream  err  out  String[]  args  boolean  FormattingOption  PRETTY_PRINT  PRINT_INPUT_DELIMITER  Flag  FLAG_compilation_level  FLAG_debug  FLAG_formatting  FLAG_process_closure_primitives  FLAG_use_only_custom_externs  FLAG_warning_level  
[buglab_swap_variables]^super ( out, args, err ) ;^110^^^^^109^111^super ( args, out, err ) ;^[CLASS] CompilerRunner FormattingOption  [METHOD] <init> [RETURN_TYPE] PrintStream)   String[] args PrintStream out PrintStream err [VARIABLES] PrintStream  err  out  String[]  args  boolean  FormattingOption  PRETTY_PRINT  PRINT_INPUT_DELIMITER  Flag  FLAG_compilation_level  FLAG_debug  FLAG_formatting  FLAG_process_closure_primitives  FLAG_use_only_custom_externs  FLAG_warning_level  
[buglab_swap_variables]^super ( args,  err ) ;^110^^^^^109^111^super ( args, out, err ) ;^[CLASS] CompilerRunner FormattingOption  [METHOD] <init> [RETURN_TYPE] PrintStream)   String[] args PrintStream out PrintStream err [VARIABLES] PrintStream  err  out  String[]  args  boolean  FormattingOption  PRETTY_PRINT  PRINT_INPUT_DELIMITER  Flag  FLAG_compilation_level  FLAG_debug  FLAG_formatting  FLAG_process_closure_primitives  FLAG_use_only_custom_externs  FLAG_warning_level  
[buglab_swap_variables]^super ( args, out ) ;^110^^^^^109^111^super ( args, out, err ) ;^[CLASS] CompilerRunner FormattingOption  [METHOD] <init> [RETURN_TYPE] PrintStream)   String[] args PrintStream out PrintStream err [VARIABLES] PrintStream  err  out  String[]  args  boolean  FormattingOption  PRETTY_PRINT  PRINT_INPUT_DELIMITER  Flag  FLAG_compilation_level  FLAG_debug  FLAG_formatting  FLAG_process_closure_primitives  FLAG_use_only_custom_externs  FLAG_warning_level  
[buglab_swap_variables]^for  ( ZipEntry zip = null;  ( entry = entry.getNextEntry (  )  )  != null;  )  {^163^^^^^158^168^for  ( ZipEntry entry = null;  ( entry = zip.getNextEntry (  )  )  != null;  )  {^[CLASS] CompilerRunner FormattingOption  [METHOD] getDefaultExterns [RETURN_TYPE] List   [VARIABLES] ZipInputStream  zip  boolean  FormattingOption  PRETTY_PRINT  PRINT_INPUT_DELIMITER  formattingOption  InputStream  input  ZipEntry  entry  List  externs  LimitInputStream  entryStream  Flag  FLAG_compilation_level  FLAG_debug  FLAG_formatting  FLAG_process_closure_primitives  FLAG_use_only_custom_externs  FLAG_warning_level  
[buglab_swap_variables]^LimitInputStream zipStream = new LimitInputStream ( entry, entry.getSize (  )  ) ;^164^^^^^158^168^LimitInputStream entryStream = new LimitInputStream ( zip, entry.getSize (  )  ) ;^[CLASS] CompilerRunner FormattingOption  [METHOD] getDefaultExterns [RETURN_TYPE] List   [VARIABLES] ZipInputStream  zip  boolean  FormattingOption  PRETTY_PRINT  PRINT_INPUT_DELIMITER  formattingOption  InputStream  input  ZipEntry  entry  List  externs  LimitInputStream  entryStream  Flag  FLAG_compilation_level  FLAG_debug  FLAG_formatting  FLAG_process_closure_primitives  FLAG_use_only_custom_externs  FLAG_warning_level  
[buglab_swap_variables]^LimitInputStream entryStream = new LimitInputStream (  entry.getSize (  )  ) ;^164^^^^^158^168^LimitInputStream entryStream = new LimitInputStream ( zip, entry.getSize (  )  ) ;^[CLASS] CompilerRunner FormattingOption  [METHOD] getDefaultExterns [RETURN_TYPE] List   [VARIABLES] ZipInputStream  zip  boolean  FormattingOption  PRETTY_PRINT  PRINT_INPUT_DELIMITER  formattingOption  InputStream  input  ZipEntry  entry  List  externs  LimitInputStream  entryStream  Flag  FLAG_compilation_level  FLAG_debug  FLAG_formatting  FLAG_process_closure_primitives  FLAG_use_only_custom_externs  FLAG_warning_level  
[buglab_swap_variables]^LimitInputStream entryStream = new LimitInputStream ( zip.getSize (  )  ) ;^164^^^^^158^168^LimitInputStream entryStream = new LimitInputStream ( zip, entry.getSize (  )  ) ;^[CLASS] CompilerRunner FormattingOption  [METHOD] getDefaultExterns [RETURN_TYPE] List   [VARIABLES] ZipInputStream  zip  boolean  FormattingOption  PRETTY_PRINT  PRINT_INPUT_DELIMITER  formattingOption  InputStream  input  ZipEntry  entry  List  externs  LimitInputStream  entryStream  Flag  FLAG_compilation_level  FLAG_debug  FLAG_formatting  FLAG_process_closure_primitives  FLAG_use_only_custom_externs  FLAG_warning_level  
[buglab_swap_variables]^externs.add ( JSSourceFile.fromInputStream ( entryStream.getName (  ) , entry )  ) ;^165^^^^^158^168^externs.add ( JSSourceFile.fromInputStream ( entry.getName (  ) , entryStream )  ) ;^[CLASS] CompilerRunner FormattingOption  [METHOD] getDefaultExterns [RETURN_TYPE] List   [VARIABLES] ZipInputStream  zip  boolean  FormattingOption  PRETTY_PRINT  PRINT_INPUT_DELIMITER  formattingOption  InputStream  input  ZipEntry  entry  List  externs  LimitInputStream  entryStream  Flag  FLAG_compilation_level  FLAG_debug  FLAG_formatting  FLAG_process_closure_primitives  FLAG_use_only_custom_externs  FLAG_warning_level  
[buglab_swap_variables]^externs.add ( JSSourceFile.fromInputStream ( entry.getName (  ) Stream )  ) ;^165^^^^^158^168^externs.add ( JSSourceFile.fromInputStream ( entry.getName (  ) , entryStream )  ) ;^[CLASS] CompilerRunner FormattingOption  [METHOD] getDefaultExterns [RETURN_TYPE] List   [VARIABLES] ZipInputStream  zip  boolean  FormattingOption  PRETTY_PRINT  PRINT_INPUT_DELIMITER  formattingOption  InputStream  input  ZipEntry  entry  List  externs  LimitInputStream  entryStream  Flag  FLAG_compilation_level  FLAG_debug  FLAG_formatting  FLAG_process_closure_primitives  FLAG_use_only_custom_externs  FLAG_warning_level  
[buglab_swap_variables]^externs.add ( JSSourceFile.fromInputStream ( entry.getName (  )  )  ) ;^165^^^^^158^168^externs.add ( JSSourceFile.fromInputStream ( entry.getName (  ) , entryStream )  ) ;^[CLASS] CompilerRunner FormattingOption  [METHOD] getDefaultExterns [RETURN_TYPE] List   [VARIABLES] ZipInputStream  zip  boolean  FormattingOption  PRETTY_PRINT  PRINT_INPUT_DELIMITER  formattingOption  InputStream  input  ZipEntry  entry  List  externs  LimitInputStream  entryStream  Flag  FLAG_compilation_level  FLAG_debug  FLAG_formatting  FLAG_process_closure_primitives  FLAG_use_only_custom_externs  FLAG_warning_level  
