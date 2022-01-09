/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * seohee.ko@kyobobook.com      2022. 1. 7.
 *
 ****************************************************/
package kyobobook.application.domain.cashvoucher;

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
 * @Project     : fo-order-api
 * @FileName    : CashVoucherMaster.java
 * @Date        : 2022. 1. 7.
 * @author      : seohee.ko@kyobobook.com
 * @description :
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "금권 마스터 도메인")
public class CashVoucherMaster {
    
    /** 조회기간 시작 */
    @ApiModelProperty(value = "조회기간 시작", example = "20220101")
    private String strtPeriod;
    /** 조회기간 종료 */
    @ApiModelProperty(value = "조회기간 종료", example = "20220105")
    private String endPeriod;
    /** 충전/전환/환불 금액 */
    @ApiModelProperty(required = true, value = "충전/전환 금액", example = "")
    private String amount;
    /** 소멸예정마일리지 */
    @ApiModelProperty(required = true, value = "소멸예정마일리지", example = "")
    private String vaniMlgMlg;

    /** 회원번호 */
    @ApiModelProperty(required = true, value = "회원번호", example = "")
    private String mmbrNum;
    /** 예치금잔액 */
    @ApiModelProperty(required = true, value = "예치금잔액", example = "")
    private BigInteger bnblBlce;
    /** 마일리지잔액 */
    @ApiModelProperty(required = true, value = "마일리지잔액", example = "")
    private BigInteger mlgBlce;
    /** 매출일자 */
    @ApiModelProperty(required = true, value = "매출일자", example = "")
    private String slsDate;
    /** 주문금권매출사유코드 */
    @ApiModelProperty(required = true, value = "주문금권매출사유코드", example = "")
    private String ordrcsvcSlsRsnCode;
    /** 주문금권구분코드 */
    @ApiModelProperty(required = true, value = "주문금권구분코드", example = "")
    private String ordrcsvcDvsnCode;
    /** 입금출금구분코드 */
    @ApiModelProperty(required = true, value = "입금출금구분코드", example = "")
    private String destWtdwDvsnCode;
    
    /** 교보캐시적립번호 */
    @ApiModelProperty(required = true, value = "교보캐시적립번호", example = "")
    private String kbcshAcmlNum;
    /** 적립일자 */
    @ApiModelProperty(required = true, value = "적립일자", example = "")
    private String acmlDate;
    /** 유효시작일자 */
    @ApiModelProperty(required = true, value = "유효시작일자", example = "")
    private String vldtSttgDate;
    /** 유효종료일자 */
    @ApiModelProperty(required = true, value = "유효종료일자", example = "")
    private String vldtEndDate;
    /** 자산변경내역구분코드 */
    @ApiModelProperty(required = true, value = "자산변경내역구분코드", example = "")
    private String assetMdfcDsrpDvsnCode;
    /** 통합주문채널코드 */
    @ApiModelProperty(required = true, value = "통합주문채널코드", example = "")
    private String unfyOrdrChnlCode;
    /** 사용가능여부 */
    @ApiModelProperty(required = true, value = "사용가능여부", example = "")
    private String usePsblYsno;
    /** 최초등록금액 */
    @ApiModelProperty(required = true, value = "최초등록금액", example = "")
    private BigInteger frstRgstAmnt;
    /** 사용가능잔액 */
    @ApiModelProperty(required = true, value = "사용가능잔액", example = "")
    private BigInteger usePsblBlce;
    /** 주문결제번호 */
    @ApiModelProperty(required = true, value = "주문결제번호", example = "")
    private BigInteger ordrStlmNum;
    /** 주문결제유형코드 */
    @ApiModelProperty(required = true, value = "주문결제유형코드", example = "")
    private String ordrStlmPatrCode;
    /** 통합주문ID */
    @ApiModelProperty(required = true, value = "통합주문ID", example = "")
    private String unfyOrdrId;
    /** 점포주문순번 */
    @ApiModelProperty(required = true, value = "점포주문순번", example = "")
    private BigInteger strOrdrSrmb;
    /** 환불가능여부 */
    @ApiModelProperty(required = true, value = "환불가능여부", example = "")
    private String rfnmPsblYsno;
    
    /** 교보캐시송금신청내역팝업관련 */
    /** 은행명 */
    @ApiModelProperty(required = true, value = "은행명", example = "")
    private String bankName;
    /** 은행코드 */
    @ApiModelProperty(required = true, value = "은행코드", example = "")
    private String bankCode;
    /** 고객암호화계좌번호 */
    @ApiModelProperty(required = true, value = "고객암호화계좌번호", example = "")
    private String cstmEncrBnacNum;
    /** 입금자명 */
    @ApiModelProperty(required = true, value = "입금자명", example = "")
    private String dpstrName;
}
