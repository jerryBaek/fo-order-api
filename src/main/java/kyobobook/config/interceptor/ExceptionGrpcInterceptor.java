/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com      2021. 9. 8.
 *
 ****************************************************/
package kyobobook.config.interceptor;

import io.grpc.ForwardingServerCallListener;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCall.Listener;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.Status;

/**
 * @Project     : fo-order-api
 * @FileName    : ExceptionGrpcInterceptor.java
 * @Date        : 2021. 9. 8.
 * @author      : smlee1@kyobobook.com
 * @description :
 */
public class ExceptionGrpcInterceptor implements ServerInterceptor {

    @Override
    public <ReqT, RespT> Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call
            , Metadata headers
            , ServerCallHandler<ReqT, RespT> next) {
        
        ServerCall.Listener<ReqT> listener = next.startCall(call, headers);
        return new ExceptionHandlingServerCallListener<>(listener, call, headers);
    }
    
    private class ExceptionHandlingServerCallListener<ReqT, RespT> extends ForwardingServerCallListener.SimpleForwardingServerCallListener<ReqT> {
        private ServerCall<ReqT, RespT> serverCall;
        private Metadata metadata;
    
        ExceptionHandlingServerCallListener(ServerCall.Listener<ReqT> listener
                , ServerCall<ReqT, RespT> serverCall
                , Metadata metadata) {
            super(listener);
            this.serverCall = serverCall;
            this.metadata = metadata;
        }
    
        @Override
        public void onHalfClose() {
            try {
                super.onHalfClose();
            } catch (RuntimeException ex) {
                handleException(ex, serverCall, metadata);
                throw ex;
            }
        }
    
        @Override
        public void onReady() {
            try {
                super.onReady();
            } catch (RuntimeException ex) {
                handleException(ex, serverCall, metadata);
                throw ex;
            }
        }
    
        private void handleException(RuntimeException exception, ServerCall<ReqT, RespT> serverCall, Metadata metadata) {
            if (exception instanceof IllegalArgumentException) {
                serverCall.close(Status.INVALID_ARGUMENT.withDescription(exception.getMessage()), metadata);
            } else {
                serverCall.close(Status.INTERNAL
                        .withCause(exception)
                        .withDescription(exception.getMessage()), metadata);
            }
        }
    }

}
