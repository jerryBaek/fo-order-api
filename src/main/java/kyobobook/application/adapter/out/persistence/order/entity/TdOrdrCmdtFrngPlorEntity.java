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
 * @FileName : TdOrdrCmdtFrngPlorEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SO_주문상품해외발주
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TdOrdrCmdtFrngPlorEntity {

    /** 주문ID */
    private String ordrId;
    /** 주문순번 */
    private String ordrSrmb;
    /** 주문상품순번 */
    private String ordrCmdtSrmb;
    /** 주문상품처리순번 */
    private String ordrCmdtProsSrmb;
    /** 화폐단위코드 */
    private String curnUntCode;
    /** 외화가격 */
    private String frcrPric;
    /** 발주여부 */
    private String plorYsno;
    /** 발주일자 */
    private String plorDate;
    /** 발주의뢰번호 */
    private String plorRlncNum;
    /** 저자명 */
    private String autrName;
    /** 출판사명 */
    private String pbcmName;
    /** ISBN */
    private String isbn;
    /** 고객배송지연승인여부 */
    private String cstmDlvrDlyAproYsno;
    /** 발송예정일자 */
    private String sndgSchdDate;
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
    /** 특별주문여부 */
    private String spciOrdrYsno;

}
