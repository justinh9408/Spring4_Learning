package com.spring4.FactoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Classname CarFactoryBean
 * @Description TODO
 * @Date 2019-12-18 14:56
 * @Created by Justin
 */
public class CarFactoryBean implements FactoryBean<Car> {

    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public Car getObject() throws Exception {
        return new Car(brand, 30000, 200);
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
