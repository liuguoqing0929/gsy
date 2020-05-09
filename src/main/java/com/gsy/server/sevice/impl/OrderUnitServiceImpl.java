package com.gsy.server.sevice.impl;

import com.gsy.server.mapper.OrderUnitMapper;
import com.gsy.server.sevice.OrderUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("orderUnitService")
public class OrderUnitServiceImpl implements OrderUnitService {

    @Autowired
    private OrderUnitMapper orderUnitMapper;


}
