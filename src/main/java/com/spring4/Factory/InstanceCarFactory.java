package com.spring4.Factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname InstanceCarFactory
 * @Description 实例工厂方法
 * @Date 2019-12-18 14:45
 * @Created by Justin
 */
public class InstanceCarFactory {

    private Map<String, Car> cars = null;

    public InstanceCarFactory() {
        cars = new HashMap<>();
        cars.put("audi", new Car("Audi", 20000, 200));
        cars.put("ford", new Car("Ford", 25000, 150));
    }

    public Car getCar(String name){
        return cars.get(name);
    }
}
