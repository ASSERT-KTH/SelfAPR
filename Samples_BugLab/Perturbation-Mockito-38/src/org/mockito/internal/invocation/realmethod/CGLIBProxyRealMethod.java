[buglab_swap_variables]^return methodProxy.invokeSuper ( arguments, target ) ;^19^^^^^18^20^return methodProxy.invokeSuper ( target, arguments ) ;^[CLASS] CGLIBProxyRealMethod  [METHOD] invoke [RETURN_TYPE] Object   Object target Object[] arguments [VARIABLES] MethodProxy  methodProxy  Object  target  boolean  Object[]  arguments  
[buglab_swap_variables]^return methodProxy.invokeSuper (  arguments ) ;^19^^^^^18^20^return methodProxy.invokeSuper ( target, arguments ) ;^[CLASS] CGLIBProxyRealMethod  [METHOD] invoke [RETURN_TYPE] Object   Object target Object[] arguments [VARIABLES] MethodProxy  methodProxy  Object  target  boolean  Object[]  arguments  
[buglab_swap_variables]^return methodProxy.invokeSuper ( target ) ;^19^^^^^18^20^return methodProxy.invokeSuper ( target, arguments ) ;^[CLASS] CGLIBProxyRealMethod  [METHOD] invoke [RETURN_TYPE] Object   Object target Object[] arguments [VARIABLES] MethodProxy  methodProxy  Object  target  boolean  Object[]  arguments  
[buglab_swap_variables]^return target.invokeSuper ( methodProxy, arguments ) ;^19^^^^^18^20^return methodProxy.invokeSuper ( target, arguments ) ;^[CLASS] CGLIBProxyRealMethod  [METHOD] invoke [RETURN_TYPE] Object   Object target Object[] arguments [VARIABLES] MethodProxy  methodProxy  Object  target  boolean  Object[]  arguments  
[buglab_swap_variables]^return arguments.invokeSuper ( target, methodProxy ) ;^19^^^^^18^20^return methodProxy.invokeSuper ( target, arguments ) ;^[CLASS] CGLIBProxyRealMethod  [METHOD] invoke [RETURN_TYPE] Object   Object target Object[] arguments [VARIABLES] MethodProxy  methodProxy  Object  target  boolean  Object[]  arguments  
