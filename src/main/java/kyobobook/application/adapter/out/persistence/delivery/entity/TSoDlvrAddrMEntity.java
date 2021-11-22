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
 * @FileName : TSoDlvrAddrMEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : SO_주문비실물선물수신대상기본
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TSoDlvrAddrMEntity {

    /** 회원번호 */
    private String mmbrNum;
    /** 배송지순번 */
    private String dlpnSrmb;
    /** 배송지명 */
    private String dlpnName;
    /** 전화번호 */
    private String tlnm;
    /** 휴대전화전화번호 */
    private String cphnTlnm;
    /** 기본배송지여부 */
    private String bscDlpnYsno;
    /** 우편번호 */
    private String pssrNum;
    /** 기본주소 */
    private String bscAdrs;
    /** 상세주소 */
    private String dtlAdrs;
    /** 배송지별칭명 */
    private String dlpnAtnmName;
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

}
