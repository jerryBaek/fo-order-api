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
    
    Integer updateCartCheck(Cart cart)throws Exception;

    /**
     * @Method      : deleteCartCheck
     * @Date        : 2021. 11. 11.
     * @author      : seohee.ko@kyobobook.com
     * @description : 장바구니 상품삭제(상태변경)
     * @param unfyCmdtId
     * @return
     * @throws Exception 
     */
    Integer deleteProduct(String unfyCmdtId) throws Exception;
    
    /**
     * @Method      : deleteProducts
     * @Date        : 2021. 11. 11.
     * @author      : seohee.ko@kyobobook.com
     * @description : 장바구니 상품삭제(상태변경)
     * @param memno
     * @return
     * @throws Exception 
     */
    Integer deleteProducts(String memno) throws Exception;
    
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
    
}
