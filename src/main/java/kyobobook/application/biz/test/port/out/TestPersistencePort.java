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
package kyobobook.application.biz.test.port.out;

import java.util.List;
import kyobobook.application.adapter.out.persistence.cart.entity.TmSpbkEntity;
import kyobobook.application.adapter.out.persistence.test.entity.TestEntity;

/**
 * @Project : fo-order-api
 * @FileName : SamplePersistencePort.java
 * @Date : 2021. 8. 12.
 * @author : smlee1@kyobobook.com
 * @description : Service 에서 Database 처리를 위한 Port Database 처리하는 Adapter 에서
 *              implements 받아 기능을 구현한다.
 */
public interface TestPersistencePort {

    /**
     * @Method      : selectData
     * @Date        : 2021. 11. 15.
     * @author      : kimsehoon@kyobobook.com
     * @description : 테스트 목록 조회
     * @return
     * @throws Exception
     */
    List<TestEntity> selectData() throws Exception;

    /**
     * @Method      : getData
     * @Date        : 2021. 11. 15.
     * @author      : kimsehoon@kyobobook.com
     * @description : 테스트 단건 조회
     * @param seq
     * @return
     * @throws Exception
     */
    TestEntity getData(String seq) throws Exception;
    
}
