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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.google.protobuf.Empty;

import io.grpc.stub.StreamObserver;
import kyobobook.application.biz.sample.port.out.SampleGrpcOutPort;
import kyobobook.application.biz.sample.port.out.SamplePersistencePort;
import kyobobook.application.domain.sample.Sample;
import kyobobook.grpc.sample.SampleGrpc.SampleImplBase;
import kyobobook.grpc.sample.SampleFieldEntry;
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
@GrpcService
public class GrpcSampleInAdapter extends SampleImplBase {

    @Autowired
    @Qualifier("sampleMasterRepository")
    SamplePersistencePort sampleMasterPort;
    
    @Autowired
    @Qualifier("sampleSlaveRepository")
    SamplePersistencePort sampleSlavePort;
    
    @Autowired
    @Qualifier("grpcSampleAdapter")
    SampleGrpcOutPort sampleGrpcOutPort;
    
    private SamplePersistencePort getRepository(SampleRequest request) {
        if(request.getReqType() == SampleRequest.ReqType.MASTER) {
            return sampleMasterPort;
        } else if(request.getReqType() == SampleRequest.ReqType.SLAVE) {
            return sampleSlavePort;
        } else if(request.getReqType() == SampleRequest.ReqType.SUB) {
            return null;
        }
        
        return null;
    }

    @Override
    public void selectGrpcSample(SampleRequest request, StreamObserver<SampleResponse> responseObserver) {
        SamplePersistencePort persistencePort = this.getRepository(request);
        List<Sample> sampleList = null;
        if(persistencePort == null) {
            sampleList = sampleGrpcOutPort.selectGrpcSample();
        } else {
            sampleList = persistencePort.selectSample();
        }

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
        SamplePersistencePort persistencePort = this.getRepository(request);
        Sample sample = null;
        if(persistencePort == null) {
            sample = sampleGrpcOutPort.getGprcSample(request.getSeq());
        } else {
            sample = persistencePort.getSample(request.getSeq());
        }
        
        SampleFieldEntry fieldEntry = SampleFieldEntry.newBuilder()
                .setSeq(sample.getSeq())
                .setTitle(sample.getTitle())
                .setContents(sample.getContents())
                .setResult(true)
                .build();
        
        SampleResponse.Builder responseBuilder = SampleResponse.newBuilder().setResult(fieldEntry);
        
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void insertGrpcSample(SampleRequest request, StreamObserver<Empty> responseObserver) {
        SamplePersistencePort persistencePort = this.getRepository(request);
        Sample sample = Sample.builder()
                .title(request.getTitle())
                .contents(request.getContents())
                .build();
        
        if(persistencePort == null) {
            sampleGrpcOutPort.insertGrpSample(sample);
        } else {
            persistencePort.insertSample(sample);
        }
    }

    @Override
    public void updateGrpcSample(SampleRequest request, StreamObserver<Empty> responseObserver) {
        SamplePersistencePort persistencePort = this.getRepository(request);
        Sample sample = Sample.builder()
                .seq(request.getSeq())
                .title(request.getTitle())
                .contents(request.getContents())
                .build();
        
        if(persistencePort == null) {
            sampleGrpcOutPort.updateGrpSample(sample);
        } else {
            persistencePort.updateSample(sample);
        }
    }

    @Override
    public void deleteGrpcSample(SampleRequest request, StreamObserver<Empty> responseObserver) {
        SamplePersistencePort persistencePort = this.getRepository(request);
        if(persistencePort == null) {
            sampleGrpcOutPort.deleteGrpSample(request.getSeq());
        } else {
            persistencePort.deleteSample(request.getSeq());
        }
    }
    
    
}
