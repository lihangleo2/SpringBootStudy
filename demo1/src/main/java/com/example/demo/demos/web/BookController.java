package com.example.demo.demos.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author leo
 * @Address https://github.com/lihangleo2
 * @Date 2024/1/22
 */
@RestController
@RequestMapping("/leo")
public class BookController {
    /**
     * 读取yml中数据
     */
    //读取中的单一数据
    @Value("${country}")
    private String mCountry;

    //如果是取多级就一级一级往下
    @Value("${user.namea}")
    private String mUserName;

    //这里代表的是数组的取值
    @Value("${likes[1]}")
    private String mLikes;

    //这里是取对象数组里的数据
    @Value("${users[1].age}")
    private int mArrayAge;


    //使用@Autowired自动装备，可以将数据都装备到env上
    @Autowired
    private Environment env;

    //自动装配上就完成了
    @Autowired
    private MyDataSource myDataSource;


    //http://127.0.0.1:8081/leo
    @GetMapping
    public String getWords() {
        return mCountry + "_@" + mUserName + "_" + mLikes+"_#"+mArrayAge+" ---- "+env.getProperty("users[1].name") +" ==== "+myDataSource;
    }
}
