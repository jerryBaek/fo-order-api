/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 9. 15. First Draft.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.user;

import kyobobook.application.adapter.out.persistence.user.entity.UserInfoEntity;
import kyobobook.application.adapter.out.persistence.user.entity.UserRoleEntity;
import kyobobook.config.annotation.WriterInterface;

/**
 * @Project     : common-prototype-api
 * @FileName    : ProductWriterMapper.java
 * @Date        : 2021. 9. 15.
 * @author      : smlee1@kyobobook.com
 * @description : TEC01-38 Redis 활용 SSO/SLO Prototype, Writer Database Mapper
 */
@WriterInterface
public interface UserInfoWriterMapper {
    
    /**
     * @Method      : insertUserInfo
     * @Date        : 2021. 9. 15.
     * @author      : smlee1@kyobobook.com
     * @description : 회원 정보를 신규 등록 
     * @param userInfo - {@link UserInfoEntity}
     * @return - 신규 등록 건수
     */
    int insertUserInfo(UserInfoEntity userInfoEntity);
    
    /**
     * @Method      : insertUserRole
     * @Date        : 2021. 9. 15.
     * @author      : smlee1@kyobobook.com
     * @description : 회원 권한 정보 신규 등록 
     * @param userInfo - {@link UserRoleEntity}
     * @return - 신규 등록 건수
     */
    int insertUserRole(UserRoleEntity userRoleEntity);
}
