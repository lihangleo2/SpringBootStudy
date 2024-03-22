package com.leo.springboot;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.leo.springboot.dao.UserDao;
import com.leo.springboot.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class Demo2MyBatisPlusApplicationTests {
    @Autowired
    UserDao userDao;

    @Test
    void contextLoads() {
        System.out.println(userDao.selectById(2));
        System.out.println(userDao.selectList(new QueryWrapper<>()));

        Map<String, Object> colwn = new HashMap<>();
        colwn.put("userName", "大帅");
        System.out.println(userDao.selectByMap(colwn));

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", 1);
        System.out.println("哈哈==" + userDao.selectList(queryWrapper));


    }

}
