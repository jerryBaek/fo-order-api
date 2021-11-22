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
package kyobobook.application.adapter.out.persistence.gift.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project : fo-order-api
 * @FileName : TdFrbeFrnsEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SO_사은품지급
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TdFrbeFrnsEntity {

    /** 주문ID */
    private String ordrId;
    /** 사은품ID */
    private String frbeId;
    /** 적용조건구분코드 */
    private String aplCndtDvsnCode;
    /** 사용여부 */
    private String useYsno;
    /** 생성자ID */
    private String crtrId;
    /** 생성일시 */
    private String cretDttm;
    /** 수정자ID */
    private String amnrId;
    /** 수정일시 */
    private String amndDttm;
    /** 사은품주문상품순번 */
    private String frbeOrdrCmdtSrmb;
    /** 조건주문상품순번 */
    private String cndtOrdrCmdtSrmb;
    /** 삭제여부 */
    private String dltYsno;

}
