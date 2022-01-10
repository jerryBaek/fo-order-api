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
 * @description : API-BIZ06-02-067
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "API-BIZ06-02-067 : CommonCodeDetail + ForeignDeliveryZonePerNation")
public class Apibiz0602067 {

    // CommonCodeDetail
    /** 코드값명 */
    @ApiModelProperty(required = true, value = "코드값명", example = "교보문고")
    private String codeWrthName;

    // ForeignDeliveryZonePerNation
    /** 해외배송국가코드 */
    @ApiModelProperty(required = true, value = "해외배송국가코드", example = "")
    private String frngDlvrNtnCode;
}
