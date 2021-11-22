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
 * @FileName : TmOrdrEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SO_주문
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TmOrdrEntity {

    /** 주문ID */
    private String ordrId;
    /** 주문순번 */
    private String ordrSrmb;
    /** 주문종류코드 */
    private String ordrKindCode;
    /** 주문구분코드 */
    private String ordrDvsnCode;
    /** 취소원주문순번 */
    private String cnclOrigOrdrSrmb;
    /** 주문일자 */
    private String ordrDate;
    /** 주문시각 */
    private String ordrHms;
    /** 지불완료일자 */
    private String pymtFnshDate;
    /** 지불완료시각 */
    private String pymtFnshHms;
    /** 회원주문여부 */
    private String mmbrOrdrYsno;
    /** 주문비밀번호 */
    private String ordrSertnum;
    /** 회원번호 */
    private String mmbrNum;
    /** 회원등급코드 */
    private String mmbrGrdCode;
    /** 주문자명 */
    private String aordName;
    /** 주문자이메일주소 */
    private String aordEmlAdrs;
    /** 주문자휴대전화번호 */
    private String aordPrtbTlnm;
    /** 주문자I_p주소 */
    private String aordIpAdrs;
    /** SM_s수신여부 */
    private String smsRcmsYsno;
    /** 이메일수신여부 */
    private String emlRcmsYsno;
    /** 링크구분코드 */
    private String linkDvsnCode;
    /** 채널구분코드 */
    private String chnlDvsnCode;
    /** 채널상세구분코드 */
    private String chnlDtlDvsnCode;
    /** 주문처리결과코드 */
    private String ordrProsRsltCode;
    /** 주문처리결과메모내용 */
    private String ordrProsRsltMemoCntt;
    /** 단수배송여부 */
    private String nmsrDlvrYsno;
    /** 환불방법요청코드 */
    private String rfnmMthdRequCode;
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
