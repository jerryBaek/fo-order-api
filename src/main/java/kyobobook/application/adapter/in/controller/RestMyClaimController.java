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
 * @FileName    : RestMyClaimController.java
 * @Date        : 2021. 12. 21.
 * @author      : seohee.ko@kyobobook.com
 * @description : 
 */
@Slf4j
@Api(tags = "클레임")
@RequestMapping("/ord/api/v1/my-claim")
@RestController
public class RestMyClaimController {
    
    /**
     * @Method      : selectMyClaimDetail
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 주문 취소, 교환, 반품 내역 상세 조회
     * @return
     */
    @ApiOperation(value = "주문 취소, 교환, 반품 내역 상세 조회", notes = "주문 취소, 교환, 반품 상세내역을 조회한다.")
    @GetMapping(value = "/{ordrId}")
    public ResponseMessage selectMyClaimDetail() {
        
        return null;
    }
    
    /**
     * @Method      : insertOrderCancel
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 주문 취소신청
     * @return
     */
    @ApiOperation(value = "주문 취소신청", notes = "주문 취소신청을 등록한다.")
    @PostMapping(value = "/cancel")
    public ResponseMessage insertOrderCancel() {
     
        return null;
    }
    
    /**
     * @Method      : insertOrderExchange
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 교환신청
     * @return
     */
    @ApiOperation(value = "교환신청", notes = "교환신청을 등록한다.")
    @PostMapping(value = "/exchange")
    public ResponseMessage insertOrderExchange() {
        
        return null;
    }
    
    /**
     * @Method      : insertOrderReturn
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 반품신청
     * @return
     */
    @ApiOperation(value = "반품신청", notes = "반품신청을 등록한다.")
    @PostMapping(value = "/return")
    public ResponseMessage insertOrderReturn() {
        
        return null;
    }
    
    /**
     * @Method      : deleteClaim
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 교환, 반품 철회
     * @return
     */
    @ApiOperation(value = "교횐, 반품 철회", notes = "교환, 반품 신청을 삭제한다.")
    @DeleteMapping(value = "/withdraw")
    public ResponseMessage deleteClaim() {
        
        return null;
    }

    /**
     * @Method      : insertFreebieCancel
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 사은품 주문 취소신청
     * @return
     */
    @ApiOperation(value = "사은품 주문 취소신청", notes = "사은품 주문 취소신청을 한다.")
    @PostMapping(value = "/freebie/cancel")
    public ResponseMessage insertFreebieCancel() {
        
        return null;
    }
    
    /**
     * @Method      : insertFreebieReturn
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 사은품 반품신청
     * @return
     */
    @ApiOperation(value = "사은품 반품신청", notes = "사은품 반품신청을 한다.")
    @PostMapping(value = "/freebie/return")
    public ResponseMessage insertFreebieReturn() {
        
        return null;
    }
}
