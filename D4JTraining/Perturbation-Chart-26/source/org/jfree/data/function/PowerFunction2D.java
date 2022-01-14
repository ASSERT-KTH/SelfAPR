[REPLACE]^private float a;^52^^^^^^^[REPLACE] private double a;^ [CLASS] PowerFunction2D  
[REPLACE]^this.b = b; ;^64^^^^^63^66^[REPLACE] this.a = a;^[METHOD] <init> [TYPE] PowerFunction2D(double,double) [PARAMETER] double a double b [CLASS] PowerFunction2D   [TYPE]  double a  b  [TYPE]  boolean false  true 
[REPLACE]^this.a = a; ;^65^^^^^63^66^[REPLACE] this.b = b;^[METHOD] <init> [TYPE] PowerFunction2D(double,double) [PARAMETER] double a double b [CLASS] PowerFunction2D   [TYPE]  double a  b  [TYPE]  boolean false  true 
[REPLACE]^return this.a *   this.b   ;^76^^^^^75^77^[REPLACE] return this.a * Math.pow ( x, this.b ) ;^[METHOD] getValue [TYPE] double [PARAMETER] double x [CLASS] PowerFunction2D   [TYPE]  double a  b  x  [TYPE]  boolean false  true 
