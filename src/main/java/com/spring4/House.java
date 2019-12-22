package com.spring4;

import javax.annotation.PreDestroy;

/**
 * @Classname House
 * @Description TODO
 * @Date 2019-12-21 15:18
 * @Created by Justin
 */
public class House {

    public House() {
        System.out.println("constructing House...");
    }

    public void init(){
        System.out.println("initiating.....");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroying.....");
    }

}
