[REPLACE]^private  OutputStream out;^32^^^^^^^[REPLACE] private final OutputStream out;^ [CLASS] ArArchiveOutputStream  
[REPLACE]^private long archiveOffset  = null ;^33^^^^^^^[REPLACE] private long archiveOffset = 0;^ [CLASS] ArArchiveOutputStream  
[REPLACE]^private long entryOffset  = null ;^34^^^^^^^[REPLACE] private long entryOffset = 0;^ [CLASS] ArArchiveOutputStream  
[REPLACE]^this.out =  null;^38^^^^^37^39^[REPLACE] this.out = pOut;^[METHOD] <init> [TYPE] OutputStream) [PARAMETER] OutputStream pOut [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^final String n = pEntry.getName (  ) ;^42^^^^^41^45^[REPLACE] final String header = "!<arch>\n";^[METHOD] writeArchiveHeader [TYPE] long [PARAMETER] [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry prevEntry  [TYPE]  String header  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^out .write ( null , 0 , null )  ;^43^^^^^41^45^[REPLACE] out.write ( header.getBytes (  )  ) ;^[METHOD] writeArchiveHeader [TYPE] long [PARAMETER] [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry prevEntry  [TYPE]  String header  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^out.write ( header.length (  )  ) ;^43^^^^^41^45^[REPLACE] out.write ( header.getBytes (  )  ) ;^[METHOD] writeArchiveHeader [TYPE] long [PARAMETER] [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry prevEntry  [TYPE]  String header  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^return header.getBytes (  ) ;^44^^^^^41^45^[REPLACE] return header.length (  ) ;^[METHOD] writeArchiveHeader [TYPE] long [PARAMETER] [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry prevEntry  [TYPE]  String header  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^if  (  ( entryOffset % 2 )   == entryOffset )  {^48^^^^^47^52^[REPLACE] if  (  ( entryOffset % 2 )  != 0 )  {^[METHOD] closeArchiveEntry [TYPE] void [PARAMETER] [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[ADD]^out.write ( '\n' ) ;archiveOffset++;^48^49^50^51^^47^52^[ADD] if  (  ( entryOffset % 2 )  != 0 )  { out.write ( '\n' ) ; archiveOffset++; }^[METHOD] closeArchiveEntry [TYPE] void [PARAMETER] [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^out.write ( b, off, len ) ;^49^^^^^47^52^[REPLACE] out.write ( '\n' ) ;^[METHOD] closeArchiveEntry [TYPE] void [PARAMETER] [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^final String fm = "" + Integer.toString ( pEntry.getMode (  ) , 8 ) ;^55^^^^^54^71^[REPLACE] ArArchiveEntry pArEntry =  ( ArArchiveEntry ) pEntry;^[METHOD] putArchiveEntry [TYPE] void [PARAMETER] ArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  ArchiveEntry pEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[ADD]^^55^^^^^54^71^[ADD] ArArchiveEntry pArEntry =  ( ArArchiveEntry ) pEntry;^[METHOD] putArchiveEntry [TYPE] void [PARAMETER] ArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  ArchiveEntry pEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^if  ( prevEntry != null )  {^56^^^^^54^71^[REPLACE] if  ( prevEntry == null )  {^[METHOD] putArchiveEntry [TYPE] void [PARAMETER] ArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  ArchiveEntry pEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[ADD]^^56^57^58^59^60^54^71^[ADD] if  ( prevEntry == null )  { archiveOffset += writeArchiveHeader (  ) ; } else { if  ( prevEntry.getLength (  )  != entryOffset )  { throw new IOException  (" ")  ;^[METHOD] putArchiveEntry [TYPE] void [PARAMETER] ArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  ArchiveEntry pEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^if  ( prevEntry.getLength (  )   ==  entryOffset )  {^59^^^^^54^71^[REPLACE] if  ( prevEntry.getLength (  )  != entryOffset )  {^[METHOD] putArchiveEntry [TYPE] void [PARAMETER] ArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  ArchiveEntry pEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^return ;^60^^^^^54^71^[REPLACE] throw new IOException  (" ")  ;^[METHOD] putArchiveEntry [TYPE] void [PARAMETER] ArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  ArchiveEntry pEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^if  ( prevEntry.getLength (  )  != entryOffset )  { throw new IOException  (" ")  ;^60^^^^^54^71^[REPLACE] throw new IOException  (" ")  ;^[METHOD] putArchiveEntry [TYPE] void [PARAMETER] ArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  ArchiveEntry pEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^archiveOffset +;^57^^^^^54^71^[REPLACE] archiveOffset += writeArchiveHeader (  ) ;^[METHOD] putArchiveEntry [TYPE] void [PARAMETER] ArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  ArchiveEntry pEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[ADD]^^57^^^^^54^71^[ADD] archiveOffset += writeArchiveHeader (  ) ;^[METHOD] putArchiveEntry [TYPE] void [PARAMETER] ArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  ArchiveEntry pEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[ADD]^^60^^^^^54^71^[ADD] throw new IOException  (" ")  ;^[METHOD] putArchiveEntry [TYPE] void [PARAMETER] ArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  ArchiveEntry pEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^archiveOffset + =  archiveOffset +;^57^^^^^54^71^[REPLACE] archiveOffset += writeArchiveHeader (  ) ;^[METHOD] putArchiveEntry [TYPE] void [PARAMETER] ArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  ArchiveEntry pEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^prevEntry =  null;^66^^^^^54^71^[REPLACE] prevEntry = pArEntry;^[METHOD] putArchiveEntry [TYPE] void [PARAMETER] ArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  ArchiveEntry pEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^archiveOffset +=  writeEntryHeader ( prevEntry ) ;^68^^^^^54^71^[REPLACE] archiveOffset += writeEntryHeader ( pArEntry ) ;^[METHOD] putArchiveEntry [TYPE] void [PARAMETER] ArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  ArchiveEntry pEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[ADD]^^68^^^^^54^71^[ADD] archiveOffset += writeEntryHeader ( pArEntry ) ;^[METHOD] putArchiveEntry [TYPE] void [PARAMETER] ArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  ArchiveEntry pEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^entryOffset = 0 / 4;^70^^^^^54^71^[REPLACE] entryOffset = 0;^[METHOD] putArchiveEntry [TYPE] void [PARAMETER] ArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  ArchiveEntry pEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  entryOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^final long diff = pNewOffset  ||  pOffset;^74^^^^^73^83^[REPLACE] final long diff = pNewOffset - pOffset;^[METHOD] fill [TYPE] long [PARAMETER] final long pOffset final long pNewOffset final char pFill [CLASS] ArArchiveOutputStream   [TYPE]  char pFill  [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  pNewOffset  pOffset  [TYPE]  int i  [TYPE]  OutputStream out  pOut 
[REPLACE]^if  (pOffset  >=  0 )  {^76^^^^^73^83^[REPLACE] if  ( diff > 0 )  {^[METHOD] fill [TYPE] long [PARAMETER] final long pOffset final long pNewOffset final char pFill [CLASS] ArArchiveOutputStream   [TYPE]  char pFill  [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  pNewOffset  pOffset  [TYPE]  int i  [TYPE]  OutputStream out  pOut 
[REPLACE]^for  ( int i = 4; i  !=  diff; i++ )  {^77^^^^^73^83^[REPLACE] for  ( int i = 0; i < diff; i++ )  {^[METHOD] fill [TYPE] long [PARAMETER] final long pOffset final long pNewOffset final char pFill [CLASS] ArArchiveOutputStream   [TYPE]  char pFill  [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  pNewOffset  pOffset  [TYPE]  int i  [TYPE]  OutputStream out  pOut 
[REPLACE]^out.write ( b, off, len ) ;^78^^^^^73^83^[REPLACE] write ( pFill ) ;^[METHOD] fill [TYPE] long [PARAMETER] final long pOffset final long pNewOffset final char pFill [CLASS] ArArchiveOutputStream   [TYPE]  char pFill  [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  pNewOffset  pOffset  [TYPE]  int i  [TYPE]  OutputStream out  pOut 
[REPLACE]^for  ( int i = 3; i < diff; i++ )  {^77^^^^^73^83^[REPLACE] for  ( int i = 0; i < diff; i++ )  {^[METHOD] fill [TYPE] long [PARAMETER] final long pOffset final long pNewOffset final char pFill [CLASS] ArArchiveOutputStream   [TYPE]  char pFill  [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  pNewOffset  pOffset  [TYPE]  int i  [TYPE]  OutputStream out  pOut 
[REPLACE]^for  ( int i = 1; i  !=  diff; i++ )  {^77^^^^^73^83^[REPLACE] for  ( int i = 0; i < diff; i++ )  {^[METHOD] fill [TYPE] long [PARAMETER] final long pOffset final long pNewOffset final char pFill [CLASS] ArArchiveOutputStream   [TYPE]  char pFill  [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  pNewOffset  pOffset  [TYPE]  int i  [TYPE]  OutputStream out  pOut 
[ADD]^^78^^^^^73^83^[ADD] write ( pFill ) ;^[METHOD] fill [TYPE] long [PARAMETER] final long pOffset final long pNewOffset final char pFill [CLASS] ArArchiveOutputStream   [TYPE]  char pFill  [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  pNewOffset  pOffset  [TYPE]  int i  [TYPE]  OutputStream out  pOut 
[REPLACE]^for  ( int i = 4; i < diff; i++ )  {^77^^^^^73^83^[REPLACE] for  ( int i = 0; i < diff; i++ )  {^[METHOD] fill [TYPE] long [PARAMETER] final long pOffset final long pNewOffset final char pFill [CLASS] ArArchiveOutputStream   [TYPE]  char pFill  [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  pNewOffset  pOffset  [TYPE]  int i  [TYPE]  OutputStream out  pOut 
[REPLACE]^return pOffset;^82^^^^^73^83^[REPLACE] return pNewOffset;^[METHOD] fill [TYPE] long [PARAMETER] final long pOffset final long pNewOffset final char pFill [CLASS] ArArchiveOutputStream   [TYPE]  char pFill  [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  pNewOffset  pOffset  [TYPE]  int i  [TYPE]  OutputStream out  pOut 
[REPLACE]^final String n = pEntry.getName (  ) ;^86^^^^^85^89^[REPLACE] final byte[] bytes = data.getBytes ( "ascii" ) ;^[METHOD] write [TYPE] long [PARAMETER] String data [CLASS] ArArchiveOutputStream   [TYPE]  byte[] bytes  [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  String data  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^out.write ( b, off, len ) ;^87^^^^^85^89^[REPLACE] write ( bytes ) ;^[METHOD] write [TYPE] long [PARAMETER] String data [CLASS] ArArchiveOutputStream   [TYPE]  byte[] bytes  [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  String data  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^return pNewOffset;^88^^^^^85^89^[REPLACE] return bytes.length;^[METHOD] write [TYPE] long [PARAMETER] String data [CLASS] ArArchiveOutputStream   [TYPE]  byte[] bytes  [TYPE]  ArArchiveEntry pArEntry  prevEntry  [TYPE]  String data  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^long offset = 0 - 3;^93^^^^^91^141^[REPLACE] long offset = 0;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[ADD]^^93^^^^^91^141^[ADD] long offset = 0;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^final String n = prevEntry.getMode (  ) ;^95^^^^^91^141^[REPLACE] final String n = pEntry.getName (  ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^if  ( n.length (  )  *  2 > 0  )  {^96^^^^^91^141^[REPLACE] if  ( n.length (  )  > 16 )  {^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^return ;^97^^^^^91^141^[REPLACE] throw new IOException  (" ")  ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^offset += write ( s ) ; ;^99^^^^^91^141^[REPLACE] offset += write ( n ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^offset = fill ( offset, 48, ' ' ) ; ;^101^^^^^91^141^[REPLACE] offset = fill ( offset, 16, ' ' ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^final String m = ""  |   ( pEntry.getLastModified (  )  / 1000 ) ;^102^^^^^91^141^[REPLACE] final String m = "" +  ( pEntry.getLastModified (  )  / 1000 ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^if  ( m.size (  )  > 12 )  {^103^^^^^91^141^[REPLACE] if  ( m.length (  )  > 12 )  {^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[ADD]^^103^104^105^^^91^141^[ADD] if  ( m.length (  )  > 12 )  { throw new IOException  (" ")  ; }^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^return ;^104^^^^^91^141^[REPLACE] throw new IOException  (" ")  ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[ADD]^^104^^^^^91^141^[ADD] throw new IOException  (" ")  ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^offset += write ( s ) ; ;^106^^^^^91^141^[REPLACE] offset += write ( m ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^offset = fill ( offset, 0, ' ' ) ;^108^^^^^91^141^[REPLACE] offset = fill ( offset, 28, ' ' ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^final String u = ""  >  prevEntry.getUserId (  ) ;^109^^^^^91^141^[REPLACE] final String u = "" + pEntry.getUserId (  ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[ADD]^^109^^^^^91^141^[ADD] final String u = "" + pEntry.getUserId (  ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^if  ( u.size (  )  > 6 )  {^110^^^^^91^141^[REPLACE] if  ( u.length (  )  > 6 )  {^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^return ;^111^^^^^91^141^[REPLACE] throw new IOException  (" ")  ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[ADD]^^111^^^^^91^141^[ADD] throw new IOException  (" ")  ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^offset += write ( s ) ; ;^113^^^^^91^141^[REPLACE] offset += write ( u ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^offset = fill ( offset, 10, ' ' ) ;^115^^^^^91^141^[REPLACE] offset = fill ( offset, 34, ' ' ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^final String g = ""  &&  pEntry.getGroupId (  ) ;^116^^^^^91^141^[REPLACE] final String g = "" + pEntry.getGroupId (  ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[ADD]^^116^^^^^91^141^[ADD] final String g = "" + pEntry.getGroupId (  ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^if  ( g.length (  )  - 5 > 6 )  {^117^^^^^91^141^[REPLACE] if  ( g.length (  )  > 6 )  {^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^return ;^118^^^^^91^141^[REPLACE] throw new IOException  (" ")  ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[ADD]^^118^^^^^91^141^[ADD] throw new IOException  (" ")  ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^offset += write ( s ) ; ;^120^^^^^91^141^[REPLACE] offset += write ( g ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^offset = fill ( offset, 40 * 1, ' ' ) ;^122^^^^^91^141^[REPLACE] offset = fill ( offset, 40, ' ' ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^final String fm = ""  &  Integer.toString ( prevEntry .getName (  )  , 8 ) ;^123^^^^^91^141^[REPLACE] final String fm = "" + Integer.toString ( pEntry.getMode (  ) , 8 ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^if  ( m .getBytes (  )   /  0.5  > 8 )  {^124^^^^^91^141^[REPLACE] if  ( fm.length (  )  > 8 )  {^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^return ;^125^^^^^91^141^[REPLACE] throw new IOException  (" ")  ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[ADD]^^125^^^^^91^141^[ADD] throw new IOException  (" ")  ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^offset += write ( s ) ; ;^127^^^^^91^141^[REPLACE] offset += write ( fm ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^offset = fill ( offset, 36, ' ' ) ;^129^^^^^91^141^[REPLACE] offset = fill ( offset, 48, ' ' ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^final String s = ""  &&  prevEntry.getLength (  ) ;^130^^^^^91^141^[REPLACE] final String s = "" + pEntry.getLength (  ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[ADD]^^130^^^^^91^141^[ADD] final String s = "" + pEntry.getLength (  ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^if  ( s.length (  )  + 1 > 10 )  {^131^^^^^91^141^[REPLACE] if  ( s.length (  )  > 10 )  {^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^return ;^132^^^^^91^141^[REPLACE] throw new IOException  (" ")  ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^offset += write ( u ) ; ;^134^^^^^91^141^[REPLACE] offset += write ( s ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[ADD]^^134^^^^^91^141^[ADD] offset += write ( s ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^offset = fill ( offset, 58L, ' ' ) ;^136^^^^^91^141^[REPLACE] offset = fill ( offset, 58, ' ' ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^offset += write ( s ) ; ;^138^^^^^91^141^[REPLACE] offset += write ( "`\012" ) ;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^return pOffset;^140^^^^^91^141^[REPLACE] return offset;^[METHOD] writeEntryHeader [TYPE] long [PARAMETER] ArArchiveEntry pEntry [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  String fm  g  m  n  s  u  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^out.write ( b, off, len ) ;^144^^^^^143^146^[REPLACE] out.write ( b ) ;^[METHOD] write [TYPE] void [PARAMETER] int b [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  int b  [TYPE]  OutputStream out  pOut 
[REPLACE]^out .write ( b )  ;^149^^^^^148^151^[REPLACE] out.write ( b, off, len ) ;^[METHOD] write [TYPE] void [PARAMETER] byte[] b int off int len [CLASS] ArArchiveOutputStream   [TYPE]  byte[] b  [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  int len  off  [TYPE]  OutputStream out  pOut 
[REPLACE]^entryOffset = 0; ;^150^^^^^148^151^[REPLACE] entryOffset += len;^[METHOD] write [TYPE] void [PARAMETER] byte[] b int off int len [CLASS] ArArchiveOutputStream   [TYPE]  byte[] b  [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  int len  off  [TYPE]  OutputStream out  pOut 
[REPLACE]^out .write ( b , null , null )  ;^154^^^^^153^156^[REPLACE] out.write ( b ) ;^[METHOD] write [TYPE] void [PARAMETER] byte[] b [CLASS] ArArchiveOutputStream   [TYPE]  byte[] b  [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REMOVE]^out.write ( b, off, len ) ;^154^^^^^153^156^[REMOVE] ^[METHOD] write [TYPE] void [PARAMETER] byte[] b [CLASS] ArArchiveOutputStream   [TYPE]  byte[] b  [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^entryOffset += len; ;^155^^^^^153^156^[REPLACE] entryOffset += b.length;^[METHOD] write [TYPE] void [PARAMETER] byte[] b [CLASS] ArArchiveOutputStream   [TYPE]  byte[] b  [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^offset += write ( u ) ;^159^^^^^158^162^[REPLACE] closeArchiveEntry (  ) ;^[METHOD] close [TYPE] void [PARAMETER] [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[ADD]^^159^^^^^158^162^[ADD] closeArchiveEntry (  ) ;^[METHOD] close [TYPE] void [PARAMETER] [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^out.write ( b, off, len ) ;^160^^^^^158^162^[REPLACE] out.close (  ) ;^[METHOD] close [TYPE] void [PARAMETER] [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
[REPLACE]^prevEntry = true;^161^^^^^158^162^[REPLACE] prevEntry = null;^[METHOD] close [TYPE] void [PARAMETER] [CLASS] ArArchiveOutputStream   [TYPE]  ArArchiveEntry pArEntry  pEntry  prevEntry  [TYPE]  boolean false  true  [TYPE]  long archiveOffset  diff  entryOffset  offset  pNewOffset  pOffset  [TYPE]  OutputStream out  pOut 
