package com.tp;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 安全配置类
 */
@ConfigurationProperties(prefix = "spring.spilit")
public class SpilitProperties {
    private String target;

    public void setTarget(String target){
        this.target = target;
    }

    public String getTarget(){
        return target;
    }

}
