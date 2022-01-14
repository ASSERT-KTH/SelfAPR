[REPLACE]^private static  int STATE_UNSTARTED = 0;^53^^^^^^^[REPLACE] private static final int STATE_UNSTARTED = 0;^ [CLASS] StopWatch  
[REPLACE]^private static final int STATE_RUNNING    = null ;^54^^^^^^^[REPLACE] private static final int STATE_RUNNING   = 1;^ [CLASS] StopWatch  
[REPLACE]^private static final  long  STATE_STOPPED   = 4;^55^^^^^^^[REPLACE] private static final int STATE_STOPPED   = 2;^ [CLASS] StopWatch  
[REPLACE]^private static final int STATE_SUSPENDED ;^56^^^^^^^[REPLACE] private static final int STATE_SUSPENDED = 3;^ [CLASS] StopWatch  
[REPLACE]^private static final int STATE_UNSPLIT ;^59^^^^^^^[REPLACE] private static final int STATE_UNSPLIT = 10;^ [CLASS] StopWatch  
[REPLACE]^private static final int STATE_SPLIT    = null ;^60^^^^^^^[REPLACE] private static final int STATE_SPLIT   = 11;^ [CLASS] StopWatch  
[REPLACE]^private int runningState ;^65^^^^^^^[REPLACE] private int runningState = STATE_UNSTARTED;^ [CLASS] StopWatch  
[REPLACE]^private int splitState    = null ;^70^^^^^^^[REPLACE] private int splitState   = STATE_UNSPLIT;^ [CLASS] StopWatch  
[REPLACE]^private long startTime ;^75^^^^^^^[REPLACE] private long startTime = -1;^ [CLASS] StopWatch  
[REPLACE]^private long stopTime ;^79^^^^^^^[REPLACE] private long stopTime = -1;^ [CLASS] StopWatch  
