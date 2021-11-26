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

import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kyobobook.application.adapter.out.persistence.cart.entity.TmSpbkEntity;
import kyobobook.application.adapter.out.persistence.test.entity.TestEntity;
import kyobobook.application.biz.cart.port.out.CartPersistencePort;
import kyobobook.application.domain.cart.Cart;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project     : fo-order-api
 * @FileName    : CartReaderAdapter.java
 * @Date        : 2021. 11. 11.
 * @author      : kimsehoon@kyobobook.com
 * @description : 장바구니 읽기 
 */
@Slf4j
@Repository("cartRepository")
public class CartPersistenceAdapter implements CartPersistencePort {
    
    /** 장바구니 읽기 */
    @Autowired
    private CartReaderMapper reader;
    
    /** 장바구니 쓰기 */
    @Autowired
    private CartWriterMapper writer;

    @Deprecated
    @Override
    public List<TmSpbkEntity> selectCartList() throws Exception {
        
        List<TmSpbkEntity> data = this.reader.selectCartList();
        
        return data;
        
    }

    @Override
    public Integer updateCartCheck(Cart cart) throws Exception {
        
//            rCnt += this.writer.updateCartCheck(cart);
        TmSpbkEntity tmSpbkEntity = TmSpbkEntity.builder()
                .unfyCmdtIdList(cart.getUnfyCmdtIdList())
                .chkVal(cart.getChkVal())
                .build();
        
//        return writer.updateCartCheck(TmSpbkEntity.builder()
//                .unfyCmdtIdList(cart.getUnfyCmdtIdList())
//                .chkVal(cart.getChkVal())
//                .build());
        return writer.updateCartCheck(tmSpbkEntity);
    }

    @Override
    public Integer deleteProduct(String unfyCmdtId) throws Exception {

        return this.writer.deleteProduct(unfyCmdtId);
        
    }
    
    @Override
    public Integer deleteProducts(String memno) throws Exception {

        return this.writer.deleteProducts(memno);
        
    }
    
    @Override
    public TestEntity selectNewProductCode(String memberId) throws Exception {

        return this.reader.selectNewProductCode(memberId);
        
    }

}
