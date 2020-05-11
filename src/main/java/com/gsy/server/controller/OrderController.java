package com.gsy.server.controller;

import com.gsy.server.enums.ResultCode;
import com.gsy.server.model.Address;
import com.gsy.server.model.Order;
import com.gsy.server.sevice.OrderService;
import com.gsy.server.util.Result;
import com.gsy.server.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderService orderService;


    /**
     * 添加
     * @param order
     * @return
     */
    @PostMapping("/add")
    public Result addOrder(@RequestBody Order order){

        int result = orderService.addOrder(order);
        if(result > 0)
            return Result.success("添加成功");
        return Result.failure("添加失败");
    }

    /**
     * 删除
     * @param id
     * @return
     */
    public Result deleteOrderById(String id){
        int result = orderService.deleteOrder(id);
        if(result > 0)
            return Result.success("删除成功");
        return Result.failure("删除失败");
    }

    /**
     * 更新
     * @param order
     * @return
     */
    @PostMapping("/updateOrderById")
    public Result updateOrderById(@RequestBody Order order){
        if(StringUtil.isNull(order.getId()))
            return Result.failure(ResultCode.PARAM_IS_BLANK);
        int result = orderService.updateOrderById(order);
        if(result > 0)
            return Result.success("更新成功");
        return Result.failure("更新失败");
    }
}
