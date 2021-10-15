/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * sykim@kyobobook.com      2021. 9. 12.
 *
 ****************************************************/
package kyobobook.application.adapter.out.rest.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import kyobobook.application.biz.product.port.out.ProductOutPort;
import kyobobook.application.domain.common.ResponseMessage;
import kyobobook.application.domain.product.ProductAuthor;
import kyobobook.utils.RestTemplateUtil;

/**
 * @Project     : common-prototype-api
 * @FileName    : RestProductAdapter.java
 * @Date        : 2021. 9. 12.
 * @author      : sykim@kyobobook.com
 * @description : TEC01-32 Service Mesh 연동 구성 : Rest Api를 통해서 sub api (author) 와 통신한다.
 */
@Service("restProductAdapter")
public class RestProductAdapter implements ProductOutPort {
    
    private static final Logger logger = LoggerFactory.getLogger(RestProductAdapter.class);
    
    @Value("${resource.common-prototype-sub-author-api.url}")
    String authorApiUrl;
    
    private final RestTemplateUtil restTemplateUtil;
    
    /**
     * Constructor
     * @param restTemplateUtil
     */
    public RestProductAdapter(RestTemplateUtil restTemplateUtil) {
        
        this.restTemplateUtil = restTemplateUtil;
    }

    @Override
    public ResponseMessage selectAuthors() {
        
        String url = authorApiUrl + "/author/authors";
        
        HttpHeaders httpHeaders = new HttpHeaders();
        ResponseEntity<?> responseEntity = restTemplateUtil.send(url, HttpMethod.GET, httpHeaders, null, ResponseMessage.class);
        
        logger.debug("##### selectAuthors() :: " + responseEntity.getBody());
        return (ResponseMessage) responseEntity.getBody();
    }

    @Override
    public ResponseMessage selectProductAuthors() {
        
        String url = authorApiUrl + "/author/product/authors";
        
        HttpHeaders httpHeaders = new HttpHeaders();
        ResponseEntity<?> responseEntity = restTemplateUtil.send(url, HttpMethod.GET, httpHeaders, null, ResponseMessage.class);
        
        logger.debug("##### selectProductAuthors() :: " + responseEntity.getBody());
        return (ResponseMessage) responseEntity.getBody();
    }

    @Override
    public ResponseMessage getProductAuthor(String cmdt_id) {
        
        String url = authorApiUrl + "/author/product/authors/" + cmdt_id;
        
        HttpHeaders httpHeaders = new HttpHeaders();
        ResponseEntity<?> responseEntity = restTemplateUtil.send(url, HttpMethod.GET, httpHeaders, null, ResponseMessage.class);
        
        logger.debug("##### getProductAuthor({}) :: {}", cmdt_id,responseEntity.getBody());
        return (ResponseMessage) responseEntity.getBody();
    }

    @Override
    public ResponseMessage insertProductAuthor(ProductAuthor productAuthor) {
        
        String url = authorApiUrl + "/author/product/authors";
        
        HttpHeaders httpHeaders = new HttpHeaders();
        ResponseEntity<?> responseEntity = restTemplateUtil.send(url, HttpMethod.POST, httpHeaders, productAuthor, ResponseMessage.class);
        
        logger.debug("##### insertProductAuthor(productAuthor) :: result :: {}", responseEntity.getBody());
        return (ResponseMessage) responseEntity.getBody();
    }

    @Override
    public ResponseMessage updateProductAuthor(ProductAuthor productAuthor) {
        
        String url = authorApiUrl + "/author/product/authors";
        
        HttpHeaders httpHeaders = new HttpHeaders();
        ResponseEntity<?> responseEntity = restTemplateUtil.send(url, HttpMethod.PUT, httpHeaders, productAuthor, ResponseMessage.class);
        
        logger.debug("##### insertProductAuthor(productAuthor) :: result :: {}", responseEntity.getBody());
        return (ResponseMessage) responseEntity.getBody();
    }

    @Override
    public ResponseMessage deleteProductAuthor(String cmdt_id) {
        
        String url = authorApiUrl + "/author/product/authors/" + cmdt_id;
        
        HttpHeaders httpHeaders = new HttpHeaders();
        ResponseEntity<?> responseEntity = restTemplateUtil.send(url, HttpMethod.DELETE, httpHeaders, null, ResponseMessage.class);
        
        logger.debug("##### deleteProductAuthor({}) :: {}", cmdt_id,responseEntity.getBody());
        return (ResponseMessage) responseEntity.getBody();
    }

}
