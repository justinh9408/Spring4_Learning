package com.spring4.Factory;

import com.spring4.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Classname PersonBeanFactory
 * @Description TODO
 * @Date 2019-12-21 15:00
 * @Created by Justin
 */
public class PersonBeanFactory implements FactoryBean<Person> {
    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
