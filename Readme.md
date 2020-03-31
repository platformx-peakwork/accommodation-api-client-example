
# px-accommodation-api

## Descriptions
Contains server part that receives accommodation requests validates them and stores to pubsub queue 

implementaiton of gRPC server, build over `accommodation-api.proto` definition, performs following actions

* validates incoming messages
* stores messages into pubusub topic

## Dependencies
* `accommodation-api.proto` definition, see https://bitbucket.peakwork.lan/projects/PX/repos/px-accommodation-api-proto/browse


## Kubernetes Cluster Preconditions:
* Deployment requires two secrets to be available in kubernetes cluster:   
    * `pubsub-key`  - requierd to access google cloud services
    * `peakwork-registry-credentials` - required to access peakwork docker registry

    see  "deployEverything.sh" for examples how to create the secrets 
   

## Kubernetes deployment
* `basedata-ingress.yaml` - contains the kubernetes ingress and TLS (cert-manager) configuration 
* `basedata-service-kube-deployment.yaml` - contains kubernetes deployment configuration for server along with  `esp service proxy` sidecar container
* `deployEverything.sh` -contains commands which are creating google endpoint, and deploy server and esp proxy 
* `deploy.sh` -   contain commands execuded during deployment by CI/CD platform (eg Bamboo)  



### Validation

Endpoints by default are creating mapping Rest - GRPC
But default Validation is very limited:

 * In Protobuf 3 format there are no required and optional fields, - all are optional
 * Additinally any not specified  fields/structures send in message will be ignored.
   
   Therefore each message will be by default forwarded to pubsub topic
   
   Validators needs to be writen explicitly (Optionally: https://github.com/envoyproxy/protoc-gen-validate  - thirdparty extension for protobuff - validation) 
)
      
      
  **In this project validation and errorHandling is implemented according to Google API patterns, and is using universal `google.rpc.Status` object.**
   
   Because of that It is working the same defined way for HTTP/REST and gRPC protocols.
   gRPC status codes are automatically mapped REST http response codes.
   
   In case that standard  `google.rpc.Status` will not be sufficient, we can extend validation by using  `google.rpc.ErrorDetails`
  
   
   Referenced docu: 
   * https://cloud.google.com/apis/design/errors   
   * https://stackoverflow.com/questions/48748745/pattern-for-rich-error-handling-in-grpc



### Monitoring
* spring boot actuator module is used to provide full monitoring capabilities  

#### Healtcheck
* Readiness check returns "UP" when services is live and all underlying services (pubsub topic) are reachable.
 `host: 9090/ready`
 
 * Health check returns "UP" when services is up and live (no additional checks like db availibility are performed)
  `host: 9090/health`
 
* Info returns 200 ok, and additional basic info about the service if app is up (no Healthcheck is performed )
  `host: 9090/info`
 
#### Prometheus endpoint:
* Observability and status of the server is provided in prometheus format and available under
     `host: 9090/metrics` 
     