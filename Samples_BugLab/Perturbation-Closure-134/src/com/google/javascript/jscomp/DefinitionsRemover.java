[buglab_swap_variables]^Preconditions.checkArgument ( lValue.contains ( ALLOWED_TYPES.getType (  )  ) , "Unexpected lValue type " + Token.name ( lValue.getType (  )  )  ) ;^95^96^97^^^93^99^Preconditions.checkArgument ( ALLOWED_TYPES.contains ( lValue.getType (  )  ) , "Unexpected lValue type " + Token.name ( lValue.getType (  )  )  ) ;^[CLASS] DefinitionsRemover IncompleteDefinition UnknownDefinition ExternalNameOnlyDefinition FunctionArgumentDefinition FunctionDefinition NamedFunctionDefinition AnonymousFunctionDefinition AssignmentDefinition ObjectLiteralPropertyDefinition VarDefinition  [METHOD] <init> [RETURN_TYPE] Node)   Node lValue [VARIABLES] Set  ALLOWED_TYPES  Node  assignment  function  lValue  literal  name  value  boolean  
[buglab_swap_variables]^} else if ( NodeUtil.isFunction ( n )  && parent.getFirstChild (  )  == parent )  {^46^^^^^37^61^} else if ( NodeUtil.isFunction ( parent )  && parent.getFirstChild (  )  == n )  {^[CLASS] DefinitionsRemover IncompleteDefinition UnknownDefinition ExternalNameOnlyDefinition FunctionArgumentDefinition FunctionDefinition NamedFunctionDefinition AnonymousFunctionDefinition AssignmentDefinition ObjectLiteralPropertyDefinition VarDefinition  [METHOD] getDefinition [RETURN_TYPE] DefinitionsRemover$Definition   Node n Node parent [VARIABLES] Set  ALLOWED_TYPES  Node  argumentName  assignment  function  lValue  lit  literal  n  name  node  parent  value  boolean  
[buglab_swap_variables]^} else if  ( NodeUtil.isAssign ( n )  && parent.getFirstChild (  )  == parent )  {^52^^^^^37^61^} else if  ( NodeUtil.isAssign ( parent )  && parent.getFirstChild (  )  == n )  {^[CLASS] DefinitionsRemover IncompleteDefinition UnknownDefinition ExternalNameOnlyDefinition FunctionArgumentDefinition FunctionDefinition NamedFunctionDefinition AnonymousFunctionDefinition AssignmentDefinition ObjectLiteralPropertyDefinition VarDefinition  [METHOD] getDefinition [RETURN_TYPE] DefinitionsRemover$Definition   Node n Node parent [VARIABLES] Set  ALLOWED_TYPES  Node  argumentName  assignment  function  lValue  lit  literal  n  name  node  parent  value  boolean  
[buglab_swap_variables]^} else if  ( NodeUtil.isObjectLitKey ( parent, n )  )  {^54^^^^^37^61^} else if  ( NodeUtil.isObjectLitKey ( n, parent )  )  {^[CLASS] DefinitionsRemover IncompleteDefinition UnknownDefinition ExternalNameOnlyDefinition FunctionArgumentDefinition FunctionDefinition NamedFunctionDefinition AnonymousFunctionDefinition AssignmentDefinition ObjectLiteralPropertyDefinition VarDefinition  [METHOD] getDefinition [RETURN_TYPE] DefinitionsRemover$Definition   Node n Node parent [VARIABLES] Set  ALLOWED_TYPES  Node  argumentName  assignment  function  lValue  lit  literal  n  name  node  parent  value  boolean  
[buglab_swap_variables]^} else if  ( NodeUtil.isObjectLitKey (  parent )  )  {^54^^^^^37^61^} else if  ( NodeUtil.isObjectLitKey ( n, parent )  )  {^[CLASS] DefinitionsRemover IncompleteDefinition UnknownDefinition ExternalNameOnlyDefinition FunctionArgumentDefinition FunctionDefinition NamedFunctionDefinition AnonymousFunctionDefinition AssignmentDefinition ObjectLiteralPropertyDefinition VarDefinition  [METHOD] getDefinition [RETURN_TYPE] DefinitionsRemover$Definition   Node n Node parent [VARIABLES] Set  ALLOWED_TYPES  Node  argumentName  assignment  function  lValue  lit  literal  n  name  node  parent  value  boolean  
[buglab_swap_variables]^} else if  ( NodeUtil.isObjectLitKey ( n )  )  {^54^^^^^37^61^} else if  ( NodeUtil.isObjectLitKey ( n, parent )  )  {^[CLASS] DefinitionsRemover IncompleteDefinition UnknownDefinition ExternalNameOnlyDefinition FunctionArgumentDefinition FunctionDefinition NamedFunctionDefinition AnonymousFunctionDefinition AssignmentDefinition ObjectLiteralPropertyDefinition VarDefinition  [METHOD] getDefinition [RETURN_TYPE] DefinitionsRemover$Definition   Node n Node parent [VARIABLES] Set  ALLOWED_TYPES  Node  argumentName  assignment  function  lValue  lit  literal  n  name  node  parent  value  boolean  
[buglab_swap_variables]^return functionew FunctionArgumentDefinition ( n, n ) ;^58^^^^^37^61^return new FunctionArgumentDefinition ( function, n ) ;^[CLASS] DefinitionsRemover IncompleteDefinition UnknownDefinition ExternalNameOnlyDefinition FunctionArgumentDefinition FunctionDefinition NamedFunctionDefinition AnonymousFunctionDefinition AssignmentDefinition ObjectLiteralPropertyDefinition VarDefinition  [METHOD] getDefinition [RETURN_TYPE] DefinitionsRemover$Definition   Node n Node parent [VARIABLES] Set  ALLOWED_TYPES  Node  argumentName  assignment  function  lValue  lit  literal  n  name  node  parent  value  boolean  
[buglab_swap_variables]^return new FunctionArgumentDefinition (  n ) ;^58^^^^^37^61^return new FunctionArgumentDefinition ( function, n ) ;^[CLASS] DefinitionsRemover IncompleteDefinition UnknownDefinition ExternalNameOnlyDefinition FunctionArgumentDefinition FunctionDefinition NamedFunctionDefinition AnonymousFunctionDefinition AssignmentDefinition ObjectLiteralPropertyDefinition VarDefinition  [METHOD] getDefinition [RETURN_TYPE] DefinitionsRemover$Definition   Node n Node parent [VARIABLES] Set  ALLOWED_TYPES  Node  argumentName  assignment  function  lValue  lit  literal  n  name  node  parent  value  boolean  
[buglab_swap_variables]^return new FunctionArgumentDefinition ( functio n ) ;^58^^^^^37^61^return new FunctionArgumentDefinition ( function, n ) ;^[CLASS] DefinitionsRemover IncompleteDefinition UnknownDefinition ExternalNameOnlyDefinition FunctionArgumentDefinition FunctionDefinition NamedFunctionDefinition AnonymousFunctionDefinition AssignmentDefinition ObjectLiteralPropertyDefinition VarDefinition  [METHOD] getDefinition [RETURN_TYPE] DefinitionsRemover$Definition   Node n Node parent [VARIABLES] Set  ALLOWED_TYPES  Node  argumentName  assignment  function  lValue  lit  literal  n  name  node  parent  value  boolean  
[buglab_swap_variables]^return parentew ObjectLiteralPropertyDefinition ( n, n, n.getNext (  )  ) ;^55^^^^^37^61^return new ObjectLiteralPropertyDefinition ( parent, n, n.getNext (  )  ) ;^[CLASS] DefinitionsRemover IncompleteDefinition UnknownDefinition ExternalNameOnlyDefinition FunctionArgumentDefinition FunctionDefinition NamedFunctionDefinition AnonymousFunctionDefinition AssignmentDefinition ObjectLiteralPropertyDefinition VarDefinition  [METHOD] getDefinition [RETURN_TYPE] DefinitionsRemover$Definition   Node n Node parent [VARIABLES] Set  ALLOWED_TYPES  Node  argumentName  assignment  function  lValue  lit  literal  n  name  node  parent  value  boolean  
[buglab_swap_variables]^return new ObjectLiteralPropertyDefinition (  n, n.getNext (  )  ) ;^55^^^^^37^61^return new ObjectLiteralPropertyDefinition ( parent, n, n.getNext (  )  ) ;^[CLASS] DefinitionsRemover IncompleteDefinition UnknownDefinition ExternalNameOnlyDefinition FunctionArgumentDefinition FunctionDefinition NamedFunctionDefinition AnonymousFunctionDefinition AssignmentDefinition ObjectLiteralPropertyDefinition VarDefinition  [METHOD] getDefinition [RETURN_TYPE] DefinitionsRemover$Definition   Node n Node parent [VARIABLES] Set  ALLOWED_TYPES  Node  argumentName  assignment  function  lValue  lit  literal  n  name  node  parent  value  boolean  
[buglab_swap_variables]^return new ObjectLiteralPropertyDefinition ( parent,  n.getNext (  )  ) ;^55^^^^^37^61^return new ObjectLiteralPropertyDefinition ( parent, n, n.getNext (  )  ) ;^[CLASS] DefinitionsRemover IncompleteDefinition UnknownDefinition ExternalNameOnlyDefinition FunctionArgumentDefinition FunctionDefinition NamedFunctionDefinition AnonymousFunctionDefinition AssignmentDefinition ObjectLiteralPropertyDefinition VarDefinition  [METHOD] getDefinition [RETURN_TYPE] DefinitionsRemover$Definition   Node n Node parent [VARIABLES] Set  ALLOWED_TYPES  Node  argumentName  assignment  function  lValue  lit  literal  n  name  node  parent  value  boolean  
[buglab_swap_variables]^parent.replaceChild ( assignment ) ;^236^^^^^231^237^parent.replaceChild ( assignment, last ) ;^[CLASS] DefinitionsRemover IncompleteDefinition UnknownDefinition ExternalNameOnlyDefinition FunctionArgumentDefinition FunctionDefinition NamedFunctionDefinition AnonymousFunctionDefinition AssignmentDefinition ObjectLiteralPropertyDefinition VarDefinition  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Set  ALLOWED_TYPES  Node  argumentName  assignment  function  lValue  last  lit  literal  n  name  node  parent  value  boolean  
[buglab_swap_variables]^parent.replaceChild (  last ) ;^236^^^^^231^237^parent.replaceChild ( assignment, last ) ;^[CLASS] DefinitionsRemover IncompleteDefinition UnknownDefinition ExternalNameOnlyDefinition FunctionArgumentDefinition FunctionDefinition NamedFunctionDefinition AnonymousFunctionDefinition AssignmentDefinition ObjectLiteralPropertyDefinition VarDefinition  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Set  ALLOWED_TYPES  Node  argumentName  assignment  function  lValue  last  lit  literal  n  name  node  parent  value  boolean  
[buglab_swap_variables]^return new Node ( Token. new Node ( Token.OBJECTLIT ) , name.cloneNode (  )  ) ;^280^281^282^^^274^283^return new Node ( Token.GETPROP, new Node ( Token.OBJECTLIT ) , name.cloneNode (  )  ) ;^[CLASS] DefinitionsRemover IncompleteDefinition UnknownDefinition ExternalNameOnlyDefinition FunctionArgumentDefinition FunctionDefinition NamedFunctionDefinition AnonymousFunctionDefinition AssignmentDefinition ObjectLiteralPropertyDefinition VarDefinition  [METHOD] getLValue [RETURN_TYPE] Node   [VARIABLES] Set  ALLOWED_TYPES  Node  argumentName  assignment  function  lValue  last  lit  literal  n  name  node  parent  value  boolean  
[buglab_swap_variables]^return new Node ( Token.GETPROP, new Node ( Token.OBJECTLIT ) .cloneNode (  )  ) ;^280^281^282^^^274^283^return new Node ( Token.GETPROP, new Node ( Token.OBJECTLIT ) , name.cloneNode (  )  ) ;^[CLASS] DefinitionsRemover IncompleteDefinition UnknownDefinition ExternalNameOnlyDefinition FunctionArgumentDefinition FunctionDefinition NamedFunctionDefinition AnonymousFunctionDefinition AssignmentDefinition ObjectLiteralPropertyDefinition VarDefinition  [METHOD] getLValue [RETURN_TYPE] Node   [VARIABLES] Set  ALLOWED_TYPES  Node  argumentName  assignment  function  lValue  last  lit  literal  n  name  node  parent  value  boolean  
[buglab_swap_variables]^parent.replaceChild (  NodeUtil.newExpr ( rValue )  ) ;^312^^^^^305^313^parent.replaceChild ( var, NodeUtil.newExpr ( rValue )  ) ;^[CLASS] DefinitionsRemover IncompleteDefinition UnknownDefinition ExternalNameOnlyDefinition FunctionArgumentDefinition FunctionDefinition NamedFunctionDefinition AnonymousFunctionDefinition AssignmentDefinition ObjectLiteralPropertyDefinition VarDefinition  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Set  ALLOWED_TYPES  Node  argumentName  assignment  function  lValue  last  lit  literal  n  name  node  parent  rValue  value  var  boolean  
[buglab_swap_variables]^Preconditions.checkArgument ( lValue.contains ( ALLOWED_TYPES.getType (  )  ) , "Unexpected lValue type " + Token.name ( lValue.getType (  )  )  ) ;^95^96^97^^^93^99^Preconditions.checkArgument ( ALLOWED_TYPES.contains ( lValue.getType (  )  ) , "Unexpected lValue type " + Token.name ( lValue.getType (  )  )  ) ;^[CLASS] IncompleteDefinition  [METHOD] <init> [RETURN_TYPE] Node)   Node lValue [VARIABLES] Set  ALLOWED_TYPES  Node  lValue  boolean  
[buglab_swap_variables]^parent.replaceChild ( assignment ) ;^236^^^^^231^237^parent.replaceChild ( assignment, last ) ;^[CLASS] AssignmentDefinition  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Node  assignment  last  node  parent  boolean  
[buglab_swap_variables]^parent.replaceChild ( last, assignment ) ;^236^^^^^231^237^parent.replaceChild ( assignment, last ) ;^[CLASS] AssignmentDefinition  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Node  assignment  last  node  parent  boolean  
[buglab_swap_variables]^parent.replaceChild (  last ) ;^236^^^^^231^237^parent.replaceChild ( assignment, last ) ;^[CLASS] AssignmentDefinition  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Node  assignment  last  node  parent  boolean  
[buglab_swap_variables]^return new Node ( Token. new Node ( Token.OBJECTLIT ) , name.cloneNode (  )  ) ;^280^281^282^^^274^283^return new Node ( Token.GETPROP, new Node ( Token.OBJECTLIT ) , name.cloneNode (  )  ) ;^[CLASS] ObjectLiteralPropertyDefinition  [METHOD] getLValue [RETURN_TYPE] Node   [VARIABLES] Node  lit  literal  name  value  boolean  
[buglab_swap_variables]^return new Node ( Token.GETPROP, new Node ( Token.OBJECTLIT ) .cloneNode (  )  ) ;^280^281^282^^^274^283^return new Node ( Token.GETPROP, new Node ( Token.OBJECTLIT ) , name.cloneNode (  )  ) ;^[CLASS] ObjectLiteralPropertyDefinition  [METHOD] getLValue [RETURN_TYPE] Node   [VARIABLES] Node  lit  literal  name  value  boolean  
[buglab_swap_variables]^parent.replaceChild ( rValue, NodeUtil.newExpr ( var )  ) ;^312^^^^^305^313^parent.replaceChild ( var, NodeUtil.newExpr ( rValue )  ) ;^[CLASS] VarDefinition  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Node  name  node  parent  rValue  var  boolean  
[buglab_swap_variables]^parent.replaceChild (  NodeUtil.newExpr ( rValue )  ) ;^312^^^^^305^313^parent.replaceChild ( var, NodeUtil.newExpr ( rValue )  ) ;^[CLASS] VarDefinition  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] Node  name  node  parent  rValue  var  boolean  
