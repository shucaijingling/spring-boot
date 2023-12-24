package com.shucai.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author 蔬菜精灵
 */
@Data
@Component
@ConfigurationProperties(prefix = "my")
public class MyRandom {
    private String secret;
    private int number;
    private long bignumber;
    private UUID uuid;
    @Value("${my.number.less.than.ten}")
    private int numberLessThenTen;
    @Value("${my.number.in.range}")
    private int range;
}
