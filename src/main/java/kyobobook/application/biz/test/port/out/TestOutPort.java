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

import kyobobook.application.adapter.out.persistence.test.entity.TestEntity;

/**
 * @Project     : fo-order-api
 * @FileName    : TestOutPort.java
 * @Date        : 2021. 11. 4.
 * @author      : kimsehoon@kyobobook.com
 * @description : gRPC로부터 데이터 조회
 */
public interface TestOutPort {

    /**
     * @Method      : selectData
     * @Date        : 2021. 11. 4.
     * @author      : kimsehoon@kyobobook.com
     * @description : 다건 데이터 조회
     * @return
     * @throws Exception
     */
    List<TestEntity> selectData() throws Exception;

    /**
     * @Method      : getData
     * @Date        : 2021. 11. 4.
     * @author      : kimsehoon@kyobobook.com
     * @description : 단건 데이터 조회
     * @param seq
     * @return
     * @throws Exception
     */
    TestEntity getData(String seq) throws Exception;

}
