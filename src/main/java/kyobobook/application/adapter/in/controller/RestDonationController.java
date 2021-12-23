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
import kyobobook.common.Constants;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project     : fo-order-api
 * @FileName    : RestDonationController.java
 * @Date        : 2021. 12. 22.
 * @author      : kimsehoon@kyobobook.com
 * @description : 기부 컨트롤러
 */
@Slf4j
@Api(tags = "기부")
@RequestMapping(Constants.PATH_PREFIX)
@RestController
public class RestDonationController {

    /**
     * @Method      : getDonation
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 기부 동의 노출여부
     * @return
     */
    @ApiOperation(value = "기부 동의 노출여부", notes = "B2C, B2B 기부단체 노출여부를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/donation")
    public ResponseMessage getDonation() {
        return null;
    }

}
