package com.spring4.Conditional;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Classname IOSCondition
 * @Description TODO
 * @Date 2019-12-21 14:04
 * @Created by Justin
 */
public class IOSCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        Environment environment = conditionContext.getEnvironment();
        String os = environment.getProperty("os.name");
        if (os.contains("Mac")){
            return true;
        }
        return false;
    }
}
