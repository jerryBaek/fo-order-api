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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import kyobobook.application.adapter.out.persistence.batch.entity.BatchEntity;
import kyobobook.application.biz.batch.port.out.BatchPersistencePort;
import kyobobook.application.domain.batch.Batch;

/**
 * @Project     : common-prototype-api
 * @FileName    : BatchPersistenceAdapter.java
 * @Date        : 2021. 10. 7.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-36 Knative 기반 배치 (Java, 파이썬) prototype : Service에서 Database를 접근하기 위한 Adapter
 */
@Repository("batchPersistenceRepository")
public class BatchPersistenceAdapter implements BatchPersistencePort {
    
    private static final Logger logger = LoggerFactory.getLogger(BatchPersistenceAdapter.class);
    
    private final BatchReaderMapper batchReaderMapper;
    
    private final BatchWriterMapper batchWriterMapper;
    
    public BatchPersistenceAdapter(BatchReaderMapper batchReaderMapper
            , BatchWriterMapper batchWriterMapper) {
        this.batchReaderMapper = batchReaderMapper;
        this.batchWriterMapper = batchWriterMapper;
    }

    @Override
    public Batch selectBatchCount() {
        
        Batch batch = null;
        
        try {
            BatchEntity entity = batchReaderMapper.selectBatchCount();
            
            batch = Batch.builder()
                    .java_total_count(entity.getJava_total_count())
                    .completed_count(entity.getCompleted_count())
                    .incomplete_count(entity.getIncomplete_count())
                    .kor_abstract_count(entity.getKor_abstract_count())
                    .eng_abstract_count(entity.getEng_abstract_count())
                    .python_total_count(entity.getPython_total_count())
                    .build();
            
        } catch(Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
        return batch;
    }

    @Override
    public void updateBatchDataInit() {
        
        try {
            batchWriterMapper.updateCmdtAnnt();
            batchWriterMapper.deleteKorAbstract();
            batchWriterMapper.deleteEngAbstract();
            
        } catch(Exception e) {
            logger.error(e.getMessage());
            throw e;
        }
    }

}
