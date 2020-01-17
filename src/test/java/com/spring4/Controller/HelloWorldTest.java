package com.spring4.Controller;

import com.spring4.HelloInterface;
import com.spring4.MyAnnotationConfig.Main;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Main.class)
public class HelloWorldTest {

    @Autowired
    private List<HelloInterface> helloWorlds;


    @Test
    public void notNull(){
        for (HelloInterface helloInterface: helloWorlds) {
            System.out.println(helloInterface);
        }
    }


}