[buglab_swap_variables]^if  ( av2 == null ) return av1;^24^25^^^^23^29^if  ( av1 == null ) return av2;^[CLASS] AnnotationVisitorTee  [METHOD] getInstance [RETURN_TYPE] AnnotationVisitor   AnnotationVisitor av1 AnnotationVisitor av2 [VARIABLES] AnnotationVisitor  av1  av2  boolean  
[buglab_swap_variables]^if  ( av1 == null ) return av2;^26^27^^^^23^29^if  ( av2 == null ) return av1;^[CLASS] AnnotationVisitorTee  [METHOD] getInstance [RETURN_TYPE] AnnotationVisitor   AnnotationVisitor av1 AnnotationVisitor av2 [VARIABLES] AnnotationVisitor  av1  av2  boolean  
[buglab_swap_variables]^return new AnnotationVisitorTee ( av2, av1 ) ;^28^^^^^23^29^return new AnnotationVisitorTee ( av1, av2 ) ;^[CLASS] AnnotationVisitorTee  [METHOD] getInstance [RETURN_TYPE] AnnotationVisitor   AnnotationVisitor av1 AnnotationVisitor av2 [VARIABLES] AnnotationVisitor  av1  av2  boolean  
[buglab_swap_variables]^return new AnnotationVisitorTee (  av2 ) ;^28^^^^^23^29^return new AnnotationVisitorTee ( av1, av2 ) ;^[CLASS] AnnotationVisitorTee  [METHOD] getInstance [RETURN_TYPE] AnnotationVisitor   AnnotationVisitor av1 AnnotationVisitor av2 [VARIABLES] AnnotationVisitor  av1  av2  boolean  
[buglab_swap_variables]^return new AnnotationVisitorTee ( av1 ) ;^28^^^^^23^29^return new AnnotationVisitorTee ( av1, av2 ) ;^[CLASS] AnnotationVisitorTee  [METHOD] getInstance [RETURN_TYPE] AnnotationVisitor   AnnotationVisitor av1 AnnotationVisitor av2 [VARIABLES] AnnotationVisitor  av1  av2  boolean  
[buglab_swap_variables]^av2.visit ( value, name ) ;^37^^^^^36^39^av2.visit ( name, value ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visit [RETURN_TYPE] void   String name Object value [VARIABLES] AnnotationVisitor  av1  av2  Object  value  String  name  boolean  
[buglab_swap_variables]^av2.visit (  value ) ;^37^^^^^36^39^av2.visit ( name, value ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visit [RETURN_TYPE] void   String name Object value [VARIABLES] AnnotationVisitor  av1  av2  Object  value  String  name  boolean  
[buglab_swap_variables]^av2.visit ( name ) ;^37^^^^^36^39^av2.visit ( name, value ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visit [RETURN_TYPE] void   String name Object value [VARIABLES] AnnotationVisitor  av1  av2  Object  value  String  name  boolean  
[buglab_swap_variables]^av2.visit (  value ) ;^38^^^^^36^39^av2.visit ( name, value ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visit [RETURN_TYPE] void   String name Object value [VARIABLES] AnnotationVisitor  av1  av2  Object  value  String  name  boolean  
[buglab_swap_variables]^av2.visit ( name ) ;^38^^^^^36^39^av2.visit ( name, value ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visit [RETURN_TYPE] void   String name Object value [VARIABLES] AnnotationVisitor  av1  av2  Object  value  String  name  boolean  
[buglab_swap_variables]^av1.visitEnum ( value, desc, name ) ;^42^^^^^41^44^av1.visitEnum ( name, desc, value ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitEnum [RETURN_TYPE] void   String name String desc String value [VARIABLES] AnnotationVisitor  av1  av2  String  desc  name  value  boolean  
[buglab_swap_variables]^av1.visitEnum (  desc, value ) ;^42^^^^^41^44^av1.visitEnum ( name, desc, value ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitEnum [RETURN_TYPE] void   String name String desc String value [VARIABLES] AnnotationVisitor  av1  av2  String  desc  name  value  boolean  
[buglab_swap_variables]^av1.visitEnum ( name, value, desc ) ;^42^^^^^41^44^av1.visitEnum ( name, desc, value ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitEnum [RETURN_TYPE] void   String name String desc String value [VARIABLES] AnnotationVisitor  av1  av2  String  desc  name  value  boolean  
[buglab_swap_variables]^av1.visitEnum ( name,  value ) ;^42^^^^^41^44^av1.visitEnum ( name, desc, value ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitEnum [RETURN_TYPE] void   String name String desc String value [VARIABLES] AnnotationVisitor  av1  av2  String  desc  name  value  boolean  
[buglab_swap_variables]^av1.visitEnum ( name, desc ) ;^42^^^^^41^44^av1.visitEnum ( name, desc, value ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitEnum [RETURN_TYPE] void   String name String desc String value [VARIABLES] AnnotationVisitor  av1  av2  String  desc  name  value  boolean  
[buglab_swap_variables]^av2.visitEnum ( desc, name, value ) ;^43^^^^^41^44^av2.visitEnum ( name, desc, value ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitEnum [RETURN_TYPE] void   String name String desc String value [VARIABLES] AnnotationVisitor  av1  av2  String  desc  name  value  boolean  
[buglab_swap_variables]^av2.visitEnum (  desc, value ) ;^43^^^^^41^44^av2.visitEnum ( name, desc, value ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitEnum [RETURN_TYPE] void   String name String desc String value [VARIABLES] AnnotationVisitor  av1  av2  String  desc  name  value  boolean  
[buglab_swap_variables]^av2.visitEnum ( name,  value ) ;^43^^^^^41^44^av2.visitEnum ( name, desc, value ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitEnum [RETURN_TYPE] void   String name String desc String value [VARIABLES] AnnotationVisitor  av1  av2  String  desc  name  value  boolean  
[buglab_swap_variables]^av2.visitEnum ( value, desc, name ) ;^43^^^^^41^44^av2.visitEnum ( name, desc, value ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitEnum [RETURN_TYPE] void   String name String desc String value [VARIABLES] AnnotationVisitor  av1  av2  String  desc  name  value  boolean  
[buglab_swap_variables]^av2.visitEnum ( name, desc ) ;^43^^^^^41^44^av2.visitEnum ( name, desc, value ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitEnum [RETURN_TYPE] void   String name String desc String value [VARIABLES] AnnotationVisitor  av1  av2  String  desc  name  value  boolean  
[buglab_swap_variables]^return getInstance ( av1.visitAnnotation ( desc, name ) , av2.visitAnnotation ( name, desc )  ) ;^47^48^^^^46^49^return getInstance ( av1.visitAnnotation ( name, desc ) , av2.visitAnnotation ( name, desc )  ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitAnnotation [RETURN_TYPE] AnnotationVisitor   String name String desc [VARIABLES] AnnotationVisitor  av1  av2  String  desc  name  boolean  
[buglab_swap_variables]^return getInstance ( av1.visitAnnotation (  desc ) , av2.visitAnnotation ( name, desc )  ) ;^47^48^^^^46^49^return getInstance ( av1.visitAnnotation ( name, desc ) , av2.visitAnnotation ( name, desc )  ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitAnnotation [RETURN_TYPE] AnnotationVisitor   String name String desc [VARIABLES] AnnotationVisitor  av1  av2  String  desc  name  boolean  
[buglab_swap_variables]^return getInstance ( av1.visitAnnotation ( name, av2 ) , desc.visitAnnotation ( name, desc )  ) ;^47^48^^^^46^49^return getInstance ( av1.visitAnnotation ( name, desc ) , av2.visitAnnotation ( name, desc )  ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitAnnotation [RETURN_TYPE] AnnotationVisitor   String name String desc [VARIABLES] AnnotationVisitor  av1  av2  String  desc  name  boolean  
[buglab_swap_variables]^return getInstance ( av1.visitAnnotation ( name ) , av2.visitAnnotation ( name, desc )  ) ;^47^48^^^^46^49^return getInstance ( av1.visitAnnotation ( name, desc ) , av2.visitAnnotation ( name, desc )  ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitAnnotation [RETURN_TYPE] AnnotationVisitor   String name String desc [VARIABLES] AnnotationVisitor  av1  av2  String  desc  name  boolean  
[buglab_swap_variables]^return getInstance ( av2.visitAnnotation ( name, desc ) , av1.visitAnnotation ( name, desc )  ) ;^47^48^^^^46^49^return getInstance ( av1.visitAnnotation ( name, desc ) , av2.visitAnnotation ( name, desc )  ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitAnnotation [RETURN_TYPE] AnnotationVisitor   String name String desc [VARIABLES] AnnotationVisitor  av1  av2  String  desc  name  boolean  
[buglab_swap_variables]^return getInstance ( av1.visitAnnotation ( name, desc ) .visitAnnotation ( name, desc )  ) ;^47^48^^^^46^49^return getInstance ( av1.visitAnnotation ( name, desc ) , av2.visitAnnotation ( name, desc )  ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitAnnotation [RETURN_TYPE] AnnotationVisitor   String name String desc [VARIABLES] AnnotationVisitor  av1  av2  String  desc  name  boolean  
[buglab_swap_variables]^return getInstance ( desc.visitAnnotation ( name, av1 ) , av2.visitAnnotation ( name, desc )  ) ;^47^48^^^^46^49^return getInstance ( av1.visitAnnotation ( name, desc ) , av2.visitAnnotation ( name, desc )  ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitAnnotation [RETURN_TYPE] AnnotationVisitor   String name String desc [VARIABLES] AnnotationVisitor  av1  av2  String  desc  name  boolean  
[buglab_swap_variables]^av2.visitAnnotation ( desc, name )  ) ;^48^^^^^46^49^av2.visitAnnotation ( name, desc )  ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitAnnotation [RETURN_TYPE] AnnotationVisitor   String name String desc [VARIABLES] AnnotationVisitor  av1  av2  String  desc  name  boolean  
[buglab_swap_variables]^av2.visitAnnotation (  desc )  ) ;^48^^^^^46^49^av2.visitAnnotation ( name, desc )  ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitAnnotation [RETURN_TYPE] AnnotationVisitor   String name String desc [VARIABLES] AnnotationVisitor  av1  av2  String  desc  name  boolean  
[buglab_swap_variables]^av2.visitAnnotation ( name )  ) ;^48^^^^^46^49^av2.visitAnnotation ( name, desc )  ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitAnnotation [RETURN_TYPE] AnnotationVisitor   String name String desc [VARIABLES] AnnotationVisitor  av1  av2  String  desc  name  boolean  
[buglab_swap_variables]^return getInstance ( av1.visitArray ( av2 ) , name.visitArray ( name )  ) ;^52^^^^^51^53^return getInstance ( av1.visitArray ( name ) , av2.visitArray ( name )  ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitArray [RETURN_TYPE] AnnotationVisitor   String name [VARIABLES] AnnotationVisitor  av1  av2  String  name  boolean  
[buglab_swap_variables]^return getInstance ( name.visitArray ( av1 ) , av2.visitArray ( name )  ) ;^52^^^^^51^53^return getInstance ( av1.visitArray ( name ) , av2.visitArray ( name )  ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitArray [RETURN_TYPE] AnnotationVisitor   String name [VARIABLES] AnnotationVisitor  av1  av2  String  name  boolean  
[buglab_swap_variables]^return getInstance ( av2.visitArray ( name ) , av1.visitArray ( name )  ) ;^52^^^^^51^53^return getInstance ( av1.visitArray ( name ) , av2.visitArray ( name )  ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitArray [RETURN_TYPE] AnnotationVisitor   String name [VARIABLES] AnnotationVisitor  av1  av2  String  name  boolean  
[buglab_swap_variables]^return getInstance ( av1.visitArray ( name ) .visitArray ( name )  ) ;^52^^^^^51^53^return getInstance ( av1.visitArray ( name ) , av2.visitArray ( name )  ) ;^[CLASS] AnnotationVisitorTee  [METHOD] visitArray [RETURN_TYPE] AnnotationVisitor   String name [VARIABLES] AnnotationVisitor  av1  av2  String  name  boolean  
