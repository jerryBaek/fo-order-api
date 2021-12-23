/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * kimsehoon@kyobobook.com      2021. 12. 22.
 *
 ****************************************************/
package kyobobook.application.adapter.in.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.common.Constants;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project     : fo-order-api
 * @FileName    : RestOrderSheetController.java
 * @Date        : 2021. 12. 22.
 * @author      : kimsehoon@kyobobook.com
 * @description : 주문서 컨트롤러
 */
@Slf4j
@Api(tags = "주문서")
@RequestMapping(Constants.PATH_PREFIX)
@RestController
public class RestOrderSheetController {

    /**
     * @Method      : getProduct
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 주문서 상품 이름 조회
     * @return
     */
    @ApiOperation(value = "주문서 상품 이름 조회", notes = "주문서에 대한 상품 이름을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/order-sheet/product")
    public ResponseMessage getProduct() {
        return null;
    }

    /**
     * @Method      : getProductCount
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 주문서 상품 이름 조회
     * @return
     */
    @ApiOperation(value = "주문서 상품 갯수 조회", notes = "주문서에 대한 상품 갯수를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/order-sheet/product/count")
    public ResponseMessage getProductCount() {
        return null;
    }

    /**
     * @Method      : getPayMethod
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 주문서 상품 결제정보 조회
     * @return
     */
    @ApiOperation(value = "주문서 상품 결제정보 조회", notes = "주문서에 대한 결제정보를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/order-sheet/pay/method")
    public ResponseMessage getPayMethod() {
        return null;
    }

    /**
     * @Method      : getDelivery
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 주문서 배송지정보 조회
     * @return
     */
    @ApiOperation(value = "주문서 배송지정보 조회", notes = "주문서에 대한 배송지 정보를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/order-sheet/delivery")
    public ResponseMessage getDelivery() {
        return null;
    }

    /**
     * @Method      : getBarodrimDelivery
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 주문서 바로드림 배송정보 조회
     * @return
     */
    @ApiOperation(value = "주문서 바로드림 배송정보 조회", notes = "주문서에 대한 바로드림 유형별 배송정보를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/order-sheet/delivery/barodrim")
    public ResponseMessage getBarodrimDelivery() {
        return null;
    }

    /**
     * @Method      : getPayAccount
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 주문서 입출금계좌정보 조회
     * @return
     */
    @ApiOperation(value = "주문서 입출금계좌정보 조회", notes = "주문서에 대한 입출금계좌번호를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/order-sheet/pay/account")
    public ResponseMessage getPayAccount() {
        return null;
    }

    /**
     * @Method      : getGiftReceiver
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 주문서 선물받는분정보 조회
     * @return
     */
    @ApiOperation(value = "주문서 선물받는분정보 조회", notes = "주문서에 대한 선물받는분정보를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/order-sheet/gift/receiver")
    public ResponseMessage getGiftReceiver() {
        return null;
    }

}
