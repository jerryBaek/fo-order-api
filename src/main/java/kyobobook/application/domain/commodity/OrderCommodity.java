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
 * @FileName : OrderComodity.java
 * @Date : 2022. 1. 6.
 * @author : kimsehoon@kyobobook.com
 * @description : 주문상품
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "주문상품")
public class OrderCommodity {

    /** 주문ID */
    @ApiModelProperty(required = true, value = "주문ID", example = "")
    private String ordrId;
    /** 주문순번 */
    @ApiModelProperty(required = true, value = "주문순번", example = "")
    private BigInteger ordrSrmb;
    /** 주문상품순번 */
    @ApiModelProperty(required = true, value = "주문상품순번", example = "")
    private BigInteger ordrCmdtSrmb;
    /** 주문상품처리순번 */
    @ApiModelProperty(required = true, value = "주문상품처리순번", example = "")
    private BigInteger ordrCmdtProsSrmb;
    /** 매입처코드 */
    @ApiModelProperty(required = true, value = "매입처코드", example = "")
    private String vndrCode;
    /** 판매상품ID */
    @ApiModelProperty(required = true, value = "판매상품ID", example = "")
    private String saleCmdtid;
    /** 상품명 */
    @ApiModelProperty(required = true, value = "상품명", example = "")
    private String cmdtName;
    /** 단위품목순번 */
    @ApiModelProperty(required = true, value = "단위품목순번", example = "")
    private BigInteger untItmSrmb;
    /** 단위품목명 */
    @ApiModelProperty(required = true, value = "단위품목명", example = "")
    private String untItmName;
    /** 요청수량 */
    @ApiModelProperty(required = true, value = "요청수량", example = "")
    private BigInteger requQntt;
    /** 주문상품종류코드 */
    @ApiModelProperty(required = true, value = "주문상품종류코드", example = "")
    private String ordrCmdtKindCode;
    /** 발송예약일자 */
    @ApiModelProperty(required = true, value = "발송예약일자", example = "")
    private String sndgPrenDate;
    /** 결합판매상품ID */
    @ApiModelProperty(required = true, value = "결합판매상품ID", example = "")
    private String combSaleCmdtid;
    /** 온라인주문상세구분코드 */
    @ApiModelProperty(required = true, value = "온라인주문상세구분코드", example = "")
    private String onlnOrdrDtlDvsnCode;
    /** 주문진행상태코드 */
    @ApiModelProperty(required = true, value = "주문진행상태코드", example = "")
    private String ordrPrgsCdtnCode;
    /** 과세구분코드 */
    @ApiModelProperty(required = true, value = "과세구분코드", example = "")
    private String txtnDvsnCode;
    /** 상품정가금액 */
    @ApiModelProperty(required = true, value = "상품정가금액", example = "")
    private BigInteger cmdtPrceAmnt;
    /** 상품매출금액 */
    @ApiModelProperty(required = true, value = "상품매출금액", example = "")
    private BigInteger cmdtSlsAmnt;
    /** 단위품목매출금액 */
    @ApiModelProperty(required = true, value = "단위품목매출금액", example = "")
    private BigInteger untItmSlsAmnt;
    /** 상품분류코드 */
    @ApiModelProperty(required = true, value = "상품분류코드", example = "")
    private String cmdtClstCode;
    /** 섹션코드 */
    @ApiModelProperty(required = true, value = "섹션코드", example = "")
    private String sctnCode;
    /** 무료배송상품여부 */
    @ApiModelProperty(required = true, value = "무료배송상품여부", example = "")
    private String freeDlvrCmdtYsno;
    /** 주문배송지ID */
    @ApiModelProperty(required = true, value = "주문배송지ID", example = "")
    private String ordrDlpnId;
    /** 주문선물수신대상ID */
    @ApiModelProperty(required = true, value = "주문선물수신대상ID", example = "")
    private String ordrGftRcmsTrgtId;
    /** 주문선물수신대상순번 */
    @ApiModelProperty(required = true, value = "주문선물수신대상순번", example = "")
    private BigInteger ordrGftRcmsTrgtSrmb;
    /** 배송담당코드 */
    @ApiModelProperty(required = true, value = "배송담당코드", example = "")
    private String dlvrRspbCode;
    /** 배송형태코드 */
    @ApiModelProperty(required = true, value = "배송형태코드", example = "")
    private String dlvrShpCode;
    /** 배송형태상세코드 */
    @ApiModelProperty(required = true, value = "배송형태상세코드", example = "")
    private String dlvrShpDtlCode;
    /** 부가주문내용 */
    @ApiModelProperty(required = true, value = "부가주문내용", example = "")
    private String addtOrdrCntt;
    /** 도서정가제여부 */
    @ApiModelProperty(required = true, value = "도서정가제여부", example = "")
    private String fbpYsno;
    /** 인쇄내용 */
    @ApiModelProperty(required = true, value = "인쇄내용", example = "")
    private String prinCntt;
    /** 예약상품여부 */
    @ApiModelProperty(required = true, value = "예약상품여부", example = "")
    private String prenCmdtYsno;
    /** 소득공제대상여부 */
    @ApiModelProperty(required = true, value = "소득공제대상여부", example = "")
    private String incmDdctTrgtYsno;
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
