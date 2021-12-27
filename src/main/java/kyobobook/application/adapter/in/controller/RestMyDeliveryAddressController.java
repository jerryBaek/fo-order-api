/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * seohee.ko@kyobobook.com      2021. 12. 23.
 *
 ****************************************************/
package kyobobook.application.adapter.in.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.delivery.DeliveryAddress;
import kyobobook.common.Constants;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project     : fo-order-api
 * @FileName    : RestMyDeliveryController.java
 * @Date        : 2021. 12. 23.
 * @author      : seohee.ko@kyobobook.com
 * @description :
 */
@Slf4j
@Api(tags = "배송지")
@RequestMapping("/ord/api/v1/my-delivery")
@RestController
public class RestMyDeliveryAddressController {

    /**
     * @Method      : selectDeliveryAddressList
     * @Date        : 2021. 12. 23.
     * @author      : seohee.ko@kyobobook.com
     * @description : 
     * @return
     */
    @ApiOperation(value = "배송지 목록 조회", notes = "배송지 목록을 조회합니다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = {"/", ""})
    public ResponseMessage selectDeliveryAddressList() {
        return null;
    }
    
    /**
     * @Method      : insertDeliveryAddress
     * @Date        : 2021. 12. 23.
     * @author      : seohee.ko@kyobobook.com
     * @description : 배송지 추가
     * @return
     */
    @ApiOperation(value = "배송지 추가", notes = "배송지를 신규 등록한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PostMapping(value = {"/", ""})
    public ResponseMessage insertDeliveryAddress() {

        return null;

    }
    
    /**
     * @Method      : updateDeliveryAddress
     * @Date        : 2021. 12. 23.
     * @author      : seohee.ko@kyobobook.com
     * @description : 배송지 수정
     * @return
     */
    @ApiOperation(value = "배송지 수정", notes = "배송지를 수정한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PostMapping(value = "/{ordrDlpnId}")
    public ResponseMessage updateDeliveryAddress() {

        return null;
    }
    
    /**
     * @Method      : selectRegularDeliveryAddress
     * @Date        : 2021. 12. 23.
     * @author      : seohee.ko@kyobobook.com
     * @description : 기본 배송지 조회
     * @return
     */
    @ApiOperation(value = "기본 배송지 조회", notes = "기본 배송지를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX + "OBJECT_NAME" + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/regular")
    public ResponseMessage selectRegularDeliveryAddress() {
        
        return null;
    }
}
