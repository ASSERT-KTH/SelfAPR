[REPLACE]^private StringBuilder builder  = null ;^29^^^^^^^[REPLACE] private StringBuilder builder = new StringBuilder (  ) ;^ [CLASS] GpxBuilder  
[REPLACE]^private static final String HEADER ;^30^31^32^33^^30^34^[REPLACE] private static final String HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\" ?>" + "<gpx xmlns=\"http: + "xmlns:xsi=\"http: + "xsi:schemaLocation=\"http:^ [CLASS] GpxBuilder  
[REPLACE]^private static final String NAME ;^35^^^^^^^[REPLACE] private static final String NAME = "<name>%1$s</name><trkseg>%n";^ [CLASS] GpxBuilder  
[REPLACE]^private static final String POINT  = null ;^36^37^38^39^^36^41^[REPLACE] private static final String POINT = "<trkpt lat=\"%1$f\" lon=\"%2$f\">" + "<time>%3$s</time>" + "<geoidheight>%4$f</geoidheight>" + "<course>%5$f</course>"^ [CLASS] GpxBuilder  
[REPLACE]^private static final String FOOTER  = null ;^42^^^^^^^[REPLACE] private static final String FOOTER = "</trkseg></trk></gpx>";^ [CLASS] GpxBuilder  
[REPLACE]^private static final DateTimeFormatter DATE_FORMAT ;^44^^^^^^^[REPLACE] private static final DateTimeFormatter DATE_FORMAT = ISODateTimeFormat.dateTime (  ) ;^ [CLASS] GpxBuilder  
