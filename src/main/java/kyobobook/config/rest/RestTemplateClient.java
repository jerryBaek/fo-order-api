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
package kyobobook.config.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Project     : common-prototype-api
 * @FileName    : RestTemplateClient.java
 * @Date        : 2021. 8. 17.
 * @author      : smlee1@kyobobook.com
 * @description : RestTemplate 생성 Configuration
 */
@Configuration
public class RestTemplateClient {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
