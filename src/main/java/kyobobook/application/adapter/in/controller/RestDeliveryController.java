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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import kyobobook.application.biz.delivery.port.in.DeliveryPort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.delivery.DeliveryAddress;
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

    /**
     * @Method : deleteDeliveryAddress
     * @Date : 2021. 11. 25.
     * @author : seohee.ko@kyobobook.com
     * @description : 배송지 삭제
     * @param deliveryAddress
     * @return
     */
    @ApiOperation(value = "배송지 삭제여부 갱신", notes = "배송지 삭제여부 정보를 갱신한다.")
    @ApiImplicitParam(name = "dlpnSrmb", value = "순번", required = true, dataType = "Integer", paramType = "param", defaultValue = "3")
    @DeleteMapping(value = "/api/v1/order/deliveryList")
    public ResponseMessage deleteDeliveryAddress(@RequestParam Integer dlpnSrmb) {

        log.debug("########### 배송지 삭제 Controller :: ");

        return deliveryService.deleteDeliveryAddress(dlpnSrmb);
    }

    @ApiOperation(value = "배송주소록 추가", notes = "배송주소록을 추가한다.")
    @ApiImplicitParam(name = "deliveryAddress", value = "배송주소", required = true, dataType = "DeliveryAddress", paramType = "body")
    @PostMapping("/api/v1/delivery/address")
    public ResponseMessage addDeliveryAddress(@RequestBody DeliveryAddress deliveryAddress) {

        log.debug("배송주소록 추가 진입");
        log.debug("입력 정보 : {}", deliveryAddress);

        return this.deliveryService.insertDeliveryAddress(deliveryAddress);

    }

}
