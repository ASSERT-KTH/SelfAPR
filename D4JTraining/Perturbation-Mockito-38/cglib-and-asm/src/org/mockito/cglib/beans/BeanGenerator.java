[REPLACE]^private static final Source SOURCE ;^30^^^^^^^[REPLACE] private static final Source SOURCE = new Source ( BeanGenerator.class.getName (  )  ) ;^ [CLASS] BeanGenerator  
[REPLACE]^private  final BeanGeneratorKey KEY_FACTORY = ( BeanGeneratorKey ) KeyFactory.create ( BeanGeneratorKey.class ) ;^31^32^^^^31^32^[REPLACE] private static final BeanGeneratorKey KEY_FACTORY = ( BeanGeneratorKey ) KeyFactory.create ( BeanGeneratorKey.class ) ;^ [CLASS] BeanGenerator  
[REPLACE]^private Map props  = null ;^39^^^^^^^[REPLACE] private Map props = new HashMap (  ) ;^ [CLASS] BeanGenerator  
[REPLACE]^Class protoclass =  ( instance instanceof Class )  ?  ( Class ) instance : instance.getClass (  ) ;^43^^^^^42^44^[REPLACE] super ( SOURCE ) ;^[METHOD] <init> [TYPE] BeanGenerator() [PARAMETER] [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^if  (  superclass.equals ( Object.class )  )  {^53^^^^^52^57^[REPLACE] if  ( superclass != null && superclass.equals ( Object.class )  )  {^[METHOD] setSuperclass [TYPE] void [PARAMETER] Class superclass [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^superclass = false;^54^^^^^52^57^[REPLACE] superclass = null;^[METHOD] setSuperclass [TYPE] void [PARAMETER] Class superclass [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^superclass = this;^54^^^^^52^57^[REPLACE] superclass = null;^[METHOD] setSuperclass [TYPE] void [PARAMETER] Class superclass [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^this.superclass =  null;^56^^^^^52^57^[REPLACE] this.superclass = superclass;^[METHOD] setSuperclass [TYPE] void [PARAMETER] Class superclass [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^if  ( superclass != null && superclass.equals ( Object.class )  )  {^60^^^^^59^64^[REPLACE] if  ( props.containsKey ( name )  )  {^[METHOD] addProperty [TYPE] void [PARAMETER] String name Class type [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  String name  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^return ;^61^^^^^59^64^[REPLACE] throw new IllegalArgumentException  (" ")  ;^[METHOD] addProperty [TYPE] void [PARAMETER] String name Class type [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  String name  [TYPE]  Map props  [TYPE]  Source SOURCE 
[ADD]^^61^^^^^59^64^[ADD] throw new IllegalArgumentException  (" ")  ;^[METHOD] addProperty [TYPE] void [PARAMETER] String name Class type [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  String name  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^props.put ( name, Type.getType ( superclass )  ) ;^63^^^^^59^64^[REPLACE] props.put ( name, Type.getType ( type )  ) ;^[METHOD] addProperty [TYPE] void [PARAMETER] String name Class type [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  String name  [TYPE]  Map props  [TYPE]  Source SOURCE 
[ADD]^^63^^^^^59^64^[ADD] props.put ( name, Type.getType ( type )  ) ;^[METHOD] addProperty [TYPE] void [PARAMETER] String name Class type [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  String name  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^if  ( superclass == this )  {^67^^^^^66^72^[REPLACE] if  ( superclass != null )  {^[METHOD] getDefaultClassLoader [TYPE] ClassLoader [PARAMETER] [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[ADD]^return superclass.getClassLoader (  ) ;return null;^67^68^69^70^71^66^72^[ADD] if  ( superclass != null )  { return superclass.getClassLoader (  ) ; } else { return null; }^[METHOD] getDefaultClassLoader [TYPE] ClassLoader [PARAMETER] [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^return true;^70^^^^^66^72^[REPLACE] return null;^[METHOD] getDefaultClassLoader [TYPE] ClassLoader [PARAMETER] [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^return superclass .getName (  )  ;^68^^^^^66^72^[REPLACE] return superclass.getClassLoader (  ) ;^[METHOD] getDefaultClassLoader [TYPE] ClassLoader [PARAMETER] [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^return superclass.getName (  ) ;^68^^^^^66^72^[REPLACE] return superclass.getClassLoader (  ) ;^[METHOD] getDefaultClassLoader [TYPE] ClassLoader [PARAMETER] [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^return this;^70^^^^^66^72^[REPLACE] return null;^[METHOD] getDefaultClassLoader [TYPE] ClassLoader [PARAMETER] [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^classOnly = true;^75^^^^^74^77^[REPLACE] classOnly = false;^[METHOD] create [TYPE] Object [PARAMETER] [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^return protoclass;^76^^^^^74^77^[REPLACE] return createHelper (  ) ;^[METHOD] create [TYPE] Object [PARAMETER] [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^classOnly = false; ;^80^^^^^79^82^[REPLACE] classOnly = true;^[METHOD] createClass [TYPE] Object [PARAMETER] [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^return protoclass;^81^^^^^79^82^[REPLACE] return createHelper (  ) ;^[METHOD] createClass [TYPE] Object [PARAMETER] [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^if  ( superclass == true )  {^85^^^^^84^91^[REPLACE] if  ( superclass != null )  {^[METHOD] createHelper [TYPE] Object [PARAMETER] [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  Object key  [TYPE]  String superName  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^setNamePrefix ( superclass .getClassLoader (  )   ) ;^86^^^^^84^91^[REPLACE] setNamePrefix ( superclass.getName (  )  ) ;^[METHOD] createHelper [TYPE] Object [PARAMETER] [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  Object key  [TYPE]  String superName  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^String superName  =  "java.lang.Object";^88^^^^^84^91^[REPLACE] String superName =  ( superclass != null )  ? superclass.getName (  )  : "java.lang.Object";^[METHOD] createHelper [TYPE] Object [PARAMETER] [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  Object key  [TYPE]  String superName  [TYPE]  Map props  [TYPE]  Source SOURCE 
[ADD]^^88^^^^^84^91^[ADD] String superName =  ( superclass != null )  ? superclass.getName (  )  : "java.lang.Object";^[METHOD] createHelper [TYPE] Object [PARAMETER] [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  Object key  [TYPE]  String superName  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^Object key = KEY_FACTORY .newInstance ( type )  ;^89^^^^^84^91^[REPLACE] Object key = KEY_FACTORY.newInstance ( superName, props ) ;^[METHOD] createHelper [TYPE] Object [PARAMETER] [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  Object key  [TYPE]  String superName  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^return super.setNamePrefix ( key ) ;^90^^^^^84^91^[REPLACE] return super.create ( key ) ;^[METHOD] createHelper [TYPE] Object [PARAMETER] [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  Object key  [TYPE]  String superName  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^int.keySet = props.size (  ) ;^94^^^^^93^110^[REPLACE] int size = props.size (  ) ;^[METHOD] generateClass [TYPE] void [PARAMETER] ClassVisitor v [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  Type[] types  [TYPE]  ClassEmitter ce  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  ClassVisitor v  [TYPE]  String[] names  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i  size 
[ADD]^String[] names =  ( String[] ) props.keySet (  ) .toArray ( new String[size] ) ;^94^95^^^^93^110^[ADD] int size = props.size (  ) ; String[] names =  ( String[] ) props.keySet (  ) .toArray ( new String[size] ) ;^[METHOD] generateClass [TYPE] void [PARAMETER] ClassVisitor v [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  Type[] types  [TYPE]  ClassEmitter ce  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  ClassVisitor v  [TYPE]  String[] names  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i  size 
[REPLACE]^String[] names =  ( String[] ) props .get ( null )  .toArray ( new String[size] ) ;^95^^^^^93^110^[REPLACE] String[] names =  ( String[] ) props.keySet (  ) .toArray ( new String[size] ) ;^[METHOD] generateClass [TYPE] void [PARAMETER] ClassVisitor v [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  Type[] types  [TYPE]  ClassEmitter ce  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  ClassVisitor v  [TYPE]  String[] names  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i  size 
[REPLACE]^String superName =  ( superclass != null )  ? superclass.getName (  )  : "java.lang.Object";^96^^^^^93^110^[REPLACE] Type[] types = new Type[size];^[METHOD] generateClass [TYPE] void [PARAMETER] ClassVisitor v [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  Type[] types  [TYPE]  ClassEmitter ce  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  ClassVisitor v  [TYPE]  String[] names  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i  size 
[REPLACE]^for (int i = 0 ; i  !=  size; i++) {^97^^^^^93^110^[REPLACE] for  ( int i = 0; i < size; i++ )  {^[METHOD] generateClass [TYPE] void [PARAMETER] ClassVisitor v [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  Type[] types  [TYPE]  ClassEmitter ce  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  ClassVisitor v  [TYPE]  String[] names  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i  size 
[REPLACE]^types[i]  =  types[i] ;^98^^^^^93^110^[REPLACE] types[i] =  ( Type ) props.get ( names[i] ) ;^[METHOD] generateClass [TYPE] void [PARAMETER] ClassVisitor v [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  Type[] types  [TYPE]  ClassEmitter ce  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  ClassVisitor v  [TYPE]  String[] names  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i  size 
[ADD]^^98^^^^^93^110^[ADD] types[i] =  ( Type ) props.get ( names[i] ) ;^[METHOD] generateClass [TYPE] void [PARAMETER] ClassVisitor v [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  Type[] types  [TYPE]  ClassEmitter ce  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  ClassVisitor v  [TYPE]  String[] names  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i  size 
[REPLACE]^types[i] ;^98^^^^^93^110^[REPLACE] types[i] =  ( Type ) props.get ( names[i] ) ;^[METHOD] generateClass [TYPE] void [PARAMETER] ClassVisitor v [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  Type[] types  [TYPE]  ClassEmitter ce  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  ClassVisitor v  [TYPE]  String[] names  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i  size 
[REPLACE]^for  ( int i = 0 ; i < size; i++ )  {^97^^^^^93^110^[REPLACE] for  ( int i = 0; i < size; i++ )  {^[METHOD] generateClass [TYPE] void [PARAMETER] ClassVisitor v [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  Type[] types  [TYPE]  ClassEmitter ce  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  ClassVisitor v  [TYPE]  String[] names  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i  size 
[REPLACE]^int size = props.size (  ) ;^100^^^^^93^110^[REPLACE] ClassEmitter ce = new ClassEmitter ( v ) ;^[METHOD] generateClass [TYPE] void [PARAMETER] ClassVisitor v [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  Type[] types  [TYPE]  ClassEmitter ce  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  ClassVisitor v  [TYPE]  String[] names  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i  size 
[REPLACE]^ce.begin_class ( Constants.V1_2, Constants.ACC_PUBLIC, getClassName (  ) , superclass == null ? Type.getType ( superclass )  : Constants.TYPE_OBJECT,^101^102^103^104^^93^110^[REPLACE] ce.begin_class ( Constants.V1_2, Constants.ACC_PUBLIC, getClassName (  ) , superclass != null ? Type.getType ( superclass )  : Constants.TYPE_OBJECT,^[METHOD] generateClass [TYPE] void [PARAMETER] ClassVisitor v [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  Type[] types  [TYPE]  ClassEmitter ce  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  ClassVisitor v  [TYPE]  String[] names  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i  size 
[REPLACE]^superclass != null ?   superclass    : Constants.TYPE_OBJECT, null, null ) ;^104^105^106^^^93^110^[REPLACE] superclass != null ? Type.getType ( superclass )  : Constants.TYPE_OBJECT, null, null ) ;^[METHOD] generateClass [TYPE] void [PARAMETER] ClassVisitor v [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  Type[] types  [TYPE]  ClassEmitter ce  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  ClassVisitor v  [TYPE]  String[] names  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i  size 
[REPLACE]^ce   ;^107^^^^^93^110^[REPLACE] EmitUtils.null_constructor ( ce ) ;^[METHOD] generateClass [TYPE] void [PARAMETER] ClassVisitor v [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  Type[] types  [TYPE]  ClassEmitter ce  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  ClassVisitor v  [TYPE]  String[] names  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i  size 
[ADD]^^107^^^^^93^110^[ADD] EmitUtils.null_constructor ( ce ) ;^[METHOD] generateClass [TYPE] void [PARAMETER] ClassVisitor v [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  Type[] types  [TYPE]  ClassEmitter ce  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  ClassVisitor v  [TYPE]  String[] names  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i  size 
[REPLACE]^EmitUtils.null_constructor ( ce ) ;^108^^^^^93^110^[REPLACE] EmitUtils.add_properties ( ce, names, types ) ;^[METHOD] generateClass [TYPE] void [PARAMETER] ClassVisitor v [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  Type[] types  [TYPE]  ClassEmitter ce  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  ClassVisitor v  [TYPE]  String[] names  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i  size 
[REPLACE]^ce .begin_class ( this , null )  ;^109^^^^^93^110^[REPLACE] ce.end_class (  ) ;^[METHOD] generateClass [TYPE] void [PARAMETER] ClassVisitor v [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  Type[] types  [TYPE]  ClassEmitter ce  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  ClassVisitor v  [TYPE]  String[] names  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i  size 
[REPLACE]^if  ( superclass != null && superclass.equals ( Object.class )  )  {^113^^^^^112^118^[REPLACE] if  ( classOnly )  {^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^return ReflectUtils.newInstance ( protoclass ) ;^116^^^^^112^118^[REPLACE] return ReflectUtils.newInstance ( type ) ;^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^return superclass;^114^^^^^112^118^[REPLACE] return type;^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^return ReflectUtils .newInstance ( this , props )  ;^116^^^^^112^118^[REPLACE] return ReflectUtils.newInstance ( type ) ;^[METHOD] firstInstance [TYPE] Object [PARAMETER] Class type [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^Class protoclass =  ( ! instance instanceof Class )  ?  ( Class ) instance : instance.getClass (  ) ;^121^^^^^120^127^[REPLACE] Class protoclass =  ( instance instanceof Class )  ?  ( Class ) instance : instance.getClass (  ) ;^[METHOD] nextInstance [TYPE] Object [PARAMETER] Object instance [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class protoclass  superclass  type  [TYPE]  Object instance  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^if  ( superclass != null && superclass.equals ( Object.class )  )  {^122^^^^^120^127^[REPLACE] if  ( classOnly )  {^[METHOD] nextInstance [TYPE] Object [PARAMETER] Object instance [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class protoclass  superclass  type  [TYPE]  Object instance  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^return   protoclass   ;^125^^^^^120^127^[REPLACE] return ReflectUtils.newInstance ( protoclass ) ;^[METHOD] nextInstance [TYPE] Object [PARAMETER] Object instance [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class protoclass  superclass  type  [TYPE]  Object instance  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^return type;^123^^^^^120^127^[REPLACE] return protoclass;^[METHOD] nextInstance [TYPE] Object [PARAMETER] Object instance [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class protoclass  superclass  type  [TYPE]  Object instance  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^return ReflectUtils.getBeanProperties ( type ) ;^125^^^^^120^127^[REPLACE] return ReflectUtils.newInstance ( protoclass ) ;^[METHOD] nextInstance [TYPE] Object [PARAMETER] Object instance [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class protoclass  superclass  type  [TYPE]  Object instance  [TYPE]  boolean classOnly  false  true  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^for  ( int i = 0; i < descriptors.length; i++ )  {^130^^^^^129^134^[REPLACE] for  ( Iterator it = props.keySet (  ) .iterator (  ) ; it.hasNext (  ) ; )  {^[METHOD] addProperties [TYPE] void [PARAMETER] BeanGenerator gen Map props [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  BeanGenerator gen  [TYPE]  Iterator it  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class protoclass  superclass  type  [TYPE]  String name  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^String name =  ( String ) it.hasNext (  ) ;^131^^^^^129^134^[REPLACE] String name =  ( String ) it.next (  ) ;^[METHOD] addProperties [TYPE] void [PARAMETER] BeanGenerator gen Map props [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  BeanGenerator gen  [TYPE]  Iterator it  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class protoclass  superclass  type  [TYPE]  String name  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^for  ( Iterator it = props.size (  ) .iterator (  ) ; it.hasNext (  ) ; )  {^130^^^^^129^134^[REPLACE] for  ( Iterator it = props.keySet (  ) .iterator (  ) ; it.hasNext (  ) ; )  {^[METHOD] addProperties [TYPE] void [PARAMETER] BeanGenerator gen Map props [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  BeanGenerator gen  [TYPE]  Iterator it  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class protoclass  superclass  type  [TYPE]  String name  [TYPE]  Map props  [TYPE]  Source SOURCE 
[ADD]^^130^131^132^133^^129^134^[ADD] for  ( Iterator it = props.keySet (  ) .iterator (  ) ; it.hasNext (  ) ; )  { String name =  ( String ) it.next (  ) ; gen.addProperty ( name,  ( Class ) props.get ( name )  ) ; }^[METHOD] addProperties [TYPE] void [PARAMETER] BeanGenerator gen Map props [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  BeanGenerator gen  [TYPE]  Iterator it  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class protoclass  superclass  type  [TYPE]  String name  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^String name =  ( String ) it .hasNext (  )  ;^131^^^^^129^134^[REPLACE] String name =  ( String ) it.next (  ) ;^[METHOD] addProperties [TYPE] void [PARAMETER] BeanGenerator gen Map props [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  BeanGenerator gen  [TYPE]  Iterator it  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class protoclass  superclass  type  [TYPE]  String name  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^addProperties ( gen, ReflectUtils.newInstance ( type )  ) ;^137^^^^^136^138^[REPLACE] addProperties ( gen, ReflectUtils.getBeanProperties ( type )  ) ;^[METHOD] addProperties [TYPE] void [PARAMETER] BeanGenerator gen Class type [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class protoclass  superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  BeanGenerator gen  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^addProperties ( gen, ReflectUtils .newInstance ( null , props )   ) ;^137^^^^^136^138^[REPLACE] addProperties ( gen, ReflectUtils.getBeanProperties ( type )  ) ;^[METHOD] addProperties [TYPE] void [PARAMETER] BeanGenerator gen Class type [CLASS] BeanGenerator   [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class protoclass  superclass  type  [TYPE]  boolean classOnly  false  true  [TYPE]  BeanGenerator gen  [TYPE]  Map props  [TYPE]  Source SOURCE 
[REPLACE]^for  ( int i = 0; i < descriptors.length /  2; i++ )  {^141^^^^^140^144^[REPLACE] for  ( int i = 0; i < descriptors.length; i++ )  {^[METHOD] addProperties [TYPE] void [PARAMETER] BeanGenerator gen PropertyDescriptor[] descriptors [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  BeanGenerator gen  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class protoclass  superclass  type  [TYPE]  PropertyDescriptor[] descriptors  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i 
[REPLACE]^addProperties ( gen, ReflectUtils.getBeanProperties ( type )  ) ;^142^^^^^140^144^[REPLACE] gen.addProperty ( descriptors[i].getName (  ) , descriptors[i].getPropertyType (  )  ) ;^[METHOD] addProperties [TYPE] void [PARAMETER] BeanGenerator gen PropertyDescriptor[] descriptors [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  BeanGenerator gen  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class protoclass  superclass  type  [TYPE]  PropertyDescriptor[] descriptors  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i 
[REPLACE]^gen.addProperty ( descriptors[i] .getClassLoader (  )  , descriptors[i].getPropertyType (  )  ) ;^142^^^^^140^144^[REPLACE] gen.addProperty ( descriptors[i].getName (  ) , descriptors[i].getPropertyType (  )  ) ;^[METHOD] addProperties [TYPE] void [PARAMETER] BeanGenerator gen PropertyDescriptor[] descriptors [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  BeanGenerator gen  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class protoclass  superclass  type  [TYPE]  PropertyDescriptor[] descriptors  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i 
[REPLACE]^for  ( int i = 0 ; i < descriptors.length; i++ )  {^141^^^^^140^144^[REPLACE] for  ( int i = 0; i < descriptors.length; i++ )  {^[METHOD] addProperties [TYPE] void [PARAMETER] BeanGenerator gen PropertyDescriptor[] descriptors [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  BeanGenerator gen  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class protoclass  superclass  type  [TYPE]  PropertyDescriptor[] descriptors  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i 
[ADD]^^141^142^143^^^140^144^[ADD] for  ( int i = 0; i < descriptors.length; i++ )  { gen.addProperty ( descriptors[i].getName (  ) , descriptors[i].getPropertyType (  )  ) ; }^[METHOD] addProperties [TYPE] void [PARAMETER] BeanGenerator gen PropertyDescriptor[] descriptors [CLASS] BeanGenerator   [TYPE]  boolean classOnly  false  true  [TYPE]  BeanGenerator gen  [TYPE]  BeanGeneratorKey KEY_FACTORY  [TYPE]  Class protoclass  superclass  type  [TYPE]  PropertyDescriptor[] descriptors  [TYPE]  Map props  [TYPE]  Source SOURCE  [TYPE]  int i 
