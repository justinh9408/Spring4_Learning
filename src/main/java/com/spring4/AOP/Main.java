package com.spring4.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2019-12-18 19:42
 * @Created by Justin
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/applicationContext-aop.xml");

        ICalculator calculator = (ICalculator) ctx.getBean("calculatorImpl");

        System.out.println(calculator.add(1,2));

    }
}
