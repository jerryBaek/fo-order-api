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
package kyobobook.application.adapter.in.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kyobobook.application.biz.batch.port.in.BatchInPort;
import kyobobook.application.domain.common.ResponseMessage;

/**
 * @Project     : common-prototype-api
 * @FileName    : RestSampleBatchController.java
 * @Date        : 2021. 10. 7.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-36 Knative 기반 배치 (Java, 파이썬) Prototype Rest Api Controller
 */
@Api(tags = "RestSampleBatchController")
@RestController
@RequestMapping("/batch")
public class RestSampleBatchController {
    
    private static final Logger logger = LoggerFactory.getLogger(RestSampleBatchController.class);
    
    private final BatchInPort batchInPort;
    
    public RestSampleBatchController(BatchInPort batchInPort) {
        
        this.batchInPort = batchInPort;
    }
    
    /**
     * @Method      : selectBatchCount
     * @Date        : 2021. 10. 12.
     * @author      : sykim@kyobobook.com
     * @description : 배치 실행 결과 Data 현황을 조회 한다.
     * @return
     */
    @ApiOperation("배치 실행 결과 count 현황 조회")
    @GetMapping(value = "/data/status")
    public ResponseMessage selectBatchCount() {

        logger.debug("batch 실행 count 조회");
        
        return batchInPort.selectBatchCount();
    }
    
    /**
     * @Method      : updateBatchDataInit
     * @Date        : 2021. 10. 12.
     * @author      : sykim@kyobobook.com
     * @description : 배치 테스트 데이터를 초기 상태로 복원 한다.
     * @return
     */
    @ApiOperation("배치 테스트 데이터 복원")
    @PutMapping(value = "/restoration")
    public ResponseMessage updateBatchDataInit() {
        
        logger.debug("### updateBatchData :: test data  restoration ");
        return batchInPort.updateBatchDataInit();
        
    }

}
