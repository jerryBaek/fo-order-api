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
package kyobobook.application.adapter.in.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kyobobook.application.biz.user.port.in.UserInfoInPort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.user.UserInfo;

/**
 * @Project     : common-prototype-api
 * @FileName    : RestUserInfoController.java
 * @Date        : 2021. 9. 15.
 * @author      : smlee1@kyobobook.com
 * @description : TEC01-38 Redis 활용 SSO/SLO Prototype, 회원 관련 Rest Controller
 */
@Api(tags = "RestSampleController")
@RestController
@RequestMapping("/userInfo")
public class RestUserInfoController {

    private static final Logger logger = LoggerFactory.getLogger(RestUserInfoController.class);
    
    private final UserInfoInPort userInfoPort;
    
    public RestUserInfoController(UserInfoInPort userInfoPort) {
        this.userInfoPort = userInfoPort;
    }
    
    /**
     * @Method      : getUserInfo
     * @Date        : 2021. 9. 15.
     * @author      : smlee1@kyobobook.com
     * @description : 회원 정보 상세 조회
     * @param id - 회원 아이디
     * @return {@link ResponseMessage}
     */
    @ApiOperation("회원 정보 상세 조회")
    @GetMapping(value = "/user/{id}")
    public ResponseMessage getUserInfo(@PathVariable String id) {
        return userInfoPort.getUserInfo(id);
    }
    
    /**
     * @Method      : getUserInfoAndRoles
     * @Date        : 2021. 9. 16.
     * @author      : smlee1@kyobobook.com
     * @description : 회원 정보와 권한 목록을 조회 한다.
     * @param id - 회원 아이디
     * @return {@link ResponseMessage}
     */
    @ApiOperation("회원 정보와 권한 목록을 조회")
    @GetMapping(value = "/user/{id}/roles")
    public ResponseMessage getUserInfoAndRoles(@PathVariable String id) {
        return userInfoPort.getUserInfoAndRoles(id);
    }
    
    /**
     * @Method      : insertUserInfo
     * @Date        : 2021. 9. 15.
     * @author      : smlee1@kyobobook.com
     * @description : 회원 정보 신규 등록
     * @param userInfo - {@link UserInfo}
     * @return {@link ResponseMessage}
     */
    @ApiOperation("회원 정보 신규 등록")
    @PostMapping(value = "/user")
    public ResponseMessage insertUserInfo(@RequestBody UserInfo userInfo) {
        return userInfoPort.insertUserInfoAndRoles(userInfo);
    }
}
