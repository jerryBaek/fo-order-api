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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Service;

import kyobobook.application.biz.cart.port.in.DeliveryPort;
import kyobobook.application.biz.cart.port.out.DeliveryPersistencePort;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project : fo-order-api
 * @FileName : DeliveryService.java
 * @Date : 2021. 11. 24.
 * @author : kimsehoon@kyobobook.com
 * @description : 배송 서비스
 */
@Slf4j
@Service
public class DeliveryService implements DeliveryPort {

    /** 장바구니 저장소 */
    @Autowired
    @Qualifier("deliveryPersistenceRepository")
    private DeliveryPersistencePort deliveryRepository;

    /** 메시지 소스 */
    @Autowired
    private MessageSourceAccessor messageSource;

}
