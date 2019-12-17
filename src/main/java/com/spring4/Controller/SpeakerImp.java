package com.spring4.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpeakerImp implements SpeakerInterface {

    HelloInterface hello;

    @Autowired
    public SpeakerImp(HelloInterface hello) {
        this.hello = hello;
    }



    @Override
    public void say() {
        hello.hello();
    }
}
