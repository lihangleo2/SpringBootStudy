package com.leo.springboot.demo2_junit;

import com.leo.springboot.TestUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo2JunitApplicationTests {
    //如果有注入得类用@Autowired注解

    @Test
    void contextLoads() {
        TestUtils.fuckWangYi();
    }

}
