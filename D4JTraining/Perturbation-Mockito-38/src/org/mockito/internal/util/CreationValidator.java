[REPLACE]^if  ( !  classToMock    )  {^14^^^^^13^17^[REPLACE] if  ( !ClassImposterizer.INSTANCE.canImposterise ( classToMock )  )  {^[METHOD] validateType [TYPE] void [PARAMETER] Class classToMock [CLASS] CreationValidator   [TYPE]  boolean false  true  [TYPE]  Class classToMock 
[REPLACE]^new Reporter (  ) .extraInterfacesCannotContainMockedType ( classToMock ) ;^15^^^^^13^17^[REPLACE] new Reporter (  ) .cannotMockFinalClass ( classToMock ) ;^[METHOD] validateType [TYPE] void [PARAMETER] Class classToMock [CLASS] CreationValidator   [TYPE]  boolean false  true  [TYPE]  Class classToMock 
[REPLACE]^if  ( extraInterfaces != null )  {^20^^^^^19^29^[REPLACE] if  ( extraInterfaces == null )  {^[METHOD] validateExtraInterfaces [TYPE] void [PARAMETER] Class classToMock  extraInterfaces [CLASS] CreationValidator   [TYPE]  Class[] extraInterfaces  [TYPE]  boolean false  true  [TYPE]  Class classToMock  i 
[REPLACE]^if  ( classToMock  &&  i )  {^25^^^^^19^29^[REPLACE] if  ( classToMock == i )  {^[METHOD] validateExtraInterfaces [TYPE] void [PARAMETER] Class classToMock  extraInterfaces [CLASS] CreationValidator   [TYPE]  Class[] extraInterfaces  [TYPE]  boolean false  true  [TYPE]  Class classToMock  i 
[REPLACE]^new Reporter (  ) .cannotMockFinalClass ( classToMock ) ;^26^^^^^19^29^[REPLACE] new Reporter (  ) .extraInterfacesCannotContainMockedType ( classToMock ) ;^[METHOD] validateExtraInterfaces [TYPE] void [PARAMETER] Class classToMock  extraInterfaces [CLASS] CreationValidator   [TYPE]  Class[] extraInterfaces  [TYPE]  boolean false  true  [TYPE]  Class classToMock  i 
[REPLACE]^for  ( Class i : extraInterfaces )  { if  ( classToMock == i )  {^24^^^^^19^29^[REPLACE] for  ( Class i : extraInterfaces )  {^[METHOD] validateExtraInterfaces [TYPE] void [PARAMETER] Class classToMock  extraInterfaces [CLASS] CreationValidator   [TYPE]  Class[] extraInterfaces  [TYPE]  boolean false  true  [TYPE]  Class classToMock  i 
