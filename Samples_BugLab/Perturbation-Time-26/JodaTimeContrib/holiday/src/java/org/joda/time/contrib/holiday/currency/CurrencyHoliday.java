[buglab_swap_variables]^Date holi = year.date ( _rawHoli ) ;^83^^^^^82^93^Date holi = _rawHoli.date ( year ) ;^[CLASS] CcyHoli  [METHOD] date [RETURN_TYPE] Date   int year [VARIABLES] Weekday  wkdy  RawHolidayChoice  _rawHoli  raw  boolean  long  serialVersionUID  int  _sat  _sun  sat  sun  year  Date  holi  
[buglab_swap_variables]^} else if  ( wkdy != 0 && _sat.equals ( Weekday.SAT )  )  {^88^^^^^82^93^} else if  ( _sat != 0 && wkdy.equals ( Weekday.SAT )  )  {^[CLASS] CcyHoli  [METHOD] date [RETURN_TYPE] Date   int year [VARIABLES] Weekday  wkdy  RawHolidayChoice  _rawHoli  raw  boolean  long  serialVersionUID  int  _sat  _sun  sat  sun  year  Date  holi  
[buglab_swap_variables]^holi = _sat.addDays ( holi ) ;^89^^^^^82^93^holi = holi.addDays ( _sat ) ;^[CLASS] CcyHoli  [METHOD] date [RETURN_TYPE] Date   int year [VARIABLES] Weekday  wkdy  RawHolidayChoice  _rawHoli  raw  boolean  long  serialVersionUID  int  _sat  _sun  sat  sun  year  Date  holi  
[buglab_swap_variables]^holi = _sun.addDays ( holi ) ;^87^^^^^82^93^holi = holi.addDays ( _sun ) ;^[CLASS] CcyHoli  [METHOD] date [RETURN_TYPE] Date   int year [VARIABLES] Weekday  wkdy  RawHolidayChoice  _rawHoli  raw  boolean  long  serialVersionUID  int  _sat  _sun  sat  sun  year  Date  holi  
[buglab_swap_variables]^if  ( wkdy != 0 && _sun.equals ( Weekday.SUN )  )  {^86^^^^^82^93^if  ( _sun != 0 && wkdy.equals ( Weekday.SUN )  )  {^[CLASS] CcyHoli  [METHOD] date [RETURN_TYPE] Date   int year [VARIABLES] Weekday  wkdy  RawHolidayChoice  _rawHoli  raw  boolean  long  serialVersionUID  int  _sat  _sun  sat  sun  year  Date  holi  
[buglab_swap_variables]^List<Date> list = new ArrayList<Date> ( start - end + 1 ) ;^103^^^^^102^108^List<Date> list = new ArrayList<Date> ( end - start + 1 ) ;^[CLASS] CcyHoli  [METHOD] dates [RETURN_TYPE] List   int start int end [VARIABLES] List  list  RawHolidayChoice  _rawHoli  raw  boolean  long  serialVersionUID  int  _sat  _sun  end  sat  start  sun  year  
[buglab_swap_variables]^Map<String, RawHolidayChoice> _ccysMap = ccy.get ( ccy ) ;^1061^^^^^1060^1063^Map<String, RawHolidayChoice> ccyMap = _ccys.get ( ccy ) ;^[CLASS] CurrencyHoliday  [METHOD] holidays [RETURN_TYPE] Iterator   String ccy [VARIABLES] String  ccy  boolean  Logger  _logger  Map  _ccys  ccyMap  ChoiceList  _raws  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  
[buglab_swap_variables]^for  ( Iterator<RawHolidayChoice> ih = ccydays ( holi ) ; ih.hasNext (  ) ; )  {^1075^^^^^1071^1085^for  ( Iterator<RawHolidayChoice> ih = holidays ( ccy ) ; ih.hasNext (  ) ; )  {^[CLASS] CurrencyHoliday  [METHOD] print [RETURN_TYPE] void   String ccy int start int end [VARIABLES] RawHolidayChoice  holi  boolean  ChoiceList  _raws  Iterator  ih  String  ccy  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  start  year  Date  date  
[buglab_swap_variables]^for  ( start = year; year <= end; year++ )  {^1078^^^^^1071^1085^for  ( year = start; year <= end; year++ )  {^[CLASS] CurrencyHoliday  [METHOD] print [RETURN_TYPE] void   String ccy int start int end [VARIABLES] RawHolidayChoice  holi  boolean  ChoiceList  _raws  Iterator  ih  String  ccy  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  start  year  Date  date  
[buglab_swap_variables]^for  ( end = start; year <= year; year++ )  {^1078^^^^^1071^1085^for  ( year = start; year <= end; year++ )  {^[CLASS] CurrencyHoliday  [METHOD] print [RETURN_TYPE] void   String ccy int start int end [VARIABLES] RawHolidayChoice  holi  boolean  ChoiceList  _raws  Iterator  ih  String  ccy  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  start  year  Date  date  
[buglab_swap_variables]^date = year.date ( holi ) ;^1079^^^^^1071^1085^date = holi.date ( year ) ;^[CLASS] CurrencyHoliday  [METHOD] print [RETURN_TYPE] void   String ccy int start int end [VARIABLES] RawHolidayChoice  holi  boolean  ChoiceList  _raws  Iterator  ih  String  ccy  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  start  year  Date  date  
[buglab_swap_variables]^RawHolidayChoice raw =  ( RawHolidayChoice )  holi.choice ( _raws ) ;^1095^^^^^1094^1099^RawHolidayChoice raw =  ( RawHolidayChoice )  _raws.choice ( holi ) ;^[CLASS] CurrencyHoliday  [METHOD] addHoliday [RETURN_TYPE] void   String ccy String holi [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  holi  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  start  year  
[buglab_swap_variables]^putHoliday ( raw, ccy ) ;^1097^^^^^1094^1099^putHoliday ( ccy, raw ) ;^[CLASS] CurrencyHoliday  [METHOD] addHoliday [RETURN_TYPE] void   String ccy String holi [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  holi  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  start  year  
[buglab_swap_variables]^putHoliday (  raw ) ;^1097^^^^^1094^1099^putHoliday ( ccy, raw ) ;^[CLASS] CurrencyHoliday  [METHOD] addHoliday [RETURN_TYPE] void   String ccy String holi [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  holi  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  start  year  
[buglab_swap_variables]^putHoliday ( ccy ) ;^1097^^^^^1094^1099^putHoliday ( ccy, raw ) ;^[CLASS] CurrencyHoliday  [METHOD] addHoliday [RETURN_TYPE] void   String ccy String holi [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  holi  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  start  year  
[buglab_swap_variables]^if  ( sun == 0 && sat == 0 )  {^1109^^^^^1108^1117^if  ( sat == 0 && sun == 0 )  {^[CLASS] CurrencyHoliday  [METHOD] addHoliday [RETURN_TYPE] void   String ccy String holi int sat int sun [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  holi  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
[buglab_swap_variables]^putHoliday ( ccy, new CcyHoli ( sun, sat, raw )  ) ;^1114^^^^^1108^1117^putHoliday ( ccy, new CcyHoli ( raw, sat, sun )  ) ;^[CLASS] CurrencyHoliday  [METHOD] addHoliday [RETURN_TYPE] void   String ccy String holi int sat int sun [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  holi  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
[buglab_swap_variables]^putHoliday ( ccy, new CcyHoli (  sat, sun )  ) ;^1114^^^^^1108^1117^putHoliday ( ccy, new CcyHoli ( raw, sat, sun )  ) ;^[CLASS] CurrencyHoliday  [METHOD] addHoliday [RETURN_TYPE] void   String ccy String holi int sat int sun [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  holi  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
[buglab_swap_variables]^putHoliday ( ccy, new CcyHoli ( sat, raw, sun )  ) ;^1114^^^^^1108^1117^putHoliday ( ccy, new CcyHoli ( raw, sat, sun )  ) ;^[CLASS] CurrencyHoliday  [METHOD] addHoliday [RETURN_TYPE] void   String ccy String holi int sat int sun [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  holi  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
[buglab_swap_variables]^putHoliday ( ccy, new CcyHoli ( raw,  sun )  ) ;^1114^^^^^1108^1117^putHoliday ( ccy, new CcyHoli ( raw, sat, sun )  ) ;^[CLASS] CurrencyHoliday  [METHOD] addHoliday [RETURN_TYPE] void   String ccy String holi int sat int sun [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  holi  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
[buglab_swap_variables]^putHoliday ( ccy, new CcyHoli ( raw, sun, sat )  ) ;^1114^^^^^1108^1117^putHoliday ( ccy, new CcyHoli ( raw, sat, sun )  ) ;^[CLASS] CurrencyHoliday  [METHOD] addHoliday [RETURN_TYPE] void   String ccy String holi int sat int sun [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  holi  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
[buglab_swap_variables]^putHoliday ( ccy, new CcyHoli ( raw, sat )  ) ;^1114^^^^^1108^1117^putHoliday ( ccy, new CcyHoli ( raw, sat, sun )  ) ;^[CLASS] CurrencyHoliday  [METHOD] addHoliday [RETURN_TYPE] void   String ccy String holi int sat int sun [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  holi  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
[buglab_swap_variables]^putHoliday ( sat, new CcyHoli ( raw, ccy, sun )  ) ;^1114^^^^^1108^1117^putHoliday ( ccy, new CcyHoli ( raw, sat, sun )  ) ;^[CLASS] CurrencyHoliday  [METHOD] addHoliday [RETURN_TYPE] void   String ccy String holi int sat int sun [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  holi  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
[buglab_swap_variables]^putHoliday (  new CcyHoli ( raw, sat, sun )  ) ;^1114^^^^^1108^1117^putHoliday ( ccy, new CcyHoli ( raw, sat, sun )  ) ;^[CLASS] CurrencyHoliday  [METHOD] addHoliday [RETURN_TYPE] void   String ccy String holi int sat int sun [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  holi  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
[buglab_swap_variables]^RawHolidayChoice raw =  ( RawHolidayChoice )  holi.choice ( _raws ) ;^1112^^^^^1108^1117^RawHolidayChoice raw =  ( RawHolidayChoice )  _raws.choice ( holi ) ;^[CLASS] CurrencyHoliday  [METHOD] addHoliday [RETURN_TYPE] void   String ccy String holi int sat int sun [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  holi  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
[buglab_swap_variables]^putHoliday ( raw, new CcyHoli ( ccy, sat, sun )  ) ;^1114^^^^^1108^1117^putHoliday ( ccy, new CcyHoli ( raw, sat, sun )  ) ;^[CLASS] CurrencyHoliday  [METHOD] addHoliday [RETURN_TYPE] void   String ccy String holi int sat int sun [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  holi  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
[buglab_swap_variables]^addHoliday ( holi, ccy ) ;^1110^^^^^1108^1117^addHoliday ( ccy, holi ) ;^[CLASS] CurrencyHoliday  [METHOD] addHoliday [RETURN_TYPE] void   String ccy String holi int sat int sun [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  holi  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
[buglab_swap_variables]^addHoliday (  holi ) ;^1110^^^^^1108^1117^addHoliday ( ccy, holi ) ;^[CLASS] CurrencyHoliday  [METHOD] addHoliday [RETURN_TYPE] void   String ccy String holi int sat int sun [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  holi  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
[buglab_swap_variables]^addHoliday ( ccy ) ;^1110^^^^^1108^1117^addHoliday ( ccy, holi ) ;^[CLASS] CurrencyHoliday  [METHOD] addHoliday [RETURN_TYPE] void   String ccy String holi int sat int sun [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  holi  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
[buglab_swap_variables]^putHoliday ( sun, new CcyHoli ( raw, sat, ccy )  ) ;^1114^^^^^1108^1117^putHoliday ( ccy, new CcyHoli ( raw, sat, sun )  ) ;^[CLASS] CurrencyHoliday  [METHOD] addHoliday [RETURN_TYPE] void   String ccy String holi int sat int sun [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  holi  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
[buglab_swap_variables]^Map<String, RawHolidayChoice> _ccysMap = ccy.get ( ccy ) ;^1125^^^^^1124^1131^Map<String, RawHolidayChoice> ccyMap = _ccys.get ( ccy ) ;^[CLASS] CurrencyHoliday  [METHOD] putHoliday [RETURN_TYPE] void   String ccy RawHolidayChoice raw [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
[buglab_swap_variables]^if  ( ccyMapMap == null )  {^1126^^^^^1124^1131^if  ( ccyMap == null )  {^[CLASS] CurrencyHoliday  [METHOD] putHoliday [RETURN_TYPE] void   String ccy RawHolidayChoice raw [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
[buglab_swap_variables]^_ccys.put (  ccyMap ) ;^1128^^^^^1124^1131^_ccys.put ( ccy, ccyMap ) ;^[CLASS] CurrencyHoliday  [METHOD] putHoliday [RETURN_TYPE] void   String ccy RawHolidayChoice raw [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
[buglab_swap_variables]^_ccys.put ( ccyMap, ccy ) ;^1128^^^^^1124^1131^_ccys.put ( ccy, ccyMap ) ;^[CLASS] CurrencyHoliday  [METHOD] putHoliday [RETURN_TYPE] void   String ccy RawHolidayChoice raw [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
[buglab_swap_variables]^_ccys.put ( ccy ) ;^1128^^^^^1124^1131^_ccys.put ( ccy, ccyMap ) ;^[CLASS] CurrencyHoliday  [METHOD] putHoliday [RETURN_TYPE] void   String ccy RawHolidayChoice raw [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
[buglab_swap_variables]^ccyMap.put ( raw.getLabel (  )  ) ;^1130^^^^^1124^1131^ccyMap.put ( raw.getLabel (  ) , raw ) ;^[CLASS] CurrencyHoliday  [METHOD] putHoliday [RETURN_TYPE] void   String ccy RawHolidayChoice raw [VARIABLES] RawHolidayChoice  raw  boolean  ChoiceList  _raws  String  ccy  Logger  _logger  Map  _ccys  ccyMap  int  ON_SAT  ON_SUN  SAT_FRI  SAT_MON  SUN_MON  SUN_TUE  end  sat  start  sun  year  
