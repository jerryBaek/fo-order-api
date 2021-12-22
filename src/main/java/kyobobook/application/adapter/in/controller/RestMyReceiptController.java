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

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kyobobook.application.domain.common.ResponseMessage;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project     : fo-order-api
 * @FileName    : RestMyReceiptController.java
 * @Date        : 2021. 12. 21.
 * @author      : seohee.ko@kyobobook.com
 * @description :
 */
@Slf4j
@Api(tags = "영수증")
@RequestMapping("/ord/api/v1/my-receipt")
@RestController
public class RestMyReceiptController {

    /**
     * @Method      : selectReceipt
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 
     * @return
     */
    @ApiOperation(value = "영수증 상세 조회", notes = "영수증 상세내역을 조회한다.")
    @GetMapping(value = "")
    public ResponseMessage selectReceipt() {
        
        return null;
    }
}
