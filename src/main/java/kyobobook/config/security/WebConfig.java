/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 8. 12.  First Draft.
 *
 ****************************************************/
package kyobobook.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Project     : common-prototype-api
 * @FileName    : WebConfig.java
 * @Date        : 2021. 8. 12.
 * @author      : smlee1@kyobobook.com
 * @description : WebMvc 관련 설정 파일
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    private final long MAX_AGE = 3600;
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("HEAD", "OPTIONS", "PATCH", "GET", "POST", "PUT", "DELETE")
                .maxAge(MAX_AGE);
    }
}
