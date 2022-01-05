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
package kyobobook.application.domain.taxbill;

import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project  : fo-order-api
 * @FileName : TaxbillMaster.java
 * @since    : 2022. 01. 04.
 * @author   : jhbaek@kyobobook.com
 * @implNote : 세금계산서 마스터 Domain
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "세금계산서 마스터 도메인")
public class TaxbillMaster {

    @ApiModelProperty(value = "세금계산서 신청년월", example = "20210104")
    public String txinAplnYm;
    
    @ApiModelProperty(value = "세금계산서신청년월순번", example = "00001")
    public String txinAplnYmSrmb;
    
    @ApiModelProperty(value = "회원번호", required=false, example = "11999165878")
    public String mmbrNum;
    
    @ApiModelProperty(value = "사업자등록번호", required=false, example = "123456789012345")
    public String bsnnRgstNum;
    
    @ApiModelProperty(value = "상호명", required=false, example = "r12345678")
    public String frmnm;
    
    @ApiModelProperty(value = "대표자명", required=false, example = "홍길동")
    public String rprnm;
    
    @ApiModelProperty(value = "업태명", required=false, example = "r12345678")
    public String bsnst;
    
    @ApiModelProperty(value = "종목명", required=false, example = "r12345678")
    public String kind;
    
    @ApiModelProperty(value = "사업장소재지명", required=false, example = "r12345678")
    public String lctn;
    
    @ApiModelProperty(value = "담당자명", required=false, example = "홍길동1")
    public String emlad;
    
    @ApiModelProperty(value = "이메일주소", required=false, example = "acb@kyobobook.com")
    public String chrno;
    
    @ApiModelProperty(value = "신청일자", required=false, example = "acb@kyobobook.com")
    public String aplnDate;
    
    @ApiModelProperty(value = "세금계산서발행금액", required=false, example = "100000000")
    public String txinIssuAmnt;
    
    @ApiModelProperty(value = "세금계산서발행부가가치세", required=false, example = "100000000")
    public String txinIssuVat;
    
    @ApiModelProperty(value = "세금계산서발행품목명", required=false, example = "a1234")
    public String txinIssuItmName;
    
    @ApiModelProperty(value = "과세구분코드", required=false, example = "012")
    public String txtnDvsnCode;
    
    @ApiModelProperty(value = "주문ID", required=false, example = "012")
    public String ordrId;
    
    @ApiModelProperty(value = "오류여부", required=false, example = "N")
    public String errYsno;
    
    @ApiModelProperty(value = "오류내용", required=false, example = "오류테스트")
    public String errCntt; 
    
    @ApiModelProperty(value = "생성자ID", required=false, example = "a1234")
    public String crtr_id; 
    
    @ApiModelProperty(value = "생성일시", required=false, example = "20220101")
    public String cretDttm; 
    
    @ApiModelProperty(value = "수정자ID", required=false, example = "b1234")
    public String amnrId; 
    
    @ApiModelProperty(value = "수정일시", required=false, example = "20220102")
    public String amnd_dttm; 
    
    @ApiModelProperty(value = "삭제여부", required=false, example = "N")
    public String dlt_ysno; 
    
    
    @ApiModelProperty(value="세금계산서 목록", required=false)
    private List<TaxbillMaster> taxBillList;
    
    /*
     * @ApiModelProperty(value = "수정자ID", required=false, example = "b1234") public String amnrId;
     */
    
    
    
    
    
}
