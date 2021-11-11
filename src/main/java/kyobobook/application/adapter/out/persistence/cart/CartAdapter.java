/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * kimsehoon@kyobobook.com      2021. 10. 27.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.cart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kyobobook.application.biz.cart.port.out.CartPersistencePort;

/**
 * @Project     : fo-order-api
 * @FileName    : CartReaderAdapter.java
 * @Date        : 2021. 11. 11.
 * @author      : kimsehoon@kyobobook.com
 * @description : 장바구니 읽기 
 */
@Repository("cartRepository")
public class CartAdapter implements CartPersistencePort {
    
    private static final Logger logger = LoggerFactory.getLogger(CartAdapter.class);

    /** 장바구니 읽기 */
    @Autowired
    CartReaderMapper reader;
    
    /** 장바구니 쓰기 */
    @Autowired
    CartWriterMapper writer;

}
