/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * seohee.ko@kyobobook.com      2021. 11. 9.
 *
 ****************************************************/
package kyobobook.application.domain.hybrid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kyobobook.application.domain.cart.Cart;
import kyobobook.application.domain.commodity.UnifyCommodity;
import kyobobook.application.domain.commodity.UnitItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project : fo-order-api
 * @FileName : TestCart.java
 * @Date : 2022. 1. 6.
 * @author : ymahn@kyobobook.com
 * @description : API-BIZ06-02-006
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "API-BIZ06-02-006 : Cart + UnifyCommodity + UnitItem")
public class Apibiz0602006 {

    /** 장바구니 */
    @ApiModelProperty(required = false, value="장바구니")
    private Cart cart;

    /** 통합상품 */
    @ApiModelProperty(required = false, value="통합상품")
    private UnifyCommodity unifyCommidity;

    /** 단위품목 */
    @ApiModelProperty(required = false, value="단위품목")
    private UnitItem unitItem;

}
