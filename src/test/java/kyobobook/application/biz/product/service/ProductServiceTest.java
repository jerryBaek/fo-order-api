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
package kyobobook.application.biz.product.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;

import kyobobook.application.biz.product.port.out.ProductGrpcPort;
import kyobobook.application.biz.product.port.out.ProductOutPort;
import kyobobook.application.biz.product.port.out.ProductPersistencePort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.product.Product;
import kyobobook.application.stub.ProductAuthorStub;
import kyobobook.application.stub.ProductStub;
import kyobobook.config.message.MessageConfig;

/**
 * @Project     : common-prototype-api
 * @FileName    : ProductServiceTest.java
 * @Date        : 2021. 9. 27.
 * @author      : sykim@kyobobook.com
 * @description :
 */
@SpringBootTest(classes = MessageConfig.class)
class ProductServiceTest {
    
    private ProductService productService;
    
    @SpyBean
    private MessageSourceAccessor messageSource;
    
    @MockBean
    @Qualifier("productPersistenceRepository")
    private ProductPersistencePort productPersistencePort;
    
    @MockBean
    @Qualifier("productCachePersistenceRepository")
    private ProductPersistencePort productCachePersistencePort;
    
    @MockBean
    @Qualifier("grpcProductAdapter")
    private ProductGrpcPort productGrpcPort;

    @MockBean
    @Qualifier("restProductAdapter")
    private ProductOutPort productOutPort;
    
    
    @BeforeEach
    void init() {
        
        productService = new ProductService(productPersistencePort
                , productCachePersistencePort
                , productGrpcPort
                , productOutPort
                , messageSource);
    }
    
    /**
     * Test method for {@link kyobobook.application.biz.product.service.ProductService#selectProducts(boolean)}.
     * @throws Exception 
     */
    @SuppressWarnings("unchecked")
    @Test
    @DisplayName("ProductService :: SelectProducts() :: cache-false")
    void testSelectProducts() throws Exception {
        
        // given
        ResponseMessage productAuthors = ResponseMessage.builder()
                .data(ProductAuthorStub.getProductAuthors())
                .statusCode(HttpStatus.OK.value())
                .resultMessage(messageSource.getMessage("common.process.complete"))
                .build();
        // when
        when(productPersistencePort.selectProducts()).thenReturn(ProductStub.getProducts());
        when(productOutPort.selectProductAuthors()).thenReturn(productAuthors);
        
        // then
        ResponseMessage responseMessage = productService.selectProducts(false);
        
        verify(productPersistencePort, times(1)).selectProducts();
        verify(productOutPort, times(1)).selectProductAuthors();
        
        assertAll(
                () -> assertNotNull(responseMessage),
                () -> assertNotNull(responseMessage.getData()),
                () -> assertEquals(HttpStatus.OK.value(), responseMessage.getStatusCode()),
                () -> assertEquals(messageSource.getMessage("common.process.complete"), responseMessage.getResultMessage()),
                () -> assertThat((List<Product>) responseMessage.getData()).containsExactlyElementsOf(ProductStub.getProducts())
                );
    }

}
