[REPLACE]^private  Charset charset;^41^^^^^^^[REPLACE] private final Charset charset;^ [CLASS] NioZipEncoding  
[REPLACE]^this.charset =  null;^50^^^^^49^51^[REPLACE] this.charset = charset;^[METHOD] <init> [TYPE] Charset) [PARAMETER] Charset charset [CLASS] NioZipEncoding   [TYPE]  Charset charset  [TYPE]  boolean false  true 
[REPLACE]^CharsetEncoder enc = this.charset.newDecoder (  ) ;^58^^^^^57^63^[REPLACE] CharsetEncoder enc = this.charset.newEncoder (  ) ;^[METHOD] canEncode [TYPE] boolean [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  CharsetEncoder enc 
[REPLACE]^enc.onUnmappableCharacter ( CodingErrorAction.REPORT ) ;^59^^^^^57^63^[REPLACE] enc.onMalformedInput ( CodingErrorAction.REPORT ) ;^[METHOD] canEncode [TYPE] boolean [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  CharsetEncoder enc 
[ADD]^^59^60^^62^63^57^63^[ADD] enc.onMalformedInput ( CodingErrorAction.REPORT ) ; enc.onUnmappableCharacter ( CodingErrorAction.REPORT ) ; return enc.canEncode ( name ) ; }^[METHOD] canEncode [TYPE] boolean [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  CharsetEncoder enc 
[REPLACE]^enc.onMalformedInput ( CodingErrorAction.REPORT ) ;^60^^^^^57^63^[REPLACE] enc.onUnmappableCharacter ( CodingErrorAction.REPORT ) ;^[METHOD] canEncode [TYPE] boolean [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  CharsetEncoder enc 
[REPLACE]^return enc .encode ( name )  ;^62^^^^^57^63^[REPLACE] return enc.canEncode ( name ) ;^[METHOD] canEncode [TYPE] boolean [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  boolean false  true  [TYPE]  CharsetEncoder enc 
[REPLACE]^CharsetEncoder enc = this.charset .newDecoder (  )  ;^70^^^^^69^110^[REPLACE] CharsetEncoder enc = this.charset.newEncoder (  ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[ADD]^^70^^^^^69^110^[ADD] CharsetEncoder enc = this.charset.newEncoder (  ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^enc.onUnmappableCharacter ( CodingErrorAction.REPORT ) ;^72^^^^^69^110^[REPLACE] enc.onMalformedInput ( CodingErrorAction.REPORT ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[ADD]^^72^73^^75^76^69^110^[ADD] enc.onMalformedInput ( CodingErrorAction.REPORT ) ; enc.onUnmappableCharacter ( CodingErrorAction.REPORT ) ; CharBuffer cb = CharBuffer.wrap ( name ) ; ByteBuffer out = ByteBuffer.allocate ( name.length (  )^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^enc.onMalformedInput ( CodingErrorAction.REPORT ) ;^73^^^^^69^110^[REPLACE] enc.onUnmappableCharacter ( CodingErrorAction.REPORT ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^name   ;^75^^^^^69^110^[REPLACE] CharBuffer cb = CharBuffer.wrap ( name ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[ADD]^^75^^^^^69^110^[ADD] CharBuffer cb = CharBuffer.wrap ( name ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^ByteBuffer out = ByteBuffer.allocate ( name.length (  )  *  2+  ( name.length (  )  *  2 + 1 )  / 2 ) ;^76^77^^^^69^110^[REPLACE] ByteBuffer out = ByteBuffer.allocate ( name.length (  ) +  ( name.length (  )  + 1 )  / 2 ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[ADD]^^76^77^^^^69^110^[ADD] ByteBuffer out = ByteBuffer.allocate ( name.length (  ) +  ( name.length (  )  + 1 )  / 2 ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^while  ( cb.remaining (  )   <=  4 )  {^79^^^^^69^110^[REPLACE] while  ( cb.remaining (  )  > 0 )  {^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^if  ( res.isUnmappable (  )  ) {^82^^^^^69^110^[REPLACE] if  ( res.isUnmappable (  )  || res.isMalformed (  )  )  {^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^}  else {^95^^^^^69^110^[REPLACE] } else if  ( res.isOverflow (  )  )  {^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^}  if  ( res .isOverflow (  )   )  {^99^^^^^69^110^[REPLACE] } else if  ( res.isUnderflow (  )  )  {^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^enc .onUnmappableCharacter ( null )  ;^101^^^^^69^110^[REPLACE] enc.flush ( out ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^out = ZipEncodingHelper.growBuffer ( out, 3 ) ;^97^^^^^69^110^[REPLACE] out = ZipEncodingHelper.growBuffer ( out, 0 ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^}  if  ( res.isUnderflow (  )  )  {^99^^^^^69^110^[REPLACE] } else if  ( res.isUnderflow (  )  )  {^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^enc .onUnmappableCharacter ( this )  ;^101^^^^^69^110^[REPLACE] enc.flush ( out ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^out = ZipEncodingHelper.growBuffer ( out, 0 + 3 ) ;^97^^^^^69^110^[REPLACE] out = ZipEncodingHelper.growBuffer ( out, 0 ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[ADD]^^97^^^^^69^110^[ADD] out = ZipEncodingHelper.growBuffer ( out, 0 ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^if  ( res.size (  )  * 6 > out.remaining (  )  )  {^86^^^^^69^110^[REPLACE] if  ( res.length (  )  * 6 > out.remaining (  )  )  {^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^out = ZipEncodingHelper.growBuffer ( out, out.position (  ) + res.length (  )  %  2 * 6 ) ;^87^88^^^^69^110^[REPLACE] out = ZipEncodingHelper.growBuffer ( out, out.position (  ) + res.length (  )  * 6 ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^for  ( int i=0; i<res.length (  )  %  0.5 ; ++i )  {^91^^^^^69^110^[REPLACE] for  ( int i=0; i<res.length (  ) ; ++i )  {^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[ADD]^^91^92^93^^^69^110^[ADD] for  ( int i=0; i<res.length (  ) ; ++i )  { ZipEncodingHelper.appendSurrogate ( out,cb.get (  )  ) ; }^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^ZipEncodingHelper .growBuffer ( out , i )  ;^92^^^^^69^110^[REPLACE] ZipEncodingHelper.appendSurrogate ( out,cb.get (  )  ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^ZipEncodingHelper.appendSurrogate ( out,cb.toString (  )  ) ;^92^^^^^69^110^[REPLACE] ZipEncodingHelper.appendSurrogate ( out,cb.get (  )  ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^out = ZipEncodingHelper.growBuffer ( out, out.position (  ) + res.length (  )  - 4 * 6 ) ;^87^88^^^^69^110^[REPLACE] out = ZipEncodingHelper.growBuffer ( out, out.position (  ) + res.length (  )  * 6 ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^for  ( int i=0 ; i<res.length (  ) ; ++i )  {^91^^^^^69^110^[REPLACE] for  ( int i=0; i<res.length (  ) ; ++i )  {^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[ADD]^^86^87^88^89^^69^110^[ADD] if  ( res.length (  )  * 6 > out.remaining (  )  )  { out = ZipEncodingHelper.growBuffer ( out, out.position (  ) + res.length (  )  * 6 ) ; }^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^out = ZipEncodingHelper.growBuffer ( out, out.position (  ) + res.length (  )  %  0.5  * 6 ) ;^87^88^^^^69^110^[REPLACE] out = ZipEncodingHelper.growBuffer ( out, out.position (  ) + res.length (  )  * 6 ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REMOVE]^if  (  (  ( res.length (  )  )  * 6 )  >  ( out.remaining (  )  )  )  {     out = growBuffer ( out,  (  ( out.position (  )  )  +  (  ( res.length (  )  )  * 6 )  )  ) ; }^95^^^^^69^110^[REMOVE] ^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^}  else {^99^^^^^69^110^[REPLACE] } else if  ( res.isUnderflow (  )  )  {^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^enc.canEncode ( out ) ;^101^^^^^69^110^[REPLACE] enc.flush ( out ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^out = ZipEncodingHelper.growBuffer ( out, 0 - 4 ) ;^97^^^^^69^110^[REPLACE] out = ZipEncodingHelper.growBuffer ( out, 0 ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[ADD]^}   enc.flush ( out ) ;break;^99^100^101^102^^69^110^[ADD] else if  ( res.isUnderflow (  )  )  {  enc.flush ( out ) ; break;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^for  ( int i=0; i<res.length (  )  + 2; ++i )  {^91^^^^^69^110^[REPLACE] for  ( int i=0; i<res.length (  ) ; ++i )  {^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^ZipEncodingHelper.growBuffer ( out,cb.get (  )  ) ;^92^^^^^69^110^[REPLACE] ZipEncodingHelper.appendSurrogate ( out,cb.get (  )  ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^out = ZipEncodingHelper.growBuffer ( out, out.position (  ) + res.length (  )  + 3 * 0  ) ;^87^88^^^^69^110^[REPLACE] out = ZipEncodingHelper.growBuffer ( out, out.position (  ) + res.length (  )  * 6 ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^out = ZipEncodingHelper.growBuffer ( out, 0L ) ;^97^^^^^69^110^[REPLACE] out = ZipEncodingHelper.growBuffer ( out, 0 ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^CoderResult res = enc.encode ( cb, out,false ) ;^80^^^^^69^110^[REPLACE] CoderResult res = enc.encode ( cb, out,true ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[ADD]^^80^^^^^69^110^[ADD] CoderResult res = enc.encode ( cb, out,true ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^if  (  res.isMalformed (  )  )  {^82^^^^^69^110^[REPLACE] if  ( res.isUnmappable (  )  || res.isMalformed (  )  )  {^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^}  if  ( res.isOverflow (  )  )  {^95^^^^^69^110^[REPLACE] } else if  ( res.isOverflow (  )  )  {^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REMOVE]^out.rewind (  ) ;^101^^^^^69^110^[REMOVE] ^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^out = ZipEncodingHelper.growBuffer ( out, 4 ) ;^97^^^^^69^110^[REPLACE] out = ZipEncodingHelper.growBuffer ( out, 0 ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[ADD]^^101^^^^^69^110^[ADD] enc.flush ( out ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^out = ZipEncodingHelper.growBuffer ( out, 0 + 1 ) ;^97^^^^^69^110^[REPLACE] out = ZipEncodingHelper.growBuffer ( out, 0 ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^if  ( res.length (  )  - 3 * 6 > out.remaining (  )  )  {^86^^^^^69^110^[REPLACE] if  ( res.length (  )  * 6 > out.remaining (  )  )  {^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^out = ZipEncodingHelper.growBuffer ( out, out.position (  ) + res.length (  )  - 4 * 0  ) ;^87^88^^^^69^110^[REPLACE] out = ZipEncodingHelper.growBuffer ( out, out.position (  ) + res.length (  )  * 6 ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^for  ( int i=0 ; i<res.length (  )  /  0 .5 ; ++i )  {^91^^^^^69^110^[REPLACE] for  ( int i=0; i<res.length (  ) ; ++i )  {^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^ZipEncodingHelper.appendSurrogate ( out,cb .toString (  )   ) ;^92^^^^^69^110^[REPLACE] ZipEncodingHelper.appendSurrogate ( out,cb.get (  )  ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^out = ZipEncodingHelper.growBuffer ( out, out.position (  ) + res.length (  )  - 3 * 6 ) ;^87^88^^^^69^110^[REPLACE] out = ZipEncodingHelper.growBuffer ( out, out.position (  ) + res.length (  )  * 6 ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^out = ZipEncodingHelper.growBuffer ( out, out.position (  ) + res.size (  )  * 0  ) ;^87^88^^^^69^110^[REPLACE] out = ZipEncodingHelper.growBuffer ( out, out.position (  ) + res.length (  )  * 6 ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[ADD]^}   out = ZipEncodingHelper.growBuffer ( out, 0 ) ;^95^96^97^^^69^110^[ADD] else if  ( res.isOverflow (  )  )  {  out = ZipEncodingHelper.growBuffer ( out, 0 ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^out = ZipEncodingHelper.growBuffer ( out, 0 >> 1 ) ;^97^^^^^69^110^[REPLACE] out = ZipEncodingHelper.growBuffer ( out, 0 ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^for  ( int i=0 ; i<res.length (  )  - 3; ++i )  {^91^^^^^69^110^[REPLACE] for  ( int i=0; i<res.length (  ) ; ++i )  {^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^out = ZipEncodingHelper.growBuffer ( out, out.position (  ) + res.length (  )  /  2 * 0  ) ;^87^88^^^^69^110^[REPLACE] out = ZipEncodingHelper.growBuffer ( out, out.position (  ) + res.length (  )  * 6 ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^out.limit ( out.remaining (  )  ) ;^107^^^^^69^110^[REPLACE] out.limit ( out.position (  )  ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[ADD]^^107^108^^^^69^110^[ADD] out.limit ( out.position (  )  ) ; out.rewind (  ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^out.remaining (  ) ;^108^^^^^69^110^[REPLACE] out.rewind (  ) ;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^return enc.canEncode ( name ) ;^109^^^^^69^110^[REPLACE] return out;^[METHOD] encode [TYPE] ByteBuffer [PARAMETER] String name [CLASS] NioZipEncoding   [TYPE]  boolean false  true  [TYPE]  CharBuffer cb  [TYPE]  Charset charset  [TYPE]  String name  [TYPE]  CharsetEncoder enc  [TYPE]  ByteBuffer out  [TYPE]  int i  [TYPE]  CoderResult res 
[REPLACE]^return this.charset.newDecoder (  ) .onMalformedInput ( CodingErrorAction.REPORT ) .onUnmappableCharacter ( CodingErrorAction.REPORT ) .onMalformedInput ( ByteBuffer.wrap ( data )  ) .toString (  ) ;^117^118^119^120^^116^121^[REPLACE] return this.charset.newDecoder (  ) .onMalformedInput ( CodingErrorAction.REPORT ) .onUnmappableCharacter ( CodingErrorAction.REPORT ) .decode ( ByteBuffer.wrap ( data )  ) .toString (  ) ;^[METHOD] decode [TYPE] String [PARAMETER] byte[] data [CLASS] NioZipEncoding   [TYPE]  byte[] data  [TYPE]  Charset charset  [TYPE]  boolean false  true 
