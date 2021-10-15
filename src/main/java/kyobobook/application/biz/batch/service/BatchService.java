/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * sykim@kyobobook.com      2021. 10. 7.
 *
 ****************************************************/
package kyobobook.application.biz.batch.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import kyobobook.application.biz.batch.port.in.BatchInPort;
import kyobobook.application.biz.batch.port.out.BatchPersistencePort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.exception.BizRuntimeException;

/**
 * @Project     : common-prototype-api
 * @FileName    : BatchService.java
 * @Date        : 2021. 10. 7.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-36 Knative 기반 배치 (Java, 파이썬) : Service Class
 */
@Service
public class BatchService implements BatchInPort {
    
    private static final Logger logger = LoggerFactory.getLogger(BatchService.class);
    
    private final BatchPersistencePort batchPersistencePort;
    
    private final MessageSourceAccessor messageSource;
    
    /**
     * Constructor
     * @param batchPersistencePort
     * @param messageSource
     */
    public BatchService(@Qualifier("batchPersistenceRepository") BatchPersistencePort batchPersistencePort
            , MessageSourceAccessor messageSource) {
        this.batchPersistencePort = batchPersistencePort;
        this.messageSource = messageSource;
    }

    @Override
    public ResponseMessage selectBatchCount() {
        
        ResponseMessage responseMessage = null;
        
        try {
            responseMessage = ResponseMessage.builder()
                    .data(this.batchPersistencePort.selectBatchCount())
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete"))
                    .build();
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        
        return responseMessage;
        
    }

    @Override
    public ResponseMessage updateBatchDataInit() {
        
        ResponseMessage responseMessage = null;
        
        try {
            
            batchPersistencePort.updateBatchDataInit();
            responseMessage = ResponseMessage.builder()
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete"))
                    .build();
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        
        return responseMessage;
    }

}
