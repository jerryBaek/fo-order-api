/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * jhbang@kyobobook.com      2021. 10. 23.
 *
 ****************************************************/
package kyobobook.application.domain.store;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
/**
 * @Project  : fo-order-api
 * @FileName : StoreMaster.java
 * @since    : 2022. 01. 07.
 * @author   : jhbaek@kyobobook.com 
 * @implNote : 매장 Domain
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "매장 도메인")
public class StoreMaster {

    @ApiModelProperty(value = "회원번호", example = "11999165878")
    public String mmbrNum;
    
    @ApiModelProperty(value = "배송지순번", required=false, example = "00001")
    public String brdr_str_rdp_code;
    
    @ApiModelProperty(value = "기본바로드림점포여부", required=false, example = "우리집")
    public String bsc_brdr_str_ysno;
    
    @ApiModelProperty(value = "생성자ID", required=false, example = "a03fkdoo02")
    public String crtrId; 
    
    @ApiModelProperty(value = "생성일시", required=false, example = "20220105224319")
    public String cretDttm; 
    
    @ApiModelProperty(value = "수정자ID", required=false, example = "b390bo30")
    public String amnrId; 
    
    @ApiModelProperty(value = "수정일시", required=false, example = "20220105231822")
    public String amndDttm; 
    
    @ApiModelProperty(value = "삭제여부", required=false, example = "Y")
    public String dltYsno; 
  
    
}
