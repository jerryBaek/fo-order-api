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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import kyobobook.application.domain.claim.ClaimApplication;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.common.Constants;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project     : fo-order-api
 * @FileName    : RestMyClaimController.java
 * @Date        : 2021. 12. 21.
 * @author      : seohee.ko@kyobobook.com
 * @description : 
 */
@Slf4j
@Api(tags = "클레임")
@RequestMapping("/ord/api/v1/my-claim")
@RestController
public class RestMyClaimController {
    
    /**
     * @Method      : selectMyClaimDetail
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 주문 취소, 교환, 반품 내역 상세 조회
     * @return
     */
    @ApiOperation(value = "주문 취소, 교환, 반품 내역 상세 조회", notes = "주문 취소, 교환, 반품 상세내역을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/{ordrId}")
    public ResponseMessage selectMyClaimDetail() {
        
        return null;
    }
    
    /**
     * @Method      : insertOrderCancel
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 주문 취소신청
     * @return
     */
    @ApiOperation(value = "주문 취소신청", notes = "주문 취소신청을 등록한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ClaimApplication.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "ClaimApplication" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PostMapping(value = "/cancel")
    public ResponseMessage insertOrderCancel(ClaimApplication claimApplication) {
     
        return new ResponseMessage();
    }
    
    /**
     * @Method      : insertOrderExchange
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 교환신청
     * @return
     */
    @ApiOperation(value = "교환신청", notes = "교환신청을 등록한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ClaimApplication.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "ClaimApplication" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PostMapping(value = "/exchange")
    public ResponseMessage insertOrderExchange(ClaimApplication claimApplication) {
        
        return new ResponseMessage();
    }
    
    /**
     * @Method      : insertOrderReturn
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 반품신청
     * @return
     */
    @ApiOperation(value = "반품신청", notes = "반품신청을 등록한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ClaimApplication.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "ClaimApplication" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PostMapping(value = "/return")
    public ResponseMessage insertOrderReturn(ClaimApplication claimApplication) {
        
        return new ResponseMessage();
    }
    
    /**
     * @Method      : deleteClaim
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 교환, 반품 철회
     * @return
     */
    @ApiOperation(value = "교횐, 반품 철회", notes = "교환, 반품 신청을 삭제한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @DeleteMapping(value = "/withdraw")
    public ResponseMessage deleteClaim() {
        
        return null;
    }

    /**
     * @Method      : insertFreebieCancel
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 사은품 주문 취소신청 - 확인 후 삭제예정
     * @return
     */
    @ApiOperation(value = "사은품 주문 취소신청", notes = "사은품 주문 취소신청을 한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @Deprecated
    @PostMapping(value = "/freebie/cancel")
    public ResponseMessage insertFreebieCancel() {
        
        return null;
    }
    
    /**
     * @Method      : insertFreebieReturn
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 사은품 반품신청 - 확인 후 삭제예정
     * @return
     */
    @ApiOperation(value = "사은품 반품신청", notes = "사은품 반품신청을 한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @Deprecated
    @PostMapping(value = "/freebie/return")
    public ResponseMessage insertFreebieReturn() {
        
        return null;
    }
}
