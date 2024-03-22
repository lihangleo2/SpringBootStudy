package com.leo.springboot;

import com.leo.springboot.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo2MyBatisApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
//        System.out.println(userDao.getById(1).getUserName());
        System.out.println(userDao.getAll());
    }

}
