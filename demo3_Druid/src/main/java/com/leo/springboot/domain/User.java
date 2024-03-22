package com.leo.springboot.domain;

import com.baomidou.mybatisplus.annotation.TableField;

/**
 * @Author leo
 * @Address https://github.com/lihangleo2
 * @Date 2024/3/22
 */
public class User {
    private Integer id;
    @TableField(value = "userName")
    private String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
}
