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
package kyobobook.application.domain.common;

import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kyobobook.application.domain.ordercashvoucher.OrderCommodityAppliedBenefit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project     : fo-order-api
 * @FileName    : OrderMemo.java
 * @Date        : 2022. 1. 6.
 * @author      : seohee.ko@kyobobook.com
 * @description :
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "주문메모")
public class OrderMemo {

    /** 주문메모ID */
    @ApiModelProperty(required = true, value = "주문메모ID", example = "")
    private String ordrMemoId;
    /** 주문메모구분코드 */
    @ApiModelProperty(required = true, value = "주문메모구분코드", example = "")
    private String ordrMemoDvsnCode;
    /** 주문메모 */
    @ApiModelProperty(required = true, value = "주문메모", example = "")
    private String ordrMemo;
    /** 주문ID */
    @ApiModelProperty(required = true, value = "주문ID", example = "")
    private String ordrId;
    /** 주문순번 */
    @ApiModelProperty(required = true, value = "주문순번", example = "")
    private String ordrSrmb;
    /** 주문상품순번 */
    @ApiModelProperty(required = true, value = "주문상품순번", example = "")
    private String ordrCmdtSrmb;
    /** 주문상품처리순번 */
    @ApiModelProperty(required = true, value = "주문상품처리순번", example = "")
    private String ordrCmdtProsSrmb;
    /** 주문배송지ID */
    @ApiModelProperty(required = true, value = "주문배송지ID", example = "")
    private String ordrDlpnId;
    /** 주문선물수신대상ID */
    @ApiModelProperty(required = true, value = "주문선물수신대상ID", example = "")
    private String ordrGftRcmsTrgtId;
    /** 주문선물수신대상순번 */
    @ApiModelProperty(required = true, value = "주문선물수신대상순번", example = "")
    private String ordrGftRcmsTrgtSrmb;
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
