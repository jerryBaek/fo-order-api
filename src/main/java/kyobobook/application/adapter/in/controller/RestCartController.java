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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import kyobobook.application.biz.cart.port.in.CartPort;
import kyobobook.application.domain.cart.Cart;
import kyobobook.application.domain.common.ResponseMessage;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project : fo-order-api
 * @FileName : RestCartController.java
 * @Date : 2021. 11. 11.
 * @author : kimsehoon@kyobobook.com
 * @description : 카트 컨트롤러
 */
@Slf4j
@Api(tags = "장바구니")
@RequestMapping("/ord")
@RestController
public class RestCartController {

    /** 장바구니 서비스 */
    @Autowired
    private CartPort cartService;

    /**
     * @Method : selectCartList
     * @Date : 2021. 11. 09.
     * @author : seohee.ko@kyobobook.com
     * @description : 장바구니 목록조회
     * @return
     */
    @Deprecated
    @GetMapping(value = "/api/v1/order/cart/data/cartList")
    public ResponseMessage selectCartList() {

        log.debug("================장바구니 목록조회");

        return cartService.selectCartList();
    }

    /**
     * @Method : updateCartCheck
     * @Date : 2021. 11. 10.
     * @author : seohee.ko@kyobobook.com
     * @description : 장바구니 체크박스 업데이트
     * @param unfyCmdtId
     * @return
     */
    @ApiOperation(value = "장바구니 상품 선택여부 갱신", notes = "장바구니 상품 선택여부 정보를 갱신한다.")
    @ApiImplicitParam(name = "unfyCmdtId", value = "통합상품번호", required = true, dataType = "string", paramType = "path", defaultValue = "C20000000B54B")
    @PutMapping(value = "/api/v1/order/cart/updateCartCheck")
    public ResponseMessage updateCartCheck(@RequestBody Cart cart) {

        log.debug("================체크박스 업데이트");
        return this.cartService.updateCartCheck(cart);
    }

    /**
     * @Method : removeProduct
     * @Date : 2021. 11. 11.
     * @author : seohee.ko@kyobobook.com
     * @description : 장바구니 상품삭제(상태변경)
     * @param checkList
     * @return
     */
    @ApiOperation(value = "장바구니 내 상품 삭제", notes = "장바구니 내 상품을 삭제한다.")
    @ApiImplicitParam(name = "unfyCmdtId", value = "통합상품번호목록", required = true, dataType = "string", paramType = "path", defaultValue = "C160000265390")
    @DeleteMapping(value = "/api/v1/order/cart/product/{unfyCmdtId}")
    public ResponseMessage removeProduct(@PathVariable String unfyCmdtId) {

        return this.cartService.removeProduct(unfyCmdtId);

    }

    /**
     * @Method : removeProducts
     * @Date : 2021. 11. 11.
     * @author : seohee.ko@kyobobook.com
     * @description : 장바구니 상품삭제(상태변경)
     * @return
     */
    @ApiOperation(value = "장바구니 내 상품 삭제", notes = "장바구니 내 상품을 삭제한다.")
    @DeleteMapping(value = "/api/v1/order/cart/products")
    public ResponseMessage removeProducts() {

        return this.cartService.removeProducts();

    }

    /**
     * @Method : selectNewProductCode
     * @Date : 2021. 11. 25.
     * @author : eszho@kyobobook.com
     * @description : 회원별 장바구니 최근 상품코드 리턴
     * @param : memberId
     * @return : newProductCode
     */
    @ApiOperation(value = "회원별 장바구니 최근 상품코드 리턴", notes = "회원별 장바구니 최근 상품코드 리턴한다.")
    @ApiImplicitParam(name = "memberId", value = "회원아이디", required = true, dataType = "string", paramType = "path", defaultValue = "62012413658")
    @GetMapping(value = "/api/v1/order/cart/newProductCode/{memberId}")
    public ResponseMessage selectNewProductCode(@PathVariable String memberId) {

        return this.cartService.selectNewProductCode(memberId);

    }

}
