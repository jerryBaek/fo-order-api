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
import kyobobook.application.biz.cart.port.out.CartPersistencePort;
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
    public Integer updateCartCheck(String unfyCmdtId) throws Exception {
        return this.writer.updateCartCheck(unfyCmdtId);
    }

    @Override
    public Integer deleteCartCheck(String checkList) throws Exception{
        String[] checkArr = checkList.split(",");

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("checkArr",checkArr);
        
        return this.writer.deleteCartCheck(map);
    }

}
