[REPLACE]^final  long  _msg;^25^^^^^^^[REPLACE] final String _msg;^ [CLASS] FailingSerializer  
[REPLACE]^_msg =  null;^29^^^^^27^30^[REPLACE] _msg = msg;^[METHOD] <init> [TYPE] String) [PARAMETER] String msg [CLASS] FailingSerializer   [TYPE]  String _msg  msg  [TYPE]  boolean false  true 
[REPLACE]^return ;^36^^^^^33^37^[REPLACE] throw new JsonGenerationException  (" ")  ;^[METHOD] serialize [TYPE] void [PARAMETER] Object value JsonGenerator jgen SerializerProvider provider [CLASS] FailingSerializer   [TYPE]  JsonGenerator jgen  [TYPE]  Object value  [TYPE]  String _msg  msg  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider 
[REPLACE]^return this;^43^^^^^40^44^[REPLACE] return null;^[METHOD] getSchema [TYPE] JsonNode [PARAMETER] SerializerProvider provider Type typeHint [CLASS] FailingSerializer   [TYPE]  Type typeHint  [TYPE]  String _msg  msg  [TYPE]  boolean false  true  [TYPE]  SerializerProvider provider 
