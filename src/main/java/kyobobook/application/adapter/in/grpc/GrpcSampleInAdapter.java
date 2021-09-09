/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com      2021. 8. 17.
 *
 ****************************************************/
package kyobobook.application.adapter.in.grpc;

import java.util.List;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;

import io.grpc.stub.StreamObserver;
import kyobobook.application.biz.sample.port.in.SamplePort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.sample.Sample;
import kyobobook.config.interceptor.ExceptionGrpcInterceptor;
import kyobobook.grpc.sample.ResponseResult;
import kyobobook.grpc.sample.SampleFieldEntry;
import kyobobook.grpc.sample.SampleGrpc.SampleImplBase;
import kyobobook.grpc.sample.SampleRequest;
import kyobobook.grpc.sample.SampleResponse;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @Project     : common-prototype-api
 * @FileName    : GrpcSampleInAdapter.java
 * @Date        : 2021. 8. 17.
 * @author      : smlee1@kyobobook.com
 * @description : gRPC 요청을 수신하는 Adapter
 *                common-prototype-api 에서 gRPC 통신을 위한 Adapter
 *                request.getReqType() 이 SampleRequest.ReqType.MASTER 또는 SampleRequest.ReqType.SLAVE 
 *                일 경우는 현재 서비스의 데이터 베이스 처리
 *                request.getReqType() 이 SampleRequest.ReqType.SUB 일 경우는 common-prototype-sub-api 와 gRPC 통신을 통해 처리한다.
 *                
 */
@GrpcService(interceptors = ExceptionGrpcInterceptor.class)
public class GrpcSampleInAdapter extends SampleImplBase {

    private final SamplePort samplePort;
    
    private final MessageSourceAccessor messageSource;
    
    public GrpcSampleInAdapter(
            SamplePort samplePort
            , MessageSourceAccessor messageSource) {
        this.samplePort = samplePort;
        this.messageSource = messageSource;
    }
    
    @Override
    public void selectGrpcSample(SampleRequest request, StreamObserver<SampleResponse> responseObserver) {
        
        ResponseMessage responseMessage = samplePort.selectSample(request.getReqTypeValue());
        List<Sample> sampleList = (List<Sample>) responseMessage.getData();
        
        sampleList.stream().forEach(sample -> {
            
            SampleFieldEntry fieldEntry = SampleFieldEntry.newBuilder()
                    .setSeq(sample.getSeq())
                    .setTitle(sample.getTitle())
                    .setContents(sample.getContents())
                    .setTxt(sample.getTxt())
                    .setResult(true)
                    .build();
            
            SampleResponse.Builder responseBuilder = SampleResponse.newBuilder().setResult(fieldEntry);
            responseObserver.onNext(responseBuilder.build());
        });
        
        responseObserver.onCompleted();
    }

    @Override
    public void getGrpcSample(SampleRequest request, StreamObserver<SampleResponse> responseObserver) {
        SampleResponse.Builder responseBuilder = null;
        
        ResponseMessage responseMessage = samplePort.getSample(request.getReqTypeValue(), request.getSeq());
        Sample sample = (Sample) responseMessage.getData();
        
        SampleFieldEntry fieldEntry = SampleFieldEntry.newBuilder()
                .setSeq(sample.getSeq())
                .setTitle(sample.getTitle())
                .setContents(sample.getContents())
                .setResult(true)
                .build();
        
        responseBuilder = SampleResponse.newBuilder()
                .setResult(fieldEntry)
                .setResponseResult(ResponseResult.newBuilder()
                        .setResultCode(HttpStatus.OK.value())
                        .setResultMessage(messageSource.getMessage("common.process.complete")));
        
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void insertGrpcSample(SampleRequest request, StreamObserver<ResponseResult> responseObserver) {
        ResponseResult.Builder responseBuilder = null;
        
        Sample sample = Sample.builder()
                .title(request.getTitle())
                .contents(request.getContents())
                .build();
        
        ResponseMessage responseMessage = samplePort.insertSample(request.getReqTypeValue(), sample);

        responseBuilder = ResponseResult.newBuilder()
                .setResultCode(HttpStatus.OK.value())
                .setResultMessage(responseMessage.getResultMessage());
        
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void updateGrpcSample(SampleRequest request, StreamObserver<ResponseResult> responseObserver) {
        ResponseResult.Builder responseBuilder = null;
        
        Sample sample = Sample.builder()
                .seq(request.getSeq())
                .title(request.getTitle())
                .contents(request.getContents())
                .build();
        
        ResponseMessage responseMessage = samplePort.updateSample(request.getReqTypeValue(), sample);
        
        responseBuilder = ResponseResult.newBuilder()
                .setResultCode(HttpStatus.OK.value())
                .setResultMessage(responseMessage.getResultMessage());
        
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void deleteGrpcSample(SampleRequest request, StreamObserver<ResponseResult> responseObserver) {
        ResponseResult.Builder responseBuilder = null;
        
        ResponseMessage responseMessage = samplePort.deleteSample(request.getReqTypeValue(), request.getSeq());
        
        responseBuilder = ResponseResult.newBuilder()
                .setResultCode(HttpStatus.OK.value())
                .setResultMessage(responseMessage.getResultMessage());
        
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }
}
