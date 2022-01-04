/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 9. 23.  First Draft.
 *
 ****************************************************/
package kyobobook.config.redis;

import java.time.Duration;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

/**
 * @Project     : fo-order-api
 * @FileName    : RedisConfig.java
 * @Date        : 2021. 9. 23.
 * @author      : smlee1@kyobobook.com
 * @description : Resis Configuration
 */
// TODO On-Prem에서 방화벽 문제로 인해 비활성화. 향후 캐시사용 시 활성화 필요
//@EnableCaching
//@Configuration
public class RedisConfig {

//    @Bean
    public RedisConnectionFactory redisConnectionFactory(RedisProperties props) {

        RedisStandaloneConfiguration redisConfig = new RedisStandaloneConfiguration();
        redisConfig.setHostName(props.getHost());
        redisConfig.setPort(props.getPort());
        redisConfig.setPassword(props.getPassword());
        redisConfig.setUsername(props.getUsername());

        LettuceClientConfiguration lettuceClientConfiguration = LettuceClientConfiguration.builder()
                .useSsl().disablePeerVerification().and()
                .commandTimeout(Duration.ofSeconds(2))
                .shutdownTimeout(Duration.ZERO)
                .build();
        LettuceConnectionFactory connectionFactory = new LettuceConnectionFactory(redisConfig, lettuceClientConfiguration);

        return connectionFactory;
    }
}