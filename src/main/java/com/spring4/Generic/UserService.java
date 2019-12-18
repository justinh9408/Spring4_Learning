package com.spring4.Generic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2019-12-18 15:38
 * @Created by Justin
 */
@Service
public class UserService implements BaseService<User> {

    @Autowired
    UserRepository userRepository;

    @Override
    public void add() {
        System.out.println("adding user...");
        userRepository.save();
    }
}
