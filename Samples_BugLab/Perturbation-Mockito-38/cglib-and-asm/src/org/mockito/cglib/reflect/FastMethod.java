[buglab_swap_variables]^super ( method, fc, helper ( fc, method )  ) ;^24^^^^^23^25^super ( fc, method, helper ( fc, method )  ) ;^[CLASS] FastMethod  [METHOD] <init> [RETURN_TYPE] Method)   FastClass fc Method method [VARIABLES] boolean  FastClass  fc  Method  method  
[buglab_swap_variables]^super (  method, helper ( fc, method )  ) ;^24^^^^^23^25^super ( fc, method, helper ( fc, method )  ) ;^[CLASS] FastMethod  [METHOD] <init> [RETURN_TYPE] Method)   FastClass fc Method method [VARIABLES] boolean  FastClass  fc  Method  method  
[buglab_swap_variables]^super ( fc,  helper ( fc, method )  ) ;^24^^^^^23^25^super ( fc, method, helper ( fc, method )  ) ;^[CLASS] FastMethod  [METHOD] <init> [RETURN_TYPE] Method)   FastClass fc Method method [VARIABLES] boolean  FastClass  fc  Method  method  
[buglab_swap_variables]^int index = method.getIndex ( fc.getName (  ) , method.getParameterTypes (  )  ) ;^28^^^^^27^38^int index = fc.getIndex ( method.getName (  ) , method.getParameterTypes (  )  ) ;^[CLASS] FastMethod  [METHOD] helper [RETURN_TYPE] int   FastClass fc Method method [VARIABLES] Class[]  types  boolean  FastClass  fc  Method  method  int  i  index  
[buglab_swap_variables]^int index = fc.getIndex ( method.getName (  ) .getParameterTypes (  )  ) ;^28^^^^^27^38^int index = fc.getIndex ( method.getName (  ) , method.getParameterTypes (  )  ) ;^[CLASS] FastMethod  [METHOD] helper [RETURN_TYPE] int   FastClass fc Method method [VARIABLES] Class[]  types  boolean  FastClass  fc  Method  method  int  i  index  
[buglab_swap_variables]^if  ( i < 0 )  {^29^^^^^27^38^if  ( index < 0 )  {^[CLASS] FastMethod  [METHOD] helper [RETURN_TYPE] int   FastClass fc Method method [VARIABLES] Class[]  types  boolean  FastClass  fc  Method  method  int  i  index  
[buglab_swap_variables]^for  ( types.lengthnt i = 0; i < i; i++ )  {^32^^^^^27^38^for  ( int i = 0; i < types.length; i++ )  {^[CLASS] FastMethod  [METHOD] helper [RETURN_TYPE] int   FastClass fc Method method [VARIABLES] Class[]  types  boolean  FastClass  fc  Method  method  int  i  index  
[buglab_swap_variables]^for  ( typesnt i = 0; i < i.length; i++ )  {^32^^^^^27^38^for  ( int i = 0; i < types.length; i++ )  {^[CLASS] FastMethod  [METHOD] helper [RETURN_TYPE] int   FastClass fc Method method [VARIABLES] Class[]  types  boolean  FastClass  fc  Method  method  int  i  index  
[buglab_swap_variables]^for  ( int i = 0; i < types; i++ )  {^32^^^^^27^38^for  ( int i = 0; i < types.length; i++ )  {^[CLASS] FastMethod  [METHOD] helper [RETURN_TYPE] int   FastClass fc Method method [VARIABLES] Class[]  types  boolean  FastClass  fc  Method  method  int  i  index  
[buglab_swap_variables]^System.err.println ( "  i[" + types + "]=" + types[i].getName (  )  ) ;^33^^^^^27^38^System.err.println ( "  types[" + i + "]=" + types[i].getName (  )  ) ;^[CLASS] FastMethod  [METHOD] helper [RETURN_TYPE] int   FastClass fc Method method [VARIABLES] Class[]  types  boolean  FastClass  fc  Method  method  int  i  index  
[buglab_swap_variables]^System.err.println ( "hash=" + types.getName (  ) .hashCode (  )  + " size=" + method.length ) ;^31^^^^^27^38^System.err.println ( "hash=" + method.getName (  ) .hashCode (  )  + " size=" + types.length ) ;^[CLASS] FastMethod  [METHOD] helper [RETURN_TYPE] int   FastClass fc Method method [VARIABLES] Class[]  types  boolean  FastClass  fc  Method  method  int  i  index  
[buglab_swap_variables]^System.err.println ( "hash=" + types.length.getName (  ) .hashCode (  )  + " size=" + method ) ;^31^^^^^27^38^System.err.println ( "hash=" + method.getName (  ) .hashCode (  )  + " size=" + types.length ) ;^[CLASS] FastMethod  [METHOD] helper [RETURN_TYPE] int   FastClass fc Method method [VARIABLES] Class[]  types  boolean  FastClass  fc  Method  method  int  i  index  
[buglab_swap_variables]^for  ( int i = 0; i < types.length.length; i++ )  {^32^^^^^27^38^for  ( int i = 0; i < types.length; i++ )  {^[CLASS] FastMethod  [METHOD] helper [RETURN_TYPE] int   FastClass fc Method method [VARIABLES] Class[]  types  boolean  FastClass  fc  Method  method  int  i  index  
[buglab_swap_variables]^return obj.invoke ( index, fc, args ) ;^53^^^^^52^54^return fc.invoke ( index, obj, args ) ;^[CLASS] FastMethod  [METHOD] invoke [RETURN_TYPE] Object   Object obj Object[] args [VARIABLES] boolean  Object  obj  Object[]  args  
[buglab_swap_variables]^return fc.invoke ( index,  args ) ;^53^^^^^52^54^return fc.invoke ( index, obj, args ) ;^[CLASS] FastMethod  [METHOD] invoke [RETURN_TYPE] Object   Object obj Object[] args [VARIABLES] boolean  Object  obj  Object[]  args  
[buglab_swap_variables]^return fc.invoke ( index, args, obj ) ;^53^^^^^52^54^return fc.invoke ( index, obj, args ) ;^[CLASS] FastMethod  [METHOD] invoke [RETURN_TYPE] Object   Object obj Object[] args [VARIABLES] boolean  Object  obj  Object[]  args  
[buglab_swap_variables]^return fc.invoke ( index, obj ) ;^53^^^^^52^54^return fc.invoke ( index, obj, args ) ;^[CLASS] FastMethod  [METHOD] invoke [RETURN_TYPE] Object   Object obj Object[] args [VARIABLES] boolean  Object  obj  Object[]  args  
[buglab_swap_variables]^return index.invoke ( fc, obj, args ) ;^53^^^^^52^54^return fc.invoke ( index, obj, args ) ;^[CLASS] FastMethod  [METHOD] invoke [RETURN_TYPE] Object   Object obj Object[] args [VARIABLES] boolean  Object  obj  Object[]  args  
[buglab_swap_variables]^return fc.invoke (  obj, args ) ;^53^^^^^52^54^return fc.invoke ( index, obj, args ) ;^[CLASS] FastMethod  [METHOD] invoke [RETURN_TYPE] Object   Object obj Object[] args [VARIABLES] boolean  Object  obj  Object[]  args  
[buglab_swap_variables]^return fc.invoke ( obj, index, args ) ;^53^^^^^52^54^return fc.invoke ( index, obj, args ) ;^[CLASS] FastMethod  [METHOD] invoke [RETURN_TYPE] Object   Object obj Object[] args [VARIABLES] boolean  Object  obj  Object[]  args  
[buglab_swap_variables]^return fc.invoke ( args, obj, index ) ;^53^^^^^52^54^return fc.invoke ( index, obj, args ) ;^[CLASS] FastMethod  [METHOD] invoke [RETURN_TYPE] Object   Object obj Object[] args [VARIABLES] boolean  Object  obj  Object[]  args  
