/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * sykim@kyobobook.com      2021. 8. 27.
 *
 ****************************************************/
package kyobobook.application.domain.product;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Project     : common-prototype-api
 * @FileName    : Author.java
 * @Date        : 2021. 8. 31.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-32 Service Mesh 연동 구성 Prototype : Author
 */
@ApiModel(value = "TEC01-32 저자 domain 클래스", description = "Service Mesh 연동 구성 Prototype용 class")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    
    @ApiParam(value="저자 코드", required=false, example="1001109106")
    private String autr_code;
    
    @ApiParam(value="저자 이름", required=false, example="김지호")
    private String autr_name;

}
