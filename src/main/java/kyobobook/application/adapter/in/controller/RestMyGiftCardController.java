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
 * @FileName : MyGiftCardController.java
 * @Date : 2021. 12. 24.
 * @author : jhbaek@kyobobook.com
 * @description : MyGiftCardController
 */
@Slf4j
@Api(tags = "MY기프트카드")
@RequestMapping("/ord")
@RestController
public class RestMyGiftCardController {

    /** 장바구니 서비스 */
    @Autowired
    private CartPort cartService;

    /**
     * @Method : selectGiftCardBalance
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 기프트카드 잔액확인
     * @return null
     */
    @ApiOperation(value = "기프트카드 잔액확인", notes = "기프트카드 잔액을 확인한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @GetMapping("/api/v1/my-giftcard/asset")
    public ResponseMessage selectGiftCardBalance() {

        log.debug("================기프트카드 잔액확인");

        return null;
    }
    
    
    /**
     * @Method : selectGiftCardList
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 보유 기프트카드 목록 조회
     * @return null
     */
    @ApiOperation(value = "보유 기프트카드 목록 조회", notes = "보유 기프트카드 목록을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @GetMapping("/api/v1/my-giftcard/list")
    public ResponseMessage selectGiftCardList() {

        log.debug("================보유 기프트카드 목록 조회");

        return null;
    }
    
    
    /**
     * @Method : selectGiftCardListOfHoldingCards
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 기프트카드 보유 카드 이용내역 목록 조회
     * @return null
     */
    @ApiOperation(value = "기프트카드 보유 카드 이용내역 목록 조회", notes = "기프트카드 보유 카드 이용내역 목록을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @GetMapping("/api/v1/my-giftcard")
    public ResponseMessage selectGiftCardListOfHoldingCards() {

        log.debug("================기프트카드 보유 카드 이용내역 목록 조회");

        return null;
    }
    
    
    
    /**
     * @Method : updateSetGiftCardRepresentativeCard
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 기프트카드 대표카드 설정
     * @param
     * @return null
     */
    @ApiOperation(value = "기프트카드 대표카드 설정", notes = "기프트카드 대표카드를 설정한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PutMapping("/api/v1/my-giftcard/representation")
    public ResponseMessage updateSetGiftCardRepresentativeCard() {

        log.debug("기프트카드 대표카드 설정");
        
        return null;
    } 
    
    /**
     * @Method : deleteHoldingCard
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 보유 기프트카드 삭제
     * @param cardNo
     * @return null
     */
    @ApiOperation(value = "보유 기프트카드 삭제", notes = "보유 기프트카드를 삭제한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @ApiImplicitParam(name = "cardNo", value = "카드번호", required = true, dataType = "string",
    paramType = "path", defaultValue = "1234567895486953")
    @DeleteMapping("/api/v1/my-giftcard")
    public ResponseMessage deleteHoldingCard() {

        log.debug("보유 기프트카드 삭제");
        
        return null;
    }      
    
    
    /**
     * @Method : updateCardNameEdit
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 기프트카드 네임 수정
     * @param cardNo
     * @return null
     */
    @ApiOperation(value = "기프트카드 네임 수정", notes = "기프트카드 네임을 수정한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @ApiImplicitParam(name = "cardNo", value = "카드번호", required = true, dataType = "string",
    paramType = "path", defaultValue = "1234567895486953")    
    @PutMapping("/api/v1/my-giftcard")
    public ResponseMessage updateCardNameEdit() {

        log.debug("기프트카드 네임 수정");
        
        return null;
    } 
    
    
    /**
     * @Method : selectUsedGiftCard
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 기프트카드 이용 내역
     * @return null
     */
    @ApiOperation(value = "기프트카드 이용 내역", notes = "기프트카드 이용 내역을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @GetMapping("/api/v1/my-giftcard/use-list")
    public ResponseMessage selectUsedGiftCard() {

        log.debug("================기프트카드 이용 내역");

        return null;
    }
    
    /**
     * @Method : selectAutomationChargeHistoryGiftCard
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 기프트카드 자동충전 내역
     * @return null
     */
    @ApiOperation(value = "기프트카드 자동충전 내역", notes = "기프트카드 자동충전 내역을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @GetMapping("/api/v1/my/giftcard/automation-charging")
    public ResponseMessage selectAutomationChargeHistoryGiftCard() {

        log.debug("================기프트카드 자동충전 내역");

        return null;
    }   
    

    /**
     * @Method : deleteAutomationChargeGiftCard
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 기프트카드 자동충전 해지
     * @param
     * @return null
     */
    @ApiOperation(value = "기프트카드 자동충전 해지", notes = "기프트카드 자동충전을 해지한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @DeleteMapping("/api/v1/my-giftcard/automation-charging")
    public ResponseMessage deleteAutomationChargeGiftCard() {

        log.debug("기프트카드 자동충전 해지");
        
        return null;
    }      
    
    
    /**
     * @Method : addGiftCardGeneralCharging
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 기프트카드 일반충전
     * @return null
     */
    @ApiOperation(value = "기프트카드 일반충전", notes = "기프트카드를 일반충전한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @PostMapping("/api/v1/my-giftcard/charging")
    public ResponseMessage addGiftCardGeneralCharging() {

        log.debug("================기프트카드 일반충전");

        return null;
    } 
    
    
    /**
     * @Method : addGiftCardAutomationCharging
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 기프트카드 자동충전
     * @return null
     */
    @ApiOperation(value = "기프트카드 자동충전", notes = "기프트카드를 자동충전한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @PostMapping("/api/v1/my-giftcard/automation-charging")
    public ResponseMessage addGiftCardAutomationCharging() {

        log.debug("================기프트카드 자동충전");

        return null;
    } 
    
    /**
     * @Method : addRegisterGiftCard
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 기프트카드 등록
     * @return null
     */
    @ApiOperation(value = "기프트카드 등록", notes = "기프트카드 보유카드를 등록한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @PostMapping("/api/v1/my-giftcard")
    public ResponseMessage addRegisterGiftCard() {

        log.debug("================기프트카드 등록");

        return null;
    } 
    
    
    /**
     * @Method : addGiftCardBuyGiftExchange
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 기프트카드 구매/선물/교환
     * @return null
     */
    @ApiOperation(value = "기프트카드 구매/선물/교환", notes = "기프트카드 구매 및 선물 및 교환을 한다. ")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @PostMapping("/api/v1/my-giftcard/buy")
    public ResponseMessage addGiftCardBuyGiftExchange() {

        log.debug("================기프트카드 구매/선물/교환");

        return null;
    } 


    /**
     * @Method : selectGiftCardBarcode
     * @Date : 2021. 12. 24.
     * @author : jhbaek@kyobobook.com
     * @description : 기프트카드 바코드 조회
     * @return null
     */
    @ApiOperation(value = "기프트카드 바코드 조회", notes = "기프트카드 바코드를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })    
    @GetMapping("/api/v1/my-giftcard/barcode")
    public ResponseMessage selectGiftCardBarcode() {

        log.debug("================기프트카드 바코드 조회");

        return null;
    }   
    
    
}
