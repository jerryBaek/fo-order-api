/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * sykim@kyobobook.com      2021. 10. 7.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.batch;

import kyobobook.config.annotation.WriterInterface;

/**
 * @Project     : common-prototype-api
 * @FileName    : BatchWriterMapper.java
 * @Date        : 2021. 10. 7.
 * @author      : sykim@kyobobook.com
 * @description : Writer Database의 Tec01-36 데이터 처리용 Mapper
 */
@WriterInterface
public interface BatchWriterMapper {
    
    /**
     * @Method      : updateCmdtAnnt
     * @Date        : 2021. 10. 12.
     * @author      : sykim@kyobobook.com
     * @description : TD_CMDT_ANNT 정보를 수정한다.
     */
    void updateCmdtAnnt();
    
    /**
     * @Method      : deleteKorAbstract
     * @Date        : 2021. 10. 12.
     * @author      : sykim@kyobobook.com
     * @description : EST_KOR_ABSTRACT 정보를 삭제한다.
     */
    void deleteKorAbstract();
    
    /**
     * @Method      : deleteEngAbstract
     * @Date        : 2021. 10. 12.
     * @author      : sykim@kyobobook.com
     * @description : EST_ENG_ABSTRACT 정보를 삭제한다.
     */
    void deleteEngAbstract();
    
}
