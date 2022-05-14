[buglab_swap_variables]^return put ( content, paramName, content.getClass (  )  ) ;^37^^^^^36^38^return put ( paramName, content, content.getClass (  )  ) ;^[CLASS] ParamMap Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content [VARIABLES] Object  content  String  paramName  boolean  T  spec  Map  contents  ParamMapSpec  spec  
[buglab_swap_variables]^return put (  content, content.getClass (  )  ) ;^37^^^^^36^38^return put ( paramName, content, content.getClass (  )  ) ;^[CLASS] ParamMap Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content [VARIABLES] Object  content  String  paramName  boolean  T  spec  Map  contents  ParamMapSpec  spec  
[buglab_swap_variables]^return put ( paramName,  content.getClass (  )  ) ;^37^^^^^36^38^return put ( paramName, content, content.getClass (  )  ) ;^[CLASS] ParamMap Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content [VARIABLES] Object  content  String  paramName  boolean  T  spec  Map  contents  ParamMapSpec  spec  
[buglab_swap_variables]^Preconditions.checkArgument ( paramName.checkIfCompatible ( spec, typeOfContent )  ) ;^41^^^^^40^44^Preconditions.checkArgument ( spec.checkIfCompatible ( paramName, typeOfContent )  ) ;^[CLASS] ParamMap Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content Type typeOfContent [VARIABLES] Type  typeOfContent  boolean  T  spec  Object  content  String  paramName  Map  contents  ParamMapSpec  spec  
[buglab_swap_variables]^Preconditions.checkArgument ( spec.checkIfCompatible (  typeOfContent )  ) ;^41^^^^^40^44^Preconditions.checkArgument ( spec.checkIfCompatible ( paramName, typeOfContent )  ) ;^[CLASS] ParamMap Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content Type typeOfContent [VARIABLES] Type  typeOfContent  boolean  T  spec  Object  content  String  paramName  Map  contents  ParamMapSpec  spec  
[buglab_swap_variables]^Preconditions.checkArgument ( spec.checkIfCompatible ( typeOfContent, paramName )  ) ;^41^^^^^40^44^Preconditions.checkArgument ( spec.checkIfCompatible ( paramName, typeOfContent )  ) ;^[CLASS] ParamMap Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content Type typeOfContent [VARIABLES] Type  typeOfContent  boolean  T  spec  Object  content  String  paramName  Map  contents  ParamMapSpec  spec  
[buglab_swap_variables]^Preconditions.checkArgument ( spec.checkIfCompatible ( paramName )  ) ;^41^^^^^40^44^Preconditions.checkArgument ( spec.checkIfCompatible ( paramName, typeOfContent )  ) ;^[CLASS] ParamMap Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content Type typeOfContent [VARIABLES] Type  typeOfContent  boolean  T  spec  Object  content  String  paramName  Map  contents  ParamMapSpec  spec  
[buglab_swap_variables]^Preconditions.checkArgument ( typeOfContent.checkIfCompatible ( paramName, spec )  ) ;^41^^^^^40^44^Preconditions.checkArgument ( spec.checkIfCompatible ( paramName, typeOfContent )  ) ;^[CLASS] ParamMap Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content Type typeOfContent [VARIABLES] Type  typeOfContent  boolean  T  spec  Object  content  String  paramName  Map  contents  ParamMapSpec  spec  
[buglab_swap_variables]^contents.put ( content, paramName ) ;^42^^^^^40^44^contents.put ( paramName, content ) ;^[CLASS] ParamMap Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content Type typeOfContent [VARIABLES] Type  typeOfContent  boolean  T  spec  Object  content  String  paramName  Map  contents  ParamMapSpec  spec  
[buglab_swap_variables]^contents.put (  content ) ;^42^^^^^40^44^contents.put ( paramName, content ) ;^[CLASS] ParamMap Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content Type typeOfContent [VARIABLES] Type  typeOfContent  boolean  T  spec  Object  content  String  paramName  Map  contents  ParamMapSpec  spec  
[buglab_swap_variables]^contents.put ( paramName ) ;^42^^^^^40^44^contents.put ( paramName, content ) ;^[CLASS] ParamMap Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content Type typeOfContent [VARIABLES] Type  typeOfContent  boolean  T  spec  Object  content  String  paramName  Map  contents  ParamMapSpec  spec  
[buglab_swap_variables]^contents.put ( paramKey.getName (  )  ) ;^47^^^^^46^49^contents.put ( paramKey.getName (  ) , param ) ;^[CLASS] ParamMap Builder  [METHOD] put [RETURN_TYPE] <K>   TypedKey<K> paramKey K param [VARIABLES] K  param  boolean  T  spec  TypedKey  paramKey  Map  contents  ParamMapSpec  spec  
[buglab_swap_variables]^return paramName.get ( contents ) ;^65^^^^^64^66^return contents.get ( paramName ) ;^[CLASS] ParamMap Builder  [METHOD] get [RETURN_TYPE] Object   String paramName [VARIABLES] String  paramName  boolean  T  spec  Map  contents  ParamMapSpec  spec  
[buglab_swap_variables]^Preconditions.checkArgument ( spec.checkIfCompatible ( typeOfValue, key ) , "Incompatible key %s for type %s", key, typeOfValue ) ;^75^76^^^^74^78^Preconditions.checkArgument ( spec.checkIfCompatible ( key, typeOfValue ) , "Incompatible key %s for type %s", key, typeOfValue ) ;^[CLASS] ParamMap Builder  [METHOD] get [RETURN_TYPE] <T>   String key Type typeOfValue [VARIABLES] Type  typeOfValue  String  key  boolean  T  spec  Map  contents  ParamMapSpec  spec  
[buglab_swap_variables]^Preconditions.checkArgument ( spec.checkIfCompatible (  typeOfValue ) , "Incompatible key %s for type %s", key, typeOfValue ) ;^75^76^^^^74^78^Preconditions.checkArgument ( spec.checkIfCompatible ( key, typeOfValue ) , "Incompatible key %s for type %s", key, typeOfValue ) ;^[CLASS] ParamMap Builder  [METHOD] get [RETURN_TYPE] <T>   String key Type typeOfValue [VARIABLES] Type  typeOfValue  String  key  boolean  T  spec  Map  contents  ParamMapSpec  spec  
[buglab_swap_variables]^Preconditions.checkArgument ( spec.checkIfCompatible ( key ) , "Incompatible key %s for type %s", key, typeOfValue ) ;^75^76^^^^74^78^Preconditions.checkArgument ( spec.checkIfCompatible ( key, typeOfValue ) , "Incompatible key %s for type %s", key, typeOfValue ) ;^[CLASS] ParamMap Builder  [METHOD] get [RETURN_TYPE] <T>   String key Type typeOfValue [VARIABLES] Type  typeOfValue  String  key  boolean  T  spec  Map  contents  ParamMapSpec  spec  
[buglab_swap_variables]^Preconditions.checkArgument ( typeOfValue.checkIfCompatible ( key, spec ) , "Incompatible key %s for type %s", key, typeOfValue ) ;^75^76^^^^74^78^Preconditions.checkArgument ( spec.checkIfCompatible ( key, typeOfValue ) , "Incompatible key %s for type %s", key, typeOfValue ) ;^[CLASS] ParamMap Builder  [METHOD] get [RETURN_TYPE] <T>   String key Type typeOfValue [VARIABLES] Type  typeOfValue  String  key  boolean  T  spec  Map  contents  ParamMapSpec  spec  
[buglab_swap_variables]^return  ( T )  key.get ( contents ) ;^77^^^^^74^78^return  ( T )  contents.get ( key ) ;^[CLASS] ParamMap Builder  [METHOD] get [RETURN_TYPE] <T>   String key Type typeOfValue [VARIABLES] Type  typeOfValue  String  key  boolean  T  spec  Map  contents  ParamMapSpec  spec  
[buglab_swap_variables]^return headerName.getTypeFor ( spec ) ;^81^^^^^80^82^return spec.getTypeFor ( headerName ) ;^[CLASS] ParamMap Builder  [METHOD] getSpec [RETURN_TYPE] Type   String headerName [VARIABLES] String  headerName  boolean  T  spec  Map  contents  ParamMapSpec  spec  
[buglab_swap_variables]^return put ( content, paramName, content.getClass (  )  ) ;^37^^^^^36^38^return put ( paramName, content, content.getClass (  )  ) ;^[CLASS] Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content [VARIABLES] Object  content  String  paramName  boolean  T  spec  Map  contents  
[buglab_swap_variables]^return put (  content, content.getClass (  )  ) ;^37^^^^^36^38^return put ( paramName, content, content.getClass (  )  ) ;^[CLASS] Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content [VARIABLES] Object  content  String  paramName  boolean  T  spec  Map  contents  
[buglab_swap_variables]^return put ( paramName,  content.getClass (  )  ) ;^37^^^^^36^38^return put ( paramName, content, content.getClass (  )  ) ;^[CLASS] Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content [VARIABLES] Object  content  String  paramName  boolean  T  spec  Map  contents  
[buglab_swap_variables]^Preconditions.checkArgument ( paramName.checkIfCompatible ( spec, typeOfContent )  ) ;^41^^^^^40^44^Preconditions.checkArgument ( spec.checkIfCompatible ( paramName, typeOfContent )  ) ;^[CLASS] Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content Type typeOfContent [VARIABLES] Object  content  Type  typeOfContent  String  paramName  boolean  T  spec  Map  contents  
[buglab_swap_variables]^Preconditions.checkArgument ( spec.checkIfCompatible (  typeOfContent )  ) ;^41^^^^^40^44^Preconditions.checkArgument ( spec.checkIfCompatible ( paramName, typeOfContent )  ) ;^[CLASS] Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content Type typeOfContent [VARIABLES] Object  content  Type  typeOfContent  String  paramName  boolean  T  spec  Map  contents  
[buglab_swap_variables]^Preconditions.checkArgument ( typeOfContent.checkIfCompatible ( paramName, spec )  ) ;^41^^^^^40^44^Preconditions.checkArgument ( spec.checkIfCompatible ( paramName, typeOfContent )  ) ;^[CLASS] Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content Type typeOfContent [VARIABLES] Object  content  Type  typeOfContent  String  paramName  boolean  T  spec  Map  contents  
[buglab_swap_variables]^Preconditions.checkArgument ( spec.checkIfCompatible ( paramName )  ) ;^41^^^^^40^44^Preconditions.checkArgument ( spec.checkIfCompatible ( paramName, typeOfContent )  ) ;^[CLASS] Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content Type typeOfContent [VARIABLES] Object  content  Type  typeOfContent  String  paramName  boolean  T  spec  Map  contents  
[buglab_swap_variables]^Preconditions.checkArgument ( spec.checkIfCompatible ( typeOfContent, paramName )  ) ;^41^^^^^40^44^Preconditions.checkArgument ( spec.checkIfCompatible ( paramName, typeOfContent )  ) ;^[CLASS] Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content Type typeOfContent [VARIABLES] Object  content  Type  typeOfContent  String  paramName  boolean  T  spec  Map  contents  
[buglab_swap_variables]^contents.put ( content, paramName ) ;^42^^^^^40^44^contents.put ( paramName, content ) ;^[CLASS] Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content Type typeOfContent [VARIABLES] Object  content  Type  typeOfContent  String  paramName  boolean  T  spec  Map  contents  
[buglab_swap_variables]^contents.put (  content ) ;^42^^^^^40^44^contents.put ( paramName, content ) ;^[CLASS] Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content Type typeOfContent [VARIABLES] Object  content  Type  typeOfContent  String  paramName  boolean  T  spec  Map  contents  
[buglab_swap_variables]^contents.put ( paramName ) ;^42^^^^^40^44^contents.put ( paramName, content ) ;^[CLASS] Builder  [METHOD] put [RETURN_TYPE] ParamMap$Builder   String paramName Object content Type typeOfContent [VARIABLES] Object  content  Type  typeOfContent  String  paramName  boolean  T  spec  Map  contents  
[buglab_swap_variables]^contents.put ( param.getName (  ) , paramKey ) ;^47^^^^^46^49^contents.put ( paramKey.getName (  ) , param ) ;^[CLASS] Builder  [METHOD] put [RETURN_TYPE] <K>   TypedKey<K> paramKey K param [VARIABLES] K  param  boolean  T  spec  TypedKey  paramKey  Map  contents  
[buglab_swap_variables]^contents.put ( paramKey.getName (  )  ) ;^47^^^^^46^49^contents.put ( paramKey.getName (  ) , param ) ;^[CLASS] Builder  [METHOD] put [RETURN_TYPE] <K>   TypedKey<K> paramKey K param [VARIABLES] K  param  boolean  T  spec  TypedKey  paramKey  Map  contents  
