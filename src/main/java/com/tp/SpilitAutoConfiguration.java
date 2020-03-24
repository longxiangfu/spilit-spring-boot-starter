package com.tp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类:装载入SpilitService为Spring bean
 */
@Configuration
@ConditionalOnClass(SpilitService.class)
@EnableConfigurationProperties(SpilitProperties.class)
public class SpilitAutoConfiguration {

    @Autowired
    private SpilitProperties properties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "spring.spilit", value = "enabled", havingValue = "true")
    public SpilitService configSpilitService(){
        return new SpilitService(properties.getTarget());
    }

}
