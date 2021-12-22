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
import kyobobook.application.domain.common.ResponseMessage;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project     : fo-order-api
 * @FileName    : RestMyBankAccountController.java
 * @Date        : 2021. 12. 22.
 * @author      : seohee.ko@kyobobook.com
 * @description :
 */
@Slf4j
@Api(tags = "환불계좌")
@RequestMapping("/ord/api/v1/my/bank-account")
@RestController
public class RestMyBankAccountController {

    /**
     * @Method      : selectMyBankAccountList
     * @Date        : 2021. 12. 22.
     * @author      : seohee.ko@kyobobook.com
     * @description : 환불계좌 목록 조회
     * @return
     */
    @ApiOperation(value = "환불계좌 목록 조회", notes = "환불계좌 목록을 조회한다.")
    @GetMapping(value = {"/", ""})
    public ResponseMessage selectMyBankAccountList() {
        
        return null;
    }
    
    /**
     * @Method      : insertMyBankAccount
     * @Date        : 2021. 12. 22.
     * @author      : seohee.ko@kyobobook.com
     * @description : 환불계좌 신규 등록
     * @return
     */
    @ApiOperation(value = "환불계좌 신규 등록", notes = "환불계좌를 신규 등록한다.")
    @PostMapping(value = {"/", ""})
    public ResponseMessage insertMyBankAccount() {
        
        return null;
    }
    
    /**
     * @Method      : deleteMyBankAccount
     * @Date        : 2021. 12. 22.
     * @author      : seohee.ko@kyobobook.com
     * @description : 환불계좌 삭제
     * @return
     */
    @ApiOperation(value = "환불계좌 삭제", notes = "환불계좌를 삭제한다.")
    @DeleteMapping(value = "/{rfnmBnacRgstNum}")
    public ResponseMessage deleteMyBankAccount() {
        
        return null;
    }
}
