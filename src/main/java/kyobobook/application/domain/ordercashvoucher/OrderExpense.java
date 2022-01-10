/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * seohee.ko@kyobobook.com      2022. 1. 6.
 *
 ****************************************************/
package kyobobook.application.domain.ordercashvoucher;

import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project     : fo-order-api
 * @FileName    : OrderExpense.java
 * @Date        : 2022. 1. 6.
 * @author      : seohee.ko@kyobobook.com
 * @description :
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "주문비용")
public class OrderExpense {

    /** 주문비용 */
    @ApiModelProperty(required = true, value = "주문비용ID", example = "")
    private String ordrExpnId;
    /** 주문비용종류코드 */
    @ApiModelProperty(required = true, value = "주문비용종류코드", example = "")
    private String ordrExpnKindCode;
    /** 비용금액 */
    @ApiModelProperty(required = true, value = "비용금액", example = "")
    private String expnAmnt;
    /** 비용금액 */
    @ApiModelProperty(required = true, value = "비용금액", example = "")
    private String freeDlvrPlcCode;
    /** 업체ID */
    @ApiModelProperty(required = true, value = "업체ID", example = "")
    private String entsId;
    /** 할인금액 */
    @ApiModelProperty(required = true, value = "할인금액", example = "")
    private String dscnAmnt;
    /** 할인쿠폰ID */
    @ApiModelProperty(required = true, value = "할인쿠폰ID", example = "")
    private String dscnCpnId;
    /** 비용할당대상코드 */
    @ApiModelProperty(required = true, value = "비용할당대상코드", example = "")
    private String expnAssgTrgtCode;
    /** 결제환불구분코드 */
    @ApiModelProperty(required = true, value = "결제환불구분코드", example = "")
    private String stlmRfnmDvsnCode;
    /** 쿠폰지갑ID */
    @ApiModelProperty(required = true, value = "쿠폰지갑ID", example = "")
    private String cpnWaletId;
    /** 주문ID */
    @ApiModelProperty(required = true, value = "주문ID", example = "")
    private String ordrId;
    /** 주문순번 */
    @ApiModelProperty(required = true, value = "주문순번", example = "")
    private String ordrSrmb;
    /** 원주문비용ID */
    @ApiModelProperty(required = true, value = "원주문비용ID", example = "")
    private String origOrdrExpnId;
    /** 소득공제대상여부 */
    @ApiModelProperty(required = true, value = "소득공제대상여부", example = "")
    private String incmDdctTrgtYsno;
    /** 생성자ID */
    @ApiModelProperty(required = true, value = "생성자ID", example = "")
    private String crtrId;
    /** 생성일시 */
    @ApiModelProperty(required = true, value = "생성일시", example = "")
    private LocalDateTime cretDttm;
    /** 수정자ID */
    @ApiModelProperty(required = true, value = "수정자ID", example = "")
    private String amnrId;
    /** 수정일시 */
    @ApiModelProperty(required = true, value = "수정일시", example = "")
    private LocalDateTime amndDttm;
    /** 삭제여부 */
    @ApiModelProperty(required = true, value = "삭제여부", example = "")
    private String dltYsno;
}
