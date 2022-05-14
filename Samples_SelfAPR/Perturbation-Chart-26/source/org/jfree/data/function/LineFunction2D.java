[P1_Replace_Type]^private int a;^52^^^^^47^57^private double a;^[CLASS] LineFunction2D   [VARIABLES] 
[P1_Replace_Type]^private float b;^55^^^^^50^60^private double b;^[CLASS] LineFunction2D   [VARIABLES] 
[P8_Replace_Mix]^private int b;^55^^^^^50^60^private double b;^[CLASS] LineFunction2D   [VARIABLES] 
[P5_Replace_Variable]^this.a = b;^64^^^^^63^66^this.a = a;^[CLASS] LineFunction2D  [METHOD] <init> [RETURN_TYPE] LineFunction2D(double,double)   double a double b [VARIABLES] double  a  b  boolean  
[P11_Insert_Donor_Statement]^this.b = b;this.a = a;^64^^^^^63^66^this.a = a;^[CLASS] LineFunction2D  [METHOD] <init> [RETURN_TYPE] LineFunction2D(double,double)   double a double b [VARIABLES] double  a  b  boolean  
[P5_Replace_Variable]^this.b = a;^65^^^^^63^66^this.b = b;^[CLASS] LineFunction2D  [METHOD] <init> [RETURN_TYPE] LineFunction2D(double,double)   double a double b [VARIABLES] double  a  b  boolean  
[P11_Insert_Donor_Statement]^this.a = a;this.b = b;^65^^^^^63^66^this.b = b;^[CLASS] LineFunction2D  [METHOD] <init> [RETURN_TYPE] LineFunction2D(double,double)   double a double b [VARIABLES] double  a  b  boolean  
[P2_Replace_Operator]^return + this.a + this.b * x;^76^^^^^75^77^return this.a + this.b * x;^[CLASS] LineFunction2D  [METHOD] getValue [RETURN_TYPE] double   double x [VARIABLES] double  a  b  x  boolean  
[P5_Replace_Variable]^return this.a + this.b * b;^76^^^^^75^77^return this.a + this.b * x;^[CLASS] LineFunction2D  [METHOD] getValue [RETURN_TYPE] double   double x [VARIABLES] double  a  b  x  boolean  
[P5_Replace_Variable]^return b + this.b * x;^76^^^^^75^77^return this.a + this.b * x;^[CLASS] LineFunction2D  [METHOD] getValue [RETURN_TYPE] double   double x [VARIABLES] double  a  b  x  boolean  
[P5_Replace_Variable]^return x + this.b * this.a;^76^^^^^75^77^return this.a + this.b * x;^[CLASS] LineFunction2D  [METHOD] getValue [RETURN_TYPE] double   double x [VARIABLES] double  a  b  x  boolean  
[P5_Replace_Variable]^return this.b + this.a * x;^76^^^^^75^77^return this.a + this.b * x;^[CLASS] LineFunction2D  [METHOD] getValue [RETURN_TYPE] double   double x [VARIABLES] double  a  b  x  boolean  
[P8_Replace_Mix]^return b  ;^76^^^^^75^77^return this.a + this.b * x;^[CLASS] LineFunction2D  [METHOD] getValue [RETURN_TYPE] double   double x [VARIABLES] double  a  b  x  boolean  
