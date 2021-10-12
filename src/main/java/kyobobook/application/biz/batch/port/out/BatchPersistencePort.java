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
package kyobobook.application.biz.batch.port.out;

import kyobobook.application.domain.batch.Batch;

/**
 * @Project     : common-prototype-api
 * @FileName    : BatchPersistencePort.java
 * @Date        : 2021. 10. 7.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-36 Knative 기반 배치 (Java, 파이썬) Prototype : Database 처리를 위한 Port
 */
public interface BatchPersistencePort {
    
    /**
     * @Method      : selectBatchCount
     * @Date        : 2021. 10. 12.
     * @author      : sykim@kyobobook.com
     * @description : 배치 실행 결과 Data 현황을 조회 한다.
     * @return
     */
    Batch selectBatchCount();
    
    /**
     * @Method      : updateBatchDataInit
     * @Date        : 2021. 10. 12.
     * @author      : sykim@kyobobook.com
     * @description : 배치 테스트 데이터를 초기 상태로 복원 한다.
     */
    void updateBatchDataInit();

}
