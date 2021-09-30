/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 8. 12.  First Draft.
 *
 ****************************************************/
package kyobobook.application.biz.sample.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import kyobobook.application.biz.sample.port.in.SamplePort;
import kyobobook.application.biz.sample.port.out.SampleRestOutPort;
import kyobobook.application.biz.sample.port.out.SamplePersistencePort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.sample.Sample;
import kyobobook.exception.BizRuntimeException;

/**
 * @Project     : common-prototype-api
 * @FileName    : SampleService.java
 * @Date        : 2021. 8. 12.
 * @author      : smlee1@kyobobook.com
 * @description : Sample로 작성된 Service class 이다.
 *                Writer와 Reader 데이터 베이스에 데이터 처리를 한다.
 */
@Service
public class SampleService implements SamplePort {
    
    private static final Logger logger = LoggerFactory.getLogger(SampleService.class);
            
    private final SamplePersistencePort sampleWriterPort;
    
    private final SamplePersistencePort sampleReaderPort;
    
    private final SampleRestOutPort sampleOutPort;
    
    private final MessageSourceAccessor messageSource;
    
    public SampleService(@Qualifier("sampleWriterRepository") SamplePersistencePort sampleWriterPort
            , @Qualifier("sampleReaderRepository") SamplePersistencePort sampleReaderPort
//            , @Qualifier("restSampleAdapter") SampleOutPort sampleOutPort
          , @Qualifier("grpcSampleAdapter") SampleRestOutPort sampleOutPort
            , MessageSourceAccessor messageSource) {
        
        this.sampleWriterPort = sampleWriterPort;
        this.sampleReaderPort = sampleReaderPort;
        this.sampleOutPort = sampleOutPort;
        this.messageSource = messageSource;
    }
    
    @Override
    public ResponseMessage selectSample(int reqType) throws BizRuntimeException {
        ResponseMessage responseMessage = null;
        if(reqType == 0) {
            // writer 데이터 목록 조회
            responseMessage = this.selectMasterSample();
            
        } else if (reqType == 1) {
            // reader 데이터 목록 조회
            responseMessage = this.selectSlaveSample();
                    
        } else if (reqType == 2) {
            // sub-api 와 grpc 통신으로 reader 데이터 목록 조회
            responseMessage = this.selectSubSample();
        }
        
        return Optional.of(responseMessage).orElse(ResponseMessage.builder().build());
    }

    @Override
    public ResponseMessage getSample(int reqType, int seq) throws BizRuntimeException {
        ResponseMessage responseMessage = null;
        if(reqType == 0) {
            // writer 데이터 조회
            responseMessage = this.getMasterSample(seq);
        } else if (reqType == 1) {
            // reader 데이터 조회
            responseMessage = this.getSlaveSample(seq);
        } else if (reqType == 2) {
            // sub-api 와 grpc 통신으로 reader 데이터 조회
            responseMessage = this.getSubSample(seq);
        }
        return Optional.of(responseMessage).orElse(ResponseMessage.builder().build());
    }

