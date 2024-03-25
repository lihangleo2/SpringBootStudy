package com.leo.springboot.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leo.springboot.bean.Star;
import com.leo.springboot.dao.StarDao;
import com.leo.springboot.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author leo
 * @Address https://github.com/lihangleo2
 * @Date 2024/3/25
 * 这个是普通的实现方法
 */

//注意要加上@Service
@Service
public class StarServiceImpl implements StarService {
    @Autowired
    private StarDao starDao;


    @Override
    public Boolean save(Star star) {
        return starDao.insert(star) > 0;
    }

    @Override
    public Boolean update(Star star) {
        return starDao.updateById(star) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return starDao.deleteById(id) > 0;
    }

    @Override
    public Star getById(Integer id) {
        return starDao.selectById(id);
    }

    @Override
    public List<Star> getAll() {
        return starDao.selectList(null);
    }

    @Override
    public List<Star> getPage(int currentPage, int pageSize) {
        IPage<Star> page = new Page<>(currentPage, pageSize);
        starDao.selectPage(page, null);
        return page.getRecords();
    }
}
