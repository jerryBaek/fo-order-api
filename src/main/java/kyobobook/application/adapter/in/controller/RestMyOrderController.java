/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * seohee.ko@kyobobook.com      2021. 12. 21.
 *
 ****************************************************/
package kyobobook.application.adapter.in.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
 * @FileName    : RestMyOrderController.java
 * @Date        : 2021. 12. 21.
 * @author      : seohee.ko@kyobobook.com
 * @description : 
 */
@Slf4j
@Api(tags = "주문, 배송")
@RequestMapping("/ord/api/v1/my-order")
@RestController
public class RestMyOrderController {

    /**
     * @Method      : selectMyOrder
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 주문, 배송 목록 조회
     * @return
     */
    @ApiOperation(value = "주문, 배송 목록 조회", notes = "주문, 배송 목록을 조회합니다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = {"/", ""})
    public ResponseMessage selectMyOrderList() {
        
        return null;
    }
    
    /**
     * @Method      : selectOrderCount
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 주문, 배송 요약 정보 조회
     * @return
     */
    @ApiOperation(value = "주문, 배 요약 정보 조회", notes = "주문, 배송 요약 정보를 조회합니다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/count")
    public ResponseMessage selectMyOrderCount() {
        
        return null;
    }
    
    /**
     * @Method      : deleteMyOrder
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 주문내역 삭제
     * @return
     */
    @ApiOperation(value = "주문내역 삭제", notes = "주문내역을 삭제합니다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @DeleteMapping(value = "/{ordrId}")
    public ResponseMessage deleteMyOrder() {
        
        return null;
    }
    
    /**
     * @Method      : selectMyOrderDetail
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 주문, 배송 상세 조회
     * @return
     */
    @ApiOperation(value = "주문, 배송 상세 조회", notes = "주문, 배송 상세내역을 조회합니다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/{ordrId}")
    public ResponseMessage selectMyOrderDetail() {
        
        return null;
    }
    
    /**
     * @Method      : selectDiscountDescription
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 할인 상세내역 조회
     * @return
     */
    @ApiOperation(value = "할인 상세내역 조회", notes = "할인 상세내역을 조회합니다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/description/{ordrId}")
    public ResponseMessage selectDiscountDescription() {
        
        return null;
    }
    
    /**
     * @Method      : selectDepositInformation
     * @Date        : 2021. 12. 24.
     * @author      : seohee.ko@kyobobook.com
     * @description : 온라인입금 안내 조회
     * @return
     */
    @ApiOperation(value = "온라인입금 안내 조회", notes = "온라인입금 주문의 입금기한을 조회합니다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/deposit-Information")
    public ResponseMessage selectDepositInformation() {
        
        return null;
    }
    
    /**
     * @Method      : updateMyOrderDeliveryAddress
     * @Date        : 2021. 12. 24.
     * @author      : seohee.ko@kyobobook.com
     * @description : 배송지 변경
     * @return
     */
    @ApiOperation(value = "배송지 변경", notes = "주문서에 입력된 배송지를 변경합니다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PutMapping(value = "/delivery-address/{ordrId}")
    public ResponseMessage updateMyOrderDeliveryAddress() {
        
        return null;
    }
}
