/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * sykim@kyobobook.com      2021. 9. 2.
 *
 ****************************************************/
package kyobobook.config.redis;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @Project     : fo-order-api
 * @FileName    : CacheConfig.java
 * @Date        : 2021. 9. 2.
 * @author      : sykim@kyobobook.com
 * @description : Redis Cache 설정
 */
//TODO On-Prem에서 방화벽 문제로 인해 비활성화. 향후 캐시사용 시 활성화 필요
//@Configuration
public class CacheConfig {

    private final RedisConnectionFactory redisConnectionFactory;

// TODO On-Prem에서 방화벽 문제로 인해 비활성화. 향후 캐시사용 시 활성화 필요
//    @Value("${spring.cache.redis.time-to-live}")
    public long ttl;

    /**
     * Constructor
     * @param redisConnectionFactory
     */
    public CacheConfig(RedisConnectionFactory redisConnectionFactory) {
        this.redisConnectionFactory = redisConnectionFactory;
    }

// TODO On-Prem에서 방화벽 문제로 인해 비활성화. 향후 캐시사용 시 활성화 필요
//    @Bean
    public CacheManager redisCacheManager() {
        RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration
                .defaultCacheConfig()
                .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(new StringRedisSerializer()))
                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()))
                .entryTtl(Duration.ofSeconds(ttl));

        RedisCacheManager redisCacheManager = RedisCacheManager
                .RedisCacheManagerBuilder
                .fromConnectionFactory(redisConnectionFactory)
                .cacheDefaults(redisCacheConfiguration)
                .build();

        return redisCacheManager;
    }

}
