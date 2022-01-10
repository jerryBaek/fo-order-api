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
package kyobobook.application.domain.address;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
/**
 * @Project  : fo-order-api
 * @FileName : DeliveryAddressMaster.java
 * @since    : 2022. 01. 05.
 * @author   : jhbaek@kyobobook.com 
 * @implNote : 배송지 마스터 Domain
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "배송지 마스터 도메인")
public class DeliveryAddressMaster {

    @ApiModelProperty(value = "회원번호", example = "11999165878")
    public String mmbrNum;
    
    @ApiModelProperty(value = "배송지순번", required=false, example = "00001")
    public String dlpnSrmb;
    
    @ApiModelProperty(value = "배송지명", required=false, example = "우리집")
    public String dlpnName;
    
    @ApiModelProperty(value = "배송지별칭명", required=false, example = "우리집의 주소 114-12")
    public String dlpnAtnmName;  
    
    @ApiModelProperty(value = "전화번호", required=false, example = "0212123333")
    public String tlnm;  
    
    @ApiModelProperty(value = "휴대전화전화번호", required=false, example = "01091287262")
    public String cphnTlnm;  
    
    @ApiModelProperty(value = "배송주소구분코드",  required=false, example = "003")
    public String dlvrAdrsDvsnCode; 
    
    @ApiModelProperty(value = "도로명주소여부", required=false, example = "Y")
    public String rdnmAdrsYsno;
    
    @ApiModelProperty(value = "해외배송국가코드", required=false, example = "132")
    public String frngDlvrNtnCode;
    
    @ApiModelProperty(value = "해외우편번호", required=false, example = "130222033232")
    public String frngPssrNum;
    
    @ApiModelProperty(value = "기본주소", required=false, example = "서울시 종로구 **동 101-422")
    public String bscAdrs; 
    
    @ApiModelProperty(value = "상세주소", required=false, example = "***빌리지 123호")
    public String dtlAdrs; 
    
    @ApiModelProperty(value = "해외부가주소1", required=false, example = "Brooklynn City 123street 123-12")
    public String frngAddtAdrs1;  
    
    @ApiModelProperty(value = "해외부가주소2", required=false, example = "HopeDouble Village 23-12")
    public String frngAddtAdrs2; 
    
    @ApiModelProperty(value = "기본배송지여부", required=false, example = "Y")
    public String bscDlpnYsno; 

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
