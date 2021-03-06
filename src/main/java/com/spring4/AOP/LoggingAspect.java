package com.spring4.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @Classname LoggingAspect
 * @Description TODO
 * @Date 2019-12-18 19:50
 * @Created by Justin
 */
//Order值越小，优先级越高
@Order(1)
@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.spring4.AOP.*.*(..))")
    public void pointCutDeclare(){}

//   声明一个前置通知
    @Before("pointCutDeclare()")
    public void beforeMethod(JoinPoint jp){
        String methodName = jp.getSignature().getName();
        List<Object> args = Arrays.asList(jp.getArgs());
        System.out.println("begin " + methodName + " with "+ args);
    }

//    声明一个后置通知(不管方法是否抛出异常，但是不能访问方法返回结果)
    @After("pointCutDeclare()")
    public void afterMethod(JoinPoint jp){
        String methodName = jp.getSignature().getName();
        System.out.println("after " + methodName);
    }

    @AfterReturning(value = "pointCutDeclare()",returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        System.out.println("return " + result);
    }

    /*
     * 可以访问异常对象，并且可以指定特定异常才执行通知
     */
    @AfterThrowing(value = "pointCutDeclare()", throwing = "ex")
    public void afterThrowing(JoinPoint jp, Exception ex){
        System.out.println("Catch exception: " + ex.toString());
    }

    @Around(value = "pointCutDeclare()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {

        Object result = null;
        try {
//          前置通知
            System.out.println("before around....");
//          执行
            result = joinPoint.proceed();
//          返回通知
            System.out.println("return " + result);

        } catch (Throwable throwable) {
            //异常捕获通知
            System.out.println("catch exception");
            throw new RuntimeException(throwable);
        }
//        后置通知
        System.out.println("method ends");
        return result;
    }

}
