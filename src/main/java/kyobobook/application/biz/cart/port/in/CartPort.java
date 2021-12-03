/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 8. 12.  First Draft.
 *
 ****************************************************/
package kyobobook.application.biz.cart.port.in;

import kyobobook.application.domain.cart.Cart;
import kyobobook.application.domain.common.ResponseMessage;

/**
 * @Project     : fo-order-api
 * @FileName    : CartPort.java
 * @Date        : 2021. 11. 11.
 * @author      : kimsehoon@kyobobook.com
 * @description : 장바구니 포트
 */
public interface CartPort {

    /**
     * @Method      : selectCartList
     * @Date        : 2021. 11. 11.
     * @author      : seohee.ko@kyobobook.com
     * @description : 장바구니 목록 조회
     * @return
     */
    @Deprecated
    ResponseMessage selectCartList();

    /**
     * @Method      : updateCartCheck
     * @Date        : 2021. 11. 11.
     * @author      : seohee.ko@kyobobook.com
     * @description : 장바구니 체크박스 업데이트
     * @param unfyCmdtId
     * @return
     */
    ResponseMessage updateCartCheck(Cart cart);

    /**
     * @Method      : removeProduct
     * @Date        : 2021. 11. 11.
     * @author      : seohee.ko@kyobobook.com
     * @description : 장바구니 상품삭제(상태변경)
     * @param cart
     * @return
     */
    ResponseMessage removeProduct(Cart cart);
    
    /**
     * @Method      : removeProducts
     * @Date        : 2021. 11. 11.
     * @author      : seohee.ko@kyobobook.com
     * @description : 장바구니 상품삭제(상태변경)
     * @return
     */
    ResponseMessage removeProducts();

    /**
     * @Method      : selectNewProductCode
     * @Date        : 2021. 11. 25.
     * @author      : eszho@kyobobook.com
     * @description : 회원별 장바구니 최근 상품코드 리턴
     * @return
     */
    ResponseMessage selectNewProductCode(String memberId);

    /**
     * @Method      : updateCartCheckAll
     * @Date        : 2021. 11. 29.
     * @author      : seohee.ko@kyobobook.com
     * @description : 장바구니 체크여부 전체 업데이트
     * @param chekVal
     * @return
     */
    ResponseMessage updateCartCheckAll(String chekVal);
    
    /**
     * @Method      : selectCartGroupList
     * @Date        : 2021. 11. 29.
     * @author      : eszho@kyobobook.com
     * @description : 장바구니 그룹별 목록 조회
     * @return
     */
    ResponseMessage selectCartGroupList(String memberId);

    /**
     * @Method : selectCartProduct
     * @Date : 2021. 12. 2.
     * @author : seohee.ko@kyobobook.com
     * @description : 장바구니 특정상품 조회
     * @param unfyCmdtId
     * @return
     */
    ResponseMessage selectCartProduct(String unfyCmdtId);

    /**
     * @Method      : selectCartProducts
     * @Date        : 2021. 12. 2.
     * @author      : seohee.ko@kyobobook.com
     * @description : 장바구니 선택상품 목록 조회 
     * @return
     */
    ResponseMessage selectCartProducts();
    
}
