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
package kyobobook.application.adapter.out.persistence.product;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import kyobobook.application.biz.common.port.out.CustomEventLogOutPort;
import kyobobook.application.domain.product.Product;
import kyobobook.application.stub.ProductEntityStub;
import kyobobook.application.stub.ProductStub;
import kyobobook.config.message.MessageConfig;

/**
 * @Project     : common-prototype-api
 * @FileName    : ProductPersistenceAdapterTest.java
 * @Date        : 2021. 9. 27.
 * @author      : sykim@kyobobook.com
 * @description :
 */
@SpringBootTest(classes = MessageConfig.class)
class ProductPersistenceAdapterTest {
    
    private ProductPersistenceAdapter productPersistenceAdapter;
    
    @MockBean
    private ProductWriterMapper productWriterMapper;
    
    @MockBean
    private ProductReaderMapper productReaderMapper;
    
    @MockBean
    private CustomEventLogOutPort customEventLogOtuPort;
    
    @BeforeEach
    void init() {
        
        productPersistenceAdapter = new ProductPersistenceAdapter(productWriterMapper
                , productReaderMapper
                , customEventLogOtuPort);
    }
    
    /**
     * Test method for {@link kyobobook.application.adapter.out.persistence.product.ProductPersistenceAdapter#selectProducts()}.
     * @throws Exception 
     */
    @Test
    @DisplayName("ProductPersistenceAdapter :: SelectProducts() :: cache-false")
    void testSelectProducts() throws Exception {
        
        // when
        when(productReaderMapper.selectProducts()).thenReturn(ProductEntityStub.getProductEntities());
        
        // then
        List<Product> products = productPersistenceAdapter.selectProducts();
        
        verify(productReaderMapper, times(1)).selectProducts();
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(customEventLogOtuPort, times(1)).insertEventLog(captor.capture());
        
        assertAll(
                () -> assertNotNull(products),
                () -> assertThat(products).containsExactlyElementsOf(ProductStub.getProductEntitiesToProducts())
                );
    }

}
