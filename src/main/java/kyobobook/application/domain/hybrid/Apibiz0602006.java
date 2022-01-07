/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * seohee.ko@kyobobook.com      2021. 11. 9.
 *
 ****************************************************/
package kyobobook.application.domain.hybrid;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kyobobook.application.domain.taxbill.TaxbillMaster;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project : fo-order-api
 * @FileName : TestCart.java
 * @Date : 2022. 1. 6.
 * @author : ymahn@kyobobook.com
 * @description : API-BIZ06-02-006
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "API-BIZ06-02-006")
public class Apibiz0602006 {

    // cart
    /** 장바구니ID */
    @ApiModelProperty(required = true, value = "장바구니ID", example = "B19055055A03")
    private String spbkId;
    /** 장바구니구분코드 */
    @ApiModelProperty(required = true, value = "장바구니구분코드", example = "2")
    private String spbkDvsnCode;
    /** 장바구니종류코드 */
    @ApiModelProperty(required = true, value = "장바구니종류코드", example = "10")
    private String spbkKindCode;
    /** 판매상품id */
    @ApiModelProperty(required = true, value = "판매상품id", example = "C160000284150")
    private String saleCmdtid;
    /** 단위품목순번 */
    @ApiModelProperty(required = false, value = "단위품목순번", example = "1")
    private BigInteger untItmSrmb;
    /** 요청수량 */
    @ApiModelProperty(required = false, value = "요청수량", example = "2")
    private BigInteger requQntt;
    /** 종료일시 */
    @ApiModelProperty(required = false, value = "종료일시", example = "2022-01-06 14:31")
    private LocalDateTime endDttm;
    /** 사은품여부 */
    @ApiModelProperty(required = false, value = "사은품여부", example = "Y")
    private String frbeYsno;
    /** 본판매상품id */
    @ApiModelProperty(required = false, value = "본판매상품id", example = "C160000284150")
    private String orglSaleCmdtid;
    /** 바로드림지점코드 */
    @ApiModelProperty(required = false, value = "바로드림지점코드", example = "BARO001")
    private String brdrBranCode;
    /** 링크구분코드 */
    @ApiModelProperty(required = false, value = "링크구분코드", example = "LGB001")
    private String linkDvsnCode;
    /** 상품분류코드 */
    @ApiModelProperty(required = false, value = "상품분류코드", example = "PGB001")
    private String cmdtClstCode;
    /** 섹션코드 */
    @ApiModelProperty(required = false, value = "섹션코드", example = "S001")
    private String sctnCode;
    /** 체크여부 */
    @ApiModelProperty(required = false, value = "체크여부", example = "Y")
    private String chekYsno;
    /** 부가주문내용 */
    @ApiModelProperty(required = false, value = "부가주문내용", example = "없음")
    private String addtOrdrCntt;
    /** 인쇄내용 */
    @ApiModelProperty(required = false, value = "인쇄내용", example = "행복하세요")
    private String prinCntt;
    /** 결합판매상품id */
    @ApiModelProperty(required = false, value = "결합판매상품id", example = "C160000284151")
    private String combSaleCmdtid;
    
