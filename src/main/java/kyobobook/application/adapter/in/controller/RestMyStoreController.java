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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kyobobook.application.domain.common.ResponseMessage;
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
    @GetMapping(value = {"/", ""})
    public ResponseMessage selectConcernStoreList() {
        
        return null;
    }
}
