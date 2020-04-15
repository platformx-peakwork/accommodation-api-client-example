# Accommodation API Client Example

This example is aimed to provide basic client implementation 
for the developers when they integrate 
the supplier's system with the Accommodation API.

The Peakwork Accommodation API is used by accommodation suppliers like 
bed banks or hotel chains to provide their accommodation portfolio to 
the Peakwork network for distribution to partner companies like tour operators.

The application covers an example implementation of how to send base and
offer data to the Accommodation API. The scope is narrowed down to send 
base data consisting of a single accommodation, room, board and rate as 
well as offer data for that accommodation-room-board-rate combination 
consisting of offers for "tomorrow" and "the day after tomorrow" with 
lengths of stay 1 and 2 each. In order to keep the example simple and 
focused to effectively provide a high level API overview, the offer data 
contains a simplified 'stay' and 'object' price structure. For more 
complex cases involving daily prices as well as person prices, see the 
Accommodation API documentation.


# API Notes

## gRPC/Protobuf 
The Accommodation API, both the payload entities and a services, is defined in 
language-neutral, platform-neutral way using Protobuf, see [here](./src/main/proto/accommodation-api.proto). For more 
information on gRPC/Protobuf see the section Links, also see 
'gRPC Java Generation section'.


## Error Handling

Every call returns a google.rpc.Status message, which is also compatible 
with HTTP response codes. See Protobuf documentation for more information.
[`google.rpc.Status`](./src/main/proto/google/rpc/status.proto)

## Data Consistency
 
Any single API call of a certain type (upsertRoom, upsertBoard...) can be 
performed in arbitrary order in relation to any single one of other type. 
Calls have 'update or insert' semantics, for example an 'upsertRoom' call will 
either create a new room entity with the given room identifier, if it 
does not yet exist (i.e. has not been created by a previous 'upsertRoom' 
call). Or it will override the currently persisted room entity with the 
given 'roomIdentifier' in case it has already been created via a 
previous call to 'upsertRoom'.

# Notes on Implementation

## Technology 

* Java
* Maven

## gRPC Java Generation

gRPC uses the 'protoc' compiler with a special gRPC plugin to generate 
code from proto file. As a result, we get generated gRPC client and server code along 
with data access objects for an any preferred language(s).

To learn more about protocol buffers, including how to install protoc with 
the gRPC plugin in your chosen language, see the Links section.

For the generation of a Java gRPC client classes, actual implementation 
uses Protobuf Maven Plugin, see the Links section.

 

# How to Run ?

Prerequisites:
* JDK
* Maven


Parameters:
* URL - url of accommodation api service
* API_KEY - secret key to access accommodation api service

```bash
mvn clean compile exec:java -Dexec.args="$URL $API_KEY"
```


# Links

[DRV Global Types](https://globaltypecenter.de/index.php?language=en) - GlobalType Center

[Google gRPC](https://grpc.io) - A high-performance, open source universal RPC framework

[Protocol Buffers](https://developers.google.com/protocol-buffers/docs/overview) - Potocol Buffers. Developer Guide

[Protobuf Maven Plugin](https://github.com/xolstice/protobuf-maven-plugin) - Plugin that executes the Protocol Buffers (protoc) compiler
