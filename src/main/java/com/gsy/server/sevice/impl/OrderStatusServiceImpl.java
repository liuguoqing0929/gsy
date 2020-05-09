package com.gsy.server.sevice.impl;

import com.gsy.server.mapper.OrderStatusMapper;
import com.gsy.server.sevice.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("orderStatusService")
public class OrderStatusServiceImpl implements OrderStatusService {

    @Autowired
    private OrderStatusMapper orderStatusMapper;


}
