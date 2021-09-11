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
package kyobobook.application.biz.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kyobobook.application.biz.common.port.in.CustomEventLogPort;
import kyobobook.application.biz.common.port.out.CustomEventLogOutPort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.eventlog.EventLog;
import kyobobook.exception.BizRuntimeException;

/**
 * @Project     : common-prototype-api
 * @FileName    : CustomEventLogService.java
 * @Date        : 2021. 9. 3.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-32 Service Mesh 연동 구성 : event log 정보 처리 Service
 */
@Service
public class CustomEventLogService implements CustomEventLogPort {
    
    @Autowired
    CustomEventLogOutPort customEventLogOutPort;

    @Override
    public ResponseMessage selectEventLogs() throws BizRuntimeException {
        
        return customEventLogOutPort.selectEventLogs();
    }

    @Override
    public ResponseMessage insertEventLog(EventLog eventLog) throws BizRuntimeException {
        
        return customEventLogOutPort.insertEventLog(eventLog);
    }
    
    @Override
    public ResponseMessage insertEventLog(String msg) throws BizRuntimeException {
        
        return customEventLogOutPort.insertEventLog(msg);
    }

    @Override
    public ResponseMessage deleteEventLogs() throws BizRuntimeException {
        
        return customEventLogOutPort.deleteEventLogs();
    }

}
