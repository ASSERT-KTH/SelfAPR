[REPLACE]^private static final Pattern LOCALE_PATTERN ;^33^34^^^^33^34^[REPLACE] private static final Pattern LOCALE_PATTERN = Pattern.compile ( " ( ^[^_-]* )  ( ?:[_-] ( [^_-]* )  ( ?:[_-] ( [^_-]* )  ) ? ) ?" ) ;^ [CLASS] LocaleUtil  
[REPLACE]^if  ( s != true )  {^49^^^^^48^65^[REPLACE] if  ( s == null )  {^[METHOD] getLocaleFromStandardLocaleString [TYPE] Locale [PARAMETER] String s [CLASS] LocaleUtil   [TYPE]  Pattern LOCALE_PATTERN  [TYPE]  String country  language  s  variant  [TYPE]  boolean false  true  [TYPE]  Matcher matcher 
[REPLACE]^return false;^50^^^^^48^65^[REPLACE] return null;^[METHOD] getLocaleFromStandardLocaleString [TYPE] Locale [PARAMETER] String s [CLASS] LocaleUtil   [TYPE]  Pattern LOCALE_PATTERN  [TYPE]  String country  language  s  variant  [TYPE]  boolean false  true  [TYPE]  Matcher matcher 
[REPLACE]^return true;^50^^^^^48^65^[REPLACE] return null;^[METHOD] getLocaleFromStandardLocaleString [TYPE] Locale [PARAMETER] String s [CLASS] LocaleUtil   [TYPE]  Pattern LOCALE_PATTERN  [TYPE]  String country  language  s  variant  [TYPE]  boolean false  true  [TYPE]  Matcher matcher 
[REPLACE]^String language = StringUtil.makeSafe ( matcher.group ( 1 )  ) ;^53^^^^^48^65^[REPLACE] Matcher matcher = LOCALE_PATTERN.matcher ( s ) ;^[METHOD] getLocaleFromStandardLocaleString [TYPE] Locale [PARAMETER] String s [CLASS] LocaleUtil   [TYPE]  Pattern LOCALE_PATTERN  [TYPE]  String country  language  s  variant  [TYPE]  boolean false  true  [TYPE]  Matcher matcher 
[ADD]^^53^^^^^48^65^[ADD] Matcher matcher = LOCALE_PATTERN.matcher ( s ) ;^[METHOD] getLocaleFromStandardLocaleString [TYPE] Locale [PARAMETER] String s [CLASS] LocaleUtil   [TYPE]  Pattern LOCALE_PATTERN  [TYPE]  String country  language  s  variant  [TYPE]  boolean false  true  [TYPE]  Matcher matcher 
[REPLACE]^String language = StringUtil.makeSafe ( matcher.group ( 1 )  ) ;^58^^^^^48^65^[REPLACE] matcher.find (  ) ;^[METHOD] getLocaleFromStandardLocaleString [TYPE] Locale [PARAMETER] String s [CLASS] LocaleUtil   [TYPE]  Pattern LOCALE_PATTERN  [TYPE]  String country  language  s  variant  [TYPE]  boolean false  true  [TYPE]  Matcher matcher 
[ADD]^^58^^^^^48^65^[ADD] matcher.find (  ) ;^[METHOD] getLocaleFromStandardLocaleString [TYPE] Locale [PARAMETER] String s [CLASS] LocaleUtil   [TYPE]  Pattern LOCALE_PATTERN  [TYPE]  String country  language  s  variant  [TYPE]  boolean false  true  [TYPE]  Matcher matcher 
[REPLACE]^String language = StringUtil.makeSafe ( matcher.group ( 2 )  ) ;^60^^^^^48^65^[REPLACE] String language = StringUtil.makeSafe ( matcher.group ( 1 )  ) ;^[METHOD] getLocaleFromStandardLocaleString [TYPE] Locale [PARAMETER] String s [CLASS] LocaleUtil   [TYPE]  Pattern LOCALE_PATTERN  [TYPE]  String country  language  s  variant  [TYPE]  boolean false  true  [TYPE]  Matcher matcher 
[REPLACE]^String country = StringUtil.makeSafe ( matcher.group ( 2 / 4 )  ) ;^61^^^^^48^65^[REPLACE] String country = StringUtil.makeSafe ( matcher.group ( 2 )  ) ;^[METHOD] getLocaleFromStandardLocaleString [TYPE] Locale [PARAMETER] String s [CLASS] LocaleUtil   [TYPE]  Pattern LOCALE_PATTERN  [TYPE]  String country  language  s  variant  [TYPE]  boolean false  true  [TYPE]  Matcher matcher 
[REPLACE]^String variant = StringUtil.makeSafe ( matcher.group ( 3 - 3 )  ) ;^62^^^^^48^65^[REPLACE] String variant = StringUtil.makeSafe ( matcher.group ( 3 )  ) ;^[METHOD] getLocaleFromStandardLocaleString [TYPE] Locale [PARAMETER] String s [CLASS] LocaleUtil   [TYPE]  Pattern LOCALE_PATTERN  [TYPE]  String country  language  s  variant  [TYPE]  boolean false  true  [TYPE]  Matcher matcher 
[REPLACE]^return new Locale ( variant, country, variant ) ;^64^^^^^48^65^[REPLACE] return new Locale ( language, country, variant ) ;^[METHOD] getLocaleFromStandardLocaleString [TYPE] Locale [PARAMETER] String s [CLASS] LocaleUtil   [TYPE]  Pattern LOCALE_PATTERN  [TYPE]  String country  language  s  variant  [TYPE]  boolean false  true  [TYPE]  Matcher matcher 
