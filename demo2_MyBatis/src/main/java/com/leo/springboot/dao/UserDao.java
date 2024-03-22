package com.leo.springboot.dao;

import com.leo.springboot.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author leo
 * @Address https://github.com/lihangleo2
 * @Date 2024/3/22
 */
@Mapper
public interface UserDao {
    @Select("select * from user where id = #{id}")
    public User getById(Integer id);

    @Select("select * from user")
    public List<User> getAll();

}
