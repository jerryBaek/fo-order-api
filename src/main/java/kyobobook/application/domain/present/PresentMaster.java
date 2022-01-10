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
 * @FileName : PresentMaster.java
 * @since    : 2022. 01. 07.
 * @author   : jhbaek@kyobobook.com
 * @implNote : 선물 마스터 Domain
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "선물 마스터 도메인")
public class PresentMaster {

    @ApiModelProperty(value = "주문ID", example = "A123f332939f")
    public String ordrId;
    
    @ApiModelProperty(value = "주문순번", example = "00011")
    public String ordrSrmb;
    
    @ApiModelProperty(value = "주문종류코드", required=false, example = "034")
    public String ordrKindCode;
    
    @ApiModelProperty(value = "온라인주문구분코드", required=false, example = "B01")
    public String onlnOrdrDvsnCode;  
    
    @ApiModelProperty(value = "취소원주문순번", required=false, example = "00023")
    public String cnclOrigOrdrSrmb;  
    
    @ApiModelProperty(value = "주문일자", required=false, example = "20220107")
    public String ordrDate;  
    
    @ApiModelProperty(value = "주문시각", required=false, example = "142532")
    public String ordrHms; 
    
    @ApiModelProperty(value = "결제완료일자", required=false, example = "20220105")
    public String stlmFnshDate;
    
    @ApiModelProperty(value = "결제완료시각", required=false, example = "071451")
    public String stlmFnshHms;
    
    @ApiModelProperty(value = "회원주문여부", required=false, example = "Y")
    public String mmbrOrdrYsno;
    
    @ApiModelProperty(value = "주문비밀번호", required=false, example = "F##DDfdf3D!11420Z03lf06")
    public String ordrSertnum; 
    
    @ApiModelProperty(value = "노출여부", required=false, example = "N")
    public String exprYsno; 
    
    @ApiModelProperty(value = "회원번호", required=false, example = "01132345311")
    public String mmbrNum;  
    
    @ApiModelProperty(value = "회원등급코드", required=false, example = "AA2")
    public String mmbrGrdCode; 
    
    @ApiModelProperty(value = "주문자명", required=false, example = "홍길동")
    public String aordName; 
    
    @ApiModelProperty(value = "주문자이메일주소", required=false, example = "honggildong@kyobobook.com")
    public String aordEmlAdrs; 
    
    @ApiModelProperty(value = "주문자휴대전화번호", required=false, example = "01011119999")
    public String aordPrtbTlnm;  
    
    @ApiModelProperty(value = "주문자IP주소", required=false, example = "127.111.111.123")
    public String aordIpAdrs; 

    @ApiModelProperty(value = "SMS수신여부", required=false, example = "Y")
    public String smsRcmsYsno; 
    
    @ApiModelProperty(value = "이메일수신여부", required=false, example = "Y")
    public String emlRcmsYsno; 

    @ApiModelProperty(value = "링크구분코드", required=false, example = "003")
    public String linkDvsnCode; 

    @ApiModelProperty(value = "통합주문채널코드", required=false, example = "B03")
    public String unfyOrdrChnlCode; 

    @ApiModelProperty(value = "통합주문상세채널코드", required=false, example = "331")
    public String unfyOrdrDtlChnlCode; 

    @ApiModelProperty(value = "주문처리결과코드", required=false, example = "Q91")
    public String ordrProsRsltCode; 

    @ApiModelProperty(value = "주문처리결과메모내용", required=false, example = "주문처리결과메모내용test")
    public String ordrProsRsltMemoCntt; 
    
    @ApiModelProperty(value = "단수배송여부", required=false, example = "N")
    public String nmsrDlvrYsno; 
    
    @ApiModelProperty(value = "환불방법요청코드", required=false, example = "C04")
    public String rfnmMthdRequCode; 

    @ApiModelProperty(value = "클레임신청사유코드", required=false, example = "W03")
    public String clmAplnRsnCode; 

    @ApiModelProperty(value = "클레임신청사유", required=false, example = "클레임신청사유Test")
    public String clmAplnRsn; 
    
    @ApiModelProperty(value = "첨부파일번호", required=false, example = "file01356")
    public String atacFileNum; 
    
    @ApiModelProperty(value = "착한배송선택여부", required=false, example = "Y")
    public String gddlSlctYsno; 
    
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
    
    @ApiModelProperty(value = "주문상품순번", example = "Y")
    public String ordrCmdtSrmb; 
    
