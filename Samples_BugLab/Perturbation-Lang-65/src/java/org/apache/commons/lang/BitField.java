[buglab_swap_variables]^return getRawValue ( _shift_count )  >> holder;^72^^^^^71^73^return getRawValue ( holder )  >> _shift_count;^[CLASS] BitField  [METHOD] getValue [RETURN_TYPE] int   int holder [VARIABLES] int  _mask  _shift_count  bit_pattern  count  holder  mask  boolean  
[buglab_swap_variables]^return _mask & holder;^101^^^^^100^102^return holder & _mask;^[CLASS] BitField  [METHOD] getRawValue [RETURN_TYPE] int   int holder [VARIABLES] int  _mask  _shift_count  bit_pattern  count  holder  mask  boolean  
[buglab_swap_variables]^return  ( _mask & holder )  != 0;^129^^^^^128^130^return  ( holder & _mask )  != 0;^[CLASS] BitField  [METHOD] isSet [RETURN_TYPE] boolean   int holder [VARIABLES] int  _mask  _shift_count  bit_pattern  count  holder  mask  boolean  
[buglab_swap_variables]^return  ( _mask & holder )  == _mask;^145^^^^^144^146^return  ( holder & _mask )  == _mask;^[CLASS] BitField  [METHOD] isAllSet [RETURN_TYPE] boolean   int holder [VARIABLES] int  _mask  _shift_count  bit_pattern  count  holder  mask  boolean  
[buglab_swap_variables]^return  ( _mask & ~_mask )  |  (  ( value << _shift_count )  & holder ) ;^159^^^^^158^160^return  ( holder & ~_mask )  |  (  ( value << _shift_count )  & _mask ) ;^[CLASS] BitField  [METHOD] setValue [RETURN_TYPE] int   int holder int value [VARIABLES] int  _mask  _shift_count  bit_pattern  count  holder  mask  value  boolean  
[buglab_swap_variables]^return  ( holder & ~_mask )  |  (  ( _shift_count << value )  & _mask ) ;^159^^^^^158^160^return  ( holder & ~_mask )  |  (  ( value << _shift_count )  & _mask ) ;^[CLASS] BitField  [METHOD] setValue [RETURN_TYPE] int   int holder int value [VARIABLES] int  _mask  _shift_count  bit_pattern  count  holder  mask  value  boolean  
[buglab_swap_variables]^return  ( holder & ~_mask )  |  (  ( _mask << _shift_count )  & value ) ;^159^^^^^158^160^return  ( holder & ~_mask )  |  (  ( value << _shift_count )  & _mask ) ;^[CLASS] BitField  [METHOD] setValue [RETURN_TYPE] int   int holder int value [VARIABLES] int  _mask  _shift_count  bit_pattern  count  holder  mask  value  boolean  
[buglab_swap_variables]^return  ( holder & ~_mask )  |  (  ( value << _mask )  & _shift_count ) ;^159^^^^^158^160^return  ( holder & ~_mask )  |  (  ( value << _shift_count )  & _mask ) ;^[CLASS] BitField  [METHOD] setValue [RETURN_TYPE] int   int holder int value [VARIABLES] int  _mask  _shift_count  bit_pattern  count  holder  mask  value  boolean  
[buglab_swap_variables]^return  ( short )  setValue ( value, holder ) ;^173^^^^^172^174^return  ( short )  setValue ( holder, value ) ;^[CLASS] BitField  [METHOD] setShortValue [RETURN_TYPE] short   short holder short value [VARIABLES] short  holder  value  int  _mask  _shift_count  bit_pattern  count  holder  mask  value  boolean  
[buglab_swap_variables]^return  ( short )  setValue (  value ) ;^173^^^^^172^174^return  ( short )  setValue ( holder, value ) ;^[CLASS] BitField  [METHOD] setShortValue [RETURN_TYPE] short   short holder short value [VARIABLES] short  holder  value  int  _mask  _shift_count  bit_pattern  count  holder  mask  value  boolean  
[buglab_swap_variables]^return  ( short )  setValue ( holder ) ;^173^^^^^172^174^return  ( short )  setValue ( holder, value ) ;^[CLASS] BitField  [METHOD] setShortValue [RETURN_TYPE] short   short holder short value [VARIABLES] short  holder  value  int  _mask  _shift_count  bit_pattern  count  holder  mask  value  boolean  
[buglab_swap_variables]^return _mask | holder;^222^^^^^221^223^return holder | _mask;^[CLASS] BitField  [METHOD] set [RETURN_TYPE] int   int holder [VARIABLES] int  _mask  _shift_count  bit_pattern  count  holder  mask  value  boolean  
[buglab_swap_variables]^return holder ? set ( flag )  : clear ( holder ) ;^260^^^^^259^261^return flag ? set ( holder )  : clear ( holder ) ;^[CLASS] BitField  [METHOD] setBoolean [RETURN_TYPE] int   int holder boolean flag [VARIABLES] int  _mask  _shift_count  bit_pattern  count  holder  mask  value  boolean  flag  
[buglab_swap_variables]^return holder ? setShort ( flag )  : clearShort ( holder ) ;^273^^^^^272^274^return flag ? setShort ( holder )  : clearShort ( holder ) ;^[CLASS] BitField  [METHOD] setShortBoolean [RETURN_TYPE] short   short holder boolean flag [VARIABLES] short  holder  int  _mask  _shift_count  bit_pattern  count  holder  mask  value  boolean  flag  
[buglab_swap_variables]^return holder ? setByte ( flag )  : clearByte ( holder ) ;^286^^^^^285^287^return flag ? setByte ( holder )  : clearByte ( holder ) ;^[CLASS] BitField  [METHOD] setByteBoolean [RETURN_TYPE] byte   byte holder boolean flag [VARIABLES] int  _mask  _shift_count  bit_pattern  count  holder  mask  value  byte  holder  boolean  flag  
