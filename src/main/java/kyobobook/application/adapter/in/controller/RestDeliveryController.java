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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @ApiOperation(value = "배송지 목록 조회", notes = "배송지 정보를 조회합니다.")
    @ApiImplicitParam(name = "searchMmbrNum", value = "회원번호", required = true, dataType = "string", paramType = "param", defaultValue = "62210667167")
    @GetMapping(value = "/api/v1/order/deliveryList/{searchMmbrNum}")
    public ResponseMessage selectDeliveryList(
            @PathVariable(name = "searchMmbrNum") String searchMmbrNum) {
        return deliveryService.selectDeliveryList(searchMmbrNum);
    }

    /**
     * @Method : deleteDeliveryAddress
     * @Date : 2021. 11. 25.
     * @author : seohee.ko@kyobobook.com
     * @description : 사용자 배송지 단건 삭제(삭제여부 갱신)
     * @param deliveryAddress
     * @return
     */
    @ApiOperation(value = "배송지 삭제여부 갱신", notes = "배송지 삭제여부 정보를 갱신한다.")
    @ApiImplicitParam(name = "dlpnSrmb", value = "배송지순번", required = true, dataType = "Integer", paramType = "param", defaultValue = "3")
    @DeleteMapping(value = "/api/v1/order/deliveryList/{dlpnSrmb}")
    public ResponseMessage deleteDeliveryAddress(@PathVariable String dlpnSrmb) {

        log.debug("########### 배송지 삭제 Controller :: ");

        return deliveryService.deleteDeliveryAddress(dlpnSrmb);
    }

    /**
     * @Method : addDeliveryAddress
     * @Date : 2021. 11. 26.
     * @author : kimsehoon@kyobobook.com
     * @description : 배송주소록 추가
     * @param deliveryAddress 배송주소
     * @return
     */
    @ApiOperation(value = "배송주소록 추가", notes = "배송주소록을 추가한다.")
    @ApiImplicitParam(name = "deliveryAddress", value = "배송주소", required = true, dataType = "DeliveryAddress", paramType = "body")
    @PostMapping("/api/v1/delivery/address")
    public ResponseMessage addDeliveryAddress(@RequestBody DeliveryAddress deliveryAddress) {

        log.debug("배송주소록 추가 진입");
        log.debug("입력 정보 : {}", deliveryAddress);

        return this.deliveryService.insertDeliveryAddress(deliveryAddress);

    }

}
