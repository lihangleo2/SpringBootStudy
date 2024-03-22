package com.leo.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leo.springboot.bean.Star;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author leo
 * @Address https://github.com/lihangleo2
 * @Date 2024/3/22
 */
@Mapper
public interface StarDao extends BaseMapper<Star> {

}
