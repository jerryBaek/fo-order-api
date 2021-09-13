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
package kyobobook.application.adapter.out.grpc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import kyobobook.application.biz.sample.port.out.SampleOutPort;
import kyobobook.application.domain.sample.Sample;
import kyobobook.exception.BizRuntimeException;
import kyobobook.grpc.sample.ResponseResult;
import kyobobook.grpc.sample.SampleFieldEntry;
import kyobobook.grpc.sample.SampleGrpc;
import kyobobook.grpc.sample.SampleRequest;
import kyobobook.grpc.sample.SampleResponse;
import net.devh.boot.grpc.client.inject.GrpcClient;

/**
 * @Project     : common-prototype-api
 * @FileName    : GrpcSampleAdapter.java
 * @Date        : 2021. 8. 17.
 * @author      : smlee1@kyobobook.com
 * @description :
 */
@Service("grpcSampleAdapter")
public class GrpcSampleOutAdapter implements SampleOutPort{
    
    @GrpcClient("common-prototype-sub-api")
    private SampleGrpc.SampleBlockingStub sampleStub;
    
    @Override
    public List<Sample> selectGrpcSample() throws BizRuntimeException {
        // Communication
        List<Sample> grpcSampleList = new ArrayList<>();
        Iterator<SampleResponse> response = this.sampleStub.selectGrpcSample(null);
        
        response.forEachRemaining(sampleResponse -> {
            SampleFieldEntry fieldEntry = sampleResponse.getResult();
            Sample sample = Sample.builder()
                    .seq(fieldEntry.getSeq())
                    .title(fieldEntry.getTitle())
                    .contents(fieldEntry.getContents())
                    .txt(fieldEntry.getTxt())
                    .build();
            
            grpcSampleList.add(sample);
        });
        
        return grpcSampleList;
    }

    @Override
    public Sample getGprcSample(int seq) throws BizRuntimeException {
        // Communication
        final SampleResponse response = 
                this.sampleStub.getGrpcSample(SampleRequest.newBuilder().setSeq(seq).build());
        SampleFieldEntry fieldEntry = response.getResult();
        
        ResponseResult responseResult = response.getResponseResult(); 
        if(responseResult.getResultCode() != HttpStatus.OK.value()) {
            throw new BizRuntimeException(responseResult.getResultCode(), responseResult.getDetailMessage());
        }
        
        // convert gRPC data
        Sample sample = Sample.builder()
                .seq(fieldEntry.getSeq())
                .title(fieldEntry.getTitle())
                .contents(fieldEntry.getContents())
                .txt(fieldEntry.getTxt())
                .build();
        
        return sample;
    }

    @Override
    public String insertGrpSample(Sample sample) throws BizRuntimeException {
        // Communication
        final ResponseResult responseResult = this.sampleStub.insertGrpcSample(SampleRequest.newBuilder()
                .setTitle(sample.getTitle())
                .setContents(sample.getContents())
                .build());
        
        if(responseResult.getResultCode() != HttpStatus.OK.value()) {
            throw new BizRuntimeException(responseResult.getResultCode(), responseResult.getDetailMessage());
        }
        
        return responseResult.getResultMessage();
    }

    @Override
    public String updateGrpSample(Sample sample) throws BizRuntimeException {
        // Communication
        final ResponseResult responseResult = this.sampleStub.updateGrpcSample(SampleRequest.newBuilder()
                .setSeq(sample.getSeq())
                .setTitle(sample.getTitle())
                .setContents(sample.getContents())
                .build());
        
        if(responseResult.getResultCode() != HttpStatus.OK.value()) {
            throw new BizRuntimeException(responseResult.getResultCode(), responseResult.getDetailMessage());
        }
        
        return responseResult.getResultMessage();
    }

    @Override
    public String deleteGrpSample(int seq) throws BizRuntimeException {
        // Communication
        final ResponseResult responseResult = this.sampleStub.deleteGrpcSample(SampleRequest.newBuilder().setSeq(seq).build());
        
        if(responseResult.getResultCode() != HttpStatus.OK.value()) {
            throw new BizRuntimeException(responseResult.getResultCode(), responseResult.getDetailMessage());
        }
        
        return responseResult.getResultMessage();
    }

}