[buglab_swap_variables]^return  ( Task )  index.get ( this.tasks ) ;^129^^^^^128^130^return  ( Task )  this.tasks.get ( index ) ;^[CLASS] TaskSeries  [METHOD] get [RETURN_TYPE] Task   int index [VARIABLES] List  tasks  int  index  boolean  
[buglab_swap_variables]^if  ( description.getDescription (  ) .equals ( t )  )  {^144^^^^^139^150^if  ( t.getDescription (  ) .equals ( description )  )  {^[CLASS] TaskSeries  [METHOD] get [RETURN_TYPE] Task   String description [VARIABLES] List  tasks  Task  result  t  String  description  boolean  int  count  i  
[buglab_swap_variables]^for  ( countnt i = 0; i < i; i++ )  {^142^^^^^139^150^for  ( int i = 0; i < count; i++ )  {^[CLASS] TaskSeries  [METHOD] get [RETURN_TYPE] Task   String description [VARIABLES] List  tasks  Task  result  t  String  description  boolean  int  count  i  
[buglab_swap_variables]^Task t =  ( Task )  i.get ( this.tasks ) ;^143^^^^^139^150^Task t =  ( Task )  this.tasks.get ( i ) ;^[CLASS] TaskSeries  [METHOD] get [RETURN_TYPE] Task   String description [VARIABLES] List  tasks  Task  result  t  String  description  boolean  int  count  i  
[buglab_swap_variables]^if  ( !this.tasks.equals ( that.tasks.tasks )  )  {^179^^^^^168^183^if  ( !this.tasks.equals ( that.tasks )  )  {^[CLASS] TaskSeries  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  tasks  Object  obj  boolean  TaskSeries  that  
