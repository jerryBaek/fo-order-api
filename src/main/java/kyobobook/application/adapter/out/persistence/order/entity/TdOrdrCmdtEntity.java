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
package kyobobook.application.adapter.out.persistence.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project : fo-order-api
 * @FileName : TdOrdrCmdtEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SO_주문상품
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TdOrdrCmdtEntity {

    /** 주문순번 */
    private String ordrSrmb;
    /** 주문상품순번 */
    private String ordrCmdtSrmb;
    /** 주문상품처리순번 */
    private String ordrCmdtProsSrmb;
    /** 업체ID */
    private String entsId;
    /** 통합상품명 */
    private String unfyCmdtName;
    /** 단위품목순번 */
    private String untItmSrmb;
    /** 단위품목명 */
    private String untItmName;
    /** 요청수량 */
    private String requQntt;
    /** 도서정가제여부 */
    private String fbpYsno;
    /** 예약상품여부 */
    private String prenCmdtYsno;
    /** 주문상품종류코드 */
    private String ordrCmdtKindCode;
    /** 발송예약일자 */
    private String sndgPrenDate;
    /** 묶음상품순번 */
    private String bndlCmdtSrmb;
    /** 주문상세구분코드 */
    private String ordrDtlDvsnCode;
    /** 주문진행상태코드 */
    private String ordrPrgsCdtnCode;
    /** 과세구분코드 */
    private String txtnDvsnCode;
    /** 상품정가금액 */
    private String cmdtPrceAmnt;
    /** 상품매출금액 */
    private String cmdtSlsAmnt;
    /** 단위품목매출금액 */
    private String untItmSlsAmnt;
    /** 조코드 */
    private String joCode;
    /** 섹션코드 */
    private String sctnCode;
    /** 무료배송상품여부 */
    private String freeDlvrCmdtYsno;
    /** 주문배송지ID */
    private String ordrDlpnId;
    /** 배송담당코드 */
    private String dlvrRspbCode;
    /** 배송형태코드 */
    private String dlvrShpCode;
    /** 배송상세형태코드 */
    private String dlvrDtlShpCode;
    /** 클레임신청사유코드 */
    private String aplnRsnCode;
    /** 부가주문내용 */
    private String addtOrdrCntt;
    /** 인쇄내용 */
    private String prinCntt;
    /** 생성자ID */
    private String crtrId;
    /** 생성일시 */
    private String cretDttm;
    /** 수정자ID */
    private String amnrId;
    /** 수정일시 */
    private String amndDttm;
    /** 주문선물수신대상ID */
    private String ordrGftRcmsTrgtId;
    /** 주문선물수신대상순번 */
    private String ordrGftRcmsTrgtSrmb;
    /** 삭제여부 */
    private String dltYsno;
    /** 소득공제대상여부 */
    private String incmDdctTrgtYsno;
    /** 통합상품ID */
    private String unfyCmdtId;
    /** 주문ID */
    private String ordrId;

}
