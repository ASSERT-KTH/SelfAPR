[buglab_swap_variables]^plot.setDataset ( 0 ) ;^65^^^^^50^80^plot.setDataset ( 0, this.hoursDataset ) ;^[CLASS] DialDemo5  [METHOD] <init> [RETURN_TYPE] String)   String title [VARIABLES] DefaultValueDataset  dataset2  hoursDataset  JPanel  content  sliderPanel  DialBackground  db  ChartPanel  cp1  String  title  DialPlot  plot  DialPointer  needle  needle2  JFreeChart  chart1  StandardDialScale  hourScale  scale2  boolean  JSlider  slider1  slider2  SimpleDialFrame  dialFrame  DialCap  cap  
[buglab_swap_variables]^plot.setDataset ( 1 ) ;^66^^^^^51^81^plot.setDataset ( 1, this.dataset2 ) ;^[CLASS] DialDemo5  [METHOD] <init> [RETURN_TYPE] String)   String title [VARIABLES] DefaultValueDataset  dataset2  hoursDataset  JPanel  content  sliderPanel  DialBackground  db  ChartPanel  cp1  String  title  DialPlot  plot  DialPointer  needle  needle2  JFreeChart  chart1  StandardDialScale  hourScale  scale2  boolean  JSlider  slider1  slider2  SimpleDialFrame  dialFrame  DialCap  cap  
[buglab_swap_variables]^hourScale.setTickLabelFont ( new Font ( "Dialog", Font. 14 )  ) ;^82^^^^^67^97^hourScale.setTickLabelFont ( new Font ( "Dialog", Font.PLAIN, 14 )  ) ;^[CLASS] DialDemo5  [METHOD] <init> [RETURN_TYPE] String)   String title [VARIABLES] DefaultValueDataset  dataset2  hoursDataset  JPanel  content  sliderPanel  DialBackground  db  ChartPanel  cp1  String  title  DialPlot  plot  DialPointer  needle  needle2  JFreeChart  chart1  StandardDialScale  hourScale  scale2  boolean  JSlider  slider1  slider2  SimpleDialFrame  dialFrame  DialCap  cap  
[buglab_swap_variables]^plot.addScale ( 0 ) ;^83^^^^^68^98^plot.addScale ( 0, hourScale ) ;^[CLASS] DialDemo5  [METHOD] <init> [RETURN_TYPE] String)   String title [VARIABLES] DefaultValueDataset  dataset2  hoursDataset  JPanel  content  sliderPanel  DialBackground  db  ChartPanel  cp1  String  title  DialPlot  plot  DialPointer  needle  needle2  JFreeChart  chart1  StandardDialScale  hourScale  scale2  boolean  JSlider  slider1  slider2  SimpleDialFrame  dialFrame  DialCap  cap  
[buglab_swap_variables]^scale2.setTickLabelFont ( new Font ( "Dialog", Font. 14 )  ) ;^90^^^^^75^105^scale2.setTickLabelFont ( new Font ( "Dialog", Font.PLAIN, 14 )  ) ;^[CLASS] DialDemo5  [METHOD] <init> [RETURN_TYPE] String)   String title [VARIABLES] DefaultValueDataset  dataset2  hoursDataset  JPanel  content  sliderPanel  DialBackground  db  ChartPanel  cp1  String  title  DialPlot  plot  DialPointer  needle  needle2  JFreeChart  chart1  StandardDialScale  hourScale  scale2  boolean  JSlider  slider1  slider2  SimpleDialFrame  dialFrame  DialCap  cap  
[buglab_swap_variables]^plot.addScale ( 1 ) ;^92^^^^^77^107^plot.addScale ( 1, scale2 ) ;^[CLASS] DialDemo5  [METHOD] <init> [RETURN_TYPE] String)   String title [VARIABLES] DefaultValueDataset  dataset2  hoursDataset  JPanel  content  sliderPanel  DialBackground  db  ChartPanel  cp1  String  title  DialPlot  plot  DialPointer  needle  needle2  JFreeChart  chart1  StandardDialScale  hourScale  scale2  boolean  JSlider  slider1  slider2  SimpleDialFrame  dialFrame  DialCap  cap  
[buglab_swap_variables]^content.add (  BorderLayout.SOUTH ) ;^131^^^^^116^146^content.add ( sliderPanel, BorderLayout.SOUTH ) ;^[CLASS] DialDemo5  [METHOD] <init> [RETURN_TYPE] String)   String title [VARIABLES] DefaultValueDataset  dataset2  hoursDataset  JPanel  content  sliderPanel  DialBackground  db  ChartPanel  cp1  String  title  DialPlot  plot  DialPointer  needle  needle2  JFreeChart  chart1  StandardDialScale  hourScale  scale2  boolean  JSlider  slider1  slider2  SimpleDialFrame  dialFrame  DialCap  cap  
