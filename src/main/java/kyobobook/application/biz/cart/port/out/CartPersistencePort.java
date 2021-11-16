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
    
    Integer updateCartCheck(String unfyCmdtId)throws Exception;

    /**
     * @Method      : deleteCartCheck
     * @Date        : 2021. 11. 11.
     * @author      : seohee.ko@kyobobook.com
     * @description : 장바구니 상품삭제(상태변경)
     * @param checkList
     * @return
     * @throws Exception 
     */
    Integer deleteCartCheck(String checkList) throws Exception;
}
