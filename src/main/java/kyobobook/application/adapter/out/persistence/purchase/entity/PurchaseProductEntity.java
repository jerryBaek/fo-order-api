/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * kimsehoon@kyobobook.com      2021. 11. 12.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.purchase.entity;

import lombok.Data;

/**
 * @Project     : fo-order-api
 * @FileName    : PurchaseProductEntity.java
 * @Date        : 2021. 11. 12.
 * @author      : kimsehoon@kyobobook.com
 * @description : 구매 상품 엔티티
 */
@Data
public class PurchaseProductEntity {

    /** 주문 일자 */
    public String ordrDate;
    
    /** 통합 상품 ID */
    public String unfyCmdtId;
    
    /** 온라인 상품 구분 코드 */
    public String OnlnCmdtDvsnCode;
    
    /** 주문 수량 */
    public Integer orderQty;
}
