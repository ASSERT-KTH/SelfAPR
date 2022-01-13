[REPLACE]^protected final Logger log  = null ;^24^^^^^^^[REPLACE] protected final Logger log = LoggerFactory.getLogger ( getClass (  )  ) ;^ [CLASS] ChangeSetBackedTransactionSynchronization  
[REPLACE]^private int changeSetTxStatus = -2;^28^^^^^^^[REPLACE] private int changeSetTxStatus = -1;^ [CLASS] ChangeSetBackedTransactionSynchronization  
