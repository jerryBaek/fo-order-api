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
package kyobobook.application.biz.sample.port.out;

import java.util.List;

import kyobobook.application.domain.sample.Sample;

/**
 * @Project     : common-prototype-api
 * @FileName    : SamplePersistencePort.java
 * @Date        : 2021. 8. 12.
 * @author      : smlee1@kyobobook.com
 * @description : Service 에서 Database 처리를 위한 Port
 *                Database 처리하는 Adapter 에서 implements 받아 기능을 구현한다.
 */
public interface SamplePersistencePort {

    /**
     * @Method      : selectSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Sample 테이블 데이터 목록을 조회한다.
     * @return
     */
    List<Sample> selectSample();
    
    /**
     * @Method      : getSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Sample 테이블 데이터 상세를 조회 한다.
     * @param seq
     * @return
     */
    Sample getSample(int seq);
    
    /**
     * @Method      : insertSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Sample 데이터를 신규 등록 한다.
     * @param sample - {@link Sample}
     * @return
     */
    int insertSample(Sample sample);
    
    /**
     * @Method      : updateSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Sample 데이터를 업데이트 한다.
     * @param sample - {@link Sample}
     * @return
     */
    int updateSample(Sample sample);
    
    /**
     * @Method      : deleteSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Sample 데이터를 삭제 한다.
     * @param seq
     * @return
     */
    int deleteSample(int seq);
}
