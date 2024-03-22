package com.leo.springboot.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @Author leo
 * @Address https://github.com/lihangleo2
 * @Date 2024/3/22
 */
@Data
//@NoArgsConstructor 上面的注解没有构造方法，这里是无参的构造方法
//@AllArgsConstructor 全部参数的构造方法
public class Star {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String type;
    private String name;
    private String des;
}
