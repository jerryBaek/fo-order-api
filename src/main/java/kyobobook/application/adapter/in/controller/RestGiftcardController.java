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
 * @FileName    : RestGiftcardController.java
 * @Date        : 2021. 12. 22.
 * @author      : kimsehoon@kyobobook.com
 * @description : 기프트카드 컨트롤러
 */
@Slf4j
@Api(tags = "기프트카드")
@RequestMapping(Constants.PATH_PREFIX)
@RestController
public class RestGiftcardController {

    /**
     * @Method      : getGiftcard
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 기프트카드 이미지 조회
     * @return
     */
    @ApiOperation(value = "기프트카드 이미지 조회", notes = "기프트카드 이미지(디자인)을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/giftcard")
    public ResponseMessage getGiftcard() {
        return null;
    }

    /**
     * @Method      : getGiftcardCount
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 기프트카드 보유 갯수 조회
     * @return
     */
    @ApiOperation(value = "기프트카드 보유 갯수 조회", notes = "사용자가 보유 한 기프트카드 갯수를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/giftcard/count")
    public ResponseMessage getGiftcardCount() {
        return null;
    }

}
