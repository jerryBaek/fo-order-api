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
 * @FileName : TiDlvrRequIemEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SH_배송요청항목
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TiDlvrRequIemEntity {

    /** 배송요청ID */
    private String dlvrRequId;
    /** 배송요청항목순번 */
    private String dlvrRequIemSrmb;
    /** 주문ID */
    private String ordrId;
    /** 주문순번 */
    private String ordrSrmb;
    /** 주문상품순번 */
    private String ordrCmdtSrmb;
    /** 주문상품처리순번 */
    private String ordrCmdtProsSrmb;
    /** 업체ID */
    private String entsId;
    /** 통합상품ID */
    private String unfyCmdtId;
    /** 통합상품명 */
    private String unfyCmdtName;
    /** 단위품목순번 */
    private String untItmSrmb;
    /** 단위품목명 */
    private String untItmName;
    /** 원지시수량 */
    private String origDrcsQntt;
    /** 총취소수량 */
    private String ttlCnclQntt;
    /** 배송진행상태코드 */
    private String dlvrPrgsCdtnCode;
    /** 배송요청일자 */
    private String dlvrRequDate;
    /** 배송완료일자 */
    private String dlvrFnshDate;
    /** 총배송수량 */
    private String ttlDlvrQntt;
    /** 생성자ID */
    private String crtrId;
    /** 생성일시 */
    private String cretDttm;
    /** 수정자ID */
    private String amnrId;
    /** 수정일시 */
    private String amndDttm;
    /** 삭제여부 */
    private String dltYsno;

}
