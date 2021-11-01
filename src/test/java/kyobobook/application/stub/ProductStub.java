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

import kyobobook.application.domain.product.Product;

/**
 * @Project     : common-prototype-api
 * @FileName    : ProductStub.java
 * @Date        : 2021. 9. 27.
 * @author      : sykim@kyobobook.com
 * @description :
 */
public class ProductStub {
    
    public static Product getProduct(String id) {
        
        List<Product> products = getProducts();
        
        String cmdt_id = StringUtils.hasText(id) ? id : "1111111100001";
        
        Product product = products.stream().filter(p -> p.getCmdt_id().equalsIgnoreCase(cmdt_id)).findFirst().get();    
        
        return product;
    }
    
    public static List<Product> getProducts() {
        
        List<Product> products = new ArrayList<>();
        
        for(int i = 1; i < 5 ; i++) {
            
            Product product = Product.builder()
                    .cmdt_id("111111110000" + i)
                    .cmdt_name("ITEM-000" + i)
                    .sbtt_name1("ITEM-SUB-000" + i)
                    .rlse_date("20211001")
                    .cmdt_code("222222220000" + i)
                    .autr_code1("123450000" + i)
                    .autr_name1("Author1-" + i)
                    .autr_code2("234560000" + i)
                    .autr_name2("Author2-" + i)
                    .autr_code3("345670000" + i)
                    .autr_name3("Author3-" + i)
                    .wncr_prce(5000 * i)
                    .bkrv_cntt("출판사 서평 :: " + i)
                    .ctnt_cntt("목차 :: " + i)
                    .build(); 
            
            
            products.add(product);
            
        }
        
        return products;
    }
    
    public static List<Product> getProductEntitiesToProducts() {
        
        List<Product> products = new ArrayList<>();
        
        ProductEntityStub.getProductEntities().stream().forEach(entity -> {
            
            Product product = Product.builder()
                    .cmdt_id(entity.getCmdtId())
                    .cmdt_name(entity.getCmdtName())
                    .sbtt_name1(entity.getSbttName1())
                    .rlse_date(entity.getRlseDate())
                    .cmdt_code(entity.getCmdtCode())
                    .wncr_prce(entity.getWncrPrce())
                    .build();
            
            products.add(product);
        });
        
        return products;
        
    }

}
