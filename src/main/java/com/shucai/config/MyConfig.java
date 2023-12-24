package com.shucai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 蔬菜精灵
 */
@Configuration
public class MyConfig {
    
    @Bean
    public MyService myService() {
        return new MyService();
    }
}
