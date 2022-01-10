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
 * @FileName : GiftCardAutoCharge.java
 * @since    : 2022. 01. 05.
 * @author   : jhbaek@kyobobook.com
 * @implNote : 기프트카드 자동충전 Domain
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "기프트카드 자동충전 도메인")
public class GiftCardAutoCharge {

    @ApiModelProperty(value = "GIFT카드충전신청ID", example = "A01939223")
    public String giftcrd_chgn_apln_id;
    
    @ApiModelProperty(value = "회원번호", example = "A2200304912")
    public String mmbr_num;
    
    @ApiModelProperty(value = "GIFT카드번호", example = "1234123412341234234")
    public String giftcrd_num;
    
    @ApiModelProperty(value = "GIFT카드인증번호", required=false, example = "0110110114")
    public String giftcrdCrttNum;
    
    @ApiModelProperty(value = "신청일자", required=false, example = "20220106")
    public String aplnDate;  
    
    @ApiModelProperty(value = "신청시각", required=false, example = "172341")
    public String aplnHms;  
    
    @ApiModelProperty(value = "GIFT카드자동충전일", required=false, example = "25")
    public String giftcrdAtmtChgnDy;  
    
    @ApiModelProperty(value = "GIFT카드자동충전금액", required=false, example = "000000030000")
    public String giftcrdAtmtChgnAmnt; 
    
    @ApiModelProperty(value = "결제방법코드", required=false, example = "002")
    public String stlmMthdCode;
    
    @ApiModelProperty(value = "결제연동빌링KEY값", required=false, example = "A0303030000033")
    public String stlmLnkgBllnKeyWrth;
    
    @ApiModelProperty(value = "자동연장해지여부", required=false, example = "N")
    public String atmtExtendCnccYsno;
    
    @ApiModelProperty(value = "해지일자", required=false, example = "")
    public String cnccDate; 
    
    @ApiModelProperty(value = "해지시각", required=false, example = "")
    public String cnccHms; 
    
    @ApiModelProperty(value = "GIFT카드충전해지사유코드", required=false, example = "")
    public String giftcrdChgnCnccRsnCode;  

    @ApiModelProperty(value = "생성자ID", required=false, example = "a03fkdoo02")
    public String crtrId; 
    
    @ApiModelProperty(value = "생성일시", required=false, example = "20220105224319")
    public String cretDttm; 
    
    @ApiModelProperty(value = "수정자ID", required=false, example = "a03fkdoo02")
    public String amnrId; 
    
    @ApiModelProperty(value = "수정일시", required=false, example = "20220105224319")
    public String amndDttm; 
    
    @ApiModelProperty(value = "삭제여부", required=false, example = "Y")
    public String dltYsno; 
    
    @ApiModelProperty(value = "GIFT카드충전신청ID", example = "A001330093")
    public String giftcrdChgnAplnId; 
  
    @ApiModelProperty(value = "GIFT카드충전순번", example = "002")
    public String giftcrdChgnSrmb; 
    
    @ApiModelProperty(value = "GIFT카드충전처리순번", example = "0000000000000003")
    public String giftcrdChgnProsSrmb; 
    
    @ApiModelProperty(value = "처리년월", required=false, example = "220106")
    public String prosYm; 
  
    @ApiModelProperty(value = "처리일자", required=false, example = "16043104")
    public String prosDate; 
    
    @ApiModelProperty(value = "처리성공여부", required=false, example = "Y")
    public String prosSuccsYsno;     
    
    @ApiModelProperty(value = "처리메시지내용", required=false, example = "test")
    public String prosMsgCntt; 

    
}
