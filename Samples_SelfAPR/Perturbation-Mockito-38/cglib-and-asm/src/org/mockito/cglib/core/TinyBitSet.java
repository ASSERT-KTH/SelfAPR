[P3_Replace_Literal]^private static int[] T = new int[260];^19^^^^^14^24^private static int[] T = new int[256];^[CLASS] TinyBitSet   [VARIABLES] 
[P8_Replace_Mix]^private static int[] T = new int[253];^19^^^^^14^24^private static int[] T = new int[256];^[CLASS] TinyBitSet   [VARIABLES] 
[P1_Replace_Type]^private  short  value = 0;^20^^^^^15^25^private int value = 0;^[CLASS] TinyBitSet   [VARIABLES] 
[P3_Replace_Literal]^private int value = 5;^20^^^^^15^25^private int value = 0;^[CLASS] TinyBitSet   [VARIABLES] 
[P8_Replace_Mix]^private int value = 4;^20^^^^^15^25^private int value = 0;^[CLASS] TinyBitSet   [VARIABLES] 
[P1_Replace_Type]^long  c = 0;^23^^^^^22^29^int c = 0;^[CLASS] TinyBitSet  [METHOD] gcount [RETURN_TYPE] int   int x [VARIABLES] int[]  T  int  c  value  x  boolean  
[P11_Insert_Donor_Statement]^int j = 0;int c = 0;^23^^^^^22^29^int c = 0;^[CLASS] TinyBitSet  [METHOD] gcount [RETURN_TYPE] int   int x [VARIABLES] int[]  T  int  c  value  x  boolean  
[P11_Insert_Donor_Statement]^int w = value;int c = 0;^23^^^^^22^29^int c = 0;^[CLASS] TinyBitSet  [METHOD] gcount [RETURN_TYPE] int   int x [VARIABLES] int[]  T  int  c  value  x  boolean  
[P2_Replace_Operator]^while  ( x == 0 )  {^24^^^^^22^29^while  ( x != 0 )  {^[CLASS] TinyBitSet  [METHOD] gcount [RETURN_TYPE] int   int x [VARIABLES] int[]  T  int  c  value  x  boolean  
[P3_Replace_Literal]^while  ( x != -6 )  {^24^^^^^22^29^while  ( x != 0 )  {^[CLASS] TinyBitSet  [METHOD] gcount [RETURN_TYPE] int   int x [VARIABLES] int[]  T  int  c  value  x  boolean  
[P5_Replace_Variable]^while  ( value != 0 )  {^24^^^^^22^29^while  ( x != 0 )  {^[CLASS] TinyBitSet  [METHOD] gcount [RETURN_TYPE] int   int x [VARIABLES] int[]  T  int  c  value  x  boolean  
[P2_Replace_Operator]^x &=  ( x  |  1 ) ;^26^^^^^22^29^x &=  ( x - 1 ) ;^[CLASS] TinyBitSet  [METHOD] gcount [RETURN_TYPE] int   int x [VARIABLES] int[]  T  int  c  value  x  boolean  
[P3_Replace_Literal]^x &=  ( x  ) ;^26^^^^^22^29^x &=  ( x - 1 ) ;^[CLASS] TinyBitSet  [METHOD] gcount [RETURN_TYPE] int   int x [VARIABLES] int[]  T  int  c  value  x  boolean  
[P5_Replace_Variable]^x &=  ( value - 1 ) ;^26^^^^^22^29^x &=  ( x - 1 ) ;^[CLASS] TinyBitSet  [METHOD] gcount [RETURN_TYPE] int   int x [VARIABLES] int[]  T  int  c  value  x  boolean  
[P8_Replace_Mix]^x &=  ( x - 1L ) ;^26^^^^^22^29^x &=  ( x - 1 ) ;^[CLASS] TinyBitSet  [METHOD] gcount [RETURN_TYPE] int   int x [VARIABLES] int[]  T  int  c  value  x  boolean  
[P2_Replace_Operator]^x &=  ( x  <=  1 ) ;^26^^^^^22^29^x &=  ( x - 1 ) ;^[CLASS] TinyBitSet  [METHOD] gcount [RETURN_TYPE] int   int x [VARIABLES] int[]  T  int  c  value  x  boolean  
[P3_Replace_Literal]^x &=  ( x - value ) ;^26^^^^^22^29^x &=  ( x - 1 ) ;^[CLASS] TinyBitSet  [METHOD] gcount [RETURN_TYPE] int   int x [VARIABLES] int[]  T  int  c  value  x  boolean  
[P8_Replace_Mix]^x &=  ( x - 1 >> 4 ) ;^26^^^^^22^29^x &=  ( x - 1 ) ;^[CLASS] TinyBitSet  [METHOD] gcount [RETURN_TYPE] int   int x [VARIABLES] int[]  T  int  c  value  x  boolean  
[P5_Replace_Variable]^return x;^28^^^^^22^29^return c;^[CLASS] TinyBitSet  [METHOD] gcount [RETURN_TYPE] int   int x [VARIABLES] int[]  T  int  c  value  x  boolean  
[P1_Replace_Type]^long  j;^38^^^^^37^43^int j;^[CLASS] TinyBitSet  [METHOD] topbit [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P11_Insert_Donor_Statement]^int j = 0;int j;^38^^^^^37^43^int j;^[CLASS] TinyBitSet  [METHOD] topbit [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P2_Replace_Operator]^for  ( j = 0; i == 0; i ^= j )  {^39^^^^^37^43^for  ( j = 0; i != 0; i ^= j )  {^[CLASS] TinyBitSet  [METHOD] topbit [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P3_Replace_Literal]^for  ( j = 7; i != 7; i ^= j )  {^39^^^^^37^43^for  ( j = 0; i != 0; i ^= j )  {^[CLASS] TinyBitSet  [METHOD] topbit [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P3_Replace_Literal]^for  ( j = x; i != x; i ^= j )  {^39^^^^^37^43^for  ( j = 0; i != 0; i ^= j )  {^[CLASS] TinyBitSet  [METHOD] topbit [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P5_Replace_Variable]^for  ( j = 0; x != 0; i ^= j )  {^39^^^^^37^43^for  ( j = 0; i != 0; i ^= j )  {^[CLASS] TinyBitSet  [METHOD] topbit [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P5_Replace_Variable]^for  ( i = 0; j != 0; i ^= j )  {^39^^^^^37^43^for  ( j = 0; i != 0; i ^= j )  {^[CLASS] TinyBitSet  [METHOD] topbit [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P8_Replace_Mix]^for  ( x = 0; i != 0; i ^= j )  {^39^^^^^37^43^for  ( j = 0; i != 0; i ^= j )  {^[CLASS] TinyBitSet  [METHOD] topbit [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P2_Replace_Operator]^j = i  >=  -i;^40^^^^^37^43^j = i & -i;^[CLASS] TinyBitSet  [METHOD] topbit [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P5_Replace_Variable]^j = value & -i;^40^^^^^37^43^j = i & -i;^[CLASS] TinyBitSet  [METHOD] topbit [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P8_Replace_Mix]^j =  x & -x;^40^^^^^37^43^j = i & -i;^[CLASS] TinyBitSet  [METHOD] topbit [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P3_Replace_Literal]^for  ( j = i; i != i; i ^= j )  {^39^^^^^37^43^for  ( j = 0; i != 0; i ^= j )  {^[CLASS] TinyBitSet  [METHOD] topbit [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P8_Replace_Mix]^for  ( j = 3; i != 3; i ^= j )  {^39^^^^^37^43^for  ( j = 0; i != 0; i ^= j )  {^[CLASS] TinyBitSet  [METHOD] topbit [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P5_Replace_Variable]^for  ( value = 0; i != 0; i ^= j )  {^39^^^^^37^43^for  ( j = 0; i != 0; i ^= j )  {^[CLASS] TinyBitSet  [METHOD] topbit [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P8_Replace_Mix]^for  ( j =  0; i !^39^^^^^37^43^for  ( j = 0; i != 0; i ^= j )  {^[CLASS] TinyBitSet  [METHOD] topbit [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P2_Replace_Operator]^j = i  <  -i;^40^^^^^37^43^j = i & -i;^[CLASS] TinyBitSet  [METHOD] topbit [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P5_Replace_Variable]^j = x & -i;^40^^^^^37^43^j = i & -i;^[CLASS] TinyBitSet  [METHOD] topbit [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P5_Replace_Variable]^return value;^42^^^^^37^43^return j;^[CLASS] TinyBitSet  [METHOD] topbit [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P1_Replace_Type]^short  j = 0;^46^^^^^45^51^int j = 0;^[CLASS] TinyBitSet  [METHOD] log2 [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P3_Replace_Literal]^int j = 9;^46^^^^^45^51^int j = 0;^[CLASS] TinyBitSet  [METHOD] log2 [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P11_Insert_Donor_Statement]^int j;int j = 0;^46^^^^^45^51^int j = 0;^[CLASS] TinyBitSet  [METHOD] log2 [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P11_Insert_Donor_Statement]^int w = value;int j = 0;^46^^^^^45^51^int j = 0;^[CLASS] TinyBitSet  [METHOD] log2 [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P11_Insert_Donor_Statement]^int c = 0;int j = 0;^46^^^^^45^51^int j = 0;^[CLASS] TinyBitSet  [METHOD] log2 [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P2_Replace_Operator]^for  ( j = 0; i >= 0; i >>= 1 )  {^47^^^^^45^51^for  ( j = 0; i != 0; i >>= 1 )  {^[CLASS] TinyBitSet  [METHOD] log2 [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P3_Replace_Literal]^for  ( j = x; i != x; i >>= 1 )  {^47^^^^^45^51^for  ( j = 0; i != 0; i >>= 1 )  {^[CLASS] TinyBitSet  [METHOD] log2 [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P3_Replace_Literal]^for  ( j = 4; i != 4; i >>= 1 )  {^47^^^^^45^51^for  ( j = 0; i != 0; i >>= 1 )  {^[CLASS] TinyBitSet  [METHOD] log2 [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P3_Replace_Literal]^for  ( j = 0; i != 0; i >>= x )  {^47^^^^^45^51^for  ( j = 0; i != 0; i >>= 1 )  {^[CLASS] TinyBitSet  [METHOD] log2 [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P5_Replace_Variable]^for  ( j = 0; value != 0; i >>= 1 )  {^47^^^^^45^51^for  ( j = 0; i != 0; i >>= 1 )  {^[CLASS] TinyBitSet  [METHOD] log2 [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P8_Replace_Mix]^for  ( j = 0; x != 0; i >>= 1 )  {^47^^^^^45^51^for  ( j = 0; i != 0; i >>= 1 )  {^[CLASS] TinyBitSet  [METHOD] log2 [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P3_Replace_Literal]^for  ( j = -7; i != -7; i >>= 1 )  {^47^^^^^45^51^for  ( j = 0; i != 0; i >>= 1 )  {^[CLASS] TinyBitSet  [METHOD] log2 [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P8_Replace_Mix]^for  ( j = 0 * 4; i != 0 * 4; i >>= 1 )  {^47^^^^^45^51^for  ( j = 0; i != 0; i >>= 1 )  {^[CLASS] TinyBitSet  [METHOD] log2 [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P8_Replace_Mix]^for  ( j = 0; i != 0; i >>= 4 )  {^47^^^^^45^51^for  ( j = 0; i != 0; i >>= 1 )  {^[CLASS] TinyBitSet  [METHOD] log2 [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P5_Replace_Variable]^return value;^50^^^^^45^51^return j;^[CLASS] TinyBitSet  [METHOD] log2 [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P8_Replace_Mix]^return x;^50^^^^^45^51^return j;^[CLASS] TinyBitSet  [METHOD] log2 [RETURN_TYPE] int   int i [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P5_Replace_Variable]^return log2 ( topbit ( j )  ) ;^54^^^^^53^55^return log2 ( topbit ( value )  ) ;^[CLASS] TinyBitSet  [METHOD] length [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P8_Replace_Mix]^return log2 ( topbit ( x )  ) ;^54^^^^^53^55^return log2 ( topbit ( value )  ) ;^[CLASS] TinyBitSet  [METHOD] length [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P14_Delete_Statement]^^54^^^^^53^55^return log2 ( topbit ( value )  ) ;^[CLASS] TinyBitSet  [METHOD] length [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  x  boolean  
[P1_Replace_Type]^short  w = value;^58^^^^^57^65^int w = value;^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P11_Insert_Donor_Statement]^int j = 0;int w = value;^58^^^^^57^65^int w = value;^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P11_Insert_Donor_Statement]^int c = 0;int w = value;^58^^^^^57^65^int w = value;^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P1_Replace_Type]^short  c = 0;^59^^^^^57^65^int c = 0;^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P3_Replace_Literal]^int c = value;^59^^^^^57^65^int c = 0;^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P11_Insert_Donor_Statement]^int j = 0;int c = 0;^59^^^^^57^65^int c = 0;^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P11_Insert_Donor_Statement]^int w = value;int c = 0;^59^^^^^57^65^int c = 0;^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P2_Replace_Operator]^while  ( w == 0 )  {^60^^^^^57^65^while  ( w != 0 )  {^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P3_Replace_Literal]^while  ( w != -3 )  {^60^^^^^57^65^while  ( w != 0 )  {^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P5_Replace_Variable]^while  ( x != 0 )  {^60^^^^^57^65^while  ( w != 0 )  {^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P2_Replace_Operator]^c += T[w  <<  255];^61^^^^^57^65^c += T[w & 255];^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P3_Replace_Literal]^c += T[w & j];^61^^^^^57^65^c += T[w & 255];^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P5_Replace_Variable]^c += T[value & 255];^61^^^^^57^65^c += T[w & 255];^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P8_Replace_Mix]^c += T[w & 255 - 3];^61^^^^^57^65^c += T[w & 255];^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P3_Replace_Literal]^w >>= value;^62^^^^^57^65^w >>= 8;^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P8_Replace_Mix]^w >>= 8 * 1;^62^^^^^57^65^w >>= 8;^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P2_Replace_Operator]^c += T[w  ^  255];^61^^^^^57^65^c += T[w & 255];^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P8_Replace_Mix]^c += T[w & 255 + 1];^61^^^^^57^65^c += T[w & 255];^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P3_Replace_Literal]^w >>= ;^62^^^^^57^65^w >>= 8;^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P8_Replace_Mix]^w >>= 4;^62^^^^^57^65^w >>= 8;^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P5_Replace_Variable]^return x;^64^^^^^57^65^return c;^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P8_Replace_Mix]^return w;^64^^^^^57^65^return c;^[CLASS] TinyBitSet  [METHOD] cardinality [RETURN_TYPE] int   [VARIABLES] int[]  T  int  c  i  j  value  w  x  boolean  
[P2_Replace_Operator]^return  ( value &  ( 1 << index )  )  == 0;^68^^^^^67^69^return  ( value &  ( 1 << index )  )  != 0;^[CLASS] TinyBitSet  [METHOD] get [RETURN_TYPE] boolean   int index [VARIABLES] int[]  T  int  c  i  index  j  value  w  x  boolean  
[P2_Replace_Operator]^return  ( value  |   ( 1 << index )  )  != 0;^68^^^^^67^69^return  ( value &  ( 1 << index )  )  != 0;^[CLASS] TinyBitSet  [METHOD] get [RETURN_TYPE] boolean   int index [VARIABLES] int[]  T  int  c  i  index  j  value  w  x  boolean  
[P2_Replace_Operator]^return  ( value &  ( 1  <  index )  )  != 0;^68^^^^^67^69^return  ( value &  ( 1 << index )  )  != 0;^[CLASS] TinyBitSet  [METHOD] get [RETURN_TYPE] boolean   int index [VARIABLES] int[]  T  int  c  i  index  j  value  w  x  boolean  
[P3_Replace_Literal]^return  ( value &  (  << index )  )  != 0;^68^^^^^67^69^return  ( value &  ( 1 << index )  )  != 0;^[CLASS] TinyBitSet  [METHOD] get [RETURN_TYPE] boolean   int index [VARIABLES] int[]  T  int  c  i  index  j  value  w  x  boolean  
[P3_Replace_Literal]^return  ( value &  ( 1 << index )  )  != c;^68^^^^^67^69^return  ( value &  ( 1 << index )  )  != 0;^[CLASS] TinyBitSet  [METHOD] get [RETURN_TYPE] boolean   int index [VARIABLES] int[]  T  int  c  i  index  j  value  w  x  boolean  
[P5_Replace_Variable]^return  ( value &  ( 1 << w )  )  != 0;^68^^^^^67^69^return  ( value &  ( 1 << index )  )  != 0;^[CLASS] TinyBitSet  [METHOD] get [RETURN_TYPE] boolean   int index [VARIABLES] int[]  T  int  c  i  index  j  value  w  x  boolean  
[P5_Replace_Variable]^return  ( x &  ( 1 << index )  )  != 0;^68^^^^^67^69^return  ( value &  ( 1 << index )  )  != 0;^[CLASS] TinyBitSet  [METHOD] get [RETURN_TYPE] boolean   int index [VARIABLES] int[]  T  int  c  i  index  j  value  w  x  boolean  
[P5_Replace_Variable]^return  ( index &  ( 1 << value )  )  != 0;^68^^^^^67^69^return  ( value &  ( 1 << index )  )  != 0;^[CLASS] TinyBitSet  [METHOD] get [RETURN_TYPE] boolean   int index [VARIABLES] int[]  T  int  c  i  index  j  value  w  x  boolean  
[P8_Replace_Mix]^return true ;^68^^^^^67^69^return  ( value &  ( 1 << index )  )  != 0;^[CLASS] TinyBitSet  [METHOD] get [RETURN_TYPE] boolean   int index [VARIABLES] int[]  T  int  c  i  index  j  value  w  x  boolean  
[P2_Replace_Operator]^value |=  ( 1  ^  index ) ;^72^^^^^71^73^value |=  ( 1 << index ) ;^[CLASS] TinyBitSet  [METHOD] set [RETURN_TYPE] void   int index [VARIABLES] int[]  T  int  c  i  index  j  value  w  x  boolean  
[P3_Replace_Literal]^value |=  ( value << index ) ;^72^^^^^71^73^value |=  ( 1 << index ) ;^[CLASS] TinyBitSet  [METHOD] set [RETURN_TYPE] void   int index [VARIABLES] int[]  T  int  c  i  index  j  value  w  x  boolean  
[P5_Replace_Variable]^value |=  ( 1 << value ) ;^72^^^^^71^73^value |=  ( 1 << index ) ;^[CLASS] TinyBitSet  [METHOD] set [RETURN_TYPE] void   int index [VARIABLES] int[]  T  int  c  i  index  j  value  w  x  boolean  
[P8_Replace_Mix]^value |=  ( 2 << index ) ;^72^^^^^71^73^value |=  ( 1 << index ) ;^[CLASS] TinyBitSet  [METHOD] set [RETURN_TYPE] void   int index [VARIABLES] int[]  T  int  c  i  index  j  value  w  x  boolean  
[P11_Insert_Donor_Statement]^value &= ~ ( 1 << index ) ;value |=  ( 1 << index ) ;^72^^^^^71^73^value |=  ( 1 << index ) ;^[CLASS] TinyBitSet  [METHOD] set [RETURN_TYPE] void   int index [VARIABLES] int[]  T  int  c  i  index  j  value  w  x  boolean  
[P2_Replace_Operator]^value &= ~ ( 1  ==  index ) ;^76^^^^^75^77^value &= ~ ( 1 << index ) ;^[CLASS] TinyBitSet  [METHOD] clear [RETURN_TYPE] void   int index [VARIABLES] int[]  T  int  c  i  index  j  value  w  x  boolean  
[P3_Replace_Literal]^value &= ~ ( 8 << index ) ;^76^^^^^75^77^value &= ~ ( 1 << index ) ;^[CLASS] TinyBitSet  [METHOD] clear [RETURN_TYPE] void   int index [VARIABLES] int[]  T  int  c  i  index  j  value  w  x  boolean  
[P5_Replace_Variable]^value &= ~ ( 1 << w ) ;^76^^^^^75^77^value &= ~ ( 1 << index ) ;^[CLASS] TinyBitSet  [METHOD] clear [RETURN_TYPE] void   int index [VARIABLES] int[]  T  int  c  i  index  j  value  w  x  boolean  
[P8_Replace_Mix]^value &= ~ ( 1 / 4 << index ) ;^76^^^^^75^77^value &= ~ ( 1 << index ) ;^[CLASS] TinyBitSet  [METHOD] clear [RETURN_TYPE] void   int index [VARIABLES] int[]  T  int  c  i  index  j  value  w  x  boolean  
[P11_Insert_Donor_Statement]^value |=  ( 1 << index ) ;value &= ~ ( 1 << index ) ;^76^^^^^75^77^value &= ~ ( 1 << index ) ;^[CLASS] TinyBitSet  [METHOD] clear [RETURN_TYPE] void   int index [VARIABLES] int[]  T  int  c  i  index  j  value  w  x  boolean  
