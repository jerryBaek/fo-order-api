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
package kyobobook.application.adapter.out.persistence.batch.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Project     : common-prototype-api
 * @FileName    : BatchEntity.java
 * @Date        : 2021. 10. 7.
 * @author      : sykim@kyobobook.com
 * @description : Batch 데이터 정보와 1:1 매핑 되는 Entity
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BatchEntity {
    
    private String java_total_count;
    private String completed_count;
    private String incomplete_count;
    private String kor_abstract_count;
    private String eng_abstract_count;
    
    private String python_total_count;    

}
