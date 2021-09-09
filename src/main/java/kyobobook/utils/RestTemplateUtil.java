/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 9. 6.   First Draft.
 *
 ****************************************************/
package kyobobook.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @Project     : common-prototype-api
 * @FileName    : RestTemplateUtil.java
 * @Date        : 2021. 9. 6.
 * @author      : smlee1@kyobobook.com
 * @description : RestTemplate 를 호출하기 위한 Util 클래스.
 */
@Component
public class RestTemplateUtil {

private final RestTemplate restTemplate;
    
    @Autowired
    public RestTemplateUtil(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    
    /**
     * @Method      : send
     * @Date        : 2021. 9. 6.
     * @author      : smlee1@kyobobook.com
     * @description : Rest Api 호출 
     * @param url
     * @param httpMethod
     * @param httpHeaders
     * @param bodyObject
     * @param responseType
     * @return
     */
    public ResponseEntity<?> send(String url, HttpMethod httpMethod, HttpHeaders httpHeaders, Object bodyObject,
            Class<?> responseType) {
        HttpEntity<Object> reqEntity = new HttpEntity<>(bodyObject, httpHeaders);
        ResponseEntity<?> resEntity = restTemplate.exchange(url
                , httpMethod
                , reqEntity
                , responseType);
        
        return resEntity;
    }
}
