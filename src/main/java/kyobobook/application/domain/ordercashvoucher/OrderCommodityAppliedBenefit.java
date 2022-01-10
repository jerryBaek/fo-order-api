/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * seohee.ko@kyobobook.com      2022. 1. 6.
 *
 ****************************************************/
package kyobobook.application.domain.ordercashvoucher;

import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project     : fo-order-api
 * @FileName    : OrderCommodityAppliedBenefit.java
 * @Date        : 2022. 1. 6.
 * @author      : seohee.ko@kyobobook.com
 * @description :
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "주문상품적용혜택")
public class OrderCommodityAppliedBenefit {

    /** 주문ID */
    @ApiModelProperty(required = true, value = "주문ID", example = "")
    private String ordrId;
    /** 주문상품순번 */
    @ApiModelProperty(required = true, value = "주문상품순번", example = "")
    private String ordrCmdtSrmb;
    /** 적용혜택순번 */
    @ApiModelProperty(required = true, value = "적용혜택순번", example = "")
    private String apbnSrmb;
    /** 적용혜택이력순번 */
    @ApiModelProperty(required = true, value = "적용혜택이력순번", example = "")
    private String apbnHstrSrmb;
    /** 적용여부 */
    @ApiModelProperty(required = true, value = "적용여부", example = "")
    private String aplYsno;
    /** 적용주문순번 */
    @ApiModelProperty(required = true, value = "적용주문순번", example = "")
    private String aplOrdrSrmb;
    /** 취소주문순번 */
    @ApiModelProperty(required = true, value = "취소주문순번", example = "")
    private String cnclOrdrSrmb;
    /** 쿠폰복원여부 */
    @ApiModelProperty(required = true, value = "쿠폰복원여부", example = "")
    private String cpnRstrYsno;
    /** 주문혜택적용구분코드 */
    @ApiModelProperty(required = true, value = "주문혜택적용구분코드", example = "")
    private String ordrBnftAplDvsnCode;
    /** 주문혜택적용종류코드 */
    @ApiModelProperty(required = true, value = "주문혜택적용종류코드", example = "")
    private String ordrBnftAplKindCode;
    /** 적용률 */
    @ApiModelProperty(required = true, value = "적용률", example = "")
    private String aplRate;
    /** 총적용금액 */
    @ApiModelProperty(required = true, value = "총적용금액", example = "")
    private String ttlAplAmnt;
    /** 주문혜택조건구분코드 */
    @ApiModelProperty(required = true, value = "주문혜택조건구분코드", example = "")
    private String ordrBnftCndtDvsnCode;
    /** 적용조건금액 */
    @ApiModelProperty(required = true, value = "적용조건금액", example = "")
    private String aplCndtAmnt;
    /** 율기준적용여부 */
    @ApiModelProperty(required = true, value = "율기준적용여부", example = "")
    private String rateStnrAplYsno;
    /** 기부번호 */
    @ApiModelProperty(required = true, value = "기부번호", example = "")
    private String dntnNum;
    /** 비용할당대상코드 */
    @ApiModelProperty(required = true, value = "비용할당대상코드", example = "")
    private String expnAssgTrgtCode;
    /** 결제방법코드 */
    @ApiModelProperty(required = true, value = "결제방법코드", example = "")
    private String stlmMthdCode;
    /** 외부적립카드번호 */
    @ApiModelProperty(required = true, value = "외부적립카드번호", example = "")
    private String extrAcmlCardNum;
    /** 총적용수량 */
    @ApiModelProperty(required = true, value = "총적용수량", example = "")
    private String ttlAplQntt;
    /** 최대할인금액 */
    @ApiModelProperty(required = true, value = "최대할인금액", example = "")
    private String mxmmDscnAmnt;
    /** 쿠폰지갑ID */
    @ApiModelProperty(required = true, value = "쿠폰지갑ID", example = "")
    private String cpnWaletId;
    /** 쿠폰ID */
    @ApiModelProperty(required = true, value = "쿠폰ID", example = "")
    private String cpnId;
    /** 외부적립정보 */
    @ApiModelProperty(required = true, value = "외부적립정보", example = "")
    private String extrAcmlInfo;
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
