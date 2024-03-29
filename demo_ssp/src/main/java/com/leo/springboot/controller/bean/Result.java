package com.leo.springboot.controller.bean;

import lombok.Data;

/**
 * @Author leo
 * @Address https://github.com/lihangleo2
 * @Date 2024/3/27
 */

@Data
public class Result {
    private Integer code;
    private Object data;
    private String msg;

    public Result() {

    }

    public Result(Integer code) {
        this.code = code;
    }

    public Result(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

    public Result(String msg) {
        this.code = 500;
        this.msg = msg;
    }
}
