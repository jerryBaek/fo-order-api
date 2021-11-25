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
package kyobobook.application.adapter.out.persistence.delivery.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project : fo-order-api
 * @FileName : TSoDlvrAddrMEntity.java
 * @Date : 2021. 11. 19.
 * @author : kimsehoon@kyobobook.com
 * @description : SO_배송주소록기본
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TSoDlvrAddrMInsertEntity extends TSoDlvrAddrMEntity {

    /** 최대등록가능갯수 */
    public static final Integer MAX_INSERT_COUNT = 10;

    /** 회원ID */
    private String mmbrId;

}
