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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kyobobook.application.biz.test.port.in.TestPort;
import kyobobook.application.domain.common.ResponseMessage;

/**
 * @Project : fo-order-api
 * @FileName : RestSampleController.java
 * @Date : 2021. 8. 17.
 * @author : smlee1@kyobobook.com
 * @description : 샘플 Rest Api Controller
 */
@Api(tags = "RestSampleController")
@RestController
public class RestTestController {
    
    private static final Logger logger = LoggerFactory.getLogger(RestTestController.class);
    
    @Autowired
    private TestPort testService;

    /**
     * @Method : selectMasterSample
     * @Date : 2021. 8. 17.
     * @author : smlee1@kyobobook.com
     * @description : 샘플 마스터 Database 에서 Sample 데이터 목록을 조회한다.
     * @return
     */
    @ApiOperation(value = "마스터 샘플 목록 조회", notes = "<b style='color: red;'>Master DataBase</b>의 샘풀테이블 전체 목록을 조회 합니다.")
    @GetMapping(value = "/api/v1/order/cart/test/data/multiple")
    public ResponseMessage selectMultipleData() {

        logger.debug("================멀티 데이터 선택");

        return testService.selectMultipleData();
    }

    @GetMapping(value = "/api/v1/order/cart/test/data/non-multiple/{ordrId}")
    public ResponseMessage selectMultipleData(@PathVariable String ordrId) {

        logger.debug("================단건 데이터 선택");

        return testService.selectNonMultipleData(ordrId);
    }

    @ApiOperation(value = "마스터 샘플 목록 조회", notes = "<b style='color: red;'>Master DataBase</b>의 샘풀테이블 전체 목록을 조회 합니다.")
    @GetMapping(value = "/api/v1/order/cart/test/rpc/data/multiple")
    public ResponseMessage selectMultipleDataUsingRpc() {

        logger.debug("================GRPC 멀티 데이터 선택");

        return testService.selectMultipleDataUsingRpc();
    }

    @GetMapping(value = "/api/v1/order/cart/test/rpc/data/non-multiple/{ordrId}")
    public ResponseMessage selectMultipleDataUsingRpc(@PathVariable String ordrId) {

        logger.debug("================GRPC 단건 데이터 선택");

        return testService.selectNonMultipleDataUsingRpc(ordrId);
    }
    
    

}