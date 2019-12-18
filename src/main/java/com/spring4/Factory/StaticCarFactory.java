package com.spring4.Factory;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {

    private static Map<String, Car> cars = new HashMap<>();

    static {
        cars.put("audi", new Car("Audi",100000, 100));
        cars.put("ford", new Car("Ford", 20000, 120));
    }

    //静态工程方法
    public static Car getCar(String name){
        return cars.get(name);
    }
}
