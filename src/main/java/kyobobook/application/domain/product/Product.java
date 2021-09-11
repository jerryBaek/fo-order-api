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
 * @FileName    : Product.java
 * @Date        : 2021. 8. 31.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-32 Service Mesh 연동 구성 Prototype : Product
 */
@ApiModel(value = "TEC01-32 상품 domain 클래스", description = "Service Mesh 연동 구성 Prototype용 class")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    
    @ApiParam(value="상품 ID", required=true, example="5800009686842")
    private String cmdt_id;
    
    @ApiParam(value="상품 명", required=false, example="미래가 온다")    
    private String cmdt_name;
    
    @ApiParam(value="상품 부제목", required=false, example="뉴노멀을 살아갈 청소년")
    private String sbtt_name1;
    
    @ApiParam(value="출간일", required=false, example="20210201")
    private String rlse_date;
    
    @ApiParam(value="ISBN", required=false, example="9788954446358")
    private String cmdt_code;


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
    
    @ApiParam(value="정가", required=false, example="20000")
    private int wncr_prce;
    
    @ApiParam(value="출판사 서평", required=false, example="이 책은 학교와 교육 현장에서 실제 활용할 수 있는 주제와 내용을 담고 있다.")
    private String bkrv_cntt;
    
    @ApiParam(value="상품 목차", required=false, example="이 책은 목차가 없습니다.")
    private String ctnt_cntt;

}
