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

import kyobobook.application.adapter.out.persistence.test.entity.TestEntity;
import kyobobook.config.annotation.ReaderInterface;

/**
 * @Project : fo-order-api
 * @FileName : TestReaderMapper.java
 * @Date : 2021. 10. 27.
 * @author : kimsehoon@kyobobook.com
 * @description :
 */
@ReaderInterface
public interface TestReaderMapper {
    
    List<TestEntity> selectData();
    
    TestEntity getData(String ordrId);

}
