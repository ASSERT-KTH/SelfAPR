[buglab_swap_variables]^return  ( INITIAL_CHUNK_SIZE == null )  ? _constructArray ( _freeBuffer )  : _freeBuffer;^56^57^^^^53^58^return  ( _freeBuffer == null )  ? _constructArray ( INITIAL_CHUNK_SIZE )  : _freeBuffer;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] resetAndStart [RETURN_TYPE] T   [VARIABLES] boolean  T  _data  _freeBuffer  data  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  Node  _bufferHead  _bufferTail  _next  
[buglab_swap_variables]^Node<T> next = new Node<T> ( fullChunkLength, fullChunk ) ;^65^^^^^63^81^Node<T> next = new Node<T> ( fullChunk, fullChunkLength ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] appendCompletedChunk [RETURN_TYPE] T   T fullChunk int fullChunkLength [VARIABLES] boolean  T  _data  _freeBuffer  data  fullChunk  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  nextLen  Node  _bufferHead  _bufferTail  _next  next  
[buglab_swap_variables]^Node<T> next = new Node<T> (  fullChunkLength ) ;^65^^^^^63^81^Node<T> next = new Node<T> ( fullChunk, fullChunkLength ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] appendCompletedChunk [RETURN_TYPE] T   T fullChunk int fullChunkLength [VARIABLES] boolean  T  _data  _freeBuffer  data  fullChunk  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  nextLen  Node  _bufferHead  _bufferTail  _next  next  
[buglab_swap_variables]^Node<T> next = new Node<T> ( fullChunk ) ;^65^^^^^63^81^Node<T> next = new Node<T> ( fullChunk, fullChunkLength ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] appendCompletedChunk [RETURN_TYPE] T   T fullChunk int fullChunkLength [VARIABLES] boolean  T  _data  _freeBuffer  data  fullChunk  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  nextLen  Node  _bufferHead  _bufferTail  _next  next  
[buglab_swap_variables]^if  ( SMALL_CHUNK_SIZE < nextLen )  {^75^^^^^63^81^if  ( nextLen < SMALL_CHUNK_SIZE )  {^[CLASS] PrimitiveArrayBuilder Node  [METHOD] appendCompletedChunk [RETURN_TYPE] T   T fullChunk int fullChunkLength [VARIABLES] boolean  T  _data  _freeBuffer  data  fullChunk  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  nextLen  Node  _bufferHead  _bufferTail  _next  next  
[buglab_swap_variables]^int totalSize = _bufferedEntryCount + lastChunkEntries;^85^^^^^83^101^int totalSize = lastChunkEntries + _bufferedEntryCount;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] completeAndClearBuffer [RETURN_TYPE] T   T lastChunk int lastChunkEntries [VARIABLES] boolean  T  _data  _freeBuffer  data  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^for  ( Node<T> _bufferHead = n; n != null; n = n.next (  )  )  {^90^^^^^83^101^for  ( Node<T> n = _bufferHead; n != null; n = n.next (  )  )  {^[CLASS] PrimitiveArrayBuilder Node  [METHOD] completeAndClearBuffer [RETURN_TYPE] T   T lastChunk int lastChunkEntries [VARIABLES] boolean  T  _data  _freeBuffer  data  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^ptr = ptr.copyData ( resultArray, n ) ;^91^^^^^83^101^ptr = n.copyData ( resultArray, ptr ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] completeAndClearBuffer [RETURN_TYPE] T   T lastChunk int lastChunkEntries [VARIABLES] boolean  T  _data  _freeBuffer  data  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^ptr = n.copyData ( ptr, resultArray ) ;^91^^^^^83^101^ptr = n.copyData ( resultArray, ptr ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] completeAndClearBuffer [RETURN_TYPE] T   T lastChunk int lastChunkEntries [VARIABLES] boolean  T  _data  _freeBuffer  data  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^ptr = n.copyData (  ptr ) ;^91^^^^^83^101^ptr = n.copyData ( resultArray, ptr ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] completeAndClearBuffer [RETURN_TYPE] T   T lastChunk int lastChunkEntries [VARIABLES] boolean  T  _data  _freeBuffer  data  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^ptr = n.copyData ( resultArray ) ;^91^^^^^83^101^ptr = n.copyData ( resultArray, ptr ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] completeAndClearBuffer [RETURN_TYPE] T   T lastChunk int lastChunkEntries [VARIABLES] boolean  T  _data  _freeBuffer  data  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^ptr = resultArray.copyData ( n, ptr ) ;^91^^^^^83^101^ptr = n.copyData ( resultArray, ptr ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] completeAndClearBuffer [RETURN_TYPE] T   T lastChunk int lastChunkEntries [VARIABLES] boolean  T  _data  _freeBuffer  data  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^System.arraycopy ( resultArray, 0, lastChunk, ptr, lastChunkEntries ) ;^93^^^^^83^101^System.arraycopy ( lastChunk, 0, resultArray, ptr, lastChunkEntries ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] completeAndClearBuffer [RETURN_TYPE] T   T lastChunk int lastChunkEntries [VARIABLES] boolean  T  _data  _freeBuffer  data  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^System.arraycopy (  0, resultArray, ptr, lastChunkEntries ) ;^93^^^^^83^101^System.arraycopy ( lastChunk, 0, resultArray, ptr, lastChunkEntries ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] completeAndClearBuffer [RETURN_TYPE] T   T lastChunk int lastChunkEntries [VARIABLES] boolean  T  _data  _freeBuffer  data  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^System.arraycopy ( lastChunk, 0,  ptr, lastChunkEntries ) ;^93^^^^^83^101^System.arraycopy ( lastChunk, 0, resultArray, ptr, lastChunkEntries ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] completeAndClearBuffer [RETURN_TYPE] T   T lastChunk int lastChunkEntries [VARIABLES] boolean  T  _data  _freeBuffer  data  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^System.arraycopy ( lastChunk, 0, resultArray, lastChunkEntries, ptr ) ;^93^^^^^83^101^System.arraycopy ( lastChunk, 0, resultArray, ptr, lastChunkEntries ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] completeAndClearBuffer [RETURN_TYPE] T   T lastChunk int lastChunkEntries [VARIABLES] boolean  T  _data  _freeBuffer  data  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^System.arraycopy ( lastChunk, 0, resultArray,  lastChunkEntries ) ;^93^^^^^83^101^System.arraycopy ( lastChunk, 0, resultArray, ptr, lastChunkEntries ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] completeAndClearBuffer [RETURN_TYPE] T   T lastChunk int lastChunkEntries [VARIABLES] boolean  T  _data  _freeBuffer  data  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^System.arraycopy ( lastChunk, 0, lastChunkEntries, ptr, resultArray ) ;^93^^^^^83^101^System.arraycopy ( lastChunk, 0, resultArray, ptr, lastChunkEntries ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] completeAndClearBuffer [RETURN_TYPE] T   T lastChunk int lastChunkEntries [VARIABLES] boolean  T  _data  _freeBuffer  data  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^System.arraycopy ( lastChunk, 0, resultArray, ptr ) ;^93^^^^^83^101^System.arraycopy ( lastChunk, 0, resultArray, ptr, lastChunkEntries ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] completeAndClearBuffer [RETURN_TYPE] T   T lastChunk int lastChunkEntries [VARIABLES] boolean  T  _data  _freeBuffer  data  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^if  ( totalSize != ptr )  {^97^^^^^83^101^if  ( ptr != totalSize )  {^[CLASS] PrimitiveArrayBuilder Node  [METHOD] completeAndClearBuffer [RETURN_TYPE] T   T lastChunk int lastChunkEntries [VARIABLES] boolean  T  _data  _freeBuffer  data  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^System.arraycopy ( _data, 0, _dataLength, ptr, dst ) ;^165^^^^^163^168^System.arraycopy ( _data, 0, dst, ptr, _dataLength ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] copyData [RETURN_TYPE] int   T dst int ptr [VARIABLES] boolean  T  _data  _freeBuffer  data  dst  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  len  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^System.arraycopy ( _data, 0,  ptr, _dataLength ) ;^165^^^^^163^168^System.arraycopy ( _data, 0, dst, ptr, _dataLength ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] copyData [RETURN_TYPE] int   T dst int ptr [VARIABLES] boolean  T  _data  _freeBuffer  data  dst  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  len  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^System.arraycopy ( _data, 0, ptr, dst, _dataLength ) ;^165^^^^^163^168^System.arraycopy ( _data, 0, dst, ptr, _dataLength ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] copyData [RETURN_TYPE] int   T dst int ptr [VARIABLES] boolean  T  _data  _freeBuffer  data  dst  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  len  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^System.arraycopy ( _data, 0, dst,  _dataLength ) ;^165^^^^^163^168^System.arraycopy ( _data, 0, dst, ptr, _dataLength ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] copyData [RETURN_TYPE] int   T dst int ptr [VARIABLES] boolean  T  _data  _freeBuffer  data  dst  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  len  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^System.arraycopy ( dst, 0, _data, ptr, _dataLength ) ;^165^^^^^163^168^System.arraycopy ( _data, 0, dst, ptr, _dataLength ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] copyData [RETURN_TYPE] int   T dst int ptr [VARIABLES] boolean  T  _data  _freeBuffer  data  dst  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  len  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^System.arraycopy (  0, dst, ptr, _dataLength ) ;^165^^^^^163^168^System.arraycopy ( _data, 0, dst, ptr, _dataLength ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] copyData [RETURN_TYPE] int   T dst int ptr [VARIABLES] boolean  T  _data  _freeBuffer  data  dst  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  len  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^System.arraycopy ( _data, 0, dst, _dataLength, ptr ) ;^165^^^^^163^168^System.arraycopy ( _data, 0, dst, ptr, _dataLength ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] copyData [RETURN_TYPE] int   T dst int ptr [VARIABLES] boolean  T  _data  _freeBuffer  data  dst  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  len  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^System.arraycopy ( _data, 0, dst, ptr ) ;^165^^^^^163^168^System.arraycopy ( _data, 0, dst, ptr, _dataLength ) ;^[CLASS] PrimitiveArrayBuilder Node  [METHOD] copyData [RETURN_TYPE] int   T dst int ptr [VARIABLES] boolean  T  _data  _freeBuffer  data  dst  fullChunk  lastChunk  resultArray  int  INITIAL_CHUNK_SIZE  MAX_CHUNK_SIZE  SMALL_CHUNK_SIZE  _bufferedEntryCount  _dataLength  dataLen  fullChunkLength  lastChunkEntries  len  nextLen  ptr  totalSize  Node  _bufferHead  _bufferTail  _next  n  next  
[buglab_swap_variables]^System.arraycopy ( dst, 0, _data, ptr, _dataLength ) ;^165^^^^^163^168^System.arraycopy ( _data, 0, dst, ptr, _dataLength ) ;^[CLASS] Node  [METHOD] copyData [RETURN_TYPE] int   T dst int ptr [VARIABLES] boolean  T  _data  data  dst  int  _dataLength  dataLen  ptr  Node  _next  
[buglab_swap_variables]^System.arraycopy ( _data, 0,  ptr, _dataLength ) ;^165^^^^^163^168^System.arraycopy ( _data, 0, dst, ptr, _dataLength ) ;^[CLASS] Node  [METHOD] copyData [RETURN_TYPE] int   T dst int ptr [VARIABLES] boolean  T  _data  data  dst  int  _dataLength  dataLen  ptr  Node  _next  
[buglab_swap_variables]^System.arraycopy ( _data, 0, dst, _dataLength, ptr ) ;^165^^^^^163^168^System.arraycopy ( _data, 0, dst, ptr, _dataLength ) ;^[CLASS] Node  [METHOD] copyData [RETURN_TYPE] int   T dst int ptr [VARIABLES] boolean  T  _data  data  dst  int  _dataLength  dataLen  ptr  Node  _next  
[buglab_swap_variables]^System.arraycopy ( _data, 0, dst,  _dataLength ) ;^165^^^^^163^168^System.arraycopy ( _data, 0, dst, ptr, _dataLength ) ;^[CLASS] Node  [METHOD] copyData [RETURN_TYPE] int   T dst int ptr [VARIABLES] boolean  T  _data  data  dst  int  _dataLength  dataLen  ptr  Node  _next  
[buglab_swap_variables]^System.arraycopy (  0, dst, ptr, _dataLength ) ;^165^^^^^163^168^System.arraycopy ( _data, 0, dst, ptr, _dataLength ) ;^[CLASS] Node  [METHOD] copyData [RETURN_TYPE] int   T dst int ptr [VARIABLES] boolean  T  _data  data  dst  int  _dataLength  dataLen  ptr  Node  _next  
[buglab_swap_variables]^System.arraycopy ( _data, 0, dst, ptr ) ;^165^^^^^163^168^System.arraycopy ( _data, 0, dst, ptr, _dataLength ) ;^[CLASS] Node  [METHOD] copyData [RETURN_TYPE] int   T dst int ptr [VARIABLES] boolean  T  _data  data  dst  int  _dataLength  dataLen  ptr  Node  _next  
