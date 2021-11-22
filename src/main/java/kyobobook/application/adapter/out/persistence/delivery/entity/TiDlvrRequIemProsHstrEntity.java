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
 * @FileName : TiDlvrRequIemProsHstrEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SH_배송요청항목처리이력
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TiDlvrRequIemProsHstrEntity {

    /** 배송요청ID */
    private String dlvrRequId;
    /** 배송요청항목순번 */
    private String dlvrRequIemSrmb;
    /** 배송요청처리순번 */
    private String dlvrRequProsSrmb;
    /** 배송요청처리이력순번 */
    private String dlvrRequProsHstrSrmb;
    /** 배송수량 */
    private String dlvrQntt;
    /** 배송진행상태코드 */
    private String dlvrPrgsCdtnCode;
    /** 배송요청처리ID */
    private String dlvrRequProsId;
    /** 생성자ID */
    private String crtrId;
    /** 생성일시 */
    private String cretDttm;
    /** 수정자ID */
    private String amnrId;
    /** 수정일시 */
    private String amndDttm;

}
