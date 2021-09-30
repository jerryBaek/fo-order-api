/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 9. 15.  First Draft.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.user;

import kyobobook.application.adapter.out.persistence.user.entity.UserInfoEntity;
import kyobobook.application.domain.user.UserInfo;
import kyobobook.config.annotation.ReaderInterface;

/**
 * @Project     : common-prototype-api
 * @FileName    : ProductReaderMapper.java
 * @Date        : 2021. 9. 15.
 * @author      : smlee1@kyobobook.com
 * @description : TEC01-38 Redis 활용 SSO/SLO Prototype, Reader Database Mapper
 */
@ReaderInterface
public interface UserInfoReaderMapper {
    
    /**
     * @Method      : getUserInfo
     * @Date        : 2021. 9. 15.
     * @author      : smlee1@kyobobook.com
     * @description : 회원 정보를 조회 한다.
     * @param id - 회원 아이디
     * @return - {@link UserInfo}
     */
    UserInfoEntity getUserInfo(String id);
    
    /**
     * @Method      : getUserInfoAndRoles
     * @Date        : 2021. 9. 16.
     * @author      : smlee1@kyobobook.com
     * @description : 회원 정보와 권한 목록을 조회 한다.
     * @param id - 회원 아이디
     * @return - {@link UserInfo}
     */
    UserInfoEntity getUserInfoAndRoles(String id);
}
