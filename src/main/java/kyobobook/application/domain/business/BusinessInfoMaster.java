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
package kyobobook.application.domain.business;

import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project  : fo-order-api
 * @FileName : BusinessInfoMaster.java
 * @since    : 2022. 01. 04.
 * @author   : jhbaek@kyobobook.com
 * @implNote : 사업자정보 마스터 Domain
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "사업자정보 마스터 도메인")
public class BusinessInfoMaster {
    
    @ApiModelProperty(value = "회원번호", example = "11999165878")
    public String mmbrNum;
    
    @ApiModelProperty(value = "사업자등록번호", example = "123456789012345")
    public String bsnnRgstNum;
    
    @ApiModelProperty(value = "상호명", required=false, example = "r12345678")
    public String shnmName;
    
    @ApiModelProperty(value = "대표자명", required=false, example = "홍길동")
    public String rprnName;
    
    @ApiModelProperty(value = "업태명", required=false, example = "r12345678")
    public String bscnName;
    
    @ApiModelProperty(value = "종목명", required=false, example = "r12345678")
    public String itmtypName;
    
    @ApiModelProperty(value = "사업장소재지명", required=false, example = "r12345678")
    public String bsunLocnName;
    
    @ApiModelProperty(value = "담당자명", required=false, example = "홍길동1")
    public String rpprName;
    
    @ApiModelProperty(value = "이메일주소", required=false, example = "acb@kyobobook.com")
    public String emladrs;
    
    @ApiModelProperty(value = "생성자ID", required=false, example = "acb2ffd#$fom")
    public String crtrId;
    
    @ApiModelProperty(value = "생성일시", required=false, example = "20220102")
    public String cretDttm;
    
    @ApiModelProperty(value = "삭제여부", required=false, example = "N")
    public String dltYsno;
    
}
