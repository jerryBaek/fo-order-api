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
package kyobobook.application.domain.orderhistory;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project     : fo-order-api
 * @FileName    : OrderHistoryMaster.java
 * @Date        : 2022. 1. 5.
 * @author      : seohee.ko@kyobobook.com
 * @description : 마이룸 주문, 배송 마스터 도메인
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "주문, 배송 마스터 도메인")
public class OrderHistoryMaster {
    
    @ApiModelProperty(value = "조회기간 시작", example = "20220101")
    private String strtPeriod;
    
    @ApiModelProperty(value = "조회기간 종료", example = "20220105")
    private String endPeriod;
    

    @ApiModelProperty(value = "주문ID", example = "20210105")
    public String ordrId;
    
    @ApiModelProperty(value = "주문일자", example = "20210105")
    public String ordrDate;
    
    @ApiModelProperty(value = "주문진행상태코드", example = "115:배송완료")
    public String ordrPrgsCdtnCode;
    
    @ApiModelProperty(value = "배송담당코드", example = "010:북시티")
    public String dlvrRspbCode;
    
    @ApiModelProperty(value = "상품명", example = "찰랑찰랑 물이 있어요")
    public String cmdtName;
    
    @ApiModelProperty(value = "판매상품ID", example = "C160000008779")
    public String saleCmdtid;
    
    @ApiModelProperty(value = "요청수량", example = "2")
    public String requQntt;
    
    @ApiModelProperty(value = "상품매출금액", example = "15300")
    public String cmdtSlsAmnt;
    
    @ApiModelProperty(value = "단위품목명", example = "명조체")
    public String untItmName;
    
    @ApiModelProperty(value = "판매상품구분코드", example = "")
    public String saleCmdtDvsnCode;
    
    @ApiModelProperty(value = "수신자명", example = "")
    public String recvName;
    
    
    @ApiModelProperty(value = "준비중 건수", example = "")
    public String prepNumc;
    
    @ApiModelProperty(value = "배송완료 건수", example = "")
    public String dlvrFnshNumc;
    
    @ApiModelProperty(value = "취소 건수", example = "")
    public String cnclNumc;
    
    @ApiModelProperty(value = "교환 건수", example = "")
    public String xchgNumc;
    
    @ApiModelProperty(value = "반품 건수", example = "")
    public String rtgdNumc;
    
}
