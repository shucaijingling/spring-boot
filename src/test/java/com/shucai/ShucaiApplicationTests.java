package com.shucai;

import com.shucai.controller.APIController;
import com.shucai.pojo.MyProperties;
import com.shucai.pojo.MyRandom;
import com.shucai.pojo.Person;
import com.shucai.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ShucaiApplicationTests {
    
    @Autowired
    private APIController apiController;
    
    
    @Autowired
    private Person person;
    
    @Autowired
    private Student student;
    
    @Autowired
    private MyProperties myProperties;
    
    @Autowired
    private ApplicationContext applicationContext;
    
    @Autowired
    private MyRandom myRandom;
    
    @Test
    public void test() {
        String name = apiController.show("name");
        System.out.println(name);
    }
    
    @Test
    public void test_configuration() {
        System.out.println(person);
    }
    
    @Test
    public void test_student() {
        System.out.println(student);
    }
    
    @Test
    public void test_MyProperties() {
        System.out.println(myProperties);
    }
    
    @Test
    public void test_ioc() {
        System.out.println(applicationContext.containsBean("myService"));
    }
    
    
    @Test
    public void test_MyRandom() {
        System.out.println(myRandom);
    }
    
    
    @Value("${tom.description}")
    private String description;
    @Value("${app.description}")
    private String appDescription;
    @Test
    public void test_properties_reference() {
        System.out.println(description);
        System.out.println(appDescription);
    }
}
