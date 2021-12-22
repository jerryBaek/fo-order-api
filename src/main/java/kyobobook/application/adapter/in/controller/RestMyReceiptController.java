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
     * @Method      : selectReceiptList
     * @Date        : 2021. 12. 22.
     * @author      : seohee.ko@kyobobook.com
     * @description : 영수증 목록 조회
     * @return
     */
    @ApiOperation(value = "영수증 목록 조회", notes = "영수증 목록을 조회한다.")
    @GetMapping(value = {"/", ""})
    public ResponseMessage selectReceiptList() {
        
        return null;
    }
    
    /**
     * @Method      : selectReceipt
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 
     * @return
     */
    @ApiOperation(value = "영수증 상세 조회", notes = "영수증 상세내역을 조회한다.")
    @GetMapping(value = "/{ordrId}")
    public ResponseMessage selectReceiptDetail() {
        
        return null;
    }
    
    /**
     * @Method      : selectCreditcardStatementDetail
     * @Date        : 2021. 12. 22.
     * @author      : seohee.ko@kyobobook.com
     * @description : 신용카드 매출전표 상세 조회
     * @return
     */
    @ApiOperation(value = "신용카드 매출전표 상세 조회", notes = "신용카드 매출전표 상세내역을 조회한다.")
    @GetMapping(value = "/creditcard-statement/{ordrId}")
    public ResponseMessage selectCreditcardStatementDetail() {
        
        return null;
    }
    
    /**
     * @Method      : selectCashReceiptDetail
     * @Date        : 2021. 12. 22.
     * @author      : seohee.ko@kyobobook.com
     * @description : 현금영수증 상세내역 조회
     * @return
     */
    @ApiOperation(value = "현금영수증 상세 조회", notes = "현금영수증 상세내역을 조회한다.")
    @GetMapping(value = "/cash-receipt/{ordrId}")
    public ResponseMessage selectCashReceiptDetail() {
        log.debug("RestMyReceiptController.selectCashReceiptDetail:: 현금영수증 상세내역 조회");
        return null;
    }
    
    /**
     * @Method      : selectSmartReceiptDetail
     * @Date        : 2021. 12. 22.
     * @author      : seohee.ko@kyobobook.com
     * @description : 스마트 영수증 상세내역 조회
     * @return
     */
    @ApiOperation(value = "스마트 영수증 상세 조회", notes = "스마트 영수증 상세내역을 조회한다.")
    @GetMapping(value = "/smart-receipt/{ordrId}")
    public ResponseMessage selectSmartReceiptDetail() {
        
        return null;
    }
    
    /**
     * @Method      : insertSmartReceipt
     * @Date        : 2021. 12. 22.
     * @author      : seohee.ko@kyobobook.com
     * @description : 스마트 영수증 설정
     * @return
     */
    @ApiOperation(value = "스마트 영수증 설정", notes = "스마트 영수증 설정을 한다.")
    @PostMapping(value = "/smart-receipt")
    public ResponseMessage insertSmartReceipt() {
        
        return null;
    }
    
    /**
     * @Method      : deleteSmartReceipt
     * @Date        : 2021. 12. 22.
     * @author      : seohee.ko@kyobobook.com
     * @description : 스마트 영수증 설정 해제
     * @return
     */
    @ApiOperation(value = "스마트 영수증 설정 해제", notes = "스마트 영수증 설정해제를 한다.")
    @DeleteMapping(value = "/smart-receipt")
    public ResponseMessage deleteSmartReceipt() {
        
        return null;
    }
    
    /**
     * @Method      : selectOnOfflineOrderList
     * @Date        : 2021. 12. 22.
     * @author      : seohee.ko@kyobobook.com
     * @description : 온라인/매장 구매내역 조회
     * @return
     */
    @ApiOperation(value = "온라인/매장 구매내역 조회", notes = "온라인/매장 구매내역을 조회한다.")
    @GetMapping(value = "/o2o")
    public ResponseMessage selectOnOfflineOrderList() {
        
        return null;
    }
    
}
