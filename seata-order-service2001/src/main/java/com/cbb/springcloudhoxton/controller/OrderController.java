package com.cbb.springcloudhoxton.controller;

import com.cbb.springcloudhoxton.domain.CommonResult;
import com.cbb.springcloudhoxton.domain.Order;
import com.cbb.springcloudhoxton.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author chengbb
 * @date 2020.7.5
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
