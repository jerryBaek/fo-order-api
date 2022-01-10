/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 8. 17.  First Draft.
 *
 ****************************************************/
package kyobobook.config.mockup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kyobobook.component.mock.MockApiGenerator;
import kyobobook.component.mock.port.MockApiGeneratorPort;

/**
 * @Project     : fo-order-api
 * @FileName    : MockUpConfig.java
 * @Date        : 2022. 1. 10.
 * @author      : kimsehoon@kyobobook.com
 * @description :
 */
@Configuration
public class MockUpConfig {

    @Bean
    public MockApiGeneratorPort mockApiGeneratorPort() {
        return new MockApiGenerator();
    }
}