    @ApiModelProperty(value = "주문상품처리순번", example = "Y")
    public String ordrCmdtProsSrmb; 
    
    @ApiModelProperty(value = "매입처코드", required=false, example = "Y")
    public String vndrCode; 
    
    @ApiModelProperty(value = "판매상품ID", required=false, example = "Y")
    public String saleCmdtid; 
    
    @ApiModelProperty(value = "상품명", required=false, example = "Y")
    public String cmdtName; 
    
    @ApiModelProperty(value = "단위품목순번", required=false, example = "Y")
    public String untItmSrmb; 
    
    @ApiModelProperty(value = "단위품목명", required=false, example = "Y")
    public String untItmName; 
    
    @ApiModelProperty(value = "요청수량", required=false, example = "Y")
    public String requQntt; 
    
    @ApiModelProperty(value = "주문상품종류코드", required=false, example = "Y")
    public String ordrCmdtKindCode; 
    
    @ApiModelProperty(value = "발송예약일자", required=false, example = "Y")
    public String sndgPrenDate; 
    
    @ApiModelProperty(value = "결합판매상품ID", required=false, example = "Y")
    public String combSaleCmdtid; 
    
    @ApiModelProperty(value = "온라인주문상세구분코드", required=false, example = "Y")
    public String onlnOrdrDtlDvsnCode; 
    
    @ApiModelProperty(value = "주문진행상태코드", required=false, example = "Y")
    public String ordrPrgsCdtnCode; 
    
    @ApiModelProperty(value = "과세구분코드", required=false, example = "Y")
    public String txtnDvsnCode; 
    
    @ApiModelProperty(value = "상품정가금액", required=false, example = "Y")
    public String cmdtPrceAmnt; 
    
    @ApiModelProperty(value = "상품매출금액", required=false, example = "Y")
    public String cmdtSlsAmnt; 
    
    @ApiModelProperty(value = "단위품목매출금액", required=false, example = "Y")
    public String untItmSlsAmnt; 
    
    @ApiModelProperty(value = "상품분류코드", required=false, example = "Y")
    public String cmdtClstCode; 
    
    @ApiModelProperty(value = "섹션코드", required=false, example = "Y")
    public String sctnCode; 
    
    @ApiModelProperty(value = "무료배송상품여부", required=false, example = "Y")
    public String freeDlvrCmdtYsno; 
    
    @ApiModelProperty(value = "주문배송지ID", required=false, example = "Y")
    public String ordrDlpnId; 
    
    @ApiModelProperty(value = "주문선물수신대상ID", example = "Y")
    public String ordrGftRcmsTrgtId; 
    
    @ApiModelProperty(value = "주문선물수신대상순번", example = "Y")
    public String ordrGftRcmsTrgtSrmb; 
    
    @ApiModelProperty(value = "배송담당코드", required=false, example = "Y")
    public String dlvrRspbCode; 
    
    @ApiModelProperty(value = "배송형태코드", required=false, example = "Y")
    public String dlvrShpCode; 
    
    @ApiModelProperty(value = "배송형태상세코드", required=false, example = "Y")
    public String dlvrShpDtlCode; 
    
    @ApiModelProperty(value = "부가주문내용", required=false, example = "Y")
    public String addtOrdrCntt; 
    
    @ApiModelProperty(value = "도서정가제여부", required=false, example = "Y")
    public String fbpYsno; 
    
    @ApiModelProperty(value = "인쇄내용", required=false, example = "Y")
    public String prinCntt; 
    
    @ApiModelProperty(value = "예약상품여부", required=false, example = "Y")
    public String prenCmdtYsno; 
    
    @ApiModelProperty(value = "수신자회원번호", required=false, example = "Y")
    public String recvMmbrNum; 
    
    @ApiModelProperty(value = "수신자명", required=false, example = "Y")
    public String recvName; 
    
    @ApiModelProperty(value = "연락처유형코드", required=false, example = "Y")
    public String cnplPatrCode; 
    
    @ApiModelProperty(value = "연락처유형내용", required=false, example = "Y")
    public String cnplPatrCntt; 
    
    @ApiModelProperty(value = "선물상태코드", required=false, example = "Y")
    public String gftCdtnCode; 
    
    @ApiModelProperty(value = "선물수신일자", required=false, example = "Y")
    public String gftRcmsDate; 
    
    @ApiModelProperty(value = "선물수신시각", required=false, example = "Y")
    public String gftRcmsHms; 
    

}
