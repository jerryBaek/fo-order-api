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
package kyobobook.application.domain.payment;

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
 * @FileName : PaymentDetail.java
 * @Date : 2022. 1. 6.
 * @author : kimsehoon@kyobobook.com
 * @description : 지불상세
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "지불상세")
public class PaymentDetail {

    /** 주문결제ID */
    @ApiModelProperty(required = true, value = "주문결제ID", example = "")
    private String ordrStlmId;
    /** 주문ID */
    @ApiModelProperty(required = true, value = "주문ID", example = "")
    private String ordrId;
    /** 주문순번 */
    @ApiModelProperty(required = true, value = "주문순번", example = "")
    private BigInteger ordrSrmb;
    /** 사용여부 */
    @ApiModelProperty(required = true, value = "사용여부", example = "")
    private String useYsno;
    /** 결제환불구분코드 */
    @ApiModelProperty(required = true, value = "결제환불구분코드", example = "")
    private String stlmRfnmDvsnCode;
    /** 결제방법코드 */
    @ApiModelProperty(required = true, value = "결제방법코드", example = "")
    private String stlmMthdCode;
    /** 결제방법별칭명 */
    @ApiModelProperty(required = true, value = "결제방법별칭명", example = "")
    private String stlmMthdAtnm;
    /** 결제PIN교환권번호 */
    @ApiModelProperty(required = true, value = "결제PIN교환권번호", example = "")
    private String stlmPinExcvcNum;
    /** 결제금액 */
    @ApiModelProperty(required = true, value = "결제금액", example = "")
    private BigInteger stlmAmnt;
    /** 과세금액 */
    @ApiModelProperty(required = true, value = "과세금액", example = "")
    private BigInteger txtnAmnt;
    /** 결제진행상태코드 */
    @ApiModelProperty(required = true, value = "결제진행상태코드", example = "")
    private String stlmPrgsCdtnCode;
    /** 결제완료일자 */
    @ApiModelProperty(required = true, value = "결제완료일자", example = "")
    private String stlmFnshDate;
    /** 결제완료시각 */
    @ApiModelProperty(required = true, value = "결제완료시각", example = "")
    private String stlmFnshHms;
    /** 환불사유코드 */
    @ApiModelProperty(required = true, value = "환불사유코드", example = "")
    private String rfnmRsnCode;
    /** 환불시도건수 */
    @ApiModelProperty(required = true, value = "환불시도건수", example = "")
    private BigInteger rfnmExecCnt;
    /** 실결제방법코드 */
    @ApiModelProperty(required = true, value = "실결제방법코드", example = "")
    private String realStlmMthdCode;
    /** 주문초기값여부 */
    @ApiModelProperty(required = true, value = "주문초기값여부", example = "")
    private String ordrIntlwrthYsno;
    /** 메모 */
    @ApiModelProperty(required = true, value = "메모", example = "")
    private String memo;
    /** 배송요청처리ID */
    @ApiModelProperty(required = true, value = "배송요청처리ID", example = "")
    private String dlvrRequProsId;
    /** 반품요청순번 */
    @ApiModelProperty(required = true, value = "반품요청순번", example = "")
    private BigInteger rfnmRequSrnb;
    /** 일괄작업여부 */
    @ApiModelProperty(required = true, value = "일괄작업여부", example = "")
    private String batchYn;
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
