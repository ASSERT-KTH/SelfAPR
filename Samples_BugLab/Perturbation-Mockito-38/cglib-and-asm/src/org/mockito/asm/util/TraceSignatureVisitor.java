[buglab_swap_variables]^declaration.append ( name ? ", " : "<" ) .append ( seenFormalParameter ) ;^87^^^^^86^90^declaration.append ( seenFormalParameter ? ", " : "<" ) .append ( name ) ;^[CLASS] TraceSignatureVisitor  [METHOD] visitFormalTypeParameter [RETURN_TYPE] void   String name [VARIABLES] StringBuffer  buf  declaration  exceptions  returnType  boolean  isInterface  seenFormalParameter  seenInterface  seenInterfaceBound  seenParameter  String  name  separator  int  access  argumentStack  arrayStack  
[buglab_swap_variables]^separator = isInterface ? ", " : seenInterface ? " extends " : " implements ";^113^114^115^^^112^119^separator = seenInterface ? ", " : isInterface ? " extends " : " implements ";^[CLASS] TraceSignatureVisitor  [METHOD] visitInterface [RETURN_TYPE] SignatureVisitor   [VARIABLES] StringBuffer  buf  declaration  exceptions  returnType  boolean  isInterface  seenFormalParameter  seenInterface  seenInterfaceBound  seenParameter  String  name  separator  int  access  argumentStack  arrayStack  
[buglab_swap_variables]^declaration.append ( name ) .append ( separator.replace ( '/', '.' )  ) ;^212^^^^^200^216^declaration.append ( separator ) .append ( name.replace ( '/', '.' )  ) ;^[CLASS] TraceSignatureVisitor  [METHOD] visitClassType [RETURN_TYPE] void   String name [VARIABLES] StringBuffer  buf  declaration  exceptions  returnType  boolean  isInterface  needObjectClass  seenFormalParameter  seenInterface  seenInterfaceBound  seenParameter  String  name  separator  int  access  argumentStack  arrayStack  
[buglab_swap_variables]^declaration.append ( name ) .append ( separator.replace ( '/', '.' )  ) ;^209^^^^^200^216^declaration.append ( separator ) .append ( name.replace ( '/', '.' )  ) ;^[CLASS] TraceSignatureVisitor  [METHOD] visitClassType [RETURN_TYPE] void   String name [VARIABLES] StringBuffer  buf  declaration  exceptions  returnType  boolean  isInterface  needObjectClass  seenFormalParameter  seenInterface  seenInterfaceBound  seenParameter  String  name  separator  int  access  argumentStack  arrayStack  
[buglab_swap_variables]^boolean needObjectClass = seenParameter % 2 != 0 || argumentStack;^207^^^^^200^216^boolean needObjectClass = argumentStack % 2 != 0 || seenParameter;^[CLASS] TraceSignatureVisitor  [METHOD] visitClassType [RETURN_TYPE] void   String name [VARIABLES] StringBuffer  buf  declaration  exceptions  returnType  boolean  isInterface  needObjectClass  seenFormalParameter  seenInterface  seenInterfaceBound  seenParameter  String  name  separator  int  access  argumentStack  arrayStack  
[buglab_swap_variables]^declaration.append ( name ) .append ( separator.replace ( '/', '.' )  ) ;^224^^^^^218^227^declaration.append ( separator ) .append ( name.replace ( '/', '.' )  ) ;^[CLASS] TraceSignatureVisitor  [METHOD] visitInnerClassType [RETURN_TYPE] void   String name [VARIABLES] StringBuffer  buf  declaration  exceptions  returnType  boolean  isInterface  needObjectClass  seenFormalParameter  seenInterface  seenInterfaceBound  seenParameter  String  name  separator  int  access  argumentStack  arrayStack  
[buglab_swap_variables]^if  ( EXTENDS == tag )  {^247^^^^^239^255^if  ( tag == EXTENDS )  {^[CLASS] TraceSignatureVisitor  [METHOD] visitTypeArgument [RETURN_TYPE] SignatureVisitor   final char tag [VARIABLES] char  tag  StringBuffer  buf  declaration  exceptions  returnType  boolean  isInterface  needObjectClass  seenFormalParameter  seenInterface  seenInterfaceBound  seenParameter  String  name  separator  int  access  argumentStack  arrayStack  
[buglab_swap_variables]^} else if  ( SUPER == tag )  {^249^^^^^239^255^} else if  ( tag == SUPER )  {^[CLASS] TraceSignatureVisitor  [METHOD] visitTypeArgument [RETURN_TYPE] SignatureVisitor   final char tag [VARIABLES] char  tag  StringBuffer  buf  declaration  exceptions  returnType  boolean  isInterface  needObjectClass  seenFormalParameter  seenInterface  seenInterfaceBound  seenParameter  String  name  separator  int  access  argumentStack  arrayStack  
