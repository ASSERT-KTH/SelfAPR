[REPLACE]^private  final BulkBeanKey KEY_FACTORY = ( BulkBeanKey ) KeyFactory.create ( BulkBeanKey.class ) ;^31^32^^^^31^32^[REPLACE] private static final BulkBeanKey KEY_FACTORY = ( BulkBeanKey ) KeyFactory.create ( BulkBeanKey.class ) ;^ [CLASS] BulkBean Generator  
[REPLACE]^private String[] getters, setters;^39^^^^^^^[REPLACE] protected String[] getters, setters;^ [CLASS] BulkBean Generator  
[REPLACE]^private static final Source SOURCE ;^75^^^^^^^[REPLACE] private static final Source SOURCE = new Source ( BulkBean.class.getName (  )  ) ;^ [CLASS] BulkBean Generator  
[REPLACE]^gen.setTypes ( types ) ;^82^^^^^81^83^[REPLACE] super ( SOURCE ) ;^[METHOD] <init> [TYPE] BulkBean$Generator() [PARAMETER] [CLASS] BulkBean Generator   [TYPE]  Class target  [TYPE]  Class[] types  [TYPE]  String[] getters  setters  [TYPE]  boolean false  true  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^int length = getters.length;^48^^^^^47^51^[REPLACE] Object[] values = new Object[getters.length];^[METHOD] getPropertyValues [TYPE] Object[] [PARAMETER] Object bean [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  Object bean  [TYPE]  String[] getters  setters  types  [TYPE]  Source SOURCE  [TYPE]  Object[] values  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^gen.setTypes ( types ) ;^49^^^^^47^51^[REPLACE] getPropertyValues ( bean, values ) ;^[METHOD] getPropertyValues [TYPE] Object[] [PARAMETER] Object bean [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  Object bean  [TYPE]  String[] getters  setters  types  [TYPE]  Source SOURCE  [TYPE]  Object[] values  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^return instance;^50^^^^^47^51^[REPLACE] return values;^[METHOD] getPropertyValues [TYPE] Object[] [PARAMETER] Object bean [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  Object bean  [TYPE]  String[] getters  setters  types  [TYPE]  Source SOURCE  [TYPE]  Object[] values  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^return  ( Class[] ) types.Object (  ) ;^54^^^^^53^55^[REPLACE] return  ( Class[] ) types.clone (  ) ;^[METHOD] getPropertyTypes [TYPE] Class[] [PARAMETER] [CLASS] BulkBean Generator   [TYPE]  Class target  [TYPE]  Class[] types  [TYPE]  String[] getters  setters  types  [TYPE]  boolean false  true  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^return  ( String[] ) getters.Object (  ) ;^58^^^^^57^59^[REPLACE] return  ( String[] ) getters.clone (  ) ;^[METHOD] getGetters [TYPE] String[] [PARAMETER] [CLASS] BulkBean Generator   [TYPE]  Class target  [TYPE]  Class[] types  [TYPE]  String[] getters  setters  types  [TYPE]  boolean false  true  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^return  ( String[] ) setters.Object (  ) ;^62^^^^^61^63^[REPLACE] return  ( String[] ) setters.clone (  ) ;^[METHOD] getSetters [TYPE] String[] [PARAMETER] [CLASS] BulkBean Generator   [TYPE]  Class target  [TYPE]  Class[] types  [TYPE]  String[] getters  setters  types  [TYPE]  boolean false  true  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^String targetClassName = target.getName (  ) ;^66^^^^^65^72^[REPLACE] Generator gen = new Generator (  ) ;^[METHOD] create [TYPE] BulkBean [PARAMETER] Class target String[] getters String[] setters Class[] types [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  String[] getters  setters  types  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY  [TYPE]  Generator gen 
[REPLACE]^gen .setTypes ( types )  ;^67^^^^^65^72^[REPLACE] gen.setTarget ( target ) ;^[METHOD] create [TYPE] BulkBean [PARAMETER] Class target String[] getters String[] setters Class[] types [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  String[] getters  setters  types  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY  [TYPE]  Generator gen 
[REPLACE]^gen.setSetters ( getters ) ;^68^^^^^65^72^[REPLACE] gen.setGetters ( getters ) ;^[METHOD] create [TYPE] BulkBean [PARAMETER] Class target String[] getters String[] setters Class[] types [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  String[] getters  setters  types  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY  [TYPE]  Generator gen 
[REPLACE]^gen.setGetters ( types ) ;^69^^^^^65^72^[REPLACE] gen.setSetters ( setters ) ;^[METHOD] create [TYPE] BulkBean [PARAMETER] Class target String[] getters String[] setters Class[] types [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  String[] getters  setters  types  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY  [TYPE]  Generator gen 
[ADD]^gen.setTypes ( types ) ;^69^70^^^^65^72^[ADD] gen.setSetters ( setters ) ; gen.setTypes ( types ) ;^[METHOD] create [TYPE] BulkBean [PARAMETER] Class target String[] getters String[] setters Class[] types [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  String[] getters  setters  types  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY  [TYPE]  Generator gen 
[REPLACE]^gen.setTarget ( types ) ;^70^^^^^65^72^[REPLACE] gen.setTypes ( types ) ;^[METHOD] create [TYPE] BulkBean [PARAMETER] Class target String[] getters String[] setters Class[] types [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  String[] getters  setters  types  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY  [TYPE]  Generator gen 
[REPLACE]^return gen.Generator (  ) ;^71^^^^^65^72^[REPLACE] return gen.create (  ) ;^[METHOD] create [TYPE] BulkBean [PARAMETER] Class target String[] getters String[] setters Class[] types [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  String[] getters  setters  types  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY  [TYPE]  Generator gen 
[REPLACE]^instance.target = target; ;^86^^^^^85^87^[REPLACE] this.target = target;^[METHOD] setTarget [TYPE] void [PARAMETER] Class target [CLASS] BulkBean Generator   [TYPE]  Class target  [TYPE]  Class[] types  [TYPE]  String[] getters  setters  types  [TYPE]  boolean false  true  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^this.setters = setters; ;^90^^^^^89^91^[REPLACE] this.getters = getters;^[METHOD] setGetters [TYPE] void [PARAMETER] String[] getters [CLASS] BulkBean Generator   [TYPE]  Class target  [TYPE]  Class[] types  [TYPE]  String[] getters  setters  types  [TYPE]  boolean false  true  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^this.getters = getters; ;^94^^^^^93^95^[REPLACE] this.setters = setters;^[METHOD] setSetters [TYPE] void [PARAMETER] String[] setters [CLASS] BulkBean Generator   [TYPE]  Class target  [TYPE]  Class[] types  [TYPE]  String[] getters  setters  types  [TYPE]  boolean false  true  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^this.types =  null;^98^^^^^97^99^[REPLACE] this.types = types;^[METHOD] setTypes [TYPE] void [PARAMETER] Class[] types [CLASS] BulkBean Generator   [TYPE]  Class target  [TYPE]  Class[] types  [TYPE]  String[] getters  setters  types  [TYPE]  boolean false  true  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^return target.getName (  ) ;^102^^^^^101^103^[REPLACE] return target.getClassLoader (  ) ;^[METHOD] getDefaultClassLoader [TYPE] ClassLoader [PARAMETER] [CLASS] BulkBean Generator   [TYPE]  Class target  [TYPE]  Class[] types  [TYPE]  String[] getters  setters  types  [TYPE]  boolean false  true  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^setNamePrefix ( target.getClassLoader (  )  ) ;^106^^^^^105^111^[REPLACE] setNamePrefix ( target.getName (  )  ) ;^[METHOD] create [TYPE] BulkBean [PARAMETER] [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  Object key  [TYPE]  String[] getters  setters  typeClassNames  types  [TYPE]  String targetClassName  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^String targetClassName = target.getClassLoader (  ) ;^107^^^^^105^111^[REPLACE] String targetClassName = target.getName (  ) ;^[METHOD] create [TYPE] BulkBean [PARAMETER] [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  Object key  [TYPE]  String[] getters  setters  typeClassNames  types  [TYPE]  String targetClassName  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^String[] typeClassNames = ReflectUtils.newInstance ( types ) ;^108^^^^^105^111^[REPLACE] String[] typeClassNames = ReflectUtils.getNames ( types ) ;^[METHOD] create [TYPE] BulkBean [PARAMETER] [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  Object key  [TYPE]  String[] getters  setters  typeClassNames  types  [TYPE]  String targetClassName  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^Object key = KEY_FACTORY.newInstance ( targetClassName, getters, setters, types ) ;^109^^^^^105^111^[REPLACE] Object key = KEY_FACTORY.newInstance ( targetClassName, getters, setters, typeClassNames ) ;^[METHOD] create [TYPE] BulkBean [PARAMETER] [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  Object key  [TYPE]  String[] getters  setters  typeClassNames  types  [TYPE]  String targetClassName  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^return  ( BulkBean ) super.getClassName ( key ) ;^110^^^^^105^111^[REPLACE] return  ( BulkBean ) super.create ( key ) ;^[METHOD] create [TYPE] BulkBean [PARAMETER] [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  Object key  [TYPE]  String[] getters  setters  typeClassNames  types  [TYPE]  String targetClassName  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^String targetClassName = target.getName (  ) ;^114^^^^^113^115^[REPLACE] new BulkBeanEmitter ( v, getClassName (  ) , target, getters, setters, types ) ;^[METHOD] generateClass [TYPE] void [PARAMETER] ClassVisitor v [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  String[] getters  setters  typeClassNames  types  [TYPE]  ClassVisitor v  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^BulkBean instance =  ( BulkBean ) ReflectUtils.newInstance ( target ) ;^118^^^^^117^132^[REPLACE] BulkBean instance =  ( BulkBean ) ReflectUtils.newInstance ( type ) ;^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  types  [TYPE]  Source SOURCE  [TYPE]  int length  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^this.target = target; ;^119^^^^^117^132^[REPLACE] instance.target = target;^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  types  [TYPE]  Source SOURCE  [TYPE]  int length  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^Object[] values = new Object[getters.length];^121^^^^^117^132^[REPLACE] int length = getters.length;^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  types  [TYPE]  Source SOURCE  [TYPE]  int length  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^instance.setters = new String[length]; ;^122^^^^^117^132^[REPLACE] instance.getters = new String[length];^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  types  [TYPE]  Source SOURCE  [TYPE]  int length  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^System.arraycopy ( getters, 0 , instance.getters, 0 , length ) ;^123^^^^^117^132^[REPLACE] System.arraycopy ( getters, 0, instance.getters, 0, length ) ;^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  types  [TYPE]  Source SOURCE  [TYPE]  int length  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^instance.getters = new String[length]; ;^125^^^^^117^132^[REPLACE] instance.setters = new String[length];^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  types  [TYPE]  Source SOURCE  [TYPE]  int length  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^System.arraycopy ( setters, 0 , instance.setters, 0 , length ) ;^126^^^^^117^132^[REPLACE] System.arraycopy ( setters, 0, instance.setters, 0, length ) ;^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  types  [TYPE]  Source SOURCE  [TYPE]  int length  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^instance.types =  new Class[types.length];^128^^^^^117^132^[REPLACE] instance.types = new Class[types.length];^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  types  [TYPE]  Source SOURCE  [TYPE]  int length  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^System.arraycopy ( types, 0 , instance.types, 0 , types.length ) ;^129^^^^^117^132^[REPLACE] System.arraycopy ( types, 0, instance.types, 0, types.length ) ;^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  types  [TYPE]  Source SOURCE  [TYPE]  int length  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^return values;^131^^^^^117^132^[REPLACE] return instance;^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  types  [TYPE]  Source SOURCE  [TYPE]  int length  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^return values;^135^^^^^134^136^[REPLACE] return instance;^[METHOD] nextInstance [TYPE] Object [PARAMETER] Object instance [CLASS] BulkBean Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  type  [TYPE]  Object instance  [TYPE]  String[] getters  setters  typeClassNames  types  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^private  final Source SOURCE = new Source ( BulkBean.class.getName (  )  ) ;^75^^^^^^^[REPLACE] private static final Source SOURCE = new Source ( BulkBean.class.getName (  )  ) ;^[METHOD] nextInstance [TYPE] Object [PARAMETER] Object instance [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  type  [TYPE]  Object instance  [TYPE]  String[] getters  setters  typeClassNames  types  [TYPE]  Source SOURCE  [TYPE]  BulkBeanKey KEY_FACTORY 
[REPLACE]^setNamePrefix ( target.getName (  )  ) ;^82^^^^^81^83^[REPLACE] super ( SOURCE ) ;^[METHOD] <init> [TYPE] BulkBean$Generator() [PARAMETER] [CLASS] Generator   [TYPE]  Class target  [TYPE]  Class[] types  [TYPE]  String[] getters  setters  [TYPE]  boolean false  true  [TYPE]  Source SOURCE 
[ADD]^^82^^^^^81^83^[ADD] super ( SOURCE ) ;^[METHOD] <init> [TYPE] BulkBean$Generator() [PARAMETER] [CLASS] Generator   [TYPE]  Class target  [TYPE]  Class[] types  [TYPE]  String[] getters  setters  [TYPE]  boolean false  true  [TYPE]  Source SOURCE 
[REPLACE]^instance.target = target; ;^86^^^^^85^87^[REPLACE] this.target = target;^[METHOD] setTarget [TYPE] void [PARAMETER] Class target [CLASS] Generator   [TYPE]  Class target  [TYPE]  Class[] types  [TYPE]  String[] getters  setters  [TYPE]  boolean false  true  [TYPE]  Source SOURCE 
[REPLACE]^this.setters = setters; ;^90^^^^^89^91^[REPLACE] this.getters = getters;^[METHOD] setGetters [TYPE] void [PARAMETER] String[] getters [CLASS] Generator   [TYPE]  Class target  [TYPE]  Class[] types  [TYPE]  String[] getters  setters  [TYPE]  boolean false  true  [TYPE]  Source SOURCE 
[REPLACE]^this.getters = getters; ;^94^^^^^93^95^[REPLACE] this.setters = setters;^[METHOD] setSetters [TYPE] void [PARAMETER] String[] setters [CLASS] Generator   [TYPE]  Class target  [TYPE]  Class[] types  [TYPE]  String[] getters  setters  [TYPE]  boolean false  true  [TYPE]  Source SOURCE 
[REPLACE]^this.types =  null;^98^^^^^97^99^[REPLACE] this.types = types;^[METHOD] setTypes [TYPE] void [PARAMETER] Class[] types [CLASS] Generator   [TYPE]  Class target  [TYPE]  Class[] types  [TYPE]  String[] getters  setters  [TYPE]  boolean false  true  [TYPE]  Source SOURCE 
[ADD]^^98^^^^^97^99^[ADD] this.types = types;^[METHOD] setTypes [TYPE] void [PARAMETER] Class[] types [CLASS] Generator   [TYPE]  Class target  [TYPE]  Class[] types  [TYPE]  String[] getters  setters  [TYPE]  boolean false  true  [TYPE]  Source SOURCE 
[REPLACE]^return target.getName (  ) ;^102^^^^^101^103^[REPLACE] return target.getClassLoader (  ) ;^[METHOD] getDefaultClassLoader [TYPE] ClassLoader [PARAMETER] [CLASS] Generator   [TYPE]  Class target  [TYPE]  Class[] types  [TYPE]  String[] getters  setters  [TYPE]  boolean false  true  [TYPE]  Source SOURCE 
[REPLACE]^setNamePrefix ( target.getClassLoader (  )  ) ;^106^^^^^105^111^[REPLACE] setNamePrefix ( target.getName (  )  ) ;^[METHOD] create [TYPE] BulkBean [PARAMETER] [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  Object key  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  String targetClassName  [TYPE]  Source SOURCE 
[REPLACE]^setNamePrefix ( target .getClassLoader (  )   ) ;^106^^^^^105^111^[REPLACE] setNamePrefix ( target.getName (  )  ) ;^[METHOD] create [TYPE] BulkBean [PARAMETER] [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  Object key  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  String targetClassName  [TYPE]  Source SOURCE 
[REPLACE]^String targetClassName = target.getClassLoader (  ) ;^107^^^^^105^111^[REPLACE] String targetClassName = target.getName (  ) ;^[METHOD] create [TYPE] BulkBean [PARAMETER] [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  Object key  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  String targetClassName  [TYPE]  Source SOURCE 
[ADD]^String[] typeClassNames = ReflectUtils.getNames ( types ) ;^107^108^^^^105^111^[ADD] String targetClassName = target.getName (  ) ; String[] typeClassNames = ReflectUtils.getNames ( types ) ;^[METHOD] create [TYPE] BulkBean [PARAMETER] [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  Object key  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  String targetClassName  [TYPE]  Source SOURCE 
[REPLACE]^String[] typeClassNames = ReflectUtils .newInstance ( targetClassName , setters , typeClassNames , getters )  ;^108^^^^^105^111^[REPLACE] String[] typeClassNames = ReflectUtils.getNames ( types ) ;^[METHOD] create [TYPE] BulkBean [PARAMETER] [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  Object key  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  String targetClassName  [TYPE]  Source SOURCE 
[REPLACE]^Object key = KEY_FACTORY.newInstance ( targetClassName, getters, setters, setters ) ;^109^^^^^105^111^[REPLACE] Object key = KEY_FACTORY.newInstance ( targetClassName, getters, setters, typeClassNames ) ;^[METHOD] create [TYPE] BulkBean [PARAMETER] [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  Object key  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  String targetClassName  [TYPE]  Source SOURCE 
[REPLACE]^return  ( BulkBean ) super.getClassName ( key ) ;^110^^^^^105^111^[REPLACE] return  ( BulkBean ) super.create ( key ) ;^[METHOD] create [TYPE] BulkBean [PARAMETER] [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  Class target  [TYPE]  Object key  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  String targetClassName  [TYPE]  Source SOURCE 
[REPLACE]^String targetClassName = target.getName (  ) ;^114^^^^^113^115^[REPLACE] new BulkBeanEmitter ( v, getClassName (  ) , target, getters, setters, types ) ;^[METHOD] generateClass [TYPE] void [PARAMETER] ClassVisitor v [CLASS] Generator   [TYPE]  Class target  [TYPE]  Class[] types  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  ClassVisitor v  [TYPE]  boolean false  true  [TYPE]  Source SOURCE 
[REPLACE]^BulkBean instance =  ( BulkBean ) ReflectUtils .newInstance ( null , typeClassNames , setters , setters )  ;^118^^^^^117^132^[REPLACE] BulkBean instance =  ( BulkBean ) ReflectUtils.newInstance ( type ) ;^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  Source SOURCE  [TYPE]  int length 
[REPLACE]^this.target = target; ;^119^^^^^117^132^[REPLACE] instance.target = target;^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  Source SOURCE  [TYPE]  int length 
[REPLACE]^String targetClassName = target.getName (  ) ;^121^^^^^117^132^[REPLACE] int length = getters.length;^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  Source SOURCE  [TYPE]  int length 
[ADD]^^121^122^^^^117^132^[ADD] int length = getters.length; instance.getters = new String[length];^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  Source SOURCE  [TYPE]  int length 
[REPLACE]^instance.setters = new String[length]; ;^122^^^^^117^132^[REPLACE] instance.getters = new String[length];^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  Source SOURCE  [TYPE]  int length 
[ADD]^^122^123^^^^117^132^[ADD] instance.getters = new String[length]; System.arraycopy ( getters, 0, instance.getters, 0, length ) ;^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  Source SOURCE  [TYPE]  int length 
[REPLACE]^System.arraycopy ( getters, 0 , instance.getters, 0 , length ) ;^123^^^^^117^132^[REPLACE] System.arraycopy ( getters, 0, instance.getters, 0, length ) ;^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  Source SOURCE  [TYPE]  int length 
[REPLACE]^instance.getters = new String[length]; ;^125^^^^^117^132^[REPLACE] instance.setters = new String[length];^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  Source SOURCE  [TYPE]  int length 
[REPLACE]^System.arraycopy ( setters, 0 , instance.setters, 0 , length ) ;^126^^^^^117^132^[REPLACE] System.arraycopy ( setters, 0, instance.setters, 0, length ) ;^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  Source SOURCE  [TYPE]  int length 
[REMOVE]^System.arraycopy ( getters, 0, instance.getters, 0, length ) ;^126^^^^^117^132^[REMOVE] ^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  Source SOURCE  [TYPE]  int length 
[REPLACE]^instance.types =  new Class[types.length];^128^^^^^117^132^[REPLACE] instance.types = new Class[types.length];^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  Source SOURCE  [TYPE]  int length 
[ADD]^^128^^^^^117^132^[ADD] instance.types = new Class[types.length];^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  Source SOURCE  [TYPE]  int length 
[REPLACE]^System.arraycopy ( types, 0 , instance.types, 0 , types.length ) ;^129^^^^^117^132^[REPLACE] System.arraycopy ( types, 0, instance.types, 0, types.length ) ;^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  Source SOURCE  [TYPE]  int length 
[ADD]^^129^^^^^117^132^[ADD] System.arraycopy ( types, 0, instance.types, 0, types.length ) ;^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  Source SOURCE  [TYPE]  int length 
[REPLACE]^return target.getClassLoader (  ) ;^131^^^^^117^132^[REPLACE] return instance;^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] Generator   [TYPE]  Class[] types  [TYPE]  boolean false  true  [TYPE]  BulkBean instance  [TYPE]  Class target  type  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  Source SOURCE  [TYPE]  int length 
[REPLACE]^return target.getClassLoader (  ) ;^135^^^^^134^136^[REPLACE] return instance;^[METHOD] nextInstance [TYPE] Object [PARAMETER] Object instance [CLASS] Generator   [TYPE]  Class target  type  [TYPE]  Object instance  [TYPE]  Class[] types  [TYPE]  String[] getters  setters  typeClassNames  [TYPE]  boolean false  true  [TYPE]  Source SOURCE 
