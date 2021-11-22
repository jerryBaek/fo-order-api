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
 * @FileName : ThOrdrCmdtMdfcEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SO_주문상품변경
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ThOrdrCmdtMdfcEntity {

    /** 주문ID */
    private String ordrId;
    /** 주문순번 */
    private String ordrSrmb;
    /** 주문상품순번 */
    private String ordrCmdtSrmb;
    /** 주문상품처리순번 */
    private String ordrCmdtProsSrmb;
    /** 주문상품변경순번 */
    private String ordrCmdtMdfcSrmb;
    /** 변경구분코드 */
    private String mdfcDvsnCode;
    /** 주문진행상태코드 */
    private String ordrPrgsCdtnCode;
    /** 주문메모ID */
    private String ordrMemoId;
    /** 주문배송지ID */
    private String ordrDlpnId;
    /** 주문배송지변경순번 */
    private String ordrDlpnMdfcSrmb;
    /** 배송요청ID */
    private String dlvrRequId;
    /** 배송변경순번 */
    private String dlvrMdfcSrmb;
    /** 주문메모변경순번 */
    private String ordrMemoMdfcSrmb;
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

}
