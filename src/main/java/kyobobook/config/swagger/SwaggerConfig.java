/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 8. 12.  First Draft
 *
 ****************************************************/
package kyobobook.config.swagger;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kyobobook.common.Constants;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Project     : fo-order-api
 * @FileName    : SwaggerConfig.java
 * @Date        : 2021. 8. 12.
 * @author      : smlee1@kyobobook.com
 * @description : Swagger 사용하기 위한 Configuration
 */
@Configuration
public class SwaggerConfig {

    /** 탐색 경로 */
    private final String SWAGGER_SCAN_PACKAGE = "kyobobook.application.adapter";

    /** 제목 */
    private final String TITLE = "주문";

    @Bean
    public Docket apiV1() {
        String docVersion = "v1";
        String docTitle = this.TITLE.concat(Constants.SPACE).concat(docVersion);

        return new Docket(DocumentationType.SWAGGER_2)
                .consumes(getConsumeContentTypes())
                .produces(getProduceContentTypes())
                .groupName(docVersion)
                .apiInfo(getApiInfo(docTitle, docVersion))
                .select()
                .apis(RequestHandlerSelectors.basePackage(SWAGGER_SCAN_PACKAGE))
                .paths(PathSelectors.ant("/ord/api/" + docVersion + "/**"))
                .build();
    }

    @Bean
    public Docket apiV2() {
        String docVersion = "v2";
        String docTitle = this.TITLE.concat(Constants.SPACE).concat(docVersion);

        return new Docket(DocumentationType.SWAGGER_2)
                .consumes(getConsumeContentTypes())
                .produces(getProduceContentTypes())
                .groupName(docVersion)
                .apiInfo(getApiInfo(docTitle, docVersion))
                .select()
                .apis(RequestHandlerSelectors.basePackage(SWAGGER_SCAN_PACKAGE))
                .paths(PathSelectors.ant("/ord/api/" + docVersion + "/**"))
                .build();
    }

    private ApiInfo getApiInfo(String title, String version) {
        return new ApiInfoBuilder()
                .title(title)
                .description("주문 API " + version)
                .version(version)
                .build();
    }

    private Set<String> getConsumeContentTypes() {
        Set<String> consumes = new HashSet<>();
        consumes.add("application/json;charset=UTF-8");
        consumes.add("application/x-www-form-urlencoded");
        return consumes;
    }

    private Set<String> getProduceContentTypes() {
        Set<String> produces = new HashSet<>();
        produces.add("application/json;charset=UTF-8");
        return produces;
    }

}
