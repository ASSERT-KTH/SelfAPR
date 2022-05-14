[buglab_swap_variables]^return new TransformingComparator<I, O> ( comparator, transformer ) ;^196^^^^^190^197^return new TransformingComparator<I, O> ( transformer, comparator ) ;^[CLASS] ComparatorUtils  [METHOD] transformedComparator [RETURN_TYPE] <I,O>   Comparator<O> comparator Transformer<? super I, ? extends O> transformer [VARIABLES] Comparator  NATURAL_COMPARATOR  comparator  Transformer  transformer  boolean  
[buglab_swap_variables]^return new TransformingComparator<I, O> (  comparator ) ;^196^^^^^190^197^return new TransformingComparator<I, O> ( transformer, comparator ) ;^[CLASS] ComparatorUtils  [METHOD] transformedComparator [RETURN_TYPE] <I,O>   Comparator<O> comparator Transformer<? super I, ? extends O> transformer [VARIABLES] Comparator  NATURAL_COMPARATOR  comparator  Transformer  transformer  boolean  
[buglab_swap_variables]^return new TransformingComparator<I, O> ( transformer ) ;^196^^^^^190^197^return new TransformingComparator<I, O> ( transformer, comparator ) ;^[CLASS] ComparatorUtils  [METHOD] transformedComparator [RETURN_TYPE] <I,O>   Comparator<O> comparator Transformer<? super I, ? extends O> transformer [VARIABLES] Comparator  NATURAL_COMPARATOR  comparator  Transformer  transformer  boolean  
[buglab_swap_variables]^final int c = o1.compare ( comparator, o2 ) ;^215^^^^^211^217^final int c = comparator.compare ( o1, o2 ) ;^[CLASS] ComparatorUtils  [METHOD] min [RETURN_TYPE] <E>   final E o1 final E o2 Comparator<E> comparator [VARIABLES] boolean  E  o1  o2  int  c  Comparator  NATURAL_COMPARATOR  comparator  
[buglab_swap_variables]^final int c = comparator.compare ( o2, o1 ) ;^215^^^^^211^217^final int c = comparator.compare ( o1, o2 ) ;^[CLASS] ComparatorUtils  [METHOD] min [RETURN_TYPE] <E>   final E o1 final E o2 Comparator<E> comparator [VARIABLES] boolean  E  o1  o2  int  c  Comparator  NATURAL_COMPARATOR  comparator  
[buglab_swap_variables]^final int c = comparator.compare (  o2 ) ;^215^^^^^211^217^final int c = comparator.compare ( o1, o2 ) ;^[CLASS] ComparatorUtils  [METHOD] min [RETURN_TYPE] <E>   final E o1 final E o2 Comparator<E> comparator [VARIABLES] boolean  E  o1  o2  int  c  Comparator  NATURAL_COMPARATOR  comparator  
[buglab_swap_variables]^final int c = comparator.compare ( o1 ) ;^215^^^^^211^217^final int c = comparator.compare ( o1, o2 ) ;^[CLASS] ComparatorUtils  [METHOD] min [RETURN_TYPE] <E>   final E o1 final E o2 Comparator<E> comparator [VARIABLES] boolean  E  o1  o2  int  c  Comparator  NATURAL_COMPARATOR  comparator  
[buglab_swap_variables]^final int c = o2.compare ( o1, comparator ) ;^215^^^^^211^217^final int c = comparator.compare ( o1, o2 ) ;^[CLASS] ComparatorUtils  [METHOD] min [RETURN_TYPE] <E>   final E o1 final E o2 Comparator<E> comparator [VARIABLES] boolean  E  o1  o2  int  c  Comparator  NATURAL_COMPARATOR  comparator  
[buglab_swap_variables]^return o1 < 0 ? c : o2;^216^^^^^211^217^return c < 0 ? o1 : o2;^[CLASS] ComparatorUtils  [METHOD] min [RETURN_TYPE] <E>   final E o1 final E o2 Comparator<E> comparator [VARIABLES] boolean  E  o1  o2  int  c  Comparator  NATURAL_COMPARATOR  comparator  
[buglab_swap_variables]^return c < 0 ? o2 : o1;^216^^^^^211^217^return c < 0 ? o1 : o2;^[CLASS] ComparatorUtils  [METHOD] min [RETURN_TYPE] <E>   final E o1 final E o2 Comparator<E> comparator [VARIABLES] boolean  E  o1  o2  int  c  Comparator  NATURAL_COMPARATOR  comparator  
[buglab_swap_variables]^final int c = o2.compare ( o1, comparator ) ;^235^^^^^231^237^final int c = comparator.compare ( o1, o2 ) ;^[CLASS] ComparatorUtils  [METHOD] max [RETURN_TYPE] <E>   final E o1 final E o2 Comparator<E> comparator [VARIABLES] boolean  E  o1  o2  int  c  Comparator  NATURAL_COMPARATOR  comparator  
[buglab_swap_variables]^final int c = comparator.compare ( o2, o1 ) ;^235^^^^^231^237^final int c = comparator.compare ( o1, o2 ) ;^[CLASS] ComparatorUtils  [METHOD] max [RETURN_TYPE] <E>   final E o1 final E o2 Comparator<E> comparator [VARIABLES] boolean  E  o1  o2  int  c  Comparator  NATURAL_COMPARATOR  comparator  
[buglab_swap_variables]^final int c = comparator.compare (  o2 ) ;^235^^^^^231^237^final int c = comparator.compare ( o1, o2 ) ;^[CLASS] ComparatorUtils  [METHOD] max [RETURN_TYPE] <E>   final E o1 final E o2 Comparator<E> comparator [VARIABLES] boolean  E  o1  o2  int  c  Comparator  NATURAL_COMPARATOR  comparator  
[buglab_swap_variables]^final int c = comparator.compare ( o1 ) ;^235^^^^^231^237^final int c = comparator.compare ( o1, o2 ) ;^[CLASS] ComparatorUtils  [METHOD] max [RETURN_TYPE] <E>   final E o1 final E o2 Comparator<E> comparator [VARIABLES] boolean  E  o1  o2  int  c  Comparator  NATURAL_COMPARATOR  comparator  
[buglab_swap_variables]^final int c = o1.compare ( comparator, o2 ) ;^235^^^^^231^237^final int c = comparator.compare ( o1, o2 ) ;^[CLASS] ComparatorUtils  [METHOD] max [RETURN_TYPE] <E>   final E o1 final E o2 Comparator<E> comparator [VARIABLES] boolean  E  o1  o2  int  c  Comparator  NATURAL_COMPARATOR  comparator  
[buglab_swap_variables]^return o2 > 0 ? o1 : c;^236^^^^^231^237^return c > 0 ? o1 : o2;^[CLASS] ComparatorUtils  [METHOD] max [RETURN_TYPE] <E>   final E o1 final E o2 Comparator<E> comparator [VARIABLES] boolean  E  o1  o2  int  c  Comparator  NATURAL_COMPARATOR  comparator  
[buglab_swap_variables]^return c > 0 ? o2 : o1;^236^^^^^231^237^return c > 0 ? o1 : o2;^[CLASS] ComparatorUtils  [METHOD] max [RETURN_TYPE] <E>   final E o1 final E o2 Comparator<E> comparator [VARIABLES] boolean  E  o1  o2  int  c  Comparator  NATURAL_COMPARATOR  comparator  
