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
package kyobobook.application.domain.Settlement;

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
 * @FileName    : CreditCardSettlementDetail.java
 * @Date        : 2022. 1. 7.
 * @author      : seohee.ko@kyobobook.com
 * @description :
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "신용카드결제상세")
public class CreditCardSettlementDetail {

    /** 주문결제번호 */
    @ApiModelProperty(required = true, value = "주문결제번호", example = "")
    private String ordrStlmNum;
    /** 고객암호화카드번호 */
    @ApiModelProperty(required = true, value = "고객암호화카드번호", example = "")
    private String cstmEncrCardNum;
    /** 할부개월 */
    @ApiModelProperty(required = true, value = "할부개월", example = "")
    private String insmMnts;
    /** 매입카드사코드 */
    @ApiModelProperty(required = true, value = "매입카드사코드", example = "")
    private String byngCccpCode;
    /** 발급카드사코드 */
    @ApiModelProperty(required = true, value = "발급카드사코드", example = "")
    private String isncCccpCode;
    /** 카드승인메시지내용1 */
    @ApiModelProperty(required = true, value = "카드승인메시지내용1", example = "")
    private String crcdAproMsgCntt1;
    /** 카드승인메시지내용2 */
    @ApiModelProperty(required = true, value = "카드승인메시지내용2", example = "")
    private String crcdAproMsgCntt2;
    /** PG코드 */
    @ApiModelProperty(required = true, value = "PG코드", example = "")
    private String pgCode;
    /** 개인법인구분코드 */
    @ApiModelProperty(required = true, value = "개인법인구분코드", example = "")
    private String prsnCrpnDvsnCode;
    /** 카드포인트사용여부 */
    @ApiModelProperty(required = true, value = "카드포인트사용여부", example = "")
    private String crdpointUseYsno;
    /** 카드결제방식코드 */
    @ApiModelProperty(required = true, value = "카드결제방식코드", example = "")
    private String cardStlmFrCode;
    /** 부분취소가능여부 */
    @ApiModelProperty(required = true, value = "부분취소가능여부", example = "")
    private String patCnclPsblYsno;
    /** 즉시할인여부 */
    @ApiModelProperty(required = true, value = "즉시할인여부", example = "")
    private String immdDscnYsno;
    /** 카드즉시할인금액 */
    @ApiModelProperty(required = true, value = "카드즉시할인금액", example = "")
    private String cardImmdDscnAmnt;
    /** 카드즉시할인잔액 */
    @ApiModelProperty(required = true, value = "카드즉시할인잔액", example = "")
    private String cardImmdDscnBlce;
    /** 카드즉시할인기준금액 */
    @ApiModelProperty(required = true, value = "카드즉시할인기준금액", example = "")
    private String cardImmdDscnStnrAmnt;
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
