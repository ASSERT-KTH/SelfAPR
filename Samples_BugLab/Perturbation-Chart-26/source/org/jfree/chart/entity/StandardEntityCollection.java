[buglab_swap_variables]^return  ( ChartEntity )  index.get ( this.entities ) ;^102^^^^^101^103^return  ( ChartEntity )  this.entities.get ( index ) ;^[CLASS] StandardEntityCollection  [METHOD] getEntity [RETURN_TYPE] ChartEntity   int index [VARIABLES] List  entities  boolean  long  serialVersionUID  int  index  
[buglab_swap_variables]^if  ( y.getArea (  ) .contains ( x, entity )  )  {^147^^^^^143^152^if  ( entity.getArea (  ) .contains ( x, y )  )  {^[CLASS] StandardEntityCollection  [METHOD] getEntity [RETURN_TYPE] ChartEntity   double x double y [VARIABLES] List  entities  ChartEntity  entity  boolean  long  serialVersionUID  double  x  y  int  entityCount  i  
[buglab_swap_variables]^if  ( entity.getArea (  ) .contains ( y, x )  )  {^147^^^^^143^152^if  ( entity.getArea (  ) .contains ( x, y )  )  {^[CLASS] StandardEntityCollection  [METHOD] getEntity [RETURN_TYPE] ChartEntity   double x double y [VARIABLES] List  entities  ChartEntity  entity  boolean  long  serialVersionUID  double  x  y  int  entityCount  i  
[buglab_swap_variables]^if  ( entity.getArea (  ) .contains (  y )  )  {^147^^^^^143^152^if  ( entity.getArea (  ) .contains ( x, y )  )  {^[CLASS] StandardEntityCollection  [METHOD] getEntity [RETURN_TYPE] ChartEntity   double x double y [VARIABLES] List  entities  ChartEntity  entity  boolean  long  serialVersionUID  double  x  y  int  entityCount  i  
[buglab_swap_variables]^if  ( entity.getArea (  ) .contains ( x )  )  {^147^^^^^143^152^if  ( entity.getArea (  ) .contains ( x, y )  )  {^[CLASS] StandardEntityCollection  [METHOD] getEntity [RETURN_TYPE] ChartEntity   double x double y [VARIABLES] List  entities  ChartEntity  entity  boolean  long  serialVersionUID  double  x  y  int  entityCount  i  
[buglab_swap_variables]^for  ( entityCountnt i = i - 1; i >= 0; i-- )  {^145^^^^^143^152^for  ( int i = entityCount - 1; i >= 0; i-- )  {^[CLASS] StandardEntityCollection  [METHOD] getEntity [RETURN_TYPE] ChartEntity   double x double y [VARIABLES] List  entities  ChartEntity  entity  boolean  long  serialVersionUID  double  x  y  int  entityCount  i  
[buglab_swap_variables]^if  ( x.getArea (  ) .contains ( entity, y )  )  {^147^^^^^143^152^if  ( entity.getArea (  ) .contains ( x, y )  )  {^[CLASS] StandardEntityCollection  [METHOD] getEntity [RETURN_TYPE] ChartEntity   double x double y [VARIABLES] List  entities  ChartEntity  entity  boolean  long  serialVersionUID  double  x  y  int  entityCount  i  
[buglab_swap_variables]^ChartEntity entity =  ( ChartEntity )  i.get ( this.entities ) ;^146^^^^^143^152^ChartEntity entity =  ( ChartEntity )  this.entities.get ( i ) ;^[CLASS] StandardEntityCollection  [METHOD] getEntity [RETURN_TYPE] ChartEntity   double x double y [VARIABLES] List  entities  ChartEntity  entity  boolean  long  serialVersionUID  double  x  y  int  entityCount  i  
[buglab_swap_variables]^return ObjectUtilities.equal ( that, this.entities.entities ) ;^185^^^^^179^188^return ObjectUtilities.equal ( this.entities, that.entities ) ;^[CLASS] StandardEntityCollection  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  entities  Object  obj  StandardEntityCollection  that  boolean  long  serialVersionUID  
[buglab_swap_variables]^return ObjectUtilities.equal ( this.entities.entities ) ;^185^^^^^179^188^return ObjectUtilities.equal ( this.entities, that.entities ) ;^[CLASS] StandardEntityCollection  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  entities  Object  obj  StandardEntityCollection  that  boolean  long  serialVersionUID  
[buglab_swap_variables]^return ObjectUtilities.equal ( that.entities, this.entities ) ;^185^^^^^179^188^return ObjectUtilities.equal ( this.entities, that.entities ) ;^[CLASS] StandardEntityCollection  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  entities  Object  obj  StandardEntityCollection  that  boolean  long  serialVersionUID  
[buglab_swap_variables]^return ObjectUtilities.equal (  that.entities ) ;^185^^^^^179^188^return ObjectUtilities.equal ( this.entities, that.entities ) ;^[CLASS] StandardEntityCollection  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  entities  Object  obj  StandardEntityCollection  that  boolean  long  serialVersionUID  
[buglab_swap_variables]^return ObjectUtilities.equal ( this.entities ) ;^185^^^^^179^188^return ObjectUtilities.equal ( this.entities, that.entities ) ;^[CLASS] StandardEntityCollection  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  entities  Object  obj  StandardEntityCollection  that  boolean  long  serialVersionUID  
[buglab_swap_variables]^return ObjectUtilities.equal ( this.entities, that.entities.entities ) ;^185^^^^^179^188^return ObjectUtilities.equal ( this.entities, that.entities ) ;^[CLASS] StandardEntityCollection  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  entities  Object  obj  StandardEntityCollection  that  boolean  long  serialVersionUID  
[buglab_swap_variables]^ChartEntity entity =  ( ChartEntity )  i.get ( this.entities ) ;^202^^^^^197^206^ChartEntity entity =  ( ChartEntity )  this.entities.get ( i ) ;^[CLASS] StandardEntityCollection  [METHOD] clone [RETURN_TYPE] Object   [VARIABLES] List  entities  StandardEntityCollection  clone  ChartEntity  entity  boolean  long  serialVersionUID  int  i  
