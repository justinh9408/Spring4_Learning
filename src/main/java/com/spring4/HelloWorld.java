package com.spring4;

import com.spring4.Decorator.Cold;
import org.springframework.stereotype.Component;

@Component
@Cold
public class HelloWorld implements HelloInterface{

    public HelloWorld() {
        System.out.println("constructing...");
    }

    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.print("hello world");

    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "name='" + name + '\'' +
                '}';
    }
}