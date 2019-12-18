package com.spring4.Collections;

import com.spring4.Car;
import com.spring4.Collections.Person;
import com.spring4.HelloWorld;
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
        Person person = (Person) ctx.getBean("person3");
        System.out.println(person);
        Person newPerson = (Person) ctx.getBean("person5");
        System.out.println(newPerson);
        Person person6 = (Person) ctx.getBean("person6");
        System.out.println(person6);
        Person person7 = (Person) ctx.getBean("person7");
        System.out.println(person7);
    }
}