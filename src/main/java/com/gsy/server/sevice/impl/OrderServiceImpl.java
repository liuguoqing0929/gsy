package com.gsy.server.sevice.impl;

import com.gsy.server.mapper.OrderMapper;
import com.gsy.server.sevice.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
}
