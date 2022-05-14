[buglab_swap_variables]^return solve ( max, min ) ;^69^^^^^66^70^return solve ( min, max ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max double initial [VARIABLES] long  serialVersionUID  double  initial  max  min  boolean  
[buglab_swap_variables]^return solve (  max ) ;^69^^^^^66^70^return solve ( min, max ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max double initial [VARIABLES] long  serialVersionUID  double  initial  max  min  boolean  
[buglab_swap_variables]^return solve ( min ) ;^69^^^^^66^70^return solve ( min, max ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max double initial [VARIABLES] long  serialVersionUID  double  initial  max  min  boolean  
[buglab_swap_variables]^verifyInterval ( max, min ) ;^87^^^^^72^102^verifyInterval ( min, max ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^verifyInterval (  max ) ;^87^^^^^72^102^verifyInterval ( min, max ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^verifyInterval ( min ) ;^87^^^^^72^102^verifyInterval ( min, max ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^double y0 = x0.value ( f ) ;^96^^^^^81^111^double y0 = f.value ( x0 ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^double y1 = x1.value ( f ) ;^97^^^^^82^112^double y1 = f.value ( x1 ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^if  ( y1 * y0 >= 0 )  {^100^^^^^85^115^if  ( y0 * y1 >= 0 )  {^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^throw new IllegalArgumentException ( "Function values at endpoints do not have different signs." + "  Endpoints: [" + y1 + "," + max + "]" + "  Values: [" + y0 + "," + min + "]" ) ;^101^102^103^104^^86^116^throw new IllegalArgumentException ( "Function values at endpoints do not have different signs." + "  Endpoints: [" + min + "," + max + "]" + "  Values: [" + y0 + "," + y1 + "]" ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^throw new IllegalArgumentException ( "Function values at endpoints do not have different signs." + "  Endpoints: [" + min + "," + y1 + "]" + "  Values: [" + y0 + "," + max + "]" ) ;^101^102^103^104^^86^116^throw new IllegalArgumentException ( "Function values at endpoints do not have different signs." + "  Endpoints: [" + min + "," + max + "]" + "  Values: [" + y0 + "," + y1 + "]" ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^throw new IllegalArgumentException ( "Function values at endpoints do not have different signs." + "  Endpoints: [" + min + "," + y0 + "]" + "  Values: [" + max + "," + y1 + "]" ) ;^101^102^103^104^^86^116^throw new IllegalArgumentException ( "Function values at endpoints do not have different signs." + "  Endpoints: [" + min + "," + max + "]" + "  Values: [" + y0 + "," + y1 + "]" ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^throw new IllegalArgumentException ( "Function values at endpoints do not have different signs." + "  Endpoints: [" + y0 + "," + max + "]" + "  Values: [" + min + "," + y1 + "]" ) ;^101^102^103^104^^86^116^throw new IllegalArgumentException ( "Function values at endpoints do not have different signs." + "  Endpoints: [" + min + "," + max + "]" + "  Values: [" + y0 + "," + y1 + "]" ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^throw new IllegalArgumentException ( "Function values at endpoints do not have different signs." + "  Endpoints: [" + max + "," + min + "]" + "  Values: [" + y0 + "," + y1 + "]" ) ;^101^102^103^104^^86^116^throw new IllegalArgumentException ( "Function values at endpoints do not have different signs." + "  Endpoints: [" + min + "," + max + "]" + "  Values: [" + y0 + "," + y1 + "]" ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^double oldDelta = x1 - x2;^109^^^^^94^124^double oldDelta = x2 - x1;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^if  ( Math.abs ( functionValueAccuracy )  <= y1 )  {^120^^^^^105^135^if  ( Math.abs ( y1 )  <= functionValueAccuracy )  {^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^setResult ( i, x1 ) ;^121^^^^^106^136^setResult ( x1, i ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^setResult (  i ) ;^121^^^^^106^136^setResult ( x1, i ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^setResult ( x1 ) ;^121^^^^^106^136^setResult ( x1, i ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^if  ( Math.abs ( x1 )  < Math.max ( relativeAccuracy * Math.abs ( oldDelta ) , absoluteAccuracy )  )  {^124^125^^^^109^139^if  ( Math.abs ( oldDelta )  < Math.max ( relativeAccuracy * Math.abs ( x1 ) , absoluteAccuracy )  )  {^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^if  ( Math.abs ( oldDelta )  < Math.max ( absoluteAccuracy * Math.abs ( x1 ) , relativeAccuracy )  )  {^124^125^^^^109^139^if  ( Math.abs ( oldDelta )  < Math.max ( relativeAccuracy * Math.abs ( x1 ) , absoluteAccuracy )  )  {^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^if  ( Math.abs ( oldDelta )  < Math.max ( relativeAccuracy * Math.abs ( x1 )  )  )  {^124^125^^^^109^139^if  ( Math.abs ( oldDelta )  < Math.max ( relativeAccuracy * Math.abs ( x1 ) , absoluteAccuracy )  )  {^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^setResult ( i, x1 ) ;^126^^^^^124^128^setResult ( x1, i ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^setResult (  i ) ;^126^^^^^124^128^setResult ( x1, i ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^setResult ( x1 ) ;^126^^^^^124^128^setResult ( x1, i ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^if  ( oldDelta / delta > 1 )  {^135^^^^^130^140^if  ( delta / oldDelta > 1 )  {^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^delta =  ( y1 - x1 )  /  ( 1 - y0 / x0 ) ;^134^^^^^130^140^delta =  ( x0 - x1 )  /  ( 1 - y0 / y1 ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^delta =  ( x0 - y1 )  /  ( 1 - y0 / x1 ) ;^134^^^^^130^140^delta =  ( x0 - x1 )  /  ( 1 - y0 / y1 ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^delta =  ( x0 - x1 )  /  ( 1 - y1 / y0 ) ;^134^^^^^130^140^delta =  ( x0 - x1 )  /  ( 1 - y0 / y1 ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^if  ( oldDelta / delta > 1 )  {^135^^^^^120^150^if  ( delta / oldDelta > 1 )  {^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^if  (  ( y2 > 0 )  ==  ( y1 > 0 )  )  {^145^^^^^130^160^if  (  ( y1 > 0 )  ==  ( y2 > 0 )  )  {^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^delta =  ( x1 - x0 )  /  ( 1 - y0 / y1 ) ;^134^^^^^119^149^delta =  ( x0 - x1 )  /  ( 1 - y0 / y1 ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^delta =  ( x0 - y0 )  /  ( 1 - x1 / y1 ) ;^134^^^^^119^149^delta =  ( x0 - x1 )  /  ( 1 - y0 / y1 ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^delta =  ( x0 - y1 )  /  ( 1 - y0 / x1 ) ;^134^^^^^119^149^delta =  ( x0 - x1 )  /  ( 1 - y0 / y1 ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^x1 = delta + x1;^143^^^^^128^158^x1 = x1 + delta;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^y1 = x1.value ( f ) ;^144^^^^^129^159^y1 = f.value ( x1 ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^oldDelta = x1 - x2;^150^^^^^135^165^oldDelta = x2 - x1;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^Math.max ( x1 * Math.abs ( relativeAccuracy ) , absoluteAccuracy )  )  {^125^^^^^110^140^Math.max ( relativeAccuracy * Math.abs ( x1 ) , absoluteAccuracy )  )  {^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^Math.max ( absoluteAccuracy * Math.abs ( x1 ) , relativeAccuracy )  )  {^125^^^^^110^140^Math.max ( relativeAccuracy * Math.abs ( x1 ) , absoluteAccuracy )  )  {^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^Math.max ( relativeAccuracy * Math.abs ( x1 )  )  )  {^125^^^^^110^140^Math.max ( relativeAccuracy * Math.abs ( x1 ) , absoluteAccuracy )  )  {^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^setResult ( i, x1 ) ;^126^^^^^111^141^setResult ( x1, i ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^setResult (  i ) ;^126^^^^^111^141^setResult ( x1, i ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^setResult ( x1 ) ;^126^^^^^111^141^setResult ( x1, i ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^if  ( Math.abs ( absoluteAccuracy )  < Math.max ( relativeAccuracy * Math.abs ( x1 ) , oldDelta )  )  {^124^125^^^^109^139^if  ( Math.abs ( oldDelta )  < Math.max ( relativeAccuracy * Math.abs ( x1 ) , absoluteAccuracy )  )  {^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^if  ( Math.abs ( y0 )  > Math.abs ( y1 )  )  {^130^^^^^115^145^if  ( Math.abs ( y1 )  > Math.abs ( y0 )  )  {^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^delta =  ( y0 - x1 )  /  ( 1 - x0 / y1 ) ;^134^^^^^130^140^delta =  ( x0 - x1 )  /  ( 1 - y0 / y1 ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^delta =  ( x0 - y0 )  /  ( 1 - x1 / y1 ) ;^134^^^^^130^140^delta =  ( x0 - x1 )  /  ( 1 - y0 / y1 ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^delta =  ( y0 - x1 )  /  ( 1 - x0 / y1 ) ;^134^^^^^119^149^delta =  ( x0 - x1 )  /  ( 1 - y0 / y1 ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^delta =  ( y1 - x1 )  /  ( 1 - y0 / x0 ) ;^134^^^^^119^149^delta =  ( x0 - x1 )  /  ( 1 - y0 / y1 ) ;^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
[buglab_swap_variables]^Math.max ( relativeAccuracy * Math.abs ( absoluteAccuracy ) , x1 )  )  {^125^^^^^110^140^Math.max ( relativeAccuracy * Math.abs ( x1 ) , absoluteAccuracy )  )  {^[CLASS] SecantSolver  [METHOD] solve [RETURN_TYPE] double   double min double max [VARIABLES] boolean  long  serialVersionUID  double  delta  max  min  oldDelta  x0  x1  x2  y0  y1  y2  int  i  
