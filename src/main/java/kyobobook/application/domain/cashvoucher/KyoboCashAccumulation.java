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
 * @Project : fo-order-api
 * @FileName : KyoboCashAccumulation.java
 * @Date : 2022. 1. 6.
 * @author : kimsehoon@kyobobook.com
 * @description : 교보캐시적립기본
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "교보캐시적립기본")
public class KyoboCashAccumulation {

    /** 교보캐시적립번호 */
    @ApiModelProperty(required = true, value = "교보캐시적립번호", example = "")
    private String kbcshAcmlNum;
    /** 회원번호 */
    @ApiModelProperty(required = true, value = "회원번호", example = "")
    private String mmbrNum;
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
