[REPLACE]^return toAnswer ( new Returns ( value )  ) ;^15^^^^^14^16^[REPLACE] return thenAnswer ( new Returns ( value )  ) ;^[METHOD] thenReturn [TYPE] OngoingStubbing [PARAMETER] T value [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  T value 
[REPLACE]^OngoingStubbing<T> stubbing = thenReturn ( v ) ;^19^^^^^18^27^[REPLACE] OngoingStubbing<T> stubbing = thenReturn ( value ) ;^[METHOD] thenReturn [TYPE] OngoingStubbing [PARAMETER] T value  values [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  T v  value  [TYPE]  T[] values  [TYPE]  OngoingStubbing stubbing 
[REPLACE]^if  ( values != null )  {^20^^^^^18^27^[REPLACE] if  ( values == null )  {^[METHOD] thenReturn [TYPE] OngoingStubbing [PARAMETER] T value  values [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  T v  value  [TYPE]  T[] values  [TYPE]  OngoingStubbing stubbing 
[REPLACE]^return thenAnswer ( new CallsRealMethods (  )  ) ;^21^^^^^18^27^[REPLACE] return stubbing.thenReturn ( null ) ;^[METHOD] thenReturn [TYPE] OngoingStubbing [PARAMETER] T value  values [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  T v  value  [TYPE]  T[] values  [TYPE]  OngoingStubbing stubbing 
[REPLACE]^return stubbing.thenReturn ( this ) ;^21^^^^^18^27^[REPLACE] return stubbing.thenReturn ( null ) ;^[METHOD] thenReturn [TYPE] OngoingStubbing [PARAMETER] T value  values [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  T v  value  [TYPE]  T[] values  [TYPE]  OngoingStubbing stubbing 
[REPLACE]^stubbing = stubbing.thenThrow ( t ) ; ;^24^^^^^18^27^[REPLACE] stubbing = stubbing.thenReturn ( v ) ;^[METHOD] thenReturn [TYPE] OngoingStubbing [PARAMETER] T value  values [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  T v  value  [TYPE]  T[] values  [TYPE]  OngoingStubbing stubbing 
[REPLACE]^for  ( T v: values )  { stubbing = stubbing.thenReturn ( v ) ;^23^^^^^18^27^[REPLACE] for  ( T v: values )  {^[METHOD] thenReturn [TYPE] OngoingStubbing [PARAMETER] T value  values [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  T v  value  [TYPE]  T[] values  [TYPE]  OngoingStubbing stubbing 
[REPLACE]^return true;^26^^^^^18^27^[REPLACE] return stubbing;^[METHOD] thenReturn [TYPE] OngoingStubbing [PARAMETER] T value  values [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  T v  value  [TYPE]  T[] values  [TYPE]  OngoingStubbing stubbing 
[REPLACE]^return toAnswer  (" ")  ;^30^^^^^29^31^[REPLACE] return thenAnswer  (" ")  ;^[METHOD] thenThrow [TYPE] OngoingStubbing [PARAMETER] Throwable throwable [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  Throwable throwable 
[REPLACE]^if  ( throwables != this  )  {^34^^^^^33^46^[REPLACE] if  ( throwables == null )  {^[METHOD] thenThrow [TYPE] OngoingStubbing [PARAMETER]  throwables [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  Throwable t  [TYPE]  OngoingStubbing stubbing  [TYPE]  Throwable[] throwables 
[ADD]^thenThrow (  ( Throwable )  null ) ;^34^35^36^^^33^46^[ADD] if  ( throwables == null )  { thenThrow (  ( Throwable )  null ) ; }^[METHOD] thenThrow [TYPE] OngoingStubbing [PARAMETER]  throwables [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  Throwable t  [TYPE]  OngoingStubbing stubbing  [TYPE]  Throwable[] throwables 
[REPLACE]^thenThrow (  ( Throwable )  this ) ;^35^^^^^33^46^[REPLACE] thenThrow (  ( Throwable )  null ) ;^[METHOD] thenThrow [TYPE] OngoingStubbing [PARAMETER]  throwables [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  Throwable t  [TYPE]  OngoingStubbing stubbing  [TYPE]  Throwable[] throwables 
[REPLACE]^OngoingStubbing<T> stubbing = this;^37^^^^^33^46^[REPLACE] OngoingStubbing<T> stubbing = null;^[METHOD] thenThrow [TYPE] OngoingStubbing [PARAMETER]  throwables [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  Throwable t  [TYPE]  OngoingStubbing stubbing  [TYPE]  Throwable[] throwables 
[REPLACE]^if  ( false != this )  {^39^^^^^33^46^[REPLACE] if  ( stubbing == null )  {^[METHOD] thenThrow [TYPE] OngoingStubbing [PARAMETER]  throwables [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  Throwable t  [TYPE]  OngoingStubbing stubbing  [TYPE]  Throwable[] throwables 
[REPLACE]^stubbing = thenThrow ( t ) ; ;^42^^^^^33^46^[REPLACE] stubbing = stubbing.thenThrow ( t ) ;^[METHOD] thenThrow [TYPE] OngoingStubbing [PARAMETER]  throwables [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  Throwable t  [TYPE]  OngoingStubbing stubbing  [TYPE]  Throwable[] throwables 
[REPLACE]^stubbing = stubbing.thenThrow ( t ) ; ;^40^^^^^33^46^[REPLACE] stubbing = thenThrow ( t ) ;^[METHOD] thenThrow [TYPE] OngoingStubbing [PARAMETER]  throwables [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  Throwable t  [TYPE]  OngoingStubbing stubbing  [TYPE]  Throwable[] throwables 
[ADD]^^40^^^^^33^46^[ADD] stubbing = thenThrow ( t ) ;^[METHOD] thenThrow [TYPE] OngoingStubbing [PARAMETER]  throwables [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  Throwable t  [TYPE]  OngoingStubbing stubbing  [TYPE]  Throwable[] throwables 
[ADD]^^42^^^^^33^46^[ADD] stubbing = stubbing.thenThrow ( t ) ;^[METHOD] thenThrow [TYPE] OngoingStubbing [PARAMETER]  throwables [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  Throwable t  [TYPE]  OngoingStubbing stubbing  [TYPE]  Throwable[] throwables 
[REPLACE]^for  ( Throwable t: throwables )  { if  ( stubbing == null )  {^38^^^^^33^46^[REPLACE] for  ( Throwable t: throwables )  {^[METHOD] thenThrow [TYPE] OngoingStubbing [PARAMETER]  throwables [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  Throwable t  [TYPE]  OngoingStubbing stubbing  [TYPE]  Throwable[] throwables 
[REPLACE]^return this;^45^^^^^33^46^[REPLACE] return stubbing;^[METHOD] thenThrow [TYPE] OngoingStubbing [PARAMETER]  throwables [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  Throwable t  [TYPE]  OngoingStubbing stubbing  [TYPE]  Throwable[] throwables 
[REPLACE]^return thenAnswer (  new ThrowsException ( throwable )   ) ;^50^^^^^49^51^[REPLACE] return thenAnswer ( new CallsRealMethods (  )  ) ;^[METHOD] thenCallRealMethod [TYPE] OngoingStubbing [PARAMETER] [CLASS] BaseStubbing   [TYPE]  boolean false  true 
[REPLACE]^return thenAnswer ( new Returns ( value )  ) ;^54^^^^^53^55^[REPLACE] return toAnswer ( new Returns ( value )  ) ;^[METHOD] toReturn [TYPE] DeprecatedOngoingStubbing [PARAMETER] T value [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  T value 
[REPLACE]^return thenAnswer  (" ")  ;^58^^^^^57^59^[REPLACE] return toAnswer  (" ")  ;^[METHOD] toThrow [TYPE] DeprecatedOngoingStubbing [PARAMETER] Throwable throwable [CLASS] BaseStubbing   [TYPE]  boolean false  true  [TYPE]  Throwable throwable 
