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
 * @FileName : TSoDlvrAddrMEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SO_문화비소득공제주문상품내역
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TSoDlvrAddrMEntity {

    /** 주문선물수신대상ID */
    private String ordrGftRcmsTrgtId;
    /** 주문선물수신대상순번 */
    private String ordrGftRcmsTrgtSrmb;
    /** 회원번호 */
    private String mmbrNum;
    /** 수신자명 */
    private String recvName;
    /** 선물인증번호 */
    private String gftCrttNum;
    /** 선물상태코드 */
    private String gftCdtnCode;
    /** 선물수신일자 */
    private String gftRcmsDate;
    /** 선물수신시각 */
    private String gftRcmsHms;
    /** 주문ID */
    private String ordrId;
    /** 선물영수증가격노출여부 */
    private String gftRecpPricExprYsno;
    /** 생성자ID */
    private String crtrId;
    /** 생성일시 */
    private String cretDttm;
    /** 수정자ID */
    private String amnrId;
    /** 수정일시 */
    private String amndDttm;
    /** 연락처유형코드 */
    private String cnplPatrCode;
    /** 연락처유형내용 */
    private String cnplPatrCntt;
    /** 주문순번 */
    private String ordrSrmb;
    /** 삭제여부 */
    private String dltYsno;

}
