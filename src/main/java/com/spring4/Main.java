package com.spring4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        //HelloWord he = new HelloWord();

        //1.创建spring的ioc容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        //2.从ioc容器中获取bean实例
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld2");
//        helloWorld.hello();
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
        Person person = (Person) ctx.getBean("person4");
        System.out.println(person);
        
    }
}