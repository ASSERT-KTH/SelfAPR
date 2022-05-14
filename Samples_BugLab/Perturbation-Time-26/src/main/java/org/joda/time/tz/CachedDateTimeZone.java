[buglab_swap_variables]^return instant.nextTransition ( iZone ) ;^123^^^^^122^124^return iZone.nextTransition ( instant ) ;^[CLASS] CachedDateTimeZone Info  [METHOD] nextTransition [RETURN_TYPE] long   long instant [VARIABLES] boolean  String  iNameKey  Info  iNextInfo  long  iPeriodStart  instant  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  DateTimeZone  iZone  iZoneRef  zone  Info[]  iInfoCache  
[buglab_swap_variables]^return instant.previousTransition ( iZone ) ;^127^^^^^126^128^return iZone.previousTransition ( instant ) ;^[CLASS] CachedDateTimeZone Info  [METHOD] previousTransition [RETURN_TYPE] long   long instant [VARIABLES] boolean  String  iNameKey  Info  iNextInfo  long  iPeriodStart  instant  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  DateTimeZone  iZone  iZoneRef  zone  Info[]  iInfoCache  
[buglab_swap_variables]^int index = cInfoCacheMask & period;^150^^^^^147^157^int index = period & cInfoCacheMask;^[CLASS] CachedDateTimeZone Info  [METHOD] getInfo [RETURN_TYPE] CachedDateTimeZone$Info   long millis [VARIABLES] boolean  String  iNameKey  Info  iNextInfo  info  long  iPeriodStart  instant  millis  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  index  period  DateTimeZone  iZone  iZoneRef  zone  Info[]  cache  iInfoCache  
[buglab_swap_variables]^Info info = new Info ( periodStart, iZone ) ;^161^^^^^159^175^Info info = new Info ( iZone, periodStart ) ;^[CLASS] CachedDateTimeZone Info  [METHOD] createInfo [RETURN_TYPE] CachedDateTimeZone$Info   long millis [VARIABLES] boolean  String  iNameKey  Info  chain  iNextInfo  info  long  end  iPeriodStart  instant  millis  next  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  index  period  DateTimeZone  iZone  iZoneRef  zone  Info[]  cache  iInfoCache  
[buglab_swap_variables]^Info info = new Info ( iZone ) ;^161^^^^^159^175^Info info = new Info ( iZone, periodStart ) ;^[CLASS] CachedDateTimeZone Info  [METHOD] createInfo [RETURN_TYPE] CachedDateTimeZone$Info   long millis [VARIABLES] boolean  String  iNameKey  Info  chain  iNextInfo  info  long  end  iPeriodStart  instant  millis  next  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  index  period  DateTimeZone  iZone  iZoneRef  zone  Info[]  cache  iInfoCache  
[buglab_swap_variables]^Info info = new Info (  periodStart ) ;^161^^^^^159^175^Info info = new Info ( iZone, periodStart ) ;^[CLASS] CachedDateTimeZone Info  [METHOD] createInfo [RETURN_TYPE] CachedDateTimeZone$Info   long millis [VARIABLES] boolean  String  iNameKey  Info  chain  iNextInfo  info  long  end  iPeriodStart  instant  millis  next  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  index  period  DateTimeZone  iZone  iZoneRef  zone  Info[]  cache  iInfoCache  
[buglab_swap_variables]^if  ( end == periodStart || next > next )  {^167^^^^^159^175^if  ( next == periodStart || next > end )  {^[CLASS] CachedDateTimeZone Info  [METHOD] createInfo [RETURN_TYPE] CachedDateTimeZone$Info   long millis [VARIABLES] boolean  String  iNameKey  Info  chain  iNextInfo  info  long  end  iPeriodStart  instant  millis  next  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  index  period  DateTimeZone  iZone  iZoneRef  zone  Info[]  cache  iInfoCache  
[buglab_swap_variables]^if  ( next == end || next > periodStart )  {^167^^^^^159^175^if  ( next == periodStart || next > end )  {^[CLASS] CachedDateTimeZone Info  [METHOD] createInfo [RETURN_TYPE] CachedDateTimeZone$Info   long millis [VARIABLES] boolean  String  iNameKey  Info  chain  iNextInfo  info  long  end  iPeriodStart  instant  millis  next  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  index  period  DateTimeZone  iZone  iZoneRef  zone  Info[]  cache  iInfoCache  
[buglab_swap_variables]^chain =  ( iZone.iNextInfo = new Info ( chain, periodStart )  ) ;^171^^^^^159^175^chain =  ( chain.iNextInfo = new Info ( iZone, periodStart )  ) ;^[CLASS] CachedDateTimeZone Info  [METHOD] createInfo [RETURN_TYPE] CachedDateTimeZone$Info   long millis [VARIABLES] boolean  String  iNameKey  Info  chain  iNextInfo  info  long  end  iPeriodStart  instant  millis  next  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  index  period  DateTimeZone  iZone  iZoneRef  zone  Info[]  cache  iInfoCache  
[buglab_swap_variables]^chain =  ( periodStart.iNextInfo = new Info ( iZone, chain )  ) ;^171^^^^^159^175^chain =  ( chain.iNextInfo = new Info ( iZone, periodStart )  ) ;^[CLASS] CachedDateTimeZone Info  [METHOD] createInfo [RETURN_TYPE] CachedDateTimeZone$Info   long millis [VARIABLES] boolean  String  iNameKey  Info  chain  iNextInfo  info  long  end  iPeriodStart  instant  millis  next  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  index  period  DateTimeZone  iZone  iZoneRef  zone  Info[]  cache  iInfoCache  
[buglab_swap_variables]^chain =  ( chain.iNextInfo = new Info ( iZone )  ) ;^171^^^^^159^175^chain =  ( chain.iNextInfo = new Info ( iZone, periodStart )  ) ;^[CLASS] CachedDateTimeZone Info  [METHOD] createInfo [RETURN_TYPE] CachedDateTimeZone$Info   long millis [VARIABLES] boolean  String  iNameKey  Info  chain  iNextInfo  info  long  end  iPeriodStart  instant  millis  next  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  index  period  DateTimeZone  iZone  iZoneRef  zone  Info[]  cache  iInfoCache  
[buglab_swap_variables]^chain =  ( chain.iNextInfo = new Info ( periodStart, iZone )  ) ;^171^^^^^159^175^chain =  ( chain.iNextInfo = new Info ( iZone, periodStart )  ) ;^[CLASS] CachedDateTimeZone Info  [METHOD] createInfo [RETURN_TYPE] CachedDateTimeZone$Info   long millis [VARIABLES] boolean  String  iNameKey  Info  chain  iNextInfo  info  long  end  iPeriodStart  instant  millis  next  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  index  period  DateTimeZone  iZone  iZoneRef  zone  Info[]  cache  iInfoCache  
[buglab_swap_variables]^chain =  ( chain.iNextInfo = new Info (  periodStart )  ) ;^171^^^^^159^175^chain =  ( chain.iNextInfo = new Info ( iZone, periodStart )  ) ;^[CLASS] CachedDateTimeZone Info  [METHOD] createInfo [RETURN_TYPE] CachedDateTimeZone$Info   long millis [VARIABLES] boolean  String  iNameKey  Info  chain  iNextInfo  info  long  end  iPeriodStart  instant  millis  next  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  index  period  DateTimeZone  iZone  iZoneRef  zone  Info[]  cache  iInfoCache  
[buglab_swap_variables]^long next = periodStart.nextTransition ( iZone ) ;^166^^^^^159^175^long next = iZone.nextTransition ( periodStart ) ;^[CLASS] CachedDateTimeZone Info  [METHOD] createInfo [RETURN_TYPE] CachedDateTimeZone$Info   long millis [VARIABLES] boolean  String  iNameKey  Info  chain  iNextInfo  info  long  end  iPeriodStart  instant  millis  next  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  index  period  DateTimeZone  iZone  iZoneRef  zone  Info[]  cache  iInfoCache  
[buglab_swap_variables]^if  ( periodStart == next || next > end )  {^167^^^^^159^175^if  ( next == periodStart || next > end )  {^[CLASS] CachedDateTimeZone Info  [METHOD] createInfo [RETURN_TYPE] CachedDateTimeZone$Info   long millis [VARIABLES] boolean  String  iNameKey  Info  chain  iNextInfo  info  long  end  iPeriodStart  instant  millis  next  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  index  period  DateTimeZone  iZone  iZoneRef  zone  Info[]  cache  iInfoCache  
[buglab_swap_variables]^if  ( iNextInfo == null || iNextInfo.iPeriodStart < millis )  {^194^^^^^193^201^if  ( iNextInfo == null || millis < iNextInfo.iPeriodStart )  {^[CLASS] CachedDateTimeZone Info  [METHOD] getNameKey [RETURN_TYPE] String   long millis [VARIABLES] boolean  String  iNameKey  Info  chain  iNextInfo  info  long  end  iPeriodStart  instant  millis  next  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  index  period  DateTimeZone  iZone  iZoneRef  zone  Info[]  cache  iInfoCache  
[buglab_swap_variables]^iNameKey = iPeriodStart.getNameKey ( iZoneRef ) ;^196^^^^^193^201^iNameKey = iZoneRef.getNameKey ( iPeriodStart ) ;^[CLASS] CachedDateTimeZone Info  [METHOD] getNameKey [RETURN_TYPE] String   long millis [VARIABLES] boolean  String  iNameKey  Info  chain  iNextInfo  info  long  end  iPeriodStart  instant  millis  next  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  index  period  DateTimeZone  iZone  iZoneRef  zone  Info[]  cache  iInfoCache  
[buglab_swap_variables]^return millis.getNameKey ( iNextInfo ) ;^200^^^^^193^201^return iNextInfo.getNameKey ( millis ) ;^[CLASS] CachedDateTimeZone Info  [METHOD] getNameKey [RETURN_TYPE] String   long millis [VARIABLES] boolean  String  iNameKey  Info  chain  iNextInfo  info  long  end  iPeriodStart  instant  millis  next  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  index  period  DateTimeZone  iZone  iZoneRef  zone  Info[]  cache  iInfoCache  
[buglab_swap_variables]^iOffset = iPeriodStart.getOffset ( iZoneRef ) ;^206^^^^^203^211^iOffset = iZoneRef.getOffset ( iPeriodStart ) ;^[CLASS] CachedDateTimeZone Info  [METHOD] getOffset [RETURN_TYPE] int   long millis [VARIABLES] boolean  String  iNameKey  Info  chain  iNextInfo  info  long  end  iPeriodStart  instant  millis  next  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  index  period  DateTimeZone  iZone  iZoneRef  zone  Info[]  cache  iInfoCache  
[buglab_swap_variables]^return millis.getOffset ( iNextInfo ) ;^210^^^^^203^211^return iNextInfo.getOffset ( millis ) ;^[CLASS] CachedDateTimeZone Info  [METHOD] getOffset [RETURN_TYPE] int   long millis [VARIABLES] boolean  String  iNameKey  Info  chain  iNextInfo  info  long  end  iPeriodStart  instant  millis  next  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  index  period  DateTimeZone  iZone  iZoneRef  zone  Info[]  cache  iInfoCache  
[buglab_swap_variables]^iStandardOffset = iPeriodStart.getStandardOffset ( iZoneRef ) ;^216^^^^^213^221^iStandardOffset = iZoneRef.getStandardOffset ( iPeriodStart ) ;^[CLASS] CachedDateTimeZone Info  [METHOD] getStandardOffset [RETURN_TYPE] int   long millis [VARIABLES] boolean  String  iNameKey  Info  chain  iNextInfo  info  long  end  iPeriodStart  instant  millis  next  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  index  period  DateTimeZone  iZone  iZoneRef  zone  Info[]  cache  iInfoCache  
[buglab_swap_variables]^return millis.getStandardOffset ( iNextInfo ) ;^220^^^^^213^221^return iNextInfo.getStandardOffset ( millis ) ;^[CLASS] CachedDateTimeZone Info  [METHOD] getStandardOffset [RETURN_TYPE] int   long millis [VARIABLES] boolean  String  iNameKey  Info  chain  iNextInfo  info  long  end  iPeriodStart  instant  millis  next  periodStart  serialVersionUID  int  cInfoCacheMask  iOffset  iStandardOffset  index  period  DateTimeZone  iZone  iZoneRef  zone  Info[]  cache  iInfoCache  
[buglab_swap_variables]^iNameKey = iPeriodStart.getNameKey ( iZoneRef ) ;^196^^^^^193^201^iNameKey = iZoneRef.getNameKey ( iPeriodStart ) ;^[CLASS] Info  [METHOD] getNameKey [RETURN_TYPE] String   long millis [VARIABLES] String  iNameKey  boolean  Info  iNextInfo  long  iPeriodStart  millis  periodStart  DateTimeZone  iZoneRef  zone  int  iOffset  iStandardOffset  
[buglab_swap_variables]^return millis.getNameKey ( iNextInfo ) ;^200^^^^^193^201^return iNextInfo.getNameKey ( millis ) ;^[CLASS] Info  [METHOD] getNameKey [RETURN_TYPE] String   long millis [VARIABLES] String  iNameKey  boolean  Info  iNextInfo  long  iPeriodStart  millis  periodStart  DateTimeZone  iZoneRef  zone  int  iOffset  iStandardOffset  
[buglab_swap_variables]^if  ( iNextInfo == null || iNextInfo.iPeriodStart < millis )  {^204^^^^^203^211^if  ( iNextInfo == null || millis < iNextInfo.iPeriodStart )  {^[CLASS] Info  [METHOD] getOffset [RETURN_TYPE] int   long millis [VARIABLES] String  iNameKey  boolean  Info  iNextInfo  long  iPeriodStart  millis  periodStart  DateTimeZone  iZoneRef  zone  int  iOffset  iStandardOffset  
[buglab_swap_variables]^iOffset = iPeriodStart.getOffset ( iZoneRef ) ;^206^^^^^203^211^iOffset = iZoneRef.getOffset ( iPeriodStart ) ;^[CLASS] Info  [METHOD] getOffset [RETURN_TYPE] int   long millis [VARIABLES] String  iNameKey  boolean  Info  iNextInfo  long  iPeriodStart  millis  periodStart  DateTimeZone  iZoneRef  zone  int  iOffset  iStandardOffset  
[buglab_swap_variables]^return millis.getOffset ( iNextInfo ) ;^210^^^^^203^211^return iNextInfo.getOffset ( millis ) ;^[CLASS] Info  [METHOD] getOffset [RETURN_TYPE] int   long millis [VARIABLES] String  iNameKey  boolean  Info  iNextInfo  long  iPeriodStart  millis  periodStart  DateTimeZone  iZoneRef  zone  int  iOffset  iStandardOffset  
[buglab_swap_variables]^if  ( iNextInfo == null || iNextInfo.iPeriodStart < millis )  {^214^^^^^213^221^if  ( iNextInfo == null || millis < iNextInfo.iPeriodStart )  {^[CLASS] Info  [METHOD] getStandardOffset [RETURN_TYPE] int   long millis [VARIABLES] String  iNameKey  boolean  Info  iNextInfo  long  iPeriodStart  millis  periodStart  DateTimeZone  iZoneRef  zone  int  iOffset  iStandardOffset  
[buglab_swap_variables]^if  ( millis == null || iNextInfo < iNextInfo.iPeriodStart )  {^214^^^^^213^221^if  ( iNextInfo == null || millis < iNextInfo.iPeriodStart )  {^[CLASS] Info  [METHOD] getStandardOffset [RETURN_TYPE] int   long millis [VARIABLES] String  iNameKey  boolean  Info  iNextInfo  long  iPeriodStart  millis  periodStart  DateTimeZone  iZoneRef  zone  int  iOffset  iStandardOffset  
[buglab_swap_variables]^iStandardOffset = iPeriodStart.getStandardOffset ( iZoneRef ) ;^216^^^^^213^221^iStandardOffset = iZoneRef.getStandardOffset ( iPeriodStart ) ;^[CLASS] Info  [METHOD] getStandardOffset [RETURN_TYPE] int   long millis [VARIABLES] String  iNameKey  boolean  Info  iNextInfo  long  iPeriodStart  millis  periodStart  DateTimeZone  iZoneRef  zone  int  iOffset  iStandardOffset  
[buglab_swap_variables]^return millis.getStandardOffset ( iNextInfo ) ;^220^^^^^213^221^return iNextInfo.getStandardOffset ( millis ) ;^[CLASS] Info  [METHOD] getStandardOffset [RETURN_TYPE] int   long millis [VARIABLES] String  iNameKey  boolean  Info  iNextInfo  long  iPeriodStart  millis  periodStart  DateTimeZone  iZoneRef  zone  int  iOffset  iStandardOffset  
