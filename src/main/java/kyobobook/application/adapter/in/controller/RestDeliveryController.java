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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import kyobobook.application.biz.delivery.port.in.DeliveryPort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.delivery.DeliveryAddress;
import kyobobook.common.Constants;
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
@RequestMapping(Constants.PATH_PREFIX)
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
    @PostMapping("/api/v1/delivery/address/addDeliveryAddress")
    public ResponseMessage addDeliveryAddress(@RequestBody DeliveryAddress deliveryAddress) {

        log.debug("배송주소록 추가 진입");
        log.debug("입력 정보 : {}", deliveryAddress);

        return this.deliveryService.insertDeliveryAddress(deliveryAddress);

    }

    /**
     * @Method      : updateDeliveryAddress
     * @Date        : 2021. 12. 2.
     * @author      : seohee.ko@kyobobook.com
     * @description : 배송주소록 수정
     * @param deliveryAddress
     * @return
     */
    @ApiOperation(value = "배송주소록 수정", notes = "배송주소록을 수정한다.")
    @PutMapping("/api/v1/delivery/address/updDeliveryAddress")
    public ResponseMessage updateDeliveryAddress(@RequestBody DeliveryAddress deliveryAddress) {

        return this.deliveryService.updateDeliveryAddress(deliveryAddress);
    }

    /**
     * @Method      : getBaseDeliveryAddress
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 기준배송지 조회
     * @return
     */
    @ApiOperation(value = "기준배송지 조회", notes = "사용자 기준배송지를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/delivery/base/address")
    public ResponseMessage getBaseDeliveryAddress() {
        return null;
    }

    /**
     * @Method      : getBaseBarodrimStore
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 바로드림 기준매장 조회
     * @return
     */
    @ApiOperation(value = "바로드림 기준매장 조회", notes = "사용자 바로드림 기준매장을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/delivery/base/store/barodrim")
    public ResponseMessage getBaseBarodrimStore() {
        return null;
    }

    /**
     * @Method      : setBaseBarodrimStore
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 바로드림 기준매장 설정
     * @return
     */
    @ApiOperation(value = "바로드림 기준매장 설정", notes = "사용자 바로드림 기준매장을 설정한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PostMapping(value = "/api/v1/delivery/base/store/barodrim")
    public ResponseMessage setBaseBarodrimStore() {
        return null;
    }

    /**
     * @Method      : getDeliveryAddress
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 사용자 배송지 조회
     * @return
     */
    @ApiOperation(value = "사용자 배송지 조회", notes = "사용자가 등록한 배송지 목록을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/delivery/address")
    public ResponseMessage getDeliveryAddress() {
        return null;
    }

    /**
     * @Method      : getDeliveryNotice
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 배송 안내 공지 조회
     * @return
     */
    @ApiOperation(value = "배송 안내 공지 조회", notes = "주문 시 노출 할 배송안내공지를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/delivery/notice")
    public ResponseMessage getDeliveryNotice() {
        return null;
    }

    /**
     * @Method      : setDeliveryAddress
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 배송지 등록
     * @return
     */
    @ApiOperation(value = "배송지 등록", notes = "사용자 배송지를 등록한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PostMapping(value = "/api/v1/delivery/address")
    public ResponseMessage setDeliveryAddress() {
        return null;
    }

}
