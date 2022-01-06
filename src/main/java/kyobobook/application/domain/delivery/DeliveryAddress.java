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
 * @FileName : DeliveryAddress.java
 * @Date : 2022. 1. 6.
 * @author : kimsehoon@kyobobook.com
 * @description : 회원배송주소록기본
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "회원배송주소록기본")
public class DeliveryAddress {

    /** 회원번호 */
    @ApiModelProperty(required = true, value = "회원번호", example = "")
    private String mmbrNum;
    /** 배송지순번 */
    @ApiModelProperty(required = true, value = "배송지순번", example = "")
    private BigInteger dlpnSrmb;
    /** 배송지명 */
    @ApiModelProperty(required = true, value = "배송지명", example = "")
    private String dlpnName;
    /** 배송지별칭명 */
    @ApiModelProperty(required = true, value = "배송지별칭명", example = "")
    private String dlpnAtnmName;
    /** 전화번호 */
    @ApiModelProperty(required = true, value = "전화번호", example = "")
    private String tlnm;
    /** 휴대전화전화번호 */
    @ApiModelProperty(required = true, value = "휴대전화전화번호", example = "")
    private String cphnTlnm;
    /** 주소구분코드 */
    @ApiModelProperty(required = true, value = "주소구분코드", example = "")
    private String adrsDvsnCode;
    /** 우편번호 */
    @ApiModelProperty(required = true, value = "우편번호", example = "")
    private String pssrNum;
    /** 기본주소 */
    @ApiModelProperty(required = true, value = "기본주소", example = "")
    private String bscAdrs;
    /** 상세주소 */
    @ApiModelProperty(required = true, value = "상세주소", example = "")
    private String dtlAdrs;
    /** 기본배송지여부 */
    @ApiModelProperty(required = true, value = "기본배송지여부", example = "")
    private String bscDlpnYsno;
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
