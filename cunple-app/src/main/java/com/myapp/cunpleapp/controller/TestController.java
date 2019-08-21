package com.myapp.cunpleapp.controller;

import com.myapp.cunpleapp.service.MyTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试dubbo
 * @author zhaoxudong
 * @title: TestController
 * @projectName cunple
 * @description: 测试dubbo
 * @date 2019/8/20 17:25
 */
@RestController
public class TestController {

    @Autowired
    private MyTestService myTestService;

    @RequestMapping("/test")
    public Object getResult(){
        return myTestService.getResult(1);

    }
}
