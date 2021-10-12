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
package kyobobook.application.domain.batch;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Project     : common-prototype-api
 * @FileName    : Batch.java
 * @Date        : 2021. 10. 7.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-36 Knative 기반 배치 (Java, 파이썬) prototype : Batch
 */
@ApiModel(value = "TEC01-36 배치 실행 결과 Data 현황 건수 domain 클래스", description = "배치 실행 결과 Data 현황 취득용 class")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Batch {
    
    @ApiParam(value="java 배치 테스트 데이터 총 건수", required=true, example="602")
    private String java_total_count;
    
    @ApiParam(value="java 배치 완료 건수", required=true, example="100")
    private String completed_count;
    
    @ApiParam(value="java 배치 미완료 건수", required=true, example="502")
    private String incomplete_count;
    
    @ApiParam(value="java 배치 kor-abstract 등록 건수", required=true, example="30")
    private String kor_abstract_count;
    
    @ApiParam(value="java 배치 eng-abstract 등록 건수", required=true, example="70")
    private String eng_abstract_count;
    
    @ApiParam(value="python 배치 테스트 데이터 총 건수", required=true, example="199725")    
    private String python_total_count;

}
