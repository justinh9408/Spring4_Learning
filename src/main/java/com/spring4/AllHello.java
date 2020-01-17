package com.spring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Classname AllHello
 * @Description TODO
 * @Date 2020-01-17 11:27
 * @Created by Justin
 */
@Component
public class AllHello {

    @Autowired
    List<HelloInterface> helloInterfaceList;

    @Override
    public String toString() {
        return "AllHello{" +
                "helloInterfaceList=" + helloInterfaceList +
                '}';
    }
}
