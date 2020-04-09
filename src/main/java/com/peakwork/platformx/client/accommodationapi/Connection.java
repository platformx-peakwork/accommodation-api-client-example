package com.peakwork.platformx.client.accommodationapi;

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


/**
 * Holds the connection to grpc service
 */
public class Connection implements AutoCloseable {

    private static final Logger logger = LoggerFactory.getLogger(Connection.class);
    private final Channel channel;
    private final ManagedChannel managedChannel;

    public Connection(String url, String apikey) {
        managedChannel = ManagedChannelBuilder.forTarget(url)
                //unsecured managedChannel used only for testing purposes
                .usePlaintext()
                .build();

        //provide api key via call interceptor
        channel = ClientInterceptors.intercept(managedChannel, new AuthorizationMetaAppender(apikey));
    }

    public void close() {
        managedChannel.shutdown();
        logger.info("Channel closed");
    }

    public Channel getChannel() {
        return channel;
    }

    /**
     * Appends api key as a metadata to each call
     */
    private final class AuthorizationMetaAppender implements ClientInterceptor {

        private final Metadata.Key<String> API_KEY_HEADER =
                Metadata.Key.of("x-api-key", Metadata.ASCII_STRING_MARSHALLER);
        private final String apiKey;

        private AuthorizationMetaAppender(String apiKey) {
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
