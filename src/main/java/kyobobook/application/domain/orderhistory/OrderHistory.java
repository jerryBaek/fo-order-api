/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * seohee.ko@kyobobook.com      2022. 1. 7.
 *
 ****************************************************/
package kyobobook.application.domain.orderhistory;

import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kyobobook.application.domain.commodity.OrderCommodity;
import kyobobook.application.domain.order.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project     : fo-order-api
 * @FileName    : OrderHistory.java
 * @Date        : 2022. 1. 7.
 * @author      : seohee.ko@kyobobook.com
 * @description :
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "주문,배송목록")
public class OrderHistory {
    
    /** 조회기간 시작 */
    @ApiModelProperty(value = "조회기간 시작", example = "20220101")
    private String strtPeriod;
    /** 조회기간 종료 */
    @ApiModelProperty(value = "조회기간 종료", example = "20220105")
    private String endPeriod;

    /** 주문 요약정보 */
    @ApiModelProperty(value = "준비중 건수", example = "2")
    public String prepNumc;
    @ApiModelProperty(value = "배송완료 건수", example = "6")
    public String dlvrFnshNumc;
    @ApiModelProperty(value = "취소 건수", example = "1")
    public String cnclNumc;
    @ApiModelProperty(value = "교환 건수", example = "0")
    public String xchgNumc;
    @ApiModelProperty(value = "반품 건수", example = "3")
    public String rtgdNumc;
    
    /** 주문 */
    private Order order;
    
    /** 주문상품목록 */
    private List<OrderCommodity> orderCommodityList;
}
