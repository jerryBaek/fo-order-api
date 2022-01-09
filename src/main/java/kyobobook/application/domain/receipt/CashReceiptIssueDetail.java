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
 * @FileName    : CashReceiptIssueDetail.java
 * @Date        : 2022. 1. 7.
 * @author      : seohee.ko@kyobobook.com
 * @description :
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "현금영수증발행상세")
public class CashReceiptIssueDetail {

    /** 주문ID */
    @ApiModelProperty(required = true, value = "주문ID", example = "")
    private String ordrId;
    /** 현금영수증발행순번 */
    @ApiModelProperty(required = true, value = "현금영수증발행순번", example = "")
    private String csrcIssuSrmb;
    /** 현금영수증발행구분코드 */
    @ApiModelProperty(required = true, value = "현금영수증발행구분코드", example = "")
    private String csrcIssuDvsnCode;
    /** 전송일자 */
    @ApiModelProperty(required = true, value = "전송일자", example = "")
    private String trnnDate;
    /** 처리일자 */
    @ApiModelProperty(required = true, value = "처리일자", example = "")
    private String prosDate;
    /** 현금영수증발행금액 */
    @ApiModelProperty(required = true, value = "현금영수증발행금액", example = "")
    private String csrcIssuAmnt;
    /** 현금영수증발행부가가치세 */
    @ApiModelProperty(required = true, value = "현금영수증발행부가가치세", example = "")
    private String csrcIssuVat;
    /** 현금영수증신청유형코드 */
    @ApiModelProperty(required = true, value = "현금영수증신청유형코드", example = "")
    private String csrcAplnPatrCode;
    /** 현금영수증식별번호 */
    @ApiModelProperty(required = true, value = "현금영수증식별번호", example = "")
    private String csrcIdnfNum;
    /** 현금영수증발행처리상태코드 */
    @ApiModelProperty(required = true, value = "현금영수증발생처리상태코드", example = "")
    private String csrcIssuProsCdtnCode;
    /** 현금영수증발행결과코드 */
    @ApiModelProperty(required = true, value = "현금영수증발행결과코드", example = "")
    private String csrcIssuRsltCode;
    /** 현금영수증발행결과내용 */
    @ApiModelProperty(required = true, value = "현금영수증발행결과내용", example = "")
    private String csrcIssuRsltCntt;
    /** 현금영수증승인번호 */
    @ApiModelProperty(required = true, value = "현금영수증승인번호", example = "")
    private String csrcAproNum;
    /** 현금영수증승인내역순번 */
    @ApiModelProperty(required = true, value = "현금영수증승인내역순번", example = "")
    private String csrcAproDsrpSrmb;
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
