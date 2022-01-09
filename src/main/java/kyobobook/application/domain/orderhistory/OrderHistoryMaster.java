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

import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kyobobook.application.domain.commodity.OrderCommodity;
import kyobobook.application.domain.delivery.OrderDeliveryPoint;
import kyobobook.application.domain.gift.OrderGiftReceiptOfMessageTarget;
import kyobobook.application.domain.ordercashvoucher.OrderExpense;
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
    
    /** 주문마스터기본정보 */
    /** 주문ID */
    @ApiModelProperty(required = true, value = "주문ID", example = "")
    private String ordrId;
    /** 회원번호 */
    @ApiModelProperty(required = true, value = "회원번호", example = "")
    private String mmbrNum;
    /** 주문자명 */
    @ApiModelProperty(required = true, value = "주문자명", example = "")
    private String aordName;
    /** 주문자이메일주소 */
    @ApiModelProperty(required = true, value = "주문자이메일주소", example = "")
    private String aordEmlAdrs;
    /** 주문자휴대전화번호 */
    @ApiModelProperty(required = true, value = "주문자휴대전화번호", example = "")
    private String aordPrtbTlnm;
    /** 주문일자 */
    @ApiModelProperty(required = true, value = "주문일자", example = "")
    private String ordrDate;
    /** 주문시각 */
    @ApiModelProperty(required = true, value = "주문시각", example = "")
    private String ordrHms;
    /** 결제완료일자 */
    @ApiModelProperty(required = true, value = "결제완료일자", example = "")
    private String stlmFnshDate;
    
    
    /** 주문상품목록 */
    private List<OrderCommodity> orderCommodityList;
    
    /** 주문비용 */
    private List<OrderExpense> orderExpenseList;
    
    /** 주문배송지 */
    private List<OrderDeliveryPoint> orderDeliveryPointList;
    
    /** 선물수신대상기본 */
    private List<OrderGiftReceiptOfMessageTarget> orderGiftReceiptOfMessageTargetList;
    
    
}
