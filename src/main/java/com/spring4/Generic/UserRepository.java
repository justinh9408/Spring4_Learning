package com.spring4.Generic;

import org.springframework.stereotype.Repository;

/**
 * @Classname UserRepository
 * @Description TODO
 * @Date 2019-12-18 15:38
 * @Created by Justin
 */
@Repository
public class UserRepository implements BaseRepository<User> {
    @Override
    public void save() {
        System.out.println("saving user...");
    }
}
