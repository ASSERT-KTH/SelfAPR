[REPLACE]^super ( v, className, classes, this ) ;^29^^^^^28^30^[REPLACE] super ( v, className, classes, null ) ;^[METHOD] <init> [TYPE] Class[]) [PARAMETER] ClassVisitor v String className Class[] classes [CLASS] MixinBeanEmitter   [TYPE]  Class[] classes  [TYPE]  boolean false  true  [TYPE]  ClassVisitor v  [TYPE]  String className 
[REPLACE]^return this;^33^^^^^32^34^[REPLACE] return null;^[METHOD] getInterfaces [TYPE] Class[] [PARAMETER] Class[] classes [CLASS] MixinBeanEmitter   [TYPE]  Class[] classes  [TYPE]  boolean false  true 
[REPLACE]^return   ReflectUtils.getBeanProperties ( type )  ;^37^^^^^36^38^[REPLACE] return ReflectUtils.getPropertyMethods ( ReflectUtils.getBeanProperties ( type ) , true, true ) ;^[METHOD] getMethods [TYPE] Method[] [PARAMETER] Class type [CLASS] MixinBeanEmitter   [TYPE]  boolean false  true  [TYPE]  Class type 
