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
 * @FileName    : CommodityCashVoucherAssignment.java
 * @Date        : 2022. 1. 6.
 * @author      : seohee.ko@kyobobook.com
 * @description :
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "주문상품금권할당내역")
public class CommodityCashVoucherAssignment {

    /** 주문ID */
    @ApiModelProperty(required = true, value = "주문ID", example = "")
    private String ordrId;
    /** 주문상품순번 */
    @ApiModelProperty(required = true, value = "주문상품순번", example = "")
    private String ordrCmdtSrmb;
    /** 결제방법코드 */
    @ApiModelProperty(required = true, value = "결제방법코드", example = "")
    private String stlmMthdCode;
    /** 할당금권금액 */
    @ApiModelProperty(required = true, value = "할당금권금액", example = "")
    private String assgCsvcAmnt;
    /** 소득공제대상여부 */
    @ApiModelProperty(required = true, value = "소득공제대상여부", example = "")
    private String incmDdctTrgtYsno;
    /** 매출처리여부 */
    @ApiModelProperty(required = true, value = "매출처리여부", example = "")
    private String slsProsYsno;
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
