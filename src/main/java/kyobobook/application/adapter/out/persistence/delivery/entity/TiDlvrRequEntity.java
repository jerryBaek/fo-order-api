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
package kyobobook.application.adapter.out.persistence.delivery.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project : fo-order-api
 * @FileName : TiDlvrRequEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SH_배송요청
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TiDlvrRequEntity {

    /** 배송요청id */
    private String dlvrRequId;
    /** 배송담당코드 */
    private String dlvrRspbCode;
    /** 배송형태코드 */
    private String dlvrShpCode;
    /** 배송상세형태코드 */
    private String dlvrDtlShpCode;
    /** 택배사코드 */
    private String dscmCode;
    /** 주문id */
    private String ordrId;
    /** 주문순번 */
    private String ordrSrmb;
    /** 주문상세구분코드 */
    private String ordrDtlDvsnCode;
    /** 주문배송지id */
    private String ordrDlpnId;
    /** 처리결과코드 */
    private String prosRsltCode;
    /** 처리결과메모내용 */
    private String prosRsltMemoCntt;
    /** 생성자id */
    private String crtrId;
    /** 생성일시 */
    private String cretDttm;
    /** 수정자id */
    private String amnrId;
    /** 수정일시 */
    private String amndDttm;
    /** 삭제여부 */
    private String dltYsno;
    /** 배송금액 */
    private String dlvrAmnt;

}
