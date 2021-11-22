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
 * @FileName : TdOrdrExpnMpngEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SO_주문비용매핑
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TdOrdrExpnMpngEntity {

    /** 주문비용매핑ID */
    private String ordrExpnMpngId;
    /** 주문비용id */
    private String ordrExpnId;
    /** 주문id */
    private String ordrId;
    /** 주문순번 */
    private String ordrSrmb;
    /** 주문상품순번 */
    private String ordrCmdtSrmb;
    /** 주문상품처리순번 */
    private String ordrCmdtProsSrmb;
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
