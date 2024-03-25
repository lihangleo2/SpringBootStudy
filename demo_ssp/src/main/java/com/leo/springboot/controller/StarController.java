package com.leo.springboot.controller;

import com.leo.springboot.bean.Star;
import com.leo.springboot.service.StarMyBatisPlusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author leo
 * @Address https://github.com/lihangleo2
 * @Date 2024/3/25
 */
@RestController
@RequestMapping("/stars")
public class StarController {
    @Autowired
    private StarMyBatisPlusService startService;

    //获取全部数据
    @GetMapping
    public List<Star> getAll() {
        return startService.list();
    }

    //保存数据
    @PostMapping
    public Boolean save(@RequestBody Star star) {
        return startService.save(star);
    }

    @PutMapping
    public Boolean update(@RequestBody Star star) {
        return startService.updateById(star);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return startService.removeById(id);
    }

    @GetMapping("/{id}")
    public Star getById(@PathVariable Integer id) {
        return startService.getById(1);
    }
}
