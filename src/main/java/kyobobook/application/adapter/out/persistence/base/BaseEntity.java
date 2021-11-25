/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * kimsehoon@kyobobook.com      2021. 11. 15.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Project : fo-order-api
 * @FileName : BasePagination.java
 * @Date : 2021. 11. 15.
 * @author : kimsehoon@kyobobook.com
 * @description : 페이지 기반 객체
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity {

    /** 생성자ID */
    public String crtrId;

    /** 수정자ID */
    public String amnrId;

}
