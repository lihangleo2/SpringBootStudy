package com.leo.springboot.service;

import com.leo.springboot.bean.Star;

import java.util.List;

/**
 * @Author leo
 * @Address https://github.com/lihangleo2
 * @Date 2024/3/25
 * 这个是普通的实现方法
 */
public interface StarService {
    Boolean save(Star star);

    Boolean update(Star star);

    Boolean delete(Integer id);

    Star getById(Integer id);

    List<Star> getAll();

    List<Star> getPage(int currentPage, int pageSize);
}
