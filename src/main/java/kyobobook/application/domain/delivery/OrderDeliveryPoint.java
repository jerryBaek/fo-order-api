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

import java.math.BigInteger;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kyobobook.application.domain.common.OrderMemo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project : fo-order-api
 * @FileName : OrderDeliveryPoint.java
 * @Date : 2022. 1. 6.
 * @author : kimsehoon@kyobobook.com
 * @description : 주문배송지
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "주문배송지")
public class OrderDeliveryPoint {

    /** 주문배송지ID */
    @ApiModelProperty(required = true, value = "주문배송지ID", example = "")
    private String ordrDlpnId;
    /** 회원번호 */
    @ApiModelProperty(required = true, value = "회원번호", example = "")
    private String mmbrNum;
    /** 배송지명 */
    @ApiModelProperty(required = true, value = "배송지명", example = "")
    private String dlpnName;
    /** 수취인명 */
    @ApiModelProperty(required = true, value = "수취인명", example = "")
    private String rcvrName;
    /** 수취인전화번호 */
    @ApiModelProperty(required = true, value = "수취인전화번호", example = "")
    private String rcvrTlnm;
    /** 수취인휴대전화번호 */
    @ApiModelProperty(required = true, value = "수취인휴대전화번호", example = "")
    private String rcvrPrtbTlnm;
    /** 배송방법구분코드 */
    @ApiModelProperty(required = true, value = "배송방법구분코드", example = "")
    private String dlvrMthdDvsnCode;
    /** 수령지점코드 */
    @ApiModelProperty(required = true, value = "수령지점코드", example = "")
    private String rcptBranCode;
    /** 재고지점코드 */
    @ApiModelProperty(required = true, value = "재고지점코드", example = "")
    private String invnBranCode;
    /** 해외택배사코드 */
    @ApiModelProperty(required = true, value = "해외택배사코드", example = "")
    private String frngDscmCode;
    /** 배송주소구분코드 */
    @ApiModelProperty(required = true, value = "배송주소구분코드", example = "")
    private String dlvrAdrsDvsnCode;
    /** 상세주소1 */
    @ApiModelProperty(required = true, value = "상세주소1", example = "")
    private String dtlAdrs1;
    /** 상세주소2 */
    @ApiModelProperty(required = true, value = "상세주소2", example = "")
    private String dtlAdrs2;
    /** 상세주소3 */
    @ApiModelProperty(required = true, value = "상세주소3", example = "")
    private String dtlAdrs3;
    /** 상세주소4 */
    @ApiModelProperty(required = true, value = "상세주소4", example = "")
    private String dtlAdrs4;
    /** 상세주소5 */
    @ApiModelProperty(required = true, value = "상세주소5", example = "")
    private String dtlAdrs5;
    /** 상세주소6 */
    @ApiModelProperty(required = true, value = "상세주소6", example = "")
    private String dtlAdrs6;
    /** 상세주소7 */
    @ApiModelProperty(required = true, value = "상세주소7", example = "")
    private String dtlAdrs7;
    /** 상세주소8 */
    @ApiModelProperty(required = true, value = "상세주소8", example = "")
    private String dtlAdrs8;
    /** 상세주소9 */
    @ApiModelProperty(required = true, value = "상세주소9", example = "")
    private String dtlAdrs9;
    /** 상세주소10 */
    @ApiModelProperty(required = true, value = "상세주소10", example = "")
    private String dtlAdrs10;
    /** 상세주소11 */
    @ApiModelProperty(required = true, value = "상세주소11", example = "")
    private String dtlAdrs11;
    /** 상세주소12 */
    @ApiModelProperty(required = true, value = "상세주소12", example = "")
    private String dtlAdrs12;
    /** 주문ID */
    @ApiModelProperty(required = true, value = "주문ID", example = "")
    private String ordrId;
    /** 주문순번 */
    @ApiModelProperty(required = true, value = "주문순번", example = "")
    private BigInteger ordrSrmb;
    /** 선물영수증가격노출여부 */
    @ApiModelProperty(required = true, value = "선물영수증가격노출여부", example = "")
    private String gftRecpPricExprYsno;
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
