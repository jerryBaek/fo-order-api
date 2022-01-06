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
package kyobobook.application.domain.gift;

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
 * @FileName : OrderGiftReceiptOfMessageTarget.java
 * @Date : 2022. 1. 6.
 * @author : kimsehoon@kyobobook.com
 * @description : 주문선물수신대상기본
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "주문선물수신대상기본")
public class OrderGiftReceiptOfMessageTarget {

    /** 주문선물수신대상ID */
    @ApiModelProperty(required = true, value = "주문선물수신대상ID", example = "")
    private String ordrGftRcmsTrgtId;
    /** 주문선물수신대상순번 */
    @ApiModelProperty(required = true, value = "주문선물수신대상순번", example = "")
    private BigInteger ordrGftRcmsTrgtSrmb;
    /** 수신자회원번호 */
    @ApiModelProperty(required = true, value = "수신자회원번호", example = "")
    private String recvMmbrNum;
    /** 수신자명 */
    @ApiModelProperty(required = true, value = "수신자명", example = "")
    private String recvName;
    /** 연락처유형코드 */
    @ApiModelProperty(required = true, value = "연락처유형코드", example = "")
    private String cnplPatrCode;
    /** 연락처유형내용 */
    @ApiModelProperty(required = true, value = "연락처유형내용", example = "")
    private String cnplPatrCntt;
    /** 선물상태코드 */
    @ApiModelProperty(required = true, value = "선물상태코드", example = "")
    private String gftCdtnCode;
    /** 선물수신일자 */
    @ApiModelProperty(required = true, value = "선물수신일자", example = "")
    private String gftRcmsDate;
    /** 선물수신시각 */
    @ApiModelProperty(required = true, value = "선물수신시각", example = "")
    private String gftRcmsHms;
    /** 주문ID */
    @ApiModelProperty(required = true, value = "주문ID", example = "")
    private String ordrId;
    /** 주문순번 */
    @ApiModelProperty(required = true, value = "주문순번", example = "")
    private BigInteger ordrSrmb;
    /** 주문배송지ID */
    @ApiModelProperty(required = true, value = "주문배송지ID", example = "")
    private String ordrDlpnId;
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
