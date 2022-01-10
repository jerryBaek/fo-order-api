/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * kimsehoon@kyobobook.com      2022. 1. 6.
 *
 ****************************************************/
package kyobobook.application.domain.delivery;

import java.math.BigInteger;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project : fo-order-api
 * @FileName : ForeignDeliveryExpense.java
 * @Date : 2022. 1. 6.
 * @author : kimsehoon@kyobobook.com
 * @description : 해외배송비용기본
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "해외배송비용기본")
public class ForeignDeliveryExpense {

    /** 해외배송구역코드 */
    @ApiModelProperty(required = true, value = "해외배송구역코드", example = "")
    private String frngDlvrZoneCode;
    /** 해외배송상품기준수량 */
    @ApiModelProperty(required = true, value = "해외배송상품기준수량", example = "")
    private BigInteger frngDlvrCmdtStnrQntt;
    /** 해외배송금액 */
    @ApiModelProperty(required = true, value = "해외배송금액", example = "25000")
    private BigInteger frngDlvrAmnt;
    /** 해외택배사코드 */
    @ApiModelProperty(required = true, value = "해외택배사코드", example = "FX001")
    private String frngDscmCode;
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
