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

import java.util.List;
import kyobobook.application.adapter.out.persistence.cart.entity.TmSpbkEntity;
import kyobobook.application.adapter.out.persistence.test.entity.TestEntity;
import kyobobook.config.annotation.ReaderInterface;

/**
 * @Project     : fo-order-api
 * @FileName    : CartReaderMapper.java
 * @Date        : 2021. 11. 11.
 * @author      : kimsehoon@kyobobook.com
 * @description : 장바구니 읽기
 */
@ReaderInterface
public interface CartReaderMapper {
    
    /**
     * @Method      : selectCartList
     * @Date        : 2021. 11. 9.
     * @author      : seohee.ko@kyobobook.com
     * @description : 
     * @return
     */
    List<TmSpbkEntity> selectCartList();
    
    /**
     * @Method      : newProductCode
     * @Date        : 2021. 11. 25.
     * @author      : eszho@kyobobook.com
     * @description : 
     * @param memberId
     * @return
     */
    TestEntity selectNewProductCode(String memberId);
    
    /**
     * @Method      : selectCartGroupList
     * @Date        : 2021. 11. 29.
     * @author      : eszho@kyobobook.com
     * @description : 장바구니 그룹별 목록 조회
     * @param       : memberId
     * @return
     */
    List<TmSpbkEntity> selectCartGroupList(String memberId);
}
