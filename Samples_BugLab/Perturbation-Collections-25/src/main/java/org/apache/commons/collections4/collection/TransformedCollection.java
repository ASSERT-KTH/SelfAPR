[buglab_swap_variables]^return new TransformedCollection<E> ( transformer, coll ) ;^63^^^^^61^64^return new TransformedCollection<E> ( coll, transformer ) ;^[CLASS] TransformedCollection  [METHOD] transformingCollection [RETURN_TYPE] <E>   Collection<E> coll Transformer<? super E, ? extends E> transformer [VARIABLES] Collection  coll  Transformer  transformer  boolean  long  serialVersionUID  
[buglab_swap_variables]^return new TransformedCollection<E> (  transformer ) ;^63^^^^^61^64^return new TransformedCollection<E> ( coll, transformer ) ;^[CLASS] TransformedCollection  [METHOD] transformingCollection [RETURN_TYPE] <E>   Collection<E> coll Transformer<? super E, ? extends E> transformer [VARIABLES] Collection  coll  Transformer  transformer  boolean  long  serialVersionUID  
[buglab_swap_variables]^return new TransformedCollection<E> ( coll ) ;^63^^^^^61^64^return new TransformedCollection<E> ( coll, transformer ) ;^[CLASS] TransformedCollection  [METHOD] transformingCollection [RETURN_TYPE] <E>   Collection<E> coll Transformer<? super E, ? extends E> transformer [VARIABLES] Collection  coll  Transformer  transformer  boolean  long  serialVersionUID  
[buglab_swap_variables]^final TransformedCollection<E> decorated = new TransformedCollection<E> ( transformer, collection ) ;^84^^^^^81^95^final TransformedCollection<E> decorated = new TransformedCollection<E> ( collection, transformer ) ;^[CLASS] TransformedCollection  [METHOD] transformedCollection [RETURN_TYPE] <E>   Collection<E> collection Transformer<? super E, ? extends E> transformer [VARIABLES] Transformer  transformer  boolean  E  value  E[]  values  TransformedCollection  decorated  Collection  collection  long  serialVersionUID  
[buglab_swap_variables]^final TransformedCollection<E> decorated = new TransformedCollection<E> (  transformer ) ;^84^^^^^81^95^final TransformedCollection<E> decorated = new TransformedCollection<E> ( collection, transformer ) ;^[CLASS] TransformedCollection  [METHOD] transformedCollection [RETURN_TYPE] <E>   Collection<E> collection Transformer<? super E, ? extends E> transformer [VARIABLES] Transformer  transformer  boolean  E  value  E[]  values  TransformedCollection  decorated  Collection  collection  long  serialVersionUID  
[buglab_swap_variables]^final TransformedCollection<E> decorated = new TransformedCollection<E> ( collection ) ;^84^^^^^81^95^final TransformedCollection<E> decorated = new TransformedCollection<E> ( collection, transformer ) ;^[CLASS] TransformedCollection  [METHOD] transformedCollection [RETURN_TYPE] <E>   Collection<E> collection Transformer<? super E, ? extends E> transformer [VARIABLES] Transformer  transformer  boolean  E  value  E[]  values  TransformedCollection  decorated  Collection  collection  long  serialVersionUID  
[buglab_swap_variables]^decorated.decorated (  ) .add ( value.transform ( transformer )  ) ;^91^^^^^81^95^decorated.decorated (  ) .add ( transformer.transform ( value )  ) ;^[CLASS] TransformedCollection  [METHOD] transformedCollection [RETURN_TYPE] <E>   Collection<E> collection Transformer<? super E, ? extends E> transformer [VARIABLES] Transformer  transformer  boolean  E  value  E[]  values  TransformedCollection  decorated  Collection  collection  long  serialVersionUID  
[buglab_swap_variables]^return object.transform ( transformer ) ;^125^^^^^124^126^return transformer.transform ( object ) ;^[CLASS] TransformedCollection  [METHOD] transform [RETURN_TYPE] E   final E object [VARIABLES] Transformer  transformer  boolean  E  object  long  serialVersionUID  
