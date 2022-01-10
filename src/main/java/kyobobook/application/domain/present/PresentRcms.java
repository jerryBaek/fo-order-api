/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * jhbang@kyobobook.com      2021. 10. 23.
 *
 ****************************************************/
package kyobobook.application.domain.present;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project  : fo-order-api
 * @FileName : PresentRcms.java
 * @since    : 2022. 01. 07.
 * @author   : jhbaek@kyobobook.com
 * @implNote : 주문 선물 Domain
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "주문 선물 도메인")
public class PresentRcms {

    @ApiModelProperty(value = "주문선물수신대상ID", example = "A123453233981")
    public String ordrGftRcmsTrgtId; 
    
    @ApiModelProperty(value = "주문선물수신대상순번", example = "0002")
    public String ordrGftRcmsTrgtSrmb; 
    
    @ApiModelProperty(value = "수신자회원번호", required=false, example = "A0039323920")
    public String recvMmbrNum; 
    
    @ApiModelProperty(value = "수신자명", required=false, example = "임꺽정")
    public String recvName; 
    
    @ApiModelProperty(value = "연락처유형코드", required=false, example = "A02")
    public String cnplPatrCode; 
    
    @ApiModelProperty(value = "연락처유형내용", required=false, example = "유형테스트입니다.")
    public String cnplPatrCntt; 
    
    @ApiModelProperty(value = "선물상태코드", required=false, example = "Y")
    public String gftCdtnCode; 
    
    @ApiModelProperty(value = "선물수신일자", required=false, example = "20220107")
    public String gftRcmsDate; 
    
    @ApiModelProperty(value = "선물수신시각", required=false, example = "200104")
    public String gftRcmsHms; 
    
    @ApiModelProperty(value = "주문ID", example = "A123f332939f")
    public String ordrId;
    
    @ApiModelProperty(value = "주문순번", required=false, example = "00011")
    public String ordrSrmb;
    
    @ApiModelProperty(value = "주문배송지ID", required=false, example = "Y")
    public String ordrDlpnId;
    
    @ApiModelProperty(value = "생성자ID", required=false, example = "a03fkdoo02")
    public String crtrId; 
    
    @ApiModelProperty(value = "생성일시", required=false, example = "20220105224319")
    public String cretDttm; 
    
    @ApiModelProperty(value = "수정자ID", required=false, example = "b390bo30")
    public String amnrId; 
    
    @ApiModelProperty(value = "수정일시", required=false, example = "20220105231822")
    public String amndDttm; 
    
    @ApiModelProperty(value = "삭제여부", required=false, example = "Y")
    public String dltYsno; 
    
    

}
