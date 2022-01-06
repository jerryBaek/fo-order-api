/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * seohee.ko@kyobobook.com      2022. 1. 5.
 *
 ****************************************************/
package kyobobook.application.domain.claim;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kyobobook.application.domain.orderhistory.OrderHistoryMaster;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project     : fo-order-api
 * @FileName    : ClaimApplication.java
 * @Date        : 2022. 1. 5.
 * @author      : seohee.ko@kyobobook.com
 * @description : 클레임 신청 도메인
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "클레임 신청 도메인")
public class ClaimApplication {

    @ApiModelProperty(value = "주문ID", example = "O21116000036")
    public String ordrId;
    
    @ApiModelProperty(value = "온라인주문구분코드", example = "110:주문취소")
    public String onlnOrdrDvsnCode;
    
    @ApiModelProperty(value = "클레임신청사유코드", example = "106:상품 재주문")
    public String clmAplnRsnCode;
    
    @ApiModelProperty(value = "클레임신청사유", example = "다른 상품으로 재주문하겠습니다.")
    public String clmAplnRsn;
    
    @ApiModelProperty(value = "예금주명", example = "고서희")
    public String dpsrName;
    
    @ApiModelProperty(value = "은행코드", example = "011:농협")
    public String bankCode;
    
    @ApiModelProperty(value = "고객암호화계좌번호", example = "1234****1234")
    public String cstmEncrBnacNum;
    
    @ApiModelProperty(value = "계좌인증여부", example = "Y")
    public String bnacCrttYsno;
    
    @ApiModelProperty(value = "판매상품ID", example = "C400000000081")
    public String saleCmdtid;
}
