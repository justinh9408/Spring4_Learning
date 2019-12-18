package com.spring4.FactoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2019-12-18 15:01
 * @Created by Justin
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/beans-factory.xml");

        Car car3 = (com.spring4.FactoryBean.Car) ctx.getBean("car3");
        System.out.println(car3);

    }
}
