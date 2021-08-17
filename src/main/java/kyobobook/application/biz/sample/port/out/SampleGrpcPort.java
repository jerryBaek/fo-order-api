/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 8. 17.  First Draft.
 *
 ****************************************************/
package kyobobook.application.biz.sample.port.out;

import java.util.List;

import kyobobook.application.domain.sample.Sample;

/**
 * @Project     : common-prototype-api
 * @FileName    : SampleGrpcPort.java
 * @Date        : 2021. 8. 17.
 * @author      : smlee1@kyobobook.com
 * @description : Service 에서 gRPC 통해 타 Api 와 통신하기 위한 Port
 */
public interface SampleGrpcPort {

    /**
     * @Method      : selectGrpcSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : Sample 데이터 목록을 조회 한다.
     * @return
     */
    List<Sample> selectGrpcSample();
    
    /**
     * @Method      : getGprcSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : Sample 데이터 상세 내역을 조회 한다.
     * @param seq
     * @return
     */
    Sample getGprcSample(int seq);
    
    /**
     * @Method      : insertGrpSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : Sample 데이터를 신규 등록 한다.
     * @param sample
     */
    void insertGrpSample(Sample sample);
    
    /**
     * @Method      : updateGrpSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : Sample 데이터를 수정 한다.
     * @param sample
     */
    void updateGrpSample(Sample sample);
    
    /**
     * @Method      : deleteGrpSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : Sample 데이터를 삭제 한다.
     * @param seq
     */
    void deleteGrpSample(int seq);
}
