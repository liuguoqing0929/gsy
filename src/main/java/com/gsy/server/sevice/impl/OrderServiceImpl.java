package com.gsy.server.sevice.impl;

import com.gsy.server.mapper.OrderMapper;
import com.gsy.server.model.Order;
import com.gsy.server.sevice.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public int addOrder(Order order) {

        order.setId(UUID.randomUUID().toString());
        // 总价是 单价 * 数量
        order.setOrderAllPrice(order.getOrderPrice() * order.getOrderNumber());
        return orderMapper.addOrder(order);
    }

    @Override
    public int deleteOrder(String id) {

        return orderMapper.deleteOrder(id);
    }

    @Override
    public int updateOrderById(Order order) {
        return orderMapper.updateOrderById(order);
    }
}
