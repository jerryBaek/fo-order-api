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
package kyobobook.application.adapter.out.persistence.cart.entity;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project : fo-order-api
 * @FileName : TmSpbkEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SO_장바구니
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TmSpbkEntity {

    /** 장바구니ID */
    private String spbkId;

    /** 장바구니구분코드 */
    private String spbkDvsnCode;

    /** 장바구니종류코드 */
    private String spbkKindCode;

    /** 통합상품ID */
    private String unfyCmdtId;

    /** 회원번호 */
    private String mmbrNum;

    /** 임시회원번호 */
    private String tmprMmbrNum;

    /** 요청수량 */
    private BigInteger requQntt;

    /** 종료일시 */
    private LocalDateTime endDttm;

    /** 회원여부 */
    private String mmbrYsno;

    /** 사은품여부 */
    private String frbeYsno;

    /** 본통합상품ID */
    private String orglUnfyCmdtId;

    /** 바로드림지점코드 */
    private String brdrBranCode;

    /** 링크구분코드 */
    private String linkDvsnCode;

    /** 조코드 */
    private String joCode;

    /** 섹션코드 */
    private String sctnCode;

    /** 체크여부 */
    private String chekYsno;

    /** 부가주문내용 */
    private String addtOrdrCntt;

    /** 인쇄내용 */
    private String prinCntt;

    /** 생성자ID */
    private String crtrId;

    /** 생성일시 */
    private LocalDateTime cretDttm;

    /** 수정자ID */
    private String amnrId;

    /** 수정일시 */
    private LocalDateTime amndDttm;

    /** 삭제여부 */
    private String dltYsno;

    /** 단위품목순번 */
    private BigInteger untItmSrmb;
    
    private String chkVal;
    private String[] unfyCmdtIdList;
    private ArrayList<HashMap<String, Object>> spbkIdList;

}
