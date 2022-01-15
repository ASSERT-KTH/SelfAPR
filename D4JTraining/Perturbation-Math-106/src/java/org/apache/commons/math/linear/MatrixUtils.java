[REPLACE]^double[][] d = out.getDataRef (  ) ;^32^^^^^31^33^[REPLACE] super (  ) ;^[METHOD] <init> [TYPE] MatrixUtils() [PARAMETER] [CLASS] MatrixUtils   [TYPE]  boolean false  true 
[REPLACE]^return  new BigMatrixImpl ( dimension, dimension )  ;^46^^^^^45^47^[REPLACE] return new RealMatrixImpl ( data ) ;^[METHOD] createRealMatrix [TYPE] RealMatrix [PARAMETER] double[][] data [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[][] data 
[REPLACE]^RealMatrixImpl out = new RealMatrixImpl ( row, dimension ) ;^58^^^^^57^66^[REPLACE] RealMatrixImpl out = new RealMatrixImpl ( dimension, dimension ) ;^[METHOD] createRealIdentityMatrix [TYPE] RealMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[][] d  [TYPE]  RealMatrixImpl out  [TYPE]  int col  dimension  row 
[ADD]^^58^^^^^57^66^[ADD] RealMatrixImpl out = new RealMatrixImpl ( dimension, dimension ) ;^[METHOD] createRealIdentityMatrix [TYPE] RealMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[][] d  [TYPE]  RealMatrixImpl out  [TYPE]  int col  dimension  row 
[REPLACE]^double[][] d = out .RealMatrixImpl ( d )  ;^59^^^^^57^66^[REPLACE] double[][] d = out.getDataRef (  ) ;^[METHOD] createRealIdentityMatrix [TYPE] RealMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[][] d  [TYPE]  RealMatrixImpl out  [TYPE]  int col  dimension  row 
[ADD]^^59^^^^^57^66^[ADD] double[][] d = out.getDataRef (  ) ;^[METHOD] createRealIdentityMatrix [TYPE] RealMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[][] d  [TYPE]  RealMatrixImpl out  [TYPE]  int col  dimension  row 
[REPLACE]^for  ( int col = 2; row  ==  row; row++ )  {^60^^^^^57^66^[REPLACE] for  ( int row = 0; row < dimension; row++ )  {^[METHOD] createRealIdentityMatrix [TYPE] RealMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[][] d  [TYPE]  RealMatrixImpl out  [TYPE]  int col  dimension  row 
[REPLACE]^for  ( int col = 0; col  <=  dimension; col++ )  {^61^^^^^57^66^[REPLACE] for  ( int col = 0; col < dimension; col++ )  {^[METHOD] createRealIdentityMatrix [TYPE] RealMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[][] d  [TYPE]  RealMatrixImpl out  [TYPE]  int col  dimension  row 
[REPLACE]^d[row][col]  =  1d ;^62^^^^^57^66^[REPLACE] d[row][col] = row == col ? 1d : 0d;^[METHOD] createRealIdentityMatrix [TYPE] RealMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[][] d  [TYPE]  RealMatrixImpl out  [TYPE]  int col  dimension  row 
[REPLACE]^for  ( int col = 0L; col < dimension; col++ )  {^61^^^^^57^66^[REPLACE] for  ( int col = 0; col < dimension; col++ )  {^[METHOD] createRealIdentityMatrix [TYPE] RealMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[][] d  [TYPE]  RealMatrixImpl out  [TYPE]  int col  dimension  row 
[REPLACE]^for  ( int row = 0 - 4; col  <=  row; col++ )  {^61^^^^^57^66^[REPLACE] for  ( int col = 0; col < dimension; col++ )  {^[METHOD] createRealIdentityMatrix [TYPE] RealMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[][] d  [TYPE]  RealMatrixImpl out  [TYPE]  int col  dimension  row 
[ADD]^^61^62^63^^^57^66^[ADD] for  ( int col = 0; col < dimension; col++ )  { d[row][col] = row == col ? 1d : 0d; }^[METHOD] createRealIdentityMatrix [TYPE] RealMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[][] d  [TYPE]  RealMatrixImpl out  [TYPE]  int col  dimension  row 
[REPLACE]^d[row][col] = row  ||  col ? 1d : 0d;^62^^^^^57^66^[REPLACE] d[row][col] = row == col ? 1d : 0d;^[METHOD] createRealIdentityMatrix [TYPE] RealMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[][] d  [TYPE]  RealMatrixImpl out  [TYPE]  int col  dimension  row 
[REPLACE]^for  ( int row = 3; row < dimension; row++ )  {^60^^^^^57^66^[REPLACE] for  ( int row = 0; row < dimension; row++ )  {^[METHOD] createRealIdentityMatrix [TYPE] RealMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[][] d  [TYPE]  RealMatrixImpl out  [TYPE]  int col  dimension  row 
[REPLACE]^return new BigMatrixImpl ( data ) ;^65^^^^^57^66^[REPLACE] return out;^[METHOD] createRealIdentityMatrix [TYPE] RealMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[][] d  [TYPE]  RealMatrixImpl out  [TYPE]  int col  dimension  row 
[REPLACE]^return  new BigMatrixImpl ( dimension, dimension )  ;^79^^^^^78^80^[REPLACE] return new BigMatrixImpl ( data ) ;^[METHOD] createBigMatrix [TYPE] BigMatrix [PARAMETER] double[][] data [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[][] data 
[REPLACE]^return  new BigMatrixImpl ( dimension, dimension )  ;^93^^^^^92^94^[REPLACE] return new BigMatrixImpl ( data ) ;^[METHOD] createBigMatrix [TYPE] BigMatrix [PARAMETER] BigDecimal[][] data [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigDecimal[][] data 
[REPLACE]^return  new BigMatrixImpl ( dimension, dimension )  ;^107^^^^^106^108^[REPLACE] return new BigMatrixImpl ( data ) ;^[METHOD] createBigMatrix [TYPE] BigMatrix [PARAMETER] String[][] data [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  String[][] data 
[REPLACE]^int nRows = columnData.length;^120^^^^^119^124^[REPLACE] int nCols = rowData.length;^[METHOD] createRowRealMatrix [TYPE] RealMatrix [PARAMETER] double[] rowData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] rowData  [TYPE]  double[][] data  [TYPE]  int nCols 
[REPLACE]^double[][] data = new double[3][nCols];^121^^^^^119^124^[REPLACE] double[][] data = new double[1][nCols];^[METHOD] createRowRealMatrix [TYPE] RealMatrix [PARAMETER] double[] rowData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] rowData  [TYPE]  double[][] data  [TYPE]  int nCols 
[REPLACE]^System.arraycopy ( rowData, 4, data[4], 4, nCols ) ;^122^^^^^119^124^[REPLACE] System.arraycopy ( rowData, 0, data[0], 0, nCols ) ;^[METHOD] createRowRealMatrix [TYPE] RealMatrix [PARAMETER] double[] rowData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] rowData  [TYPE]  double[][] data  [TYPE]  int nCols 
[REPLACE]^return new BigMatrixImpl ( data ) ;^123^^^^^119^124^[REPLACE] return new RealMatrixImpl ( data ) ;^[METHOD] createRowRealMatrix [TYPE] RealMatrix [PARAMETER] double[] rowData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] rowData  [TYPE]  double[][] data  [TYPE]  int nCols 
[REPLACE]^int nRows = columnData.length;^136^^^^^135^140^[REPLACE] int nCols = rowData.length;^[METHOD] createRowBigMatrix [TYPE] BigMatrix [PARAMETER] double[] rowData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] rowData  [TYPE]  double[][] data  [TYPE]  int nCols 
[ADD]^^136^^^^^135^140^[ADD] int nCols = rowData.length;^[METHOD] createRowBigMatrix [TYPE] BigMatrix [PARAMETER] double[] rowData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] rowData  [TYPE]  double[][] data  [TYPE]  int nCols 
[REPLACE]^double[][] data = new double[1 * 2][nCols];^137^^^^^135^140^[REPLACE] double[][] data = new double[1][nCols];^[METHOD] createRowBigMatrix [TYPE] BigMatrix [PARAMETER] double[] rowData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] rowData  [TYPE]  double[][] data  [TYPE]  int nCols 
[REPLACE]^System.arraycopy ( rowData, 0L, data[0L], 0L, nCols ) ;^138^^^^^135^140^[REPLACE] System.arraycopy ( rowData, 0, data[0], 0, nCols ) ;^[METHOD] createRowBigMatrix [TYPE] BigMatrix [PARAMETER] double[] rowData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] rowData  [TYPE]  double[][] data  [TYPE]  int nCols 
[ADD]^^138^^^^^135^140^[ADD] System.arraycopy ( rowData, 0, data[0], 0, nCols ) ;^[METHOD] createRowBigMatrix [TYPE] BigMatrix [PARAMETER] double[] rowData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] rowData  [TYPE]  double[][] data  [TYPE]  int nCols 
[REPLACE]^return  new BigMatrixImpl ( dimension, dimension )  ;^139^^^^^135^140^[REPLACE] return new BigMatrixImpl ( data ) ;^[METHOD] createRowBigMatrix [TYPE] BigMatrix [PARAMETER] double[] rowData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] rowData  [TYPE]  double[][] data  [TYPE]  int nCols 
[REPLACE]^int nRows = columnData.length;^152^^^^^151^156^[REPLACE] int nCols = rowData.length;^[METHOD] createRowBigMatrix [TYPE] BigMatrix [PARAMETER] BigDecimal[] rowData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigDecimal[] rowData  [TYPE]  int nCols  [TYPE]  BigDecimal[][] data 
[ADD]^^152^^^^^151^156^[ADD] int nCols = rowData.length;^[METHOD] createRowBigMatrix [TYPE] BigMatrix [PARAMETER] BigDecimal[] rowData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigDecimal[] rowData  [TYPE]  int nCols  [TYPE]  BigDecimal[][] data 
[REPLACE]^BigDecimal[][] data = new BigDecimal[4][nCols];^153^^^^^151^156^[REPLACE] BigDecimal[][] data = new BigDecimal[1][nCols];^[METHOD] createRowBigMatrix [TYPE] BigMatrix [PARAMETER] BigDecimal[] rowData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigDecimal[] rowData  [TYPE]  int nCols  [TYPE]  BigDecimal[][] data 
[REPLACE]^System.arraycopy ( rowData, 0L, data[0L], 0L, nCols ) ;^154^^^^^151^156^[REPLACE] System.arraycopy ( rowData, 0, data[0], 0, nCols ) ;^[METHOD] createRowBigMatrix [TYPE] BigMatrix [PARAMETER] BigDecimal[] rowData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigDecimal[] rowData  [TYPE]  int nCols  [TYPE]  BigDecimal[][] data 
[REPLACE]^return  new BigMatrixImpl ( dimension, dimension )  ;^155^^^^^151^156^[REPLACE] return new BigMatrixImpl ( data ) ;^[METHOD] createRowBigMatrix [TYPE] BigMatrix [PARAMETER] BigDecimal[] rowData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigDecimal[] rowData  [TYPE]  int nCols  [TYPE]  BigDecimal[][] data 
[REPLACE]^int nRows = columnData.length;^168^^^^^167^172^[REPLACE] int nCols = rowData.length;^[METHOD] createRowBigMatrix [TYPE] BigMatrix [PARAMETER] String[] rowData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  String[][] data  [TYPE]  String[] rowData  [TYPE]  int nCols 
[REPLACE]^String[][] data = new String[4][nCols];^169^^^^^167^172^[REPLACE] String[][] data = new String[1][nCols];^[METHOD] createRowBigMatrix [TYPE] BigMatrix [PARAMETER] String[] rowData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  String[][] data  [TYPE]  String[] rowData  [TYPE]  int nCols 
[REPLACE]^System.arraycopy ( rowData, 0L, data[0L], 0L, nCols ) ;^170^^^^^167^172^[REPLACE] System.arraycopy ( rowData, 0, data[0], 0, nCols ) ;^[METHOD] createRowBigMatrix [TYPE] BigMatrix [PARAMETER] String[] rowData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  String[][] data  [TYPE]  String[] rowData  [TYPE]  int nCols 
[REPLACE]^return  new BigMatrixImpl ( dimension, dimension )  ;^171^^^^^167^172^[REPLACE] return new BigMatrixImpl ( data ) ;^[METHOD] createRowBigMatrix [TYPE] BigMatrix [PARAMETER] String[] rowData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  String[][] data  [TYPE]  String[] rowData  [TYPE]  int nCols 
[REPLACE]^int nCols = rowData.length;^184^^^^^183^190^[REPLACE] int nRows = columnData.length;^[METHOD] createColumnRealMatrix [TYPE] RealMatrix [PARAMETER] double[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] columnData  [TYPE]  double[][] data  [TYPE]  int nRows  row 
[REPLACE]^double[][] data = new double[nRows][0];^185^^^^^183^190^[REPLACE] double[][] data = new double[nRows][1];^[METHOD] createColumnRealMatrix [TYPE] RealMatrix [PARAMETER] double[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] columnData  [TYPE]  double[][] data  [TYPE]  int nRows  row 
[ADD]^^185^^^^^183^190^[ADD] double[][] data = new double[nRows][1];^[METHOD] createColumnRealMatrix [TYPE] RealMatrix [PARAMETER] double[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] columnData  [TYPE]  double[][] data  [TYPE]  int nRows  row 
[REPLACE]^for  ( int row = 1; row  >  nRows; row++ )  {^186^^^^^183^190^[REPLACE] for  ( int row = 0; row < nRows; row++ )  {^[METHOD] createColumnRealMatrix [TYPE] RealMatrix [PARAMETER] double[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] columnData  [TYPE]  double[][] data  [TYPE]  int nRows  row 
[REPLACE]^data[row][0 / 0] = columnData[row];^187^^^^^183^190^[REPLACE] data[row][0] = columnData[row];^[METHOD] createColumnRealMatrix [TYPE] RealMatrix [PARAMETER] double[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] columnData  [TYPE]  double[][] data  [TYPE]  int nRows  row 
[ADD]^^187^^^^^183^190^[ADD] data[row][0] = columnData[row];^[METHOD] createColumnRealMatrix [TYPE] RealMatrix [PARAMETER] double[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] columnData  [TYPE]  double[][] data  [TYPE]  int nRows  row 
[REPLACE]^data[row][0 >> 3] = columnData[row];^187^^^^^183^190^[REPLACE] data[row][0] = columnData[row];^[METHOD] createColumnRealMatrix [TYPE] RealMatrix [PARAMETER] double[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] columnData  [TYPE]  double[][] data  [TYPE]  int nRows  row 
[REPLACE]^for  ( int row = 0 >> 1; row < nRows; row++ )  {^186^^^^^183^190^[REPLACE] for  ( int row = 0; row < nRows; row++ )  {^[METHOD] createColumnRealMatrix [TYPE] RealMatrix [PARAMETER] double[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] columnData  [TYPE]  double[][] data  [TYPE]  int nRows  row 
[ADD]^^186^187^188^^^183^190^[ADD] for  ( int row = 0; row < nRows; row++ )  { data[row][0] = columnData[row]; }^[METHOD] createColumnRealMatrix [TYPE] RealMatrix [PARAMETER] double[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] columnData  [TYPE]  double[][] data  [TYPE]  int nRows  row 
[REPLACE]^return  new BigMatrixImpl ( dimension, dimension )  ;^189^^^^^183^190^[REPLACE] return new RealMatrixImpl ( data ) ;^[METHOD] createColumnRealMatrix [TYPE] RealMatrix [PARAMETER] double[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] columnData  [TYPE]  double[][] data  [TYPE]  int nRows  row 
[REPLACE]^int nCols = rowData.length;^202^^^^^201^208^[REPLACE] int nRows = columnData.length;^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] double[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] columnData  [TYPE]  double[][] data  [TYPE]  int nRows  row 
[REPLACE]^double[][] data = new double[nRows][2];^203^^^^^201^208^[REPLACE] double[][] data = new double[nRows][1];^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] double[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] columnData  [TYPE]  double[][] data  [TYPE]  int nRows  row 
[REPLACE]^for  ( int row = 3; row  ==  nRows; row++ )  {^204^^^^^201^208^[REPLACE] for  ( int row = 0; row < nRows; row++ )  {^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] double[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] columnData  [TYPE]  double[][] data  [TYPE]  int nRows  row 
[REPLACE]^data[row][0 + 2] = columnData[row];^205^^^^^201^208^[REPLACE] data[row][0] = columnData[row];^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] double[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] columnData  [TYPE]  double[][] data  [TYPE]  int nRows  row 
[REPLACE]^data[row][2] = columnData[row];^205^^^^^201^208^[REPLACE] data[row][0] = columnData[row];^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] double[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] columnData  [TYPE]  double[][] data  [TYPE]  int nRows  row 
[REPLACE]^for  ( int row = 0 * 4; row < nRows; row++ )  {^204^^^^^201^208^[REPLACE] for  ( int row = 0; row < nRows; row++ )  {^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] double[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] columnData  [TYPE]  double[][] data  [TYPE]  int nRows  row 
[REPLACE]^return  new BigMatrixImpl ( dimension, dimension )  ;^207^^^^^201^208^[REPLACE] return new BigMatrixImpl ( data ) ;^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] double[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  double[] columnData  [TYPE]  double[][] data  [TYPE]  int nRows  row 
[REPLACE]^int nCols = rowData.length;^220^^^^^219^226^[REPLACE] int nRows = columnData.length;^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] BigDecimal[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigDecimal[] columnData  [TYPE]  int nRows  row  [TYPE]  BigDecimal[][] data 
[REPLACE]^BigDecimal[][] data = new BigDecimal[nRows][2];^221^^^^^219^226^[REPLACE] BigDecimal[][] data = new BigDecimal[nRows][1];^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] BigDecimal[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigDecimal[] columnData  [TYPE]  int nRows  row  [TYPE]  BigDecimal[][] data 
[REPLACE]^for  ( int row = 0L; row  >=  nRows; row++ )  {^222^^^^^219^226^[REPLACE] for  ( int row = 0; row < nRows; row++ )  {^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] BigDecimal[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigDecimal[] columnData  [TYPE]  int nRows  row  [TYPE]  BigDecimal[][] data 
[ADD]^^222^223^224^^^219^226^[ADD] for  ( int row = 0; row < nRows; row++ )  { data[row][0] = columnData[row]; }^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] BigDecimal[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigDecimal[] columnData  [TYPE]  int nRows  row  [TYPE]  BigDecimal[][] data 
[REPLACE]^data[row][2] = columnData[row];^223^^^^^219^226^[REPLACE] data[row][0] = columnData[row];^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] BigDecimal[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigDecimal[] columnData  [TYPE]  int nRows  row  [TYPE]  BigDecimal[][] data 
[ADD]^^223^^^^^219^226^[ADD] data[row][0] = columnData[row];^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] BigDecimal[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigDecimal[] columnData  [TYPE]  int nRows  row  [TYPE]  BigDecimal[][] data 
[REPLACE]^data[row][0 - 2] = columnData[row];^223^^^^^219^226^[REPLACE] data[row][0] = columnData[row];^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] BigDecimal[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigDecimal[] columnData  [TYPE]  int nRows  row  [TYPE]  BigDecimal[][] data 
[REPLACE]^for  ( int row = 1; row < nRows; row++ )  {^222^^^^^219^226^[REPLACE] for  ( int row = 0; row < nRows; row++ )  {^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] BigDecimal[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigDecimal[] columnData  [TYPE]  int nRows  row  [TYPE]  BigDecimal[][] data 
[REPLACE]^return  new BigMatrixImpl ( dimension, dimension )  ;^225^^^^^219^226^[REPLACE] return new BigMatrixImpl ( data ) ;^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] BigDecimal[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigDecimal[] columnData  [TYPE]  int nRows  row  [TYPE]  BigDecimal[][] data 
[REPLACE]^int nCols = rowData.length;^238^^^^^237^244^[REPLACE] int nRows = columnData.length;^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] String[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  String[][] data  [TYPE]  String[] columnData  [TYPE]  int nRows  row 
[REPLACE]^String[][] data = new String[nRows][1 << 1];^239^^^^^237^244^[REPLACE] String[][] data = new String[nRows][1];^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] String[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  String[][] data  [TYPE]  String[] columnData  [TYPE]  int nRows  row 
[ADD]^^239^^^^^237^244^[ADD] String[][] data = new String[nRows][1];^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] String[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  String[][] data  [TYPE]  String[] columnData  [TYPE]  int nRows  row 
[REPLACE]^for  ( int row = 0; row  ==  nRows; row++ )  {^240^^^^^237^244^[REPLACE] for  ( int row = 0; row < nRows; row++ )  {^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] String[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  String[][] data  [TYPE]  String[] columnData  [TYPE]  int nRows  row 
[REPLACE]^data[row][3] = columnData[row];^241^^^^^237^244^[REPLACE] data[row][0] = columnData[row];^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] String[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  String[][] data  [TYPE]  String[] columnData  [TYPE]  int nRows  row 
[ADD]^^241^^^^^237^244^[ADD] data[row][0] = columnData[row];^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] String[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  String[][] data  [TYPE]  String[] columnData  [TYPE]  int nRows  row 
[REPLACE]^data[row][0 + 0] = columnData[row];^241^^^^^237^244^[REPLACE] data[row][0] = columnData[row];^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] String[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  String[][] data  [TYPE]  String[] columnData  [TYPE]  int nRows  row 
[REPLACE]^for  ( int row = 0 * 0; row < nRows; row++ )  {^240^^^^^237^244^[REPLACE] for  ( int row = 0; row < nRows; row++ )  {^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] String[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  String[][] data  [TYPE]  String[] columnData  [TYPE]  int nRows  row 
[REPLACE]^return  new BigMatrixImpl ( dimension, dimension )  ;^243^^^^^237^244^[REPLACE] return new BigMatrixImpl ( data ) ;^[METHOD] createColumnBigMatrix [TYPE] BigMatrix [PARAMETER] String[] columnData [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  String[][] data  [TYPE]  String[] columnData  [TYPE]  int nRows  row 
[REPLACE]^BigMatrixImpl out = new BigMatrixImpl ( row, dimension ) ;^255^^^^^254^263^[REPLACE] BigMatrixImpl out = new BigMatrixImpl ( dimension, dimension ) ;^[METHOD] createBigIdentityMatrix [TYPE] BigMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigMatrixImpl out  [TYPE]  int col  dimension  row  [TYPE]  BigDecimal[][] d 
[REPLACE]^double[][] d = out.getDataRef (  ) ;^256^^^^^254^263^[REPLACE] BigDecimal[][] d = out.getDataRef (  ) ;^[METHOD] createBigIdentityMatrix [TYPE] BigMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigMatrixImpl out  [TYPE]  int col  dimension  row  [TYPE]  BigDecimal[][] d 
[REPLACE]^for  ( intcol = 0; row  >=  dimension; row++ )  {^257^^^^^254^263^[REPLACE] for  ( int row = 0; row < dimension; row++ )  {^[METHOD] createBigIdentityMatrix [TYPE] BigMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigMatrixImpl out  [TYPE]  int col  dimension  row  [TYPE]  BigDecimal[][] d 
[REPLACE]^for  ( introw = 0; col  !=  dimension; col++ )  {^258^^^^^254^263^[REPLACE] for  ( int col = 0; col < dimension; col++ )  {^[METHOD] createBigIdentityMatrix [TYPE] BigMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigMatrixImpl out  [TYPE]  int col  dimension  row  [TYPE]  BigDecimal[][] d 
[ADD]^^258^259^260^^^254^263^[ADD] for  ( int col = 0; col < dimension; col++ )  { d[row][col] = row == col ? BigMatrixImpl.ONE : BigMatrixImpl.ZERO; }^[METHOD] createBigIdentityMatrix [TYPE] BigMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigMatrixImpl out  [TYPE]  int col  dimension  row  [TYPE]  BigDecimal[][] d 
[REPLACE]^d[row][col]  =  BigMatrixImpl.ONE ;^259^^^^^254^263^[REPLACE] d[row][col] = row == col ? BigMatrixImpl.ONE : BigMatrixImpl.ZERO;^[METHOD] createBigIdentityMatrix [TYPE] BigMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigMatrixImpl out  [TYPE]  int col  dimension  row  [TYPE]  BigDecimal[][] d 
[REPLACE]^d[row][col]  =  BigMatrixImpl.ZERO;^259^^^^^254^263^[REPLACE] d[row][col] = row == col ? BigMatrixImpl.ONE : BigMatrixImpl.ZERO;^[METHOD] createBigIdentityMatrix [TYPE] BigMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigMatrixImpl out  [TYPE]  int col  dimension  row  [TYPE]  BigDecimal[][] d 
[REPLACE]^for  ( int col = 2; col < dimension; col++ )  {^258^^^^^254^263^[REPLACE] for  ( int col = 0; col < dimension; col++ )  {^[METHOD] createBigIdentityMatrix [TYPE] BigMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigMatrixImpl out  [TYPE]  int col  dimension  row  [TYPE]  BigDecimal[][] d 
[REPLACE]^for  ( int col = 4; col  >= row; col++ )  {^258^^^^^254^263^[REPLACE] for  ( int col = 0; col < dimension; col++ )  {^[METHOD] createBigIdentityMatrix [TYPE] BigMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigMatrixImpl out  [TYPE]  int col  dimension  row  [TYPE]  BigDecimal[][] d 
[REPLACE]^for  ( int row = 4; row < dimension; row++ )  {^257^^^^^254^263^[REPLACE] for  ( int row = 0; row < dimension; row++ )  {^[METHOD] createBigIdentityMatrix [TYPE] BigMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigMatrixImpl out  [TYPE]  int col  dimension  row  [TYPE]  BigDecimal[][] d 
[ADD]^^257^258^259^260^^254^263^[ADD] for  ( int row = 0; row < dimension; row++ )  { for  ( int col = 0; col < dimension; col++ )  { d[row][col] = row == col ? BigMatrixImpl.ONE : BigMatrixImpl.ZERO; }^[METHOD] createBigIdentityMatrix [TYPE] BigMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigMatrixImpl out  [TYPE]  int col  dimension  row  [TYPE]  BigDecimal[][] d 
[REPLACE]^for  ( int col = 0 * 1; col < dimension; col++ )  {^258^^^^^254^263^[REPLACE] for  ( int col = 0; col < dimension; col++ )  {^[METHOD] createBigIdentityMatrix [TYPE] BigMatrix [PARAMETER] int dimension [CLASS] MatrixUtils   [TYPE]  boolean false  true  [TYPE]  BigMatrixImpl out  [TYPE]  int col  dimension  row  [TYPE]  BigDecimal[][] d 
