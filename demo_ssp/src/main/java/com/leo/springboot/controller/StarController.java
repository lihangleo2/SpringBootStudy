package com.leo.springboot.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leo.springboot.bean.PageBean;
import com.leo.springboot.bean.Star;
import com.leo.springboot.controller.bean.PageResult;
import com.leo.springboot.controller.bean.Result;
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
    public Result getAll() {
        return new Result(200, startService.list());
    }

    //保存数据
    @PostMapping("/save")
    public Result save(@RequestBody Star star) {
        //移除处理
        return new Result(startService.save(star) ? 200 : 0);
    }

    @PostMapping("/update")
    public Result update(@RequestBody Star star) {
        return new Result(startService.updateById(star) ? 200 : 0);
    }

    @PostMapping("/deleteStar")
    public Result delete(@RequestParam("id") Integer id) {
        return new Result(startService.removeById(id) ? 200 : 0);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        return new Result(200, startService.getById(id));
    }

    @PostMapping("/getList")
    public Result getPage(@RequestBody PageBean pageBean) {
        //因为这里要获得得是否有下一页得boolean，可以多查一条，如果多一条说明是有分页的，否者没有下一页
        IPage<Star> iPage = new Page<>(pageBean.getPage(), pageBean.getSize() + 1);
        startService.page(iPage, null);
        PageResult<Star> pageResult = new PageResult<>();

        List<Star> records = iPage.getRecords();
        if (records.size() == pageBean.getSize() + 1) {
            //说明有下一页
            records.remove(records.size() - 1);
            pageResult.setNothing(false);
            pageResult.setData(records);
        } else {
            //说明没有下一页了
            pageResult.setNothing(true);
            pageResult.setData(records);
        }
        return new Result(200, pageResult);
    }

    //条件查询语句，可以去测试类里看
    public void selectCondition(){

    }

}
