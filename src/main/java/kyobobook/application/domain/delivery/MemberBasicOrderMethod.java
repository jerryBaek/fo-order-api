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
package kyobobook.application.domain.delivery;

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
 * @FileName : MemberBasicOrderMethod.java
 * @Date : 2022. 1. 6.
 * @author : kimsehoon@kyobobook.com
 * @description : 회원기본주문방법
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "회원기본주문방법")
public class MemberBasicOrderMethod {

    /** 회원번호 */
    @ApiModelProperty(required = true, value = "회원번호", example = "")
    private String mmbrNum;
    /** 회원기본주문방법구분코드 */
    @ApiModelProperty(required = true, value = "회원기본주문방법구분코드", example = "")
    private String mmbrBscOrdrMthdDvsnCode;
    /** 방법내용1 */
    @ApiModelProperty(required = true, value = "방법내용1", example = "")
    private String mthdCntt1;
    /** 방법내용2 */
    @ApiModelProperty(required = true, value = "방법내용2", example = "")
    private String mthdCntt2;
    /** 방법내용3 */
    @ApiModelProperty(required = true, value = "방법내용3", example = "")
    private String mthdCntt3;
    /** 방법내용4 */
    @ApiModelProperty(required = true, value = "방법내용4", example = "")
    private String mthdCntt4;
    /** 방법내용5 */
    @ApiModelProperty(required = true, value = "방법내용5", example = "")
    private String mthdCntt5;
    /** 방법내용6 */
    @ApiModelProperty(required = true, value = "방법내용6", example = "")
    private String mthdCntt6;
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
