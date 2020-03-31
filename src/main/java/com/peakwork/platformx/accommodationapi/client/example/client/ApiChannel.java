package com.peakwork.platformx.accommodationapi.client.example.client;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ClientInterceptors;
import io.grpc.ForwardingClientCall;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiChannel {


    private static final Logger logger = LoggerFactory.getLogger(ApiChannel.class);
    private final Channel securedChannel;
    private final ManagedChannel channel;


    public ApiChannel(String url, String apikey) {
        channel = ManagedChannelBuilder.forTarget(url)
                .usePlaintext()
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .build();

        //create sevice clients  with apikey
        securedChannel = ClientInterceptors.intercept(channel, new Interceptor(apikey));
    }

    public void closeConnections() {
        channel.shutdown();
        logger.info("Channel closed");
    }

    public Channel getSecuredChannel() {
        return securedChannel;
    }


    private final class Interceptor implements ClientInterceptor {

        private final Metadata.Key<String> API_KEY_HEADER =
                Metadata.Key.of("x-api-key", Metadata.ASCII_STRING_MARSHALLER);
        private final String apiKey;

        private Interceptor(String apiKey) {
            this.apiKey = apiKey;
        }

        @Override
        public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(
                MethodDescriptor<ReqT, RespT> method, CallOptions callOptions, Channel next) {
            ClientCall<ReqT, RespT> call = next.newCall(method, callOptions);

            call = new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(call) {
                @Override
                public void start(Listener<RespT> responseListener, Metadata headers) {
                    if (apiKey != null && !apiKey.isEmpty()) {
                        headers.put(API_KEY_HEADER, apiKey);
                    }
                    super.start(responseListener, headers);
                }
            };
            return call;
        }
    }

}
