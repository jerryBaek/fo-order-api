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
package kyobobook.application.biz.cart.port.out;

import java.util.HashMap;
import java.util.List;
import kyobobook.application.adapter.out.persistence.cart.entity.TmSpbkEntity;
import kyobobook.application.adapter.out.persistence.test.entity.TestEntity;
import kyobobook.application.domain.cart.Cart;

/**
 * @Project     : fo-order-api
 * @FileName    : CartPersistencePort.java
 * @Date        : 2021. 11. 11.
 * @author      : kimsehoon@kyobobook.com
 * @description : 장바구니 데이터베이스 포트
 */
public interface CartPersistencePort {

    @Deprecated
    List<TmSpbkEntity> selectCartList() throws Exception;
    
    /**
     * @Method      : updateCartCheck
     * @Date        : 2021. 11. 11.
     * @author      : seohee.ko@kyobobook.com
     * @description : 
     * @param cartList
     * @return
     * @throws Exception
     */
    Integer updateCartCheck(List<Cart> cartList)throws Exception;

    /**
     * @Method      : deleteCartCheck
     * @Date        : 2021. 11. 11.
     * @author      : seohee.ko@kyobobook.com
     * @description : 장바구니 상품삭제(상태변경)
     * @param cart
     * @return
     * @throws Exception 
     */
    Integer deleteProduct(List<Cart> cart) throws Exception;
    
    /**
     * @Method      : selectNewProductData
     * @Date        : 2021. 11. 25.
     * @author      : eszho@kyobobook.com
     * @description : 
     * @param orderId
     * @return
     * @throws Exception
     */
    TestEntity selectNewProductCode(String memberId) throws Exception;

    /**
     * @Method      : selectNewProductData
     * @Date        : 2021. 11. 25.
     * @author      : eszho@kyobobook.com
     * @description : 
     * @param orderId
     * @return
     * @throws Exception
     */
    List<TmSpbkEntity> selectCartGroupList(String memberId) throws Exception;

    /**
     * @Method : selectCartProduct
     * @Date : 2021. 12. 2.
     * @author : seohee.ko@kyobobook.com
     * @description : 장바구니 특정상품 조회
     * @param tmSpbkEntity
     * @return
     */
    TmSpbkEntity selectCartProduct(TmSpbkEntity tmSpbkEntity);

    /**
     * @Method : selectCartProducts
     * @Date : 2021. 12. 2.
     * @author : seohee.ko@kyobobook.com
     * @description : 장바구니 선택상품 목록 조회
     * @param string
     * @return
     */
    List<TmSpbkEntity> selectCartProducts(String mmbrNum);
    
}
