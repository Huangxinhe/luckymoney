package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program luckymoney
 * @description: hello
 * @author: huangxinhe
 * @create: 2019/08/18 17:37
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id) {
        return "id:"+id;
    }
}
