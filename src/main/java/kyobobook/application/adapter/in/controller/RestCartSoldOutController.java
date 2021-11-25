/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved. This software is the proprietary
 * information of Kyobo Book.
 *
 * Revision History Author Date Description -------------------------- ----------
 * ---------------------------------------- loutsiderl@kyobobook.com 2021. 11. 23. First Draft.
 *
 ****************************************************/
package kyobobook.application.adapter.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import kyobobook.application.biz.cart.port.in.CartSoldOutPort;
import kyobobook.application.domain.common.ResponseMessage;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project : fo-order-api
 * @FileName : RestCartSoldOutController.java
 * @Date : 2021. 11. 23.
 * @author : loutsiderl@kyobobook.com
 * @description : 장바구니 내 품/절판 삭제 컨트롤러
 */
@Slf4j
@Api(tags = "장바구니")
@RequestMapping("/ord")
@RestController
public class RestCartSoldOutController {

    /** 장바구니 서비스 */
    @Autowired
    private CartSoldOutPort cartSoldOutService;

    /**
     * @Method : removeSoldOuts
     * @Date : 2021. 11. 23.
     * @author : loutsiderl@kyobobook.com
     * @description : 장바구니 내 품/절판 삭제
     * @param mmbrNum
     * @return
     */
    @ApiOperation(value = "장바구니 내 품/절판 전체 상품 삭제", notes = "장바구니 내 품/절판 상품을 삭제한다.")
    @ApiImplicitParam(name = "mmbrNum", value = "회원아이디", required = true, dataType = "string",
            paramType = "path", defaultValue = "62012413658")
    @DeleteMapping(value = "/api/v1/order/cart/soldOut/{mmbrNum}")
    public ResponseMessage removeSoldOuts(@PathVariable String mmbrNum) {
        return this.cartSoldOutService.removeSoldOuts(mmbrNum);
    }



}
