/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 8. 17.  First Draft.
 *
 ****************************************************/
package kyobobook.application.adapter.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kyobobook.application.biz.purchase.port.in.PurchasePort;
import kyobobook.application.domain.common.ResponseMessage;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project : fo-order-api
 * @FileName : RestPurchaseController.java
 * @Date : 2021. 11. 12.
 * @author : kimsehoon@kyobobook.com
 * @description : 구매 컨트롤러
 */
@Slf4j
@Api(tags = "구매")
@RequestMapping("/ord")
@RestController
public class RestPurchaseController {

    /** 구매 서비스 */
    @Autowired
    private PurchasePort purchaseService;

    /**
     * @Method : getPurchasedInCart
     * @Date : 2021. 11. 12.
     * @author : kimsehoon@kyobobook.com
     * @description : 장바구니 기준 구매 상품 목록 조회
     * @param limitYear 조회기간
     * @return
     */
    @ApiOperation(value = "장바구니 내 상품 중 기구매 상품 조회", notes = "사용자 장바구니에 담은 상품 중 이미 구매한 상품 목록을 조회한다.")
    @GetMapping("/api/v1/purchased/cart")
    public ResponseMessage getPurchasedInCart() {

        return this.purchaseService.getPurchasedInCart();

    }

}
