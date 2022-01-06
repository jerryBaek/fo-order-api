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
 * @FileName : UnifyCommodity.java
 * @Date : 2022. 1. 6.
 * @author : kimsehoon@kyobobook.com
 * @description : 통합상품
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "통합상품")
public class UnifyCommodity {

    /** 판매상품ID */
    @ApiModelProperty(required = true, value = "판매상품ID", example = "")
    private String saleCmdtid;
    /** 판매상품그룹구분코드 */
    @ApiModelProperty(required = true, value = "판매상품그룹구분코드", example = "")
    private String saleCmdtGrpDvsnCode;
    /** 판매상품구분코드 */
    @ApiModelProperty(required = true, value = "판매상품구분코드", example = "")
    private String saleCmdtDvsnCode;
    /** 판매상품분류코드 */
    @ApiModelProperty(required = true, value = "판매상품분류코드", example = "")
    private String saleCmdtClstCode;
    /** 상품분류코드 */
    @ApiModelProperty(required = true, value = "상품분류코드", example = "")
    private String cmdtClstCode;
    /** 상품코드 */
    @ApiModelProperty(required = true, value = "상품코드", example = "")
    private String cmdtcode;
    /** 상품명 */
    @ApiModelProperty(required = true, value = "상품명", example = "")
    private String cmdtName;
    /** 상품상태코드 */
    @ApiModelProperty(required = true, value = "상품상태코드", example = "")
    private String cmdtCdtnCode;
    /** 매입처코드 */
    @ApiModelProperty(required = true, value = "매입처코드", example = "")
    private String vndrCode;
    /** 매입처명 */
    @ApiModelProperty(required = true, value = "매입처명", example = "")
    private String vndrName;
    /** 세트수 */
    @ApiModelProperty(required = true, value = "세트수", example = "")
    private BigInteger setQty;
    /** 쿠폰여부 */
    @ApiModelProperty(required = true, value = "쿠폰여부", example = "")
    private String cpnYsno;
    /** 해외판매금지여부 */
    @ApiModelProperty(required = true, value = "해외판매금지여부", example = "")
    private String frngSalePrhbYsno;
    /** 소득공제대상여부 */
    @ApiModelProperty(required = true, value = "소득공제대상여부", example = "")
    private String incmDdctTrgtYsno;
    /** 도서정가제여부 */
    @ApiModelProperty(required = true, value = "도서정가제여부", example = "")
    private String fbpYsno;
    /** 무료배송여부 */
    @ApiModelProperty(required = true, value = "무료배송여부", example = "")
    private String freeDlvrYsno;
    /** 판매제한여부 */
    @ApiModelProperty(required = true, value = "판매제한여부", example = "")
    private String saleLmttYsno;
    /** 판매금지여부 */
    @ApiModelProperty(required = true, value = "판매금지여부", example = "")
    private String salePrhbYsno;
    /** 금지연령 */
    @ApiModelProperty(required = true, value = "금지연령", example = "")
    private String prhbAge;
    /** 과세구분코드 */
    @ApiModelProperty(required = true, value = "과세구분코드", example = "")
    private String txtnDvsnCode;
    /** 화폐단위코드 */
    @ApiModelProperty(required = true, value = "화폐단위코드", example = "")
    private String curnUntCode;
    /** 정가 */
    @ApiModelProperty(required = true, value = "정가", example = "")
    private BigInteger prce;
    /** 할인율 */
    @ApiModelProperty(required = true, value = "할인율", example = "")
    private BigInteger dscnRate;
    /** 할인금액 */
    @ApiModelProperty(required = true, value = "할인금액", example = "")
    private BigInteger dscnAmnt;
    /** 적립율 */
    @ApiModelProperty(required = true, value = "적립율", example = "")
    private BigInteger acmlRate;
    /** 적립금액 */
    @ApiModelProperty(required = true, value = "적립금액", example = "")
    private BigInteger acmlAmnt;
    /** 매입율 */
    @ApiModelProperty(required = true, value = "매입율", example = "")
    private BigInteger byngRate;
    /** 노출시작일시 */
    @ApiModelProperty(required = true, value = "노출시작일시", example = "")
    private LocalDateTime exprSttgDttm;
    /** 노출종료일시 */
    @ApiModelProperty(required = true, value = "노출종료일시", example = "")
    private LocalDateTime exprEndDttm;
    /** 판매시작일시 */
    @ApiModelProperty(required = true, value = "판매시작일시", example = "")
    private String saleSttgDttm;
    /** 판매종료일시 */
    @ApiModelProperty(required = true, value = "판매종료일시", example = "")
    private String saleEndDttm;
    /** 입점사상품구분코드 */
    @ApiModelProperty(required = true, value = "입점사상품구분코드", example = "")
    private String enbsCmdtDvsnCode;
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
