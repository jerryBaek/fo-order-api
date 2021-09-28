/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * sykim@kyobobook.com      2021. 9. 2.
 *
 ****************************************************/
package kyobobook.application.adapter.out.eventlog;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import kyobobook.application.biz.common.port.out.CustomEventLogOutPort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.eventlog.EventLog;
import kyobobook.exception.BizRuntimeException;

/**
 * @Project     : common-prototype-api
 * @FileName    : CustomEventLogAdapter.java
 * @Date        : 2021. 9. 3.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-32 Service Mesh 연동 구성 : event log를 처리하는 Adapter
 */
@Service
public class CustomEventLogAdapter implements CustomEventLogOutPort {
    
    private static final Logger logger = LoggerFactory.getLogger(CustomEventLogAdapter.class);
    
    @Value("${spring.application.name}")
    public String applicationName;
    
    private final MongoTemplate mongoTemplate;
    
    private final MessageSourceAccessor messageSource;
    
    public CustomEventLogAdapter(MongoTemplate mongoTemplate
            , MessageSourceAccessor messageSource) {
        
        this.mongoTemplate = mongoTemplate;
        this.messageSource = messageSource;
    }
    
    @Override
    public ResponseMessage selectEventLogs() throws BizRuntimeException {
        
        ResponseMessage responseMessage = null;
        
        Query query = new Query().with(Sort.by(Sort.Direction.DESC, "datetime"));
        
        try {
            List<EventLog> eventLogs = mongoTemplate.find(query, EventLog.class);
            
            responseMessage = ResponseMessage.builder()
                    .data(eventLogs)
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete"))
                    .build();
            
        } catch(Exception e) {
            logger.error(e.getMessage());
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        
        return responseMessage;
    }
    
    @Override
    public ResponseMessage deleteEventLogs() throws BizRuntimeException {
        
        ResponseMessage responseMessage = null;
        
        try {
            
            mongoTemplate.remove(new Query(), "eventLog");
            
            responseMessage = ResponseMessage.builder()
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete"))
                    .build();
            
        } catch(Exception e) {
            logger.error(e.getMessage());
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage insertEventLog(EventLog eventLog) throws BizRuntimeException {
        
        ResponseMessage responseMessage = null;
        
        try {
            mongoTemplate.insert(eventLog);
            
            responseMessage = ResponseMessage.builder()
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete"))
                    .build();
            
        } catch(Exception e) {
            logger.error(e.getMessage());
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        
        return responseMessage;    
    }
    
    @Override
    public ResponseMessage insertEventLog(String msg) throws BizRuntimeException {
        
        ResponseMessage responseMessage = null;
        
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        String dateTime = zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        
        try {
            
            HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
            
            EventLog log = EventLog.builder()
                    .applicationName(applicationName)
                    .clientIP(getIp(request))
                    .datetime(dateTime)
                    .user("Demo-TODO")
                    .msg(msg)
                    .build();
            
            mongoTemplate.insert(log);
            
            responseMessage = ResponseMessage.builder()
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete"))
                    .build();
            
        } catch(Exception e) {
            logger.error(e.getMessage());
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        
        return responseMessage;    
    }
    
    /**
     * @Method      : getIp
     * @Date        : 2021. 9. 10.
     * @author      : sykim@kyobobook.com
     * @description : Remote IP를 조회한다.
     * @param request
     * @return
     */
    private String getIp(HttpServletRequest request) {

        String clientIP = request.getHeader("X-Forwarded-For");
        
        if (!StringUtils.hasText(clientIP)) {
            clientIP =  request.getHeader("Proxy-Client-IP");
        }
        org.springframework.util.StringUtils.hasText(clientIP);
        
        if (!StringUtils.hasText(clientIP)) {
            clientIP =  request.getHeader("HTTP_CLIENT_IP");
        }
        
        if (!StringUtils.hasText(clientIP)) {
            clientIP =  request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        
        if (!StringUtils.hasText(clientIP)) {
            clientIP =  request.getRemoteAddr();
        }
        
        return clientIP ;
    }
}
