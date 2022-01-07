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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.delivery.DeliveryAddress;
import kyobobook.application.domain.delivery.MemberBasicOrderMethod;
import kyobobook.common.Constants;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project     : fo-order-api
 * @FileName    : RestCashReceiptController.java
 * @Date        : 2021. 12. 22.
 * @author      : kimsehoon@kyobobook.com
 * @description : 현금영수증 컨트롤러
 */
@Slf4j
@Api(tags = "현금영수증")
@RequestMapping(Constants.PATH_PREFIX)
@RestController
public class RestCashReceiptController {

    /**
     * @Method      : getCashReceipt
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 현금영수증 신청정보 조회
     * @return
     */
    @ApiOperation(value = "현금영수증 신청정보 조회", notes = "사용자가 등록 한 현금영수증 신청정보를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "MemberBasicOrderMethod" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/cash-receipt")
    public ResponseMessage getCashReceipt() {
        return ResponseMessage.builder().build().setExample(MemberBasicOrderMethod.class);
    }

}
