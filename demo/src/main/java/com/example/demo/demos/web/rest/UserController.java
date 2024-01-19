package com.example.demo.demos.web.rest;

import com.example.demo.demos.web.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author leo
 * @Address https://github.com/lihangleo2
 * @Date 2024/1/19
 */
@Controller
public class UserController {


    // http://127.0.0.1:8080/users
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    public User save() {
        User user = new User();
        user.setName("leo");
        user.setAge(32);
        user.setMethod("Post");
        return user;
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    @ResponseBody
    public User query(){
        User user = new User();
        user.setName("leo2");
        user.setAge(88);
        user.setMethod("Get");
        return user;
    }

    @RequestMapping(value = "/users",method = RequestMethod.DELETE)
    @ResponseBody
    //@PathVariable 路径变量的意思
    public User delete(@PathVariable int id){
        User user = new User();
        user.setName("leo2ge");
        user.setAge(88);
        user.setMethod("Delete");
        return user;
    }
}
