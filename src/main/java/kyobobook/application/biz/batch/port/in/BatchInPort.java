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
package kyobobook.application.biz.batch.port.in;

import kyobobook.application.domain.common.ResponseMessage;

/**
 * @Project     : common-prototype-api
 * @FileName    : BatchInPort.java
 * @Date        : 2021. 10. 7.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-36 Knative 기반 배치 (Java, 파이썬) : Adapter에서 Service Business Logic에 접근하기 위한 Port
 */
public interface BatchInPort {
    
    /**
     * @Method      : selectBatchCount
     * @Date        : 2021. 10. 12.
     * @author      : sykim@kyobobook.com
     * @description : 배치 실행 결과 Data 현황을 조회 한다.
     * @return
     */
    ResponseMessage selectBatchCount();
    
    /**
     * @Method      : updateBatchDataInit
     * @Date        : 2021. 10. 12.
     * @author      : sykim@kyobobook.com
     * @description : 배치 테스트 데이터를 초기 상태로 복원 한다.
     * @return
     */
    ResponseMessage updateBatchDataInit();

}
