/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved. This software is the proprietary
 * information of Kyobo Book.
 *
 * Revision History Author Date Description -------------------------- ----------
 * ---------------------------------------- loutsiderl@kyobobook.com 2021. 11. 23. First Draft.
 *
 ****************************************************/
package kyobobook.application.biz.cart.port.in;

import kyobobook.application.domain.common.ResponseMessage;

/**
 * @Project : fo-order-api
 * @FileName : CartSoldOutPort.java
 * @Date : 2021. 11. 23.
 * @author : loutsiderl@kyobobook.com
 * @description : 장바구니 내 품/절판 상품 삭제 포트
 */
public interface CartSoldOutPort {

    /**
     * @Method : removeSoldOuts
     * @Date : 2021. 11. 23.
     * @author : loutsiderl@kyobobook.com
     * @description : 장바구니 내 품/절판 상품 삭제
     * @param mmbrNum
     * @return
     */
    ResponseMessage removeSoldOuts(String mmbrNum);

}
