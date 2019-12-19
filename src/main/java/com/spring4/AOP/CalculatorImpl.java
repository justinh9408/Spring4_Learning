package com.spring4.AOP;

import org.springframework.stereotype.Component;

/**
 * @Classname CalculatorImpl
 * @Description TODO
 * @Date 2019-12-18 19:19
 * @Created by Justin
 */
@Component
public class CalculatorImpl implements ICalculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }


    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a/b;
    }
}
