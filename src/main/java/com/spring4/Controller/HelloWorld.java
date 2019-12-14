package com.spring4.Controller;

import java.util.Date;

public class HelloWorld {
    public HelloWorld() {
        System.out.println("constructing...");

    }

    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.print("heallo:" + name);

    }


}