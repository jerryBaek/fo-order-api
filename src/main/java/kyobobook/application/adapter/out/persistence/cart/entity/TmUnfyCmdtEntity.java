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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project : fo-order-api
 * @FileName : TmUnfyCmdtEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SO_통합상품
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TmUnfyCmdtEntity {

    /** 통합상품ID */
    private String unfyCmdtId;

    /** 업체ID */
    private String entsId;

    /** 온라인상품구분코드 */
    private String onlnCmdtDvsnCode;

    /** 상품코드 */
    private String cmdtCode;

    /** 조코드 */
    private String joCode;

    /** ISBN */
    private String isbn;

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

    /** 상품명 */
    private String cmdtName;

    /** 상품상태코드 */
    private String cmdtCdtnCode;

    /** 소득공제대상여부 */
    private String incmDdctTrgtYsno;

    /** 도서정가제여부 */
    private String fbpYsno;

    /** 할인쿠폰적용여부 */
    private String dscnCpnAplYsno;

    /** 무료배송여부 */
    private String freeDlvrYsno;

    /** 판매제한여부 */
    private String saleLmttYsno;

    /** 판매금지여부 */
    private String salePrhbYsno;

    /** 과세구분코드 */
    private String txtnDvsnCode;

    /** 화폐단위코드 */
    private String curnUntCode;

    /** 정가 */
    private BigInteger prce;

    /** 할인율 */
    private BigInteger dscnRate;

    /** 할인금액 */
    private BigInteger dscnAmnt;

    /** 적립율 */
    private BigInteger acmlRate;

    /** 적립금액 */
    private BigInteger acmlAmnt;

}
