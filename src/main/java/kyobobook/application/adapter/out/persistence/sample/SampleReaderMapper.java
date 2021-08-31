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
package kyobobook.application.adapter.out.persistence.sample;

import java.util.List;

import kyobobook.application.adapter.out.persistence.sample.entity.SampleEntity;
import kyobobook.config.annotation.ReaderInterface;

/**
 * @Project     : common-prototype-api
 * @FileName    : SampleReaderMapper.java
 * @Date        : 2021. 8. 12.
 * @author      : smlee1@kyobobook.com
 * @description : Reader Databsase 의 Sample 데이터 처리용 Mapper
 */
@ReaderInterface
public interface SampleReaderMapper {

    /**
     * @Method      : selectSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Sample 테이블의 데이터 목록 조회.
     * @return
     */
    List<SampleEntity> selectSample();
    
    /**
     * @Method      : getSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Sample 테이블의 데이터 상세 조회.
     * @param seq
     * @return
     */
    SampleEntity getSample(int seq);
    
    /**
     * @Method      : insertSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Sample 테이블에 신규 데이터 등록.
     * @param sample
     * @return
     */
    int insertSample(SampleEntity sample);
    
    /**
     * @Method      : updateSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Sample 테이블의 데이터 업데이트.
     * @param sample
     * @return
     */
    int updateSample(SampleEntity sample);
    
    /**
     * @Method      : deleteSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Sample 테이블의 데이터 삭제.
     * @param seq
     * @return
     */
    int deleteSample(int seq);
}
