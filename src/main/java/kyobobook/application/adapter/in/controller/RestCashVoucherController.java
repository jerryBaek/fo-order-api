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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import kyobobook.application.domain.cashvoucher.BankBalanceMileage;
import kyobobook.application.domain.cashvoucher.KyoboCashAccumulation;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.primitive.StringType;
import kyobobook.common.Constants;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project     : fo-order-api
 * @FileName    : RestCashVoucherController.java
 * @Date        : 2021. 12. 22.
 * @author      : kimsehoon@kyobobook.com
 * @description : 금권 컨트롤러
 */
@Slf4j
@Api(tags = "금권")
@RequestMapping(Constants.PATH_PREFIX)
@RestController
public class RestCashVoucherController {

    /**
     * @Method      : getBankBalance
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 장바구니 하단 페이배너 조회
     * @return
     */
    @ApiOperation(value = "예치금 조회", notes = "사용자가 보유 한 예치금을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "BankBalanceMileage" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/cash-voucher/bank-balance")
    public ResponseMessage getBankBalance() {
        return ResponseMessage.builder().build().setExample(BankBalanceMileage.class);
    }

    /**
     * @Method      : spendBankBalance
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 장바구니 하단 페이배너 조회
     * @return
     */
    @ApiOperation(value = "예치금 사용", notes = "사용자가 보유 한 예치금을 사용한다.")
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
    @PostMapping(value = "/api/v1/cash-voucher/bank-balance")
    public ResponseMessage spendBankBalance() {
        return ResponseMessage.builder().build().setExample(StringType.class);
    }

    /**
     * @Method      : getMileage
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 마일리지 조회
     * @return
     */
    @ApiOperation(value = "마일리지 조회", notes = "사용자가 보유 한 마일리지를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX
                            + "BankBalanceMileage"
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/cash-voucher/mileage")
    public ResponseMessage getMileage() {
        return ResponseMessage.builder().build().setExample(BankBalanceMileage.class);
    }

    /**
     * @Method      : spendMileage
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 마일리지 조회
     * @return
     */
    @ApiOperation(value = "마일리지 사용", notes = "사용자가 보유 한 마일리지를 사용한다.")
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
    @PostMapping(value = "/api/v1/cash-voucher/mileage")
    public ResponseMessage spendMileage() {
        return ResponseMessage.builder().build().setExample(StringType.class);
    }

    /**
     * @Method      : getKyoboCash
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 교보캐시 조회
     * @return
     */
    @ApiOperation(value = "교보캐시 조회", notes = "사용자가 보유 한 교보캐시를 사용한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX
                            + "KyoboCashAccumulation"
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/cash-voucher/kyobo-cash")
    public ResponseMessage getKyoboCash() {
        return ResponseMessage.builder().build().setExample(KyoboCashAccumulation.class);
    }

    /**
     * @Method      : spendKyoboCash
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 교보캐시 조회
     * @return
     */
    @ApiOperation(value = "교보캐시 사용", notes = "사용자가 보유 한 교보캐시를 사용한다.")
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
    @PostMapping(value = "/api/v1/cash-voucher/kyobo-cash")
    public ResponseMessage spendKyoboCash() {
        return ResponseMessage.builder().build().setExample(StringType.class);
    }

}
