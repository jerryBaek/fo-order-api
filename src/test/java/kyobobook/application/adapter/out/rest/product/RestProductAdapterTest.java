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
package kyobobook.application.adapter.out.rest.product;

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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.product.ProductAuthor;
import kyobobook.application.stub.ProductAuthorStub;
import kyobobook.config.message.MessageConfig;
import kyobobook.utils.RestTemplateUtil;

/**
 * @Project     : common-prototype-api
 * @FileName    : RestProductAdapterTest.java
 * @Date        : 2021. 9. 27.
 * @author      : sykim@kyobobook.com
 * @description :
 */
@SpringBootTest(classes = MessageConfig.class)
class RestProductAdapterTest {
    
    @Value("${resource.common-prototype-sub-author-api.url}")
    String authorApiUrl;
    
    private RestProductAdapter restProductAdapter;
    
    @SpyBean
    private MessageSourceAccessor messageSource;
    
    @MockBean
    private RestTemplateUtil restTemplateUtil;
    
    @BeforeEach
    void init() {
        
        restProductAdapter = new RestProductAdapter(restTemplateUtil);
        restProductAdapter.authorApiUrl = this.authorApiUrl;
    }

    /**
     * Test method for {@link kyobobook.application.adapter.out.rest.product.RestProductAdapter#selectAuthors()}.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Test
    @DisplayName("RestProductAdapter :: SelectAuthors()")
    void testSelectAuthors() {
        
        String url = authorApiUrl + "/author/product/authors";
        
        // given
        ResponseMessage productAuthors = ResponseMessage.builder()
                .data(ProductAuthorStub.getProductAuthors())
                .statusCode(HttpStatus.OK.value())
                .resultMessage(messageSource.getMessage("common.process.complete"))
                .build();
        
        // when
        when(restTemplateUtil.send(url, HttpMethod.GET, new HttpHeaders(), null, ResponseMessage.class)).thenReturn(new ResponseEntity(productAuthors, new HttpHeaders(), HttpStatus.OK));
        
        // then
        ResponseMessage responseMessage = restProductAdapter.selectProductAuthors();
        verify(restTemplateUtil, times(1)).send(url, HttpMethod.GET, new HttpHeaders(), null, ResponseMessage.class);
        
        assertAll(
                () -> assertNotNull(responseMessage),
                () -> assertNotNull(responseMessage.getData()),
                () -> assertEquals(HttpStatus.OK.value(), responseMessage.getStatusCode()),
                () -> assertEquals(messageSource.getMessage("common.process.complete"), responseMessage.getResultMessage()),
                () -> assertThat((List<ProductAuthor>) responseMessage.getData()).containsExactlyElementsOf(ProductAuthorStub.getProductAuthors())
                );
        
    }

}
