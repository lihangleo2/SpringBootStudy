package com.leo.springboot.controller.utils;

import com.leo.springboot.controller.bean.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author leo
 * @Address https://github.com/lihangleo2
 * @Date 2024/3/29
 * 这个算是aop拦截，如果代码有异常，或者主动抛出异常，都会按照这个数据结构，返回
 */
//作为spring mvc的异常处理器
//@ControllerAdvice
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //拦截所有的异常信息
    //@ExceptionHandler(Exception.class) 如果要拦截特定的异常，可以使用这个
    @ExceptionHandler
    public Result doException(Exception ex) {
        //记录日志
        //通知运维
        //通知开发

        ex.printStackTrace();
        //这里可以rerun你的数据结构
        return new Result(500, "服务器异常，请稍后再试！");

    }
}
