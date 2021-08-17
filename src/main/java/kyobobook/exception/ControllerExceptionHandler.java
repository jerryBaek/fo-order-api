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
package kyobobook.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Project     : common-prototype-api
 * @FileName    : ControllerExceptionHandler.java
 * @Date        : 2021. 8. 12.
 * @author      : smlee1@kyobobook.com
 * @description : Controller 에서 throw 한 Exception 의 공통 처리
 */
public class ControllerExceptionHandler {
    
    private static final Logger logger = LoggerFactory.getLogger(ControllerExceptionHandler.class);
 
    /**
     * @Method      : handlException
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : 모든 Exception을 핸들링
     * @param e
     */
    @ExceptionHandler({Exception.class})
    public void handlException(Exception e) {
        logger.error("Exception : ", e);
    }
}
