package com.leo.springboot;

import com.leo.springboot.bean.Star;
import com.leo.springboot.dao.StarDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoSspApplicationTests {
    @Autowired
    StarDao starDao;

    @Test
    void contextLoads() {
//        System.out.println(starDao.selectList(null));
        Star star = new Star();
        star.setName("舒小英");
        star.setType("女性");
        star.setDes("我的一生挚爱");
        starDao.insert(star);
    }

}
