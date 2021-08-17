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
package kyobobook.application.adapter.out.persistence.sample.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Project     : common-prototype-api
 * @FileName    : SampleTagEntity.java
 * @Date        : 2021. 8. 12.
 * @author      : smlee1@kyobobook.com
 * @description : SampleTag Table 과 1:1 매핑 되는 Entity
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SampleTagEntity {
    private int seq;
    private int sampleSeq;
    private String tagId;
    private String tagName;
}
