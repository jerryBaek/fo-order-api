/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * kimsehoon@kyobobook.com      2021. 10. 27.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.cart;

import kyobobook.application.adapter.out.persistence.cart.entity.TmSpbkEntity;
import kyobobook.config.annotation.WriterInterface;

/**
 * @Project     : fo-order-api
 * @FileName    : CartReaderMapper.java
 * @Date        : 2021. 11. 11.
 * @author      : kimsehoon@kyobobook.com
 * @description : 장바구니 읽기
 */
@WriterInterface
public interface CartWriterMapper {

    /**
     * @Method      : updateCartCheck
     * @Date        : 2021. 11. 11.
     * @author      : seohee.ko@kyobobook.com
     * @description : 
     * @param unfyCmdtId
     */
    Integer updateCartCheck(TmSpbkEntity tmSpbkEntity);

    /**
     * @Method      : deleteProduct
     * @Date        : 2021. 11. 11.
     * @author      : seohee.ko@kyobobook.com
     * @description : 장바구니 내 상품을 삭제
     * @param unfyCmdtId
     */
    Integer deleteProduct(String unfyCmdtId);
    
    /**
     * @Method      : deleteProducts
     * @Date        : 2021. 11. 11.
     * @author      : seohee.ko@kyobobook.com
     * @description : 장바구니 내 상품을 삭제
     * @param unfyCmdtId
     */
    Integer deleteProducts(String memno);

    /**
     * @Method      : updateCartCheckAll
     * @Date        : 2021. 11. 29.
     * @author      : seohee.ko@kyobobook.com
     * @description : 장바구니 체크여부 전체 업데이트
     * @param chekVal
     * @return
     */
    Integer updateCartCheckAll(String chekVal);
    
}
