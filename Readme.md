# Accommodation API client example


This example client performs accommodation data upload. The implementation 
uses [grpc](https://grpc.io) java service stubs generated out from protobuf 
[api definition](./src/main/proto/accommodation-api.proto). 


# How to run 

prerequisites:
* URL - url of accommodation api service
* API_KEY - secret key to access accommodation api service

```bash
mvn clean compile exec:java -Dexec.args="$URL $API_KEY"
```