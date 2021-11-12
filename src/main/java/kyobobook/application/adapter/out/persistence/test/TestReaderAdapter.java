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
package kyobobook.application.adapter.out.persistence.test;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kyobobook.application.adapter.out.persistence.test.entity.TestCart;
import kyobobook.application.adapter.out.persistence.test.entity.TestEntity;
import kyobobook.application.biz.test.port.out.TestPersistencePort;

/**
 * @Project : fo-order-api
 * @FileName : TestReaderAdapter.java
 * @Date : 2021. 10. 27.
 * @author : kimsehoon@kyobobook.com
 * @description :
 */
@Repository("testReaderRepository")
public class TestReaderAdapter implements TestPersistencePort {
    
    private static final Logger logger = LoggerFactory.getLogger(TestReaderAdapter.class);

    @Autowired
    TestReaderMapper cartMapper;
    
    @Autowired
    TestWriterMapper writerMapper;

    @Override
    public List<TestEntity> selectData() throws Exception {
//        List<Cart> sampleList = new ArrayList<Cart>();
//        cartMapper.selectData().stream().forEach(entity -> {
//            Sample sample = Sample.builder()
//                    .seq(entity.getSeq())
//                    .title(entity.getTitle())
//                    .contents(entity.getContents())
//                    .txt(entity.getTxt())
//                    .build();
//            sampleList.add(sample);
//        });
        
        logger.debug("셀렉 데이라..");
        logger.debug("캍으 매파 객첸 있능가? " + this.cartMapper);
        List<TestEntity> data = this.cartMapper.selectData();
        logger.debug("다녀옴..몇갠가??" + data.size());
        
        return data;
    }

    @Override
    public TestEntity getData(String ordrId) throws Exception {
        return this.cartMapper.getData(ordrId);
    }
    
    @Override
    public List<TestCart> selectCartList() throws Exception {
        
        logger.debug("셀렉 데이라..");
        logger.debug("캍으 매파 객첸 있능가? " + this.cartMapper);
        List<TestCart> data = this.cartMapper.selectCartList();
        logger.debug("다녀옴..몇갠가??" + data.size());
        
        return data;
    }

    @Override
    public TestCart updateCartCheck(String unfyCmdtId) throws Exception {
        this.writerMapper.updateCartCheck(unfyCmdtId);
        TestCart cart = new TestCart();
        cart.setResultMessage("업데이트 >>");
        return cart;
    }

}
