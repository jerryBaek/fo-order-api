/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * sykim@kyobobook.com      2021. 9. 12.
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
 * @FileName    : ProductAuthor.java
 * @Date        : 2021. 9. 12.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-32 Service Mesh 연동 구성 Prototype : ProductAuthor
 */
@ApiModel(value = "TEC01-32 상품별 저자 domain 클래스", description = "Service Mesh 연동 구성 Prototype용 class")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductAuthor {
    
    @ApiParam(value="상품 ID", required=true, example="5800009686842")
    private String cmdt_id;
    
    @ApiParam(value="저자1 코드", required=false, example="1101957503")
    private String autr_code1;
    
    @ApiParam(value="저자1 이름", required=false, example="공유")
    private String autr_name1;
    
    @ApiParam(value="저자2 코드", required=false, example="1101957503")
    private String autr_code2;
    
    @ApiParam(value="저자2 이름", required=false, example="박서준")
    private String autr_name2;
    
    @ApiParam(value="저자3 코드", required=false, example="1101957503")
    private String autr_code3;
    
    @ApiParam(value="저자3 이름", required=false, example="차은우")
    private String autr_name3;

}
