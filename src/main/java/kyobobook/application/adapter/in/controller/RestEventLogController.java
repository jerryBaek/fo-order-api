/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * sykim@kyobobook.com      2021. 9. 10.
 *
 ****************************************************/
package kyobobook.application.adapter.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kyobobook.application.biz.common.port.in.CustomEventLogPort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.eventlog.EventLog;

/**
 * @Project     : common-prototype-api
 * @FileName    : RestEventLogController.java
 * @Date        : 2021. 9. 10.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-32 Service Mesh 연동 구성 : event log Rest Api Controller
 */
@Api(tags = "{RestEventLogController}")
@RestController
@RequestMapping("/log")
public class RestEventLogController {
    
    @Autowired
    CustomEventLogPort customEventLogPort;

    /**
     * @Method      : selectLogs
     * @Date        : 2021. 9. 10.
     * @author      : sykim@kyobobook.com
     * @description : Document DB의 event log 정보를 조회한다.
     * @return
     */
    @ApiOperation(value="Document DB의 event log 정보 조회")
    @GetMapping(value = "/eventLogs")
    public ResponseMessage selectLogs() {
        
        return customEventLogPort.selectEventLogs();
    }
    
    /**
     * @Method      : insertLogs
     * @Date        : 2021. 9. 10.
     * @author      : sykim@kyobobook.com
     * @description : Document DB의 event log 정보를 등록한다.
     * @param eventlog
     * @return
     */
    @ApiOperation("Document DB event log 정보 등록")
    @PostMapping(value = "/eventLogs")
    public ResponseMessage insertLogs(
            @RequestBody EventLog eventlog) {
        
        return customEventLogPort.insertEventLog(eventlog);
    }

    /**
     * @Method      : deleteProduct
     * @Date        : 2021. 9. 10.
     * @author      : sykim@kyobobook.com
     * @description : Document DB의 event log 정보를 삭제한다.
     * @return
     */
    @ApiOperation("Document DB의 event log 정보 삭제")
    @DeleteMapping(value = "/eventLogs")
    public ResponseMessage deleteLogs() {
        
        return customEventLogPort.deleteEventLogs();
    }
}
