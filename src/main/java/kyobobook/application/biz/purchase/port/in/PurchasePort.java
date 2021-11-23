/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 8. 12.  First Draft.
 *
 ****************************************************/
package kyobobook.application.biz.purchase.port.in;

import kyobobook.application.domain.common.ResponseMessage;

/**
 * @Project : fo-order-api
 * @FileName : PurchasePort.java
 * @Date : 2021. 11. 12.
 * @author : kimsehoon@kyobobook.com
 * @description : 구매 포트
 */
public interface PurchasePort {

    /**
     * @Method : getPurchasedInCart
     * @Date : 2021. 11. 12.
     * @author : kimsehoon@kyobobook.com
     * @description : 구매 상품 조회
     * @return
     */
    ResponseMessage getPurchasedInCart();

}
