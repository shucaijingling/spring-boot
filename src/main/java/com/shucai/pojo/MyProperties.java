package com.shucai.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 蔬菜精灵
 */
@Data
@Configuration
@PropertySource("classpath:test.properties")
@EnableConfigurationProperties(MyProperties.class)
@ConfigurationProperties(prefix = "test")
public class MyProperties {
    
    private int id;
    private String name;
}
