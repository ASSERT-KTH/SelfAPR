[REPLACE]^private float a;^52^^^^^^^[REPLACE] private double a;^ [CLASS] LineFunction2D  
[REPLACE]^this.b = b; ;^64^^^^^63^66^[REPLACE] this.a = a;^[METHOD] <init> [TYPE] LineFunction2D(double,double) [PARAMETER] double a double b [CLASS] LineFunction2D   [TYPE]  double a  b  [TYPE]  boolean false  true 
[REPLACE]^this.a = a; ;^65^^^^^63^66^[REPLACE] this.b = b;^[METHOD] <init> [TYPE] LineFunction2D(double,double) [PARAMETER] double a double b [CLASS] LineFunction2D   [TYPE]  double a  b  [TYPE]  boolean false  true 
[REPLACE]^returna + this.b * x;^76^^^^^75^77^[REPLACE] return this.a + this.b * x;^[METHOD] getValue [TYPE] double [PARAMETER] double x [CLASS] LineFunction2D   [TYPE]  double a  b  x  [TYPE]  boolean false  true 
