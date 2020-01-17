package com.spring4;

import com.spring4.Decorator.Cold;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Classname HellowWorld2
 * @Description TODO
 * @Date 2020-01-17 11:21
 * @Created by Justin
 */
@Component
public class HellowWorld2 implements HelloInterface {

    @Value("hahaha2")
    public String name;

    @Override
    public void hello() {
        System.out.println("hello222222");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HellowWorld2{" +
                "name='" + name + '\'' +
                '}';
    }
}
