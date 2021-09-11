/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * sykim@kyobobook.com      2021. 9. 3.
 *
 ****************************************************/
package kyobobook.application.biz.common.port.out;

import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.eventlog.EventLog;
import kyobobook.exception.BizRuntimeException;

/**
 * @Project     : common-prototype-api
 * @FileName    : CustomEventLogOutPort.java
 * @Date        : 2021. 9. 3.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-32 Service Mesh 연동 구성 : Service에서 상품 event log 정보를 처리하기 위한 Port
 */
public interface CustomEventLogOutPort {
    
    /**
     * @Method      : selectEventLogs
     * @Date        : 2021. 9. 10.
     * @author      : sykim@kyobobook.com
     * @description : Event Log 정보를 조회한다.
     * @return
     * @throws BizRuntimeException
     */
    ResponseMessage selectEventLogs() throws BizRuntimeException;
    
    /**
     * @Method      : insertEventLog
     * @Date        : 2021. 9. 10.
     * @author      : sykim@kyobobook.com
     * @description : Event Log 정보를 등록한다.
     * @param EventLog
     * @return
     * @throws BizRuntimeException
     */
    ResponseMessage insertEventLog(EventLog eventLog) throws BizRuntimeException;
    
    /**
     * @Method      : insertEventLog
     * @Date        : 2021. 9. 10.
     * @author      : sykim@kyobobook.com
     * @description : Event Log 정보를 등록한다.
     * @param msg
     * @return
     * @throws BizRuntimeException
     */
    ResponseMessage insertEventLog(String msg) throws BizRuntimeException;
    
    /**
     * @Method      : deleteEventLogs
     * @Date        : 2021. 9. 10.
     * @author      : sykim@kyobobook.com
     * @description : Event Log 정보를 삭제한다.
     * @return
     * @throws BizRuntimeException
     */
    ResponseMessage deleteEventLogs() throws BizRuntimeException;

}
