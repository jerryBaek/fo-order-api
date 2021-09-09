/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 8. 17.  First Draft.
 *
 ****************************************************/
package kyobobook.application.adapter.in.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kyobobook.application.biz.sample.port.in.SamplePort;
import kyobobook.application.biz.sample.service.SampleService;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.sample.Sample;

/**
 * @Project     : common-prototype-api
 * @FileName    : RestSampleController.java
 * @Date        : 2021. 8. 17.
 * @author      : smlee1@kyobobook.com
 * @description : 샘플 Rest Api Controller
 */
@Api(tags = "RestSampleController")
@RestController
@RequestMapping("/rest-sample")
public class RestSampleController {
    private static final Logger logger = LoggerFactory.getLogger(RestSampleController.class);
    
    private SamplePort sampleService;
    
    public RestSampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    /**
     * @Method      : selectMasterSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : 샘플 마스터 Database 에서 Sample 데이터 목록을 조회한다.
     * @return
     */
    @ApiOperation(value="마스터 샘플 목록 조회"
            , notes="<b style='color: red;'>Master DataBase</b>의 샘풀테이블 전체 목록을 조회 합니다.")
    @GetMapping(value = "/master/samples")
    public ResponseMessage selectMasterSample() {
        return sampleService.selectMasterSample();
    }
    
    
    /**
     * @Method      : getMasterSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : 샘플 마스터 Database 에서 Sample 데이터 상세를 조회한다.
     * @param seq
     * @return
     */
    @ApiOperation("마스터 샘플 상세 조회")
    @GetMapping(value = "/master/sample/{seq}")
    public ResponseMessage getMasterSample(
            @PathVariable int seq) {
        return sampleService.getMasterSample(seq);
    }
    
    /**
     * @Method      : insertMasterSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : 샘플 마스터 Database 에서 Sample 데이터를 신규 등록한다.
     * @param sample
     * @return
     */
    @ApiOperation("마스터 샘플 신규 등록")
    @PostMapping(value = "/master/sample")
    public ResponseMessage insertMasterSample(
            @RequestBody Sample sample) {
        
        logger.debug("// INSERT MASTER SAMPLE => " + sample.toString());
        
        return sampleService.insertMasterSample(sample);
    }
    
    /**
     * @Method      : updateMasterSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : 샘플 마스터 Database 에서 Sample 데이터를 수정한다.
     * @param sample
     * @return
     */
    @ApiOperation("마스터 샘플 수정")
    @PutMapping(value = "/master/sample")
    public ResponseMessage updateMasterSample(
            @RequestBody Sample sample) {
        
        logger.debug("// UPDATE MASTER SAMPLE => " + sample.toString());
        
        return sampleService.updateMasterSample(sample);
    }
    
    /**
     * @Method      : deleteMasterSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : 샘플 마스터 Database 에서 Sample 데이터를 삭제한다.
     * @param seq
     * @return
     */
    @ApiOperation("마스터 샘플 삭제")
    @DeleteMapping(value = "/master/sample/{seq}")
    public ResponseMessage deleteMasterSample(
            @PathVariable int seq) {
        
        logger.debug("/// DELETE MASTER SAMPLE => " + seq);
        
        return sampleService.deleteMasterSample(seq);
    }
    
    /**
     * @Method      : selectSlaveSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : 샘플 슬레이브 Database 에서 Sample 데이터 목록을 조회한다.
     * @return
     */
    @ApiOperation("슬레이브 샘플 목록 조회")
    @GetMapping(value = "/slave/samples")
    public ResponseMessage selectSlaveSample() {
        return sampleService.selectSlaveSample();
    }
    
    /**
     * @Method      : getSlaveSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : 샘플 슬레이브 Database 에서 Sample 데이터 상세를 조회한다.
     * @param seq
     * @return
     */
    @ApiOperation("슬레이브 샘플 상세 조회")
    @GetMapping(value = "/slave/sample/{seq}")
    public ResponseMessage getSlaveSample(
            @PathVariable int seq) {
        return sampleService.getSlaveSample(seq);
    }

