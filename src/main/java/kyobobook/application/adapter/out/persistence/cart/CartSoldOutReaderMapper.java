/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved. This software is the proprietary
 * information of Kyobo Book.
 *
 * Revision History Author Date Description -------------------------- ----------
 * ---------------------------------------- loutsiderl@kyobobook.com 2021. 11. 23.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.cart;

import java.util.List;
import kyobobook.application.adapter.out.persistence.cart.entity.TmSpbkEntity;
import kyobobook.config.annotation.ReaderInterface;

/**
 * @Project : fo-order-api
 * @FileName : CartSoldOutReaderMapper.java
 * @Date : 2021. 11. 23.
 * @author : loutsiderl@kyobobook.com
 * @description : 장바구니 읽기
 */
@ReaderInterface
public interface CartSoldOutReaderMapper {

    /**
     * @Method : selectCartSoldOutList
     * @Date : 2021. 11. 23.
     * @author : loutsiderl@kyobobook.com
     * @description :
     * @return
     */
    List<TmSpbkEntity> selectCartSoldOutList(String mmbrNum);
}
