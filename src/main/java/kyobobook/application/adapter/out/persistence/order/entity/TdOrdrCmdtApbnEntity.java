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
 * @FileName : TdOrdrCmdtApbnEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SO_주문상품적용혜택
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TdOrdrCmdtApbnEntity {

    /** 주문id */
    private String ordrId;
    /** 주문상품순번 */
    private String ordrCmdtSrmb;
    /** 적용혜택순번 */
    private String apbnSrmb;
    /** 적용혜택이력순번 */
    private String apbnHstrSrmb;
    /** 적용여부 */
    private String aplYsno;
    /** 적용주문순번 */
    private String aplOrdrSrmb;
    /** 취소주문순번 */
    private String cnclOrdrSrmb;
    /** 쿠폰복원여부 */
    private String cpnRstrYsno;
    /** 적용구분코드 */
    private String aplDvsnCode;
    /** 적용종류코드 */
    private String aplKindCode;
    /** 율기준적용여부 */
    private String rateStnrAplYsno;
    /** 적용율 */
    private String aplRate;
    /** 총적용금액 */
    private String ttlAplAmnt;
    /** 총적용수량 */
    private String ttlAplQntt;
    /** 적용조건구분코드 */
    private String aplCndtDvsnCode;
    /** 적용조건금액 */
    private String aplCndtAmnt;
    /** 적용id */
    private String aplId;
    /** 쿠폰지갑id */
    private String cpnWaletId;
    /** 기부코드 */
    private String dntnCode;
    /** 기부순번 */
    private String dntnMngmSrmb;
    /** 비용할당대상코드 */
    private String expnAssgTrgtCode;
    /** 제휴결제수단코드 */
    private String coprStlmContprgpCode;
    /** 외부적립카드번호 */
    private String extrAcmlCardNum;
    /** 최대할인금액 */
    private String mxmmDscnAmnt;
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
    /** 외부적립정보 */
    private String extrAcmlInfo;

}
