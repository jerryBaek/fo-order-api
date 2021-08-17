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

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kyobobook.application.biz.sample.port.in.SamplePort;
import kyobobook.application.biz.sample.service.SampleService;
import kyobobook.application.domain.sample.Sample;

/**
 * @Project     : common-prototype-api
 * @FileName    : RestSampleController.java
 * @Date        : 2021. 8. 17.
 * @author      : smlee1@kyobobook.com
 * @description : 샘플 Rest Api Controller
 */
@Api(tags = "{RestSampleController}")
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
    @GetMapping(value = "/sample-master-list")
    public ResponseEntity<?> selectMasterSample() {
        List<Sample> sampleList = sampleService.selectMasterSample();
        return new ResponseEntity<>(sampleList, HttpStatus.OK);
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
    @GetMapping(value = "/get-master-sample/{seq}")
    public ResponseEntity<?> getMasterSample(
            @PathVariable int seq) {
        Sample sampleMaster = sampleService.getMasterSample(seq);
        return new ResponseEntity<>(sampleMaster, HttpStatus.OK);
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
    @PostMapping(value = "/insert-master-sample")
    public ResponseEntity<?> insertMasterSample(
            @RequestBody Sample sample) {
        
        logger.debug("// INSERT MASTER SAMPLE => " + sample.toString());
        
        sampleService.insertMasterSample(sample);
        return new ResponseEntity<>(HttpStatus.OK);
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
    @PutMapping(value = "/update-master-sample")
    public ResponseEntity<?> updateMasterSample(
            @RequestBody Sample sample) {
        
        logger.debug("// UPDATE MASTER SAMPLE => " + sample.toString());
        
        sampleService.updateMasterSample(sample);
        return new ResponseEntity<>(HttpStatus.OK);
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
    @DeleteMapping(value = "/delete-master-sample/{seq}")
    public ResponseEntity<?> deleteMasterSample(
            @PathVariable int seq) {
        
        logger.debug("/// DELETE MASTER SAMPLE => " + seq);
        
        sampleService.deleteMasterSample(seq);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    /**
     * @Method      : selectSlaveSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : 샘플 슬레이브 Database 에서 Sample 데이터 목록을 조회한다.
     * @return
     */
    @ApiOperation("슬레이브 샘플 목록 조회")
    @GetMapping(value = "/sample-slave-list")
    public ResponseEntity<?> selectSlaveSample() {
        List<Sample> sampleList = sampleService.selectSlaveSample();
        return new ResponseEntity<>(sampleList, HttpStatus.OK);
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
    @GetMapping(value = "/get-slave-sample/{seq}")
    public ResponseEntity<?> getSlaveSample(
            @PathVariable int seq) {
        Sample sampleSlave = sampleService.getSlaveSample(seq);
        return new ResponseEntity<>(sampleSlave, HttpStatus.OK);
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
    @PostMapping(value = "/insert-slave-sample")
    public ResponseEntity<?> insertSlaveSample(
            @RequestBody Sample sample) throws Exception {
        
        logger.debug("// INSERT SLAVE SAMPLE => " + sample.toString());
        
        sampleService.insertSlaveSample(sample);
        return new ResponseEntity<>(HttpStatus.OK);
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
    @PutMapping(value = "/update-slave-sample")
    public ResponseEntity<?> updateSlaveSample(
            @RequestBody Sample sample) {
        
        logger.debug("// UPDATE SLAVE SAMPLE => " + sample.toString());
        
        sampleService.updateSlaveSample(sample);
        return new ResponseEntity<>(HttpStatus.OK);
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
    @DeleteMapping(value = "/delete-slave-sample/{seq}")
    public ResponseEntity<?> deleteSlaveSample(
            @PathVariable int seq) {
        
        logger.debug("/// DELETE SLAVE SAMPLE => " + seq);
        
        sampleService.deleteSlaveSample(seq);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    /**
     * @Method      : selectGprcSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : Sub Api 서비스를 통해 샘플 슬레이브 Database 에서 Sample 데이터 목록을 조회한다.
     * @return
     */
    @ApiOperation("gRPC 슬레이브 샘플 목록 조회")
    @GetMapping(value = "/sample-grpc-list")
    public ResponseEntity<?> selectGprcSample() {
        
        logger.debug("// SELECT gRPC SLAVE SAMPLE LIST");
        
        List<Sample> sampleList = sampleService.selectSubSample();
        return new ResponseEntity<>(sampleList, HttpStatus.OK);
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
    @GetMapping(value = "/get-grpc-sample/{seq}")
    public ResponseEntity<?> getGprcSample(
            @PathVariable int seq) {
        
        logger.debug("// GET DETAIL gRPC SLAVE SAMPLE => " + seq);
        
        Sample sample = sampleService.getSubSample(seq);
        return new ResponseEntity<>(sample, HttpStatus.OK);
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
    @PostMapping(value = "/insert-grpc-sample")
    public ResponseEntity<?> insertGrpcSample(
            @RequestBody Sample sample) throws Exception {
        
        logger.debug("// INSERT gRPC SLAVE SAMPLE => " + sample.toString());
        
        sampleService.insertSubSample(sample);
        return new ResponseEntity<>(HttpStatus.OK);
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
    @PutMapping(value = "/update-grpc-sample")
    public ResponseEntity<?> updateGrpcSample(
            @RequestBody Sample sample) {
        
        logger.debug("// UPDATE gRPC SLAVE SAMPLE => " + sample.toString());

        sampleService.updateSubSample(sample);
        return new ResponseEntity<>(HttpStatus.OK);
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
    @DeleteMapping(value = "/delete-grpc-sample/{seq}")
    public ResponseEntity<?> deleteGrpcSample(
            @PathVariable int seq) {
        
        logger.debug("/// DELETE gRPC SLAVE SAMPLE => " + seq);
        
        sampleService.deleteSubSample(seq);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
