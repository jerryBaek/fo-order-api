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
package kyobobook.application.adapter.in.controller;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import kyobobook.application.biz.common.port.in.CustomEventLogPort;
import kyobobook.application.biz.product.port.in.ProductPort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.stub.ProductStub;
import kyobobook.config.message.MessageConfig;

/**
 * @Project     : common-prototype-api
 * @FileName    : RestSampleProductControllerTest.java
 * @Date        : 2021. 9. 27.
 * @author      : sykim@kyobobook.com
 * @description :
 */
@WebMvcTest(value = {RestSampleProductController.class, MessageConfig.class})
class RestSampleProductControllerTest {
    
    @Autowired
    private MockMvc mockMvc;
    
    @SpyBean
    private MessageSourceAccessor messageSource;
    
    @MockBean
    private ProductPort productPort;
    
    @MockBean
    private CustomEventLogPort customEventLogPort;
    
    
    private String requestUrl;

    /**
     * Test method for {@link kyobobook.application.adapter.in.controller.RestSampleProductController#selectProducts(java.util.Optional)}.
     * @throws Exception 
     */
    @Test
    @DisplayName("RestSampleProductController :: SelectProducts() :: cache-false")
    void testSelectProducts() throws Exception {
        
        // given
        requestUrl = "/product/products";
        ResponseMessage responseMessage = ResponseMessage.builder()
              .data(ProductStub.getProducts())
              .statusCode(HttpStatus.OK.value())
              .resultMessage(messageSource.getMessage("common.process.complete"))
              .build();
        
        // when
        when(productPort.selectProducts(false)).thenReturn(responseMessage);
 
        // then
        this.mockMvc.perform(get(requestUrl)
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.data").isArray())
        .andExpect(jsonPath("$.resultMessage").value(equalTo(messageSource.getMessage("common.process.complete"))))
        .andExpect(jsonPath("$.data[0].cmdt_id").value(ProductStub.getProducts().get(0).getCmdt_id()))
        .andExpect(jsonPath("$.data[1].sbtt_name1").value(ProductStub.getProducts().get(1).getSbtt_name1()))
        .andDo(print())
        .andReturn();
        
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(customEventLogPort, times(1)).insertEventLog(captor.capture());
        
    }

}
