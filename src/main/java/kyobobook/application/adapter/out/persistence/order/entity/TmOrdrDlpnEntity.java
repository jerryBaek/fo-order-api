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
 * @FileName : TmOrdrDlpnEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SO_주문배송지
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TmOrdrDlpnEntity {

    /** 주문배송지ID */
    private String ordrDlpnId;
    /** 회원번호 */
    private String mmbrNum;
    /** 배송지명 */
    private String dlpnName;
    /** 수취인명 */
    private String rcvrName;
    /** 수취인전화번호 */
    private String rcvrTlnm;
    /** 수취인휴대전화번호 */
    private String rcvrPrtbTlnm;
    /** 배송구분코드 */
    private String dlvrDvsnCode;
    /** 수령지점코드 */
    private String rcptBranCode;
    /** 재고지점코드 */
    private String invnBranCode;
    /** 해외배송업체코드 */
    private String frngDlvrEntsCode;
    /** 주소구분코드 */
    private String adrsDvsnCode;
    /** 상세주소1 */
    private String dtlAdrs1;
    /** 상세주소2 */
    private String dtlAdrs2;
    /** 상세주소3 */
    private String dtlAdrs3;
    /** 상세주소4 */
    private String dtlAdrs4;
    /** 상세주소5 */
    private String dtlAdrs5;
    /** 상세주소6 */
    private String dtlAdrs6;
    /** 상세주소7 */
    private String dtlAdrs7;
    /** 상세주소8 */
    private String dtlAdrs8;
    /** 상세주소9 */
    private String dtlAdrs9;
    /** 상세주소10 */
    private String dtlAdrs10;
    /** 상세주소11 */
    private String dtlAdrs11;
    /** 상세주소12 */
    private String dtlAdrs12;
    /** 주문ID */
    private String ordrId;
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
    /** 주문순번 */
    private String ordrSrmb;
    /** 선물영수증가격노출여부 */
    private String gftRecpPricExprYsno;

}
