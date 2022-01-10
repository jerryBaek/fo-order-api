/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * kimsehoon@kyobobook.com      2022. 1. 6.
 *
 ****************************************************/
package kyobobook.application.domain.barodrim;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project : fo-order-api
 * @FileName : MemberBarodrimReceiptsAndDisbursementsPlace.java
 * @Date : 2022. 1. 6.
 * @author : kimsehoon@kyobobook.com
 * @description : 회원바로드림점포수불처기본
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "회원바로드림점포수불처기본")
public class MemberBarodrimReceiptsAndDisbursementsPlace {

    /** 회원번호 */
    @ApiModelProperty(required = true, value = "회원번호", example = "62210667167")
    private String mmbrNum;
    /** 바로드림점포수불처코드 */
    @ApiModelProperty(required = true, value = "바로드림점포수불처코드", example = "1")
    private String brdrStrRdpCode;
    /** 기본바로드림점포여부 */
    @ApiModelProperty(required = true, value = "기본바로드림점포여부", example = "Y")
    private String bscBrdrStrYsno;
    /** 생성자ID */
    @ApiModelProperty(required = true, value = "생성자ID", example = "")
    private String crtrId;
    /** 생성일시 */
    @ApiModelProperty(required = true, value = "생성일시", example = "")
    private LocalDateTime cretDttm;
    /** 수정자ID */
    @ApiModelProperty(required = true, value = "수정자ID", example = "")
    private String amnrId;
    /** 수정일시 */
    @ApiModelProperty(required = true, value = "수정일시", example = "")
    private LocalDateTime amndDttm;
    /** 삭제여부 */
    @ApiModelProperty(required = true, value = "삭제여부", example = "")
    private String dltYsno;

}
