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
package kyobobook.application.biz.user.port.in;

import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.user.UserInfo;
import kyobobook.application.domain.user.UserRole;

/**
 * @Project     : common-prototype-api
 * @FileName    : UserInfoPort.java
 * @Date        : 2021. 9. 15.
 * @author      : smlee1@kyobobook.com
 * @description : 회원 정보 처리 관련 Inbound Adapter 에서 Service 접근하기 위한 Port
 */
public interface UserInfoInPort {

    /**
     * @Method      : getUserInfo
     * @Date        : 2021. 9. 15.
     * @author      : smlee1@kyobobook.com
     * @description : 회원 정보를 조회 한다.
     * @param id - 회원 아이디
     * @return - 회원 정보 {@link UserInfo}
     */
    ResponseMessage getUserInfo(String id);
    
    /**
     * @Method      : getUserInfoAndRoles
     * @Date        : 2021. 9. 16.
     * @author      : smlee1@kyobobook.com
     * @description : 회원 정보와 권한 목록을 조회 한다.
     * @param id - 회원 아이디
     * @return - 회원정보 {@link ResponseMessage}
     */
    ResponseMessage getUserInfoAndRoles(String id);
    
    /**
     * @Method      : insertUserInfo
     * @Date        : 2021. 9. 15.
     * @author      : smlee1@kyobobook.com
     * @description : 회원 정보를 등록한다.
     * @param userInfo - {@link UserInfo}
     * @return int - 등록 건수
     */
    ResponseMessage insertUserInfo(UserInfo userInfo);
    
    /**
     * @Method      : insertUserRole
     * @Date        : 2021. 9. 16.
     * @author      : smlee1@kyobobook.com
     * @description : 회원 권한 정보를 등록한다.
     * @param userRole - {@link UserRole}
     * @return - {@link ResponseMessage}
     */
    ResponseMessage insertUserRole(UserRole userRole);
    
    /**
     * @Method      : insertUserInfoAndRoles
     * @Date        : 2021. 9. 16.
     * @author      : smlee1@kyobobook.com
     * @description : 회원 정보 및 권한 정보를 신규 등록한다.
     * @param userInfo - {@link UserInfo}
     * @return - {@link ResponseMessage}
     */
    ResponseMessage insertUserInfoAndRoles(UserInfo userInfo);
}
