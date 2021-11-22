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
 * @FileName : TiDlvrRequMdfcEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SH_배송요청변경
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TiDlvrRequMdfcEntity {

    /** 배송요청ID */
    private String dlvrRequId;
    /** 배송변경순번 */
    private String dlvrMdfcSrmb;
    /** 변경구분코드 */
    private String mdfcDvsnCode;
    /** 변경구분내용 */
    private String mdfcDvsnCntt;
    /** 주문ID */
    private String ordrId;
    /** 주문순번 */
    private String ordrSrmb;
    /** 주문상품순번 */
    private String ordrCmdtSrmb;
    /** 주문상품처리순번 */
    private String ordrCmdtProsSrmb;
    /** 취소수량 */
    private String cnclQntt;
    /** 처리결과코드 */
    private String prosRsltCode;
    /** 처리결과메모내용 */
    private String prosRsltMemoCntt;
    /** 처리일시 */
    private String prosDttm;
    /** 생성자ID */
    private String crtrId;
    /** 생성일시 */
    private String cretDttm;
    /** 수정자ID */
    private String amnrId;
    /** 수정일시 */
    private String amndDttm;

}
