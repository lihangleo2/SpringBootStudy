package com.leo.springboot.controller.bean;

import lombok.Data;

import java.util.List;

/**
 * @Author leo
 * @Address https://github.com/lihangleo2
 * @Date 2024/3/27
 */
@Data
public class PageResult<T> {
    private boolean nothing;
    private List<T> data;
}
