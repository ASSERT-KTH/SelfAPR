[buglab_swap_variables]^if  ( data.length == 0 && length == offset )  {^28^^^^^26^34^if  ( offset == 0 && length == data.length )  {^[CLASS] BinaryNode  [METHOD] <init> [RETURN_TYPE] BinaryNode(byte[],int,int)   byte[] data int offset int length [VARIABLES] byte[]  _data  data  boolean  BinaryNode  EMPTY_BINARY_NODE  int  length  offset  
[buglab_swap_variables]^if  ( offset == 0 && data.length == length )  {^28^^^^^26^34^if  ( offset == 0 && length == data.length )  {^[CLASS] BinaryNode  [METHOD] <init> [RETURN_TYPE] BinaryNode(byte[],int,int)   byte[] data int offset int length [VARIABLES] byte[]  _data  data  boolean  BinaryNode  EMPTY_BINARY_NODE  int  length  offset  
[buglab_swap_variables]^if  ( offset == 0 && length == data )  {^28^^^^^26^34^if  ( offset == 0 && length == data.length )  {^[CLASS] BinaryNode  [METHOD] <init> [RETURN_TYPE] BinaryNode(byte[],int,int)   byte[] data int offset int length [VARIABLES] byte[]  _data  data  boolean  BinaryNode  EMPTY_BINARY_NODE  int  length  offset  
[buglab_swap_variables]^System.arraycopy ( _data, offset, data, 0, length ) ;^32^^^^^26^34^System.arraycopy ( data, offset, _data, 0, length ) ;^[CLASS] BinaryNode  [METHOD] <init> [RETURN_TYPE] BinaryNode(byte[],int,int)   byte[] data int offset int length [VARIABLES] byte[]  _data  data  boolean  BinaryNode  EMPTY_BINARY_NODE  int  length  offset  
[buglab_swap_variables]^System.arraycopy (  offset, _data, 0, length ) ;^32^^^^^26^34^System.arraycopy ( data, offset, _data, 0, length ) ;^[CLASS] BinaryNode  [METHOD] <init> [RETURN_TYPE] BinaryNode(byte[],int,int)   byte[] data int offset int length [VARIABLES] byte[]  _data  data  boolean  BinaryNode  EMPTY_BINARY_NODE  int  length  offset  
[buglab_swap_variables]^System.arraycopy ( data, length, _data, 0, offset ) ;^32^^^^^26^34^System.arraycopy ( data, offset, _data, 0, length ) ;^[CLASS] BinaryNode  [METHOD] <init> [RETURN_TYPE] BinaryNode(byte[],int,int)   byte[] data int offset int length [VARIABLES] byte[]  _data  data  boolean  BinaryNode  EMPTY_BINARY_NODE  int  length  offset  
[buglab_swap_variables]^System.arraycopy ( data,  _data, 0, length ) ;^32^^^^^26^34^System.arraycopy ( data, offset, _data, 0, length ) ;^[CLASS] BinaryNode  [METHOD] <init> [RETURN_TYPE] BinaryNode(byte[],int,int)   byte[] data int offset int length [VARIABLES] byte[]  _data  data  boolean  BinaryNode  EMPTY_BINARY_NODE  int  length  offset  
[buglab_swap_variables]^System.arraycopy ( data, offset, _data, 0 ) ;^32^^^^^26^34^System.arraycopy ( data, offset, _data, 0, length ) ;^[CLASS] BinaryNode  [METHOD] <init> [RETURN_TYPE] BinaryNode(byte[],int,int)   byte[] data int offset int length [VARIABLES] byte[]  _data  data  boolean  BinaryNode  EMPTY_BINARY_NODE  int  length  offset  
[buglab_swap_variables]^System.arraycopy ( data, offset,  0, length ) ;^32^^^^^26^34^System.arraycopy ( data, offset, _data, 0, length ) ;^[CLASS] BinaryNode  [METHOD] <init> [RETURN_TYPE] BinaryNode(byte[],int,int)   byte[] data int offset int length [VARIABLES] byte[]  _data  data  boolean  BinaryNode  EMPTY_BINARY_NODE  int  length  offset  
[buglab_swap_variables]^System.arraycopy ( offset, data, _data, 0, length ) ;^32^^^^^26^34^System.arraycopy ( data, offset, _data, 0, length ) ;^[CLASS] BinaryNode  [METHOD] <init> [RETURN_TYPE] BinaryNode(byte[],int,int)   byte[] data int offset int length [VARIABLES] byte[]  _data  data  boolean  BinaryNode  EMPTY_BINARY_NODE  int  length  offset  
[buglab_swap_variables]^System.arraycopy ( data, _data, offset, 0, length ) ;^32^^^^^26^34^System.arraycopy ( data, offset, _data, 0, length ) ;^[CLASS] BinaryNode  [METHOD] <init> [RETURN_TYPE] BinaryNode(byte[],int,int)   byte[] data int offset int length [VARIABLES] byte[]  _data  data  boolean  BinaryNode  EMPTY_BINARY_NODE  int  length  offset  
[buglab_swap_variables]^System.arraycopy ( data, offset, length, 0, _data ) ;^32^^^^^26^34^System.arraycopy ( data, offset, _data, 0, length ) ;^[CLASS] BinaryNode  [METHOD] <init> [RETURN_TYPE] BinaryNode(byte[],int,int)   byte[] data int offset int length [VARIABLES] byte[]  _data  data  boolean  BinaryNode  EMPTY_BINARY_NODE  int  length  offset  
[buglab_swap_variables]^if  ( data.length.length == 0 )  {^41^^^^^36^45^if  ( data.length == 0 )  {^[CLASS] BinaryNode  [METHOD] valueOf [RETURN_TYPE] BinaryNode   byte[] data [VARIABLES] byte[]  _data  data  BinaryNode  EMPTY_BINARY_NODE  boolean  
[buglab_swap_variables]^if  ( data == 0 )  {^41^^^^^36^45^if  ( data.length == 0 )  {^[CLASS] BinaryNode  [METHOD] valueOf [RETURN_TYPE] BinaryNode   byte[] data [VARIABLES] byte[]  _data  data  BinaryNode  EMPTY_BINARY_NODE  boolean  
[buglab_swap_variables]^return new BinaryNode ( length, offset, data ) ;^55^^^^^47^56^return new BinaryNode ( data, offset, length ) ;^[CLASS] BinaryNode  [METHOD] valueOf [RETURN_TYPE] BinaryNode   byte[] data int offset int length [VARIABLES] byte[]  _data  data  boolean  BinaryNode  EMPTY_BINARY_NODE  int  length  offset  
[buglab_swap_variables]^return new BinaryNode (  offset, length ) ;^55^^^^^47^56^return new BinaryNode ( data, offset, length ) ;^[CLASS] BinaryNode  [METHOD] valueOf [RETURN_TYPE] BinaryNode   byte[] data int offset int length [VARIABLES] byte[]  _data  data  boolean  BinaryNode  EMPTY_BINARY_NODE  int  length  offset  
[buglab_swap_variables]^return new BinaryNode ( data, length, offset ) ;^55^^^^^47^56^return new BinaryNode ( data, offset, length ) ;^[CLASS] BinaryNode  [METHOD] valueOf [RETURN_TYPE] BinaryNode   byte[] data int offset int length [VARIABLES] byte[]  _data  data  boolean  BinaryNode  EMPTY_BINARY_NODE  int  length  offset  
[buglab_swap_variables]^return new BinaryNode ( data,  length ) ;^55^^^^^47^56^return new BinaryNode ( data, offset, length ) ;^[CLASS] BinaryNode  [METHOD] valueOf [RETURN_TYPE] BinaryNode   byte[] data int offset int length [VARIABLES] byte[]  _data  data  boolean  BinaryNode  EMPTY_BINARY_NODE  int  length  offset  
[buglab_swap_variables]^return new BinaryNode ( data, offset ) ;^55^^^^^47^56^return new BinaryNode ( data, offset, length ) ;^[CLASS] BinaryNode  [METHOD] valueOf [RETURN_TYPE] BinaryNode   byte[] data int offset int length [VARIABLES] byte[]  _data  data  boolean  BinaryNode  EMPTY_BINARY_NODE  int  length  offset  
[buglab_swap_variables]^jg.writeBinary ( _data.length.getConfig (  ) .getBase64Variant (  ) , _data, 0, provider ) ;^94^95^^^^91^96^jg.writeBinary ( provider.getConfig (  ) .getBase64Variant (  ) , _data, 0, _data.length ) ;^[CLASS] BinaryNode  [METHOD] serialize [RETURN_TYPE] void   JsonGenerator jg SerializerProvider provider [VARIABLES] byte[]  _data  data  JsonGenerator  jg  boolean  SerializerProvider  provider  BinaryNode  EMPTY_BINARY_NODE  
[buglab_swap_variables]^jg.writeBinary ( provider.getConfig (  ) .getBase64Variant (  ) , _data.length, 0, _data ) ;^94^95^^^^91^96^jg.writeBinary ( provider.getConfig (  ) .getBase64Variant (  ) , _data, 0, _data.length ) ;^[CLASS] BinaryNode  [METHOD] serialize [RETURN_TYPE] void   JsonGenerator jg SerializerProvider provider [VARIABLES] byte[]  _data  data  JsonGenerator  jg  boolean  SerializerProvider  provider  BinaryNode  EMPTY_BINARY_NODE  
[buglab_swap_variables]^jg.writeBinary ( provider.getConfig (  ) .getBase64Variant (  ) ,  0, _data.length ) ;^94^95^^^^91^96^jg.writeBinary ( provider.getConfig (  ) .getBase64Variant (  ) , _data, 0, _data.length ) ;^[CLASS] BinaryNode  [METHOD] serialize [RETURN_TYPE] void   JsonGenerator jg SerializerProvider provider [VARIABLES] byte[]  _data  data  JsonGenerator  jg  boolean  SerializerProvider  provider  BinaryNode  EMPTY_BINARY_NODE  
[buglab_swap_variables]^jg.writeBinary ( provider.getConfig (  ) .getBase64Variant (  ) , _data, 0 ) ;^94^95^^^^91^96^jg.writeBinary ( provider.getConfig (  ) .getBase64Variant (  ) , _data, 0, _data.length ) ;^[CLASS] BinaryNode  [METHOD] serialize [RETURN_TYPE] void   JsonGenerator jg SerializerProvider provider [VARIABLES] byte[]  _data  data  JsonGenerator  jg  boolean  SerializerProvider  provider  BinaryNode  EMPTY_BINARY_NODE  
[buglab_swap_variables]^return Arrays.equals (  (  ( BinaryNode )  o ) . _data ) ;^106^^^^^99^107^return Arrays.equals (  (  ( BinaryNode )  o ) ._data, _data ) ;^[CLASS] BinaryNode  [METHOD] equals [RETURN_TYPE] boolean   Object o [VARIABLES] byte[]  _data  data  Object  o  boolean  BinaryNode  EMPTY_BINARY_NODE  
[buglab_swap_variables]^return  ( _data.length == null )  ? -1 : _data;^111^^^^^110^112^return  ( _data == null )  ? -1 : _data.length;^[CLASS] BinaryNode  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] byte[]  _data  data  BinaryNode  EMPTY_BINARY_NODE  boolean  
