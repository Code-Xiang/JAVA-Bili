package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description：TODO
 * @author： xiangxuewei
 * @create： 2023/11/6 14:45
 */
@Controller
public class IndexController {
    @RequestMapping({"/","/index.html"})
    public String index(){
        return "index";
    }
}
