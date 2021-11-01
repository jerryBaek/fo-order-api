/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * sykim@kyobobook.com      2021. 9. 27.
 *
 ****************************************************/
package kyobobook.application.stub;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import kyobobook.application.adapter.out.persistence.product.entity.ProductEntity;

/**
 * @Project     : common-prototype-api
 * @FileName    : ProductEntityStub.java
 * @Date        : 2021. 9. 27.
 * @author      : sykim@kyobobook.com
 * @description :
 */
public class ProductEntityStub {
    
    public static ProductEntity getProductEntity(String id) {
        
        List<ProductEntity> productEntities = getProductEntities();
        
        String cmdt_id = StringUtils.hasText(id) ? id : "1111111100001";
        
        ProductEntity productEntity = productEntities.stream().filter(p -> p.getCmdtId().equalsIgnoreCase(cmdt_id)).findFirst().get();    
        
        return productEntity;
        
    }
    
    public static List<ProductEntity> getProductEntities() {
        
        List<ProductEntity> productEntities = new ArrayList<>();
        
        for(int i = 1; i < 5 ; i++) {
            
            ProductEntity productEntity = ProductEntity.builder()
                    .cmdtId("111111110000" + i)
                    .cmdtName("ITEM-000" + i)
                    .sbttName1("ITEM-SUB-000" + i)
                    .rlseDate("20211001")
                    .cmdtCode("222222220000" + i)
                    .build(); 
            
            productEntities.add(productEntity);
            
        }
        
        return productEntities;
    }
    
    

}