    /**
     * @Method      : insertSlaveSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : 샘플 슬레이브 Database 에서 Sample 데이터를 신규 등록한다.
     * @param sample
     * @return
     * @throws Exception
     */
    @ApiOperation("슬레이브 샘플 신규 등록")
    @PostMapping(value = "/slave/sample")
    public ResponseMessage insertSlaveSample(
            @RequestBody Sample sample) throws Exception {
        
        logger.debug("// INSERT SLAVE SAMPLE => " + sample.toString());
        
        return sampleService.insertSlaveSample(sample);
    }
    
    /**
     * @Method      : updateSlaveSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : 샘플 슬레이브 Database 에서 Sample 데이터를 수정한다.
     * @param sample
     * @return
     */
    @ApiOperation("슬레이브 샘플 수정")
    @PutMapping(value = "/slave/sample")
    public ResponseMessage updateSlaveSample(
            @RequestBody Sample sample) {
        
        logger.debug("// UPDATE SLAVE SAMPLE => " + sample.toString());
        
        return sampleService.updateSlaveSample(sample);
    }
    
    /**
     * @Method      : deleteSlaveSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : 샘플 슬레이브 Database 에서 Sample 데이터를 삭제한다.
     * @param seq
     * @return
     */
    @ApiOperation("슬레이브 샘플 삭제")
    @DeleteMapping(value = "/slave/sample/{seq}")
    public ResponseMessage deleteSlaveSample(
            @PathVariable int seq) {
        
        logger.debug("/// DELETE SLAVE SAMPLE => " + seq);
        
        return sampleService.deleteSlaveSample(seq);
    }
    
    /**
     * @Method      : selectGprcSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : Sub Api 서비스를 통해 샘플 슬레이브 Database 에서 Sample 데이터 목록을 조회한다.
     * @return
     */
    @ApiOperation("gRPC 슬레이브 샘플 목록 조회")
    @GetMapping(value = "/grpc/samples")
    public ResponseMessage selectGprcSample() {
        
        logger.debug("// SELECT gRPC SLAVE SAMPLE LIST");
        
        return sampleService.selectSubSample();
    }
    
    /**
     * @Method      : getGprcSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : Sub Api 서비스를 통해 샘플 슬레이브 Database 에서 Sample 데이터 상세를 조회한다.
     * @param seq
     * @return
     */
    @ApiOperation("gRPC 슬레이브 샘플 상세 조회")
    @GetMapping(value = "/grpc/sample/{seq}")
    public ResponseMessage getGprcSample(
            @PathVariable int seq) {
        
        logger.debug("// GET DETAIL gRPC SLAVE SAMPLE => " + seq);
        
        return sampleService.getSubSample(seq);
    }
    
    /**
     * @Method      : insertGrpcSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : Sub Api 서비스를 통해 샘플 슬레이브 Database 에서 Sample 데이터를 신규 등록한다.
     * @param sample
     * @return
     * @throws Exception
     */
    @ApiOperation("슬레이브 샘플 신규 등록")
    @PostMapping(value = "/grpc/sample")
    public ResponseMessage insertGrpcSample(
            @RequestBody Sample sample) throws Exception {
        
        logger.debug("// INSERT gRPC SLAVE SAMPLE => " + sample.toString());
        
        return sampleService.insertSubSample(sample);
    }
    
    /**
     * @Method      : updateGrpcSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : Sub Api 서비스를 통해 샘플 슬레이브 Database 에서 Sample 데이터를 수정한다.
     * @param sample
     * @return
     */
    @ApiOperation("슬레이브 샘플 수정")
    @PutMapping(value = "/grpc/sample")
    public ResponseMessage updateGrpcSample(
            @RequestBody Sample sample) {
        
        logger.debug("// UPDATE gRPC SLAVE SAMPLE => " + sample.toString());

        return sampleService.updateSubSample(sample);
    }
    
    /**
     * @Method      : deleteGrpcSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : Sub Api 서비스를 통해 슬레이브 Database 에서 Sample 데이터를 삭제한다.
     * @param seq
     * @return
     */
    @ApiOperation("슬레이브 샘플 삭제")
    @DeleteMapping(value = "/grpc/sample/{seq}")
    public ResponseMessage deleteGrpcSample(
            @PathVariable int seq) {
        
        logger.debug("/// DELETE gRPC SLAVE SAMPLE => " + seq);
        
        return sampleService.deleteSubSample(seq);
    }
}
