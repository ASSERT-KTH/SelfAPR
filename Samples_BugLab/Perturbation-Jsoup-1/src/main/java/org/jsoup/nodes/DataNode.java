[buglab_swap_variables]^attributes.put ( data, DATA_KEY ) ;^19^^^^^17^20^attributes.put ( DATA_KEY, data ) ;^[CLASS] DataNode  [METHOD] <init> [RETURN_TYPE] String)   String data String baseUri [VARIABLES] String  DATA_KEY  baseUri  data  boolean  
[buglab_swap_variables]^attributes.put ( DATA_KEY ) ;^19^^^^^17^20^attributes.put ( DATA_KEY, data ) ;^[CLASS] DataNode  [METHOD] <init> [RETURN_TYPE] String)   String data String baseUri [VARIABLES] String  DATA_KEY  baseUri  data  boolean  
[buglab_swap_variables]^attributes.put (  data ) ;^19^^^^^17^20^attributes.put ( DATA_KEY, data ) ;^[CLASS] DataNode  [METHOD] <init> [RETURN_TYPE] String)   String data String baseUri [VARIABLES] String  DATA_KEY  baseUri  data  boolean  
[buglab_swap_variables]^return DATA_KEY.get ( attributes ) ;^31^^^^^30^32^return attributes.get ( DATA_KEY ) ;^[CLASS] DataNode  [METHOD] getWholeData [RETURN_TYPE] String   [VARIABLES] String  DATA_KEY  baseUri  data  boolean  
[buglab_swap_variables]^return new DataNode ( baseUri, data ) ;^50^^^^^48^51^return new DataNode ( data, baseUri ) ;^[CLASS] DataNode  [METHOD] createFromEncoded [RETURN_TYPE] DataNode   String encodedData String baseUri [VARIABLES] String  DATA_KEY  baseUri  data  encodedData  boolean  
[buglab_swap_variables]^return new DataNode (  baseUri ) ;^50^^^^^48^51^return new DataNode ( data, baseUri ) ;^[CLASS] DataNode  [METHOD] createFromEncoded [RETURN_TYPE] DataNode   String encodedData String baseUri [VARIABLES] String  DATA_KEY  baseUri  data  encodedData  boolean  
[buglab_swap_variables]^return new DataNode ( data ) ;^50^^^^^48^51^return new DataNode ( data, baseUri ) ;^[CLASS] DataNode  [METHOD] createFromEncoded [RETURN_TYPE] DataNode   String encodedData String baseUri [VARIABLES] String  DATA_KEY  baseUri  data  encodedData  boolean  
