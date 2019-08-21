package com.myapp.cunpleapp.service.impl;
import com.myapp.cunpleapp.service.MyTestService;
import com.myapp.cunpleuserapp.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 * 业务层测试
 * @author zhaoxudong
 * @title: MyTestService
 * @projectName cunple
 * @description: 业务层测试
 * @date 2019/8/19 15:18
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MyTestServiceImpl implements MyTestService {

    @Reference
    private IUserService userService;

    @Override
    public void run() {
        System.err.println("my run is test Service");
    }

    @Override
    public Object getResult(int id) {
        return userService.getUserById(id);
    }
}
