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
package kyobobook.application.domain.commoncode;

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
 * @FileName : OrderPolicyCodeDetail.java
 * @Date : 2022. 1. 6.
 * @author : kimsehoon@kyobobook.com
 * @description : 주묹정책코드상세
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "주묹정책코드상세")
public class OrderPolicyCodeDetail {

    /** 코드ID */
    @ApiModelProperty(required = true, value = "코드ID", example = "")
    private String codeId;
    /** 코드값 */
    @ApiModelProperty(required = true, value = "코드값", example = "")
    private String codeWrth;
    /** 비고1 */
    @ApiModelProperty(required = true, value = "비고1", example = "")
    private String rmrk1;
    /** 비고2 */
    @ApiModelProperty(required = true, value = "비고2", example = "")
    private String rmrk2;
    /** 비고3 */
    @ApiModelProperty(required = true, value = "비고3", example = "")
    private String rmrk3;
    /** 비고4 */
    @ApiModelProperty(required = true, value = "비고4", example = "")
    private String rmrk4;
    /** 비고5 */
    @ApiModelProperty(required = true, value = "비고5", example = "")
    private String rmrk5;
    /** 비고6 */
    @ApiModelProperty(required = true, value = "비고6", example = "")
    private String rmrk6;
    /** 비고7 */
    @ApiModelProperty(required = true, value = "비고7", example = "")
    private String rmrk7;
    /** 비고8 */
    @ApiModelProperty(required = true, value = "비고8", example = "")
    private String rmrk8;
    /** 비고9 */
    @ApiModelProperty(required = true, value = "비고9", example = "")
    private String rmrk9;
    /** 비고10 */
    @ApiModelProperty(required = true, value = "비고10", example = "")
    private String rmrk10;
    /** 비고11 */
    @ApiModelProperty(required = true, value = "비고11", example = "")
    private String rmrk11;
    /** 비고12 */
    @ApiModelProperty(required = true, value = "비고12", example = "")
    private String rmrk12;
    /** 비고13 */
    @ApiModelProperty(required = true, value = "비고13", example = "")
    private String rmrk13;
    /** 비고14 */
    @ApiModelProperty(required = true, value = "비고14", example = "")
    private String rmrk14;
    /** 비고15 */
    @ApiModelProperty(required = true, value = "비고15", example = "")
    private String rmrk15;
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
