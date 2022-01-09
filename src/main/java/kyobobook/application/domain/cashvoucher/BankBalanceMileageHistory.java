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
package kyobobook.application.domain.cashvoucher;

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
 * @FileName    : BankBalanceMileageHistory.java
 * @Date        : 2022. 1. 6.
 * @author      : seohee.ko@kyobobook.com
 * @description :
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "예치금마일리지이력")
public class BankBalanceMileageHistory {

    /** 회원번호 */
    @ApiModelProperty(required = true, value = "회원번호", example = "")
    private String mmbrNum;
    /** 예치금마일리지이력순번 */
    @ApiModelProperty(required = true, value = "예치금마일리지이력순번", example = "")
    private String bnblMlgHstrSrmb;
    /** 매출일자 */
    @ApiModelProperty(required = true, value = "매출일자", example = "")
    private String slsDate;
    /** 주문금권매출사유코드 */
    @ApiModelProperty(required = true, value = "주문금권매출사유코드", example = "")
    private String ordrcsvcSlsRsnCode;
    /** 주문금권구분코드 */
    @ApiModelProperty(required = true, value = "주문금권구분코드", example = "")
    private String ordrcsvcDvsnCode;
    /** 입금출금구분코드 */
    @ApiModelProperty(required = true, value = "입금출금구분코드", example = "")
    private String destWtdwDvsnCode;
    /** 매출금액 */
    @ApiModelProperty(required = true, value = "매출금액", example = "")
    private String slsAmnt;
    /** 예치금잔액 */
    @ApiModelProperty(required = true, value = "예치금잔액", example = "")
    private String bnblBlce;
    /** 마일리지잔액 */
    @ApiModelProperty(required = true, value = "마일리지잔액", example = "")
    private String mlgBlce;
    /** 주문입금출금거래번호 */
    @ApiModelProperty(required = true, value = "주문입금출금거래번호", example = "")
    private String ordrDestWtdwTrncNum;
    /** 통합주문ID */
    @ApiModelProperty(required = true, value = "통합주문ID", example = "")
    private String unfyOrdrId;
    /** 매출처리필요내용 */
    @ApiModelProperty(required = true, value = "매출처리필요내용", example = "")
    private String slsProsNeedCntt;
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
}
