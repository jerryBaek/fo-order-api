/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com      2021. 9. 15.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.user.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Project     : common-prototype-api
 * @FileName    : UserRoleEntity.java
 * @Date        : 2021. 9. 15.
 * @author      : smlee1@kyobobook.com
 * @description :
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleEntity {
    private int seq;
    private String id;
    private String name;
}
