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

import kyobobook.application.domain.product.ProductAuthor;

/**
 * @Project     : common-prototype-api
 * @FileName    : ProductAuthorStub.java
 * @Date        : 2021. 9. 27.
 * @author      : sykim@kyobobook.com
 * @description :
 */
public class ProductAuthorStub {
    
    public static ProductAuthor getProductAuthor(String id) {
        
        List<ProductAuthor> productAuthors = getProductAuthors();
        
        String cmdt_id = StringUtils.hasText(id) ? id : "1111111100001";
        
        ProductAuthor productAuthor = productAuthors.stream().filter(p -> p.getCmdt_id().equalsIgnoreCase(cmdt_id)).findFirst().get();    
        
        return productAuthor;

    }
    
    public static List<ProductAuthor> getProductAuthors() {
        
        List<ProductAuthor> productAuthors = new ArrayList<>();
        
        for(int i = 1; i < 5 ; i++) {
            
            ProductAuthor productAuthor = ProductAuthor.builder()
                    .cmdt_id("111111110000" + i)
                    .autr_code1("123450000" + i)
                    .autr_name1("Author1-" + i)
                    .autr_code2("234560000" + i)
                    .autr_name2("Author2-" + i)
                    .autr_code3("345670000" + i)
                    .autr_name3("Author3-" + i)
                    .build();
            
            productAuthors.add(productAuthor);
            
        }
        
        return productAuthors;
    }
    

}
