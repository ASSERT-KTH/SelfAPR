[buglab_swap_variables]^TextFragment fragment = new TextFragment ( font, text ) ;^98^^^^^96^100^TextFragment fragment = new TextFragment ( text, font ) ;^[CLASS] TextLine  [METHOD] <init> [RETURN_TYPE] Font)   String text Font font [VARIABLES] List  fragments  String  text  boolean  TextFragment  fragment  long  serialVersionUID  Font  font  
[buglab_swap_variables]^TextFragment fragment = new TextFragment (  font ) ;^98^^^^^96^100^TextFragment fragment = new TextFragment ( text, font ) ;^[CLASS] TextLine  [METHOD] <init> [RETURN_TYPE] Font)   String text Font font [VARIABLES] List  fragments  String  text  boolean  TextFragment  fragment  long  serialVersionUID  Font  font  
[buglab_swap_variables]^TextFragment fragment = new TextFragment ( text ) ;^98^^^^^96^100^TextFragment fragment = new TextFragment ( text, font ) ;^[CLASS] TextLine  [METHOD] <init> [RETURN_TYPE] Font)   String text Font font [VARIABLES] List  fragments  String  text  boolean  TextFragment  fragment  long  serialVersionUID  Font  font  
[buglab_swap_variables]^TextFragment fragment = new TextFragment ( font, text, paint ) ;^120^^^^^109^122^TextFragment fragment = new TextFragment ( text, font, paint ) ;^[CLASS] TextLine  [METHOD] <init> [RETURN_TYPE] Paint)   String text Font font Paint paint [VARIABLES] boolean  List  fragments  String  text  Paint  paint  TextFragment  fragment  long  serialVersionUID  Font  font  
[buglab_swap_variables]^TextFragment fragment = new TextFragment (  font, paint ) ;^120^^^^^109^122^TextFragment fragment = new TextFragment ( text, font, paint ) ;^[CLASS] TextLine  [METHOD] <init> [RETURN_TYPE] Paint)   String text Font font Paint paint [VARIABLES] boolean  List  fragments  String  text  Paint  paint  TextFragment  fragment  long  serialVersionUID  Font  font  
[buglab_swap_variables]^TextFragment fragment = new TextFragment ( text,  paint ) ;^120^^^^^109^122^TextFragment fragment = new TextFragment ( text, font, paint ) ;^[CLASS] TextLine  [METHOD] <init> [RETURN_TYPE] Paint)   String text Font font Paint paint [VARIABLES] boolean  List  fragments  String  text  Paint  paint  TextFragment  fragment  long  serialVersionUID  Font  font  
[buglab_swap_variables]^TextFragment fragment = new TextFragment ( paint, font, text ) ;^120^^^^^109^122^TextFragment fragment = new TextFragment ( text, font, paint ) ;^[CLASS] TextLine  [METHOD] <init> [RETURN_TYPE] Paint)   String text Font font Paint paint [VARIABLES] boolean  List  fragments  String  text  Paint  paint  TextFragment  fragment  long  serialVersionUID  Font  font  
[buglab_swap_variables]^TextFragment fragment = new TextFragment ( text, font ) ;^120^^^^^109^122^TextFragment fragment = new TextFragment ( text, font, paint ) ;^[CLASS] TextLine  [METHOD] <init> [RETURN_TYPE] Paint)   String text Font font Paint paint [VARIABLES] boolean  List  fragments  String  text  Paint  paint  TextFragment  fragment  long  serialVersionUID  Font  font  
[buglab_swap_variables]^TextFragment fragment = new TextFragment ( text, paint, font ) ;^120^^^^^109^122^TextFragment fragment = new TextFragment ( text, font, paint ) ;^[CLASS] TextLine  [METHOD] <init> [RETURN_TYPE] Paint)   String text Font font Paint paint [VARIABLES] boolean  List  fragments  String  text  Paint  paint  TextFragment  fragment  long  serialVersionUID  Font  font  
[buglab_swap_variables]^float yOffset = calculateBaselineOffset ( anchor, g2 ) ;^159^^^^^154^169^float yOffset = calculateBaselineOffset ( g2, anchor ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^float yOffset = calculateBaselineOffset (  anchor ) ;^159^^^^^154^169^float yOffset = calculateBaselineOffset ( g2, anchor ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^float yOffset = calculateBaselineOffset ( g2 ) ;^159^^^^^154^169^float yOffset = calculateBaselineOffset ( g2, anchor ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^x = d +  ( float )  x.getWidth (  ) ;^166^^^^^154^169^x = x +  ( float )  d.getWidth (  ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^Size2D d = g2.calculateDimensions ( fragment ) ;^163^^^^^154^169^Size2D d = fragment.calculateDimensions ( g2 ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^fragment.draw ( rotateY, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, g2, angle ) ;^164^165^^^^154^169^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^fragment.draw (  x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^164^165^^^^154^169^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^fragment.draw ( g2, rotateX, anchorY + yOffset, TextAnchor.BASELINE_LEFT, x, rotateY, angle ) ;^164^165^^^^154^169^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^fragment.draw ( g2,  anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^164^165^^^^154^169^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^fragment.draw ( g2, x + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^164^165^^^^154^169^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^fragment.draw ( g2, x, anchorY + rotateX, TextAnchor.BASELINE_LEFT, yOffset, rotateY, angle ) ;^164^165^^^^154^169^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^fragment.draw ( g2, x, anchorY +  TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^164^165^^^^154^169^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT,  rotateY, angle ) ;^164^165^^^^154^169^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^fragment.draw ( g2, x, rotateY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, anchorY, angle ) ;^164^165^^^^154^169^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX,  angle ) ;^164^165^^^^154^169^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^fragment.draw ( angle, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, g2 ) ;^164^165^^^^154^169^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY ) ;^164^165^^^^154^169^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^fragment.draw ( anchorY, x, g2 + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^164^165^^^^154^169^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^fragment.draw ( g2, rotateY, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, x, angle ) ;^164^165^^^^154^169^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^fragment.draw ( g2, yOffset, anchorY + x, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^164^165^^^^154^169^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateY, rotateX, angle ) ;^164^165^^^^154^169^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, angle, rotateY ) ;^164^165^^^^154^169^fragment.draw ( g2, x, anchorY + yOffset, TextAnchor.BASELINE_LEFT, rotateX, rotateY, angle ) ;^[CLASS] TextLine  [METHOD] draw [RETURN_TYPE] void   Graphics2D g2 float anchorX float anchorY TextAnchor anchor float rotateX float rotateY double angle [VARIABLES] Size2D  d  TextAnchor  anchor  boolean  double  angle  Iterator  iterator  List  fragments  float  anchorX  anchorY  rotateX  rotateY  x  yOffset  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^width = dimension + width.getWidth (  ) ;^185^^^^^178^189^width = width + dimension.getWidth (  ) ;^[CLASS] TextLine  [METHOD] calculateDimensions [RETURN_TYPE] Size2D   Graphics2D g2 [VARIABLES] Size2D  dimension  boolean  double  height  width  Iterator  iterator  List  fragments  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^height = Math.max ( dimension, height.getHeight (  )  ) ;^186^^^^^178^189^height = Math.max ( height, dimension.getHeight (  )  ) ;^[CLASS] TextLine  [METHOD] calculateDimensions [RETURN_TYPE] Size2D   Graphics2D g2 [VARIABLES] Size2D  dimension  boolean  double  height  width  Iterator  iterator  List  fragments  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^height = Math.max (  dimension.getHeight (  )  ) ;^186^^^^^178^189^height = Math.max ( height, dimension.getHeight (  )  ) ;^[CLASS] TextLine  [METHOD] calculateDimensions [RETURN_TYPE] Size2D   Graphics2D g2 [VARIABLES] Size2D  dimension  boolean  double  height  width  Iterator  iterator  List  fragments  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^height = Math.max ( height.getHeight (  )  ) ;^186^^^^^178^189^height = Math.max ( height, dimension.getHeight (  )  ) ;^[CLASS] TextLine  [METHOD] calculateDimensions [RETURN_TYPE] Size2D   Graphics2D g2 [VARIABLES] Size2D  dimension  boolean  double  height  width  Iterator  iterator  List  fragments  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^Size2D dimension = g2.calculateDimensions ( fragment ) ;^184^^^^^178^189^Size2D dimension = fragment.calculateDimensions ( g2 ) ;^[CLASS] TextLine  [METHOD] calculateDimensions [RETURN_TYPE] Size2D   Graphics2D g2 [VARIABLES] Size2D  dimension  boolean  double  height  width  Iterator  iterator  List  fragments  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^return new Size2D ( height, width ) ;^188^^^^^178^189^return new Size2D ( width, height ) ;^[CLASS] TextLine  [METHOD] calculateDimensions [RETURN_TYPE] Size2D   Graphics2D g2 [VARIABLES] Size2D  dimension  boolean  double  height  width  Iterator  iterator  List  fragments  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^return new Size2D (  height ) ;^188^^^^^178^189^return new Size2D ( width, height ) ;^[CLASS] TextLine  [METHOD] calculateDimensions [RETURN_TYPE] Size2D   Graphics2D g2 [VARIABLES] Size2D  dimension  boolean  double  height  width  Iterator  iterator  List  fragments  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^return new Size2D ( width ) ;^188^^^^^178^189^return new Size2D ( width, height ) ;^[CLASS] TextLine  [METHOD] calculateDimensions [RETURN_TYPE] Size2D   Graphics2D g2 [VARIABLES] Size2D  dimension  boolean  double  height  width  Iterator  iterator  List  fragments  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^result = Math.max ( anchor, fragment.calculateBaselineOffset ( g2, result )  ) ;^233^234^^^^227^237^result = Math.max ( result, fragment.calculateBaselineOffset ( g2, anchor )  ) ;^[CLASS] TextLine  [METHOD] calculateBaselineOffset [RETURN_TYPE] float   Graphics2D g2 TextAnchor anchor [VARIABLES] TextAnchor  anchor  boolean  Iterator  iterator  List  fragments  float  result  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^result = Math.max (  fragment.calculateBaselineOffset ( g2, anchor )  ) ;^233^234^^^^227^237^result = Math.max ( result, fragment.calculateBaselineOffset ( g2, anchor )  ) ;^[CLASS] TextLine  [METHOD] calculateBaselineOffset [RETURN_TYPE] float   Graphics2D g2 TextAnchor anchor [VARIABLES] TextAnchor  anchor  boolean  Iterator  iterator  List  fragments  float  result  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^result = Math.max ( result, g2.calculateBaselineOffset ( fragment, anchor )  ) ;^233^234^^^^227^237^result = Math.max ( result, fragment.calculateBaselineOffset ( g2, anchor )  ) ;^[CLASS] TextLine  [METHOD] calculateBaselineOffset [RETURN_TYPE] float   Graphics2D g2 TextAnchor anchor [VARIABLES] TextAnchor  anchor  boolean  Iterator  iterator  List  fragments  float  result  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^result = Math.max ( result.calculateBaselineOffset ( g2, anchor )  ) ;^233^234^^^^227^237^result = Math.max ( result, fragment.calculateBaselineOffset ( g2, anchor )  ) ;^[CLASS] TextLine  [METHOD] calculateBaselineOffset [RETURN_TYPE] float   Graphics2D g2 TextAnchor anchor [VARIABLES] TextAnchor  anchor  boolean  Iterator  iterator  List  fragments  float  result  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^result = Math.max ( g2, fragment.calculateBaselineOffset ( result, anchor )  ) ;^233^234^^^^227^237^result = Math.max ( result, fragment.calculateBaselineOffset ( g2, anchor )  ) ;^[CLASS] TextLine  [METHOD] calculateBaselineOffset [RETURN_TYPE] float   Graphics2D g2 TextAnchor anchor [VARIABLES] TextAnchor  anchor  boolean  Iterator  iterator  List  fragments  float  result  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^result = Math.max ( result, fragment.calculateBaselineOffset (  anchor )  ) ;^233^234^^^^227^237^result = Math.max ( result, fragment.calculateBaselineOffset ( g2, anchor )  ) ;^[CLASS] TextLine  [METHOD] calculateBaselineOffset [RETURN_TYPE] float   Graphics2D g2 TextAnchor anchor [VARIABLES] TextAnchor  anchor  boolean  Iterator  iterator  List  fragments  float  result  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^result = Math.max ( result, fragment.calculateBaselineOffset ( g2 )  ) ;^233^234^^^^227^237^result = Math.max ( result, fragment.calculateBaselineOffset ( g2, anchor )  ) ;^[CLASS] TextLine  [METHOD] calculateBaselineOffset [RETURN_TYPE] float   Graphics2D g2 TextAnchor anchor [VARIABLES] TextAnchor  anchor  boolean  Iterator  iterator  List  fragments  float  result  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^result = Math.max ( result, anchor.calculateBaselineOffset ( g2, fragment )  ) ;^233^234^^^^227^237^result = Math.max ( result, fragment.calculateBaselineOffset ( g2, anchor )  ) ;^[CLASS] TextLine  [METHOD] calculateBaselineOffset [RETURN_TYPE] float   Graphics2D g2 TextAnchor anchor [VARIABLES] TextAnchor  anchor  boolean  Iterator  iterator  List  fragments  float  result  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^result = Math.max ( result, fragment.calculateBaselineOffset ( anchor, g2 )  ) ;^233^234^^^^227^237^result = Math.max ( result, fragment.calculateBaselineOffset ( g2, anchor )  ) ;^[CLASS] TextLine  [METHOD] calculateBaselineOffset [RETURN_TYPE] float   Graphics2D g2 TextAnchor anchor [VARIABLES] TextAnchor  anchor  boolean  Iterator  iterator  List  fragments  float  result  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^fragment.calculateBaselineOffset ( anchor, g2 )  ) ;^234^^^^^227^237^fragment.calculateBaselineOffset ( g2, anchor )  ) ;^[CLASS] TextLine  [METHOD] calculateBaselineOffset [RETURN_TYPE] float   Graphics2D g2 TextAnchor anchor [VARIABLES] TextAnchor  anchor  boolean  Iterator  iterator  List  fragments  float  result  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^fragment.calculateBaselineOffset (  anchor )  ) ;^234^^^^^227^237^fragment.calculateBaselineOffset ( g2, anchor )  ) ;^[CLASS] TextLine  [METHOD] calculateBaselineOffset [RETURN_TYPE] float   Graphics2D g2 TextAnchor anchor [VARIABLES] TextAnchor  anchor  boolean  Iterator  iterator  List  fragments  float  result  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^fragment.calculateBaselineOffset ( g2 )  ) ;^234^^^^^227^237^fragment.calculateBaselineOffset ( g2, anchor )  ) ;^[CLASS] TextLine  [METHOD] calculateBaselineOffset [RETURN_TYPE] float   Graphics2D g2 TextAnchor anchor [VARIABLES] TextAnchor  anchor  boolean  Iterator  iterator  List  fragments  float  result  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^result = Math.max ( fragment, result.calculateBaselineOffset ( g2, anchor )  ) ;^233^234^^^^227^237^result = Math.max ( result, fragment.calculateBaselineOffset ( g2, anchor )  ) ;^[CLASS] TextLine  [METHOD] calculateBaselineOffset [RETURN_TYPE] float   Graphics2D g2 TextAnchor anchor [VARIABLES] TextAnchor  anchor  boolean  Iterator  iterator  List  fragments  float  result  TextFragment  fragment  long  serialVersionUID  Graphics2D  g2  
[buglab_swap_variables]^return this.fragments.equals ( line.fragments.fragments ) ;^255^^^^^246^258^return this.fragments.equals ( line.fragments ) ;^[CLASS] TextLine  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  fragments  Object  obj  boolean  TextLine  line  long  serialVersionUID  
[buglab_swap_variables]^return line.fragments.equals ( this.fragments ) ;^255^^^^^246^258^return this.fragments.equals ( line.fragments ) ;^[CLASS] TextLine  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  fragments  Object  obj  boolean  TextLine  line  long  serialVersionUID  
[buglab_swap_variables]^return line.equals ( this.fragments.fragments ) ;^255^^^^^246^258^return this.fragments.equals ( line.fragments ) ;^[CLASS] TextLine  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  fragments  Object  obj  boolean  TextLine  line  long  serialVersionUID  
[buglab_swap_variables]^return this.fragments.equals ( line ) ;^255^^^^^246^258^return this.fragments.equals ( line.fragments ) ;^[CLASS] TextLine  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  fragments  Object  obj  boolean  TextLine  line  long  serialVersionUID  
