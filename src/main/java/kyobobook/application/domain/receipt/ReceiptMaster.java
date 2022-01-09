/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * seohee.ko@kyobobook.com      2022. 1. 5.
 *
 ****************************************************/
package kyobobook.application.domain.receipt;

import java.math.BigInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project     : fo-order-api
 * @FileName    : ReceiptMaster.java
 * @Date        : 2022. 1. 5.
 * @author      : seohee.ko@kyobobook.com
 * @description : 영수증 마스터 도메인
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "영수증 마스터 도메인")
public class ReceiptMaster {
    
    /** 조회기간 시작 */
    @ApiModelProperty(value = "조회기간 시작", example = "20220101")
    private String strtPeriod;
    /** 조회기간 종료 */
    @ApiModelProperty(value = "조회기간 종료", example = "20220105")
    private String endPeriod;

    /** 주문ID */
    @ApiModelProperty(required = true, value = "주문ID", example = "")
    private String ordrId;
    /** 주문순번 */
    @ApiModelProperty(required = true, value = "주문순번", example = "")
    private BigInteger ordrSrmb;
    /** 주문종류코드 */
    @ApiModelProperty(required = true, value = "주문종류코드", example = "")
    private String ordrKindCode;
    /** 온라인주문구분코드 */
    @ApiModelProperty(required = true, value = "온라인주문구분코드", example = "")
    private String onlnOrdrDvsnCode;
    /** 취소원주문순번 */
    @ApiModelProperty(required = true, value = "취소원주문순번", example = "")
    private BigInteger cnclOrigOrdrSrmb;
    /** 주문일자 */
    @ApiModelProperty(required = true, value = "주문일자", example = "")
    private String ordrDate;
    /** 주문시각 */
    @ApiModelProperty(required = true, value = "주문시각", example = "")
    private String ordrHms;
    /** 결제완료일자 */
    @ApiModelProperty(required = true, value = "결제완료일자", example = "")
    private String stlmFnshDate;
    /** 결제완료시각 */
    @ApiModelProperty(required = true, value = "결제완료시각", example = "")
    private String stlmFnshHms;
    /** 주문자명 */
    @ApiModelProperty(required = true, value = "주문자명", example = "")
    private String aordName;
    /** 주문자이메일주소 */
    @ApiModelProperty(required = true, value = "주문자이메일주소", example = "")
    private String aordEmlAdrs;
    
    /** 점포주문ID */
    @ApiModelProperty(required = true, value = "점포주문ID", example = "")
    private String strOrdrId;
    /** 점포주문순번 */
    @ApiModelProperty(required = true, value = "점포주문순번", example = "")
    private String strOrdrSrmb;
    /** 매출반품구분코드 */
    @ApiModelProperty(required = true, value = "매출반품구분코드", example = "")
    private String slsRtgdDvsnCode;
    /** 매출일자 */
    @ApiModelProperty(required = true, value = "매출일자", example = "")
    private String slsDate;
    /** 회원번호 */
    @ApiModelProperty(required = true, value = "회원번호", example = "")
    private String mmbrNum;
    /** POS소유주체구분코드 */
    @ApiModelProperty(required = true, value = "POS소유주체구분코드", example = "")
    private String posOwnMagentDvsnCode;
    /** 점포수불처코드 */
    @ApiModelProperty(required = true, value = "점포수불처코드", example = "")
    private String strRdpCode;
    /** POS번호 */
    @ApiModelProperty(required = true, value = "POS번호", example = "")
    private String posNum;
    /** POS거래번호 */
    @ApiModelProperty(required = true, value = "POS거래번호", example = "")
    private String posTrncNum;
    /** 판매시각 */
    @ApiModelProperty(required = true, value = "판매시각", example = "")
    private String saleHms;
    /** POS거래영수증내용 */
    @ApiModelProperty(required = true, value = "POS거래영수증내용", example = "")
    private String posTrncRecpCntt;
    /** 상품명 */
    @ApiModelProperty(required = true, value = "상품명", example = "")
    private String cmdtName;
    /** 단위품목명 */
    @ApiModelProperty(required = true, value = "단위품목명", example = "")
    private String untItmName;
    /** 요청수량 */
    @ApiModelProperty(required = true, value = "요청수량", example = "")
    private BigInteger requQntt;
    /** 상품매출금액 */
    @ApiModelProperty(required = true, value = "상품매출금액", example = "")
    private BigInteger cmdtSlsAmnt;
    
    /** 고객암호화카드번호 */
    @ApiModelProperty(required = true, value = "고객암호화카드번호", example = "")
    private String cstmEncrCardNum;
    /** 할부개월 */
    @ApiModelProperty(required = true, value = "할부개월", example = "")
    private String insmMnts;
    /** 매입카드사코드 */
    @ApiModelProperty(required = true, value = "매입카드사코드", example = "")
    private String byngCccpCode;
    /** 발급카드사코드 */
    @ApiModelProperty(required = true, value = "발급카드사코드", example = "")
    private String isncCccpCode;
}
