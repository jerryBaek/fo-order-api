/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * kimsehoon@kyobobook.com      2021. 11. 24.
 *
 ****************************************************/
package kyobobook.application.domain.delivery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project : fo-order-api
 * @FileName : DeliveryAddress.java
 * @Date : 2021. 11. 24.
 * @author : kimsehoon@kyobobook.com
 * @description : 배송주소
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryAddress {

    /** 회원번호 */
    private String mmbrNum;
    /** 배송지명 */
    private String name;
    /** 배송지별칭명 */
    private String alias;
    /** 전화번호 */
    private String telephone;
    /** 휴대전화번호 */
    private String cellphone;
    /** 우편번호 */
    private String zipcode;
    /** 기본주소 */
    private String basicAddress;
    /** 상세주소 */
    private String detailAddress;
    /** 기본배송지여부 */
    private boolean isDefault;
    /** 삭제여부 */
    private boolean isRemove;

}
