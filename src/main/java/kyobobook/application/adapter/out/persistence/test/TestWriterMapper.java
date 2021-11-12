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

import kyobobook.config.annotation.WriterInterface;

/**
 * @Project : fo-order-api
 * @FileName : TestReaderMapper.java
 * @Date : 2021. 10. 27.
 * @author : kimsehoon@kyobobook.com
 * @description :
 */
@WriterInterface
public interface TestWriterMapper {
    
    /**
     * @Method      : updateCartCheck
     * @Date        : 2021. 11. 10.
     * @author      : seohee.ko@kyobobook.com
     * @description : 
     * @param unfyCmdtId
     * @return
     */
    int updateCartCheck(String unfyCmdtId);

}
