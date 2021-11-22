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
 * @FileName : TmOrdrRfnmBnacEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SO_주문환불계좌
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TmOrdrRfnmBnacEntity {

    /** 주문ID */
    private String ordrId;
    /** 주문순번 */
    private String ordrSrmb;
    /** 환불은행코드 */
    private String rfnmBankCode;
    /** 환불계좌번호 */
    private String rfnmBnacNum;
    /** 환불계좌고객명 */
    private String rfnmBnacCstmName;
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
