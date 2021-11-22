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
 * @FileName : TdDdctOrdrCmdtDsrpEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SO_문화비소득공제주문상품내역
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TdDdctOrdrCmdtDsrpEntity {

    /** 주문ID */
    private String ordrId;
    /** 주문상품순번 */
    private String ordrCmdtSrmb;
    /** 상품코드 */
    private String cmdtCode;
    /** 지불방법코드 */
    private String pymtMthdCode;
    /** 주문금액 */
    private String pymtAmnt;
    /** 소득공제대상여부 */
    private String incmDdctTrgtYsno;
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
