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
 * @FileName : TiDlvrRequProsEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SH_배송요청처리
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TiDlvrRequProsEntity {

    /** 배송요청처리ID */
    private String dlvrRequProsId;
    /** 택배사코드 */
    private String dscmCode;
    /** 송장번호 */
    private String invcNum;
    /** 취소여부 */
    private String cnclYsno;
    /** 취소일시 */
    private String cnclDttm;
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
