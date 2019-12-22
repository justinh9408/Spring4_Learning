package com.spring4;

import com.spring4.Decorator.Cold;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Cold
public class HelloWorld implements HelloInterface{

    public HelloWorld() {
        System.out.println("constructing...");
    }

    @Value("${hello.name}")
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("hello " + name);

    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "name='" + name + '\'' +
                '}';
    }
}