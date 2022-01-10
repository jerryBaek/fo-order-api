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
package kyobobook.application.domain.account;

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
 * @FileName : BankAccount.java
 * @since    : 2022. 01. 05.
 * @author   : jhbaek@kyobobook.com
 * @implNote : 계좌정보 마스터 Domain
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "계좌정보 마스터 도메인")
public class BankAccountMaster {

    @ApiModelProperty(value = "회원번호", example = "11999165878")
    public String mmbrNum;
    
    @ApiModelProperty(value = "환불계좌등록순번", example = "00001")
    public String rfnmBnacRgstSrmb;
    
    @ApiModelProperty(value = "회원여부", required=false, example = "Y")
    public String mmbrYsno;  
    
    @ApiModelProperty(value = "은행코드", required=false, example = "005")
    public String bankCode;  
    
    @ApiModelProperty(value = "고객암호화계좌번호", required=false, example = "@ASAD#123FDSAF#%$FDSFSD!@!@!")
    public String cstmEncrBnacNum;  
    
    @ApiModelProperty(value = "예금주명", required=false, example = "홍길동")
    public String dpsrName; 
    
    @ApiModelProperty(value = "계좌인증여부", required=false, example = "Y")
    public String bnacCrttYsno;
    
    @ApiModelProperty(value = "계좌인증일시", required=false, example = "20220107")
    public String bnacCrttDttm;
    
    @ApiModelProperty(value = "주문ID", required=false, example = "a12345456764")
    public String ordrId;
    
    @ApiModelProperty(value = "주문순번", required=false, example = "00004")
    public String ordrSrmb;
    
    @ApiModelProperty(value = "생성자ID", required=false, example = "a1234")
    public String crtr_id; 
    
    @ApiModelProperty(value = "생성일시", required=false, example = "20220101")
    public String cretDttm; 
    
    @ApiModelProperty(value = "수정자ID", required=false, example = "b1234")
    public String amnrId; 
    
    @ApiModelProperty(value = "수정일시", required=false, example = "20220102")
    public String amnd_dttm; 
    
    @ApiModelProperty(value = "삭제여부", required=false, example = "N")
    public String dlt_ysno; 
  
    
}
