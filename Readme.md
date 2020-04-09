# Accommodation API client example

This example client performs accommodation data upload. In order to 
perform connection to accommodation API service
The implementation uses [grpc](https://grpc.io) java service stubs generated out from protobuf 
[api definition](./src/main/proto/accommodation-api.proto). For more info
on grpc/protobuf see links.

# What example does ?

The application covers example how to send base and offer data to the api.
The scope is narrowed to send single accommodation, room, board, rate 
and offer data(also for single accommodation). In order to keep example 
simple and focused to effectively provide high level api overview, offer data 
contains only simplified 'object' price structure.

# API notes

Uniqueness of an 
entity are defined by fields containing 'identifier' suffix.

## Error handling

Every call return [`google.rpc.Status`](./src/main/proto/google/status.proto) which is also 
compatible with HTTP response codes. See proto documentation for more info.

## Data Consistency
 
Any single type of an api call(upsertRoom, upsertBoard...) can be performed in arbitrary order
in relation to any single other one. Calls have 'update or insert' semantics, 
for example, 'upsertRoom' call will issue overriding of the currently persisted 
room data for the 'roomIdentifier' or creation of new in case there was no such one. 


# Links

[DRV Global Types](https://globaltypecenter.de/index.php?language=en)

[Google GRPC](https://grpc.io)



# How to run ?

prerequisites:
* JDK
* Maven


parameters:
* URL - url of accommodation api service
* API_KEY - secret key to access accommodation api service

```bash
mvn clean compile exec:java -Dexec.args="$URL $API_KEY"
```