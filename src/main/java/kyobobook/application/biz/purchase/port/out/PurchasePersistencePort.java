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
package kyobobook.application.biz.purchase.port.out;

import java.util.List;

import kyobobook.application.domain.purchase.PurchaseProduct;

/**
 * @Project : fo-order-api
 * @FileName : PurchasePersistencePort.java
 * @Date : 2021. 11. 12.
 * @author : kimsehoon@kyobobook.com
 * @description : 구매 데이터베이스 포트
 */
public interface PurchasePersistencePort {

    /**
     * @Method : getPurchasedInCart
     * @Date : 2021. 11. 12.
     * @author : kimsehoon@kyobobook.com
     * @description : 구매 상품 목록 조회
     * @param mmbrNum 회원번호
     * @return
     * @throws Exception
     */
    List<PurchaseProduct> getPurchasedInCart(String mmbrNum) throws Exception;

}
