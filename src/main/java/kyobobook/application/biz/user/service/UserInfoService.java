/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com      2021. 9. 15.
 *
 ****************************************************/
package kyobobook.application.biz.user.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import kyobobook.application.biz.user.port.in.UserInfoInPort;
import kyobobook.application.biz.user.port.out.UserInfoPersistenceOutPort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.user.UserInfo;
import kyobobook.application.domain.user.UserRole;
import kyobobook.exception.BizRuntimeException;

/**
 * @Project     : common-prototype-api
 * @FileName    : UserInfoService.java
 * @Date        : 2021. 9. 15.
 * @author      : smlee1@kyobobook.com
 * @description : TEC01-38 Redis 활용 SSO/SLO Prototype, 회원 정보 관리(조회, 등록...) Service
 */
@Service
public class UserInfoService implements UserInfoInPort {
    private static final Logger logger = LoggerFactory.getLogger(UserInfoService.class);
    
    private final UserInfoPersistenceOutPort userInfoPersistencePort;
    
    private final MessageSourceAccessor messageSource;
    
    public UserInfoService(
            MessageSourceAccessor messageSource
            , UserInfoPersistenceOutPort userInfoPersistencePort) {
        this.messageSource = messageSource;
        this.userInfoPersistencePort = userInfoPersistencePort;
    }

    @Override
    public ResponseMessage getUserInfo(String id) {
        ResponseMessage responseMessage = null;
        
        try {
            responseMessage = ResponseMessage.builder()
                    .data(userInfoPersistencePort.getUserInfo(id))
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete"))
                    .build();
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        
        return responseMessage;
    }

    @Override
    public ResponseMessage getUserInfoAndRoles(String id) {
        ResponseMessage responseMessage = null;
        
        try {
            responseMessage = ResponseMessage.builder()
                    .data(userInfoPersistencePort.getUserInfoAndRoles(id))
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete"))
                    .build();
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        
        return responseMessage;
    }
    
    @Override
    public ResponseMessage insertUserInfo(UserInfo userInfo) {
        ResponseMessage responseMessage = null;
        
        try {
            int insertCnt = userInfoPersistencePort.insertUserInfo(userInfo);
            responseMessage = ResponseMessage.builder()
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete.cnt", new Integer[] {insertCnt}))
                    .build();
            
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        
        return responseMessage;
    }

    @Override
    public ResponseMessage insertUserRole(UserRole userRole) {
        ResponseMessage responseMessage = null;
        
        try {
            int insertCnt = userInfoPersistencePort.insertUserRole(userRole);
            responseMessage = ResponseMessage.builder()
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage(messageSource.getMessage("common.process.complete.cnt", new Integer[] {insertCnt}))
                    .build();
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        
        return responseMessage;
    }

    @Override
    public ResponseMessage insertUserInfoAndRoles(UserInfo userInfo) {
        
        ResponseMessage responseInfoMessage = null;
        try {
            responseInfoMessage = this.insertUserInfo(userInfo);
            
            if(responseInfoMessage.getStatusCode() == HttpStatus.OK.value()) {
                
                List<String> roles = userInfo.getRoles();
                roles.forEach(role -> {
                    ResponseMessage responseRoleMessage = this.insertUserRole(UserRole.builder()
                            .id(userInfo.getId())
                            .name(role)
                            .build());
                    
                    if(responseRoleMessage.getStatusCode() != HttpStatus.OK.value()) {
                        throw new BizRuntimeException(messageSource.getMessage("common.process.error"));
                    }
                });
            }
        } catch(BizRuntimeException bre) {
            throw bre;
        } catch(Exception e) {
            throw new BizRuntimeException(messageSource.getMessage("common.process.error"), e);
        }
        
        return responseInfoMessage;
    }

}
