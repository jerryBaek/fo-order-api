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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kyobobook.application.domain.common.ResponseMessage;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project     : fo-order-api
 * @FileName    : RestMyOrderController.java
 * @Date        : 2021. 12. 21.
 * @author      : seohee.ko@kyobobook.com
 * @description : 
 */
@Slf4j
@Api(tags = "주문, 배송")
@RequestMapping("/ord/api/v1/my-order")
@RestController
public class RestMyOrderController {

    /**
     * @Method      : selectMyOrder
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 주문, 배송 목록 조회
     * @return
     */
    @ApiOperation(value = "주문, 배송 목록 조회", notes = "주문, 배송 목록을 조회합니다.")
    @GetMapping(value = {"/", ""})
    public ResponseMessage selectMyOrderList() {
        
        return null;
    }
    
    /**
     * @Method      : selectOrderCount
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 주문, 배송 요약 정보 조회
     * @return
     */
    @ApiOperation(value = "주문, 배송 요약 정보 조회", notes = "주문, 배송 요약 정보를 조회합니다.")
    @GetMapping(value = "/count")
    public ResponseMessage selectMyOrderCount() {
        
        return null;
    }
    
    /**
     * @Method      : deleteMyOrder
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 주문내역 삭제
     * @return
     */
    @ApiOperation(value = "주문내역 삭제", notes = "주문내역을 삭제합니다.")
    @DeleteMapping(value = "/{ordrId}")
    public ResponseMessage deleteMyOrder() {
        
        return null;
    }
    
    /**
     * @Method      : selectMyOrderDetail
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 주문, 배송 상세 조회
     * @return
     */
    @ApiOperation(value = "주문, 배송 상세 조회", notes = "주문, 배송 상세내역을 조회합니다.")
    @GetMapping(value = "/{ordrId}")
    public ResponseMessage selectMyOrderDetail() {
        
        return null;
    }
    
    /**
     * @Method      : selectDiscountDescription
     * @Date        : 2021. 12. 21.
     * @author      : seohee.ko@kyobobook.com
     * @description : 할인 상세내역 조회
     * @return
     */
    @ApiOperation(value = "할인 상세내역 조회", notes = "할인 상세내역을 조회합니다.")
    @GetMapping(value = "/description/{ordrId}")
    public ResponseMessage selectDiscountDescription() {
        
        return null;
    }
}
