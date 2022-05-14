[buglab_swap_variables]^add ( new SubSeriesDataset ( series, data )  ) ;^134^^^^^133^135^add ( new SubSeriesDataset ( data, series )  ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] add [RETURN_TYPE] void   SeriesDataset data int series [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  int  i  series  
[buglab_swap_variables]^add ( new SubSeriesDataset (  series )  ) ;^134^^^^^133^135^add ( new SubSeriesDataset ( data, series )  ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] add [RETURN_TYPE] void   SeriesDataset data int series [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  int  i  series  
[buglab_swap_variables]^add ( new SubSeriesDataset ( data )  ) ;^134^^^^^133^135^add ( new SubSeriesDataset ( data, series )  ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] add [RETURN_TYPE] void   SeriesDataset data int series [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  int  i  series  
[buglab_swap_variables]^for  ( datant i = 0; i < i.getSeriesCount (  ) ; i++ )  {^143^^^^^142^146^for  ( int i = 0; i < data.getSeriesCount (  ) ; i++ )  {^[CLASS] CombinedDataset DatasetInfo  [METHOD] fastAdd [RETURN_TYPE] void   SeriesDataset data [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  int  i  series  
[buglab_swap_variables]^this.datasetInfo.add ( new DatasetInfo ( i, data )  ) ;^144^^^^^142^146^this.datasetInfo.add ( new DatasetInfo ( data, i )  ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] fastAdd [RETURN_TYPE] void   SeriesDataset data [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  int  i  series  
[buglab_swap_variables]^this.datasetInfo.add ( new DatasetInfo (  i )  ) ;^144^^^^^142^146^this.datasetInfo.add ( new DatasetInfo ( data, i )  ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] fastAdd [RETURN_TYPE] void   SeriesDataset data [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  int  i  series  
[buglab_swap_variables]^this.datasetInfo.add ( new DatasetInfo ( data )  ) ;^144^^^^^142^146^this.datasetInfo.add ( new DatasetInfo ( data, i )  ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] fastAdd [RETURN_TYPE] void   SeriesDataset data [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  int  i  series  
[buglab_swap_variables]^return di.series.data.getSeriesKey ( di ) ;^170^^^^^168^171^return di.data.getSeriesKey ( di.series ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getSeriesKey [RETURN_TYPE] Comparable   int series [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  series  
[buglab_swap_variables]^return di.series.getSeriesKey ( di.data ) ;^170^^^^^168^171^return di.data.getSeriesKey ( di.series ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getSeriesKey [RETURN_TYPE] Comparable   int series [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  series  
[buglab_swap_variables]^return di.data.data.getSeriesKey ( di.series ) ;^170^^^^^168^171^return di.data.getSeriesKey ( di.series ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getSeriesKey [RETURN_TYPE] Comparable   int series [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  series  
[buglab_swap_variables]^return  (  ( XYDataset )  item.data ) .getX ( di.series, di ) ;^190^^^^^188^191^return  (  ( XYDataset )  di.data ) .getX ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getX [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( XYDataset )  di.data ) .getX ( di.series ) ;^190^^^^^188^191^return  (  ( XYDataset )  di.data ) .getX ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getX [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( XYDataset )  di.data ) .getX ( item, di.series ) ;^190^^^^^188^191^return  (  ( XYDataset )  di.data ) .getX ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getX [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( XYDataset )  di.data ) .getX (  item ) ;^190^^^^^188^191^return  (  ( XYDataset )  di.data ) .getX ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getX [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( XYDataset )  di.series.data ) .getX ( di, item ) ;^190^^^^^188^191^return  (  ( XYDataset )  di.data ) .getX ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getX [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( XYDataset )  di.data ) .getY ( item, di.series ) ;^206^^^^^204^207^return  (  ( XYDataset )  di.data ) .getY ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( XYDataset )  di.data ) .getY ( di.series ) ;^206^^^^^204^207^return  (  ( XYDataset )  di.data ) .getY ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( XYDataset )  di.data ) .getY (  item ) ;^206^^^^^204^207^return  (  ( XYDataset )  di.data ) .getY ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( XYDataset )  item.data ) .getY ( di.series, di ) ;^206^^^^^204^207^return  (  ( XYDataset )  di.data ) .getY ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( XYDataset )  di.series.data ) .getItemCount ( di ) ;^221^^^^^219^222^return  (  ( XYDataset )  di.data ) .getItemCount ( di.series ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getItemCount [RETURN_TYPE] int   int series [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( OHLCDataset )  di.series.data ) .getHigh ( di, item ) ;^241^^^^^239^242^return  (  ( OHLCDataset )  di.data ) .getHigh ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getHigh [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( OHLCDataset )  di.data ) .getHigh ( item, di.series ) ;^241^^^^^239^242^return  (  ( OHLCDataset )  di.data ) .getHigh ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getHigh [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( OHLCDataset )  di.data ) .getHigh ( di.series ) ;^241^^^^^239^242^return  (  ( OHLCDataset )  di.data ) .getHigh ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getHigh [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( OHLCDataset )  di.data ) .getHigh (  item ) ;^241^^^^^239^242^return  (  ( OHLCDataset )  di.data ) .getHigh ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getHigh [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^Number high = getHigh ( item, series ) ;^255^^^^^253^260^Number high = getHigh ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getHighValue [RETURN_TYPE] double   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  Number  high  int  i  item  series  double  result  
[buglab_swap_variables]^Number high = getHigh (  item ) ;^255^^^^^253^260^Number high = getHigh ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getHighValue [RETURN_TYPE] double   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  Number  high  int  i  item  series  double  result  
[buglab_swap_variables]^Number high = getHigh ( series ) ;^255^^^^^253^260^Number high = getHigh ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getHighValue [RETURN_TYPE] double   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  Number  high  int  i  item  series  double  result  
[buglab_swap_variables]^return  (  ( OHLCDataset )  di.series.data ) .getLow ( di, item ) ;^275^^^^^273^276^return  (  ( OHLCDataset )  di.data ) .getLow ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getLow [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( OHLCDataset )  item.data ) .getLow ( di.series, di ) ;^275^^^^^273^276^return  (  ( OHLCDataset )  di.data ) .getLow ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getLow [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( OHLCDataset )  di.data ) .getLow ( di.series ) ;^275^^^^^273^276^return  (  ( OHLCDataset )  di.data ) .getLow ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getLow [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( OHLCDataset )  di.data ) .getLow ( item, di.series ) ;^275^^^^^273^276^return  (  ( OHLCDataset )  di.data ) .getLow ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getLow [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( OHLCDataset )  di.data ) .getLow (  item ) ;^275^^^^^273^276^return  (  ( OHLCDataset )  di.data ) .getLow ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getLow [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^Number low = getLow ( item, series ) ;^289^^^^^287^294^Number low = getLow ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getLowValue [RETURN_TYPE] double   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  Number  low  int  i  item  series  double  result  
[buglab_swap_variables]^Number low = getLow (  item ) ;^289^^^^^287^294^Number low = getLow ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getLowValue [RETURN_TYPE] double   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  Number  low  int  i  item  series  double  result  
[buglab_swap_variables]^Number low = getLow ( series ) ;^289^^^^^287^294^Number low = getLow ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getLowValue [RETURN_TYPE] double   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  Number  low  int  i  item  series  double  result  
[buglab_swap_variables]^return  (  ( OHLCDataset )  di.series.data ) .getOpen ( di, item ) ;^309^^^^^307^310^return  (  ( OHLCDataset )  di.data ) .getOpen ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getOpen [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( OHLCDataset )  di.data ) .getOpen ( item, di.series ) ;^309^^^^^307^310^return  (  ( OHLCDataset )  di.data ) .getOpen ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getOpen [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( OHLCDataset )  di.data ) .getOpen ( di.series ) ;^309^^^^^307^310^return  (  ( OHLCDataset )  di.data ) .getOpen ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getOpen [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( OHLCDataset )  di.data ) .getOpen (  item ) ;^309^^^^^307^310^return  (  ( OHLCDataset )  di.data ) .getOpen ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getOpen [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^Number open = getOpen ( item, series ) ;^323^^^^^321^328^Number open = getOpen ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getOpenValue [RETURN_TYPE] double   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  Number  open  int  i  item  series  double  result  
[buglab_swap_variables]^Number open = getOpen (  item ) ;^323^^^^^321^328^Number open = getOpen ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getOpenValue [RETURN_TYPE] double   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  Number  open  int  i  item  series  double  result  
[buglab_swap_variables]^Number open = getOpen ( series ) ;^323^^^^^321^328^Number open = getOpen ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getOpenValue [RETURN_TYPE] double   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  Number  open  int  i  item  series  double  result  
[buglab_swap_variables]^return  (  ( OHLCDataset )  item.data ) .getClose ( di.series, di ) ;^343^^^^^341^344^return  (  ( OHLCDataset )  di.data ) .getClose ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getClose [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( OHLCDataset )  di.data ) .getClose ( di.series ) ;^343^^^^^341^344^return  (  ( OHLCDataset )  di.data ) .getClose ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getClose [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( OHLCDataset )  di.data ) .getClose (  item ) ;^343^^^^^341^344^return  (  ( OHLCDataset )  di.data ) .getClose ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getClose [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( OHLCDataset )  di.series.data ) .getClose ( di, item ) ;^343^^^^^341^344^return  (  ( OHLCDataset )  di.data ) .getClose ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getClose [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^Number close = getClose ( item, series ) ;^357^^^^^355^362^Number close = getClose ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getCloseValue [RETURN_TYPE] double   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  Number  close  int  i  item  series  double  result  
[buglab_swap_variables]^Number close = getClose (  item ) ;^357^^^^^355^362^Number close = getClose ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getCloseValue [RETURN_TYPE] double   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  Number  close  int  i  item  series  double  result  
[buglab_swap_variables]^Number close = getClose ( series ) ;^357^^^^^355^362^Number close = getClose ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getCloseValue [RETURN_TYPE] double   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  Number  close  int  i  item  series  double  result  
[buglab_swap_variables]^return  (  ( OHLCDataset )  di.series.data ) .getVolume ( di, item ) ;^377^^^^^375^378^return  (  ( OHLCDataset )  di.data ) .getVolume ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getVolume [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( OHLCDataset )  di.data ) .getVolume ( di.series ) ;^377^^^^^375^378^return  (  ( OHLCDataset )  di.data ) .getVolume ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getVolume [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( OHLCDataset )  di.data ) .getVolume ( item, di.series ) ;^377^^^^^375^378^return  (  ( OHLCDataset )  di.data ) .getVolume ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getVolume [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( OHLCDataset )  di.data ) .getVolume (  item ) ;^377^^^^^375^378^return  (  ( OHLCDataset )  di.data ) .getVolume ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getVolume [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( OHLCDataset )  item.data ) .getVolume ( di.series, di ) ;^377^^^^^375^378^return  (  ( OHLCDataset )  di.data ) .getVolume ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getVolume [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^Number volume = getVolume ( item, series ) ;^391^^^^^389^396^Number volume = getVolume ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getVolumeValue [RETURN_TYPE] double   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  Number  volume  int  i  item  series  double  result  
[buglab_swap_variables]^Number volume = getVolume (  item ) ;^391^^^^^389^396^Number volume = getVolume ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getVolumeValue [RETURN_TYPE] double   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  Number  volume  int  i  item  series  double  result  
[buglab_swap_variables]^Number volume = getVolume ( series ) ;^391^^^^^389^396^Number volume = getVolume ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getVolumeValue [RETURN_TYPE] double   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  Number  volume  int  i  item  series  double  result  
[buglab_swap_variables]^return getX ( item, series ) ;^416^^^^^410^418^return getX ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getStartX [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return getX (  item ) ;^416^^^^^410^418^return getX ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getStartX [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return getX ( series ) ;^416^^^^^410^418^return getX ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getStartX [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( IntervalXYDataset )  di.series.data ) .getStartX ( di, item ) ;^413^^^^^410^418^return  (  ( IntervalXYDataset )  di.data ) .getStartX ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getStartX [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( IntervalXYDataset )  di.data ) .getStartX ( item, di.series ) ;^413^^^^^410^418^return  (  ( IntervalXYDataset )  di.data ) .getStartX ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getStartX [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( IntervalXYDataset )  di.data ) .getStartX ( di.series ) ;^413^^^^^410^418^return  (  ( IntervalXYDataset )  di.data ) .getStartX ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getStartX [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( IntervalXYDataset )  di.data ) .getStartX (  item ) ;^413^^^^^410^418^return  (  ( IntervalXYDataset )  di.data ) .getStartX ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getStartX [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( IntervalXYDataset )  item.data ) .getStartX ( di.series, di ) ;^413^^^^^410^418^return  (  ( IntervalXYDataset )  di.data ) .getStartX ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getStartX [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return getX ( item, series ) ;^434^^^^^428^436^return getX ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getEndX [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return getX (  item ) ;^434^^^^^428^436^return getX ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getEndX [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return getX ( series ) ;^434^^^^^428^436^return getX ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getEndX [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( IntervalXYDataset )  item.data ) .getEndX ( di.series, di ) ;^431^^^^^428^436^return  (  ( IntervalXYDataset )  di.data ) .getEndX ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getEndX [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( IntervalXYDataset )  di.data ) .getEndX ( item, di.series ) ;^431^^^^^428^436^return  (  ( IntervalXYDataset )  di.data ) .getEndX ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getEndX [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( IntervalXYDataset )  di.data ) .getEndX ( di.series ) ;^431^^^^^428^436^return  (  ( IntervalXYDataset )  di.data ) .getEndX ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getEndX [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( IntervalXYDataset )  di.data ) .getEndX (  item ) ;^431^^^^^428^436^return  (  ( IntervalXYDataset )  di.data ) .getEndX ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getEndX [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^if  ( di.data.data instanceof IntervalXYDataset )  {^448^^^^^446^454^if  ( di.data instanceof IntervalXYDataset )  {^[CLASS] CombinedDataset DatasetInfo  [METHOD] getStartY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return getY ( item, series ) ;^452^^^^^446^454^return getY ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getStartY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return getY (  item ) ;^452^^^^^446^454^return getY ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getStartY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return getY ( series ) ;^452^^^^^446^454^return getY ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getStartY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( IntervalXYDataset )  di.series.data ) .getStartY ( di, item ) ;^449^^^^^446^454^return  (  ( IntervalXYDataset )  di.data ) .getStartY ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getStartY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( IntervalXYDataset )  di.data ) .getStartY ( item, di.series ) ;^449^^^^^446^454^return  (  ( IntervalXYDataset )  di.data ) .getStartY ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getStartY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( IntervalXYDataset )  di.data ) .getStartY ( di.series ) ;^449^^^^^446^454^return  (  ( IntervalXYDataset )  di.data ) .getStartY ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getStartY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( IntervalXYDataset )  di.data ) .getStartY (  item ) ;^449^^^^^446^454^return  (  ( IntervalXYDataset )  di.data ) .getStartY ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getStartY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( IntervalXYDataset )  item.data ) .getStartY ( di.series, di ) ;^449^^^^^446^454^return  (  ( IntervalXYDataset )  di.data ) .getStartY ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getStartY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return getY ( item, series ) ;^470^^^^^464^472^return getY ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getEndY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return getY (  item ) ;^470^^^^^464^472^return getY ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getEndY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return getY ( series ) ;^470^^^^^464^472^return getY ( series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getEndY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( IntervalXYDataset )  di.data ) .getEndY ( item, di.series ) ;^467^^^^^464^472^return  (  ( IntervalXYDataset )  di.data ) .getEndY ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getEndY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( IntervalXYDataset )  di.data ) .getEndY ( di.series ) ;^467^^^^^464^472^return  (  ( IntervalXYDataset )  di.data ) .getEndY ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getEndY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( IntervalXYDataset )  di.data ) .getEndY (  item ) ;^467^^^^^464^472^return  (  ( IntervalXYDataset )  di.data ) .getEndY ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getEndY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( IntervalXYDataset )  di.series.data ) .getEndY ( di, item ) ;^467^^^^^464^472^return  (  ( IntervalXYDataset )  di.data ) .getEndY ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getEndY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^return  (  ( IntervalXYDataset )  item.data ) .getEndY ( di.series, di ) ;^467^^^^^464^472^return  (  ( IntervalXYDataset )  di.data ) .getEndY ( di.series, item ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getEndY [RETURN_TYPE] Number   int series int item [VARIABLES] List  datasetInfo  boolean  SeriesDataset  data  DatasetInfo  di  int  i  item  series  
[buglab_swap_variables]^else if  ( childParent != parent )  {^496^^^^^485^506^else if  ( parent != childParent )  {^[CLASS] CombinedDataset DatasetInfo  [METHOD] getParent [RETURN_TYPE] SeriesDataset   [VARIABLES] List  datasetInfo  boolean  SeriesDataset  child  childParent  data  parent  int  i  item  series  
[buglab_swap_variables]^map = joinMap ( childMap, map ) ;^528^^^^^518^535^map = joinMap ( map, childMap ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getMap [RETURN_TYPE] int[]   [VARIABLES] List  datasetInfo  int[]  childMap  map  boolean  SeriesDataset  child  childParent  data  parent  int  i  item  series  
[buglab_swap_variables]^map = joinMap (  childMap ) ;^528^^^^^518^535^map = joinMap ( map, childMap ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getMap [RETURN_TYPE] int[]   [VARIABLES] List  datasetInfo  int[]  childMap  map  boolean  SeriesDataset  child  childParent  data  parent  int  i  item  series  
[buglab_swap_variables]^map = joinMap ( map ) ;^528^^^^^518^535^map = joinMap ( map, childMap ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getMap [RETURN_TYPE] int[]   [VARIABLES] List  datasetInfo  int[]  childMap  map  boolean  SeriesDataset  child  childParent  data  parent  int  i  item  series  
[buglab_swap_variables]^for  ( this.datasetInfont i = 0; i < i.size (  ) ; i++ )  {^521^^^^^518^535^for  ( int i = 0; i < this.datasetInfo.size (  ) ; i++ )  {^[CLASS] CombinedDataset DatasetInfo  [METHOD] getMap [RETURN_TYPE] int[]   [VARIABLES] List  datasetInfo  int[]  childMap  map  boolean  SeriesDataset  child  childParent  data  parent  int  i  item  series  
[buglab_swap_variables]^if  ( child instanceof CombinedDataset )  {^553^^^^^548^569^if  ( childDataset instanceof CombinedDataset )  {^[CLASS] CombinedDataset DatasetInfo  [METHOD] getChildPosition [RETURN_TYPE] int   Dataset child [VARIABLES] List  datasetInfo  boolean  SeriesDataset  child  childDataset  childParent  data  parent  int  i  item  m  n  series  Dataset  child  
[buglab_swap_variables]^if  ( childDataset == child )  {^562^^^^^548^569^if  ( child == childDataset )  {^[CLASS] CombinedDataset DatasetInfo  [METHOD] getChildPosition [RETURN_TYPE] int   Dataset child [VARIABLES] List  datasetInfo  boolean  SeriesDataset  child  childDataset  childParent  data  parent  int  i  item  m  n  series  Dataset  child  
[buglab_swap_variables]^return m + n;^557^^^^^548^569^return n + m;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getChildPosition [RETURN_TYPE] int   Dataset child [VARIABLES] List  datasetInfo  boolean  SeriesDataset  child  childDataset  childParent  data  parent  int  i  item  m  n  series  Dataset  child  
[buglab_swap_variables]^return  ( DatasetInfo )  series.get ( this.datasetInfo ) ;^583^^^^^582^584^return  ( DatasetInfo )  this.datasetInfo.get ( series ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] getDatasetInfo [RETURN_TYPE] CombinedDataset$DatasetInfo   int series [VARIABLES] List  datasetInfo  boolean  SeriesDataset  child  childDataset  childParent  data  parent  int  i  item  m  n  series  
[buglab_swap_variables]^System.arraycopy ( a.length, 0, result, 0, a ) ;^602^^^^^594^605^System.arraycopy ( a, 0, result, 0, a.length ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] joinMap [RETURN_TYPE] int[]   int[] a int[] b [VARIABLES] List  datasetInfo  int[]  a  b  result  boolean  SeriesDataset  child  childDataset  childParent  data  parent  int  i  item  m  n  series  
[buglab_swap_variables]^System.arraycopy (  0, result, 0, a.length ) ;^602^^^^^594^605^System.arraycopy ( a, 0, result, 0, a.length ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] joinMap [RETURN_TYPE] int[]   int[] a int[] b [VARIABLES] List  datasetInfo  int[]  a  b  result  boolean  SeriesDataset  child  childDataset  childParent  data  parent  int  i  item  m  n  series  
[buglab_swap_variables]^System.arraycopy ( result, 0, a, 0, a.length ) ;^602^^^^^594^605^System.arraycopy ( a, 0, result, 0, a.length ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] joinMap [RETURN_TYPE] int[]   int[] a int[] b [VARIABLES] List  datasetInfo  int[]  a  b  result  boolean  SeriesDataset  child  childDataset  childParent  data  parent  int  i  item  m  n  series  
[buglab_swap_variables]^System.arraycopy ( a, 0,  0, a.length ) ;^602^^^^^594^605^System.arraycopy ( a, 0, result, 0, a.length ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] joinMap [RETURN_TYPE] int[]   int[] a int[] b [VARIABLES] List  datasetInfo  int[]  a  b  result  boolean  SeriesDataset  child  childDataset  childParent  data  parent  int  i  item  m  n  series  
[buglab_swap_variables]^System.arraycopy ( a, 0, result, 0 ) ;^602^^^^^594^605^System.arraycopy ( a, 0, result, 0, a.length ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] joinMap [RETURN_TYPE] int[]   int[] a int[] b [VARIABLES] List  datasetInfo  int[]  a  b  result  boolean  SeriesDataset  child  childDataset  childParent  data  parent  int  i  item  m  n  series  
[buglab_swap_variables]^System.arraycopy ( a, 0, result, b.length, b.length ) ;^603^^^^^594^605^System.arraycopy ( b, 0, result, a.length, b.length ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] joinMap [RETURN_TYPE] int[]   int[] a int[] b [VARIABLES] List  datasetInfo  int[]  a  b  result  boolean  SeriesDataset  child  childDataset  childParent  data  parent  int  i  item  m  n  series  
[buglab_swap_variables]^System.arraycopy (  0, result, a.length, b.length ) ;^603^^^^^594^605^System.arraycopy ( b, 0, result, a.length, b.length ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] joinMap [RETURN_TYPE] int[]   int[] a int[] b [VARIABLES] List  datasetInfo  int[]  a  b  result  boolean  SeriesDataset  child  childDataset  childParent  data  parent  int  i  item  m  n  series  
[buglab_swap_variables]^System.arraycopy ( b, 0, b.length, a.length, result ) ;^603^^^^^594^605^System.arraycopy ( b, 0, result, a.length, b.length ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] joinMap [RETURN_TYPE] int[]   int[] a int[] b [VARIABLES] List  datasetInfo  int[]  a  b  result  boolean  SeriesDataset  child  childDataset  childParent  data  parent  int  i  item  m  n  series  
[buglab_swap_variables]^System.arraycopy ( b, 0,  a.length, b.length ) ;^603^^^^^594^605^System.arraycopy ( b, 0, result, a.length, b.length ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] joinMap [RETURN_TYPE] int[]   int[] a int[] b [VARIABLES] List  datasetInfo  int[]  a  b  result  boolean  SeriesDataset  child  childDataset  childParent  data  parent  int  i  item  m  n  series  
[buglab_swap_variables]^System.arraycopy ( b, 0, result.length, b.length ) ;^603^^^^^594^605^System.arraycopy ( b, 0, result, a.length, b.length ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] joinMap [RETURN_TYPE] int[]   int[] a int[] b [VARIABLES] List  datasetInfo  int[]  a  b  result  boolean  SeriesDataset  child  childDataset  childParent  data  parent  int  i  item  m  n  series  
[buglab_swap_variables]^System.arraycopy ( b, 0, result, b.length, a.length ) ;^603^^^^^594^605^System.arraycopy ( b, 0, result, a.length, b.length ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] joinMap [RETURN_TYPE] int[]   int[] a int[] b [VARIABLES] List  datasetInfo  int[]  a  b  result  boolean  SeriesDataset  child  childDataset  childParent  data  parent  int  i  item  m  n  series  
[buglab_swap_variables]^System.arraycopy ( b, 0, result,  b.length ) ;^603^^^^^594^605^System.arraycopy ( b, 0, result, a.length, b.length ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] joinMap [RETURN_TYPE] int[]   int[] a int[] b [VARIABLES] List  datasetInfo  int[]  a  b  result  boolean  SeriesDataset  child  childDataset  childParent  data  parent  int  i  item  m  n  series  
[buglab_swap_variables]^System.arraycopy ( b, 0, result, a.length ) ;^603^^^^^594^605^System.arraycopy ( b, 0, result, a.length, b.length ) ;^[CLASS] CombinedDataset DatasetInfo  [METHOD] joinMap [RETURN_TYPE] int[]   int[] a int[] b [VARIABLES] List  datasetInfo  int[]  a  b  result  boolean  SeriesDataset  child  childDataset  childParent  data  parent  int  i  item  m  n  series  
