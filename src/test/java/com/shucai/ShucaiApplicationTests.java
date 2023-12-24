package com.shucai;

import com.shucai.controller.APIController;
import com.shucai.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ShucaiApplicationTests {

    @Autowired
    private APIController apiController;


    @Autowired
    private Person person;

    @Test
    public void test() {
        String name = apiController.show("name");
        System.out.println(name);
    }

    @Test
    public void test_configuration() {
        System.out.println(person);
    }
}
