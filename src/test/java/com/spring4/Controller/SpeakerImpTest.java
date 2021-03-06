package com.spring4.Controller;

import com.spring4.Factory.PersonBeanFactory;
import com.spring4.MyAnnotationConfig.Main;
import com.spring4.SpeakerInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Main.class)
public class SpeakerImpTest {

    AnnotationConfigApplicationContext ctx;

    @Autowired
    SpeakerInterface speakerInterface;

    @Autowired
    PersonBeanFactory personBeanFactory;

    @Test
    public void say() {
        speakerInterface.say();
        assertNotNull(personBeanFactory);
    }
}
