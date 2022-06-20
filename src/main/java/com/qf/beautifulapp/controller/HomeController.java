package com.qf.beautifulapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 处理用户请求
 *
 * 第一种
 * 用module传数据
 * 第二种
 * 用Json传
 * 第三种
 * 用注解处理@ResponseBody
 */

@Controller
public class HomeController {
    //拦截请求路径
    @RequestMapping("/home")
    //将返回数据转换为json字符串
    @ResponseBody
    public String hello(){
        return "问就是开摆";
    }
    @RequestMapping("/del")
    public String delete(){
        return "建议开摆";
    }
}
