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
 * @FileName : TdOrdrBndlCmdtEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SO_주문묶음상품
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TdOrdrBndlCmdtEntity {

    /** 주문ID */
    private String ordrId;
    /** 묶음상품순번 */
    private String bndlCmdtSrmb;
    /** 묶음구분코드 */
    private String bndlDvsnCode;
    /** 통합상품ID */
    private String unfyCmdtId;
    /** 통합상품명 */
    private String unfyCmdtName;
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
