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
package kyobobook.application.domain.giftcard;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project  : fo-order-api
 * @FileName : GiftCardGeneralCharge.java
 * @since    : 2022. 01. 05.
 * @author   : jhbaek@kyobobook.com
 * @implNote : 기프트카드 일반충전 Domain
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "기프트카드 일반충전 도메인")
public class GiftCardGeneralCharge {

    @ApiModelProperty(value = "주문결제번호", example = "11999165878")
    public String ordrStlmNum;
    
    @ApiModelProperty(value = "결제일자", required=false, example = "20220106")
    public String stlmDate;     
    
    @ApiModelProperty(value = "결제거래번호", required=false, example = "a993kfkdspfkds111")
    public String stlmTrncNum;     
    
    @ApiModelProperty(value = "주문결제유형코드", required=false, example = "011")
    public String ordrStlmPatrCode;
    
    @ApiModelProperty(value = "결제승인유형코드", required=false, example = "034")
    public String stlmAproPatrCode;
    
    @ApiModelProperty(value = "통합주문채널코드", required=false, example = "033")
    public String unfyOrdrChnlCode;  
    
    @ApiModelProperty(value = "주문ID", required=false, example = "A123f332939f")
    public String ordrId;  
    
    @ApiModelProperty(value = "결제방법코드", required=false, example = "A03")
    public String stlmMthdCode;  
    
    @ApiModelProperty(value = "PG승인일시", required=false, example = "20220105142513")
    public String pgAproDttm;     
    
    @ApiModelProperty(value = "PG승인번호", required=false, example = "a19198flllo3o3fb")
    public String pgAproNum; 
    
    @ApiModelProperty(value = "결제금액", required=false, example = "000000012234")
    public String stlmAmnt;  
    
    @ApiModelProperty(value = "결제잔액", required=false, example = "000000023990")
    public String stlmBlce; 
    
    @ApiModelProperty(value = "적립대상금액", required=false, example = "000000001983")
    public String acmlTrgtAmnt;  
    
    @ApiModelProperty(value = "회원번호", required=false, example = "a12345456764")
    public String mmbrNum;    
    
    @ApiModelProperty(value = "상점ID", required=false, example = "aa030")
    public String marketId; 

    @ApiModelProperty(value = "결제연동인증내용", required=false, example = "test")
    public String stlmLnkgCrttCntt; 
    
    @ApiModelProperty(value = "결제연동부가내용", required=false, example = "test123")
    public String stlmLnkgAddtCntt; 

    @ApiModelProperty(value = "최종적용여부", required=false, example = "Y")
    public String lastAplYsno; 

    @ApiModelProperty(value = "고객전화번호", required=false, example = "0211111111")
    public String cstmTlnm; 

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
