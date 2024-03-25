package com.leo.springboot;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leo.springboot.bean.Star;
import com.leo.springboot.dao.StarDao;
import com.leo.springboot.service.StarMyBatisPlusService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoSspApplicationTests {
    @Autowired
    StarDao starDao;

    @Test
    void contextLoads() {

    }

    @Test
    void insertData() {
        //增：插入数据
        Star star = new Star();
        star.setName("武则天");
        star.setType("女性");
        star.setDes("中国第一位女皇帝");
        starDao.insert(star);
    }

    @Test
    void deleteData() {
        //删
        starDao.deleteById(18);
    }

    @Test
    void updateData() {
        //改
        Star star = new Star();
        star.setId(18);
        star.setName("武则天123");
        star.setType("女性");
        star.setDes("中国第一位女皇帝");
        starDao.updateById(star);
    }

    @Test
    void selectData() {
        //查
        //查全部
//        starDao.selectList(null);

        //按条件查询1
//        Map<String, Object> map = new HashMap<>();
//        map.put("type", "儿童");
//        starDao.selectByMap(map);
        //条件查询2
//        QueryWrapper<Star> queryWrapper = new QueryWrapper<>();
//        queryWrapper.like("type", "儿童");
//        starDao.selectList(queryWrapper);
        //条件查询3 使用lambda方式去查询
        String mType = "男性";
        LambdaQueryWrapper<Star> queryWrapper = new LambdaQueryWrapper<>();
        //这里可以加个条件，Boolean condition，如果为true才会去使用条件查询
        queryWrapper.like(mType != null, Star::getType, mType);
        starDao.selectList(queryWrapper);
    }

    @Test
    void testGetPage() {
        //分页
        //要做分页，除了如下代码，还得加上config配置：MPConfig
        Page<Star> page = new Page(1, 5);
        starDao.selectPage(page, null);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        //
        //这里是最终查询到得数据
        System.out.println(page.getRecords());
    }

    @Autowired
    private StarMyBatisPlusService startService;

    @Test
    void testController() {
//        startService.list();
        startService.getById(1);
    }


}
