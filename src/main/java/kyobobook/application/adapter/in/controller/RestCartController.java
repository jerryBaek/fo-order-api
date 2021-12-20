/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved. This software is the proprietary
 * information of Kyobo Book.
 *
 * Revision History Author Date Description -------------------------- ----------
 * ---------------------------------------- smlee1@kyobobook.com 2021. 8. 17. First Draft.
 *
 ****************************************************/
package kyobobook.application.adapter.in.controller;

import java.util.HashMap;
import java.util.List;
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
import kyobobook.application.domain.delivery.DeliveryAddress;
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
    @ApiImplicitParam(name = "unfyCmdtId", value = "통합상품번호", required = true, dataType = "string",
            paramType = "path", defaultValue = "C20000000B54B")
    @PutMapping(value = "/api/v1/cart/product/status")
    public ResponseMessage updateCartCheck(@RequestBody List<Cart> cartList) { 

        log.debug("================체크박스 업데이트");
        return this.cartService.updateCartCheck(cartList);
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
    @ApiImplicitParam(name = "unfyCmdtId", value = "통합상품번호목록", required = true, dataType = "string",
            paramType = "path", defaultValue = "111111")
    @DeleteMapping(value = "/api/v1/cart/product")
    public ResponseMessage removeProduct(@RequestBody List<Cart> cart) {
//        Cart cart = Cart.builder()
//                        .mmbrNum(mmbrNum)
//                        .tmprMmbrNum(tmprMmbrNum)
//                        .mmbrYsno(mmbrYsno)
//                        .unfyCmdtId(unfyCmdtId)
//                        .build();
        
        return this.cartService.removeProduct(cart);

    }

    /**
     * @Method : selectNewProductCode
     * @Date : 2021. 11. 25.
     * @author : eszho@kyobobook.com
     * @description : 회원별 장바구니 최근 상품코드 리턴
     * @param : meberId
     * @return : newProductCode
     */
    @ApiOperation(value = "회원별 장바구니 최근 상품코드 리턴", notes = "회원별 장바구니 최근 상품코드 리턴한다.")
    @GetMapping(value = "/api/v1/order/cart/newProductCode/{memberId}")
    public ResponseMessage selectNewProductCode(@PathVariable String memberId) {

        return this.cartService.selectNewProductCode(memberId);

    }
    
    /**
     * @Method      : selectCartGroupList
     * @Date        : 2021. 11. 09.
     * @author      : eszho@kyobobook.com
     * @description : 장바구니 그룹별 목록 조회
     * @return
     */
    @GetMapping(value = "/api/v1/order/cart/cartGroupList/{memberId}")
    public ResponseMessage selectCartGroupList(@PathVariable String memberId) {

        return cartService.selectCartGroupList(memberId);        
    }
    
    /**
     * @Method : selectCartProduct
     * @Date : 2021. 12. 2.
     * @author : seohee.ko@kyobobook.com
     * @description : 장바구니 특정상품 조회
     * @param unfyCmdtId
     * @return
     */
    @GetMapping(value = "/api/v1/order/cart/product/{unfyCmdtId}")
    public ResponseMessage selectCartProduct(@PathVariable String unfyCmdtId) {
        return this.cartService.selectCartProduct(unfyCmdtId);
    }

    /**
     * @Method      : selectCartProducts
     * @Date        : 2021. 12. 2.
     * @author      : seohee.ko@kyobobook.com
     * @description : 장바구니 선택상품 목록 조회 
     * @return
     */
    @GetMapping(value = "/api/v1/order/cart/products")
    public ResponseMessage selectCartProducts() {
        return this.cartService.selectCartProducts();
    }
    
    
    /**
     * @Method : selectTotalProductCount
     * @Date : 2021. 12. 20.
     * @author : jhbaek@kyobobook.com
     * @description : 장바구니 총 상품 갯수 조회
     * @param 
     * @return
     */
    @ApiOperation(value = " 장바구니 총 상품 갯수 조회", notes = "장바구니 총 상품 갯수를 리턴한다.")
    @GetMapping(value = "/api/v1/order/cart/count")
    public ResponseMessage selectTotalProductCount() {
        return null;
    }    
    
    
    
    /**
     * @Method : selectGrpFreeTransInfo
     * @Date : 2021. 12. 20.
     * @author : jhbaek@kyobobook.com
     * @description : 장바구니 그룹별 무료배송정보 조회
     * @param
     * @return
     */
    @ApiOperation(value = " 장바구니 그룹별 무료배송정보 조회", notes = "장바구니 그룹별 무료배송정보를 리턴한다.")
    @GetMapping(value = "/api/v1/order/cart/group")
    public ResponseMessage selectGrpFreeTransInfo() {
        return null;
    }    
        
    
    /**
     * @Method : updateSelProductStat
     * @Date : 2021. 12. 20.
     * @author : jhbaek@kyobobook.com
     * @description : 장바구니 상품 선택 수정
     * @param : unfyCmdtId
     * @return
     */
    @ApiOperation(value = "장바구니 상품 선택 상태 수정", notes = "장바구니 상품 선택 상태를 수정한다. ")
    @ApiImplicitParam(name = "unfyCmdtId", value = "통합상품번호", required = true, dataType = "string",
    paramType = "path", defaultValue = "C20000000B54B")    
    @PutMapping(value = "/api/v1/order/cart/status")
    public ResponseMessage updateSelProductStat(@RequestBody List<Cart> cartList) {
        //return null;
        log.debug("================장바구니 상품 선택 업데이트");
        return null;        
    }
    
    
    /**
     * @Method : selectBaroDrimPrdExstYN
     * @Date : 2021. 12. 20.
     * @author : jhbaek@kyobobook.com
     * @description : 장바구니 바로드림상품 포함 유무 조회
     * @param
     * @return
     */
    @ApiOperation(value = " 장바구니 바로드림상품 포함 유무 조회", notes = "장바구니 바로드림상품 포함 유무값을 리턴한다.")
    @GetMapping(value = "/api/v1/cart/product/exist/barodrim")
    public ResponseMessage selectBaroDrimPrdExstYN() {
        return null;
    }        
    
    /**
     * @Method : selectSelProductAmount
     * @Date : 2021. 12. 20.
     * @author : jhbaek@kyobobook.com
     * @description : 장바구니 선택상품 금액정보 조회
     * @param : unfyCmdtId
     * @return : 
     */
    @ApiOperation(value = "장바구니 선택상품 금액정보 조회", notes = "장바구니 선택상품의 금액정보를 리턴한다.")
    @GetMapping(value = "/api/v1/cart/price/{unfyCmdtId}")
    public ResponseMessage selectSelProductAmount(@PathVariable String unfyCmdtId) {
        return null;
    }
    
    
    /**
     * @Method : updateProductOption
     * @Date : 2021. 12. 20.
     * @author : jhbaek@kyobobook.com
     * @description : 상품 옵션 변경 적용
     * @param : 
     * @return
     */
    @ApiOperation(value = "상품 옵션 변경 적용", notes = "상품 옵션 변경을 적용한다.")
    @PutMapping(value = "/api/v1/cart/product/option")
    public ResponseMessage updateProductOption(@RequestBody List<Cart> cartList) {
        //return null;
        log.debug("================상품 옵션 업데이트");
        return null;        
    }
    
    
    /**
     * @Method : removeSoldOutTotal
     * @Date : 2021. 12. 20.
     * @author : jhbaek@kyobobook.com
     * @description : 장바구니 내 품/절판 전체 삭제
     * @param mmbrNum
     * @return
     */
    @ApiOperation(value = "장바구니 내 품/절판 전체 상품 삭제", notes = "장바구니 내 품/절판 상품 전체를 삭제한다.")
    @ApiImplicitParam(name = "mmbrNum", value = "회원아이디", required = true, dataType = "string",
            paramType = "path", defaultValue = "62012413658")
    @DeleteMapping(value = "/api/v1/cart/prod"
            + "uct/sold-out/{mmbrNum}")
    public ResponseMessage removeSoldOutTotal(@PathVariable String mmbrNum) {
        //return this.cartSoldOutService.removeSoldOuts(mmbrNum);
        return null;
    }
    
    
    
    
}
