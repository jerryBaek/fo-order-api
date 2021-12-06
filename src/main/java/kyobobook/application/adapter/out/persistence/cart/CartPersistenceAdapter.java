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
import java.util.Map;
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
    public Integer updateCartCheck(List<Cart> cartList) throws Exception {
        Map<String, Object> mapParam = new HashMap<>();

        mapParam.put("list", cartList);
        return writer.updateCartCheck(mapParam);
    }

    @Override
    public Integer deleteProduct(List<Cart> cartList) throws Exception {
        Map<String, Object> mapParam= new HashMap<>();

        mapParam.put("list", cartList);
        return this.writer.deleteProduct(cartList);
        
    }

    @Override
    public TestEntity selectNewProductCode(String memberId) throws Exception {

        return this.reader.selectNewProductCode(memberId);
        
    }
    
    @Override
    public List<TmSpbkEntity> selectCartGroupList(String memberId) throws Exception {
        
        List<TmSpbkEntity> data = this.reader.selectCartGroupList(memberId);
        
        return data;
    
    }

    @Override
    public TmSpbkEntity selectCartProduct(TmSpbkEntity tmSpbkEntity) {
        return this.reader.selectCartProduct(tmSpbkEntity);
    }

    @Override
    public List<TmSpbkEntity> selectCartProducts(String mmbrNum) {
        return this.reader.selectCartProducts(mmbrNum);
    }

}
