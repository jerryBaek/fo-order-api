/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * sykim@kyobobook.com      2021. 8. 27.
 *
 ****************************************************/
package kyobobook.application.adapter.out.persistence.product.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Project     : common-prototype-api
 * @FileName    : ProductEntity.java
 * @Date        : 2021. 8. 31.
 * @author      : sykim@kyobobook.com
 * @description : Product 정보와 1:1 매핑 되는 Entity
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {
    
    private String cmdt_id;
    private String cmdt_name;
    private String sbtt_name1;
    private String rlse_date;
    private String cmdt_code;
    
    private int wncr_prce;
}
