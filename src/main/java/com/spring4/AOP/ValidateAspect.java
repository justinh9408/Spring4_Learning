package com.spring4.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Classname ValidateAspect
 * @Description TODO
 * @Date 2019-12-19 19:43
 * @Created by Justin
 */
public class ValidateAspect {

    public void validateBefore(){
        System.out.println("Validate before method....");
    }
}
