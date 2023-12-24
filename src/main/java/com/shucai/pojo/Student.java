package com.shucai.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 蔬菜精灵
 */

@Data
@Component
public class Student {
    
    @Value("${person.id}")
    private int id;
    
    @Value("${person.name}")
    private String name;
}
