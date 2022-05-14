[buglab_swap_variables]^return  ( OHLCSeries )  series.get ( this.data ) ;^116^^^^^112^117^return  ( OHLCSeries )  this.data.get ( series ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getSeries [RETURN_TYPE] OHLCSeries   int series [VARIABLES] List  data  TimePeriodAnchor  xPosition  boolean  int  series  
[buglab_swap_variables]^OHLCSeries s =  ( OHLCSeries )  series.get ( this.data ) ;^180^^^^^179^184^OHLCSeries s =  ( OHLCSeries )  this.data.get ( series ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getXValue [RETURN_TYPE] double   int series int item [VARIABLES] OHLCItem  di  boolean  List  data  TimePeriodAnchor  xPosition  RegularTimePeriod  period  OHLCSeries  s  int  item  series  
[buglab_swap_variables]^OHLCItem di =  ( OHLCItem )  item.getDataItem ( s ) ;^181^^^^^179^184^OHLCItem di =  ( OHLCItem )  s.getDataItem ( item ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getXValue [RETURN_TYPE] double   int series int item [VARIABLES] OHLCItem  di  boolean  List  data  TimePeriodAnchor  xPosition  RegularTimePeriod  period  OHLCSeries  s  int  item  series  
[buglab_swap_variables]^return new Double ( getXValue ( item, series )  ) ;^195^^^^^194^196^return new Double ( getXValue ( series, item )  ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getX [RETURN_TYPE] Number   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  boolean  int  item  series  
[buglab_swap_variables]^return new Double ( getXValue (  item )  ) ;^195^^^^^194^196^return new Double ( getXValue ( series, item )  ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getX [RETURN_TYPE] Number   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  boolean  int  item  series  
[buglab_swap_variables]^return new Double ( getXValue ( series )  ) ;^195^^^^^194^196^return new Double ( getXValue ( series, item )  ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getX [RETURN_TYPE] Number   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  boolean  int  item  series  
[buglab_swap_variables]^OHLCSeries s =  ( OHLCSeries )  series.get ( this.data ) ;^207^^^^^206^210^OHLCSeries s =  ( OHLCSeries )  this.data.get ( series ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getY [RETURN_TYPE] Number   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  OHLCItem  di  boolean  OHLCSeries  s  int  item  series  
[buglab_swap_variables]^OHLCItem di =  ( OHLCItem )  item.getDataItem ( s ) ;^208^^^^^206^210^OHLCItem di =  ( OHLCItem )  s.getDataItem ( item ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getY [RETURN_TYPE] Number   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  OHLCItem  di  boolean  OHLCSeries  s  int  item  series  
[buglab_swap_variables]^OHLCSeries s =  ( OHLCSeries )  series.get ( this.data ) ;^221^^^^^220^224^OHLCSeries s =  ( OHLCSeries )  this.data.get ( series ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getOpenValue [RETURN_TYPE] double   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  OHLCItem  di  boolean  OHLCSeries  s  int  item  series  
[buglab_swap_variables]^OHLCItem di =  ( OHLCItem )  item.getDataItem ( s ) ;^222^^^^^220^224^OHLCItem di =  ( OHLCItem )  s.getDataItem ( item ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getOpenValue [RETURN_TYPE] double   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  OHLCItem  di  boolean  OHLCSeries  s  int  item  series  
[buglab_swap_variables]^return new Double ( getOpenValue ( item, series )  ) ;^235^^^^^234^236^return new Double ( getOpenValue ( series, item )  ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getOpen [RETURN_TYPE] Number   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  boolean  int  item  series  
[buglab_swap_variables]^return new Double ( getOpenValue (  item )  ) ;^235^^^^^234^236^return new Double ( getOpenValue ( series, item )  ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getOpen [RETURN_TYPE] Number   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  boolean  int  item  series  
[buglab_swap_variables]^return new Double ( getOpenValue ( series )  ) ;^235^^^^^234^236^return new Double ( getOpenValue ( series, item )  ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getOpen [RETURN_TYPE] Number   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  boolean  int  item  series  
[buglab_swap_variables]^OHLCSeries s =  ( OHLCSeries )  series.get ( this.data ) ;^247^^^^^246^250^OHLCSeries s =  ( OHLCSeries )  this.data.get ( series ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getCloseValue [RETURN_TYPE] double   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  OHLCItem  di  boolean  OHLCSeries  s  int  item  series  
[buglab_swap_variables]^OHLCItem di =  ( OHLCItem )  item.getDataItem ( s ) ;^248^^^^^246^250^OHLCItem di =  ( OHLCItem )  s.getDataItem ( item ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getCloseValue [RETURN_TYPE] double   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  OHLCItem  di  boolean  OHLCSeries  s  int  item  series  
[buglab_swap_variables]^return new Double ( getCloseValue ( item, series )  ) ;^261^^^^^260^262^return new Double ( getCloseValue ( series, item )  ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getClose [RETURN_TYPE] Number   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  boolean  int  item  series  
[buglab_swap_variables]^return new Double ( getCloseValue (  item )  ) ;^261^^^^^260^262^return new Double ( getCloseValue ( series, item )  ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getClose [RETURN_TYPE] Number   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  boolean  int  item  series  
[buglab_swap_variables]^return new Double ( getCloseValue ( series )  ) ;^261^^^^^260^262^return new Double ( getCloseValue ( series, item )  ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getClose [RETURN_TYPE] Number   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  boolean  int  item  series  
[buglab_swap_variables]^OHLCSeries s =  ( OHLCSeries )  series.get ( this.data ) ;^273^^^^^272^276^OHLCSeries s =  ( OHLCSeries )  this.data.get ( series ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getHighValue [RETURN_TYPE] double   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  OHLCItem  di  boolean  OHLCSeries  s  int  item  series  
[buglab_swap_variables]^OHLCItem di =  ( OHLCItem )  item.getDataItem ( s ) ;^274^^^^^272^276^OHLCItem di =  ( OHLCItem )  s.getDataItem ( item ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getHighValue [RETURN_TYPE] double   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  OHLCItem  di  boolean  OHLCSeries  s  int  item  series  
[buglab_swap_variables]^return new Double ( getHighValue ( item, series )  ) ;^287^^^^^286^288^return new Double ( getHighValue ( series, item )  ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getHigh [RETURN_TYPE] Number   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  boolean  int  item  series  
[buglab_swap_variables]^return new Double ( getHighValue (  item )  ) ;^287^^^^^286^288^return new Double ( getHighValue ( series, item )  ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getHigh [RETURN_TYPE] Number   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  boolean  int  item  series  
[buglab_swap_variables]^return new Double ( getHighValue ( series )  ) ;^287^^^^^286^288^return new Double ( getHighValue ( series, item )  ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getHigh [RETURN_TYPE] Number   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  boolean  int  item  series  
[buglab_swap_variables]^OHLCSeries s =  ( OHLCSeries )  series.get ( this.data ) ;^299^^^^^298^302^OHLCSeries s =  ( OHLCSeries )  this.data.get ( series ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getLowValue [RETURN_TYPE] double   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  OHLCItem  di  boolean  OHLCSeries  s  int  item  series  
[buglab_swap_variables]^OHLCItem di =  ( OHLCItem )  item.getDataItem ( s ) ;^300^^^^^298^302^OHLCItem di =  ( OHLCItem )  s.getDataItem ( item ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getLowValue [RETURN_TYPE] double   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  OHLCItem  di  boolean  OHLCSeries  s  int  item  series  
[buglab_swap_variables]^return new Double ( getLowValue ( item, series )  ) ;^313^^^^^312^314^return new Double ( getLowValue ( series, item )  ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getLow [RETURN_TYPE] Number   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  boolean  int  item  series  
[buglab_swap_variables]^return new Double ( getLowValue (  item )  ) ;^313^^^^^312^314^return new Double ( getLowValue ( series, item )  ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getLow [RETURN_TYPE] Number   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  boolean  int  item  series  
[buglab_swap_variables]^return new Double ( getLowValue ( series )  ) ;^313^^^^^312^314^return new Double ( getLowValue ( series, item )  ) ;^[CLASS] OHLCSeriesCollection  [METHOD] getLow [RETURN_TYPE] Number   int series int item [VARIABLES] List  data  TimePeriodAnchor  xPosition  boolean  int  item  series  
[buglab_swap_variables]^return ObjectUtilities.equal ( this.data, that.data.data ) ;^339^^^^^331^340^return ObjectUtilities.equal ( this.data, that.data ) ;^[CLASS] OHLCSeriesCollection  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  data  TimePeriodAnchor  xPosition  Object  obj  boolean  OHLCSeriesCollection  that  
[buglab_swap_variables]^return ObjectUtilities.equal ( this.data.data ) ;^339^^^^^331^340^return ObjectUtilities.equal ( this.data, that.data ) ;^[CLASS] OHLCSeriesCollection  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  data  TimePeriodAnchor  xPosition  Object  obj  boolean  OHLCSeriesCollection  that  
[buglab_swap_variables]^return ObjectUtilities.equal ( that.data, this.data ) ;^339^^^^^331^340^return ObjectUtilities.equal ( this.data, that.data ) ;^[CLASS] OHLCSeriesCollection  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  data  TimePeriodAnchor  xPosition  Object  obj  boolean  OHLCSeriesCollection  that  
[buglab_swap_variables]^return ObjectUtilities.equal (  that.data ) ;^339^^^^^331^340^return ObjectUtilities.equal ( this.data, that.data ) ;^[CLASS] OHLCSeriesCollection  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  data  TimePeriodAnchor  xPosition  Object  obj  boolean  OHLCSeriesCollection  that  
[buglab_swap_variables]^return ObjectUtilities.equal ( this.data, that ) ;^339^^^^^331^340^return ObjectUtilities.equal ( this.data, that.data ) ;^[CLASS] OHLCSeriesCollection  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  data  TimePeriodAnchor  xPosition  Object  obj  boolean  OHLCSeriesCollection  that  
[buglab_swap_variables]^return ObjectUtilities.equal ( this.data ) ;^339^^^^^331^340^return ObjectUtilities.equal ( this.data, that.data ) ;^[CLASS] OHLCSeriesCollection  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  data  TimePeriodAnchor  xPosition  Object  obj  boolean  OHLCSeriesCollection  that  
