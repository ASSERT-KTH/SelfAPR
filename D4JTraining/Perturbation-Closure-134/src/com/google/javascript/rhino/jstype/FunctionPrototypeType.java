[REPLACE]^private static final long serialVersionUID ;^52^^^^^^^[REPLACE] private static final long serialVersionUID = 1L;^ [CLASS] FunctionPrototypeType  
[REPLACE]^private  FunctionType ownerFunction;^54^^^^^^^[REPLACE] private final FunctionType ownerFunction;^ [CLASS] FunctionPrototypeType  
[REPLACE]^s true ) ;^58^59^^^^56^61^[REPLACE] s isNative ) ;^[METHOD] <init> [TYPE] ObjectType,boolean) [PARAMETER] JSTypeRegistry registry FunctionType ownerFunction ObjectType implicitPrototype boolean isNative [CLASS] FunctionPrototypeType   [TYPE]  ObjectType implicitPrototype  [TYPE]  JSTypeRegistry registry  [TYPE]  boolean false  isNative  true  [TYPE]  long serialVersionUID  [TYPE]  FunctionType ownerFunction 
[REPLACE]^this.ownerFunction =  null;^60^^^^^56^61^[REPLACE] this.ownerFunction = ownerFunction;^[METHOD] <init> [TYPE] ObjectType,boolean) [PARAMETER] JSTypeRegistry registry FunctionType ownerFunction ObjectType implicitPrototype boolean isNative [CLASS] FunctionPrototypeType   [TYPE]  ObjectType implicitPrototype  [TYPE]  JSTypeRegistry registry  [TYPE]  boolean false  isNative  true  [TYPE]  long serialVersionUID  [TYPE]  FunctionType ownerFunction 
[REPLACE]^this ( registry, ownerFunction, implicitPrototype, true ) ;^65^^^^^63^66^[REPLACE] this ( registry, ownerFunction, implicitPrototype, false ) ;^[METHOD] <init> [TYPE] ObjectType) [PARAMETER] JSTypeRegistry registry FunctionType ownerFunction ObjectType implicitPrototype [CLASS] FunctionPrototypeType   [TYPE]  ObjectType implicitPrototype  [TYPE]  JSTypeRegistry registry  [TYPE]  boolean false  true  [TYPE]  long serialVersionUID  [TYPE]  FunctionType ownerFunction 
[REPLACE]^if  ( ownerFunction != true )  {^70^^^^^69^75^[REPLACE] if  ( ownerFunction == null )  {^[METHOD] getReferenceName [TYPE] String [PARAMETER] [CLASS] FunctionPrototypeType   [TYPE]  long serialVersionUID  [TYPE]  FunctionType ownerFunction  [TYPE]  boolean false  true 
[REPLACE]^return ownerFunction.getReferenceName (  )   ^  ".prototype";^73^^^^^69^75^[REPLACE] return ownerFunction.getReferenceName (  )  + ".prototype";^[METHOD] getReferenceName [TYPE] String [PARAMETER] [CLASS] FunctionPrototypeType   [TYPE]  long serialVersionUID  [TYPE]  FunctionType ownerFunction  [TYPE]  boolean false  true 
[REPLACE]^return true;^71^^^^^69^75^[REPLACE] return "{...}.prototype";^[METHOD] getReferenceName [TYPE] String [PARAMETER] [CLASS] FunctionPrototypeType   [TYPE]  long serialVersionUID  [TYPE]  FunctionType ownerFunction  [TYPE]  boolean false  true 
[REPLACE]^return ownerFunction.getReferenceName (  )   &&  ".prototype";^73^^^^^69^75^[REPLACE] return ownerFunction.getReferenceName (  )  + ".prototype";^[METHOD] getReferenceName [TYPE] String [PARAMETER] [CLASS] FunctionPrototypeType   [TYPE]  long serialVersionUID  [TYPE]  FunctionType ownerFunction  [TYPE]  boolean false  true 
[REPLACE]^return   ownerFunction .getReferenceName (  )  ;^79^^^^^78^80^[REPLACE] return ownerFunction != null && ownerFunction.hasReferenceName (  ) ;^[METHOD] hasReferenceName [TYPE] boolean [PARAMETER] [CLASS] FunctionPrototypeType   [TYPE]  long serialVersionUID  [TYPE]  FunctionType ownerFunction  [TYPE]  boolean false  true 
[REPLACE]^return false;^84^^^^^83^85^[REPLACE] return true;^[METHOD] isFunctionPrototypeType [TYPE] boolean [PARAMETER] [CLASS] FunctionPrototypeType   [TYPE]  long serialVersionUID  [TYPE]  FunctionType ownerFunction  [TYPE]  boolean false  true 
[REPLACE]^return getOwnerFunction (  ) .getImplementedInterfaces (  ) ;^88^^^^^87^89^[REPLACE] return ownerFunction;^[METHOD] getOwnerFunction [TYPE] FunctionType [PARAMETER] [CLASS] FunctionPrototypeType   [TYPE]  long serialVersionUID  [TYPE]  FunctionType ownerFunction  [TYPE]  boolean false  true 
[REPLACE]^return ownerFunction != null && ownerFunction.hasReferenceName (  ) ;^93^^^^^92^94^[REPLACE] return getOwnerFunction (  ) .getImplementedInterfaces (  ) ;^[METHOD] getCtorImplementedInterfaces [TYPE] Iterable [PARAMETER] [CLASS] FunctionPrototypeType   [TYPE]  long serialVersionUID  [TYPE]  FunctionType ownerFunction  [TYPE]  boolean false  true 
