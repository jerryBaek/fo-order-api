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
package kyobobook.application.domain.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Project     : common-prototype-api
 * @FileName    : UserRole.java
 * @Date        : 2021. 9. 15.
 * @author      : smlee1@kyobobook.com
 * @description : TEC01-38 Redis 활용 SSO/SLO Prototype, 회원 권한 정보 Domain 클래스
 */
@ApiModel(value = "회원 권한 정보 domain 클래스", description = "SSO, SLO 테스트를 위한 회원 정보 테이블")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRole {
    
    @ApiModelProperty(value="시퀀스", required=false)
    private int seq;
    
    @ApiModelProperty(value="회원 아이디", required=false)
    private String id;
    
    @ApiModelProperty(value="권한 명", required=false)
    private String name;
}
