[REPLACE]^private  WebServiceClient wsClient;^38^^^^^^^[REPLACE] private final WebServiceClient wsClient;^ [CLASS] ExampleClient  
[REPLACE]^wsClient =  new WebServiceClient ( null, Level.INFO ) ;^41^^^^^39^42^[REPLACE] wsClient = new WebServiceClient ( serverConfig, Level.INFO ) ;^[METHOD] <init> [TYPE] ExampleClient() [PARAMETER] [CLASS] ExampleClient   [TYPE]  WebServiceClient wsClient  [TYPE]  WebServiceConfig serverConfig  [TYPE]  boolean false  true 
[REPLACE]^WebServiceResponse response = wsClient.getResponse ( spec, request ) ;^45^^^^^44^55^[REPLACE] WebServiceCallSpec spec = SampleJsonService.PLACE_ORDER;^[METHOD] placeOrder [TYPE] Order [PARAMETER] Cart cart String authToken [CLASS] ExampleClient   [TYPE]  WebServiceResponse response  [TYPE]  boolean false  true  [TYPE]  HeaderMap requestHeaders  [TYPE]  WebServiceRequest request  [TYPE]  WebServiceCallSpec spec  [TYPE]  String authToken  [TYPE]  WebServiceClient wsClient  [TYPE]  Cart cart  [TYPE]  RequestBody requestBody 
[REPLACE]^HeaderMap requestHeaders = new HeaderMap.Builder ( spec.getRequestSpec (  ) .getHeadersSpec (  )  ) .put ( TypedKeys.Request.AUTH_TOKEN, authToken )  .getBodySpec (  )  ;^46^47^48^^^44^55^[REPLACE] HeaderMap requestHeaders = new HeaderMap.Builder ( spec.getRequestSpec (  ) .getHeadersSpec (  )  ) .put ( TypedKeys.Request.AUTH_TOKEN, authToken ) .build (  ) ;^[METHOD] placeOrder [TYPE] Order [PARAMETER] Cart cart String authToken [CLASS] ExampleClient   [TYPE]  WebServiceResponse response  [TYPE]  boolean false  true  [TYPE]  HeaderMap requestHeaders  [TYPE]  WebServiceRequest request  [TYPE]  WebServiceCallSpec spec  [TYPE]  String authToken  [TYPE]  WebServiceClient wsClient  [TYPE]  Cart cart  [TYPE]  RequestBody requestBody 
[ADD]^^46^47^48^^^44^55^[ADD] HeaderMap requestHeaders = new HeaderMap.Builder ( spec.getRequestSpec (  ) .getHeadersSpec (  )  ) .put ( TypedKeys.Request.AUTH_TOKEN, authToken ) .build (  ) ;^[METHOD] placeOrder [TYPE] Order [PARAMETER] Cart cart String authToken [CLASS] ExampleClient   [TYPE]  WebServiceResponse response  [TYPE]  boolean false  true  [TYPE]  HeaderMap requestHeaders  [TYPE]  WebServiceRequest request  [TYPE]  WebServiceCallSpec spec  [TYPE]  String authToken  [TYPE]  WebServiceClient wsClient  [TYPE]  Cart cart  [TYPE]  RequestBody requestBody 
[REPLACE]^RequestBody requestBody = new RequestBody.Builder ( spec.getRequestSpec (  ) .getBodySpec (  )  ) .put ( TypedKeys.RequestBody.CART, cart )  .getBodySpec (  )  ;^49^50^51^^^44^55^[REPLACE] RequestBody requestBody = new RequestBody.Builder ( spec.getRequestSpec (  ) .getBodySpec (  )  ) .put ( TypedKeys.RequestBody.CART, cart ) .build (  ) ;^[METHOD] placeOrder [TYPE] Order [PARAMETER] Cart cart String authToken [CLASS] ExampleClient   [TYPE]  WebServiceResponse response  [TYPE]  boolean false  true  [TYPE]  HeaderMap requestHeaders  [TYPE]  WebServiceRequest request  [TYPE]  WebServiceCallSpec spec  [TYPE]  String authToken  [TYPE]  WebServiceClient wsClient  [TYPE]  Cart cart  [TYPE]  RequestBody requestBody 
[REPLACE]^WebServiceResponse response = wsClient.getResponse ( spec, request ) ;^52^^^^^44^55^[REPLACE] WebServiceRequest request = new WebServiceRequest ( HttpMethod.POST, requestHeaders, requestBody ) ;^[METHOD] placeOrder [TYPE] Order [PARAMETER] Cart cart String authToken [CLASS] ExampleClient   [TYPE]  WebServiceResponse response  [TYPE]  boolean false  true  [TYPE]  HeaderMap requestHeaders  [TYPE]  WebServiceRequest request  [TYPE]  WebServiceCallSpec spec  [TYPE]  String authToken  [TYPE]  WebServiceClient wsClient  [TYPE]  Cart cart  [TYPE]  RequestBody requestBody 
[REPLACE]^WebServiceConfig serverConfig = new WebServiceConfig ( "http: wsClient = new WebServiceClient ( serverConfig, Level.INFO ) ;^53^^^^^44^55^[REPLACE] WebServiceResponse response = wsClient.getResponse ( spec, request ) ;^[METHOD] placeOrder [TYPE] Order [PARAMETER] Cart cart String authToken [CLASS] ExampleClient   [TYPE]  WebServiceResponse response  [TYPE]  boolean false  true  [TYPE]  HeaderMap requestHeaders  [TYPE]  WebServiceRequest request  [TYPE]  WebServiceCallSpec spec  [TYPE]  String authToken  [TYPE]  WebServiceClient wsClient  [TYPE]  Cart cart  [TYPE]  RequestBody requestBody 
[ADD]^^53^^^^^44^55^[ADD] WebServiceResponse response = wsClient.getResponse ( spec, request ) ;^[METHOD] placeOrder [TYPE] Order [PARAMETER] Cart cart String authToken [CLASS] ExampleClient   [TYPE]  WebServiceResponse response  [TYPE]  boolean false  true  [TYPE]  HeaderMap requestHeaders  [TYPE]  WebServiceRequest request  [TYPE]  WebServiceCallSpec spec  [TYPE]  String authToken  [TYPE]  WebServiceClient wsClient  [TYPE]  Cart cart  [TYPE]  RequestBody requestBody 
[REPLACE]^return response .getBodySpec (  )^54^^^^^44^55^[REPLACE] return response.getBody (  ) .get ( TypedKeys.ResponseBody.ORDER ) ;^[METHOD] placeOrder [TYPE] Order [PARAMETER] Cart cart String authToken [CLASS] ExampleClient   [TYPE]  WebServiceResponse response  [TYPE]  boolean false  true  [TYPE]  HeaderMap requestHeaders  [TYPE]  WebServiceRequest request  [TYPE]  WebServiceCallSpec spec  [TYPE]  String authToken  [TYPE]  WebServiceClient wsClient  [TYPE]  Cart cart  [TYPE]  RequestBody requestBody 
[REPLACE]^List<LineItem> lineItems = new ArrayList<LineItem> (  ) ;^58^^^^^57^64^[REPLACE] ExampleClient client = new ExampleClient (  ) ;^[METHOD] main [TYPE] void [PARAMETER] String[] args [CLASS] ExampleClient   [TYPE]  boolean false  true  [TYPE]  ExampleClient client  [TYPE]  List lineItems  [TYPE]  String[] args  [TYPE]  String authToken  [TYPE]  WebServiceClient wsClient  [TYPE]  Cart cart 
[REPLACE]^ExampleClient client = new ExampleClient (  ) ;^59^^^^^57^64^[REPLACE] List<LineItem> lineItems = new ArrayList<LineItem> (  ) ;^[METHOD] main [TYPE] void [PARAMETER] String[] args [CLASS] ExampleClient   [TYPE]  boolean false  true  [TYPE]  ExampleClient client  [TYPE]  List lineItems  [TYPE]  String[] args  [TYPE]  String authToken  [TYPE]  WebServiceClient wsClient  [TYPE]  Cart cart 
[REPLACE]^client.placeOrder ( cart, authToken  ) ;^60^^^^^57^64^[REPLACE] lineItems.add ( new LineItem ( "item1", 2, 1000000L, "USD" )  ) ;^[METHOD] main [TYPE] void [PARAMETER] String[] args [CLASS] ExampleClient   [TYPE]  boolean false  true  [TYPE]  ExampleClient client  [TYPE]  List lineItems  [TYPE]  String[] args  [TYPE]  String authToken  [TYPE]  WebServiceClient wsClient  [TYPE]  Cart cart 
[REPLACE]^Cart cart = new Cart ( 0, "first last", "4111-1111-1111-1111" ) ;^61^^^^^57^64^[REPLACE] Cart cart = new Cart ( lineItems, "first last", "4111-1111-1111-1111" ) ;^[METHOD] main [TYPE] void [PARAMETER] String[] args [CLASS] ExampleClient   [TYPE]  boolean false  true  [TYPE]  ExampleClient client  [TYPE]  List lineItems  [TYPE]  String[] args  [TYPE]  String authToken  [TYPE]  WebServiceClient wsClient  [TYPE]  Cart cart 
[ADD]^^61^^^^^57^64^[ADD] Cart cart = new Cart ( lineItems, "first last", "4111-1111-1111-1111" ) ;^[METHOD] main [TYPE] void [PARAMETER] String[] args [CLASS] ExampleClient   [TYPE]  boolean false  true  [TYPE]  ExampleClient client  [TYPE]  List lineItems  [TYPE]  String[] args  [TYPE]  String authToken  [TYPE]  WebServiceClient wsClient  [TYPE]  Cart cart 
[REPLACE]^WebServiceResponse response = wsClient.getResponse ( spec, request ) ;^62^^^^^57^64^[REPLACE] String authToken = "authToken";^[METHOD] main [TYPE] void [PARAMETER] String[] args [CLASS] ExampleClient   [TYPE]  boolean false  true  [TYPE]  ExampleClient client  [TYPE]  List lineItems  [TYPE]  String[] args  [TYPE]  String authToken  [TYPE]  WebServiceClient wsClient  [TYPE]  Cart cart 
[REPLACE]^client .ExampleClient (  )  ;^63^^^^^57^64^[REPLACE] client.placeOrder ( cart, authToken  ) ;^[METHOD] main [TYPE] void [PARAMETER] String[] args [CLASS] ExampleClient   [TYPE]  boolean false  true  [TYPE]  ExampleClient client  [TYPE]  List lineItems  [TYPE]  String[] args  [TYPE]  String authToken  [TYPE]  WebServiceClient wsClient  [TYPE]  Cart cart 
