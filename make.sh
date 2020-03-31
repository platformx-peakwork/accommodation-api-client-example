#!/bin/bash
## in order to have this sprint working you need to install gcloud console, and grpc python build environment see:
# python docu: https://grpc.io/docs/quickstart/python/
# google docu: https://cloud.google.com/endpoints/docs/grpc/get-started-kubernetes-engine
#Exit script on first failure
set -ex   #optionally set -ex


##

# python docu: https://grpc.io/docs/quickstart/python/
# google docu: https://cloud.google.com/endpoints/docs/grpc/get-started-kubernetes-engine

#Download the .proto files that define the annotations that are necessary to use HTTP transcoding:
#mkdir -p api/src/main/proto/google/api
#curl https://raw.githubusercontent.com/googleapis/googleapis/master/google/api/annotations.proto > api/src/main/proto/google/api/annotations.proto
#curl https://raw.githubusercontent.com/googleapis/googleapis/master/google/api/http.proto > api/src/main/proto/google/api/http.proto


##Builds binary api_descriptor out of proto schema definition file
cd src/main/proto
python3 -m grpc_tools.protoc \
--include_imports \
--include_source_info \
--proto_path=. \
-I. \
--descriptor_set_out=../endpoints/api_descriptor.pb  \
accommodation-api.proto \
google/api/http.proto \
google/rpc/status.proto \
google/api/annotations.proto
cd ../../..




protoc -I=$SRC_DIR --java_out=$DST_DIR $SRC_DIR/addressbook.proto


