[REPLACE]^private static final AnnotationFieldFilter CREATED_BY_FILTER ;^46^^^^^^^[REPLACE] private static final AnnotationFieldFilter CREATED_BY_FILTER = new AnnotationFieldFilter ( CreatedBy.class ) ;^ [CLASS] AnnotationAuditingMetadata  
[REPLACE]^private static final AnnotationFieldFilter CREATED_DATE_FILTER ;^47^^^^^^^[REPLACE] private static final AnnotationFieldFilter CREATED_DATE_FILTER = new AnnotationFieldFilter ( CreatedDate.class ) ;^ [CLASS] AnnotationAuditingMetadata  
[REPLACE]^private static final AnnotationFieldFilter LAST_MODIFIED_BY_FILTER  = null ;^48^^^^^^^[REPLACE] private static final AnnotationFieldFilter LAST_MODIFIED_BY_FILTER = new AnnotationFieldFilter ( LastModifiedBy.class ) ;^ [CLASS] AnnotationAuditingMetadata  
[REPLACE]^private static  AnnotationFieldFilter LAST_MODIFIED_DATE_FILTER = new AnnotationFieldFilter ( LastModifiedDate.class ) ;^49^50^^^^49^50^[REPLACE] private static final AnnotationFieldFilter LAST_MODIFIED_DATE_FILTER = new AnnotationFieldFilter ( LastModifiedDate.class ) ;^ [CLASS] AnnotationAuditingMetadata  
[REPLACE]^private static final Map<Class<?>, AnnotationAuditingMetadata> METADATA_CACHE  = null ;^52^^^^^^^[REPLACE] private static final Map<Class<?>, AnnotationAuditingMetadata> METADATA_CACHE = new ConcurrentHashMap<Class<?>, AnnotationAuditingMetadata> (  ) ;^ [CLASS] AnnotationAuditingMetadata  
[REPLACE]^public static  boolean IS_JDK_8 = org.springframework.util.ClassUtils.isPresent ( "java.time.Clock", AnnotationAuditingMetadata.class.getClassLoader (  )  ) ;^54^55^^^^54^55^[REPLACE] public static final boolean IS_JDK_8 = org.springframework.util.ClassUtils.isPresent ( "java.time.Clock", AnnotationAuditingMetadata.class.getClassLoader (  )  ) ;^ [CLASS] AnnotationAuditingMetadata  
[REPLACE]^static  List<String> SUPPORTED_DATE_TYPES;^57^^^^^^^[REPLACE] static final List<String> SUPPORTED_DATE_TYPES;^ [CLASS] AnnotationAuditingMetadata  
[REPLACE]^private  Field createdDateField;^72^^^^^^^[REPLACE] private final Field createdDateField;^ [CLASS] AnnotationAuditingMetadata  
[REPLACE]^private final Object lastModifiedDateField;^74^^^^^^^[REPLACE] private final Field lastModifiedDateField;^ [CLASS] AnnotationAuditingMetadata  
