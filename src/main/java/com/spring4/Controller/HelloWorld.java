package com.spring4.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
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
}