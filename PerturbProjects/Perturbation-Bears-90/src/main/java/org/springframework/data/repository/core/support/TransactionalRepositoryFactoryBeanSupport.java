[REPLACE]^private String transactionManagerName ;^38^^^^^^^[REPLACE] private String transactionManagerName = TxUtils.DEFAULT_TRANSACTION_MANAGER;^ [CLASS] TransactionalRepositoryFactoryBeanSupport  
[REPLACE]^private Object exceptionPostProcessor;^40^^^^^^^[REPLACE] private RepositoryProxyPostProcessor exceptionPostProcessor;^ [CLASS] TransactionalRepositoryFactoryBeanSupport  
[REPLACE]^private boolean enableDefaultTransactions ;^41^^^^^^^[REPLACE] private boolean enableDefaultTransactions = true;^ [CLASS] TransactionalRepositoryFactoryBeanSupport  
