[REPLACE]^super .getProperty ( bean , this )  ;^34^^^^^33^45^[REPLACE] super.collectPropertyNames ( set, bean ) ;^[METHOD] collectPropertyNames [TYPE] void [PARAMETER] HashSet set Object bean [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  Enumeration e  [TYPE]  boolean false  true  [TYPE]  Object bean  [TYPE]  ServletRequestAndContext handle  [TYPE]  HashSet set 
[REPLACE]^ServletRequest servletRequest = handle.getServletRequest (  ) ;^35^^^^^33^45^[REPLACE] ServletRequestAndContext handle =  ( ServletRequestAndContext )  bean;^[METHOD] collectPropertyNames [TYPE] void [PARAMETER] HashSet set Object bean [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  Enumeration e  [TYPE]  boolean false  true  [TYPE]  Object bean  [TYPE]  ServletRequestAndContext handle  [TYPE]  HashSet set 
[REPLACE]^String[] strings = servletRequest.getParameterValues ( property ) ;^36^^^^^33^45^[REPLACE] ServletRequest servletRequest = handle.getServletRequest (  ) ;^[METHOD] collectPropertyNames [TYPE] void [PARAMETER] HashSet set Object bean [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  Enumeration e  [TYPE]  boolean false  true  [TYPE]  Object bean  [TYPE]  ServletRequestAndContext handle  [TYPE]  HashSet set 
[REPLACE]^Enumeration e = servletRequest.getParameterNames (  ) ;^37^^^^^33^45^[REPLACE] Enumeration e = servletRequest.getAttributeNames (  ) ;^[METHOD] collectPropertyNames [TYPE] void [PARAMETER] HashSet set Object bean [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  Enumeration e  [TYPE]  boolean false  true  [TYPE]  Object bean  [TYPE]  ServletRequestAndContext handle  [TYPE]  HashSet set 
[REPLACE]^while  ( e.nextElement (  )  )  {^38^^^^^33^45^[REPLACE] while  ( e.hasMoreElements (  )  )  {^[METHOD] collectPropertyNames [TYPE] void [PARAMETER] HashSet set Object bean [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  Enumeration e  [TYPE]  boolean false  true  [TYPE]  Object bean  [TYPE]  ServletRequestAndContext handle  [TYPE]  HashSet set 
[REPLACE]^set.add ( e .hasMoreElements (  )   ) ;^39^^^^^33^45^[REPLACE] set.add ( e.nextElement (  )  ) ;^[METHOD] collectPropertyNames [TYPE] void [PARAMETER] HashSet set Object bean [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  Enumeration e  [TYPE]  boolean false  true  [TYPE]  Object bean  [TYPE]  ServletRequestAndContext handle  [TYPE]  HashSet set 
[ADD]^^39^^^^^33^45^[ADD] set.add ( e.nextElement (  )  ) ;^[METHOD] collectPropertyNames [TYPE] void [PARAMETER] HashSet set Object bean [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  Enumeration e  [TYPE]  boolean false  true  [TYPE]  Object bean  [TYPE]  ServletRequestAndContext handle  [TYPE]  HashSet set 
[REPLACE]^set.add ( e.hasMoreElements (  )  ) ;^39^^^^^33^45^[REPLACE] set.add ( e.nextElement (  )  ) ;^[METHOD] collectPropertyNames [TYPE] void [PARAMETER] HashSet set Object bean [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  Enumeration e  [TYPE]  boolean false  true  [TYPE]  Object bean  [TYPE]  ServletRequestAndContext handle  [TYPE]  HashSet set 
[REPLACE]^e =  null.getParameterNames (  ) ;^41^^^^^33^45^[REPLACE] e = servletRequest.getParameterNames (  ) ;^[METHOD] collectPropertyNames [TYPE] void [PARAMETER] HashSet set Object bean [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  Enumeration e  [TYPE]  boolean false  true  [TYPE]  Object bean  [TYPE]  ServletRequestAndContext handle  [TYPE]  HashSet set 
[ADD]^^41^^^^^33^45^[ADD] e = servletRequest.getParameterNames (  ) ;^[METHOD] collectPropertyNames [TYPE] void [PARAMETER] HashSet set Object bean [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  Enumeration e  [TYPE]  boolean false  true  [TYPE]  Object bean  [TYPE]  ServletRequestAndContext handle  [TYPE]  HashSet set 
[REPLACE]^while  ( e.nextElement (  )  )  {^42^^^^^33^45^[REPLACE] while  ( e.hasMoreElements (  )  )  {^[METHOD] collectPropertyNames [TYPE] void [PARAMETER] HashSet set Object bean [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  Enumeration e  [TYPE]  boolean false  true  [TYPE]  Object bean  [TYPE]  ServletRequestAndContext handle  [TYPE]  HashSet set 
[REPLACE]^set.add ( e .hasMoreElements (  )   ) ;^43^^^^^33^45^[REPLACE] set.add ( e.nextElement (  )  ) ;^[METHOD] collectPropertyNames [TYPE] void [PARAMETER] HashSet set Object bean [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  Enumeration e  [TYPE]  boolean false  true  [TYPE]  Object bean  [TYPE]  ServletRequestAndContext handle  [TYPE]  HashSet set 
[REPLACE]^set.add ( e.hasMoreElements (  )  ) ;^43^^^^^33^45^[REPLACE] set.add ( e.nextElement (  )  ) ;^[METHOD] collectPropertyNames [TYPE] void [PARAMETER] HashSet set Object bean [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  Enumeration e  [TYPE]  boolean false  true  [TYPE]  Object bean  [TYPE]  ServletRequestAndContext handle  [TYPE]  HashSet set 
[REPLACE]^ServletRequest servletRequest = handle.getServletRequest (  ) ;^48^^^^^47^67^[REPLACE] ServletRequestAndContext handle =  ( ServletRequestAndContext )  bean;^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[REPLACE]^String[] strings = servletRequest.getParameterValues ( property ) ;^49^^^^^47^67^[REPLACE] ServletRequest servletRequest = handle.getServletRequest (  ) ;^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[REPLACE]^String[] strings = servletRequest.getAttribute ( property ) ;^50^^^^^47^67^[REPLACE] String[] strings = servletRequest.getParameterValues ( property ) ;^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[ADD]^^50^^^^^47^67^[ADD] String[] strings = servletRequest.getParameterValues ( property ) ;^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[REPLACE]^if  ( strings == null )  {^51^^^^^47^67^[REPLACE] if  ( strings != null )  {^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[ADD]^^51^52^53^54^^47^67^[ADD] if  ( strings != null )  { if  ( strings.length == 0 )  { return null; }^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[REPLACE]^if  ( strings.length /  0.5  == 0 )  {^52^^^^^47^67^[REPLACE] if  ( strings.length == 0 )  {^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[REPLACE]^return true;^53^^^^^47^67^[REPLACE] return null;^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[REPLACE]^if  ( strings.length %  0.5  == 1 )  {^55^^^^^47^67^[REPLACE] if  ( strings.length == 1 )  {^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[REPLACE]^return strings[0 % 0];^56^^^^^47^67^[REPLACE] return strings[0];^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[REPLACE]^return this;^53^^^^^47^67^[REPLACE] return null;^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[REPLACE]^return strings;^56^^^^^47^67^[REPLACE] return strings[0];^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[REPLACE]^return strings[0];^58^^^^^47^67^[REPLACE] return strings;^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[REPLACE]^if  ( strings.length - 2 == 0 )  {^52^^^^^47^67^[REPLACE] if  ( strings.length == 0 )  {^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[REPLACE]^if  ( strings.length *  0.5  == 1 )  {^55^^^^^47^67^[REPLACE] if  ( strings.length == 1 )  {^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[REPLACE]^return strings[4];^56^^^^^47^67^[REPLACE] return strings[0];^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[REPLACE]^return strings[2];^56^^^^^47^67^[REPLACE] return strings[0];^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[REPLACE]^Object object = servletRequest.getParameterValues ( property ) ;^61^^^^^47^67^[REPLACE] Object object = servletRequest.getAttribute ( property ) ;^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[REPLACE]^if  ( object == this  )  {^62^^^^^47^67^[REPLACE] if  ( object != null )  {^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[REPLACE]^return bean;^63^^^^^47^67^[REPLACE] return object;^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[REPLACE]^return super.setAttribute ( bean, property ) ;^66^^^^^47^67^[REPLACE] return super.getProperty ( bean, property ) ;^[METHOD] getProperty [TYPE] Object [PARAMETER] Object bean String property [CLASS] ServletRequestHandler   [TYPE]  ServletRequest servletRequest  [TYPE]  boolean false  true  [TYPE]  Object bean  object  [TYPE]  String property  [TYPE]  ServletRequestAndContext handle  [TYPE]  String[] strings 
[REPLACE]^(  ( ServletRequest )  request ) .setAttribute ( property, request ) ;^70^^^^^69^71^[REPLACE] (  ( ServletRequest )  request ) .setAttribute ( property, value ) ;^[METHOD] setProperty [TYPE] void [PARAMETER] Object request String property Object value [CLASS] ServletRequestHandler   [TYPE]  boolean false  true  [TYPE]  Object request  value  [TYPE]  String property 
