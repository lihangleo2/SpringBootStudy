package com.example.demo.demos.web.rest;

import com.example.demo.demos.web.User;
import org.springframework.web.bind.annotation.*;

/**
 * @Author leo
 * @Address https://github.com/lihangleo2
 * @Date 2024/1/19
 * 因为UserController总是要写以下东西：
 * 1.@RequestMapping(value = "/users",method = RequestMethod.POST)
 * 2.@ResponseBody
 * 所以用UserFastController，进行快速开发
 */



//因为下面2个注解一般都要写，所以可以通过@RestController来替换这2个
@RestController
//@Controller
//@ResponseBody //可以省去下面方法，每个都要写这句代码了
@RequestMapping("/userFast") //这样就可以省去每次都写value了

public class UserFastController {

    // http://127.0.0.1:8080/userFast
//    @RequestMapping(method = RequestMethod.POST)
    @PostMapping //以上代码可以用这个注释代替
    public User save() {
        User user = new User();
        user.setName("leo");
        user.setAge(32);
        user.setMethod("Post");
        return user;
    }

    // http://127.0.0.1:8080/userFast
//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public User query() {
        User user = new User();
        user.setName("leo2");
        user.setAge(88);
        user.setMethod("Get");
        return user;
    }

    // http://127.0.0.1:8080/userFast
//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public User delete(@PathVariable int id) {
        User user = new User();
        user.setName("leo2ge");
        user.setAge(88);
        user.setMethod("Delete_" + id);
        return user;
    }
}
