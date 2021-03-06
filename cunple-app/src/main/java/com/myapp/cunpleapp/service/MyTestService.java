package com.myapp.cunpleapp.service;

import org.springframework.stereotype.Service;

/**
 * 业务层测试
 * @author zhaoxudong
 * @title: MyTestService
 * @projectName cunple
 * @description: 业务层测试
 * @date 2019/8/19 15:18
 */

public interface MyTestService {

    void run();

    Object getResult(int id);
}
