/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * seohee.ko@kyobobook.com      2021. 11. 24.
 *
 ****************************************************/
package kyobobook.application.adapter.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import kyobobook.application.biz.cart.port.in.DeliveryPort;
import kyobobook.application.domain.common.ResponseMessage;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project : fo-order-api
 * @FileName : RestDeliveryController.java
 * @Date : 2021. 11. 24.
 * @author : seohee.ko@kyobobook.com
 * @description :
 */
@Slf4j
@Api(tags = "배송")
@RequestMapping("/ord")
@RestController
public class RestDeliveryController {

    /** 배송 서비스 */
    @Autowired
    private DeliveryPort deliveryService;

    /**
     * @Method : selectDeliveryList
     * @Date : 2021. 11. 24.
     * @author : opoiper@kyobobook.com
     * @description : 배송지 목록조회
     * @return
     */
    @GetMapping(value = "/api/v1/order/deliveryList")
    public ResponseMessage selectDeliveryList() {

        log.debug("########### 배송지 목록조회 Controller :: ");

        return deliveryService.selectDeliveryList();
    }
}
