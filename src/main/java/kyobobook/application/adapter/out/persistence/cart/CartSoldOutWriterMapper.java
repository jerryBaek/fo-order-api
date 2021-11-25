/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved. This software is the proprietary
 * information of Kyobo Book.
 *
 * Revision History Author Date Description -------------------------- ----------
 * ---------------------------------------- loutsiderl@kyobobook.com 2021. 11. 23.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.cart;

import kyobobook.application.adapter.out.persistence.cart.entity.TmSpbkEntity;
import kyobobook.config.annotation.WriterInterface;

/**
 * @Project : fo-order-api
 * @FileName : CartSoldOutWriterMapper.java
 * @Date : 2021. 11. 23.
 * @author : loutsiderl@kyobobook.com
 * @description : 장바구니 내 품/절판 상품
 */
@WriterInterface
public interface CartSoldOutWriterMapper {

    /**
     * @Method : deleteSoldOuts
     * @Date : 2021. 11. 11.
     * @author : seohee.ko@kyobobook.com
     * @description : 장바구니 내 품/절판 상품을 삭제
     * @param TmSpbkEntity
     */
    Integer deleteSoldOuts(TmSpbkEntity soldOut);


}
