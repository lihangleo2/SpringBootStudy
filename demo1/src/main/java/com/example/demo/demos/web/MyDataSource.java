package com.example.demo.demos.web;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author leo
 * @Address https://github.com/lihangleo2
 * @Date 2024/1/22
 */

//1. 定义数据模型，封装yml文件中对应的数据
//2. 定义为spring管控的bean
@Component
//3.指定要加载的数据
@ConfigurationProperties("datasource")
public class MyDataSource {
    private String driver;
    private String url;
    private String username;
    private String password;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
