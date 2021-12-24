/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved. This software is the proprietary
 * information of Kyobo Book.
 *
 * Revision History Author Date Description -------------------------- ----------
 * ---------------------------------------- smlee1@kyobobook.com 2021. 8. 17. First Draft.
 *
 ****************************************************/
package kyobobook.application.adapter.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import kyobobook.application.biz.cart.port.in.CartPort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.common.Constants;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project : fo-order-api
 * @FileName : MyBenefitController.java
 * @Date : 2021. 12. 24.
 * @author : jhbaek@kyobobook.com
 * @description : MyBenefit Controller
 */
@Slf4j
@Api(tags = "혜택")
@RequestMapping("/ord")
@RestController
public class RestMyBenefitController {

    /** 장바구니 서비스 */
    @Autowired
    private CartPort cartService;

    /**
     * @Method : selectMileageUsedList
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 마일리지 적립/사용내역 목록 조회
     * @return null
     */
    @ApiOperation(value = "마일리지 적립/사용내역 목록 조회", notes = "마일리지 적립/사용내역 목록을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @GetMapping("/api/v1/my-benefit/mileage")
    public ResponseMessage selectMileageUsedList() {

        log.debug("================마일리지 적립/사용내역 목록 조회");

        return null;
    }
    
    
    /**
     * @Method : selectOwnedMileage
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 보유 마일리지 조회
     * @return null
     */
    @ApiOperation(value = "보유 마일리지 조회", notes = "보유 마일리지를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @GetMapping("/api/v1/my-benefit/mileage/asset")
    public ResponseMessage selectOwnedMileage() {

        log.debug("================보유 마일리지 조회");

        return null;
    }
    
    
    /**
     * @Method : addConversionIntegrationPoint
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 마일리지 통합포인트로 전환
     * @param
     * @return null
     */
    @ApiOperation(value = "마일리지 통합포인트로 전환", notes = "마일리지를 통합포인트로 전환한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PostMapping("/api/v1/my-benefit/mileage/conversion")
    public ResponseMessage addConversionIntegrationPoint() {

        log.debug("마일리지 통합포인트로 전환");
        
        return null;
    }
    
    
    /**
     * @Method : selectUsableAmountDeposit
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 예치금 사용 가능 금액 조회
     * @return null
     */
    @ApiOperation(value = "예치금 사용 가능 금액 조회", notes = "예치금 사용 가능 금액을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @GetMapping("/api/v1/my-benefit/bank-balance/asset")
    public ResponseMessage selectUsableAmountDeposit() {

        log.debug("================예치금 사용 가능 금액 조회");

        return null;
    }
    
    
    
    /**
     * @Method : selectHistoryOfDeposit
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 예치금 내역 조회
     * @return null
     */
    @ApiOperation(value = "예치금 내역 조회", notes = "예치금 내역을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @GetMapping("/api/v1/my-benefit/bank-balance")
    public ResponseMessage selectHistoryOfDeposit() {

        log.debug("================예치금 내역 조회");

        return null;
    }
    
    
    
    /**
     * @Method : addRefundRequestOfDeposit
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 예치금 환불신청
     * @param
     * @return null
     */
    @ApiOperation(value = "예치금 환불신청", notes = "예치금을 환불신청한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PostMapping("/api/v1/my-benefit/bank-balance/refundment")
    public ResponseMessage addRefundRequestOfDeposit() {

        log.debug("예치금 환불신청");
        
        return null;
    }
    
    
    /**
     * @Method : selectHistoryOfRefundRequestDeposit
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 예치금 환불신청 내역 조회
     * @return null
     */
    @ApiOperation(value = "예치금 환불신청 내역 조회", notes = "예치금 환불신청 내역 조회.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @GetMapping("/api/v1/my-benefit/bank-balance/refundment")
    public ResponseMessage selectHistoryOfRefundRequestDeposit() {

        log.debug("================예치금 환불신청 내역 조회");

        return null;
    }
    
    
    
    /**
     * @Method : deleteRefundRequestOfDeposit
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 예치금 환불신청 취소
     * @param
     * @return null
     */
    @ApiOperation(value = "예치금 환불신청 취소", notes = "예치금을 환불신청 취소한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @DeleteMapping("/api/v1/my-benefit/bank-balance/refundment")
    public ResponseMessage deleteRefundRequestOfDeposit() {

        log.debug("예치금 환불신청 취소");
        
        return null;
    }      
    
    
    /**
     * @Method : selectHoldingKyoboCash
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 보유 교보캐시 조회
     * @return null
     */
    @ApiOperation(value = "보유 교보캐시 조회", notes = "보유 교보캐시를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @GetMapping("/api/v1/my-benefit/kyobo-cash/asset")
    public ResponseMessage selectHoldingKyoboCash() {

        log.debug("================보유 교보캐시 조회");

        return null;
    }
    
    
    
    /**
     * @Method : selectCTEUDHistory
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 교보캐시 충전/전환/이벤트/사용/소멸 내역 목록 조회
     * @return null
     */
    @ApiOperation(value = "교보캐시 충전/전환/이벤트/사용/소멸 내역 목록 조회", notes = "교보캐시 충전/전환/이벤트/사용/소멸 내역의 목록을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @GetMapping("/api/v1/my-benefit/kyobo-cash")
    public ResponseMessage selectCTEUDHistory() {

        log.debug("================교보캐시 충전/전환/이벤트/사용/소멸 내역 목록 조회");

        return null;
    }    
    
    
    /**
     * @Method : addChargeKyoboCash
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 교보캐시 충전
     * @param
     * @return null
     */
    @ApiOperation(value = "교보캐시 충전", notes = "교보캐시를 충전한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PostMapping("/api/v1/my-benefit/kyobo-cash")
    public ResponseMessage addChargeKyoboCash() {

        log.debug("교보캐시 충전");
        
        return null;
    }  
    
    
    /**
     * @Method : updateConvertToKyoboCash
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 교보캐시로 전환
     * @param
     * @return null
     */
    @ApiOperation(value = "교보캐시로 전환", notes = "교보캐시로 전환을 한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PutMapping("/api/v1/my-benefit/kyobo-cash/conversion")
    public ResponseMessage updateConvertToKyoboCash() {

        log.debug("교보캐시로 전환");
        
        return null;
    } 
   
    
    /**
     * @Method : selectKyoboCashOnlineDepAppHisInq
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 교보캐시 온라인 입금 신청 내역 조회
     * @return null
     */
    @ApiOperation(value = "교보캐시 온라인 입금 신청 내역 조회", notes = "교보캐시 온라인 입금 신청 내역을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @GetMapping("/api/v1/my-benefit/kyobo-cash/description")
    public ResponseMessage selectKyoboCashOnlineDepAppHisInq() {

        log.debug("================교보캐시 온라인 입금 신청 내역 조회");

        return null;
    }      
    
    
    /**
     * @Method : addGiftCardConversion
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 기프트카드 전환
     * @return null
     */
    @ApiOperation(value = "기프트카드 전환", notes = "기프트카드 잔액을 교보캐시로 전환한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @PostMapping("/api/v1/my-benefit/pin")
    public ResponseMessage addGiftCardConversion() {

        log.debug("================기프트카드 전환");

        return null;
    }        
    
    
    /**
     * @Method : selectUsedPinList
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : PIN 사용 내역 조회
     * @return null
     */
    @ApiOperation(value = "PIN 사용 내역 조회", notes = "PIN 사용내역을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @GetMapping("/api/v1/my-benefit/pin")
    public ResponseMessage selectUsedPinList() {

        log.debug("================PIN 사용 내역 조회");

        return null;
    }
    
    
    /**
     * @Method : addPINNumber
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : PIN 등록
     * @return null
     */
    @ApiOperation(value = "PIN 등록", notes = "PIN을 등록한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @PostMapping("/api/v1/my-benefit/pin-number")
    public ResponseMessage addPINNumber() {

        log.debug("================PIN 등록");

        return null;
    }        
    
    
}
