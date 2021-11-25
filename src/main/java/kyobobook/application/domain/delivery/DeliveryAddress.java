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

import io.swagger.annotations.ApiModelProperty;
import kyobobook.application.adapter.out.persistence.delivery.entity.TSoDlvrAddrMInsertEntity;
import kyobobook.common.Constants;
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

    /** 회원아이디 */
    @ApiModelProperty(hidden = true)
    private String mmbrId;
    /** 회원번호 */
    @ApiModelProperty(hidden = true)
    private String mmbrNum;
    /** 배송지순번 */
    private Integer dlpnSrmb = 0;
    /** 배송지명 */
    @ApiModelProperty(example = "시그니엘")
    private String name;
    /** 배송지별칭명 */
    @ApiModelProperty(example = "잠실별장")
    private String alias;
    /** 전화번호 */
    @ApiModelProperty(example = "02-7777-7777")
    private String telephone;
    /** 휴대전화번호 */
    @ApiModelProperty(example = "010-7777-7777")
    private String cellphone;
    /** 우편번호 */
    @ApiModelProperty(example = "777200")
    private String zipcode;
    /** 기본주소 */
    @ApiModelProperty(example = "서울 송파구 올림픽로300")
    private String basicAddress;
    /** 상세주소 */
    @ApiModelProperty(example = "꼭대기")
    private String detailAddress;
    /** 기본배송지여부 */
    @ApiModelProperty(example = "true")
    private boolean defaultAddress;
    private String bscDlpnYsno;
    /** 삭제여부 */
    @ApiModelProperty(example = "false")
    private boolean removeAddress;

    /**
     * @Method : convertToInsertEntity
     * @Date : 2021. 11. 24.
     * @author : kimsehoon@kyobobook.com
     * @description : TSoDlvrAddrM 테이블 Insert용 Entity로 변환
     * @return
     */
    public TSoDlvrAddrMInsertEntity convertToInsertEntity() {

        return TSoDlvrAddrMInsertEntity.builder().mmbrId(this.getMmbrId()).mmbrNum(this.getMmbrNum()).dlpnSrmb(this.getDlpnSrmb())
                .dlpnName(this.getName()).dlpnAtnmName(this.getAlias()).tlnm(this.getTelephone())
                .cphnTlnm(this.getCellphone()).pssrNum(this.getZipcode()).bscAdrs(this.getBasicAddress())
                .dtlAdrs(this.getDetailAddress()).bscDlpnYsno(this.isDefaultAddress() ? Constants.YES : Constants.NO)
                .dltYsno(this.isRemoveAddress() ? Constants.YES : Constants.NO).build();

    }

}
