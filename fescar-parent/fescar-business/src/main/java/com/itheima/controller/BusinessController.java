package com.itheima.controller;

import com.itheima.dao.LogInfoMapper;
import com.itheima.pojo.LogInfo;
import com.itheima.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/*****
 * @Author: www.itheima.com
 * @Description: com.itheima.controller
 ****/
@RestController
@RequestMapping(value = "/business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    /***
     * 购买商品分布式事务测试
     * @return
     */
    @RequestMapping(value = "/addorder")
    public String order() {
        String username = "zhangsan";
        int id = 1;
        int count = 5;
        //下单
        businessService.add(username, id, count);
        return "success";
    }
}
