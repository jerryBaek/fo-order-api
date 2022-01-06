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
package kyobobook.application.domain.order;

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
 * @FileName : Order.java
 * @Date : 2022. 1. 6.
 * @author : kimsehoon@kyobobook.com
 * @description : 주문
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "주문")
public class Order {

    /** 주문ID */
    @ApiModelProperty(required = true, value = "주문ID", example = "")
    private String ordrId;
    /** 주문순번 */
    @ApiModelProperty(required = true, value = "주문순번", example = "")
    private BigInteger ordrSrmb;
    /** 주문종류코드 */
    @ApiModelProperty(required = true, value = "주문종류코드", example = "")
    private String ordrKindCode;
    /** 온라인주문구분코드 */
    @ApiModelProperty(required = true, value = "온라인주문구분코드", example = "")
    private String onlnOrdrDvsnCode;
    /** 취소원주문순번 */
    @ApiModelProperty(required = true, value = "취소원주문순번", example = "")
    private BigInteger cnclOrigOrdrSrmb;
    /** 주문일자 */
    @ApiModelProperty(required = true, value = "주문일자", example = "")
    private String ordrDate;
    /** 주문시각 */
    @ApiModelProperty(required = true, value = "주문시각", example = "")
    private String ordrHms;
    /** 결제완료일자 */
    @ApiModelProperty(required = true, value = "결제완료일자", example = "")
    private String stlmFnshDate;
    /** 결제완료시각 */
    @ApiModelProperty(required = true, value = "결제완료시각", example = "")
    private String stlmFnshHms;
    /** 회원주문여부 */
    @ApiModelProperty(required = true, value = "회원주문여부", example = "")
    private String mmbrOrdrYsno;
    /** 주문비밀번호 */
    @ApiModelProperty(required = true, value = "주문비밀번호", example = "")
    private String ordrSertnum;
    /** 노출여부 */
    @ApiModelProperty(required = true, value = "노출여부", example = "")
    private String exprYsno;
    /** 회원번호 */
    @ApiModelProperty(required = true, value = "회원번호", example = "")
    private String mmbrNum;
    /** 회원등급코드 */
    @ApiModelProperty(required = true, value = "회원등급코드", example = "")
    private String mmbrGrdCode;
    /** 주문자명 */
    @ApiModelProperty(required = true, value = "주문자명", example = "")
    private String aordName;
    /** 주문자이메일주소 */
    @ApiModelProperty(required = true, value = "주문자이메일주소", example = "")
    private String aordEmlAdrs;
    /** 주문자휴대전화번호 */
    @ApiModelProperty(required = true, value = "주문자휴대전화번호", example = "")
    private String aordPrtbTlnm;
    /** 주문자IP주소 */
    @ApiModelProperty(required = true, value = "주문자IP주소", example = "")
    private String aordIpAdrs;
    /** SMS수신여부 */
    @ApiModelProperty(required = true, value = "SMS수신여부", example = "")
    private String smsRcmsYsno;
    /** 이메일수신여부 */
    @ApiModelProperty(required = true, value = "이메일수신여부", example = "")
    private String emlRcmsYsno;
    /** 링크구분코드 */
    @ApiModelProperty(required = true, value = "링크구분코드", example = "")
    private String linkDvsnCode;
    /** 통합주문채널코드 */
    @ApiModelProperty(required = true, value = "통합주문채널코드", example = "")
    private String unfyOrdrChnlCode;
    /** 통합주문상세채널코드 */
    @ApiModelProperty(required = true, value = "통합주문상세채널코드", example = "")
    private String unfyOrdrDtlChnlCode;
    /** 주문처리결과코드 */
    @ApiModelProperty(required = true, value = "주문처리결과코드", example = "")
    private String ordrProsRsltCode;
    /** 주문처리결과메모내용 */
    @ApiModelProperty(required = true, value = "주문처리결과메모내용", example = "")
    private String ordrProsRsltMemoCntt;
    /** 단수배송여부 */
    @ApiModelProperty(required = true, value = "단수배송여부", example = "")
    private String nmsrDlvrYsno;
    /** 환불방법요청코드 */
    @ApiModelProperty(required = true, value = "환불방법요청코드", example = "")
    private String rfnmMthdRequCode;
    /** 클레임신청사유코드 */
    @ApiModelProperty(required = true, value = "클레임신청사유코드", example = "")
    private String clmAplnRsnCode;
    /** 클레임신청사유 */
    @ApiModelProperty(required = true, value = "클레임신청사유", example = "")
    private String clmAplnRsn;
    /** 첨부파일번호 */
    @ApiModelProperty(required = true, value = "첨부파일번호", example = "")
    private BigInteger atacFileNum;
    /** 착한배송선택여부 */
    @ApiModelProperty(required = true, value = "착한배송선택여부", example = "")
    private String gddlSlctYsno;
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
