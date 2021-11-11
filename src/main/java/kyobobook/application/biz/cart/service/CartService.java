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
package kyobobook.application.biz.cart.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Service;
import kyobobook.application.biz.cart.port.in.CartPort;
import kyobobook.application.biz.cart.port.out.CartPersistencePort;

/**
 * @Project     : fo-order-api
 * @FileName    : CartService.java
 * @Date        : 2021. 11. 11.
 * @author      : kimsehoon@kyobobook.com
 * @description : 장바구니 서비스
 */
@Service
public class CartService implements CartPort {

    private static final Logger logger = LoggerFactory.getLogger(CartService.class);

//    @Qualifier("cartWriterRepository")
//    private CartPersistencePort cartWriterPort;

    @Autowired
    @Qualifier("cartRepository")
    private CartPersistencePort cartRepository;

    @Autowired
    private MessageSourceAccessor messageSource;

}
