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

import java.math.BigInteger;
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
 * @FileName : CommonCode.java
 * @Date : 2022. 1. 6.
 * @author : kimsehoon@kyobobook.com
 * @description : 공통코드상세
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "공통코드상세")
public class CommonCodeDetail {

    /** 코드ID */
    @ApiModelProperty(required = true, value = "코드ID", example = "")
    private String codeId;
    /** 코드값 */
    @ApiModelProperty(required = true, value = "코드값", example = "")
    private String codeWrth;
    /** 코드값명 */
    @ApiModelProperty(required = true, value = "코드값명", example = "")
    private String codeWrthName;
    /** 코드값설명 */
    @ApiModelProperty(required = true, value = "코드값설명", example = "")
    private String codeWrthDscr;
    /** 우선순위 */
    @ApiModelProperty(required = true, value = "우선순위", example = "")
    private BigInteger prrtRnkn;
    /** 특기내용 */
    @ApiModelProperty(required = true, value = "특기내용", example = "")
    private String spabCntt;
    /** 적용시작일자 */
    @ApiModelProperty(required = true, value = "적용시작일자", example = "")
    private String aplSttgDate;
    /** 적용종료일자 */
    @ApiModelProperty(required = true, value = "적용종료일자", example = "")
    private String aplEndDate;
    /** 코드값명1 */
    @ApiModelProperty(required = true, value = "코드값명1", example = "")
    private String codeWrthName1;
    /** 코드값명2 */
    @ApiModelProperty(required = true, value = "코드값명2", example = "")
    private String codeWrthName2;
    /** 코드값명3 */
    @ApiModelProperty(required = true, value = "코드값명3", example = "")
    private String codeWrthName3;
    /** 생성자id */
    @ApiModelProperty(required = true, value = "생성자id", example = "")
    private String crtrId;
    /** 생성일시 */
    @ApiModelProperty(required = true, value = "생성일시", example = "")
    private LocalDateTime cretDttm;
    /** 수정자id */
    @ApiModelProperty(required = true, value = "수정자id", example = "")
    private String amnrId;
    /** 수정일시 */
    @ApiModelProperty(required = true, value = "수정일시", example = "")
    private LocalDateTime amndDttm;
    /** 삭제여부 */
    @ApiModelProperty(required = true, value = "삭제여부", example = "")
    private String dltYsno;

}
