/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 9. 15.
 *
 ****************************************************/
package kyobobook.application.biz.user.port.out;

import kyobobook.application.domain.user.UserInfo;
import kyobobook.application.domain.user.UserRole;

/**
 * @Project     : common-prototype-api
 * @FileName    : ProductPersistencePort.java
 * @Date        : 2021. 9. 15.
 * @author      : smlee1@kyobobook.com
 * @description : TEC01-32 Service Mesh 연동 구성 Prototype : Database 처리를 위한 Port
 */
public interface UserInfoPersistenceOutPort {

    /**
     * @Method      : getUserInfo
     * @Date        : 2021. 9. 15.
     * @author      : smlee1@kyobobook.com
     * @description : 회원 정보를 조회 한다. 
     * @param id - 회원 아이디
     * @return - 회원 정보 {@link UserInfo}
     * @throws Exception
     */
    UserInfo getUserInfo(String id) throws Exception;
    
    /**
     * @Method      : getUserInfoAndRoles
     * @Date        : 2021. 9. 15.
     * @author      : smlee1@kyobobook.com
     * @description : 회원 정보와 권한 목록을 조회 한다. 
     * @param id - 회원 아이디
     * @return - 회원 정보 {@link UserInfo}
     * @throws Exception
     */
    UserInfo getUserInfoAndRoles(String id) throws Exception;

    /**
     * @Method      : insertUserInfo
     * @Date        : 2021. 9. 15.
     * @author      : smlee1@kyobobook.com
     * @description : 회원 정보를 등록한다. 
     * @param userInfo - {@link UserInfo}
     * @return int - 등록 건수
     * @throws Exception
     */
    int insertUserInfo(UserInfo userInfo) throws Exception;
    
    /**
     * @Method      : insertUserRole
     * @Date        : 2021. 9. 16.
     * @author      : smlee1@kyobobook.com
     * @description : 회원 권한 정보를 등록한다.
     * @param userRole - {@link UserRole}
     * @return int - 등록 건수
     * @throws Exception
     */
    int insertUserRole(UserRole userRole) throws Exception;
}
