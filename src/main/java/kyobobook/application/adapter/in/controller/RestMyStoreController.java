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
 * @FileName    : RestMyStoreController.java
 * @Date        : 2021. 12. 22.
 * @author      : seohee.ko@kyobobook.com
 * @description :
 */
@Slf4j
@Api(tags = "관심매장")
@RequestMapping("/ord/api/v1/my-store")
@RestController
public class RestMyStoreController {

    /**
     * @Method      : selectConcernStoreList
     * @Date        : 2021. 12. 22.
     * @author      : seohee.ko@kyobobook.com
     * @description : 관심매장 목록 조회
     * @return
     */
    @ApiOperation(value = "관심매장 목록 조회", notes = "관심매장 목록을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = {"/", ""})
    public ResponseMessage selectConcernStoreList() {
        
        return null;
    }
    
    /**
     * @Method      : selectRegularStore
     * @Date        : 2021. 12. 22.
     * @author      : seohee.ko@kyobobook.com
     * @description : 기본매장 조회
     * @return
     */
    @ApiOperation(value = "기본매장 조회", notes = "기본매장을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/regular")
    public ResponseMessage selectRegularStore() {
        
        return null;
    }
    
    @ApiOperation(value = "관심매장 설정", notes = "관심매장을 신규 등록한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PostMapping(value = {"/", ""})
    public ResponseMessage insertConcernStore() {
        
        return null;
    }
}