    @Override
    public ResponseMessage insertSample(int reqType, Sample sample) throws BizRuntimeException {
        ResponseMessage responseMessage = null;
        if(reqType == 0) {
            // writer 데이터 등록
            responseMessage = this.insertMasterSample(sample);
            
        } else if (reqType == 1) {
            // reader 데이터 등록
            responseMessage = this.insertSlaveSample(sample);
            
        } else if (reqType == 2) {
            // sub-api 와 grpc 통신으로 reader 데이터 등록
            responseMessage = this.insertSubSample(sample);
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage updateSample(int reqType, Sample sample) throws BizRuntimeException {
        ResponseMessage responseMessage = null;
        if(reqType == 0) {
            // writer 데이터 수정
            responseMessage = this.updateMasterSample(sample);
            
        } else if (reqType == 1) {
            // reader 데이터 수정
            responseMessage = this.updateSlaveSample(sample);
            
        } else if (reqType == 2) {
            // sub-api 와 grpc 통신으로 reader 데이터 수정
            responseMessage = this.updateSubSample(sample);
            
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage deleteSample(int reqType, int seq) throws BizRuntimeException {
        ResponseMessage responseMessage = null;
        if(reqType == 0) {
            // writer 데이터 삭제
            responseMessage = this.deleteMasterSample(seq);
            
        } else if (reqType == 1) {
            // reader 데이터 삭제
            responseMessage = this.deleteSlaveSample(seq);
            
        } else if (reqType == 2) {
            // sub-api 와 grpc 통신으로 reader 데이터 삭제
            responseMessage = this.deleteSubSample(seq);
        }
        return responseMessage;
    }
    
    @Override
    public ResponseMessage selectMasterSample() throws BizRuntimeException {
        ResponseMessage responseMessage = null;
        
        try {
            responseMessage = ResponseMessage.builder()
                    .data(this.sampleWriterPort.selectSample())
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete"))
                    .build();
            
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        
        return responseMessage;
    }

    @Override
    public ResponseMessage getMasterSample(int seq) throws BizRuntimeException {
        ResponseMessage responseMessage = null;
        
        try {
            responseMessage = ResponseMessage.builder()
                    .data(this.sampleWriterPort.getSample(seq)) // 조회
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete"))
                    .build();
            
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage insertMasterSample(Sample sample) throws BizRuntimeException {
        ResponseMessage responseMessage = null;
        
        try {
            int insertCnt = sampleWriterPort.insertSample(sample);
            responseMessage = ResponseMessage.builder()
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete.cnt", new Integer[] {insertCnt}))
                    .build();
        } catch(Exception e) {
            logger.error(e.getMessage());
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage updateMasterSample(Sample sample) throws BizRuntimeException {
        ResponseMessage responseMessage = null;
        
        try {
            int updateCnt = sampleWriterPort.updateSample(sample);
            responseMessage = ResponseMessage.builder()
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete.cnt", new Integer[] {updateCnt}))
                    .build();
            
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage deleteMasterSample(int seq) throws BizRuntimeException {
        ResponseMessage responseMessage = null;
        
        try {
            int deleteCnt = sampleWriterPort.deleteSample(seq);
            responseMessage = ResponseMessage.builder()
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete.cnt", new Integer[] {deleteCnt}))
                    .build();
            
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage selectSlaveSample()throws BizRuntimeException  {
        ResponseMessage responseMessage = null;
        
        try {
            responseMessage = ResponseMessage.builder()
                    .data(this.sampleReaderPort.selectSample()) // 조회
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete"))
                    .build();
            
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage getSlaveSample(int seq) throws BizRuntimeException {
        ResponseMessage responseMessage = null;
        
        try {
            
            responseMessage = ResponseMessage.builder()
                    .data(this.sampleReaderPort.getSample(seq)) // 조회
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete"))
                    .build();
            
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage insertSlaveSample(Sample sample) throws BizRuntimeException {
        ResponseMessage responseMessage = null;
        
        try {
            
            int insertCnt = sampleReaderPort.insertSample(sample);
            responseMessage = ResponseMessage.builder()
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete.cnt", new Integer[] {insertCnt}))
                    .build();
            
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        
        return responseMessage;
    }

    @Override
    public ResponseMessage updateSlaveSample(Sample sample) throws BizRuntimeException {
        ResponseMessage responseMessage = null;
        
        try {
            
            int updateCnt = sampleReaderPort.updateSample(sample);
            responseMessage = ResponseMessage.builder()
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete.cnt", new Integer[] {updateCnt}))
                    .build();
            
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        
        return responseMessage;
    }

    @Override
    public ResponseMessage deleteSlaveSample(int seq) throws BizRuntimeException {
        ResponseMessage responseMessage = null;
        
        try {
            
            int deleteCnt = sampleReaderPort.deleteSample(seq);
            responseMessage = ResponseMessage.builder()
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete.cnt", new Integer[] {deleteCnt}))
                    .build();
            
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        
        return responseMessage;
    }

    @Override
    public ResponseMessage selectSubSample() {
        ResponseMessage responseMessage = ResponseMessage.builder()
                .data(sampleOutPort.selectGrpcSample())
                .statusCode(HttpStatus.OK.value())
                .resultMessage(messageSource.getMessage("common.process.complete"))
                .build();
        
        return responseMessage;
    }

    @Override
    public ResponseMessage getSubSample(int seq) {
        ResponseMessage responseMessage = ResponseMessage.builder()
                .data(sampleOutPort.getGprcSample(seq))
                .statusCode(HttpStatus.OK.value())
                .resultMessage(messageSource.getMessage("common.process.complete"))
                .build();
        
        return responseMessage;
    }

    @Override
    public ResponseMessage insertSubSample(Sample sample) {
        ResponseMessage responseMessage = ResponseMessage.builder()
                .statusCode(HttpStatus.OK.value())
                .resultMessage(sampleOutPort.insertGrpSample(sample))
                .build();
        
        return responseMessage;
    }

    @Override
    public ResponseMessage updateSubSample(Sample sample) {
        ResponseMessage responseMessage = ResponseMessage.builder()
                .statusCode(HttpStatus.OK.value())
                .resultMessage(sampleOutPort.updateGrpSample(sample))
                .build();
        
        return responseMessage;
    }

    @Override
    public ResponseMessage deleteSubSample(int seq) {
        ResponseMessage responseMessage = ResponseMessage.builder()
                .statusCode(HttpStatus.OK.value())
                .resultMessage(sampleOutPort.deleteGrpSample(seq))
                .build();
        
        return responseMessage;
    }
}
