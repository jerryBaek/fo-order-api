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
package kyobobook.application.biz.sample.port.in;

import java.util.List;

import kyobobook.application.domain.sample.Sample;

/**
 * @Project     : common-prototype-api
 * @FileName    : SamplePort.java
 * @Date        : 2021. 8. 12.
 * @author      : smlee1@kyobobook.com
 * @description : Adapter 에서 Sample Service의 Business 로직에 접근하기 위한 Port
 */
public interface SamplePort {

    /**
     * @Method      : selectMasterSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Master 데이터 베이스의 Sample 목록을 조회한다. 
     * @return 
     */
    List<Sample> selectMasterSample();
    
    /**
     * @Method      : getMasterSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Master 데이터 베이스 Sample 데이터 상세를 조회한다.
     * @param seq
     * @return
     */
    Sample getMasterSample(int seq);
    
    /**
     * @Method      : insertMasterSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Master 데이터 베이스의 Sample 신규 데이터를 생성한다.
     * @param sample - {@link Sample}
     * @return
     */
    int insertMasterSample(Sample sample);
    
    /**
     * @Method      : updateMasterSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Master 데이터 베이스의 Sample 데이터를 업데이트 한다.
     * @param sample - {@link Sample}
     * @return
     */
    int updateMasterSample(Sample sample);
    
    /**
     * @Method      : deleteMasterSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Master 데이터 베이스의 Sample 데이터를 삭제 한다.
     * @param seq
     * @return
     */
    int deleteMasterSample(int seq);
    
    
    /**
     * @Method      : selectSlaveSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Slave 데이터 베이스의 Sample 목록을 조회한다.
     * @return
     */
    List<Sample> selectSlaveSample();
    
    /**
     * @Method      : getSlaveSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Slave 데이터 베이스 Sample 데이터 상세를 조회한다.
     * @param seq
     * @return
     */
    Sample getSlaveSample(int seq);
    
    /**
     * @Method      : insertSlaveSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Slave 데이터 베이스의 Sample 신규 데이터를 생성한다.
     * @param sample - {@link Sample}
     * @throws Exception
     */
    void insertSlaveSample(Sample sample) throws Exception;
    
    /**
     * @Method      : updateSlaveSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Slave 데이터 베이스의 Sample 데이터를 업데이트 한다.
     * @param sample - {@link Sample}
     */
    void updateSlaveSample(Sample sample);
    
    /**
     * @Method      : deleteSlaveSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Slave 데이터 베이스의 Sample 데이터를 삭제 한다.
     * @param seq
     */
    void deleteSlaveSample(int seq);
    
    /**
     * @Method      : selectSlaveSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Sub Api를 통해 Sample 목록을 조회한다.
     * @return
     */
    List<Sample> selectSubSample();
    
    /**
     * @Method      : getSlaveSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Sub Api를 통해 Sample 데이터 상세를 조회한다.
     * @param seq
     * @return
     */
    Sample getSubSample(int seq);
    
    /**
     * @Method      : insertSlaveSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Sub Api를 통해 베이스의 Sample 신규 데이터를 생성한다.
     * @param sample - {@link Sample}
     * @throws Exception
     */
    void insertSubSample(Sample sample) throws Exception;
    
    /**
     * @Method      : updateSlaveSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Sub Api를 통해 Sample 데이터를 업데이트 한다.
     * @param sample - {@link Sample}
     */
    void updateSubSample(Sample sample);
    
    /**
     * @Method      : deleteSlaveSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Sub Api를 통해 Sample 데이터를 삭제 한다.
     * @param seq
     */
    void deleteSubSample(int seq);
}
