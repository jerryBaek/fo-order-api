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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import kyobobook.application.domain.barodrim.MemberBarodrimReceiptsAndDisbursementsPlace;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.primitive.StringType;
import kyobobook.common.Constants;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project     : fo-order-api
 * @FileName    : RestAttentionStoreController.java
 * @Date        : 2021. 12. 22.
 * @author      : kimsehoon@kyobobook.com
 * @description : 관심매장 컨트롤러
 */
@Slf4j
@Api(tags = "관심매장")
@RequestMapping(Constants.PATH_PREFIX)
@RestController
public class RestAttentionStoreController {

    /**
     * @Method      : getAttentionStore
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 바로드림 관심매장 조회
     * @return
     */
    @ApiOperation(value = "바로드림 관심매장 조회", notes = "사용자 바로드림 관심매장을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "MemberBarodrimReceiptsAndDisbursementsPlace" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/attention-store/barodrim")
    public ResponseMessage getAttentionStore(@RequestBody MemberBarodrimReceiptsAndDisbursementsPlace memberBarodrimReceiptsAndDisbursementsPlace) {
        return ResponseMessage.builder().build().setExample(MemberBarodrimReceiptsAndDisbursementsPlace.class);
    }

    /**
     * @Method      : setAttentionStore
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 바로드림 관심매장 설정
     * @return
     */
    @ApiOperation(value = "바로드림 관심매장 설정", notes = "사용자 바로드림 관심매장을 설정한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "StringType" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PostMapping(value = "/api/v1/attention-store/barodrim")
    public ResponseMessage setAttentionStore(@RequestBody MemberBarodrimReceiptsAndDisbursementsPlace memberBarodrimReceiptsAndDisbursementsPlace) {
        return ResponseMessage.builder().build().setExample(StringType.class);
    }

    /**
     * @Method      : removeAttentionStore
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 바로드림 관심매장 해제
     * @return
     */
    @ApiOperation(value = "바로드림 관심매장 해제", notes = "사용자 바로드림 관심매장을 해제한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "StringType" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @DeleteMapping(value = "/api/v1/attention-store/barodrim")
    public ResponseMessage removeAttentionStore(@RequestBody MemberBarodrimReceiptsAndDisbursementsPlace memberBarodrimReceiptsAndDisbursementsPlace) {
        return ResponseMessage.builder().build().setExample(StringType.class);
    }

}
