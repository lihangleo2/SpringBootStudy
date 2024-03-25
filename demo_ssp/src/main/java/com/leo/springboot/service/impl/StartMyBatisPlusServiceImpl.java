package com.leo.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leo.springboot.bean.Star;
import com.leo.springboot.dao.StarDao;
import com.leo.springboot.service.StarMyBatisPlusService;
import org.springframework.stereotype.Service;

/**
 * @Author leo
 * @Address https://github.com/lihangleo2
 * @Date 2024/3/25
 * 这里是结合MyBatis_Plus的写法;快速实现开发
 */
@Service
public class StartMyBatisPlusServiceImpl extends ServiceImpl<StarDao, Star> implements StarMyBatisPlusService {

}
