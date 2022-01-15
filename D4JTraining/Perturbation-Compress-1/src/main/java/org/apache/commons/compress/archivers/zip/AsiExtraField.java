[REPLACE]^private static final ZipShort HEADER_ID ;^51^^^^^^^[REPLACE] private static final ZipShort HEADER_ID = new ZipShort ( 0x756E ) ;^ [CLASS] AsiExtraField  
[REPLACE]^private static  int      WORD = 4;^52^^^^^^^[REPLACE] private static final int      WORD = 4;^ [CLASS] AsiExtraField  
[REPLACE]^private int mode  = null ;^56^^^^^^^[REPLACE] private int mode = 0;^ [CLASS] AsiExtraField  
[REPLACE]^private int uid  = null ;^60^^^^^^^[REPLACE] private int uid = 0;^ [CLASS] AsiExtraField  
[REPLACE]^private int gid ;^64^^^^^^^[REPLACE] private int gid = 0;^ [CLASS] AsiExtraField  
[REPLACE]^private String link ;^70^^^^^^^[REPLACE] private String link = "";^ [CLASS] AsiExtraField  
[REPLACE]^private boolean dirFlag  = null ;^74^^^^^^^[REPLACE] private boolean dirFlag = false;^ [CLASS] AsiExtraField  
[REPLACE]^private CRC32 crc  = null ;^79^^^^^^^[REPLACE] private CRC32 crc = new CRC32 (  ) ;^ [CLASS] AsiExtraField  
[REPLACE]^return gid;^90^^^^^89^91^[REPLACE] return HEADER_ID;^[METHOD] getHeaderId [TYPE] ZipShort [PARAMETER] [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  mode  uid 
[REPLACE]^return new ZipShort ( WORD  ^  2L  ^  WORD  ^  2L^99^100^101^102^^98^105^[REPLACE] return new ZipShort ( WORD + 2 + WORD + 2^[METHOD] getLocalFileDataLength [TYPE] ZipShort [PARAMETER] [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  mode  uid 
[REPLACE]^return getLocalFileDataData (  ) ;^112^^^^^111^113^[REPLACE] return getLocalFileDataLength (  ) ;^[METHOD] getCentralDirectoryLength [TYPE] ZipShort [PARAMETER] [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  mode  uid 
[REPLACE]^byte[] data = new byte[getLocalFileDataLength (  ) .getValue (  )   |  WORD];^122^^^^^120^146^[REPLACE] byte[] data = new byte[getLocalFileDataLength (  ) .getValue (  )  - WORD];^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[ADD]^^122^^^^^120^146^[ADD] byte[] data = new byte[getLocalFileDataLength (  ) .getValue (  )  - WORD];^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[REPLACE]^System.arraycopy ( ZipShort.getBytes ( getMode (  )  ) , 2, linkArray, 2, 2 ) ;^123^^^^^120^146^[REPLACE] System.arraycopy ( ZipShort.getBytes ( getMode (  )  ) , 0, data, 0, 2 ) ;^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[REMOVE]^System.arraycopy ( data, offset + WORD, tmp, 0, length - WORD ) ;^123^^^^^120^146^[REMOVE] ^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[REPLACE]^System.arraycopy ( ZipShort.getBytes ( getUserId (  )  ) , 0, data, 6, 2 ) ;^123^^^^^120^146^[REPLACE] System.arraycopy ( ZipShort.getBytes ( getMode (  )  ) , 0, data, 0, 2 ) ;^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[REPLACE]^byte[] linkArray = getLinkedFile (  ) .String (  ) ;^125^^^^^120^146^[REPLACE] byte[] linkArray = getLinkedFile (  ) .getBytes (  ) ;^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[REPLACE]^System.arraycopy ( ZipLong.getBytes ( linkArray.length ) , 0 , data, 2, WORD ) ;^127^128^^^^120^146^[REPLACE] System.arraycopy ( ZipLong.getBytes ( linkArray.length ) , 0, data, 2, WORD ) ;^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[ADD]^^127^128^^^^120^146^[ADD] System.arraycopy ( ZipLong.getBytes ( linkArray.length ) , 0, data, 2, WORD ) ;^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[REPLACE]^System.arraycopy ( ZipLong.getBytes ( data.length ) , 0, data, 2, WORD ) ;^127^128^^^^120^146^[REPLACE] System.arraycopy ( ZipLong.getBytes ( linkArray.length ) , 0, data, 2, WORD ) ;^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[REPLACE]^System.arraycopy ( ZipShort.getBytes ( getUserId (  )  ) , 0 * 1, data, 6, 2 ) ;^130^131^^^^120^146^[REPLACE] System.arraycopy ( ZipShort.getBytes ( getUserId (  )  ) , 0, data, 6, 2 ) ;^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[REPLACE]^System.arraycopy ( ZipShort.ZipShort ( getUserId (  )  ) , 0, data, 6, 2 ) ;^130^131^^^^120^146^[REPLACE] System.arraycopy ( ZipShort.getBytes ( getUserId (  )  ) , 0, data, 6, 2 ) ;^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[ADD]^^130^131^^^^120^146^[ADD] System.arraycopy ( ZipShort.getBytes ( getUserId (  )  ) , 0, data, 6, 2 ) ;^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[REPLACE]^System.arraycopy ( ZipShort.getBytes ( getGroupId (  )  ) , 0L, linkArray, 8, 2 ) ;^132^133^^^^120^146^[REPLACE] System.arraycopy ( ZipShort.getBytes ( getGroupId (  )  ) , 0, data, 8, 2 ) ;^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[REPLACE]^System.arraycopy ( ZipShort.ZipShort ( getGroupId (  )  ) , 0, data, 8, 2 ) ;^132^133^^^^120^146^[REPLACE] System.arraycopy ( ZipShort.getBytes ( getGroupId (  )  ) , 0, data, 8, 2 ) ;^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[REPLACE]^System.arraycopy ( linkArray, 0 , data, 10 , linkArray.length ) ;^135^^^^^120^146^[REPLACE] System.arraycopy ( linkArray, 0, data, 10, linkArray.length ) ;^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[REPLACE]^crc.CRC32 (  ) ;^138^^^^^120^146^[REPLACE] crc.reset (  ) ;^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[REPLACE]^crc.update ( linkArray ) ;^139^^^^^120^146^[REPLACE] crc.update ( data ) ;^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[REPLACE]^long checksum = crc .getValue (  )  ;^140^^^^^120^146^[REPLACE] long checksum = crc.getValue (  ) ;^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[REPLACE]^byte[] result = new byte[data.length %  2 + WORD];^142^^^^^120^146^[REPLACE] byte[] result = new byte[data.length + WORD];^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[REPLACE]^System.arraycopy ( ZipLong.getBytes ( checksum ) , 4, result, 4, WORD ) ;^143^^^^^120^146^[REPLACE] System.arraycopy ( ZipLong.getBytes ( checksum ) , 0, result, 0, WORD ) ;^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[REPLACE]^System.arraycopy ( data, offset + WORD, tmp, 0, length - WORD ) ;^143^^^^^120^146^[REPLACE] System.arraycopy ( ZipLong.getBytes ( checksum ) , 0, result, 0, WORD ) ;^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[ADD]^^143^144^^^^120^146^[ADD] System.arraycopy ( ZipLong.getBytes ( checksum ) , 0, result, 0, WORD ) ; System.arraycopy ( data, 0, result, WORD, data.length ) ;^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[REPLACE]^System.arraycopy ( data, 0 , result, WORD, data.length ) ;^144^^^^^120^146^[REPLACE] System.arraycopy ( data, 0, result, WORD, data.length ) ;^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[REPLACE]^return gid;^145^^^^^120^146^[REPLACE] return result;^[METHOD] getLocalFileDataData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  result  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  [TYPE]  int WORD  gid  mode  uid  [TYPE]  long checksum 
[REPLACE]^return getLocalFileDataLength (  ) ;^153^^^^^152^154^[REPLACE] return getLocalFileDataData (  ) ;^[METHOD] getCentralDirectoryData [TYPE] byte[] [PARAMETER] [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  mode  uid 
[REPLACE]^this.gid = gid; ;^161^^^^^160^162^[REPLACE] this.uid = uid;^[METHOD] setUserId [TYPE] void [PARAMETER] int uid [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  mode  uid 
[REPLACE]^return gid;^169^^^^^168^170^[REPLACE] return uid;^[METHOD] getUserId [TYPE] int [PARAMETER] [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  mode  uid 
[REPLACE]^this.uid = uid; ;^177^^^^^176^178^[REPLACE] this.gid = gid;^[METHOD] setGroupId [TYPE] void [PARAMETER] int gid [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  mode  uid 
[REPLACE]^return uid;^185^^^^^184^186^[REPLACE] return gid;^[METHOD] getGroupId [TYPE] int [PARAMETER] [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  mode  uid 
[REPLACE]^link =  null;^195^^^^^194^197^[REPLACE] link = name;^[METHOD] setLinkedFile [TYPE] void [PARAMETER] String name [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  mode  uid 
[REPLACE]^this.mode = getMode ( mode ) ; ;^196^^^^^194^197^[REPLACE] mode = getMode ( mode ) ;^[METHOD] setLinkedFile [TYPE] void [PARAMETER] String name [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  mode  uid 
[REPLACE]^return gid;^206^^^^^205^207^[REPLACE] return link;^[METHOD] getLinkedFile [TYPE] String [PARAMETER] [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  mode  uid 
[REPLACE]^return getLinkedFile (  ) .String (  )  != 0;^214^^^^^213^215^[REPLACE] return getLinkedFile (  ) .length (  )  != 0;^[METHOD] isLink [TYPE] boolean [PARAMETER] [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  mode  uid 
[REPLACE]^mode = getMode ( mode ) ; ;^222^^^^^221^223^[REPLACE] this.mode = getMode ( mode ) ;^[METHOD] setMode [TYPE] void [PARAMETER] int mode [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  mode  uid 
[ADD]^^222^^^^^221^223^[ADD] this.mode = getMode ( mode ) ;^[METHOD] setMode [TYPE] void [PARAMETER] int mode [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  mode  uid 
[REPLACE]^return gid;^230^^^^^229^231^[REPLACE] return mode;^[METHOD] getMode [TYPE] int [PARAMETER] [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  mode  uid 
[REPLACE]^this.dirFlag =  true;^238^^^^^237^240^[REPLACE] this.dirFlag = dirFlag;^[METHOD] setDirectory [TYPE] void [PARAMETER] boolean dirFlag [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  mode  uid 
[ADD]^^238^^^^^237^240^[ADD] this.dirFlag = dirFlag;^[METHOD] setDirectory [TYPE] void [PARAMETER] boolean dirFlag [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  mode  uid 
[REPLACE]^this.mode = getMode ( mode ) ; ;^239^^^^^237^240^[REPLACE] mode = getMode ( mode ) ;^[METHOD] setDirectory [TYPE] void [PARAMETER] boolean dirFlag [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  mode  uid 
[REPLACE]^return dirFlag || !isLink (  ) ;^247^^^^^246^248^[REPLACE] return dirFlag && !isLink (  ) ;^[METHOD] isDirectory [TYPE] boolean [PARAMETER] [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  mode  uid 
[REPLACE]^long givenChecksum = ZipLong.getValue ( linkArray, offset ) ;^260^^^^^258^288^[REPLACE] long givenChecksum = ZipLong.getValue ( data, offset ) ;^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^byte[] tmp = new byte[length (  )  - WORD];^261^^^^^258^288^[REPLACE] byte[] tmp = new byte[length - WORD];^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^System.arraycopy ( data, offset + WORD, tmp, 0, length - 1 - WORD ) ;^262^^^^^258^288^[REPLACE] System.arraycopy ( data, offset + WORD, tmp, 0, length - WORD ) ;^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^crc.CRC32 (  ) ;^263^^^^^258^288^[REPLACE] crc.reset (  ) ;^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REMOVE]^crc.update ( data ) ;^263^^^^^258^288^[REMOVE] ^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^uid = ZipShort.getValue ( tmp, 6 ) ;^264^^^^^258^288^[REPLACE] crc.update ( tmp ) ;^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^long realChecksum = crc.reset (  ) ;^265^^^^^258^288^[REPLACE] long realChecksum = crc.getValue (  ) ;^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^if  ( givenChecksum  ==  realChecksum )  {^266^^^^^258^288^[REPLACE] if  ( givenChecksum != realChecksum )  {^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^throw new ZipException ( "bad CRC checksum " + Long.toHexString ( givenChecksum ) ;^267^268^269^270^^258^288^[REPLACE] throw new ZipException ( "bad CRC checksum " + Long.toHexString ( givenChecksum ) + " instead of " + Long.toHexString ( realChecksum )  ) ;^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^+ Long.toHexString ( realChecksum ) + " instead of " + Long.toHexString ( realChecksum )  ) ;^268^269^270^^^258^288^[REPLACE] + Long.toHexString ( givenChecksum ) + " instead of " + Long.toHexString ( realChecksum )  ) ;^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^+ Long.toHexString ( givenChecksum )  ) ;^270^^^^^258^288^[REPLACE] + Long.toHexString ( realChecksum )  ) ;^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[ADD]^^270^^^^^258^288^[ADD] + Long.toHexString ( realChecksum )  ) ;^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^int newMode = ZipShort.getValue ( tmp, 4 ) ;^273^^^^^258^288^[REPLACE] int newMode = ZipShort.getValue ( tmp, 0 ) ;^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[ADD]^^273^^^^^258^288^[ADD] int newMode = ZipShort.getValue ( tmp, 0 ) ;^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^byte[] linkArray = new byte[ ( int )  ZipLong.getValue ( tmp, 2 + 1 ) ];^275^^^^^258^288^[REPLACE] byte[] linkArray = new byte[ ( int )  ZipLong.getValue ( tmp, 2 ) ];^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^uid = ZipShort.getValue ( tmp, 4 ) ;^276^^^^^258^288^[REPLACE] uid = ZipShort.getValue ( tmp, 6 ) ;^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[ADD]^^276^^^^^258^288^[ADD] uid = ZipShort.getValue ( tmp, 6 ) ;^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^gid = ZipShort.getValue ( tmp, 3 ) ;^277^^^^^258^288^[REPLACE] gid = ZipShort.getValue ( tmp, 8 ) ;^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^if  ( linkArray.length *  2 == 0 )  {^279^^^^^258^288^[REPLACE] if  ( linkArray.length == 0 )  {^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[ADD]^link = "";System.arraycopy ( tmp, 10, linkArray, 0, linkArray.length ) ;link = new String ( linkArray ) ;^279^280^281^282^283^258^288^[ADD] if  ( linkArray.length == 0 )  { link = ""; } else { System.arraycopy ( tmp, 10, linkArray, 0, linkArray.length ) ; link = new String ( linkArray ) ;^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^link =  new String ( data ) ;^283^^^^^279^284^[REPLACE] link = new String ( linkArray ) ;^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^link  =  link ;^280^^^^^258^288^[REPLACE] link = "";^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^link  = null ;^280^^^^^258^288^[REPLACE] link = "";^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^link =  new String ( data ) ;^283^^^^^258^288^[REPLACE] link = new String ( linkArray ) ;^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^setDirectory (  ( newMode & DIR_FLAG )   ==  0 ) ;^286^^^^^258^288^[REPLACE] setDirectory (  ( newMode & DIR_FLAG )  != 0 ) ;^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^setMode ( uid ) ;^287^^^^^258^288^[REPLACE] setMode ( newMode ) ;^[METHOD] parseFromLocalFileData [TYPE] void [PARAMETER] byte[] data int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] data  linkArray  tmp  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid  [TYPE]  long givenChecksum  realChecksum 
[REPLACE]^parseFromLocalFileData ( buffer, mode, length ) ;^297^^^^^294^298^[REPLACE] parseFromLocalFileData ( buffer, offset, length ) ;^[METHOD] parseFromCentralDirectoryData [TYPE] void [PARAMETER] byte[] buffer int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] buffer  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid 
[ADD]^^297^^^^^294^298^[ADD] parseFromLocalFileData ( buffer, offset, length ) ;^[METHOD] parseFromCentralDirectoryData [TYPE] void [PARAMETER] byte[] buffer int offset int length [CLASS] AsiExtraField   [TYPE]  byte[] buffer  [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  length  mode  newMode  offset  uid 
[REPLACE]^byte[] data = new byte[getLocalFileDataLength (  ) .getValue (  )  - WORD];^306^^^^^305^313^[REPLACE] int type = FILE_FLAG;^[METHOD] getMode [TYPE] int [PARAMETER] int mode [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  length  mode  newMode  offset  type  uid 
[REPLACE]^if  ( givenChecksum != realChecksum )  {^307^^^^^305^313^[REPLACE] if  ( isLink (  )  )  {^[METHOD] getMode [TYPE] int [PARAMETER] int mode [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  length  mode  newMode  offset  type  uid 
[REPLACE]^}  if  ( isDirectory (  )  )  {^309^^^^^305^313^[REPLACE] } else if  ( isDirectory (  )  )  {^[METHOD] getMode [TYPE] int [PARAMETER] int mode [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  length  mode  newMode  offset  type  uid 
[REMOVE]^if  ( isLink (  )  )  {     type = LINK_FLAG; }else     if  ( isDirectory (  )  )  {         type = DIR_FLAG;     }^309^^^^^305^313^[REMOVE] ^[METHOD] getMode [TYPE] int [PARAMETER] int mode [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  length  mode  newMode  offset  type  uid 
[REPLACE]^type = LINK_FLAG; ;^310^^^^^305^313^[REPLACE] type = DIR_FLAG;^[METHOD] getMode [TYPE] int [PARAMETER] int mode [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  length  mode  newMode  offset  type  uid 
[ADD]^^310^^^^^305^313^[ADD] type = DIR_FLAG;^[METHOD] getMode [TYPE] int [PARAMETER] int mode [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  length  mode  newMode  offset  type  uid 
[REPLACE]^type = DIR_FLAG; ;^308^^^^^305^313^[REPLACE] type = LINK_FLAG;^[METHOD] getMode [TYPE] int [PARAMETER] int mode [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  length  mode  newMode  offset  type  uid 
[ADD]^^308^^^^^305^313^[ADD] type = LINK_FLAG;^[METHOD] getMode [TYPE] int [PARAMETER] int mode [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  length  mode  newMode  offset  type  uid 
[ADD]^}   type = DIR_FLAG;^309^310^311^^^305^313^[ADD] else if  ( isDirectory (  )  )  { type = DIR_FLAG; }^[METHOD] getMode [TYPE] int [PARAMETER] int mode [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  length  mode  newMode  offset  type  uid 
[REPLACE]^return offset &  ( mode & PERM_MASK ) ;^312^^^^^305^313^[REPLACE] return type |  ( mode & PERM_MASK ) ;^[METHOD] getMode [TYPE] int [PARAMETER] int mode [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  String link  name  [TYPE]  CRC32 crc  [TYPE]  int WORD  gid  length  mode  newMode  offset  type  uid 
[ADD]^AsiExtraField cloned =  ( AsiExtraField )  super.clone (  ) ;cloned.crc = new CRC32 (  ) ;return cloned;^316^317^318^319^320^315^324^[ADD] try { AsiExtraField cloned =  ( AsiExtraField )  super.clone (  ) ; cloned.crc = new CRC32 (  ) ; return cloned; } catch  ( CloneNotSupportedException cnfe )  {^[METHOD] clone [TYPE] Object [PARAMETER] [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  type  uid  [TYPE]  AsiExtraField cloned  [TYPE]  CloneNotSupportedException cnfe 
[REPLACE]^cloned.crc =  new CRC32 (  ) ;^318^^^^^315^324^[REPLACE] cloned.crc = new CRC32 (  ) ;^[METHOD] clone [TYPE] Object [PARAMETER] [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  type  uid  [TYPE]  AsiExtraField cloned  [TYPE]  CloneNotSupportedException cnfe 
[REPLACE]^return gid;^319^^^^^315^324^[REPLACE] return cloned;^[METHOD] clone [TYPE] Object [PARAMETER] [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  type  uid  [TYPE]  AsiExtraField cloned  [TYPE]  CloneNotSupportedException cnfe 
[REPLACE]^AsiExtraField cloned =  ( AsiExtraField )  super .clone (  )  ;^317^^^^^315^324^[REPLACE] AsiExtraField cloned =  ( AsiExtraField )  super.clone (  ) ;^[METHOD] clone [TYPE] Object [PARAMETER] [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  type  uid  [TYPE]  AsiExtraField cloned  [TYPE]  CloneNotSupportedException cnfe 
[REPLACE]^AsiExtraField.Objectd =  ( AsiExtraField )  super.clone (  ) ;^317^^^^^315^324^[REPLACE] AsiExtraField cloned =  ( AsiExtraField )  super.clone (  ) ;^[METHOD] clone [TYPE] Object [PARAMETER] [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  type  uid  [TYPE]  AsiExtraField cloned  [TYPE]  CloneNotSupportedException cnfe 
[ADD]^^317^^^^^315^324^[ADD] AsiExtraField cloned =  ( AsiExtraField )  super.clone (  ) ;^[METHOD] clone [TYPE] Object [PARAMETER] [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  type  uid  [TYPE]  AsiExtraField cloned  [TYPE]  CloneNotSupportedException cnfe 
[REPLACE]^return ;^322^^^^^315^324^[REPLACE] throw new RuntimeException  (" ")  ;^[METHOD] clone [TYPE] Object [PARAMETER] [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  type  uid  [TYPE]  AsiExtraField cloned  [TYPE]  CloneNotSupportedException cnfe 
[ADD]^^320^321^322^^^315^324^[ADD] catch  ( CloneNotSupportedException cnfe )  {  throw new RuntimeException  (" ")  ;^[METHOD] clone [TYPE] Object [PARAMETER] [CLASS] AsiExtraField   [TYPE]  ZipShort HEADER_ID  [TYPE]  boolean dirFlag  false  true  [TYPE]  CRC32 crc  [TYPE]  String link  name  [TYPE]  int WORD  gid  length  mode  newMode  offset  type  uid  [TYPE]  AsiExtraField cloned  [TYPE]  CloneNotSupportedException cnfe 
