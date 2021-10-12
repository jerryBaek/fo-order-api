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

import kyobobook.application.adapter.out.persistence.batch.entity.BatchEntity;
import kyobobook.config.annotation.ReaderInterface;

/**
 * @Project     : common-prototype-api
 * @FileName    : BatchReaderMapper.java
 * @Date        : 2021. 10. 7.
 * @author      : sykim@kyobobook.com
 * @description : Reader Database의 Tec01-36 데이터 처리용 Mapper
 */
@ReaderInterface
public interface BatchReaderMapper {
    
    /**
     * @Method      : selectBatchCount
     * @Date        : 2021. 10. 12.
     * @author      : sykim@kyobobook.com
     * @description : 배치 실행 결과 Data 현황을 조회 한다.
     * @return
     */
    BatchEntity selectBatchCount();

}
