/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * seohee.ko@kyobobook.com      2021. 11. 9.
 *
 ****************************************************/
package kyobobook.application.domain.cart;

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
 * @FileName : TestCart.java
 * @Date : 2021. 11. 9.
 * @author : seohee.ko@kyobobook.com
 * @description : 장바구니
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "장바구니")
public class Cart {

    /** 장바구니ID */
    @ApiModelProperty(required = true, value = "장바구니ID", example = "B19055055A03")
    private String spbkId;
    /** 장바구니구분코드 */
    @ApiModelProperty(required = true, value = "장바구니구분코드", example = "2")
    private String spbkDvsnCode;
    /** 장바구니종류코드 */
    @ApiModelProperty(required = true, value = "장바구니종류코드", example = "10")
    private String spbkKindCode;
    /** 판매상품id */
    @ApiModelProperty(required = true, value = "판매상품id", example = "C160000284150")
    private String saleCmdtid;
    /** 단위품목순번 */
    @ApiModelProperty(required = true, value = "단위품목순번", example = "1")
    private BigInteger untItmSrmb;
    /** 회원번호 */
    @ApiModelProperty(required = true, value = "회원번호", example = "")
    private String mmbrNum;
    /** 임시회원번호 */
    @ApiModelProperty(required = true, value = "임시회원번호", example = "")
    private String tmprMmbrNum;
    /** 요청수량 */
    @ApiModelProperty(required = true, value = "요청수량", example = "2")
    private BigInteger requQntt;
    /** 종료일시 */
    @ApiModelProperty(required = true, value = "종료일시", example = "2022-01-06 14:31")
    private LocalDateTime endDttm;
    /** 회원여부 */
    @ApiModelProperty(required = true, value = "회원여부", example = "")
    private String mmbrYsno;
    /** 사은품여부 */
    @ApiModelProperty(required = true, value = "사은품여부", example = "Y")
    private String frbeYsno;
    /** 본판매상품id */
    @ApiModelProperty(required = true, value = "본판매상품id", example = "C160000284150")
    private String orglSaleCmdtid;
    /** 바로드림지점코드 */
    @ApiModelProperty(required = true, value = "바로드림지점코드", example = "BARO001")
    private String brdrBranCode;
    /** 링크구분코드 */
    @ApiModelProperty(required = true, value = "링크구분코드", example = "LGB001")
    private String linkDvsnCode;
    /** 상품분류코드 */
    @ApiModelProperty(required = true, value = "상품분류코드", example = "PGB001")
    private String cmdtClstCode;
    /** 섹션코드 */
    @ApiModelProperty(required = true, value = "섹션코드", example = "S001")
    private String sctnCode;
    /** 체크여부 */
    @ApiModelProperty(required = true, value = "체크여부", example = "Y")
    private String chekYsno;
    /** 부가주문내용 */
    @ApiModelProperty(required = true, value = "부가주문내용", example = "없음")
    private String addtOrdrCntt;
    /** 인쇄내용 */
    @ApiModelProperty(required = true, value = "인쇄내용", example = "행복하세요")
    private String prinCntt;
    /** 결합판매상품id */
    @ApiModelProperty(required = true, value = "결합판매상품id", example = "C160000284151")
    private String combSaleCmdtid;
    /** 생성자id */
    @ApiModelProperty(required = true, value = "생성자id", example = "")
    private String crtrId;
    /** 생성일시 */
    @ApiModelProperty(required = true, value = "생성일시", example = "")
    private LocalDateTime cretDttm;
    /** 수정자id */
    @ApiModelProperty(required = true, value = "수정자id", example = "")
    private String amnrId;
    /** 수정일시 */
    @ApiModelProperty(required = true, value = "수정일시", example = "")
    private LocalDateTime amndDttm;
    /** 삭제여부 */
    @ApiModelProperty(required = true, value = "삭제여부", example = "")
    private String dltYsno;

    private String spbkKindName;

    private String chkVal;
    // private String[] unfyCmdtIdList;
}
