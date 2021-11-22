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
package kyobobook.application.adapter.out.persistence.pay.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project : fo-order-api
 * @FileName : TdPymtDtlEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SO_단위품목
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TdPymtDtlEntity {

    /** 단위품목순번 */
    private String untItmSrmb;
    /** 단위품목명 */
    private String untItmName;
    /** 추가판매금액 */
    private String adtnSaleAmnt;
    /** 판매가능수량 */
    private String salePsblQntt;
    /** 식별코드 */
    private String idnfCode;
    /** 속성명1 */
    private String attName1;
    /** 속성값1 */
    private String attWrth1;
    /** 속성명2 */
    private String attName2;
    /** 속성값2 */
    private String attWrth2;
    /** 속성명3 */
    private String attName3;
    /** 속성값3 */
    private String attWrth3;
    /** 속성명4 */
    private String attName4;
    /** 속성값4 */
    private String attWrth4;
    /** 속성명5 */
    private String attName5;
    /** 속성값5 */
    private String attWrth5;
    /** 속성명6 */
    private String attName6;
    /** 속성값6 */
    private String attWrth6;
    /** 속성명7 */
    private String attName7;
    /** 속성값7 */
    private String attWrth7;
    /** 생성자id */
    private String crtrId;
    /** 생성일시 */
    private String cretDttm;
    /** 수정자id */
    private String amnrId;
    /** 수정일시 */
    private String amndDttm;
    /** 통합상품id */
    private String unfyCmdtId;
    /** 삭제여부 */
    private String dltYsno;

}