    // UnifyCommodity
    /** 판매상품그룹구분코드 */
    @ApiModelProperty(required = false, value = "판매상품그룹구분코드", example = "SPGGB001")
    private String saleCmdtGrpDvsnCode;
    /** 판매상품구분코드 */
    @ApiModelProperty(required = false, value = "판매상품구분코드", example = "SPGB001")
    private String saleCmdtDvsnCode;
    /** 판매상품분류코드 */
    @ApiModelProperty(required = false, value = "판매상품분류코드", example = "SPD001")
    private String saleCmdtClstCode;
    /** 상품코드 */
    @ApiModelProperty(required = false, value = "상품코드", example = "9790000000000")
    private String cmdtcode;
    /** 상품명 */
    @ApiModelProperty(required = false, value = "상품명", example = "어떻게 살 것인가")
    private String cmdtName;
    /** 상품상태코드 */
    @ApiModelProperty(required = false, value = "상품상태코드", example = "PST001")
    private String cmdtCdtnCode;
    /** 매입처코드 */
    @ApiModelProperty(required = false, value = "매입처코드", example = "M001")
    private String vndrCode;
    /** 매입처명 */
    @ApiModelProperty(required = false, value = "매입처명", example = "아트박스")
    private String vndrName;
    /** 세트수 */
    @ApiModelProperty(required = false, value = "세트수", example = "3")
    private BigInteger setQty;
    /** 쿠폰여부 */
    @ApiModelProperty(required = false, value = "쿠폰여부", example = "Y")
    private String cpnYsno;
    /** 해외판매금지여부 */
    @ApiModelProperty(required = false, value = "해외판매금지여부", example = "N")
    private String frngSalePrhbYsno;
    /** 소득공제대상여부 */
    @ApiModelProperty(required = false, value = "소득공제대상여부", example = "Y")
    private String incmDdctTrgtYsno;
    /** 도서정가제여부 */
    @ApiModelProperty(required = false, value = "도서정가제여부", example = "Y")
    private String fbpYsno;
    /** 무료배송여부 */
    @ApiModelProperty(required = false, value = "무료배송여부", example = "N")
    private String freeDlvrYsno;
    /** 금지연령 */
    @ApiModelProperty(required = false, value = "금지연령", example = "15")
    private String prhbAge;
    /** 과세구분코드 */
    @ApiModelProperty(required = false, value = "과세구분코드", example = "TAXGB001")
    private String txtnDvsnCode;
    /** 화폐단위코드 */
    @ApiModelProperty(required = false, value = "화폐단위코드", example = "CU001")
    private String curnUntCode;
    /** 정가 */
    @ApiModelProperty(required = false, value = "정가", example = "19000")
    private BigInteger prce;
    /** 할인율 */
    @ApiModelProperty(required = false, value = "할인율", example = "10")
    private BigInteger dscnRate;
    /** 할인금액 */
    @ApiModelProperty(required = false, value = "할인금액", example = "19000")
    private BigInteger dscnAmnt;
    /** 적립율 */
    @ApiModelProperty(required = false, value = "적립율", example = "5")
    private BigInteger acmlRate;
    /** 적립금액 */
    @ApiModelProperty(required = false, value = "적립금액", example = "500")
    private BigInteger acmlAmnt;
    /** 매입율 */
    @ApiModelProperty(required = false, value = "매입율", example = "50")
    private BigInteger byngRate;
    /** 입점사상품구분코드 */
    @ApiModelProperty(required = false, value = "입점사상품구분코드", example = "")
    private String enbsCmdtDvsnCode;
    
    // UnitItem
    /** 단위품목명 */
    @ApiModelProperty(required = false, value = "단위품목명", example = "단위품목1")
    private String untItmName;
    /** 추가판매금액 */
    @ApiModelProperty(required = false, value = "추가판매금액", example = "1000")
    private BigInteger adtnSaleAmnt;
    /** 판매가능수량 */
    @ApiModelProperty(required = false, value = "판매가능수량", example = "10000")
    private BigInteger salePsblQntt;
    /** 식별코드 */
    @ApiModelProperty(required = false, value = "식별코드", example = "DC001")
    private String idnfCode;
    /** 속성명1 */
    @ApiModelProperty(required = false, value = "속성명1", example = "color")
    private String attName1;
    /** 속성값1 */
    @ApiModelProperty(required = false, value = "속성값1", example = "red")
    private String attWrth1;
    /** 속성명2 */
    @ApiModelProperty(required = false, value = "속성명2", example = "size")
    private String FattName2;
    /** 속성값2 */
    @ApiModelProperty(required = false, value = "속성값2", example = "50")
    private String attWrth2;
    /** 속성명3 */
    @ApiModelProperty(required = false, value = "속성명3", example = "atr3")
    private String attName3;
    /** 속성값3 */
    @ApiModelProperty(required = false, value = "속성값3", example = "aa")
    private String attWrth3;
    /** 속성명4 */
    @ApiModelProperty(required = false, value = "속성명4", example = "atr4")
    private String attName4;
    /** 속성값4 */
    @ApiModelProperty(required = false, value = "속성값4", example = "bb")
    private String attWrth4;
    /** 속성명5 */
    @ApiModelProperty(required = false, value = "속성명5", example = "atr5")
    private String attName5;
    /** 속성값5 */
    @ApiModelProperty(required = false, value = "속성값5", example = "dd")
    private String attWrth5;
    /** 속성명6 */
    @ApiModelProperty(required = false, value = "속성명6", example = "atr6")
    private String attName6;
    /** 속성값6 */
    @ApiModelProperty(required = false, value = "속성값6", example = "ee")
    private String attWrth6;
    /** 속성명7 */
    @ApiModelProperty(required = false, value = "속성명7", example = "atr7")
    private String attName7;
    /** 속성값7 */
    @ApiModelProperty(required = false, value = "속성값7", example = "ff")
    private String attWrth7;
    
    @ApiModelProperty(value="Apibiz0602006 목록", required=false)
    private List<Apibiz0602006> Apibiz0602006List;
}
