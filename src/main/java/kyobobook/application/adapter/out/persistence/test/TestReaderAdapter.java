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
import kyobobook.application.adapter.out.persistence.test.entity.TestEntity;
import kyobobook.application.biz.test.port.out.TestPersistencePort;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project : fo-order-api
 * @FileName : TestReaderAdapter.java
 * @Date : 2021. 10. 27.
 * @author : kimsehoon@kyobobook.com
 * @description :
 */
@Slf4j
@Repository("testReaderRepository")
public class TestReaderAdapter implements TestPersistencePort {
    
    /** 테스트 읽기 */
    @Autowired
    TestReaderMapper cartMapper;
    
    @Override
    public List<TestEntity> selectData() throws Exception {
        
        List<TestEntity> data = this.cartMapper.selectData();
        
        return data;
        
    }

    @Override
    public TestEntity getData(String ordrId) throws Exception {
        
        return this.cartMapper.getData(ordrId);
        
    }

}
