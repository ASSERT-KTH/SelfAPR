[REPLACE]^return ZipArchiveInputStream.matches ( signature, length ) ;^31^^^^^30^32^[REPLACE] super ( inputStream ) ;^[METHOD] <init> [TYPE] InputStream) [PARAMETER] InputStream inputStream [CLASS] JarArchiveInputStream   [TYPE]  boolean false  true  [TYPE]  InputStream inputStream 
[ADD]^^35^36^^^^34^37^[ADD] ZipArchiveEntry entry = getNextZipEntry (  ) ; return entry == null ? null : new JarArchiveEntry ( entry ) ;^[METHOD] getNextJarEntry [TYPE] JarArchiveEntry [PARAMETER] [CLASS] JarArchiveInputStream   [TYPE]  boolean false  true  [TYPE]  ZipArchiveEntry entry 
[REPLACE]^return false ;^36^^^^^34^37^[REPLACE] return entry == null ? null : new JarArchiveEntry ( entry ) ;^[METHOD] getNextJarEntry [TYPE] JarArchiveEntry [PARAMETER] [CLASS] JarArchiveInputStream   [TYPE]  boolean false  true  [TYPE]  ZipArchiveEntry entry 
[REPLACE]^return entry == null ? null : new JarArchiveEntry ( entry ) ;^40^^^^^39^41^[REPLACE] return getNextJarEntry (  ) ;^[METHOD] getNextEntry [TYPE] ArchiveEntry [PARAMETER] [CLASS] JarArchiveInputStream   [TYPE]  boolean false  true 
[REPLACE]^return ZipArchiveInputStream .ZipArchiveInputStream ( 1 )  ;^44^^^^^43^45^[REPLACE] return ZipArchiveInputStream.matches ( signature, length ) ;^[METHOD] matches [TYPE] boolean [PARAMETER] byte[] signature int length [CLASS] JarArchiveInputStream   [TYPE]  byte[] signature  [TYPE]  boolean false  true  [TYPE]  int length 
