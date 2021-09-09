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

import kyobobook.application.domain.common.ResponseMessage;
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
     * @Method      : selectSample
     * @Date        : 2021. 9. 4.
     * @author      : smlee1@kyobobook.com
     * @description : reqType 구분에 따라 sample 데이터 목록 조회
     *                writer, reader, grpc 통신으로 sub-api의 reader 데이터 목록 조회
     * @param reqType
     * @return
     */
    ResponseMessage selectSample(int reqType);
    
    /**
     * @Method      : getSample
     * @Date        : 2021. 9. 4.
     * @author      : smlee1@kyobobook.com
     * @description : reqType 구분에 따라 sample 데이터 상세 조회
     *                writer, reader, grpc 통신으로 sub-api의 reader 데이터 상세 조회
     * @param reqType
     * @param seq
     * @return
     */
    ResponseMessage getSample(int reqType, int seq);
    
    /**
     * @Method      : insertSample
     * @Date        : 2021. 9. 4.
     * @author      : smlee1@kyobobook.com
     * @description : reqType 구분에 따라 sample 데이터 등록
     *                writer, reader, grpc 통신으로 sub-api의 reader 데이터 등록
     * @param reqType
     * @param sample
     * @return
     */
    ResponseMessage insertSample(int reqType, Sample sample);
    
    /**
     * @Method      : updateSample
     * @Date        : 2021. 9. 4.
     * @author      : smlee1@kyobobook.com
     * @description : reqType 구분에 따라 sample 데이터 수정
     *                writer, reader, grpc 통신으로 sub-api의 reader 데이터 수정
     * @param reqType
     * @param sample
     * @return
     */
    ResponseMessage updateSample(int reqType, Sample sample);
    
    /**
     * @Method      : deleteSample
     * @Date        : 2021. 9. 4.
     * @author      : smlee1@kyobobook.com
     * @description : reqType 구분에 따라 sample 데이터 삭제
     *                writer, reader, grpc 통신으로 sub-api의 reader 데이터 삭제
     * @param reqType
     * @param seq
     * @return
     */
    ResponseMessage deleteSample(int reqType, int seq);
    
    /**
     * @Method      : selectMasterSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Master 데이터 베이스의 Sample 목록을 조회한다. 
     * @return 
     */
    ResponseMessage selectMasterSample();
    
    /**
     * @Method      : getMasterSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Master 데이터 베이스 Sample 데이터 상세를 조회한다.
     * @param seq
     * @return
     */
    ResponseMessage getMasterSample(int seq);
    
    /**
     * @Method      : insertMasterSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Master 데이터 베이스의 Sample 신규 데이터를 생성한다.
     * @param sample - {@link Sample}
     * @return
     */
    ResponseMessage insertMasterSample(Sample sample);
    
    /**
     * @Method      : updateMasterSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Master 데이터 베이스의 Sample 데이터를 업데이트 한다.
     * @param sample - {@link Sample}
     * @return
     */
    ResponseMessage updateMasterSample(Sample sample);
    
    /**
     * @Method      : deleteMasterSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Master 데이터 베이스의 Sample 데이터를 삭제 한다.
     * @param seq
     * @return
     */
    ResponseMessage deleteMasterSample(int seq);
    
    
    /**
     * @Method      : selectSlaveSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Slave 데이터 베이스의 Sample 목록을 조회한다.
     * @return
     */
    ResponseMessage selectSlaveSample();
    
    /**
     * @Method      : getSlaveSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Slave 데이터 베이스 Sample 데이터 상세를 조회한다.
     * @param seq
     * @return
     */
    ResponseMessage getSlaveSample(int seq);
    
    /**
     * @Method      : insertSlaveSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Slave 데이터 베이스의 Sample 신규 데이터를 생성한다.
     * @param sample - {@link Sample}
     */
    ResponseMessage insertSlaveSample(Sample sample);
    
    /**
     * @Method      : updateSlaveSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Slave 데이터 베이스의 Sample 데이터를 업데이트 한다.
     * @param sample - {@link Sample}
     */
    ResponseMessage updateSlaveSample(Sample sample);
    
    /**
     * @Method      : deleteSlaveSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Slave 데이터 베이스의 Sample 데이터를 삭제 한다.
     * @param seq
     */
    ResponseMessage deleteSlaveSample(int seq);
    
    /**
     * @Method      : selectSlaveSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Sub Api를 통해 Sample 목록을 조회한다.
     * @return
     */
    ResponseMessage selectSubSample();
    
    /**
     * @Method      : getSlaveSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Sub Api를 통해 Sample 데이터 상세를 조회한다.
     * @param seq
     * @return
     */
    ResponseMessage getSubSample(int seq);
    
    /**
     * @Method      : insertSlaveSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Sub Api를 통해 베이스의 Sample 신규 데이터를 생성한다.
     * @param sample - {@link Sample}
     */
    ResponseMessage insertSubSample(Sample sample);
    
    /**
     * @Method      : updateSlaveSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Sub Api를 통해 Sample 데이터를 업데이트 한다.
     * @param sample - {@link Sample}
     */
    ResponseMessage updateSubSample(Sample sample);
    
    /**
     * @Method      : deleteSlaveSample
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Sub Api를 통해 Sample 데이터를 삭제 한다.
     * @param seq
     */
    ResponseMessage deleteSubSample(int seq);
}
