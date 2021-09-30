/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 *  smlee1@kyobobook.com          2021. 9. 15.  Fist Draft.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.user;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.util.ReflectionUtils;

import kyobobook.application.adapter.out.persistence.user.entity.UserInfoEntity;
import kyobobook.application.adapter.out.persistence.user.entity.UserRoleEntity;
import kyobobook.application.biz.user.port.out.UserInfoPersistenceOutPort;
import kyobobook.application.domain.user.UserInfo;
import kyobobook.application.domain.user.UserRole;

/**
 * @Project     : common-prototype-api
 * @FileName    : UserPersistenceAdapter.java
 * @Date        : 2021. 9. 15.
 * @author      : smlee1@kyobobook.com
 * @description : TEC01-38 Redis 활용 SSO/SLO Prototype, Service에서 Database를 접근하기 위한 Adapter
 */
@Repository("userInfoPersistenceRepository")
public class UserInfoPersistenceAdapter implements UserInfoPersistenceOutPort {
    
    private static final Logger logger = LoggerFactory.getLogger(UserInfoPersistenceAdapter.class);
    
    private final UserInfoWriterMapper userInfoWriterMapper;
    
    private final UserInfoReaderMapper userInfoReaderMapper;
    
    public UserInfoPersistenceAdapter(UserInfoWriterMapper userInfoWriterMapper
            , UserInfoReaderMapper userInfoReaderMapper) {
        this.userInfoWriterMapper = userInfoWriterMapper;
        this.userInfoReaderMapper = userInfoReaderMapper;
    }
    
    @Override
    public UserInfo getUserInfo(String id) throws Exception {
        UserInfoEntity userInfoEntity = userInfoReaderMapper.getUserInfo(id);

        return UserInfo.builder()
                .seq(userInfoEntity.getSeq())
                .id(userInfoEntity.getId())
                .email(userInfoEntity.getEmail())
                .name(userInfoEntity.getName())
                .password(userInfoEntity.getPassword())
                .build();
    }

    @Override
    public UserInfo getUserInfoAndRoles(String id) throws Exception {
        List<String> roles = new ArrayList<String>();
        UserInfoEntity userInfoEntity = userInfoReaderMapper.getUserInfoAndRoles(id);

        if(userInfoEntity == null) {
            return null;
        }
        
        userInfoEntity.getRoles().forEach(role -> roles.add(role));
        return UserInfo.builder()
                .seq(userInfoEntity.getSeq())
                .id(userInfoEntity.getId())
                .name(userInfoEntity.getName())
                .email(userInfoEntity.getEmail())
                .password(userInfoEntity.getPassword())
                .roles(roles)
                .build();
    }
    
    @Override
    public int insertUserInfo(UserInfo userInfo) throws Exception {
        return userInfoWriterMapper.insertUserInfo(UserInfoEntity.builder()
                .id(userInfo.getId())
                .name(userInfo.getName())
                .email(userInfo.getEmail())
                .password(userInfo.getPassword())
                .build());
    }

    @Override
    public int insertUserRole(UserRole userRole) throws Exception {
        return userInfoWriterMapper.insertUserRole(UserRoleEntity.builder()
                .id(userRole.getId())
                .name(userRole.getName())
                .build());
    }

}
