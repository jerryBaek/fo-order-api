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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kyobobook.application.adapter.out.persistence.test.entity.TestCart;
import kyobobook.application.biz.cart.port.out.CartPersistencePort;

/**
 * @Project     : fo-order-api
 * @FileName    : CartReaderAdapter.java
 * @Date        : 2021. 11. 11.
 * @author      : kimsehoon@kyobobook.com
 * @description : 장바구니 읽기 
 */
@Repository("cartRepository")
public class CartAdapter implements CartPersistencePort {
    
    private static final Logger logger = LoggerFactory.getLogger(CartAdapter.class);

    /** 장바구니 읽기 */
    @Autowired
    CartReaderMapper reader;
    
    /** 장바구니 쓰기 */
    @Autowired
    CartWriterMapper writer;

    @Override
    public List<TestCart> selectCartList() throws Exception {
        
        logger.debug("셀렉 데이라..");
        logger.debug("캍으 매파 객첸 있능가? " + this.reader);
        List<TestCart> data = this.reader.selectCartList();
        logger.debug("다녀옴..몇갠가??" + data.size());
        
        return data;
    }

    @Override
    public TestCart updateCartCheck(String unfyCmdtId) throws Exception {
        this.writer.updateCartCheck(unfyCmdtId);
        TestCart cart = new TestCart();
        cart.setResultMessage("업데이트 >>");
        return cart;
    }

    @Override
    public TestCart deleteCartCheck(String checkList) throws Exception{
        String[] checkArr = checkList.split(",");

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("checkArr",checkArr);
        
        this.writer.deleteCartCheck(map);
        
        TestCart cart = new TestCart();
        cart.setResultMessage("삭제 >>");
        return cart;
    }

}
