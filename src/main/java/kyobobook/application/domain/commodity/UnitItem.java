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
package kyobobook.application.domain.commodity;

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
 * @FileName : UnifyItem.java
 * @Date : 2022. 1. 6.
 * @author : kimsehoon@kyobobook.com
 * @description : 단위품목
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "단위품목")
public class UnitItem {

    /** 판매상품ID */
    @ApiModelProperty(required = true, value = "판매상품ID", example = "")
    private String saleCmdtid;
    /** 단위품목순번 */
    @ApiModelProperty(required = true, value = "단위품목순번", example = "")
    private BigInteger untItmSrmb;
    /** 단위품목명 */
    @ApiModelProperty(required = true, value = "단위품목명", example = "")
    private String untItmName;
    /** 추가판매금액 */
    @ApiModelProperty(required = true, value = "추가판매금액", example = "")
    private BigInteger adtnSaleAmnt;
    /** 판매가능수량 */
    @ApiModelProperty(required = true, value = "판매가능수량", example = "")
    private BigInteger salePsblQntt;
    /** 식별코드 */
    @ApiModelProperty(required = true, value = "식별코드", example = "")
    private String idnfCode;
    /** 속성명1 */
    @ApiModelProperty(required = true, value = "속성명1", example = "")
    private String attName1;
    /** 속성값1 */
    @ApiModelProperty(required = true, value = "속성값1", example = "")
    private String attWrth1;
    /** 속성명2 */
    @ApiModelProperty(required = true, value = "속성명2", example = "")
    private String FattName2;
    /** 속성값2 */
    @ApiModelProperty(required = true, value = "속성값2", example = "")
    private String attWrth2;
    /** 속성명3 */
    @ApiModelProperty(required = true, value = "속성명3", example = "")
    private String attName3;
    /** 속성값3 */
    @ApiModelProperty(required = true, value = "속성값3", example = "")
    private String attWrth3;
    /** 속성명4 */
    @ApiModelProperty(required = true, value = "속성명4", example = "")
    private String attName4;
    /** 속성값4 */
    @ApiModelProperty(required = true, value = "속성값4", example = "")
    private String attWrth4;
    /** 속성명5 */
    @ApiModelProperty(required = true, value = "속성명5", example = "")
    private String attName5;
    /** 속성값5 */
    @ApiModelProperty(required = true, value = "속성값5", example = "")
    private String attWrth5;
    /** 속성명6 */
    @ApiModelProperty(required = true, value = "속성명6", example = "")
    private String attName6;
    /** 속성값6 */
    @ApiModelProperty(required = true, value = "속성값6", example = "")
    private String attWrth6;
    /** 속성명7 */
    @ApiModelProperty(required = true, value = "속성명7", example = "")
    private String attName7;
    /** 속성값7 */
    @ApiModelProperty(required = true, value = "속성값7", example = "")
    private String attWrth7;
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
