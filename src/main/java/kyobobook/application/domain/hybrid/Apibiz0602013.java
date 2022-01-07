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

import java.math.BigInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
 * @description : API-BIZ06-02-013
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "API-BIZ06-02-013 : StringType + Cart")
public class Apibiz0602013 {

    // StringType
    @ApiModelProperty(required = false, value = "결과", example = "Y")
    private String result;

    // Cart
    /** 단위품목순번 */
    @ApiModelProperty(required = true, value = "단위품목순번", example = "1")
    private BigInteger untItmSrmb;
}
