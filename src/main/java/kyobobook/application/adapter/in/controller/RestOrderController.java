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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
 * @FileName    : RestOrderController.java
 * @Date        : 2021. 12. 22.
 * @author      : kimsehoon@kyobobook.com
 * @description : 주문 컨트롤러
 */
@Slf4j
@Api(tags = "주문")
@RequestMapping(Constants.PATH_PREFIX)
@RestController
public class RestOrderController {

    /**
     * @Method      : getOrderProductCount
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 주문 상품 총 갯수 조회
     * @return
     */
    @ApiOperation(value = "주문 상품 총 갯수 조회", notes = "주문 할 상품에 대한 전체 상품 수를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/order/product/count")
    public ResponseMessage getProductCount() {
        return null;
    }

    /**
     * @Method      : getDelivery
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 주문 상품 배송 정보 조회
     * @return
     */
    @ApiOperation(value = "주문 상품 배송 정보 조회", notes = "주문 할 상품에 대한 배송정보를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/order/delivery")
    public ResponseMessage getDelivery() {
        return null;
    }

    /**
     * @Method      : getOverseasProduct
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 해외도서 주문 목록 조회
     * @return
     */
    @ApiOperation(value = "해외도서 주문 목록 조회", notes = "주문상품 중에서 해외도서 목록을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/order/product/overseas")
    public ResponseMessage getOverseasProduct() {
        return null;
    }

    /**
     * @Method      : getExpectDeliveryFeeForOverseasProductInFedex
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : FedEx 예상 배송비 조회
     * @return
     */
    @ApiOperation(value = "FedEx 예상 배송비 조회", notes = "해외배송 시 FedEx 예상 배송비를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/order/expection/overseas/delivery-fee/fedex")
    public ResponseMessage getExpectDeliveryFeeForOverseasProductInFedex() {
        return null;
    }

    /**
     * @Method      : getOverseasNation
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 해외배송국가목록 조회
     * @return
     */
    @ApiOperation(value = "해외배송국가목록 조회", notes = "해외배송 국가 목록을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/order/overseas/nation")
    public ResponseMessage getOverseasNation() {
        return null;
    }

    /**
     * @Method      : changeCoupon
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 쿠폰 변경 적용
     * @return
     */
    @ApiOperation(value = "쿠폰 변경 적용", notes = "변경된 쿠폰정보를 적용한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PutMapping(value = "/api/v1/order/coupon")
    public ResponseMessage changeCoupon() {
        return null;
    }

    /**
     * @Method      : getExpectedPayTwice
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 2회결제 대상 여부 조회
     * @return
     */
    @ApiOperation(value = "2회결제 대상 여부 조회", notes = "결제 시 2회결제 대상인지 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/order/expection/pay/twice")
    public ResponseMessage getExpectedPayTwice() {
        return null;
    }

    /**
     * @Method      : setOrder
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 주문서 생성
     * @return
     */
    @ApiOperation(value = "주문서 생성", notes = "주문서를 생성한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PostMapping(value = "/api/v1/order")
    public ResponseMessage setOrder() {
        return null;
    }


}
