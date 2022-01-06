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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project     : fo-order-api
 * @FileName    : ClaimMaster.java
 * @Date        : 2022. 1. 5.
 * @author      : seohee.ko@kyobobook.com
 * @description : 클레임 마스터 도메인
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "클레임 마스터 도메인")
public class ClaimMaster {

    @ApiModelProperty(value = "주문ID", example = "O21126000018")
    public String ordrId;
    
    @ApiModelProperty(value = "주문일자", example = "20211213")
    public String ordrDate;
    
    @ApiModelProperty(value = "배송담당코드", example = "010:북시티")
    public String dlvrRspbCode;
    
    @ApiModelProperty(value = "주문진행상태코드", example = "190:주문취소")
    public String ordrPrgsCdtnCode;
    
    @ApiModelProperty(value = "주문상품", example = "Crazy Rich Asians (Book #1)")
    public String cmdtName;
    
    @ApiModelProperty(value = "요청수량", example = "1")
    public String requQntt;
    
    @ApiModelProperty(value = "상품매출금액", example = "6840")
    public String cmdtSlsAmnt;
    
    @ApiModelProperty(value = "단위품목명", example = "")
    public String untItmName;
    
    @ApiModelProperty(value = "판매상품구분코드", example = "")
    public String saleCmdtDvsnCode;
    
    @ApiModelProperty(value = "주문비용종류코드", example = "101:배송비")
    public String ordrExpnKindCode;
    
    @ApiModelProperty(value = "결제방법코드", example = "")
    public String stlmMthdCode;
    
    @ApiModelProperty(value = "결제금액", example = "")
    public String stlmAmnt;
}
