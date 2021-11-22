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
 * @FileName : TsSndgNotiEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : [1단계표준]SH_발송예고
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TsSndgNotiEntity {

    /** 주문ID */
    private String ordrId;

    /** 주문순번 */
    private BigInteger ordrSrmb;

    /** 주문상품순번 */
    private BigInteger ordrCmdtSrmb;

    /** 주문상품처리순번 */
    private BigInteger ordrCmdtProsSrmb;

    /** 온라인상품구분코드 */
    private String onlnCmdtDvsnCode;

    /** 주문일자 */
    private String ordrDate;

    /** 입금일자 */
    private String destDate;

    /** 발송예정기간 */
    private BigInteger sndgSchdPrd;

    /** 발송예정일자 */
    private String sndgSchdDate;

    /** 수령예정일자 */
    private String rcptSchdDate;

    /** 발송일자 */
    private String sndgDate;

    /** 수령일자 */
    private String rcptDate;

    /** 픽업일자 */
    private LocalDateTime pckpDate;

    /** 물류발송예정일자 */
    private String phdsSndgSchdDate;

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

}
