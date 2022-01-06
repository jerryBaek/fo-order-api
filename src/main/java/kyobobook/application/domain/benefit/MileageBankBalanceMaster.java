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
package kyobobook.application.domain.benefit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project     : fo-order-api
 * @FileName    : BenefitMaster.java
 * @Date        : 2022. 1. 5.
 * @author      : seohee.ko@kyobobook.com
 * @description :
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "예치금/마일리지 마스터 도메인")
public class MileageBankBalanceMaster {

    @ApiModelProperty(value = "매출일자", example = "20220105")
    public String slsDate;
    
    @ApiModelProperty(value = "입출금구분코드", example = "001:출금")
    public String destWtdwDvsnCode;
    
    @ApiModelProperty(value = "매출금액", example = "200")
    public String slsAmnt;
    
    @ApiModelProperty(value = "통합주문ID", example = "C400000000081")
    public String unfyOrdrId;
    
    @ApiModelProperty(value = "주문금권매출사유코드", example = "111:온라인구매")
    public String ordrcsvcSlsRsnCode;
    
    @ApiModelProperty(value = "주문금권구분코드", example = "101:예치금")
    public String ordrcsvcDvsnCode;

}
