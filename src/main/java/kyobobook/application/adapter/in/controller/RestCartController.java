/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved. This software is the proprietary
 * information of Kyobo Book.
 *
 * Revision History Author Date Description -------------------------- ----------
 * ---------------------------------------- smlee1@kyobobook.com 2021. 8. 17. First Draft.
 *
 ****************************************************/
package kyobobook.application.adapter.in.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import kyobobook.application.biz.cart.port.in.CartPort;
import kyobobook.application.domain.cart.Cart;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.commoncode.CommonCodeDetail;
import kyobobook.application.domain.primitive.NumberType;
import kyobobook.application.domain.primitive.StringType;
import kyobobook.application.domain.hybrid.Apibiz0602006;
import kyobobook.application.domain.hybrid.Apibiz0602013;
import kyobobook.common.Constants;
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
@RequestMapping(Constants.PATH_PREFIX)
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
    @PutMapping(value = "/api/v1/deprecated/product/status")
    @Deprecated
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
    @DeleteMapping(value = "/api/v1/deprecated/product")
    @Deprecated
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
    @GetMapping(value = "/api/v1/deprecated/newProductCode/{memberId}")
    @Deprecated
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
    @GetMapping(value = "/api/v1/deprecated/cartGroupList/{memberId}")
    @Deprecated
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
    @GetMapping(value = "/api/v1/deprecated/product/{unfyCmdtId}")
    @Deprecated
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
    @GetMapping(value = "/api/v1/deprecated/products")
    @Deprecated
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
    @GetMapping(value = "/api/v1/deprecated/count")
    @Deprecated
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
    @GetMapping(value = "/api/v1/deprecated/group")
    @Deprecated
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
    @PutMapping(value = "/api/v1/deprecated/status")
    @Deprecated
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
    @GetMapping(value = "/api/v1/deprecated/product/exist/barodrim")
    @Deprecated
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
    @GetMapping(value = "/api/v1/deprecated/price/{unfyCmdtId}")
    @Deprecated
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
    @PutMapping(value = "/api/v1/deprecated/product/option")
    @Deprecated
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
    @DeleteMapping(value = "/api/v1/deprecated/product/sold-out/{mmbrNum}")
    @Deprecated
    public ResponseMessage removeSoldOutTotal(@PathVariable String mmbrNum) {
        //return this.cartSoldOutService.removeSoldOuts(mmbrNum);
        return null;
    }

    /**
     * @Method      : getCartCount
     * @Date        : 2021. 12. 20.
     * @author      : kimsehoon@kyobobook.com
     * @description : 장바구니 총 상품 갯수 조회
     * @return
     */
    @ApiOperation(value = "장바구니 총 상품 갯수 조회", notes = "사용자가 장바구니에 담은 상품 총 갯수를 조회한다. 모든 상품(사은품 제외)을 포함한 채로 조회하거나 바로드림 상품만을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "NumberType" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/cart/count")
    public ResponseMessage getCartCount() {
        return ResponseMessage.builder().build().setExample(NumberType.class);
    }

    /**
     * @Method      : removeProduct
     * @Date        : 2021. 12. 20.
     * @author      : kimsehoon@kyobobook.com
     * @description : 장바구니 상품 삭제
     * @return
     */
    @ApiOperation(value = "장바구니 상품 삭제", notes = "선택된 상품들을 장바구니에서 삭제한다.")
    @ApiImplicitParam(name = "spbkId", value = "장바구니ID", required = true, dataType = "string", paramType = "path")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "StringType" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @DeleteMapping(value = "/api/v1/cart/{spbkId}")
    public ResponseMessage removeProduct(@PathVariable(name = "spbkId") String spbkId) {
        return ResponseMessage.builder().build().setExample(StringType.class);
    }

    /**
     * @Method      : getGroup
     * @Date        : 2021. 12. 20.
     * @author      : kimsehoon@kyobobook.com
     * @description : 장바구니 그룹 목록 조회
     * @return
     */
    @ApiOperation(value = "장바구니 그룹 목록 조회", notes = "장바구니 그룹과 각 그룹별 상품유무를 조회한다. 모든 상품에 대한 그룹을 조회하거나 바로드림과 관련된 그룹만 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = "List"
                , response = Apibiz0602006.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "CommonCodeDetail" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/cart/group")
    public ResponseMessage getGroup() {
        return ResponseMessage.builder().build().setExample(CommonCodeDetail.class, 1);
        //return new ResponseMessage().setExample(commonCodeDetail.getClass(), 1);
    }

    /**
     * @Method      : getDeliferyInfoByGroup
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 장바구니 그룹별 무료배송정보 조회
     * @return
     */
    @ApiOperation(value = "장바구니 그룹별 무료배송정보 조회", notes = "장바구니 그룹별 배송비합계와 무료배송기준 조회한다. 모든 상품에 대한 배송정보를 조회하거나 바로드림상품에 대한 배송정보를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "OBJECT_NAME" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/cart/info/delivery/group")
    public ResponseMessage getDeliferyInfoByGroup() {
        return null;
    }

    /**
     * @Method      : getProductEachGroup
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 장바구니 그룹 상품목록 조회
     * @return
     */
    @ApiOperation(value = "장바구니 그룹 상품목록 조회", notes = "장바구니 상품목록을 조회한다. 각 그룹별 모든 상품목록을 조회하거나 바로드림상품목록을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = "List"
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "Apibiz0602006" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/cart/product/{codeId}")
    public ResponseMessage getProductEachGroup(@RequestBody CommonCodeDetail commonCodeDetail) {
        return ResponseMessage.builder().build().setExample(Apibiz0602006.class);
    }

    /**
     * @Method      : putPick
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 장바구니 상품 선택 상태 수정
     * @return
     */
    @ApiOperation(value = "장바구니 상품 선택 상태 수정", notes = "장바구니 상품 선택 상태를 선택 또는 선택해제로 변경한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "StringType" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PutMapping(value = "/api/v1/cart/pick")
    public ResponseMessage putPick(@RequestBody Cart cart) {
        return ResponseMessage.builder().build().setExample(StringType.class);
    }

    /**
     * @Method      : existsBarodrimProduct
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 장바구니 바로드림상품 포함 유무 조회
     * @return
     */
    @ApiOperation(value = "장바구니 바로드림상품 포함 유무 조회", notes = "장바구니 상품 중 바로드림상품이 포함되어있는지 확인한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "StringType" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/cart/product/exist/barodrim")
    public ResponseMessage existsBarodrimProduct() {
        return ResponseMessage.builder().build().setExample(StringType.class);
    }

    /**
     * @Method      : getPrice
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 장바구니 전체 상품 중 선택상품 구매금액정보 조회
     * @return
     */
    @ApiOperation(value = "장바구니 전체 상품 중 선택상품 구매금액정보 조회", notes = "장바구니 내 선택상품에 대한 금액정보(갯수, 상품금액합계, 배송비합계, 결제예정금액)를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "Apibiz0602006" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/cart/price")
    public ResponseMessage getPrice(@RequestBody Apibiz0602006 apibiz0602006) {
        return ResponseMessage.builder().build().setExample(Apibiz0602006.class, 1);
    }

    /**
     * @Method      : putProductOption
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 상품 옵션 변경 적용
     * @return
     */
    @ApiOperation(value = "상품 옵션 변경 적용", notes = "장바구니 내 상품 옵션을 변경한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "Apibiz0602013" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PutMapping(value = "/api/v1/cart/product/option")
    public ResponseMessage putProductOption(@RequestBody Cart Cart) {
        return ResponseMessage.builder().build().setExample(Apibiz0602013.class, 1);
    }

    /**
     * @Method      : putProductCarvedSealOption
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 각인 옵션 변경 적용
     * @return
     */
    @ApiOperation(value = "각인 옵션 변경 적용", notes = "장바구니 내 각인 옵션을 변경한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "StringType" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PutMapping(value = "/api/v1/cart/product/option/carved-seal")
    public ResponseMessage putProductCarvedSealOption() {
        return ResponseMessage.builder().build().setExample(StringType.class);
    }

    /**
     * @Method      : removeSoldOutProduct
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 장바구니 품/절판 전체 삭제
     * @return
     */
    @ApiOperation(value = "장바구니 품/절판 전체 삭제", notes = "장바구니 내 품/절판 상품을 삭제한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "StringType" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @DeleteMapping(value = "/api/v1/cart/product/sold-out")
    public ResponseMessage removeSoldOutProduct() {
        return ResponseMessage.builder().build().setExample(StringType.class);
    }

    /**
     * @Method      : getPurchasedProduct
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 장바구니 내 이미 구매한 상품 조회
     * @return
     */
    @ApiOperation(value = "장바구니 내 이미 구매한 상품 조회", notes = "장바구니에서 이미 구매한(1년 이내) 상품 목록을 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "Apibiz0602006" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/cart/purchased-product")
    public ResponseMessage getPurchasedProduct() {
        return ResponseMessage.builder().build().setExample(Apibiz0602006.class, 1);
    }

    /**
     * @Method      : getRecentAddedProduct
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 최근 장바구니 추가 상품 조회
     * @return
     */
    @ApiOperation(value = "최근 장바구니 추가 상품 조회", notes = "최근에 장바구니에 추가 한 상품ID를 조회한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = "List"
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "Cart" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @GetMapping(value = "/api/v1/cart/recent-added-product")
    public ResponseMessage getRecentAddedProduct() {
        return ResponseMessage.builder().build().setExample(Cart.class, 1);
    }

    /**
     * @Method      : insertCart
     * @Date        : 2021. 12. 22.
     * @author      : kimsehoon@kyobobook.com
     * @description : 장바구니 추가
     * @return
     */
    @ApiOperation(value = "장바구니 추가", notes = "상품을 장바구니에 추가한다.")
    @ApiResponses({
        @ApiResponse(code = 200
                , responseContainer = ""
                , response = ResponseMessage.class
                , message = Constants.ApiResponse.MESSAGE_200_PREFIX 
                            + "OBJECT_NAME" 
                            + Constants.ApiResponse.MESSAGE_200_POSTFIX),
        @ApiResponse(code = 404, message = Constants.ApiResponse.MESSAGE_404),
        @ApiResponse(code = 500, message = Constants.ApiResponse.MESSAGE_500)
    })
    @PostMapping(value = "/api/v1/cart")
    public ResponseMessage insertCart() {
        return null;
    }

}
