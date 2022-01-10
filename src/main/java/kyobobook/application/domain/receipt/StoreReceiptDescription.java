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
package kyobobook.application.domain.receipt;

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
 * @FileName    : StoreReceiptDescription.java
 * @Date        : 2022. 1. 7.
 * @author      : seohee.ko@kyobobook.com
 * @description :
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "점포영수증내역")
public class StoreReceiptDescription {

    /** 점포주문ID */
    @ApiModelProperty(required = true, value = "점포주문ID", example = "")
    private String strOrdrId;
    /** 점포주문순번 */
    @ApiModelProperty(required = true, value = "점포주문순번", example = "")
    private String strOrdrSrmb;
    /** 매출반품구분코드 */
    @ApiModelProperty(required = true, value = "매출반품구분코드", example = "")
    private String slsRtgdDvsnCode;
    /** 매출일자 */
    @ApiModelProperty(required = true, value = "매출일자", example = "")
    private String slsDate;
    /** 회원번호 */
    @ApiModelProperty(required = true, value = "회원번호", example = "")
    private String mmbrNum;
    /** POS소유주체구분코드 */
    @ApiModelProperty(required = true, value = "POS소유주체구분코드", example = "")
    private String posOwnMagentDvsnCode;
    /** 점포수불처코드 */
    @ApiModelProperty(required = true, value = "점포수불처코드", example = "")
    private String strRdpCode;
    /** POS번호 */
    @ApiModelProperty(required = true, value = "POS번호", example = "")
    private String posNum;
    /** POS거래번호 */
    @ApiModelProperty(required = true, value = "POS거래번호", example = "")
    private String posTrncNum;
    /** 판매시각 */
    @ApiModelProperty(required = true, value = "판매시각", example = "")
    private String saleHms;
    /** POS거래영수증내용 */
    @ApiModelProperty(required = true, value = "POS거래영수증내용", example = "")
    private String posTrncRecpCntt;
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
