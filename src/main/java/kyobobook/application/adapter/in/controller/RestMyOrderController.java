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
import kyobobook.application.domain.orderhistory.OrderHistory;
import kyobobook.application.domain.orderhistory.OrderHistoryMaster;
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
                , response = OrderHistory.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "OrderHistory" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = {"/", ""})
    public ResponseMessage selectMyOrderList(OrderHistory orderHistory) {
        
        return new ResponseMessage();
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
                , response = OrderHistoryMaster.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "OrderHistoryMaster" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/count")
    public ResponseMessage selectMyOrderCount(OrderHistoryMaster orderHistoryMaster) {
        /** 주문 요약정보
         * 수량SUM기준
         * 준비중  : 110, 111, 400, 500, 112, 113, 121, 122, 124, 132의 합 (배송완료, 수령완료, 다운로드 완료되지 않은 준비상태)
         * 배송완료 : 115, 123, 125, 133, 동영상신규코드, sam신규코드의 합 (종이책의 배송완료상태, 바로드림의 배송종료상태, 컨텐츠 상품의 다운로드 또는 이용완료 상태)
         * 취소    : 190, 194, 강연, 공연 신규코드, 여행 신규코드의 합 (주문취소 완료 또는 주문상품 품절된 상태, 비실물의 경우 매진된 상태)
         * 교환    : 311, 317, 318, 312, 313, 314, 319, 392, 316의 합 (종이책 교환관련 모든상태(교환신청, 교환취소, 교환신청취소, 교환처리중, 교환완료))
         * 반품    : 210, 211, 230, 255, 260, 292, 강연, 공연, 여행 신규코드의 합 (종이책 반품관련 모든상태(반품신청, 반품취소, 회수진행중, 반품신청취소, 반품완료))
         *   */
        return new ResponseMessage();
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
                , response = OrderHistoryMaster.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "OrderHistoryMaster" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @DeleteMapping(value = "/{ordrId}")
    public ResponseMessage deleteMyOrder(OrderHistoryMaster orderHistoryMaster) {
        
        return new ResponseMessage();
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
                , response = OrderHistoryMaster.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "OrderHistoryMaster" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/{ordrId}")
    public ResponseMessage selectMyOrderDetail(OrderHistoryMaster OrderHistoryMaster) {
        
        return new ResponseMessage();
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
    @Deprecated
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
                , response = OrderHistoryMaster.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "OrderHistoryMaster" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/deposit-Information")
    public ResponseMessage selectDepositInformation(OrderHistoryMaster orderHistoryMaster) {
        
        return new ResponseMessage();
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
    
    /**
     * @Method      : selectCouponApplyAmount
     * @Date        : 2022. 1. 6.
     * @author      : seohee.ko@kyobobook.com
     * @description : 쿠폰 사용내역 조회
     * @return
     */
    @ApiOperation(value = "쿠폰 사용내역 조회", notes = "해당 주문의 쿠폰 적용 내역을 조회합니다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = OrderHistoryMaster.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "OrderHistoryMaster" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PutMapping(value = "/coupon")
    public ResponseMessage selectCouponApplyAmount(OrderHistoryMaster OrderHistoryMaster) {
        
        return new ResponseMessage();
    }
    
    /**
     * @Method      : selectCouponApplyAmount
     * @Date        : 2022. 1. 6.
     * @author      : seohee.ko@kyobobook.com
     * @description : 배송 조회
     * @return
     */
    @ApiOperation(value = "배송 조회", notes = "해당 주문의 배송상황을 조회합니다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = OrderHistoryMaster.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "OrderHistoryMaster" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/delivery")
    public ResponseMessage selectDeliveryInfo(OrderHistoryMaster OrderHistoryMaster) {
        
        return new ResponseMessage();
    }
}
