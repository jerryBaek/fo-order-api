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
package kyobobook.application.domain.orderhistory;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project     : fo-order-api
 * @FileName    : OrderHistoryDetail.java
 * @Date        : 2022. 1. 6.
 * @author      : seohee.ko@kyobobook.com
 * @description :
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "주문, 배송 상세 도메인")
public class OrderHistoryDetail {

    @ApiModelProperty(value = "주문ID", example = "O21126000018")
    public String ordrId;
    
    @ApiModelProperty(value = "주문일자", example = "20220105")
    public String ordrDate;
    
    @ApiModelProperty(value = "배송담당코드", example = "020:핫트랙스")
    public String dlvrRspbCode;
    
    @ApiModelProperty(value = "주문진행상태코드", example = "114:배송중")
    public String ordrPrgsCdtnCode;
    
    @ApiModelProperty(value = "상품명", example = "소크라테스 익스프레스")
    public String cmdtName;
    
    @ApiModelProperty(value = "요청수량", example = "3")
    public String requQntt;
    
    @ApiModelProperty(value = "상품매출금액", example = "30000")
    public String cmdtSlsAmnt;
    
    @ApiModelProperty(value = "단위품목명", example = "소크라테스 익스프레스")
    public String untItmName;
    
    @ApiModelProperty(value = "판매상품구분코드", example = "")
    public String saleCmdtDvsnCode;
    
    @ApiModelProperty(value = "수취인명", example = "김첨지")
    public String rcvrName;
    
    @ApiModelProperty(value = "수취인휴대전화번호", example = "01055555555")
    public String rcvrPrtbTlnm;
    
    @ApiModelProperty(value = "상세주소1", example = "")
    public String dtlAdrs1;
    
    @ApiModelProperty(value = "상세주소2", example = "")
    public String dtlAdrs2;
    
    @ApiModelProperty(value = "상세주소3", example = "")
    public String dtlAdrs3;
    
    @ApiModelProperty(value = "상세주소4", example = "")
    public String dtlAdrs4;
    
    @ApiModelProperty(value = "상세주소5", example = "")
    public String dtlAdrs5;
    
    @ApiModelProperty(value = "상세주소6", example = "")
    public String dtlAdrs6;
    
    @ApiModelProperty(value = "상세주소7", example = "")
    public String dtlAdrs7;
    
    @ApiModelProperty(value = "상세주소8", example = "")
    public String dtlAdrs8;
    
    @ApiModelProperty(value = "상세주소9", example = "")
    public String dtlAdrs9;
    
    @ApiModelProperty(value = "상세주소10", example = "")
    public String dtlAdrs10;
    
    @ApiModelProperty(value = "상세주소11", example = "")
    public String dtlAdrs11;
    
    @ApiModelProperty(value = "상세주소12", example = "")
    public String dtlAdrs12;
    
    @ApiModelProperty(value = "주문메모", example = "요청메세지란")
    public String ordrMemo;
    
    @ApiModelProperty(value = "주문상품종류코드", example = "100")
    public String ordrCmdtKindCode;
    
    @ApiModelProperty(value = "주문비용종류코드", example = "100")
    public String ordrExpnKindCode;
    
    @ApiModelProperty(value = "비용금액", example = "3000")
    public String expnAmnt;
    
    @ApiModelProperty(value = "결제금액", example = "50000")
    public String stlmAmnt;
    
    @ApiModelProperty(value = "결제방법코드", example = "")
    public String stlmMthdCode;
    
    @ApiModelProperty(value = "수신자명", example = "홍길동")
    public String recvName;
    
    @ApiModelProperty(value = "주문혜택적용종류코드", example = "151:상품할인쿠폰")
    public String ordrBnftAplKindCode;
    
    @ApiModelProperty(value = "총적용금액", example = "500")
    public String ttlAplAmnt;
}
