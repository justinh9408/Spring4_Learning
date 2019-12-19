package com.spring4.Generic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Classname UserServiceTest
 * @Description TODO
 * @Date 2019-12-18 15:40
 * @Created by Justin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class UserServiceTest {

    @Autowired
    BaseService baseService;

    @Test
    public void test(){
        baseService.add();
    }

}