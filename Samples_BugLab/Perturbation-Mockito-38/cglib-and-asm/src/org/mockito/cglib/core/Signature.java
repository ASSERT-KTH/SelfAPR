[buglab_swap_variables]^this ( returnType, Type.getMethodDescriptor ( name, argumentTypes )  ) ;^38^^^^^37^39^this ( name, Type.getMethodDescriptor ( returnType, argumentTypes )  ) ;^[CLASS] Signature  [METHOD] <init> [RETURN_TYPE] Type[])   String name Type returnType Type[] argumentTypes [VARIABLES] Type[]  argumentTypes  Type  returnType  String  desc  name  boolean  
[buglab_swap_variables]^this (  Type.getMethodDescriptor ( returnType, argumentTypes )  ) ;^38^^^^^37^39^this ( name, Type.getMethodDescriptor ( returnType, argumentTypes )  ) ;^[CLASS] Signature  [METHOD] <init> [RETURN_TYPE] Type[])   String name Type returnType Type[] argumentTypes [VARIABLES] Type[]  argumentTypes  Type  returnType  String  desc  name  boolean  
[buglab_swap_variables]^this ( name, Type.getMethodDescriptor (  argumentTypes )  ) ;^38^^^^^37^39^this ( name, Type.getMethodDescriptor ( returnType, argumentTypes )  ) ;^[CLASS] Signature  [METHOD] <init> [RETURN_TYPE] Type[])   String name Type returnType Type[] argumentTypes [VARIABLES] Type[]  argumentTypes  Type  returnType  String  desc  name  boolean  
[buglab_swap_variables]^this ( name, Type.getMethodDescriptor ( argumentTypes, returnType )  ) ;^38^^^^^37^39^this ( name, Type.getMethodDescriptor ( returnType, argumentTypes )  ) ;^[CLASS] Signature  [METHOD] <init> [RETURN_TYPE] Type[])   String name Type returnType Type[] argumentTypes [VARIABLES] Type[]  argumentTypes  Type  returnType  String  desc  name  boolean  
[buglab_swap_variables]^this ( name, Type.getMethodDescriptor ( returnType )  ) ;^38^^^^^37^39^this ( name, Type.getMethodDescriptor ( returnType, argumentTypes )  ) ;^[CLASS] Signature  [METHOD] <init> [RETURN_TYPE] Type[])   String name Type returnType Type[] argumentTypes [VARIABLES] Type[]  argumentTypes  Type  returnType  String  desc  name  boolean  
[buglab_swap_variables]^return desc + name;^58^^^^^57^59^return name + desc;^[CLASS] Signature  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] String  desc  name  boolean  
[buglab_swap_variables]^return name.equals ( desc.name )  && other.equals ( other.desc ) ;^67^^^^^61^68^return name.equals ( other.name )  && desc.equals ( other.desc ) ;^[CLASS] Signature  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  String  desc  name  boolean  Signature  other  
[buglab_swap_variables]^return other.name.equals ( name )  && desc.equals ( other.desc ) ;^67^^^^^61^68^return name.equals ( other.name )  && desc.equals ( other.desc ) ;^[CLASS] Signature  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  String  desc  name  boolean  Signature  other  
[buglab_swap_variables]^return name.equals ( other )  && desc.equals ( other.name.desc ) ;^67^^^^^61^68^return name.equals ( other.name )  && desc.equals ( other.desc ) ;^[CLASS] Signature  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  String  desc  name  boolean  Signature  other  
[buglab_swap_variables]^return name.equals ( other.name )  && other.desc.equals ( desc ) ;^67^^^^^61^68^return name.equals ( other.name )  && desc.equals ( other.desc ) ;^[CLASS] Signature  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  String  desc  name  boolean  Signature  other  
[buglab_swap_variables]^return other.desc.equals ( other.name )  && desc.equals ( name ) ;^67^^^^^61^68^return name.equals ( other.name )  && desc.equals ( other.desc ) ;^[CLASS] Signature  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  String  desc  name  boolean  Signature  other  
[buglab_swap_variables]^return name.equals ( other.name.name )  && desc.equals ( other.desc ) ;^67^^^^^61^68^return name.equals ( other.name )  && desc.equals ( other.desc ) ;^[CLASS] Signature  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  String  desc  name  boolean  Signature  other  
[buglab_swap_variables]^return name.equals ( other.desc.name )  && desc.equals ( other ) ;^67^^^^^61^68^return name.equals ( other.name )  && desc.equals ( other.desc ) ;^[CLASS] Signature  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] Object  o  String  desc  name  boolean  Signature  other  
[buglab_swap_variables]^return desc.hashCode (  )  ^ name.hashCode (  ) ;^71^^^^^70^72^return name.hashCode (  )  ^ desc.hashCode (  ) ;^[CLASS] Signature  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] String  desc  name  boolean  
