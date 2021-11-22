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
 * @FileName : TmOrdrExpnEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SO_주문비용
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TmOrdrExpnEntity {

    /** 주문비용ID */
    private String ordrExpnId;
    /** 주문ID */
    private String ordrId;
    /** 주문순번 */
    private String ordrSrmb;
    /** 비용구분코드 */
    private String expnDvsnCode;
    /** 무료배송비용정책코드 */
    private String freeDlvrExpnPlcCode;
    /** 지불환불구분코드 */
    private String pymtRfnmDvsnCode;
    /** 비용금액 */
    private String expnAmnt;
    /** 할인금액 */
    private String dscnAmnt;
    /** 할인쿠폰ID */
    private String dscnCpnId;
    /** 쿠폰지갑ID */
    private String cpnWaletId;
    /** 비용할당대상코드 */
    private String expnAssgTrgtCode;
    /** 원주문비용ID */
    private String origOrdrExpnId;
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
    /** 소득공제대상여부 */
    private String incmDdctTrgtYsno;
    /** 무료배송비용정책ID */
    private String freeDlvrExpnPlcId;
    /** 업체ID */
    private String entsId;

}
