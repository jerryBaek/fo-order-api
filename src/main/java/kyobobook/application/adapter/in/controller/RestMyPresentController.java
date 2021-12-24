/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * seohee.ko@kyobobook.com      2021. 12. 22.
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
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.common.Constants;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project     : fo-order-api
 * @FileName    : RestMyPresentController.java
 * @Date        : 2021. 12. 22.
 * @author      : seohee.ko@kyobobook.com
 * @description :
 */
@Slf4j
@Api(tags = "선물함")
@RequestMapping("/ord/api/v1/my-present")
@RestController
public class RestMyPresentController {

    /**
     * @Method      : selectPresentList
     * @Date        : 2021. 12. 23.
     * @author      : seohee.ko@kyobobook.com
     * @description : 선물 목록 조회
     * @return
     */
    @ApiOperation(value = "선물 목록 조회", notes = "받은 선물, 보낸 선물 목록을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = {"/", ""})
    public ResponseMessage selectPresentList() {
        
        return null;
    }
    
    /**
     * @Method      : selectPresentDetail
     * @Date        : 2021. 12. 23.
     * @author      : seohee.ko@kyobobook.com
     * @description : 선물 상세조회
     * @return
     */
    @ApiOperation(value = "선물 상세 조회", notes = "선물 상세내역을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/{ordrId}")
    public ResponseMessage selectPresentDetail() {
        
        return null;
    }
    
    /**
     * @Method      : insertPresent
     * @Date        : 2021. 12. 23.
     * @author      : seohee.ko@kyobobook.com
     * @description : 받은 선물 신규 등록
     * @return
     */
    @ApiOperation(value = "받은 선물 신규 등록", notes = "반은 선물을 신규 등록한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PostMapping(value = "/accept")
    public ResponseMessage insertPresentReceived() {
        
        return null;
    }

    /**
     * @Method      : selectPresentAvailableYn
     * @Date        : 2021. 12. 23.
     * @author      : seohee.ko@kyobobook.com
     * @description : 선물 등록/거절 가능여부 조회
     * @return
     */
    @ApiOperation(value = "선물 등록/거절 가능여부 조회", notes = "선물 등록/거절 가능여부를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/available")
    public ResponseMessage selectPresentAvailableYn() {
        
        return null;
    }
    
    /**
     * @Method      : deletePresent
     * @Date        : 2021. 12. 23.
     * @author      : seohee.ko@kyobobook.com
     * @description : 선물 취소
     * @return
     */
    @ApiOperation(value = "보낸선물 취소", notes = "보낸선물을 주문 취소한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @DeleteMapping(value = "/cancel")
    public ResponseMessage presentSentCancel() {
        
        return null;
    }
    
    /**
     * @Method      : presentReceivedReject
     * @Date        : 2021. 12. 23.
     * @author      : seohee.ko@kyobobook.com
     * @description : 선물 거절
     * @return
     */
    @ApiOperation(value = "선물 거절", notes = "선물을 거절처리 한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @DeleteMapping(value = "/reject")
    public ResponseMessage presentReceivedReject() {
        
        return null;
    }
    
}