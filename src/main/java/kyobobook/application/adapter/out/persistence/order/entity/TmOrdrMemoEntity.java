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
 * @FileName : TmOrdrMemoEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SO_주문메모
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TmOrdrMemoEntity {

    /** 주문메모ID */
    private String ordrMemoId;
    /** 주문메모구분코드 */
    private String ordrMemoDvsnCode;
    /** 주문메모 */
    private String ordrMemo;
    /** 주문ID */
    private String ordrId;
    /** 주문순번 */
    private String ordrSrmb;
    /** 주문상품순번 */
    private String ordrCmdtSrmb;
    /** 주문상품처리순번 */
    private String ordrCmdtProsSrmb;
    /** 주문배송지ID */
    private String ordrDlpnId;
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

}
