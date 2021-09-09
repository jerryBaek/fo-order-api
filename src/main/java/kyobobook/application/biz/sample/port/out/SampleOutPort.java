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

import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.sample.Sample;
import kyobobook.exception.BizRuntimeException;

/**
 * @Project     : common-prototype-api
 * @FileName    : SampleGrpcPort.java
 * @Date        : 2021. 8. 17.
 * @author      : smlee1@kyobobook.com
 * @description : Service 에서 gRPC 통해 타 Api 와 통신하기 위한 Port
 */
public interface SampleOutPort {

    /**
     * @Method      : selectGrpcSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : Sample 데이터 목록을 조회 한다.
     * @return - {@link List} 목록 조회 결과
     */
    List<?> selectGrpcSample() throws BizRuntimeException;
    
    /**
     * @Method      : getGprcSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : Sample 데이터 상세 내역을 조회 한다.
     * @param seq
     * @return - {@link Sample} 상세 조회 결과
     */
    Sample getGprcSample(int seq) throws BizRuntimeException;
    
    /**
     * @Method      : insertGrpSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : Sample 데이터를 신규 등록 한다.
     * @param sample
     * @return - 처리 결과 메세지
     */
    String insertGrpSample(Sample sample) throws BizRuntimeException;
    
    /**
     * @Method      : updateGrpSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : Sample 데이터를 수정 한다.
     * @param sample
     * @return - 처리 결과 메세지
     */
    String updateGrpSample(Sample sample) throws BizRuntimeException;
    
    /**
     * @Method      : deleteGrpSample
     * @Date        : 2021. 8. 17.
     * @author      : smlee1@kyobobook.com
     * @description : Sample 데이터를 삭제 한다.
     * @param seq
     * @return - 처리 결과 메세지
     */
    String deleteGrpSample(int seq) throws BizRuntimeException;
}
